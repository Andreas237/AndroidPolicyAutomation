.class public abstract Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/camera/CameraListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/camera/view/BaseCameraView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "BaseCameraListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/camera/view/BaseCameraView;


# direct methods
.method protected constructor <init>(Lcom/microblink/camera/view/BaseCameraView;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAutofocusFailed()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

    invoke-interface {v0}, Lcom/microblink/camera/view/CameraEventsListener;->onAutofocusFailed()V

    :cond_0
    return-void
.end method

.method public final onAutofocusStarted([Landroid/graphics/Rect;)V
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    new-instance v1, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener$1;

    invoke-direct {v1, p0, p1}, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener$1;-><init>(Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;[Landroid/graphics/Rect;)V

    invoke-virtual {v0, v1}, Lcom/microblink/camera/view/BaseCameraView;->runOnUIThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final onAutofocusStopped([Landroid/graphics/Rect;)V
    .locals 2

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    iget-object v0, v0, Lcom/microblink/camera/view/BaseCameraView;->mCameraEventsListener:Lcom/microblink/camera/view/CameraEventsListener;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;->this$0:Lcom/microblink/camera/view/BaseCameraView;

    new-instance v1, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener$2;

    invoke-direct {v1, p0, p1}, Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener$2;-><init>(Lcom/microblink/camera/view/BaseCameraView$BaseCameraListener;[Landroid/graphics/Rect;)V

    invoke-virtual {v0, v1}, Lcom/microblink/camera/view/BaseCameraView;->runOnUIThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
