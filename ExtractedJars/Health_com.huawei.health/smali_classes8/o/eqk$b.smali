.class public Lo/eqk$b;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eqk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lo/eqk;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/eqk;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 58
    return-void
.end method


# virtual methods
.method public a(Lo/eqk;Landroid/os/Message;)V
    .locals 5

    .line 62
    invoke-static {}, Lo/eqk;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessageWhenReferenceNotNull()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 65
    invoke-static {}, Lo/eqk;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessageWhenReferenceNotNull obj == null !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    return-void

    .line 69
    :cond_0
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 71
    :sswitch_0
    invoke-static {}, Lo/eqk;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FunctionSetWeightCardReaderHandler()  handleMessageWhenReferenceNotNull :  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "refreshData"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    invoke-static {p1}, Lo/eqk;->c(Lo/eqk;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Lo/eqa;->c:Lo/eqa;

    iget-object v2, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Lo/epx;

    invoke-static {p1, v0, v1, v2}, Lo/eqk;->a(Lo/eqk;Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;

    move-result-object v4

    .line 73
    invoke-static {p1, v4}, Lo/eqk;->a(Lo/eqk;Ljava/util/List;)V

    .line 74
    goto :goto_0

    .line 77
    :sswitch_1
    invoke-static {}, Lo/eqk;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "new weight measure  data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    invoke-static {p1}, Lo/eqk;->e(Lo/eqk;)Lo/epy;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 80
    invoke-static {}, Lo/eqk;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "call show  hint "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    invoke-static {p1}, Lo/eqk;->e(Lo/eqk;)Lo/epy;

    move-result-object v0

    invoke-virtual {v0}, Lo/epy;->notifyDataSetChanged()V

    .line 87
    :cond_1
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 54
    move-object v0, p1

    check-cast v0, Lo/eqk;

    invoke-virtual {p0, v0, p2}, Lo/eqk$b;->a(Lo/eqk;Landroid/os/Message;)V

    return-void
.end method
