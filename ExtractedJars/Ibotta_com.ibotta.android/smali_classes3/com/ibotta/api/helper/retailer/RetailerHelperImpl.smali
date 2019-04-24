.class public Lcom/ibotta/api/helper/retailer/RetailerHelperImpl;
.super Ljava/lang/Object;
.source "RetailerHelperImpl.java"

# interfaces
.implements Lcom/ibotta/api/helper/retailer/RetailerHelper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public findNearbyRetailers(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    return-object v0

    .line 92
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

    check-cast v1, Lcom/ibotta/api/model/RetailerModel;

    .line 93
    invoke-virtual {p0, v1}, Lcom/ibotta/api/helper/retailer/RetailerHelperImpl;->isWithinReach(Lcom/ibotta/api/model/RetailerModel;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 94
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public findRetailerByDasherizedName(Ljava/util/List;Ljava/lang/String;)Lcom/ibotta/api/model/RetailerModel;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/ibotta/api/model/RetailerModel;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    .line 67
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/RetailerModel;

    .line 68
    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getDasherizedName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 72
    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 74
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0

    :cond_3
    :goto_0
    return-object v0
.end method

.method public findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;I)",
            "Lcom/ibotta/api/model/RetailerModel;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 29
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/RetailerModel;

    .line 30
    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v2

    if-ne v2, p2, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0
.end method

.method public findRetailersByIds(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_1

    .line 46
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

    check-cast v1, Lcom/ibotta/api/model/RetailerModel;

    .line 47
    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 48
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    return-object v0
.end method

.method public getButtonId(Lcom/ibotta/api/model/RetailerModel;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    .line 124
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getButtonInfo()Lcom/ibotta/api/model/retailer/ButtonInfo;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getButtonInfo()Lcom/ibotta/api/model/retailer/ButtonInfo;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/ibotta/api/model/retailer/ButtonInfo;->getButtonId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getRetailersFromBaseContent(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/BaseContent;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 103
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    const-class v0, Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/ibotta/api/helper/retailer/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;

    invoke-direct {v1, v0}, Lcom/ibotta/api/helper/retailer/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;-><init>(Ljava/lang/Class;)V

    .line 104
    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    const-class v0, Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/ibotta/api/helper/retailer/-$$Lambda$MJVxA3X3yxsK9Sjq49WWiz6HjWI;

    invoke-direct {v1, v0}, Lcom/ibotta/api/helper/retailer/-$$Lambda$MJVxA3X3yxsK9Sjq49WWiz6HjWI;-><init>(Ljava/lang/Class;)V

    .line 105
    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 106
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public isLinked(Lcom/ibotta/api/model/RetailerModel;)Z
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 132
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getCustomerLoyalty()Lcom/ibotta/api/model/customer/CustomerLoyalty;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public isWithinReach(Lcom/ibotta/api/model/RetailerModel;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 114
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/common/VerificationType;->isAlwaysNearby()Z

    move-result v1

    if-nez v1, :cond_1

    .line 115
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getDistance()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getDistance()Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/4 v1, 0x0

    cmpl-float p1, p1, v1

    if-lez p1, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    return v0
.end method
