.class public Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "InviteToJoinGrpRsp"
.end annotation


# instance fields
.field private failUserList_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private inviteTime_:Ljava/lang/String;

.field private result_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    .line 34
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;->result_:I

    .line 39
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;->inviteTime_:Ljava/lang/String;

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;->failUserList_:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getFailUserList_()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Long;>;"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;->failUserList_:Ljava/util/List;

    return-object v0
.end method

.method public getInviteTime_()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;->inviteTime_:Ljava/lang/String;

    .line 67
    return-object v0
.end method

.method public getResult_()I
    .locals 1

    .line 60
    iget v0, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;->result_:I

    .line 61
    return v0
.end method

.method public setFailUserList_(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Long;>;)V"
        }
    .end annotation

    .line 50
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;->failUserList_:Ljava/util/List;

    .line 51
    return-void
.end method

.method public setInviteTime_(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;->inviteTime_:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public setResult_(I)V
    .locals 0

    .line 42
    iput p1, p0, Lcom/huawei/health/sns/server/group/InviteToJoinGroupResponse$InviteToJoinGrpRsp;->result_:I

    .line 43
    return-void
.end method
