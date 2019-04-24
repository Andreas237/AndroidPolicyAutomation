.class public Lcom/ibotta/api/call/retailer/RetailersPendingResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "RetailersPendingResponse.java"


# instance fields
.field private retailersPending:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/retailer/RetailerPending;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    .line 9
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/retailer/RetailersPendingResponse;->retailersPending:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 24
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 25
    instance-of v0, p1, Lcom/ibotta/api/call/retailer/RetailersPendingResponse;

    if-eqz v0, :cond_1

    .line 26
    check-cast p1, Lcom/ibotta/api/call/retailer/RetailersPendingResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/retailer/RetailersPendingResponse;->retailersPending:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/retailer/RetailersPendingResponse;->setRetailersPending(Ljava/util/HashMap;)V

    :cond_1
    return-void
.end method

.method public getRetailersPending()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/retailer/RetailerPending;",
            ">;"
        }
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/ibotta/api/call/retailer/RetailersPendingResponse;->retailersPending:Ljava/util/HashMap;

    return-object v0
.end method

.method public setRetailersPending(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/retailer/RetailerPending;",
            ">;)V"
        }
    .end annotation

    .line 16
    iput-object p1, p0, Lcom/ibotta/api/call/retailer/RetailersPendingResponse;->retailersPending:Ljava/util/HashMap;

    return-void
.end method
