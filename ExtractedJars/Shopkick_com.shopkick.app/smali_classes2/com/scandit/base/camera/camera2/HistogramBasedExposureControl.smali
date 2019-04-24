.class Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;
.super Ljava/lang/Object;
.source "HistogramBasedExposureControl.java"

# interfaces
.implements Lcom/scandit/base/camera/camera2/ExposureControl;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation


# instance fields
.field private mAutoExposure:Lcom/scandit/base/camera/SbAutoExposure;

.field private mEGL:Lcom/scandit/base/gl/EGLCore;

.field private mFirstTimeStamp:J

.field private mUpdateExposure:Z


# direct methods
.method constructor <init>()V
    .locals 2

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mAutoExposure:Lcom/scandit/base/camera/SbAutoExposure;

    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mUpdateExposure:Z

    const-wide/16 v0, -0x1

    .line 28
    iput-wide v0, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mFirstTimeStamp:J

    return-void
.end method

.method static synthetic access$000(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;)Lcom/scandit/base/gl/EGLCore;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mEGL:Lcom/scandit/base/gl/EGLCore;

    return-object p0
.end method

.method static synthetic access$002(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;Lcom/scandit/base/gl/EGLCore;)Lcom/scandit/base/gl/EGLCore;
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mEGL:Lcom/scandit/base/gl/EGLCore;

    return-object p1
.end method

.method static synthetic access$100(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;)Lcom/scandit/base/camera/SbAutoExposure;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mAutoExposure:Lcom/scandit/base/camera/SbAutoExposure;

    return-object p0
.end method

.method static synthetic access$102(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;Lcom/scandit/base/camera/SbAutoExposure;)Lcom/scandit/base/camera/SbAutoExposure;
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mAutoExposure:Lcom/scandit/base/camera/SbAutoExposure;

    return-object p1
.end method

.method static synthetic access$200(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;)Z
    .locals 0

    .line 24
    iget-boolean p0, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mUpdateExposure:Z

    return p0
.end method

.method static synthetic access$202(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;Z)Z
    .locals 0

    .line 24
    iput-boolean p1, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mUpdateExposure:Z

    return p1
.end method

.method static synthetic access$300(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;)J
    .locals 2

    .line 24
    iget-wide v0, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mFirstTimeStamp:J

    return-wide v0
.end method


# virtual methods
.method public onCaptureRequestApplied(Landroid/hardware/camera2/CaptureRequest;J)V
    .locals 4

    .line 66
    iget-object v0, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mAutoExposure:Lcom/scandit/base/camera/SbAutoExposure;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mUpdateExposure:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 69
    :cond_0
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->SENSOR_EXPOSURE_TIME:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CaptureRequest;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 70
    sget-object v2, Landroid/hardware/camera2/CaptureRequest;->SENSOR_SENSITIVITY:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v2}, Landroid/hardware/camera2/CaptureRequest;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 73
    iget-object v2, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mAutoExposure:Lcom/scandit/base/camera/SbAutoExposure;

    invoke-virtual {v2}, Lcom/scandit/base/camera/SbAutoExposure;->getExposureNanos()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mAutoExposure:Lcom/scandit/base/camera/SbAutoExposure;

    .line 74
    invoke-virtual {v0}, Lcom/scandit/base/camera/SbAutoExposure;->getISO()I

    move-result v0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    .line 75
    iput-boolean p1, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mUpdateExposure:Z

    .line 76
    iput-wide p2, p0, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mFirstTimeStamp:J

    :cond_1
    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method public onImageAvailable(Lcom/scandit/base/camera/camera2/SbCamera2;JLjava/nio/ByteBuffer;IILandroid/hardware/camera2/TotalCaptureResult;)V
    .locals 12

    move-object v10, p0

    move-object/from16 v0, p7

    .line 83
    iget-object v1, v10, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;->mAutoExposure:Lcom/scandit/base/camera/SbAutoExposure;

    if-nez v1, :cond_0

    return-void

    .line 84
    :cond_0
    sget-object v1, Landroid/hardware/camera2/TotalCaptureResult;->SENSOR_EXPOSURE_TIME:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 85
    sget-object v1, Landroid/hardware/camera2/TotalCaptureResult;->SENSOR_SENSITIVITY:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/TotalCaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 86
    new-instance v11, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;

    move-object v0, v11

    move-object v1, p0

    move-wide v2, p2

    move/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v9, p4

    invoke-direct/range {v0 .. v9}, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$2;-><init>(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;JJIIILjava/nio/ByteBuffer;)V

    move-object v0, p1

    invoke-virtual {p1, v11}, Lcom/scandit/base/camera/camera2/SbCamera2;->updateCaptureRequestAsync(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)V

    return-void
.end method

.method public setup(Lcom/scandit/base/camera/camera2/SbCamera2;Ljava/lang/Float;)V
    .locals 0

    .line 32
    new-instance p2, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$1;

    invoke-direct {p2, p0, p1}, Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl$1;-><init>(Lcom/scandit/base/camera/camera2/HistogramBasedExposureControl;Lcom/scandit/base/camera/camera2/SbCamera2;)V

    invoke-virtual {p1, p2}, Lcom/scandit/base/camera/camera2/SbCamera2;->modifyCaptureRequestAsync(Lcom/scandit/base/camera/camera2/SbCamera2$CaptureRequestUpdater;)V

    return-void
.end method
