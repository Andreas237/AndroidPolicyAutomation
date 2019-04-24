.class Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$4;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V
    .locals 0

    .line 226
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$4;->a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 230
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 231
    const-string v0, "action_unfollow_success"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 233
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$4;->a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->b(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 235
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$4;->a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->finish()V

    goto :goto_0

    .line 238
    :cond_0
    const-string v0, "action_follow_state_change"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 240
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$4;->a:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V

    .line 242
    :cond_1
    :goto_0
    return-void
.end method
