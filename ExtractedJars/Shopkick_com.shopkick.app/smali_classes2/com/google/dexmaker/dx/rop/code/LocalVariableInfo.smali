.class public final Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;
.super Lcom/google/dexmaker/dx/util/MutabilityControl;
.source "LocalVariableInfo.java"


# instance fields
.field private final blockStarts:[Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

.field private final emptySet:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

.field private final insnAssignments:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/google/dexmaker/dx/rop/code/Insn;",
            "Lcom/google/dexmaker/dx/rop/code/RegisterSpec;",
            ">;"
        }
    .end annotation
.end field

.field private final regCount:I


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/rop/code/RopMethod;)V
    .locals 3

    .line 55
    invoke-direct {p0}, Lcom/google/dexmaker/dx/util/MutabilityControl;-><init>()V

    if-eqz p1, :cond_0

    .line 60
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RopMethod;->getBlocks()Lcom/google/dexmaker/dx/rop/code/BasicBlockList;

    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;->getMaxLabel()I

    move-result v0

    .line 63
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;->getRegCount()I

    move-result v1

    iput v1, p0, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->regCount:I

    .line 64
    new-instance v1, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    iget v2, p0, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->regCount:I

    invoke-direct {v1, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;-><init>(I)V

    iput-object v1, p0, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->emptySet:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    .line 65
    new-array v0, v0, [Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    iput-object v0, p0, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->blockStarts:[Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    .line 66
    new-instance v0, Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/BasicBlockList;->getInstructionCount()I

    move-result p1

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->insnAssignments:Ljava/util/HashMap;

    .line 69
    iget-object p1, p0, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->emptySet:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->setImmutable()V

    return-void

    .line 57
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "method == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private getStarts0(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;
    .locals 1

    .line 248
    :try_start_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->blockStarts:[Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    aget-object p1, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 251
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "bogus label"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public addAssignment(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 1

    .line 191
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->throwIfImmutable()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 201
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->insnAssignments:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 198
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "spec == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 194
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

    .line 225
    :goto_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->blockStarts:[Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    array-length v3, v2

    if-ge v1, v3, :cond_2

    .line 226
    aget-object v3, v2, v1

    if-nez v3, :cond_0

    goto :goto_1

    .line 230
    :cond_0
    aget-object v2, v2, v1

    iget-object v3, p0, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->emptySet:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    const/4 v4, 0x1

    if-ne v2, v3, :cond_1

    .line 231
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v3, "%04x: empty set\n"

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v0

    invoke-virtual {v2, v3, v4}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    goto :goto_1

    .line 233
    :cond_1
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v3, "%04x: %s\n"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v0

    iget-object v6, p0, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->blockStarts:[Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    aget-object v6, v6, v1

    aput-object v6, v5, v4

    invoke-virtual {v2, v3, v5}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public getAssignment(Lcom/google/dexmaker/dx/rop/code/Insn;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->insnAssignments:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    return-object p1
.end method

.method public getAssignmentCount()I
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->insnAssignments:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    return v0
.end method

.method public getStarts(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;
    .locals 0

    .line 143
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->getStarts0(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 145
    :cond_0
    iget-object p1, p0, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->emptySet:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    :goto_0
    return-object p1
.end method

.method public getStarts(Lcom/google/dexmaker/dx/rop/code/BasicBlock;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;
    .locals 0

    .line 157
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/BasicBlock;->getLabel()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->getStarts(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object p1

    return-object p1
.end method

.method public mergeStarts(ILcom/google/dexmaker/dx/rop/code/RegisterSpecSet;)Z
    .locals 4

    .line 109
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->getStarts0(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 113
    invoke-virtual {p0, p1, p2}, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->setStarts(ILcom/google/dexmaker/dx/rop/code/RegisterSpecSet;)V

    return v1

    .line 117
    :cond_0
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->mutableCopy()Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object v2

    .line 118
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->size()I

    move-result v3

    if-eqz v3, :cond_1

    .line 119
    invoke-virtual {v2, p2, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->intersect(Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;Z)V

    goto :goto_0

    .line 121
    :cond_1
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->mutableCopy()Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object v2

    .line 124
    :goto_0
    invoke-virtual {v0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 p1, 0x0

    return p1

    .line 128
    :cond_2
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->setImmutable()V

    .line 129
    invoke-virtual {p0, p1, v2}, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->setStarts(ILcom/google/dexmaker/dx/rop/code/RegisterSpecSet;)V

    return v1
.end method

.method public mutableCopyOfStarts(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;
    .locals 1

    .line 170
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->getStarts0(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 172
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->mutableCopy()Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    iget v0, p0, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->regCount:I

    invoke-direct {p1, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;-><init>(I)V

    :goto_0
    return-object p1
.end method

.method public setStarts(ILcom/google/dexmaker/dx/rop/code/RegisterSpecSet;)V
    .locals 1

    .line 80
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->throwIfImmutable()V

    if-eqz p2, :cond_0

    .line 87
    :try_start_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/rop/code/LocalVariableInfo;->blockStarts:[Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    aput-object p2, v0, p1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 90
    :catch_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "bogus label"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 83
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string/jumbo p2, "specs == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
