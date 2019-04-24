.class public final synthetic Lcom/ibotta/android/braze/-$$Lambda$BrazeTrackingDataFactoryImpl$Cm0k14_QwNsT00ROilT5sQdvWjE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Function;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;

.field private final synthetic f$1:Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/braze/-$$Lambda$BrazeTrackingDataFactoryImpl$Cm0k14_QwNsT00ROilT5sQdvWjE;->f$0:Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;

    iput-object p2, p0, Lcom/ibotta/android/braze/-$$Lambda$BrazeTrackingDataFactoryImpl$Cm0k14_QwNsT00ROilT5sQdvWjE;->f$1:Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;

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

    iget-object v0, p0, Lcom/ibotta/android/braze/-$$Lambda$BrazeTrackingDataFactoryImpl$Cm0k14_QwNsT00ROilT5sQdvWjE;->f$0:Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;

    iget-object v1, p0, Lcom/ibotta/android/braze/-$$Lambda$BrazeTrackingDataFactoryImpl$Cm0k14_QwNsT00ROilT5sQdvWjE;->f$1:Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;->lambda$createBonusTrackingData$0(Lcom/ibotta/android/braze/BrazeTrackingDataFactoryImpl;Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;Ljava/lang/Integer;)Lcom/ibotta/api/model/BonusModel;

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
