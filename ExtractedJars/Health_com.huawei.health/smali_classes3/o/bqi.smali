.class public abstract Lo/bqi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c(Ljava/lang/String;JLjava/io/InputStream;)Lo/bqi;
    .locals 2

    .line 140
    if-nez p3, :cond_0

    .line 142
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "source == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 144
    :cond_0
    new-instance v0, Lo/bqi$2;

    invoke-direct {v0, p0, p1, p2, p3}, Lo/bqi$2;-><init>(Ljava/lang/String;JLjava/io/InputStream;)V

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 80
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Lo/bqi;->d()[B

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    return-object v0
.end method

.method public abstract b()Ljava/io/InputStream;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public close()V
    .locals 1

    .line 87
    invoke-virtual {p0}, Lo/bqi;->b()Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 88
    return-void
.end method

.method public final d()[B
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 43
    invoke-virtual {p0}, Lo/bqi;->e()J

    move-result-wide v3

    .line 44
    const-wide/32 v0, 0x7fffffff

    cmp-long v0, v3, v0

    if-lez v0, :cond_0

    .line 46
    const-string v0, "HttpUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot buffer entire body for content length:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0

    .line 50
    :cond_0
    invoke-virtual {p0}, Lo/bqi;->b()Ljava/io/InputStream;

    move-result-object v5

    .line 54
    :try_start_0
    invoke-static {v5}, Lo/bpe;->e(Ljava/io/InputStream;)[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v6

    .line 58
    invoke-static {v5}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 59
    goto :goto_0

    .line 58
    :catchall_0
    move-exception v7

    invoke-static {v5}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 59
    throw v7

    .line 61
    :goto_0
    const-wide/16 v0, -0x1

    cmp-long v0, v3, v0

    if-eqz v0, :cond_1

    array-length v0, v6

    int-to-long v0, v0

    cmp-long v0, v3, v0

    if-eqz v0, :cond_1

    .line 63
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Content-Length and stream length disagree"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_1
    return-object v6
.end method

.method public abstract e()J
.end method
