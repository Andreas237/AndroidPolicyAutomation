.class Lcom/tencent/stat/j;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/j;->a:Landroid/content/Context;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/j;->b:Ljava/util/Map;

    iput-object p1, p0, Lcom/tencent/stat/j;->a:Landroid/content/Context;

    if-eqz p2, :cond_0

    iput-object p2, p0, Lcom/tencent/stat/j;->b:Ljava/util/Map;

    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;I)Lcom/tencent/stat/NetworkMonitor;
    .locals 10

    new-instance v2, Lcom/tencent/stat/NetworkMonitor;

    invoke-direct {v2}, Lcom/tencent/stat/NetworkMonitor;-><init>()V

    new-instance v3, Ljava/net/Socket;

    invoke-direct {v3}, Ljava/net/Socket;-><init>()V

    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {v2, p1}, Lcom/tencent/stat/NetworkMonitor;->setDomain(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Lcom/tencent/stat/NetworkMonitor;->setPort(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    new-instance v7, Ljava/net/InetSocketAddress;

    invoke-direct {v7, p1, p2}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    const/16 v0, 0x7530

    invoke-virtual {v3, v7, v0}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v5

    invoke-virtual {v2, v0, v1}, Lcom/tencent/stat/NetworkMonitor;->setMillisecondsConsume(J)V

    invoke-virtual {v7}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/tencent/stat/NetworkMonitor;->setRemoteIp(Ljava/lang/String;)V

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    if-eqz v3, :cond_1

    :try_start_1
    invoke-virtual {v3}, Ljava/net/Socket;->close()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    goto :goto_1

    :catch_0
    move-exception v5

    invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    goto :goto_1

    :catch_1
    move-exception v5

    const/4 v4, -0x1

    :try_start_2
    invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v3, :cond_2

    :try_start_3
    invoke-virtual {v3}, Ljava/net/Socket;->close()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2

    :cond_2
    goto :goto_1

    :catch_2
    move-exception v5

    invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v8

    if-eqz v3, :cond_3

    :try_start_4
    invoke-virtual {v3}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_3

    :cond_3
    goto :goto_0

    :catch_3
    move-exception v9

    invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    invoke-virtual {v0, v9}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    throw v8

    :goto_1
    invoke-virtual {v2, v4}, Lcom/tencent/stat/NetworkMonitor;->setStatusCode(I)V

    return-object v2
.end method

.method private a()Ljava/util/Map;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "__MTA_TEST_SPEED__"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/tencent/stat/StatConfig;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-object v2

    :cond_1
    const-string v0, ";"

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    move-object v5, v4

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_5

    aget-object v8, v5, v7

    const-string v0, ","

    invoke-virtual {v8, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_4

    array-length v0, v9

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    aget-object v10, v9, v0

    if-eqz v10, :cond_4

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    const/16 v11, 0x50

    const/4 v0, 0x1

    :try_start_0
    aget-object v0, v9, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v11

    goto :goto_1

    :catch_0
    move-exception v12

    invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    invoke-virtual {v0, v12}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V

    goto :goto_2

    :goto_1
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v10, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_5
    return-object v2
.end method


# virtual methods
.method public run()V
    .locals 9

    :try_start_0
    iget-object v0, p0, Lcom/tencent/stat/j;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/stat/common/k;->h(Landroid/content/Context;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tencent/stat/j;->b:Ljava/util/Map;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/tencent/stat/j;->a()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/stat/j;->b:Ljava/util/Map;

    :cond_1
    iget-object v0, p0, Lcom/tencent/stat/j;->b:Ljava/util/Map;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tencent/stat/j;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    const-string v1, "empty domain list."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->w(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :cond_3
    const/4 v3, 0x0

    :try_start_2
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    iget-object v0, p0, Lcom/tencent/stat/j;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    const-string v1, "empty domain name."

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->w(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Integer;

    if-nez v8, :cond_6

    invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "port is null for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->w(Ljava/lang/Object;)V

    goto :goto_0

    :cond_6
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lcom/tencent/stat/j;->a(Ljava/lang/String;I)Lcom/tencent/stat/NetworkMonitor;

    move-result-object v3

    invoke-virtual {v3}, Lcom/tencent/stat/NetworkMonitor;->toJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    move-result v0

    if-nez v0, :cond_8

    return-void

    :cond_8
    :try_start_3
    new-instance v5, Lcom/tencent/stat/a/i;

    iget-object v0, p0, Lcom/tencent/stat/j;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/tencent/stat/j;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/tencent/stat/StatService;->a(Landroid/content/Context;Z)I

    move-result v1

    invoke-direct {v5, v0, v1}, Lcom/tencent/stat/a/i;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/tencent/stat/a/i;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/stat/j;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/tencent/stat/j;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/stat/StatService;->c(Landroid/content/Context;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/tencent/stat/k;

    invoke-direct {v1, v5}, Lcom/tencent/stat/k;-><init>(Lcom/tencent/stat/a/e;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    :cond_9
    goto :goto_1

    :catch_0
    move-exception v3

    invoke-static {}, Lcom/tencent/stat/StatService;->b()Lcom/tencent/stat/common/StatLogger;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
