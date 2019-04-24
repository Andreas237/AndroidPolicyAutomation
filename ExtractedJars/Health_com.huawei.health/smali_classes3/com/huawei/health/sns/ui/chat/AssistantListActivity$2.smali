.class Lcom/huawei/health/sns/ui/chat/AssistantListActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/chat/AssistantListActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$2;->b:Lcom/huawei/health/sns/ui/chat/AssistantListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 140
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$2;->b:Lcom/huawei/health/sns/ui/chat/AssistantListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->b(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$b;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/user/User;

    .line 141
    if-eqz v3, :cond_0

    .line 143
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$2;->b:Lcom/huawei/health/sns/ui/chat/AssistantListActivity;

    const-class v1, Lcom/huawei/health/sns/ui/chat/AssistantChatActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 144
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 145
    const-string v0, "userId"

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 146
    const-string v0, "fromList"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 147
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 148
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$2;->b:Lcom/huawei/health/sns/ui/chat/AssistantListActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->startActivity(Landroid/content/Intent;)V

    .line 150
    :cond_0
    return-void
.end method
