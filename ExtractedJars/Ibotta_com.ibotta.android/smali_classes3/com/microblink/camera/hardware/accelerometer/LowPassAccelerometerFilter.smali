.class public Lcom/microblink/camera/hardware/accelerometer/LowPassAccelerometerFilter;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/camera/hardware/accelerometer/IAccelerometerFilter;


# instance fields
.field private filterConstant_:F

.field private mX:F

.field private mY:F

.field private mZ:F


# direct methods
.method public constructor <init>(FF)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    div-float p1, v0, p1

    div-float/2addr v0, p2

    add-float/2addr v0, p1

    div-float/2addr p1, v0

    iput p1, p0, Lcom/microblink/camera/hardware/accelerometer/LowPassAccelerometerFilter;->filterConstant_:F

    return-void
.end method


# virtual methods
.method public addAcceleration(FFF)V
    .locals 3

    iput p1, p0, Lcom/microblink/camera/hardware/accelerometer/LowPassAccelerometerFilter;->mX:F

    iput p2, p0, Lcom/microblink/camera/hardware/accelerometer/LowPassAccelerometerFilter;->mY:F

    iput p3, p0, Lcom/microblink/camera/hardware/accelerometer/LowPassAccelerometerFilter;->mZ:F

    const-string v0, "current acceleration: ({}, {}, {})"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v1, p2

    invoke-static {p0, v0, v1}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public getX()F
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/accelerometer/LowPassAccelerometerFilter;->mX:F

    return v0
.end method

.method public getY()F
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/accelerometer/LowPassAccelerometerFilter;->mY:F

    return v0
.end method

.method public getZ()F
    .locals 1

    iget v0, p0, Lcom/microblink/camera/hardware/accelerometer/LowPassAccelerometerFilter;->mZ:F

    return v0
.end method

.method public setSamplePeriod(F)V
    .locals 0

    return-void
.end method
