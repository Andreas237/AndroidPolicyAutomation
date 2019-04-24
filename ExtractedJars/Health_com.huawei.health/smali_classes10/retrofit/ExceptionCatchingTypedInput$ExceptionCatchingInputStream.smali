.class Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;
.super Ljava/io/InputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/ExceptionCatchingTypedInput;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ExceptionCatchingInputStream"
.end annotation


# instance fields
.field private final delegate:Ljava/io/InputStream;

.field private thrownException:Ljava/io/IOException;


# direct methods
.method constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 41
    iput-object p1, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->delegate:Ljava/io/InputStream;

    .line 42
    return-void
.end method

.method static synthetic access$000(Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;)Ljava/io/IOException;
    .locals 1

    .line 36
    iget-object v0, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->thrownException:Ljava/io/IOException;

    return-object v0
.end method


# virtual methods
.method public available()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 82
    :try_start_0
    iget-object v0, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->delegate:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 83
    :catch_0
    move-exception v1

    .line 84
    iput-object v1, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->thrownException:Ljava/io/IOException;

    .line 85
    throw v1
.end method

.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 91
    :try_start_0
    iget-object v0, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->delegate:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    goto :goto_0

    .line 92
    :catch_0
    move-exception v1

    .line 93
    iput-object v1, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->thrownException:Ljava/io/IOException;

    .line 94
    throw v1

    .line 96
    :goto_0
    return-void
.end method

.method public declared-synchronized mark(I)V
    .locals 1

    monitor-enter p0

    .line 99
    :try_start_0
    iget-object v0, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->delegate:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public markSupported()Z
    .locals 1

    .line 112
    iget-object v0, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->delegate:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    return v0
.end method

.method public read()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 46
    :try_start_0
    iget-object v0, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->delegate:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 47
    :catch_0
    move-exception v1

    .line 48
    iput-object v1, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->thrownException:Ljava/io/IOException;

    .line 49
    throw v1
.end method

.method public read([B)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 55
    :try_start_0
    iget-object v0, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->delegate:Ljava/io/InputStream;

    invoke-virtual {v0, p1}, Ljava/io/InputStream;->read([B)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 56
    :catch_0
    move-exception v1

    .line 57
    iput-object v1, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->thrownException:Ljava/io/IOException;

    .line 58
    throw v1
.end method

.method public read([BII)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 64
    :try_start_0
    iget-object v0, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->delegate:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 65
    :catch_0
    move-exception v1

    .line 66
    iput-object v1, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->thrownException:Ljava/io/IOException;

    .line 67
    throw v1
.end method

.method public declared-synchronized reset()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 104
    :try_start_0
    iget-object v0, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->delegate:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    goto :goto_0

    .line 105
    :catch_0
    move-exception v1

    .line 106
    :try_start_1
    iput-object v1, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->thrownException:Ljava/io/IOException;

    .line 107
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public skip(J)J
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 73
    :try_start_0
    iget-object v0, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->delegate:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    .line 74
    :catch_0
    move-exception v2

    .line 75
    iput-object v2, p0, Lretrofit/ExceptionCatchingTypedInput$ExceptionCatchingInputStream;->thrownException:Ljava/io/IOException;

    .line 76
    throw v2
.end method
