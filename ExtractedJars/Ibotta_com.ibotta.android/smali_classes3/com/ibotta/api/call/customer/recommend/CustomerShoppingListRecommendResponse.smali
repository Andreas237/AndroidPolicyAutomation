.class public Lcom/ibotta/api/call/customer/recommend/CustomerShoppingListRecommendResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "CustomerShoppingListRecommendResponse.java"


# instance fields
.field private offers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/customer/CustomerShoppingListRecommend;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/customer/recommend/CustomerShoppingListRecommendResponse;->offers:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getOffers()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/customer/CustomerShoppingListRecommend;",
            ">;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/ibotta/api/call/customer/recommend/CustomerShoppingListRecommendResponse;->offers:Ljava/util/Map;

    return-object v0
.end method

.method public setOffers(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/customer/CustomerShoppingListRecommend;",
            ">;)V"
        }
    .end annotation

    .line 18
    iput-object p1, p0, Lcom/ibotta/api/call/customer/recommend/CustomerShoppingListRecommendResponse;->offers:Ljava/util/Map;

    return-void
.end method
