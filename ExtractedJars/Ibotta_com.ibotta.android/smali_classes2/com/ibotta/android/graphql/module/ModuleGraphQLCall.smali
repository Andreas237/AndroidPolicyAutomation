.class public Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;
.source "ModuleGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall<",
        "Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;",
        "Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private expand:Ljava/lang/Boolean;

.field private heroBoost:Ljava/lang/Boolean;

.field private id:Ljava/lang/String;

.field private final moduleMapper:Lcom/ibotta/android/graphql/mapper/ModuleMapper;

.field private final modulesSaltInterceptor:Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Ljava/lang/String;Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 27
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->expand:Ljava/lang/Boolean;

    .line 37
    iput-object p2, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 38
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getModuleMapper()Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->moduleMapper:Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    .line 39
    iput-object p4, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->id:Ljava/lang/String;

    .line 40
    iput-object p5, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->modulesSaltInterceptor:Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    return-void
.end method

.method public static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module;)Lcom/ibotta/api/model/base/Module;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->moduleMapper:Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module;->fragments()Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module$Fragments;->moduleFragment()Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->map(Lcom/ibotta/android/graphql/fragment/ModuleFragment;)Lcom/ibotta/api/model/base/Module;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 87
    invoke-static {}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery;->builder()Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;

    move-result-object v0

    .line 89
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->id:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 90
    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->id(Ljava/lang/String;)Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;

    .line 92
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->heroBoost:Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    .line 93
    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->heroBoost(Ljava/lang/Boolean;)Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;

    .line 96
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->expand:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->expand(Ljava/lang/Boolean;)Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;

    .line 97
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->products(Z)Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;

    .line 98
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;

    .line 100
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/ModuleGraphQLQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/module"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->expand:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->heroBoost:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 129
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getExpand()Ljava/lang/Boolean;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->expand:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getHeroBoost()Ljava/lang/Boolean;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->heroBoost:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "module"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 77
    const-class v0, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;

    return-object v0
.end method

.method public getSalt()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->modulesSaltInterceptor:Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;->getSalt()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 21
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;"
        }
    .end annotation

    .line 110
    new-instance v0, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;-><init>()V

    .line 113
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/module/-$$Lambda$jf-vIHVCo0Nfl2EgKRp-BHRyVWI;->INSTANCE:Lcom/ibotta/android/graphql/module/-$$Lambda$jf-vIHVCo0Nfl2EgKRp-BHRyVWI;

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->getDataSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/graphql/ModuleGraphQLQuery$Module;

    new-instance v1, Lcom/ibotta/android/graphql/module/-$$Lambda$ModuleGraphQLCall$PpDrAFLc7_e4FfIEcp9EIrszlU8;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/module/-$$Lambda$ModuleGraphQLCall$PpDrAFLc7_e4FfIEcp9EIrszlU8;-><init>(Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;)V

    .line 112
    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->getDataSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/base/BaseModule;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/module/ModuleGraphQLResponse;->setModule(Lcom/ibotta/api/model/base/BaseModule;)V

    return-object v0
.end method

.method public setExpand(Ljava/lang/Boolean;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->expand:Ljava/lang/Boolean;

    return-void
.end method

.method public setHeroBoost(Ljava/lang/Boolean;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->heroBoost:Ljava/lang/Boolean;

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->id:Ljava/lang/String;

    return-void
.end method

.method public setSalt(Ljava/lang/String;)V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModuleGraphQLCall;->modulesSaltInterceptor:Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;->setSalt(Ljava/lang/String;)V

    return-void
.end method
