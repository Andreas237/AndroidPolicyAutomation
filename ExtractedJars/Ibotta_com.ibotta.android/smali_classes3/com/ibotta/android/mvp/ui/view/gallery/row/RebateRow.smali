.class public Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;
.super Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;
.source "RebateRow.java"


# instance fields
.field private index:I

.field private offerItem:Lcom/ibotta/android/view/model/content/OfferItem;

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;->REBATE_ROW:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/row/AbstractGalleryRow;-><init>(Lcom/ibotta/android/mvp/ui/view/gallery/GalleryRowType;)V

    return-void
.end method


# virtual methods
.method public getIndex()I
    .locals 1

    .line 37
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;->index:I

    return v0
.end method

.method public getOfferItem()Lcom/ibotta/android/view/model/content/OfferItem;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;->offerItem:Lcom/ibotta/android/view/model/content/OfferItem;

    return-object v0
.end method

.method public getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object v0
.end method

.method public setIndex(I)V
    .locals 0

    .line 41
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;->index:I

    return-void
.end method

.method public setOfferItem(Lcom/ibotta/android/view/model/content/OfferItem;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;->offerItem:Lcom/ibotta/android/view/model/content/OfferItem;

    return-void
.end method

.method public setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/row/RebateRow;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-void
.end method
