/**If you build the backend first, then the app - the myApi..snapshot jar  in 'app/libs' is not needed.
However, the myApi jar file is needed if you try to build and run the app first; as on my android studio 3.0.1
it fails and points to errors of 'myApi' is not recognized. The myApi jar file is currently included in my repo
under 'app/libs'. My understanding from the forums is this is a quirk from the latest version of android studio and
 gradle with the old GCM backend and including the jar was the provided solution. So please run the app configuration first
 and then the backend. Also, might need to :clean, exit and restart android studio after any errors.

 (for reference:
 https://discussions.udacity.com/t/cannot-resolve-symbol-myapi-fix/484903 )
 **/
