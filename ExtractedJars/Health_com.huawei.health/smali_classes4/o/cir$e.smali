.class Lo/cir$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cir;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/cir;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/cir;)V
    .locals 1

    .line 1629
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 1627
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cir$e;->d:Ljava/lang/ref/WeakReference;

    .line 1630
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/cir$e;->d:Ljava/lang/ref/WeakReference;

    .line 1631
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 1635
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1637
    iget-object v0, p0, Lo/cir$e;->d:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    .line 1638
    :cond_0
    return-void

    .line 1640
    :cond_1
    iget-object v0, p0, Lo/cir$e;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/cir;

    .line 1641
    if-nez v2, :cond_2

    .line 1642
    return-void

    .line 1644
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 1646
    :sswitch_0
    invoke-static {v2}, Lo/cir;->c(Lo/cir;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/healthcloud/plugintrack/R$animator;->track_history_fade_out:I

    invoke-static {v0, v1}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    move-result-object v0

    invoke-static {v2, v0}, Lo/cir;->e(Lo/cir;Landroid/animation/Animator;)Landroid/animation/Animator;

    .line 1647
    invoke-static {v2}, Lo/cir;->j(Lo/cir;)Landroid/animation/Animator;

    move-result-object v0

    invoke-static {v2}, Lo/cir;->d(Lo/cir;)Lo/ciq;

    move-result-object v1

    invoke-virtual {v1}, Lo/ciq;->e()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 1648
    invoke-static {v2}, Lo/cir;->j(Lo/cir;)Landroid/animation/Animator;

    move-result-object v0

    invoke-static {v2}, Lo/cir;->C(Lo/cir;)Landroid/animation/Animator$AnimatorListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1649
    invoke-static {v2}, Lo/cir;->j(Lo/cir;)Landroid/animation/Animator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    .line 1650
    goto :goto_1

    .line 1652
    :goto_0
    iget v3, p1, Landroid/os/Message;->what:I

    .line 1653
    iget v4, p1, Landroid/os/Message;->arg1:I

    .line 1654
    invoke-static {v2, v3, v4}, Lo/cir;->b(Lo/cir;II)V

    .line 1657
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
    .end sparse-switch
.end method
