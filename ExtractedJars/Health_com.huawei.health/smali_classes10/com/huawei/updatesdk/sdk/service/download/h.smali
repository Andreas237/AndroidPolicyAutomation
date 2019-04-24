.class public Lcom/huawei/updatesdk/sdk/service/download/h;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/updatesdk/sdk/service/download/h$a;
    }
.end annotation


# static fields
.field private static volatile a:Lcom/huawei/updatesdk/sdk/service/download/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/updatesdk/sdk/service/download/h;->a:Lcom/huawei/updatesdk/sdk/service/download/h;

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/download/h;->c()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)J
    .locals 7

    const-wide/16 v3, -0x1

    invoke-static {p0}, Lcom/huawei/updatesdk/sdk/a/c/f;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "bytes"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x2f

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v5

    const/4 v0, -0x1

    if-eq v0, v5, :cond_0

    add-int/lit8 v0, v5, 0x1

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    move-wide v3, v0

    const-string v0, "HiAppDownload"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get new filelength by Content-Range:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v6

    const-string v0, "HiAppDownload"

    const-string v1, "getEntityLegth NumberFormatException"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "HiAppDownload"

    const-string v1, "getEntityLegth failed Content-Range"

    invoke-static {v0, v1}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-wide v3
.end method

.method public static a(Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;Ljava/net/HttpURLConnection;Z)Lcom/huawei/updatesdk/sdk/service/download/h$a;
    .locals 7

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    new-instance v5, Lcom/huawei/updatesdk/sdk/service/download/h$a;

    invoke-direct {v5}, Lcom/huawei/updatesdk/sdk/service/download/h$a;-><init>()V

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/h$3;

    invoke-direct {v0, p1}, Lcom/huawei/updatesdk/sdk/service/download/h$3;-><init>(Ljava/net/HttpURLConnection;)V

    invoke-interface {v3, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v4

    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p0, v4}, Lcom/huawei/updatesdk/sdk/service/download/bean/DownloadTask;->b(Ljava/util/concurrent/Future;)V

    :cond_1
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1f40

    invoke-interface {v4, v1, v2, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/updatesdk/sdk/service/download/h$a;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v5, v0

    goto :goto_0

    :catch_0
    move-exception v6

    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "connect timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Lcom/huawei/updatesdk/sdk/service/download/h$a;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :catch_1
    move-exception v6

    invoke-virtual {v5, v6}, Lcom/huawei/updatesdk/sdk/service/download/h$a;->a(Ljava/lang/Exception;)V

    :goto_0
    return-object v5
.end method

.method public static declared-synchronized a()Lcom/huawei/updatesdk/sdk/service/download/h;
    .locals 3

    const-class v1, Lcom/huawei/updatesdk/sdk/service/download/h;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/updatesdk/sdk/service/download/h;->a:Lcom/huawei/updatesdk/sdk/service/download/h;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/h;

    invoke-direct {v0}, Lcom/huawei/updatesdk/sdk/service/download/h;-><init>()V

    sput-object v0, Lcom/huawei/updatesdk/sdk/service/download/h;->a:Lcom/huawei/updatesdk/sdk/service/download/h;

    :cond_0
    sget-object v0, Lcom/huawei/updatesdk/sdk/service/download/h;->a:Lcom/huawei/updatesdk/sdk/service/download/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private b()Ljava/net/Proxy;
    .locals 1

    invoke-static {}, Lcom/huawei/updatesdk/sdk/service/a/a;->a()Lcom/huawei/updatesdk/sdk/service/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/updatesdk/sdk/service/a/a;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/updatesdk/sdk/a/c/c/b;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/c/c/b;->a()Ljava/net/Proxy;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private static c()V
    .locals 4

    const/4 v0, 0x1

    new-array v2, v0, [Ljavax/net/ssl/TrustManager;

    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/h$1;

    invoke-direct {v0}, Lcom/huawei/updatesdk/sdk/service/download/h$1;-><init>()V

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "TLS"

    :try_start_0
    invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    move-result-object v3

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v3, v1, v2, v0}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    invoke-virtual {v3}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    invoke-static {v0}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    :try_end_0
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "HiAppDownload"

    const-string v1, "disableSSLCertificateChecking exception"

    invoke-static {v0, v1, v3}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v3

    const-string v0, "HiAppDownload"

    const-string v1, "disableSSLCertificateChecking exception"

    invoke-static {v0, v1, v3}, Lcom/huawei/updatesdk/sdk/a/b/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    new-instance v0, Lcom/huawei/updatesdk/sdk/service/download/h$2;

    invoke-direct {v0}, Lcom/huawei/updatesdk/sdk/service/download/h$2;-><init>()V

    invoke-static {v0}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Z)Ljava/net/HttpURLConnection;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v2, 0x0

    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-direct {p0}, Lcom/huawei/updatesdk/sdk/service/download/h;->b()Ljava/net/Proxy;

    move-result-object v4

    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/net/HttpURLConnection;

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v4}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/net/HttpURLConnection;

    :goto_0
    const/16 v0, 0x1b58

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const/16 v0, 0x2710

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    const-string v0, "Accept-Encoding"

    const-string v1, "identity"

    invoke-virtual {v3, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    return-object v3
.end method
