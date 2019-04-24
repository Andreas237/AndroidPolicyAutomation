.class final Lo/sw;
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
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    const-string v0, "(01)"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    .line 51
    invoke-virtual {p0}, Lo/sw;->e()Lo/th;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Lo/th;->d(II)I

    move-result v5

    .line 52
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    const/16 v0, 0x8

    invoke-virtual {p0, v3, v0, v4}, Lo/sw;->d(Ljava/lang/StringBuilder;II)V

    .line 56
    invoke-virtual {p0}, Lo/sw;->e()Lo/th;

    move-result-object v0

    const/16 v1, 0x30

    invoke-virtual {v0, v3, v1}, Lo/th;->c(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
