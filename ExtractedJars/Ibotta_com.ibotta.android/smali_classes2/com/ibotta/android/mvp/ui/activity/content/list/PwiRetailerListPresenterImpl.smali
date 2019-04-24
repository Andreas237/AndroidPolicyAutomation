.class public Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "PwiRetailerListPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenter;
.implements Lcom/ibotta/android/views/content/list/ContentListViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenter;",
        "Lcom/ibotta/android/views/content/list/ContentListViewEvents;"
    }
.end annotation


# instance fields
.field private buyableGiftCardsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private contentModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/ContentModel;",
            ">;"
        }
    .end annotation
.end field

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private final pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

.field private final reducer:Lcom/ibotta/android/content/ContentListReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/content/ContentListReducer;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 37
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->contentModels:Ljava/util/List;

    .line 45
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->reducer:Lcom/ibotta/android/content/ContentListReducer;

    .line 46
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 47
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    return-void
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 52
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 54
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->buyableGiftCardsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 55
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v2}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createBuyableGiftCardsGraphQLCall()Lcom/ibotta/android/graphql/buyablegiftcard/BuyableGiftCardsGraphQlCall;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->buyableGiftCardsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 58
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->buyableGiftCardsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 65
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->buyableGiftCardsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onClicked(Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;->getRetailerId()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListView;->showPwiHomeScreen(I)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->contentModels:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 73
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->contentModels:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->pwiApiManager:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->buyableGiftCardsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiApiManager;->getBuyableGiftCardModelsFromJob(Lcom/ibotta/android/service/api/job/SingleApiJob;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->reducer:Lcom/ibotta/android/content/ContentListReducer;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->contentModels:Ljava/util/List;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/content/ContentListReducer;->createContentListViewState(Ljava/util/List;)Lcom/ibotta/android/views/content/list/ContentListViewState;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListView;->updateViewState(Lcom/ibotta/android/views/components/ViewState;)V

    .line 81
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListView;

    invoke-interface {v0, p0}, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListView;->bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 75
    :goto_0
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/content/list/PwiRetailerListView;->finish()V

    return-void
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method
