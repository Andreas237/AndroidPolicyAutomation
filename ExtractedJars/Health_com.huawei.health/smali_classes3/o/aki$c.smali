.class Lo/aki$c;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aki;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lo/aki;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/aki;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lo/aju;-><init>(Ljava/lang/Object;)V

    .line 60
    return-void
.end method


# virtual methods
.method public d(Lo/aki;Landroid/os/Message;)V
    .locals 5

    .line 63
    invoke-static {}, Lo/aki;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleMessage"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p2, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 64
    if-nez p1, :cond_0

    .line 65
    return-void

    .line 67
    :cond_0
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 69
    :sswitch_0
    invoke-virtual {p1}, Lo/aki;->d()V

    .line 70
    invoke-virtual {p1}, Lo/aki;->c()V

    .line 71
    invoke-static {p1}, Lo/aki;->c(Lo/aki;)Lo/aja;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 72
    invoke-static {}, Lo/ahs;->e()Lo/ahs;

    move-result-object v0

    invoke-static {p1}, Lo/aki;->c(Lo/aki;)Lo/aja;

    move-result-object v1

    invoke-virtual {v1}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ahs;->f(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .line 73
    if-eqz v4, :cond_1

    .line 74
    const-string v0, "status"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    invoke-static {}, Lo/ahs;->e()Lo/ahs;

    move-result-object v0

    invoke-static {p1}, Lo/aki;->c(Lo/aki;)Lo/aja;

    move-result-object v1

    invoke-virtual {v1}, Lo/aja;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lo/ahs;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 77
    .line 82
    :cond_1
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 56
    move-object v0, p1

    check-cast v0, Lo/aki;

    invoke-virtual {p0, v0, p2}, Lo/aki$c;->d(Lo/aki;Landroid/os/Message;)V

    return-void
.end method
