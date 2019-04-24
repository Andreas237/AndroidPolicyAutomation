.class public final synthetic Lcom/ibotta/android/graphql/bonus/-$$Lambda$BonusesGraphQLCall$t4I1kWanp1pcAv7sP5XJtQrSaFQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Function;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/graphql/bonus/-$$Lambda$BonusesGraphQLCall$t4I1kWanp1pcAv7sP5XJtQrSaFQ;->f$0:Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;

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

    iget-object v0, p0, Lcom/ibotta/android/graphql/bonus/-$$Lambda$BonusesGraphQLCall$t4I1kWanp1pcAv7sP5XJtQrSaFQ;->f$0:Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;

    check-cast p1, Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse;

    invoke-static {v0, p1}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;->lambda$mapResponse$1(Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;Lcom/ibotta/android/graphql/BonusesGraphQLQuery$CompletedBonuse;)Lcom/ibotta/api/model/BonusModel;

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
