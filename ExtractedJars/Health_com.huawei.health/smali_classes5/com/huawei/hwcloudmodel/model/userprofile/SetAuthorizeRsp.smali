.class public Lcom/huawei/hwcloudmodel/model/userprofile/SetAuthorizeRsp;
.super Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;
.source "SourceFile"


# instance fields
.field private thirdUserToken:Lcom/huawei/hwcloudmodel/model/ThirdUserToken;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getThirdUserToken()Lcom/huawei/hwcloudmodel/model/ThirdUserToken;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/SetAuthorizeRsp;->thirdUserToken:Lcom/huawei/hwcloudmodel/model/ThirdUserToken;

    return-object v0
.end method

.method public setThirdUserToken(Lcom/huawei/hwcloudmodel/model/ThirdUserToken;)V
    .locals 0

    .line 12
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/SetAuthorizeRsp;->thirdUserToken:Lcom/huawei/hwcloudmodel/model/ThirdUserToken;

    .line 13
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SetAuthorizeRsp{thirdUserToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/SetAuthorizeRsp;->thirdUserToken:Lcom/huawei/hwcloudmodel/model/ThirdUserToken;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
