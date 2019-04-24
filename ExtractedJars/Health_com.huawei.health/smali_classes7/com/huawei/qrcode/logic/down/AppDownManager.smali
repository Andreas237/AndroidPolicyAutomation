.class public Lcom/huawei/qrcode/logic/down/AppDownManager;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;,
        Lcom/huawei/qrcode/logic/down/AppDownManager$SingletoneHolder;
    }
.end annotation


# static fields
.field private static final INSTALL_FAILED:I = 0x3

.field private static final INSTALL_NORMAL:I = 0x2

.field private static final INSTALL_SILENT:I = 0x1

.field public static final MSG_DOWNLOAD_FAILED:I = 0x3e9

.field public static final MSG_DOWNLOAD_PROGRESS:I = 0x3ea

.field public static final MSG_DOWNLOAD_SIZE:I = 0x3ef

.field public static final MSG_DOWNLOAD_SUCCESS:I = 0x3f1

.field public static final MSG_INSTALL_SILENCE:I = 0x3ed

.field public static final MSG_INSTALL_TYPE_SYSTEM:I = 0x46e

.field public static final MSG_SYSTEM_INSTALL_SUCCESS:I = 0x14d

.field private static volatile mContext:Landroid/content/Context; = null


# instance fields
.field private apkFilePath:Ljava/lang/String;

.field private appInstallReceive:Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;

.field private downloadTaskId:Ljava/lang/String;

.field private installPackageName:Ljava/lang/String;

.field private mEventId:Ljava/lang/String;

