.class public Lcom/huawei/health/sns/server/user/FindUserResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;,
        Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;
    }
.end annotation


# instance fields
.field private FindUserRsp_:Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    .line 17
    new-instance v0, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse;->FindUserRsp_:Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;

    return-void
.end method


# virtual methods
.method public getFindUserRsp_()Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse;->FindUserRsp_:Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 3

    .line 37
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserResponse;->FindUserRsp_:Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserRsp;->getFindUserInfo_()Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;

    move-result-object v1

    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    const-string v0, "FindUserResponse v:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    invoke-static {v1}, Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;->access$000(Lcom/huawei/health/sns/server/user/FindUserResponse$FindUserInfo;)I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
