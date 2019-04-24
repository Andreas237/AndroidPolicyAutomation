.class public Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;
    }
.end annotation


# static fields
.field private static final EXPECTED_BUFFER_DATA:I = 0x400

.field private static final GRP_LIMIT:Ljava/lang/String; = "grpLimit"


# instance fields
.field private LoginSNSRsp_:Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    .line 28
    new-instance v0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;

    invoke-direct {v0}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;->LoginSNSRsp_:Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;

    return-void
.end method


# virtual methods
.method public getLoginSNSRsp_()Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;->LoginSNSRsp_:Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 122
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x400

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 123
    const-string v0, "LoginFriendSeverResponse fver:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;->LoginSNSRsp_:Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;

    invoke-virtual {v0}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->getFrdListVersion_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    const-string v0, ", gver:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;->LoginSNSRsp_:Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;

    invoke-virtual {v0}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->getGrpListVersion_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    const-string v0, ", f:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;->LoginSNSRsp_:Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;

    invoke-virtual {v0}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->getIsFirstLogin_()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    const-string v0, ", se:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    iget-object v0, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;->LoginSNSRsp_:Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;

    invoke-virtual {v0}, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse$LoginSNSRsp;->getSessionValidTime_()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 131
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LoginFriendSeverResponse [rtnCode_="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/logic/login/server/LoginFriendSeverResponse;->resultCode_:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
