.class public Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "ImErrorModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;",
        ">;"
    }
.end annotation


# instance fields
.field private final context:Landroid/content/Context;

.field private final viewComponent:Lcom/ibotta/android/views/components/ViewComponent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;Lcom/ibotta/android/views/components/ViewComponent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorView;",
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorViewEvents;",
            ">;)V"
        }
    .end annotation

    .line 33
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;->context:Landroid/content/Context;

    .line 35
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    return-void
.end method


# virtual methods
.method public provideCacheClearBatchApiJob(Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "CacheClearCustomer"
    .end annotation

    .line 67
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomer(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    return-object p1
.end method

.method public provideImUiUtil(Lcom/ibotta/android/util/AppHelper;)Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;
    .locals 2
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 62
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;->context:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtilImpl;-><init>(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;)V

    return-object v0
.end method

.method public providePresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;)Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenter;
    .locals 11
    .param p7    # Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;
        .annotation runtime Ljavax/inject/Named;
            value = "CacheClearCustomer"
        .end annotation
    .end param
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 47
    new-instance v9, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;

    move-object v10, p0

    iget-object v2, v10, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorModule;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    move-object v0, v9

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/views/components/ViewComponent;Lcom/ibotta/android/mvp/ui/activity/im/error/ImErrorReducer;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;)V

    move-object/from16 v0, p6

    .line 56
    invoke-interface {v0, v9}, Lcom/ibotta/android/mvp/ui/activity/im/ImUiUtil;->setListener(Lcom/ibotta/android/mvp/ui/activity/im/ImDisconnectConfirmationListener;)V

    return-object v9
.end method
