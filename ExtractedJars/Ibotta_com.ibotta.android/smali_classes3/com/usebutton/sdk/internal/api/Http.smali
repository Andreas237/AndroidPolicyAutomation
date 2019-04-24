.class public Lcom/usebutton/sdk/internal/api/Http;
.super Ljava/lang/Object;
.source "Http.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final CONTENT_TYPE_JPEG:Ljava/lang/String; = "image/jpeg"

.field private static final CONTENT_TYPE_JSON:Ljava/lang/String; = "application/json"

.field private static final CONTENT_TYPE_PNG:Ljava/lang/String; = "image/png"

.field private static final ENCODING_UTF8:Ljava/lang/String; = "UTF-8"

.field private static final HTTP_STATUS_BAD_REQUEST:I = 0x190

.field private static final SO_CONNECT_TIMEOUT:I

.field private static final SO_READ_TIMEOUT:I

.field private static final TAG:Ljava/lang/String; = "Http"


# instance fields
.field private mUserAgent:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 33
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    long-to-int v1, v0

    sput v1, Lcom/usebutton/sdk/internal/api/Http;->SO_CONNECT_TIMEOUT:I

    .line 34
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xf

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    long-to-int v1, v0

    sput v1, Lcom/usebutton/sdk/internal/api/Http;->SO_READ_TIMEOUT:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/Http;->mUserAgent:Ljava/lang/String;

    return-void
.end method

