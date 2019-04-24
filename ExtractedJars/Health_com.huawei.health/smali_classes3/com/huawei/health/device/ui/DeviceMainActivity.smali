.class public Lcom/huawei/health/device/ui/DeviceMainActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Lcom/huawei/health/device/ui/BaseFragment;

.field private b:Z

.field c:Lo/ahi$e;

.field private d:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<*>;"
        }
    .end annotation
.end field

.field private e:Landroid/os/Bundle;

.field private f:Z

.field private g:Lo/egv;

.field private h:Ljava/lang/Class;

.field private i:Lcom/huawei/health/device/ui/BaseFragment;

.field private k:I

.field private m:Lcom/huawei/health/device/ui/BaseFragment;

.field private n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/hihealth/device/open/HealthDevice;>;"
        }
    .end annotation
.end field

.field private p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/acl;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->a:Lcom/huawei/health/device/ui/BaseFragment;

    .line 65
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->b:Z

    .line 68
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->e:Landroid/os/Bundle;

    .line 116
    new-instance v0, Lcom/huawei/health/device/ui/DeviceMainActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/DeviceMainActivity$1;-><init>(Lcom/huawei/health/device/ui/DeviceMainActivity;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->c:Lo/ahi$e;

    .line 771
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->p:Ljava/util/ArrayList;

    .line 777
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->n:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/device/ui/DeviceMainActivity;Lo/egv;)Lo/egv;
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->g:Lo/egv;

    return-object p1
.end method

.method private a(Landroid/content/Intent;)V
    .locals 9

    .line 354
    const-string v0, "Device_Type"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 356
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->c()Lo/aey;

    move-result-object v0

    invoke-virtual {v0}, Lo/aey;->d()Ljava/util/ArrayList;

    move-result-object v5

    .line 357
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 358
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 359
    const-string v0, "groups.xml"

    invoke-static {v0}, Lo/aey;->d(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    goto :goto_0

    .line 361
    :cond_0
    const-string v0, "groups_abroad.xml"

    invoke-static {v0}, Lo/aey;->d(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 365
    :cond_1
    :goto_0
    invoke-direct {p0, v5, v4}, Lcom/huawei/health/device/ui/DeviceMainActivity;->b(Ljava/util/ArrayList;Ljava/lang/String;)Lo/afk;

    move-result-object v6

    .line 366
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 367
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity item = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    new-instance v7, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-direct {v7}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;-><init>()V

    .line 369
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 370
    const-string v0, "kind"

    iget-object v1, v6, Lo/afk;->b:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    const-string v0, "deviceType"

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, v6, Lo/afk;->c:Ljava/lang/String;

    invoke-static {v2}, Lo/afo;->c(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    invoke-virtual {v7, v8}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->setArguments(Landroid/os/Bundle;)V

    .line 373
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v7}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 375
    :cond_2
    return-void
.end method

.method private b(Ljava/util/ArrayList;Ljava/lang/String;)Lo/afk;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afk;>;Ljava/lang/String;)Lo/afk;"
        }
    .end annotation

    .line 395
    const/4 v4, 0x0

    .line 396
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/afk;

    .line 397
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity item.kind.name() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v6, Lo/afk;->b:Lo/acl$a;

    invoke-virtual {v3}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " device_Type = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 398
    iget-object v0, v6, Lo/afk;->b:Lo/acl$a;

    invoke-virtual {v0}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 399
    move-object v4, v6

    .line 401
    :cond_0
    goto :goto_0

    .line 402
    :cond_1
    return-object v4
.end method

