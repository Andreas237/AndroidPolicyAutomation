.class final Lokhttp3/internal/http/Http1xStream$ChunkedSink;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/Sink;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http/Http1xStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "ChunkedSink"
.end annotation


# instance fields
.field private closed:Z

.field final synthetic this$0:Lokhttp3/internal/http/Http1xStream;

.field private final timeout:Lokio/ForwardingTimeout;


# direct methods
.method private constructor <init>(Lokhttp3/internal/http/Http1xStream;)V
    .locals 2

    .line 308
    iput-object p1, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 309
    new-instance v0, Lokio/ForwardingTimeout;

    iget-object v1, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    invoke-static {v1}, Lokhttp3/internal/http/Http1xStream;->access$300(Lokhttp3/internal/http/Http1xStream;)Lokio/BufferedSink;

    move-result-object v1

    invoke-interface {v1}, Lokio/BufferedSink;->timeout()Lokio/Timeout;

    move-result-object v1

    invoke-direct {v0, v1}, Lokio/ForwardingTimeout;-><init>(Lokio/Timeout;)V

    iput-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->timeout:Lokio/ForwardingTimeout;

    return-void
.end method

.method synthetic constructor <init>(Lokhttp3/internal/http/Http1xStream;Lokhttp3/internal/http/Http1xStream$1;)V
    .locals 0

    .line 308
    invoke-direct {p0, p1}, Lokhttp3/internal/http/Http1xStream$ChunkedSink;-><init>(Lokhttp3/internal/http/Http1xStream;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 332
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->closed:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    .line 333
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->closed:Z

    .line 334
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$300(Lokhttp3/internal/http/Http1xStream;)Lokio/BufferedSink;

    move-result-object v0

    const-string v1, "0\r\n\r\n"

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 335
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    iget-object v1, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->timeout:Lokio/ForwardingTimeout;

    invoke-static {v0, v1}, Lokhttp3/internal/http/Http1xStream;->access$400(Lokhttp3/internal/http/Http1xStream;Lokio/ForwardingTimeout;)V

    .line 336
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lokhttp3/internal/http/Http1xStream;->access$502(Lokhttp3/internal/http/Http1xStream;I)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 337
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public declared-synchronized flush()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 327
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->closed:Z

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    .line 328
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$300(Lokhttp3/internal/http/Http1xStream;)Lokio/BufferedSink;

    move-result-object v0

    invoke-interface {v0}, Lokio/BufferedSink;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 329
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 313
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->timeout:Lokio/ForwardingTimeout;

    return-object v0
.end method

.method public write(Lokio/Buffer;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 317
    iget-boolean v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->closed:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 318
    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_1

    return-void

    .line 320
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$300(Lokhttp3/internal/http/Http1xStream;)Lokio/BufferedSink;

    move-result-object v0

    invoke-interface {v0, p2, p3}, Lokio/BufferedSink;->writeHexadecimalUnsignedLong(J)Lokio/BufferedSink;

    .line 321
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$300(Lokhttp3/internal/http/Http1xStream;)Lokio/BufferedSink;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 322
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$300(Lokhttp3/internal/http/Http1xStream;)Lokio/BufferedSink;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lokio/BufferedSink;->write(Lokio/Buffer;J)V

    .line 323
    iget-object v0, p0, Lokhttp3/internal/http/Http1xStream$ChunkedSink;->this$0:Lokhttp3/internal/http/Http1xStream;

    invoke-static {v0}, Lokhttp3/internal/http/Http1xStream;->access$300(Lokhttp3/internal/http/Http1xStream;)Lokio/BufferedSink;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Lokio/BufferedSink;->writeUtf8(Ljava/lang/String;)Lokio/BufferedSink;

    .line 324
    return-void
.end method
