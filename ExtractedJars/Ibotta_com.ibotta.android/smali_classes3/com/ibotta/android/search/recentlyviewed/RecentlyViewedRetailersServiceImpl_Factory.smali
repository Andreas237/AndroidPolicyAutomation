.class public final Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl_Factory;
.super Ljava/lang/Object;
.source "RecentlyViewedRetailersServiceImpl_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;",
        ">;"
    }
.end annotation


# instance fields
.field private final apiWorkSubmitterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;"
        }
    .end annotation
.end field

.field private final graphQLCallFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
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


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl_Factory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl_Factory;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    .line 28
    iput-object p3, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl_Factory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;)",
            "Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl_Factory;"
        }
    .end annotation

    .line 51
    new-instance v0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newRecentlyViewedRetailersServiceImpl(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;)Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;
    .locals 1

    .line 59
    new-instance v0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/cache/IbottaApolloCache;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/service/api/ApiWorkSubmitter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/graphql/GraphQLCallFactory;",
            ">;)",
            "Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;"
        }
    .end annotation

    .line 41
    new-instance v0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;

    .line 42
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 43
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 44
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;-><init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;
    .locals 3

    .line 33
    iget-object v0, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl_Factory;->ibottaApolloCacheProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl_Factory;->apiWorkSubmitterProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl_Factory;->graphQLCallFactoryProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl_Factory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl_Factory;->get()Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;

    move-result-object v0

    return-object v0
.end method
