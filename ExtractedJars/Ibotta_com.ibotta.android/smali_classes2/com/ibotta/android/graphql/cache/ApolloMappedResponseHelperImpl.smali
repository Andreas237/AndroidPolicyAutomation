.class public Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelperImpl;
.super Ljava/lang/Object;
.source "ApolloMappedResponseHelperImpl.java"

# interfaces
.implements Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelper;


# static fields
.field private static final CACHE_KEY_GROUP:I = 0x1

.field private static final CACHE_KEY_REGEX:Ljava/lang/String; = "^(.*\\(.*\\))(\\.\\d+)?$"


# instance fields
.field private final apolloCall:Lcom/apollographql/apollo/ApolloCall;

.field private final graphQLApiCall:Lcom/ibotta/android/graphql/GraphQLApiCall;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

.field private final pattern:Ljava/util/regex/Pattern;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloCall;Lcom/ibotta/android/graphql/GraphQLApiCall;)V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "^(.*\\(.*\\))(\\.\\d+)?$"

    .line 57
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelperImpl;->pattern:Ljava/util/regex/Pattern;

    .line 61
    iput-object p1, p0, Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelperImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 62
    iput-object p2, p0, Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelperImpl;->apolloCall:Lcom/apollographql/apollo/ApolloCall;

    .line 63
    iput-object p3, p0, Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelperImpl;->graphQLApiCall:Lcom/ibotta/android/graphql/GraphQLApiCall;

    return-void
.end method

.method public static synthetic lambda$getQueryCacheKey$0(Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelperImpl;Ljava/lang/String;)Ljava/util/regex/Matcher;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelperImpl;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    return-object p1
.end method

.method static synthetic lambda$getQueryCacheKey$1(Ljava/util/regex/Matcher;)Z
    .locals 0

    .line 78
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public getQueryCacheKey()Ljava/lang/String;
    .locals 6
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelperImpl;->apolloCall:Lcom/apollographql/apollo/ApolloCall;

    invoke-interface {v0}, Lcom/apollographql/apollo/ApolloCall;->operation()Lcom/apollographql/apollo/api/Operation;

    move-result-object v0

    invoke-interface {v0}, Lcom/apollographql/apollo/api/Operation;->variables()Lcom/apollographql/apollo/api/Operation$Variables;

    move-result-object v0

    invoke-virtual {v0}, Lcom/apollographql/apollo/api/Operation$Variables;->valueMap()Ljava/util/Map;

    move-result-object v0

    .line 69
    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelperImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    new-instance v2, Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;

    iget-object v3, p0, Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelperImpl;->graphQLApiCall:Lcom/ibotta/android/graphql/GraphQLApiCall;

    .line 70
    invoke-interface {v3}, Lcom/ibotta/android/graphql/GraphQLApiCall;->getQueryName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelperImpl;->graphQLApiCall:Lcom/ibotta/android/graphql/GraphQLApiCall;

    invoke-interface {v4}, Lcom/ibotta/android/graphql/GraphQLApiCall;->getDirectives()Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v0, v4}, Lcom/ibotta/android/graphql/cache/matchers/QueryCacheKeyMatcher;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;)V

    .line 69
    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->find(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)Ljava/util/Set;

    move-result-object v0

    .line 72
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    .line 76
    :cond_0
    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v1

    new-instance v3, Lcom/ibotta/android/graphql/cache/-$$Lambda$ApolloMappedResponseHelperImpl$hOnZ_JlkuGj9iGtqziCHb4eW8cw;

    invoke-direct {v3, p0}, Lcom/ibotta/android/graphql/cache/-$$Lambda$ApolloMappedResponseHelperImpl$hOnZ_JlkuGj9iGtqziCHb4eW8cw;-><init>(Lcom/ibotta/android/graphql/cache/ApolloMappedResponseHelperImpl;)V

    .line 77
    invoke-interface {v1, v3}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v1

    sget-object v3, Lcom/ibotta/android/graphql/cache/-$$Lambda$ApolloMappedResponseHelperImpl$SvPtfhv0SXGK3ZCof-HKVKJjLs0;->INSTANCE:Lcom/ibotta/android/graphql/cache/-$$Lambda$ApolloMappedResponseHelperImpl$SvPtfhv0SXGK3ZCof-HKVKJjLs0;

    .line 78
    invoke-interface {v1, v3}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v1

    .line 79
    invoke-interface {v1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object v1

    .line 83
    invoke-virtual {v1}, Ljava9/util/Optional;->isPresent()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    .line 84
    invoke-virtual {v1}, Ljava9/util/Optional;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/regex/Matcher;

    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    :cond_1
    const-string v1, "%1$d cache keys found. Derived queryCacheKey is: %2$s"

    const/4 v3, 0x2

    .line 87
    new-array v3, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v5

    aput-object v2, v3, v4

    invoke-static {v1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2
.end method
