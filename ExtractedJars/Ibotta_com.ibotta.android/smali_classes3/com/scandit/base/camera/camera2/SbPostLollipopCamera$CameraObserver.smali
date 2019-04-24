.class final Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;
.super Ljava/lang/Object;
.source "SbPostLollipopCamera.java"

# interfaces
.implements Lcom/scandit/base/camera/camera2/SbCamera2Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "CameraObserver"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;


# direct methods
.method private constructor <init>(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$1;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;-><init>(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)V

    return-void
.end method


# virtual methods
.method public didClose()V
    .locals 3

    .line 144
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    const-string v1, ""

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$1900(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;ILjava/lang/String;)V

    return-void
.end method

.method public notify(ILjava/lang/String;)V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {v0, p1, p2}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$100(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;ILjava/lang/String;)V

    return-void
.end method

.method public onAfterCaptureSessionStarted(Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;)V
    .locals 2

    .line 78
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    iget v1, p1, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->width:I

    invoke-static {v0, v1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$702(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;I)I

    .line 79
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    iget p1, p1, Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;->height:I

    invoke-static {v0, p1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$802(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;I)I

    .line 81
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    const-string v0, ""

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$900(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;ILjava/lang/String;)V

    .line 83
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {p1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$1000(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/SbFocusEvent;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 84
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {p1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$1100(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/SbFocusEvent;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->handleAutoFocusEvent(Lcom/scandit/base/camera/SbFocusEvent;)V

    .line 85
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$1202(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Lcom/scandit/base/camera/SbFocusEvent;)Lcom/scandit/base/camera/SbFocusEvent;

    :cond_0
    return-void
.end method

.method public onBeforeCaptureSessionStarted()V
    .locals 3

    .line 68
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    new-instance v1, Lcom/scandit/base/camera/SbFocusEvent;

    invoke-direct {v1}, Lcom/scandit/base/camera/SbFocusEvent;-><init>()V

    invoke-static {v0, v1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$200(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Lcom/scandit/base/camera/SbFocusEvent;)V

    .line 69
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {v0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$400(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/camera2/SbCamera2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v1

    invoke-static {v1}, Lcom/scandit/base/camera/camera2/ExposureControlFactory;->create(Landroid/hardware/camera2/CameraCharacteristics;)Lcom/scandit/base/camera/camera2/ExposureControl;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$302(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;Lcom/scandit/base/camera/camera2/ExposureControl;)Lcom/scandit/base/camera/camera2/ExposureControl;

    .line 72
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {v0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$300(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/camera2/ExposureControl;

    move-result-object v0

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {v1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$400(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/camera2/SbCamera2;

    move-result-object v1

    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {v2}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$500(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/scandit/base/camera/camera2/ExposureControl;->setup(Lcom/scandit/base/camera/camera2/SbCamera2;Ljava/lang/Float;)V

    .line 73
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {v0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$600(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)V

    return-void
.end method

.method public onCaptureRequestApplied(Landroid/hardware/camera2/CaptureRequest;J)V
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {v0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$300(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/camera2/ExposureControl;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/scandit/base/camera/camera2/ExposureControl;->onCaptureRequestApplied(Landroid/hardware/camera2/CaptureRequest;J)V

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {v0, p1, p2}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$1800(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;ILjava/lang/String;)V

    return-void
.end method

.method public onImageAvailable(Landroid/media/Image;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 4

    .line 97
    sget-object v0, Landroid/hardware/camera2/CaptureResult;->FLASH_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p2, v0}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 98
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 101
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-ne v0, v2, :cond_1

    const/4 v1, 0x1

    .line 102
    :cond_1
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {v0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$1400(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/util/Observable;

    move-result-object v0

    if-eqz v1, :cond_2

    const/4 v3, 0x2

    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/scandit/base/util/Observable;->set(Ljava/lang/Object;)V

    goto :goto_1

    .line 99
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {v0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$1300(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/util/Observable;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/scandit/base/util/Observable;->set(Ljava/lang/Object;)V

    .line 104
    :goto_1
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    .line 105
    invoke-static {v0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$400(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/camera2/SbCamera2;

    move-result-object v0

    invoke-static {p1, v0, p2}, Lcom/scandit/base/camera/camera2/CaptureResultHandling;->getExtendedMetadata(Landroid/media/Image;Lcom/scandit/base/camera/camera2/SbCamera2;Landroid/hardware/camera2/TotalCaptureResult;)Lcom/scandit/base/camera/capturedImage/ImageMetadata;

    move-result-object p2

    .line 107
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {v0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$1500(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;

    move-result-object v0

    invoke-virtual {v0}, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->isInUse()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 108
    invoke-virtual {p1}, Landroid/media/Image;->close()V

    return-void

    .line 111
    :cond_4
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {v0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$1500(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;->assign(Landroid/media/Image;)V

    .line 112
    invoke-virtual {p1}, Landroid/media/Image;->close()V

    .line 114
    :try_start_0
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {p1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$1600(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/SbPreviewCallback;

    move-result-object p1

    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {v0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$1500(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/capturedImage/PostLollipopImageBuffer;

    move-result-object v0

    invoke-interface {p1, v0, p2}, Lcom/scandit/base/camera/SbPreviewCallback;->onBufferAvailable(Lcom/scandit/base/camera/capturedImage/ImageBuffer;Lcom/scandit/base/camera/capturedImage/ImageMetadata;)V

    .line 124
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;->this$0:Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;

    invoke-static {p1}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;->access$400(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera;)Lcom/scandit/base/camera/camera2/SbCamera2;

    move-result-object p1

    new-instance p2, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver$1;

    invoke-direct {p2, p0}, Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver$1;-><init>(Lcom/scandit/base/camera/camera2/SbPostLollipopCamera$CameraObserver;)V

    invoke-virtual {p1, p2}, Lcom/scandit/base/camera/camera2/SbCamera2;->updateCaptureRequestAsync(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const-string p1, "ScanditSDK"

    const-string p2, "the image has already been closed"

    .line 132
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    return-void
.end method
