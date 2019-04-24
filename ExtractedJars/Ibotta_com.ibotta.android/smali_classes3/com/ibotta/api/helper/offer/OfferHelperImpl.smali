.class public Lcom/ibotta/api/helper/offer/OfferHelperImpl;
.super Ljava/lang/Object;
.source "OfferHelperImpl.java"

# interfaces
.implements Lcom/ibotta/api/helper/offer/OfferHelper;


# instance fields
.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private final taskHelper:Lcom/ibotta/api/helper/offer/TaskHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/TaskHelper;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 35
    iput-object p2, p0, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->taskHelper:Lcom/ibotta/api/helper/offer/TaskHelper;

    return-void
.end method

.method private isAvailableAt(Ljava/util/Set;I)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;I)Z"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 259
    new-instance p1, Ljava/util/HashSet;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/HashSet;-><init>(I)V

    .line 262
    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method static synthetic lambda$isLocationPermissionRequiredForEngagement$0(Lcom/ibotta/api/model/RewardModel;)Z
    .locals 1

    .line 343
    invoke-interface {p0}, Lcom/ibotta/api/model/RewardModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object p0

    sget-object v0, Lcom/ibotta/api/model/TaskModel$Type;->STORE_LOCATOR:Lcom/ibotta/api/model/TaskModel$Type;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public containsOfferOfType(Ljava/util/List;Lcom/ibotta/api/model/offer/OfferType;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;",
            "Lcom/ibotta/api/model/offer/OfferType;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 295
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 296
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getOfferTypeEnum()Lcom/ibotta/api/model/offer/OfferType;

    move-result-object v1

    if-ne v1, p2, :cond_1

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method protected createDefaultCategoriesList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Category;",
            ">;"
        }
    .end annotation

    .line 347
    new-instance v0, Lcom/ibotta/api/model/offer/Category;

    invoke-direct {v0}, Lcom/ibotta/api/model/offer/Category;-><init>()V

    const-string v1, "NONE"

    .line 348
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/offer/Category;->setName(Ljava/lang/String;)V

    .line 350
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 351
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method public findActive(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 159
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    return-object v0

    .line 164
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 165
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isActivated()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 166
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public findActiveByRetailer(Ljava/util/List;I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;I)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 125
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    return-object v0

    .line 130
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 131
    invoke-virtual {p0, v1, p2}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->isAvailableAt(Lcom/ibotta/api/model/OfferModel;I)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 132
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isActivated()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 133
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public findActiveByRetailerCategorized(Ljava/util/List;IZ)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;IZ)",
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/offer/Category;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;"
        }
    .end annotation

    .line 175
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->findActiveByRetailer(Ljava/util/List;I)Ljava/util/List;

    move-result-object p1

    .line 176
    invoke-virtual {p0, p1, p3}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->findCategorized(Ljava/util/List;Z)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public findActiveCategorized(Ljava/util/List;Z)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;Z)",
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/offer/Category;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;"
        }
    .end annotation

    .line 187
    invoke-virtual {p0, p1}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->findActive(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 188
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->findCategorized(Ljava/util/List;Z)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public findByRetailer(Ljava/util/List;I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;I)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 109
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    return-object v0

    .line 114
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 115
    invoke-virtual {p0, v1, p2}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->isAvailableAt(Lcom/ibotta/api/model/OfferModel;I)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 116
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public findByRetailer(Ljava/util/List;Lcom/ibotta/api/model/RetailerModel;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;",
            "Lcom/ibotta/api/model/RetailerModel;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 104
    :cond_0
    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->findByRetailer(Ljava/util/List;I)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 101
    :cond_1
    :goto_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method public findByRetailerCategorized(Ljava/util/List;IZ)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;IZ)",
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/offer/Category;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;"
        }
    .end annotation

    .line 181
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->findByRetailer(Ljava/util/List;I)Ljava/util/List;

    move-result-object p1

    .line 182
    invoke-virtual {p0, p1, p3}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->findCategorized(Ljava/util/List;Z)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public findCategorized(Ljava/util/List;Z)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;Z)",
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/offer/Category;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;"
        }
    .end annotation

    .line 193
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 194
    invoke-virtual {p0}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->createDefaultCategoriesList()Ljava/util/List;

    move-result-object v1

    .line 197
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/OfferModel;

    .line 198
    invoke-virtual {p0, v2, v1, p2}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->getOfferCategories(Lcom/ibotta/api/model/OfferModel;Ljava/util/List;Z)Ljava/util/List;

    move-result-object v3

    .line 200
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/api/model/offer/Category;

    .line 201
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-nez v5, :cond_1

    .line 203
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 204
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    :cond_1
    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method protected findGroupedOffers(Ljava/util/List;Ljava/util/List;Ljava/util/Comparator;IZ)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/util/Comparator<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;IZ)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 385
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    return-object v0

    .line 390
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 391
    invoke-static {v1, p3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 393
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/api/model/OfferModel;

    .line 394
    invoke-virtual {p0, p5, p3}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->isFindNearbyValid(ZLcom/ibotta/api/model/OfferModel;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 395
    invoke-virtual {p0, p2, p3}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->isWithinReachAndAvailableAt(Ljava/util/List;Lcom/ibotta/api/model/OfferModel;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 396
    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    if-nez v1, :cond_3

    .line 398
    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 401
    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p3

    if-lt p3, p4, :cond_1

    :cond_4
    return-object v0
.end method

.method public findHotOffersInStore(Ljava/util/List;Ljava/util/List;IZ)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;IZ)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 268
    new-instance v3, Lcom/ibotta/api/model/offer/HotOfferComparator;

    const/4 v0, 0x0

    invoke-direct {v3, v0, p0}, Lcom/ibotta/api/model/offer/HotOfferComparator;-><init>(Ljava/lang/Integer;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->findGroupedOffers(Ljava/util/List;Ljava/util/List;Ljava/util/Comparator;IZ)Ljava/util/List;

    move-result-object p1

    .line 269
    invoke-virtual {p0, p1}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->removeNotHot(Ljava/util/List;)V

    return-object p1
.end method

.method public findInactiveByRetailer(Ljava/util/List;I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;I)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 142
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    return-object v0

    .line 147
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 148
    invoke-virtual {p0, v1, p2}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->isAvailableAt(Lcom/ibotta/api/model/OfferModel;I)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 149
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isActivated()Z

    move-result v2

    if-nez v2, :cond_1

    .line 150
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public findIndexByOfferId(Ljava/util/List;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;I)I"
        }
    .end annotation

    const/4 v0, -0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    .line 88
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 89
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v2

    if-ne v2, p2, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v0
.end method

.method public findOfferById(Ljava/util/List;I)Lcom/ibotta/api/model/OfferModel;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;I)",
            "Lcom/ibotta/api/model/OfferModel;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 50
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 51
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v2

    if-ne v2, p2, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0
.end method

.method public findOffersByIds(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    if-nez p2, :cond_1

    return-object v0

    .line 70
    :cond_1
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 71
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->findOfferById(Ljava/util/List;I)Lcom/ibotta/api/model/OfferModel;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 73
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public findUniqueOffers(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 559
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    return-object v0

    .line 564
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 565
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/OfferModel;

    .line 566
    invoke-interface {v2}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 569
    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public getBestCategory(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/api/model/offer/Category;
    .locals 1

    .line 455
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getCategories()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getCategories()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 460
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getCategories()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 461
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    const/4 p1, 0x0

    .line 463
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/offer/Category;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getBestCategory(Lcom/ibotta/api/model/OfferModel;Ljava/util/Set;)Lcom/ibotta/api/model/offer/Category;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/OfferModel;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/ibotta/api/model/offer/Category;"
        }
    .end annotation

    .line 468
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getCategories()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getCategories()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 473
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getCategories()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 474
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    if-eqz p2, :cond_2

    .line 478
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 479
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/offer/Category;

    .line 480
    invoke-virtual {v2}, Lcom/ibotta/api/model/offer/Category;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v1, v2

    :cond_2
    if-nez v1, :cond_3

    const/4 p1, 0x0

    .line 488
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/ibotta/api/model/offer/Category;

    :cond_3
    return-object v1

    :cond_4
    :goto_0
    return-object v1
.end method

.method public getButtonId(Lcom/ibotta/api/model/OfferModel;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    .line 554
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getButtonInfo()Lcom/ibotta/api/model/retailer/ButtonInfo;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getButtonInfo()Lcom/ibotta/api/model/retailer/ButtonInfo;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/ibotta/api/model/retailer/ButtonInfo;->getButtonId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method protected getHighestWeightCategoryAsList(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Category;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Category;",
            ">;"
        }
    .end annotation

    .line 356
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-object p1

    .line 360
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 361
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 363
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 364
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method protected getOfferCategories(Lcom/ibotta/api/model/OfferModel;Ljava/util/List;Z)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/OfferModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Category;",
            ">;Z)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Category;",
            ">;"
        }
    .end annotation

    .line 215
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getCategories()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 216
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move-object p1, p2

    :cond_1
    if-eqz p3, :cond_2

    .line 223
    invoke-virtual {p0, p1}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->getHighestWeightCategoryAsList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :cond_2
    return-object p1
.end method

.method public getOfferSortDataForRetailer(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-eqz p2, :cond_3

    .line 330
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getContextSortData()Lcom/ibotta/api/model/offer/ContextSortData;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 331
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getContextSortData()Lcom/ibotta/api/model/offer/ContextSortData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/offer/ContextSortData;->getRetailer()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 335
    :cond_1
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getContextSortData()Lcom/ibotta/api/model/offer/ContextSortData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/offer/ContextSortData;->getRetailer()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_2

    goto :goto_0

    .line 337
    :cond_2
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getSortOrder()Ljava/lang/String;

    move-result-object p2

    :goto_0
    return-object p2

    .line 332
    :cond_3
    :goto_1
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getSortOrder()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected getRetailerHelper()Lcom/ibotta/api/helper/retailer/RetailerHelper;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    return-object v0
.end method

.method public getUnlockedTotal(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)F
    .locals 2

    .line 497
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isActivated()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_0

    .line 498
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->isAvailableAt(Lcom/ibotta/api/model/OfferModel;I)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 499
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->isPercentBackType(Lcom/ibotta/api/model/OfferModel;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_1

    .line 501
    :cond_1
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getRewards()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getRewards()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    .line 502
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getRewards()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/api/model/RewardModel;

    .line 503
    invoke-interface {p2}, Lcom/ibotta/api/model/RewardModel;->getAmount()F

    move-result p2

    add-float/2addr v1, p2

    goto :goto_0

    :cond_2
    :goto_1
    return v1
.end method

.method public isAtLeastOneOfferUnlocked(Ljava/util/List;I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;I)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 237
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 238
    invoke-virtual {p0, v1, p2}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->isAvailableAt(Lcom/ibotta/api/model/OfferModel;I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isActivated()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public isAvailableAt(Lcom/ibotta/api/model/OfferModel;I)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 253
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getRetailers()Ljava/util/Set;

    move-result-object p1

    .line 254
    invoke-direct {p0, p1, p2}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->isAvailableAt(Ljava/util/Set;I)Z

    move-result p1

    return p1
.end method

.method public isDefaultOfferType(Lcom/ibotta/api/model/OfferModel;)Z
    .locals 1

    .line 513
    sget-object v0, Lcom/ibotta/api/model/offer/OfferType;->DEFAULT:Lcom/ibotta/api/model/offer/OfferType;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getOfferTypeEnum()Lcom/ibotta/api/model/offer/OfferType;

    move-result-object p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isExpired(Lcom/ibotta/api/model/OfferModel;)Z
    .locals 6

    .line 540
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getExpiration()Ljava/util/Date;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 541
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 542
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getExpiration()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    cmp-long p1, v4, v2

    if-gez p1, :cond_0

    const/4 p1, 0x1

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method protected isFindNearbyValid(ZLcom/ibotta/api/model/OfferModel;)Z
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    .line 418
    :cond_0
    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getRetailers()Ljava/util/Set;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getRetailers()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0

    :cond_2
    :goto_0
    return v0
.end method

.method public isHeroOfferType(Lcom/ibotta/api/model/OfferModel;)Z
    .locals 1

    .line 518
    sget-object v0, Lcom/ibotta/api/model/offer/OfferType;->HERO:Lcom/ibotta/api/model/offer/OfferType;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getOfferTypeEnum()Lcom/ibotta/api/model/offer/OfferType;

    move-result-object p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isLocationPermissionRequiredForEngagement(Lcom/ibotta/api/model/OfferModel;)Z
    .locals 1

    .line 342
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getRewards()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/api/helper/offer/-$$Lambda$OfferHelperImpl$1ptvKg-L35OerPmCTT_XAC7jlNk;->INSTANCE:Lcom/ibotta/api/helper/offer/-$$Lambda$OfferHelperImpl$1ptvKg-L35OerPmCTT_XAC7jlNk;

    .line 343
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->anyMatch(Ljava9/util/function/Predicate;)Z

    move-result p1

    return p1
.end method

.method public isPercentBackOfferPresent(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    .line 313
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 314
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {p0, v2}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->isPercentBackType(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v0
.end method

.method public isPercentBackType(Lcom/ibotta/api/model/OfferModel;)Z
    .locals 1

    .line 450
    invoke-virtual {p0, p1}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->isVariablePercentBack(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->isSinglePercentBackType(Lcom/ibotta/api/model/OfferModel;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public isPromoOfferType(Lcom/ibotta/api/model/OfferModel;)Z
    .locals 1

    .line 523
    sget-object v0, Lcom/ibotta/api/model/offer/OfferType;->PROMO:Lcom/ibotta/api/model/offer/OfferType;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getOfferTypeEnum()Lcom/ibotta/api/model/offer/OfferType;

    move-result-object p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isSaleOfferType(Lcom/ibotta/api/model/OfferModel;)Z
    .locals 1

    .line 528
    sget-object v0, Lcom/ibotta/api/model/offer/OfferType;->SALE:Lcom/ibotta/api/model/offer/OfferType;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getOfferTypeEnum()Lcom/ibotta/api/model/offer/OfferType;

    move-result-object p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isShopNow(Lcom/ibotta/api/model/OfferModel;)Z
    .locals 2

    .line 425
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getRewards()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 426
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getRewards()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/RewardModel;

    .line 427
    iget-object v1, p0, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->taskHelper:Lcom/ibotta/api/helper/offer/TaskHelper;

    invoke-interface {v1, v0}, Lcom/ibotta/api/helper/offer/TaskHelper;->isShopNow(Lcom/ibotta/api/model/TaskModel;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isSinglePercentBackType(Lcom/ibotta/api/model/OfferModel;)Z
    .locals 1

    .line 445
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getPercentBack()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getPercentBack()Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isSpecialOfferType(Lcom/ibotta/api/model/OfferModel;)Z
    .locals 1

    .line 533
    sget-object v0, Lcom/ibotta/api/model/offer/OfferType;->SPECIAL:Lcom/ibotta/api/model/offer/OfferType;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getOfferTypeEnum()Lcom/ibotta/api/model/offer/OfferType;

    move-result-object p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isVariablePercentBack(Lcom/ibotta/api/model/OfferModel;)Z
    .locals 1

    .line 439
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getVariablePercentBack()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 440
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getVariablePercentBack()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected isWithinReachAndAvailableAt(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/OfferModel;)Z
    .locals 1

    .line 410
    iget-object v0, p0, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->isWithinReach(Lcom/ibotta/api/model/RetailerModel;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->isAvailableAt(Lcom/ibotta/api/model/OfferModel;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isWithinReachAndAvailableAt(Ljava/util/List;Lcom/ibotta/api/model/OfferModel;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Lcom/ibotta/api/model/OfferModel;",
            ")Z"
        }
    .end annotation

    .line 277
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/RetailerModel;

    .line 278
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;->isWithinReachAndAvailableAt(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/OfferModel;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected removeNotHot(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 374
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 375
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 376
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/OfferModel;

    .line 377
    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getHotness()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getHotness()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_1

    .line 378
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    return-void
.end method
