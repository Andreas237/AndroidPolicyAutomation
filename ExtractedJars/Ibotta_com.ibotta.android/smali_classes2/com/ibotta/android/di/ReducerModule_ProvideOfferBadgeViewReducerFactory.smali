.class public final Lcom/ibotta/android/di/ReducerModule_ProvideOfferBadgeViewReducerFactory;
.super Ljava/lang/Object;
.source "ReducerModule_ProvideOfferBadgeViewReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;",
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

.field private final resourcesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
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
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideOfferBadgeViewReducerFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/di/ReducerModule_ProvideOfferBadgeViewReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ReducerModule_ProvideOfferBadgeViewReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/di/ReducerModule_ProvideOfferBadgeViewReducerFactory;"
        }
    .end annotation

    .line 39
    new-instance v0, Lcom/ibotta/android/di/ReducerModule_ProvideOfferBadgeViewReducerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/ReducerModule_ProvideOfferBadgeViewReducerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;"
        }
    .end annotation

    .line 34
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Resources;

    invoke-static {p0, p1}, Lcom/ibotta/android/di/ReducerModule_ProvideOfferBadgeViewReducerFactory;->proxyProvideOfferBadgeViewReducer(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/content/res/Resources;)Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideOfferBadgeViewReducer(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/content/res/Resources;)Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;
    .locals 0

    .line 46
    invoke-static {p0, p1}, Lcom/ibotta/android/di/ReducerModule;->provideOfferBadgeViewReducer(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/content/res/Resources;)Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 45
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/di/ReducerModule_ProvideOfferBadgeViewReducerFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ReducerModule_ProvideOfferBadgeViewReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/ReducerModule_ProvideOfferBadgeViewReducerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/ReducerModule_ProvideOfferBadgeViewReducerFactory;->get()Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;

    move-result-object v0

    return-object v0
.end method
