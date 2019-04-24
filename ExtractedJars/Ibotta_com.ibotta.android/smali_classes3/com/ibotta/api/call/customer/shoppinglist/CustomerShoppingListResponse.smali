.class public Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "CustomerShoppingListResponse.java"


# instance fields
.field private items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerShoppingListItem;",
            ">;"
        }
    .end annotation
.end field

.field private updatedAt:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 37
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 38
    instance-of v0, p1, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;

    if-eqz v0, :cond_1

    .line 39
    check-cast p1, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;->updatedAt:Ljava/util/Date;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;->setUpdatedAt(Ljava/util/Date;)V

    .line 40
    iget-object v0, p0, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;->items:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;->setItems(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerShoppingListItem;",
            ">;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public getUpdatedAt()Ljava/util/Date;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public setItems(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerShoppingListItem;",
            ">;)V"
        }
    .end annotation

    .line 29
    iput-object p1, p0, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;->items:Ljava/util/List;

    return-void
.end method

.method public setUpdatedAt(Ljava/util/Date;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/ibotta/api/call/customer/shoppinglist/CustomerShoppingListResponse;->updatedAt:Ljava/util/Date;

    return-void
.end method
