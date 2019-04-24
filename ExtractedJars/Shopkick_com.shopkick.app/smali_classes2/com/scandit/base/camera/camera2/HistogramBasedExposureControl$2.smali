.class Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;
.super Ljava/lang/Object;
.source "HistogramBasedExposureControl.java"

# interfaces
.implements Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->onImageAvailable(Lcom/scandit/base/camera/camera2/SbCamera2;JLjava/nio/ByteBuffer;IILandroid/hardware/camera2/TotalCaptureResult;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;

.field final synthetic val$exposureTime:J

.field final synthetic val$height:I

.field final synthetic val$iso:I

.field final synthetic val$timeStamp:J

.field final synthetic val$width:I

.field final synthetic val$yPlaneBuffer:Ljava/nio/ByteBuffer;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;JJIIILjava/nio/ByteBuffer;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->this$0:Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;

    iput-wide p2, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->val$timeStamp:J

    iput-wide p4, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->val$exposureTime:J

    iput p6, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->val$iso:I

    iput p7, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->val$width:I

    iput p8, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->val$height:I

    iput-object p9, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->val$yPlaneBuffer:Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 8

    .line 89
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->this$0:Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;

    invoke-static {v0}, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->access$200(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->val$timeStamp:J

    iget-object v2, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->this$0:Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;

    invoke-static {v2}, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->access$300(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->this$0:Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;

    .line 90
    invoke-static {v0}, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->access$100(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;)Lcom/scandit/base/camera/SbAutoExposure;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->this$0:Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;

    .line 91
    invoke-static {v0}, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->access$100(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;)Lcom/scandit/base/camera/SbAutoExposure;

    move-result-object v1

    iget-wide v2, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->val$exposureTime:J

    iget v4, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->val$iso:I

    iget v5, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->val$width:I

    iget v6, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->val$height:I

    iget-object v7, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->val$yPlaneBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual/range {v1 .. v7}, Lcom/scandit/base/camera/SbAutoExposure;->updateExposureAndISO(JIIILjava/nio/ByteBuffer;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 93
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->SENSOR_EXPOSURE_TIME:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->this$0:Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;

    .line 94
    invoke-static {v1}, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->access$100(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;)Lcom/scandit/base/camera/SbAutoExposure;

    move-result-object v1

    invoke-virtual {v1}, Lcom/scandit/base/camera/SbAutoExposure;->getExposureNanos()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    .line 93
    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 95
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->SENSOR_SENSITIVITY:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->this$0:Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;

    invoke-static {v1}, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->access$100(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;)Lcom/scandit/base/camera/SbAutoExposure;

    move-result-object v1

    invoke-virtual {v1}, Lcom/scandit/base/camera/SbAutoExposure;->getISO()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 96
    iget-object p1, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;->this$0:Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->access$202(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;Z)Z

    :cond_0
    return-void
.end method
