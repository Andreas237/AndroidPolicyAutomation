.class public Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;
.super Ljava/lang/Object;
.source "PersonalRetailerFinderImpl.java"

# interfaces
.implements Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$SortDataComparator;,
        Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;
    }
.end annotation


# instance fields
.field protected final config:Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

.field protected favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

.field protected final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field protected retailerModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;Lcom/ibotta/api/helper/retailer/RetailerHelper;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->retailerModels:Ljava/util/List;

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->config:Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    .line 36
    iput-object p2, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    return-void
.end method

.method private addMissingFavoritedRetailers(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    if-nez v0, :cond_0

    return-void

    .line 202
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 203
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/RetailerModel;

    .line 204
    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 207
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 208
    iget-object v2, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    invoke-interface {v2}, Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;->getFavoriteRetailerIds()Ljava/util/Set;

    move-result-object v2

    .line 210
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 211
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 212
    iget-object v4, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    iget-object v5, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->retailerModels:Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v4, v5, v3}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 214
    invoke-virtual {p0, v3}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->allowMissingFavoritedRetailer(Lcom/ibotta/api/model/RetailerModel;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 215
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 220
    :cond_3
    invoke-virtual {p0, v1}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->sort(Ljava/util/List;)V

    .line 222
    invoke-interface {p1, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method protected allowMissingFavoritedRetailer(Lcom/ibotta/api/model/RetailerModel;)Z
    .locals 1

    .line 226
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object p1

    sget-object v0, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected bucketRetailers(Ljava/util/List;)Ljava/util/List;
    .locals 5
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

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->config:Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;->getStoreSelectorCategories()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 85
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 86
    iget-object v1, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->config:Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    invoke-virtual {v1}, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;->getStoreSelectorCategories()Ljava/util/List;

    move-result-object v1

    .line 88
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;

    .line 89
    new-instance v3, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;

    invoke-direct {v3, v2}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;-><init>(Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;)V

    .line 90
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    invoke-virtual {v2}, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;->getRequiredRetailers()Ljava/util/LinkedHashSet;

    move-result-object v4

    invoke-virtual {p0, v3, p1, v4}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->collectRequiredRetailers(Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;Ljava/util/List;Ljava/util/Set;)V

    .line 94
    invoke-virtual {v3}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;->isFull()Z

    move-result v4

    if-nez v4, :cond_1

    .line 96
    invoke-virtual {v2}, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;->getIds()Ljava/util/Set;

    move-result-object v4

    invoke-virtual {v2}, Lcom/ibotta/android/state/app/config/personalization/StoreSelectorCategory;->getExcludedRetailers()Ljava/util/LinkedHashSet;

    move-result-object v2

    .line 95
    invoke-virtual {p0, v3, p1, v4, v2}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->collectRetailersByCategories(Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V

    goto :goto_0

    .line 100
    :cond_2
    invoke-virtual {p0, v0}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->collectRetailersFromBuckets(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 82
    :cond_3
    :goto_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method protected collectRequiredRetailers(Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;Ljava/util/List;Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_4

    if-eqz p2, :cond_4

    if-nez p3, :cond_0

    goto :goto_2

    .line 109
    :cond_0
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 110
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;->isFull()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    .line 114
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v1, p2, v0}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 117
    invoke-virtual {p1, v0}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;->addRetailer(Lcom/ibotta/api/model/RetailerModel;)V

    .line 118
    invoke-interface {p2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    :goto_1
    return-void

    :cond_4
    :goto_2
    return-void
.end method

.method protected collectRetailersByCategories(Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_4

    if-eqz p2, :cond_4

    if-nez p3, :cond_0

    goto :goto_2

    .line 132
    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->findRetailersInCategories(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;

    move-result-object p3

    .line 134
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    .line 135
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 136
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;->isFull()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 140
    :cond_1
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/RetailerModel;

    .line 141
    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p4, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 142
    invoke-virtual {p1, v0}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;->addRetailer(Lcom/ibotta/api/model/RetailerModel;)V

    .line 145
    :cond_2
    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    .line 146
    invoke-interface {p2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    :goto_1
    return-void

    :cond_4
    :goto_2
    return-void
.end method

.method protected collectRetailersFromBuckets(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 182
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    return-object v0

    .line 188
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;

    .line 189
    invoke-virtual {v1}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;->getRetailerModels()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 192
    :cond_1
    invoke-virtual {p0, v0}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->sort(Ljava/util/List;)V

    return-object v0
.end method

.method protected filterRetailersToNearby(Ljava/util/List;)Ljava/util/List;
    .locals 1
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

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    if-nez v0, :cond_0

    .line 74
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 77
    :cond_0
    invoke-interface {v0, p1}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findNearbyRetailers(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public findPersonalRetailerModels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->retailerModels:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->filterRetailersToNearby(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 66
    invoke-virtual {p0, v0}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->bucketRetailers(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 67
    invoke-direct {p0, v0}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->addMissingFavoritedRetailers(Ljava/util/List;)V

    return-object v0
.end method

.method protected findRetailersInCategories(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;
    .locals 4
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

    if-eqz p1, :cond_5

    if-nez p2, :cond_0

    goto :goto_1

    .line 157
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 159
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/RetailerModel;

    .line 160
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 162
    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getPrimaryCategoryId()I

    move-result v3

    if-eqz v3, :cond_2

    .line 163
    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getPrimaryCategoryId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 165
    :cond_2
    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getSecondaryCategoryId()I

    move-result v3

    if-eqz v3, :cond_3

    .line 166
    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getSecondaryCategoryId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 169
    :cond_3
    invoke-interface {v2, p2}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    .line 171
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 172
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 176
    :cond_4
    invoke-virtual {p0, v0}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->sort(Ljava/util/List;)V

    return-object v0

    .line 154
    :cond_5
    :goto_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method protected getConfig()Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->config:Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    return-object v0
.end method

.method protected getRetailerHelper()Lcom/ibotta/api/helper/retailer/RetailerHelper;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    return-object v0
.end method

.method public setFavoriteRetailersManager(Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->favoriteRetailersManager:Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;

    return-void
.end method

.method public setRetailerModels(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->retailerModels:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_0

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->retailerModels:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method

.method protected sort(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 230
    new-instance v0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$SortDataComparator;

    invoke-direct {v0}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$SortDataComparator;-><init>()V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method
