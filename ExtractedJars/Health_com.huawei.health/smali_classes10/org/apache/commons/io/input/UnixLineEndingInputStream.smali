.class public Lorg/apache/commons/io/input/UnixLineEndingInputStream;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field private final ensureLineFeedAtEndOfFile:Z

.field private eofSeen:Z

.field private slashNSeen:Z

.field private slashRSeen:Z

.field private final target:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Z)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->slashNSeen:Z

    .line 32
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->slashRSeen:Z

    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->eofSeen:Z

    .line 47
    iput-object p1, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->target:Ljava/io/InputStream;

    .line 48
    iput-boolean p2, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->ensureLineFeedAtEndOfFile:Z

    .line 49
    return-void
.end method

.method private eofGame(Z)I
    .locals 1

    .line 100
    if-nez p1, :cond_0

    iget-boolean v0, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->ensureLineFeedAtEndOfFile:Z

    if-nez v0, :cond_1

    .line 101
    :cond_0
    const/4 v0, -0x1

    return v0

    .line 103
    :cond_1
    iget-boolean v0, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->slashNSeen:Z

    if-nez v0, :cond_2

    .line 104
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->slashNSeen:Z

    .line 105
    const/16 v0, 0xa

    return v0

    .line 107
    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method private readWithUpdate()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->target:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v1

    .line 58
    const/4 v0, -0x1

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->eofSeen:Z

    .line 59
    iget-boolean v0, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->eofSeen:Z

    if-eqz v0, :cond_1

    .line 60
    return v1

    .line 62
    :cond_1
    const/16 v0, 0xa

    if-ne v1, v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->slashNSeen:Z

    .line 63
    const/16 v0, 0xd

    if-ne v1, v0, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->slashRSeen:Z

    .line 64
    return v1
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 117
    invoke-super {p0}, Ljava/io/InputStream;->close()V

    .line 118
    iget-object v0, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->target:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 119
    return-void
.end method

.method public declared-synchronized mark(I)V
    .locals 2

    monitor-enter p0

    .line 126
    :try_start_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Mark notsupported"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public read()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 72
    iget-boolean v1, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->slashRSeen:Z

    .line 73
    iget-boolean v0, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->eofSeen:Z

    if-eqz v0, :cond_0

    .line 74
    invoke-direct {p0, v1}, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->eofGame(Z)I

    move-result v0

    return v0

    .line 77
    :cond_0
    invoke-direct {p0}, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->readWithUpdate()I

    move-result v2

    .line 78
    iget-boolean v0, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->eofSeen:Z

    if-eqz v0, :cond_1

    .line 79
    invoke-direct {p0, v1}, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->eofGame(Z)I

    move-result v0

    return v0

    .line 81
    :cond_1
    iget-boolean v0, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->slashRSeen:Z

    if-eqz v0, :cond_2

    .line 83
    const/16 v0, 0xa

    return v0

    .line 86
    :cond_2
    if-eqz v1, :cond_3

    iget-boolean v0, p0, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->slashNSeen:Z

    if-eqz v0, :cond_3

    .line 87
    invoke-virtual {p0}, Lorg/apache/commons/io/input/UnixLineEndingInputStream;->read()I

    move-result v0

    return v0

    .line 90
    :cond_3
    return v2
.end method
