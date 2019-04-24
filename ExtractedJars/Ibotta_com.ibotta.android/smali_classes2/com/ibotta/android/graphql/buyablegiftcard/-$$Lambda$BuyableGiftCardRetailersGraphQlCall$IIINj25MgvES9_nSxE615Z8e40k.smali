.class public final synthetic Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$BuyableGiftCardRetailersGraphQlCall$IIINj25MgvES9_nSxE615Z8e40k;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Function;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$BuyableGiftCardRetailersGraphQlCall$IIINj25MgvES9_nSxE615Z8e40k;->f$0:Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;

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

    iget-object v0, p0, Lcom/ibotta/android/graphql/buyablegiftcard/-$$Lambda$BuyableGiftCardRetailersGraphQlCall$IIINj25MgvES9_nSxE615Z8e40k;->f$0:Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;

    check-cast p1, Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$BuyableGiftCard;

    invoke-static {v0, p1}, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;->lambda$mapResponse$0(Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlCall;Lcom/ibotta/android/graphql/BuyableGiftCardRetailersQuery$BuyableGiftCard;)Ljava/lang/Integer;

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
