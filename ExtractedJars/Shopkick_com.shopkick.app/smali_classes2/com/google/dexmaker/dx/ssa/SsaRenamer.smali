.class public Lcom/google/dexmaker/dx/ssa/SsaRenamer;
.super Ljava/lang/Object;
.source "SsaRenamer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false


# instance fields
.field private nextSsaReg:I

.field private final ropRegCount:I

.field private final ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

.field private final ssaRegToLocalItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/rop/code/LocalItem;",
            ">;"
        }
    .end annotation
.end field

.field private ssaRegToRopReg:Lcom/google/dexmaker/dx/util/IntList;

.field private final startsForBlocks:[[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

.field private threshold:I


# direct methods
.method public constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V
    .locals 3

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getRegCount()I

    move-result v0

    iput v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ropRegCount:I

    .line 104
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    .line 110
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ropRegCount:I

    iput v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->nextSsaReg:I

    const/4 v0, 0x0

    .line 111
    iput v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->threshold:I

    .line 112
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    iput-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->startsForBlocks:[[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 114
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ssaRegToLocalItems:Ljava/util/ArrayList;

    .line 132
    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ropRegCount:I

    new-array v1, v1, [Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 133
    :goto_0
    iget v2, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ropRegCount:I

    if-ge v0, v2, :cond_0

    .line 135
    sget-object v2, Lcom/google/dexmaker/dx/rop/type/Type;->VOID:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-static {v0, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->make(ILcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->startsForBlocks:[[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getEntryBlockIndex()I

    move-result p1

    aput-object v1, v0, p1

    return-void
.end method

.method public constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;I)V
    .locals 0

    .line 154
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;-><init>(Lcom/google/dexmaker/dx/ssa/SsaMethod;)V

    .line 155
    iput p2, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->threshold:I

    return-void
.end method

.method static synthetic access$000(Lcom/google/dexmaker/dx/ssa/SsaRenamer;)[[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 0

    .line 62
    iget-object p0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->startsForBlocks:[[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    return-object p0
.end method

.method static synthetic access$100(Lcom/google/dexmaker/dx/ssa/SsaRenamer;)I
    .locals 0

    .line 62
    iget p0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->nextSsaReg:I

    return p0
.end method

.method static synthetic access$108(Lcom/google/dexmaker/dx/ssa/SsaRenamer;)I
    .locals 2

    .line 62
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->nextSsaReg:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->nextSsaReg:I

    return v0
.end method

.method static synthetic access$1100(Lcom/google/dexmaker/dx/ssa/SsaRenamer;)Lcom/google/dexmaker/dx/ssa/SsaMethod;
    .locals 0

    .line 62
    iget-object p0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    return-object p0
.end method

.method static synthetic access$300([Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 0

    .line 62
    invoke-static {p0}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->dupArray([Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$400(Lcom/google/dexmaker/dx/ssa/SsaRenamer;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 0

    .line 62
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->setNameForSsaReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    return-void
.end method

.method static synthetic access$500(Lcom/google/dexmaker/dx/ssa/SsaRenamer;I)Lcom/google/dexmaker/dx/rop/code/LocalItem;
    .locals 0

    .line 62
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->getLocalForNewReg(I)Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$600(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 62
    invoke-static {p0, p1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->equalsHandlesNulls(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$700(Lcom/google/dexmaker/dx/ssa/SsaRenamer;)I
    .locals 0

    .line 62
    iget p0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->threshold:I

    return p0
.end method

.method static synthetic access$800(Lcom/google/dexmaker/dx/ssa/SsaRenamer;I)Z
    .locals 0

    .line 62
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->isBelowThresholdRegister(I)Z

    move-result p0

    return p0
.end method

.method static synthetic access$900(Lcom/google/dexmaker/dx/ssa/SsaRenamer;I)Z
    .locals 0

    .line 62
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->isVersionZeroRegister(I)Z

    move-result p0

    return p0
.end method

.method private static dupArray([Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 3

    .line 200
    array-length v0, p0

    new-array v0, v0, [Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 202
    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method private static equalsHandlesNulls(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eq p0, p1, :cond_1

    if-eqz p0, :cond_0

    .line 270
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private getLocalForNewReg(I)Lcom/google/dexmaker/dx/rop/code/LocalItem;
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ssaRegToLocalItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 215
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ssaRegToLocalItems:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/rop/code/LocalItem;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private isBelowThresholdRegister(I)Z
    .locals 1

    .line 247
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->threshold:I

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private isVersionZeroRegister(I)Z
    .locals 1

    .line 259
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ropRegCount:I

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private setNameForSsaReg(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 3

    .line 227
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    .line 228
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object p1

    .line 230
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ssaRegToLocalItems:Ljava/util/ArrayList;

    add-int/lit8 v2, v0, 0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 231
    :goto_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ssaRegToLocalItems:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gt v1, v0, :cond_0

    .line 232
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ssaRegToLocalItems:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 235
    :cond_0
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ssaRegToLocalItems:Ljava/util/ArrayList;

    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 164
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    new-instance v1, Lcom/google/dexmaker/dx/ssa/SsaRenamer$1;

    invoke-direct {v1, p0}, Lcom/google/dexmaker/dx/ssa/SsaRenamer$1;-><init>(Lcom/google/dexmaker/dx/ssa/SsaRenamer;)V

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->forEachBlockDepthFirstDom(Lcom/google/dexmaker/dx/ssa/SsaBasicBlock$Visitor;)V

    .line 171
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    iget v1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->nextSsaReg:I

    invoke-virtual {v0, v1}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->setNewRegCount(I)V

    .line 172
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->ssaMeth:Lcom/google/dexmaker/dx/ssa/SsaMethod;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->onInsnsChanged()V

    return-void
.end method
