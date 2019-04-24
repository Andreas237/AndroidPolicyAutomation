.class public Lcom/huawei/wallet/logic/install/PackageInstallHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Z
    .locals 5

    .line 50
    const/4 v3, 0x0

    .line 51
    if-nez p1, :cond_0

    .line 53
    const-string v0, "isAppHasInstallPermission context null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 54
    return v3

    .line 58
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.permission.INSTALL_PACKAGES"

    .line 59
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 58
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 60
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

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 61
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 63
    const/4 v3, 0x1

    .line 65
    :cond_1
    return v3
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 7

    .line 107
    if-nez p1, :cond_0

    .line 109
    const-string v0, "install error, context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 110
    const/4 v0, 0x0

    return v0

    .line 112
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    const-string v0, "install error, install path is valid."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 115
    const/4 v0, 0x0

    return v0

    .line 117
    :cond_1
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 118
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 119
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

    .line 121
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 125
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_4

    .line 128
    const-string v0, "com.huawei.health.fileprovider"

    invoke-static {p1, v0, v5}, Landroid/support/v4/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v6

    .line 130
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_0

    .line 132
    :cond_4
    invoke-static {v5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v6

    .line 134
    :goto_0
    const-string v0, "execute installNormal. "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 136
    const-string v0, "application/vnd.android.package-archive"

    invoke-virtual {v4, v6, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 137
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 138
    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 139
    const/4 v0, 0x1

    return v0
.end method

.method public d(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 11

    .line 153
    if-nez p1, :cond_0

    .line 155
    const-string v0, "install error, context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 156
    const/4 v0, 0x0

    return v0

    .line 158
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 160
    const-string v0, "install error, install file path is valid."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 161
    const/4 v0, 0x0

    return v0

    .line 163
    :cond_1
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 165
    const-string v0, "install error, package name is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 166
    const/4 v0, 0x0

    return v0

    .line 168
    :cond_2
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 169
    invoke-static {v5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v6

    .line 170
    const/4 v7, 0x2

    .line 171
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    .line 172
    new-instance v9, Lcom/huawei/wallet/logic/install/PackageInstallObserver;

    invoke-direct {v9, p2, p4}, Lcom/huawei/wallet/logic/install/PackageInstallObserver;-><init>(Landroid/os/Handler;Ljava/lang/String;)V

    .line 175
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

    .line 177
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

    .line 196
    goto :goto_0

    .line 179
    :catch_0
    move-exception v10

    .line 181
    const-string v0, "installSilent, occur no such method exception."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 182
    const/16 v0, -0x7d1

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 183
    const/4 v0, 0x0

    return v0

    .line 185
    :catch_1
    move-exception v10

    .line 187
    const-string v0, "installSilent, occur invocation target exception."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 188
    const/16 v0, -0x7d1

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 189
    const/4 v0, 0x0

    return v0

    .line 191
    :catch_2
    move-exception v10

    .line 193
    const-string v0, "installSilent, occur illegal access exception."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 194
    const/16 v0, -0x7d1

    invoke-virtual {p2, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 195
    const/4 v0, 0x0

    return v0

    .line 197
    :goto_0
    const-string v0, "start install."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 198
    const/4 v0, 0x1

    return v0
.end method

.method public e(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 73
    if-nez p1, :cond_0

    .line 75
    const-string v0, "install error, context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 76
    const/4 v0, 0x0

    return v0

    .line 78
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 80
    const-string v0, "install error, install path is valid."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 81
    const/4 v0, 0x0

    return v0

    .line 83
    :cond_1
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 85
    const-string v0, "install error, package name is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 86
    const/4 v0, 0x0

    return v0

    .line 88
    :cond_2
    invoke-virtual {p0, p1}, Lcom/huawei/wallet/logic/install/PackageInstallHelper;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 90
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/huawei/wallet/logic/install/PackageInstallHelper;->d(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 94
    :cond_3
    invoke-virtual {p0, p1, p3}, Lcom/huawei/wallet/logic/install/PackageInstallHelper;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
