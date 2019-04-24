.class public final Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;
.super Ljava/lang/Object;
.source "PwiBarcodeModule_ProvideMvpPresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;",
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

.field private final formattingProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;

.field private final mvpPresenterActionsProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;"
        }
    .end annotation
.end field

.field private final pwiApiManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;",
            ">;"
        }
    .end annotation
.end field

.field private final pwiBarcodeReducerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/pwi/PwiBarcodeReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final pwiUserStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
            ">;"
        }
    .end annotation
.end field

.field private final userStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/pwi/PwiBarcodeReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)V"
        }
    .end annotation

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;

    .line 47
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 48
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->appHelperProvider:Ljavax/inject/Provider;

    .line 49
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 50
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->pwiApiManagerProvider:Ljavax/inject/Provider;

    .line 51
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->pwiBarcodeReducerProvider:Ljavax/inject/Provider;

    .line 52
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->pwiUserStateProvider:Ljavax/inject/Provider;

    .line 53
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->formattingProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/pwi/PwiBarcodeReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;"
        }
    .end annotation

    .line 98
    new-instance v9, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v9
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/pwi/PwiBarcodeReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/pwi/PwiUserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/Formatting;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;"
        }
    .end annotation

    .line 80
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 81
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/ibotta/android/util/AppHelper;

    .line 82
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/ibotta/android/state/user/UserState;

    .line 83
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    .line 84
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/ibotta/android/pwi/PwiBarcodeReducer;

    .line 85
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lcom/ibotta/android/state/pwi/PwiUserState;

    .line 86
    invoke-interface {p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lcom/ibotta/android/util/Formatting;

    move-object v0, p0

    .line 78
    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;Lcom/ibotta/android/pwi/PwiBarcodeReducer;Lcom/ibotta/android/state/pwi/PwiUserState;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideMvpPresenter(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;Lcom/ibotta/android/pwi/PwiBarcodeReducer;Lcom/ibotta/android/state/pwi/PwiUserState;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;
    .locals 0

    .line 119
    invoke-virtual/range {p0 .. p7}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;->provideMvpPresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;Lcom/ibotta/android/pwi/PwiBarcodeReducer;Lcom/ibotta/android/state/pwi/PwiUserState;Lcom/ibotta/android/util/Formatting;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 118
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;
    .locals 8

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->appHelperProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->pwiApiManagerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->pwiBarcodeReducerProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->pwiUserStateProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->formattingProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeModule_ProvideMvpPresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodePresenter;

    move-result-object v0

    return-object v0
.end method
