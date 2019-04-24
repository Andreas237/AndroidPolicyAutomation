.class public Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "DebugFeatureFlagsModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsView;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/features/registry/ConfigRegistry;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenter;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 29
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DebugFeatureFlagsPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/features/registry/ConfigRegistry;Lcom/ibotta/android/features/storage/DebugFeatureFlagStorage;Lcom/ibotta/android/features/FeatureFlagResponseUtil;)V

    return-object v0
.end method
