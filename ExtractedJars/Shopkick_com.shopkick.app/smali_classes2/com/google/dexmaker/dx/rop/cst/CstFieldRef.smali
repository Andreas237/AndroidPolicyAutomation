.class public final Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;
.super Lcom/google/dexmaker/dx/rop/cst/CstMemberRef;
.source "CstFieldRef.java"


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/cst/CstType;Lcom/google/dexmaker/dx/rop/cst/CstNat;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/dx/rop/cst/CstMemberRef;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstType;Lcom/google/dexmaker/dx/rop/cst/CstNat;)V

    return-void
.end method

.method public static forPrimitiveType(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;
    .locals 2

    .line 36
    new-instance v0, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    invoke-static {p0}, Lcom/google/dexmaker/dx/rop/cst/CstType;->forBoxedPrimitiveType(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/cst/CstType;

    move-result-object p0

    sget-object v1, Lcom/google/dexmaker/dx/rop/cst/CstNat;->PRIMITIVE_TYPE_NAT:Lcom/google/dexmaker/dx/rop/cst/CstNat;

    invoke-direct {v0, p0, v1}, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;-><init>(Lcom/google/dexmaker/dx/rop/cst/CstType;Lcom/google/dexmaker/dx/rop/cst/CstNat;)V

    return-object v0
.end method


# virtual methods
.method protected compareTo0(Lcom/google/dexmaker/dx/rop/cst/Constant;)I
    .locals 1

    .line 68
    invoke-super {p0, p1}, Lcom/google/dexmaker/dx/rop/cst/CstMemberRef;->compareTo0(Lcom/google/dexmaker/dx/rop/cst/Constant;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 74
    :cond_0
    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    .line 75
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;->getNat()Lcom/google/dexmaker/dx/rop/cst/CstNat;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstNat;->getDescriptor()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object v0

    .line 76
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;->getNat()Lcom/google/dexmaker/dx/rop/cst/CstNat;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/cst/CstNat;->getDescriptor()Lcom/google/dexmaker/dx/rop/cst/CstString;

    move-result-object p1

    .line 77
    invoke-virtual {v0, p1}, Lcom/google/dexmaker/dx/rop/cst/CstString;->compareTo(Lcom/google/dexmaker/dx/rop/cst/Constant;)I

    move-result p1

    return p1
.end method

.method public getType()Lcom/google/dexmaker/dx/rop/type/Type;
    .locals 1

    .line 62
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;->getNat()Lcom/google/dexmaker/dx/rop/cst/CstNat;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/cst/CstNat;->getFieldType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    return-object v0
.end method

.method public typeName()Ljava/lang/String;
    .locals 1

    const-string v0, "field"

    return-object v0
.end method
