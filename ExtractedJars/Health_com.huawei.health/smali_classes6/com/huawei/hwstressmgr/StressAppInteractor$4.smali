.class Lcom/huawei/hwstressmgr/StressAppInteractor$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwstressmgr/StressAppInteractor;->e(Lorg/json/JSONObject;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lorg/json/JSONObject;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/huawei/hwstressmgr/StressAppInteractor;


# direct methods
.method constructor <init>(Lcom/huawei/hwstressmgr/StressAppInteractor;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    .line 636
    iput-object p1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$4;->d:Lcom/huawei/hwstressmgr/StressAppInteractor;

    iput-object p2, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$4;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$4;->b:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;)V
    .locals 0

    .line 640
    return-void
.end method

.method public onFailed(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 0

    .line 670
    return-void
.end method

.method public onProgressChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureRecord;)V
    .locals 0

    .line 645
    return-void
.end method

.method public onStatusChanged(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 5

    .line 649
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-----prepare  heartRateData_onStatusChanged---:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 650
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 652
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 653
    const-string v0, "type"

    const/16 v1, 0xf

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 654
    const-string v0, "result_code"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 655
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$4;->d:Lcom/huawei/hwstressmgr/StressAppInteractor;

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$4;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->b(Lcom/huawei/hwstressmgr/StressAppInteractor;Ljava/lang/String;)Ljava/lang/String;

    .line 656
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$4;->d:Lcom/huawei/hwstressmgr/StressAppInteractor;

    invoke-static {v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->c(Lcom/huawei/hwstressmgr/StressAppInteractor;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 659
    goto :goto_0

    .line 657
    :catch_0
    move-exception v4

    .line 658
    const-string v0, "Opera_StressService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 659
    goto :goto_0

    .line 661
    :cond_0
    if-eqz p2, :cond_1

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/16 v0, 0x8

    if-eq p2, v0, :cond_1

    const/16 v0, 0x10

    if-eq p2, v0, :cond_1

    const/16 v0, 0xc

    if-eq p2, v0, :cond_1

    const/16 v0, 0xd

    if-ne p2, v0, :cond_2

    .line 662
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$4;->d:Lcom/huawei/hwstressmgr/StressAppInteractor;

    invoke-static {v0}, Lcom/huawei/hwstressmgr/StressAppInteractor;->b(Lcom/huawei/hwstressmgr/StressAppInteractor;)Lo/dnd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$4;->b:Lorg/json/JSONObject;

    iget-object v2, p0, Lcom/huawei/hwstressmgr/StressAppInteractor$4;->d:Lcom/huawei/hwstressmgr/StressAppInteractor;

    invoke-static {v2}, Lcom/huawei/hwstressmgr/StressAppInteractor;->c(Lcom/huawei/hwstressmgr/StressAppInteractor;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/dnd;->a(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 665
    :cond_2
    :goto_0
    return-void
.end method
