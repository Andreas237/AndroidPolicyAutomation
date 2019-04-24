.class Lo/asw$3$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asw$3;->a()V
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
.field final synthetic a:Lo/asw$3;


# direct methods
.method constructor <init>(Lo/asw$3;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lo/asw$3$4;->a:Lo/asw$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 67
    invoke-virtual {p0, p1}, Lo/asw$3$4;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 8

    .line 71
    const/4 v5, 0x0

    .line 74
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    iget-object v1, p0, Lo/asw$3$4;->a:Lo/asw$3;

    iget-object v1, v1, Lo/asw$3;->c:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v1

    iget-object v3, p0, Lo/asw$3$4;->a:Lo/asw$3;

    iget-object v3, v3, Lo/asw$3;->c:Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ath;->a(JJ)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v6

    .line 76
    if-nez v6, :cond_0

    .line 78
    iget-object v0, p0, Lo/asw$3$4;->a:Lo/asw$3;

    iget-object v0, v0, Lo/asw$3;->a:Lo/asw;

    iget-object v1, p0, Lo/asw$3$4;->a:Lo/asw$3;

    iget v1, v1, Lo/asw$3;->d:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/asw;->b(Lo/asw;III)V

    .line 79
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 83
    :cond_0
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    if-nez v0, :cond_1

    .line 85
    new-instance v7, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;

    invoke-direct {v7}, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;-><init>()V

    .line 86
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v0

    iput-wide v0, v7, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;->grpID_:J

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v7, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;->userList_:Ljava/util/List;

    .line 88
    iget-object v0, v7, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;->userList_:Ljava/util/List;

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    invoke-static {v7}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 90
    iget-object v0, p0, Lo/asw$3$4;->a:Lo/asw$3;

    iget-object v0, v0, Lo/asw$3;->a:Lo/asw;

    iget-object v1, p0, Lo/asw$3$4;->a:Lo/asw$3;

    iget v1, v1, Lo/asw$3;->d:I

    invoke-static {v0, v1, v5, v6, v7}, Lo/asw;->c(Lo/asw;ILcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/group/GroupMember;Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;)V

    .line 91
    goto :goto_0

    .line 95
    :cond_1
    iget-object v0, p0, Lo/asw$3$4;->a:Lo/asw$3;

    iget-object v0, v0, Lo/asw$3;->a:Lo/asw;

    invoke-static {v0, v6}, Lo/asw;->b(Lo/asw;Lcom/huawei/health/sns/model/group/GroupMember;)V

    .line 96
    iget-object v0, p0, Lo/asw$3$4;->a:Lo/asw$3;

    iget-object v0, v0, Lo/asw$3;->a:Lo/asw;

    iget-object v1, p0, Lo/asw$3$4;->a:Lo/asw$3;

    iget v1, v1, Lo/asw$3;->d:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/asw;->b(Lo/asw;III)V

    .line 98
    :goto_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
