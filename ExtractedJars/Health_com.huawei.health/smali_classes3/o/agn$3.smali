.class Lo/agn$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/agn;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/agn;


# direct methods
.method constructor <init>(Lo/agn;)V
    .locals 0

    .line 410
    iput-object p1, p0, Lo/agn$3;->b:Lo/agn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;)V
    .locals 6

    .line 415
    move-object v4, p2

    .line 416
    invoke-static {}, Lo/ahe;->b()Lo/ahe;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ahe;->a(Lcom/huawei/hihealth/device/open/data/MeasureResult;)Lo/afz;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/aga;

    .line 417
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lo/aga;->c()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 418
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

    .line 419
    iget-object v0, p0, Lo/agn$3;->b:Lo/agn;

    invoke-virtual {v5}, Lo/aga;->c()I

    move-result v1

    invoke-static {v0, v1}, Lo/agn;->d(Lo/agn;I)V

    .line 421
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->k()Z

    move-result v0

    if-nez v0, :cond_0

    .line 422
    iget-object v0, p0, Lo/agn$3;->b:Lo/agn;

    invoke-static {v0}, Lo/agn;->n(Lo/agn;)V

    .line 423
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lo/agn$3;->b:Lo/agn;

    invoke-static {v1}, Lo/agn;->m(Lo/agn;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->m(Ljava/lang/String;)V

    .line 427
    :cond_0
    return-void
.end method

.method public onFailed(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 0

    .line 464
    return-void
.end method

.method public onProgressChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureRecord;)V
    .locals 0

    .line 432
    return-void
.end method

.method public onStatusChanged(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 5

    .line 436
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

    .line 437
    const/4 v0, 0x7

    if-ne p2, v0, :cond_0

    goto/16 :goto_0

    .line 439
    :cond_0
    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/16 v0, 0x8

    if-ne p2, v0, :cond_2

    .line 440
    :cond_1
    iget-object v0, p0, Lo/agn$3;->b:Lo/agn;

    invoke-static {v0, p2}, Lo/agn;->e(Lo/agn;I)I

    .line 441
    const/4 v0, -0x4

    invoke-static {v0}, Lo/agn;->b(I)I

    .line 442
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 443
    const/16 v0, 0x3ec

    iput v0, v4, Landroid/os/Message;->what:I

    .line 444
    iget-object v0, p0, Lo/agn$3;->b:Lo/agn;

    iget-object v0, v0, Lo/agn;->a:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 445
    goto :goto_0

    :cond_2
    const/16 v0, 0xe

    if-ne p2, v0, :cond_3

    .line 446
    iget-object v0, p0, Lo/agn$3;->b:Lo/agn;

    const/16 v1, 0x2710

    invoke-static {v0, v1}, Lo/agn;->b(Lo/agn;I)V

    goto :goto_0

    .line 447
    :cond_3
    const/4 v0, 0x2

    if-ne p2, v0, :cond_4

    .line 448
    iget-object v0, p0, Lo/agn$3;->b:Lo/agn;

    invoke-static {v0, p2}, Lo/agn;->e(Lo/agn;I)I

    .line 449
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 450
    const/16 v0, 0x3ef

    iput v0, v4, Landroid/os/Message;->what:I

    .line 451
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 452
    iget-object v0, p0, Lo/agn$3;->b:Lo/agn;

    iget-object v0, v0, Lo/agn;->a:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 453
    goto :goto_0

    :cond_4
    const/16 v0, 0xc

    if-ne p2, v0, :cond_5

    .line 454
    iget-object v0, p0, Lo/agn$3;->b:Lo/agn;

    invoke-static {v0, p2}, Lo/agn;->e(Lo/agn;I)I

    .line 455
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 456
    const/16 v0, 0x3ec

    iput v0, v4, Landroid/os/Message;->what:I

    .line 457
    iget-object v0, p0, Lo/agn$3;->b:Lo/agn;

    iget-object v0, v0, Lo/agn;->a:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 459
    :cond_5
    :goto_0
    return-void
.end method
