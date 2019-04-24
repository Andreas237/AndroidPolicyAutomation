.class Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;
.super Ljava/lang/Object;
.source "FirstFitLocalCombiningAllocator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Multiset"
.end annotation


# instance fields
.field private final count:[I

.field private final reg:[I

.field private size:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1081
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1082
    new-array v0, p1, [I

    iput-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->reg:[I

    .line 1083
    new-array p1, p1, [I

    iput-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->count:[I

    const/4 p1, 0x0

    .line 1084
    iput p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->size:I

    return-void
.end method


# virtual methods
.method public add(I)V
    .locals 3

    const/4 v0, 0x0

    .line 1093
    :goto_0
    iget v1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->size:I

    const/4 v2, 0x1

    if-ge v0, v1, :cond_1

    .line 1094
    iget-object v1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->reg:[I

    aget v1, v1, v0

    if-ne v1, p1, :cond_0

    .line 1095
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->count:[I

    aget v1, p1, v0

    add-int/2addr v1, v2

    aput v1, p1, v0

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1100
    :cond_1
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->reg:[I

    aput p1, v0, v1

    .line 1101
    iget-object p1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->count:[I

    aput v2, p1, v1

    add-int/2addr v1, v2

    .line 1102
    iput v1, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->size:I

    return-void
.end method

.method public getAndRemoveHighestCount()I
    .locals 7

    const/4 v0, -0x1

    const/4 v1, 0x0

    move v2, v0

    move v3, v2

    move v0, v1

    move v4, v0

    .line 1118
    :goto_0
    iget v5, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->size:I

    if-ge v0, v5, :cond_1

    .line 1119
    iget-object v5, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->count:[I

    aget v6, v5, v0

    if-ge v4, v6, :cond_0

    .line 1121
    iget-object v2, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->reg:[I

    aget v2, v2, v0

    .line 1122
    aget v3, v5, v0

    move v4, v3

    move v3, v2

    move v2, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1126
    :cond_1
    iget-object v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->count:[I

    aput v1, v0, v2

    return v3
.end method

.method public getSize()I
    .locals 1

    .line 1136
    iget v0, p0, Lcom/google/dexmaker/dx/ssa/back/FirstFitLocalCombiningAllocator$Multiset;->size:I

    return v0
.end method
