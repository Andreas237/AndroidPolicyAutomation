.class public final Lcom/google/dexmaker/FieldId;
.super Ljava/lang/Object;
.source "FieldId.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final constant:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

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

.field final type:Lcom/google/dexmaker/TypeId;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/dexmaker/TypeId<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/dexmaker/TypeId;Lcom/google/dexmaker/TypeId;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/dexmaker/TypeId<",
            "TD;>;",
            "Lcom/google/dexmaker/TypeId<",
            "TV;>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    .line 42
    iput-object p1, p0, Lcom/google/dexmaker/FieldId;->declaringType:Lcom/google/dexmaker/TypeId;

    .line 43
    iput-object p2, p0, Lcom/google/dexmaker/FieldId;->type:Lcom/google/dexmaker/TypeId;

    .line 44
    iput-object p3, p0, Lcom/google/dexmaker/FieldId;->name:Ljava/lang/String;

    .line 45
    new-instance v0, Lcom/google/dexmaker/dx/rop/cst/CstNat;

    new-instance v1, Lcom/google/dexmaker/dx/rop/cst/CstString;

    invoke-direct {v1, p3}, Lcom/google/dexmaker/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    new-instance p3, Lcom/google/dexmaker/dx/rop/cst/CstString;

    iget-object p2, p2, Lcom/google/dexmaker/TypeId;->name:Ljava/lang/String;

    invoke-direct {p3, p2}, Lcom/google/dexmaker/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1, p3}, Lcom/google/dexmaker/dx/rop/cst/CstNat;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstString;Lcom/google/dexmaker/dx/rop/cst/CstString;)V

    iput-object v0, p0, Lcom/google/dexmaker/FieldId;->nat:Lcom/google/dexmaker/dx/rop/cst/CstNat;

    .line 46
    new-instance p2, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    iget-object p1, p1, Lcom/google/dexmaker/TypeId;->constant:Lcom/google/dexmaker/dx/rop/cst/CstType;

    iget-object p3, p0, Lcom/google/dexmaker/FieldId;->nat:Lcom/google/dexmaker/dx/rop/cst/CstNat;

    invoke-direct {p2, p1, p3}, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstType;Lcom/google/dexmaker/dx/rop/cst/CstNat;)V

    iput-object p2, p0, Lcom/google/dexmaker/FieldId;->constant:Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    return-void

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1}, Ljava/lang/NullPointerException;-><init>()V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 62
    instance-of v0, p1, Lcom/google/dexmaker/FieldId;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/dexmaker/FieldId;

    iget-object v0, p1, Lcom/google/dexmaker/FieldId;->declaringType:Lcom/google/dexmaker/TypeId;

    iget-object v1, p0, Lcom/google/dexmaker/FieldId;->declaringType:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/TypeId;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/google/dexmaker/FieldId;->name:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/dexmaker/FieldId;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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

    .line 50
    iget-object v0, p0, Lcom/google/dexmaker/FieldId;->declaringType:Lcom/google/dexmaker/TypeId;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/google/dexmaker/FieldId;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Lcom/google/dexmaker/TypeId;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/dexmaker/TypeId<",
            "TV;>;"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/google/dexmaker/FieldId;->type:Lcom/google/dexmaker/TypeId;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 68
    iget-object v0, p0, Lcom/google/dexmaker/FieldId;->declaringType:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v0}, Lcom/google/dexmaker/TypeId;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/google/dexmaker/FieldId;->name:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x25

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/google/dexmaker/FieldId;->declaringType:Lcom/google/dexmaker/TypeId;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/dexmaker/FieldId;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
