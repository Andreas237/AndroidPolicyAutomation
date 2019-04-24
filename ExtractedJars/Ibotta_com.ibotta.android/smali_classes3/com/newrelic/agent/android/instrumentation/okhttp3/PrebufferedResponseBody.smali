.class public Lcom/newrelic/agent/android/instrumentation/okhttp3/PrebufferedResponseBody;
.super Lokhttp3/ResponseBody;
.source "PrebufferedResponseBody.java"


# instance fields
.field private final contentLength:J

.field private final impl:Lokhttp3/ResponseBody;

.field private final source:Lokio/BufferedSource;


# direct methods
.method public constructor <init>(Lokhttp3/ResponseBody;)V
    .locals 6

    .line 15
    invoke-direct {p0}, Lokhttp3/ResponseBody;-><init>()V

    .line 17
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v0

    .line 19
    new-instance v1, Lokio/Buffer;

    invoke-direct {v1}, Lokio/Buffer;-><init>()V

    .line 21
    :try_start_0
    invoke-interface {v0, v1}, Lokio/BufferedSource;->readAll(Lokio/Sink;)J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 24
    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    .line 27
    :goto_0
    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/PrebufferedResponseBody;->impl:Lokhttp3/ResponseBody;

    .line 28
    iput-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/PrebufferedResponseBody;->source:Lokio/BufferedSource;

    .line 29
    invoke-virtual {p1}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Lokio/BufferedSource;->buffer()Lokio/Buffer;

    move-result-object p1

    invoke-virtual {p1}, Lokio/Buffer;->size()J

    move-result-wide v0

    :goto_1
    iput-wide v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/PrebufferedResponseBody;->contentLength:J

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/PrebufferedResponseBody;->impl:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    return-void
.end method

.method public contentLength()J
    .locals 2

    .line 39
    iget-wide v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/PrebufferedResponseBody;->contentLength:J

    return-wide v0
.end method

.method public contentType()Lokhttp3/MediaType;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/PrebufferedResponseBody;->impl:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object v0

    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp3/PrebufferedResponseBody;->source:Lokio/BufferedSource;

    return-object v0
.end method
