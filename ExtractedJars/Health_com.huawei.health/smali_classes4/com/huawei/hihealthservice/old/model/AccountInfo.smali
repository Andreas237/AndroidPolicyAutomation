.class public Lcom/huawei/hihealthservice/old/model/AccountInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x2eabfb11e1cf9446L


# instance fields
.field private accessToken:Ljava/lang/String;

.field private expiresIn:I

.field private isLogin:Z

.field private serviceToken:Ljava/lang/String;

.field private siteId:I

.field private thirdOpenId:Ljava/lang/String;

.field private thirdToken:Ljava/lang/String;

.field private type:I

.field private userID:J

.field private userName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->isLogin:Z

    return-void
.end method


# virtual methods
.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiresIn()I
    .locals 1

    .line 116
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->expiresIn:I

    return v0
.end method

.method public getServiceToken()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->serviceToken:Ljava/lang/String;

    return-object v0
.end method

.method public getSiteId()I
    .locals 1

    .line 54
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->siteId:I

    return v0
.end method

.method public getThirdOpenId()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->thirdOpenId:Ljava/lang/String;

    return-object v0
.end method

.method public getThirdToken()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->thirdToken:Ljava/lang/String;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 74
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->type:I

    return v0
.end method

.method public getUserID()J
    .locals 2

    .line 87
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->userID:J

    return-wide v0
.end method

.method public getUserName()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->userName:Ljava/lang/String;

    return-object v0
.end method

.method public initFunctionAa()V
    .locals 0

    .line 170
    return-void
.end method

.method public initFunctionBb()V
    .locals 0

    .line 174
    return-void
.end method

.method public initFunctionCc()V
    .locals 0

    .line 178
    return-void
.end method

.method public initFunctionDd()V
    .locals 0

    .line 182
    return-void
.end method

.method public isLogin()Z
    .locals 1

    .line 126
    iget-boolean v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->isLogin:Z

    return v0
.end method

.method public setAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->accessToken:Ljava/lang/String;

    .line 112
    return-void
.end method

.method public setExpiresIn(I)V
    .locals 0

    .line 121
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->expiresIn:I

    .line 122
    return-void
.end method

.method public setLogin(Z)V
    .locals 0

    .line 131
    iput-boolean p1, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->isLogin:Z

    .line 132
    return-void
.end method

.method public setServiceToken(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->serviceToken:Ljava/lang/String;

    .line 70
    return-void
.end method

.method public setSiteId(I)V
    .locals 0

    .line 59
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->siteId:I

    .line 60
    return-void
.end method

.method public setThirdOpenId(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->thirdOpenId:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public setThirdToken(Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->thirdToken:Ljava/lang/String;

    .line 50
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 79
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->type:I

    .line 80
    return-void
.end method

.method public setUserID(J)V
    .locals 0

    .line 95
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->userID:J

    .line 96
    return-void
.end method

.method public setUserName(Ljava/lang/String;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->userName:Ljava/lang/String;

    .line 142
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 147
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    const-string v0, "AccountInfo ["

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    const-string v0, ", thirdOpenId="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->thirdOpenId:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    const-string v0, ", thirdToken="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->thirdToken:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    const-string v0, ", siteId="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->siteId:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    const-string v0, ", expiresIn="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->expiresIn:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 157
    const-string v0, ", isLogin="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    iget-boolean v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->isLogin:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 159
    const-string v0, ", type="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/AccountInfo;->type:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 161
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
