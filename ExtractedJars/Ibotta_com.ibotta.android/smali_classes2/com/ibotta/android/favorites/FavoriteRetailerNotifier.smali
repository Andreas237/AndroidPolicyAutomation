.class public Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;
.super Ljava/lang/Object;
.source "FavoriteRetailerNotifier.java"


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private favoriteRetailerListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/favorites/FavoriteRetailerListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;->favoriteRetailerListeners:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addListener(Lcom/ibotta/android/favorites/FavoriteRetailerListener;)V
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;->favoriteRetailerListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public notifyFavoriteRetailerChanged(ZI)V
    .locals 2

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;->favoriteRetailerListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/favorites/FavoriteRetailerListener;

    .line 25
    invoke-interface {v1, p1, p2}, Lcom/ibotta/android/favorites/FavoriteRetailerListener;->onFavoriteRetailerChanged(ZI)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public removeListener(Lcom/ibotta/android/favorites/FavoriteRetailerListener;)V
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/favorites/FavoriteRetailerNotifier;->favoriteRetailerListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method
