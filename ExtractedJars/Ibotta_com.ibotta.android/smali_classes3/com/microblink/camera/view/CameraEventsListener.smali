.class public interface abstract Lcom/microblink/camera/view/CameraEventsListener;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/camera/AutofocusListener;


# virtual methods
.method public abstract onCameraPermissionDenied()V
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation
.end method

.method public abstract onCameraPreviewStarted()V
.end method

.method public abstract onCameraPreviewStopped()V
.end method

.method public abstract onError(Ljava/lang/Throwable;)V
.end method
