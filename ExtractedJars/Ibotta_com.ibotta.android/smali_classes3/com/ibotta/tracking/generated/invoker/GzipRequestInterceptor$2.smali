.class Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor$2;
.super Lcom/squareup/okhttp/RequestBody;
.source "GzipRequestInterceptor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor;->gzip(Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/RequestBody;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor;

.field final synthetic val$body:Lcom/squareup/okhttp/RequestBody;


# direct methods
.method constructor <init>(Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor;Lcom/squareup/okhttp/RequestBody;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor$2;->this$0:Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor;

    iput-object p2, p0, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor$2;->val$body:Lcom/squareup/okhttp/RequestBody;

    invoke-direct {p0}, Lcom/squareup/okhttp/RequestBody;-><init>()V

    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public contentType()Lcom/squareup/okhttp/MediaType;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor$2;->val$body:Lcom/squareup/okhttp/RequestBody;

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

    .line 75
    new-instance v0, Lokio/GzipSink;

    invoke-direct {v0, p1}, Lokio/GzipSink;-><init>(Lokio/Sink;)V

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object p1

    .line 76
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor$2;->val$body:Lcom/squareup/okhttp/RequestBody;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/RequestBody;->writeTo(Lokio/BufferedSink;)V

    .line 77
    invoke-interface {p1}, Lokio/BufferedSink;->close()V

    return-void
.end method
