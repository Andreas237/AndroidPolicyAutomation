.class public Lcom/ibotta/api/model/customer/FavoriteRetailer;
.super Ljava/lang/Object;
.source "FavoriteRetailer.java"


# instance fields
.field private favoritedDate:Ljava/util/Date;

.field private favoritedState:Z

.field private id:I

.field private retailerId:I

.field private sortOrder:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getFavoritedDate()Ljava/util/Date;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/model/customer/FavoriteRetailer;->favoritedDate:Ljava/util/Date;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/ibotta/api/model/customer/FavoriteRetailer;->id:I

    return v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 24
    iget v0, p0, Lcom/ibotta/api/model/customer/FavoriteRetailer;->retailerId:I

    return v0
.end method

.method public getSortOrder()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/ibotta/api/model/customer/FavoriteRetailer;->sortOrder:I

    return v0
.end method

.method public isFavoritedState()Z
    .locals 1

    .line 32
    iget-boolean v0, p0, Lcom/ibotta/api/model/customer/FavoriteRetailer;->favoritedState:Z

    return v0
.end method

.method public setFavoritedDate(Ljava/util/Date;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/api/model/customer/FavoriteRetailer;->favoritedDate:Ljava/util/Date;

    return-void
.end method

.method public setFavoritedState(Z)V
    .locals 0

    .line 36
    iput-boolean p1, p0, Lcom/ibotta/api/model/customer/FavoriteRetailer;->favoritedState:Z

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 20
    iput p1, p0, Lcom/ibotta/api/model/customer/FavoriteRetailer;->id:I

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 28
    iput p1, p0, Lcom/ibotta/api/model/customer/FavoriteRetailer;->retailerId:I

    return-void
.end method

.method public setSortOrder(I)V
    .locals 0

    .line 44
    iput p1, p0, Lcom/ibotta/api/model/customer/FavoriteRetailer;->sortOrder:I

    return-void
.end method
