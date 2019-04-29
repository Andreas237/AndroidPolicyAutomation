.class public Lcom/yandex/metrica/impl/ob/du;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/du$a;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private b:Lcom/yandex/metrica/impl/ob/lq;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/ob/du$a;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private d:Lcom/yandex/metrica/impl/ob/dt;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 131
    new-instance v0, Lcom/yandex/metrica/impl/ob/lq;

    const-string v1, "com.yandex.metrica.impl.configservice.client.ConfigurationServiceLauncher.lock"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/lq;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/yandex/metrica/impl/ob/dt;

    invoke-direct {v1, p1, p2}, Lcom/yandex/metrica/impl/ob/dt;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ks;)V

    invoke-direct {p0, p1, v0, v1}, Lcom/yandex/metrica/impl/ob/du;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/lq;Lcom/yandex/metrica/impl/ob/dt;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/lq;Lcom/yandex/metrica/impl/ob/dt;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/lq;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/dt;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/du;->a:Landroid/content/Context;

    .line 139
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/du;->b:Lcom/yandex/metrica/impl/ob/lq;

    .line 140
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/du;->d:Lcom/yandex/metrica/impl/ob/dt;

    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;
    .locals 7
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;"
        }
    .end annotation

    .line 294
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 295
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-wide v1, 0x7fffffffffffffffL

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/pm/ResolveInfo;

    .line 296
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    iget-object v5, v3, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v5, v5, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    invoke-static {v4, v5}, Lcom/yandex/metrica/impl/bl;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)J

    move-result-wide v4

    cmp-long v6, v4, v1

    if-gez v6, :cond_1

    .line 300
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 301
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-wide v1, v4

    goto :goto_0

    :cond_1
    cmp-long v6, v4, v1

    if-nez v6, :cond_0

    .line 303
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private static a(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;"
        }
    .end annotation

    .line 276
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 277
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/high16 v1, -0x80000000

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ResolveInfo;

    .line 278
    iget-object v3, v2, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v3, v3, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;

    const-string v4, "metrica:configuration:api:level"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    if-le v3, v1, :cond_1

    .line 281
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 282
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v1, v3

    goto :goto_0

    :cond_1
    if-ne v3, v1, :cond_0

    .line 284
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/du;Landroid/content/Intent;)V
    .locals 1

    .line 2210
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/du;->d:Lcom/yandex/metrica/impl/ob/dt;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/dt;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 2212
    :try_start_0
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/du;->a:Landroid/content/Context;

    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    return-void
.end method

.method private static b()Ljava/lang/String;
    .locals 6
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    .line 225
    :try_start_0
    new-instance v1, Landroid/net/LocalSocket;

    invoke-direct {v1}, Landroid/net/LocalSocket;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 227
    :try_start_1
    new-instance v2, Landroid/net/LocalSocketAddress;

    const-string v3, "com.yandex.metrica.configuration.MetricaConfigurationService"

    invoke-direct {v2, v3}, Landroid/net/LocalSocketAddress;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/net/LocalSocket;->connect(Landroid/net/LocalSocketAddress;)V

    .line 229
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-virtual {v1}, Landroid/net/LocalSocket;->getInputStream()Ljava/io/InputStream;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 230
    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 238
    :try_start_3
    invoke-virtual {v1}, Landroid/net/LocalSocket;->close()V

    .line 241
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    return-object v3

    :catchall_0
    move-exception v0

    move-object v5, v2

    move-object v2, v0

    move-object v0, v5

    goto :goto_0

    :catchall_1
    move-exception v2

    goto :goto_0

    :catch_1
    move-object v2, v0

    goto :goto_1

    :catchall_2
    move-exception v1

    move-object v2, v1

    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_0

    .line 238
    :try_start_4
    invoke-virtual {v1}, Landroid/net/LocalSocket;->close()V

    :cond_0
    if-eqz v0, :cond_1

    .line 241
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 246
    :catch_2
    :cond_1
    throw v2

    :catch_3
    move-object v1, v0

    move-object v2, v1

    :catch_4
    :goto_1
    if-eqz v1, :cond_2

    .line 238
    :try_start_5
    invoke-virtual {v1}, Landroid/net/LocalSocket;->close()V

    :cond_2
    if-eqz v2, :cond_3

    .line 241
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :cond_3
    return-object v0
.end method

.method private static b(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .param p0    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/content/pm/ResolveInfo;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 311
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 312
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ResolveInfo;

    .line 313
    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 315
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    const/4 p0, 0x0

    .line 316
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 146
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/du;->b:Lcom/yandex/metrica/impl/ob/lq;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lq;->c()V

    .line 148
    invoke-static {}, Lcom/yandex/metrica/impl/ob/du;->b()Ljava/lang/String;

    move-result-object v0

    .line 1164
    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    const/4 v3, 0x0

    if-nez v0, :cond_3

    .line 1253
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/du;->a:Landroid/content/Context;

    .line 1321
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    const-string v5, "com.yandex.metrica.configuration.ACTION_START"

    invoke-virtual {v4, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    .line 1322
    invoke-static {v4}, Lcom/yandex/metrica/impl/bl;->a(Landroid/content/Intent;)V

    .line 1324
    invoke-static {v0, v4}, Lcom/yandex/metrica/impl/bl;->a(Landroid/content/Context;Landroid/content/Intent;)Ljava/util/List;

    move-result-object v0

    .line 1255
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    .line 1256
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ne v4, v2, :cond_0

    .line 1257
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v0, v0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    goto :goto_0

    .line 1259
    :cond_0
    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/du;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 1261
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ne v4, v2, :cond_1

    .line 1262
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v0, v0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    goto :goto_0

    .line 1264
    :cond_1
    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/du;->a:Landroid/content/Context;

    invoke-static {v4, v0}, Lcom/yandex/metrica/impl/ob/du;->a(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 1266
    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/du;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 1176
    :cond_3
    :goto_0
    invoke-static {v0}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 2205
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    const-string v4, "com.yandex.metrica.configuration.ACTION_START"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 1179
    new-instance v3, Lcom/yandex/metrica/impl/ob/du$a;

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/du;->a:Landroid/content/Context;

    new-instance v5, Lcom/yandex/metrica/impl/ob/du$1;

    invoke-direct {v5, p0, v0, v1}, Lcom/yandex/metrica/impl/ob/du$1;-><init>(Lcom/yandex/metrica/impl/ob/du;Landroid/content/Intent;Ljava/util/concurrent/CountDownLatch;)V

    invoke-direct {v3, v4, v5}, Lcom/yandex/metrica/impl/ob/du$a;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/du$a$a;)V

    iput-object v3, p0, Lcom/yandex/metrica/impl/ob/du;->c:Lcom/yandex/metrica/impl/ob/du$a;

    .line 1195
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/du;->c:Lcom/yandex/metrica/impl/ob/du$a;

    invoke-virtual {v3, v0}, Lcom/yandex/metrica/impl/ob/du$a;->a(Landroid/content/Intent;)V

    goto :goto_1

    :cond_4
    move v2, v3

    :goto_1
    if-eqz v2, :cond_5

    .line 1168
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Lcom/yandex/metrica/impl/ob/lq$a; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    :catch_0
    :cond_5
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/du;->b:Lcom/yandex/metrica/impl/ob/lq;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lq;->b()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/du;->b:Lcom/yandex/metrica/impl/ob/lq;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lq;->b()V

    .line 158
    throw v0
.end method
