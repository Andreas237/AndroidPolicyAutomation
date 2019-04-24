.class public final Lcom/huawei/hwCloudJs/support/a/b;
.super Ljava/lang/Object;


# static fields
.field private static final c:Lcom/huawei/hwCloudJs/support/a/b;

.field private static d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/huawei/hwCloudJs/support/a/a;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:J

.field private b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/huawei/hwCloudJs/support/a/b;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/support/a/b;-><init>()V

    sput-object v0, Lcom/huawei/hwCloudJs/support/a/b;->c:Lcom/huawei/hwCloudJs/support/a/b;

    new-instance v0, Lcom/huawei/hwCloudJs/support/a/b$1;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Lcom/huawei/hwCloudJs/support/a/b$1;-><init>(I)V

    sput-object v0, Lcom/huawei/hwCloudJs/support/a/b;->d:Ljava/util/HashMap;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0x989680

    iput-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/b;->a:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/b;->b:J

    return-void
.end method

.method public static a()Lcom/huawei/hwCloudJs/support/a/b;
    .locals 1

    sget-object v0, Lcom/huawei/hwCloudJs/support/a/b;->c:Lcom/huawei/hwCloudJs/support/a/b;

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;)Lcom/huawei/hwCloudJs/support/a/a;
    .locals 1

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/huawei/hwCloudJs/support/a/b;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwCloudJs/support/a/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/hwCloudJs/support/a/b;->a:J

    return-void
.end method

.method public declared-synchronized a(Ljava/lang/String;Lcom/huawei/hwCloudJs/support/a/a;)V
    .locals 9

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/huawei/hwCloudJs/support/a/b;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwCloudJs/support/a/a;

    if-eqz v6, :cond_0

    iget-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/b;->b:J

    invoke-virtual {v6}, Lcom/huawei/hwCloudJs/support/a/a;->a()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/b;->b:J

    :cond_0
    sget-object v0, Lcom/huawei/hwCloudJs/support/a/b;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/b;->b:J

    invoke-virtual {p2}, Lcom/huawei/hwCloudJs/support/a/a;->a()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/b;->b:J

    iget-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/b;->b:J

    iget-wide v2, p0, Lcom/huawei/hwCloudJs/support/a/b;->a:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    sget-object v0, Lcom/huawei/hwCloudJs/support/a/b;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/hwCloudJs/support/a/b;->e(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/b;->b:J

    iget-wide v2, p0, Lcom/huawei/hwCloudJs/support/a/b;->a:J

    const-wide/16 v4, 0x2

    div-long/2addr v2, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    goto :goto_0

    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/b;->a:J

    return-wide v0
.end method

.method public declared-synchronized b(Ljava/lang/String;)Lcom/huawei/hwCloudJs/support/a/a;
    .locals 5

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/huawei/hwCloudJs/support/a/b;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/huawei/hwCloudJs/support/a/b;->a(Ljava/lang/String;)Lcom/huawei/hwCloudJs/support/a/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/huawei/hwCloudJs/support/a/a;->e()I

    move-result v0

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/b;->b:J

    invoke-virtual {v4}, Lcom/huawei/hwCloudJs/support/a/a;->a()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/b;->b:J

    sget-object v0, Lcom/huawei/hwCloudJs/support/a/b;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-object v4

    :cond_1
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized c(Ljava/lang/String;)Lcom/huawei/hwCloudJs/support/a/a;
    .locals 5

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/huawei/hwCloudJs/support/a/b;->b(Ljava/lang/String;)Lcom/huawei/hwCloudJs/support/a/a;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v0, "CacheManager"

    const-string v1, "getCacheInfo success!"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v2

    :cond_0
    const/4 v3, 0x0

    :try_start_1
    new-instance v3, Ljava/net/URL;

    invoke-direct {v3, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v0, "CacheManager"

    const-string v1, "MalformedURLException"

    :try_start_2
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :goto_0
    invoke-virtual {v3}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v3}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Ljava/net/URL;->getAuthority()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Ljava/net/URL;->getAuthority()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-virtual {p0, v4}, Lcom/huawei/hwCloudJs/support/a/b;->b(Ljava/lang/String;)Lcom/huawei/hwCloudJs/support/a/a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v2

    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized c()V
    .locals 3

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/huawei/hwCloudJs/support/a/b;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/b;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public declared-synchronized d()I
    .locals 2

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/huawei/hwCloudJs/support/a/b;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public declared-synchronized d(Ljava/lang/String;)Z
    .locals 1

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/huawei/hwCloudJs/support/a/b;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized e()J
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/b;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public declared-synchronized e(Ljava/lang/String;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/huawei/hwCloudJs/support/a/b;->a(Ljava/lang/String;)Lcom/huawei/hwCloudJs/support/a/a;

    move-result-object v4

    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    iget-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/b;->b:J

    invoke-virtual {v4}, Lcom/huawei/hwCloudJs/support/a/a;->a()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/hwCloudJs/support/a/b;->b:J

    :cond_0
    sget-object v0, Lcom/huawei/hwCloudJs/support/a/b;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
