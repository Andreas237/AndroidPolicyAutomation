.class final Lo/td;
.super Lo/tc;
.source "SourceFile"


# direct methods
.method constructor <init>(Lo/qm;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lo/tc;-><init>(Lo/qm;)V

    .line 43
    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;
        }
    .end annotation

    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    invoke-virtual {p0}, Lo/td;->e()Lo/th;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v2, v1}, Lo/th;->c(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
