.class public Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;
.super Ljava/lang/Object;
.source "GraphQLSearchAsyncImpl.java"

# interfaces
.implements Lcom/ibotta/android/search/async/SearchAsync;


# static fields
.field private static final RELATED_OFFER_RESULT_LIMIT:J = 0xaL

.field private static final SEARCH_RESULT_LIMIT:J = 0x32L


# instance fields
.field private final apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private job:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private jobListener:Lcom/ibotta/android/service/api/job/ApiJobListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final resources:Landroid/content/res/Resources;

.field private final retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

.field private final searchProductsVariant:Lcom/ibotta/android/features/variant/search/SearchProductsVariant;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/graphql/GraphQLCallFactory;Landroid/content/res/Resources;Lcom/ibotta/android/features/variant/search/SearchProductsVariant;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 72
    iput-object p2, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 73
    iput-object p3, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->resources:Landroid/content/res/Resources;

    .line 74
    iput-object p4, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->searchProductsVariant:Lcom/ibotta/android/features/variant/search/SearchProductsVariant;

    .line 75
    iput-object p5, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;Ljava/lang/Integer;)Lcom/ibotta/api/model/search/SearchResults;
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->createSearchResults(Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;Ljava/lang/Integer;)Lcom/ibotta/api/model/search/SearchResults;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;)Lcom/ibotta/api/model/search/SearchResults;
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->createSearchResults(Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;)Lcom/ibotta/api/model/search/SearchResults;

    move-result-object p0

    return-object p0
.end method

