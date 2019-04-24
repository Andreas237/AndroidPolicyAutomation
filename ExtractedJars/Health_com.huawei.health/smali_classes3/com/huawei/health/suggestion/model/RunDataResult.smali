.class public Lcom/huawei/health/suggestion/model/RunDataResult;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private duration:F

.field private heartRateMax:F

.field private heartRateMin:I


# direct methods
.method public constructor <init>(FIF)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput p1, p0, Lcom/huawei/health/suggestion/model/RunDataResult;->duration:F

    .line 14
    iput p2, p0, Lcom/huawei/health/suggestion/model/RunDataResult;->heartRateMin:I

    .line 15
    iput p3, p0, Lcom/huawei/health/suggestion/model/RunDataResult;->heartRateMax:F

    .line 16
    return-void
.end method


# virtual methods
.method public acquartDuration()F
    .locals 1

    .line 19
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunDataResult;->duration:F

    return v0
.end method

.method public acquartHeartRateMax()F
    .locals 1

    .line 35
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunDataResult;->heartRateMax:F

    return v0
.end method

.method public acquartHeatrRateMin()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunDataResult;->heartRateMin:I

    return v0
.end method

.method public saveDuration(I)V
    .locals 1

    .line 23
    int-to-float v0, p1

    iput v0, p0, Lcom/huawei/health/suggestion/model/RunDataResult;->duration:F

    .line 24
    return-void
.end method

.method public saveHeartRateMax(F)V
    .locals 0

    .line 39
    iput p1, p0, Lcom/huawei/health/suggestion/model/RunDataResult;->heartRateMax:F

    .line 40
    return-void
.end method

.method public savetHeartRateMin(I)V
    .locals 0

    .line 31
    iput p1, p0, Lcom/huawei/health/suggestion/model/RunDataResult;->heartRateMin:I

    .line 32
    return-void
.end method
