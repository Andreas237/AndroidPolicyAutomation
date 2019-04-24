.class public Lorg/apache/commons/io/input/TeeInputStream;
.super Lorg/apache/commons/io/input/ProxyInputStream;
.source "SourceFile"


# instance fields
.field private final branch:Ljava/io/OutputStream;

.field private final closeBranch:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 1

    .line 62
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lorg/apache/commons/io/input/TeeInputStream;-><init>(Ljava/io/InputStream;Ljava/io/OutputStream;Z)V

    .line 63
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Ljava/io/OutputStream;Z)V
    .locals 0

    .line 78
    invoke-direct {p0, p1}, Lorg/apache/commons/io/input/ProxyInputStream;-><init>(Ljava/io/InputStream;)V

    .line 79
    iput-object p2, p0, Lorg/apache/commons/io/input/TeeInputStream;->branch:Ljava/io/OutputStream;

    .line 80
    iput-boolean p3, p0, Lorg/apache/commons/io/input/TeeInputStream;->closeBranch:Z

    .line 81
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 93
    :try_start_0
    invoke-super {p0}, Lorg/apache/commons/io/input/ProxyInputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    iget-boolean v0, p0, Lorg/apache/commons/io/input/TeeInputStream;->closeBranch:Z

    if-eqz v0, :cond_1

    .line 96
    iget-object v0, p0, Lorg/apache/commons/io/input/TeeInputStream;->branch:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    goto :goto_0

    .line 95
    :catchall_0
    move-exception v1

    iget-boolean v0, p0, Lorg/apache/commons/io/input/TeeInputStream;->closeBranch:Z

    if-eqz v0, :cond_0

    .line 96
    iget-object v0, p0, Lorg/apache/commons/io/input/TeeInputStream;->branch:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    :cond_0
    throw v1

    .line 99
    :cond_1
    :goto_0
    return-void
.end method

.method public read()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 110
    invoke-super {p0}, Lorg/apache/commons/io/input/ProxyInputStream;->read()I

    move-result v1

    .line 111
    const/4 v0, -0x1

    if-eq v1, v0, :cond_0

    .line 112
    iget-object v0, p0, Lorg/apache/commons/io/input/TeeInputStream;->branch:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    .line 114
    :cond_0
    return v1
.end method

.method public read([B)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 146
    invoke-super {p0, p1}, Lorg/apache/commons/io/input/ProxyInputStream;->read([B)I

    move-result v2

    .line 147
    const/4 v0, -0x1

    if-eq v2, v0, :cond_0

    .line 148
    iget-object v0, p0, Lorg/apache/commons/io/input/TeeInputStream;->branch:Ljava/io/OutputStream;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 150
    :cond_0
    return v2
.end method

.method public read([BII)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 129
    invoke-super {p0, p1, p2, p3}, Lorg/apache/commons/io/input/ProxyInputStream;->read([BII)I

    move-result v1

    .line 130
    const/4 v0, -0x1

    if-eq v1, v0, :cond_0

    .line 131
    iget-object v0, p0, Lorg/apache/commons/io/input/TeeInputStream;->branch:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 133
    :cond_0
    return v1
.end method
