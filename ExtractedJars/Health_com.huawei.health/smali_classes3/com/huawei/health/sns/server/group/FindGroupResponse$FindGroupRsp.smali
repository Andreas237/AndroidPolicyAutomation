.class public Lcom/huawei/health/sns/server/group/FindGroupResponse$FindGroupRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/FindGroupResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FindGroupRsp"
.end annotation


# instance fields
.field private firstMemberList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/group/RspGroupMember;>;"
        }
    .end annotation
.end field

.field private group_:Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 28
    new-instance v0, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/FindGroupResponse$FindGroupRsp;->group_:Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/FindGroupResponse$FindGroupRsp;->firstMemberList_:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getFirstMemberList_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/server/group/RspGroupMember;>;"
        }
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/FindGroupResponse$FindGroupRsp;->firstMemberList_:Ljava/util/List;

    return-object v0
.end method

.method public getGroup_()Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/FindGroupResponse$FindGroupRsp;->group_:Lcom/huawei/health/sns/server/group/FindGroupResponse$RspGroup;

    return-object v0
.end method
