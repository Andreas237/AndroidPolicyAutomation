.class public Lo/djk;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field c:Ljava/io/InputStream;

.field private final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    .line 16
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/djk;->e:Ljava/lang/Object;

    .line 18
    iput-object p1, p0, Lo/djk;->c:Ljava/io/InputStream;

    .line 19
    return-void
.end method


# virtual methods
.method public available()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 36
    new-instance v0, Ljava/io/IOException;

    const-string v1, "available on a null InputStream"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 38
    :cond_0
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 43
    new-instance v0, Ljava/io/IOException;

    const-string v1, "close on a null InputStream"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_0
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 46
    return-void
.end method

.method public mark(I)V
    .locals 2

    .line 49
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 50
    return-void

    .line 52
    :cond_0
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V

    .line 53
    return-void
.end method

.method public markSupported()Z
    .locals 2

    .line 56
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 57
    const/4 v0, 0x0

    return v0

    .line 59
    :cond_0
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    return v0
.end method

.method public read()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 24
    new-instance v0, Ljava/io/IOException;

    const-string v1, "read on a null InputStream"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 26
    :cond_0
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v2

    .line 27
    if-lez v2, :cond_1

    .line 29
    int-to-long v0, v2

    invoke-static {v0, v1}, Lo/djf;->e(J)V

    .line 31
    :cond_1
    return v2
.end method

.method public read([B)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 64
    new-instance v0, Ljava/io/IOException;

    const-string v1, "read on a null InputStream"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 66
    :cond_0
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    .line 67
    if-lez v2, :cond_1

    .line 69
    int-to-long v0, v2

    invoke-static {v0, v1}, Lo/djf;->e(J)V

    .line 71
    :cond_1
    return v2
.end method

.method public read([BII)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 76
    new-instance v0, Ljava/io/IOException;

    const-string v1, "read on a null InputStream"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 78
    :cond_0
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    .line 79
    if-lez v2, :cond_1

    .line 81
    int-to-long v0, v2

    invoke-static {v0, v1}, Lo/djf;->e(J)V

    .line 83
    :cond_1
    return v2
.end method

.method public reset()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 87
    iget-object v2, p0, Lo/djk;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 88
    :try_start_0
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 89
    new-instance v0, Ljava/io/IOException;

    const-string v1, "reset on a null InputStream"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 91
    :cond_0
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 93
    :goto_0
    return-void
.end method

.method public skip(J)J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 96
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 97
    new-instance v0, Ljava/io/IOException;

    const-string v1, "skip on a null InputStream"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 99
    :cond_0
    iget-object v0, p0, Lo/djk;->c:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v0

    return-wide v0
.end method
