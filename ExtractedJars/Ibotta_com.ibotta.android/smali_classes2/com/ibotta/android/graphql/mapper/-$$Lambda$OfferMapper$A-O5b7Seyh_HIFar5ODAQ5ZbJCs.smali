.class public final synthetic Lcom/ibotta/android/graphql/mapper/-$$Lambda$OfferMapper$A-O5b7Seyh_HIFar5ODAQ5ZbJCs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Function;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/graphql/mapper/OfferMapper;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/graphql/mapper/OfferMapper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/graphql/mapper/-$$Lambda$OfferMapper$A-O5b7Seyh_HIFar5ODAQ5ZbJCs;->f$0:Lcom/ibotta/android/graphql/mapper/OfferMapper;

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

    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/-$$Lambda$OfferMapper$A-O5b7Seyh_HIFar5ODAQ5ZbJCs;->f$0:Lcom/ibotta/android/graphql/mapper/OfferMapper;

    check-cast p1, Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group;

    invoke-static {v0, p1}, Lcom/ibotta/android/graphql/mapper/OfferMapper;->lambda$map$0(Lcom/ibotta/android/graphql/mapper/OfferMapper;Lcom/ibotta/android/graphql/fragment/OfferFragment$Product_group;)Lcom/ibotta/api/model/offer/ProductGroup;

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
