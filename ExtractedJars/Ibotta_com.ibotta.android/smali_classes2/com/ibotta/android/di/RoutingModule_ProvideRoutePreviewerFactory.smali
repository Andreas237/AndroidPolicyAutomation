.class public final Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;
.super Ljava/lang/Object;
.source "RoutingModule_ProvideRoutePreviewerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/routing/RoutePreviewer;",
        ">;"
    }
.end annotation


# instance fields
.field private final routeCleanerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/cleaner/RouteCleaner;",
            ">;"
        }
    .end annotation
.end field

.field private final routeHandlerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RouteHandler;",
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
            "Lcom/ibotta/android/routing/cleaner/RouteCleaner;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RouteHandler;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;->routeCleanerProvider:Ljavax/inject/Provider;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;->routeHandlerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/cleaner/RouteCleaner;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RouteHandler;",
            ">;)",
            "Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/routing/RoutePreviewer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/cleaner/RouteCleaner;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/routing/RouteHandler;",
            ">;)",
            "Lcom/ibotta/android/routing/RoutePreviewer;"
        }
    .end annotation

    .line 33
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/routing/cleaner/RouteCleaner;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/routing/RouteHandler;

    invoke-static {p0, p1}, Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;->proxyProvideRoutePreviewer(Lcom/ibotta/android/routing/cleaner/RouteCleaner;Lcom/ibotta/android/routing/RouteHandler;)Lcom/ibotta/android/routing/RoutePreviewer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideRoutePreviewer(Lcom/ibotta/android/routing/cleaner/RouteCleaner;Lcom/ibotta/android/routing/RouteHandler;)Lcom/ibotta/android/routing/RoutePreviewer;
    .locals 0

    .line 45
    invoke-static {p0, p1}, Lcom/ibotta/android/di/RoutingModule;->provideRoutePreviewer(Lcom/ibotta/android/routing/cleaner/RouteCleaner;Lcom/ibotta/android/routing/RouteHandler;)Lcom/ibotta/android/routing/RoutePreviewer;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 44
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/routing/RoutePreviewer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/routing/RoutePreviewer;
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;->routeCleanerProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;->routeHandlerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/routing/RoutePreviewer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/RoutingModule_ProvideRoutePreviewerFactory;->get()Lcom/ibotta/android/routing/RoutePreviewer;

    move-result-object v0

    return-object v0
.end method