.method private createModulesForOfferTagResponse(Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;"
        }
    .end annotation

    .line 201
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 202
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 204
    :cond_0
    new-instance v0, Lcom/ibotta/api/model/base/Module;

    invoke-direct {v0}, Lcom/ibotta/api/model/base/Module;-><init>()V

    .line 205
    iget-object v1, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->resources:Landroid/content/res/Resources;

    const v2, 0x7f1101c7

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/base/Module;->setName(Ljava/lang/String;)V

    .line 206
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    const-class v1, Lcom/ibotta/api/model/content/OfferContent;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/search/async/-$$Lambda$fK_lbopLLX6y7kY6-K2Wt0tlLgo;

    invoke-direct {v2, v1}, Lcom/ibotta/android/search/async/-$$Lambda$fK_lbopLLX6y7kY6-K2Wt0tlLgo;-><init>(Ljava/lang/Class;)V

    .line 207
    invoke-interface {p1, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 208
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 206
    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/base/Module;->setContent(Ljava/util/List;)V

    .line 210
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private createRelatedOffersModuleStream(Ljava/util/List;)Ljava9/util/stream/Stream;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Ljava9/util/stream/Stream<",
            "Lcom/ibotta/api/model/base/Module;",
            ">;"
        }
    .end annotation

    .line 190
    new-instance v0, Lcom/ibotta/api/model/base/Module;

    invoke-direct {v0}, Lcom/ibotta/api/model/base/Module;-><init>()V

    .line 191
    iget-object v1, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->resources:Landroid/content/res/Resources;

    const v2, 0x7f1102c7

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/base/Module;->setName(Ljava/lang/String;)V

    .line 192
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    const-class v1, Lcom/ibotta/api/model/content/OfferContent;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/ibotta/android/search/async/-$$Lambda$fK_lbopLLX6y7kY6-K2Wt0tlLgo;

    invoke-direct {v2, v1}, Lcom/ibotta/android/search/async/-$$Lambda$fK_lbopLLX6y7kY6-K2Wt0tlLgo;-><init>(Ljava/lang/Class;)V

    .line 193
    invoke-interface {p1, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 194
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 192
    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/base/Module;->setContent(Ljava/util/List;)V

    .line 195
    invoke-static {v0}, Ljava9/util/stream/Stream$-CC;->of(Ljava/lang/Object;)Ljava9/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method private createSearchResults(Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;Ljava/lang/Integer;)Lcom/ibotta/api/model/search/SearchResults;
    .locals 3
    .param p2    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 161
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;->getModules()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 163
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;->getRelatedOffers()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->createRelatedOffersModuleStream(Ljava/util/List;)Ljava9/util/stream/Stream;

    move-result-object v1

    .line 158
    invoke-static {v0, v1}, Ljava9/util/stream/Stream$-CC;->concat(Ljava9/util/stream/Stream;Ljava9/util/stream/Stream;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/search/async/-$$Lambda$GraphQLSearchAsyncImpl$Dql1XkDvXVAq2NsvonQliHwRNaU;->INSTANCE:Lcom/ibotta/android/search/async/-$$Lambda$GraphQLSearchAsyncImpl$Dql1XkDvXVAq2NsvonQliHwRNaU;

    .line 165
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 167
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 169
    invoke-static {}, Lcom/ibotta/api/model/search/SearchResults;->builder()Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object v1

    .line 170
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;->getSearchedTerm()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/model/search/SearchResults$Builder;->searchedTerm(Ljava/lang/String;)Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object v1

    .line 171
    invoke-virtual {v1, p2}, Lcom/ibotta/api/model/search/SearchResults$Builder;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object p2

    .line 172
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;->getMisspelling()Lcom/ibotta/api/model/search/Misspelling;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/ibotta/api/model/search/SearchResults$Builder;->misspellingState(Lcom/ibotta/api/model/search/Misspelling;)Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object p2

    .line 173
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/api/model/search/SearchResults$Builder;->searchModules(Ljava/util/List;)Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object p2

    .line 174
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLResponse;->getModules()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Lcom/ibotta/api/model/search/SearchResults$Builder;->hasExactResults(Z)Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object p1

    const/4 p2, 0x0

    .line 175
    invoke-virtual {p1, p2}, Lcom/ibotta/api/model/search/SearchResults$Builder;->offerTagResults(Z)Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object p1

    .line 176
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults$Builder;->build()Lcom/ibotta/api/model/search/SearchResults;

    move-result-object p1

    return-object p1
.end method

.method private createSearchResults(Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;)Lcom/ibotta/api/model/search/SearchResults;
    .locals 2

    .line 180
    invoke-static {}, Lcom/ibotta/api/model/search/SearchResults;->builder()Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object v0

    .line 181
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;->getSearchedTerm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/search/SearchResults$Builder;->searchedTerm(Ljava/lang/String;)Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object v0

    .line 182
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;->getOfferTagResults()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->createModulesForOfferTagResponse(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/search/SearchResults$Builder;->searchModules(Ljava/util/List;)Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/search/Misspelling;->EMPTY:Lcom/ibotta/api/model/search/Misspelling;

    .line 183
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/search/SearchResults$Builder;->misspellingState(Lcom/ibotta/api/model/search/Misspelling;)Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object v0

    .line 184
    invoke-virtual {p1}, Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLResponse;->getOfferTagResults()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const/4 v1, 0x1

    xor-int/2addr p1, v1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/search/SearchResults$Builder;->hasExactResults(Z)Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object p1

    .line 185
    invoke-virtual {p1, v1}, Lcom/ibotta/api/model/search/SearchResults$Builder;->offerTagResults(Z)Lcom/ibotta/api/model/search/SearchResults$Builder;

    move-result-object p1

    .line 186
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults$Builder;->build()Lcom/ibotta/api/model/search/SearchResults;

    move-result-object p1

    return-object p1
.end method

.method static synthetic lambda$createSearchResults$0(Lcom/ibotta/api/model/base/Module;)Z
    .locals 0

    .line 165
    invoke-virtual {p0}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 146
    iget-object v0, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->job:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    .line 147
    iget-object v1, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->jobListener:Lcom/ibotta/android/service/api/job/ApiJobListener;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->job:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/ApiCall;->cancel()V

    :cond_0
    return-void
.end method

.method public isMisspelled(Lcom/ibotta/api/model/search/SearchType;)Z
    .locals 1

    .line 216
    sget-object v0, Lcom/ibotta/api/model/search/SearchType;->MISSPELLING_STRONG:Lcom/ibotta/api/model/search/SearchType;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ibotta/api/model/search/SearchType;->MISSPELLING_MEDIUM:Lcom/ibotta/api/model/search/SearchType;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ibotta/api/model/search/SearchType;->MISSPELLING_WEAK:Lcom/ibotta/api/model/search/SearchType;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public search(Ljava/lang/String;Lcom/ibotta/api/model/search/SearchType;Ljava/lang/Long;Ljava/util/Set;Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)V
    .locals 5
    .param p3    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/ibotta/api/model/search/SearchType;",
            "Ljava/lang/Long;",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/search/async/SearchAsync$SearchContent;",
            ">;",
            "Ljava9/util/function/Consumer<",
            "Lcom/ibotta/api/model/search/SearchResults;",
            ">;",
            "Ljava9/util/function/Consumer<",
            "Ljava/lang/Exception;",
            ">;)V"
        }
    .end annotation

    .line 86
    invoke-virtual {p0}, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->cancel()V

    .line 88
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 89
    sget-object v1, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->RETAILERS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    invoke-interface {p4, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 90
    sget-object v1, Lcom/ibotta/android/graphql/search/SearchContentType;->RETAILER:Lcom/ibotta/android/graphql/search/SearchContentType;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 92
    :cond_0
    sget-object v1, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->OFFERS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    invoke-interface {p4, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 93
    sget-object v1, Lcom/ibotta/android/graphql/search/SearchContentType;->OFFER:Lcom/ibotta/android/graphql/search/SearchContentType;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 95
    :cond_1
    sget-object v1, Lcom/ibotta/android/search/async/SearchAsync$SearchContent;->PRODUCTS:Lcom/ibotta/android/search/async/SearchAsync$SearchContent;

    invoke-interface {p4, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    .line 96
    iget-object p4, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->searchProductsVariant:Lcom/ibotta/android/features/variant/search/SearchProductsVariant;

    invoke-interface {p4, v0}, Lcom/ibotta/android/features/variant/search/SearchProductsVariant;->populateProductContentType(Ljava/util/Set;)V

    .line 99
    :cond_2
    invoke-virtual {p0, p2}, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->isMisspelled(Lcom/ibotta/api/model/search/SearchType;)Z

    move-result p4

    const/4 v1, 0x1

    xor-int/2addr p4, v1

    .line 101
    invoke-static {}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams;->builder()Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;

    move-result-object v2

    const-wide/16 v3, 0xa

    .line 102
    invoke-virtual {v2, v3, v4}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;->relatedOfferResultLimit(J)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;

    move-result-object v2

    const-wide/16 v3, 0x32

    .line 103
    invoke-virtual {v2, v3, v4}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;->searchResultLimit(J)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;

    move-result-object v2

    .line 104
    invoke-virtual {v2, v0}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;->searchContentType(Ljava/util/Set;)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;

    move-result-object v0

    .line 105
    invoke-virtual {v0, p1}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;->term(Ljava/lang/String;)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;

    move-result-object v0

    sget-object v2, Lcom/ibotta/api/model/search/SearchType;->SCANNED:Lcom/ibotta/api/model/search/SearchType;

    if-ne p2, v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    .line 106
    :goto_0
    invoke-virtual {v0, v1}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;->fetchRelatedOffers(Z)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;

    move-result-object v0

    .line 107
    invoke-virtual {v0, p3}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;->retailerId(Ljava/lang/Long;)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;

    move-result-object v0

    .line 108
    invoke-virtual {v0, p4}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;->correctSpelling(Z)Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;

    move-result-object p4

    .line 109
    invoke-virtual {p4}, Lcom/ibotta/android/graphql/search/SearchGraphQLParams$Builder;->build()Lcom/ibotta/android/graphql/search/SearchGraphQLParams;

    move-result-object p4

    .line 111
    sget-object v0, Lcom/ibotta/api/model/search/SearchType;->OFFER_TAG:Lcom/ibotta/api/model/search/SearchType;

    if-ne p2, v0, :cond_4

    .line 112
    iget-object p2, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {p2, p1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOfferTagSearchCall(Ljava/lang/String;)Lcom/ibotta/android/graphql/search/offertag/OfferTagSearchGraphQLCall;

    move-result-object p1

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {p1, p4}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createSearchCall(Lcom/ibotta/android/graphql/search/SearchGraphQLParams;)Lcom/ibotta/android/graphql/search/SearchGraphQLCall;

    move-result-object p1

    .line 113
    :goto_1
    iget-object p2, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->retailerIconOnOfferVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    invoke-interface {p2}, Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;->shouldShowRetailerStackView()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/graphql/BaseProductsDirectiveGraphQLCall;->setIncludeAvailableRetailers(Ljava/lang/Boolean;)V

    .line 115
    new-instance p2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {p2, p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object p2, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->job:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 116
    new-instance p1, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl$1;

    invoke-direct {p1, p0, p3, p5, p6}, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl$1;-><init>(Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;Ljava/lang/Long;Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)V

    iput-object p1, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->jobListener:Lcom/ibotta/android/service/api/job/ApiJobListener;

    .line 140
    iget-object p1, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->job:Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object p2, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->jobListener:Lcom/ibotta/android/service/api/job/ApiJobListener;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 141
    iget-object p1, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    iget-object p2, p0, Lcom/ibotta/android/search/async/GraphQLSearchAsyncImpl;->job:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {p1, p2}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method
