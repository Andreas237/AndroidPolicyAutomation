.class public Lcom/ibotta/api/call/store/StoresResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "StoresResponse.java"


# instance fields
.field private retailers:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "retailers"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/store/Retailer;",
            ">;"
        }
    .end annotation
.end field

.field private stores:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/store/Store;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/store/StoresResponse;->retailers:Ljava/util/List;

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/store/StoresResponse;->stores:Ljava/util/List;

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
    instance-of v0, p1, Lcom/ibotta/api/call/store/StoresResponse;

    if-eqz v0, :cond_1

    .line 39
    check-cast p1, Lcom/ibotta/api/call/store/StoresResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresResponse;->retailers:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/store/StoresResponse;->setRetailers(Ljava/util/List;)V

    .line 40
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresResponse;->stores:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/store/StoresResponse;->setStores(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public getRetailers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/store/Retailer;",
            ">;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresResponse;->retailers:Ljava/util/List;

    return-object v0
.end method

.method public getStores()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/store/Store;",
            ">;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/ibotta/api/call/store/StoresResponse;->stores:Ljava/util/List;

    return-object v0
.end method

.method public setRetailers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/store/Retailer;",
            ">;)V"
        }
    .end annotation

    .line 21
    iput-object p1, p0, Lcom/ibotta/api/call/store/StoresResponse;->retailers:Ljava/util/List;

    return-void
.end method

.method public setStores(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/store/Store;",
            ">;)V"
        }
    .end annotation

    .line 29
    iput-object p1, p0, Lcom/ibotta/api/call/store/StoresResponse;->stores:Ljava/util/List;

    return-void
.end method
