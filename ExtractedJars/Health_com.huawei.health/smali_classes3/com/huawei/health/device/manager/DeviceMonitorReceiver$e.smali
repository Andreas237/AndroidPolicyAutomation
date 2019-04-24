.class Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/abx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/manager/DeviceMonitorReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private a:I

.field final synthetic b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

.field private d:Lo/acl$a;


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 323
    iput-object p1, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 324
    invoke-static {p3}, Lo/acl$a;->valueOf(Ljava/lang/String;)Lo/acl$a;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->d:Lo/acl$a;

    .line 325
    iget-object v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->d:Lo/acl$a;

    invoke-static {p1, v0}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->a(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Lo/acl$a;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->a:I

    .line 326
    return-void
.end method


# virtual methods
.method public onDataChanged(Lo/acl;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/acl;Ljava/util/List<Lo/afz;>;)V"
        }
    .end annotation

    .line 378
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMonitorReceiver onDataChanged "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    if-nez p1, :cond_0

    .line 381
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMonitorReceiver onDataChanged device is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    return-void

    .line 386
    :cond_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 387
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMonitorReceiver onDataChanged data is null or empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    return-void

    .line 391
    :cond_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    .line 392
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMonitorReceiver dataList size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    new-instance v5, Lo/afh;

    invoke-virtual {p1}, Lo/acl;->e()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->a:I

    const/4 v2, 0x0

    invoke-direct {v5, v2, v0, v1}, Lo/afh;-><init>(ILjava/lang/String;I)V

    .line 395
    iget-object v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

    invoke-static {v0, v5, p2}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->b(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Lo/afh;Ljava/util/List;)V

    .line 398
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/afy;

    if-eqz v0, :cond_3

    .line 399
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMonitorReceiver receive data is bloodSugar"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    invoke-virtual {p1}, Lo/acl;->b()Ljava/lang/String;

    move-result-object v6

    .line 401
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

    invoke-static {v1}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    iget-object v6, v0, Lo/afj$a;->c:Ljava/lang/String;

    .line 403
    iget-object v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

    invoke-virtual {p1}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/dae;->fR:Lo/dae;

    invoke-static {v0, v6, v1, v2, p2}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->d(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Ljava/lang/String;Ljava/lang/String;Lo/dae;Ljava/util/List;)V

    .line 405
    iget-object v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

    const/16 v1, 0x6a4

    invoke-static {v0, v6, v1, p2}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Ljava/lang/String;ILjava/util/List;)V

    .line 407
    const-string v7, "com.huawei.ui.main.stories.health.activity.healthdata.BloodsugarActivity"

    .line 408
    iget-object v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

    invoke-static {v0, v4, v7}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->b(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;ILjava/lang/String;)V

    .line 411
    :cond_3
    return-void
.end method

.method public onDataChanged(Lo/acl;Lo/afz;)V
    .locals 7

    .line 331
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMonitorReceiver onDataChanged "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 332
    if-nez p1, :cond_0

    .line 333
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMonitorReceiver onDataChanged device is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    return-void

    .line 337
    :cond_0
    if-nez p2, :cond_1

    .line 338
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMonitorReceiver onDataChanged data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    return-void

    .line 342
    :cond_1
    invoke-static {}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e()Z

    move-result v0

    if-nez v0, :cond_2

    .line 343
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMonitor receiver setNotification block"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 344
    return-void

    .line 347
    :cond_2
    instance-of v0, p2, Lo/age;

    if-eqz v0, :cond_3

    .line 349
    const-string v4, "com.huawei.ui.main.stories.health.activity.healthdata.BloodpresureActivity"

    .line 350
    new-instance v5, Lo/afh;

    invoke-virtual {p1}, Lo/acl;->e()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->a:I

    const/4 v2, 0x0

    invoke-direct {v5, v2, v0, v1}, Lo/afh;-><init>(ILjava/lang/String;I)V

    .line 351
    iget-object v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

    invoke-static {v0, v5, p2}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->c(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Lo/afh;Lo/afz;)V

    .line 352
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

    invoke-static {v1}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    iget-object v6, v0, Lo/afj$a;->c:Ljava/lang/String;

    .line 354
    iget-object v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

    invoke-virtual {p1}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/dae;->fU:Lo/dae;

    invoke-static {v0, v6, v1, v2, p2}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->b(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Ljava/lang/String;Ljava/lang/String;Lo/dae;Lo/afz;)V

    .line 356
    iget-object v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

    const/16 v1, 0x640

    invoke-static {v0, v6, v1, p2}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->a(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Ljava/lang/String;ILo/afz;)V

    .line 357
    iget-object v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

    const/4 v1, 0x1

    invoke-static {v0, v1, v4}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->b(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;ILjava/lang/String;)V

    .line 360
    :cond_3
    instance-of v0, p2, Lo/agg;

    if-eqz v0, :cond_4

    .line 361
    const-string v4, "com.huawei.ui.main.stories.health.activity.healthdata.WeightActivity"

    .line 362
    new-instance v5, Lo/afh;

    invoke-virtual {p1}, Lo/acl;->e()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->a:I

    const/4 v2, 0x0

    invoke-direct {v5, v2, v0, v1}, Lo/afh;-><init>(ILjava/lang/String;I)V

    .line 363
    iget-object v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

    invoke-static {v0, v5, p2}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->c(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Lo/afh;Lo/afz;)V

    .line 365
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

    invoke-static {v1}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->e(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    iget-object v6, v0, Lo/afj$a;->c:Ljava/lang/String;

    .line 367
    iget-object v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

    invoke-virtual {p1}, Lo/acl;->a()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lo/dae;->fV:Lo/dae;

    invoke-static {v0, v6, v1, v2, p2}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->b(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Ljava/lang/String;Ljava/lang/String;Lo/dae;Lo/afz;)V

    .line 369
    iget-object v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

    const/4 v1, 0x1

    invoke-static {v0, v1, v4}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->b(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;ILjava/lang/String;)V

    .line 372
    iget-object v0, p0, Lcom/huawei/health/device/manager/DeviceMonitorReceiver$e;->b:Lcom/huawei/health/device/manager/DeviceMonitorReceiver;

    const/16 v1, 0x4ba

    invoke-static {v0, v6, v1, p2}, Lcom/huawei/health/device/manager/DeviceMonitorReceiver;->a(Lcom/huawei/health/device/manager/DeviceMonitorReceiver;Ljava/lang/String;ILo/afz;)V

    .line 374
    :cond_4
    return-void
.end method

.method public onFailed(Lo/acl;I)V
    .locals 0

    .line 426
    return-void
.end method

.method public onProgressChanged(Lo/acl;Lo/afz;)V
    .locals 0

    .line 416
    return-void
.end method

.method public onStatusChanged(Lo/acl;I)V
    .locals 0

    .line 421
    return-void
.end method
