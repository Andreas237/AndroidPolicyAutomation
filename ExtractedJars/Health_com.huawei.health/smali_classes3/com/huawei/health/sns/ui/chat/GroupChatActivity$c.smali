.class Lcom/huawei/health/sns/ui/chat/GroupChatActivity$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/GroupChatActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/chat/GroupChatActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V
    .locals 1

    .line 500
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 501
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$c;->d:Ljava/lang/ref/WeakReference;

    .line 502
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 507
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 508
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$c;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    .line 509
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 511
    :cond_0
    return-void

    .line 514
    :cond_1
    invoke-virtual {v1, p1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->e(Landroid/os/Message;)V

    .line 515
    invoke-static {v1, p1, v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->a(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 518
    return-void

    .line 521
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 525
    :sswitch_0
    invoke-static {v1, p1, v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->e(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    .line 526
    goto :goto_0

    .line 530
    :sswitch_1
    iget v0, p1, Landroid/os/Message;->arg2:I

    invoke-static {v1, v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->d(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;I)V

    .line 531
    goto :goto_0

    .line 535
    :sswitch_2
    invoke-static {v1, p1, v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->c(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    .line 536
    goto :goto_0

    .line 540
    :sswitch_3
    invoke-static {v1, p1, v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->d(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    .line 541
    goto :goto_0

    .line 545
    :sswitch_4
    invoke-static {v1, p1, v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->b(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    .line 546
    goto :goto_0

    .line 550
    :sswitch_5
    invoke-static {v1, p1, v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->h(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Landroid/os/Message;Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V

    .line 551
    .line 556
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xc1 -> :sswitch_1
        0x147 -> :sswitch_0
        0x150 -> :sswitch_2
        0x151 -> :sswitch_3
        0x152 -> :sswitch_4
        0x153 -> :sswitch_5
    .end sparse-switch
.end method
