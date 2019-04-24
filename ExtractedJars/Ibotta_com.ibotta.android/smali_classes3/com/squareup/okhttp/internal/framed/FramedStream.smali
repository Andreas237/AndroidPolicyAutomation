.class public final Lcom/squareup/okhttp/internal/framed/FramedStream;
.super Ljava/lang/Object;
.source "FramedStream.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;,
        Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;,
        Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field bytesLeftInWriteWindow:J

.field private final connection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

.field private errorCode:Lcom/squareup/okhttp/internal/framed/ErrorCode;

.field private final id:I

.field private final readTimeout:Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;

.field private final requestHeaders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/framed/Header;",
            ">;"
        }
    .end annotation
.end field

.field private responseHeaders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/framed/Header;",
            ">;"
        }
    .end annotation
.end field

.field final sink:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;

.field private final source:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;

.field unacknowledgedBytesRead:J

.field private final writeTimeout:Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(ILcom/squareup/okhttp/internal/framed/FramedConnection;ZZLjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/squareup/okhttp/internal/framed/FramedConnection;",
            "ZZ",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/framed/Header;",
            ">;)V"
        }
    .end annotation

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 45
    iput-wide v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->unacknowledgedBytesRead:J

    .line 66
    new-instance v0, Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;

    invoke-direct {v0, p0}, Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;-><init>(Lcom/squareup/okhttp/internal/framed/FramedStream;)V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->readTimeout:Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;

    .line 67
    new-instance v0, Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;

    invoke-direct {v0, p0}, Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;-><init>(Lcom/squareup/okhttp/internal/framed/FramedStream;)V

    iput-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->writeTimeout:Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;

    const/4 v0, 0x0

    .line 74
    iput-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->errorCode:Lcom/squareup/okhttp/internal/framed/ErrorCode;

    if-eqz p2, :cond_1

    if-eqz p5, :cond_0

    .line 80
    iput p1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->id:I

    .line 81
    iput-object p2, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->connection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    .line 82
    iget-object p1, p2, Lcom/squareup/okhttp/internal/framed/FramedConnection;->peerSettings:Lcom/squareup/okhttp/internal/framed/Settings;

    const/high16 v1, 0x10000

    invoke-virtual {p1, v1}, Lcom/squareup/okhttp/internal/framed/Settings;->getInitialWindowSize(I)I

    move-result p1

    int-to-long v2, p1

    iput-wide v2, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->bytesLeftInWriteWindow:J

    .line 84
    new-instance p1, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;

    iget-object p2, p2, Lcom/squareup/okhttp/internal/framed/FramedConnection;->okHttpSettings:Lcom/squareup/okhttp/internal/framed/Settings;

    invoke-virtual {p2, v1}, Lcom/squareup/okhttp/internal/framed/Settings;->getInitialWindowSize(I)I

    move-result p2

    int-to-long v1, p2

    invoke-direct {p1, p0, v1, v2, v0}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;-><init>(Lcom/squareup/okhttp/internal/framed/FramedStream;JLcom/squareup/okhttp/internal/framed/FramedStream$1;)V

    iput-object p1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->source:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;

    .line 86
    new-instance p1, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;

    invoke-direct {p1, p0}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;-><init>(Lcom/squareup/okhttp/internal/framed/FramedStream;)V

    iput-object p1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->sink:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;

    .line 87
    iget-object p1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->source:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;

    invoke-static {p1, p4}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;->access$102(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;Z)Z

    .line 88
    iget-object p1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->sink:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;

    invoke-static {p1, p3}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;->access$202(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;Z)Z

    .line 89
    iput-object p5, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->requestHeaders:Ljava/util/List;

    return-void

    .line 79
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "requestHeaders == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 78
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "connection == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$1000(Lcom/squareup/okhttp/internal/framed/FramedStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/framed/FramedStream;->cancelStreamIfNecessary()V

    return-void
.end method

.method static synthetic access$1100(Lcom/squareup/okhttp/internal/framed/FramedStream;)Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->writeTimeout:Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/squareup/okhttp/internal/framed/FramedStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/framed/FramedStream;->checkOutNotClosed()V

    return-void
.end method

