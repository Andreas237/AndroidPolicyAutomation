.class Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor$1;
.super Lcom/squareup/okhttp/RequestBody;
.source "GzipRequestInterceptor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor;->forceContentLength(Lcom/squareup/okhttp/RequestBody;)Lcom/squareup/okhttp/RequestBody;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor;

.field final synthetic val$buffer:Lokio/Buffer;

.field final synthetic val$requestBody:Lcom/squareup/okhttp/RequestBody;


# direct methods
.method constructor <init>(Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor;Lcom/squareup/okhttp/RequestBody;Lokio/Buffer;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor$1;->this$0:Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor;

    iput-object p2, p0, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor$1;->val$requestBody:Lcom/squareup/okhttp/RequestBody;

    iput-object p3, p0, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor$1;->val$buffer:Lokio/Buffer;

    invoke-direct {p0}, Lcom/squareup/okhttp/RequestBody;-><init>()V

    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 54
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor$1;->val$buffer:Lokio/Buffer;

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v0

    return-wide v0
.end method

.method public contentType()Lcom/squareup/okhttp/MediaType;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor$1;->val$requestBody:Lcom/squareup/okhttp/RequestBody;

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

    .line 59
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/GzipRequestInterceptor$1;->val$buffer:Lokio/Buffer;

    invoke-virtual {v0}, Lokio/Buffer;->snapshot()Lokio/ByteString;

    move-result-object v0

    invoke-interface {p1, v0}, Lokio/BufferedSink;->write(Lokio/ByteString;)Lokio/BufferedSink;

    return-void
.end method
