.class public final Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;
.super Ljava/lang/Object;
.source "ImConnectModule_ProvidePresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final appConfigProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;

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
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final retailerParcelHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;

    .line 37
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 38
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;->reducerProvider:Ljavax/inject/Provider;

    .line 39
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 40
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    .line 41
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;"
        }
    .end annotation

    .line 78
    new-instance v7, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v7
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;"
        }
    .end annotation

    .line 64
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 65
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;

    .line 66
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 67
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 68
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    move-object v0, p0

    .line 62
    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;->proxyProvidePresenter(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePresenter(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;
    .locals 0

    .line 95
    invoke-virtual/range {p0 .. p5}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;->providePresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectReducer;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 94
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;
    .locals 6

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;->reducerProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectModule_ProvidePresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/im/connect/ImConnectPresenter;

    move-result-object v0

    return-object v0
.end method
