.class public Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;
    }
.end annotation


# instance fields
.field public InviteToJoinGrpRsp_:Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getInviteToJoinGrpRsp_()Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse;->InviteToJoinGrpRsp_:Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 79
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    const-string v0, "InviteToJoinGroupResponse"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setInviteToJoinGrpRsp_(Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse;->InviteToJoinGrpRsp_:Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;

    .line 27
    return-void
.end method
