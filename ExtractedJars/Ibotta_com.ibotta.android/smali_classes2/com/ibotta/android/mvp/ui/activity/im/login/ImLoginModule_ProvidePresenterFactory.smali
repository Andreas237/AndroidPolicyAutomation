.class public final Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;
.super Ljava/lang/Object;
.source "ImLoginModule_ProvidePresenterFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;",
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

.field private final imLoginResourcesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;",
            ">;"
        }
    .end annotation
.end field

.field private final imUtilProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;"
        }
    .end annotation
.end field

.field private final module:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;

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
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;",
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
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;",
            ">;)V"
        }
    .end annotation

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;

    .line 44
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    .line 45
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->appConfigProvider:Ljavax/inject/Provider;

    .line 46
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->imUtilProvider:Ljavax/inject/Provider;

    .line 47
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->reducerProvider:Ljavax/inject/Provider;

    .line 48
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    .line 49
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    .line 50
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->imLoginResourcesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;"
        }
    .end annotation

    .line 95
    new-instance v9, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v9
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/base/MvpPresenterActions;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/config/AppConfig;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;"
        }
    .end annotation

    .line 77
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    .line 78
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lcom/ibotta/android/state/app/config/AppConfig;

    .line 79
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 80
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;

    .line 81
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 82
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 83
    invoke-interface {p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;

    move-object v0, p0

    .line 75
    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->proxyProvidePresenter(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePresenter(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;
    .locals 0

    .line 116
    invoke-virtual/range {p0 .. p7}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;->providePresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 115
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;
    .locals 8

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->module:Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->mvpPresenterActionsProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->appConfigProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->imUtilProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->reducerProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->retailerHelperProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->retailerParcelHelperProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->imLoginResourcesProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule_ProvidePresenterFactory;->get()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;

    move-result-object v0

    return-object v0
.end method
