.class public Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;,
        Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;,
        Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$GetUserSNSInfoResponse;
    }
.end annotation


# instance fields
.field private GetUserSNSInfoRsp_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$GetUserSNSInfoResponse;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    .line 17
    new-instance v0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$GetUserSNSInfoResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$GetUserSNSInfoResponse;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;->GetUserSNSInfoRsp_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$GetUserSNSInfoResponse;

    return-void
.end method


# virtual methods
.method public getGetUserSNSInfoRsp_()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$GetUserSNSInfoResponse;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;->GetUserSNSInfoRsp_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$GetUserSNSInfoResponse;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 3

    .line 293
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 294
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;->GetUserSNSInfoRsp_:Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$GetUserSNSInfoResponse;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$GetUserSNSInfoResponse;->getUserSNSInfo_()Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;

    move-result-object v2

    .line 295
    const-string v0, "GetUserSettingResponse psf:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getPrivacySetFlags_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    const-string v0, ", nn:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    const-string v0, ", ut:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    invoke-virtual {v2}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$UserSNSInfo;->getUserType_()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 300
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
