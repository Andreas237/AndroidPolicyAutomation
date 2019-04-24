.class Lo/bqd;
.super Ljava/io/BufferedInputStream;
.source "SourceFile"


# instance fields
.field private b:Lo/bqa;


# direct methods
.method constructor <init>(Ljava/io/InputStream;Lo/bqa;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 24
    iput-object p2, p0, Lo/bqd;->b:Lo/bqa;

    .line 25
    return-void
.end method

.method private a(I)V
    .locals 3

    .line 37
    iget-object v0, p0, Lo/bqd;->b:Lo/bqa;

    if-eqz v0, :cond_0

    if-lez p1, :cond_0

    .line 39
    iget-object v0, p0, Lo/bqd;->b:Lo/bqa;

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

    .line 89
    iget-object v0, p0, Lo/bqd;->b:Lo/bqa;

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lo/bqd;->b:Lo/bqa;

    invoke-virtual {v0}, Lo/bqa;->d()V

    .line 93
    :cond_0
    invoke-super {p0}, Ljava/io/BufferedInputStream;->close()V

    .line 94
    return-void
.end method

.method public declared-synchronized read()I
    .locals 2
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

    .line 52
    :cond_0
    invoke-super {p0}, Ljava/io/BufferedInputStream;->read()I

    move-result v1

    .line 53
    invoke-direct {p0, v1}, Lo/bqd;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    monitor-exit p0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public read([B)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 76
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 78
    new-instance v0, Lo/bpx;

    invoke-direct {v0}, Lo/bpx;-><init>()V

    throw v0

    .line 81
    :cond_0
    invoke-super {p0, p1}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v1

    .line 82
    invoke-direct {p0, v1}, Lo/bqd;->a(I)V

    .line 83
    return v1
.end method

.method public declared-synchronized read([BII)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 62
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    new-instance v0, Lo/bpx;

    invoke-direct {v0}, Lo/bpx;-><init>()V

    throw v0

    .line 67
    :cond_0
    invoke-super {p0, p1, p2, p3}, Ljava/io/BufferedInputStream;->read([BII)I

    move-result v1

    .line 68
    invoke-direct {p0, v1}, Lo/bqd;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
