.class public final Lcom/ibotta/android/di/ApolloModule_ProvideHttpCacheFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideHttpCacheFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/apollographql/apollo/cache/http/ApolloHttpCache;",
        ">;"
    }
.end annotation


# instance fields
.field private final httpCacheStoreProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/api/cache/http/HttpCacheStore;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/api/cache/http/HttpCacheStore;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideHttpCacheFactory;->httpCacheStoreProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideHttpCacheFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/api/cache/http/HttpCacheStore;",
            ">;)",
            "Lcom/ibotta/android/di/ApolloModule_ProvideHttpCacheFactory;"
        }
    .end annotation

    .line 32
    new-instance v0, Lcom/ibotta/android/di/ApolloModule_ProvideHttpCacheFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/ApolloModule_ProvideHttpCacheFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/apollographql/apollo/cache/http/ApolloHttpCache;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/api/cache/http/HttpCacheStore;",
            ">;)",
            "Lcom/apollographql/apollo/cache/http/ApolloHttpCache;"
        }
    .end annotation

    .line 27
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/apollographql/apollo/api/cache/http/HttpCacheStore;

    invoke-static {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideHttpCacheFactory;->proxyProvideHttpCache(Lcom/apollographql/apollo/api/cache/http/HttpCacheStore;)Lcom/apollographql/apollo/cache/http/ApolloHttpCache;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideHttpCache(Lcom/apollographql/apollo/api/cache/http/HttpCacheStore;)Lcom/apollographql/apollo/cache/http/ApolloHttpCache;
    .locals 1

    .line 37
    invoke-static {p0}, Lcom/ibotta/android/di/ApolloModule;->provideHttpCache(Lcom/apollographql/apollo/api/cache/http/HttpCacheStore;)Lcom/apollographql/apollo/cache/http/ApolloHttpCache;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 36
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/apollographql/apollo/cache/http/ApolloHttpCache;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/apollographql/apollo/cache/http/ApolloHttpCache;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/di/ApolloModule_ProvideHttpCacheFactory;->httpCacheStoreProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideHttpCacheFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/apollographql/apollo/cache/http/ApolloHttpCache;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideHttpCacheFactory;->get()Lcom/apollographql/apollo/cache/http/ApolloHttpCache;

    move-result-object v0

    return-object v0
.end method
