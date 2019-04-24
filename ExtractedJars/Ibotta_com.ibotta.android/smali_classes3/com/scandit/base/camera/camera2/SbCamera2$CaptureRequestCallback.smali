.class final Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
.source "SbCamera2.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/base/camera/camera2/SbCamera2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "CaptureRequestCallback"
.end annotation


# instance fields
.field private final mSynchronizer:Lcom/scandit/base/camera/camera2/SbCamera2$ImageToMetadataMatcher;

.field final synthetic this$0:Lcom/scandit/base/camera/camera2/SbCamera2;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/SbCamera2;Lcom/scandit/base/camera/camera2/SbCamera2$ImageToMetadataMatcher;)V
    .locals 0

    .line 282
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    .line 283
    iput-object p2, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;->mSynchronizer:Lcom/scandit/base/camera/camera2/SbCamera2$ImageToMetadataMatcher;

    return-void
.end method


# virtual methods
.method public onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 0

    .line 289
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;->mSynchronizer:Lcom/scandit/base/camera/camera2/SbCamera2$ImageToMetadataMatcher;

    invoke-virtual {p1, p2, p3}, Lcom/scandit/base/camera/camera2/SbCamera2$ImageToMetadataMatcher;->pushMetadata(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V

    return-void
.end method

.method public onCaptureStarted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V
    .locals 0

    .line 295
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestCallback;->this$0:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-static {p1}, Lcom/scandit/base/camera/camera2/SbCamera2;->access$100(Lcom/scandit/base/camera/camera2/SbCamera2;)Lcom/scandit/base/camera/camera2/SbCamera2Listener;

    move-result-object p1

    invoke-interface {p1, p2, p3, p4}, Lcom/scandit/base/camera/camera2/SbCamera2Listener;->onCaptureRequestApplied(Landroid/hardware/camera2/CaptureRequest;J)V

    return-void
.end method
