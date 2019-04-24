.class final Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;
.super Ljava/lang/Object;
.source "SpdyStream.java"

# interfaces
.implements Lokio/Sink;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/spdy/SpdyStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "SpdyDataSink"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private closed:Z

.field private finished:Z

.field final synthetic this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 470
    const-class v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    return-void
.end method

.method constructor <init>(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)V
    .locals 0

    .line 470
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$200(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;)Z
    .locals 0

    .line 470
    iget-boolean p0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->finished:Z

    return p0
.end method

.method static synthetic access$202(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;Z)Z
    .locals 0

    .line 470
    iput-boolean p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->finished:Z

    return p1
.end method

.method static synthetic access$400(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;)Z
    .locals 0

    .line 470
    iget-boolean p0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->closed:Z

    return p0
.end method


# virtual methods
.method public close()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 517
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    monitor-enter v0

    .line 518
    :try_start_0
    iget-boolean v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->closed:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 519
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 520
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->sink:Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;

    iget-boolean v0, v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->finished:Z

    if-nez v0, :cond_1

    .line 521
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$500(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object v1

    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$600(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->writeData(IZLokio/Buffer;J)V

    .line 523
    :cond_1
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    monitor-enter v1

    const/4 v0, 0x1

    .line 524
    :try_start_1
    iput-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->closed:Z

    .line 525
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 526
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$500(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->flush()V

    .line 527
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$1000(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)V

    return-void

    :catchall_0
    move-exception v0

    .line 525
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    .line 519
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public flush()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 505
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    monitor-enter v0

    .line 506
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$1200(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)V

    .line 507
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 508
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$500(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->flush()V

    return-void

    :catchall_0
    move-exception v1

    .line 507
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 512
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$1100(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyTimeout;

    move-result-object v0

    return-object v0
.end method

.method public write(Lokio/Buffer;J)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_1

    .line 483
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    monitor-enter v2

    .line 484
    :try_start_0
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v3}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$1100(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyTimeout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyTimeout;->enter()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 486
    :goto_1
    :try_start_1
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    iget-wide v3, v3, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->bytesLeftInWriteWindow:J

    cmp-long v3, v3, v0

    if-gtz v3, :cond_0

    iget-boolean v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->finished:Z

    if-nez v3, :cond_0

    iget-boolean v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->closed:Z

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v3}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$800(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v3

    if-nez v3, :cond_0

    .line 487
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v3}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$900(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 490
    :cond_0
    :try_start_2
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$1100(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyTimeout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyTimeout;->exitAndThrowIfTimedOut()V

    .line 493
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$1200(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)V

    .line 494
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    iget-wide v0, v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->bytesLeftInWriteWindow:J

    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    .line 495
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    iget-wide v3, v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->bytesLeftInWriteWindow:J

    sub-long/2addr v3, v7

    iput-wide v3, v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->bytesLeftInWriteWindow:J

    .line 496
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    sub-long/2addr p2, v7

    .line 499
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$500(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object v3

    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$600(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)I

    move-result v4

    const/4 v5, 0x0

    move-object v6, p1

    invoke-virtual/range {v3 .. v8}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->writeData(IZLokio/Buffer;J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 490
    :try_start_3
    iget-object p2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSink;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {p2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$1100(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyTimeout;

    move-result-object p2

    invoke-virtual {p2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyTimeout;->exitAndThrowIfTimedOut()V

    throw p1

    :catchall_1
    move-exception p1

    .line 496
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :cond_1
    return-void
.end method
