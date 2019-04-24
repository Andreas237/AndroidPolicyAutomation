.class public interface abstract Lcom/microblink/camera/hardware/camera/ICameraManager$CameraStartupCallback;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/camera/hardware/camera/ICameraManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "CameraStartupCallback"
.end annotation


# virtual methods
.method public abstract onCameraPreviewSizeChosen(II)V
.end method

.method public abstract onExceptionCaught(Ljava/lang/Throwable;)V
.end method

.method public abstract onPreviewStarted()V
.end method

.method public abstract onPreviewStopped()V
.end method
