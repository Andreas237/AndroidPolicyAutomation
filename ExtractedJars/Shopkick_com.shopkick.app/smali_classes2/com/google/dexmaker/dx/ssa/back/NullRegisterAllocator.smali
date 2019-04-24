.class public Lcom/google/dexmaker/dx/ssa/back/NullRegisterAllocator;
.super Lcom/google/dexmaker/dx/ssa/back/RegisterAllocator;
.source "NullRegisterAllocator.java"


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/dx/ssa/back/RegisterAllocator;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;Lcom/google/dexmaker/dx/ssa/back/InterferenceGraph;)V

    return-void
.end method


# virtual methods
.method public allocateRegisters()Lcom/google/dexmaker/dx/ssa/RegisterMapper;
    .locals 5

    .line 48
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/NullRegisterAllocator;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v0

    .line 50
    new-instance v1, Lcom/google/dexmaker/dx/ssa/BasicRegisterMapper;

    invoke-direct {v1, v0}, Lcom/google/dexmaker/dx/ssa/BasicRegisterMapper;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v3, v2, 0x2

    const/4 v4, 0x2

    .line 53
    invoke-virtual {v1, v2, v3, v4}, Lcom/google/dexmaker/dx/ssa/BasicRegisterMapper;->addMapping(III)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public wantsParamsMovedHigh()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
