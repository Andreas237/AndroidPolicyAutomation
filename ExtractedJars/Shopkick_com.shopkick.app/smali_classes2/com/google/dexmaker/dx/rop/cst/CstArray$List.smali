.class public final Lcom/google/dexmaker/dx/rop/cst/CstArray$List;
.super Lcom/google/dexmaker/dx/util/FixedSizeList;
.source "CstArray.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/dexmaker/dx/rop/cst/CstArray;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "List"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/dexmaker/dx/util/FixedSizeList;",
        "Ljava/lang/Comparable<",
        "Lcom/google/dexmaker/dx/rop/cst/CstArray$List;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 110
    invoke-direct {p0, p1}, Lcom/google/dexmaker/dx/util/FixedSizeList;-><init>(I)V

    return-void
.end method


# virtual methods
.method public compareTo(Lcom/google/dexmaker/dx/rop/cst/CstArray$List;)I
    .locals 7

    .line 115
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstArray$List;->size()I

    move-result v0

    .line 116
    invoke-virtual {p1}, Lcom/google/dexmaker/dx/rop/cst/CstArray$List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const/4 v3, 0x0

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_2

    .line 120
    invoke-virtual {p0, v4}, Lcom/google/dexmaker/dx/rop/cst/CstArray$List;->get0(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/dexmaker/dx/rop/cst/Constant;

    .line 121
    invoke-virtual {p1, v4}, Lcom/google/dexmaker/dx/rop/cst/CstArray$List;->get0(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/dexmaker/dx/rop/cst/Constant;

    .line 122
    invoke-virtual {v5, v6}, Lcom/google/dexmaker/dx/rop/cst/Constant;->compareTo(Lcom/google/dexmaker/dx/rop/cst/Constant;)I

    move-result v5

    if-eqz v5, :cond_1

    return v5

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    if-ge v0, v1, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    if-le v0, v1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    return v3
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 101
    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/CstArray$List;

    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/rop/cst/CstArray$List;->compareTo(Lcom/google/dexmaker/dx/rop/cst/CstArray$List;)I

    move-result p1

    return p1
.end method

.method public get(I)Lcom/google/dexmaker/dx/rop/cst/Constant;
    .locals 0

    .line 146
    invoke-virtual {p0, p1}, Lcom/google/dexmaker/dx/rop/cst/CstArray$List;->get0(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/dexmaker/dx/rop/cst/Constant;

    return-object p1
.end method

.method public set(ILcom/google/dexmaker/dx/rop/cst/Constant;)V
    .locals 0

    .line 156
    invoke-virtual {p0, p1, p2}, Lcom/google/dexmaker/dx/rop/cst/CstArray$List;->set0(ILjava/lang/Object;)V

    return-void
.end method
