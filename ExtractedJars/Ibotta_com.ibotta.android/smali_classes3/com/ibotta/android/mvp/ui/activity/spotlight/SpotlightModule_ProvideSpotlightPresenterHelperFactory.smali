.class public final Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;
.super Ljava/lang/Object;
.source "SpotlightModule_ProvideSpotlightPresenterHelperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final bonusBucketedComparatorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/collection/BonusBucketedComparator;",
            ">;"
        }
    .end annotation
.end field

.field private final bonusHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/bonus/BonusHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final offerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;"
        }
    .end annotation
.end field

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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/bonus/BonusHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/collection/BonusBucketedComparator;",
            ">;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 37
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    .line 38
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;->offerHelperProvider:Ljavax/inject/Provider;

    .line 39
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;->bonusHelperProvider:Ljavax/inject/Provider;

    .line 40
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;->bonusBucketedComparatorProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/bonus/BonusHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/collection/BonusBucketedComparator;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;"
        }
    .end annotation

    .line 73
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/bonus/BonusHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/collection/BonusBucketedComparator;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;"
        }
    .end annotation

    .line 60
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/AppHelper;

    .line 61
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 62
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 63
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/api/helper/bonus/BonusHelper;

    .line 64
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/ibotta/android/collection/BonusBucketedComparator;

    .line 59
    invoke-static {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;->proxyProvideSpotlightPresenterHelper(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/bonus/BonusHelper;Lcom/ibotta/android/collection/BonusBucketedComparator;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideSpotlightPresenterHelper(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/bonus/BonusHelper;Lcom/ibotta/android/collection/BonusBucketedComparator;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;
    .locals 0

    .line 88
    invoke-static {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule;->provideSpotlightPresenterHelper(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/bonus/BonusHelper;Lcom/ibotta/android/collection/BonusBucketedComparator;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 87
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;
    .locals 5

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;->offerHelperProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;->bonusHelperProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;->bonusBucketedComparatorProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/spotlight/SpotlightModule_ProvideSpotlightPresenterHelperFactory;->get()Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelper;

    move-result-object v0

    return-object v0
.end method
