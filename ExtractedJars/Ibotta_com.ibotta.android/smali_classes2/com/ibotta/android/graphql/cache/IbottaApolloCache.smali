.class public abstract Lcom/ibotta/android/graphql/cache/IbottaApolloCache;
.super Lcom/apollographql/apollo/cache/normalized/NormalizedCache;
.source "IbottaApolloCache.java"

# interfaces
.implements Lcom/ibotta/android/state/user/LogOutListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/apollographql/apollo/cache/normalized/NormalizedCache;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract find(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)Ljava/util/Set;
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
.end method

.method public abstract get(Ljava/lang/String;)Lcom/apollographql/apollo/cache/normalized/Record;
.end method

.method public abstract getMappedResponse(Ljava/lang/String;)Lcom/ibotta/android/graphql/GraphQLApiResponse;
.end method

.method public abstract invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)V
.end method

.method public abstract invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;Z)V
.end method

.method public abstract put(Lcom/apollographql/apollo/cache/normalized/Record;)V
.end method

.method public abstract putMappedResponse(Ljava/lang/String;Lcom/ibotta/android/graphql/GraphQLApiResponse;)V
.end method

.method public abstract updateOfferAsUnlocked(IZ)V
.end method

.method public abstract updateOffersAsUnlocked(Ljava/util/Collection;Z)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;Z)V"
        }
    .end annotation
.end method

.method public abstract updateRecentlyViewedModuleOffers(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/content/OfferContent;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract updateRecentlyViewedRetailers()V
.end method
