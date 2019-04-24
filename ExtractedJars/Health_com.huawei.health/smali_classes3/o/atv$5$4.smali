.class Lo/atv$5$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atv$5;->a()V
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
.field final synthetic c:Lo/atv$5;


# direct methods
.method constructor <init>(Lo/atv$5;)V
    .locals 0

    .line 184
    iput-object p1, p0, Lo/atv$5$4;->c:Lo/atv$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 184
    invoke-virtual {p0, p1}, Lo/atv$5$4;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 188
    const/4 v2, 0x0

    .line 189
    new-instance v3, Lcom/huawei/health/sns/server/group/UpdateUserGrpStickSettingsRequest;

    invoke-direct {v3}, Lcom/huawei/health/sns/server/group/UpdateUserGrpStickSettingsRequest;-><init>()V

    .line 190
    iget-object v0, p0, Lo/atv$5$4;->c:Lo/atv$5;

    iget-object v0, v0, Lo/atv$5;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    iput-wide v0, v3, Lcom/huawei/health/sns/server/group/UpdateUserGrpStickSettingsRequest;->grpID_:J

    .line 191
    iget-object v0, p0, Lo/atv$5$4;->c:Lo/atv$5;

    iget-object v0, v0, Lo/atv$5;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getStickTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/atv$5$4;->c:Lo/atv$5;

    iget-object v0, v0, Lo/atv$5;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getStickTime()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    iput v0, v3, Lcom/huawei/health/sns/server/group/UpdateUserGrpStickSettingsRequest;->stickFlag_:I

    .line 192
    move-object v2, v3

    .line 193
    invoke-static {v2}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v4

    .line 195
    iget-object v0, p0, Lo/atv$5$4;->c:Lo/atv$5;

    iget-object v0, v0, Lo/atv$5;->a:Lo/atv;

    iget-object v1, p0, Lo/atv$5$4;->c:Lo/atv$5;

    iget-object v1, v1, Lo/atv$5;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-static {v0, v1, v4}, Lo/atv;->d(Lo/atv;Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 196
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
