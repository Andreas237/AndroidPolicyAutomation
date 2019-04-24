.class Lo/esl$c;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lo/esl;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/esl;)V
    .locals 0

    .line 740
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 741
    return-void
.end method


# virtual methods
.method protected b(Lo/esl;Landroid/os/Message;)V
    .locals 4

    .line 745
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 747
    :sswitch_0
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "show smart msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 748
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-static {p1, v0}, Lo/esl;->e(Lo/esl;Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V

    .line 749
    goto :goto_0

    .line 751
    :sswitch_1
    const-string v0, "SmartCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hide smart msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 752
    invoke-static {p1}, Lo/esl;->a(Lo/esl;)Lo/eso;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 753
    invoke-static {p1}, Lo/esl;->a(Lo/esl;)Lo/eso;

    move-result-object v0

    iget-object v0, v0, Lo/eso;->d:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 759
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method protected synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 737
    move-object v0, p1

    check-cast v0, Lo/esl;

    invoke-virtual {p0, v0, p2}, Lo/esl$c;->b(Lo/esl;Landroid/os/Message;)V

    return-void
.end method
