.class public Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "DebugFeatureFlagModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagView;",
        ">;"
    }
.end annotation


# instance fields
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
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagView;Lcom/ibotta/android/views/components/ViewComponent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagView;",
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewState;",
            "Lcom/ibotta/android/views/debug/feature/detail/DebugFeatureFlagViewEvents;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;->vc:Lcom/ibotta/android/views/components/ViewComponent;

    return-void
.end method


# virtual methods
.method public providePresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/features/registry/ConfigRegistry;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenter;
    .locals 8
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 33
    new-instance v7, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagModule;->vc:Lcom/ibotta/android/views/components/ViewComponent;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/detail/DebugFeatureFlagPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/features/registry/ConfigRegistry;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/location/geofence/GeofenceCoordinator;Lcom/ibotta/android/reducers/debug/feature/detail/DebugFeatureFlagReducer;Lcom/ibotta/android/views/components/ViewComponent;)V

    return-object v7
.end method
