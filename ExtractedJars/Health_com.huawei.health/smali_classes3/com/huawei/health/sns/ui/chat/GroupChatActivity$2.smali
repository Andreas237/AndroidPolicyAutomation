.class Lcom/huawei/health/sns/ui/chat/GroupChatActivity$2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/chat/GroupChatActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)V
    .locals 0

    .line 1017
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$2;->c:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1021
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 1022
    const-string v0, "QUIT_GROUP_ACTION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1024
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$2;->c:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->finish()V

    .line 1026
    :cond_0
    return-void
.end method
