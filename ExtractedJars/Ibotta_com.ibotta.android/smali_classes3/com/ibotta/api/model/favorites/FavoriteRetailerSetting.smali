.class public Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;
.super Ljava/lang/Object;
.source "FavoriteRetailerSetting.java"


# annotations
.annotation runtime Lcom/j256/ormlite/table/DatabaseTable;
    tableName = "favorite_retailer_settings"
.end annotation


# instance fields
.field attempts:S
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field favorited:Z
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field favoritedDate:Ljava/util/Date;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field id:I
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
        generatedId = true
    .end annotation
.end field

.field retailerId:I
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
        index = true
    .end annotation
.end field

.field sortOrder:I
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field

.field updatedAt:Ljava/util/Date;
    .annotation runtime Lcom/j256/ormlite/field/DatabaseField;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fromFavoriteRetailer(Lcom/ibotta/api/model/customer/FavoriteRetailer;)Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 97
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    invoke-direct {v0}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;-><init>()V

    .line 98
    invoke-virtual {p0}, Lcom/ibotta/api/model/customer/FavoriteRetailer;->getRetailerId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->setRetailerId(I)V

    .line 99
    invoke-virtual {p0}, Lcom/ibotta/api/model/customer/FavoriteRetailer;->isFavoritedState()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->setFavorited(Z)V

    .line 100
    invoke-virtual {p0}, Lcom/ibotta/api/model/customer/FavoriteRetailer;->getSortOrder()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->setSortOrder(I)V

    .line 101
    invoke-virtual {p0}, Lcom/ibotta/api/model/customer/FavoriteRetailer;->getFavoritedDate()Ljava/util/Date;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->setFavoritedDate(Ljava/util/Date;)V

    return-object v0
.end method


# virtual methods
.method public addAttempts(I)V
    .locals 1

    .line 81
    iget-short v0, p0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->attempts:S

    add-int/2addr v0, p1

    int-to-short p1, v0

    iput-short p1, p0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->attempts:S

    return-void
.end method

.method public getAttempts()S
    .locals 1

    .line 73
    iget-short v0, p0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->attempts:S

    return v0
.end method

.method public getFavoritedDate()Ljava/util/Date;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->favoritedDate:Ljava/util/Date;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->id:I

    return v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 41
    iget v0, p0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->retailerId:I

    return v0
.end method

.method public getSortOrder()I
    .locals 1

    .line 57
    iget v0, p0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->sortOrder:I

    return v0
.end method

.method public getUpdatedAt()Ljava/util/Date;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public isFavorited()Z
    .locals 1

    .line 49
    iget-boolean v0, p0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->favorited:Z

    return v0
.end method

.method public setAttempts(S)V
    .locals 0

    .line 77
    iput-short p1, p0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->attempts:S

    return-void
.end method

.method public setFavorited(Z)V
    .locals 0

    .line 53
    iput-boolean p1, p0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->favorited:Z

    return-void
.end method

.method public setFavoritedDate(Ljava/util/Date;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->favoritedDate:Ljava/util/Date;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 37
    iput p1, p0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->id:I

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 45
    iput p1, p0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->retailerId:I

    return-void
.end method

.method public setSortOrder(I)V
    .locals 0

    .line 61
    iput p1, p0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->sortOrder:I

    return-void
.end method

.method public setUpdatedAt(Ljava/util/Date;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->updatedAt:Ljava/util/Date;

    return-void
.end method
