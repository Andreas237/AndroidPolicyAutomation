.class public Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;
.super Lcom/google/dexmaker/dx/util/MutabilityControl;
.source "LocalVariableInfo.java"


# instance fields
.field private final blockStarts:[Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

.field private final emptySet:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

.field private final insnAssignments:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            "Lcom/google/dexmaker/dx/rop/code/RegisterSpec;",
            ">;"
        }
    .end annotation
.end field

.field private final regCount:I


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 2

    .line 57
    invoke-direct {p0}, Lcom/google/dexmaker/dx/util/MutabilityControl;-><init>()V

    if-eqz p1, :cond_0

    .line 62
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v0

    .line 64
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result p1

    iput p1, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->regCount:I

    .line 65
    new-instance p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->regCount:I

    invoke-direct {p1, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;-><init>(I)V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->emptySet:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    .line 66
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->blockStarts:[Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    .line 67
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->insnAssignments:Ljava/util/HashMap;

    .line 70
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->emptySet:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->setImmutable()V

    return-void

    .line 59
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "method == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private getStarts0(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;
    .locals 1

    .line 245
    :try_start_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->blockStarts:[Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    aget-object p1, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 248
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bogus index"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public addAssignment(Lcom/google/dexmaker/dx/ssa/SsaInsn;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 1

    .line 188
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->throwIfImmutable()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 198
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->insnAssignments:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 195
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "spec == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 191
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "insn == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public debugDump()V
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    .line 222
    :goto_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->blockStarts:[Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    array-length v3, v2

    if-ge v1, v3, :cond_2

    .line 223
    aget-object v3, v2, v1

    if-nez v3, :cond_0

    goto :goto_1

    .line 227
    :cond_0
    aget-object v2, v2, v1

    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->emptySet:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    const/4 v4, 0x1

    if-ne v2, v3, :cond_1

    .line 228
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v3, "%04x: empty set\n"

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v0

    invoke-virtual {v2, v3, v4}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    goto :goto_1

    .line 230
    :cond_1
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v3, "%04x: %s\n"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v0

    iget-object v6, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->blockStarts:[Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    aget-object v6, v6, v1

    aput-object v6, v5, v4

    invoke-virtual {v2, v3, v5}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public getAssignment(Lcom/google/dexmaker/dx/ssa/SsaInsn;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->insnAssignments:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    return-object p1
.end method

.method public getAssignmentCount()I
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->insnAssignments:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    return v0
.end method

.method public getStarts(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;
    .locals 0

    .line 140
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->getStarts0(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 142
    :cond_0
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->emptySet:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    :goto_0
    return-object p1
.end method

.method public getStarts(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;
    .locals 0

    .line 154
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getIndex()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->getStarts(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object p1

    return-object p1
.end method

.method public mergeStarts(ILcom/google/dexmaker/dx/rop/code/RegisterSpecSet;)Z
    .locals 3

    .line 110
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->getStarts0(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 114
    invoke-virtual {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->setStarts(ILcom/google/dexmaker/dx/rop/code/RegisterSpecSet;)V

    return v1

    .line 118
    :cond_0
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->mutableCopy()Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object v2

    .line 119
    invoke-virtual {v2, p2, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->intersect(Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;Z)V

    .line 121
    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    return p1

    .line 125
    :cond_1
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->setImmutable()V

    .line 126
    invoke-virtual {p0, p1, v2}, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->setStarts(ILcom/google/dexmaker/dx/rop/code/RegisterSpecSet;)V

    return v1
.end method

.method public mutableCopyOfStarts(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;
    .locals 1

    .line 167
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->getStarts0(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 169
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->mutableCopy()Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    iget v0, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->regCount:I

    invoke-direct {p1, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;-><init>(I)V

    :goto_0
    return-object p1
.end method

.method public setStarts(ILcom/google/dexmaker/dx/rop/code/RegisterSpecSet;)V
    .locals 1

    .line 81
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->throwIfImmutable()V

    if-eqz p2, :cond_0

    .line 88
    :try_start_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/LocalVariableInfo;->blockStarts:[Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    aput-object p2, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 91
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bogus index"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 84
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "specs == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
