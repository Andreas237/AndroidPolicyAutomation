.class public interface abstract Lcom/microblink/camera/hardware/camera/ICameraManager;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;
    }
.end annotation


# virtual methods
.method public abstract areOpenedCamerasPixelsLandscapeLeft()Z
.end method

.method public abstract cameraSupportsTorch()Z
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation
.end method

.method public abstract dispose()V
.end method

.method public abstract doesCameraHaveSurface()Z
.end method

.method public abstract getCameraSensorOrientation()I
.end method

.method public abstract getCurrentPreviewSize()Lcom/microblink/camera/hardware/camera/ImageSize;
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation
.end method

.method public abstract getOpenedCameraType()Lcom/microblink/camera/hardware/camera/CameraType;
.end method

.method public abstract getSurfaceHolderCallback()Landroid/view/SurfaceHolder$Callback;
.end method

.method public abstract getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation
.end method

.method public abstract isAutofocusSupported()Ljava/lang/Boolean;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Landroid/support/annotation/UiThread;
    .end annotation
.end method

.method public abstract isCameraFocusing()Z
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation
.end method

.method public abstract isCameraInFocus()Z
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation
.end method

.method public abstract isDeviceShaking()Z
.end method

.method public abstract isPreviewActive()Z
.end method

.method public abstract performAutofocus()V
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation
.end method

.method public abstract setMeteringAreas([Landroid/graphics/Rect;)V
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation
.end method

.method public abstract setShakeCallback(Lcom/microblink/camera/hardware/accelerometer/ShakeCallback;)V
.end method

.method public abstract setTorchState(ZLcom/microblink/camera/hardware/SuccessCallback;)V
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation
.end method

.method public abstract setZoomLevel(F)V
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation
.end method

.method public abstract startPreview(Lcom/microblink/camera/hardware/DeviceManager;Lcom/microblink/camera/hardware/camera/CameraSettings;Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;)V
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation
.end method

.method public abstract stopPreview()V
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation
.end method
