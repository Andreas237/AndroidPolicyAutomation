.class public Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody;
.super Lcom/squareup/okhttp/RequestBody;
.source "ProgressRequestBody.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;
    }
.end annotation


# instance fields
.field private final progressListener:Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;

.field private final requestBody:Lcom/squareup/okhttp/RequestBody;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/RequestBody;Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/squareup/okhttp/RequestBody;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody;->requestBody:Lcom/squareup/okhttp/RequestBody;

    .line 39
    iput-object p2, p0, Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody;->progressListener:Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody;)Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody;->progressListener:Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$ProgressRequestListener;

    return-object p0
.end method

.method private sink(Lokio/Sink;)Lokio/Sink;
    .locals 1

    .line 60
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody$1;-><init>(Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody;Lokio/Sink;)V

    return-object v0
.end method


# virtual methods
.method public contentLength()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody;->requestBody:Lcom/squareup/okhttp/RequestBody;

    invoke-virtual {v0}, Lcom/squareup/okhttp/RequestBody;->contentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public contentType()Lcom/squareup/okhttp/MediaType;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody;->requestBody:Lcom/squareup/okhttp/RequestBody;

    invoke-virtual {v0}, Lcom/squareup/okhttp/RequestBody;->contentType()Lcom/squareup/okhttp/MediaType;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lokio/BufferedSink;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 54
    invoke-direct {p0, p1}, Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody;->sink(Lokio/Sink;)Lokio/Sink;

    move-result-object p1

    invoke-static {p1}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object p1

    .line 55
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ProgressRequestBody;->requestBody:Lcom/squareup/okhttp/RequestBody;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/RequestBody;->writeTo(Lokio/BufferedSink;)V

    .line 56
    invoke-interface {p1}, Lokio/BufferedSink;->flush()V

    return-void
.end method
