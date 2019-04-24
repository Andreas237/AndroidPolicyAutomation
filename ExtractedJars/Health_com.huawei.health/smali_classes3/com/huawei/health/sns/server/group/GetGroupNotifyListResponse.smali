.class public Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;,
        Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$GetGrpNotifyListRsp;
    }
.end annotation


# instance fields
.field private GetGrpNotifyListRsp_:Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$GetGrpNotifyListRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getGetGrpNotifyListRsp_()Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$GetGrpNotifyListRsp;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse;->GetGrpNotifyListRsp_:Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$GetGrpNotifyListRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 3

    .line 184
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse;->getGetGrpNotifyListRsp_()Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$GetGrpNotifyListRsp;

    move-result-object v2

    .line 186
    if-eqz v2, :cond_0

    .line 188
    const-string v0, "GetGroupNotifyListResponse"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setGetGrpNotifyListRsp_(Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$GetGrpNotifyListRsp;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse;->GetGrpNotifyListRsp_:Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$GetGrpNotifyListRsp;

    .line 25
    return-void
.end method
