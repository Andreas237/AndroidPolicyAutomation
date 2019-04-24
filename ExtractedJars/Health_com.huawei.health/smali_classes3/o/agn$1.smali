.class Lo/agn$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/agn;->o()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/agn;


# direct methods
.method constructor <init>(Lo/agn;)V
    .locals 0

    .line 364
    iput-object p1, p0, Lo/agn$1;->c:Lo/agn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;)V
    .locals 0

    .line 368
    return-void
.end method

.method public onFailed(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 0

    .line 395
    return-void
.end method

.method public onProgressChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureRecord;)V
    .locals 0

    .line 373
    return-void
.end method

.method public onStatusChanged(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 5

    .line 377
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

    .line 378
    iget-object v0, p0, Lo/agn$1;->c:Lo/agn;

    invoke-static {v0, p2}, Lo/agn;->e(Lo/agn;I)I

    .line 380
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/agn$1;->c:Lo/agn;

    invoke-static {v0}, Lo/agn;->l(Lo/agn;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 381
    iget-object v0, p0, Lo/agn$1;->c:Lo/agn;

    invoke-static {v0}, Lo/agn;->p(Lo/agn;)V

    goto :goto_0

    .line 382
    :cond_0
    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/16 v0, 0x8

    if-ne p2, v0, :cond_2

    .line 383
    :cond_1
    iget-object v0, p0, Lo/agn$1;->c:Lo/agn;

    invoke-static {v0, p2}, Lo/agn;->e(Lo/agn;I)I

    .line 384
    const/4 v0, -0x4

    invoke-static {v0}, Lo/agn;->b(I)I

    .line 385
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 386
    const/16 v0, 0x3ec

    iput v0, v4, Landroid/os/Message;->what:I

    .line 387
    iget-object v0, p0, Lo/agn$1;->c:Lo/agn;

    iget-object v0, v0, Lo/agn;->a:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 390
    :cond_2
    :goto_0
    return-void
.end method
