.class public Lcom/ibotta/android/mvp/ui/view/personalize/GridSpacingItemDecoration;
.super Landroid/support/v7/widget/RecyclerView$ItemDecoration;
.source "GridSpacingItemDecoration.java"


# instance fields
.field private spacing:I

.field private spanCount:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 15
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 16
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/GridSpacingItemDecoration;->spanCount:I

    .line 17
    iput p2, p0, Lcom/ibotta/android/mvp/ui/view/personalize/GridSpacingItemDecoration;->spacing:I

    return-void
.end method

.method private getDistanceFromFirstSmallRebateInPack(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;I)I
    .locals 5

    move v0, p2

    move v1, v0

    :goto_0
    if-ltz v0, :cond_1

    .line 58
    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->values()[Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    move-result-object v2

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;->getType()I

    move-result v3

    aget-object v2, v2, v3

    .line 59
    sget-object v3, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->STORE:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v0, -0x1

    move v4, v1

    move v1, v0

    move v0, v4

    goto :goto_0

    :cond_1
    :goto_1
    sub-int/2addr p2, v1

    return p2
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 4

    .line 22
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v0

    .line 24
    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;

    .line 26
    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->values()[Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    move-result-object v2

    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/view/personalize/row/AbstractPersonalStoreRow;->getType()I

    move-result v3

    aget-object v2, v2, v3

    .line 29
    sget-object v3, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->TITLE:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    if-eq v2, v3, :cond_0

    .line 30
    invoke-direct {p0, v1, v0}, Lcom/ibotta/android/mvp/ui/view/personalize/GridSpacingItemDecoration;->getDistanceFromFirstSmallRebateInPack(Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoresAdapter;I)I

    move-result v0

    .line 31
    iget v1, p0, Lcom/ibotta/android/mvp/ui/view/personalize/GridSpacingItemDecoration;->spanCount:I

    rem-int/2addr v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 34
    :goto_0
    sget-object v1, Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;->TITLE:Lcom/ibotta/android/mvp/ui/view/personalize/PersonalStoreRowType;

    if-ne v2, v1, :cond_1

    .line 35
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;->getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V

    goto :goto_3

    :cond_1
    if-nez v0, :cond_2

    .line 38
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/personalize/GridSpacingItemDecoration;->spacing:I

    iput p2, p1, Landroid/graphics/Rect;->left:I

    goto :goto_1

    .line 40
    :cond_2
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/personalize/GridSpacingItemDecoration;->spacing:I

    div-int/lit8 p2, p2, 0x2

    iput p2, p1, Landroid/graphics/Rect;->left:I

    .line 43
    :goto_1
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/personalize/GridSpacingItemDecoration;->spanCount:I

    add-int/lit8 p2, p2, -0x1

    if-ne v0, p2, :cond_3

    .line 44
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/personalize/GridSpacingItemDecoration;->spacing:I

    iput p2, p1, Landroid/graphics/Rect;->right:I

    goto :goto_2

    .line 46
    :cond_3
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/personalize/GridSpacingItemDecoration;->spacing:I

    div-int/lit8 p2, p2, 0x2

    iput p2, p1, Landroid/graphics/Rect;->right:I

    .line 49
    :goto_2
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/personalize/GridSpacingItemDecoration;->spacing:I

    iput p2, p1, Landroid/graphics/Rect;->top:I

    .line 50
    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    :goto_3
    return-void
.end method
