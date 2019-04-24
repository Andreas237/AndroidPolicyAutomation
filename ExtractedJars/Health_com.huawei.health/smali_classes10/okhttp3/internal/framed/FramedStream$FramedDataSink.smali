.class final Lokhttp3/internal/framed/FramedStream$FramedDataSink;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/Sink;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/framed/FramedStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "FramedDataSink"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final EMIT_BUFFER_SIZE:J = 0x4000L


# instance fields
.field private closed:Z

.field private finished:Z

.field private final sendBuffer:Lokio/Buffer;

.field final synthetic this$0:Lokhttp3/internal/framed/FramedStream;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 468
    const-class v0, Lokhttp3/internal/framed/FramedStream;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->$assertionsDisabled:Z

    return-void
.end method

.method constructor <init>(Lokhttp3/internal/framed/FramedStream;)V
    .locals 1

    .line 468
    iput-object p1, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 475
    new-instance v0, Lokio/Buffer;

    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    iput-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->sendBuffer:Lokio/Buffer;

    return-void
.end method

.method static synthetic access$200(Lokhttp3/internal/framed/FramedStream$FramedDataSink;)Z
    .locals 1

    .line 468
    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->finished:Z

    return v0
.end method

.method static synthetic access$202(Lokhttp3/internal/framed/FramedStream$FramedDataSink;Z)Z
    .locals 0

    .line 468
    iput-boolean p1, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->finished:Z

    return p1
.end method

.method static synthetic access$400(Lokhttp3/internal/framed/FramedStream$FramedDataSink;)Z
    .locals 1

    .line 468
    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->closed:Z

    return v0
.end method

.method private emitDataFrame(Z)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 498
    iget-object v8, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    monitor-enter v8

    .line 499
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$1100(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedStream$StreamTimeout;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream$StreamTimeout;->enter()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 501
    :goto_0
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    iget-wide v0, v0, Lokhttp3/internal/framed/FramedStream;->bytesLeftInWriteWindow:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->finished:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->closed:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$800(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/ErrorCode;

    move-result-object v0

    if-nez v0, :cond_0

    .line 502
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$900(Lokhttp3/internal/framed/FramedStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 505
    :cond_0
    :try_start_2
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$1100(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedStream$StreamTimeout;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream$StreamTimeout;->exitAndThrowIfTimedOut()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 506
    goto :goto_1

    .line 505
    :catchall_0
    move-exception v9

    :try_start_3
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$1100(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedStream$StreamTimeout;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream$StreamTimeout;->exitAndThrowIfTimedOut()V

    throw v9

    .line 508
    :goto_1
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$1200(Lokhttp3/internal/framed/FramedStream;)V

    .line 509
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    iget-wide v0, v0, Lokhttp3/internal/framed/FramedStream;->bytesLeftInWriteWindow:J

    iget-object v2, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->sendBuffer:Lokio/Buffer;

    invoke-virtual {v2}, Lokio/Buffer;->size()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    .line 510
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    iget-wide v1, v0, Lokhttp3/internal/framed/FramedStream;->bytesLeftInWriteWindow:J

    sub-long/2addr v1, v6

    iput-wide v1, v0, Lokhttp3/internal/framed/FramedStream;->bytesLeftInWriteWindow:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 511
    monitor-exit v8

    goto :goto_2

    :catchall_1
    move-exception v10

    monitor-exit v8

    throw v10

    .line 513
    :goto_2
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$1100(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedStream$StreamTimeout;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream$StreamTimeout;->enter()V

    .line 515
    :try_start_4
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$500(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedConnection;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v1}, Lokhttp3/internal/framed/FramedStream;->access$600(Lokhttp3/internal/framed/FramedStream;)I

    move-result v1

    if-eqz p1, :cond_1

    iget-object v2, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->sendBuffer:Lokio/Buffer;

    invoke-virtual {v2}, Lokio/Buffer;->size()J

    move-result-wide v2

    cmp-long v2, v6, v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_3

    :cond_1
    const/4 v2, 0x0

    :goto_3
    iget-object v3, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->sendBuffer:Lokio/Buffer;

    move-wide v4, v6

    invoke-virtual/range {v0 .. v5}, Lokhttp3/internal/framed/FramedConnection;->writeData(IZLokio/Buffer;J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 517
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$1100(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedStream$StreamTimeout;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream$StreamTimeout;->exitAndThrowIfTimedOut()V

    .line 518
    goto :goto_4

    .line 517
    :catchall_2
    move-exception v11

    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$1100(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedStream$StreamTimeout;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream$StreamTimeout;->exitAndThrowIfTimedOut()V

    throw v11

    .line 519
    :goto_4
    return-void
.end method


# virtual methods
.method public close()V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 537
    sget-boolean v0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 538
    :cond_0
    iget-object v6, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    monitor-enter v6

    .line 539
    :try_start_0
    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->closed:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit v6

    return-void

    .line 540
    :cond_1
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 541
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    iget-object v0, v0, Lokhttp3/internal/framed/FramedStream;->sink:Lokhttp3/internal/framed/FramedStream$FramedDataSink;

    iget-boolean v0, v0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->finished:Z

    if-nez v0, :cond_3

    .line 543
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->sendBuffer:Lokio/Buffer;

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 544
    :goto_1
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->sendBuffer:Lokio/Buffer;

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 545
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->emitDataFrame(Z)V

    goto :goto_1

    .line 549
    :cond_2
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$500(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedConnection;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v1}, Lokhttp3/internal/framed/FramedStream;->access$600(Lokhttp3/internal/framed/FramedStream;)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lokhttp3/internal/framed/FramedConnection;->writeData(IZLokio/Buffer;J)V

    .line 552
    :cond_3
    iget-object v6, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    monitor-enter v6

    .line 553
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->closed:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 554
    monitor-exit v6

    goto :goto_2

    :catchall_1
    move-exception v8

    monitor-exit v6

    throw v8

    .line 555
    :goto_2
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$500(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedConnection;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedConnection;->flush()V

    .line 556
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$1000(Lokhttp3/internal/framed/FramedStream;)V

    .line 557
    return-void
.end method

.method public flush()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 522
    sget-boolean v0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 523
    :cond_0
    iget-object v4, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    monitor-enter v4

    .line 524
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$1200(Lokhttp3/internal/framed/FramedStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 525
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 526
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->sendBuffer:Lokio/Buffer;

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 527
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->emitDataFrame(Z)V

    .line 528
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$500(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedConnection;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedConnection;->flush()V

    goto :goto_0

    .line 530
    :cond_1
    return-void
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 533
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$1100(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedStream$StreamTimeout;

    move-result-object v0

    return-object v0
.end method

.method public write(Lokio/Buffer;J)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 485
    sget-boolean v0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 486
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->sendBuffer:Lokio/Buffer;

    invoke-virtual {v0, p1, p2, p3}, Lokio/Buffer;->write(Lokio/Buffer;J)V

    .line 487
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->sendBuffer:Lokio/Buffer;

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x4000

    cmp-long v0, v0, v2

    if-ltz v0, :cond_1

    .line 488
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lokhttp3/internal/framed/FramedStream$FramedDataSink;->emitDataFrame(Z)V

    goto :goto_0

    .line 490
    :cond_1
    return-void
.end method
