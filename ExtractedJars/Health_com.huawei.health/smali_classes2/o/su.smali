.class final Lo/su;
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
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;
        }
    .end annotation

    .line 47
    invoke-virtual {p0}, Lo/su;->c()Lo/qm;

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

    invoke-virtual {p0, v3, v0}, Lo/su;->b(Ljava/lang/StringBuilder;I)V

    .line 55
    .line 56
    invoke-virtual {p0}, Lo/su;->e()Lo/th;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lo/th;->d(II)I

    move-result v4

    .line 57
    const-string v0, "(392"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    const/16 v0, 0x29

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-virtual {p0}, Lo/su;->e()Lo/th;

    move-result-object v0

    const/16 v1, 0x32

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/th;->d(ILjava/lang/String;)Lo/tj;

    move-result-object v5

    .line 63
    invoke-virtual {v5}, Lo/tj;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
