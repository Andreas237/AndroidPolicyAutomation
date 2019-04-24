.class public Lcom/ibotta/android/collection/FavoriteRetailerModelComparator;
.super Ljava/lang/Object;
.source "FavoriteRetailerModelComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/api/model/RetailerModel;",
        ">;"
    }
.end annotation


# instance fields
.field private final favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/collection/FavoriteRetailerModelComparator;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/RetailerModel;)I
    .locals 3

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/collection/FavoriteRetailerModelComparator;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->isFavorited(I)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 23
    iget-object v1, p0, Lcom/ibotta/android/collection/FavoriteRetailerModelComparator;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v2

    invoke-interface {v1, v2}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->isFavorited(I)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->compareTo(Ljava/lang/Boolean;)I

    move-result v0

    const/4 v1, -0x1

    mul-int/lit8 v0, v0, -0x1

    if-eqz v0, :cond_0

    return v0

    .line 32
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/collection/FavoriteRetailerModelComparator;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-interface {v0}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->getFavoriteRetailerSettings()Ljava/util/Map;

    move-result-object v0

    .line 33
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    .line 34
    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;

    if-nez p1, :cond_1

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    if-nez p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    if-nez p2, :cond_3

    return v1

    .line 44
    :cond_3
    invoke-virtual {p1}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->getFavoritedDate()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p2}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->getFavoritedDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v0

    if-nez v0, :cond_4

    .line 47
    invoke-virtual {p1}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->getSortOrder()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2}, Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;->getSortOrder()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    :cond_4
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/api/model/RetailerModel;

    check-cast p2, Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/collection/FavoriteRetailerModelComparator;->compare(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/RetailerModel;)I

    move-result p1

    return p1
.end method
