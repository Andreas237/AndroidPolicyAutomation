.class public Lcom/ibotta/android/graphql/cache/IbottaApolloNotReadyCacheImpl;
.super Lcom/ibotta/android/graphql/cache/IbottaApolloCache;
.source "IbottaApolloNotReadyCacheImpl.java"


# direct methods
.method public constructor <init>(Lcom/apollographql/apollo/cache/normalized/RecordFieldJsonAdapter;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;-><init>()V

    return-void
.end method


# virtual methods
.method public clearAll()V
    .locals 0

    return-void
.end method

.method public find(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 67
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    return-object p1
.end method

.method public get(Ljava/lang/String;)Lcom/apollographql/apollo/cache/normalized/Record;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getMappedResponse(Ljava/lang/String;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)V
    .locals 0

    return-void
.end method

.method public invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;Z)V
    .locals 0

    return-void
.end method

.method public loadRecord(Ljava/lang/String;Lcom/apollographql/apollo/cache/CacheHeaders;)Lcom/apollographql/apollo/cache/normalized/Record;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Lcom/apollographql/apollo/cache/CacheHeaders;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public merge(Lcom/apollographql/apollo/cache/normalized/Record;Lcom/apollographql/apollo/cache/CacheHeaders;)Ljava/util/Set;
    .locals 0
    .param p1    # Lcom/apollographql/apollo/cache/normalized/Record;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Lcom/apollographql/apollo/cache/CacheHeaders;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/cache/normalized/Record;",
            "Lcom/apollographql/apollo/cache/CacheHeaders;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public onLogOut(Z)V
    .locals 0

    return-void
.end method

.method protected performMerge(Lcom/apollographql/apollo/cache/normalized/Record;Lcom/apollographql/apollo/cache/CacheHeaders;)Ljava/util/Set;
    .locals 0
    .param p1    # Lcom/apollographql/apollo/cache/normalized/Record;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Lcom/apollographql/apollo/cache/CacheHeaders;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/apollographql/apollo/cache/normalized/Record;",
            "Lcom/apollographql/apollo/cache/CacheHeaders;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public put(Lcom/apollographql/apollo/cache/normalized/Record;)V
    .locals 0

    return-void
.end method

.method public putMappedResponse(Ljava/lang/String;Lcom/ibotta/android/graphql/GraphQLApiResponse;)V
    .locals 0

    return-void
.end method

.method public remove(Lcom/apollographql/apollo/cache/normalized/CacheKey;)Z
    .locals 0
    .param p1    # Lcom/apollographql/apollo/cache/normalized/CacheKey;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    const/4 p1, 0x0

    return p1
.end method

.method public updateOfferAsUnlocked(IZ)V
    .locals 0

    return-void
.end method

.method public updateOffersAsUnlocked(Ljava/util/Collection;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation

    return-void
.end method

.method public updateRecentlyViewedModuleOffers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/OfferContent;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public updateRecentlyViewedRetailers()V
    .locals 0

    return-void
.end method
