.class public final synthetic Lcom/ibotta/android/graphql/offer/offersbycategories/-$$Lambda$MobileOffersByCategoriesGraphQLCall$qqIl-P4A5tGmTlRZcfW7rSDK-Fc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Function;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/-$$Lambda$MobileOffersByCategoriesGraphQLCall$qqIl-P4A5tGmTlRZcfW7rSDK-Fc;->f$0:Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;

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
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/graphql/offer/offersbycategories/-$$Lambda$MobileOffersByCategoriesGraphQLCall$qqIl-P4A5tGmTlRZcfW7rSDK-Fc;->f$0:Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;

    check-cast p1, Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$MobileOfferCategory;

    invoke-static {v0, p1}, Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;->lambda$mapResponse$0(Lcom/ibotta/android/graphql/offer/offersbycategories/MobileOffersByCategoriesGraphQLCall;Lcom/ibotta/android/graphql/MobileOffersByCategoryGraphQLQuery$MobileOfferCategory;)Lcom/ibotta/api/model/content/OfferCategoryContent;

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