.method private b(Landroid/content/Intent;)V
    .locals 2

    .line 450
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 451
    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;

    invoke-direct {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;-><init>()V

    .line 452
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductUpgradeFragment;->setArguments(Landroid/os/Bundle;)V

    .line 453
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 455
    :cond_0
    return-void
.end method

.method private b(Lo/acl$a;)V
    .locals 6

    .line 461
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;-><init>()V

    .line 462
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 463
    const-string v0, "kind"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 465
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->c()Lo/aey;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/aey;->c(Lo/acl$a;)Lo/afk;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 466
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity showDeviceBondView is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 467
    const-string v0, "deviceType"

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v2

    invoke-virtual {v2}, Lo/afq;->c()Lo/aey;

    move-result-object v2

    invoke-virtual {v2, p1}, Lo/aey;->c(Lo/acl$a;)Lo/afk;

    move-result-object v2

    iget-object v2, v2, Lo/afk;->c:Ljava/lang/String;

    invoke-static {v2}, Lo/afo;->c(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    :cond_0
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->setArguments(Landroid/os/Bundle;)V

    .line 471
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v4}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 472
    return-void
.end method

.method private b(Lo/acl$a;Landroid/content/Intent;)V
    .locals 4

    .line 434
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 435
    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;

    invoke-direct {v2}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;-><init>()V

    .line 436
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 437
    const-string v0, "kind"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    const-string v0, "HealthData"

    const-string v1, "HealthData"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 439
    const-string v0, "productId"

    const-string v1, "productId"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 440
    invoke-virtual {v2, v3}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->setArguments(Landroid/os/Bundle;)V

    .line 441
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v2}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 443
    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/device/ui/DeviceMainActivity;)Lo/egv;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->g:Lo/egv;

    return-object v0
.end method

.method private c(Landroid/content/Intent;)V
    .locals 8

    .line 407
    const-string v0, "arg2"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 408
    if-nez v4, :cond_0

    .line 409
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity cloud message arg2 is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 411
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity cloud message arg2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    move-object v5, v4

    .line 419
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 420
    const-string v0, "productId"

    invoke-virtual {v6, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 421
    new-instance v7, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-direct {v7}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;-><init>()V

    .line 422
    invoke-static {}, Lo/ahd;->c()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v5}, Lo/ahd;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 423
    :cond_1
    new-instance v7, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-direct {v7}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;-><init>()V

    goto :goto_0

    .line 424
    :cond_2
    invoke-static {v5}, Lo/ake;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 425
    new-instance v7, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-direct {v7}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;-><init>()V

    .line 427
    :cond_3
    :goto_0
    invoke-virtual {v7, v6}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 428
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v7}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 431
    :goto_1
    return-void
.end method

.method private c(Lo/acl$a;)V
    .locals 4

    .line 487
    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-direct {v2}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;-><init>()V

    .line 488
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 489
    const-string v0, "kind"

    invoke-virtual {p1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 490
    const-string v0, "EntryType"

    const-string v1, "Pick"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 491
    invoke-virtual {v2, v3}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 493
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v2}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 494
    return-void
.end method

.method private d(Landroid/content/Intent;)V
    .locals 6

    .line 316
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 318
    if-eqz v4, :cond_5

    const-string v0, "SWITCH_PLUGINDEVICE"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 320
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity action is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    const-string v0, "arg1"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 324
    if-nez v5, :cond_0

    .line 325
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity cloud message arg1 is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 327
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity cloud message arg1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    const-string v0, "DeviceList"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 330
    invoke-direct {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->h()V

    goto :goto_0

    .line 331
    :cond_1
    const-string v0, "DeviceIntroduction"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 332
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->c(Landroid/content/Intent;)V

    goto :goto_0

    .line 333
    :cond_2
    const-string v0, "DeviceInfo"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 334
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Landroid/content/Intent;)V

    goto :goto_0

    .line 335
    :cond_3
    const-string v0, "DeviceInfoList"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 336
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->e(Landroid/content/Intent;)V

    goto :goto_0

    .line 338
    :cond_4
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity cloud message arg1 is invalid, arg1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    :cond_5
    :goto_0
    return-void
.end method