.method private connect(Lcom/usebutton/sdk/internal/api/Request;Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    const-string v0, "Http"

    const-string v1, "Will request: %s"

    const/4 v2, 0x1

    .line 102
    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/Request;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v0, v1, v3}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    new-instance v0, Ljava/net/URL;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/Request;->url()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 105
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/URLConnectionInstrumentation;->openConnection(Ljava/net/URLConnection;)Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 106
    sget v1, Lcom/usebutton/sdk/internal/api/Http;->SO_CONNECT_TIMEOUT:I

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 107
    sget v1, Lcom/usebutton/sdk/internal/api/Http;->SO_READ_TIMEOUT:I

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const-string v1, "User-Agent"

    .line 108
    iget-object v3, p0, Lcom/usebutton/sdk/internal/api/Http;->mUserAgent:Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "Accept"

    .line 109
    invoke-virtual {v0, v1, p2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/Request;->headers()Ljava/lang/Iterable;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/functional/Pair;

    .line 112
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/functional/Pair;->first()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/functional/Pair;->second()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v3, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 115
    :cond_0
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/Request;->method()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 117
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/Request;->body()Ljava/lang/String;

    move-result-object p1

    .line 118
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 119
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p2

    .line 120
    invoke-static {p2, p1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->writeStringToStream(Ljava/io/OutputStream;Ljava/lang/String;)V

    const-string p2, "Http"

    const-string v1, "POST\'ed: %s"

    .line 121
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v5

    invoke-static {p2, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-object v0
.end method

.method private isSupportedImage(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "image/png"

    .line 168
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "image/jpeg"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private static limitResetSeconds(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "X-Button-Limit-Reset-Seconds"

    .line 89
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static requestId(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "X-Button-Request"

    .line 84
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private requestJson(Lcom/usebutton/sdk/internal/api/Request;)Lcom/usebutton/sdk/internal/api/HttpResponse;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "application/json"

    .line 52
    invoke-direct {p0, p1, v3}, Lcom/usebutton/sdk/internal/api/Http;->connect(Lcom/usebutton/sdk/internal/api/Request;Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v2

    .line 53
    invoke-direct {p0, v2}, Lcom/usebutton/sdk/internal/api/Http;->streamForConnection(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;

    move-result-object v3

    .line 54
    invoke-static {v3}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->streamToString(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v3

    .line 55
    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/Http;->requestId(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Http"

    const-string v6, "Response (id=%s) for: %s\n%s"

    const/4 v7, 0x3

    .line 57
    new-array v7, v7, [Ljava/lang/Object;

    aput-object v4, v7, v0

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v8

    aput-object v8, v7, v1

    const/4 v8, 0x2

    aput-object v3, v7, v8

    invoke-static {v5, v6, v7}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    :try_start_1
    new-instance v5, Lorg/json/JSONObject;

    invoke-static {v3}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    :try_start_2
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    .line 66
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v5

    .line 67
    new-instance v6, Lcom/usebutton/sdk/internal/api/HttpResponse;

    invoke-direct {v6, v4, v5, v3}, Lcom/usebutton/sdk/internal/api/HttpResponse;-><init>(ILjava/util/Map;Lorg/json/JSONObject;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v2, :cond_0

    .line 77
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_0
    return-object v6

    :catch_0
    move-exception v3

    .line 62
    :try_start_3
    new-instance v5, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    const-string v6, "Couldn\'t parse response body to JSON"

    invoke-direct {v5, v6, v4, v3}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v5
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 73
    :try_start_4
    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/Http;->limitResetSeconds(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;->setLimitResetSeconds(Ljava/lang/String;)V

    .line 74
    throw p1

    :catch_2
    move-exception v3

    .line 69
    invoke-static {v2}, Lcom/usebutton/sdk/internal/api/Http;->requestId(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Network request failed (Request ID: %s)"

    .line 70
    new-array v1, v1, [Ljava/lang/Object;

    aput-object v4, v1, v0

    invoke-static {v5, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    new-instance v0, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Exception while requesting: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/Request;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, v4, v3}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    if-eqz v2, :cond_1

    .line 77
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_1
    throw p1
.end method

.method private streamForConnection(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    .line 93
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    const-string v1, "Http"

    const-string v2, "%d response for %s"

    const/4 v3, 0x2

    .line 94
    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-static {v1, v2, v3}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/16 v1, 0x190

    if-ge v0, v1, :cond_0

    .line 98
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    return-object p1

    .line 96
    :cond_0
    new-instance v1, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v2

    invoke-static {p1}, Lcom/usebutton/sdk/internal/api/Http;->requestId(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, v2, p1}, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;-><init>(ILjava/net/URL;Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public executeRequest(Lcom/usebutton/sdk/internal/api/Request;)Lcom/usebutton/sdk/internal/api/HttpResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    .line 133
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/api/Http;->requestJson(Lcom/usebutton/sdk/internal/api/Request;)Lcom/usebutton/sdk/internal/api/HttpResponse;

    move-result-object p1

    return-object p1
.end method

.method public getUserAgent()Ljava/lang/String;
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/Http;->mUserAgent:Ljava/lang/String;

    return-object v0
.end method

.method public requestBitmapData(Lcom/usebutton/sdk/internal/api/Request;)[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "image/png"

    .line 147
    invoke-direct {p0, p1, v1}, Lcom/usebutton/sdk/internal/api/Http;->connect(Lcom/usebutton/sdk/internal/api/Request;Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    :try_start_1
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/api/Http;->isSupportedImage(Ljava/lang/String;)Z

    move-result v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v1, :cond_1

    if-eqz p1, :cond_0

    .line 162
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_0
    return-object v0

    .line 151
    :cond_1
    :try_start_2
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/api/Http;->streamForConnection(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;

    move-result-object v0

    .line 153
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v1

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->streamToByteArray(Ljava/io/InputStream;I)[B

    move-result-object v1

    if-eqz v0, :cond_2

    .line 155
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_2
    if-eqz p1, :cond_3

    .line 162
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_3
    return-object v1

    :catch_0
    move-exception v0

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v4, v0

    move-object v0, p1

    move-object p1, v4

    goto :goto_1

    :catch_1
    move-exception p1

    move-object v4, v0

    move-object v0, p1

    move-object p1, v4

    .line 159
    :goto_0
    :try_start_3
    new-instance v1, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    const-string v2, "Exception while GET\'ing bitmap"

    invoke-static {p1}, Lcom/usebutton/sdk/internal/api/Http;->requestId(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3, v0}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    :goto_1
    if-eqz p1, :cond_4

    .line 162
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_4
    throw v0
.end method

.method public setUserAgent(Ljava/lang/String;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/Http;->mUserAgent:Ljava/lang/String;

    return-void
.end method
