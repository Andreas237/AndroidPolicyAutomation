.class public abstract Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;
.super Lcom/ibotta/android/view/model/content/AbstractContentItem;
.source "AbstractOfferCategoryItem.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<C::",
        "Lcom/ibotta/api/model/ContentModel;",
        ">",
        "Lcom/ibotta/android/view/model/content/AbstractContentItem<",
        "TC;>;"
    }
.end annotation


# instance fields
.field private offerCategoryModel:Lcom/ibotta/api/model/OfferCategoryModel;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/ContentModel;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;)V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1}, Lcom/ibotta/android/view/model/content/AbstractContentItem;-><init>(Lcom/ibotta/api/model/ContentModel;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V
    .locals 0
    .param p2    # Lcom/ibotta/android/tracking/proprietary/event/EventChain;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TC;",
            "Lcom/ibotta/android/tracking/proprietary/event/EventChain;",
            ")V"
        }
    .end annotation

    .line 17
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/view/model/content/AbstractContentItem;-><init>(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/android/tracking/proprietary/event/EventChain;)V

    return-void
.end method


# virtual methods
.method public getOfferCategoryModel()Lcom/ibotta/api/model/OfferCategoryModel;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->offerCategoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    return-object v0
.end method

.method public setOfferCategoryModel(Lcom/ibotta/api/model/OfferCategoryModel;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/view/model/content/AbstractOfferCategoryItem;->offerCategoryModel:Lcom/ibotta/api/model/OfferCategoryModel;

    return-void
.end method
