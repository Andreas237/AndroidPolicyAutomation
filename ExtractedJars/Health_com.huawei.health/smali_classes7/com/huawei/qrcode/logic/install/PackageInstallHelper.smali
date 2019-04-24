.class public Lcom/huawei/qrcode/logic/install/PackageInstallHelper;
.super Ljava/lang/Object;


# static fields
.field private static final FILE_PROVIDER_AUTH:Ljava/lang/String; = ".down.scanqrcodefileprovider"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private getFileProviderAuth(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-string v0, "PackageInstallHelper getFileProviderAuth context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, ".down.scanqrcodefileprovider"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private isPathLegal(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-string v0, "PackageInstallHelper isPathLegal context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "PackageInstallHelper isPathLegal apkPath is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v2

    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    const-string v0, "PackageInstallHelper isPathLegal apkPath is legal."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public installDefault(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    if-nez p1, :cond_0

    const-string v0, "install error, context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "install error, install path is valid."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "install error, package name is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_2
    invoke-virtual {p0, p1}, Lcom/huawei/qrcode/logic/install/PackageInstallHelper;->isAppHasInstallPermission(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/huawei/qrcode/logic/install/PackageInstallHelper;->installSilent(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0

    :cond_3
    invoke-virtual {p0, p1, p3}, Lcom/huawei/qrcode/logic/install/PackageInstallHelper;->installNormal(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public installNormal(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 7

    if-nez p1, :cond_0

    const-string v0, "install error, context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "install error, install path is valid."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_1
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_3

    :cond_2
    const/4 v0, 0x0

    return v0

    :cond_3
    const-string v0, "execute installNormal. "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_4

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/logic/install/PackageInstallHelper;->getFileProviderAuth(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v5}, Lcom/huawei/qrcode/fileprovider/ScanQrcodeFileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v6

    const-string v0, "application/vnd.android.package-archive"

    invoke-virtual {v4, v6, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "file://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "application/vnd.android.package-archive"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    :goto_0
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const/4 v0, 0x1

    return v0
.end method

.method public installSilent(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 11

    if-nez p1, :cond_0

    const-string v0, "install error, context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "install error, install file path is valid."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "install error, package name is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_2
    invoke-direct {p0, p1, p3}, Lcom/huawei/qrcode/logic/install/PackageInstallHelper;->isPathLegal(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "install error, apkpath is not legal."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_3
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v6

    const/4 v7, 0x2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    new-instance v9, Lcom/huawei/qrcode/logic/install/PackageInstallObserver;

    invoke-direct {v9, p2, p4}, Lcom/huawei/qrcode/logic/install/PackageInstallObserver;-><init>(Landroid/os/Handler;Ljava/lang/String;)V

    :try_start_0
    const-class v0, Landroid/content/pm/PackageManager;

    const-string v1, "installPackage"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Landroid/net/Uri;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-class v3, Landroid/content/pm/IPackageInstallObserver;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v6, v0, v1

    const/4 v1, 0x1

    aput-object v9, v0, v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v1, 0x3

    aput-object p4, v0, v1

    invoke-virtual {v10, v8, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    :catch_0
    move-exception v10

    const-string v0, "installSilent, occur no such method exception."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/16 v0, -0x7d1

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    const/4 v0, 0x0

    return v0

    :catch_1
    move-exception v10

    const-string v0, "installSilent, occur invocation target exception."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/16 v0, -0x7d1

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    const/4 v0, 0x0

    return v0

    :catch_2
    move-exception v10

    const-string v0, "installSilent, occur illegal access exception."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/16 v0, -0x7d1

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    const/4 v0, 0x0

    return v0

    :goto_0
    const-string v0, "start install."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x1

    return v0
.end method

.method public isAppHasInstallPermission(Landroid/content/Context;)Z
    .locals 5

    const/4 v3, 0x0

    if-nez p1, :cond_0

    const-string v0, "isAppHasInstallPermission context null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    return v3

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.permission.INSTALL_PACKAGES"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "permisstionGranted is 0 ?:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    const/4 v3, 0x1

    :cond_1
    return v3
.end method
