.class public Lcom/huawei/login/huaweilogin/HuaweiLoginManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/login/huaweilogin/HuaweiLoginManager$NotAidlLoginHandler;,
        Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;
    }
.end annotation


# static fields
.field public static final HWID_KEY_VERSION_CODE_254302:I = 0x138deee

.field private static final SUCCESS:I = 0x0

.field private static final TAG:Ljava/lang/String; = "PLGLOGIN_HuaweiLoginManager"

.field private static executorService:Ljava/util/concurrent/ExecutorService; = null

.field private static hasLogin:Z = false

.field private static lastSiteid:I = 0x0

.field private static mAccount:Lcom/huawei/cloudservice/CloudAccount; = null


# instance fields
.field private mContext:Landroid/content/Context;

.field private mLoginCallback:Lcom/huawei/login/ui/login/util/ILoginCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 68
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mAccount:Lcom/huawei/cloudservice/CloudAccount;

    .line 72
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 300
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->hasLogin:Z

    .line 660
    const/16 v0, -0x7b

    sput v0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->lastSiteid:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mLoginCallback:Lcom/huawei/login/ui/login/util/ILoginCallback;

    .line 90
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    .line 91
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/huawei/login/ui/login/util/ILoginCallback;)V
    .locals 1

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mLoginCallback:Lcom/huawei/login/ui/login/util/ILoginCallback;

    .line 85
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    .line 86
    iput-object p2, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mLoginCallback:Lcom/huawei/login/ui/login/util/ILoginCallback;

    .line 87
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;I)V
    .locals 0

    .line 62
    invoke-direct {p0, p1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->loginFaile(I)V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)Landroid/content/Context;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 0

    .line 62
    invoke-direct {p0, p1, p2}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->aidlLogin(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)Lcom/huawei/login/ui/login/util/ILoginCallback;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mLoginCallback:Lcom/huawei/login/ui/login/util/ILoginCallback;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->loginSuccess()V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 0

    .line 62
    invoke-direct {p0, p1, p2}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->notAidlLogin(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    return-void
.end method

.method static synthetic access$600()I
    .locals 1

    .line 62
    sget v0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->lastSiteid:I

    return v0
.end method

.method static synthetic access$602(I)I
    .locals 0

    .line 62
    sput p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->lastSiteid:I

    return p0
.end method

.method private aidlLogin(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 5

    .line 502
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "aidlLogin enter:needAuth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 504
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 505
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StoreDemo no aidllogin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 506
    return-void

    .line 509
    :cond_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 510
    const-string v0, "loginChannel"

    const v1, 0x280de80

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 511
    const-string v0, "reqClientType"

    const/16 v1, 0x2a

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 512
    const-string v0, "AIDL"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 513
    const-string v0, "needAuth"

    invoke-virtual {v4, v0, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 514
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;

    invoke-direct {v2, p0, p1, p2}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$AidlLoginHandler;-><init>(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/cloudservice/CloudAccountManager;->getAccountsByType(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V

    .line 515
    return-void
.end method

.method public static checkIsInstallHuaweiAccount(Landroid/content/Context;)Z
    .locals 5

    .line 280
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter checkIsInstallHuaweiAccount"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 281
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 282
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StoreDemo no check hms"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    const/4 v0, 0x1

    return v0

    .line 285
    :cond_0
    const/4 v4, 0x0

    .line 286
    invoke-static {p0}, Lcom/huawei/cloudservice/CloudAccountManager;->checkIsInstallHuaweiAccount(Landroid/content/Context;)Z

    move-result v4

    .line 287
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkIsInstallHuaweiAccount:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    return v4
.end method

.method public static getAccount()Lcom/huawei/cloudservice/CloudAccount;
    .locals 1

    .line 74
    sget-object v0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mAccount:Lcom/huawei/cloudservice/CloudAccount;

    return-object v0
.end method

.method private static getHwIDVersionCode(Landroid/content/Context;)I
    .locals 7

    .line 633
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 635
    const-string v0, "com.huawei.hwid"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v4, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v5

    .line 636
    iget v6, v5, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 637
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHwIDVersionCode versionCode "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 638
    return v6

    .line 640
    :catch_0
    move-exception v5

    .line 641
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getVersionTag NameNotFoundException error :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 644
    goto :goto_0

    .line 642
    :catch_1
    move-exception v5

    .line 643
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getVersionTag Exception error :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 645
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static hasLoginAccount(Landroid/content/Context;)Z
    .locals 7

    .line 309
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter hasLoginAccount():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    invoke-static {p0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->checkIsInstallHuaweiAccount(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 311
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "huid sdk is not exit ,return false."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    const/4 v0, 0x0

    return v0

    .line 315
    :cond_0
    new-instance v4, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {v4, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 316
    sget-object v0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$4;

    invoke-direct {v1, p0, v4}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$4;-><init>(Landroid/content/Context;Ljava/util/concurrent/CountDownLatch;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 354
    const/4 v5, 0x0

    .line 356
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3

    invoke-virtual {v4, v1, v2, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 359
    goto :goto_0

    .line 357
    :catch_0
    move-exception v6

    .line 358
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "InterruptedException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 361
    :goto_0
    if-nez v5, :cond_1

    .line 363
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hasLoginAccount outTime:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setHasLogin(Z)V

    .line 367
    :cond_1
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hasLoginAccount:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->isHasLogin()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->isHasLogin()Z

    move-result v0

    return v0
.end method

.method public static isHasLogin()Z
    .locals 1

    .line 292
    sget-boolean v0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->hasLogin:Z

    return v0
.end method

.method public static isSupportAuthAPPList()Z
    .locals 2

    .line 653
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getHwIDVersionCode(Landroid/content/Context;)I

    move-result v0

    const v1, 0x138deee

    if-gt v1, v0, :cond_0

    .line 654
    const/4 v0, 0x1

    return v0

    .line 656
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private loginFaile(I)V
    .locals 5

    .line 376
    move v4, p1

    .line 377
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loginFaile error, code is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mLoginCallback:Lcom/huawei/login/ui/login/util/ILoginCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 379
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mLoginCallback:Lcom/huawei/login/ui/login/util/ILoginCallback;

    new-instance v1, Lcom/huawei/login/ui/login/util/LoginResult;

    invoke-direct {v1, v4}, Lcom/huawei/login/ui/login/util/LoginResult;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/huawei/login/ui/login/util/ILoginCallback;->onLoginFailed(Ljava/lang/Object;)V

    .line 381
    :cond_0
    return-void
.end method

.method private loginSuccess()V
    .locals 11

    .line 384
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter loginSuccess():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    new-instance v6, Lcom/huawei/login/ui/login/util/LoginInfoData;

    invoke-direct {v6}, Lcom/huawei/login/ui/login/util/LoginInfoData;-><init>()V

    .line 388
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/cloudservice/CloudAccount;->getUserId()Ljava/lang/String;

    move-result-object v7

    .line 389
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getUserID()Ljava/lang/String;

    move-result-object v8

    .line 390
    invoke-static {v7, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 391
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dhu;->b(Landroid/content/Context;)V

    .line 394
    :cond_0
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/cloudservice/CloudAccount;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/login/ui/login/util/LoginInfoData;->configStrUserId(Ljava/lang/String;)V

    .line 395
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/cloudservice/CloudAccount;->getServiceToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/login/ui/login/util/LoginInfoData;->configStrServiceToken(Ljava/lang/String;)V

    .line 396
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/cloudservice/CloudAccount;->getSiteId()I

    move-result v9

    .line 397
    invoke-virtual {v6, v9}, Lcom/huawei/login/ui/login/util/LoginInfoData;->configSiteId(I)V

    .line 398
    invoke-static {v9}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->updateAppTypeBySiteID(I)V

    .line 399
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/cloudservice/CloudAccount;->getCountryCode()Ljava/lang/String;

    move-result-object v10

    .line 400
    invoke-virtual {v6, v10}, Lcom/huawei/login/ui/login/util/LoginInfoData;->configCountryCode(Ljava/lang/String;)V

    .line 401
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-direct {p0, v0, v10}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->updateLoginTypeByCountry(Landroid/content/Context;Ljava/lang/String;)V

    .line 402
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/cloudservice/CloudAccount;->getAccountName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/login/ui/login/util/LoginInfoData;->configAccoutName(Ljava/lang/String;)V

    .line 403
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/cloudservice/CloudAccount;->getDeviceType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/login/ui/login/util/LoginInfoData;->configDeviceType(Ljava/lang/String;)V

    .line 404
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/cloudservice/CloudAccount;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/login/ui/login/util/LoginInfoData;->configDeviceId(Ljava/lang/String;)V

    .line 405
    invoke-static {}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->getAccount()Lcom/huawei/cloudservice/CloudAccount;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/cloudservice/CloudAccount;->getServiceCountryCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/login/ui/login/util/LoginInfoData;->configServiceCountryCode(Ljava/lang/String;)V

    .line 407
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    const-string v1, "1"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setHuaweiAccountLoginFlag(Ljava/lang/String;Lo/dcx;)V

    .line 408
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    .line 409
    const/16 v1, 0x271f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "if_need_set_account_login_entry"

    const-string v3, "0"

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 408
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 412
    invoke-virtual {p0, v6}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->saveLoginInfo(Lcom/huawei/login/ui/login/util/LoginInfoData;)V

    .line 413
    return-void
.end method

.method private notAidlLogin(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 5

    .line 588
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notAidlLogin enter:isNeedAuth = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 589
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 590
    const-string v0, "loginChannel"

    const v1, 0x280de80

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 591
    const-string v0, "reqClientType"

    const/16 v1, 0x2a

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 592
    const-string v0, "AIDL"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 593
    const-string v0, "needAuth"

    invoke-virtual {v4, v0, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 594
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$NotAidlLoginHandler;

    invoke-direct {v2, p0, p1, p2}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$NotAidlLoginHandler;-><init>(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    invoke-static {v0, v1, v4, v2}, Lcom/huawei/cloudservice/CloudAccountManager;->getAccountsByType(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/huawei/cloudservice/LoginHandler;)V

    .line 595
    return-void
.end method

.method public static setAccount(Lcom/huawei/cloudservice/CloudAccount;)V
    .locals 4

    .line 78
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 79
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setAccount null..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    :cond_0
    sput-object p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mAccount:Lcom/huawei/cloudservice/CloudAccount;

    .line 82
    return-void
.end method

.method public static setCloudVersion(Ljava/lang/String;Lo/dcx;)V
    .locals 4

    .line 715
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Health APP setCloudVersion = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 716
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dcq;->b(Landroid/content/Context;)Lo/dcq;

    move-result-object v0

    const-string v1, "have_cloud_or_not"

    new-instance v2, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$8;

    invoke-direct {v2, p0, p1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$8;-><init>(Ljava/lang/String;Lo/dcx;)V

    invoke-virtual {v0, v1, p0, v2}, Lo/dcq;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 734
    return-void
.end method

.method public static setHasLogin(Z)V
    .locals 0

    .line 296
    sput-boolean p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->hasLogin:Z

    .line 297
    return-void
.end method

.method public static setIsAllowedLoginValueToDB(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 737
    invoke-static {p0}, Lo/dcq;->b(Landroid/content/Context;)Lo/dcq;

    move-result-object v0

    const-string v1, "allow_login_or_not"

    new-instance v2, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$9;

    invoke-direct {v2, p1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$9;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1, v2}, Lo/dcq;->d(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 761
    return-void
.end method

.method public static updateAppTypeBySiteID(I)V
    .locals 6

    .line 666
    const/4 v4, 0x0

    .line 667
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateAppTypeBySiteID_siteId "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 668
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "siteId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 669
    move v5, p0

    .line 670
    const/4 v0, 0x0

    if-eq v0, p0, :cond_2

    .line 671
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateAppTypeBySiteID != DEFAULT_SITE_ID"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 672
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "siteId ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 673
    sget v0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->lastSiteid:I

    if-ne v0, p0, :cond_0

    .line 674
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateAppTypeBySiteID lastSiteid == siteId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 675
    return-void

    .line 677
    :cond_0
    const/4 v0, 0x1

    if-ne v0, p0, :cond_1

    .line 678
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateAppTypeBySiteID:  CHINA_SITE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 679
    const-string v0, "1"

    new-instance v1, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$6;

    invoke-direct {v1, v5}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$6;-><init>(I)V

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setCloudVersion(Ljava/lang/String;Lo/dcx;)V

    goto :goto_0

    .line 692
    :cond_1
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateAppTypeBySiteID: NOT CHINA_SITE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 693
    const-string v0, "0"

    new-instance v1, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$7;

    invoke-direct {v1, v5}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$7;-><init>(I)V

    invoke-static {v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setCloudVersion(Ljava/lang/String;Lo/dcx;)V

    .line 707
    :cond_2
    :goto_0
    return-void
.end method

.method private updateLoginTypeByCountry(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 463
    invoke-static {p1, p2}, Lo/dbf;->c(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 464
    const-string v0, "1"

    invoke-static {p1, v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setIsAllowedLoginValueToDB(Landroid/content/Context;Ljava/lang/String;)V

    .line 465
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateLoginTypeByCountry: isAllowedLogin() true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 467
    :cond_0
    const-string v0, "0"

    invoke-static {p1, v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setIsAllowedLoginValueToDB(Landroid/content/Context;Ljava/lang/String;)V

    .line 468
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateLoginTypeByCountry: isAllowedLogin() false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 470
    :goto_0
    return-void
.end method


# virtual methods
.method public hasGetTokenInActivitys()Z
    .locals 7

    .line 478
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter hasGetTokenInActivitys():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 480
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.hwid.GET_AUTH_TOKEN"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 481
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 482
    const/4 v6, 0x0

    .line 483
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 484
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHwIDStoped packageManager is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    const/4 v0, 0x0

    invoke-virtual {v4, v5, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v6

    .line 487
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 488
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isHwIDStoped resolveInfos is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 489
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 491
    :cond_2
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "action com.huawei.hwid.GET_AUTH_TOKEN in HwID is useless"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 492
    const/4 v0, 0x0

    return v0
.end method

.method public hmsHasLoginedLogin()V
    .locals 4

    .line 230
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hmsHasLoginedLogin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 233
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StoreDemo no haslogin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    return-void

    .line 238
    :cond_0
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->checkIsInstallHuaweiAccount(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->hasGetTokenInActivitys()Z

    move-result v0

    if-nez v0, :cond_1

    .line 239
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hmsHasLoginedLogin isHwIDStoped"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    const v0, 0x186a2

    invoke-direct {p0, v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->loginFaile(I)V

    .line 241
    return-void

    .line 243
    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->aidlLogin(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 244
    return-void
.end method

.method public hmsHasLoginedLoginForHealth(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 250
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hmsHasLoginedLoginForHealth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 253
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StoreDemo no hashmslogin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    const-string v0, ""

    const v1, 0x186a2

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 255
    return-void

    .line 259
    :cond_0
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->checkIsInstallHuaweiAccount(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->hasGetTokenInActivitys()Z

    move-result v0

    if-nez v0, :cond_1

    .line 260
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hmsHasLoginedLoginForHealth hwid is stoped"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    const-string v0, ""

    const v1, 0x186a2

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 262
    return-void

    .line 264
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->aidlLogin(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 265
    return-void
.end method

.method public initailLogin()V
    .locals 5

    .line 193
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initailLogin() sdk initailLogin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StoreDemo no initlogin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    return-void

    .line 200
    :cond_0
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->checkIsInstallHuaweiAccount(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->hasGetTokenInActivitys()Z

    move-result v0

    if-nez v0, :cond_1

    .line 201
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login isHwIDStoped"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    const v0, 0x186a2

    invoke-direct {p0, v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->loginFaile(I)V

    .line 203
    return-void

    .line 205
    :cond_1
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 206
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$3;

    invoke-direct {v1, p0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$3;-><init>(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)V

    invoke-static {v0, v4, v1}, Lcom/huawei/cloudservice/CloudAccountManager;->initial(Landroid/content/Context;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 224
    return-void
.end method

.method public login()V
    .locals 6

    .line 97
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter login:()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StoreDemo no login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    return-void

    .line 105
    :cond_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 106
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->checkIsInstallHuaweiAccount(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 107
    invoke-virtual {p0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->hasGetTokenInActivitys()Z

    move-result v5

    .line 108
    if-nez v5, :cond_1

    .line 109
    const v0, 0x186a2

    invoke-direct {p0, v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->loginFaile(I)V

    .line 110
    return-void

    .line 112
    :cond_1
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login() sdk initial"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$1;

    invoke-direct {v1, p0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$1;-><init>(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)V

    invoke-static {v0, v4, v1}, Lcom/huawei/cloudservice/CloudAccountManager;->initial(Landroid/content/Context;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 138
    goto :goto_0

    .line 139
    :cond_2
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sdk not initial"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    :goto_0
    return-void
.end method

.method public logout()V
    .locals 1

    .line 268
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mLoginCallback:Lcom/huawei/login/ui/login/util/ILoginCallback;

    .line 269
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/cloudservice/CloudAccountManager;->clearAccountData(Landroid/content/Context;)V

    .line 270
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->setAccount(Lcom/huawei/cloudservice/CloudAccount;)V

    .line 271
    return-void
.end method

.method public notAuthLogin()V
    .locals 6

    .line 145
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter notlogin:() notAuth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "StoreDemo no notAulogin"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    return-void

    .line 153
    :cond_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 154
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->checkIsInstallHuaweiAccount(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 155
    invoke-virtual {p0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->hasGetTokenInActivitys()Z

    move-result v5

    .line 156
    if-nez v5, :cond_1

    .line 157
    const v0, 0x186a2

    invoke-direct {p0, v0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->loginFaile(I)V

    .line 158
    return-void

    .line 160
    :cond_1
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "login() sdk initial notAuth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$2;

    invoke-direct {v1, p0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$2;-><init>(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)V

    invoke-static {v0, v4, v1}, Lcom/huawei/cloudservice/CloudAccountManager;->initial(Landroid/content/Context;Landroid/os/Bundle;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    .line 182
    goto :goto_0

    .line 183
    :cond_2
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notAuth sdk not initial"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    :goto_0
    return-void
.end method

.method public release()V
    .locals 1

    .line 372
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mLoginCallback:Lcom/huawei/login/ui/login/util/ILoginCallback;

    .line 373
    return-void
.end method

.method public saveLoginInfo(Lcom/huawei/login/ui/login/util/LoginInfoData;)V
    .locals 4

    .line 416
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter saveLoginInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    const-string v0, "PLGLOGIN_HuaweiLoginManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter saveLoginInfo strServiceToken:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/login/ui/login/util/LoginInfoData;->fetchStrServiceToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/login/ui/login/util/LoginInfoData;->fetchSiteid()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setSiteID(ILo/dcx;)V

    .line 422
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/ContentProviderUtil;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/login/ui/login/util/LoginInfoData;->fetchCountryCode()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->setCountryCode(Ljava/lang/String;Lo/dcx;)V

    .line 424
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/login/ui/login/util/LoginInfoData;->fetchStrUserId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setUserID(Ljava/lang/String;)V

    .line 425
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setLoginType(I)V

    .line 426
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/ContentProviderUtil;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/login/ui/login/util/LoginInfoData;->fetchServiceCountryCode()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->setServiceCountryCode(Ljava/lang/String;Lo/dcx;)V

    .line 427
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/login/ui/login/util/LoginInfoData;->fetchAccoutName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setAccountName(Ljava/lang/String;)V

    .line 429
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/login/ui/login/util/LoginInfoData;->fetchDeviceType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setDeviceType(Ljava/lang/String;)V

    .line 430
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/ContentProviderUtil;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/login/ui/login/util/LoginInfoData;->fetchDeviceType()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->setDeviceType(Ljava/lang/String;Lo/dcx;)V

    .line 431
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/ContentProviderUtil;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/login/ui/login/util/LoginInfoData;->fetchDeviceId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/util/ContentProviderUtil;->setDeviceId(Ljava/lang/String;Lo/dcx;)V

    .line 433
    iget-object v0, p0, Lcom/huawei/login/huaweilogin/HuaweiLoginManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/login/ui/login/util/LoginInfoData;->fetchStrServiceToken()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$5;

    invoke-direct {v2, p0}, Lcom/huawei/login/huaweilogin/HuaweiLoginManager$5;-><init>(Lcom/huawei/login/huaweilogin/HuaweiLoginManager;)V

    invoke-virtual {v0, v1, v2}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->setSeverToken(Ljava/lang/String;Lo/dcx;)V

    .line 459
    return-void
.end method
