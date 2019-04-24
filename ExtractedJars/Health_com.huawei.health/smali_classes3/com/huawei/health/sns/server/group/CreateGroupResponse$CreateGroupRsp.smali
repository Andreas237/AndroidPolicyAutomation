.class public Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/CreateGroupResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CreateGroupRsp"
.end annotation


# instance fields
.field private createTime_:Ljava/lang/String;

.field private failUserList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private grpID_:J

.field private result_:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 26
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 32
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->result_:I

    .line 37
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->grpID_:J

    .line 42
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->createTime_:Ljava/lang/String;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->failUserList_:Ljava/util/List;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;)I
    .locals 1

    .line 26
    iget v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->result_:I

    return v0
.end method

.method static synthetic access$100(Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;)Ljava/util/List;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->failUserList_:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public getCreateTime_()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->createTime_:Ljava/lang/String;

    .line 69
    return-object v0
.end method

.method public getFailUserList_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Long;>;"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->failUserList_:Ljava/util/List;

    return-object v0
.end method

.method public getGrpID_()J
    .locals 2

    .line 62
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->grpID_:J

    .line 63
    return-wide v0
.end method

.method public getResult_()I
    .locals 1

    .line 56
    iget v0, p0, Lcom/huawei/health/sns/server/group/CreateGroupResponse$CreateGroupRsp;->result_:I

    .line 57
    return v0
.end method
