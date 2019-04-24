.class public Lcom/huawei/hihealthservice/auth/HiScope;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private id:I

.field private name:Ljava/lang/String;

.field private permissions:[Ljava/lang/String;

.field private uri:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/huawei/hihealthservice/auth/HiScope;->id:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/HiScope;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPermissions()[Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/HiScope;->permissions:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public getUri()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/hihealthservice/auth/HiScope;->uri:Ljava/lang/String;

    return-object v0
.end method

.method public setId(I)V
    .locals 0

    .line 20
    iput p1, p0, Lcom/huawei/hihealthservice/auth/HiScope;->id:I

    .line 21
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/huawei/hihealthservice/auth/HiScope;->name:Ljava/lang/String;

    .line 29
    return-void
.end method

.method public setPermissions([Ljava/lang/String;)V
    .locals 1

    .line 36
    invoke-virtual {p1}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hihealthservice/auth/HiScope;->permissions:[Ljava/lang/String;

    .line 37
    return-void
.end method

.method public setUri(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/hihealthservice/auth/HiScope;->uri:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HiScope [id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/auth/HiScope;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/auth/HiScope;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", permissions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/auth/HiScope;->permissions:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", uri="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/auth/HiScope;->uri:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
