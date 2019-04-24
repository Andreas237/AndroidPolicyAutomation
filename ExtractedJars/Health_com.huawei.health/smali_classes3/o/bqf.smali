.class Lo/bqf;
.super Ljava/io/BufferedOutputStream;
.source "SourceFile"


# instance fields
.field private c:Lo/bqa;


# direct methods
.method constructor <init>(Ljava/io/OutputStream;Lo/bqa;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 24
    iput-object p2, p0, Lo/bqf;->c:Lo/bqa;

    .line 25
    return-void
.end method

.method private a(I)V
    .locals 3

    .line 37
    iget-object v0, p0, Lo/bqf;->c:Lo/bqa;

    if-eqz v0, :cond_0

    if-lez p1, :cond_0

    .line 39
    iget-object v0, p0, Lo/bqf;->c:Lo/bqa;

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Lo/bqa;->a(J)V

    .line 41
    :cond_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lo/bqf;->c:Lo/bqa;

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lo/bqf;->c:Lo/bqa;

    invoke-virtual {v0}, Lo/bqa;->d()V

    .line 80
    :cond_0
    invoke-super {p0}, Ljava/io/BufferedOutputStream;->close()V

    .line 81
    return-void
.end method

.method public declared-synchronized write(I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 63
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    new-instance v0, Lo/bpx;

    invoke-direct {v0}, Lo/bpx;-><init>()V

    throw v0

    .line 68
    :cond_0
    invoke-super {p0, p1}, Ljava/io/BufferedOutputStream;->write(I)V

    .line 69
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/bqf;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized write([BII)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 47
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    new-instance v0, Lo/bpx;

    invoke-direct {v0}, Lo/bpx;-><init>()V

    throw v0

    .line 53
    :cond_0
    if-nez p1, :cond_1

    .line 54
    monitor-exit p0

    return-void

    .line 55
    :cond_1
    invoke-super {p0, p1, p2, p3}, Ljava/io/BufferedOutputStream;->write([BII)V

    .line 56
    invoke-direct {p0, p3}, Lo/bqf;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
