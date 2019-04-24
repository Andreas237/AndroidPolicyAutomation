.class public Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;
    }
.end annotation


# instance fields
.field private GetGrpMemberListRsp_:Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    .line 19
    new-instance v0, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse;->GetGrpMemberListRsp_:Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;

    return-void
.end method


# virtual methods
.method public getGetGrpMemberListRsp_()Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse;->GetGrpMemberListRsp_:Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 3

    .line 61
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    const-string v0, "GetGroupMemberListResponse"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ", member size is:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse;->getGetGrpMemberListRsp_()Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;->getGrpMemberList_()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ", newVersion  is:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse;->getGetGrpMemberListRsp_()Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;->getNewVersion_()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
