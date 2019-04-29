.class public Lio/sentry/connection/HttpConnection;
.super Lio/sentry/connection/AbstractConnection;
.source "HttpConnection.java"


# static fields
.field private static final DEFAULT_CONNECTION_TIMEOUT:I

.field private static final DEFAULT_READ_TIMEOUT:I

.field public static final HTTP_TOO_MANY_REQUESTS:I = 0x1ad

.field private static final NAIVE_VERIFIER:Ljavax/net/ssl/HostnameVerifier;

.field private static final SENTRY_AUTH:Ljava/lang/String; = "X-Sentry-Auth"

.field private static final USER_AGENT:Ljava/lang/String; = "User-Agent"

.field private static final UTF_8:Ljava/nio/charset/Charset;

.field private static final logger:Lorg/slf4j/Logger;


# instance fields
.field private bypassSecurity:Z

.field private connectionTimeout:I

.field private eventSampler:Lio/sentry/connection/EventSampler;

.field private marshaller:Lio/sentry/marshaller/Marshaller;

.field private final proxy:Ljava/net/Proxy;

.field private readTimeout:I

.field private final sentryUrl:Ljava/net/URL;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "UTF-8"

    .line 31
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lio/sentry/connection/HttpConnection;->UTF_8:Ljava/nio/charset/Charset;

    .line 32
    const-class v0, Lio/sentry/connection/HttpConnection;

    invoke-static {v0}, Lorg/slf4j/LoggerFactory;->getLogger(Ljava/lang/Class;)Lorg/slf4j/Logger;

    move-result-object v0

    sput-object v0, Lio/sentry/connection/HttpConnection;->logger:Lorg/slf4j/Logger;

    .line 44
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Lio/sentry/connection/HttpConnection;->DEFAULT_CONNECTION_TIMEOUT:I

    .line 48
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Lio/sentry/connection/HttpConnection;->DEFAULT_READ_TIMEOUT:I

    .line 53
    new-instance v0, Lio/sentry/connection/HttpConnection$1;

    invoke-direct {v0}, Lio/sentry/connection/HttpConnection$1;-><init>()V

    sput-object v0, Lio/sentry/connection/HttpConnection;->NAIVE_VERIFIER:Ljavax/net/ssl/HostnameVerifier;

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;Ljava/net/Proxy;Lio/sentry/connection/EventSampler;)V
    .locals 0

    .line 100
    invoke-direct {p0, p2, p3}, Lio/sentry/connection/AbstractConnection;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    sget p2, Lio/sentry/connection/HttpConnection;->DEFAULT_CONNECTION_TIMEOUT:I

    iput p2, p0, Lio/sentry/connection/HttpConnection;->connectionTimeout:I

    .line 82
    sget p2, Lio/sentry/connection/HttpConnection;->DEFAULT_READ_TIMEOUT:I

    iput p2, p0, Lio/sentry/connection/HttpConnection;->readTimeout:I

    const/4 p2, 0x0

    .line 88
    iput-boolean p2, p0, Lio/sentry/connection/HttpConnection;->bypassSecurity:Z

    .line 101
    iput-object p1, p0, Lio/sentry/connection/HttpConnection;->sentryUrl:Ljava/net/URL;

    .line 102
    iput-object p4, p0, Lio/sentry/connection/HttpConnection;->proxy:Ljava/net/Proxy;

    .line 103
    iput-object p5, p0, Lio/sentry/connection/HttpConnection;->eventSampler:Lio/sentry/connection/EventSampler;

    return-void
.end method

