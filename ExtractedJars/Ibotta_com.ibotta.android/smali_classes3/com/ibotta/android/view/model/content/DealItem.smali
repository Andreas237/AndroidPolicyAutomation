.class public Lcom/ibotta/android/view/model/content/DealItem;
.super Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;
.source "DealItem.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem<",
        "Lcom/ibotta/api/model/DealModel;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/DealModel;)V
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
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/DealItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/DealModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/DealModel;->getIdString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setDealId(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic copy()Lcom/ibotta/android/view/model/content/AbstractContentItem;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/DealItem;->copy()Lcom/ibotta/android/view/model/content/DealItem;

    move-result-object v0

    return-object v0
.end method

.method public copy()Lcom/ibotta/android/view/model/content/DealItem;
    .locals 2

    .line 20
    new-instance v0, Lcom/ibotta/android/view/model/content/DealItem;

    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/DealItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/DealModel;

    invoke-direct {v0, v1}, Lcom/ibotta/android/view/model/content/DealItem;-><init>(Lcom/ibotta/api/model/DealModel;)V

    .line 21
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/model/content/DealItem;->copyContent(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    .line 22
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/DealItem;->getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/model/content/DealItem;->setOfferCategoryModel(Lcom/ibotta/api/model/OfferCategoryModel;)V

    return-object v0
.end method
