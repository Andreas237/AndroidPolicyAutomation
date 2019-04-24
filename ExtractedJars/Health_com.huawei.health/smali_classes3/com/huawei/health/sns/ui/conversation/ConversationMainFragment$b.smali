.class Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V
    .locals 1

    .line 776
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 777
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$b;->c:Ljava/lang/ref/WeakReference;

    .line 778
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 783
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 784
    iget-object v0, p0, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$b;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;

    .line 785
    if-nez v1, :cond_0

    .line 787
    return-void

    .line 790
    :cond_0
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    .line 791
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 793
    :cond_1
    return-void

    .line 795
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 799
    :sswitch_0
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment$b;->removeMessages(I)V

    .line 800
    invoke-static {v1}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->b(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V

    .line 801
    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->e()V

    .line 802
    const/4 v0, 0x0

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;Z)V

    .line 803
    goto :goto_0

    .line 805
    :sswitch_1
    invoke-static {v2}, Lo/bpl;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 807
    invoke-static {v1}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->a(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V

    .line 808
    const/4 v0, 0x0

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;Z)V

    goto :goto_0

    .line 812
    :cond_3
    invoke-static {v1}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->g(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;)V

    .line 813
    const/4 v0, 0x1

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;Z)V

    .line 815
    goto :goto_0

    .line 819
    :sswitch_2
    invoke-static {v1, p1}, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->c(Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;Landroid/os/Message;)V

    .line 820
    iget-object v0, v1, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d()V

    .line 821
    goto :goto_0

    .line 828
    :sswitch_3
    iget-object v0, v1, Lcom/huawei/health/sns/ui/conversation/ConversationMainFragment;->d:Lcom/huawei/health/sns/ui/conversation/ConversationFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/conversation/ConversationFragment;->d()V

    .line 829
    .line 834
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
        0x5 -> :sswitch_2
        0x6 -> :sswitch_3
        0x7 -> :sswitch_3
        0x68 -> :sswitch_2
        0x6a -> :sswitch_3
        0x6c -> :sswitch_3
    .end sparse-switch
.end method
