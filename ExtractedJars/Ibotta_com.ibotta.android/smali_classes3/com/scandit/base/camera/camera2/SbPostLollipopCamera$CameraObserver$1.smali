.class Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver$1;
.super Ljava/lang/Object;
.source "SbPostLollipopCamera.java"

# interfaces
.implements Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->onImageAvailable(Landroid/media/Image;Landroid/hardware/camera2/TotalCaptureResult;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver$1;->this$1:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver$1;->this$1:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;

    iget-object v0, v0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {v0, p1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$1700(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Landroid/hardware/camera2/CaptureRequest$Builder;)V

    return-void
.end method
