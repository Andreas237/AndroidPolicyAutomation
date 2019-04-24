.class public Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse$UpdateUserGrpSettingsRsp;
    }
.end annotation


# instance fields
.field public UpdateUserGrpSettingsRsp_:Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse$UpdateUserGrpSettingsRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    const-string v0, "UpdateUserGrpSettingsResponse"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUpdateUserGrpSettingsRsp_()Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse$UpdateUserGrpSettingsRsp;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse;->UpdateUserGrpSettingsRsp_:Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse$UpdateUserGrpSettingsRsp;

    return-object v0
.end method

.method public setUpdateUserGrpSettingsRsp_(Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse$UpdateUserGrpSettingsRsp;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse;->UpdateUserGrpSettingsRsp_:Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse$UpdateUserGrpSettingsRsp;

    .line 22
    return-void
.end method
