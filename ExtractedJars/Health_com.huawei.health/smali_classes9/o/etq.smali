.class public Lo/etq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/etq;

.field private static e:Lo/dde;


# instance fields
.field private b:Lo/egv;

.field private d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    const/4 v0, 0x0

    sput-object v0, Lo/etq;->c:Lo/etq;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lo/etq;->d:Landroid/content/Context;

    .line 58
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 6

    .line 278
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter qstnSurveyActivate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 280
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "qstnSurveyActivate activityContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    :cond_0
    invoke-static {}, Lo/dgk;->d()Z

    move-result v4

    .line 283
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=========qstnSurveyInit-->\u6ca1\u6709\u9009\u4e2d\u7528\u6237\u4f53\u9a8c\u6539\u8fdb\u8ba1\u5212\uff0cisCheckHi"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "=========qstnSurveyInit-->\u662f\u5426\u6d77\u5916\uff0cUtils.isOversea()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/czu;->e()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    if-nez v4, :cond_1

    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 286
    return-void

    .line 290
    :cond_1
    iget-object v0, p0, Lo/etq;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 291
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "testnps, qstnSurveyActivate qstnSurvey.activatedQstnSurvey"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 292
    iget-object v0, p0, Lo/etq;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    move-result-object v5

    .line 293
    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->activatedQstnSurvey()V

    .line 294
    goto :goto_0

    .line 295
    :cond_2
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "testnps, Network is disabled"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    :goto_0
    return-void
.end method

.method private b(Landroid/content/Intent;Landroid/content/Context;)V
    .locals 5

    .line 429
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enter showAppStoreDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p2}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_device_replace_dialog_title_notification:I

    .line 431
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_main_sns_app_store_content:I

    .line 432
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lo/etq$2;

    invoke-direct {v2, p0, p1, p2}, Lo/etq$2;-><init>(Lo/etq;Landroid/content/Intent;Landroid/content/Context;)V

    .line 433
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lo/etq$1;

    invoke-direct {v2, p0}, Lo/etq$1;-><init>(Lo/etq;)V

    .line 449
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v4

    .line 457
    invoke-virtual {v4}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lo/etq;->b:Lo/egv;

    .line 458
    iget-object v0, p0, Lo/etq;->b:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 459
    iget-object v0, p0, Lo/etq;->b:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 460
    return-void
.end method

.method private c(Ljava/lang/String;)Landroid/content/Intent;
    .locals 5

    .line 395
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter createViewIntent():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 398
    const v0, 0x10008000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 399
    return-object v4
.end method

.method static synthetic d(Lo/etq;)Lo/egv;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/etq;->b:Lo/egv;

    return-object v0
.end method

.method public static d()Lo/etq;
    .locals 2

    .line 62
    sget-object v0, Lo/etq;->c:Lo/etq;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 63
    new-instance v0, Lo/etq;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/etq;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/etq;->c:Lo/etq;

    .line 65
    :cond_0
    sget-object v0, Lo/etq;->e:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 66
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    sput-object v0, Lo/etq;->e:Lo/dde;

    .line 68
    :cond_1
    sget-object v0, Lo/etq;->c:Lo/etq;

    return-object v0
.end method

