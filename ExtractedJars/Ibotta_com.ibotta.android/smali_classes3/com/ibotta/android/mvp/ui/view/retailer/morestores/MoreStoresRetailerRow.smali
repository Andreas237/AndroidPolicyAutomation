.class public Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;
.super Ljava/lang/Object;
.source "MoreStoresRetailerRow.java"


# instance fields
.field private addedCount:I

.field private category:Lcom/ibotta/api/model/retailer/Category;

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAddedCount()I
    .locals 1

    .line 32
    iget v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;->addedCount:I

    return v0
.end method

.method public getCategory()Lcom/ibotta/api/model/retailer/Category;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;->category:Lcom/ibotta/api/model/retailer/Category;

    return-object v0
.end method

.method public getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object v0
.end method

.method public setAddedCount(I)V
    .locals 0

    .line 36
    iput p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;->addedCount:I

    return-void
.end method

.method public setCategory(Lcom/ibotta/api/model/retailer/Category;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;->category:Lcom/ibotta/api/model/retailer/Category;

    return-void
.end method

.method public setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailerRow;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-void
.end method
