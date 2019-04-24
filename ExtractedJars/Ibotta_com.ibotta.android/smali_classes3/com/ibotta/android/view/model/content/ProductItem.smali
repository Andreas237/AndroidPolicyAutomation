.class public Lcom/ibotta/android/view/model/content/ProductItem;
.super Lcom/ibotta/android/view/model/content/AbstractContentItem;
.source "ProductItem.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/view/model/content/AbstractContentItem<",
        "Lcom/ibotta/api/model/ProductModel;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/ProductModel;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/model/content/AbstractContentItem;-><init>(Lcom/ibotta/api/model/ContentModel;)V

    return-void
.end method


# virtual methods
.method public contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V
    .locals 1

    .line 17
    invoke-super {p0, p1}, Lcom/ibotta/android/view/model/content/AbstractContentItem;->contributeTo(Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;)V

    .line 18
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/ProductItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/ProductModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/ProductModel;->getIdString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/proprietary/event/AbstractEvent;->setProductId(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic copy()Lcom/ibotta/android/view/model/content/AbstractContentItem;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/ProductItem;->copy()Lcom/ibotta/android/view/model/content/ProductItem;

    move-result-object v0

    return-object v0
.end method

.method public copy()Lcom/ibotta/android/view/model/content/ProductItem;
    .locals 2

    .line 23
    new-instance v0, Lcom/ibotta/android/view/model/content/ProductItem;

    invoke-virtual {p0}, Lcom/ibotta/android/view/model/content/ProductItem;->getContentModel()Lcom/ibotta/api/model/ContentModel;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/ProductModel;

    invoke-direct {v0, v1}, Lcom/ibotta/android/view/model/content/ProductItem;-><init>(Lcom/ibotta/api/model/ProductModel;)V

    .line 24
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/model/content/ProductItem;->copyContent(Lcom/ibotta/android/view/model/content/AbstractContentItem;)V

    return-object v0
.end method
