.class Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;
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

    .line 317
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$1;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 321
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 322
    const-string v0, "action_unfollow_success"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 324
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$1;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 326
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$1;->d:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->finish()V

    .line 329
    :cond_0
    return-void
.end method
