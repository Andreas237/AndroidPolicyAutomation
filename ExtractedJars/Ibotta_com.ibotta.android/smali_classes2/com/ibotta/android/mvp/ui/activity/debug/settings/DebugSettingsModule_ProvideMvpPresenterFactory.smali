.class public final Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "DebugSettingsModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final debugStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final tMonitorClientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;",
            ">;)V"
        }
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;

    .line 31
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 32
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule_ProvideMvpPresenterFactory;->debugStateProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule_ProvideMvpPresenterFactory;->tMonitorClientProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule_ProvideMvpPresenterFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 59
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule_ProvideMvpPresenterFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/debug/DebugState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;"
        }
    .end annotation

    .line 49
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 50
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/state/app/debug/DebugState;

    .line 51
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;

    .line 47
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/debug/DebugState;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;)Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/debug/DebugState;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;)Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;
    .locals 0

    .line 69
    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/debug/DebugState;Lcom/ibotta/android/tracking/tmonitor/TMonitorClient;)Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 68
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;
    .locals 4

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule_ProvideMvpPresenterFactory;->debugStateProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule_ProvideMvpPresenterFactory;->tMonitorClientProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/debug/settings/DebugSettingsPresenter;

    move-result-object v0

    return-object v0
.end method
