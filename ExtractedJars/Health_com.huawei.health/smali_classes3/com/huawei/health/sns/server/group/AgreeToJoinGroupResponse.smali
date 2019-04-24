.class public Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;
    }
.end annotation


# instance fields
.field public AgreeToJoinGrpRsp_:Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getAgreeToJoinGrpRsp_()Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse;->AgreeToJoinGrpRsp_:Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    const-string v0, "AgreeToJoinGroupResponse"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setAgreeToJoinGrpRsp_(Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse;->AgreeToJoinGrpRsp_:Lcom/huawei/health/sns/server/group/AgreeToJoinGroupResponse$AgreeToJoinGrpRsp;

    .line 22
    return-void
.end method
