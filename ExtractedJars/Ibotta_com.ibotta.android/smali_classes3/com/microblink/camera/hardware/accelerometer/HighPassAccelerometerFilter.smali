.class public Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;


# instance fields
.field private mEstimatedX:F

.field private mEstimatedY:F

.field private mEstimatedZ:F

.field private mFilterConstant:F

.field private mLowPassX:F

.field private mLowPassY:F

.field private mLowPassZ:F

.field private mSamplePeriod:F

.field private mTauFactor:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mSamplePeriod:F

    iput p2, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mTauFactor:F

    mul-float p2, p2, p1

    add-float/2addr p2, p1

    div-float/2addr p1, p2

    iput p1, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mFilterConstant:F

    return-void
.end method


# virtual methods
.method public addAcceleration(FFF)V
    .locals 5

    iget v0, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mFilterConstant:F

    mul-float v1, p1, v0

    iget v2, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mLowPassX:F

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v4, v3, v0

    mul-float v2, v2, v4

    add-float/2addr v1, v2

    iput v1, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mLowPassX:F

    mul-float v1, p2, v0

    iget v2, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mLowPassY:F

    sub-float v4, v3, v0

    mul-float v2, v2, v4

    add-float/2addr v1, v2

    iput v1, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mLowPassY:F

    mul-float v1, p3, v0

    iget v2, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mLowPassZ:F

    sub-float/2addr v3, v0

    mul-float v2, v2, v3

    add-float/2addr v1, v2

    iput v1, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mLowPassZ:F

    iget v0, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mLowPassX:F

    sub-float/2addr p1, v0

    iput p1, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mEstimatedX:F

    iget p1, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mLowPassY:F

    sub-float/2addr p2, p1

    iput p2, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mEstimatedY:F

    iget p1, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mLowPassZ:F

    sub-float/2addr p3, p1

    iput p3, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mEstimatedZ:F

    return-void
.end method

.method public getX()F
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mEstimatedX:F

    return v0
.end method

.method public getY()F
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mEstimatedY:F

    return v0
.end method

.method public getZ()F
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mEstimatedZ:F

    return v0
.end method

.method public setSamplePeriod(F)V
    .locals 1

    iput p1, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mSamplePeriod:F

    iget p1, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mSamplePeriod:F

    iget v0, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mTauFactor:F

    mul-float v0, v0, p1

    add-float/2addr v0, p1

    div-float/2addr p1, v0

    iput p1, p0, Lcom/microblink/camera/hardware/accelerometer/HighPassAccelerometerFilter;->mFilterConstant:F

    return-void
.end method
