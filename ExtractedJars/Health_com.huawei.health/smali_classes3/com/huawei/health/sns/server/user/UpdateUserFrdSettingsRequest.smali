.class public Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/updateUserFrdSettings"


# instance fields
.field public frdUID_:J

.field public remarkName_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 46
    const-string v0, "/updateUserFrdSettings"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsRequest;->method:Ljava/lang/String;

    .line 47
    const-string v0, "IFriend"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsRequest;->module:Ljava/lang/String;

    .line 48
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 53
    new-instance v0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse;-><init>()V

    return-object v0
.end method

.method public getFrdUID_()J
    .locals 2

    .line 24
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsRequest;->frdUID_:J

    return-wide v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    const-string v0, "UpdateUserFrdSettingsRequest n:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRemarkName_()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsRequest;->remarkName_:Ljava/lang/String;

    return-object v0
.end method

.method public setFrdUID_(J)V
    .locals 0

    .line 28
    iput-wide p1, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsRequest;->frdUID_:J

    .line 29
    return-void
.end method

.method public setRemarkName_(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsRequest;->remarkName_:Ljava/lang/String;

    .line 37
    return-void
.end method
