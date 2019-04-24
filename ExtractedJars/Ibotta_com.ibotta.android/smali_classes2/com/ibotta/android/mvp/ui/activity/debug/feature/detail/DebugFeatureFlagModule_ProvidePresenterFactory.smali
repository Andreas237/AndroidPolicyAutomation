.class public final Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;
.super Ljava/lang/Object;
.source "DebugFeatureFlagModule_ProvidePresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final configRegistryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/registry/ConfigRegistry;",
            ">;"
        }
    .end annotation
.end field

.field private final geofenceCoordinatorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final reducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final storageProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/registry/ConfigRegistry;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;",
            ">;)V"
        }
    .end annotation

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;

    .line 39
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 40
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;->configRegistryProvider:Ljavax/inject/Provider;

    .line 41
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;->storageProvider:Ljavax/inject/Provider;

    .line 42
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;->geofenceCoordinatorProvider:Ljavax/inject/Provider;

    .line 43
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;->reducerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/registry/ConfigRegistry;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;"
        }
    .end annotation

    .line 80
    new-instance v7, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v7
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/registry/ConfigRegistry;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;"
        }
    .end annotation

    .line 66
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 67
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/ibotta/android/features/registry/ConfigRegistry;

    .line 68
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    .line 69
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    .line 70
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;

    move-object v0, p0

    .line 64
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;->proxyProvidePresenter(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/features/registry/ConfigRegistry;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePresenter(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/features/registry/ConfigRegistry;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;
    .locals 0

    .line 97
    invoke-virtual/range {p0 .. p5}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;->providePresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/features/registry/ConfigRegistry;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 96
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;
    .locals 6

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;->configRegistryProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;->storageProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;->geofenceCoordinatorProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;->reducerProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule_ProvidePresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;

    move-result-object v0

    return-object v0
.end method
