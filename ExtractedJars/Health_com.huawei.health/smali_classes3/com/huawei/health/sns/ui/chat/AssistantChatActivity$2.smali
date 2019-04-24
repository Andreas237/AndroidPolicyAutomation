.class Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->T()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 450
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$2;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 11

    .line 454
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v8

    .line 455
    const-string v0, "rec_assist_msg_action"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 457
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v9

    .line 458
    if-nez v9, :cond_0

    .line 460
    return-void

    .line 463
    :cond_0
    const-string v0, "msg_item"

    invoke-virtual {v9, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 465
    const-string v0, "msg_item"

    invoke-virtual {v9, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 467
    if-eqz v10, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$2;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    iget-wide v0, v0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->f:J

    invoke-virtual {v10}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 469
    invoke-static {}, Lo/aow;->e()Lo/aow;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$2;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    .line 470
    invoke-virtual {v10}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v2

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v4

    invoke-virtual {v4}, Lo/aoq;->a()J

    move-result-wide v4

    invoke-virtual {v10}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$2;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    iget-object v7, v7, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->r:Ljava/lang/String;

    .line 469
    invoke-virtual/range {v0 .. v7}, Lo/aow;->b(Landroid/content/Context;JJLjava/lang/String;Ljava/lang/String;)V

    .line 475
    :cond_1
    return-void
.end method