.method private e(Landroid/content/Intent;)Z
    .locals 5

    .line 409
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enter openOemAppstore()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 411
    iget-object v0, p0, Lo/etq;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/high16 v1, 0x10000

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 413
    :try_start_0
    iget-object v0, p0, Lo/etq;->d:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 414
    const/4 v0, 0x1

    return v0

    .line 415
    :catch_0
    move-exception v4

    .line 416
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception localActivityNotFoundException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()I
    .locals 2

    .line 77
    sget-object v0, Lo/etq;->e:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    .line 78
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 79
    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    return v0

    .line 81
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public a(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 2

    .line 108
    sget-object v0, Lo/etq;->e:Lo/dde;

    invoke-virtual {v0, p1}, Lo/dde;->b(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    .line 109
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 110
    return-object v1

    .line 112
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 181
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 182
    return-void

    .line 185
    :cond_0
    sget-object v0, Lo/etq;->e:Lo/dde;

    invoke-virtual {v0, p1}, Lo/dde;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 186
    return-void
.end method

.method public b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 2

    .line 91
    sget-object v0, Lo/etq;->e:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    .line 92
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 93
    return-object v1

    .line 95
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(Lo/egg;)V
    .locals 5

    .line 307
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter refreshAllCardsData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    iget-object v0, p0, Lo/etq;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dez;->c(Landroid/content/Context;)Lo/dez;

    move-result-object v4

    .line 309
    if-nez v4, :cond_0

    .line 310
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshAllCardsData hwFitnessMgr is null return!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    return-void

    .line 314
    :cond_0
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshAllCardsData syncFitnessDetailData!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    new-instance v0, Lo/etq$3;

    invoke-direct {v0, p0, p1}, Lo/etq$3;-><init>(Lo/etq;Lo/egg;)V

    invoke-virtual {v4, v0}, Lo/dez;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 326
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave refreshAllCardsData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 327
    return-void
.end method

.method public c(I)I
    .locals 6

    .line 356
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter getIdImage \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    sget v4, Lcom/huawei/ui/homewear21/R$mipmap;->img_huawei_b3:I

    .line 358
    invoke-static {p1}, Lo/dda;->e(I)Lo/ddc;

    move-result-object v5

    .line 359
    invoke-virtual {v5}, Lo/ddc;->e()I

    move-result v0

    if-eqz v0, :cond_0

    .line 360
    invoke-virtual {v5}, Lo/ddc;->e()I

    move-result v4

    .line 362
    :cond_0
    return v4
.end method

.method public c(Landroid/content/Context;)V
    .locals 5

    .line 377
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter enterHuaweiAppStore():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 380
    iget-object v0, p0, Lo/etq;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 381
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Error about network,Network is not Connected!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    sget v0, Lcom/huawei/ui/homewear21/R$string;->IDS_confirm_network_whether_connected:I

    invoke-static {p1, v0}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 383
    return-void

    .line 385
    :cond_0
    const-string v0, "https://a.vmall.com/exmarket?id=4026633"

    invoke-direct {p0, v0}, Lo/etq;->c(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "com.huawei.appmarket"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/etq;->e(Landroid/content/Intent;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 386
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isInstallFlag ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 388
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 389
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isInstallFlag = false,\u5f39\u6846\u63d0\u793a\u7528\u6237\u4e0b\u8f7d\u534e\u4e3a\u5e94\u7528\u5e02\u573a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    const-string v0, "https://a.vmall.com/exmarket?id=4026633"

    invoke-direct {p0, v0}, Lo/etq;->c(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "com.huawei.appmarket"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lo/etq;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 392
    :cond_1
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)V"
        }
    .end annotation

    .line 217
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUsedDeviceList "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    sget-object v0, Lo/etq;->e:Lo/dde;

    invoke-virtual {v0, p1}, Lo/dde;->d(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 224
    goto :goto_0

    .line 219
    :catch_0
    move-exception v4

    .line 220
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 225
    :goto_0
    return-void
.end method

.method public c(Z)V
    .locals 5

    .line 252
    :try_start_0
    sget-object v0, Lo/etq;->e:Lo/dde;

    invoke-virtual {v0, p1}, Lo/dde;->a(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 256
    goto :goto_0

    .line 253
    :catch_0
    move-exception v4

    .line 254
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openSystemBluetoothSwitch RemoteException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 257
    :goto_0
    return-void
.end method

.method public c()Z
    .locals 9

    .line 122
    const/4 v4, 0x0

    .line 123
    invoke-virtual {p0}, Lo/etq;->i()Ljava/util/List;

    move-result-object v5

    .line 124
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 125
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 126
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkEnableDevice info "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    goto :goto_0

    .line 128
    :cond_0
    invoke-virtual {p0}, Lo/etq;->e()Ljava/util/List;

    move-result-object v6

    .line 129
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 130
    :cond_1
    const/4 v4, 0x1

    .line 131
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 132
    invoke-virtual {p0, v5}, Lo/etq;->c(Ljava/util/List;)V

    goto :goto_2

    .line 134
    :cond_2
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 135
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkEnableDevice info device "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    goto :goto_1

    .line 139
    :cond_3
    :goto_2
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkEnableDevices res:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    return v4
.end method

.method public d(Landroid/content/Context;)V
    .locals 4

    .line 264
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "nps startNps qstnSurveyActivate###"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    invoke-direct {p0, p1}, Lo/etq;->a(Landroid/content/Context;)V

    .line 272
    return-void
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation

    .line 100
    sget-object v0, Lo/etq;->e:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->i()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public f()I
    .locals 2

    .line 148
    sget-object v0, Lo/etq;->e:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    .line 149
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 150
    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    return v0

    .line 152
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public g()Z
    .locals 6

    .line 233
    const/4 v4, 0x0

    .line 236
    :try_start_0
    sget-object v0, Lo/etq;->e:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->p()Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 240
    goto :goto_0

    .line 237
    :catch_0
    move-exception v5

    .line 238
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getSystemBluetoothSwitchState RemoteException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 242
    :goto_0
    return v4
.end method

.method public h()Ljava/lang/String;
    .locals 6

    .line 162
    const-string v4, ""

    .line 163
    sget-object v0, Lo/etq;->e:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 164
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 165
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentDeviceName deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    const-string v4, ""

    goto :goto_0

    .line 168
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v4

    .line 171
    :goto_0
    return-object v4
.end method

.method public i()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation

    .line 194
    const/4 v4, 0x0

    .line 196
    :try_start_0
    sget-object v0, Lo/etq;->e:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->c()Ljava/util/List;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 202
    goto :goto_0

    .line 197
    :catch_0
    move-exception v5

    .line 198
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 200
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->d(Landroid/content/Context;)V

    .line 203
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 204
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUsedDeviceList null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 207
    :cond_0
    return-object v4
.end method

.method public k()V
    .locals 4

    .line 493
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter dataSync()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 494
    new-instance v0, Lo/etq$5;

    invoke-direct {v0, p0}, Lo/etq$5;-><init>(Lo/etq;)V

    invoke-virtual {p0, v0}, Lo/etq;->b(Lo/egg;)V

    .line 504
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Leave dataSync()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 505
    return-void
.end method
