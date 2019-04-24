.class Lcom/huawei/health/sns/ui/chat/ChatActivity$2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/ChatActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/ChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/ChatActivity;)V
    .locals 0

    .line 715
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$2;->a:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 719
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 720
    const-string v0, "user_detail_info_change"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "user_groupmember_info_change"

    .line 721
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 723
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 724
    if-nez v3, :cond_1

    .line 726
    return-void

    .line 731
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$2;->a:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0, v3}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->d(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 737
    goto :goto_0

    .line 733
    :catch_0
    move-exception v4

    .line 735
    const-string v0, "ChatActivity"

    const-string v1, "get bundle data exception: "

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 736
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$2;->a:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->finish()V

    .line 738
    :goto_0
    goto :goto_1

    .line 739
    :cond_2
    const-string v0, "action_show_bind_phone_dlg"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 741
    const-string v0, "ChatActivity"

    const-string v1, "_sns_ receive show dlg action"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 742
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$2;->a:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/ChatActivity;->x()V

    goto :goto_1

    .line 744
    :cond_3
    const-string v0, "delete_msg_record"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 746
    const-string v0, "ChatActivity"

    const-string v1, "receiver a delete message record broadcast"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 748
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/ChatActivity$2;->a:Lcom/huawei/health/sns/ui/chat/ChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/ChatActivity;->x:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 751
    :cond_4
    :goto_1
    return-void
.end method
