* Done
    + ✔  simple face detection through jni call (HaarCascade + skin filter)
    + ✔  switch cam
    + ✔  return bounding box back to phone and display it
    + ✔  enable phone rotation
    + ✔  convert python face alignment dlib code into c code
    + ✔  pack to jni shared library
    + ✔  show progress bar
    + ✔  integrate caffe-android do batch facial feature extraction

* ToDo:
    + ❌  save features to external space
    + ❌  upload features to server
    + ❌  unit test:
        - ✔  slower than cv implementation but more accurate, speed depends on scale down limit
        - ✔  dlib strong filtering must be used, otherwise landmarks detection won't be accurate
        - ✔  chunk from facedetlib to caffe_mobile can't be too many, caffe_mobile can afford
             at most 5 imgs per batch, one thread in mobile cpu can't afford huge computation
             continuously, should work in an intermittent way
    + ❌  optimization
