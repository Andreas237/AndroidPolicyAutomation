.class public Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse$UnfollowPublicUserRsp;
    }
.end annotation


# instance fields
.field public UnfollowPublicUserRsp_:Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse$UnfollowPublicUserRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getRespLog()Ljava/lang/String;
    .locals 3

    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UnfollowPublicUserResponse, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;->getRespLog()Ljava/lang/String;

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

.method public getUnfollowPublicUserRsp_()Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse$UnfollowPublicUserRsp;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse;->UnfollowPublicUserRsp_:Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse$UnfollowPublicUserRsp;

    return-object v0
.end method

.method public setUnfollowPublicUserRsp_(Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse$UnfollowPublicUserRsp;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse;->UnfollowPublicUserRsp_:Lcom/huawei/health/sns/server/assistant/UnfollowPublicUserResponse$UnfollowPublicUserRsp;

    .line 28
    return-void
.end method
