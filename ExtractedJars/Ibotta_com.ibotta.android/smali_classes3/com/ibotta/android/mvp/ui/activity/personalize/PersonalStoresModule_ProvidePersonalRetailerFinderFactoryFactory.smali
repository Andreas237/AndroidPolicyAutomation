.class public final Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory;
.super Ljava/lang/Object;
.source "PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;",
        ">;"
    }
.end annotation


# instance fields
.field private final appConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;

.field private final retailerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory;->module:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory;"
        }
    .end annotation

    .line 49
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;)",
            "Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;"
        }
    .end annotation

    .line 42
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 41
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory;->proxyProvidePersonalRetailerFinderFactory(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/api/helper/retailer/RetailerHelper;)Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePersonalRetailerFinderFactory(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/api/helper/retailer/RetailerHelper;)Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;
    .locals 0

    .line 56
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;->providePersonalRetailerFinderFactory(Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/api/helper/retailer/RetailerHelper;)Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 55
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;
    .locals 3

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory;->module:Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/personalize/PersonalStoresModule_ProvidePersonalRetailerFinderFactoryFactory;->get()Lcom/ibotta/android/fragment/personalization/PersonalRetailerFinderFactory;

    move-result-object v0

    return-object v0
.end method
