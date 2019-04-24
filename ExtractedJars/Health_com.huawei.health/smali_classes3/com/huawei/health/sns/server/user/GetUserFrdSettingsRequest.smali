.class public Lcom/huawei/health/sns/server/user/GetUserFrdSettingsRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/getUserFrdSettings"


# instance fields
.field public frdUID_:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 26
    const-string v0, "/getUserFrdSettings"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsRequest;->method:Ljava/lang/String;

    .line 27
    const-string v0, "IFriend"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsRequest;->module:Ljava/lang/String;

    .line 28
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 33
    new-instance v0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsResponse;-><init>()V

    return-object v0
.end method

.method public getFrdUID_()J
    .locals 2

    .line 17
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsRequest;->frdUID_:J

    return-wide v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 3

    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetUserFrdSettingsRequest, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;->getLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setFrdUID_(J)V
    .locals 0

    .line 21
    iput-wide p1, p0, Lcom/huawei/health/sns/server/user/GetUserFrdSettingsRequest;->frdUID_:J

    .line 22
    return-void
.end method
