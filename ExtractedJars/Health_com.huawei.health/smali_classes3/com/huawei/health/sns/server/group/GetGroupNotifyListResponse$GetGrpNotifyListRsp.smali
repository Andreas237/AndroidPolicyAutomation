.class public Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$GetGrpNotifyListRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GetGrpNotifyListRsp"
.end annotation


# instance fields
.field private groupNotifyList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;>;"
        }
    .end annotation
.end field

.field private hasMore_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 38
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$GetGrpNotifyListRsp;->hasMore_:I

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$GetGrpNotifyListRsp;->groupNotifyList_:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getGroupNotifyList_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$RspGroupNotify;>;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$GetGrpNotifyListRsp;->groupNotifyList_:Ljava/util/List;

    return-object v0
.end method

.method public getHasMore_()I
    .locals 1

    .line 44
    iget v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse$GetGrpNotifyListRsp;->hasMore_:I

    .line 45
    return v0
.end method
