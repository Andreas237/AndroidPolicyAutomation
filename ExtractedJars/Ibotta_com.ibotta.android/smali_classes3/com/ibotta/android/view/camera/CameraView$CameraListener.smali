.class public interface abstract Lcom/ibotta/android/view/camera/CameraView$CameraListener;
.super Ljava/lang/Object;
.source "CameraView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/view/camera/CameraView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "CameraListener"
.end annotation


# virtual methods
.method public abstract onCameraConfigured(Landroid/hardware/Camera$Parameters;)V
.end method

.method public abstract onCameraError()V
.end method

.method public abstract onCameraOpened()V
.end method

.method public abstract onCameraOpening()V
.end method

.method public abstract onFocusFail()V
.end method

.method public abstract onFocusing()V
.end method

.method public abstract onManualOverride()V
.end method

.method public abstract onPictureTaken([B)V
.end method

.method public abstract onPreviewStarted()V
.end method

.method public abstract onPreviewStopped()V
.end method
