.class public Lcom/huawei/health/sns/server/group/UpdateUserGrpStickSettingsRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/updateUserGrpSettings"


# instance fields
.field public grpID_:J

.field public stickFlag_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 49
    const-string v0, "/updateUserGrpSettings"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpStickSettingsRequest;->method:Ljava/lang/String;

    .line 50
    const-string v0, "IGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpStickSettingsRequest;->module:Ljava/lang/String;

    .line 51
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 56
    new-instance v0, Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/UpdateUserGrpSettingsResponse;-><init>()V

    return-object v0
.end method

.method public getGrpID_()J
    .locals 2

    .line 27
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpStickSettingsRequest;->grpID_:J

    return-wide v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    const-string v0, "UpdateUserGrpFlagSettingsRequest"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getStickFlag_()I
    .locals 1

    .line 35
    iget v0, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpStickSettingsRequest;->stickFlag_:I

    return v0
.end method

.method public setGrpID_(J)V
    .locals 0

    .line 31
    iput-wide p1, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpStickSettingsRequest;->grpID_:J

    .line 32
    return-void
.end method

.method public setStickFlag_(I)V
    .locals 0

    .line 39
    iput p1, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpStickSettingsRequest;->stickFlag_:I

    .line 40
    return-void
.end method
