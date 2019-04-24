.class public Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;
.super Ljava/lang/Object;
.source "MoveParamCombiner.java"


# instance fields
.field private final ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;


# direct methods
.method private constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    return-void
.end method

.method static synthetic access$000(Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)I
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;->getParamIndex(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)I

    move-result p0

    return p0
.end method

.method static synthetic access$100(Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;)Lcom/google/dexmaker/dx/ssa/SsaMethod;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    return-object p0
.end method

.method private getParamIndex(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)I
    .locals 0

    .line 150
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getOriginalRopInsn()Lcom/google/dexmaker/dx/rop/code/Insn;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/rop/code/CstInsn;

    .line 152
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/CstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstInteger;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/cst/CstInteger;->getValue()I

    move-result p1

    return p1
.end method

.method public static process(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 1

    .line 44
    new-instance v0, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;

    invoke-direct {v0, p0}, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    invoke-direct {v0}, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;->run()V

    return-void
.end method

.method private run()V
    .locals 4

    .line 56
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getParamWidth()I

    move-result v0

    new-array v0, v0, [Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 60
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 62
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    new-instance v3, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner$1;-><init>(Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Ljava/util/HashSet;)V

    invoke-virtual {v2, v3}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->forEachInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;)V

    .line 139
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/MoveParamCombiner;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->deleteInsns(Ljava/util/Set;)V

    return-void
.end method
