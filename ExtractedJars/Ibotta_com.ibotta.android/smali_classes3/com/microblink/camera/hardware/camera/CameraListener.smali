.class public interface abstract Lcom/microblink/camera/hardware/camera/CameraListener;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/camera/AutofocusListener;


# virtual methods
.method public abstract canReceiveFrame()Z
.end method

.method public abstract onCameraFrame(Lcom/microblink/camera/hardware/camera/frame/ICameraFrame;)V
.end method

.method public abstract onTakePictureFail()V
.end method
