.class public Lcom/ibotta/android/mvp/ui/view/retailer/grid/GridSpacingItemDecoration;
.super Landroid/support/v7/widget/RecyclerView$ItemDecoration;
.source "GridSpacingItemDecoration.java"


# instance fields
.field private final spacing:I

.field private final spanCount:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 18
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 19
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/GridSpacingItemDecoration;->spanCount:I

    .line 20
    iput p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/GridSpacingItemDecoration;->spacing:I

    return-void
.end method

.method private getDistanceFromFirstRetailerInPack(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;I)I
    .locals 5

    move v0, p2

    move v1, v0

    :goto_0
    if-ltz v0, :cond_1

    .line 63
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;

    move-result-object v2

    .line 64
    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;->values()[Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;

    move-result-object v3

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;->getType()I

    move-result v2

    aget-object v2, v3, v2

    .line 66
    sget-object v3, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;->RETAILER:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;

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
    .locals 2

    .line 25
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result p4

    .line 27
    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;

    .line 29
    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;->values()[Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;

    move-result-object v0

    invoke-virtual {p3, p4}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;->getType()I

    move-result v1

    aget-object v0, v0, v1

    .line 31
    sget-object v1, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;->RETAILER:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;

    if-ne v0, v1, :cond_0

    .line 32
    invoke-direct {p0, p3, p4}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/GridSpacingItemDecoration;->getDistanceFromFirstRetailerInPack(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersAdapter;I)I

    move-result p3

    .line 33
    iget p4, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/GridSpacingItemDecoration;->spanCount:I

    rem-int/2addr p3, p4

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 38
    :goto_0
    sget-object p4, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;->RETAILER:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;

    if-eq v0, p4, :cond_1

    .line 40
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f070190

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p1, Landroid/graphics/Rect;->top:I

    goto :goto_3

    :cond_1
    if-nez p3, :cond_2

    .line 43
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/GridSpacingItemDecoration;->spacing:I

    iput p2, p1, Landroid/graphics/Rect;->left:I

    goto :goto_1

    .line 45
    :cond_2
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/GridSpacingItemDecoration;->spacing:I

    div-int/lit8 p2, p2, 0x2

    iput p2, p1, Landroid/graphics/Rect;->left:I

    .line 48
    :goto_1
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/GridSpacingItemDecoration;->spanCount:I

    add-int/lit8 p2, p2, -0x1

    if-ne p3, p2, :cond_3

    .line 49
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/GridSpacingItemDecoration;->spacing:I

    iput p2, p1, Landroid/graphics/Rect;->right:I

    goto :goto_2

    .line 51
    :cond_3
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/GridSpacingItemDecoration;->spacing:I

    div-int/lit8 p2, p2, 0x2

    iput p2, p1, Landroid/graphics/Rect;->right:I

    .line 54
    :goto_2
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/GridSpacingItemDecoration;->spacing:I

    iput p2, p1, Landroid/graphics/Rect;->top:I

    .line 55
    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    :goto_3
    return-void
.end method