.method private d(Ljava/lang/String;)V
    .locals 5

    .line 124
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->g:Lo/egv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->g:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    return-void

    .line 127
    :cond_0
    new-instance v4, Lo/egv$b;

    invoke-direct {v4, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 128
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_service_area_notice_title:I

    invoke-virtual {v4, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_download_resoure_tip_content_message:I

    .line 129
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_hwh_open_service_pop_up_notification_agree:I

    new-instance v2, Lcom/huawei/health/device/ui/DeviceMainActivity$2;

    invoke-direct {v2, p0, p1}, Lcom/huawei/health/device/ui/DeviceMainActivity$2;-><init>(Lcom/huawei/health/device/ui/DeviceMainActivity;Ljava/lang/String;)V

    .line 130
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lcom/huawei/health/device/ui/DeviceMainActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/DeviceMainActivity$4;-><init>(Lcom/huawei/health/device/ui/DeviceMainActivity;)V

    .line 151
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 167
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->g:Lo/egv;

    .line 168
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->g:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 169
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 170
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity showDialog isFinishing = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 172
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->g:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 174
    :goto_0
    return-void
.end method

.method private d(Lo/acl$a;)V
    .locals 7

    .line 612
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity showDeviceListView kind "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;-><init>()V

    .line 614
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 615
    const-string v0, "kind"

    invoke-virtual {p1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 616
    const-string v0, "EntryType"

    const-string v1, "List"

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 617
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    .line 618
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 619
    const-string v0, "isFromFitnessAdvice"

    const-string v1, "isFromFitnessAdvice"

    const/4 v2, 0x0

    invoke-virtual {v6, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 620
    const-string v0, "notHeartRateDeviceList"

    const-string v1, "notHeartRateDeviceList"

    invoke-virtual {v6, v1}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 622
    :cond_0
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 624
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v4}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 625
    return-void
.end method

.method private d(Lo/acl$a;Ljava/lang/String;)V
    .locals 6

    .line 600
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity showDeviceListView kind "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;-><init>()V

    .line 602
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 603
    const-string v0, "kind"

    invoke-virtual {p1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 604
    const-string v0, "EntryType"

    const-string v1, "List"

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 605
    const-string v0, "root_in_me"

    invoke-virtual {v5, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 606
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 608
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v4}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 609
    return-void
.end method

.method private d(Ljava/lang/Class;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;)Z"
        }
    .end annotation

    .line 649
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v4

    .line 650
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentManager;->getBackStackEntryCount()I

    move-result v5

    .line 651
    const/4 v6, 0x0

    .line 652
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity fragmentClass is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 654
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_1

    .line 655
    invoke-virtual {v4, v7}, Landroid/support/v4/app/FragmentManager;->getBackStackEntryAt(I)Landroid/support/v4/app/FragmentManager$BackStackEntry;

    move-result-object v8

    .line 656
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity backStackEntry is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v8}, Landroid/support/v4/app/FragmentManager$BackStackEntry;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 657
    invoke-interface {v8}, Landroid/support/v4/app/FragmentManager$BackStackEntry;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 658
    const/4 v6, 0x1

    .line 654
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 661
    :cond_1
    return v6
.end method

.method private e(Landroid/content/Intent;)V
    .locals 4

    .line 378
    const-string v0, "productId"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 379
    const/4 v2, 0x0

    .line 380
    invoke-static {v1}, Lo/ahd;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 381
    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;

    invoke-direct {v2}, Lcom/huawei/health/device/ui/measure/fragment/HonourDeviceFragment;-><init>()V

    goto :goto_0

    .line 382
    :cond_0
    invoke-static {v1}, Lo/ake;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 383
    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-direct {v2}, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;-><init>()V

    goto :goto_0

    .line 385
    :cond_1
    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-direct {v2}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;-><init>()V

    .line 387
    :goto_0
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 388
    const-string v0, "productId"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 389
    invoke-virtual {v2, v3}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 390
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v2}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 391
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/device/ui/DeviceMainActivity;Ljava/lang/String;)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->d(Ljava/lang/String;)V

    return-void
.end method

