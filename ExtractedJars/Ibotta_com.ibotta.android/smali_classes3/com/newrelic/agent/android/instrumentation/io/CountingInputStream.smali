.class public Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;
.super Ljava/io/InputStream;
.source "CountingInputStream.java"

# interfaces
.implements Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerSource;


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private final buffer:Ljava/nio/ByteBuffer;

.field private count:J

.field private final enableBuffering:Z

.field private final impl:Ljava/io/InputStream;

.field private final listenerManager:Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 25
    invoke-direct {p0, p1, v0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;-><init>(Ljava/io/InputStream;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x1000

    .line 29
    invoke-direct {p0, p1, p2, v0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;-><init>(Ljava/io/InputStream;ZI)V

    return-void
.end method

.method constructor <init>(Ljava/io/InputStream;ZI)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const-wide/16 v0, 0x0

    .line 20
    iput-wide v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    if-eqz p1, :cond_1

    .line 37
    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->impl:Ljava/io/InputStream;

    .line 38
    iput-boolean p2, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->enableBuffering:Z

    .line 39
    new-instance p1, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;

    invoke-direct {p1}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;-><init>()V

    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->listenerManager:Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;

    if-eqz p2, :cond_0

    .line 42
    invoke-static {p3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    .line 43
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->fillBuffer()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 45
    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    :goto_0
    return-void

    .line 34
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "CountingInputStream: input stream cannot be null"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private bufferEmpty()Z
    .locals 1

    .line 293
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method private bufferHasBytes(J)Z
    .locals 3

    .line 289
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    int-to-long v0, v0

    cmp-long v2, v0, p1

    if-ltz v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private notifyStreamComplete()V
    .locals 4

    .line 325
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->listenerManager:Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->isComplete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 326
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->listenerManager:Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;

    new-instance v1, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;

    iget-wide v2, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    invoke-direct {v1, p0, v2, v3}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;-><init>(Ljava/lang/Object;J)V

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->notifyStreamComplete(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;)V

    :cond_0
    return-void
.end method

.method private notifyStreamError(Ljava/lang/Exception;)V
    .locals 4

    .line 331
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->listenerManager:Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->isComplete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 332
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->listenerManager:Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;

    new-instance v1, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;

    iget-wide v2, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    invoke-direct {v1, p0, v2, v3, p1}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;-><init>(Ljava/lang/Object;JLjava/lang/Exception;)V

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->notifyStreamError(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;)V

    :cond_0
    return-void
.end method

.method private readBuffer()I
    .locals 1

    .line 270
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->bufferEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 272
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    return v0
.end method

.method private readBufferBytes([B)I
    .locals 2

    .line 276
    array-length v0, p1

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, v0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->readBufferBytes([BII)I

    move-result p1

    return p1
.end method

.method private readBufferBytes([BII)I
    .locals 2

    .line 280
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->bufferEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 283
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    .line 284
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p1, p2, p3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 285
    iget-object p1, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method


# virtual methods
.method public addStreamCompleteListener(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;)V
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->listenerManager:Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->addStreamCompleteListener(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;)V

    return-void
.end method

.method public available()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 225
    iget-boolean v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->enableBuffering:Z

    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 230
    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->impl:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v0, v1

    return v0

    :catch_0
    move-exception v0

    .line 232
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->notifyStreamError(Ljava/lang/Exception;)V

    .line 233
    throw v0
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 239
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->impl:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 240
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->notifyStreamComplete()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 242
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->notifyStreamError(Ljava/lang/Exception;)V

    .line 243
    throw v0
.end method

.method public fillBuffer()V
    .locals 6

    .line 300
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_3

    .line 301
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 304
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 307
    :goto_0
    :try_start_0
    iget-object v3, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 309
    iget-object v3, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->impl:Ljava/io/InputStream;

    iget-object v4, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v4

    iget-object v5, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v5

    sub-int/2addr v5, v2

    invoke-virtual {v3, v4, v2, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    if-gtz v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/2addr v2, v3

    goto :goto_0

    .line 315
    :cond_2
    :goto_1
    iget-object v3, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_3

    :catch_0
    move-exception v2

    .line 317
    :try_start_1
    sget-object v3, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    invoke-virtual {v2}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 318
    iget-object v2, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 320
    :goto_2
    monitor-exit v0

    goto :goto_4

    :goto_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_3
    :goto_4
    return-void
.end method

.method public getBufferAsString()Ljava/lang/String;
    .locals 4

    .line 337
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_1

    .line 338
    monitor-enter v0

    .line 339
    :try_start_0
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    new-array v1, v1, [B

    const/4 v2, 0x0

    .line 340
    :goto_0
    iget-object v3, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->limit()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 341
    iget-object v3, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 343
    :cond_0
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>([B)V

    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    .line 344
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method public mark(I)V
    .locals 1

    .line 248
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 250
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->impl:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V

    return-void
.end method

.method public markSupported()Z
    .locals 1

    .line 254
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->impl:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    return v0
.end method

.method public read()I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 61
    iget-boolean v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->enableBuffering:Z

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_2

    .line 62
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    monitor-enter v0

    .line 63
    :try_start_0
    invoke-direct {p0, v1, v2}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->bufferHasBytes(J)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 64
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->readBuffer()I

    move-result v3

    if-ltz v3, :cond_0

    .line 66
    iget-wide v4, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    add-long/2addr v4, v1

    iput-wide v4, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    .line 68
    :cond_0
    monitor-exit v0

    return v3

    .line 70
    :cond_1
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 74
    :cond_2
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->impl:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ltz v0, :cond_3

    .line 76
    iget-wide v3, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    add-long/2addr v3, v1

    iput-wide v3, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    goto :goto_1

    .line 78
    :cond_3
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->notifyStreamComplete()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    return v0

    :catch_0
    move-exception v0

    .line 82
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->notifyStreamError(Ljava/lang/Exception;)V

    .line 83
    throw v0
.end method

.method public read([B)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 91
    array-length v0, p1

    .line 94
    iget-boolean v1, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->enableBuffering:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 95
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    monitor-enter v1

    int-to-long v3, v0

    .line 97
    :try_start_0
    invoke-direct {p0, v3, v4}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->bufferHasBytes(J)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 98
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->readBufferBytes([B)I

    move-result p1

    if-ltz p1, :cond_0

    .line 100
    iget-wide v2, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    int-to-long v4, p1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    .line 105
    monitor-exit v1

    return p1

    .line 103
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "readBufferBytes failed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 108
    :cond_1
    iget-object v3, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v3

    if-lez v3, :cond_3

    .line 111
    invoke-direct {p0, p1, v2, v3}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->readBufferBytes([BII)I

    move-result v2

    if-ltz v2, :cond_2

    sub-int/2addr v0, v2

    .line 115
    iget-wide v3, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    int-to-long v5, v2

    add-long/2addr v3, v5

    iput-wide v3, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    goto :goto_0

    .line 113
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "partial read from buffer failed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 118
    :cond_3
    :goto_0
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 122
    :cond_4
    :goto_1
    :try_start_1
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->impl:Ljava/io/InputStream;

    invoke-virtual {v1, p1, v2, v0}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-ltz p1, :cond_5

    .line 124
    iget-wide v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    int-to-long v3, p1

    add-long/2addr v0, v3

    iput-wide v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    add-int/2addr p1, v2

    return p1

    :cond_5
    if-gtz v2, :cond_6

    .line 128
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->notifyStreamComplete()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return p1

    :cond_6
    return v2

    :catch_0
    move-exception p1

    .line 134
    sget-object v0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    invoke-virtual {p1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 135
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NOTIFY STREAM ERROR: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 136
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    .line 137
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->notifyStreamError(Ljava/lang/Exception;)V

    .line 138
    throw p1
.end method

.method public read([BII)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 147
    iget-boolean v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->enableBuffering:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 148
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    monitor-enter v0

    int-to-long v2, p3

    .line 150
    :try_start_0
    invoke-direct {p0, v2, v3}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->bufferHasBytes(J)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 151
    invoke-direct {p0, p1, p2, p3}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->readBufferBytes([BII)I

    move-result p1

    if-ltz p1, :cond_0

    .line 153
    iget-wide p2, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    int-to-long v1, p1

    add-long/2addr p2, v1

    iput-wide p2, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    .line 158
    monitor-exit v0

    return p1

    .line 156
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "readBufferBytes failed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 161
    :cond_1
    iget-object v2, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    if-lez v2, :cond_3

    .line 164
    invoke-direct {p0, p1, p2, v2}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->readBufferBytes([BII)I

    move-result v1

    if-ltz v1, :cond_2

    sub-int/2addr p3, v1

    .line 168
    iget-wide v2, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    int-to-long v4, v1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    goto :goto_0

    .line 166
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "partial read from buffer failed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 171
    :cond_3
    :goto_0
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 175
    :cond_4
    :goto_1
    :try_start_1
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->impl:Ljava/io/InputStream;

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-ltz p1, :cond_5

    .line 177
    iget-wide p2, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    int-to-long v2, p1

    add-long/2addr p2, v2

    iput-wide p2, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    add-int/2addr p1, v1

    return p1

    :cond_5
    if-gtz v1, :cond_6

    .line 181
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->notifyStreamComplete()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return p1

    :cond_6
    return v1

    :catch_0
    move-exception p1

    .line 187
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->notifyStreamError(Ljava/lang/Exception;)V

    .line 188
    throw p1
.end method

.method public removeStreamCompleteListener(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;)V
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->listenerManager:Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListenerManager;->removeStreamCompleteListener(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;)V

    return-void
.end method

.method public reset()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 258
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 262
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->impl:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 264
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->notifyStreamError(Ljava/lang/Exception;)V

    .line 265
    throw v0
.end method

.method public skip(J)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 195
    iget-boolean v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->enableBuffering:Z

    if-eqz v0, :cond_2

    .line 196
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    monitor-enter v0

    .line 197
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->bufferHasBytes(J)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 198
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    long-to-int v2, p1

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 199
    iget-wide v1, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    add-long/2addr v1, p1

    iput-wide v1, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    .line 200
    monitor-exit v0

    return-wide p1

    .line 203
    :cond_0
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    int-to-long v1, v1

    sub-long/2addr p1, v1

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-lez v3, :cond_1

    .line 205
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 209
    monitor-exit v0

    goto :goto_0

    .line 207
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "partial read from buffer (skip) failed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 209
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 213
    :cond_2
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->impl:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1

    .line 214
    iget-wide v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->count:J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    .line 217
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->notifyStreamError(Ljava/lang/Exception;)V

    .line 218
    throw p1
.end method
