.class final Lo/atm$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atm;->c(Lo/atm;Ljava/util/ArrayList;Ljava/lang/String;)Lo/brd;
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
.field final synthetic a:Ljava/lang/String;

.field final synthetic c:Lo/atm;

.field final synthetic e:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Ljava/util/ArrayList;Ljava/lang/String;Lo/atm;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lo/atm$3;->e:Ljava/util/ArrayList;

    iput-object p2, p0, Lo/atm$3;->a:Ljava/lang/String;

    iput-object p3, p0, Lo/atm$3;->c:Lo/atm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 210
    invoke-virtual {p0, p1}, Lo/atm$3;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 7

    .line 215
    new-instance v2, Lcom/huawei/health/sns/server/group/CreateGroupRequest;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/group/CreateGroupRequest;-><init>()V

    .line 216
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v3

    .line 217
    iget-object v0, p0, Lo/atm$3;->e:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/atm$3;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 219
    iget-object v0, p0, Lo/atm$3;->e:Ljava/util/ArrayList;

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

    .line 221
    if-eqz v6, :cond_0

    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    cmp-long v0, v0, v3

    if-eqz v0, :cond_0

    .line 223
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->addUserList_(J)V

    .line 225
    :cond_0
    goto :goto_0

    .line 228
    :cond_1
    iget-object v0, p0, Lo/atm$3;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 229
    const-string v0, ""

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->setGrpName_(Ljava/lang/String;)V

    goto :goto_1

    .line 231
    :cond_2
    iget-object v0, p0, Lo/atm$3;->a:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->setGrpName_(Ljava/lang/String;)V

    .line 233
    :goto_1
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/group/CreateGroupRequest;->setGrpTags_(Ljava/lang/String;)V

    .line 234
    invoke-static {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 235
    iget-object v0, p0, Lo/atm$3;->c:Lo/atm;

    iget-object v1, p0, Lo/atm$3;->e:Ljava/util/ArrayList;

    invoke-static {v0, v5, v2, v1}, Lo/atm;->e(Lo/atm;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/server/group/CreateGroupRequest;Ljava/util/ArrayList;)V

    .line 236
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
