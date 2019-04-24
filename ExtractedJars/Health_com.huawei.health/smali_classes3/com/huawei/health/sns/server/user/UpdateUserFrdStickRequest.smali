.class public Lcom/huawei/health/sns/server/user/UpdateUserFrdStickRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/updateUserFrdSettings"


# instance fields
.field public frdUID_:J

.field public stickFlag_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 39
    const-string v0, "/updateUserFrdSettings"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdStickRequest;->method:Ljava/lang/String;

    .line 40
    const-string v0, "IFriend"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdStickRequest;->module:Ljava/lang/String;

    .line 41
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 46
    new-instance v0, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/UpdateUserFrdSettingsResponse;-><init>()V

    return-object v0
.end method

.method public getFrdUID_()J
    .locals 2

    .line 17
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdStickRequest;->frdUID_:J

    return-wide v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    const-string v0, "UpdateUserFrdStickRequest sf:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getStickFlag_()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdStickRequest;->stickFlag_:I

    return v0
.end method

.method public setFrdUID_(J)V
    .locals 0

    .line 21
    iput-wide p1, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdStickRequest;->frdUID_:J

    .line 22
    return-void
.end method

.method public setStickFlag_(I)V
    .locals 0

    .line 29
    iput p1, p0, Lcom/huawei/health/sns/server/user/UpdateUserFrdStickRequest;->stickFlag_:I

    .line 30
    return-void
.end method
