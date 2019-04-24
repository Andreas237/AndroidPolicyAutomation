.class public Lcom/ibotta/android/search/recent/LocalRecentSearchService;
.super Ljava/lang/Object;
.source "LocalRecentSearchService.java"

# interfaces
.implements Lcom/ibotta/android/search/RecentSearchService;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final recentSearchTermDao:Lcom/ibotta/android/search/recent/RecentSearchTermDao;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/search/recent/RecentSearchTermDao;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/search/recent/LocalRecentSearchService;->recentSearchTermDao:Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/search/recent/LocalRecentSearchService;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method static synthetic lambda$getSuggestedTerms$0(Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/api/model/search/SuggestedSearchItem;
    .locals 1

    .line 47
    invoke-static {}, Lcom/ibotta/api/model/search/SuggestedSearchItem;->builder()Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;

    move-result-object v0

    .line 48
    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;->searchTerm(Ljava/lang/String;)Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;

    move-result-object p1

    sget-object v0, Lcom/ibotta/api/model/search/SearchType;->RECENT:Lcom/ibotta/api/model/search/SearchType;

    .line 49
    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;->searchType(Lcom/ibotta/api/model/search/SearchType;)Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;

    move-result-object p1

    .line 50
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lcom/ibotta/api/model/search/Highlight;->create(II)Lcom/ibotta/api/model/search/Highlight;

    move-result-object p0

    invoke-static {p0}, Ljava9/util/Lists;->of(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;->highlights(Ljava/util/List;)Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;

    move-result-object p0

    .line 51
    invoke-virtual {p0}, Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;->build()Lcom/ibotta/api/model/search/SuggestedSearchItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public clearAllSuggestedTerms(Lcom/ibotta/android/search/recent/Category;)V
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/search/recent/LocalRecentSearchService;->recentSearchTermDao:Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    invoke-interface {v0, p1}, Lcom/ibotta/android/search/recent/RecentSearchTermDao;->deleteAllSearchTerms(Lcom/ibotta/android/search/recent/Category;)V

    return-void
.end method

.method public clearSuggestedTerm(Ljava/lang/String;Lcom/ibotta/android/search/recent/Category;)V
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/ibotta/android/search/recent/LocalRecentSearchService;->recentSearchTermDao:Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/search/recent/RecentSearchTermDao;->deleteSearchTerm(Ljava/lang/String;Lcom/ibotta/android/search/recent/Category;)V

    return-void
.end method

.method public getSuggestedTerms(Ljava/lang/String;Ljava9/util/Optional;)Lcom/ibotta/api/model/search/SuggestedSearches;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava9/util/Optional<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/ibotta/api/model/search/SuggestedSearches;"
        }
    .end annotation

    const-string v0, "%"

    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 39
    iget-object v1, p0, Lcom/ibotta/android/search/recent/LocalRecentSearchService;->recentSearchTermDao:Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    .line 41
    invoke-virtual {p2}, Ljava9/util/Optional;->isPresent()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/ibotta/android/search/recent/Category;->RETAILER:Lcom/ibotta/android/search/recent/Category;

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/ibotta/android/search/recent/Category;->GLOBAL:Lcom/ibotta/android/search/recent/Category;

    .line 39
    :goto_0
    invoke-interface {v1, v0, p2}, Lcom/ibotta/android/search/recent/RecentSearchTermDao;->getSearchTerms(Ljava/lang/String;Lcom/ibotta/android/search/recent/Category;)Ljava/util/List;

    move-result-object p2

    .line 45
    invoke-static {p2}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p2

    sget-object v0, Lcom/ibotta/android/search/recent/-$$Lambda$sb3QsMdmo_eYoJ1am-vAjNTe8FI;->INSTANCE:Lcom/ibotta/android/search/recent/-$$Lambda$sb3QsMdmo_eYoJ1am-vAjNTe8FI;

    .line 46
    invoke-interface {p2, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p2

    new-instance v0, Lcom/ibotta/android/search/recent/-$$Lambda$LocalRecentSearchService$EAZ5QwU8G35AcAW82-Di5BnD4XI;

    invoke-direct {v0, p1}, Lcom/ibotta/android/search/recent/-$$Lambda$LocalRecentSearchService$EAZ5QwU8G35AcAW82-Di5BnD4XI;-><init>(Ljava/lang/String;)V

    .line 47
    invoke-interface {p2, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p2

    .line 52
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    .line 43
    invoke-static {p1, p2}, Lcom/ibotta/api/model/search/SuggestedSearches;->create(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/api/model/search/SuggestedSearches;

    move-result-object p1

    return-object p1
.end method

.method public onSearchTerm(Ljava/lang/String;Lcom/ibotta/android/search/recent/Category;)V
    .locals 3

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/search/recent/LocalRecentSearchService;->recentSearchTermDao:Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    invoke-interface {v0, p2}, Lcom/ibotta/android/search/recent/RecentSearchTermDao;->clearStaleTerms(Lcom/ibotta/android/search/recent/Category;)V

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/search/recent/LocalRecentSearchService;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Lcom/ibotta/android/search/recent/RecentSearchTerm;

    invoke-direct {v0}, Lcom/ibotta/android/search/recent/RecentSearchTerm;-><init>()V

    .line 71
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/search/recent/RecentSearchTerm;->setSearchText(Ljava/lang/String;)V

    .line 72
    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/search/recent/RecentSearchTerm;->setSearchTextKey(Ljava/lang/String;)V

    .line 73
    iget-object p1, p0, Lcom/ibotta/android/search/recent/LocalRecentSearchService;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p1}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/search/recent/RecentSearchTerm;->setLastSearched(J)V

    .line 74
    invoke-virtual {v0, p2}, Lcom/ibotta/android/search/recent/RecentSearchTerm;->setCategory(Lcom/ibotta/android/search/recent/Category;)V

    .line 76
    iget-object p1, p0, Lcom/ibotta/android/search/recent/LocalRecentSearchService;->recentSearchTermDao:Lcom/ibotta/android/search/recent/RecentSearchTermDao;

    invoke-interface {p1, v0}, Lcom/ibotta/android/search/recent/RecentSearchTermDao;->addSearchTerm(Lcom/ibotta/android/search/recent/RecentSearchTerm;)V

    :cond_0
    return-void
.end method