.method static synthetic access$500(Lcom/squareup/okhttp/internal/framed/FramedStream;)Lcom/squareup/okhttp/internal/framed/FramedConnection;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->connection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    return-object p0
.end method

.method static synthetic access$600(Lcom/squareup/okhttp/internal/framed/FramedStream;)I
    .locals 0

    .line 35
    iget p0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->id:I

    return p0
.end method

.method static synthetic access$700(Lcom/squareup/okhttp/internal/framed/FramedStream;)Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->readTimeout:Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;

    return-object p0
.end method

.method static synthetic access$800(Lcom/squareup/okhttp/internal/framed/FramedStream;)Lcom/squareup/okhttp/internal/framed/ErrorCode;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->errorCode:Lcom/squareup/okhttp/internal/framed/ErrorCode;

    return-object p0
.end method

.method static synthetic access$900(Lcom/squareup/okhttp/internal/framed/FramedStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/InterruptedIOException;
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/framed/FramedStream;->waitForIo()V

    return-void
.end method

.method private cancelStreamIfNecessary()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 451
    monitor-enter p0

    .line 452
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->source:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;->access$100(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->source:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;->access$300(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->sink:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;->access$200(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->sink:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;->access$400(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 453
    :goto_0
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/framed/FramedStream;->isOpen()Z

    move-result v1

    .line 454
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    .line 460
    sget-object v0, Lcom/squareup/okhttp/internal/framed/ErrorCode;->CANCEL:Lcom/squareup/okhttp/internal/framed/ErrorCode;

    invoke-virtual {p0, v0}, Lcom/squareup/okhttp/internal/framed/FramedStream;->close(Lcom/squareup/okhttp/internal/framed/ErrorCode;)V

    goto :goto_1

    :cond_2
    if-nez v1, :cond_3

    .line 462
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->connection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    iget v1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->id:I

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/framed/FramedConnection;->removeStream(I)Lcom/squareup/okhttp/internal/framed/FramedStream;

    :cond_3
    :goto_1
    return-void

    :catchall_0
    move-exception v0

    .line 454
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private checkOutNotClosed()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 573
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->sink:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;->access$400(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 575
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->sink:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;->access$200(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 577
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->errorCode:Lcom/squareup/okhttp/internal/framed/ErrorCode;

    if-nez v0, :cond_0

    return-void

    .line 578
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "stream was reset: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->errorCode:Lcom/squareup/okhttp/internal/framed/ErrorCode;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 576
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream finished"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 574
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private closeInternal(Lcom/squareup/okhttp/internal/framed/ErrorCode;)Z
    .locals 2

    .line 239
    monitor-enter p0

    .line 240
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->errorCode:Lcom/squareup/okhttp/internal/framed/ErrorCode;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 241
    monitor-exit p0

    return v1

    .line 243
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->source:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;->access$100(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->sink:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;->access$200(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 244
    monitor-exit p0

    return v1

    .line 246
    :cond_1
    iput-object p1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->errorCode:Lcom/squareup/okhttp/internal/framed/ErrorCode;

    .line 247
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 248
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    iget-object p1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->connection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    iget v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->id:I

    invoke-virtual {p1, v0}, Lcom/squareup/okhttp/internal/framed/FramedConnection;->removeStream(I)Lcom/squareup/okhttp/internal/framed/FramedStream;

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    .line 248
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private waitForIo()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/InterruptedIOException;
        }
    .end annotation

    .line 588
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 590
    :catch_0
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
.end method


# virtual methods
.method addBytesToWriteWindow(J)V
    .locals 3

    .line 568
    iget-wide v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->bytesLeftInWriteWindow:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->bytesLeftInWriteWindow:J

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    .line 569
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    :cond_0
    return-void
.end method

.method public close(Lcom/squareup/okhttp/internal/framed/ErrorCode;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 219
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/internal/framed/FramedStream;->closeInternal(Lcom/squareup/okhttp/internal/framed/ErrorCode;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 222
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->connection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    iget v1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->id:I

    invoke-virtual {v0, v1, p1}, Lcom/squareup/okhttp/internal/framed/FramedConnection;->writeSynReset(ILcom/squareup/okhttp/internal/framed/ErrorCode;)V

    return-void
.end method

.method public closeLater(Lcom/squareup/okhttp/internal/framed/ErrorCode;)V
    .locals 2

    .line 230
    invoke-direct {p0, p1}, Lcom/squareup/okhttp/internal/framed/FramedStream;->closeInternal(Lcom/squareup/okhttp/internal/framed/ErrorCode;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 233
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->connection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    iget v1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->id:I

    invoke-virtual {v0, v1, p1}, Lcom/squareup/okhttp/internal/framed/FramedConnection;->writeSynResetLater(ILcom/squareup/okhttp/internal/framed/ErrorCode;)V

    return-void
.end method

.method public getConnection()Lcom/squareup/okhttp/internal/framed/FramedConnection;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->connection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    return-object v0
.end method

.method public declared-synchronized getErrorCode()Lcom/squareup/okhttp/internal/framed/ErrorCode;
    .locals 1

    monitor-enter p0

    .line 154
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->errorCode:Lcom/squareup/okhttp/internal/framed/ErrorCode;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getId()I
    .locals 1

    .line 93
    iget v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->id:I

    return v0
.end method

.method public getRequestHeaders()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/framed/Header;",
            ">;"
        }
    .end annotation

    .line 129
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->requestHeaders:Ljava/util/List;

    return-object v0
.end method

.method public declared-synchronized getResponseHeaders()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/framed/Header;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 137
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->readTimeout:Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;->enter()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 139
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->responseHeaders:Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->errorCode:Lcom/squareup/okhttp/internal/framed/ErrorCode;

    if-nez v0, :cond_0

    .line 140
    invoke-direct {p0}, Lcom/squareup/okhttp/internal/framed/FramedStream;->waitForIo()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 143
    :cond_0
    :try_start_2
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->readTimeout:Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;->exitAndThrowIfTimedOut()V

    .line 145
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->responseHeaders:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->responseHeaders:Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-object v0

    .line 146
    :cond_1
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "stream was reset: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->errorCode:Lcom/squareup/okhttp/internal/framed/ErrorCode;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    .line 143
    iget-object v1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->readTimeout:Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;->exitAndThrowIfTimedOut()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getSink()Lokio/Sink;
    .locals 2

    .line 206
    monitor-enter p0

    .line 207
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->responseHeaders:Ljava/util/List;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/framed/FramedStream;->isLocallyInitiated()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 208
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "reply before requesting the sink"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 210
    :cond_1
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 211
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->sink:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;

    return-object v0

    :catchall_0
    move-exception v0

    .line 210
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public getSource()Lokio/Source;
    .locals 1

    .line 196
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->source:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;

    return-object v0
.end method

.method public isLocallyInitiated()Z
    .locals 4

    .line 120
    iget v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->id:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 121
    :goto_0
    iget-object v3, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->connection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    iget-boolean v3, v3, Lcom/squareup/okhttp/internal/framed/FramedConnection;->client:Z

    if-ne v3, v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method public declared-synchronized isOpen()Z
    .locals 2

    monitor-enter p0

    .line 107
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->errorCode:Lcom/squareup/okhttp/internal/framed/ErrorCode;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 108
    monitor-exit p0

    return v1

    .line 110
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->source:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;->access$100(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->source:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;->access$300(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->sink:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;->access$200(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->sink:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;

    invoke-static {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;->access$400(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->responseHeaders:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    .line 113
    monitor-exit p0

    return v1

    :cond_3
    const/4 v0, 0x1

    .line 115
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public readTimeout()Lokio/Timeout;
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->readTimeout:Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;

    return-object v0
.end method

.method receiveData(Lokio/BufferedSource;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 286
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->source:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;

    int-to-long v1, p2

    invoke-virtual {v0, p1, v1, v2}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;->receive(Lokio/BufferedSource;J)V

    return-void
.end method

.method receiveFin()V
    .locals 2

    .line 292
    monitor-enter p0

    .line 293
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->source:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;->access$102(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSource;Z)Z

    .line 294
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/framed/FramedStream;->isOpen()Z

    move-result v0

    .line 295
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 296
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 298
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->connection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    iget v1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->id:I

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/framed/FramedConnection;->removeStream(I)Lcom/squareup/okhttp/internal/framed/FramedStream;

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    .line 296
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method receiveHeaders(Ljava/util/List;Lcom/squareup/okhttp/internal/framed/HeadersMode;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/framed/Header;",
            ">;",
            "Lcom/squareup/okhttp/internal/framed/HeadersMode;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 257
    monitor-enter p0

    .line 258
    :try_start_0
    iget-object v2, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->responseHeaders:Ljava/util/List;

    if-nez v2, :cond_1

    .line 259
    invoke-virtual {p2}, Lcom/squareup/okhttp/internal/framed/HeadersMode;->failIfHeadersAbsent()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 260
    sget-object v0, Lcom/squareup/okhttp/internal/framed/ErrorCode;->PROTOCOL_ERROR:Lcom/squareup/okhttp/internal/framed/ErrorCode;

    goto :goto_0

    .line 262
    :cond_0
    iput-object p1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->responseHeaders:Ljava/util/List;

    .line 263
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/framed/FramedStream;->isOpen()Z

    move-result v1

    .line 264
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    goto :goto_0

    .line 267
    :cond_1
    invoke-virtual {p2}, Lcom/squareup/okhttp/internal/framed/HeadersMode;->failIfHeadersPresent()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 268
    sget-object v0, Lcom/squareup/okhttp/internal/framed/ErrorCode;->STREAM_IN_USE:Lcom/squareup/okhttp/internal/framed/ErrorCode;

    goto :goto_0

    .line 270
    :cond_2
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 271
    iget-object v2, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->responseHeaders:Ljava/util/List;

    invoke-interface {p2, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 272
    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 273
    iput-object p2, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->responseHeaders:Ljava/util/List;

    .line 276
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_3

    .line 278
    invoke-virtual {p0, v0}, Lcom/squareup/okhttp/internal/framed/FramedStream;->closeLater(Lcom/squareup/okhttp/internal/framed/ErrorCode;)V

    goto :goto_1

    :cond_3
    if-nez v1, :cond_4

    .line 280
    iget-object p1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->connection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    iget p2, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->id:I

    invoke-virtual {p1, p2}, Lcom/squareup/okhttp/internal/framed/FramedConnection;->removeStream(I)Lcom/squareup/okhttp/internal/framed/FramedStream;

    :cond_4
    :goto_1
    return-void

    :catchall_0
    move-exception p1

    .line 276
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method declared-synchronized receiveRstStream(Lcom/squareup/okhttp/internal/framed/ErrorCode;)V
    .locals 1

    monitor-enter p0

    .line 303
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->errorCode:Lcom/squareup/okhttp/internal/framed/ErrorCode;

    if-nez v0, :cond_0

    .line 304
    iput-object p1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->errorCode:Lcom/squareup/okhttp/internal/framed/ErrorCode;

    .line 305
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 307
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public reply(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/framed/Header;",
            ">;Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 166
    monitor-enter p0

    if-eqz p1, :cond_3

    .line 170
    :try_start_0
    iget-object v1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->responseHeaders:Ljava/util/List;

    if-nez v1, :cond_2

    .line 173
    iput-object p1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->responseHeaders:Ljava/util/List;

    const/4 v1, 0x1

    if-nez p2, :cond_0

    .line 175
    iget-object p2, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->sink:Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;

    invoke-static {p2, v1}, Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;->access$202(Lcom/squareup/okhttp/internal/framed/FramedStream$FramedDataSink;Z)Z

    const/4 v0, 0x1

    .line 178
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    iget-object p2, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->connection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    iget v1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->id:I

    invoke-virtual {p2, v1, v0, p1}, Lcom/squareup/okhttp/internal/framed/FramedConnection;->writeSynReply(IZLjava/util/List;)V

    if-eqz v0, :cond_1

    .line 182
    iget-object p1, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->connection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/framed/FramedConnection;->flush()V

    :cond_1
    return-void

    .line 171
    :cond_2
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "reply already sent"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 168
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "responseHeaders == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 178
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public writeTimeout()Lokio/Timeout;
    .locals 1

    .line 191
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/FramedStream;->writeTimeout:Lcom/squareup/okhttp/internal/framed/FramedStream$StreamTimeout;

    return-object v0
.end method
