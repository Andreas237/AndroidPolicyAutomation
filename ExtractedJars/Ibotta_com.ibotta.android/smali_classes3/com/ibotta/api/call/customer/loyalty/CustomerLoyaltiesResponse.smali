.class public Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "CustomerLoyaltiesResponse.java"


# instance fields
.field private customerLoyalties:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerLoyalty;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesResponse;->customerLoyalties:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 25
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 26
    instance-of v0, p1, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesResponse;

    if-eqz v0, :cond_1

    .line 27
    check-cast p1, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesResponse;->customerLoyalties:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesResponse;->setCustomerLoyalties(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public getCustomerLoyalties()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerLoyalty;",
            ">;"
        }
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesResponse;->customerLoyalties:Ljava/util/List;

    return-object v0
.end method

.method public setCustomerLoyalties(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/customer/CustomerLoyalty;",
            ">;)V"
        }
    .end annotation

    .line 17
    iput-object p1, p0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesResponse;->customerLoyalties:Ljava/util/List;

    return-void
.end method
