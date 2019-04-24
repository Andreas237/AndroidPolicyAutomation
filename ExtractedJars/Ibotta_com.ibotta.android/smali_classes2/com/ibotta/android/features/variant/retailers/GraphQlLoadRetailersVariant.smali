.class public Lcom/ibotta/android/features/variant/retailers/GraphQlLoadRetailersVariant;
.super Ljava/lang/Object;
.source "GraphQlLoadRetailersVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ExperimentalVariant;
.implements Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;


# instance fields
.field private apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/features/variant/retailers/GraphQlLoadRetailersVariant;)V

    return-void
.end method


# virtual methods
.method public getRetailerModels(Lcom/ibotta/api/ApiResponse;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/ApiResponse;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;"
        }
    .end annotation

    .line 49
    instance-of v0, p1, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;

    if-nez v0, :cond_0

    .line 50
    invoke-static {}, Ljava9/util/Lists;->of()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 52
    :cond_0
    check-cast p1, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlResponse;->getAllRetailers()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getRetailersApiJob(Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;)Lcom/ibotta/android/service/api/job/SingleApiJob;
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/features/variant/retailers/GraphQlLoadRetailersVariant;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v1, p0, Lcom/ibotta/android/features/variant/retailers/GraphQlLoadRetailersVariant;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1, p1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createRetailersCall(Lcom/ibotta/android/graphql/retailer/RetailersGraphQLParams;)Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createSingleApiJob(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p1

    return-object p1
.end method

.method init(Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/features/variant/retailers/GraphQlLoadRetailersVariant;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/features/variant/retailers/GraphQlLoadRetailersVariant;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    return-void
.end method

.method public isGraphQlVariant()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isRetailersApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)Z
    .locals 1

    .line 57
    instance-of v0, p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/android/graphql/retailer/RetailersGraphQlCall;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
