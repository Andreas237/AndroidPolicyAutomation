.class public Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "BuyableGiftCardRetailersGraphQlResponse.java"


# instance fields
.field private buyableGiftCardRetailerIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    .line 12
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlResponse;->buyableGiftCardRetailerIds:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public getBuyableGiftCardRetailerIds()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlResponse;->buyableGiftCardRetailerIds:Ljava/util/Set;

    return-object v0
.end method

.method public setBuyableGiftCardRetailerIds(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardRetailersGraphQlResponse;->buyableGiftCardRetailerIds:Ljava/util/Set;

    return-void
.end method
