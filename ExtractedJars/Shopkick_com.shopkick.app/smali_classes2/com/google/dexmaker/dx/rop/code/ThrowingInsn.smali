.class public final Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;
.super Lcom/google/dexmaker/dx/rop/code/Insn;
.source "ThrowingInsn.java"


# instance fields
.field private final catches:Lcom/google/dexmaker/dx/rop/type/TypeList;


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;)V
    .locals 1

    const/4 v0, 0x0

    .line 65
    invoke-direct {p0, p1, p2, v0, p3}, Lcom/google/dexmaker/dx/rop/code/Insn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    .line 67
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/Rop;->getBranchingness()I

    move-result p1

    const/4 p2, 0x6

    if-ne p1, p2, :cond_1

    if-eqz p4, :cond_0

    .line 75
    iput-object p4, p0, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;->catches:Lcom/google/dexmaker/dx/rop/type/TypeList;

    return-void

    .line 72
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "catches == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 68
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bogus branchingness"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static toCatchString(Lcom/google/dexmaker/dx/rop/type/TypeList;)Ljava/lang/String;
    .locals 4

    .line 41
    new-instance v0, Ljava/lang/StringBuffer;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    const-string v1, "catch"

    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 45
    invoke-interface {p0}, Lcom/google/dexmaker/dx/rop/type/TypeList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    const-string v3, " "

    .line 47
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 48
    invoke-interface {p0, v2}, Lcom/google/dexmaker/dx/rop/type/TypeList;->getType(I)Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/type/Type;->toHuman()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public accept(Lcom/google/dexmaker/dx/rop/code/Insn$Visitor;)V
    .locals 0

    .line 93
    invoke-interface {p1, p0}, Lcom/google/dexmaker/dx/rop/code/Insn$Visitor;->visitThrowingInsn(Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;)V

    return-void
.end method

.method public getCatches()Lcom/google/dexmaker/dx/rop/type/TypeList;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;->catches:Lcom/google/dexmaker/dx/rop/type/TypeList;

    return-object v0
.end method

.method public getInlineString()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;->catches:Lcom/google/dexmaker/dx/rop/type/TypeList;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;->toCatchString(Lcom/google/dexmaker/dx/rop/type/TypeList;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public withAddedCatch(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 5

    .line 99
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v3

    iget-object v4, p0, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;->catches:Lcom/google/dexmaker/dx/rop/type/TypeList;

    invoke-interface {v4, p1}, Lcom/google/dexmaker/dx/rop/type/TypeList;->withAddedType(Lcom/google/dexmaker/dx/rop/type/Type;)Lcom/google/dexmaker/dx/rop/type/TypeList;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;)V

    return-object v0
.end method

.method public withNewRegisters(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 3

    .line 116
    new-instance p1, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v1

    iget-object v2, p0, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;->catches:Lcom/google/dexmaker/dx/rop/type/TypeList;

    invoke-direct {p1, v0, v1, p2, v2}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;)V

    return-object p1
.end method

.method public withRegisterOffset(I)Lcom/google/dexmaker/dx/rop/code/Insn;
    .locals 4

    .line 106
    new-instance v0, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;->getPosition()Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    move-result-object v2

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->withOffset(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object p1

    iget-object v3, p0, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;->catches:Lcom/google/dexmaker/dx/rop/type/TypeList;

    invoke-direct {v0, v1, v2, p1, v3}, Lcom/google/dexmaker/dx/rop/code/ThrowingInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;Lcom/google/dexmaker/dx/rop/type/TypeList;)V

    return-object v0
.end method
