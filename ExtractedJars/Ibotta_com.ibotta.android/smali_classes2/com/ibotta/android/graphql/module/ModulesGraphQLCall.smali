.class public Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;
.super Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;
.source "ModulesGraphQLCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall<",
        "Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;",
        "Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Data;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClient:Lcom/apollographql/apollo/ApolloClient;

.field private contentMax:Ljava/lang/Integer;

.field private contentMin:Ljava/lang/Integer;

.field private heroBoost:Ljava/lang/Boolean;

.field private limit:Ljava/lang/Integer;

.field private final moduleMapper:Lcom/ibotta/android/graphql/mapper/ModuleMapper;

.field private final modulesSaltInterceptor:Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V

    .line 35
    iput-object p2, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    .line 36
    invoke-virtual {p3}, Lcom/ibotta/android/graphql/mapper/Mappers;->getModuleMapper()Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->moduleMapper:Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    .line 37
    iput-object p4, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->modulesSaltInterceptor:Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    return-void
.end method

.method public static synthetic lambda$mapResponse$0(Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Module;)Lcom/ibotta/api/model/base/BaseModule;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->moduleMapper:Lcom/ibotta/android/graphql/mapper/ModuleMapper;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Module;->fragments()Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Module$Fragments;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Module$Fragments;->moduleFragment()Lcom/ibotta/android/graphql/fragment/ModuleFragment;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/mapper/ModuleMapper;->map(Lcom/ibotta/android/graphql/fragment/ModuleFragment;)Lcom/ibotta/api/model/base/Module;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public createApolloCall()Lcom/apollographql/apollo/ApolloCall;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/apollographql/apollo/ApolloCall<",
            "Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Data;",
            ">;"
        }
    .end annotation

    .line 92
    invoke-static {}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery;->builder()Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;

    move-result-object v0

    .line 94
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->limit:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 95
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;->limit(Ljava/lang/Long;)Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;

    .line 97
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->contentMin:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    .line 98
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;->contentMin(Ljava/lang/Long;)Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;

    .line 100
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->contentMax:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    .line 101
    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;->contentMax(Ljava/lang/Long;)Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;

    .line 103
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->heroBoost:Ljava/lang/Boolean;

    if-eqz v1, :cond_3

    .line 104
    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;->heroBoost(Ljava/lang/Boolean;)Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;

    .line 107
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;->products(Z)Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;

    .line 108
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;->includeAvailableRetailers(Z)Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;

    .line 110
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->apolloClient:Lcom/apollographql/apollo/ApolloClient;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Builder;->build()Lcom/ibotta/android/graphql/ModulesGraphQLQuery;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/apollographql/apollo/ApolloClient;->query(Lcom/apollographql/apollo/api/Query;)Lcom/apollographql/apollo/ApolloQueryCall;

    move-result-object v0

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/graphql/modules"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->limit:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 136
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->contentMin:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->contentMax:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->heroBoost:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->products:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 140
    iget-object v1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->includeAvailableRetailers:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getContentMax()Ljava/lang/Integer;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->contentMax:Ljava/lang/Integer;

    return-object v0
.end method

.method public getContentMin()Ljava/lang/Integer;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->contentMin:Ljava/lang/Integer;

    return-object v0
.end method

.method public getHeroBoost()Ljava/lang/Boolean;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->heroBoost:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getLimit()Ljava/lang/Integer;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->limit:Ljava/lang/Integer;

    return-object v0
.end method

.method public getQueryName()Ljava/lang/String;
    .locals 1

    const-string v0, "modules"

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1

    .line 82
    const-class v0, Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;

    return-object v0
.end method

.method public getSalt()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->modulesSaltInterceptor:Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;->getSalt()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    .line 19
    invoke-virtual {p0, p1}, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;

    move-result-object p1

    return-object p1
.end method

.method protected mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "Lcom/ibotta/android/graphql/ModulesGraphQLQuery$Data;",
            ">;)",
            "Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;"
        }
    .end annotation

    .line 120
    new-instance v0, Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;-><init>()V

    .line 123
    invoke-virtual {p1}, Lcom/apollographql/apollo/api/Response;->data()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/graphql/module/-$$Lambda$VpdU1LRjl03whED9CSfgnKBwSf4;->INSTANCE:Lcom/ibotta/android/graphql/module/-$$Lambda$VpdU1LRjl03whED9CSfgnKBwSf4;

    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->getListSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    new-instance v1, Lcom/ibotta/android/graphql/module/-$$Lambda$ModulesGraphQLCall$plMvskVsfq4nME7VHDhWbkuDyKQ;

    invoke-direct {v1, p0}, Lcom/ibotta/android/graphql/module/-$$Lambda$ModulesGraphQLCall$plMvskVsfq4nME7VHDhWbkuDyKQ;-><init>(Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;)V

    .line 122
    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->translateList(Ljava/util/List;Ljava9/util/function/Function;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/module/ModulesGraphQLResponse;->setModules(Ljava/util/List;)V

    return-object v0
.end method

.method public setContentMax(Ljava/lang/Integer;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->contentMax:Ljava/lang/Integer;

    return-void
.end method

.method public setContentMin(Ljava/lang/Integer;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->contentMin:Ljava/lang/Integer;

    return-void
.end method

.method public setHeroBoost(Ljava/lang/Boolean;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->heroBoost:Ljava/lang/Boolean;

    return-void
.end method

.method public setLimit(Ljava/lang/Integer;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->limit:Ljava/lang/Integer;

    return-void
.end method

.method public setSalt(Ljava/lang/String;)V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/graphql/module/ModulesGraphQLCall;->modulesSaltInterceptor:Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;->setSalt(Ljava/lang/String;)V

    return-void
.end method
