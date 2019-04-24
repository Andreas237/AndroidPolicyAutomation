.class public Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;
.super Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;
.source "BuyableGiftCardGraphQlResponse.java"


# instance fields
.field private buyableGiftCardContent:Lcom/ibotta/api/model/content/BuyableGiftCardContent;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getBuyableGiftCard()Lcom/ibotta/api/model/content/BuyableGiftCardContent;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;->buyableGiftCardContent:Lcom/ibotta/api/model/content/BuyableGiftCardContent;

    return-object v0
.end method

.method public setBuyableGiftCardContent(Lcom/ibotta/api/model/content/BuyableGiftCardContent;)V
    .locals 0
    .param p1    # Lcom/ibotta/api/model/content/BuyableGiftCardContent;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardGraphQlResponse;->buyableGiftCardContent:Lcom/ibotta/api/model/content/BuyableGiftCardContent;

    return-void
.end method
