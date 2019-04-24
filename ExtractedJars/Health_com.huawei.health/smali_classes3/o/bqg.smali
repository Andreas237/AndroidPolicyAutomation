.class public final Lo/bqg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bqg$d;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Lo/bpv;

.field private final c:Lo/bqi;

.field private final d:Ljava/lang/String;

.field private final e:Lo/bpz;

.field private final f:Ljava/net/URL;


# direct methods
.method private constructor <init>(Lo/bqg$d;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-static {p1}, Lo/bqg$d;->e(Lo/bqg$d;)I

    move-result v0

    iput v0, p0, Lo/bqg;->a:I

    .line 30
    invoke-static {p1}, Lo/bqg$d;->d(Lo/bqg$d;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bqg;->d:Ljava/lang/String;

    .line 31
    invoke-static {p1}, Lo/bqg$d;->a(Lo/bqg$d;)Lo/bpv$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bpv$d;->e()Lo/bpv;

    move-result-object v0

    iput-object v0, p0, Lo/bqg;->b:Lo/bpv;

    .line 32
    invoke-static {p1}, Lo/bqg$d;->c(Lo/bqg$d;)Lo/bqi;

    move-result-object v0

    iput-object v0, p0, Lo/bqg;->c:Lo/bqi;

    .line 33
    invoke-static {p1}, Lo/bqg$d;->b(Lo/bqg$d;)Lo/bpz;

    move-result-object v0

    iput-object v0, p0, Lo/bqg;->e:Lo/bpz;

    .line 34
    invoke-static {p1}, Lo/bqg$d;->h(Lo/bqg$d;)Ljava/net/URL;

    move-result-object v0

    iput-object v0, p0, Lo/bqg;->f:Ljava/net/URL;

    .line 35
    return-void
.end method

.method synthetic constructor <init>(Lo/bqg$d;Lo/bqg$1;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lo/bqg;-><init>(Lo/bqg$d;)V

    return-void
.end method


# virtual methods
.method public a()Lo/bqi;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/bqg;->c:Lo/bqi;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 3

    .line 107
    const-string v2, ""

    .line 108
    iget-object v0, p0, Lo/bqg;->f:Ljava/net/URL;

    if-eqz v0, :cond_0

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/bqg;->f:Ljava/net/URL;

    invoke-virtual {v1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bqg;->f:Ljava/net/URL;

    .line 111
    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bqg;->f:Ljava/net/URL;

    .line 112
    invoke-virtual {v1}, Ljava/net/URL;->getPort()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bqg;->f:Ljava/net/URL;

    .line 113
    invoke-virtual {v1}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 116
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response{code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/bqg;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bqg;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/bqg;->d:Ljava/lang/String;

    return-object v0
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 129
    invoke-virtual {p0}, Lo/bqg;->a()Lo/bqi;

    move-result-object v0

    invoke-static {v0}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 131
    iget-object v0, p0, Lo/bqg;->e:Lo/bpz;

    invoke-static {v0}, Lo/bpe;->d(Ljava/io/Closeable;)V

    .line 132
    return-void
.end method

.method public d()Z
    .locals 2

    .line 44
    iget v0, p0, Lo/bqg;->a:I

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()I
    .locals 1

    .line 53
    iget v0, p0, Lo/bqg;->a:I

    return v0
.end method

.method public e(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 72
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lo/bqg;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 77
    iget-object v0, p0, Lo/bqg;->b:Lo/bpv;

    invoke-virtual {v0, p1}, Lo/bpv;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 78
    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Response{code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/bqg;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bqg;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
