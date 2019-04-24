.class Lo/cmj$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cmj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lo/cmj;


# direct methods
.method public constructor <init>(Lo/cmj;Landroid/os/Looper;)V
    .locals 0

    .line 558
    iput-object p1, p0, Lo/cmj$e;->a:Lo/cmj;

    .line 559
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 560
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 564
    if-eqz p1, :cond_2

    .line 566
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 569
    :sswitch_0
    const/4 v2, 0x1

    .line 571
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lo/cmj$a;

    .line 573
    iget-object v0, p0, Lo/cmj$e;->a:Lo/cmj;

    invoke-static {v0}, Lo/cmj;->b(Lo/cmj;)Lo/abf;

    move-result-object v0

    if-nez v0, :cond_0

    .line 574
    iget-object v0, p0, Lo/cmj$e;->a:Lo/cmj;

    invoke-static {v0}, Lo/cmj;->i(Lo/cmj;)Z

    move-result v2

    .line 577
    :cond_0
    if-eqz v2, :cond_1

    .line 578
    iget-object v0, p0, Lo/cmj$e;->a:Lo/cmj;

    const/16 v1, 0x64

    invoke-static {v0, v1, v3}, Lo/cmj;->e(Lo/cmj;ILo/cmj$a;)V

    goto :goto_0

    .line 580
    :cond_1
    if-eqz v3, :cond_2

    .line 581
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/cmj$a;->a(Z)V

    .line 584
    .line 590
    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
    .end sparse-switch
.end method
