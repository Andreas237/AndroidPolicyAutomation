.class final Lokhttp3/internal/framed/FramedStream$FramedDataSource;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/Source;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/framed/FramedStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "FramedDataSource"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private closed:Z

.field private finished:Z

.field private final maxByteCount:J

.field private final readBuffer:Lokio/Buffer;

.field private final receiveBuffer:Lokio/Buffer;

.field final synthetic this$0:Lokhttp3/internal/framed/FramedStream;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 313
    const-class v0, Lokhttp3/internal/framed/FramedStream;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->$assertionsDisabled:Z

    return-void
.end method

.method private constructor <init>(Lokhttp3/internal/framed/FramedStream;J)V
    .locals 1

    .line 332
    iput-object p1, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 315
    new-instance v0, Lokio/Buffer;

    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    iput-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->receiveBuffer:Lokio/Buffer;

    .line 318
    new-instance v0, Lokio/Buffer;

    invoke-direct {v0}, Lokio/Buffer;-><init>()V

    iput-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->readBuffer:Lokio/Buffer;

    .line 333
    iput-wide p2, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->maxByteCount:J

    .line 334
    return-void
.end method

.method synthetic constructor <init>(Lokhttp3/internal/framed/FramedStream;JLokhttp3/internal/framed/FramedStream$1;)V
    .locals 0

    .line 313
    invoke-direct {p0, p1, p2, p3}, Lokhttp3/internal/framed/FramedStream$FramedDataSource;-><init>(Lokhttp3/internal/framed/FramedStream;J)V

    return-void
.end method

.method static synthetic access$100(Lokhttp3/internal/framed/FramedStream$FramedDataSource;)Z
    .locals 1

    .line 313
    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->finished:Z

    return v0
.end method

.method static synthetic access$102(Lokhttp3/internal/framed/FramedStream$FramedDataSource;Z)Z
    .locals 0

    .line 313
    iput-boolean p1, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->finished:Z

    return p1
.end method

.method static synthetic access$300(Lokhttp3/internal/framed/FramedStream$FramedDataSource;)Z
    .locals 1

    .line 313
    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->closed:Z

    return v0
.end method

