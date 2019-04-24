.class public Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;
.super Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;
.source "RetailerCardRow.java"


# instance fields
.field private favorited:Z

.field private rebateCount:I

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;->RETAILER:Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/AbstractMyRetailersRow;-><init>(Lcom/ibotta/android/mvp/ui/view/retailer/grid/MyRetailersRowType;)V

    return-void
.end method


# virtual methods
.method public getRebateCount()I
    .locals 1

    .line 28
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->rebateCount:I

    return v0
.end method

.method public getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object v0
.end method

.method public isFavorited()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->favorited:Z

    return v0
.end method

.method public setFavorited(Z)V
    .locals 0

    .line 40
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->favorited:Z

    return-void
.end method

.method public setRebateCount(I)V
    .locals 0

    .line 32
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->rebateCount:I

    return-void
.end method

.method public setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/grid/row/RetailerCardRow;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-void
.end method
