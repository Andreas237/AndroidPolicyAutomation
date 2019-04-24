.class public Lcom/huawei/hihealthservice/auth/WhiteListApp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private accessToken:Ljava/lang/String;

.field private appId:Ljava/lang/String;

.field private appScopes:Ljava/lang/String;

.field private packageName:Ljava/lang/String;

.field private userScopes:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    return-void
.end method


# virtual methods
.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/WhiteListApp;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/WhiteListApp;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public getAppScopes()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/WhiteListApp;->appScopes:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/WhiteListApp;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public getUserScopes()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/WhiteListApp;->userScopes:Ljava/lang/String;

    return-object v0
.end method

.method public initFunctionAb()V
    .locals 0

    .line 75
    return-void
.end method

.method public initFunctionBb()V
    .locals 0

    .line 79
    return-void
.end method

.method public initFunctionCb()V
    .locals 0

    .line 83
    return-void
.end method

.method public setAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/hihealthservice/auth/WhiteListApp;->accessToken:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/hihealthservice/auth/WhiteListApp;->appId:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public setAppScopes(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/hihealthservice/auth/WhiteListApp;->appScopes:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/hihealthservice/auth/WhiteListApp;->packageName:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public setUserScopes(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/hihealthservice/auth/WhiteListApp;->userScopes:Ljava/lang/String;

    .line 57
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 61
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "WhiteListApp{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 62
    const-string v0, "packageName=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/auth/WhiteListApp;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 63
    const-string v0, ", appId=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/auth/WhiteListApp;->appId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 64
    const-string v0, ", appScopes=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/auth/WhiteListApp;->appScopes:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 65
    const-string v0, ", userScopes=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/auth/WhiteListApp;->userScopes:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 66
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 67
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
