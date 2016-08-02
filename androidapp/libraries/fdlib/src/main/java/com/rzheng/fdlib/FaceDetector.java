package com.rzheng.fdlib;

public class FaceDetector {
    public FaceDetector(String cascadeFile, int alignedFacesCacheSize) {
        nativeDetector = create(cascadeFile, alignedFacesCacheSize);
    }

    public int[] detect(int width, int height, byte[] frmdata, int front1orback0,
                        int orientCase, boolean doalign) {
        return detect(nativeDetector, width, height, frmdata, front1orback0, orientCase, doalign);
    }

    public void loadShapePredictor(String landmarksFilePath) {
        loadShapePredictor(nativeDetector, landmarksFilePath);
    }

    public long getAlignedFacesAddr() {
        return getAlignedFacesAddr(nativeDetector);
    }

    public void clearCache() {
        clearCache(nativeDetector);
    }

    public byte[] droidJPEGCalibrate(byte[] jpegdata, int front1orback0, int orientCase) {
        return droidJPEGCalibrate(nativeDetector, jpegdata, front1orback0, orientCase);
    }

    public byte[] boxesProcess(byte[] jpegdata, int[][] bbxposArr, String[] bbxtxtArr,
                               boolean[] bbxprocArr, int[] bbxproctypeArr) {
        return boxesProcess(nativeDetector, jpegdata, bbxposArr, bbxtxtArr, bbxprocArr, bbxproctypeArr);
    }

    public byte[] detectAndBlurJPEG(byte[] jpegdata) {
        return detectAndBlurJPEG(nativeDetector, jpegdata);
    }

    public int[] getBbxPositions() {
        return getBbxPositions(nativeDetector);
    }

    private long nativeDetector = 0;
    private static native long create(String cascadeFile, int alignedFacesCacheSize);
    private static native int[] detect(long thiz, int width, int height,
                                       byte[] frmdata, int front1orback0, int orientCase, boolean doalign);
    private static native void loadShapePredictor(long thiz, String landmarksFilePath);
    private static native long getAlignedFacesAddr(long thiz);
    private static native void clearCache(long thiz);
    private static native byte[] droidJPEGCalibrate(long thiz, byte[] jpegdata, int front1orback0, int orientCase);
    private static native byte[] boxesProcess(long thiz, byte[] jpegdata, int[][] bbxposArr, String[] bbxtxtArr,
                                              boolean[] bbxprocArr, int[] bbxproctypeArr);
    private static native byte[] detectAndBlurJPEG(long thiz, byte[] jpegdata);
    private static native int[] getBbxPositions(long thiz);
}
