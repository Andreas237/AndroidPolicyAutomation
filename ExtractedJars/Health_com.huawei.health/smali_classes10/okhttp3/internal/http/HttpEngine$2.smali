.class Lokhttp3/internal/http/HttpEngine$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/Source;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/http/HttpEngine;->cacheWritingResponse(Lokhttp3/internal/http/CacheRequest;Lokhttp3/Response;)Lokhttp3/Response;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field cacheRequestClosed:Z

.field final synthetic this$0:Lokhttp3/internal/http/HttpEngine;

.field final synthetic val$cacheBody:Lokio/BufferedSink;

.field final synthetic val$cacheRequest:Lokhttp3/internal/http/CacheRequest;

.field final synthetic val$source:Lokio/BufferedSource;


# direct methods
.method constructor <init>(Lokhttp3/internal/http/HttpEngine;Lokio/BufferedSource;Lokhttp3/internal/http/CacheRequest;Lokio/BufferedSink;)V
    .locals 0

    .line 759
    iput-object p1, p0, Lokhttp3/internal/http/HttpEngine$2;->this$0:Lokhttp3/internal/http/HttpEngine;

    iput-object p2, p0, Lokhttp3/internal/http/HttpEngine$2;->val$source:Lokio/BufferedSource;

    iput-object p3, p0, Lokhttp3/internal/http/HttpEngine$2;->val$cacheRequest:Lokhttp3/internal/http/CacheRequest;

    iput-object p4, p0, Lokhttp3/internal/http/HttpEngine$2;->val$cacheBody:Lokio/BufferedSink;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 792
    iget-boolean v0, p0, Lokhttp3/internal/http/HttpEngine$2;->cacheRequestClosed:Z

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 793
    const/16 v1, 0x64

    invoke-static {p0, v1, v0}, Lokhttp3/internal/Util;->discard(Lokio/Source;ILjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 794
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/http/HttpEngine$2;->cacheRequestClosed:Z

    .line 795
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$2;->val$cacheRequest:Lokhttp3/internal/http/CacheRequest;

    invoke-interface {v0}, Lokhttp3/internal/http/CacheRequest;->abort()V

    .line 797
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$2;->val$source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->close()V

    .line 798
    return-void
.end method

.method public read(Lokio/Buffer;J)J
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 765
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$2;->val$source:Lokio/BufferedSource;

    invoke-interface {v0, p1, p2, p3}, Lokio/BufferedSource;->read(Lokio/Buffer;J)J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v6

    .line 772
    goto :goto_0

    .line 766
    :catch_0
    move-exception v8

    .line 767
    iget-boolean v0, p0, Lokhttp3/internal/http/HttpEngine$2;->cacheRequestClosed:Z

    if-nez v0, :cond_0

    .line 768
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/http/HttpEngine$2;->cacheRequestClosed:Z

    .line 769
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$2;->val$cacheRequest:Lokhttp3/internal/http/CacheRequest;

    invoke-interface {v0}, Lokhttp3/internal/http/CacheRequest;->abort()V

    .line 771
    :cond_0
    throw v8

    .line 774
    :goto_0
    const-wide/16 v0, -0x1

    cmp-long v0, v6, v0

    if-nez v0, :cond_2

    .line 775
    iget-boolean v0, p0, Lokhttp3/internal/http/HttpEngine$2;->cacheRequestClosed:Z

    if-nez v0, :cond_1

    .line 776
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/http/HttpEngine$2;->cacheRequestClosed:Z

    .line 777
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$2;->val$cacheBody:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->close()V

    .line 779
    :cond_1
    const-wide/16 v0, -0x1

    return-wide v0

    .line 782
    :cond_2
    move-object v0, p1

    iget-object v1, p0, Lokhttp3/internal/http/HttpEngine$2;->val$cacheBody:Lokio/BufferedSink;

    invoke-interface {v1}, Lokio/BufferedSink;->buffer()Lokio/Buffer;

    move-result-object v1

    invoke-virtual {p1}, Lokio/Buffer;->size()J

    move-result-wide v2

    sub-long/2addr v2, v6

    move-wide v4, v6

    invoke-virtual/range {v0 .. v5}, Lokio/Buffer;->copyTo(Lokio/Buffer;JJ)Lokio/Buffer;

    .line 783
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$2;->val$cacheBody:Lokio/BufferedSink;

    invoke-interface {v0}, Lokio/BufferedSink;->emitCompleteSegments()Lokio/BufferedSink;

    .line 784
    return-wide v6
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 788
    iget-object v0, p0, Lokhttp3/internal/http/HttpEngine$2;->val$source:Lokio/BufferedSource;

    invoke-interface {v0}, Lokio/BufferedSource;->timeout()Lokio/Timeout;

    move-result-object v0

    return-object v0
.end method
