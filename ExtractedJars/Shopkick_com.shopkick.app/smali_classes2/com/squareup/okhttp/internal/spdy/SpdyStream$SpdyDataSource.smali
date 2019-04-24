.class final Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;
.super Ljava/lang/Object;
.source "SpdyStream.java"

# interfaces
.implements Lokio/Source;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/spdy/SpdyStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "SpdyDataSource"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private closed:Z

.field private finished:Z

.field private final maxByteCount:J

.field private final readBuffer:Lokio/Buffer;

.field private final receiveBuffer:Lokio/Buffer;

.field final synthetic this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 314
    const-class v0, Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    return-void
.end method

.method private constructor <init>(Lcom/squareup/okhttp/internal/spdy/SpdyStream;J)V
    .locals 0

    .line 333
    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 316
    new-instance p1, Lokio/Buffer;

    invoke-direct {p1}, Lokio/Buffer;-><init>()V

    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->receiveBuffer:Lokio/Buffer;

    .line 319
    new-instance p1, Lokio/Buffer;

    invoke-direct {p1}, Lokio/Buffer;-><init>()V

    iput-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->readBuffer:Lokio/Buffer;

    .line 334
    iput-wide p2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->maxByteCount:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/squareup/okhttp/internal/spdy/SpdyStream;JLcom/squareup/okhttp/internal/spdy/SpdyStream$1;)V
    .locals 0

    .line 314
    invoke-direct {p0, p1, p2, p3}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;-><init>(Lcom/squareup/okhttp/internal/spdy/SpdyStream;J)V

    return-void
.end method

.method static synthetic access$100(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;)Z
    .locals 0

    .line 314
    iget-boolean p0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->finished:Z

    return p0
.end method

.method static synthetic access$102(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;Z)Z
    .locals 0

    .line 314
    iput-boolean p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->finished:Z

    return p1
.end method

.method static synthetic access$300(Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;)Z
    .locals 0

    .line 314
    iget-boolean p0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->closed:Z

    return p0
.end method

