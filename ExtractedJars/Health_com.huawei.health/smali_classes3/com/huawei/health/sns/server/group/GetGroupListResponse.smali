.class public Lcom/huawei/health/sns/server/group/GetGroupListResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;,
        Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;
    }
.end annotation


# instance fields
.field private GetUserGrpListRsp_:Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    .line 19
    new-instance v0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse;->GetUserGrpListRsp_:Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;

    return-void
.end method


# virtual methods
.method public getGetUserGrpListRsp_()Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse;->GetUserGrpListRsp_:Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 191
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    const-string v0, "GetGroupListResponse"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
