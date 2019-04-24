.class public final Lcom/ibotta/api/di/ApiModule_ProvideOfferHelperFactory;
.super Ljava/lang/Object;
.source "ApiModule_ProvideOfferHelperFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/api/helper/offer/OfferHelper;",
        ">;"
    }
.end annotation


# instance fields
.field private final retailerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final taskHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/TaskHelper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/TaskHelper;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/api/di/ApiModule_ProvideOfferHelperFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    .line 23
    iput-object p2, p0, Lcom/ibotta/api/di/ApiModule_ProvideOfferHelperFactory;->taskHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/api/di/ApiModule_ProvideOfferHelperFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/TaskHelper;",
            ">;)",
            "Lcom/ibotta/api/di/ApiModule_ProvideOfferHelperFactory;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/api/di/ApiModule_ProvideOfferHelperFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/api/di/ApiModule_ProvideOfferHelperFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/api/helper/offer/OfferHelper;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/offer/TaskHelper;",
            ">;)",
            "Lcom/ibotta/api/helper/offer/OfferHelper;"
        }
    .end annotation

    .line 33
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/helper/offer/TaskHelper;

    invoke-static {p0, p1}, Lcom/ibotta/api/di/ApiModule_ProvideOfferHelperFactory;->proxyProvideOfferHelper(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/TaskHelper;)Lcom/ibotta/api/helper/offer/OfferHelper;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideOfferHelper(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/TaskHelper;)Lcom/ibotta/api/helper/offer/OfferHelper;
    .locals 0

    .line 44
    invoke-static {p0, p1}, Lcom/ibotta/api/di/ApiModule;->provideOfferHelper(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/TaskHelper;)Lcom/ibotta/api/helper/offer/OfferHelper;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 43
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/helper/offer/OfferHelper;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/api/helper/offer/OfferHelper;
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ibotta/api/di/ApiModule_ProvideOfferHelperFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/api/di/ApiModule_ProvideOfferHelperFactory;->taskHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/api/di/ApiModule_ProvideOfferHelperFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/api/helper/offer/OfferHelper;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/api/di/ApiModule_ProvideOfferHelperFactory;->get()Lcom/ibotta/api/helper/offer/OfferHelper;

    move-result-object v0

    return-object v0
.end method
