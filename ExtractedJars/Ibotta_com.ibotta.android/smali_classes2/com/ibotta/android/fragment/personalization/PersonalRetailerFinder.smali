.class public interface abstract Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinder;
.super Ljava/lang/Object;
.source "PersonalRetailerFinder.java"


# virtual methods
.method public abstract findPersonalRetailerModels()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end method

.method public abstract setFavoriteRetailersManager(Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)V
.end method

.method public abstract setRetailerModels(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation
.end method
