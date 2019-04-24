.class public Lcom/huawei/health/sns/server/group/UpdateUserGrpFlagSettingsRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/updateUserGrpSettings"


# instance fields
.field public grpID_:J

.field public setFlags_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 49
    const-string v0, "/updateUserGrpSettings"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpFlagSettingsRequest;->method:Ljava/lang/String;

    .line 50
    const-string v0, "IGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpFlagSettingsRequest;->module:Ljava/lang/String;

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

    .line 32
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpFlagSettingsRequest;->grpID_:J

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

.method public getSetFlags_()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpFlagSettingsRequest;->setFlags_:Ljava/lang/String;

    return-object v0
.end method

.method public setGrpID_(J)V
    .locals 0

    .line 36
    iput-wide p1, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpFlagSettingsRequest;->grpID_:J

    .line 37
    return-void
.end method

.method public setSetFlags_(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/UpdateUserGrpFlagSettingsRequest;->setFlags_:Ljava/lang/String;

    .line 45
    return-void
.end method
