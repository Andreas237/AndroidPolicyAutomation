.class public Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GetGrpMemberListRsp"
.end annotation


# instance fields
.field private grpMemberList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/group/RspGroupMember;>;"
        }
    .end annotation
.end field

.field private newVersion_:Ljava/lang/String;

.field private totalNum_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;->totalNum_:I

    .line 36
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;->newVersion_:Ljava/lang/String;

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;->grpMemberList_:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getGrpMemberList_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/server/group/RspGroupMember;>;"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;->grpMemberList_:Ljava/util/List;

    return-object v0
.end method

.method public getNewVersion_()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;->newVersion_:Ljava/lang/String;

    .line 49
    return-object v0
.end method

.method public getTotalNum_()I
    .locals 1

    .line 42
    iget v0, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse$GetGrpMemberListRsp;->totalNum_:I

    .line 43
    return v0
.end method