.method private getErrorMessageFromStream(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 3

    .line 223
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    sget-object v2, Lio/sentry/connection/HttpConnection;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 224
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    .line 229
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    if-nez v1, :cond_0

    const-string v1, "\n"

    .line 231
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    :cond_0
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 237
    sget-object v1, Lio/sentry/connection/HttpConnection;->logger:Lorg/slf4j/Logger;

    const-string v2, "Exception while reading the error message from the connection."

    invoke-interface {v1, v2, v0}, Lorg/slf4j/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 239
    :cond_1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static getSentryApiUrl(Ljava/net/URI;Ljava/lang/String;)Ljava/net/URL;
    .locals 1

    .line 115
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "api/"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/store/"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 116
    new-instance p1, Ljava/net/URL;

    invoke-direct {p1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p0

    .line 118
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Couldn\'t build a valid URL from the Sentry API."

    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public close()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    return-void
.end method

.method protected doSend(Lio/sentry/event/Event;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lio/sentry/connection/ConnectionException;
        }
    .end annotation

    .line 162
    iget-object v0, p0, Lio/sentry/connection/HttpConnection;->eventSampler:Lio/sentry/connection/EventSampler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/sentry/connection/HttpConnection;->eventSampler:Lio/sentry/connection/EventSampler;

    invoke-interface {v0, p1}, Lio/sentry/connection/EventSampler;->shouldSendEvent(Lio/sentry/event/Event;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 166
    :cond_0
    invoke-virtual {p0}, Lio/sentry/connection/HttpConnection;->getConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    .line 168
    :try_start_0
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V

    .line 169
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    .line 170
    iget-object v2, p0, Lio/sentry/connection/HttpConnection;->marshaller:Lio/sentry/marshaller/Marshaller;

    invoke-interface {v2, p1, v1}, Lio/sentry/marshaller/Marshaller;->marshall(Lio/sentry/event/Event;Ljava/io/OutputStream;)V

    .line 171
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 172
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 218
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_1

    :catch_0
    move-exception v1

    :try_start_1
    const-string v2, "Retry-After"

    .line 175
    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 180
    :try_start_2
    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    const-wide v6, 0x408f400000000000L    # 1000.0

    mul-double/2addr v4, v6

    double-to-long v4, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_1
    :cond_1
    move-object v2, v3

    .line 190
    :goto_0
    :try_start_3
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 191
    :try_start_4
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/16 v6, 0x193

    if-ne v5, v6, :cond_2

    .line 192
    sget-object v5, Lio/sentry/connection/HttpConnection;->logger:Lorg/slf4j/Logger;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Event \'"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lio/sentry/event/Event;->getId()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' was rejected by the Sentry server due to a filter."

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v5, p1}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 218
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    return-void

    .line 194
    :cond_2
    :try_start_5
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v5, 0x1ad

    if-ne p1, v5, :cond_3

    .line 199
    new-instance p1, Lio/sentry/connection/TooManyRequestsException;

    const-string v5, "Too many requests to Sentry: https://docs.sentry.io/learn/quotas/"

    invoke-direct {p1, v5, v1, v2, v4}, Lio/sentry/connection/TooManyRequestsException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Long;Ljava/lang/Integer;)V

    throw p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catch_2
    move-object v4, v3

    .line 208
    :catch_3
    :cond_3
    :try_start_6
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 210
    invoke-direct {p0, p1}, Lio/sentry/connection/HttpConnection;->getErrorMessageFromStream(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v3

    :cond_4
    if-eqz v3, :cond_5

    .line 212
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_5
    const-string v3, "An exception occurred while submitting the event to the Sentry server."

    .line 216
    :cond_6
    new-instance p1, Lio/sentry/connection/ConnectionException;

    invoke-direct {p1, v3, v1, v2, v4}, Lio/sentry/connection/ConnectionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Long;Ljava/lang/Integer;)V

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 218
    :goto_1
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    throw p1
.end method

.method protected getConnection()Ljava/net/HttpURLConnection;
    .locals 3

    .line 130
    :try_start_0
    iget-object v0, p0, Lio/sentry/connection/HttpConnection;->proxy:Ljava/net/Proxy;

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, p0, Lio/sentry/connection/HttpConnection;->sentryUrl:Ljava/net/URL;

    iget-object v1, p0, Lio/sentry/connection/HttpConnection;->proxy:Ljava/net/Proxy;

    invoke-virtual {v0, v1}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    goto :goto_0

    .line 133
    :cond_0
    iget-object v0, p0, Lio/sentry/connection/HttpConnection;->sentryUrl:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    .line 136
    :goto_0
    iget-boolean v1, p0, Lio/sentry/connection/HttpConnection;->bypassSecurity:Z

    if-eqz v1, :cond_1

    instance-of v1, v0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v1, :cond_1

    .line 137
    move-object v1, v0

    check-cast v1, Ljavax/net/ssl/HttpsURLConnection;

    sget-object v2, Lio/sentry/connection/HttpConnection;->NAIVE_VERIFIER:Ljavax/net/ssl/HostnameVerifier;

    invoke-virtual {v1, v2}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    :cond_1
    const-string v1, "POST"

    .line 139
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 140
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 141
    iget v1, p0, Lio/sentry/connection/HttpConnection;->connectionTimeout:I

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 142
    iget v1, p0, Lio/sentry/connection/HttpConnection;->readTimeout:I

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const-string v1, "User-Agent"

    .line 143
    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->getSentryName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "X-Sentry-Auth"

    .line 144
    invoke-virtual {p0}, Lio/sentry/connection/HttpConnection;->getAuthHeader()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    iget-object v1, p0, Lio/sentry/connection/HttpConnection;->marshaller:Lio/sentry/marshaller/Marshaller;

    invoke-interface {v1}, Lio/sentry/marshaller/Marshaller;->getContentType()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v1, "Content-Type"

    .line 147
    iget-object v2, p0, Lio/sentry/connection/HttpConnection;->marshaller:Lio/sentry/marshaller/Marshaller;

    invoke-interface {v2}, Lio/sentry/marshaller/Marshaller;->getContentType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    :cond_2
    iget-object v1, p0, Lio/sentry/connection/HttpConnection;->marshaller:Lio/sentry/marshaller/Marshaller;

    invoke-interface {v1}, Lio/sentry/marshaller/Marshaller;->getContentEncoding()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v1, "Content-Encoding"

    .line 151
    iget-object v2, p0, Lio/sentry/connection/HttpConnection;->marshaller:Lio/sentry/marshaller/Marshaller;

    invoke-interface {v2}, Lio/sentry/marshaller/Marshaller;->getContentEncoding()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    return-object v0

    :catch_0
    move-exception v0

    .line 156
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Couldn\'t set up a connection to the Sentry server."

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public setBypassSecurity(Z)V
    .locals 0

    .line 279
    iput-boolean p1, p0, Lio/sentry/connection/HttpConnection;->bypassSecurity:Z

    return-void
.end method

.method public setConnectionTimeout(I)V
    .locals 0

    .line 261
    iput p1, p0, Lio/sentry/connection/HttpConnection;->connectionTimeout:I

    return-void
.end method

.method public setMarshaller(Lio/sentry/marshaller/Marshaller;)V
    .locals 0

    .line 275
    iput-object p1, p0, Lio/sentry/connection/HttpConnection;->marshaller:Lio/sentry/marshaller/Marshaller;

    return-void
.end method

.method public setReadTimeout(I)V
    .locals 0

    .line 271
    iput p1, p0, Lio/sentry/connection/HttpConnection;->readTimeout:I

    return-void
.end method

.method public setTimeout(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 251
    iput p1, p0, Lio/sentry/connection/HttpConnection;->connectionTimeout:I

    return-void
.end method
