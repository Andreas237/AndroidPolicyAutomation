.class public Lcom/huawei/health/sns/server/assistant/FollowPublicUserResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/assistant/FollowPublicUserResponse$FollowPublicUserRsp;
    }
.end annotation


# instance fields
.field public FollowPublicUserRsp_:Lcom/huawei/health/sns/server/assistant/FollowPublicUserResponse$FollowPublicUserRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getFollowPublicUserRsp_()Lcom/huawei/health/sns/server/assistant/FollowPublicUserResponse$FollowPublicUserRsp;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/FollowPublicUserResponse;->FollowPublicUserRsp_:Lcom/huawei/health/sns/server/assistant/FollowPublicUserResponse$FollowPublicUserRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 3

    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FollowPublicUserResponse, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;->getRespLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setFollowPublicUserRsp_(Lcom/huawei/health/sns/server/assistant/FollowPublicUserResponse$FollowPublicUserRsp;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/huawei/health/sns/server/assistant/FollowPublicUserResponse;->FollowPublicUserRsp_:Lcom/huawei/health/sns/server/assistant/FollowPublicUserResponse$FollowPublicUserRsp;

    .line 26
    return-void
.end method
