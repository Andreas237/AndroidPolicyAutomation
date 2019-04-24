.class public Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;
.super Lcom/ibotta/android/mvp/ui/view/gallery/BaseGalleryItemDecoration;
.source "NewGalleryItemDecoration.java"


# instance fields
.field private final spacing:I

.field private final spanCount:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseGalleryItemDecoration;-><init>()V

    .line 19
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;->spanCount:I

    .line 20
    iput p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;->spacing:I

    return-void
.end method

.method private initBottomSpacing(Landroid/graphics/Rect;)V
    .locals 2

    .line 60
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;->spacing:I

    div-int/lit8 v1, v0, 0x2

    add-int/2addr v0, v1

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    return-void
.end method

.method private initGridRLSpacing(Landroid/graphics/Rect;I)V
    .locals 3

    .line 64
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;->spacing:I

    mul-int v1, p2, v0

    iget v2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;->spanCount:I

    div-int/2addr v1, v2

    sub-int v1, v0, v1

    iput v1, p1, Landroid/graphics/Rect;->left:I

    add-int/lit8 p2, p2, 0x1

    mul-int p2, p2, v0

    .line 65
    div-int/2addr p2, v2

    iput p2, p1, Landroid/graphics/Rect;->right:I

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 7

    .line 25
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v0

    .line 27
    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v1

    instance-of v1, v1, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;

    if-eqz v1, :cond_3

    .line 28
    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;

    .line 29
    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    move-result-object v2

    .line 30
    sget-object v3, Lcom/ibotta/android/views/content/ContentStyle;->MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

    const/4 v4, 0x0

    .line 33
    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;

    move-result-object v5

    invoke-virtual {v5}, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    move-result-object v5

    sget-object v6, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->OFFER_CARD:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    if-ne v5, v6, :cond_0

    .line 34
    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    .line 35
    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v3

    .line 36
    iget v4, p0, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;->spanCount:I

    invoke-virtual {p0, v1, v0, v3, v4}, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;->initColumn(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;ILcom/ibotta/android/views/content/ContentStyle;I)I

    move-result v4

    .line 39
    :cond_0
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->OFFER_CARD:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    if-eq v2, v0, :cond_1

    .line 41
    invoke-super {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseGalleryItemDecoration;->getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V

    .line 42
    sget-object p2, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->BANNERS:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    if-ne v2, p2, :cond_4

    .line 43
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;->initBottomSpacing(Landroid/graphics/Rect;)V

    goto :goto_0

    .line 45
    :cond_1
    sget-object p2, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne v3, p2, :cond_2

    .line 46
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;->spacing:I

    iput p2, p1, Landroid/graphics/Rect;->left:I

    .line 47
    iput p2, p1, Landroid/graphics/Rect;->right:I

    .line 48
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;->initBottomSpacing(Landroid/graphics/Rect;)V

    goto :goto_0

    .line 50
    :cond_2
    invoke-direct {p0, p1, v4}, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;->initGridRLSpacing(Landroid/graphics/Rect;I)V

    .line 51
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;->initBottomSpacing(Landroid/graphics/Rect;)V

    goto :goto_0

    .line 54
    :cond_3
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;->spanCount:I

    rem-int/2addr v0, p2

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;->initGridRLSpacing(Landroid/graphics/Rect;I)V

    .line 55
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/NewGalleryItemDecoration;->initBottomSpacing(Landroid/graphics/Rect;)V

    :cond_4
    :goto_0
    return-void
.end method