.method private checkNotClosed()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 438
    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->closed:Z

    if-nez v0, :cond_1

    .line 441
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$800(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 442
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "stream was reset: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$800(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 439
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string/jumbo v1, "stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private waitUntilReadable()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 374
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$700(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyTimeout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyTimeout;->enter()V

    .line 376
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->readBuffer:Lokio/Buffer;

    invoke-virtual {v0}, Lokio/Buffer;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->finished:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->closed:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$800(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    move-result-object v0

    if-nez v0, :cond_0

    .line 377
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$900(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 380
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$700(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyTimeout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyTimeout;->exitAndThrowIfTimedOut()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$700(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyTimeout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyTimeout;->exitAndThrowIfTimedOut()V

    throw v0
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 429
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    monitor-enter v0

    const/4 v1, 0x1

    .line 430
    :try_start_0
    iput-boolean v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->closed:Z

    .line 431
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->readBuffer:Lokio/Buffer;

    invoke-virtual {v1}, Lokio/Buffer;->clear()V

    .line 432
    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 433
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 434
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$1000(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)V

    return-void

    :catchall_0
    move-exception v1

    .line 433
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public read(Lokio/Buffer;J)J
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_3

    .line 342
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    monitor-enter v2

    .line 343
    :try_start_0
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->waitUntilReadable()V

    .line 344
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->checkNotClosed()V

    .line 345
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->readBuffer:Lokio/Buffer;

    invoke-virtual {v3}, Lokio/Buffer;->size()J

    move-result-wide v3

    cmp-long v3, v3, v0

    if-nez v3, :cond_0

    const-wide/16 p1, -0x1

    monitor-exit v2

    return-wide p1

    .line 348
    :cond_0
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->readBuffer:Lokio/Buffer;

    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->readBuffer:Lokio/Buffer;

    invoke-virtual {v4}, Lokio/Buffer;->size()J

    move-result-wide v4

    invoke-static {p2, p3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-virtual {v3, p1, p2, p3}, Lokio/Buffer;->read(Lokio/Buffer;J)J

    move-result-wide p1

    .line 351
    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    iget-wide v3, p3, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->unacknowledgedBytesRead:J

    add-long/2addr v3, p1

    iput-wide v3, p3, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->unacknowledgedBytesRead:J

    .line 352
    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    iget-wide v3, p3, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->unacknowledgedBytesRead:J

    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {p3}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$500(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object p3

    iget-object p3, p3, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->okHttpSettings:Lcom/squareup/okhttp/internal/spdy/Settings;

    const/high16 v5, 0x10000

    invoke-virtual {p3, v5}, Lcom/squareup/okhttp/internal/spdy/Settings;->getInitialWindowSize(I)I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    int-to-long v6, p3

    cmp-long p3, v3, v6

    if-ltz p3, :cond_1

    .line 354
    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {p3}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$500(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object p3

    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v3}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$600(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)I

    move-result v3

    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    iget-wide v6, v4, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->unacknowledgedBytesRead:J

    invoke-virtual {p3, v3, v6, v7}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->writeWindowUpdateLater(IJ)V

    .line 355
    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    iput-wide v0, p3, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->unacknowledgedBytesRead:J

    .line 357
    :cond_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 360
    iget-object p3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {p3}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$500(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object p3

    monitor-enter p3

    .line 361
    :try_start_1
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$500(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object v2

    iget-wide v3, v2, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->unacknowledgedBytesRead:J

    add-long/2addr v3, p1

    iput-wide v3, v2, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->unacknowledgedBytesRead:J

    .line 362
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$500(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object v2

    iget-wide v2, v2, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->unacknowledgedBytesRead:J

    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v4}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$500(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object v4

    iget-object v4, v4, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->okHttpSettings:Lcom/squareup/okhttp/internal/spdy/Settings;

    invoke-virtual {v4, v5}, Lcom/squareup/okhttp/internal/spdy/Settings;->getInitialWindowSize(I)I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-long v4, v4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_2

    .line 364
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$500(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object v2

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v4}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$500(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object v4

    iget-wide v4, v4, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->unacknowledgedBytesRead:J

    invoke-virtual {v2, v3, v4, v5}, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->writeWindowUpdateLater(IJ)V

    .line 365
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$500(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyConnection;

    move-result-object v2

    iput-wide v0, v2, Lcom/squareup/okhttp/internal/spdy/SpdyConnection;->unacknowledgedBytesRead:J

    .line 367
    :cond_2
    monitor-exit p3

    return-wide p1

    :catchall_0
    move-exception p1

    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 357
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    .line 339
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method receive(Lokio/BufferedSource;J)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_6

    .line 390
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    monitor-enter v2

    .line 391
    :try_start_0
    iget-boolean v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->finished:Z

    .line 392
    iget-object v4, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->readBuffer:Lokio/Buffer;

    invoke-virtual {v4}, Lokio/Buffer;->size()J

    move-result-wide v4

    add-long/2addr v4, p2

    iget-wide v6, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->maxByteCount:J

    cmp-long v4, v4, v6

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-lez v4, :cond_0

    move v4, v5

    goto :goto_1

    :cond_0
    move v4, v6

    .line 393
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v4, :cond_1

    .line 397
    invoke-interface {p1, p2, p3}, Lokio/BufferedSource;->skip(J)V

    .line 398
    iget-object p1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    sget-object p2, Lcom/squareup/okhttp/internal/spdy/ErrorCode;->FLOW_CONTROL_ERROR:Lcom/squareup/okhttp/internal/spdy/ErrorCode;

    invoke-virtual {p1, p2}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->closeLater(Lcom/squareup/okhttp/internal/spdy/ErrorCode;)V

    return-void

    :cond_1
    if-eqz v3, :cond_2

    .line 404
    invoke-interface {p1, p2, p3}, Lokio/BufferedSource;->skip(J)V

    return-void

    .line 409
    :cond_2
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->receiveBuffer:Lokio/Buffer;

    invoke-interface {p1, v2, p2, p3}, Lokio/BufferedSource;->read(Lokio/Buffer;J)J

    move-result-wide v2

    const-wide/16 v7, -0x1

    cmp-long v4, v2, v7

    if-eqz v4, :cond_5

    sub-long/2addr p2, v2

    .line 414
    iget-object v2, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    monitor-enter v2

    .line 415
    :try_start_1
    iget-object v3, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->readBuffer:Lokio/Buffer;

    invoke-virtual {v3}, Lokio/Buffer;->size()J

    move-result-wide v3

    cmp-long v0, v3, v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    move v5, v6

    .line 416
    :goto_2
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->readBuffer:Lokio/Buffer;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->receiveBuffer:Lokio/Buffer;

    invoke-virtual {v0, v1}, Lokio/Buffer;->writeAll(Lokio/Source;)J

    if-eqz v5, :cond_4

    .line 418
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 420
    :cond_4
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 410
    :cond_5
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :catchall_1
    move-exception p1

    .line 393
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_6
    return-void
.end method

.method public timeout()Lokio/Timeout;
    .locals 1

    .line 425
    iget-object v0, p0, Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyDataSource;->this$0:Lcom/squareup/okhttp/internal/spdy/SpdyStream;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/spdy/SpdyStream;->access$700(Lcom/squareup/okhttp/internal/spdy/SpdyStream;)Lcom/squareup/okhttp/internal/spdy/SpdyStream$SpdyTimeout;

    move-result-object v0

    return-object v0
.end method
