.class Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amap/api/location/AMapLocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)V
    .locals 0

    .line 362
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$4;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 0

    .line 379
    return-void
.end method

.method public onLocationChanged(Lcom/amap/api/location/AMapLocation;)V
    .locals 5

    .line 366
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$4;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$4;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    invoke-virtual {p1}, Lcom/amap/api/location/AMapLocation;->getLatitude()D

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->access$700(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;D)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->access$602(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;Ljava/lang/String;)Ljava/lang/String;

    .line 367
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$4;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$4;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    invoke-virtual {p1}, Lcom/amap/api/location/AMapLocation;->getLongitude()D

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->access$700(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;D)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->access$802(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;Ljava/lang/String;)Ljava/lang/String;

    .line 368
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===requestLocationData latitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$4;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->access$600(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "longitude"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$4;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->access$800(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 373
    goto :goto_0

    .line 369
    :catch_0
    move-exception v4

    .line 370
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===requestLocationData e="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 371
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$4;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    const-string v1, "0.000000"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->access$602(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;Ljava/lang/String;)Ljava/lang/String;

    .line 372
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$4;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    const-string v1, "0.000000"

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->access$802(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;Ljava/lang/String;)Ljava/lang/String;

    .line 374
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator$4;->this$0:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;->access$500(Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAppCodeSAOperator;)V

    .line 375
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0

    .line 394
    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    .line 389
    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    .line 384
    return-void
.end method
