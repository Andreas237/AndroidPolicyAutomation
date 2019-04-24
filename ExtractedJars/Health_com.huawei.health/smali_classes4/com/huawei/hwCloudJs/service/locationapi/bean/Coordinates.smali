.class public Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/hwCloudJs/support/enables/NoProguard;
.end annotation


# instance fields
.field private accuracy:F

.field private altitude:D

.field private heading:F

.field private latitude:D

.field private longitude:D

.field private speed:F


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAccuracy()F
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;->accuracy:F

    return v0
.end method

.method public getAltitude()D
    .locals 2

    iget-wide v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;->altitude:D

    return-wide v0
.end method

.method public getHeading()F
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;->heading:F

    return v0
.end method

.method public getLatitude()D
    .locals 2

    iget-wide v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;->latitude:D

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    iget-wide v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;->longitude:D

    return-wide v0
.end method

.method public getSpeed()F
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;->speed:F

    return v0
.end method

.method public setAccuracy(F)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;->accuracy:F

    return-void
.end method

.method public setAltitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;->altitude:D

    return-void
.end method

.method public setHeading(F)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;->heading:F

    return-void
.end method

.method public setLatitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;->latitude:D

    return-void
.end method

.method public setLongitude(D)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;->longitude:D

    return-void
.end method

.method public setSpeed(F)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;->speed:F

    return-void
.end method
