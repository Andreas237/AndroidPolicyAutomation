.class Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/hwCloudJs/service/locationapi/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->getCurrentPosition(Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;Lcom/huawei/hwCloudJs/core/JsCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwCloudJs/core/JsCallback;

.field final synthetic b:Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;

.field final synthetic c:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;


# direct methods
.method constructor <init>(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;Lcom/huawei/hwCloudJs/core/JsCallback;Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$1;->c:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    iput-object p2, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$1;->a:Lcom/huawei/hwCloudJs/core/JsCallback;

    iput-object p3, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$1;->b:Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/baidu/location/BDLocation;)V
    .locals 7

    const-string v0, "GetLocationApi"

    const-string v1, "sendLocationMsg ok"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-string v0, "GetLocationApi"

    const-string v1, "BDLocation Null"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$1;->a:Lcom/huawei/hwCloudJs/core/JsCallback;

    const-string v1, "location null!"

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure(ILjava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$1;->c:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLongitude()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->a(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;D)D

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$1;->c:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLatitude()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->b(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;D)D

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$1;->c:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->a(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v2, v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$1;->c:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->b(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;)D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v2, v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$1;->c:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->c(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;)V

    new-instance v4, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;

    invoke-direct {v4}, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;-><init>()V

    new-instance v5, Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;

    invoke-direct {v5}, Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;-><init>()V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$1;->c:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    invoke-static {v0, v5, p1}, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->a(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;Lcom/baidu/location/BDLocation;)V

    invoke-virtual {v4, v5}, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;->setCoordinates(Lcom/huawei/hwCloudJs/service/locationapi/bean/Coordinates;)V

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->hasAddr()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$1;->b:Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;

    invoke-virtual {v0}, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocOption;->getGeocode()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v6, Lcom/huawei/hwCloudJs/service/locationapi/bean/Address;

    invoke-direct {v6}, Lcom/huawei/hwCloudJs/service/locationapi/bean/Address;-><init>()V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$1;->c:Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;

    invoke-static {v0, v6, p1}, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->a(Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;Lcom/huawei/hwCloudJs/service/locationapi/bean/Address;Lcom/baidu/location/BDLocation;)V

    invoke-virtual {v4, v6}, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;->setAddress(Lcom/huawei/hwCloudJs/service/locationapi/bean/Address;)V

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getAddrStr()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;->setAddresses(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getCoorType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;->setCoordsType(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi;->a(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwCloudJs/service/locationapi/bean/LocationInfo;->setTimestamp(Ljava/lang/Long;)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$1;->a:Lcom/huawei/hwCloudJs/core/JsCallback;

    invoke-virtual {v0, v4}, Lcom/huawei/hwCloudJs/core/JsCallback;->success(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/locationapi/GetLocationApi$1;->a:Lcom/huawei/hwCloudJs/core/JsCallback;

    const-string v1, "getlocation failure!"

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v1}, Lcom/huawei/hwCloudJs/core/JsCallback;->failure(ILjava/lang/String;)V

    :goto_0
    return-void
.end method
