.class public Lcom/newrelic/agent/android/harvest/HarvestConnection;
.super Ljava/lang/Object;
.source "HarvestConnection.java"

# interfaces
.implements Lcom/newrelic/agent/android/harvest/type/HarvestErrorCodes;


# static fields
.field private static final COLLECTOR_CONNECT_URI:Ljava/lang/String; = "/mobile/v4/connect"

.field private static final COLLECTOR_DATA_URI:Ljava/lang/String; = "/mobile/v3/data"

.field private static final CONNECTION_TIMEOUT:I

.field private static final DISABLE_COMPRESSION_FOR_DEBUGGING:Ljava/lang/Boolean;

.field private static final MAX_PLAINTEXT_MESSAGE_SIZE:I = 0x200

.field private static final RESPONSE_BUFFER_SIZE:I = 0x2000

.field private static final TIMEOUT_IN_SECONDS:I = 0x14


# instance fields
.field private applicationToken:Ljava/lang/String;

.field private collectorHost:Ljava/lang/String;

.field private connectInformation:Lcom/newrelic/agent/android/harvest/ConnectInformation;

.field private final log:Lcom/newrelic/agent/android/logging/AgentLog;

.field private serverTimestamp:J

.field private useSsl:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    .line 33
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->DISABLE_COMPRESSION_FOR_DEBUGGING:Ljava/lang/Boolean;

    .line 36
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x14

    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    long-to-int v1, v0

    sput v1, Lcom/newrelic/agent/android/harvest/HarvestConnection;->CONNECTION_TIMEOUT:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    iput-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method private deflate(Ljava/lang/String;)[B
    .locals 7

    .line 207
    new-instance v0, Ljava/util/zip/Deflater;

    invoke-direct {v0}, Ljava/util/zip/Deflater;-><init>()V

    .line 209
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/zip/Deflater;->setInput([B)V

    .line 210
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->finish()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 212
    :try_start_1
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v2, 0x0

    const/16 v3, 0x2000

    .line 213
    :try_start_2
    new-array v3, v3, [B

    .line 214
    :goto_0
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->finished()Z

    move-result v4

    if-nez v4, :cond_1

    .line 215
    invoke-virtual {v0, v3}, Ljava/util/zip/Deflater;->deflate([B)I

    move-result v4

    if-gtz v4, :cond_0

    .line 217
    iget-object v5, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v6, "HTTP request contains an incomplete payload"

    invoke-interface {v5, v6}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :cond_0
    const/4 v5, 0x0

    .line 219
    invoke-virtual {v1, v3, v5, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 221
    :cond_1
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 223
    :try_start_3
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 226
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->end()V

    return-object v2

    :catchall_0
    move-exception v3

    goto :goto_1

    :catch_0
    move-exception v2

    .line 212
    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    if-eqz v2, :cond_2

    .line 223
    :try_start_5
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catch_1
    move-exception v1

    :try_start_6
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    :goto_2
    throw v3
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 226
    :catch_2
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->end()V

    .line 229
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    return-object p1

    :catchall_1
    move-exception p1

    .line 226
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->end()V

    throw p1
.end method

.method private getCollectorConnectUri()Ljava/lang/String;
    .locals 1

    const-string v0, "/mobile/v4/connect"

    .line 268
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->getCollectorUri(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getCollectorDataUri()Ljava/lang/String;
    .locals 1

    const-string v0, "/mobile/v3/data"

    .line 272
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->getCollectorUri(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getCollectorUri(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 263
    iget-boolean v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->useSsl:Z

    if-eqz v0, :cond_0

    const-string v0, "https://"

    goto :goto_0

    :cond_0
    const-string v0, "http://"

    .line 264
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->collectorHost:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private recordCollectorError(Ljava/lang/Exception;)V
    .locals 3

    .line 258
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HarvestConnection: Attempting to convert network exception "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " to error code."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 259
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Supportability/AgentHealth/Collector/ResponseErrorCodes/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/newrelic/agent/android/util/ExceptionHelper;->exceptionToErrorCode(Ljava/lang/Exception;)I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/stats/StatsEngine;->inc(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public createConnectPost()Ljava/net/HttpURLConnection;
    .locals 1

    .line 191
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->getCollectorConnectUri()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->createPost(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0
.end method

.method public createDataPost()Ljava/net/HttpURLConnection;
    .locals 1

    .line 200
    invoke-direct {p0}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->getCollectorDataUri()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->createPost(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0
.end method

.method public createPost(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 6

    const/4 v0, 0x0

    .line 65
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 66
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    check-cast p1, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v0, "POST"

    .line 68
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 69
    sget v0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->CONNECTION_TIMEOUT:I

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 70
    sget v0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->CONNECTION_TIMEOUT:I

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const/4 v0, 0x1

    .line 71
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 72
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    const/4 v0, 0x0

    .line 73
    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    const-string v0, "X-App-License-Key"

    .line 74
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->applicationToken:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Content-Type"

    const-string v1, "application/json"

    .line 75
    invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "http.agent"

    .line 77
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    const-string v1, "User-Agent"

    .line 79
    invoke-virtual {p1, v1, v0}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    :cond_0
    iget-wide v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->serverTimestamp:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    const-string v0, "X-NewRelic-Connect-Time"

    .line 83
    iget-wide v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->serverTimestamp:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception p1

    move-object v5, v0

    move-object v0, p1

    move-object p1, v5

    .line 87
    :goto_0
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object v1

    const-string v2, "Supportability/AgentHealth/Collector/connection/errors"

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/stats/StatsEngine;->inc(Ljava/lang/String;)V

    .line 88
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to create data POST: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    :cond_1
    :goto_1
    return-object p1
.end method

.method public readResponse(Ljava/net/HttpURLConnection;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 251
    :try_start_0
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->readStream(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 253
    :catch_0
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->readStream(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method readStream(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 233
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p1, :cond_2

    const/16 v1, 0x2000

    .line 235
    new-array v1, v1, [C

    .line 236
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-direct {v3, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    const/4 p1, 0x0

    .line 238
    :goto_0
    :try_start_0
    invoke-virtual {v2, v1}, Ljava/io/BufferedReader;->read([C)I

    move-result v3
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gez v3, :cond_0

    .line 242
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V

    goto :goto_3

    :cond_0
    const/4 v4, 0x0

    .line 240
    :try_start_1
    invoke-virtual {v0, v1, v4, v3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 236
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    if-eqz p1, :cond_1

    .line 242
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-exception v1

    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V

    :goto_2
    throw v0

    .line 245
    :cond_2
    :goto_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public send(Ljava/net/HttpURLConnection;Ljava/lang/String;)Lcom/newrelic/agent/android/harvest/HarvestResponse;
    .locals 7

    .line 102
    new-instance v0, Lcom/newrelic/agent/android/harvest/HarvestResponse;

    invoke-direct {v0}, Lcom/newrelic/agent/android/harvest/HarvestResponse;-><init>()V

    .line 103
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x200

    if-le v1, v2, :cond_1

    sget-object v1, Lcom/newrelic/agent/android/harvest/HarvestConnection;->DISABLE_COMPRESSION_FOR_DEBUGGING:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "deflate"

    goto :goto_1

    :cond_1
    :goto_0
    const-string v1, "identity"

    :goto_1
    const/4 v2, 0x0

    .line 106
    :try_start_0
    new-instance v3, Lcom/newrelic/agent/android/stats/TicToc;

    invoke-direct {v3}, Lcom/newrelic/agent/android/stats/TicToc;-><init>()V

    .line 107
    invoke-virtual {v3}, Lcom/newrelic/agent/android/stats/TicToc;->tic()V

    const-string v4, "deflate"

    .line 110
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 111
    invoke-direct {p0, p2}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->deflate(Ljava/lang/String;)[B

    move-result-object p2

    invoke-static {p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p2

    goto :goto_2

    .line 113
    :cond_2
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    invoke-static {p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p2

    .line 116
    :goto_2
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v4

    array-length v4, v4

    invoke-virtual {p1, v4}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    const-string v4, "Content-Encoding"

    .line 117
    invoke-virtual {p1, v4, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    new-instance v1, Ljava/io/BufferedOutputStream;

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 120
    :try_start_1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/io/BufferedOutputStream;->write([B)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->close()V

    .line 123
    invoke-virtual {v3}, Lcom/newrelic/agent/android/stats/TicToc;->toc()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->setResponseTime(J)V

    .line 124
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->setStatusCode(I)V

    .line 125
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->readResponse(Ljava/net/HttpURLConnection;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/newrelic/agent/android/harvest/HarvestResponse;->setResponseBody(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_5

    :catchall_0
    move-exception p2

    move-object v3, v2

    goto :goto_3

    :catch_0
    move-exception p2

    .line 119
    :try_start_3
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v3

    move-object v6, v3

    move-object v3, p2

    move-object p2, v6

    :goto_3
    if-eqz v3, :cond_3

    .line 121
    :try_start_4
    invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_4

    :catch_1
    move-exception v1

    :try_start_5
    invoke-virtual {v3, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_3
    invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->close()V

    :goto_4
    throw p2
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p2

    goto :goto_6

    :catch_2
    move-exception p2

    .line 132
    :try_start_6
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to send POST to collector: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 133
    invoke-direct {p0, p2}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->recordCollectorError(Ljava/lang/Exception;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 137
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object v2

    :catch_3
    move-exception p2

    .line 128
    :try_start_7
    iget-object v1, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to retrieve collector response: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 129
    invoke-direct {p0, p2}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->recordCollectorError(Ljava/lang/Exception;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 137
    :goto_5
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object v0

    :goto_6
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    throw p2
.end method

.method public sendConnect()Lcom/newrelic/agent/android/harvest/HarvestResponse;
    .locals 6

    .line 150
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->connectInformation:Lcom/newrelic/agent/android/harvest/ConnectInformation;

    if-eqz v0, :cond_1

    .line 153
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->createConnectPost()Ljava/net/HttpURLConnection;

    move-result-object v0

    if-nez v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Failed to create connect POST"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    .line 159
    :cond_0
    new-instance v1, Lcom/newrelic/agent/android/stats/TicToc;

    invoke-direct {v1}, Lcom/newrelic/agent/android/stats/TicToc;-><init>()V

    .line 160
    invoke-virtual {v1}, Lcom/newrelic/agent/android/stats/TicToc;->tic()V

    .line 162
    iget-object v2, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->connectInformation:Lcom/newrelic/agent/android/harvest/ConnectInformation;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/ConnectInformation;->toJsonString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->send(Ljava/net/HttpURLConnection;Ljava/lang/String;)Lcom/newrelic/agent/android/harvest/HarvestResponse;

    move-result-object v0

    .line 164
    invoke-static {}, Lcom/newrelic/agent/android/stats/StatsEngine;->get()Lcom/newrelic/agent/android/stats/StatsEngine;

    move-result-object v2

    const-string v3, "Supportability/AgentHealth/Collector/Connect"

    invoke-virtual {v1}, Lcom/newrelic/agent/android/stats/TicToc;->toc()J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5}, Lcom/newrelic/agent/android/stats/StatsEngine;->sampleTimeMs(Ljava/lang/String;J)V

    return-object v0

    .line 151
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method

.method public sendData(Lcom/newrelic/agent/android/harvest/type/Harvestable;)Lcom/newrelic/agent/android/harvest/HarvestResponse;
    .locals 1

    if-eqz p1, :cond_1

    .line 177
    invoke-virtual {p0}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->createDataPost()Ljava/net/HttpURLConnection;

    move-result-object v0

    if-nez v0, :cond_0

    .line 179
    iget-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v0, "Failed to create data POST"

    invoke-interface {p1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    .line 182
    :cond_0
    invoke-interface {p1}, Lcom/newrelic/agent/android/harvest/type/Harvestable;->toJsonString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/newrelic/agent/android/harvest/HarvestConnection;->send(Ljava/net/HttpURLConnection;Ljava/lang/String;)Lcom/newrelic/agent/android/harvest/HarvestResponse;

    move-result-object p1

    return-object p1

    .line 175
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public setApplicationToken(Ljava/lang/String;)V
    .locals 0

    .line 285
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->applicationToken:Ljava/lang/String;

    return-void
.end method

.method public setCollectorHost(Ljava/lang/String;)V
    .locals 0

    .line 289
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->collectorHost:Ljava/lang/String;

    return-void
.end method

.method public setConnectInformation(Lcom/newrelic/agent/android/harvest/ConnectInformation;)V
    .locals 0

    .line 293
    iput-object p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->connectInformation:Lcom/newrelic/agent/android/harvest/ConnectInformation;

    return-void
.end method

.method public setServerTimestamp(J)V
    .locals 3

    .line 276
    iget-object v0, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Setting server timestamp: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 277
    iput-wide p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->serverTimestamp:J

    return-void
.end method

.method public useSsl(Z)V
    .locals 0

    .line 281
    iput-boolean p1, p0, Lcom/newrelic/agent/android/harvest/HarvestConnection;->useSsl:Z

    return-void
.end method
