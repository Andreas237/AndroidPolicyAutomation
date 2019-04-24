.class public final Lcom/google/dexmaker/dx/cf/code/Merger;
.super Ljava/lang/Object;
.source "Merger.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static mergeType(Lcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/type/TypeBearer;
    .locals 2

    if-eqz p0, :cond_9

    .line 34
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return-object v0

    .line 39
    :cond_1
    invoke-interface {p0}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object p0

    .line 40
    invoke-interface {p1}, Lcom/google/dexmaker/dx/rop/type/TypeBearer;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object p1

    if-ne p0, p1, :cond_2

    return-object p0

    .line 44
    :cond_2
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/type/Type;->isReference()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/type/Type;->isReference()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 45
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->KNOWN_NULL:Lcom/google/dexmaker/dx/rop/type/Type;

    if-ne p0, v0, :cond_3

    return-object p1

    .line 51
    :cond_3
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->KNOWN_NULL:Lcom/google/dexmaker/dx/rop/type/Type;

    if-ne p1, v0, :cond_4

    return-object p0

    .line 57
    :cond_4
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/type/Type;->isArray()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/type/Type;->isArray()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 58
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/type/Type;->getComponentType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object p0

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/type/Type;->getComponentType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/dexmaker/dx/cf/code/Merger;->mergeType(Lcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/type/TypeBearer;

    move-result-object p0

    if-nez p0, :cond_5

    .line 66
    sget-object p0, Lcom/google/dexmaker/dx/rop/type/Type;->OBJECT:Lcom/google/dexmaker/dx/rop/type/Type;

    return-object p0

    .line 68
    :cond_5
    check-cast p0, Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/type/Type;->getArrayType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object p0

    return-object p0

    .line 75
    :cond_6
    sget-object p0, Lcom/google/dexmaker/dx/rop/type/Type;->OBJECT:Lcom/google/dexmaker/dx/rop/type/Type;

    return-object p0

    .line 77
    :cond_7
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/type/Type;->isIntlike()Z

    move-result p0

    if-eqz p0, :cond_8

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/type/Type;->isIntlike()Z

    move-result p0

    if-eqz p0, :cond_8

    .line 82
    sget-object p0, Lcom/google/dexmaker/dx/rop/type/Type;->INT:Lcom/google/dexmaker/dx/rop/type/Type;

    return-object p0

    :cond_8
    return-object v0

    :cond_9
    :goto_0
    return-object p0
.end method
