.class Lo/div$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/div;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/div;


# direct methods
.method constructor <init>(Lo/div;Landroid/os/Looper;)V
    .locals 0

    .line 665
    iput-object p1, p0, Lo/div$2;->a:Lo/div;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 668
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 669
    const-string v0, "HWMultiSimMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "msg.what "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 670
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 672
    :pswitch_0
    iget-object v0, p0, Lo/div$2;->a:Lo/div;

    const/4 v1, 0x1

    const v2, 0x186a1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/div;->b(Lo/div;IILjava/lang/Object;)V

    .line 673
    iget-object v0, p0, Lo/div$2;->a:Lo/div;

    const/4 v1, 0x2

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/div;->b(Lo/div;IILjava/lang/Object;)V

    .line 674
    goto :goto_0

    .line 676
    :pswitch_1
    iget-object v0, p0, Lo/div$2;->a:Lo/div;

    const/4 v1, 0x3

    const v2, 0x186a1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/div;->b(Lo/div;IILjava/lang/Object;)V

    .line 677
    iget-object v0, p0, Lo/div$2;->a:Lo/div;

    const/4 v1, 0x4

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/div;->b(Lo/div;IILjava/lang/Object;)V

    .line 678
    goto :goto_0

    .line 680
    :pswitch_2
    iget-object v0, p0, Lo/div$2;->a:Lo/div;

    const/4 v1, 0x4

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/div;->b(Lo/div;IILjava/lang/Object;)V

    .line 681
    goto :goto_0

    .line 683
    :pswitch_3
    iget-object v0, p0, Lo/div$2;->a:Lo/div;

    const/4 v1, 0x2

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/div;->b(Lo/div;IILjava/lang/Object;)V

    .line 684
    goto :goto_0

    .line 686
    :pswitch_4
    iget-object v0, p0, Lo/div$2;->a:Lo/div;

    invoke-virtual {v0}, Lo/div;->a()V

    .line 687
    goto :goto_0

    .line 689
    :pswitch_5
    iget-object v0, p0, Lo/div$2;->a:Lo/div;

    invoke-static {v0}, Lo/div;->c(Lo/div;)V

    .line 690
    goto :goto_0

    .line 692
    :pswitch_6
    iget-object v0, p0, Lo/div$2;->a:Lo/div;

    const/4 v1, 0x6

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/div;->b(Lo/div;IILjava/lang/Object;)V

    .line 693
    .line 697
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method
