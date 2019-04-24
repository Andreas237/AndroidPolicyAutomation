.class public Lcom/huawei/health/suggestion/model/SportInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private calorie:F

.field private distance:F

.field private heartRate:I

.field private pace:I

.field private sportId:Ljava/lang/String;

.field private time:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireDistance()F
    .locals 1

    .line 19
    iget v0, p0, Lcom/huawei/health/suggestion/model/SportInfo;->distance:F

    return v0
.end method

.method public acquireTime()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/huawei/health/suggestion/model/SportInfo;->time:I

    return v0
.end method

.method public getCalorie()F
    .locals 1

    .line 51
    iget v0, p0, Lcom/huawei/health/suggestion/model/SportInfo;->calorie:F

    return v0
.end method

.method public getHeartRate()I
    .locals 1

    .line 43
    iget v0, p0, Lcom/huawei/health/suggestion/model/SportInfo;->heartRate:I

    return v0
.end method

.method public getPace()I
    .locals 1

    .line 35
    iget v0, p0, Lcom/huawei/health/suggestion/model/SportInfo;->pace:I

    return v0
.end method

.method public getSportId()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/SportInfo;->sportId:Ljava/lang/String;

    return-object v0
.end method

.method public saveCalorie(F)V
    .locals 0

    .line 55
    iput p1, p0, Lcom/huawei/health/suggestion/model/SportInfo;->calorie:F

    .line 56
    return-void
.end method

.method public saveDistance(F)V
    .locals 0

    .line 23
    iput p1, p0, Lcom/huawei/health/suggestion/model/SportInfo;->distance:F

    .line 24
    return-void
.end method

.method public saveHeartRate(I)V
    .locals 0

    .line 47
    iput p1, p0, Lcom/huawei/health/suggestion/model/SportInfo;->heartRate:I

    .line 48
    return-void
.end method

.method public savePace(I)V
    .locals 0

    .line 39
    iput p1, p0, Lcom/huawei/health/suggestion/model/SportInfo;->pace:I

    .line 40
    return-void
.end method

.method public saveSportId(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/SportInfo;->sportId:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public saveTime(I)V
    .locals 0

    .line 31
    iput p1, p0, Lcom/huawei/health/suggestion/model/SportInfo;->time:I

    .line 32
    return-void
.end method
