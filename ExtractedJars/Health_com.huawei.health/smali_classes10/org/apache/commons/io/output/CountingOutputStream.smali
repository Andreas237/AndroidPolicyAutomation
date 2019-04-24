.class public Lorg/apache/commons/io/output/CountingOutputStream;
.super Lorg/apache/commons/io/output/ProxyOutputStream;
.source "SourceFile"


# instance fields
.field private count:J


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 2

    .line 40
    invoke-direct {p0, p1}, Lorg/apache/commons/io/output/ProxyOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 32
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/apache/commons/io/output/CountingOutputStream;->count:J

    .line 41
    return-void
.end method


# virtual methods
.method protected declared-synchronized beforeWrite(I)V
    .locals 4

    monitor-enter p0

    .line 53
    :try_start_0
    iget-wide v0, p0, Lorg/apache/commons/io/output/CountingOutputStream;->count:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/apache/commons/io/output/CountingOutputStream;->count:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized getByteCount()J
    .locals 3

    monitor-enter p0

    .line 104
    :try_start_0
    iget-wide v0, p0, Lorg/apache/commons/io/output/CountingOutputStream;->count:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public getCount()I
    .locals 5

    .line 68
    invoke-virtual {p0}, Lorg/apache/commons/io/output/CountingOutputStream;->getByteCount()J

    move-result-wide v3

    .line 69
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, v3, v0

    if-lez v0, :cond_0

    .line 70
    new-instance v0, Ljava/lang/ArithmeticException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The byte count "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is too large to be converted to an int"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_0
    long-to-int v0, v3

    return v0
.end method

.method public declared-synchronized resetByteCount()J
    .locals 4

    monitor-enter p0

    .line 118
    :try_start_0
    iget-wide v2, p0, Lorg/apache/commons/io/output/CountingOutputStream;->count:J

    .line 119
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/apache/commons/io/output/CountingOutputStream;->count:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    monitor-exit p0

    return-wide v2

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public resetCount()I
    .locals 5

    .line 86
    invoke-virtual {p0}, Lorg/apache/commons/io/output/CountingOutputStream;->resetByteCount()J

    move-result-wide v3

    .line 87
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, v3, v0

    if-lez v0, :cond_0

    .line 88
    new-instance v0, Ljava/lang/ArithmeticException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The byte count "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is too large to be converted to an int"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 90
    :cond_0
    long-to-int v0, v3

    return v0
.end method
