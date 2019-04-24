.class Lo/ebd$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ebd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ebd;


# direct methods
.method constructor <init>(Lo/ebd;Landroid/os/Looper;)V
    .locals 0

    .line 552
    iput-object p1, p0, Lo/ebd$4;->c:Lo/ebd;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 555
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 556
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 557
    return-void

    .line 560
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 562
    :sswitch_0
    iget-object v0, p0, Lo/ebd$4;->c:Lo/ebd;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lo/ebd$a;

    iget-object v1, v1, Lo/ebd$a;->c:Lo/ebd$b;

    const/4 v2, 0x1

    invoke-static {v0, p0, v1, v2}, Lo/ebd;->e(Lo/ebd;Landroid/os/Handler;Lo/ebd$b;Z)V

    .line 563
    goto/16 :goto_0

    .line 565
    :sswitch_1
    iget-object v0, p0, Lo/ebd$4;->c:Lo/ebd;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lo/ebd$a;

    iget-object v1, v1, Lo/ebd$a;->c:Lo/ebd$b;

    const/4 v2, 0x0

    invoke-static {v0, p0, v1, v2}, Lo/ebd;->e(Lo/ebd;Landroid/os/Handler;Lo/ebd$b;Z)V

    .line 566
    goto/16 :goto_0

    .line 568
    :sswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lo/ebd$a;

    invoke-static {v0}, Lo/ebd;->c(Lo/ebd$a;)V

    .line 569
    goto/16 :goto_0

    .line 571
    :sswitch_3
    iget-object v0, p0, Lo/ebd$4;->c:Lo/ebd;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lo/ebd$a;

    const/4 v2, 0x1

    invoke-static {v0, p0, v1, v2}, Lo/ebd;->c(Lo/ebd;Landroid/os/Handler;Lo/ebd$a;Z)V

    .line 572
    goto/16 :goto_0

    .line 574
    :sswitch_4
    iget-object v0, p0, Lo/ebd$4;->c:Lo/ebd;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lo/ebd$a;

    const/4 v2, 0x0

    invoke-static {v0, p0, v1, v2}, Lo/ebd;->c(Lo/ebd;Landroid/os/Handler;Lo/ebd$a;Z)V

    .line 575
    goto :goto_0

    .line 577
    :sswitch_5
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lo/ebd$a;

    invoke-static {v0}, Lo/ebd;->c(Lo/ebd$a;)V

    .line 578
    goto :goto_0

    .line 580
    :sswitch_6
    iget-object v0, p0, Lo/ebd$4;->c:Lo/ebd;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lo/ebd$a;

    const/4 v2, 0x1

    invoke-static {v0, p0, v1, v2}, Lo/ebd;->e(Lo/ebd;Landroid/os/Handler;Lo/ebd$a;Z)V

    .line 581
    goto :goto_0

    .line 583
    :sswitch_7
    iget-object v0, p0, Lo/ebd$4;->c:Lo/ebd;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lo/ebd$a;

    const/4 v2, 0x0

    invoke-static {v0, p0, v1, v2}, Lo/ebd;->e(Lo/ebd;Landroid/os/Handler;Lo/ebd$a;Z)V

    .line 584
    goto :goto_0

    .line 586
    :sswitch_8
    iget-object v0, p0, Lo/ebd$4;->c:Lo/ebd;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lo/ebd$a;

    invoke-static {v0, v1}, Lo/ebd;->e(Lo/ebd;Lo/ebd$a;)V

    .line 587
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lo/ebd$a;

    invoke-static {v0}, Lo/ebd;->c(Lo/ebd$a;)V

    .line 588
    goto :goto_0

    .line 590
    :sswitch_9
    iget-object v0, p0, Lo/ebd$4;->c:Lo/ebd;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lo/ebd$b;

    const/4 v2, 0x2

    invoke-static {v0, p0, v1, v2}, Lo/ebd;->a(Lo/ebd;Landroid/os/Handler;Lo/ebd$b;I)V

    .line 591
    goto :goto_0

    .line 593
    :sswitch_a
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lo/ebd$b;

    invoke-static {v0}, Lo/ebd;->c(Lo/ebd$b;)V

    .line 594
    .line 598
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x3e9 -> :sswitch_0
        0x3ea -> :sswitch_1
        0x3eb -> :sswitch_2
        0x3ec -> :sswitch_3
        0x3ed -> :sswitch_4
        0x3ee -> :sswitch_5
        0x3ef -> :sswitch_6
        0x3f0 -> :sswitch_7
        0x3f1 -> :sswitch_8
        0x44d -> :sswitch_9
        0x44e -> :sswitch_a
    .end sparse-switch
.end method
