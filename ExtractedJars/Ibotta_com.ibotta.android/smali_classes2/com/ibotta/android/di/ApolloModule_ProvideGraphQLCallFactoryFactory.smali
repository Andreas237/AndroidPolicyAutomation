.class public final Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;
.super Ljava/lang/Object;
.source "ApolloModule_ProvideGraphQLCallFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
        ">;"
    }
.end annotation


# instance fields
.field private final apolloClientProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/ApolloClient;",
            ">;"
        }
    .end annotation
.end field

.field private final ibottaApolloCacheProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;"
        }
    .end annotation
.end field

.field private final mappersProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/Mappers;",
            ">;"
        }
    .end annotation
.end field

.field private final modulesSaltInterceptorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/ApolloClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/Mappers;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;->apolloClientProvider:Ljavax/inject/Provider;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;->mappersProvider:Ljavax/inject/Provider;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;->modulesSaltInterceptorProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/ApolloClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/Mappers;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;",
            ">;)",
            "Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;"
        }
    .end annotation

    .line 64
    new-instance v0, Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/GraphQLCallFactory;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/apollographql/apollo/ApolloClient;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/mapper/Mappers;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;",
            ">;)",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;"
        }
    .end annotation

    .line 53
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 54
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/apollographql/apollo/ApolloClient;

    .line 55
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/graphql/mapper/Mappers;

    .line 56
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;

    .line 52
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;->proxyProvideGraphQLCallFactory(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;)Lcom/ibotta/android/graphql/GraphQLCallFactory;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideGraphQLCallFactory(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;)Lcom/ibotta/android/graphql/GraphQLCallFactory;
    .locals 0

    .line 77
    invoke-static {p0, p1, p2, p3}, Lcom/ibotta/android/di/ApolloModule;->provideGraphQLCallFactory(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/apollographql/apollo/ApolloClient;Lcom/ibotta/android/graphql/mapper/Mappers;Lcom/ibotta/android/graphql/interceptor/ModulesSaltInterceptor;)Lcom/ibotta/android/graphql/GraphQLCallFactory;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 76
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/graphql/GraphQLCallFactory;
    .locals 4

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;->apolloClientProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;->mappersProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;->modulesSaltInterceptorProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/graphql/GraphQLCallFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/ibotta/android/di/ApolloModule_ProvideGraphQLCallFactoryFactory;->get()Lcom/ibotta/android/graphql/GraphQLCallFactory;

    move-result-object v0

    return-object v0
.end method
