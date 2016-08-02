Cardea is a system in which user can set his/her privacy preference based on context, which includes location, surrounding scene and persons. When captured by an android camera, user's privacy preference will be enforced if context is matched. Interactive hand gestures can be used by user to overwrite his/her privacy setting temporarily.

Check [demo video](https://drive.google.com/file/d/0B4z8qjK8O_uUc0o2RjZWYktiMTg/view) for the usage of the system.

#### Dataflow

<img src="./design/dataflow.jpg" width="400">

#### Setup

+ server:
    + modify path in `server/_init_paths.py` to be the correct path of `py-faster-rcnn`
    + modify path in `server/serv.py` in each worker to be the correct path of model used by this worker

+ jni libraries:
    + modify paths in `androidapp/jnisrc/fdlib/build.sh` and build it by `./build.sh`
    + build `androidapp/jnisrc/caffe`

+ after all model paths and jni libraries and android app set up correctly, `cd server; python serv.py` and use the android app as demo shows

#### Models

+ scene classification
    + grouping, augmentation
    + finetune
    + merging parameters to a single model

+ gesture recognition
    + data preparation, augmentation
    + train gesture recognizer end to end

+ face recognition: [A Lightened CNN for Deep Face Representation](http://arxiv.org/abs/1511.02683)

