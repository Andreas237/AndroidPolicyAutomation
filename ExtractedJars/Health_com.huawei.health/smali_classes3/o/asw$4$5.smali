.class Lo/asw$4$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asw$4;->a()V
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
.field final synthetic e:Lo/asw$4;


# direct methods
.method constructor <init>(Lo/asw$4;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lo/asw$4$5;->e:Lo/asw$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 181
    invoke-virtual {p0, p1}, Lo/asw$4$5;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 7

    .line 185
    const/4 v3, 0x0

    .line 186
    new-instance v4, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;-><init>()V

    .line 187
    iget-object v0, p0, Lo/asw$4$5;->e:Lo/asw$4;

    iget-object v0, v0, Lo/asw$4;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v0

    iput-wide v0, v4, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;->grpID_:J

    .line 188
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v4, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;->userList_:Ljava/util/List;

    .line 189
    iget-object v0, p0, Lo/asw$4$5;->e:Lo/asw$4;

    iget-object v0, v0, Lo/asw$4;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 191
    iget-object v0, v4, Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;->userList_:Ljava/util/List;

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 192
    goto :goto_0

    .line 193
    :cond_0
    invoke-static {v4}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v3

    .line 194
    iget-object v0, p0, Lo/asw$4$5;->e:Lo/asw$4;

    iget-object v0, v0, Lo/asw$4;->b:Lo/asw;

    iget-object v1, p0, Lo/asw$4$5;->e:Lo/asw$4;

    iget v1, v1, Lo/asw$4;->e:I

    iget-object v2, p0, Lo/asw$4$5;->e:Lo/asw$4;

    iget-object v2, v2, Lo/asw$4;->a:Ljava/util/ArrayList;

    invoke-static {v0, v1, v2, v3, v4}, Lo/asw;->e(Lo/asw;ILjava/util/ArrayList;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/server/group/DeleteGroupMemberRequest;)V

    .line 195
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