.method private checkNotClosed()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 437
    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->closed:Z

    if-eqz v0, :cond_0

    .line 438
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 440
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$800(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/ErrorCode;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 441
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "stream was reset: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v2}, Lokhttp3/internal/framed/FramedStream;->access$800(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/ErrorCode;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 443
    :cond_1
    return-void
.end method

.method private waitUntilReadable()V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 373
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$700(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedStream$StreamTimeout;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream$StreamTimeout;->enter()V

    .line 375
    :goto_0
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->readBuffer:Lokio/Buffer;

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->finished:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->closed:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$800(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/ErrorCode;

    move-result-object v0

    if-nez v0, :cond_0

    .line 376
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$900(Lokhttp3/internal/framed/FramedStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 379
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$700(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedStream$StreamTimeout;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream$StreamTimeout;->exitAndThrowIfTimedOut()V

    .line 380
    goto :goto_1

    .line 379
    :catchall_0
    move-exception v4

    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$700(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedStream$StreamTimeout;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream$StreamTimeout;->exitAndThrowIfTimedOut()V

    throw v4

    .line 381
    :goto_1
    return-void
.end method


# virtual methods
.method public close()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 428
    iget-object v1, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    monitor-enter v1

    .line 429
    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->closed:Z

    .line 430
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->readBuffer:Lokio/Buffer;

    invoke-virtual {v0}, Lokio/Buffer;->clear()V

    .line 431
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 432
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 433
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$1000(Lokhttp3/internal/framed/FramedStream;)V

    .line 434
    return-void
.end method

.method public read(Lokio/Buffer;J)J
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 338
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "byteCount < 0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 341
    :cond_0
    iget-object v6, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    monitor-enter v6

    .line 342
    :try_start_0
    invoke-direct {p0}, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->waitUntilReadable()V

    .line 343
    invoke-direct {p0}, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->checkNotClosed()V

    .line 344
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->readBuffer:Lokio/Buffer;

    invoke-virtual {v0}, Lokio/Buffer;->size()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    monitor-exit v6

    const-wide/16 v0, -0x1

    return-wide v0

    .line 347
    :cond_1
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->readBuffer:Lokio/Buffer;

    iget-object v1, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->readBuffer:Lokio/Buffer;

    invoke-virtual {v1}, Lokio/Buffer;->size()J

    move-result-wide v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lokio/Buffer;->read(Lokio/Buffer;J)J

    move-result-wide v4

    .line 350
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    iget-wide v1, v0, Lokhttp3/internal/framed/FramedStream;->unacknowledgedBytesRead:J

    add-long/2addr v1, v4

    iput-wide v1, v0, Lokhttp3/internal/framed/FramedStream;->unacknowledgedBytesRead:J

    .line 351
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    iget-wide v0, v0, Lokhttp3/internal/framed/FramedStream;->unacknowledgedBytesRead:J

    iget-object v2, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    .line 352
    invoke-static {v2}, Lokhttp3/internal/framed/FramedStream;->access$500(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedConnection;

    move-result-object v2

    iget-object v2, v2, Lokhttp3/internal/framed/FramedConnection;->okHttpSettings:Lokhttp3/internal/framed/Settings;

    const/high16 v3, 0x10000

    invoke-virtual {v2, v3}, Lokhttp3/internal/framed/Settings;->getInitialWindowSize(I)I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    .line 353
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$500(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedConnection;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v1}, Lokhttp3/internal/framed/FramedStream;->access$600(Lokhttp3/internal/framed/FramedStream;)I

    move-result v1

    iget-object v2, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    iget-wide v2, v2, Lokhttp3/internal/framed/FramedStream;->unacknowledgedBytesRead:J

    invoke-virtual {v0, v1, v2, v3}, Lokhttp3/internal/framed/FramedConnection;->writeWindowUpdateLater(IJ)V

    .line 354
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lokhttp3/internal/framed/FramedStream;->unacknowledgedBytesRead:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 356
    :cond_2
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 359
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$500(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedConnection;

    move-result-object v6

    monitor-enter v6

    .line 360
    :try_start_2
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$500(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedConnection;

    move-result-object v0

    iget-wide v1, v0, Lokhttp3/internal/framed/FramedConnection;->unacknowledgedBytesRead:J

    add-long/2addr v1, v4

    iput-wide v1, v0, Lokhttp3/internal/framed/FramedConnection;->unacknowledgedBytesRead:J

    .line 361
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$500(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedConnection;

    move-result-object v0

    iget-wide v0, v0, Lokhttp3/internal/framed/FramedConnection;->unacknowledgedBytesRead:J

    iget-object v2, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    .line 362
    invoke-static {v2}, Lokhttp3/internal/framed/FramedStream;->access$500(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedConnection;

    move-result-object v2

    iget-object v2, v2, Lokhttp3/internal/framed/FramedConnection;->okHttpSettings:Lokhttp3/internal/framed/Settings;

    const/high16 v3, 0x10000

    invoke-virtual {v2, v3}, Lokhttp3/internal/framed/Settings;->getInitialWindowSize(I)I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_3

    .line 363
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$500(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedConnection;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v1}, Lokhttp3/internal/framed/FramedStream;->access$500(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedConnection;

    move-result-object v1

    iget-wide v1, v1, Lokhttp3/internal/framed/FramedConnection;->unacknowledgedBytesRead:J

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v2}, Lokhttp3/internal/framed/FramedConnection;->writeWindowUpdateLater(IJ)V

    .line 364
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$500(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedConnection;

    move-result-object v0

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lokhttp3/internal/framed/FramedConnection;->unacknowledgedBytesRead:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 366
    :cond_3
    monitor-exit v6

    goto :goto_1

    :catchall_1
    move-exception v8

    monitor-exit v6

    throw v8

    .line 368
    :goto_1
    return-wide v4
.end method

.method receive(Lokio/BufferedSource;J)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 384
    sget-boolean v0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 386
    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-lez v0, :cond_7

    .line 389
    iget-object v6, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    monitor-enter v6

    .line 390
    :try_start_0
    iget-boolean v4, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->finished:Z

    .line 391
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->readBuffer:Lokio/Buffer;

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v0

    add-long/2addr v0, p2

    iget-wide v2, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->maxByteCount:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 392
    :goto_1
    monitor-exit v6

    goto :goto_2

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 395
    :goto_2
    if-eqz v5, :cond_2

    .line 396
    invoke-interface {p1, p2, p3}, Lokio/BufferedSource;->skip(J)V

    .line 397
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    sget-object v1, Lokhttp3/internal/framed/ErrorCode;->FLOW_CONTROL_ERROR:Lokhttp3/internal/framed/ErrorCode;

    invoke-virtual {v0, v1}, Lokhttp3/internal/framed/FramedStream;->closeLater(Lokhttp3/internal/framed/ErrorCode;)V

    .line 398
    return-void

    .line 402
    :cond_2
    if-eqz v4, :cond_3

    .line 403
    invoke-interface {p1, p2, p3}, Lokio/BufferedSource;->skip(J)V

    .line 404
    return-void

    .line 408
    :cond_3
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->receiveBuffer:Lokio/Buffer;

    invoke-interface {p1, v0, p2, p3}, Lokio/BufferedSource;->read(Lokio/Buffer;J)J

    move-result-wide v6

    .line 409
    const-wide/16 v0, -0x1

    cmp-long v0, v6, v0

    if-nez v0, :cond_4

    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 410
    :cond_4
    sub-long/2addr p2, v6

    .line 413
    iget-object v8, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    monitor-enter v8

    .line 414
    :try_start_1
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->readBuffer:Lokio/Buffer;

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    const/4 v9, 0x1

    goto :goto_3

    :cond_5
    const/4 v9, 0x0

    .line 415
    :goto_3
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->readBuffer:Lokio/Buffer;

    iget-object v1, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->receiveBuffer:Lokio/Buffer;

    invoke-virtual {v0, v1}, Lokio/Buffer;->writeAll(Lokio/Source;)J

    .line 416
    if-eqz v9, :cond_6

    .line 417
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 419
    :cond_6
    monitor-exit v8

    goto :goto_4

    :catchall_1
    move-exception v10

    monitor-exit v8

    throw v10

    .line 420
    :goto_4
    goto/16 :goto_0

    .line 421
    :cond_7
    return-void
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 424
    iget-object v0, p0, Lokhttp3/internal/framed/FramedStream$FramedDataSource;->this$0:Lokhttp3/internal/framed/FramedStream;

    invoke-static {v0}, Lokhttp3/internal/framed/FramedStream;->access$700(Lokhttp3/internal/framed/FramedStream;)Lokhttp3/internal/framed/FramedStream$StreamTimeout;

    move-result-object v0

    return-object v0
.end method
