.class public Lcom/ibotta/android/view/model/content/OfferItem;
.super Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;
.source "OfferItem.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem<",
        "Lcom/ibotta/api/model/OfferModel;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;-><init>(Lcom/ibotta/api/model/ContentModel;)V

    return-void
.end method


# virtual methods
.method public contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 18
    invoke-super {p0, p1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 19
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/OfferItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setOfferId(Ljava/lang/Integer;)V

    .line 20
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/OfferItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getOfferSegmentId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setOfferSegmentId(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic copy()Lcom/ibotta/android/view/model/content/AbstractContentItem;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/OfferItem;->copy()Lcom/ibotta/android/view/model/content/OfferItem;

    move-result-object v0

    return-object v0
.end method

.method public copy()Lcom/ibotta/android/view/model/content/OfferItem;
    .locals 2

    .line 25
    new-instance v0, Lcom/ibotta/android/view/model/content/OfferItem;

    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/OfferItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    invoke-direct {v0, v1}, Lcom/ibotta/android/view/model/content/OfferItem;-><init>(Lcom/ibotta/api/model/OfferModel;)V

    .line 26
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/model/content/OfferItem;->copyContent(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    .line 27
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/OfferItem;->getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/model/content/OfferItem;->setOfferCategoryModel(Lcom/ibotta/api/model/OfferCategoryModel;)V

    return-object v0
.end method
