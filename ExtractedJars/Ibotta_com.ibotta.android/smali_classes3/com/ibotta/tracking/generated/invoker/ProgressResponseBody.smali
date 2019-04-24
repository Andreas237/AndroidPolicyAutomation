.class public Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;
.super Lcom/squareup/okhttp/ResponseBody;
.source "ProgressResponseBody.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;
    }
.end annotation


# instance fields
.field private bufferedSource:Lokio/BufferedSource;

.field private final progressListener:Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;

.field private final responseBody:Lcom/squareup/okhttp/ResponseBody;


# direct methods
.method public constructor <init>(Lcom/squareup/okhttp/ResponseBody;Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/squareup/okhttp/ResponseBody;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;->responseBody:Lcom/squareup/okhttp/ResponseBody;

    .line 39
    iput-object p2, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;->progressListener:Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;)Lcom/squareup/okhttp/ResponseBody;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;->responseBody:Lcom/squareup/okhttp/ResponseBody;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;)Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;->progressListener:Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;

    return-object p0
.end method

.method private source(Lokio/Source;)Lokio/Source;
    .locals 1

    .line 61
    new-instance v0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$1;-><init>(Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;Lokio/Source;)V

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
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;->responseBody:Lcom/squareup/okhttp/ResponseBody;

    invoke-virtual {v0}, Lcom/squareup/okhttp/ResponseBody;->contentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public contentType()Lcom/squareup/okhttp/MediaType;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;->responseBody:Lcom/squareup/okhttp/ResponseBody;

    invoke-virtual {v0}, Lcom/squareup/okhttp/ResponseBody;->contentType()Lcom/squareup/okhttp/MediaType;

    move-result-object v0

    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;->bufferedSource:Lokio/BufferedSource;

    if-nez v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;->responseBody:Lcom/squareup/okhttp/ResponseBody;

    invoke-virtual {v0}, Lcom/squareup/okhttp/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;->source(Lokio/Source;)Lokio/Source;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;->bufferedSource:Lokio/BufferedSource;

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody;->bufferedSource:Lokio/BufferedSource;

    return-object v0
.end method
