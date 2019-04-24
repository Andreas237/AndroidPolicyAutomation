.class public abstract Lcom/google/dexmaker/dx/ssa/RegisterMapper;
.super Ljava/lang/Object;
.source "RegisterMapper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getNewRegisterCount()I
.end method

.method public abstract map(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
.end method

.method public final map(Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;
    .locals 4

    .line 49
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->size()I

    move-result v0

    .line 50
    new-instance v1, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    invoke-direct {v1, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 53
    invoke-virtual {p1, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/google/dexmaker/dx/ssa/RegisterMapper;->map(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->set(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->setImmutable()V

    .line 59
    invoke-virtual {v1, p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    return-object p1
.end method
