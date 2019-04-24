.class public Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;
.super Ljava/lang/Object;
.source "UnifiedAsyncSuggestedSearchService.java"

# interfaces
.implements Lcom/ibotta/android/search/AsyncSuggestedSearchService;


# static fields
.field private static final TYPEAHEAD_MAX_RECENT_SEARCH_RESULTS:I = 0x3


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private dbModel:Lcom/ibotta/api/model/search/SuggestedSearches;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private dbSearchTerm:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final dbService:Lcom/ibotta/android/search/AsyncSuggestedSearchService;

.field private httpModel:Lcom/ibotta/api/model/search/SuggestedSearches;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private httpSearchTerm:Ljava/lang/String;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final httpService:Lcom/ibotta/android/search/AsyncSuggestedSearchService;

.field private final lock:Ljava/util/concurrent/locks/Lock;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/search/AsyncSuggestedSearchService;Lcom/ibotta/android/util/AppHelper;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/search/AsyncSuggestedSearchService;
        .annotation runtime Ljavax/inject/Named;
            value = "AsyncDBService"
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/search/AsyncSuggestedSearchService;
        .annotation runtime Ljavax/inject/Named;
            value = "AsyncHTTPService"
        .end annotation
    .end param

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->lock:Ljava/util/concurrent/locks/Lock;

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->dbService:Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    .line 45
    iput-object p2, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->httpService:Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    .line 46
    iput-object p3, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method private containsKey(Ljava/util/List;Ljava/lang/String;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/search/SuggestedSearchItem;",
            ">;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    .line 124
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/search/SuggestedSearchItem;

    .line 125
    invoke-virtual {v0}, Lcom/ibotta/api/model/search/SuggestedSearchItem;->getSearchTerm()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private getDbItems(Lcom/ibotta/api/model/search/SuggestedSearches;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/search/SuggestedSearches;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/search/SuggestedSearchItem;",
            ">;"
        }
    .end annotation

    .line 116
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SuggestedSearches;->getSuggestedSearchItems()Ljava/util/List;

    move-result-object v0

    .line 117
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x3

    if-le v1, v2, :cond_0

    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SuggestedSearches;->getSearchQuery()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 118
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SuggestedSearches;->getSuggestedSearchItems()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public static synthetic lambda$getSuggestedTerms$0(Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;Ljava/lang/String;Ljava9/util/function/Consumer;Lcom/ibotta/api/model/search/SuggestedSearches;)V
    .locals 0

    .line 56
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->onDatabaseReturn(Ljava/lang/String;Ljava9/util/function/Consumer;Lcom/ibotta/api/model/search/SuggestedSearches;)V

    return-void
.end method

.method public static synthetic lambda$getSuggestedTerms$1(Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;Ljava/lang/String;Ljava9/util/function/Consumer;Lcom/ibotta/api/model/search/SuggestedSearches;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->onHttpReturn(Ljava/lang/String;Ljava9/util/function/Consumer;Lcom/ibotta/api/model/search/SuggestedSearches;)V

    return-void
.end method

.method public static synthetic lambda$getSuggestedTerms$2(Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;Ljava/lang/String;Ljava9/util/function/Consumer;Ljava9/util/Optional;)V
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->dbService:Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    new-instance v1, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$RN_HDqawdbYn_wt38qaE4KhJTvo;

    invoke-direct {v1, p0, p1, p2}, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$RN_HDqawdbYn_wt38qaE4KhJTvo;-><init>(Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;Ljava/lang/String;Ljava9/util/function/Consumer;)V

    invoke-interface {v0, p1, v1, p3}, Lcom/ibotta/android/search/AsyncSuggestedSearchService;->getSuggestedTerms(Ljava/lang/String;Ljava9/util/function/Consumer;Ljava9/util/Optional;)V

    .line 58
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->httpService:Lcom/ibotta/android/search/AsyncSuggestedSearchService;

    new-instance v1, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$pmBOESuGkRCqzdQe_tAtbB1xmh4;

    invoke-direct {v1, p0, p1, p2}, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$pmBOESuGkRCqzdQe_tAtbB1xmh4;-><init>(Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;Ljava/lang/String;Ljava9/util/function/Consumer;)V

    invoke-interface {v0, p1, v1, p3}, Lcom/ibotta/android/search/AsyncSuggestedSearchService;->getSuggestedTerms(Ljava/lang/String;Ljava9/util/function/Consumer;Ljava9/util/Optional;)V

    goto :goto_0

    .line 61
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->httpSearchTerm:Ljava/lang/String;

    .line 62
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/ibotta/api/model/search/SuggestedSearches;->create(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/api/model/search/SuggestedSearches;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->httpModel:Lcom/ibotta/api/model/search/SuggestedSearches;

    :goto_0
    return-void
.end method

.method public static synthetic lambda$onDatabaseReturn$3(Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;Ljava/lang/String;Lcom/ibotta/api/model/search/SuggestedSearches;Ljava9/util/function/Consumer;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->dbSearchTerm:Ljava/lang/String;

    .line 73
    iput-object p2, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->dbModel:Lcom/ibotta/api/model/search/SuggestedSearches;

    .line 74
    invoke-direct {p0, p3, p1}, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->publishWhenBothServicesComplete(Ljava9/util/function/Consumer;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic lambda$onHttpReturn$4(Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;Ljava/lang/String;Lcom/ibotta/api/model/search/SuggestedSearches;Ljava9/util/function/Consumer;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->httpSearchTerm:Ljava/lang/String;

    .line 84
    iput-object p2, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->httpModel:Lcom/ibotta/api/model/search/SuggestedSearches;

    .line 85
    invoke-direct {p0, p3, p1}, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->publishWhenBothServicesComplete(Ljava9/util/function/Consumer;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic lambda$unifyViewModels$5(Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;Lcom/ibotta/api/model/search/SuggestedSearches;Lcom/ibotta/api/model/search/SuggestedSearchItem;)Z
    .locals 0

    .line 109
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SuggestedSearches;->getSuggestedSearchItems()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2}, Lcom/ibotta/api/model/search/SuggestedSearchItem;->getSearchTerm()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->containsKey(Ljava/util/List;Ljava/lang/String;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private onDatabaseReturn(Ljava/lang/String;Ljava9/util/function/Consumer;Lcom/ibotta/api/model/search/SuggestedSearches;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava9/util/function/Consumer<",
            "Lcom/ibotta/api/model/search/SuggestedSearches;",
            ">;",
            "Lcom/ibotta/api/model/search/SuggestedSearches;",
            ")V"
        }
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-instance v1, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$X57uJOA88xYWcRYBlOmWfVpe57A;

    invoke-direct {v1, p0, p1, p3, p2}, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$X57uJOA88xYWcRYBlOmWfVpe57A;-><init>(Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;Ljava/lang/String;Lcom/ibotta/api/model/search/SuggestedSearches;Ljava9/util/function/Consumer;)V

    iget-object p1, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/util/AppHelper;->runWithLock(Ljava/lang/Runnable;Ljava/util/concurrent/locks/Lock;)V

    return-void
.end method

.method private onHttpReturn(Ljava/lang/String;Ljava9/util/function/Consumer;Lcom/ibotta/api/model/search/SuggestedSearches;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava9/util/function/Consumer<",
            "Lcom/ibotta/api/model/search/SuggestedSearches;",
            ">;",
            "Lcom/ibotta/api/model/search/SuggestedSearches;",
            ")V"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-instance v1, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$KRKk8pLWvzXKlB2sD50RGbqdXt8;

    invoke-direct {v1, p0, p1, p3, p2}, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$KRKk8pLWvzXKlB2sD50RGbqdXt8;-><init>(Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;Ljava/lang/String;Lcom/ibotta/api/model/search/SuggestedSearches;Ljava9/util/function/Consumer;)V

    iget-object p1, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/util/AppHelper;->runWithLock(Ljava/lang/Runnable;Ljava/util/concurrent/locks/Lock;)V

    return-void
.end method

.method private publishWhenBothServicesComplete(Ljava9/util/function/Consumer;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "Lcom/ibotta/api/model/search/SuggestedSearches;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->dbModel:Lcom/ibotta/api/model/search/SuggestedSearches;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->dbSearchTerm:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->httpModel:Lcom/ibotta/api/model/search/SuggestedSearches;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->httpSearchTerm:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->dbSearchTerm:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 92
    iget-object p2, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->dbModel:Lcom/ibotta/api/model/search/SuggestedSearches;

    iget-object v0, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->httpModel:Lcom/ibotta/api/model/search/SuggestedSearches;

    invoke-direct {p0, p2, v0}, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->unifyViewModels(Lcom/ibotta/api/model/search/SuggestedSearches;Lcom/ibotta/api/model/search/SuggestedSearches;)Lcom/ibotta/api/model/search/SuggestedSearches;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 93
    iput-object p1, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->dbSearchTerm:Ljava/lang/String;

    .line 94
    iput-object p1, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->dbModel:Lcom/ibotta/api/model/search/SuggestedSearches;

    .line 95
    iput-object p1, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->httpSearchTerm:Ljava/lang/String;

    .line 96
    iput-object p1, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->httpModel:Lcom/ibotta/api/model/search/SuggestedSearches;

    :cond_0
    return-void
.end method

.method private unifyViewModels(Lcom/ibotta/api/model/search/SuggestedSearches;Lcom/ibotta/api/model/search/SuggestedSearches;)Lcom/ibotta/api/model/search/SuggestedSearches;
    .locals 2

    .line 105
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {p0, p1}, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->getDbItems(Lcom/ibotta/api/model/search/SuggestedSearches;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 108
    invoke-virtual {p2}, Lcom/ibotta/api/model/search/SuggestedSearches;->getSuggestedSearchItems()Ljava/util/List;

    move-result-object p2

    .line 107
    invoke-static {p2}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p2

    new-instance v1, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$n0V1TeovL5oDOmWfFYiPFG73A9M;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$n0V1TeovL5oDOmWfFYiPFG73A9M;-><init>(Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;Lcom/ibotta/api/model/search/SuggestedSearches;)V

    .line 109
    invoke-interface {p2, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p2

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/search/-$$Lambda$fqXV-fZynb3_VTQYq-BNpQ0SjGM;

    invoke-direct {v1, v0}, Lcom/ibotta/android/search/-$$Lambda$fqXV-fZynb3_VTQYq-BNpQ0SjGM;-><init>(Ljava/util/List;)V

    .line 110
    invoke-interface {p2, v1}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    .line 112
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SuggestedSearches;->getSearchQuery()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lcom/ibotta/api/model/search/SuggestedSearches;->create(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/api/model/search/SuggestedSearches;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getSuggestedTerms(Ljava/lang/String;Ljava9/util/function/Consumer;Ljava9/util/Optional;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava9/util/function/Consumer<",
            "Lcom/ibotta/api/model/search/SuggestedSearches;",
            ">;",
            "Ljava9/util/Optional<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->appHelper:Lcom/ibotta/android/util/AppHelper;

    new-instance v1, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$rs5PUC9irjsZKpH6pbsObljeWHM;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$rs5PUC9irjsZKpH6pbsObljeWHM;-><init>(Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;Ljava/lang/String;Ljava9/util/function/Consumer;Ljava9/util/Optional;)V

    iget-object p1, p0, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/util/AppHelper;->runWithLock(Ljava/lang/Runnable;Ljava/util/concurrent/locks/Lock;)V

    return-void
.end method
