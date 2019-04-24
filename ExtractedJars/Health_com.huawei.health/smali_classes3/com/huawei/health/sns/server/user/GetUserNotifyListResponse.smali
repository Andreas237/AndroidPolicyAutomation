.class public Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNote;,
        Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$UserAddNotify;,
        Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;
    }
.end annotation


# instance fields
.field private GetFrdNotifyListRsp_:Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getGetFrdNotifyListRsp_()Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;->GetFrdNotifyListRsp_:Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;->GetFrdNotifyListRsp_:Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;

    if-eqz v0, :cond_0

    .line 34
    const-string v0, "GetUserNotifyListResponse size:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;->GetFrdNotifyListRsp_:Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;->getFrdAddNotifyList_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    const-string v0, ", hasMore:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;->GetFrdNotifyListRsp_:Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;

    invoke-static {v0}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;->access$000(Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setGetFrdNotifyListRsp_(Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;->GetFrdNotifyListRsp_:Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse$GetFrdNotifyListRsp;

    .line 19
    return-void
.end method
