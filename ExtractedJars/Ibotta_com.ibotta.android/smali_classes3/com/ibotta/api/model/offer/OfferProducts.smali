.class public Lcom/ibotta/api/model/offer/OfferProducts;
.super Ljava/lang/Object;
.source "OfferProducts.java"


# instance fields
.field private productGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/ProductGroup;",
            ">;"
        }
    .end annotation
.end field

.field private products:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/OfferProducts;->products:Ljava/util/Set;

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/OfferProducts;->productGroups:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getProductGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/ProductGroup;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/ibotta/api/model/offer/OfferProducts;->productGroups:Ljava/util/List;

    return-object v0
.end method

.method public getProducts()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/ibotta/api/model/offer/OfferProducts;->products:Ljava/util/Set;

    return-object v0
.end method

.method public setProductGroups(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/ProductGroup;",
            ">;)V"
        }
    .end annotation

    .line 28
    iput-object p1, p0, Lcom/ibotta/api/model/offer/OfferProducts;->productGroups:Ljava/util/List;

    return-void
.end method

.method public setProducts(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 20
    iput-object p1, p0, Lcom/ibotta/api/model/offer/OfferProducts;->products:Ljava/util/Set;

    return-void
.end method
