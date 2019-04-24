.class public Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;
    }
.end annotation


# instance fields
.field private GetUserFrdSettingsRsp_:Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    .line 8
    new-instance v0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse;->GetUserFrdSettingsRsp_:Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;

    return-void
.end method


# virtual methods
.method public getGetUserFrdSettingsRsp_()Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse;->GetUserFrdSettingsRsp_:Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 81
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    const-string v0, "GetUserFrdSettingsResponse n:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    const-string v0, ", sf:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse;->GetUserFrdSettingsRsp_:Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;->getSetFlags_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    const-string v0, ", st:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse;->GetUserFrdSettingsRsp_:Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse$GetUserFrdSettingsRsp;->getStickTime_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
