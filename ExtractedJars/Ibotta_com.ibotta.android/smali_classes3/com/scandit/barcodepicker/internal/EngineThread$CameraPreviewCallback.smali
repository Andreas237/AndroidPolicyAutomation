.class final Lcom/scandit/barcodepicker/internal/EngineThread$CameraPreviewCallback;
.super Ljava/lang/Object;
.source "EngineThread.java"

# interfaces
.implements Lcom/scandit/base/camera/SbPreviewCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/barcodepicker/internal/EngineThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "CameraPreviewCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/barcodepicker/internal/EngineThread;


# direct methods
.method private constructor <init>(Lcom/scandit/barcodepicker/internal/EngineThread;)V
    .locals 0

    .line 816
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraPreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/barcodepicker/internal/EngineThread$1;)V
    .locals 0

    .line 816
    invoke-direct {p0, p1}, Lcom/scandit/barcodepicker/internal/EngineThread$CameraPreviewCallback;-><init>(Lcom/scandit/barcodepicker/internal/EngineThread;)V

    return-void
.end method


# virtual methods
.method public onBufferAvailable(Lcom/scandit/base/camera/capturedImage/ImageBuffer;Lcom/scandit/base/camera/capturedImage/ImageMetadata;)V
    .locals 2

    .line 819
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraPreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$300(Lcom/scandit/barcodepicker/internal/EngineThread;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 820
    invoke-interface {p1}, Lcom/scandit/base/camera/capturedImage/ImageBuffer;->release()V

    return-void

    .line 824
    :cond_0
    new-instance v0, Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;

    invoke-direct {v0}, Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;-><init>()V

    .line 825
    iput-object p1, v0, Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;->buffer:Lcom/scandit/base/camera/capturedImage/ImageBuffer;

    .line 827
    new-instance p1, Lcom/scandit/base/camera/capturedImage/ImageMetadata;

    invoke-direct {p1, p2}, Lcom/scandit/base/camera/capturedImage/ImageMetadata;-><init>(Lcom/scandit/base/camera/capturedImage/ImageMetadata;)V

    iput-object p1, v0, Lcom/scandit/barcodepicker/internal/Scanner$CapturedFrame;->metadata:Lcom/scandit/base/camera/capturedImage/ImageMetadata;

    .line 828
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraPreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$200(Lcom/scandit/barcodepicker/internal/EngineThread;)Landroid/os/Handler;

    move-result-object p1

    iget-object p2, p0, Lcom/scandit/barcodepicker/internal/EngineThread$CameraPreviewCallback;->this$0:Lcom/scandit/barcodepicker/internal/EngineThread;

    invoke-static {p2}, Lcom/scandit/barcodepicker/internal/EngineThread;->access$200(Lcom/scandit/barcodepicker/internal/EngineThread;)Landroid/os/Handler;

    move-result-object p2

    const/4 v1, 0x3

    invoke-virtual {p2, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
