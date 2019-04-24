.class Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$2;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

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

    .line 221
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$2;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->a(Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;)Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$a;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/model/chat/MessageItem;

    .line 222
    if-eqz v3, :cond_0

    .line 224
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$2;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    const-class v1, Lcom/huawei/health/sns/ui/chat/ChatRecordActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 225
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 226
    const-string v0, "message_id"

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getId()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 227
    const-string v0, "chat_type"

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 228
    const-string v0, "user_id"

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 229
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 230
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity$2;->e:Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/health/sns/ui/chat/SearchChatRecordActivity;->startActivity(Landroid/content/Intent;)V

    .line 232
    :cond_0
    return-void
.end method
