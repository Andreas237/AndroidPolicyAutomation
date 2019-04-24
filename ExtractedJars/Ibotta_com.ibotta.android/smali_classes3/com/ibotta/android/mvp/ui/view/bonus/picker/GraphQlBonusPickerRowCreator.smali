.class public Lcom/ibotta/android/mvp/ui/view/bonus/picker/GraphQlBonusPickerRowCreator;
.super Lcom/ibotta/android/mvp/ui/view/bonus/picker/AbstractBonusPickerRowCreator;
.source "GraphQlBonusPickerRowCreator.java"


# instance fields
.field private bonusesApiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private bonusesResp:Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/account/bonus/BonusPickerReducer;)V
    .locals 0

    .line 28
    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/AbstractBonusPickerRowCreator;-><init>(Lcom/ibotta/android/account/bonus/BonusPickerReducer;)V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GraphQlBonusPickerRowCreator;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    return-void
.end method


# virtual methods
.method public buildDataMap()Ljava/util/LinkedHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap<",
            "Lcom/ibotta/android/mvp/ui/activity/bonus/BonusPickerTab;",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/android/mvp/ui/view/bonus/picker/row/AbstractBonusPickerRow;",
            ">;>;"
        }
    .end annotation

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GraphQlBonusPickerRowCreator;->bonusesApiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GraphQlBonusPickerRowCreator;->bonusesResp:Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;

    .line 68
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/view/bonus/picker/AbstractBonusPickerRowCreator;->buildDataMap()Ljava/util/LinkedHashMap;

    move-result-object v0

    return-object v0
.end method

.method protected getAvailableBonuses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GraphQlBonusPickerRowCreator;->bonusesResp:Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->getAvailableBonuses()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected getCompletedBonuses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GraphQlBonusPickerRowCreator;->bonusesResp:Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->getCompletedBonuses()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected getFeaturedBonuses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/BonusModel;",
            ">;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GraphQlBonusPickerRowCreator;->bonusesResp:Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/bonus/BonusesGraphQLResponse;->getFeaturedBonuses()Ljava/util/List;

    move-result-object v0

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

    .line 34
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 36
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GraphQlBonusPickerRowCreator;->bonusesApiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 37
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GraphQlBonusPickerRowCreator;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v2}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createBonusesCall()Lcom/ibotta/android/graphql/bonus/BonusesGraphQLCall;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GraphQlBonusPickerRowCreator;->bonusesApiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 40
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GraphQlBonusPickerRowCreator;->bonusesApiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 47
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/bonus/picker/GraphQlBonusPickerRowCreator;->bonusesApiJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method
