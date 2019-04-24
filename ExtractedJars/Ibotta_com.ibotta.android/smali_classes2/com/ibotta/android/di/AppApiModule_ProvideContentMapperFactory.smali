.class public final Lcom/ibotta/android/di/AppApiModule_ProvideContentMapperFactory;
.super Ljava/lang/Object;
.source "AppApiModule_ProvideContentMapperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mappers/ContentMapper;",
        ">;"
    }
.end annotation


# instance fields
.field private final offerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final productHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/product/ProductHelper;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/product/ProductHelper;",
            ">;)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/di/AppApiModule_ProvideContentMapperFactory;->offerHelperProvider:Ljavax/inject/Provider;

    .line 28
    iput-object p2, p0, Lcom/ibotta/android/di/AppApiModule_ProvideContentMapperFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p3, p0, Lcom/ibotta/android/di/AppApiModule_ProvideContentMapperFactory;->productHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/AppApiModule_ProvideContentMapperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/product/ProductHelper;",
            ">;)",
            "Lcom/ibotta/android/di/AppApiModule_ProvideContentMapperFactory;"
        }
    .end annotation

    .line 49
    new-instance v0, Lcom/ibotta/android/di/AppApiModule_ProvideContentMapperFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/AppApiModule_ProvideContentMapperFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mappers/ContentMapper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/product/ProductHelper;",
            ">;)",
            "Lcom/ibotta/android/mappers/ContentMapper;"
        }
    .end annotation

    .line 42
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/api/helper/product/ProductHelper;

    .line 41
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/AppApiModule_ProvideContentMapperFactory;->proxyProvideContentMapper(Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/product/ProductHelper;)Lcom/ibotta/android/mappers/ContentMapper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideContentMapper(Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/product/ProductHelper;)Lcom/ibotta/android/mappers/ContentMapper;
    .locals 0

    .line 56
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/AppApiModule;->provideContentMapper(Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/product/ProductHelper;)Lcom/ibotta/android/mappers/ContentMapper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 55
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mappers/ContentMapper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mappers/ContentMapper;
    .locals 3

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/di/AppApiModule_ProvideContentMapperFactory;->offerHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/AppApiModule_ProvideContentMapperFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/AppApiModule_ProvideContentMapperFactory;->productHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/AppApiModule_ProvideContentMapperFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mappers/ContentMapper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/AppApiModule_ProvideContentMapperFactory;->get()Lcom/ibotta/android/mappers/ContentMapper;

    move-result-object v0

    return-object v0
.end method
