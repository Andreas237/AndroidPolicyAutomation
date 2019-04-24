.class Lo/akl$c;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lo/akl;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/akl;)V
    .locals 0

    .line 476
    invoke-direct {p0, p1}, Lo/aju;-><init>(Ljava/lang/Object;)V

    .line 477
    return-void
.end method


# virtual methods
.method public a(Lo/akl;Landroid/os/Message;)V
    .locals 4

    .line 481
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 482
    :cond_0
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SoftApHandler this object is null or msg is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 483
    return-void

    .line 485
    :cond_1
    invoke-static {p1}, Lo/akl;->e(Lo/akl;)I

    move-result v0

    const/16 v1, 0x3e7

    if-ne v1, v0, :cond_2

    .line 486
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SoftApHandler this object has release all, ignore this msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 487
    return-void

    .line 489
    :cond_2
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 493
    :sswitch_0
    iget v0, p2, Landroid/os/Message;->what:I

    invoke-static {p1, v0}, Lo/akl;->a(Lo/akl;I)V

    .line 494
    goto :goto_1

    .line 501
    :sswitch_1
    iget v0, p2, Landroid/os/Message;->what:I

    invoke-static {p1, v0}, Lo/akl;->c(Lo/akl;I)V

    .line 502
    goto :goto_1

    .line 510
    :sswitch_2
    invoke-static {p1, p2}, Lo/akl;->d(Lo/akl;Landroid/os/Message;)V

    .line 511
    goto :goto_1

    .line 514
    :sswitch_3
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SoftApHandler MSG_WHOLE_TIME_OUT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 515
    const/16 v0, 0x3e8

    invoke-virtual {p0, v0}, Lo/akl$c;->removeMessages(I)V

    .line 516
    const/16 v0, 0x3ea

    invoke-virtual {p0, v0}, Lo/akl$c;->removeMessages(I)V

    .line 517
    invoke-virtual {p1}, Lo/akl;->a()V

    .line 518
    goto :goto_1

    .line 521
    :goto_0
    const-string v0, "SoftApOuthManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SoftApHandler default msg:"

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

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 525
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_0
        0x4 -> :sswitch_1
        0x5 -> :sswitch_1
        0x6 -> :sswitch_1
        0x7 -> :sswitch_2
        0x8 -> :sswitch_2
        0x9 -> :sswitch_2
        0xa -> :sswitch_3
        0x64 -> :sswitch_0
        0x66 -> :sswitch_1
        0x67 -> :sswitch_2
        0x68 -> :sswitch_2
        0x3e8 -> :sswitch_1
        0x3ea -> :sswitch_2
    .end sparse-switch
.end method

.method public synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 473
    move-object v0, p1

    check-cast v0, Lo/akl;

    invoke-virtual {p0, v0, p2}, Lo/akl$c;->a(Lo/akl;Landroid/os/Message;)V

    return-void
.end method
