.class public Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;
    }
.end annotation


# instance fields
.field public UpdateUserFrdSettingsRsp_:Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 56
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x400

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 57
    const-string v0, "UpdateUserFrdSettingsResponse"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse;->UpdateUserFrdSettingsRsp_:Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;

    if-eqz v0, :cond_0

    .line 60
    const-string v0, "st:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse;->UpdateUserFrdSettingsRsp_:Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;

    iget-object v0, v0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;->stickTime_:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 65
    :cond_0
    const-string v0, " null"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    :goto_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUpdateUserFrdSettingsRsp_()Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse;->UpdateUserFrdSettingsRsp_:Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;

    return-object v0
.end method

.method public setUpdateUserFrdSettingsRsp_(Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse;->UpdateUserFrdSettingsRsp_:Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse$UpdateUserFrdSettingsRsp;

    .line 22
    return-void
.end method
