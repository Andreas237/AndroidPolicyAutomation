.class final Lo/asu$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asu;->c(Lo/asu;Ljava/util/ArrayList;)Lo/brd;
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
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic d:Lo/asu;


# direct methods
.method constructor <init>(Ljava/util/ArrayList;Lo/asu;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lo/asu$1;->a:Ljava/util/ArrayList;

    iput-object p2, p0, Lo/asu$1;->d:Lo/asu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 199
    invoke-virtual {p0, p1}, Lo/asu$1;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 7

    .line 204
    new-instance v2, Lcom/huawei/health/sns/server/group/CreateGroupRequest;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/group/CreateGroupRequest;-><init>()V

    .line 205
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v3

    .line 206
    iget-object v0, p0, Lo/asu$1;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/asu$1;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 208
    iget-object v0, p0, Lo/asu$1;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/model/user/User;

    .line 210
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    cmp-long v0, v0, v3

    if-eqz v0, :cond_0

    .line 212
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->addUserList_(J)V

    .line 214
    :cond_0
    goto :goto_0

    .line 217
    :cond_1
    const-string v0, ""

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->setGrpName_(Ljava/lang/String;)V

    .line 218
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->setGrpTags_(Ljava/lang/String;)V

    .line 219
    invoke-static {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 220
    iget-object v0, p0, Lo/asu$1;->d:Lo/asu;

    iget-object v1, p0, Lo/asu$1;->a:Ljava/util/ArrayList;

    invoke-static {v0, v5, v2, v1}, Lo/asu;->c(Lo/asu;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/server/group/CreateGroupRequest;Ljava/util/ArrayList;)V

    .line 221
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
