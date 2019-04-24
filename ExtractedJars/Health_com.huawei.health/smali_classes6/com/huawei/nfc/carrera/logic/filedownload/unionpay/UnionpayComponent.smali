.class public Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private callback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;

.field private downLoadHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

.field private infoCallBack:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;

.field private installCallBack:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;

.field private installHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;

.field private localSavePath:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private packageInstallHelper:Lcom/huawei/wallet/logic/install/PackageInstallHelper;

.field private unionpayInfoHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->localSavePath:Ljava/lang/String;

    .line 76
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->mContext:Landroid/content/Context;

    .line 77
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;Ljava/io/File;Ljava/lang/String;)Z
    .locals 1

    .line 29
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->checkSign(Ljava/io/File;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;Ljava/io/File;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->installDirect(Ljava/io/File;)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;)Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->installHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;

    return-object v0
.end method

.method private checkSign(Ljava/io/File;Ljava/lang/String;)Z
    .locals 5

    .line 299
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 300
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x40

    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 301
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 303
    const/4 v0, 0x0

    return v0

    .line 307
    :cond_0
    iget-object v0, v3, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;

    move-result-object v4

    .line 308
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/wallet/utils/SHA_256;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private installDirect(Ljava/io/File;)V
    .locals 5

    .line 319
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->packageInstallHelper:Lcom/huawei/wallet/logic/install/PackageInstallHelper;

    if-nez v0, :cond_0

    .line 321
    new-instance v0, Lcom/huawei/wallet/logic/install/PackageInstallHelper;

    invoke-direct {v0}, Lcom/huawei/wallet/logic/install/PackageInstallHelper;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->packageInstallHelper:Lcom/huawei/wallet/logic/install/PackageInstallHelper;

    .line 323
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->packageInstallHelper:Lcom/huawei/wallet/logic/install/PackageInstallHelper;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->installHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    const-string v4, "com.unionpay.tsmbleuniteservice"

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/huawei/wallet/logic/install/PackageInstallHelper;->e(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)Z

    .line 325
    return-void
.end method


# virtual methods
.method public cancelDown()V
    .locals 3

    .line 210
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->downLoadHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    if-nez v0, :cond_0

    .line 212
    new-instance v0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->callback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->downLoadHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    .line 214
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->downLoadHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->sendCancelMessage()V

    .line 215
    return-void
.end method

.method public cleanTemp()V
    .locals 2

    .line 167
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->getLocalSavePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 168
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_1

    .line 170
    :cond_0
    const-string v0, "delete unionpay temp failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 172
    :cond_1
    return-void
.end method

.method public delete()Z
    .locals 2

    .line 179
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->getAPKPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 180
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 182
    const/4 v0, 0x1

    return v0

    .line 186
    :cond_0
    const-string v0, "unionpay apk delete failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 187
    const/4 v0, 0x0

    return v0
.end method

.method public download(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 198
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->downLoadHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    if-nez v0, :cond_0

    .line 200
    new-instance v0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->callback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->downLoadHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    .line 202
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->downLoadHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->sendDownMessage(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    return-void
.end method

.method public getAPKPath()Ljava/lang/String;
    .locals 3

    .line 264
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->getLocalSavePath()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".temp"

    const-string v2, ".apk"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLocalSavePath()Ljava/lang/String;
    .locals 3

    .line 241
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->mContext:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 243
    const-string v0, ""

    return-object v0

    .line 245
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->localSavePath:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 247
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v2

    .line 249
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    .line 250
    const-string v0, ""

    return-object v0

    .line 253
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/nfc/unionpay.temp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->localSavePath:Ljava/lang/String;

    .line 255
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->localSavePath:Ljava/lang/String;

    return-object v0
.end method

.method public getUnionpayAPKInfo()V
    .locals 3

    .line 229
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->unionpayInfoHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;

    if-nez v0, :cond_0

    .line 231
    new-instance v0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->infoCallBack:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->unionpayInfoHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;

    .line 233
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->unionpayInfoHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->requestUnionpayInfo()V

    .line 234
    return-void
.end method

.method public install(Ljava/lang/String;)V
    .locals 4

    .line 114
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->installHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 116
    new-instance v0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->installCallBack:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;-><init>(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->installHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;

    .line 118
    :cond_0
    new-instance v2, Ljava/io/File;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->getAPKPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 119
    new-instance v3, Ljava/io/File;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->getLocalSavePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 122
    invoke-virtual {v3, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 124
    new-instance v0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent$1;

    invoke-direct {v0, p0, v2, p1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent$1;-><init>(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;Ljava/io/File;Ljava/lang/String;)V

    .line 138
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent$1;->start()V

    goto :goto_0

    .line 142
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->installHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;->sendFailedMessage()V

    .line 143
    const-string v0, "apk rename failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 145
    :goto_0
    return-void
.end method

.method public isAppHasInstallPermission()Z
    .locals 2

    .line 153
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->packageInstallHelper:Lcom/huawei/wallet/logic/install/PackageInstallHelper;

    if-nez v0, :cond_0

    .line 155
    new-instance v0, Lcom/huawei/wallet/logic/install/PackageInstallHelper;

    invoke-direct {v0}, Lcom/huawei/wallet/logic/install/PackageInstallHelper;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->packageInstallHelper:Lcom/huawei/wallet/logic/install/PackageInstallHelper;

    .line 158
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->packageInstallHelper:Lcom/huawei/wallet/logic/install/PackageInstallHelper;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/logic/install/PackageInstallHelper;->a(Landroid/content/Context;)Z

    move-result v0

    return v0
.end method

.method public isLocalFileExist()Z
    .locals 2

    .line 221
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->getAPKPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 222
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    return v0
.end method

.method public registerListeners(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;)V
    .locals 2

    .line 83
    new-instance v0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1, p2}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->unionpayInfoHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;

    .line 84
    new-instance v0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;

    invoke-direct {v0, p1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;-><init>(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->installHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;

    .line 85
    new-instance v0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1, p3}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->downLoadHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    .line 86
    return-void
.end method

.method public setCallback(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;)V
    .locals 0

    .line 273
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->callback:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;

    .line 274
    return-void
.end method

.method public setInfoCallBack(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;)V
    .locals 0

    .line 282
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->infoCallBack:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;

    .line 283
    return-void
.end method

.method public setInstallCallBack(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;)V
    .locals 0

    .line 291
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->installCallBack:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;

    .line 292
    return-void
.end method

.method public unregisterListeners()V
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->unionpayInfoHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;

    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->unionpayInfoHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/RequestUnionpayInfoHandler;->unregisterListener()V

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->installHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;

    if-eqz v0, :cond_1

    .line 99
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->installHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayInstallHandler;->unregisterListener()V

    .line 102
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->downLoadHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    if-eqz v0, :cond_2

    .line 104
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->downLoadHandler:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/handler/UnionpayDownLoadHandler;->unregisterListener()V

    .line 106
    :cond_2
    return-void
.end method
