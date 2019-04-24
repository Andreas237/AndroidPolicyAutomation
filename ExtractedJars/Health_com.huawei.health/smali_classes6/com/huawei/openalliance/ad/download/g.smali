.class public Lcom/huawei/openalliance/ad/download/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/huawei/openalliance/ad/download/b;

.field private c:Lcom/huawei/openalliance/ad/download/e;

.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Ljava/net/HttpURLConnection;>;"
        }
    .end annotation
.end field

.field private e:Z

.field private f:Z

.field private final g:[B

.field private h:I


# direct methods
.method public constructor <init>(Lcom/huawei/openalliance/ad/download/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/download/g;->e:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/download/g;->f:Z

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->g:[B

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    iget-object v0, p1, Lcom/huawei/openalliance/ad/download/b;->a:Landroid/content/Context;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->a:Landroid/content/Context;

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/download/e;Ljava/io/File;)Ljava/net/HttpURLConnection;
    .locals 7

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v4, Ljava/net/URL;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/net/URL;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v3, v0

    invoke-static {v3}, Lcom/huawei/openalliance/ad/net/http/HttpsConfig;->a(Ljava/net/HttpURLConnection;)V

    const/16 v0, 0x2710

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const/16 v0, 0x2710

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->g()J

    move-result-wide v5

    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-lez v0, :cond_1

    const-string v0, "Range"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bytes="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const-string v0, "Accept-Encoding"

    const-string v1, "identity"

    invoke-virtual {v3, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->connect()V

    invoke-direct {p0, v3, p1, p2}, Lcom/huawei/openalliance/ad/download/g;->a(Ljava/net/HttpURLConnection;Lcom/huawei/openalliance/ad/download/e;Ljava/io/File;)Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/openalliance/ad/exception/c; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v3, v0

    return-object v3

    :catch_0
    move-exception v4

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/net/HttpURLConnection;)V

    throw v4

    :catch_1
    move-exception v4

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/net/HttpURLConnection;)V

    throw v4
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/download/g;)Ljava/net/HttpURLConnection;
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/download/g;->b()Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/net/HttpURLConnection;Lcom/huawei/openalliance/ad/download/e;Ljava/io/File;)Ljava/net/HttpURLConnection;
    .locals 6

    const-string v0, "DownloadWorker"

    const-string v1, "checkConn start"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/h;->a(Ljava/net/HttpURLConnection;)J

    move-result-wide v4

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/download/e;->f()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/download/e;->f()J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-eqz v0, :cond_2

    const-string v0, "DownloadWorker"

    const-string v1, "checkConn - may be hijacked, switch to safe url"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/download/e;->q()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/download/e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, Lcom/huawei/openalliance/ad/utils/i;->f(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "DownloadWorker"

    const-string v1, "checkConn - switch to safe url ok"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/net/HttpURLConnection;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p2, v0, v1}, Lcom/huawei/openalliance/ad/download/e;->b(J)V

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/huawei/openalliance/ad/download/e;->c(Z)V

    invoke-direct {p0, p2, p3}, Lcom/huawei/openalliance/ad/download/g;->a(Lcom/huawei/openalliance/ad/download/e;Ljava/io/File;)Ljava/net/HttpURLConnection;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string v0, "DownloadWorker"

    const-string v1, "checkConn - fail to switch to safe url, stop downloading"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/huawei/openalliance/ad/download/e$a;->d:Lcom/huawei/openalliance/ad/download/e$a;

    invoke-virtual {p2, v0}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/e$a;)V

    invoke-virtual {p3}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    invoke-static {p3}, Lcom/huawei/openalliance/ad/utils/i;->e(Ljava/io/File;)V

    :cond_1
    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/net/HttpURLConnection;)V

    const/4 p1, 0x0

    :cond_2
    :goto_0
    const-string v0, "DownloadWorker"

    const-string v1, "checkConn end"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method private declared-synchronized a(Ljava/net/HttpURLConnection;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->d:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized a(Z)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/download/g;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized a()Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/download/g;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method private declared-synchronized b()Ljava/net/HttpURLConnection;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->d:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method private b(Lcom/huawei/openalliance/ad/download/e;)Z
    .locals 6

    const/4 v4, 0x0

    const-string v0, "DownloadWorker"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "takeTask, taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", priority:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->j()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", seqNum:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->l()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/download/g;->c(Lcom/huawei/openalliance/ad/download/e;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "DownloadWorker"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "executeTask, network error, taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return v4

    :cond_0
    :try_start_1
    invoke-virtual {p1, p0}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/g;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/e;->a(I)V

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/download/g;->d(Lcom/huawei/openalliance/ad/download/e;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/download/g;->d(Lcom/huawei/openalliance/ad/download/e;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "DownloadWorker"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "executeTask Exception, taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/openalliance/ad/utils/ak;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-static {v0, v5}, Lcom/huawei/openalliance/ad/g/c;->a(ILjava/lang/Throwable;)V

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/download/g;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    return v4

    :cond_2
    const/4 v4, 0x1

    :goto_0
    return v4
.end method

.method private b(Lcom/huawei/openalliance/ad/download/e;Ljava/io/File;)Z
    .locals 3

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/download/g;->a()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/lang/String;Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "DownloadWorker"

    const-string v1, "onDownloadCompleted, check file sha256 failed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/download/g;->c(Lcom/huawei/openalliance/ad/download/e;Ljava/io/File;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {p2}, Lcom/huawei/openalliance/ad/utils/i;->e(Ljava/io/File;)V

    sget-object v0, Lcom/huawei/openalliance/ad/download/e$a;->e:Lcom/huawei/openalliance/ad/download/e$a;

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/e$a;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/download/b;->h(Lcom/huawei/openalliance/ad/download/e;)V

    :cond_0
    return v2

    :cond_1
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/io/File;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    const/16 v1, 0x64

    invoke-virtual {v0, p1, v1}, Lcom/huawei/openalliance/ad/download/b;->a(Lcom/huawei/openalliance/ad/download/e;I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/download/b;->f(Lcom/huawei/openalliance/ad/download/e;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/download/b;->h(Lcom/huawei/openalliance/ad/download/e;)V

    :goto_0
    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->p()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p2}, Lcom/huawei/openalliance/ad/utils/i;->e(Ljava/io/File;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/openalliance/ad/download/e;->b(J)V

    :cond_4
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method private c()Z
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/g;->g:[B

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/download/g;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private c(Lcom/huawei/openalliance/ad/download/e;)Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/download/b;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/download/e$a;->f:Lcom/huawei/openalliance/ad/download/e$a;

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/e$a;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/download/b;->h(Lcom/huawei/openalliance/ad/download/e;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->n()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/download/b;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/huawei/openalliance/ad/download/e$a;->g:Lcom/huawei/openalliance/ad/download/e$a;

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/e$a;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/download/b;->h(Lcom/huawei/openalliance/ad/download/e;)V

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private c(Lcom/huawei/openalliance/ad/download/e;Ljava/io/File;)Z
    .locals 2

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->q()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/e;->c(Z)V

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/openalliance/ad/download/e;->b(J)V

    invoke-static {p2}, Lcom/huawei/openalliance/ad/utils/i;->e(Ljava/io/File;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/download/b;->g(Lcom/huawei/openalliance/ad/download/e;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private d(Lcom/huawei/openalliance/ad/download/e;)Z
    .locals 26

    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/download/g;->a(Z)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/download/g;->e(Lcom/huawei/openalliance/ad/download/e;)Ljava/io/File;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    :try_start_0
    invoke-direct {v0, v1, v4}, Lcom/huawei/openalliance/ad/download/g;->a(Lcom/huawei/openalliance/ad/download/e;Ljava/io/File;)Ljava/net/HttpURLConnection;

    move-result-object v0

    move-object v5, v0

    if-nez v5, :cond_1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/b;->h(Lcom/huawei/openalliance/ad/download/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v8, 0x0

    invoke-static {v6}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v7}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    if-eqz v5, :cond_0

    invoke-static {v5}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/net/HttpURLConnection;)V

    :cond_0
    return v8

    :cond_1
    move-object/from16 v0, p0

    :try_start_1
    invoke-direct {v0, v5}, Lcom/huawei/openalliance/ad/download/g;->a(Ljava/net/HttpURLConnection;)V

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/openalliance/ad/download/e;->g()J

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/openalliance/ad/download/e;->f()J

    move-result-wide v10

    sub-long v12, v10, v8

    invoke-virtual {v4}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v13, v0}, Lcom/huawei/openalliance/ad/utils/i;->a(JLjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/huawei/openalliance/ad/download/e$a;->c:Lcom/huawei/openalliance/ad/download/e$a;

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/e$a;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/b;->h(Lcom/huawei/openalliance/ad/download/e;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v14, 0x0

    invoke-static {v6}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v7}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    if-eqz v5, :cond_2

    invoke-static {v5}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/net/HttpURLConnection;)V

    :cond_2
    return v14

    :cond_3
    move-object/from16 v0, p0

    :try_start_2
    iget v0, v0, Lcom/huawei/openalliance/ad/download/g;->h:I

    if-gtz v0, :cond_4

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/b;->e(Lcom/huawei/openalliance/ad/download/e;)V

    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/download/b;->d()I

    move-result v14

    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1, v14}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    move-object v6, v0

    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v1, "rwd"

    invoke-direct {v0, v4, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v7, v0

    invoke-virtual {v7, v8, v9}, Ljava/io/RandomAccessFile;->seek(J)V

    new-array v15, v14, [B

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    :cond_5
    :goto_0
    invoke-virtual {v6, v15}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move/from16 v16, v0

    if-lez v0, :cond_b

    invoke-direct/range {p0 .. p0}, Lcom/huawei/openalliance/ad/download/g;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "DownloadWorker"

    const-string v1, "download canceled"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_6
    const/4 v0, 0x0

    move/from16 v1, v16

    invoke-virtual {v7, v15, v0, v1}, Ljava/io/RandomAccessFile;->write([BII)V

    move/from16 v0, v16

    int-to-long v0, v0

    add-long/2addr v8, v0

    const-wide/16 v0, 0x64

    mul-long/2addr v0, v8

    div-long/2addr v0, v10

    long-to-int v2, v0

    move/from16 v17, v2

    const/4 v0, 0x0

    move/from16 v1, v17

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v17

    const/16 v0, 0x64

    move/from16 v1, v17

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v17

    move-object/from16 v0, p1

    invoke-virtual {v0, v8, v9}, Lcom/huawei/openalliance/ad/download/e;->b(J)V

    cmp-long v0, v8, v10

    if-lez v0, :cond_9

    const-string v0, "DownloadWorker"

    const-string v1, "downloading, check file size failed"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v4}, Lcom/huawei/openalliance/ad/download/g;->c(Lcom/huawei/openalliance/ad/download/e;Ljava/io/File;)Z

    move-result v23

    if-nez v23, :cond_7

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/i;->e(Ljava/io/File;)V

    sget-object v0, Lcom/huawei/openalliance/ad/download/e$a;->d:Lcom/huawei/openalliance/ad/download/e$a;

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/e$a;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/b;->h(Lcom/huawei/openalliance/ad/download/e;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_7
    move/from16 v24, v23

    invoke-static {v6}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v7}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    if-eqz v5, :cond_8

    invoke-static {v5}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/net/HttpURLConnection;)V

    :cond_8
    return v24

    :cond_9
    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v21

    sub-int v0, v17, v18

    const/4 v1, 0x1

    if-ge v0, v1, :cond_a

    sub-long v0, v21, v19

    const-wide/16 v2, 0x1388

    cmp-long v0, v0, v2

    if-lez v0, :cond_5

    :cond_a
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    move-object/from16 v1, p1

    move/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lcom/huawei/openalliance/ad/download/b;->a(Lcom/huawei/openalliance/ad/download/e;I)V

    move/from16 v18, v17

    move-wide/from16 v19, v21

    goto/16 :goto_0

    :cond_b
    :goto_1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1, v4}, Lcom/huawei/openalliance/ad/download/g;->b(Lcom/huawei/openalliance/ad/download/e;Ljava/io/File;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v23

    invoke-static {v6}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v7}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    if-eqz v5, :cond_c

    invoke-static {v5}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/net/HttpURLConnection;)V

    :cond_c
    return v23

    :catchall_0
    move-exception v25

    invoke-static {v6}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    invoke-static {v7}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/io/Closeable;)V

    if-eqz v5, :cond_d

    invoke-static {v5}, Lcom/huawei/openalliance/ad/utils/ac;->a(Ljava/net/HttpURLConnection;)V

    :cond_d
    throw v25
.end method

.method private e(Lcom/huawei/openalliance/ad/download/e;)Ljava/io/File;
    .locals 6

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->e()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/openalliance/ad/download/e;->b(J)V

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "DownloadWorker"

    const-string v1, "failed to create dirs"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/io/IOException;

    const-string v1, "fail to create dirs"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    move-result v5

    if-nez v5, :cond_2

    const-string v0, "DownloadWorker"

    const-string v1, "failed to create new temp file"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/io/IOException;

    const-string v1, "fail to create new temp file"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/huawei/openalliance/ad/download/e;->b(J)V

    :goto_0
    return-object v3
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/download/e;)V
    .locals 3

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/download/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/download/g;->a()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/download/g;->a(Z)V

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "DownloadWorker"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cancelCurrentTask, taskId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/e;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    new-instance v0, Lcom/huawei/openalliance/ad/download/g$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/download/g$1;-><init>(Lcom/huawei/openalliance/ad/download/g;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->d(Ljava/lang/Runnable;)V

    :cond_3
    return-void
.end method

.method public run()V
    .locals 11

    const-string v0, "DownloadWorker"

    const-string v1, "[%s] running..."

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    const/4 v4, 0x0

    :goto_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/download/g;->c()Z

    move-result v0

    if-nez v0, :cond_c

    move-object v5, p0

    :try_start_0
    monitor-enter v5
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :goto_1
    :try_start_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/download/b;->c()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/download/b;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x3e8

    invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_0
    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception v6

    monitor-exit v5

    :try_start_2
    throw v6

    :goto_2
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/openalliance/ad/download/g;->h:I

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/download/b;->b()Lcom/huawei/openalliance/ad/download/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    if-eqz v0, :cond_3

    const/4 v4, 0x0

    :cond_1
    move-object v5, p0

    monitor-enter v5
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v4, :cond_2

    :try_start_3
    iget v0, p0, Lcom/huawei/openalliance/ad/download/g;->h:I

    add-int/lit8 v0, v0, -0x1

    int-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    const-wide v2, 0x407f400000000000L    # 500.0

    mul-double/2addr v0, v2

    double-to-long v6, v0

    const-string v0, "DownloadWorker"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "retry, inerval:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", count:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/huawei/openalliance/ad/download/g;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v6, v7}, Ljava/lang/Object;->wait(J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_2
    monitor-exit v5

    goto :goto_3

    :catchall_1
    move-exception v8

    monitor-exit v5

    :try_start_4
    throw v8

    :goto_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/download/g;->b(Lcom/huawei/openalliance/ad/download/e;)Z

    move-result v0

    move v4, v0

    if-eqz v4, :cond_3

    iget v0, p0, Lcom/huawei/openalliance/ad/download/g;->h:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/openalliance/ad/download/g;->h:I
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    const/4 v1, 0x3

    if-lt v0, v1, :cond_1

    :cond_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    if-eqz v0, :cond_b

    if-eqz v4, :cond_4

    :try_start_5
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/b;->h(Lcom/huawei/openalliance/ad/download/e;)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_4

    :catch_0
    move-exception v5

    const-string v0, "DownloadWorker"

    const-string v1, "call manager.onDownloadFail Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_4
    :try_start_6
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/download/g;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/download/e;->o()Lcom/huawei/openalliance/ad/download/e$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/download/e$b;->b:Lcom/huawei/openalliance/ad/download/e$b;

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/e;->a(I)V

    :cond_5
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/g;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/b;->a(Lcom/huawei/openalliance/ad/download/e;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1

    goto/16 :goto_8

    :catch_1
    move-exception v5

    const-string v0, "DownloadWorker"

    const-string v1, "run Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_8

    :catch_2
    move-exception v5

    const-string v0, "DownloadWorker"

    const-string v1, "run Throwable"

    :try_start_7
    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-static {v0, v5}, Lcom/huawei/openalliance/ad/g/c;->a(ILjava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    if-eqz v0, :cond_b

    if-eqz v4, :cond_6

    :try_start_8
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/b;->h(Lcom/huawei/openalliance/ad/download/e;)V
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_3

    goto :goto_5

    :catch_3
    move-exception v5

    const-string v0, "DownloadWorker"

    const-string v1, "call manager.onDownloadFail Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_5
    :try_start_9
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/download/g;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/download/e;->o()Lcom/huawei/openalliance/ad/download/e$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/download/e$b;->b:Lcom/huawei/openalliance/ad/download/e$b;

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/e;->a(I)V

    :cond_7
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/g;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/b;->a(Lcom/huawei/openalliance/ad/download/e;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;
    :try_end_9
    .catch Ljava/lang/Throwable; {:try_start_9 .. :try_end_9} :catch_4

    goto :goto_8

    :catch_4
    move-exception v5

    const-string v0, "DownloadWorker"

    const-string v1, "run Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    :catchall_2
    move-exception v9

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    if-eqz v0, :cond_a

    if-eqz v4, :cond_8

    :try_start_a
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/b;->h(Lcom/huawei/openalliance/ad/download/e;)V
    :try_end_a
    .catch Ljava/lang/Throwable; {:try_start_a .. :try_end_a} :catch_5

    goto :goto_6

    :catch_5
    move-exception v10

    const-string v0, "DownloadWorker"

    const-string v1, "call manager.onDownloadFail Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    :goto_6
    :try_start_b
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/download/g;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/download/e;->o()Lcom/huawei/openalliance/ad/download/e$b;

    move-result-object v0

    sget-object v1, Lcom/huawei/openalliance/ad/download/e$b;->b:Lcom/huawei/openalliance/ad/download/e$b;

    if-ne v0, v1, :cond_9

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/e;->a(I)V

    :cond_9
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/e;->a(Lcom/huawei/openalliance/ad/download/g;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->b:Lcom/huawei/openalliance/ad/download/b;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/download/b;->a(Lcom/huawei/openalliance/ad/download/e;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/g;->c:Lcom/huawei/openalliance/ad/download/e;
    :try_end_b
    .catch Ljava/lang/Throwable; {:try_start_b .. :try_end_b} :catch_6

    goto :goto_7

    :catch_6
    move-exception v10

    const-string v0, "DownloadWorker"

    const-string v1, "run Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_a
    :goto_7
    throw v9

    :cond_b
    :goto_8
    goto/16 :goto_0

    :cond_c
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "DownloadWorker"

    return-object v0
.end method
