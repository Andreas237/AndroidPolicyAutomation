.class public Lcom/huawei/health/sns/server/group/GetGroupInfoResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;,
        Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GetGroupInfoRsp;
    }
.end annotation


# instance fields
.field private GetGroupInfoRsp_:Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GetGroupInfoRsp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    .line 16
    new-instance v0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GetGroupInfoRsp;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GetGroupInfoRsp;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse;->GetGroupInfoRsp_:Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GetGroupInfoRsp;

    return-void
.end method


# virtual methods
.method public getGetGroupInfoRsp_()Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GetGroupInfoRsp;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse;->GetGroupInfoRsp_:Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GetGroupInfoRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 161
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    const-string v0, "GetGroupInfoResponse"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
