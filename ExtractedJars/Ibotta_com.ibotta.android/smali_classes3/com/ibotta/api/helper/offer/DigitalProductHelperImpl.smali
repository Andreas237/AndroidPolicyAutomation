.class public Lcom/ibotta/api/helper/offer/DigitalProductHelperImpl;
.super Ljava/lang/Object;
.source "DigitalProductHelperImpl.java"

# interfaces
.implements Lcom/ibotta/api/helper/offer/DigitalProductHelper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected copyAndSort(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/DigitalProduct;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/DigitalProduct;",
            ">;"
        }
    .end annotation

    .line 51
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 52
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v0
.end method

.method public findForRetailer(Ljava/util/List;I)Lcom/ibotta/api/model/offer/DigitalProduct;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/DigitalProduct;",
            ">;I)",
            "Lcom/ibotta/api/model/offer/DigitalProduct;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 37
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/api/helper/offer/DigitalProductHelperImpl;->copyAndSort(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 40
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/offer/DigitalProduct;

    .line 41
    invoke-virtual {v1}, Lcom/ibotta/api/model/offer/DigitalProduct;->getRetailerId()I

    move-result v2

    if-ne v2, p2, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0
.end method

.method public findWithUri(Ljava/util/List;)Lcom/ibotta/api/model/offer/DigitalProduct;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/DigitalProduct;",
            ">;)",
            "Lcom/ibotta/api/model/offer/DigitalProduct;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 21
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/offer/DigitalProduct;

    .line 22
    invoke-virtual {v1}, Lcom/ibotta/api/model/offer/DigitalProduct;->getUri()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lcom/ibotta/api/model/offer/DigitalProduct;->getUri()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0
.end method
