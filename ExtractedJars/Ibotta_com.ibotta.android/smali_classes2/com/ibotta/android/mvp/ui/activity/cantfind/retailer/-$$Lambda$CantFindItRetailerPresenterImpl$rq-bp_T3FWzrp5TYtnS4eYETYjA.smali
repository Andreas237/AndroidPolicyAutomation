.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$CantFindItRetailerPresenterImpl$rq-bp_T3FWzrp5TYtnS4eYETYjA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Predicate;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;

.field private final synthetic f$1:Lcom/ibotta/api/model/OfferModel;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$CantFindItRetailerPresenterImpl$rq-bp_T3FWzrp5TYtnS4eYETYjA;->f$0:Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$CantFindItRetailerPresenterImpl$rq-bp_T3FWzrp5TYtnS4eYETYjA;->f$1:Lcom/ibotta/api/model/OfferModel;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Predicate<",
            "-TT;>;)",
            "Ljava9/util/function/Predicate<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Predicate$-CC;->$default$and(Ljava9/util/function/Predicate;Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava9/util/function/Predicate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/function/Predicate<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0}, Ljava9/util/function/Predicate$-CC;->$default$negate(Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Predicate<",
            "-TT;>;)",
            "Ljava9/util/function/Predicate<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Predicate$-CC;->$default$or(Ljava9/util/function/Predicate;Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$CantFindItRetailerPresenterImpl$rq-bp_T3FWzrp5TYtnS4eYETYjA;->f$0:Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/-$$Lambda$CantFindItRetailerPresenterImpl$rq-bp_T3FWzrp5TYtnS4eYETYjA;->f$1:Lcom/ibotta/api/model/OfferModel;

    check-cast p1, Lcom/ibotta/api/model/RetailerModel;

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;->lambda$initRetailerRows$1(Lcom/ibotta/android/mvp/ui/activity/cantfind/retailer/CantFindItRetailerPresenterImpl;Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)Z

    move-result p1

    return p1
.end method
