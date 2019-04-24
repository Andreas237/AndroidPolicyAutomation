.class public Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GetGroupInfoRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/GetGroupInfoResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GetGroupInfoRsp"
.end annotation


# instance fields
.field private groupInfo_:Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 25
    new-instance v0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GetGroupInfoRsp;->groupInfo_:Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;

    return-void
.end method


# virtual methods
.method public getGroupInfo_()Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GetGroupInfoRsp;->groupInfo_:Lcom/huawei/health/sns/server/group/GetGroupInfoResponse$GroupInfo;

    return-object v0
.end method
