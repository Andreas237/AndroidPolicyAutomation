.class public Lcom/yandex/metrica/impl/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/x$b;,
        Lcom/yandex/metrica/impl/x$c;,
        Lcom/yandex/metrica/impl/x$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;)V
    .locals 6

    const-string v0, "com.yandex.metrica.CounterConfiguration"

    .line 1054
    invoke-static {v0}, Lcom/yandex/metrica/impl/x;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1055
    new-instance p0, Lcom/yandex/metrica/impl/x$a;

    const-string v0, "\nClass com.yandex.metrica.CounterConfiguration isn\'t found.\nPerhaps this is due to obfuscation.\nIf you build your application with ProGuard,\nyou need to keep the Metrica for Apps.\nPlease try to use the following lines of code:\n##########################################\n-keep class com.yandex.metrica.** { *; }\n-dontwarn com.yandex.metrica.**\n##########################################"

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/x$a;-><init>(Ljava/lang/String;)V

    throw p0

    .line 2046
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    if-eqz v0, :cond_6

    .line 2093
    :try_start_0
    new-instance v0, Landroid/content/ComponentName;

    const-class v3, Lcom/yandex/metrica/MetricaService;

    invoke-direct {v0, p0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2094
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const/16 v4, 0x280

    invoke-virtual {v3, v0, v4}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    if-eqz v0, :cond_2

    const-string v3, "metrica:api:level"

    .line 2098
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "metrica:api:level"

    .line 2099
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {}, Lcom/yandex/metrica/YandexMetrica;->getLibraryApiLevel()I

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v0, v3, :cond_2

    move v2, v1

    :catch_0
    :cond_2
    if-nez v2, :cond_3

    .line 2106
    new-instance p0, Lcom/yandex/metrica/impl/x$c;

    const-class v0, Lcom/yandex/metrica/MetricaService;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/x$c;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    const-string v0, "com.yandex.metrica.intent.action.SYNC"

    .line 2124
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-class v2, Lcom/yandex/metrica/MetricaEventHandler;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " receiver"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2125
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2126
    new-instance v3, Landroid/content/Intent;

    const/4 v4, 0x0

    const-string v5, "package://fake.data"

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 2128
    invoke-static {p0, v2}, Lcom/yandex/metrica/impl/x;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 2129
    new-instance p0, Lcom/yandex/metrica/impl/x$b;

    invoke-direct {p0, v1, v0}, Lcom/yandex/metrica/impl/x$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw p0

    :cond_4
    const-string v0, "android.intent.action.PACKAGE_DATA_CLEARED"

    .line 2131
    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/yandex/metrica/impl/x;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2132
    new-instance p0, Lcom/yandex/metrica/impl/x$b;

    const-string v0, "android.intent.action.PACKAGE_DATA_CLEARED"

    invoke-direct {p0, v1, v0}, Lcom/yandex/metrica/impl/x$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw p0

    :cond_5
    const-string v0, "android.intent.action.PACKAGE_ADDED"

    .line 2134
    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/yandex/metrica/impl/x;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result p0

    if-eqz p0, :cond_6

    .line 2135
    new-instance p0, Lcom/yandex/metrica/impl/x$b;

    const-string v0, "android.intent.action.PACKAGE_ADDED"

    invoke-direct {p0, v1, v0}, Lcom/yandex/metrica/impl/x$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw p0

    :cond_6
    return-void
.end method

.method private static a(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 5

    .line 112
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p1

    .line 113
    const-class v0, Lcom/yandex/metrica/MetricaEventHandler;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 114
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ResolveInfo;

    .line 115
    iget-object v3, v2, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v2, v2, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v2, v2, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 116
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 0

    .line 76
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
