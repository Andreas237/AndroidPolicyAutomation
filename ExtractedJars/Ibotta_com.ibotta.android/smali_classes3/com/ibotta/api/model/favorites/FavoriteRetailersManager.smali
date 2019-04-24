.class public interface abstract Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;
.super Ljava/lang/Object;
.source "FavoriteRetailersManager.java"


# virtual methods
.method public abstract deleteAllRecords()V
.end method

.method public abstract favorite(I)V
.end method

.method public abstract getFavoriteRetailerIds()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getFavoriteRetailerSettings()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailerSetting;",
            ">;"
        }
    .end annotation
.end method

.method public abstract isFavorited(I)Z
.end method

.method public abstract load()V
.end method

.method public abstract setRetailersFromServer(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract unfavorite(I)V
.end method
