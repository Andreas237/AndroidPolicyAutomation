.class Lcom/huawei/health/sns/ui/chat/GroupChatActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->b(Lcom/huawei/health/sns/model/group/Group;)V
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
.field final synthetic a:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

.field final synthetic d:Lcom/huawei/health/sns/model/group/Group;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 888
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$1;->a:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$1;->d:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 888
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$1;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 892
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$1;->d:Lcom/huawei/health/sns/model/group/Group;

    .line 893
    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    .line 892
    invoke-virtual {v0, v1, v2}, Lo/ath;->f(J)Ljava/util/ArrayList;

    move-result-object v3

    .line 894
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 895
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$1;->a:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->d(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 896
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$1;->d:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 898
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$1;->a:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->d(Lcom/huawei/health/sns/ui/chat/GroupChatActivity;)Ljava/lang/String;

    move-result-object v5

    .line 900
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$1;->a:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 902
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$1;->a:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/chat/GroupChatActivity$1;->a:Lcom/huawei/health/sns/ui/chat/GroupChatActivity;

    iget-object v1, v1, Lcom/huawei/health/sns/ui/chat/GroupChatActivity;->I:Landroid/os/Handler;

    const/16 v2, 0x151

    invoke-virtual {v1, v2, v5}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 904
    :cond_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
