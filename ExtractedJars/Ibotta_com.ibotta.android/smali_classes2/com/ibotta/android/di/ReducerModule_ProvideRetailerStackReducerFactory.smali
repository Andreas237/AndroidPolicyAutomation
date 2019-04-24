.class public final Lcom/ibotta/android/di/ReducerModule_ProvideRetailerStackReducerFactory;
.super Ljava/lang/Object;
.source "ReducerModule_ProvideRetailerStackReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/retailer/RetailerStackReducer;",
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

.field private final retailerIconOnOfferVariantProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;",
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
            "Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerStackReducerFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerStackReducerFactory;->retailerIconOnOfferVariantProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideRetailerStackReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;",
            ">;)",
            "Lcom/ibotta/android/di/ReducerModule_ProvideRetailerStackReducerFactory;"
        }
    .end annotation

    .line 43
    new-instance v0, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerStackReducerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerStackReducerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/retailer/RetailerStackReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;",
            ">;)",
            "Lcom/ibotta/android/retailer/RetailerStackReducer;"
        }
    .end annotation

    .line 37
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    .line 36
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerStackReducerFactory;->proxyProvideRetailerStackReducer(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/retailer/RetailerStackReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideRetailerStackReducer(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/retailer/RetailerStackReducer;
    .locals 0

    .line 50
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ReducerModule;->provideRetailerStackReducer(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)Lcom/ibotta/android/retailer/RetailerStackReducer;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 49
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/retailer/RetailerStackReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/retailer/RetailerStackReducer;
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerStackReducerFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerStackReducerFactory;->retailerIconOnOfferVariantProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerStackReducerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/retailer/RetailerStackReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideRetailerStackReducerFactory;->get()Lcom/ibotta/android/retailer/RetailerStackReducer;

    move-result-object v0

    return-object v0
.end method
