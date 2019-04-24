.class public final Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "LoyaltyScanModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final trackerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 28
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule_ProvideMvpPresenterFactory;->trackerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule_ProvideMvpPresenterFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 48
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule_ProvideMvpPresenterFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/Tracker;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenter;"
        }
    .end annotation

    .line 41
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/tracking/Tracker;

    .line 40
    invoke-static {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenter;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenter;
    .locals 0

    .line 55
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;)Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 54
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenter;
    .locals 3

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule_ProvideMvpPresenterFactory;->trackerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/scan/loyalty/LoyaltyScanPresenter;

    move-result-object v0

    return-object v0
.end method
