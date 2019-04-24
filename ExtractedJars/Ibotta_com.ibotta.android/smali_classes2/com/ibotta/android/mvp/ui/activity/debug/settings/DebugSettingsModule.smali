.class public Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "DebugSettingsModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    return-void
.end method


# virtual methods
.method public provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/debug/DebugState;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;)Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 26
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/debug/DebugState;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;)V

    return-object v0
.end method
