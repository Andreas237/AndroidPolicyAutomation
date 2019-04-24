.class public Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;
.super Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;
.source "DebugSettingsPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;"
    }
.end annotation


# instance fields
.field private debugState:Lcom/ibotta/android/state/app/debug/DebugState;

.field private tMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/debug/DebugState;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    .line 22
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->tMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    return-void
.end method


# virtual methods
.method public onColumnsItemSelected(I)V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/app/debug/DebugState;->saveColumnsSelectionPrefs(I)V

    return-void
.end method

.method public onHostNameTextChanged(Ljava/lang/String;)V
    .locals 2

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/app/debug/DebugState;->saveUseDebugApiPref(Z)V

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/app/debug/DebugState;->saveHostnamePref(Ljava/lang/String;)V

    .line 53
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/debug/DebugState;->useDebugApi()Z

    move-result v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;->initUseDebugApiTb(Z)V

    .line 54
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;->setTvApiUrl()V

    return-void
.end method

.method public onIgnoreUpdatesChecked(Z)V
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/app/debug/DebugState;->saveIsIgnoreUpdatesPref(Z)V

    .line 60
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/debug/DebugState;->isIgnoreUpdates()Z

    move-result v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;->setIgnoreUpdatesTbText(Z)V

    return-void
.end method

.method public onStart()V
    .locals 2

    .line 27
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/AbstractMvpPresenter;->onStart()V

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/debug/DebugState;->getHostName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;->setActvHostname(Ljava/lang/String;)V

    .line 30
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;->setTvApiUrl()V

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/debug/DebugState;->useDebugApi()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;->initUseDebugApiTb(Z)V

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/debug/DebugState;->isIgnoreUpdates()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;->initIgnoreUpdatesTb(Z)V

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/debug/DebugState;->isDebugTMonitorClientOn()Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;->initTMonitorTb(Z)V

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v1}, Lcom/ibotta/android/state/app/debug/DebugState;->getColumnsSelection()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;->setSColumnsSelection(I)V

    return-void
.end method

.method public onTMonitorChecked(Z)V
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->tMonitorClient:Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    invoke-interface {v0}, Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;->start()V

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/app/debug/DebugState;->saveIsTMonitoringOnPref(Z)V

    .line 67
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/debug/DebugState;->isDebugTMonitorClientOn()Z

    move-result v0

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;->setTMonitorTbText(Z)V

    return-void
.end method

.method public onUseDebugApiChecked(ZLjava/lang/String;)V
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/app/debug/DebugState;->saveUseDebugApiPref(Z)V

    if-eqz p1, :cond_0

    .line 41
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {p1, p2}, Lcom/ibotta/android/state/app/debug/DebugState;->saveHostnamePref(Ljava/lang/String;)V

    goto :goto_0

    .line 43
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {p1}, Lcom/ibotta/android/state/app/debug/DebugState;->saveDefaultHostNamePref()V

    .line 45
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    invoke-interface {p2}, Lcom/ibotta/android/state/app/debug/DebugState;->useDebugApi()Z

    move-result p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;->setUseDebugApiTbText(Z)V

    .line 46
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsView;->setTvApiUrl()V

    return-void
.end method
