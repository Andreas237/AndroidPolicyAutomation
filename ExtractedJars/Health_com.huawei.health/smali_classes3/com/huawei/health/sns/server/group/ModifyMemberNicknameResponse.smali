.class public Lcom/huawei/health/sns/server/group/ModifyMemberNicknameResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/group/ModifyMemberNicknameResponse$ModifyMbNicknameRsp;
    }
.end annotation


# instance fields
.field public ModifyMbNicknameRsp_:Lcom/huawei/health/sns/server/group/ModifyMemberNicknameResponse$ModifyMbNicknameRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getModifyMbNicknameRsp_()Lcom/huawei/health/sns/server/group/ModifyMemberNicknameResponse$ModifyMbNicknameRsp;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/ModifyMemberNicknameResponse;->ModifyMbNicknameRsp_:Lcom/huawei/health/sns/server/group/ModifyMemberNicknameResponse$ModifyMbNicknameRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ModifyMemberNicknameResponse, "

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

.method public setModifyMbNicknameRsp_(Lcom/huawei/health/sns/server/group/ModifyMemberNicknameResponse$ModifyMbNicknameRsp;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/ModifyMemberNicknameResponse;->ModifyMbNicknameRsp_:Lcom/huawei/health/sns/server/group/ModifyMemberNicknameResponse$ModifyMbNicknameRsp;

    .line 22
    return-void
.end method
