.class public Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;,
        Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;
    }
.end annotation


# instance fields
.field private GetOtherUserInfoRsp_:Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    .line 17
    new-instance v0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->GetOtherUserInfoRsp_:Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;

    return-void
.end method


# virtual methods
.method public getGetOtherUserInfoRsp_()Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->GetOtherUserInfoRsp_:Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 3

    .line 199
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;->GetOtherUserInfoRsp_:Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$GetOtherUserInfoRsp;->getOtherUserInfo_()Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;

    move-result-object v2

    .line 201
    const-string v0, "GetOtherUserInfoResponse nv"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getNeedVerify_()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 203
    const-string v0, ", n:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    const-string v0, ", ut:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    invoke-static {v2}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->access$000(Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 206
    const-string v0, ", o:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getFrdOrigin_()Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse$OtherUserInfo;->getFrdOrigin_()Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/Origin;->getType_()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 208
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
