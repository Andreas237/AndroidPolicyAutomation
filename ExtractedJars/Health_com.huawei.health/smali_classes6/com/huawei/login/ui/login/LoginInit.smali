.class public Lcom/huawei/login/ui/login/LoginInit;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ACTION_RECEIVE_A_LOGOUT:Ljava/lang/String; = "com.huawei.RECEIVE_A_LOGOUT"

.field private static final ACTION_START_MAIN_PROCESS_FOR_SP_DB:Ljava/lang/String; = "start_main_process_for_sp_db"

.field private static final CLEAN_ACTIVITY:Ljava/lang/String; = "com.huawei.commonui.CLEAN_ACTIVITY"

.field private static final DEVICE_TYPE_IS_IMEI:Ljava/lang/String; = "0"

.field private static final DEVICE_TYPE_IS_UNKNOWN:Ljava/lang/String; = "-1"

.field private static final ST_SP_TO_DB:Ljava/lang/String; = "st_sp_to_db"

.field private static final TAG:Ljava/lang/String; = "PLGLOGIN_LoginInit"

.field private static final loginByHWid:I = 0x4

.field private static final loginByHealthHWid:I = 0x5

.field private static final loginByKidWatchTimeOut:I = 0x6

.field private static final loginByVersinOne:I = 0x1

.field private static final loginByVersionTwo:I = 0x2

.field private static final loginByWear:I = 0x3

.field private static mContext:Landroid/content/Context; = null

.field private static mLogin:Lcom/huawei/login/ui/login/LoginInit; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/login/ui/login/LoginInit;->mLogin:Lcom/huawei/login/ui/login/LoginInit;

    .line 38
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Landroid/content/Context;
    .locals 1

    .line 35
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/login/ui/login/LoginInit;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/huawei/login/ui/login/LoginInit;->notifyWearSTTimeOut()V

    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;
    .locals 2

    .line 75
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 76
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    .line 79
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mLogin:Lcom/huawei/login/ui/login/LoginInit;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 80
    new-instance v0, Lcom/huawei/login/ui/login/LoginInit;

    invoke-direct {v0}, Lcom/huawei/login/ui/login/LoginInit;-><init>()V

    sput-object v0, Lcom/huawei/login/ui/login/LoginInit;->mLogin:Lcom/huawei/login/ui/login/LoginInit;

    .line 82
    :cond_1
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mLogin:Lcom/huawei/login/ui/login/LoginInit;

    return-object v0
.end method

.method private notifyWearSTTimeOut()V
    .locals 5

    .line 451
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyWearSTTimeOut()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 453
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->isLoginedByWear()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 456
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send broadcast to wear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.RECEIVE_A_LOGOUT"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 458
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 460
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/vd;->e(Landroid/content/Context;)Lo/vd;

    move-result-object v0

    invoke-virtual {v0}, Lo/vd;->e()V

    .line 461
    goto :goto_0

    .line 462
    :cond_1
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is not logined by wear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    :goto_0
    return-void
.end method

