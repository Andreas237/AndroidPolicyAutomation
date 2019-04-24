.class Lcom/huawei/health/sns/ui/chat/AssistantListActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/chat/AssistantListActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$1;->b:Lcom/huawei/health/sns/ui/chat/AssistantListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Ljava/util/ArrayList<Lcom/huawei/health/sns/model/user/User;>;>;)V"
        }
    .end annotation

    .line 184
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$1;->b:Lcom/huawei/health/sns/ui/chat/AssistantListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->a(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)Lcom/huawei/health/sns/ui/chat/AssistantListActivity$c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$c;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 185
    const/4 v0, 0x1

    iput v0, v1, Landroid/os/Message;->what:I

    .line 186
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/ArrayList;

    .line 187
    if-eqz v2, :cond_0

    .line 189
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 190
    const-string v0, "assistant_list"

    invoke-virtual {v3, v0, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 191
    invoke-virtual {v1, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 193
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$1;->b:Lcom/huawei/health/sns/ui/chat/AssistantListActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity;->a(Lcom/huawei/health/sns/ui/chat/AssistantListActivity;)Lcom/huawei/health/sns/ui/chat/AssistantListActivity$c;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/chat/AssistantListActivity$c;->sendMessage(Landroid/os/Message;)Z

    .line 194
    return-void
.end method
