.class public Lcom/ibotta/api/call/home/HomeResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "HomeResponse.java"


# instance fields
.field private categories:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;"
        }
    .end annotation
.end field

.field private retailers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Retailer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/home/HomeResponse;->categories:Ljava/util/List;

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/home/HomeResponse;->retailers:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 43
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 45
    instance-of v0, p1, Lcom/ibotta/api/call/home/HomeResponse;

    if-eqz v0, :cond_1

    .line 46
    check-cast p1, Lcom/ibotta/api/call/home/HomeResponse;

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/call/home/HomeResponse;->categories:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/home/HomeResponse;->setCategories(Ljava/util/List;)V

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/call/home/HomeResponse;->retailers:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/home/HomeResponse;->setRetailers(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public getCategories()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/ibotta/api/call/home/HomeResponse;->categories:Ljava/util/List;

    return-object v0
.end method

.method public getRetailers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Retailer;",
            ">;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/ibotta/api/call/home/HomeResponse;->retailers:Ljava/util/List;

    return-object v0
.end method

.method public getRetailersAsModels()Ljava/util/List;
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ibotta/api/call/home/HomeResponse;->retailers:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public setCategories(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Category;",
            ">;)V"
        }
    .end annotation

    .line 21
    iput-object p1, p0, Lcom/ibotta/api/call/home/HomeResponse;->categories:Ljava/util/List;

    return-void
.end method

.method public setRetailers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/retailer/Retailer;",
            ">;)V"
        }
    .end annotation

    .line 34
    iput-object p1, p0, Lcom/ibotta/api/call/home/HomeResponse;->retailers:Ljava/util/List;

    return-void
.end method
