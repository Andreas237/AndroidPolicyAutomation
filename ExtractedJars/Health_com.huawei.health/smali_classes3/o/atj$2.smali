.class final Lo/atj$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atj;->c(Lo/atj;Lcom/huawei/health/sns/model/group/GroupNotify;Z)Lo/brd;
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
.field final synthetic a:Z

.field final synthetic d:Lcom/huawei/health/sns/model/group/GroupNotify;

.field final synthetic e:Lo/atj;


# direct methods
.method constructor <init>(ZLcom/huawei/health/sns/model/group/GroupNotify;Lo/atj;)V
    .locals 0

    .line 135
    iput-boolean p1, p0, Lo/atj$2;->a:Z

    iput-object p2, p0, Lo/atj$2;->d:Lcom/huawei/health/sns/model/group/GroupNotify;

    iput-object p3, p0, Lo/atj$2;->e:Lo/atj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 135
    invoke-virtual {p0, p1}, Lo/atj$2;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 139
    const/4 v4, 0x0

    .line 140
    iget-boolean v0, p0, Lo/atj$2;->a:Z

    if-eqz v0, :cond_0

    .line 142
    new-instance v5, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupRequest;

    invoke-direct {v5}, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupRequest;-><init>()V

    .line 143
    iget-object v0, p0, Lo/atj$2;->d:Lcom/huawei/health/sns/model/group/GroupNotify;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/GroupNotify;->getGroupId()J

    move-result-wide v0

    iput-wide v0, v5, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupRequest;->grpID_:J

    .line 144
    invoke-static {v5}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v4

    .line 145
    iget-object v0, p0, Lo/atj$2;->e:Lo/atj;

    iget-object v1, p0, Lo/atj$2;->d:Lcom/huawei/health/sns/model/group/GroupNotify;

    invoke-static {v0, v4, v1}, Lo/atj;->d(Lo/atj;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/group/GroupNotify;)V

    .line 146
    goto :goto_0

    .line 149
    :cond_0
    iget-object v0, p0, Lo/atj$2;->e:Lo/atj;

    iget-object v1, p0, Lo/atj$2;->d:Lcom/huawei/health/sns/model/group/GroupNotify;

    invoke-static {v0, v1}, Lo/atj;->b(Lo/atj;Lcom/huawei/health/sns/model/group/GroupNotify;)V

    .line 150
    iget-object v0, p0, Lo/atj$2;->e:Lo/atj;

    const/16 v1, 0xf5

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/atj;->e(Lo/atj;III)V

    .line 152
    :goto_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
