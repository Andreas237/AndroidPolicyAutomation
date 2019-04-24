.class Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$3;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->O()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V
    .locals 0

    .line 338
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$3;->a:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 342
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$3;->a:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-virtual {v0, p2}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v2

    .line 343
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$3;->a:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v0

    if-nez v0, :cond_0

    .line 345
    const-string v0, "AssistantChatActivity"

    const-string v1, "onReceive app install receiver, mAssistant is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    return-void

    .line 348
    :cond_0
    if-eqz v2, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$3;->a:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->d(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/Assistant;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 351
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$3;->a:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->e(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 353
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity$3;->a:Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;->a(Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;)V

    .line 355
    :cond_1
    return-void
.end method
