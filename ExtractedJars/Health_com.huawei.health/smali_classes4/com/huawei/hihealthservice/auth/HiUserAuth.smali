.class public Lcom/huawei/hihealthservice/auth/HiUserAuth;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private client_id:Ljava/lang/String;

.field private expire_in:Ljava/lang/String;

.field private open_id:Ljava/lang/String;

.field private scope:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getClient_id()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/HiUserAuth;->client_id:Ljava/lang/String;

    return-object v0
.end method

.method public getExpire_in()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/HiUserAuth;->expire_in:Ljava/lang/String;

    return-object v0
.end method

.method public getOpen_id()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/HiUserAuth;->open_id:Ljava/lang/String;

    return-object v0
.end method

.method public getScope()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/HiUserAuth;->scope:Ljava/lang/String;

    return-object v0
.end method

.method public initFunctionAb()V
    .locals 0

    .line 58
    return-void
.end method

.method public initFunctionBb()V
    .locals 0

    .line 62
    return-void
.end method

.method public initFunctionCb()V
    .locals 0

    .line 66
    return-void
.end method

.method public setClient_id(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/hihealthservice/auth/HiUserAuth;->client_id:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public setExpire_id(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lcom/huawei/hihealthservice/auth/HiUserAuth;->expire_in:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public setOpen_id(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hihealthservice/auth/HiUserAuth;->open_id:Ljava/lang/String;

    .line 24
    return-void
.end method

.method public setScope(Ljava/lang/String;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/huawei/hihealthservice/auth/HiUserAuth;->scope:Ljava/lang/String;

    .line 16
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 44
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "HiUserAuth{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 45
    const-string v0, "scope=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/auth/HiUserAuth;->scope:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 46
    const-string v0, ", open_id=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/auth/HiUserAuth;->open_id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 47
    const-string v0, ", expire_id=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/auth/HiUserAuth;->expire_in:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 48
    const-string v0, ", client_id=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/auth/HiUserAuth;->client_id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 49
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
