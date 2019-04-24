.class public Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactoryImpl;
.super Ljava/lang/Object;
.source "PersonalRetailerFinderFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/api/helper/retailer/RetailerHelper;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactoryImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 14
    iput-object p2, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactoryImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    return-void
.end method


# virtual methods
.method public createFor(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;)Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinder;
    .locals 2

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactoryImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getStoreSelectorV5Requirements()Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5Config;

    move-result-object v0

    .line 22
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->APP:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;

    if-ne p1, v1, :cond_0

    .line 23
    new-instance v1, Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->getConfigForType(Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5Config;)Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactoryImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-direct {v1, p1, v0}, Lcom/ibotta/android/fragment/personalization/PersonalAppFinderImpl;-><init>(Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;Lcom/ibotta/api/helper/retailer/RetailerHelper;)V

    goto :goto_0

    .line 25
    :cond_0
    new-instance v1, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoreMode;->getConfigForType(Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsV5Config;)Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactoryImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-direct {v1, p1, v0}, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderImpl;-><init>(Lcom/ibotta/android/state/app/config/personalization/StoreSelectorReqsAppConfig;Lcom/ibotta/api/helper/retailer/RetailerHelper;)V

    :goto_0
    return-object v1
.end method
