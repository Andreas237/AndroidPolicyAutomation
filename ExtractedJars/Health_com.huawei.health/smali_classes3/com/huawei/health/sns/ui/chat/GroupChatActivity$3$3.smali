.class Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->onTextChanged(Ljava/lang/CharSequence;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;)V
    .locals 0

    .line 1181
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3$3;->a:Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1186
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 1187
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3$3;->a:Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    const-class v1, Lcom/huawei/health/sns/ui/chat/ShowGroupMemberForAtActivity;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1188
    const-string v0, "groupId"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3$3;->a:Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;

    iget-object v1, v1, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    iget-wide v1, v1, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->f:J

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1189
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3$3;->a:Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$3;->b:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v3, v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 1190
    return-void
.end method
