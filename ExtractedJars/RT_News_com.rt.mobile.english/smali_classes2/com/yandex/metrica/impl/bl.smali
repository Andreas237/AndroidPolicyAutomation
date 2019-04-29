.class public final Lcom/yandex/metrica/impl/bl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/bl$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/pm/PackageItemInfo;)I
    .locals 1

    .line 241
    iget-object v0, p0, Landroid/content/pm/PackageItemInfo;->metaData:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    .line 243
    :try_start_0
    iget-object p0, p0, Landroid/content/pm/PackageItemInfo;->metaData:Landroid/os/Bundle;

    const-string v0, "metrica:api:level"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    const/4 p0, -0x1

    :goto_0
    return p0
.end method

.method public static a(Landroid/content/pm/PackageManager;Ljava/lang/String;)J
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    const/16 v0, 0x8

    const/4 v1, 0x0

    const-wide/16 v2, -0x1

    .line 171
    :try_start_0
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    invoke-virtual {p0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 173
    iget-wide v4, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    iget-wide v6, v0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move-wide v4, v2

    .line 182
    :goto_0
    :try_start_1
    invoke-virtual {p0, p1, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    .line 183
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 184
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 187
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 188
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-wide v2, p0

    .line 194
    :catch_1
    :cond_1
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static a(Landroid/content/Context;)Landroid/content/Intent;
    .locals 1

    .line 94
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 95
    invoke-static {p0}, Lcom/yandex/metrica/impl/bl;->e(Landroid/content/Context;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 96
    invoke-static {v0}, Lcom/yandex/metrica/impl/bl;->a(Landroid/content/Intent;)V

    return-object v0
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/content/Intent;",
            ")",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;"
        }
    .end annotation

    .line 107
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const/16 v0, 0x80

    .line 109
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    .line 110
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method

.method public static a(Landroid/content/Intent;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    const/16 v0, 0xb

    .line 268
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    .line 269
    invoke-virtual {p0, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_0
    return-void
.end method

.method private static a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    if-eqz p2, :cond_1

    .line 236
    invoke-virtual {p0, p2, p1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static b(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    .line 101
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/yandex/metrica/IMetricaService;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lcom/yandex/metrica/impl/bl;->e(Landroid/content/Context;)Landroid/net/Uri;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 102
    invoke-static {v0}, Lcom/yandex/metrica/impl/bl;->a(Landroid/content/Intent;)V

    return-object v0
.end method

.method public static b(Landroid/content/Context;Landroid/content/Intent;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/content/Intent;",
            ")",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/bl$a;",
            ">;"
        }
    .end annotation

    .line 126
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 127
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 129
    invoke-static {p0, p1}, Lcom/yandex/metrica/impl/bl;->a(Landroid/content/Context;Landroid/content/Intent;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/ResolveInfo;

    .line 131
    iget-object v2, p1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 1154
    iget-boolean v3, v2, Landroid/content/pm/ServiceInfo;->enabled:Z

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    .line 1155
    iget-boolean v5, v2, Landroid/content/pm/ServiceInfo;->exported:Z

    xor-int/2addr v5, v4

    or-int/2addr v3, v5

    .line 1156
    iget-object v5, v2, Landroid/content/pm/ServiceInfo;->permission:Ljava/lang/String;

    invoke-static {v5}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result v5

    xor-int/2addr v5, v4

    or-int/2addr v3, v5

    if-nez v3, :cond_0

    .line 138
    iget-object v3, v2, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 139
    invoke-static {v0, v3}, Lcom/yandex/metrica/impl/bl;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)J

    move-result-wide v9

    .line 141
    iget-object v3, v2, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    const-string v5, "android.permission.INTERNET"

    .line 1210
    invoke-static {v0, v3, v5}, Lcom/yandex/metrica/impl/bl;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 142
    invoke-static {v2}, Lcom/yandex/metrica/impl/bl;->a(Landroid/content/pm/PackageItemInfo;)I

    move-result v8

    shl-int/lit8 v3, v8, 0x5

    const/16 v5, 0x10

    .line 2200
    iget-object v6, v2, Landroid/content/pm/PackageItemInfo;->packageName:Ljava/lang/String;

    const-string v7, "android.permission.ACCESS_COARSE_LOCATION"

    .line 2214
    invoke-static {v0, v6, v7}, Lcom/yandex/metrica/impl/bl;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    mul-int/2addr v5, v6

    add-int/2addr v3, v5

    const/16 v5, 0x8

    .line 2201
    iget-object v6, v2, Landroid/content/pm/PackageItemInfo;->packageName:Ljava/lang/String;

    const-string v7, "android.permission.ACCESS_FINE_LOCATION"

    .line 2218
    invoke-static {v0, v6, v7}, Lcom/yandex/metrica/impl/bl;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    mul-int/2addr v5, v6

    add-int/2addr v3, v5

    const/4 v5, 0x4

    .line 2202
    iget-object v6, v2, Landroid/content/pm/PackageItemInfo;->packageName:Ljava/lang/String;

    const-string v7, "android.permission.ACCESS_WIFI_STATE"

    .line 2230
    invoke-static {v0, v6, v7}, Lcom/yandex/metrica/impl/bl;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    mul-int/2addr v5, v6

    add-int/2addr v3, v5

    const/4 v5, 0x2

    .line 2203
    iget-object v6, v2, Landroid/content/pm/PackageItemInfo;->packageName:Ljava/lang/String;

    const-string v7, "android.permission.ACCESS_NETWORK_STATE"

    .line 3222
    invoke-static {v0, v6, v7}, Lcom/yandex/metrica/impl/bl;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    mul-int/2addr v5, v6

    add-int/2addr v3, v5

    .line 2204
    iget-object v2, v2, Landroid/content/pm/PackageItemInfo;->packageName:Ljava/lang/String;

    const-string v5, "android.permission.READ_PHONE_STATE"

    .line 3226
    invoke-static {v0, v2, v5}, Lcom/yandex/metrica/impl/bl;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    mul-int/2addr v4, v2

    add-int v7, v3, v4

    .line 145
    new-instance v2, Lcom/yandex/metrica/impl/bl$a;

    iget-object v6, p1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    move-object v5, v2

    invoke-direct/range {v5 .. v10}, Lcom/yandex/metrica/impl/bl$a;-><init>(Landroid/content/pm/ServiceInfo;IIJ)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 149
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v1
.end method

.method public static c(Landroid/content/Context;)Landroid/content/Intent;
    .locals 4

    .line 253
    invoke-static {p0}, Lcom/yandex/metrica/impl/bl;->b(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-static {p0}, Lcom/yandex/metrica/impl/bl;->f(Landroid/content/Context;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object v0

    .line 254
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "client"

    .line 255
    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "pid"

    .line 256
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "psid"

    sget-object v3, Lcom/yandex/metrica/impl/ob/u;->a:Ljava/lang/String;

    .line 257
    invoke-virtual {v1, v2, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    .line 254
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 258
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 4121
    invoke-static {p0}, Lcom/yandex/metrica/impl/bl;->b(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/yandex/metrica/impl/bl;->b(Landroid/content/Context;Landroid/content/Intent;)Ljava/util/List;

    move-result-object p0

    .line 4116
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/yandex/metrica/impl/bl$a;

    iget-object p0, p0, Lcom/yandex/metrica/impl/bl$a;->d:Landroid/content/pm/ServiceInfo;

    .line 4117
    new-instance v0, Landroid/content/ComponentName;

    iget-object v1, p0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-direct {v0, v1, p0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static e(Landroid/content/Context;)Landroid/net/Uri;
    .locals 2

    .line 88
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "metrica"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    .line 89
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p0

    .line 90
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method private static f(Landroid/content/Context;)Landroid/os/Bundle;
    .locals 2

    .line 274
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 277
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const/16 v1, 0x80

    .line 279
    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-nez p0, :cond_0

    .line 280
    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    .line 285
    :catch_0
    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    return-object p0
.end method
