.class public interface abstract Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersService;
.super Ljava/lang/Object;
.source "RecentlyViewedRetailersService.java"


# virtual methods
.method public abstract cancel()V
.end method

.method public abstract loadRecentlyViewedRetailers(Ljava9/util/function/Consumer;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;>;)V"
        }
    .end annotation
.end method

.method public abstract markRetailerAsViewed(I)V
.end method
