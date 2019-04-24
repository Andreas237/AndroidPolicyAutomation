.class Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amap/api/location/AMapLocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V
    .locals 0

    .line 1466
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 0

    .line 1479
    return-void
.end method

.method public onLocationChanged(Lcom/amap/api/location/AMapLocation;)V
    .locals 5

    .line 1469
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->payhandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->access$900(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1470
    invoke-virtual {p1}, Lcom/amap/api/location/AMapLocation;->getCityCode()Ljava/lang/String;

    move-result-object v4

    .line 1471
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->access$1000(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)V

    .line 1472
    const-string v0, "BindBusCardAddActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AMapLocationListener requestLocationData cityCode="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1473
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->access$1200(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    iget-object v1, v1, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->mIssuerId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-static {v2}, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;->access$1100(Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity$8;->this$0:Lcom/huawei/nfc/carrera/ui/bus/opencard/BindBusCardAddActivity;

    invoke-interface {v0, v1, v2, v4, v3}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->queryTrafficCardInfo(Ljava/lang/String;ILjava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryTrafficCardInfoCallback;)V

    .line 1474
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0

    .line 1494
    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    .line 1489
    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    .line 1484
    return-void
.end method
