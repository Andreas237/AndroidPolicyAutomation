.class public Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse$GetUserGrpSettingsRsp;
    }
.end annotation


# instance fields
.field public GetUserGrpSettingsRsp_:Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse$GetUserGrpSettingsRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getGetUserGrpSettingsRsp_()Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse$GetUserGrpSettingsRsp;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse;->GetUserGrpSettingsRsp_:Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse$GetUserGrpSettingsRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    const-string v0, "GetUserGrpSettingsResponse"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setGetUserGrpSettingsRsp_(Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse$GetUserGrpSettingsRsp;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse;->GetUserGrpSettingsRsp_:Lcom/huawei/health/sns/server/group/GetUserGrpSettingsResponse$GetUserGrpSettingsRsp;

    .line 24
    return-void
.end method
