.class public interface abstract Lcom/scandit/base/camera/camera2/SbCamera2Listener;
.super Ljava/lang/Object;
.source "SbCamera2Listener.java"


# virtual methods
.method public abstract didClose()V
.end method

.method public abstract notify(ILjava/lang/String;)V
.end method

.method public abstract onAfterCaptureSessionStarted(Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;)V
.end method

.method public abstract onBeforeCaptureSessionStarted()V
.end method

.method public abstract onCaptureRequestApplied(Landroid/hardware/camera2/CaptureRequest;J)V
.end method

.method public abstract onError(ILjava/lang/String;)V
.end method

.method public abstract onImageAvailable(Landroid/media/Image;Landroid/hardware/camera2/TotalCaptureResult;)V
.end method
