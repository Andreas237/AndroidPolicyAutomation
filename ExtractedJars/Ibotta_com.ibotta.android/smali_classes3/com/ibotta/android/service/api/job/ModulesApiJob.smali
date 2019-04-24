.class public Lcom/ibotta/android/service/api/job/ModulesApiJob;
.super Lcom/ibotta/android/service/api/job/SingleApiJob;
.source "ModulesApiJob.java"


# instance fields
.field private final favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)V
    .locals 1

    .line 21
    invoke-interface {p2}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createModulesCall()Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;I)V

    .line 22
    iput-object p3, p0, Lcom/ibotta/android/service/api/job/ModulesApiJob;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    .line 23
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/ModulesApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->setSalt(Ljava/lang/String;)V

    .line 24
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/ModulesApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;

    .line 25
    invoke-interface {p4}, Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;->shouldShowRetailerStackView()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    .line 24
    invoke-virtual {p1, p2}, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->setIncludeAvailableRetailers(Ljava/lang/Boolean;)V

    return-void
.end method


# virtual methods
.method protected onBeforeApiCall()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 30
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onBeforeApiCall()V

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ModulesApiJob;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    invoke-virtual {v0}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->isScheduled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/ModulesApiJob;->favoriteRetailerSettingsFlushWorker:Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;

    invoke-virtual {v0}, Lcom/ibotta/android/service/work/favorites/FavoriteRetailerSettingsFlushWorker;->flushNow()V

    :cond_0
    return-void
.end method
