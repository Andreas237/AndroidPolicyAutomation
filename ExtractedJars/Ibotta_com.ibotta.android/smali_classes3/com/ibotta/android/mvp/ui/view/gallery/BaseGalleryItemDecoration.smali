.class public abstract Lcom/ibotta/android/mvp/ui/view/gallery/BaseGalleryItemDecoration;
.super Landroid/support/v7/widget/RecyclerView$ItemDecoration;
.source "BaseGalleryItemDecoration.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getDistanceFromFirstSmallRebateInPack(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;I)I
    .locals 6

    move v0, p2

    move v1, v0

    :goto_0
    if-ltz v0, :cond_2

    .line 16
    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;->getItem(I)Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;

    move-result-object v2

    .line 17
    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;->getTypeEnum()Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    move-result-object v3

    sget-object v4, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->OFFER_CARD:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    if-eq v3, v4, :cond_0

    goto :goto_1

    .line 21
    :cond_0
    check-cast v2, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;

    .line 22
    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/view/gallery/row/OfferCard;->getOfferCategoryItem()Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->getStyle()Lcom/ibotta/android/views/content/ContentStyle;

    move-result-object v2

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

.method public initColumn(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;ILcom/ibotta/android/views/content/ContentStyle;I)I
    .locals 1

    .line 33
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne p3, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 36
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/BaseGalleryItemDecoration;->getDistanceFromFirstSmallRebateInPack(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryAdapter;I)I

    move-result p1

    rem-int/2addr p1, p4

    return p1
.end method
