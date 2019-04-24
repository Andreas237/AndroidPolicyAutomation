.class public Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;
.super Ljava/lang/Object;
.source "LocalList.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/dex/code/LocalList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MakeState"
.end annotation


# instance fields
.field private endIndices:[I

.field private lastAddress:I

.field private nullResultCount:I

.field private regs:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

.field private final result:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 479
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 480
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->result:Ljava/util/ArrayList;

    const/4 p1, 0x0

    .line 481
    iput p1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->nullResultCount:I

    const/4 v0, 0x0

    .line 482
    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->regs:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    .line 483
    iput-object v0, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endIndices:[I

    .line 484
    iput p1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->lastAddress:I

    return-void
.end method

.method private aboutToProcess(II)V
    .locals 4

    .line 495
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endIndices:[I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    .line 497
    :goto_0
    iget v3, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->lastAddress:I

    if-ne p1, v3, :cond_1

    if-nez v0, :cond_1

    return-void

    .line 501
    :cond_1
    iget v3, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->lastAddress:I

    if-lt p1, v3, :cond_5

    if-nez v0, :cond_2

    .line 505
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endIndices:[I

    array-length p1, p1

    if-lt p2, p1, :cond_4

    :cond_2
    add-int/2addr p2, v1

    .line 513
    new-instance p1, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    invoke-direct {p1, p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;-><init>(I)V

    .line 514
    new-array p2, p2, [I

    const/4 v1, -0x1

    .line 515
    invoke-static {p2, v1}, Ljava/util/Arrays;->fill([II)V

    if-nez v0, :cond_3

    .line 518
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->regs:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    invoke-virtual {p1, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->putAll(Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;)V

    .line 519
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endIndices:[I

    array-length v1, v0

    invoke-static {v0, v2, p2, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 523
    :cond_3
    iput-object p1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->regs:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    .line 524
    iput-object p2, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endIndices:[I

    :cond_4
    return-void

    .line 502
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    const-string/jumbo p2, "shouldn\'t happen"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private add(ILcom/google/dexmaker/dx/dex/code/LocalList$Disposition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 3

    .line 851
    invoke-virtual {p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    .line 853
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->result:Ljava/util/ArrayList;

    new-instance v2, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    invoke-direct {v2, p1, p2, p3}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;-><init>(ILcom/google/dexmaker/dx/dex/code/LocalList$Disposition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 855
    sget-object p1, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->START:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    if-ne p2, p1, :cond_0

    .line 856
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->regs:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    invoke-virtual {p1, p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->put(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 857
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endIndices:[I

    const/4 p2, -0x1

    aput p2, p1, v0

    goto :goto_0

    .line 859
    :cond_0
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->regs:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    invoke-virtual {p1, p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->remove(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 860
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endIndices:[I

    iget-object p2, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->result:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    aput p2, p1, v0

    :goto_0
    return-void
.end method

.method private addOrUpdateEnd(ILcom/google/dexmaker/dx/dex/code/LocalList$Disposition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 3

    .line 875
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->START:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    if-eq p2, v0, :cond_1

    .line 879
    invoke-virtual {p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    .line 880
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endIndices:[I

    aget v0, v1, v0

    if-ltz v0, :cond_0

    .line 884
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->result:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    .line 885
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getAddress()I

    move-result v2

    if-ne v2, p1, :cond_0

    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getRegisterSpec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    invoke-virtual {v2, p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 891
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->result:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->withDisposition(Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;)Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 892
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->regs:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    invoke-virtual {p1, p3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->remove(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    return-void

    .line 897
    :cond_0
    invoke-virtual {p0, p1, p3, p2}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endLocal(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;)V

    return-void

    .line 876
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    const-string/jumbo p2, "shouldn\'t happen"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private checkForEmptyRange(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z
    .locals 5

    .line 753
    iget-object v0, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->result:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    const/4 v2, 0x0

    if-ltz v0, :cond_3

    .line 758
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->result:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    if-nez v3, :cond_0

    goto :goto_1

    .line 764
    :cond_0
    invoke-virtual {v3}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getAddress()I

    move-result v4

    if-eq v4, p1, :cond_1

    return v2

    .line 769
    :cond_1
    invoke-virtual {v3, p2}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->matches(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 779
    :cond_3
    :goto_2
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->regs:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    invoke-virtual {v3, p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->remove(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 780
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->result:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v0, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 781
    iget v3, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->nullResultCount:I

    add-int/2addr v3, v1

    iput v3, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->nullResultCount:I

    .line 783
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result p2

    :cond_4
    :goto_3
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_6

    .line 789
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->result:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    if-nez v4, :cond_5

    goto :goto_3

    .line 795
    :cond_5
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getRegisterSpec()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v3

    if-ne v3, p2, :cond_4

    move v2, v1

    :cond_6
    if-eqz v2, :cond_7

    .line 803
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endIndices:[I

    aput v0, v2, p2

    .line 805
    invoke-virtual {v4}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getAddress()I

    move-result p2

    if-ne p2, p1, :cond_7

    .line 810
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->result:Ljava/util/ArrayList;

    sget-object p2, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_SIMPLY:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    invoke-virtual {v4, p2}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->withDisposition(Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;)Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_7
    return v1
.end method

.method private static filterSpec(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;
    .locals 2

    if-eqz p0, :cond_0

    .line 834
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getType()Lcom/google/dexmaker/dx/rop/type/Type;

    move-result-object v0

    sget-object v1, Lcom/google/dexmaker/dx/rop/type/Type;->KNOWN_NULL:Lcom/google/dexmaker/dx/rop/type/Type;

    if-ne v0, v1, :cond_0

    .line 835
    sget-object v0, Lcom/google/dexmaker/dx/rop/type/Type;->OBJECT:Lcom/google/dexmaker/dx/rop/type/Type;

    invoke-virtual {p0, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->withType(Lcom/google/dexmaker/dx/rop/type/TypeBearer;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public endLocal(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 1

    .line 696
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_SIMPLY:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endLocal(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;)V

    return-void
.end method

.method public endLocal(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;)V
    .locals 2

    .line 713
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    .line 715
    invoke-static {p2}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->filterSpec(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    .line 716
    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->aboutToProcess(II)V

    .line 718
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endIndices:[I

    aget v0, v1, v0

    if-ltz v0, :cond_0

    return-void

    .line 729
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->checkForEmptyRange(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 733
    :cond_1
    invoke-direct {p0, p1, p3, p2}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->add(ILcom/google/dexmaker/dx/dex/code/LocalList$Disposition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    return-void
.end method

.method public finish()Lcom/google/dexmaker/dx/dex/code/LocalList;
    .locals 7

    const/4 v0, 0x0

    const v1, 0x7fffffff

    .line 906
    invoke-direct {p0, v1, v0}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->aboutToProcess(II)V

    .line 908
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->result:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 909
    iget v2, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->nullResultCount:I

    sub-int v2, v1, v2

    if-nez v2, :cond_0

    .line 912
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/LocalList;->EMPTY:Lcom/google/dexmaker/dx/dex/code/LocalList;

    return-object v0

    .line 923
    :cond_0
    new-array v3, v2, [Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    if-ne v1, v2, :cond_1

    .line 926
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->result:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    goto :goto_1

    .line 929
    :cond_1
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->result:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v4, v0

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    if-eqz v5, :cond_2

    add-int/lit8 v6, v4, 0x1

    .line 931
    aput-object v5, v3, v4

    move v4, v6

    goto :goto_0

    .line 936
    :cond_3
    :goto_1
    invoke-static {v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 938
    new-instance v1, Lcom/google/dexmaker/dx/dex/code/LocalList;

    invoke-direct {v1, v2}, Lcom/google/dexmaker/dx/dex/code/LocalList;-><init>(I)V

    :goto_2
    if-ge v0, v2, :cond_4

    .line 941
    aget-object v4, v3, v0

    invoke-virtual {v1, v0, v4}, Lcom/google/dexmaker/dx/dex/code/LocalList;->set(ILcom/google/dexmaker/dx/dex/code/LocalList$Entry;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 944
    :cond_4
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/LocalList;->setImmutable()V

    return-object v1
.end method

.method public snapshot(ILcom/google/dexmaker/dx/rop/code/RegisterSpecSet;)V
    .locals 5

    .line 541
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->getMaxSize()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    .line 542
    invoke-direct {p0, p1, v1}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->aboutToProcess(II)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    .line 545
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->regs:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    invoke-virtual {v2, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    .line 546
    invoke-virtual {p2, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    invoke-static {v3}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->filterSpec(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v3

    if-nez v2, :cond_0

    if-eqz v3, :cond_2

    .line 550
    invoke-virtual {p0, p1, v3}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->startLocal(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    goto :goto_1

    :cond_0
    if-nez v3, :cond_1

    .line 553
    invoke-virtual {p0, p1, v2}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endLocal(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    goto :goto_1

    .line 554
    :cond_1
    invoke-virtual {v3, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->equalsUsingSimpleType(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 555
    invoke-virtual {p0, p1, v2}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endLocal(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 556
    invoke-virtual {p0, p1, v3}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->startLocal(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public startLocal(ILcom/google/dexmaker/dx/rop/code/RegisterSpec;)V
    .locals 4

    .line 577
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getReg()I

    move-result v0

    .line 579
    invoke-static {p2}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->filterSpec(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p2

    .line 580
    invoke-direct {p0, p1, v0}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->aboutToProcess(II)V

    .line 582
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->regs:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    invoke-virtual {v1, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    .line 584
    invoke-virtual {p2, v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->equalsUsingSimpleType(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    .line 589
    :cond_0
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->regs:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    invoke-virtual {v2, p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->findMatchingLocal(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 595
    sget-object v3, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_MOVED:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    invoke-direct {p0, p1, v3, v2}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->addOrUpdateEnd(ILcom/google/dexmaker/dx/dex/code/LocalList$Disposition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 598
    :cond_1
    iget-object v2, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endIndices:[I

    aget v2, v2, v0

    if-eqz v1, :cond_2

    .line 605
    sget-object v2, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_REPLACED:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    invoke-direct {p0, p1, v2, v1}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->add(ILcom/google/dexmaker/dx/dex/code/LocalList$Disposition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    goto :goto_0

    :cond_2
    if-ltz v2, :cond_4

    .line 613
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->result:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    .line 614
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->getAddress()I

    move-result v3

    if-ne v3, p1, :cond_4

    .line 615
    invoke-virtual {v1, p2}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->matches(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 626
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->result:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {p1, v2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 627
    iget p1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->nullResultCount:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->nullResultCount:I

    .line 628
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->regs:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    invoke-virtual {p1, p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->put(Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 629
    iget-object p1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->endIndices:[I

    const/4 p2, -0x1

    aput p2, p1, v0

    return-void

    .line 638
    :cond_3
    sget-object v3, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_REPLACED:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    invoke-virtual {v1, v3}, Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;->withDisposition(Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;)Lcom/google/dexmaker/dx/dex/code/LocalList$Entry;

    move-result-object v1

    .line 640
    iget-object v3, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->result:Ljava/util/ArrayList;

    invoke-virtual {v3, v2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_0
    if-lez v0, :cond_5

    .line 656
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->regs:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 657
    invoke-virtual {v1}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->isCategory2()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 658
    sget-object v2, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_CLOBBERED_BY_NEXT:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    invoke-direct {p0, p1, v2, v1}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->addOrUpdateEnd(ILcom/google/dexmaker/dx/dex/code/LocalList$Disposition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 669
    :cond_5
    invoke-virtual {p2}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->isCategory2()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 670
    iget-object v1, p0, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->regs:Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpecSet;->get(I)Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 672
    sget-object v1, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->END_CLOBBERED_BY_PREV:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    invoke-direct {p0, p1, v1, v0}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->addOrUpdateEnd(ILcom/google/dexmaker/dx/dex/code/LocalList$Disposition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    .line 684
    :cond_6
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;->START:Lcom/google/dexmaker/dx/dex/code/LocalList$Disposition;

    invoke-direct {p0, p1, v0, p2}, Lcom/google/dexmaker/dx/dex/code/LocalList$MakeState;->add(ILcom/google/dexmaker/dx/dex/code/LocalList$Disposition;Lcom/google/dexmaker/dx/rop/code/RegisterSpec;)V

    return-void
.end method
