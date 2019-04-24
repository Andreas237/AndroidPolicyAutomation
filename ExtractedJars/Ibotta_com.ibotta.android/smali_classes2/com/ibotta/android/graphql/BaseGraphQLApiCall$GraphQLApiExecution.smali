.class Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;
.super Ljava/lang/Object;
.source "BaseGraphQLApiCall.java"

# interfaces
.implements Lcom/ibotta/api/execution/ApiExecution;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/graphql/BaseGraphQLApiCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "GraphQLApiExecution"
.end annotation


# instance fields
.field private gqlException:Lcom/apollographql/apollo/exception/ApolloException;

.field private gqlResponse:Lcom/apollographql/apollo/api/Response;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/apollographql/apollo/api/Response<",
            "TD;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;


# direct methods
.method private constructor <init>(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;Lcom/ibotta/android/graphql/BaseGraphQLApiCall$1;)V
    .locals 0

    .line 145
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;-><init>(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)V

    return-void
.end method

.method static synthetic access$302(Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;Lcom/apollographql/apollo/api/Response;)Lcom/apollographql/apollo/api/Response;
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->gqlResponse:Lcom/apollographql/apollo/api/Response;

    return-object p1
.end method

.method static synthetic access$502(Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;Lcom/apollographql/apollo/exception/ApolloException;)Lcom/apollographql/apollo/exception/ApolloException;
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->gqlException:Lcom/apollographql/apollo/exception/ApolloException;

    return-object p1
.end method

.method public static synthetic lambda$executeApiCall$0(Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;Ljava/lang/String;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-static {v0}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->access$100(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->getMappedResponse(Ljava/lang/String;)Lcom/ibotta/android/graphql/GraphQLApiResponse;

    move-result-object p1

    return-object p1
.end method

.method static synthetic lambda$executeApiCall$1(Lcom/ibotta/android/graphql/GraphQLApiResponse;)Ljava/lang/String;
    .locals 0

    .line 177
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private waitForExecution(Lcom/apollographql/apollo/ApolloCall;)V
    .locals 3

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-static {v0}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->access$200(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 191
    :try_start_0
    new-instance v0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution$1;-><init>(Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;)V

    invoke-interface {p1, v0}, Lcom/apollographql/apollo/ApolloCall;->enqueue(Lcom/apollographql/apollo/ApolloCall$Callback;)V

    .line 220
    iget-object p1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-static {p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->access$400(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Ljava/util/concurrent/locks/Condition;

    move-result-object p1

    invoke-static {}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->access$600()J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, v2}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 222
    :try_start_1
    new-instance v0, Lcom/apollographql/apollo/exception/ApolloException;

    const-string v1, "Gave up waiting for API call to finish."

    invoke-direct {v0, v1, p1}, Lcom/apollographql/apollo/exception/ApolloException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object v0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->gqlException:Lcom/apollographql/apollo/exception/ApolloException;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 224
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-static {p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->access$200(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :goto_1
    iget-object v0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-static {v0}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->access$200(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method


# virtual methods
.method public abort()V
    .locals 0

    return-void
.end method

.method public executeApiCall(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/api/ApiResponse;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 151
    iget-object p1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->createApolloCall()Lcom/apollographql/apollo/ApolloCall;

    move-result-object p1

    .line 152
    new-instance v0, Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelperImpl;

    iget-object v1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    .line 153
    invoke-static {v1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->access$100(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-direct {v0, v1, p1, v2}, Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelperImpl;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloCall;Lcom/ibotta/android/graphql/GraphQLApiCall;)V

    .line 155
    invoke-interface {v0}, Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelper;->getQueryCacheKey()Ljava/lang/String;

    move-result-object v1

    .line 157
    iget-object v2, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    new-instance v3, Lcom/ibotta/android/graphql/-$$Lambda$BaseGraphQLApiCall$GraphQLApiExecution$g6E_762bBof5Zf-_RZWFQI6LmHY;

    invoke-direct {v3, p0}, Lcom/ibotta/android/graphql/-$$Lambda$BaseGraphQLApiCall$GraphQLApiExecution$g6E_762bBof5Zf-_RZWFQI6LmHY;-><init>(Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;)V

    invoke-virtual {v2, v1, v3}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->getDataSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/graphql/GraphQLApiResponse;

    if-eqz v2, :cond_0

    const-string v3, "HIT"

    goto :goto_0

    :cond_0
    const-string v3, "MISS"

    :goto_0
    if-eqz v2, :cond_1

    .line 160
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    const-string v5, "Mapped response %1$s: cacheKey=%2$s, class=%3$s"

    const/4 v6, 0x3

    .line 161
    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v3, v6, v7

    const/4 v3, 0x1

    aput-object v1, v6, v3

    const/4 v1, 0x2

    aput-object v4, v6, v1

    invoke-static {v5, v6}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez v2, :cond_3

    .line 164
    invoke-direct {p0, p1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->waitForExecution(Lcom/apollographql/apollo/ApolloCall;)V

    .line 166
    iget-object p1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->gqlException:Lcom/apollographql/apollo/exception/ApolloException;

    if-nez p1, :cond_2

    .line 170
    iget-object p1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    iget-object v2, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->gqlResponse:Lcom/apollographql/apollo/api/Response;

    invoke-virtual {p1, v2}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->mapResponse(Lcom/apollographql/apollo/api/Response;)Lcom/ibotta/android/graphql/GraphQLApiResponse;

    move-result-object v2

    .line 172
    invoke-interface {v0}, Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelper;->getQueryCacheKey()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    if-eqz v2, :cond_3

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-static {v0}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->access$100(Lcom/ibotta/android/graphql/BaseGraphQLApiCall;)Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    move-result-object v0

    invoke-virtual {v0, p1, v2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->putMappedResponse(Ljava/lang/String;Lcom/ibotta/android/graphql/GraphQLApiResponse;)V

    .line 177
    iget-object v0, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    sget-object v4, Lcom/ibotta/android/graphql/-$$Lambda$BaseGraphQLApiCall$GraphQLApiExecution$SiKO9qcpbdI4n2J4vvXS1g8y1_4;->INSTANCE:Lcom/ibotta/android/graphql/-$$Lambda$BaseGraphQLApiCall$GraphQLApiExecution$SiKO9qcpbdI4n2J4vvXS1g8y1_4;

    invoke-virtual {v0, v2, v4}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->getDataSafely(Ljava/lang/Object;Ljava9/util/function/Function;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v4, "Saved mapped response: cacheKey=%1$s, class=%2$s"

    .line 178
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v7

    aput-object v0, v1, v3

    invoke-static {v4, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 167
    :cond_2
    new-instance p1, Lcom/ibotta/api/ApiException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to execute GraphQL call: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->this$0:Lcom/ibotta/android/graphql/BaseGraphQLApiCall;

    invoke-virtual {v1}, Lcom/ibotta/android/graphql/BaseGraphQLApiCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/graphql/BaseGraphQLApiCall$GraphQLApiExecution;->gqlException:Lcom/apollographql/apollo/exception/ApolloException;

    invoke-direct {p1, v0, v1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_3
    :goto_2
    return-object v2
.end method

.method public getEndpoint(Lcom/ibotta/api/ApiCall;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public isAborted()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
