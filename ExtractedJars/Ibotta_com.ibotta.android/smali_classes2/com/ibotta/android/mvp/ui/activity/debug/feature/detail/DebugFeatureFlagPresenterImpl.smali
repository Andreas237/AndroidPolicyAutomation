.class public Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;
.super Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;
.source "DebugFeatureFlagPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;"
    }
.end annotation


# instance fields
.field private final configRegistry:Lcom/ibotta/android/features/registry/ConfigRegistry;

.field private debugVariantNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

.field private persistedState:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPersistedState;

.field private final reducer:Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;

.field private final storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

.field private testConfig:Lcom/ibotta/android/features/TestConfig;

.field private final vc:Lcom/ibotta/android/views/components/ViewComponent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;",
            "Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewEvents;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/features/registry/ConfigRegistry;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;Lcom/ibotta/android/views/components/ViewComponent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            "Lcom/ibotta/android/features/registry/ConfigRegistry;",
            "Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;",
            "Lcom/ibotta/android/location/geofence/GeofenceCoordinator;",
            "Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;",
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;",
            "Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewEvents;",
            ">;)V"
        }
    .end annotation

    .line 43
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 44
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->configRegistry:Lcom/ibotta/android/features/registry/ConfigRegistry;

    .line 45
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    .line 46
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    .line 47
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->reducer:Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;

    .line 48
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->vc:Lcom/ibotta/android/views/components/ViewComponent;

    return-void
.end method

.method public static synthetic lambda$onStart$0(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;Lcom/ibotta/android/features/TestConfig;)Z
    .locals 1

    .line 62
    invoke-virtual {p1}, Lcom/ibotta/android/features/TestConfig;->getTestName()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPersistedState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPersistedState;->getTestName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public static synthetic lambda$onStart$1(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;Ljava/lang/String;)V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->debugVariantNames:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private updateViewState()V
    .locals 5

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->vc:Lcom/ibotta/android/views/components/ViewComponent;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->reducer:Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->debugVariantNames:Ljava/util/List;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->testConfig:Lcom/ibotta/android/features/TestConfig;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    invoke-virtual {v1, v2, v3, v4}, Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;->create(Ljava/util/List;Lcom/ibotta/android/features/TestConfig;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;)Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/views/components/ViewComponent;->updateViewState(Lcom/ibotta/android/views/components/ViewState;)V

    return-void
.end method


# virtual methods
.method public getPersistedState()Ljava/lang/Object;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPersistedState;

    return-object v0
.end method

.method public onDebugTapped(Z)V
    .locals 3

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->testConfig:Lcom/ibotta/android/features/TestConfig;

    invoke-virtual {v0}, Lcom/ibotta/android/features/TestConfig;->getTestName()Ljava/lang/String;

    move-result-object v0

    .line 97
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    invoke-interface {v1, v0}, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;->getFeatureFlagState(Ljava/lang/String;)Lcom/ibotta/android/features/storage/DebugFeatureFlagState;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 98
    invoke-virtual {v1}, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;->isEnabled()Z

    move-result v2

    if-eq v2, p1, :cond_0

    .line 99
    invoke-virtual {v1, p1}, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;->setEnabled(Z)V

    .line 100
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;->saveFeatureFlagState(Ljava/lang/String;Lcom/ibotta/android/features/storage/DebugFeatureFlagState;)V

    .line 101
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    invoke-interface {p1}, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;->onSettingChange()V

    .line 102
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->updateViewState()V

    :cond_0
    return-void
.end method

.method public onDebugVariantSelected(I)V
    .locals 3

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->testConfig:Lcom/ibotta/android/features/TestConfig;

    invoke-virtual {v0}, Lcom/ibotta/android/features/TestConfig;->getTestName()Ljava/lang/String;

    move-result-object v0

    .line 109
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    invoke-interface {v1, v0}, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;->getFeatureFlagState(Ljava/lang/String;)Lcom/ibotta/android/features/storage/DebugFeatureFlagState;

    move-result-object v1

    .line 111
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->debugVariantNames:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 112
    invoke-virtual {v1}, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;->getVariantName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 113
    invoke-virtual {v1, p1}, Lcom/ibotta/android/features/storage/DebugFeatureFlagState;->setVariantName(Ljava/lang/String;)V

    .line 114
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->storage:Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;->saveFeatureFlagState(Ljava/lang/String;Lcom/ibotta/android/features/storage/DebugFeatureFlagState;)V

    .line 115
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->geofenceCoordinator:Lcom/ibotta/android/location/geofence/GeofenceCoordinator;

    invoke-interface {p1}, Lcom/ibotta/android/location/geofence/GeofenceCoordinator;->onSettingChange()V

    .line 116
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->updateViewState()V

    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 3

    .line 59
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onStart()V

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->configRegistry:Lcom/ibotta/android/features/registry/ConfigRegistry;

    invoke-interface {v0}, Lcom/ibotta/android/features/registry/ConfigRegistry;->getTestConfigs()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/-$$Lambda$DebugFeatureFlagPresenterImpl$_zzjQB-8jlcLypWw96rCiU1B0zY;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/-$$Lambda$DebugFeatureFlagPresenterImpl$_zzjQB-8jlcLypWw96rCiU1B0zY;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;)V

    .line 62
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 63
    invoke-interface {v0}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object v0

    const/4 v1, 0x0

    .line 64
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/TestConfig;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->testConfig:Lcom/ibotta/android/features/TestConfig;

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->testConfig:Lcom/ibotta/android/features/TestConfig;

    if-nez v0, :cond_0

    .line 67
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "TestConfig cannot be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagView;->finish()V

    return-void

    .line 72
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->debugVariantNames:Ljava/util/List;

    if-nez v0, :cond_1

    .line 73
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->debugVariantNames:Ljava/util/List;

    .line 74
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->debugVariantNames:Ljava/util/List;

    const-string v1, "control"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->testConfig:Lcom/ibotta/android/features/TestConfig;

    invoke-virtual {v0}, Lcom/ibotta/android/features/TestConfig;->getVariantSelector()Lcom/ibotta/android/features/selector/VariantSelector;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/features/selector/VariantSelector;->getExperimentalVariants()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/-$$Lambda$DebugFeatureFlagPresenterImpl$0v89HyUALfTBquFerLI9WizamWM;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/-$$Lambda$DebugFeatureFlagPresenterImpl$0v89HyUALfTBquFerLI9WizamWM;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;)V

    .line 77
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    .line 80
    :cond_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->updateViewState()V

    return-void
.end method

.method public onViewsBound()V
    .locals 1

    .line 53
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onViewsBound()V

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->vc:Lcom/ibotta/android/views/components/ViewComponent;

    invoke-interface {v0, p0}, Lcom/ibotta/android/views/components/ViewComponent;->bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V

    return-void
.end method

.method public setPersistedState(Ljava/lang/Object;)V
    .locals 0

    .line 85
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->setPersistedState(Ljava/lang/Object;)V

    .line 86
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPersistedState;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;->persistedState:Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPersistedState;

    return-void
.end method
