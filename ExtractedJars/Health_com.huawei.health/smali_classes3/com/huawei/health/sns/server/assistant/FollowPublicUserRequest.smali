.class public Lcom/huawei/health/sns/server/assistant/FollowPublicUserRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/followPublicUser"


# instance fields
.field public isManual_:Z

.field public publicUID_:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 25
    const-string v0, "/followPublicUser"

    iput-object v0, p0, Lcom/huawei/health/sns/server/assistant/FollowPublicUserRequest;->method:Ljava/lang/String;

    .line 26
    const-string v0, "IFriend"

    iput-object v0, p0, Lcom/huawei/health/sns/server/assistant/FollowPublicUserRequest;->module:Ljava/lang/String;

    .line 27
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 58
    new-instance v0, Lcom/huawei/health/sns/server/assistant/FollowPublicUserResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/assistant/FollowPublicUserResponse;-><init>()V

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 3

    .line 64
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FollowPublicUserRequest, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;->getLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPublicUID_()J
    .locals 2

    .line 30
    iget-wide v0, p0, Lcom/huawei/health/sns/server/assistant/FollowPublicUserRequest;->publicUID_:J

    return-wide v0
.end method

.method public isManual_()Z
    .locals 1

    .line 43
    iget-boolean v0, p0, Lcom/huawei/health/sns/server/assistant/FollowPublicUserRequest;->isManual_:Z

    return v0
.end method

.method public setManual_(Z)V
    .locals 0

    .line 47
    iput-boolean p1, p0, Lcom/huawei/health/sns/server/assistant/FollowPublicUserRequest;->isManual_:Z

    .line 48
    return-void
.end method

.method public setPublicUID_(J)V
    .locals 0

    .line 34
    iput-wide p1, p0, Lcom/huawei/health/sns/server/assistant/FollowPublicUserRequest;->publicUID_:J

    .line 35
    return-void
.end method
