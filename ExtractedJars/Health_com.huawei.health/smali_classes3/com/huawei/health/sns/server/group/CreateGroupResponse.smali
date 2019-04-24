.class public Lcom/huawei/health/sns/server/group/CreateGroupResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;
    }
.end annotation


# instance fields
.field private CreateGroupRsp_:Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    .line 19
    new-instance v0, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupResponse;->CreateGroupRsp_:Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;

    return-void
.end method


# virtual methods
.method public getCreateGroupRsp_()Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupResponse;->CreateGroupRsp_:Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    const-string v0, "CreateGroupRsp, r:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupResponse;->CreateGroupRsp_:Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;

    invoke-static {v0}, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->access$000(Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;)I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    const-string v0, ", fs:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupResponse;->CreateGroupRsp_:Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;

    invoke-static {v0}, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->access$100(Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
