.class public Lcom/google/dexmaker/dx/ssa/DomFront;
.super Ljava/lang/Object;
.source "DomFront.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;
    }
.end annotation


# static fields
.field private static DEBUG:Z = false


# instance fields
.field private final domInfos:[Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;

.field private final meth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

.field private final nodes:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 3

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->meth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    .line 64
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    .line 66
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    .line 67
    new-array v0, p1, [Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->domInfos:[Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    .line 70
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->domInfos:[Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;

    new-instance v2, Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;

    invoke-direct {v2}, Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;-><init>()V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private buildDomTree()V
    .locals 5

    .line 152
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 155
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->domInfos:[Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;

    aget-object v2, v2, v1

    .line 157
    iget v3, v2, Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;->idom:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    goto :goto_1

    .line 159
    :cond_0
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    iget v2, v2, Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;->idom:I

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 160
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-virtual {v2, v3}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->addDomChild(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private calcDomFronts()V
    .locals 8

    .line 170
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_4

    .line 173
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 174
    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->domInfos:[Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;

    aget-object v4, v4, v2

    .line 175
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    move-result-object v3

    .line 177
    invoke-virtual {v3}, Ljava/util/BitSet;->cardinality()I

    move-result v5

    const/4 v6, 0x1

    if-le v5, v6, :cond_3

    .line 178
    invoke-virtual {v3, v1}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v5

    :goto_1
    if-ltz v5, :cond_3

    move v6, v5

    .line 182
    :goto_2
    iget v7, v4, Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;->idom:I

    if-eq v6, v7, :cond_2

    const/4 v7, -0x1

    if-ne v6, v7, :cond_0

    goto :goto_3

    .line 190
    :cond_0
    iget-object v7, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->domInfos:[Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;

    aget-object v6, v7, v6

    .line 192
    iget-object v7, v6, Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;->dominanceFrontiers:Lcom/google/dexmaker/dx/util/IntSet;

    invoke-interface {v7, v2}, Lcom/google/dexmaker/dx/util/IntSet;->has(I)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_3

    .line 197
    :cond_1
    iget-object v7, v6, Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;->dominanceFrontiers:Lcom/google/dexmaker/dx/util/IntSet;

    invoke-interface {v7, v2}, Lcom/google/dexmaker/dx/util/IntSet;->add(I)V

    .line 198
    iget v6, v6, Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;->idom:I

    goto :goto_2

    :cond_2
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 179
    invoke-virtual {v3, v5}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v5

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method private debugPrintDomChildren()V
    .locals 8

    .line 124
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    .line 127
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 128
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const/16 v5, 0x7b

    .line 130
    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 132
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getDomChildren()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v6, v1

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    if-eqz v6, :cond_0

    const/16 v6, 0x2c

    .line 134
    invoke-virtual {v4, v6}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 136
    :cond_0
    invoke-virtual {v4, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/16 v5, 0x7d

    .line 139
    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 141
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "domChildren["

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "]: "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public run()[Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;
    .locals 7

    .line 80
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 82
    sget-boolean v1, Lcom/google/dexmaker/dx/ssa/DomFront;->DEBUG:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    :goto_0
    if-ge v1, v0, :cond_0

    .line 84
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->nodes:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 85
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "pred["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "]: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getPredecessors()Ljava/util/BitSet;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 90
    :cond_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->meth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->domInfos:[Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;

    invoke-static {v1, v3, v2}, Lcom/google/dexmaker/dx/ssa/Dominators;->make(Lcom/google/dexmaker/dx/ssa/SsaMethod;[Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;Z)Lcom/google/dexmaker/dx/ssa/Dominators;

    .line 92
    sget-boolean v1, Lcom/google/dexmaker/dx/ssa/DomFront;->DEBUG:Z

    if-eqz v1, :cond_1

    move v1, v2

    :goto_1
    if-ge v1, v0, :cond_1

    .line 94
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->domInfos:[Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;

    aget-object v3, v3, v1

    .line 95
    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "idom["

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, "]: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v3, Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;->idom:I

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 100
    :cond_1
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/DomFront;->buildDomTree()V

    .line 102
    sget-boolean v1, Lcom/google/dexmaker/dx/ssa/DomFront;->DEBUG:Z

    if-eqz v1, :cond_2

    .line 103
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/DomFront;->debugPrintDomChildren()V

    :cond_2
    move v1, v2

    :goto_2
    if-ge v1, v0, :cond_3

    .line 107
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->domInfos:[Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;

    aget-object v3, v3, v1

    invoke-static {v0}, Lcom/google/dexmaker/dx/ssa/SetFactory;->makeDomFrontSet(I)Lcom/google/dexmaker/dx/util/IntSet;

    move-result-object v4

    iput-object v4, v3, Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;->dominanceFrontiers:Lcom/google/dexmaker/dx/util/IntSet;

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 111
    :cond_3
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/DomFront;->calcDomFronts()V

    .line 113
    sget-boolean v1, Lcom/google/dexmaker/dx/ssa/DomFront;->DEBUG:Z

    if-eqz v1, :cond_4

    :goto_3
    if-ge v2, v0, :cond_4

    .line 115
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "df["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "]: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->domInfos:[Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;

    aget-object v4, v4, v2

    iget-object v4, v4, Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;->dominanceFrontiers:Lcom/google/dexmaker/dx/util/IntSet;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 120
    :cond_4
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/DomFront;->domInfos:[Lcom/google/dexmaker/dx/ssa/DomFront$DomInfo;

    return-object v0
.end method
