.class public Lcom/huawei/health/sns/server/group/QuitGroupResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/group/QuitGroupResponse$QuitGroupRsp;
    }
.end annotation


# instance fields
.field public QuitGroupRsp_:Lcom/huawei/health/sns/server/group/QuitGroupResponse$QuitGroupRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getQuitGroupRsp_()Lcom/huawei/health/sns/server/group/QuitGroupResponse$QuitGroupRsp;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/QuitGroupResponse;->QuitGroupRsp_:Lcom/huawei/health/sns/server/group/QuitGroupResponse$QuitGroupRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QuitGroupResponse, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;->getRespLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setQuitGroupRsp_(Lcom/huawei/health/sns/server/group/QuitGroupResponse$QuitGroupRsp;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/QuitGroupResponse;->QuitGroupRsp_:Lcom/huawei/health/sns/server/group/QuitGroupResponse$QuitGroupRsp;

    .line 22
    return-void
.end method
