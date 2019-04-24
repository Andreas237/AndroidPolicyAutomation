.class final Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;
.super Landroid/hardware/camera2/CameraCaptureSession$StateCallback;
.source "SbCamera2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/base/camera/camera2/SbCamera2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "CaptureSessionStateCallback"
.end annotation


# instance fields
.field final mImageReader:Landroid/media/ImageReader;

.field final mPreviewSize:Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

.field final synthetic this$0:Lcom/scandit/base/camera/camera2/SbCamera2;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/SbCamera2;Landroid/media/ImageReader;Lcom/scandit/base/camera/camera2/SbCamera2$OnImageAvailableListener;Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;-><init>()V

    .line 210
    iput-object p4, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;->mPreviewSize:Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    .line 214
    iput-object p2, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;->mImageReader:Landroid/media/ImageReader;

    .line 216
    new-instance p2, Lcom/scandit/base/camera/camera2/SbCamera2$ImageToMetadataMatcher;

    const/4 p4, 0x0

    invoke-direct {p2, p1, p4}, Lcom/scandit/base/camera/camera2/SbCamera2$ImageToMetadataMatcher;-><init>(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/camera2/SbCamera2$1;)V

    .line 217
    invoke-virtual {p3, p2}, Lcom/scandit/base/camera/camera2/SbCamera2$OnImageAvailableListener;->setCapturedImagesQueue(Lcom/scandit/base/camera/camera2/SbCamera2$ImageToMetadataMatcher;)V

    .line 219
    new-instance p3, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;

    invoke-direct {p3, p1, p2}, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;-><init>(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/camera2/SbCamera2$ImageToMetadataMatcher;)V

    invoke-static {p1, p3}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$302(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;)Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;

    return-void
.end method


# virtual methods
.method public onConfigureFailed(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 1

    .line 244
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    const-string v0, "session configuration failed"

    invoke-static {p1, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$800(Lcom/scandit/base/camera/camera2/SbCamera2;Ljava/lang/String;)V

    return-void
.end method

.method public onConfigured(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 3

    .line 224
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-static {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$400(Lcom/scandit/base/camera/camera2/SbCamera2;)Landroid/hardware/camera2/CameraDevice;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 228
    :cond_0
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-static {v0, p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$502(Lcom/scandit/base/camera/camera2/SbCamera2;Landroid/hardware/camera2/CameraCaptureSession;)Landroid/hardware/camera2/CameraCaptureSession;

    .line 229
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-static {p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$100(Lcom/scandit/base/camera/camera2/SbCamera2;)Lcom/scandit/base/camera/camera2/SbCamera2Listener;

    move-result-object p1

    invoke-interface {p1}, Lcom/scandit/base/camera/camera2/SbCamera2Listener;->onBeforeCaptureSessionStarted()V

    .line 232
    :try_start_0
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-static {p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$500(Lcom/scandit/base/camera/camera2/SbCamera2;)Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-static {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$600(Lcom/scandit/base/camera/camera2/SbCamera2;)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->build()Landroid/hardware/camera2/CaptureRequest;

    move-result-object v0

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-static {v1}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$300(Lcom/scandit/base/camera/camera2/SbCamera2;)Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;

    move-result-object v1

    iget-object v2, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    .line 233
    invoke-static {v2}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$700(Lcom/scandit/base/camera/camera2/SbCamera2;)Landroid/os/Handler;

    move-result-object v2

    .line 232
    invoke-virtual {p1, v0, v1, v2}, Landroid/hardware/camera2/CameraCaptureSession;->setRepeatingRequest(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/os/Handler;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 239
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-static {p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$100(Lcom/scandit/base/camera/camera2/SbCamera2;)Lcom/scandit/base/camera/camera2/SbCamera2Listener;

    move-result-object p1

    iget-object v0, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;->mPreviewSize:Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;

    invoke-interface {p1, v0}, Lcom/scandit/base/camera/camera2/SbCamera2Listener;->onAfterCaptureSessionStarted(Lcom/scandit/base/camera/resolution/SbResolutionStrategy$Size;)V

    return-void

    .line 235
    :catch_0
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureSessionStateCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    const-string/jumbo v0, "the camera failed to give access"

    invoke-static {p1, v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$800(Lcom/scandit/base/camera/camera2/SbCamera2;Ljava/lang/String;)V

    return-void
.end method
