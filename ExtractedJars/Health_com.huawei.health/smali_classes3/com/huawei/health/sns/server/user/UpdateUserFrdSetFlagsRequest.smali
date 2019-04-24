.class public Lcom/huawei/health/sns/server/user/UpdateUserFrdSetFlagsRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/updateUserFrdSettings"


# instance fields
.field public frdUID_:J

.field public setFlags_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 38
    const-string v0, "/updateUserFrdSettings"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSetFlagsRequest;->method:Ljava/lang/String;

    .line 39
    const-string v0, "IFriend"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSetFlagsRequest;->module:Ljava/lang/String;

    .line 40
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 45
    new-instance v0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse;-><init>()V

    return-object v0
.end method

.method public getFrdUID_()J
    .locals 2

    .line 16
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSetFlagsRequest;->frdUID_:J

    return-wide v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    const-string v0, "UpdateUserFrdSetFlagsRequest sf"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSetFlags_()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSetFlagsRequest;->setFlags_:Ljava/lang/String;

    return-object v0
.end method

.method public setFrdUID_(J)V
    .locals 0

    .line 20
    iput-wide p1, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSetFlagsRequest;->frdUID_:J

    .line 21
    return-void
.end method

.method public setSetFlags_(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSetFlagsRequest;->setFlags_:Ljava/lang/String;

    .line 29
    return-void
.end method
