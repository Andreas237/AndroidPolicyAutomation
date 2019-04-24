.class public abstract Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "BuyableGiftCardsGraphQlResponse.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    return-void
.end method

.method public static create(Ljava/util/List;)Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;)",
            "Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlResponse;"
        }
    .end annotation

    .line 15
    new-instance v0, Lcom/ibotta/android/graphql/buyablegiftcard/AutoValue_BuyableGiftCardsGraphQlResponse;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/buyablegiftcard/AutoValue_BuyableGiftCardsGraphQlResponse;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public abstract getBuyableGiftCardModels()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BuyableGiftCardModel;",
            ">;"
        }
    .end annotation
.end method
