.class public final Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory;
.super Ljava/lang/Object;
.source "MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;",
        ">;"
    }
.end annotation


# instance fields
.field private final appProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;"
        }
    .end annotation
.end field

.field private final locationStatusDispatcherProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/LocationStatusDispatcher;",
            ">;"
        }
    .end annotation
.end field

.field private final mvtTestsHolderProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;",
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
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/LocationStatusDispatcher;",
            ">;)V"
        }
    .end annotation

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory;->appProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory;->mvtTestsHolderProvider:Ljavax/inject/Provider;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory;->locationStatusDispatcherProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/LocationStatusDispatcher;",
            ">;)",
            "Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory;"
        }
    .end annotation

    .line 50
    new-instance v0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/App;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/LocationStatusDispatcher;",
            ">;)",
            "Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;"
        }
    .end annotation

    .line 43
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/App;

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/location/LocationStatusDispatcher;

    .line 42
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory;->proxyProvideNewRelicSessionAttributes(Lcom/ibotta/android/App;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/location/LocationStatusDispatcher;)Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideNewRelicSessionAttributes(Lcom/ibotta/android/App;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/location/LocationStatusDispatcher;)Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;
    .locals 0

    .line 57
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/di/MainLifecycleTrackerModule;->provideNewRelicSessionAttributes(Lcom/ibotta/android/App;Lcom/ibotta/android/state/app/mvt/MvtTestsHolder;Lcom/ibotta/android/location/LocationStatusDispatcher;)Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 56
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory;->appProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory;->mvtTestsHolderProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory;->locationStatusDispatcherProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/di/MainLifecycleTrackerModule_ProvideNewRelicSessionAttributesFactory;->get()Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;

    move-result-object v0

    return-object v0
.end method
