.class Lo/agl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/agl;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/agl;

.field final synthetic c:Lo/agk;


# direct methods
.method constructor <init>(Lo/agl;Lo/agk;)V
    .locals 0

    .line 381
    iput-object p1, p0, Lo/agl$1;->a:Lo/agl;

    iput-object p2, p0, Lo/agl$1;->c:Lo/agk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;)V
    .locals 7

    .line 385
    move-object v4, p2

    .line 386
    invoke-static {}, Lo/ahe;->b()Lo/ahe;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ahe;->a(Lcom/huawei/hihealth/device/open/data/MeasureResult;)Lo/afz;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/aga;

    .line 387
    if-eqz v5, :cond_0

    .line 388
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-----heartRateData---:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/aga;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    new-instance v6, Lo/agl$1$4;

    invoke-direct {v6, p0, p1}, Lo/agl$1$4;-><init>(Lo/agl$1;Lcom/huawei/hihealth/device/open/HealthDevice;)V

    .line 407
    invoke-virtual {v5}, Lo/aga;->c()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 408
    iget-object v0, p0, Lo/agl$1;->c:Lo/agk;

    invoke-virtual {v0, v6, v5}, Lo/agk;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 411
    :cond_0
    return-void
.end method

.method public onFailed(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 0

    .line 446
    return-void
.end method

.method public onProgressChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureRecord;)V
    .locals 0

    .line 416
    return-void
.end method

.method public onStatusChanged(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 4

    .line 420
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "-----heartRateData_onStatusChanged---:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 423
    :sswitch_0
    iget-object v0, p0, Lo/agl$1;->a:Lo/agl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/agl;->e(Lo/agl;Z)Z

    .line 424
    iget-object v0, p0, Lo/agl$1;->a:Lo/agl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/agl;->b(Lo/agl;Ljava/lang/String;)Ljava/lang/String;

    .line 425
    goto :goto_1

    .line 427
    :sswitch_1
    iget-object v0, p0, Lo/agl$1;->a:Lo/agl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/agl;->e(Lo/agl;Z)Z

    .line 428
    goto :goto_1

    .line 430
    :sswitch_2
    iget-object v0, p0, Lo/agl$1;->a:Lo/agl;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/agl;->e(Lo/agl;Z)Z

    .line 431
    goto :goto_1

    .line 433
    :sswitch_3
    iget-object v0, p0, Lo/agl$1;->a:Lo/agl;

    invoke-static {v0}, Lo/agl;->d(Lo/agl;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/agl$1;->a:Lo/agl;

    invoke-static {v0}, Lo/agl;->b(Lo/agl;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 434
    iget-object v0, p0, Lo/agl$1;->a:Lo/agl;

    iget-object v1, p0, Lo/agl$1;->a:Lo/agl;

    invoke-static {v1}, Lo/agl;->d(Lo/agl;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/agl;->c(Lo/agl;Ljava/lang/String;)V

    goto :goto_1

    .line 438
    :goto_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStatusChanged default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    :cond_0
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_3
        0x3 -> :sswitch_2
        0xe -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method
