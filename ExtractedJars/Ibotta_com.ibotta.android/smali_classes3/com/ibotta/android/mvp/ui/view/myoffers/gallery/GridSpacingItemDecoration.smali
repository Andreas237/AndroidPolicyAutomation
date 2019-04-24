.class public Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;
.super Landroid/support/v7/widget/RecyclerView$ItemDecoration;
.source "GridSpacingItemDecoration.java"


# instance fields
.field private final cardSpacing:I

.field private final spanCount:I


# direct methods
.method constructor <init>(II)V
    .locals 0

    .line 35
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 36
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->spanCount:I

    .line 37
    iput p2, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->cardSpacing:I

    return-void
.end method

.method private getDistanceFromFirstSmallRebateInPack(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;I)I
    .locals 6

    move v0, p2

    move v1, v0

    :goto_0
    if-ltz v0, :cond_2

    .line 91
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;

    move-result-object v2

    .line 92
    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    move-result-object v3

    sget-object v4, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->OFFER_CARD:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    if-eq v3, v4, :cond_0

    goto :goto_1

    .line 96
    :cond_0
    check-cast v2, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v2

    .line 97
    sget-object v3, Lcom/ibotta/android/views/content/ContentStyle;->MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v0, -0x1

    move v5, v1

    move v1, v0

    move v0, v5

    goto :goto_0

    :cond_2
    :goto_1
    sub-int/2addr p2, v1

    return p2
.end method

.method private getGetCardPosition(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;II)Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 124
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->isTitleRow(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;I)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 125
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->isItemInRowBeforeTitleRow(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;II)Z

    move-result p1

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 127
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private getListOfCardPositionsThatRequireNoBottomSpacing(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;I)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;",
            "I)",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 117
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->getItemCount()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava9/util/stream/IntStream$-CC;->range(II)Ljava9/util/stream/IntStream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/-$$Lambda$GridSpacingItemDecoration$5f_7SEvwqSpMUSpux85muxtP32Y;

    invoke-direct {v1, p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/-$$Lambda$GridSpacingItemDecoration$5f_7SEvwqSpMUSpux85muxtP32Y;-><init>(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;I)V

    .line 118
    invoke-interface {v0, v1}, Ljava9/util/stream/IntStream;->mapToObj(Ljava9/util/function/IntFunction;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object p2, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/-$$Lambda$40FTAvwaPRsev8W3OjFGmlR96gA;->INSTANCE:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/-$$Lambda$40FTAvwaPRsev8W3OjFGmlR96gA;

    .line 119
    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 120
    invoke-static {}, Ljava9/util/stream/Collectors;->toSet()Ljava9/util/stream/Collector;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    return-object p1
.end method

.method private initBottomSpacing(Landroid/graphics/Rect;)V
    .locals 2

    .line 108
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->cardSpacing:I

    div-int/lit8 v1, v0, 0x2

    add-int/2addr v0, v1

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    return-void
.end method

.method private initColumn(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;ILcom/ibotta/android/views/content/ContentStyle;I)I
    .locals 1

    .line 80
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne p3, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 83
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->getDistanceFromFirstSmallRebateInPack(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;I)I

    move-result p1

    rem-int/2addr p1, p4

    return p1
.end method

.method private initGridRLSpacing(Landroid/graphics/Rect;I)V
    .locals 3

    .line 112
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->cardSpacing:I

    mul-int v1, p2, v0

    iget v2, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->spanCount:I

    div-int/2addr v1, v2

    sub-int v1, v0, v1

    iput v1, p1, Landroid/graphics/Rect;->left:I

    add-int/lit8 p2, p2, 0x1

    mul-int p2, p2, v0

    .line 113
    div-int/2addr p2, v2

    iput p2, p1, Landroid/graphics/Rect;->right:I

    return-void
.end method

.method private isItemInRowBeforeTitleRow(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;II)Z
    .locals 3

    add-int/lit8 v0, p2, 0x1

    .line 139
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->getItemCount()I

    move-result v1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_1

    .line 140
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->isTitleRow(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;I)Z

    move-result v0

    add-int/lit8 p2, p2, 0x2

    .line 142
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->getItemCount()I

    move-result v1

    if-ge p2, v1, :cond_0

    if-nez p3, :cond_0

    .line 143
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->isTitleRow(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;I)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    if-eqz p1, :cond_3

    :cond_2
    const/4 v2, 0x1

    :cond_3
    return v2
.end method

.method private isTitleRow(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;I)Z
    .locals 0

    .line 131
    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 132
    instance-of p1, p1, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/TitleBarRow;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static synthetic lambda$getListOfCardPositionsThatRequireNoBottomSpacing$0(Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;II)Ljava/lang/Integer;
    .locals 0

    .line 118
    invoke-direct {p0, p1, p3, p2}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->getGetCardPosition(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;II)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method private setCardSpacing(Landroid/graphics/Rect;Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;II)V
    .locals 1

    .line 69
    invoke-direct {p0, p2, p4}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->getListOfCardPositionsThatRequireNoBottomSpacing(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;I)Ljava/util/Set;

    move-result-object v0

    .line 71
    invoke-direct {p0, p2, p3}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->isTitleRow(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;I)Z

    move-result p2

    if-nez p2, :cond_0

    .line 72
    invoke-direct {p0, p1, p4}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->initGridRLSpacing(Landroid/graphics/Rect;I)V

    .line 73
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 74
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->initBottomSpacing(Landroid/graphics/Rect;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 3

    .line 42
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result p2

    .line 44
    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object p4

    instance-of p4, p4, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

    if-eqz p4, :cond_2

    .line 45
    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView;->getAdapter()Landroid/support/v7/widget/RecyclerView$Adapter;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;

    .line 46
    sget-object p4, Lcom/ibotta/android/views/content/ContentStyle;->MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

    const/4 v0, 0x0

    .line 49
    invoke-virtual {p3, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->OFFER_CARD:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    if-ne v1, v2, :cond_0

    .line 50
    invoke-virtual {p3, p2}, Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/AbstractOfferRow;

    move-result-object p4

    .line 51
    check-cast p4, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;

    invoke-virtual {p4}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/row/OfferRow;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object p4

    invoke-virtual {p4}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object p4

    .line 52
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->spanCount:I

    invoke-direct {p0, p3, p2, p4, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->initColumn(Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;ILcom/ibotta/android/views/content/ContentStyle;I)I

    move-result v0

    .line 55
    :cond_0
    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne p4, v1, :cond_1

    .line 56
    iget p2, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->cardSpacing:I

    iput p2, p1, Landroid/graphics/Rect;->left:I

    .line 57
    iput p2, p1, Landroid/graphics/Rect;->right:I

    .line 58
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->initBottomSpacing(Landroid/graphics/Rect;)V

    goto :goto_0

    .line 60
    :cond_1
    invoke-direct {p0, p1, p3, p2, v0}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->setCardSpacing(Landroid/graphics/Rect;Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryAdapter;II)V

    goto :goto_0

    .line 63
    :cond_2
    iget p3, p0, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->spanCount:I

    rem-int/2addr p2, p3

    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->initGridRLSpacing(Landroid/graphics/Rect;I)V

    .line 64
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/GridSpacingItemDecoration;->initBottomSpacing(Landroid/graphics/Rect;)V

    :goto_0
    return-void
.end method
