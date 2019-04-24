.class public final Lcom/ibotta/android/di/ApolloModule_ProvideCacheKeyMatcherFactoryFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideCacheKeyMatcherFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/ibotta/android/di/ApolloModule_ProvideCacheKeyMatcherFactoryFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lcom/ibotta/android/di/ApolloModule_ProvideCacheKeyMatcherFactoryFactory;

    invoke-direct {v0}, Lcom/ibotta/android/di/ApolloModule_ProvideCacheKeyMatcherFactoryFactory;-><init>()V

    sput-object v0, Lcom/ibotta/android/di/ApolloModule_ProvideCacheKeyMatcherFactoryFactory;->INSTANCE:Lcom/ibotta/android/di/ApolloModule_ProvideCacheKeyMatcherFactoryFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/ibotta/android/di/ApolloModule_ProvideCacheKeyMatcherFactoryFactory;
    .locals 1

    .line 27
    sget-object v0, Lcom/ibotta/android/di/ApolloModule_ProvideCacheKeyMatcherFactoryFactory;->INSTANCE:Lcom/ibotta/android/di/ApolloModule_ProvideCacheKeyMatcherFactoryFactory;

    return-object v0
.end method

.method public static provideInstance()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;
    .locals 1

    .line 23
    invoke-static {}, Lcom/ibotta/android/di/ApolloModule_ProvideCacheKeyMatcherFactoryFactory;->proxyProvideCacheKeyMatcherFactory()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    move-result-object v0

    return-object v0
.end method

.method public static proxyProvideCacheKeyMatcherFactory()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;
    .locals 2

    .line 32
    invoke-static {}, Lcom/ibotta/android/di/ApolloModule;->provideCacheKeyMatcherFactory()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    .line 31
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;
    .locals 1

    .line 19
    invoke-static {}, Lcom/ibotta/android/di/ApolloModule_ProvideCacheKeyMatcherFactoryFactory;->provideInstance()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideCacheKeyMatcherFactoryFactory;->get()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;

    move-result-object v0

    return-object v0
.end method
