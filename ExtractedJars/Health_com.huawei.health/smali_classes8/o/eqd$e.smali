.class public Lo/eqd$e;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eqd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lo/eqd;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/eqd;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 48
    return-void
.end method


# virtual methods
.method public d(Lo/eqd;Landroid/os/Message;)V
    .locals 5

    .line 52
    invoke-static {}, Lo/eqd;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessageWhenReferenceNotNull()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 55
    invoke-static {}, Lo/eqd;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessageWhenReferenceNotNull obj == null !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    return-void

    .line 59
    :cond_0
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 61
    :sswitch_0
    invoke-static {}, Lo/eqd;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FunctionSetBloodSugarCardReaderHandler()  handleMessageWhenReferenceNotNull :  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "refreshData"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    invoke-static {p1}, Lo/eqd;->b(Lo/eqd;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Lo/eqa;->i:Lo/eqa;

    iget-object v2, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Lo/epx;

    invoke-static {p1, v0, v1, v2}, Lo/eqd;->a(Lo/eqd;Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;

    move-result-object v4

    .line 63
    invoke-static {p1, v4}, Lo/eqd;->c(Lo/eqd;Ljava/util/List;)V

    .line 64
    .line 68
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 44
    move-object v0, p1

    check-cast v0, Lo/eqd;

    invoke-virtual {p0, v0, p2}, Lo/eqd$e;->d(Lo/eqd;Landroid/os/Message;)V

    return-void
.end method
