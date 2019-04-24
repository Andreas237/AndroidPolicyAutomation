.class Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;
.super Ljava/lang/Object;
.source "SsaRenamer.java"

# interfaces
.implements Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/ssa/SsaRenamer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "BlockRenamer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer$RenamingMapper;
    }
.end annotation


# instance fields
.field private final block:Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

.field private final currentMapping:[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

.field private final insnsToReplace:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation
.end field

.field private final mapper:Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer$RenamingMapper;

.field private final movesToKeep:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/google/dexmaker/dx/ssa/SsaInsn;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/google/dexmaker/dx/ssa/SsaRenamer;


# direct methods
.method constructor <init>(Lcom/google/dexmaker/dx/ssa/SsaRenamer;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)V
    .locals 2

    .line 310
    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->this$0:Lcom/google/dexmaker/dx/ssa/SsaRenamer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 311
    iput-object p2, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->block:Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 312
    invoke-static {p1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->access$000(Lcom/google/dexmaker/dx/ssa/SsaRenamer;)[[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getIndex()I

    move-result v1

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->currentMapping:[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    .line 313
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->movesToKeep:Ljava/util/HashSet;

    .line 314
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->insnsToReplace:Ljava/util/HashMap;

    .line 315
    new-instance v0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer$RenamingMapper;

    invoke-direct {v0, p0}, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer$RenamingMapper;-><init>(Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;)V

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->mapper:Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer$RenamingMapper;

    .line 318
    invoke-static {p1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->access$000(Lcom/google/dexmaker/dx/ssa/SsaRenamer;)[[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getIndex()I

    move-result p2

    const/4 v0, 0x0

    aput-object v0, p1, p2

    return-void
.end method

.method static synthetic access$1000(Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;)Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;
    .locals 0

    .line 277
    iget-object p0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->block:Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    return-object p0
.end method

.method static synthetic access$200(Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;)[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 0

    .line 277
    iget-object p0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->currentMapping:[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    return-object p0
.end method

.method private addMapping(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 4

    .line 435
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    .line 436
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v1

    .line 438
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->currentMapping:[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    aput-object p2, v2, p1

    .line 443
    array-length p1, v2

    add-int/lit8 p1, p1, -0x1

    :goto_0
    if-ltz p1, :cond_1

    .line 444
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->currentMapping:[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    aget-object v2, v2, p1

    .line 446
    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v2

    if-ne v0, v2, :cond_0

    .line 447
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->currentMapping:[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    aput-object p2, v2, p1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    return-void

    .line 457
    :cond_2
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->this$0:Lcom/google/dexmaker/dx/ssa/SsaRenamer;

    invoke-static {p1, p2}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->access$400(Lcom/google/dexmaker/dx/ssa/SsaRenamer;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 460
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->currentMapping:[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    array-length p1, p1

    add-int/lit8 p1, p1, -0x1

    :goto_1
    if-ltz p1, :cond_4

    .line 461
    iget-object p2, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->currentMapping:[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    aget-object p2, p2, p1

    .line 463
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v2

    if-eq v0, v2, :cond_3

    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/rop/code/LocalItem;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 465
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->currentMapping:[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    const/4 v3, 0x0

    invoke-virtual {p2, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withLocalItem(Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    aput-object p2, v2, p1

    :cond_3
    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_4
    return-void
.end method

.method private updateSuccessorPhis()V
    .locals 4

    .line 629
    new-instance v0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer$1;

    invoke-direct {v0, p0}, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer$1;-><init>(Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;)V

    .line 654
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->block:Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getSuccessors()Ljava/util/BitSet;

    move-result-object v1

    const/4 v2, 0x0

    .line 655
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v2

    :goto_0
    if-ltz v2, :cond_0

    .line 657
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->this$0:Lcom/google/dexmaker/dx/ssa/SsaRenamer;

    invoke-static {v3}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->access$1100(Lcom/google/dexmaker/dx/ssa/SsaRenamer;)Lcom/google/dexmaker/dx/ssa/SsaMethod;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 658
    invoke-virtual {v3, v0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->forEachPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn$Visitor;)V

    add-int/lit8 v2, v2, 0x1

    .line 656
    invoke-virtual {v1, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v2

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public process()V
    .locals 5

    .line 374
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->block:Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-virtual {v0, p0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->forEachInsn(Lcom/google/dexmaker/dx/ssa/SsaInsn$Visitor;)V

    .line 376
    invoke-direct {p0}, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->updateSuccessorPhis()V

    .line 379
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->block:Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getInsns()Ljava/util/ArrayList;

    move-result-object v0

    .line 380
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_2

    .line 383
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    .line 386
    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->insnsToReplace:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/dexmaker/dx/ssa/SsaInsn;

    if-eqz v4, :cond_0

    .line 389
    invoke-virtual {v0, v1, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 390
    :cond_0
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->isNormalMoveInsn()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->movesToKeep:Ljava/util/HashSet;

    invoke-virtual {v4, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 392
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 398
    :cond_2
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->block:Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getDomChildren()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    .line 399
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->block:Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    if-eq v1, v3, :cond_3

    if-eqz v2, :cond_4

    .line 401
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->currentMapping:[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    goto :goto_3

    :cond_4
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->currentMapping:[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    invoke-static {v2}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->access$300([Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    .line 404
    :goto_3
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->this$0:Lcom/google/dexmaker/dx/ssa/SsaRenamer;

    invoke-static {v3}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->access$000(Lcom/google/dexmaker/dx/ssa/SsaRenamer;)[[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;->getIndex()I

    move-result v1

    aput-object v2, v3, v1

    const/4 v1, 0x0

    move v2, v1

    goto :goto_2

    :cond_5
    return-void
.end method

.method processResultReg(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V
    .locals 2

    .line 603
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 609
    :cond_0
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    .line 610
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->this$0:Lcom/google/dexmaker/dx/ssa/SsaRenamer;

    invoke-static {v1, v0}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->access$800(Lcom/google/dexmaker/dx/ssa/SsaRenamer;I)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 614
    :cond_1
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->this$0:Lcom/google/dexmaker/dx/ssa/SsaRenamer;

    invoke-static {v1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->access$100(Lcom/google/dexmaker/dx/ssa/SsaRenamer;)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->changeResultReg(I)V

    .line 615
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->addMapping(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 621
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->this$0:Lcom/google/dexmaker/dx/ssa/SsaRenamer;

    invoke-static {p1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->access$108(Lcom/google/dexmaker/dx/ssa/SsaRenamer;)I

    return-void
.end method

.method public visitMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
    .locals 7

    .line 495
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    .line 496
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v1

    .line 497
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v2

    .line 499
    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->mapper:Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer$RenamingMapper;

    invoke-virtual {p1, v4}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->mapSourceRegisters(Lcom/google/dexmaker/dx/ssa/RegisterMapper;)V

    .line 500
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->getSources()Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v4

    .line 502
    iget-object v5, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->currentMapping:[Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    aget-object v2, v5, v2

    invoke-virtual {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v2

    .line 504
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v5

    if-nez v5, :cond_0

    move-object v5, v2

    .line 515
    :cond_0
    iget-object v6, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->this$0:Lcom/google/dexmaker/dx/ssa/SsaRenamer;

    invoke-static {v6, v4}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->access$500(Lcom/google/dexmaker/dx/ssa/SsaRenamer;I)Lcom/google/dexmaker/dx/rop/code/LocalItem;

    move-result-object v6

    if-eqz v6, :cond_1

    if-eqz v5, :cond_1

    .line 521
    invoke-virtual {v5, v6}, Lcom/google/dexmaker/dx/rop/code/LocalItem;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    :cond_1
    const/4 v3, 0x1

    .line 535
    :cond_2
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    invoke-static {v4, v0, v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->makeLocalOptional(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    .line 539
    invoke-static {}, Lcom/google/dexmaker/dx/ssa/Optimizer;->getPreserveLocals()Z

    move-result v4

    if-eqz v4, :cond_5

    if-eqz v3, :cond_3

    invoke-static {v5, v2}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->access$600(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->this$0:Lcom/google/dexmaker/dx/ssa/SsaRenamer;

    invoke-static {v4}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->access$700(Lcom/google/dexmaker/dx/ssa/SsaRenamer;)I

    move-result v4

    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_4

    if-nez v2, :cond_4

    .line 549
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->this$0:Lcom/google/dexmaker/dx/ssa/SsaRenamer;

    invoke-static {v2}, Lcom/google/dexmaker/dx/ssa/SsaRenamer;->access$700(Lcom/google/dexmaker/dx/ssa/SsaRenamer;)I

    move-result v2

    if-nez v2, :cond_4

    .line 556
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v2

    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v3

    invoke-static {v2, v3, v5}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->make(ILcom/google/dexmaker/dx/rop/type/TypeBearer;Lcom/google/dexmaker/dx/rop/code/LocalItem;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-static {v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;->make(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;

    move-result-object v2

    .line 560
    new-instance v3, Lcom/google/dexmaker/dx/rop/code/PlainInsn;

    invoke-static {v0}, Lcom/google/dexmaker/dx/rop/code/Rops;->opMarkLocal(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v4

    sget-object v5, Lcom/google/dexmaker/dx/rop/code/SourcePosition;->NO_INFO:Lcom/google/dexmaker/dx/rop/code/SourcePosition;

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6, v2}, Lcom/google/dexmaker/dx/rop/code/PlainInsn;-><init>(Lcom/google/dexmaker/dx/rop/code/Rop;Lcom/google/dexmaker/dx/rop/code/SourcePosition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/rop/code/RegisterSpecList;)V

    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->block:Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;

    invoke-static {v3, v2}, Lcom/google/dexmaker/dx/ssa/SsaInsn;->makeFromRop(Lcom/google/dexmaker/dx/rop/code/Insn;Lcom/google/dexmaker/dx/ssa/SsaBasicBlock;)Lcom/google/dexmaker/dx/ssa/SsaInsn;

    move-result-object v2

    .line 565
    iget-object v3, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->insnsToReplace:Ljava/util/HashMap;

    invoke-virtual {v3, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 568
    invoke-direct {p0, v1, v0}, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->addMapping(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    goto :goto_1

    .line 574
    :cond_4
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->processResultReg(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    .line 576
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->movesToKeep:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 548
    :cond_5
    :goto_0
    invoke-direct {p0, v1, v0}, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->addMapping(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    :goto_1
    return-void
.end method

.method public visitNonMoveInsn(Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;)V
    .locals 1

    .line 590
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->mapper:Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer$RenamingMapper;

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/ssa/NormalSsaInsn;->mapSourceRegisters(Lcom/google/dexmaker/dx/ssa/RegisterMapper;)V

    .line 592
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->processResultReg(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    return-void
.end method

.method public visitPhiInsn(Lcom/google/dexmaker/dx/ssa/PhiInsn;)V
    .locals 0

    .line 477
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/ssa/SsaRenamer$BlockRenamer;->processResultReg(Lcom/google/dexmaker/dx/ssa/SsaInsn;)V

    return-void
.end method
