.class public Lcom/huawei/health/sns/server/user/GetFriendListResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/user/GetFriendListResponse$UserFriendInfo;,
        Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;
    }
.end annotation


# instance fields
.field private GetUserFrdInfoListRsp_:Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    .line 19
    new-instance v0, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse;->GetUserFrdInfoListRsp_:Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;

    return-void
.end method


# virtual methods
.method public getGetUserFrdInfoListRsp_()Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse;->GetUserFrdInfoListRsp_:Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 263
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x400

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 264
    const-string v0, "GetFriendListResponse s:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse;->GetUserFrdInfoListRsp_:Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;->getUserFrdInfoList_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 266
    const-string v0, ", newVer:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse;->GetUserFrdInfoListRsp_:Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;->getNewVersion_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    const-string v0, ", n:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListResponse;->GetUserFrdInfoListRsp_:Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetFriendListResponse$GetFriendListRsp;->getTotalNum_()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 270
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
