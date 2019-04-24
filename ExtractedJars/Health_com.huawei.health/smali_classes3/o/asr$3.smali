.class final Lo/asr$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asr;->b(Lo/asr;JLjava/util/ArrayList;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/asr;

.field final synthetic b:J

.field final synthetic c:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(JLjava/util/ArrayList;Lo/asr;)V
    .locals 0

    .line 141
    iput-wide p1, p0, Lo/asr$3;->b:J

    iput-object p3, p0, Lo/asr$3;->c:Ljava/util/ArrayList;

    iput-object p4, p0, Lo/asr$3;->a:Lo/asr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 141
    invoke-virtual {p0, p1}, Lo/asr$3;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 7

    .line 145
    new-instance v4, Lcom/huawei/health/sns/server/group/InviteToJoinGroupRequest;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/group/InviteToJoinGroupRequest;-><init>()V

    .line 146
    iget-wide v0, p0, Lo/asr$3;->b:J

    iput-wide v0, v4, Lcom/huawei/health/sns/server/group/InviteToJoinGroupRequest;->grpID_:J

    .line 147
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v4, Lcom/huawei/health/sns/server/group/InviteToJoinGroupRequest;->userList_:Ljava/util/List;

    .line 148
    iget-object v0, p0, Lo/asr$3;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/user/User;

    .line 150
    iget-object v0, v4, Lcom/huawei/health/sns/server/group/InviteToJoinGroupRequest;->userList_:Ljava/util/List;

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    goto :goto_0

    .line 152
    :cond_0
    invoke-static {v4}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 154
    iget-object v0, p0, Lo/asr$3;->a:Lo/asr;

    iget-wide v1, p0, Lo/asr$3;->b:J

    iget-object v3, p0, Lo/asr$3;->c:Ljava/util/ArrayList;

    invoke-static {v0, v5, v1, v2, v3}, Lo/asr;->c(Lo/asr;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;JLjava/util/ArrayList;)V

    .line 156
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
