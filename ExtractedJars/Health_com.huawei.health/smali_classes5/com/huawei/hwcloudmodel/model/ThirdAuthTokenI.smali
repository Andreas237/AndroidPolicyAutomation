.class public Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private expireTime:I

.field private huid:J

.field private openID:Ljava/lang/String;

.field private thirdAccountType:I

.field private thirdToken:Ljava/lang/String;

.field private thirdTokenType:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->huid:J

    .line 9
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->thirdAccountType:I

    .line 10
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->thirdTokenType:I

    .line 11
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->thirdToken:Ljava/lang/String;

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->expireTime:I

    .line 13
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->openID:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getOpenID()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->openID:Ljava/lang/String;

    return-object v0
.end method

.method public getThirdToken()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->thirdToken:Ljava/lang/String;

    return-object v0
.end method

.method public setExpireTime(I)V
    .locals 0

    .line 36
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->expireTime:I

    .line 37
    return-void
.end method

.method public setHuid(J)V
    .locals 0

    .line 20
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->huid:J

    .line 21
    return-void
.end method

.method public setOpenID(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->openID:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public setThirdAccountType(I)V
    .locals 0

    .line 24
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->thirdAccountType:I

    .line 25
    return-void
.end method

.method public setThirdToken(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->thirdToken:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public setThirdTokenType(I)V
    .locals 0

    .line 28
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->thirdTokenType:I

    .line 29
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ThirdUserToken [huid = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->huid:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", thirdAccountType = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->thirdAccountType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", thirdTokenType = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->thirdTokenType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", thirdToken = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->thirdToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", expireTime = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenI;->expireTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpThirdAuthTokenI1()V
    .locals 0

    .line 59
    return-void
.end method

.method public uadpThirdAuthTokenI2()V
    .locals 0

    .line 64
    return-void
.end method

.method public uadpThirdAuthTokenI3()V
    .locals 0

    .line 69
    return-void
.end method
