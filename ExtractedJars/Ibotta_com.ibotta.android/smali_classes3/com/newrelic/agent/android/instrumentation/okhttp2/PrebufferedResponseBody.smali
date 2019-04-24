.class public Lcom/newrelic/agent/android/instrumentation/okhttp2/PrebufferedResponseBody;
.super Lcom/squareup/okhttp/ResponseBody;
.source "PrebufferedResponseBody.java"


# instance fields
.field impl:Lcom/squareup/okhttp/ResponseBody;

.field private source:Lokio/BufferedSource;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/ResponseBody;Lokio/BufferedSource;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/squareup/okhttp/ResponseBody;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/PrebufferedResponseBody;->impl:Lcom/squareup/okhttp/ResponseBody;

    .line 19
    iput-object p2, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/PrebufferedResponseBody;->source:Lokio/BufferedSource;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/PrebufferedResponseBody;->impl:Lcom/squareup/okhttp/ResponseBody;

    invoke-virtual {v0}, Lcom/squareup/okhttp/ResponseBody;->close()V

    return-void
.end method

.method public contentLength()J
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/PrebufferedResponseBody;->source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->buffer()Lokio/Buffer;

    move-result-object v0

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v0

    return-wide v0
.end method

.method public contentType()Lcom/squareup/okhttp/MediaType;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/PrebufferedResponseBody;->impl:Lcom/squareup/okhttp/ResponseBody;

    invoke-virtual {v0}, Lcom/squareup/okhttp/ResponseBody;->contentType()Lcom/squareup/okhttp/MediaType;

    move-result-object v0

    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/okhttp2/PrebufferedResponseBody;->source:Lokio/BufferedSource;

    return-object v0
.end method
