Cardea is a system in which user can set his/her privacy preference based on context, which includes location, surrounding scene and persons. When captured by an android camera, user's privacy preference will be enforced if context is matched. Interactive hand gestures can be used by user to overwrite his/her privacy setting temporarily.

Check [demo video](https://drive.google.com/file/d/0B4z8qjK8O_uUc0o2RjZWYktiMTg/view) for the usage of the system.

#### Dataflow

<img src="./design/dataflow.jpg" width="400">

#### Setup

+ server:
    + modify path in `server/_init_paths.py` to be the correct path of [`py-faster-rcnn`](https://github.com/rbgirshick/py-faster-rcnn)
    + modify path in `server/serv.py` in each worker to be the correct path of model used by this worker

+ jni libraries:
    + modify paths in `androidapp/jnisrc/fdlib/build.sh` and build the face detection and alignment library by `./build.sh`
    + build `androidapp/jnisrc/caffe_android_lib`

+ after all model paths and jni libraries and android app set up correctly, `cd server; python serv.py` and use the android app as demo shows

#### Models

+ scene classification
    + grouping, augmentation
    + feature extraction, finetune
    + merging feature extractor and classifier to a single model

+ gesture recognition
    + data preparation, augmentation
    + train gesture recognizer end to end

+ face recognition:
    + [openface 0.2.0 post](http://bamos.github.io/2016/01/19/openface-0.2.0/)
    + [A Lightened CNN for Deep Face Representation](http://arxiv.org/abs/1511.02683)
    + [face alignment](https://github.com/ZhengRui/FaceAlignmentJNI)

