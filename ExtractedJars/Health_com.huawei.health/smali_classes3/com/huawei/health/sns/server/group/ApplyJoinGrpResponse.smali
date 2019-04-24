.class public Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse$ApplyForJoinGrpRsp;
    }
.end annotation


# instance fields
.field public ApplyForJoinGrpRsp_:Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse$ApplyForJoinGrpRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getApplyForJoinGrpRsp_()Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse$ApplyForJoinGrpRsp;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse;->ApplyForJoinGrpRsp_:Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse$ApplyForJoinGrpRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 50
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    const-string v0, "ApplyForJoinGrpRsp"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse;->ApplyForJoinGrpRsp_:Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse$ApplyForJoinGrpRsp;

    if-eqz v0, :cond_0

    .line 54
    const-string v0, ", r"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse;->ApplyForJoinGrpRsp_:Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse$ApplyForJoinGrpRsp;

    iget v0, v0, Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse$ApplyForJoinGrpRsp;->result_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    const-string v0, ", v"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 60
    :cond_0
    const-string v0, " null"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    :goto_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setApplyForJoinGrpRsp_(Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse$ApplyForJoinGrpRsp;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse;->ApplyForJoinGrpRsp_:Lcom/huawei/health/sns/server/group/ApplyJoinGrpResponse$ApplyForJoinGrpRsp;

    .line 22
    return-void
.end method
