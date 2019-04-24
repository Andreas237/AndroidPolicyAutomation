.class public Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/GetGroupListResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GetUserGrpListRsp"
.end annotation


# instance fields
.field private newVersion_:Ljava/lang/String;

.field private totalNum_:I

.field private userGroupList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;->totalNum_:I

    .line 30
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;->newVersion_:Ljava/lang/String;

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;->userGroupList_:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getNewVersion_()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;->newVersion_:Ljava/lang/String;

    .line 43
    return-object v0
.end method

.method public getTotalNum_()I
    .locals 1

    .line 36
    iget v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;->totalNum_:I

    .line 37
    return v0
.end method

.method public getUserGroupList_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/server/group/GetGroupListResponse$UserGroup;>;"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListResponse$GetUserGrpListRsp;->userGroupList_:Ljava/util/List;

    return-object v0
.end method
