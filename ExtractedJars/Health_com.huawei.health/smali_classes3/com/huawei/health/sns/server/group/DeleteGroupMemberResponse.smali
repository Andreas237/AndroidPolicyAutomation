.class public Lcom/huawei/health/sns/server/group/DeleteGroupMemberResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/group/DeleteGroupMemberResponse$DelGrpMemberRsp;
    }
.end annotation


# instance fields
.field public DelGrpMemberRsp_:Lcom/huawei/health/sns/server/group/DeleteGroupMemberResponse$DelGrpMemberRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getDelGrpMemberRsp_()Lcom/huawei/health/sns/server/group/DeleteGroupMemberResponse$DelGrpMemberRsp;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/DeleteGroupMemberResponse;->DelGrpMemberRsp_:Lcom/huawei/health/sns/server/group/DeleteGroupMemberResponse$DelGrpMemberRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 1

    .line 45
    const-string v0, "DeleteGroupMemberResponse"

    .line 46
    return-object v0
.end method

.method public setDelGrpMemberRsp_(Lcom/huawei/health/sns/server/group/DeleteGroupMemberResponse$DelGrpMemberRsp;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/DeleteGroupMemberResponse;->DelGrpMemberRsp_:Lcom/huawei/health/sns/server/group/DeleteGroupMemberResponse$DelGrpMemberRsp;

    .line 22
    return-void
.end method
