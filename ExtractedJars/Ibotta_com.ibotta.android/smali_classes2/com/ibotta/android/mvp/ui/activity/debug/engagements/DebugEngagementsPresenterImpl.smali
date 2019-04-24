.class public Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "DebugEngagementsPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenter;"
    }
.end annotation


# instance fields
.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private selectedType:Lcom/ibotta/api/model/TaskModel$Type;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private typeMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/TaskModel$Type;",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 33
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->typeMap:Ljava/util/Map;

    .line 39
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    return-void
.end method

.method private buildRows(Lcom/ibotta/api/model/TaskModel$Type;Ljava/util/Set;)Ljava/util/List;
    .locals 5
    .param p2    # Ljava/util/Set;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/TaskModel$Type;",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;",
            ">;"
        }
    .end annotation

    .line 115
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p2, :cond_0

    return-object v0

    .line 121
    :cond_0
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 122
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v3

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getRewards()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v2, v3, p1, v4, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;-><init>(ILcom/ibotta/api/model/TaskModel$Type;Ljava/lang/String;I)V

    .line 124
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private getSortedTypes()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/TaskModel$Type;",
            ">;"
        }
    .end annotation

    .line 92
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->typeMap:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 93
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/RewardTypeComparator;

    invoke-direct {v1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/RewardTypeComparator;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method private initTypeMap(Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;)V
    .locals 5

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->typeMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 100
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/OfferModel;

    .line 101
    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getRewards()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/RewardModel;

    .line 102
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->typeMap:Ljava/util/Map;

    invoke-interface {v2}, Lcom/ibotta/api/model/RewardModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    if-nez v3, :cond_1

    .line 105
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 106
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->typeMap:Ljava/util/Map;

    invoke-interface {v2}, Lcom/ibotta/api/model/RewardModel;->getTypeEnum()Lcom/ibotta/api/model/TaskModel$Type;

    move-result-object v2

    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    :cond_1
    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
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

    .line 44
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 46
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 50
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOffersCall()Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;

    move-result-object v1

    const v2, 0x7fffffff

    .line 51
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->setLimit(Ljava/lang/Integer;)V

    const/4 v2, 0x0

    .line 52
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OffersGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 54
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 57
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 64
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 4

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->offersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    return-void

    .line 73
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;

    .line 75
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->initTypeMap(Lcom/ibotta/android/graphql/offer/OffersGraphQLResponse;)V

    .line 77
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->getSortedTypes()Ljava/util/List;

    move-result-object v0

    .line 79
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 80
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/TaskModel$Type;

    .line 81
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->typeMap:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Set;

    invoke-direct {p0, v2, v3}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->buildRows(Lcom/ibotta/api/model/TaskModel$Type;Ljava/util/Set;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 84
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->selectedType:Lcom/ibotta/api/model/TaskModel$Type;

    if-eqz v0, :cond_2

    .line 85
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->onTypeSelected(Lcom/ibotta/api/model/TaskModel$Type;)V

    goto :goto_1

    .line 87
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;->setRows(Ljava/util/List;)V

    :goto_1
    return-void
.end method

.method public onRowClicked(Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;)V
    .locals 3

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;

    const/4 v1, 0x1

    new-array v1, v1, [I

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsRow;->getOfferId()I

    move-result p1

    const/4 v2, 0x0

    aput p1, v1, v2

    const/4 p1, 0x0

    invoke-interface {v0, p1, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;->showOfferSpotlight(Ljava/lang/Integer;Ljava/lang/Integer;[I)V

    return-void
.end method

.method public onTypeSelected(Lcom/ibotta/api/model/TaskModel$Type;)V
    .locals 2

    .line 132
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->selectedType:Lcom/ibotta/api/model/TaskModel$Type;

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->typeMap:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    invoke-direct {p0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsPresenterImpl;->buildRows(Lcom/ibotta/api/model/TaskModel$Type;Ljava/util/Set;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/debug/engagements/DebugEngagementsView;->setRows(Ljava/util/List;)V

    return-void
.end method