.field private qrcodeOperationInfo:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/qrcode/logic/down/AppDownManager$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/AppDownManager;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/qrcode/logic/down/AppDownManager;Landroid/os/Handler;IILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/qrcode/logic/down/AppDownManager;->sendDownMsg(Landroid/os/Handler;IILjava/lang/Object;)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/qrcode/logic/down/AppDownManager;Lcom/huawei/qrcode/logic/down/DownloadEntity;Ljava/lang/String;)Z
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/huawei/qrcode/logic/down/AppDownManager;->dealWithValidate(Lcom/huawei/qrcode/logic/down/DownloadEntity;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$300(Lcom/huawei/qrcode/logic/down/AppDownManager;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->installPackageName:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/qrcode/logic/down/AppDownManager;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->mEventId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$402(Lcom/huawei/qrcode/logic/down/AppDownManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->mEventId:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$500(Lcom/huawei/qrcode/logic/down/AppDownManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/AppDownManager;->jumpToApp()V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/qrcode/logic/down/AppDownManager;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->qrcodeOperationInfo:Ljava/lang/String;

    return-object v0
.end method

.method private dealWithValidate(Lcom/huawei/qrcode/logic/down/DownloadEntity;Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-string v0, "AppDownManager dealWithValidate, but entity is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/qrcode/logic/down/DownloadEntity;->getFilePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Lcom/huawei/qrcode/logic/down/AppDownManager;->isValidateSuccess(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AppDownManager dealWithValidate isValidateOk = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    return v2
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/qrcode/logic/down/AppDownManager;
    .locals 2

    sget-object v0, Lcom/huawei/qrcode/logic/down/AppDownManager;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-static {}, Lcom/huawei/qrcode/logic/down/BaseCommonContext;->getInstance()Lcom/huawei/qrcode/logic/down/BaseCommonContext;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/qrcode/logic/down/BaseCommonContext;->initContext(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/huawei/qrcode/logic/down/AppDownManager;->mContext:Landroid/content/Context;

    goto :goto_0

    :cond_0
    const-string v0, "AppDownManager getInstance context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/qrcode/logic/down/AppDownManager$SingletoneHolder;->INSTANCE:Lcom/huawei/qrcode/logic/down/AppDownManager;

    return-object v0
.end method

.method private installAppStatus(Landroid/content/Context;Landroid/os/Handler;)I
    .locals 3

    new-instance v2, Lcom/huawei/qrcode/logic/install/PackageInstallHelper;

    invoke-direct {v2}, Lcom/huawei/qrcode/logic/install/PackageInstallHelper;-><init>()V

    invoke-virtual {v2, p1}, Lcom/huawei/qrcode/logic/install/PackageInstallHelper;->isAppHasInstallPermission(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "AppDownManager installAppStatus slient."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->apkFilePath:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->installPackageName:Ljava/lang/String;

    invoke-virtual {v2, p1, p2, v0, v1}, Lcom/huawei/qrcode/logic/install/PackageInstallHelper;->installSilent(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    :goto_0
    return v0

    :cond_1
    const-string v0, "AppDownManager installAppStatus normal."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->apkFilePath:Ljava/lang/String;

    invoke-virtual {v2, p1, v0}, Lcom/huawei/qrcode/logic/install/PackageInstallHelper;->installNormal(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    goto :goto_1

    :cond_2
    const/4 v0, 0x3

    :goto_1
    return v0
.end method

.method private isValidateSuccess(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "AppDownManager encrypPkgSignName is null, do not validate."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "AppDownManager filePath is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_1
    sget-object v0, Lcom/huawei/qrcode/logic/down/AppDownManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/16 v0, 0xc0

    invoke-virtual {v2, p2, v0}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    iget-object v0, v3, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, v3, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    array-length v0, v0

    if-lez v0, :cond_2

    iget-object v0, v3, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4, p1}, Lcom/huawei/qrcode/logic/down/AppDownManager;->validateSignName(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "AppDownManager validate success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private jumpToApp()V
    .locals 4

    invoke-static {}, Lcom/huawei/qrcode/logic/jump/JumpManager;->getInstance()Lcom/huawei/qrcode/logic/jump/JumpManager;

    move-result-object v0

    sget-object v1, Lcom/huawei/qrcode/logic/down/AppDownManager;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->installPackageName:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->qrcodeOperationInfo:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/qrcode/logic/jump/JumpManager;->jumpToActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private registerInstallReceiver()V
    .locals 3

    const-string v0, "AppDownManager registerInstallReceiver."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    sget-object v0, Lcom/huawei/qrcode/logic/down/AppDownManager;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const-string v0, "AppDownManager registerInstallReceiver mContext is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    return-void

    :cond_0
    new-instance v0, Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;-><init>(Lcom/huawei/qrcode/logic/down/AppDownManager;Lcom/huawei/qrcode/logic/down/AppDownManager$1;)V

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->appInstallReceive:Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v0, "android.intent.action.PACKAGE_ADDED"

    invoke-direct {v2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v0, "package"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    sget-object v0, Lcom/huawei/qrcode/logic/down/AppDownManager;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->appInstallReceive:Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method private sendDownMsg(Landroid/os/Handler;IILjava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-string v0, "AppDownManager sendDownMsg handler is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    iput p3, v2, Landroid/os/Message;->arg1:I

    iput-object p4, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {p1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method private validateSignName(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    const/4 v2, 0x0

    :try_start_0
    invoke-static {p1, p2}, Lcom/huawei/qrcode/utils/crypto/PBKDF2;->validatePassword(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v3

    const/4 v2, 0x0

    const-string v0, "AppDownManager PBKDF2 validate sign name cause exception: "

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_0

    :catch_1
    move-exception v3

    const/4 v2, 0x0

    const-string v0, "AppDownManager PBKDF2 validate sign name cause exception: "

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_0
    return v2
.end method


# virtual methods
.method public finishDownFile()V
    .locals 2

    const-string v0, "AppDownManager finishDownFile."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/huawei/qrcode/logic/down/DownloadManager;->getInstance()Lcom/huawei/qrcode/logic/down/DownloadManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->downloadTaskId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/qrcode/logic/down/DownloadManager;->cancelDownloadTask(Ljava/lang/String;)V

    return-void
.end method

.method public installPackage(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    iput-object p4, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->apkFilePath:Ljava/lang/String;

    iput-object p5, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->qrcodeOperationInfo:Ljava/lang/String;

    iput-object p6, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->mEventId:Ljava/lang/String;

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->apkFilePath:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, " "

    const-string v1, ""

    invoke-virtual {p3, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->installPackageName:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->installPackageName:Ljava/lang/String;

    :goto_1
    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->installPackageName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v2, :cond_2

    if-nez v3, :cond_2

    if-eqz v4, :cond_3

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AppDownManager installPackage isContextNu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  isApkFilePathNu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " isPackageNameNu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/16 v0, -0x7d1

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    :cond_3
    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->qrcodeOperationInfo:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AppDownManager installPackage isQrcodeInfoNu="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/16 v0, -0x7d1

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    :cond_4
    invoke-direct {p0, p1, p2}, Lcom/huawei/qrcode/logic/down/AppDownManager;->installAppStatus(Landroid/content/Context;Landroid/os/Handler;)I

    move-result v6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AppDownManager installPackage installCode ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x1

    if-ne v6, v0, :cond_5

    const-string v0, "AppDownManager installPackage silence."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/16 v0, 0x3ed

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_2

    :cond_5
    const/4 v0, 0x2

    if-ne v6, v0, :cond_6

    const-string v0, "AppDownManager installPackage normal."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/16 v0, 0x46e

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    invoke-direct {p0}, Lcom/huawei/qrcode/logic/down/AppDownManager;->registerInstallReceiver()V

    :cond_6
    :goto_2
    return-void
.end method

.method public startDownLoadApp(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/16 v0, 0x3e9

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p2, v0, v1, v2}, Lcom/huawei/qrcode/logic/down/AppDownManager;->sendDownMsg(Landroid/os/Handler;IILjava/lang/Object;)V

    const-string v0, "AppDownManager startDownloadApp context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    return-void

    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x3e9

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p2, v0, v1, v2}, Lcom/huawei/qrcode/logic/down/AppDownManager;->sendDownMsg(Landroid/os/Handler;IILjava/lang/Object;)V

    const-string v0, "AppDownManager startDownloadApp downUrl is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    return-void

    :cond_1
    invoke-static {}, Lcom/huawei/qrcode/logic/down/DownloadManager;->getInstance()Lcom/huawei/qrcode/logic/down/DownloadManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/qrcode/logic/down/AppDownManager$1;

    invoke-direct {v1, p0, p2, p4, p6}, Lcom/huawei/qrcode/logic/down/AppDownManager$1;-><init>(Lcom/huawei/qrcode/logic/down/AppDownManager;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p3, p5, v1}, Lcom/huawei/qrcode/logic/down/DownloadManager;->download(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->downloadTaskId:Ljava/lang/String;

    return-void
.end method

.method public unRegisterInstallReceiver()V
    .locals 2

    const-string v0, "AppDownManager unRegisterInstallReceiver."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    sget-object v0, Lcom/huawei/qrcode/logic/down/AppDownManager;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const-string v0, "AppDownManager unRegisterInstallReceiver mContext is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->appInstallReceive:Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    const-string v0, "AppDownManager unRegisterInstallReceiver appInstallReceive is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    return-void

    :cond_1
    sget-object v0, Lcom/huawei/qrcode/logic/down/AppDownManager;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->appInstallReceive:Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager;->appInstallReceive:Lcom/huawei/qrcode/logic/down/AppDownManager$AppInstallReceive;

    return-void
.end method