.method private startMainProcess()V
    .locals 6

    .line 535
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 536
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 537
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.receiver.MainProcessHelperService"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 539
    const-string v0, "start_main_process_for_sp_db"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 540
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v5

    .line 541
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMainProcess "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    if-eqz v5, :cond_0

    .line 543
    invoke-virtual {v5, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 545
    :cond_0
    return-void
.end method


# virtual methods
.method public cleanLoginData()V
    .locals 5

    .line 306
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter cleanLoginData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 309
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StoreDemo no clearlogin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    return-void

    .line 313
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    const-string v1, ""

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setHuaweiAccountLoginFlag(Ljava/lang/String;Lo/dcx;)V

    .line 314
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setAccessToken(Ljava/lang/String;Lo/dcx;)V

    .line 315
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setSeverToken(Ljava/lang/String;Lo/dcx;)V

    .line 316
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setIsLogined(Z)V

    .line 317
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "server_token"

    const-string v2, ""

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 318
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 319
    const/16 v1, 0x2720

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_first_login"

    const-string v3, "true"

    .line 318
    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 321
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/LoginCache;->configServerToken(Ljava/lang/String;)V

    .line 322
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/LoginCache;->configAccessToken(Ljava/lang/String;)V

    .line 324
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "hw_health_show_grant_pwd"

    .line 325
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 324
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 327
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/login/ui/login/LoginInit;->setAccountType(Ljava/lang/String;)V

    .line 328
    return-void
.end method

.method public clearToken()V
    .locals 4

    .line 473
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter clearToken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 474
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 475
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 476
    return-void

    .line 479
    :cond_0
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 480
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "store no clearToken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    return-void

    .line 484
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/login/ui/login/LoginInit$3;

    invoke-direct {v1, p0}, Lcom/huawei/login/ui/login/LoginInit$3;-><init>(Lcom/huawei/login/ui/login/LoginInit;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 494
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 495
    return-void
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 2

    .line 238
    invoke-static {}, Lcom/huawei/login/ui/login/util/LoginCache;->fetchAccessToken()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 239
    invoke-static {}, Lcom/huawei/login/ui/login/util/LoginCache;->fetchAccessToken()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 241
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAccessToken(Lo/dcx;)V
    .locals 3

    .line 262
    invoke-static {}, Lcom/huawei/login/ui/login/util/LoginCache;->fetchAccessToken()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 263
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 264
    new-instance v0, Lo/ddb;

    invoke-static {}, Lcom/huawei/login/ui/login/util/LoginCache;->fetchAccessToken()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lo/ddb;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, v0}, Lo/dcx;->onProcessed(Lo/ddb;)V

    goto :goto_0

    .line 267
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getAccessToken(Lo/dcx;)V

    .line 269
    :cond_1
    :goto_0
    return-void
.end method

.method public getAccountType()Ljava/lang/String;
    .locals 1

    .line 587
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getAccountType()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCountryCode(Lo/dcx;)Ljava/lang/String;
    .locals 6

    .line 210
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/ContentProviderUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->getCountryCode()Ljava/lang/String;

    move-result-object v4

    .line 211
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 213
    const/16 v1, 0x4e20

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "country_code"

    .line 212
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 215
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "codeFromSp = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/ContentProviderUtil;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->setServiceCountryCode(Ljava/lang/String;Lo/dcx;)V

    .line 218
    return-object v5

    .line 220
    :cond_0
    return-object v4
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 1

    .line 604
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->H(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceType()Ljava/lang/String;
    .locals 3

    .line 626
    invoke-static {}, Lcom/huawei/login/ui/login/util/LoginCache;->fetchDeviceType()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 627
    invoke-static {}, Lcom/huawei/login/ui/login/util/LoginCache;->fetchDeviceType()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 630
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/ContentProviderUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->getDeviceType()Ljava/lang/String;

    move-result-object v2

    .line 631
    const/4 v0, 0x0

    if-eq v0, v2, :cond_1

    .line 632
    return-object v2

    .line 635
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 636
    const-string v0, "0"

    return-object v0

    .line 638
    :cond_2
    const-string v0, "-1"

    return-object v0
.end method

.method public getHealthLoginChannel()I
    .locals 4

    .line 141
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 142
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BaseApplication.getContext() is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    const/4 v0, -0x1

    return v0

    .line 145
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getHealthLoginChannel()I

    move-result v0

    return v0
.end method

.method public getIsLogined()Z
    .locals 4

    .line 176
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 177
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BaseApplication.getContext() is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    const/4 v0, 0x0

    return v0

    .line 180
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getIsLogined()Z

    move-result v0

    return v0
.end method

.method public getLoginByHWid()I
    .locals 1

    .line 62
    const/4 v0, 0x4

    return v0
.end method

.method public getLoginByVersinOne()I
    .locals 1

    .line 66
    const/4 v0, 0x1

    return v0
.end method

.method public getLoginByVersionTwo()I
    .locals 1

    .line 70
    const/4 v0, 0x2

    return v0
.end method

.method public getLoginByWear()I
    .locals 1

    .line 58
    const/4 v0, 0x3

    return v0
.end method

.method public getLoginType()I
    .locals 4

    .line 133
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 134
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BaseApplication.getContext() is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    const/4 v0, -0x1

    return v0

    .line 137
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getLoginType()I

    move-result v0

    return v0
.end method

.method public getServiceCountryCode(Lo/dcx;)Ljava/lang/String;
    .locals 1

    .line 230
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/ContentProviderUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->getServiceCountryCode()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSeverToken()Ljava/lang/String;
    .locals 2

    .line 250
    invoke-static {}, Lcom/huawei/login/ui/login/util/LoginCache;->fetchServerToken()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 251
    invoke-static {}, Lcom/huawei/login/ui/login/util/LoginCache;->fetchServerToken()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 253
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getSeverToken()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSeverToken(Lo/dcx;)V
    .locals 3

    .line 276
    invoke-static {}, Lcom/huawei/login/ui/login/util/LoginCache;->fetchServerToken()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 277
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 278
    new-instance v0, Lo/ddb;

    invoke-static {}, Lcom/huawei/login/ui/login/util/LoginCache;->fetchServerToken()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lo/ddb;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, v0}, Lo/dcx;->onProcessed(Lo/ddb;)V

    goto :goto_0

    .line 281
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getSeverToken(Lo/dcx;)V

    .line 283
    :cond_1
    :goto_0
    return-void
.end method

.method public getSiteId()I
    .locals 1

    .line 195
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getSiteID()I

    move-result v0

    return v0
.end method

.method public getUserName()Ljava/lang/String;
    .locals 2

    .line 562
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_user_name"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUserPicPath()Ljava/lang/String;
    .locals 2

    .line 578
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_user_pic_path"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUsetId()Ljava/lang/String;
    .locals 5

    .line 157
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 158
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    const-string v0, ""

    return-object v0

    .line 161
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getUserID()Ljava/lang/String;

    move-result-object v4

    .line 162
    return-object v4
.end method

.method public hmsHasLoginedLogin(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V
    .locals 5

    .line 108
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter login activityContext"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 110
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login() activityContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    return-void

    .line 113
    :cond_0
    new-instance v4, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-direct {v4, p1, p2}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;-><init>(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V

    .line 114
    invoke-virtual {v4}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->hmsHasLoginedLogin()V

    .line 115
    return-void
.end method

.method public initailLogin(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V
    .locals 5

    .line 123
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter initailLogin activityContext"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 125
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initailLogin() activityContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    return-void

    .line 128
    :cond_0
    new-instance v4, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-direct {v4, p1, p2}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;-><init>(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V

    .line 129
    invoke-virtual {v4}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->initailLogin()V

    .line 130
    return-void
.end method

.method public isLoginedByWear()Z
    .locals 7

    .line 502
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getHealthLoginChannel()I

    move-result v4

    .line 503
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "health_login_channel"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 504
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHealthLoginChannel: in sp = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",typeFromDb = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 505
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 507
    :try_start_0
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 510
    goto :goto_0

    .line 508
    :catch_0
    move-exception v6

    .line 509
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isLoginedByWear NumberFormatException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    :cond_0
    :goto_0
    const/4 v0, 0x3

    if-ne v4, v0, :cond_1

    .line 513
    const/4 v0, 0x1

    return v0

    .line 515
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public isTokenInValidFlag()Z
    .locals 5

    .line 647
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "cloud_st_invalid_flag"

    new-instance v2, Lo/dcy;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lo/dcy;-><init>(I)V

    .line 648
    invoke-virtual {v0, v1, v2}, Lo/dcn;->a(Ljava/lang/String;Lo/dcy;)Ljava/lang/String;

    move-result-object v4

    .line 649
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is token invalid flag:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 650
    if-nez v4, :cond_0

    .line 651
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is token invalid flag null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 652
    const/4 v0, 0x0

    return v0

    .line 654
    :cond_0
    const-string v0, "0"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 655
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is token invalid flag = true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 656
    const/4 v0, 0x0

    return v0

    .line 658
    :cond_1
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is token invalid flag = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 659
    const/4 v0, 0x1

    return v0
.end method

.method public login(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V
    .locals 5

    .line 87
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter login activityContext"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 89
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login() activityContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    return-void

    .line 92
    :cond_0
    new-instance v4, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-direct {v4, p1, p2}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;-><init>(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V

    .line 93
    invoke-virtual {v4}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->login()V

    .line 94
    return-void
.end method

.method public logout()V
    .locals 4

    .line 338
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter logout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 340
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 341
    return-void

    .line 343
    :cond_0
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 344
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "store no logout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    return-void

    .line 347
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/login/ui/login/LoginInit$1;

    invoke-direct {v1, p0}, Lcom/huawei/login/ui/login/LoginInit$1;-><init>(Lcom/huawei/login/ui/login/LoginInit;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 386
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 387
    return-void
.end method

.method public logoutWhenStTimeout(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 393
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter logoutWhenStTimeout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 395
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 397
    const-string v0, ""

    const/4 v1, -0x1

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 399
    :cond_0
    return-void

    .line 401
    :cond_1
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 402
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "store no st timeout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 404
    const-string v0, ""

    const/4 v1, -0x1

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 406
    :cond_2
    return-void

    .line 408
    :cond_3
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/login/ui/login/LoginInit$2;

    invoke-direct {v1, p0, p1}, Lcom/huawei/login/ui/login/LoginInit$2;-><init>(Lcom/huawei/login/ui/login/LoginInit;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 446
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 447
    return-void
.end method

.method public moveInfoFromSPTODB()V
    .locals 5

    .line 523
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "st_sp_to_db"

    invoke-virtual {v0, v1}, Lo/dcn;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 524
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveInfoFromSPTODB isMove = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 525
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 526
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "moveInfoFromSPTODB ismove is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 527
    invoke-direct {p0}, Lcom/huawei/login/ui/login/LoginInit;->startMainProcess()V

    .line 529
    :cond_0
    return-void
.end method

.method public notAuthLogin(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V
    .locals 5

    .line 97
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter login activityContext notAuth "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 99
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login() activityContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    return-void

    .line 102
    :cond_0
    new-instance v4, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;

    invoke-direct {v4, p1, p2}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;-><init>(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V

    .line 103
    invoke-virtual {v4}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->notAuthLogin()V

    .line 104
    return-void
.end method

.method public setAccessToken(Ljava/lang/String;)V
    .locals 1

    .line 291
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/huawei/login/ui/login/LoginInit;->setAccessToken(Ljava/lang/String;Lo/dcx;)V

    .line 292
    return-void
.end method

.method public setAccessToken(Ljava/lang/String;Lo/dcx;)V
    .locals 1

    .line 286
    invoke-static {p1}, Lcom/huawei/login/ui/login/util/LoginCache;->configAccessToken(Ljava/lang/String;)V

    .line 287
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setAccessToken(Ljava/lang/String;Lo/dcx;)V

    .line 288
    return-void
.end method

.method public setAccountType(Ljava/lang/String;)V
    .locals 1

    .line 595
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setAccountType(Ljava/lang/String;)V

    .line 596
    return-void
.end method

.method public setHealthLoginChannel(I)V
    .locals 4

    .line 149
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 150
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    return-void

    .line 153
    :cond_0
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setHealthLoginChannel(I)V

    .line 154
    return-void
.end method

.method public setIsLogined(Z)V
    .locals 4

    .line 184
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 185
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BaseApplication.getContext() is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    return-void

    .line 188
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setIsLogined(Z)V

    .line 189
    return-void
.end method

.method public setSeverToken(Ljava/lang/String;)V
    .locals 1

    .line 299
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/huawei/login/ui/login/LoginInit;->setSeverToken(Ljava/lang/String;Lo/dcx;)V

    .line 300
    return-void
.end method

.method public setSeverToken(Ljava/lang/String;Lo/dcx;)V
    .locals 1

    .line 294
    invoke-static {p1}, Lcom/huawei/login/ui/login/util/LoginCache;->configServerToken(Ljava/lang/String;)V

    .line 295
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setSeverToken(Ljava/lang/String;Lo/dcx;)V

    .line 296
    return-void
.end method

.method public setSiteId(I)V
    .locals 2

    .line 199
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setSiteID(ILo/dcx;)V

    .line 200
    return-void
.end method

.method public setSiteId(ILo/dcx;)V
    .locals 1

    .line 203
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setSiteID(ILo/dcx;)V

    .line 204
    return-void
.end method

.method public setUserName(Ljava/lang/String;Lo/dcx;)V
    .locals 2

    .line 554
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_user_name"

    invoke-virtual {v0, v1, p1, p2}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 555
    return-void
.end method

.method public setUserPicPath(Ljava/lang/String;Lo/dcx;)V
    .locals 2

    .line 570
    sget-object v0, Lcom/huawei/login/ui/login/LoginInit;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_user_pic_path"

    invoke-virtual {v0, v1, p1, p2}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 571
    return-void
.end method

.method public setUsetId(Ljava/lang/String;)V
    .locals 4

    .line 166
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 167
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mContext is null !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    return-void

    .line 170
    :cond_0
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUsetId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    const-string v0, "PLGLOGIN_LoginInit"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUsetId is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setUserID(Ljava/lang/String;)V

    .line 173
    return-void
.end method
