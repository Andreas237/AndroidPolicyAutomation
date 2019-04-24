.class public final Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideApolloClientFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/apollographql/apollo/ApolloClient;",
        ">;"
    }
.end annotation


# instance fields
.field private final cacheFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final cacheKeyResolverProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/cache/normalized/CacheKeyResolver;",
            ">;"
        }
    .end annotation
.end field

.field private final httpCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/cache/http/ApolloHttpCache;",
            ">;"
        }
    .end annotation
.end field

.field private final ibottaApolloLoggerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;",
            ">;"
        }
    .end annotation
.end field

.field private final okHttpClientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/cache/http/ApolloHttpCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/cache/normalized/CacheKeyResolver;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;",
            ">;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;->okHttpClientProvider:Ljavax/inject/Provider;

    .line 36
    iput-object p2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;->httpCacheProvider:Ljavax/inject/Provider;

    .line 37
    iput-object p3, p0, Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;->cacheFactoryProvider:Ljavax/inject/Provider;

    .line 38
    iput-object p4, p0, Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;->cacheKeyResolverProvider:Ljavax/inject/Provider;

    .line 39
    iput-object p5, p0, Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;->ibottaApolloLoggerProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/cache/http/ApolloHttpCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/cache/normalized/CacheKeyResolver;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;",
            ">;)",
            "Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;"
        }
    .end annotation

    .line 72
    new-instance v6, Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v6
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/apollographql/apollo/ApolloClient;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lokhttp3/OkHttpClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/cache/http/ApolloHttpCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/cache/normalized/CacheKeyResolver;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;",
            ">;)",
            "Lcom/apollographql/apollo/ApolloClient;"
        }
    .end annotation

    .line 59
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lokhttp3/OkHttpClient;

    .line 60
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/cache/http/ApolloHttpCache;

    .line 61
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;

    .line 62
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/apollographql/apollo/cache/normalized/CacheKeyResolver;

    .line 63
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;

    .line 58
    invoke-static {p0, p1, p2, p3, p4}, Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;->proxyProvideApolloClient(Lokhttp3/OkHttpClient;Lcom/apollographql/apollo/cache/http/ApolloHttpCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;Lcom/apollographql/apollo/cache/normalized/CacheKeyResolver;Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;)Lcom/apollographql/apollo/ApolloClient;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideApolloClient(Lokhttp3/OkHttpClient;Lcom/apollographql/apollo/cache/http/ApolloHttpCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;Lcom/apollographql/apollo/cache/normalized/CacheKeyResolver;Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;)Lcom/apollographql/apollo/ApolloClient;
    .locals 0

    .line 87
    invoke-static {p0, p1, p2, p3, p4}, Lcom/ibotta/android/di/ApolloModule;->provideApolloClient(Lokhttp3/OkHttpClient;Lcom/apollographql/apollo/cache/http/ApolloHttpCache;Lcom/ibotta/android/graphql/cache/IbottaApolloCacheFactory;Lcom/apollographql/apollo/cache/normalized/CacheKeyResolver;Lcom/ibotta/android/graphql/logger/IbottaApolloLogger;)Lcom/apollographql/apollo/ApolloClient;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 86
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/apollographql/apollo/ApolloClient;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/apollographql/apollo/ApolloClient;
    .locals 5

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;->okHttpClientProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;->httpCacheProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;->cacheFactoryProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;->cacheKeyResolverProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;->ibottaApolloLoggerProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/apollographql/apollo/ApolloClient;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 14
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideApolloClientFactory;->get()Lcom/apollographql/apollo/ApolloClient;

    move-result-object v0

    return-object v0
.end method
