.class public Lo/eqh$e;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eqh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lo/eqh;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/eqh;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 51
    return-void
.end method


# virtual methods
.method public a(Lo/eqh;Landroid/os/Message;)V
    .locals 5

    .line 55
    invoke-static {}, Lo/eqh;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessageWhenReferenceNotNull()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 58
    invoke-static {}, Lo/eqh;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessageWhenReferenceNotNull obj == null !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    return-void

    .line 62
    :cond_0
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 64
    :sswitch_0
    invoke-static {}, Lo/eqh;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FunctionSetBloodPressureCardReaderHandler()  handleMessageWhenReferenceNotNull :  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "refreshData"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    invoke-static {p1}, Lo/eqh;->d(Lo/eqh;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Lo/eqa;->h:Lo/eqa;

    iget-object v2, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v2, Lo/epx;

    invoke-static {p1, v0, v1, v2}, Lo/eqh;->a(Lo/eqh;Ljava/util/List;Lo/eqa;Lo/epx;)Ljava/util/List;

    move-result-object v4

    .line 66
    invoke-static {p1, v4}, Lo/eqh;->d(Lo/eqh;Ljava/util/List;)V

    .line 67
    .line 71
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 47
    move-object v0, p1

    check-cast v0, Lo/eqh;

    invoke-virtual {p0, v0, p2}, Lo/eqh$e;->a(Lo/eqh;Landroid/os/Message;)V

    return-void
.end method
