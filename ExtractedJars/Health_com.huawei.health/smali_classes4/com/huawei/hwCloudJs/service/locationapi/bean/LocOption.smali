.class public Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;
.super Lcom/huawei/hwCloudJs/api/JsParam;


# annotations
.annotation build Lcom/huawei/hwCloudJs/support/enables/NoProguard;
.end annotation


# instance fields
.field private coordsType:Ljava/lang/String;

.field private enableHighAccuracy:Z

.field private geocode:Z

.field private timeout:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hwCloudJs/api/JsParam;-><init>()V

    return-void
.end method


# virtual methods
.method public getCoordsType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;->coordsType:Ljava/lang/String;

    return-object v0
.end method

.method public getEnableHighAccuracy()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;->enableHighAccuracy:Z

    return v0
.end method

.method public getGeocode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;->geocode:Z

    return v0
.end method

.method public getTimeout()I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;->timeout:I

    return v0
.end method

.method public setCoordsType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;->coordsType:Ljava/lang/String;

    return-void
.end method

.method public setEnableHighAccuracy(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;->enableHighAccuracy:Z

    return-void
.end method

.method public setGeocode(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;->geocode:Z

    return-void
.end method

.method public setTimeout(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;->timeout:I

    return-void
.end method
