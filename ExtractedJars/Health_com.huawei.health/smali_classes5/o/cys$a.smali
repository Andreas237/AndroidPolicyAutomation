.class Lo/cys$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cys;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lo/cys;


# direct methods
.method public constructor <init>(Lo/cys;Landroid/os/Looper;)V
    .locals 0

    .line 1475
    iput-object p1, p0, Lo/cys$a;->a:Lo/cys;

    .line 1476
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1477
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 1482
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1483
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 1486
    :pswitch_0
    iget-object v0, p0, Lo/cys$a;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->h(Lo/cys;)Lo/cxs;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1487
    iget-object v0, p0, Lo/cys$a;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->h(Lo/cys;)Lo/cxs;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/cxs;->e(I)V

    goto :goto_0

    .line 1492
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroid/os/Handler;

    .line 1493
    iget-object v0, p0, Lo/cys$a;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->c(Lo/cys;)Lo/cxk;

    move-result-object v0

    iget-object v1, p0, Lo/cys$a;->a:Lo/cys;

    iget-object v1, v1, Lo/cys;->e:Lo/cyf;

    invoke-virtual {v0, v1, v4}, Lo/cxk;->a(Lo/cyf;Landroid/os/Handler;)V

    .line 1494
    goto :goto_0

    .line 1497
    :pswitch_2
    iget-object v0, p0, Lo/cys$a;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->h(Lo/cys;)Lo/cxs;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1498
    iget-object v0, p0, Lo/cys$a;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->h(Lo/cys;)Lo/cxs;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Lo/cxs;->e(I)V

    goto :goto_0

    .line 1502
    :pswitch_3
    iget-object v0, p0, Lo/cys$a;->a:Lo/cys;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cys;->a(Lo/cys;Z)V

    .line 1503
    goto :goto_0

    .line 1506
    :pswitch_4
    iget-object v0, p0, Lo/cys$a;->a:Lo/cys;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cys;->c(Lo/cys;ILandroid/bluetooth/BluetoothDevice;Z)V

    .line 1507
    goto :goto_0

    .line 1510
    :pswitch_5
    iget-object v0, p0, Lo/cys$a;->a:Lo/cys;

    invoke-static {v0}, Lo/cys;->c(Lo/cys;)Lo/cxk;

    move-result-object v0

    iget-object v1, p0, Lo/cys$a;->a:Lo/cys;

    iget-object v1, v1, Lo/cys;->a:Lo/cyf;

    invoke-virtual {v0, v1}, Lo/cxk;->a(Lo/cyf;)V

    .line 1511
    .line 1515
    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
