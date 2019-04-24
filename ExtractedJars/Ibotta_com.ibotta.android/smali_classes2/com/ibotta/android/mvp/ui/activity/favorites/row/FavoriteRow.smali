.class public Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;
.super Ljava/lang/Object;
.source "FavoriteRow.java"


# instance fields
.field private category:Lcom/ibotta/api/model/retailer/Category;

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/retailer/Category;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 17
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;->category:Lcom/ibotta/api/model/retailer/Category;

    return-void
.end method


# virtual methods
.method public getCategory()Lcom/ibotta/api/model/retailer/Category;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;->category:Lcom/ibotta/api/model/retailer/Category;

    return-object v0
.end method

.method public getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object v0
.end method

.method public setCategory(Lcom/ibotta/api/model/retailer/Category;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;->category:Lcom/ibotta/api/model/retailer/Category;

    return-void
.end method

.method public setRetailerModel(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/favorites/row/FavoriteRow;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-void
.end method
