.class public Lretrofit/client/OkClient;
.super Lretrofit/client/UrlConnectionClient;
.source "OkClient.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private final okUrlFactory:Lcom/squareup/okhttp/OkUrlFactory;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-static {}, Lretrofit/client/OkClient;->generateDefaultOkHttp()Lcom/squareup/okhttp/OkHttpClient;

    move-result-object v0

    invoke-direct {p0, v0}, Lretrofit/client/OkClient;-><init>(Lcom/squareup/okhttp/OkHttpClient;)V

    return-void
.end method

.method public constructor <init>(Lcom/squareup/okhttp/OkHttpClient;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Lretrofit/client/UrlConnectionClient;-><init>()V

    .line 41
    new-instance v0, Lcom/squareup/okhttp/OkUrlFactory;

    invoke-direct {v0, p1}, Lcom/squareup/okhttp/OkUrlFactory;-><init>(Lcom/squareup/okhttp/OkHttpClient;)V

    iput-object v0, p0, Lretrofit/client/OkClient;->okUrlFactory:Lcom/squareup/okhttp/OkUrlFactory;

    return-void
.end method

.method private static generateDefaultOkHttp()Lcom/squareup/okhttp/OkHttpClient;
    .locals 4

    .line 28
    new-instance v0, Lcom/squareup/okhttp/OkHttpClient;

    invoke-direct {v0}, Lcom/squareup/okhttp/OkHttpClient;-><init>()V

    .line 29
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3a98

    invoke-virtual {v0, v2, v3, v1}, Lcom/squareup/okhttp/OkHttpClient;->setConnectTimeout(JLjava/util/concurrent/TimeUnit;)V

    .line 30
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x4e20

    invoke-virtual {v0, v2, v3, v1}, Lcom/squareup/okhttp/OkHttpClient;->setReadTimeout(JLjava/util/concurrent/TimeUnit;)V

    return-object v0
.end method


# virtual methods
.method protected openConnection(Lretrofit/client/Request;)Ljava/net/HttpURLConnection;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lretrofit/client/OkClient;->okUrlFactory:Lcom/squareup/okhttp/OkUrlFactory;

    new-instance v1, Ljava/net/URL;

    invoke-virtual {p1}, Lretrofit/client/Request;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    instance-of p1, v0, Lcom/squareup/okhttp/OkUrlFactory;

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/OkUrlFactory;->open(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast v0, Lcom/squareup/okhttp/OkUrlFactory;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/okhttp2/OkHttp2Instrumentation;->open(Lcom/squareup/okhttp/OkUrlFactory;Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object p1

    :goto_0
    return-object p1
.end method
