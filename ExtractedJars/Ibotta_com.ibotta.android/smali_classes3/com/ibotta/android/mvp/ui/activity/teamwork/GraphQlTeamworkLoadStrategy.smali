.class public Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;
.super Lcom/ibotta/android/mvp/ui/activity/teamwork/AbstractTeamworkLoadStrategy;
.source "GraphQlTeamworkLoadStrategy.java"


# instance fields
.field private bonusModelLevels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation
.end field

.field private currentBonusModel:Lcom/ibotta/api/model/BonusModel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private currentSocialBonuses:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/graphql/GraphQLCallFactory;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/teamwork/AbstractTeamworkLoadStrategy;-><init>(Lcom/ibotta/android/state/user/UserState;)V

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    return-void
.end method

.method private findCurrentBonusModel()V
    .locals 2

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;->bonusModelLevels:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 67
    :cond_0
    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$GraphQlTeamworkLoadStrategy$LGD5Jr-ygWbsYEzQ5LlKni2eipk;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$GraphQlTeamworkLoadStrategy$LGD5Jr-ygWbsYEzQ5LlKni2eipk;

    .line 68
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$GraphQlTeamworkLoadStrategy$sZ4DMWnb7XjavnDrUOx9r2PjSmY;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/teamwork/-$$Lambda$GraphQlTeamworkLoadStrategy$sZ4DMWnb7XjavnDrUOx9r2PjSmY;

    .line 69
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->reduce(Ljava9/util/function/BinaryOperator;)Ljava9/util/Optional;

    move-result-object v0

    const/4 v1, 0x0

    .line 70
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/BonusModel;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;->currentBonusModel:Lcom/ibotta/api/model/BonusModel;

    return-void
.end method

.method static synthetic lambda$findCurrentBonusModel$0(Lcom/ibotta/api/model/BonusModel;)Z
    .locals 0

    .line 68
    invoke-interface {p0}, Lcom/ibotta/api/model/BonusModel;->isLocked()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method static synthetic lambda$findCurrentBonusModel$1(Lcom/ibotta/api/model/BonusModel;Lcom/ibotta/api/model/BonusModel;)Lcom/ibotta/api/model/BonusModel;
    .locals 0

    return-object p1
.end method


# virtual methods
.method public getCurrentLevel()Lcom/ibotta/api/model/BonusModel;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;->currentBonusModel:Lcom/ibotta/api/model/BonusModel;

    return-object v0
.end method

.method public getFetchJobs()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 35
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/AbstractTeamworkLoadStrategy;->getFetchJobs()Ljava/util/Set;

    move-result-object v0

    .line 37
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;->currentSocialBonuses:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 38
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 39
    invoke-interface {v2}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createCurrentSocialBonusesCall()Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLCall;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;->currentSocialBonuses:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 42
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;->currentSocialBonuses:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getLevels()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;->bonusModelLevels:Ljava/util/List;

    if-nez v0, :cond_0

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    :cond_0
    return-object v0
.end method

.method public isShowEmptyBonuses()Z
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;->currentBonusModel:Lcom/ibotta/api/model/BonusModel;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;->bonusModelLevels:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onAbandonFetchJobs()V
    .locals 1

    .line 49
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/AbstractTeamworkLoadStrategy;->onAbandonFetchJobs()V

    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;->currentSocialBonuses:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onFetchFinishedSuccessfully()V
    .locals 1

    .line 55
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/AbstractTeamworkLoadStrategy;->onFetchFinishedSuccessfully()V

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;->currentSocialBonuses:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLResponse;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/bonus/CurrentSocialBonusesGraphQLResponse;->getBonuses()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;->bonusModelLevels:Ljava/util/List;

    .line 58
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/teamwork/GraphQlTeamworkLoadStrategy;->findCurrentBonusModel()V

    return-void
.end method
