.class Lcom/huawei/health/sns/ui/chat/GroupChatActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->b(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:J

.field final synthetic d:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;J)V
    .locals 0

    .line 1073
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$5;->d:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    iput-wide p2, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$5;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 1073
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$5;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 1077
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$5;->c:J

    invoke-virtual {v0, v1, v2}, Lo/ath;->f(J)Ljava/util/ArrayList;

    move-result-object v3

    .line 1079
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$5;->d:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 1081
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$5;->d:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 1082
    const/16 v0, 0x152

    iput v0, v4, Landroid/os/Message;->what:I

    .line 1083
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 1084
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {v5, v0, v3}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1085
    invoke-virtual {v4, v5}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 1086
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$5;->d:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1088
    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
