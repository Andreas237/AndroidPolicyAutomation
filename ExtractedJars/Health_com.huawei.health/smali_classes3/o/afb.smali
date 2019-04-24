.class public Lo/afb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/afb$e;
    }
.end annotation


# instance fields
.field private a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lo/afb$e;>;"
        }
    .end annotation
.end field

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/abx;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afb;->c:Ljava/util/ArrayList;

    .line 41
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/afb;->a:Ljava/util/HashMap;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/afb;->c:Ljava/util/ArrayList;

    .line 48
    return-void
.end method

.method static synthetic b(Lo/afb;)Ljava/util/HashMap;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/afb;->a:Ljava/util/HashMap;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 489
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo/afb;->b(Ljava/lang/String;I)V

    .line 490
    return-void
.end method

.method public b(Ljava/lang/String;I)V
    .locals 6

    .line 493
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter stopMeasure: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 494
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    invoke-virtual {v0}, Lo/agc;->b()Z

    move-result v4

    .line 495
    if-eqz v4, :cond_0

    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 497
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 498
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->k()Lo/acl$a;

    move-result-object v0

    sget-object v1, Lo/acl$a;->g:Lo/acl$a;

    if-ne v0, v1, :cond_0

    .line 499
    new-instance v5, Landroid/content/Intent;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/device/ui/AutoTestHeartRateService;

    invoke-direct {v5, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 500
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 505
    :cond_0
    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    .line 506
    iget-object v0, p0, Lo/afb;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/afb$e;

    .line 507
    if-eqz v5, :cond_2

    .line 508
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter md not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 509
    invoke-static {v5}, Lo/afb$e;->e(Lo/afb$e;)Lo/afv;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 510
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter stopMeasure, ending..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 511
    invoke-static {v5}, Lo/afb$e;->e(Lo/afb$e;)Lo/afv;

    move-result-object v0

    invoke-virtual {v0}, Lo/afv;->e()V

    .line 512
    const/4 v0, 0x0

    iput-object v0, v5, Lo/afb$e;->b:Lo/abx;

    .line 514
    :cond_1
    invoke-static {v5}, Lo/ahj;->a(Ljava/lang/Runnable;)Z

    .line 517
    :cond_2
    return-void
.end method

.method public b(Ljava/lang/String;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Landroid/os/Bundle;)Z
    .locals 11

    .line 527
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter startMeasureUniversal with productId: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    const/4 v8, 0x0

    .line 530
    :try_start_0
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/acd;->a(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v9

    .line 532
    if-nez v9, :cond_0

    .line 533
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter startMeasure: deviceUniversal is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 534
    const/4 v0, 0x0

    return v0

    .line 537
    :cond_0
    :try_start_1
    new-instance v0, Lo/afb$e;

    move-object v1, p0

    move-object v4, p3

    move-object v5, p1

    move-object v6, v9

    move-object v7, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v7}, Lo/afb$e;-><init>(Lo/afb;Lo/acp;Lo/abx;Landroid/os/Bundle;Ljava/lang/String;Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;)V

    move-object v10, v0

    .line 538
    iget-object v0, p0, Lo/afb;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 539
    iget-object v0, p0, Lo/afb;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    :cond_1
    iget-object v0, p0, Lo/afb;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 542
    invoke-static {v10}, Lo/ahj;->c(Ljava/lang/Runnable;)V

    .line 543
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter startMeasure: execute"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 544
    const/4 v0, 0x1

    return v0

    .line 546
    :catch_0
    move-exception v8

    .line 547
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/util/concurrent/RejectedExecutionException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 549
    const/4 v0, 0x0

    return v0
.end method

.method public c(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;)Z
    .locals 4

    .line 418
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter startMeasure with productId: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lo/afb;->e(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;Z)Z

    move-result v0

    return v0
.end method

.method public d(Lo/acl$a;Lo/abx;Lo/afg;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Lo/alk$e;)Ljava/lang/String;
    .locals 9

    .line 407
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter startMeasureWithDeviceType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/acd;->b(Lo/acl$a;)Ljava/util/ArrayList;

    move-result-object v7

    .line 411
    new-instance v0, Lo/afb$e;

    move-object v1, p0

    move-object v2, v7

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lo/afb$e;-><init>(Lo/afb;Ljava/util/ArrayList;Lo/abx;Lo/afg;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;Lo/alk$e;)V

    move-object v8, v0

    .line 412
    invoke-static {v8}, Lo/ahj;->c(Ljava/lang/Runnable;)V

    .line 414
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 5

    .line 553
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter stopMeasure: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 562
    invoke-static {p1}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 563
    iget-object v0, p0, Lo/afb;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/afb$e;

    .line 564
    if-eqz v4, :cond_0

    .line 565
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter md not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 566
    invoke-static {v4}, Lo/afb$e;->b(Lo/afb$e;)Lcom/huawei/hihealth/device/open/MeasureController;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 567
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter stopMeasureUniversal, ending..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 568
    invoke-static {v4}, Lo/afb$e;->b(Lo/afb$e;)Lcom/huawei/hihealth/device/open/MeasureController;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hihealth/device/open/MeasureController;->ending()V

    .line 572
    :cond_0
    goto :goto_0

    .line 573
    :cond_1
    iget-object v0, p0, Lo/afb;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/afb$e;

    .line 574
    if-eqz v4, :cond_3

    .line 575
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter md not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 576
    invoke-static {v4}, Lo/afb$e;->b(Lo/afb$e;)Lcom/huawei/hihealth/device/open/MeasureController;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 577
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter stopMeasureUniversal, ending..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 578
    invoke-static {v4}, Lo/afb$e;->b(Lo/afb$e;)Lcom/huawei/hihealth/device/open/MeasureController;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hihealth/device/open/MeasureController;->ending()V

    .line 580
    invoke-static {v4}, Lo/afb$e;->b(Lo/afb$e;)Lcom/huawei/hihealth/device/open/MeasureController;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hihealth/device/open/MeasureController;->cleanup()V

    .line 582
    :cond_2
    const/4 v0, 0x0

    iput-object v0, v4, Lo/afb$e;->a:Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;

    .line 584
    :cond_3
    invoke-static {v4}, Lo/ahj;->a(Ljava/lang/Runnable;)Z

    .line 586
    :goto_0
    return-void
.end method

.method public d(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;Lo/acp;)Z
    .locals 9

    .line 466
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter startMeasure with productId: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    if-nez p4, :cond_0

    .line 470
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter startMeasure: device is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 471
    const/4 v0, 0x0

    return v0

    .line 474
    :cond_0
    :try_start_1
    new-instance v0, Lo/afb$e;

    move-object v1, p0

    move-object v2, p4

    move-object v3, p2

    move-object v4, p3

    move-object v5, p1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lo/afb$e;-><init>(Lo/afb;Lo/acp;Lo/abx;Landroid/os/Bundle;Ljava/lang/String;Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;)V

    move-object v8, v0

    .line 475
    iget-object v0, p0, Lo/afb;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 476
    iget-object v0, p0, Lo/afb;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    :cond_1
    iget-object v0, p0, Lo/afb;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    invoke-static {v8}, Lo/ahj;->c(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 480
    const/4 v0, 0x1

    return v0

    .line 482
    :catch_0
    move-exception v8

    .line 483
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/util/concurrent/RejectedExecutionException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    const/4 v0, 0x0

    return v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 7

    .line 590
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 591
    return-void

    .line 594
    :cond_0
    invoke-static {p1}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 595
    iget-object v0, p0, Lo/afb;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/afb$e;

    .line 596
    if-eqz v4, :cond_2

    .line 597
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter md not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 598
    invoke-static {v4}, Lo/afb$e;->b(Lo/afb$e;)Lcom/huawei/hihealth/device/open/MeasureController;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 599
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter stopMeasureUniversal, cleanup..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 600
    invoke-static {v4}, Lo/afb$e;->b(Lo/afb$e;)Lcom/huawei/hihealth/device/open/MeasureController;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hihealth/device/open/MeasureController;->cleanup()V

    .line 602
    :cond_1
    const/4 v0, 0x0

    iput-object v0, v4, Lo/afb$e;->a:Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;

    goto :goto_0

    .line 604
    :cond_2
    invoke-static {}, Lo/acq;->a()Lo/acq;

    move-result-object v0

    const-string v1, "54C9739F-CA5C-4347-9F00-75B9DDF2C649"

    invoke-virtual {v0, v1}, Lo/acq;->b(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/MeasureKit;

    move-result-object v5

    .line 605
    if-nez v5, :cond_3

    .line 606
    return-void

    .line 608
    :cond_3
    invoke-virtual {v5}, Lcom/huawei/hihealth/device/open/MeasureKit;->getMeasureController()Lcom/huawei/hihealth/device/open/MeasureController;

    move-result-object v6

    .line 609
    if-eqz v6, :cond_4

    .line 610
    invoke-interface {v6}, Lcom/huawei/hihealth/device/open/MeasureController;->cleanup()V

    .line 613
    :cond_4
    :goto_0
    invoke-static {v4}, Lo/ahj;->a(Ljava/lang/Runnable;)Z

    .line 615
    :cond_5
    return-void
.end method

.method public e(Ljava/lang/String;Lo/abx;Landroid/os/Bundle;Z)Z
    .locals 13

    .line 424
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataImporter startMeasure with productId: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    :try_start_0
    invoke-static {}, Lo/acd;->c()Lo/acd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/acd;->d(Ljava/lang/String;)Lo/acp;

    move-result-object v8

    .line 428
    if-nez v8, :cond_0

    .line 429
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthDataImporter startMeasure: device is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 430
    const/4 v0, 0x0

    return v0

    .line 433
    :cond_0
    :try_start_1
    new-instance v0, Lo/afb$e;

    move-object v1, p0

    move-object v2, v8

    move-object v3, p2

    move-object/from16 v4, p3

    move-object v5, p1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lo/afb$e;-><init>(Lo/afb;Lo/acp;Lo/abx;Landroid/os/Bundle;Ljava/lang/String;Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/IHealthDeviceCallback;)V

    move-object v9, v0

    .line 434
    invoke-static {p1}, Lo/ahd;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 436
    if-nez p4, :cond_2

    if-eqz p3, :cond_2

    const-string v0, "type"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lo/afb;->a:Ljava/util/HashMap;

    .line 437
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 439
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 440
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v10

    .line 441
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v10}, Lo/afd;->a(Ljava/lang/String;)Lo/afx;

    move-result-object v11

    .line 442
    invoke-virtual {v11}, Lo/afx;->e()Lo/afv;

    move-result-object v12

    .line 443
    move-object/from16 v0, p3

    invoke-virtual {v12, v8, p2, v0}, Lo/afv;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    .line 446
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 451
    :cond_2
    :try_start_2
    iget-object v0, p0, Lo/afb;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 452
    iget-object v0, p0, Lo/afb;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    :cond_3
    iget-object v0, p0, Lo/afb;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    invoke-static {v9}, Lo/ahj;->c(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_2 .. :try_end_2} :catch_0

    .line 456
    const/4 v0, 0x1

    return v0

    .line 458
    :catch_0
    move-exception v8

    .line 459
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/util/concurrent/RejectedExecutionException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    const/4 v0, 0x0

    return v0
.end method
