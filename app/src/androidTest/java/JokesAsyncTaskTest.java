/**
 * Created by annekenl1 on 1/18/18.
 */

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.udacity.gradle.builditbigger.JokesAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertFalse;


/**
 * two options for this test seem to be to use "CountDownLatch" to wait until it's signaled to release or times out
 * or within an espresso test which already waits for AsyncTasks and more to be completed (app is idle) before next action
 *
 * useful references: https://gist.github.com/he9lin/2195897
 * https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/CountDownLatch.html
 * https://stackoverflow.com/questions/27747161/espresso-with-asynctask
 *
 */
@RunWith(AndroidJUnit4.class)
public class JokesAsyncTaskTest implements JokesAsyncTask.OnJokeReceived
{
    // A CountDownLatch initialized with a count of one serves as a simple on/off latch, or gate:
    // all threads invoking await() wait at the gate until it is opened by a thread invoking countDown().
   CountDownLatch signal;

    String theJoke = "";

    /*  Currently, GCE backend has to be started manually first */

    @Test
    public void resultIsNotEmpty() throws InterruptedException {

        signal = new CountDownLatch(1);

        new JokesAsyncTask(this).execute();

        signal.await(10, TimeUnit.SECONDS); //Causes the current thread to wait until the latch has counted down to zero, unless the thread is interrupted.

        assertFalse(theJoke.isEmpty());
    }

    @Override
    public void onJokeReceived(String theJoke)
    {
       signal.countDown();

       this.theJoke = theJoke;

        Log.d("joke",theJoke);
    }
}