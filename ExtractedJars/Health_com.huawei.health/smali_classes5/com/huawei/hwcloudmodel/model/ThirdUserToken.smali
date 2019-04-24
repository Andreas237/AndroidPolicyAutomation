.class public Lcom/huawei/hwcloudmodel/model/ThirdUserToken;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private expireTime:I

.field private huid:J

.field private thirdAccessToken:Ljava/lang/String;

.field private thirdAccount:Ljava/lang/String;

.field private thirdAccountType:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const/4 v0, 0x7

    iput v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->thirdAccountType:I

    .line 13
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->huid:J

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->thirdAccount:Ljava/lang/String;

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->thirdAccessToken:Ljava/lang/String;

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->expireTime:I

    return-void
.end method


# virtual methods
.method public setExpireTime(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->expireTime:I

    .line 36
    return-void
.end method

.method public setHuid(J)V
    .locals 0

    .line 19
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->huid:J

    .line 20
    return-void
.end method

.method public setThirdAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->thirdAccessToken:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public setThirdAccount(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->thirdAccount:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 23
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->thirdAccountType:I

    .line 24
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ThirdUserToken [type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->thirdAccountType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", huid = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->huid:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", thirdAccount = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->thirdAccount:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", thirdAccessToken = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->thirdAccessToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", expireTime = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/ThirdUserToken;->expireTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpThirdUserToken1()V
    .locals 0

    .line 49
    return-void
.end method

.method public uadpThirdUserToken2()V
    .locals 0

    .line 54
    return-void
.end method

.method public uadpThirdUserToken3()V
    .locals 0

    .line 59
    return-void
.end method