.method private e(Lo/acl$a;)V
    .locals 12

    .line 497
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/afd;->e(Lo/acl$a;)Ljava/util/ArrayList;

    move-result-object v4

    .line 498
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->e(Ljava/lang/Class;)V

    .line 499
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 501
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 502
    invoke-static {v5}, Lo/agd;->d(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v6

    .line 503
    if-eqz v6, :cond_0

    .line 504
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 505
    const-string v0, "view"

    const-string v1, "measure"

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    const-string v0, "productId"

    invoke-virtual {v7, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    const-string v0, "type"

    iget v1, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->k:I

    invoke-virtual {v7, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 508
    invoke-virtual {v6, v7}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 509
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v6}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 510
    goto/16 :goto_1

    .line 511
    :cond_0
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/afd;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 512
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/afd;->d(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v7

    .line 518
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v8

    .line 519
    const-string v0, "01"

    iget-object v1, v8, Lo/afj;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    .line 520
    if-eqz v7, :cond_3

    .line 521
    if-eqz v9, :cond_1

    .line 522
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity the productId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is not res, and this is auto"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    new-instance v10, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;

    invoke-direct {v10}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;-><init>()V

    .line 524
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 525
    const-string v0, "view"

    const-string v1, "bond"

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 526
    const-string v0, "productId"

    invoke-virtual {v11, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 527
    const-string v0, "type"

    iget v1, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->k:I

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 528
    invoke-virtual {v10, v11}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->setArguments(Landroid/os/Bundle;)V

    .line 529
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v10}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 530
    goto/16 :goto_0

    .line 531
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " DeviceMainActivity the productId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is not res, and this is not auto  kind.name is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 532
    invoke-virtual {p1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/agd;->d(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v10

    .line 533
    if-eqz v10, :cond_2

    .line 534
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 535
    const-string v0, "view"

    const-string v1, "measure"

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 536
    const-string v0, "kind"

    invoke-virtual {p1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 537
    const-string v0, "productId"

    invoke-virtual {v11, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 538
    const-string v0, "type"

    iget v1, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->k:I

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 539
    invoke-virtual {v10, v11}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 540
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v10}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 542
    :cond_2
    goto :goto_0

    .line 544
    :cond_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the device is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 546
    :goto_0
    goto/16 :goto_1

    .line 547
    :cond_4
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/acp;

    .line 553
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v8

    .line 554
    const-string v0, "01"

    iget-object v1, v8, Lo/afj;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    .line 555
    if-eqz v7, :cond_7

    .line 556
    invoke-virtual {v7}, Lo/acp;->i()Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz v9, :cond_5

    .line 557
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity the productId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is not res, and this is auto"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 558
    new-instance v10, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;

    invoke-direct {v10}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;-><init>()V

    .line 559
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 560
    const-string v0, "view"

    const-string v1, "bond"

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 561
    const-string v0, "productId"

    invoke-virtual {v11, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 562
    const-string v0, "type"

    iget v1, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->k:I

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 563
    invoke-virtual {v10, v11}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->setArguments(Landroid/os/Bundle;)V

    .line 564
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v10}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 565
    goto/16 :goto_1

    .line 566
    :cond_5
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " DeviceMainActivity the productId "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " is not res, and this is not auto  kind.name is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    invoke-virtual {p1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/agd;->d(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v10

    .line 568
    if-eqz v10, :cond_6

    .line 569
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 570
    const-string v0, "view"

    const-string v1, "measure"

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 571
    const-string v0, "kind"

    invoke-virtual {p1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 572
    const-string v0, "productId"

    invoke-virtual {v11, v0, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 573
    const-string v0, "type"

    iget v1, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->k:I

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 574
    invoke-virtual {v10, v11}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 575
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v10}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 577
    :cond_6
    goto :goto_1

    .line 579
    :cond_7
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the device is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 584
    :goto_1
    goto :goto_2

    :cond_8
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_9

    .line 585
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-direct {v5}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;-><init>()V

    .line 586
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 587
    const-string v0, "kind"

    invoke-virtual {p1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 588
    const-string v0, "EntryType"

    const-string v1, "Measure"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 589
    invoke-virtual {v5, v6}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 591
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v5}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 593
    :cond_9
    :goto_2
    return-void
.end method

.method private g()V
    .locals 4

    .line 476
    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-direct {v2}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;-><init>()V

    .line 477
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 478
    const-string v0, "kind"

    sget-object v1, Lo/acl$a;->c:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 479
    const-string v0, "EntryType"

    const-string v1, "WiFiDevice"

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 480
    invoke-virtual {v2, v3}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 482
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v2}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 483
    return-void
.end method

.method private h()V
    .locals 2

    .line 347
    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-direct {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;-><init>()V

    .line 348
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 350
    return-void
.end method

.method private i()Z
    .locals 3

    .line 750
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    .line 751
    const/4 v0, 0x1

    return v0

    .line 753
    :cond_0
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 754
    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    .line 755
    const/4 v0, 0x1

    return v0

    .line 758
    :cond_1
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 759
    invoke-static {p0, v0}, Lo/dbf;->l(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 760
    :cond_2
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->requestPermissions([Ljava/lang/String;I)V

    .line 762
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p0, v0}, Lo/dbf;->m(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 764
    :cond_3
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lo/ene;->b(Landroid/content/Context;Z)V

    .line 767
    :goto_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/acl;>;"
        }
    .end annotation

    .line 784
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->p:Ljava/util/ArrayList;

    return-object v0
.end method

.method public a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 6

    .line 675
    if-nez p2, :cond_0

    .line 676
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->finish()V

    goto/16 :goto_2

    .line 678
    :cond_0
    instance-of v0, p2, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    if-eqz v0, :cond_1

    .line 679
    invoke-virtual {p2}, Lcom/huawei/health/device/ui/BaseFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v4

    .line 680
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 681
    const-string v0, "scanMode"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    .line 682
    iput-object p1, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->i:Lcom/huawei/health/device/ui/BaseFragment;

    .line 683
    iput-object p2, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->m:Lcom/huawei/health/device/ui/BaseFragment;

    .line 684
    invoke-direct {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->i()Z

    move-result v0

    if-nez v0, :cond_1

    .line 685
    return-void

    .line 691
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v4

    .line 692
    invoke-virtual {v4}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v5

    .line 693
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->f:Z

    if-nez v0, :cond_3

    .line 694
    invoke-static {p0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 695
    sget v0, Lcom/huawei/plugindevice/R$anim;->right_enter:I

    sget v1, Lcom/huawei/plugindevice/R$anim;->right_exit:I

    sget v2, Lcom/huawei/plugindevice/R$anim;->left_enter:I

    sget v3, Lcom/huawei/plugindevice/R$anim;->left_exit:I

    invoke-virtual {v5, v0, v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(IIII)Landroid/support/v4/app/FragmentTransaction;

    goto :goto_0

    .line 697
    :cond_2
    sget v0, Lcom/huawei/plugindevice/R$anim;->left_enter:I

    sget v1, Lcom/huawei/plugindevice/R$anim;->left_exit:I

    sget v2, Lcom/huawei/plugindevice/R$anim;->right_enter:I

    sget v3, Lcom/huawei/plugindevice/R$anim;->right_exit:I

    invoke-virtual {v5, v0, v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->setCustomAnimations(IIII)Landroid/support/v4/app/FragmentTransaction;

    .line 700
    :cond_3
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->f:Z

    .line 702
    if-eqz p1, :cond_4

    .line 703
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/support/v4/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 706
    :cond_4
    invoke-virtual {p2}, Lcom/huawei/health/device/ui/BaseFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 707
    invoke-virtual {v5, p2}, Landroid/support/v4/app/FragmentTransaction;->show(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    goto :goto_1

    .line 709
    :cond_5
    sget v0, Lcom/huawei/plugindevice/R$id;->device_fragment_container:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, p2, v1}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 711
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->d:Ljava/lang/Class;

    .line 712
    invoke-virtual {v5}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 714
    :goto_2
    return-void
.end method

.method public b(Ljava/lang/Class;)Landroid/support/v4/app/Fragment;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;)Landroid/support/v4/app/Fragment;"
        }
    .end annotation

    .line 669
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    .line 670
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    .line 671
    return-object v2
.end method

.method public b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/hihealth/device/open/HealthDevice;>;"
        }
    .end annotation

    .line 788
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->n:Ljava/util/ArrayList;

    return-object v0
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/lang/Class<*>;"
        }
    .end annotation

    .line 180
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->h:Ljava/lang/Class;

    return-object v0
.end method

.method public c(I)V
    .locals 2

    .line 176
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->e:Landroid/os/Bundle;

    const-string v1, "bloodSugarMeasureType"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 177
    return-void
.end method

.method public c(Lcom/huawei/health/device/ui/BaseFragment;)V
    .locals 0

    .line 596
    iput-object p1, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->a:Lcom/huawei/health/device/ui/BaseFragment;

    .line 597
    return-void
.end method

.method public c(Ljava/lang/Class;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;)V"
        }
    .end annotation

    .line 628
    if-eqz p1, :cond_1

    .line 629
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v4

    .line 630
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->d(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 631
    iput-object p1, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->d:Ljava/lang/Class;

    .line 632
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity mClass is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->d:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/support/v4/app/FragmentManager;->popBackStack(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 637
    goto :goto_0

    .line 635
    :catch_0
    move-exception v5

    .line 636
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity throws "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 637
    goto :goto_0

    .line 640
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->finish()V

    .line 642
    :goto_0
    goto :goto_1

    .line 643
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->finish()V

    .line 645
    :goto_1
    return-void
.end method

.method protected d()V
    .locals 10

    .line 249
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 250
    const-string v5, ""

    .line 251
    const-string v6, ""

    .line 252
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const-string v0, "view"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 253
    const-string v0, "view"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 255
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    const-string v0, "root_in_me"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 256
    const-string v0, "root_in_me"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 258
    :cond_1
    sget-object v7, Lo/acl$a;->b:Lo/acl$a;

    .line 260
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    const-string v0, "kind"

    :try_start_0
    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 261
    const-string v0, "kind"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 262
    invoke-static {v8}, Lo/acl$a;->valueOf(Ljava/lang/String;)Lo/acl$a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v7, v0

    .line 267
    :cond_2
    goto :goto_0

    .line 264
    :catch_0
    move-exception v8

    .line 265
    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity Invalid device kind."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    :goto_0
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 269
    sget-object v0, Lo/agx;->b:Ljava/lang/String;

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 270
    sget-object v0, Lo/agx;->d:Ljava/lang/String;

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    sget-object v0, Lo/agx;->a:Ljava/lang/String;

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    invoke-static {v8}, Lo/afc;->b(Ljava/util/ArrayList;)Z

    .line 274
    const-string v0, "ListDevice"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 275
    const/4 v0, 0x0

    if-eq v0, v4, :cond_c

    .line 276
    const-string v0, "ZipPath"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 277
    if-eqz v9, :cond_3

    .line 278
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity zipPath is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/DeviceMainActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/DeviceMainActivity$5;-><init>(Lcom/huawei/health/device/ui/DeviceMainActivity;)V

    invoke-virtual {v0, v9, v1}, Lo/afq;->b(Ljava/lang/String;Lo/aff;)V

    .line 287
    :cond_3
    const-string v0, "me"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 288
    invoke-direct {p0, v7, v6}, Lcom/huawei/health/device/ui/DeviceMainActivity;->d(Lo/acl$a;Ljava/lang/String;)V

    goto :goto_1

    .line 291
    :cond_4
    invoke-direct {p0, v7}, Lcom/huawei/health/device/ui/DeviceMainActivity;->d(Lo/acl$a;)V

    .line 293
    :goto_1
    goto/16 :goto_2

    .line 294
    :cond_5
    const-string v0, "MeasureDevice"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 295
    invoke-direct {p0, v7}, Lcom/huawei/health/device/ui/DeviceMainActivity;->e(Lo/acl$a;)V

    goto :goto_2

    .line 296
    :cond_6
    const-string v0, "PickDevice"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 297
    invoke-direct {p0, v7}, Lcom/huawei/health/device/ui/DeviceMainActivity;->c(Lo/acl$a;)V

    goto :goto_2

    .line 298
    :cond_7
    const-string v0, "BondDevice"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 299
    invoke-direct {p0, v7}, Lcom/huawei/health/device/ui/DeviceMainActivity;->b(Lo/acl$a;)V

    goto :goto_2

    .line 300
    :cond_8
    const-string v0, "AutoMeasureDevice"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 301
    invoke-direct {p0, v7, v4}, Lcom/huawei/health/device/ui/DeviceMainActivity;->b(Lo/acl$a;Landroid/content/Intent;)V

    goto :goto_2

    .line 302
    :cond_9
    const-string v0, "WifiVersionDetails"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 303
    invoke-direct {p0, v4}, Lcom/huawei/health/device/ui/DeviceMainActivity;->b(Landroid/content/Intent;)V

    goto :goto_2

    .line 304
    :cond_a
    const-string v0, "WiFiBindDevice"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 305
    invoke-direct {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->g()V

    goto :goto_2

    .line 308
    :cond_b
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity cloud banner setup"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    const/4 v0, 0x0

    if-eq v0, v4, :cond_c

    .line 310
    invoke-direct {p0, v4}, Lcom/huawei/health/device/ui/DeviceMainActivity;->d(Landroid/content/Intent;)V

    .line 313
    :cond_c
    :goto_2
    return-void
.end method

.method public d(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/hihealth/device/open/HealthDevice;>;)V"
        }
    .end annotation

    .line 780
    iput-object p1, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->n:Ljava/util/ArrayList;

    .line 781
    return-void
.end method

.method public e()Landroid/os/Bundle;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->e:Landroid/os/Bundle;

    return-object v0
.end method

.method public e(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;)V"
        }
    .end annotation

    .line 184
    iput-object p1, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->h:Ljava/lang/Class;

    .line 185
    return-void
.end method

.method public e(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/acl;>;)V"
        }
    .end annotation

    .line 774
    iput-object p1, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->p:Ljava/util/ArrayList;

    .line 775
    return-void
.end method

.method public onBackPressed()V
    .locals 4

    .line 239
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity onBackPressed called"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->a:Lcom/huawei/health/device/ui/BaseFragment;

    if-eqz v0, :cond_0

    .line 241
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity fragment name is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->a:Lcom/huawei/health/device/ui/BaseFragment;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->a:Lcom/huawei/health/device/ui/BaseFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/BaseFragment;->onBackPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 243
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onBackPressed()V

    .line 246
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 80
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 81
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->f:Z

    .line 83
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->c:Lo/ahi$e;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "device_download_dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "single_device_download_dialog"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    invoke-static {v0, v2, v1}, Lo/ahi;->d(Lo/ahi$e;I[Ljava/lang/String;)V

    .line 85
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 86
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 87
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->e:Landroid/os/Bundle;

    const-string v1, "bloodSugarMeasureType"

    const-string v2, "bloodsugar_timeperiod_key"

    const/4 v3, 0x0

    invoke-virtual {v4, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 88
    const-string v0, "bloodsugar_timeperiod_key_string"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 89
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->e:Landroid/os/Bundle;

    const-string v1, "bloodSugarMeasureTypeString"

    const-string v2, "bloodsugar_timeperiod_key_string"

    invoke-virtual {v4, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    :cond_0
    const-string v0, "type"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->k:I

    .line 93
    const-string v0, "isFromDiscover"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate isFromDiscover."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->e:Landroid/os/Bundle;

    const-string v1, "isFromDiscover"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0

    .line 97
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->e:Landroid/os/Bundle;

    const-string v1, "isFromDiscover"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 99
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->e:Landroid/os/Bundle;

    const-string v1, "isHeartRateDevice"

    const-string v2, "isHeartRateDevice"

    const/4 v3, 0x0

    invoke-virtual {v4, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 100
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->e:Landroid/os/Bundle;

    const-string v1, "isFromFitnessAdvice"

    const-string v2, "isFromFitnessAdvice"

    const/4 v3, 0x0

    invoke-virtual {v4, v2, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 101
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->e:Landroid/os/Bundle;

    const-string v1, "title"

    const-string v2, "title"

    invoke-virtual {v4, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    :cond_2
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_main_activity:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->setContentView(I)V

    .line 106
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->setRequestedOrientation(I)V

    .line 108
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->d()V

    .line 109
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0}, Lo/afq;->b()V

    .line 110
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 232
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity onDestroy."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 234
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->c:Lo/ahi$e;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "device_download_dialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "single_device_download_dialog"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ahi;->a(Lo/ahi$e;[Ljava/lang/String;)V

    .line 235
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    .line 722
    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    .line 723
    array-length v0, p3

    if-lez v0, :cond_0

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_0

    .line 724
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->m:Lcom/huawei/health/device/ui/BaseFragment;

    if-eqz v0, :cond_0

    .line 725
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->i:Lcom/huawei/health/device/ui/BaseFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->m:Lcom/huawei/health/device/ui/BaseFragment;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->a(Lcom/huawei/health/device/ui/BaseFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 728
    :cond_0
    const/4 v4, 0x0

    :goto_0
    array-length v0, p2

    if-ge v4, v0, :cond_2

    .line 729
    const-string v0, "android.permission.RECORD_AUDIO"

    aget-object v1, p2, v4

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 730
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->a:Lcom/huawei/health/device/ui/BaseFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 731
    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->a:Lcom/huawei/health/device/ui/BaseFragment;

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    goto :goto_1

    .line 728
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 738
    :cond_2
    :goto_1
    if-nez p1, :cond_4

    .line 739
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainactivity 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 740
    array-length v0, p3

    if-lez v0, :cond_3

    const/4 v0, 0x0

    aget v0, p3, v0

    if-nez v0, :cond_3

    .line 741
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainactivity 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 743
    :cond_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainactivity 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 744
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->finish()V

    .line 747
    :cond_4
    :goto_2
    return-void
.end method

.method protected onRestart()V
    .locals 4

    .line 195
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity onRestart."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onRestart()V

    .line 197
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 201
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity onResume."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 205
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity activityState is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->b:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->d:Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 207
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceMainActivity mClass is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->d:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->d:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/FragmentManager;->popBackStack(Ljava/lang/String;I)V

    .line 210
    :cond_0
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .line 220
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 221
    return-void
.end method

.method public onStop()V
    .locals 4

    .line 225
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMainActivity onStop."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStop()V

    .line 227
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/DeviceMainActivity;->b:Z

    .line 228
    return-void
.end method
