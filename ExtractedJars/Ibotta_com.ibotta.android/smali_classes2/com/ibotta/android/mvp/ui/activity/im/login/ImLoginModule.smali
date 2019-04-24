.class public Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "ImLoginModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;",
        ">;"
    }
.end annotation


# instance fields
.field private final activity:Landroid/app/Activity;

.field private final viewComponent:Lcom/ibotta/android/views/components/ViewComponent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;Landroid/app/Activity;Lcom/ibotta/android/views/components/ViewComponent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginView;",
            "Landroid/app/Activity;",
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginViewEvents;",
            ">;)V"
        }
    .end annotation

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 24
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;->activity:Landroid/app/Activity;

    .line 25
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    return-void
.end method


# virtual methods
.method public provideImLoginResources()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;
    .locals 2
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 55
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;->activity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;-><init>(Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public provideImLoginValidation()Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidation;
    .locals 1
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 50
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidationImpl;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginValidationImpl;-><init>()V

    return-object v0
.end method

.method public providePresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;)Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenter;
    .locals 11
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 37
    new-instance v9, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;

    move-object v10, p0

    iget-object v4, v10, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginModule;->viewComponent:Lcom/ibotta/android/views/components/ViewComponent;

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object v7, p4

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;Lcom/ibotta/android/views/components/ViewComponent;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginReducer;Lcom/ibotta/android/mvp/ui/activity/im/login/ImLoginResources;)V

    return-object v9
.end method
