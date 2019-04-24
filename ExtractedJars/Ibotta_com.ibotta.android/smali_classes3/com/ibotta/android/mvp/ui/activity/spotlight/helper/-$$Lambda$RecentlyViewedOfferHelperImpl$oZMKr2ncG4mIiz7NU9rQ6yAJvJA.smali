.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$RecentlyViewedOfferHelperImpl$oZMKr2ncG4mIiz7NU9rQ6yAJvJA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Function;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;

.field private final synthetic f$1:Lcom/ibotta/api/model/RetailerModel;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;Lcom/ibotta/api/model/RetailerModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$RecentlyViewedOfferHelperImpl$oZMKr2ncG4mIiz7NU9rQ6yAJvJA;->f$0:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$RecentlyViewedOfferHelperImpl$oZMKr2ncG4mIiz7NU9rQ6yAJvJA;->f$1:Lcom/ibotta/api/model/RetailerModel;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava9/util/function/Function;)Ljava9/util/function/Function;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TR;+TV;>;)",
            "Ljava9/util/function/Function<",
            "TT;TV;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Function$-CC;->$default$andThen(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$RecentlyViewedOfferHelperImpl$oZMKr2ncG4mIiz7NU9rQ6yAJvJA;->f$0:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$RecentlyViewedOfferHelperImpl$oZMKr2ncG4mIiz7NU9rQ6yAJvJA;->f$1:Lcom/ibotta/api/model/RetailerModel;

    check-cast p1, Lcom/ibotta/api/model/OfferModel;

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;->lambda$getRecentlyViewedOffers$1(Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/RecentlyViewedOfferHelperImpl;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/content/OfferDisplayContent;

    move-result-object p1

    return-object p1
.end method

.method public synthetic compose(Ljava9/util/function/Function;)Ljava9/util/function/Function;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TV;+TT;>;)",
            "Ljava9/util/function/Function<",
            "TV;TR;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Function$-CC;->$default$compose(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/Function;

    move-result-object p1

    return-object p1
.end method
