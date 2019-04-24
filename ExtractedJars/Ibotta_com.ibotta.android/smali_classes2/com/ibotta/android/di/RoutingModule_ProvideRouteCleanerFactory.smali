.class public final Lcom/ibotta/android/di/RoutingModule_ProvideRouteCleanerFactory;
.super Ljava/lang/Object;
.source "RoutingModule_ProvideRouteCleanerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/routing/cleaner/RouteCleaner;",
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

.field private final formattingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
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
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/di/RoutingModule_ProvideRouteCleanerFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/di/RoutingModule_ProvideRouteCleanerFactory;->formattingProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/RoutingModule_ProvideRouteCleanerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Lcom/ibotta/android/di/RoutingModule_ProvideRouteCleanerFactory;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/android/di/RoutingModule_ProvideRouteCleanerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/RoutingModule_ProvideRouteCleanerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/routing/cleaner/RouteCleaner;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Lcom/ibotta/android/routing/cleaner/RouteCleaner;"
        }
    .end annotation

    .line 33
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/util/Formatting;

    invoke-static {p0, p1}, Lcom/ibotta/android/di/RoutingModule_ProvideRouteCleanerFactory;->proxyProvideRouteCleaner(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideRouteCleaner(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/routing/cleaner/RouteCleaner;
    .locals 0

    .line 43
    invoke-static {p0, p1}, Lcom/ibotta/android/di/RoutingModule;->provideRouteCleaner(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 42
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/routing/cleaner/RouteCleaner;
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/di/RoutingModule_ProvideRouteCleanerFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/RoutingModule_ProvideRouteCleanerFactory;->formattingProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/RoutingModule_ProvideRouteCleanerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/RoutingModule_ProvideRouteCleanerFactory;->get()Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    move-result-object v0

    return-object v0
.end method
