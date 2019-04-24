.class public Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsModule;
.super Lcom/ibotta/android/mvp/base/AbstractMvpModule;
.source "ImTermsModule.java"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/AbstractMvpModule<",
        "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;",
        ">;"
    }
.end annotation


# instance fields
.field private final vc:Lcom/ibotta/android/views/components/ViewComponent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;Lcom/ibotta/android/views/components/ViewComponent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsView;",
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewState;",
            "Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsViewEvents;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/AbstractMvpModule;-><init>(Lcom/ibotta/android/mvp/base/MvpView;)V

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsModule;->vc:Lcom/ibotta/android/views/components/ViewComponent;

    return-void
.end method


# virtual methods
.method public providePresenter(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenter;
    .locals 9
    .annotation runtime Lcom/ibotta/android/mvp/base/PerActivity;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 32
    new-instance v8, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsModule;->vc:Lcom/ibotta/android/views/components/ViewComponent;

    move-object v0, v8

    move-object v1, p1

    move-object v3, p4

    move-object v4, p2

    move-object v5, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/views/components/ViewComponent;Lcom/ibotta/android/mvp/ui/activity/im/terms/ImTermsReducer;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V

    return-object v8
.end method
