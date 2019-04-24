.class public final Lcom/ibotta/android/mvp/ui/activity/video/VideoModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "VideoModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final pixelTrackingManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)V"
        }
    .end annotation

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 31
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoModule_ProvideMvpPresenterFactory;->pixelTrackingManagerProvider:Ljavax/inject/Provider;

    .line 32
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoModule_ProvideMvpPresenterFactory;->appHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/video/VideoModule_ProvideMvpPresenterFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/video/VideoModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 58
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/video/VideoModule_ProvideMvpPresenterFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/video/VideoModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;"
        }
    .end annotation

    .line 48
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 49
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;

    .line 50
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/util/AppHelper;

    .line 46
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/video/VideoModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;
    .locals 0

    .line 68
    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/proprietary/pixel/PixelTrackingManager;Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 67
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;
    .locals 4

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoModule_ProvideMvpPresenterFactory;->pixelTrackingManagerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/video/VideoModule_ProvideMvpPresenterFactory;->appHelperProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/video/VideoModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/video/VideoModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/video/VideoModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/video/VideoPresenter;

    move-result-object v0

    return-object v0
.end method
