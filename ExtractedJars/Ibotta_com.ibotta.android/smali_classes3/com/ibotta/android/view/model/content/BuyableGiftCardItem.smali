.class public Lcom/ibotta/android/view/model/content/BuyableGiftCardItem;
.super Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;
.source "BuyableGiftCardItem.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem<",
        "Lcom/ibotta/api/model/BuyableGiftCardModel;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/BuyableGiftCardModel;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;-><init>(Lcom/ibotta/api/model/ContentModel;)V

    return-void
.end method


# virtual methods
.method public contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 14
    invoke-super {p0, p1}, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 15
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/BuyableGiftCardItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/BuyableGiftCardModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getIdString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setDealId(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic copy()Lcom/ibotta/android/view/model/content/AbstractContentItem;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/BuyableGiftCardItem;->copy()Lcom/ibotta/android/view/model/content/BuyableGiftCardItem;

    move-result-object v0

    return-object v0
.end method

.method public copy()Lcom/ibotta/android/view/model/content/BuyableGiftCardItem;
    .locals 2

    .line 20
    new-instance v0, Lcom/ibotta/android/view/model/content/BuyableGiftCardItem;

    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/BuyableGiftCardItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/BuyableGiftCardModel;

    invoke-direct {v0, v1}, Lcom/ibotta/android/view/model/content/BuyableGiftCardItem;-><init>(Lcom/ibotta/api/model/BuyableGiftCardModel;)V

    .line 21
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/model/content/BuyableGiftCardItem;->copyContent(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    .line 22
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/BuyableGiftCardItem;->getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/model/content/BuyableGiftCardItem;->setOfferCategoryModel(Lcom/ibotta/api/model/OfferCategoryModel;)V

    return-object v0
.end method
