.class Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$1;
.super Ljava/lang/Object;
.source "HistogramBasedExposureControl.java"

# interfaces
.implements Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->setup(Lcom/scandit/base/camera/camera2/SbCamera2;Ljava/lang/Float;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;

.field final synthetic val$camera:Lcom/scandit/base/camera/camera2/SbCamera2;


# direct methods
.method constructor <init>(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;Lcom/scandit/base/camera/camera2/SbCamera2;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$1;->this$0:Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;

    iput-object p2, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$1;->val$camera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 12

    .line 35
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$1;->val$camera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_EXPOSURE_TIME_RANGE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Range;

    if-eqz v0, :cond_0

    .line 37
    new-instance v1, Landroid/util/Range;

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v2

    .line 38
    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/32 v5, 0x5f5e100

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    move-object v0, v1

    .line 40
    :cond_0
    iget-object v1, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$1;->val$camera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v1}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v1

    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_SENSITIVITY_RANGE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v1, v2}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Range;

    if-eqz v1, :cond_1

    .line 43
    new-instance v2, Landroid/util/Range;

    invoke-virtual {v1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v3

    const/16 v4, 0x320

    invoke-virtual {v1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    move-object v1, v2

    :cond_1
    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    .line 46
    iget-object v2, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$1;->this$0:Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;

    new-instance v3, Lcom/scandit/base/gl/EGLCore;

    invoke-direct {v3}, Lcom/scandit/base/gl/EGLCore;-><init>()V

    invoke-static {v2, v3}, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->access$002(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;Lcom/scandit/base/gl/EGLCore;)Lcom/scandit/base/gl/EGLCore;

    .line 48
    iget-object v2, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$1;->this$0:Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;

    new-instance v11, Lcom/scandit/base/camera/SbAutoExposure;

    invoke-static {v2}, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->access$000(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;)Lcom/scandit/base/gl/EGLCore;

    move-result-object v4

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    .line 49
    invoke-virtual {v1}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-virtual {v1}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v10

    move-object v3, v11

    invoke-direct/range {v3 .. v10}, Lcom/scandit/base/camera/SbAutoExposure;-><init>(Lcom/scandit/base/gl/EGLCore;JJII)V

    .line 48
    invoke-static {v2, v11}, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->access$102(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;Lcom/scandit/base/camera/SbAutoExposure;)Lcom/scandit/base/camera/SbAutoExposure;

    .line 50
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 51
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->SENSOR_EXPOSURE_TIME:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$1;->this$0:Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;

    invoke-static {v1}, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->access$100(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;)Lcom/scandit/base/camera/SbAutoExposure;

    move-result-object v1

    invoke-virtual {v1}, Lcom/scandit/base/camera/SbAutoExposure;->getExposureNanos()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 52
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->SENSOR_SENSITIVITY:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v1, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$1;->this$0:Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;

    invoke-static {v1}, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->access$100(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;)Lcom/scandit/base/camera/SbAutoExposure;

    move-result-object v1

    invoke-virtual {v1}, Lcom/scandit/base/camera/SbAutoExposure;->getISO()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    goto :goto_0

    .line 54
    :cond_2
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 55
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$1;->val$camera:Lcom/scandit/base/camera/camera2/SbCamera2;

    invoke-virtual {v0}, Lcom/scandit/base/camera/camera2/SbCamera2;->getCharacteristics()Landroid/hardware/camera2/CameraCharacteristics;

    move-result-object v0

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_COMPENSATION_RANGE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Range;

    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 56
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_EXPOSURE_COMPENSATION:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    .line 57
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_TARGET_FPS_RANGE:Landroid/hardware/camera2/CaptureRequest$Key;

    new-instance v1, Landroid/util/Range;

    const/16 v2, 0x1e

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v3, v2}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
