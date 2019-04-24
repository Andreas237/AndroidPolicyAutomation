.class public final Lcom/google/dexmaker/MethodId;
.super Ljava/lang/Object;
.source "MethodId.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final constant:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

.field final declaringType:Lcom/google/dexmaker/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/dexmaker/TypeId<",
            "TD;>;"
        }
    .end annotation
.end field

.field final name:Ljava/lang/String;

.field final nat:Lcom/google/dexmaker/dx/rop/cst/CstNat;

.field final parameters:Lcom/google/dexmaker/TypeList;

.field final returnType:Lcom/google/dexmaker/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/dexmaker/TypeId<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/dexmaker/TypeId;Lcom/google/dexmaker/TypeId;Ljava/lang/String;Lcom/google/dexmaker/TypeList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/TypeId<",
            "TD;>;",
            "Lcom/google/dexmaker/TypeId<",
            "TR;>;",
            "Ljava/lang/String;",
            "Lcom/google/dexmaker/TypeList;",
            ")V"
        }
    .end annotation

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    if-eqz p4, :cond_0

    .line 45
    iput-object p1, p0, Lcom/google/dexmaker/MethodId;->declaringType:Lcom/google/dexmaker/TypeId;

    .line 46
    iput-object p2, p0, Lcom/google/dexmaker/MethodId;->returnType:Lcom/google/dexmaker/TypeId;

    .line 47
    iput-object p3, p0, Lcom/google/dexmaker/MethodId;->name:Ljava/lang/String;

    .line 48
    iput-object p4, p0, Lcom/google/dexmaker/MethodId;->parameters:Lcom/google/dexmaker/TypeList;

    .line 49
    new-instance p2, Lcom/google/dexmaker/dx/rop/cst/CstNat;

    new-instance p4, Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-direct {p4, p3}, Lcom/google/dexmaker/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    new-instance p3, Lcom/google/dexmaker/dx/rop/cst/CstString;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/dexmaker/MethodId;->descriptor(Z)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, v0}, Lcom/google/dexmaker/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, p4, p3}, Lcom/google/dexmaker/dx/rop/cst/CstNat;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstString;Lcom/google/dexmaker/dx/rop/cst/CstString;)V

    iput-object p2, p0, Lcom/google/dexmaker/MethodId;->nat:Lcom/google/dexmaker/dx/rop/cst/CstNat;

    .line 50
    new-instance p2, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    iget-object p1, p1, Lcom/google/dexmaker/TypeId;->constant:Lcom/google/dexmaker/dx/rop/cst/CstType;

    iget-object p3, p0, Lcom/google/dexmaker/MethodId;->nat:Lcom/google/dexmaker/dx/rop/cst/CstNat;

    invoke-direct {p2, p1, p3}, Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstType;Lcom/google/dexmaker/dx/rop/cst/CstNat;)V

    iput-object p2, p0, Lcom/google/dexmaker/MethodId;->constant:Lcom/google/dexmaker/dx/rop/cst/CstMethodRef;

    return-void

    .line 43
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1
.end method


# virtual methods
.method descriptor(Z)Ljava/lang/String;
    .locals 4

    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "("

    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    .line 86
    iget-object p1, p0, Lcom/google/dexmaker/MethodId;->declaringType:Lcom/google/dexmaker/TypeId;

    iget-object p1, p1, Lcom/google/dexmaker/TypeId;->name:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    :cond_0
    iget-object p1, p0, Lcom/google/dexmaker/MethodId;->parameters:Lcom/google/dexmaker/TypeList;

    iget-object p1, p1, Lcom/google/dexmaker/TypeList;->types:[Lcom/google/dexmaker/TypeId;

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    .line 89
    iget-object v3, v3, Lcom/google/dexmaker/TypeId;->name:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const-string p1, ")"

    .line 91
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    iget-object p1, p0, Lcom/google/dexmaker/MethodId;->returnType:Lcom/google/dexmaker/TypeId;

    iget-object p1, p1, Lcom/google/dexmaker/TypeId;->name:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 101
    instance-of v0, p1, Lcom/google/dexmaker/MethodId;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/dexmaker/MethodId;

    iget-object v0, p1, Lcom/google/dexmaker/MethodId;->declaringType:Lcom/google/dexmaker/TypeId;

    iget-object v1, p0, Lcom/google/dexmaker/MethodId;->declaringType:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/TypeId;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/dexmaker/MethodId;->name:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/dexmaker/MethodId;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/dexmaker/MethodId;->parameters:Lcom/google/dexmaker/TypeList;

    iget-object v1, p0, Lcom/google/dexmaker/MethodId;->parameters:Lcom/google/dexmaker/TypeList;

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/TypeList;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/google/dexmaker/MethodId;->returnType:Lcom/google/dexmaker/TypeId;

    iget-object v0, p0, Lcom/google/dexmaker/MethodId;->returnType:Lcom/google/dexmaker/TypeId;

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/TypeId;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getDeclaringType()Lcom/google/dexmaker/TypeId;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/dexmaker/TypeId<",
            "TD;>;"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/google/dexmaker/MethodId;->declaringType:Lcom/google/dexmaker/TypeId;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/google/dexmaker/MethodId;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/dexmaker/TypeId<",
            "*>;>;"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/google/dexmaker/MethodId;->parameters:Lcom/google/dexmaker/TypeList;

    invoke-virtual {v0}, Lcom/google/dexmaker/TypeList;->asList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getReturnType()Lcom/google/dexmaker/TypeId;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/dexmaker/TypeId<",
            "TR;>;"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/google/dexmaker/MethodId;->returnType:Lcom/google/dexmaker/TypeId;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 110
    iget-object v0, p0, Lcom/google/dexmaker/MethodId;->declaringType:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v0}, Lcom/google/dexmaker/TypeId;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 111
    iget-object v0, p0, Lcom/google/dexmaker/MethodId;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 112
    iget-object v0, p0, Lcom/google/dexmaker/MethodId;->parameters:Lcom/google/dexmaker/TypeList;

    invoke-virtual {v0}, Lcom/google/dexmaker/TypeList;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 113
    iget-object v0, p0, Lcom/google/dexmaker/MethodId;->returnType:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v0}, Lcom/google/dexmaker/TypeId;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public isConstructor()Z
    .locals 2

    .line 65
    iget-object v0, p0, Lcom/google/dexmaker/MethodId;->name:Ljava/lang/String;

    const-string v1, "<init>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method prototype(Z)Lcom/google/dexmaker/dx/rop/type/Prototype;
    .locals 0

    .line 97
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/MethodId;->descriptor(Z)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/dexmaker/dx/rop/type/Prototype;->intern(Ljava/lang/String;)Lcom/google/dexmaker/dx/rop/type/Prototype;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/google/dexmaker/MethodId;->declaringType:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/dexmaker/MethodId;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/dexmaker/MethodId;->parameters:Lcom/google/dexmaker/TypeList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
