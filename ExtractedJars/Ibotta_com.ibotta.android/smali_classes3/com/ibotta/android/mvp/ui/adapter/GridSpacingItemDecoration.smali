.class public Lcom/ibotta/android/mvp/ui/adapter/GridSpacingItemDecoration;
.super Landroid/support/v7/widget/RecyclerView$ItemDecoration;
.source "GridSpacingItemDecoration.java"


# instance fields
.field private final gridSize:I

.field private final hasEdgePadding:Z

.field private final sizeResId:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    const/4 v0, 0x1

    .line 18
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/adapter/GridSpacingItemDecoration;-><init>(IIZ)V

    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 0

    .line 21
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 22
    iput p1, p0, Lcom/ibotta/android/mvp/ui/adapter/GridSpacingItemDecoration;->gridSize:I

    .line 23
    iput p2, p0, Lcom/ibotta/android/mvp/ui/adapter/GridSpacingItemDecoration;->sizeResId:I

    .line 24
    iput-boolean p3, p0, Lcom/ibotta/android/mvp/ui/adapter/GridSpacingItemDecoration;->hasEdgePadding:Z

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 2
    .param p1    # Landroid/graphics/Rect;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p3    # Landroid/support/v7/widget/RecyclerView;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p4    # Landroid/support/v7/widget/RecyclerView$State;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 33
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result p3

    .line 34
    iget p4, p0, Lcom/ibotta/android/mvp/ui/adapter/GridSpacingItemDecoration;->gridSize:I

    rem-int p4, p3, p4

    .line 36
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    iget v0, p0, Lcom/ibotta/android/mvp/ui/adapter/GridSpacingItemDecoration;->sizeResId:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    .line 40
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/adapter/GridSpacingItemDecoration;->hasEdgePadding:Z

    if-eqz v0, :cond_1

    mul-int v0, p4, p2

    .line 48
    iget v1, p0, Lcom/ibotta/android/mvp/ui/adapter/GridSpacingItemDecoration;->gridSize:I

    div-int/2addr v0, v1

    sub-int v0, p2, v0

    iput v0, p1, Landroid/graphics/Rect;->left:I

    add-int/lit8 p4, p4, 0x1

    mul-int p4, p4, p2

    .line 49
    div-int/2addr p4, v1

    iput p4, p1, Landroid/graphics/Rect;->right:I

    if-ge p3, v1, :cond_0

    .line 53
    iput p2, p1, Landroid/graphics/Rect;->top:I

    .line 57
    :cond_0
    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    :cond_1
    mul-int v0, p4, p2

    .line 65
    iget v1, p0, Lcom/ibotta/android/mvp/ui/adapter/GridSpacingItemDecoration;->gridSize:I

    div-int/2addr v0, v1

    iput v0, p1, Landroid/graphics/Rect;->left:I

    add-int/lit8 p4, p4, 0x1

    mul-int p4, p4, p2

    .line 66
    div-int/2addr p4, v1

    sub-int p4, p2, p4

    iput p4, p1, Landroid/graphics/Rect;->right:I

    if-lt p3, v1, :cond_2

    .line 70
    iput p2, p1, Landroid/graphics/Rect;->top:I

    :cond_2
    :goto_0
    return-void
.end method
