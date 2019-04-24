.class public abstract Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "BaseGraphQLApiCall.java"

# interfaces
.implements Lcom/ibotta/android/graphql/GraphQLApiCall;
.implements Lcom/ibotta/api/CacheKeyProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Lcom/ibotta/android/graphql/GraphQLApiResponse;",
        "D::",
        "Lcom/apollographql/apollo/api/Operation$Data;",
        ">",
        "Lcom/ibotta/api/BaseApiCall<",
        "TR;>;",
        "Lcom/ibotta/android/graphql/GraphQLApiCall<",
        "TR;TD;>;",
        "Lcom/ibotta/api/CacheKeyProvider;"
    }
.end annotation


# static fields
.field private static final ASYNC_CALL_GIVE_UP:J


# instance fields
.field private final callExecutedCondition:Ljava/util/concurrent/locks/Condition;

.field private final callLock:Ljava/util/concurrent/locks/Lock;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 46
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1e

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->ASYNC_CALL_GIVE_UP:J

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;)V
    .locals 1

    .line 54
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    .line 48
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->callLock:Ljava/util/concurrent/locks/Lock;

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->callLock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->callExecutedCondition:Ljava/util/concurrent/locks/Condition;

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Lcom/ibotta/android/graphql/cache/IbottaApolloCache;
    .locals 0

    .line 43
    iget-object p0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Ljava/util/concurrent/locks/Lock;
    .locals 0

    .line 43
    iget-object p0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->callLock:Ljava/util/concurrent/locks/Lock;

    return-object p0
.end method

.method static synthetic access$400(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Ljava/util/concurrent/locks/Condition;
    .locals 0

    .line 43
    iget-object p0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->callExecutedCondition:Ljava/util/concurrent/locks/Condition;

    return-object p0
.end method

.method static synthetic access$600()J
    .locals 2

    .line 43
    sget-wide v0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->ASYNC_CALL_GIVE_UP:J

    return-wide v0
.end method


# virtual methods
.method protected asLongList(Ljava/util/Collection;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 82
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 85
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 86
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    .line 87
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/json/IbottaJson;",
            "Ljava/io/InputStream;",
            ")TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 43
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/graphql/GraphQLApiResponse;

    move-result-object p1

    return-object p1
.end method

.method public getApiExecution()Lcom/ibotta/api/execution/ApiExecution;
    .locals 2

    .line 72
    new-instance v0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;-><init>(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;Lcom/ibotta/android/graphql/BaseGraphQLApiCall$1;)V

    return-object v0
.end method

.method protected getDataFromListByFirst(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 129
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected getDataSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava9/util/function/Function<",
            "TT;TS;>;)TS;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 104
    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getDirectives()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 77
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected getListSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/util/List;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava9/util/function/Function<",
            "TT;",
            "Ljava/util/List<",
            "TS;>;>;)",
            "Ljava/util/List<",
            "TS;>;"
        }
    .end annotation

    .line 117
    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object p1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method protected abstract mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/api/Response<",
            "TD;>;)TR;"
        }
    .end annotation
.end method

.method protected translateList(Ljava/util/List;Ljava9/util/function/Function;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "S:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava9/util/function/Function<",
            "TT;TS;>;)",
            "Ljava/util/List<",
            "TS;>;"
        }
    .end annotation

    .line 142
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method
