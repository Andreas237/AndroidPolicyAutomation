.class public Lcom/huawei/health/sns/server/user/AddFriendResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;
    }
.end annotation


# instance fields
.field public AddFriendRsp_:Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getAddFriendRsp_()Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/AddFriendResponse;->AddFriendRsp_:Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    const-string v0, "AddFriendResponse"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/AddFriendResponse;->AddFriendRsp_:Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;

    if-eqz v0, :cond_0

    .line 43
    const-string v0, ", r:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/AddFriendResponse;->AddFriendRsp_:Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;

    iget v0, v0, Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;->result_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    const-string v0, ", t:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/AddFriendResponse;->AddFriendRsp_:Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;

    iget-object v0, v0, Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;->sendTime_:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 50
    :cond_0
    const-string v0, " null"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    :goto_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setAddFriendRsp_(Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/AddFriendResponse;->AddFriendRsp_:Lcom/huawei/health/sns/server/user/AddFriendResponse$AddFriendRsp;

    .line 21
    return-void
.end method
