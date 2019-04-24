.class public Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/unfollowPublicUser"


# instance fields
.field public publicUID_:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 25
    const-string v0, "/unfollowPublicUser"

    iput-object v0, p0, Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserRequest;->method:Ljava/lang/String;

    .line 26
    const-string v0, "IFriend"

    iput-object v0, p0, Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserRequest;->module:Ljava/lang/String;

    .line 27
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 45
    new-instance v0, Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse;-><init>()V

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 3

    .line 51
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    const-string v0, "UnfollowPublicUserRequest "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;->getLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getPublicUID_()J
    .locals 2

    .line 35
    iget-wide v0, p0, Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserRequest;->publicUID_:J

    return-wide v0
.end method

.method public setPublicUID_(J)V
    .locals 0

    .line 39
    iput-wide p1, p0, Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserRequest;->publicUID_:J

    .line 40
    return-void
.end method
