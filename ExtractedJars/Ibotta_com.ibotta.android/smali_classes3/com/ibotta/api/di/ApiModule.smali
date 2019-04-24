.class public abstract Lcom/ibotta/api/di/ApiModule;
.super Ljava/lang/Object;
.source "ApiModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static provideApiCallFactory()Lcom/ibotta/api/call/ApiCallFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 141
    new-instance v0, Lcom/ibotta/api/call/ApiCallFactoryImpl;

    invoke-direct {v0}, Lcom/ibotta/api/call/ApiCallFactoryImpl;-><init>()V

    return-object v0
.end method

.method public static provideApiClient()Lcom/ibotta/api/ApiClient;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Singleton;
    .end annotation

    .line 151
    new-instance v0, Lcom/ibotta/api/ApiClientImpl;

    invoke-direct {v0}, Lcom/ibotta/api/ApiClientImpl;-><init>()V

    return-object v0
.end method

.method public static provideApiExecutionFactory()Lcom/ibotta/api/execution/ApiExecutionFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 146
    new-instance v0, Lcom/ibotta/api/execution/DefaultApiHttpExecutionFactory;

    invoke-direct {v0}, Lcom/ibotta/api/execution/DefaultApiHttpExecutionFactory;-><init>()V

    return-object v0
.end method

.method public static provideBonusHelper(Lcom/ibotta/api/helper/retailer/RetailerHelper;)Lcom/ibotta/api/helper/bonus/BonusHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 71
    new-instance v0, Lcom/ibotta/api/helper/bonus/BonusHelperImpl;

    invoke-direct {v0, p0}, Lcom/ibotta/api/helper/bonus/BonusHelperImpl;-><init>(Lcom/ibotta/api/helper/retailer/RetailerHelper;)V

    return-object v0
.end method

.method public static provideCategoryHelper()Lcom/ibotta/api/helper/retailer/CategoryHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 116
    new-instance v0, Lcom/ibotta/api/helper/retailer/CategoryHelperImpl;

    invoke-direct {v0}, Lcom/ibotta/api/helper/retailer/CategoryHelperImpl;-><init>()V

    return-object v0
.end method

.method public static provideCustomerGiftCardHelper()Lcom/ibotta/api/helper/card/CustomerGiftCardHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 81
    new-instance v0, Lcom/ibotta/api/helper/card/CustomerGiftCardHelperImpl;

    invoke-direct {v0}, Lcom/ibotta/api/helper/card/CustomerGiftCardHelperImpl;-><init>()V

    return-object v0
.end method

.method public static provideCustomerSocialHelper()Lcom/ibotta/api/helper/social/CustomerSocialHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 126
    new-instance v0, Lcom/ibotta/api/helper/social/CustomerSocialHelperImpl;

    invoke-direct {v0}, Lcom/ibotta/api/helper/social/CustomerSocialHelperImpl;-><init>()V

    return-object v0
.end method

.method public static provideDigitalProductHelper()Lcom/ibotta/api/helper/offer/DigitalProductHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 86
    new-instance v0, Lcom/ibotta/api/helper/offer/DigitalProductHelperImpl;

    invoke-direct {v0}, Lcom/ibotta/api/helper/offer/DigitalProductHelperImpl;-><init>()V

    return-object v0
.end method

.method public static provideEarningsHelper()Lcom/ibotta/api/helper/earnings/EarningsHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 121
    new-instance v0, Lcom/ibotta/api/helper/earnings/EarningsHelperImpl;

    invoke-direct {v0}, Lcom/ibotta/api/helper/earnings/EarningsHelperImpl;-><init>()V

    return-object v0
.end method

.method public static provideFeatureHelper()Lcom/ibotta/api/helper/feature/FeatureHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 111
    new-instance v0, Lcom/ibotta/api/helper/feature/FeatureHelperImpl;

    invoke-direct {v0}, Lcom/ibotta/api/helper/feature/FeatureHelperImpl;-><init>()V

    return-object v0
.end method

.method public static provideGiftCardHelper()Lcom/ibotta/api/helper/card/GiftCardHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 76
    new-instance v0, Lcom/ibotta/api/helper/card/GiftCardHelperImpl;

    invoke-direct {v0}, Lcom/ibotta/api/helper/card/GiftCardHelperImpl;-><init>()V

    return-object v0
.end method

.method public static provideOfferCategoryHelper()Lcom/ibotta/api/helper/offer/OfferCategoryHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 101
    new-instance v0, Lcom/ibotta/api/helper/offer/OfferCategoryHelperImpl;

    invoke-direct {v0}, Lcom/ibotta/api/helper/offer/OfferCategoryHelperImpl;-><init>()V

    return-object v0
.end method

.method public static provideOfferHelper(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/TaskHelper;)Lcom/ibotta/api/helper/offer/OfferHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 66
    new-instance v0, Lcom/ibotta/api/helper/offer/OfferHelperImpl;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/api/helper/offer/OfferHelperImpl;-><init>(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/TaskHelper;)V

    return-object v0
.end method

.method public static provideOptionHelper()Lcom/ibotta/api/helper/offer/OptionHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 131
    new-instance v0, Lcom/ibotta/api/helper/offer/OptionHelperImpl;

    invoke-direct {v0}, Lcom/ibotta/api/helper/offer/OptionHelperImpl;-><init>()V

    return-object v0
.end method

.method public static provideProductGroupHelper()Lcom/ibotta/api/helper/offer/ProductGroupHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 91
    new-instance v0, Lcom/ibotta/api/helper/offer/ProductGroupHelperImpl;

    invoke-direct {v0}, Lcom/ibotta/api/helper/offer/ProductGroupHelperImpl;-><init>()V

    return-object v0
.end method

.method public static provideProductHelper()Lcom/ibotta/api/helper/product/ProductHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 96
    new-instance v0, Lcom/ibotta/api/helper/product/ProductHelperImpl;

    invoke-direct {v0}, Lcom/ibotta/api/helper/product/ProductHelperImpl;-><init>()V

    return-object v0
.end method

.method public static providePromoHelper()Lcom/ibotta/api/helper/promo/PromoHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 106
    new-instance v0, Lcom/ibotta/api/helper/promo/PromoHelperImpl;

    invoke-direct {v0}, Lcom/ibotta/api/helper/promo/PromoHelperImpl;-><init>()V

    return-object v0
.end method

.method public static provideRetailerHelper()Lcom/ibotta/api/helper/retailer/RetailerHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 56
    new-instance v0, Lcom/ibotta/api/helper/retailer/RetailerHelperImpl;

    invoke-direct {v0}, Lcom/ibotta/api/helper/retailer/RetailerHelperImpl;-><init>()V

    return-object v0
.end method

.method public static provideScanRules()Lcom/ibotta/api/rules/ScanRules;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 136
    new-instance v0, Lcom/ibotta/api/rules/ScanRulesImpl;

    invoke-direct {v0}, Lcom/ibotta/api/rules/ScanRulesImpl;-><init>()V

    return-object v0
.end method

.method public static provideTaskHelper()Lcom/ibotta/api/helper/offer/TaskHelper;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ldagger/Reusable;
    .end annotation

    .line 61
    new-instance v0, Lcom/ibotta/api/helper/offer/TaskHelperImpl;

    invoke-direct {v0}, Lcom/ibotta/api/helper/offer/TaskHelperImpl;-><init>()V

    return-object v0
.end method
