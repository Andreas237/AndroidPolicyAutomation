.class public interface abstract Lcom/microblink/camera/view/surface/ICameraView;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;
    }
.end annotation


# virtual methods
.method public abstract convertRectangleToActualRect(Landroid/graphics/RectF;)Landroid/graphics/Rect;
.end method

.method public abstract dispose()V
.end method

.method public abstract getView()Landroid/view/View;
.end method

.method public abstract getVisibleHeight()I
.end method

.method public abstract getVisibleWidth()I
.end method

.method public abstract installCallback(Lcom/microblink/camera/hardware/camera/ICameraManager;)V
.end method

.method public abstract removeCallback()V
.end method

.method public abstract setAspectMode(Lcom/microblink/camera/view/CameraAspectMode;)V
.end method

.method public abstract setCameraViewEventListener(Lcom/microblink/camera/view/surface/ICameraView$CameraViewEventListener;)V
.end method

.method public abstract setHostActivityOrientation(I)V
.end method

.method public abstract setPreviewSize(II)V
.end method

.method public abstract setRotation(I)V
.end method
