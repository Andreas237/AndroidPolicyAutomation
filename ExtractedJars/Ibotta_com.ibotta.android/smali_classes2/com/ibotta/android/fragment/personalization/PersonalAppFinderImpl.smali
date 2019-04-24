.class public Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;
.super Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;
.source "PersonalAppFinderImpl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl$AppSortDataComparator;
    }
.end annotation


# instance fields
.field private requiredRetailerModels:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;Lcom/ibotta/api/helper/retailer/RetailerHelper;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;-><init>(Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;Lcom/ibotta/api/helper/retailer/RetailerHelper;)V

    .line 18
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;->requiredRetailerModels:Ljava/util/LinkedHashSet;

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;)Ljava/util/LinkedHashSet;
    .locals 0

    .line 17
    iget-object p0, p0, Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;->requiredRetailerModels:Ljava/util/LinkedHashSet;

    return-object p0
.end method


# virtual methods
.method protected allowMissingFavoritedRetailer(Lcom/ibotta/api/model/RetailerModel;)Z
    .locals 1

    .line 38
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object p1

    sget-object v0, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected bucketRetailers(Ljava/util/List;)Ljava/util/List;
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

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;->requiredRetailerModels:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/LinkedHashSet;->clear()V

    .line 27
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->bucketRetailers(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected collectRequiredRetailers(Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;Ljava/util/List;Ljava/util/Set;)V
    .locals 0
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

    .line 32
    invoke-super {p0, p1, p2, p3}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;->collectRequiredRetailers(Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;Ljava/util/List;Ljava/util/Set;)V

    .line 33
    iget-object p2, p0, Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;->requiredRetailerModels:Ljava/util/LinkedHashSet;

    invoke-virtual {p1}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl$Bucket;->getRetailerModels()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/LinkedHashSet;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method protected sort(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl$AppSortDataComparator;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl$AppSortDataComparator;-><init>(Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl$1;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method
