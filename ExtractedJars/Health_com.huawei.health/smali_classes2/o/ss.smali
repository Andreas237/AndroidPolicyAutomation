.class final Lo/ss;
.super Lo/sx;
.source "SourceFile"


# direct methods
.method constructor <init>(Lo/qm;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lo/sx;-><init>(Lo/qm;)V

    .line 43
    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;
        }
    .end annotation

    .line 47
    invoke-virtual {p0}, Lo/ss;->c()Lo/qm;

    move-result-object v0

    invoke-virtual {v0}, Lo/qm;->d()I

    move-result v0

    const/16 v1, 0x30

    if-ge v0, v1, :cond_0

    .line 48
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 51
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    const/16 v0, 0x8

    invoke-virtual {p0, v3, v0}, Lo/ss;->b(Ljava/lang/StringBuilder;I)V

    .line 55
    .line 56
    invoke-virtual {p0}, Lo/ss;->e()Lo/th;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lo/th;->d(II)I

    move-result v4

    .line 58
    const-string v0, "(393"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    const/16 v0, 0x29

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-virtual {p0}, Lo/ss;->e()Lo/th;

    move-result-object v0

    const/16 v1, 0x32

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Lo/th;->d(II)I

    move-result v5

    .line 64
    div-int/lit8 v0, v5, 0x64

    if-nez v0, :cond_1

    .line 65
    const/16 v0, 0x30

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    :cond_1
    div-int/lit8 v0, v5, 0xa

    if-nez v0, :cond_2

    .line 68
    const/16 v0, 0x30

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    :cond_2
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-virtual {p0}, Lo/ss;->e()Lo/th;

    move-result-object v0

    const/16 v1, 0x3c

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/th;->d(ILjava/lang/String;)Lo/tj;

    move-result-object v6

    .line 74
    invoke-virtual {v6}, Lo/tj;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
