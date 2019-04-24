.class public Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/hwCloudJs/support/enables/NoProguard;
.end annotation


# instance fields
.field private address:Lcom/huawei/hwCloudJs/service/locationapi/bean/Address;

.field private addresses:Ljava/lang/String;

.field private coordinates:Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;

.field private coordsType:Ljava/lang/String;

.field private timestamp:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAddress()Lcom/huawei/hwCloudJs/service/locationapi/bean/Address;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;->address:Lcom/huawei/hwCloudJs/service/locationapi/bean/Address;

    return-object v0
.end method

.method public getAddresses()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;->addresses:Ljava/lang/String;

    return-object v0
.end method

.method public getCoordinates()Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;->coordinates:Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;

    return-object v0
.end method

.method public getCoordsType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;->coordsType:Ljava/lang/String;

    return-object v0
.end method

.method public getTimestamp()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;->timestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public setAddress(Lcom/huawei/hwCloudJs/service/locationapi/bean/Address;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;->address:Lcom/huawei/hwCloudJs/service/locationapi/bean/Address;

    return-void
.end method

.method public setAddresses(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;->addresses:Ljava/lang/String;

    return-void
.end method

.method public setCoordinates(Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;->coordinates:Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;

    return-void
.end method

.method public setCoordsType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;->coordsType:Ljava/lang/String;

    return-void
.end method

.method public setTimestamp(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;->timestamp:Ljava/lang/Long;

    return-void
.end method
