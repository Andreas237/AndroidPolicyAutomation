.class public Lcom/ibotta/android/reducers/search/SearchResultsReducer;
.super Ljava/lang/Object;
.source "SearchResultsReducer.java"


# instance fields
.field private final contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

.field private final ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

.field private final misspellingReducer:Lcom/ibotta/android/search/MisspellingReducer;

.field private final resources:Landroid/content/res/Resources;

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lcom/ibotta/android/content/ContentListReducerUtil;Lcom/ibotta/android/search/MisspellingReducer;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;Lcom/ibotta/android/title/TitleBarReducer;)V
    .locals 0
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->resources:Landroid/content/res/Resources;

    .line 59
    iput-object p2, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

    .line 60
    iput-object p3, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->misspellingReducer:Lcom/ibotta/android/search/MisspellingReducer;

    .line 61
    iput-object p4, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    .line 62
    iput-object p5, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    return-void
.end method

.method private addTrackingDataToPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Lcom/ibotta/api/model/search/SearchResults;Ljava/lang/String;I)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
    .locals 0

    .line 200
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toBuilder()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 201
    invoke-virtual {p2}, Lcom/ibotta/api/model/search/SearchResults;->getSearchedTerm()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->term(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 202
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->moduleIndex(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 203
    invoke-virtual {p1, p3}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->moduleName(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 204
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    return-object p1
.end method

.method private getCards(Lcom/ibotta/api/model/search/SearchResults;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/search/SearchResults;",
            "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    .line 177
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getSearchModules()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/reducers/search/-$$Lambda$jnINpZkQYaosRLNHuYhy-hZSw1A;->INSTANCE:Lcom/ibotta/android/reducers/search/-$$Lambda$jnINpZkQYaosRLNHuYhy-hZSw1A;

    .line 178
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$lZueAkese47BX8Focb7PKl_I5Pc;->INSTANCE:Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$lZueAkese47BX8Focb7PKl_I5Pc;

    .line 179
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$8fefKmfokv4Z5F_FSotH8sDrffo;->INSTANCE:Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$8fefKmfokv4Z5F_FSotH8sDrffo;

    .line 183
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$R61FoRvq5lpCeAW7sPRd_wUNDZE;

    invoke-direct {v1, p0, p2, p1}, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$R61FoRvq5lpCeAW7sPRd_wUNDZE;-><init>(Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Lcom/ibotta/api/model/search/SearchResults;)V

    .line 184
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->flatMap(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 188
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method private getInformationRowStream(Lcom/ibotta/api/model/search/SearchResults;)Ljava9/util/stream/Stream;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/search/SearchResults;",
            ")",
            "Ljava9/util/stream/Stream<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    .line 107
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->isHasExactResults()Z

    move-result v0

    if-nez v0, :cond_0

    .line 108
    invoke-static {}, Ljava9/util/stream/Stream$-CC;->empty()Ljava9/util/stream/Stream;

    move-result-object p1

    return-object p1

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->misspellingReducer:Lcom/ibotta/android/search/MisspellingReducer;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/search/MisspellingReducer;->createInformationRow(Lcom/ibotta/api/model/search/SearchResults;)Lcom/ibotta/android/views/base/info/InformationRowViewState;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/Stream$-CC;->ofNullable(Ljava/lang/Object;)Ljava9/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method private getMarginForSection(IZ)I
    .locals 0
    .annotation build Landroid/support/annotation/DimenRes;
    .end annotation

    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    const p1, 0x7f07018d

    return p1

    :cond_0
    if-nez p1, :cond_1

    const p1, 0x7f07015c

    return p1

    :cond_1
    const p1, 0x7f0701a3

    return p1
.end method

.method private getNoResultsStream(Lcom/ibotta/api/model/search/SearchResults;)Ljava9/util/stream/Stream;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/search/SearchResults;",
            ")",
            "Ljava9/util/stream/Stream<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    .line 98
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->isHasExactResults()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    invoke-static {}, Ljava9/util/stream/Stream$-CC;->empty()Ljava9/util/stream/Stream;

    move-result-object p1

    return-object p1

    .line 101
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->misspellingReducer:Lcom/ibotta/android/search/MisspellingReducer;

    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getMisspellingState()Lcom/ibotta/api/model/search/Misspelling;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/search/MisspellingReducer;->createEmptyView(Lcom/ibotta/api/model/search/Misspelling;)Lcom/ibotta/android/views/empty/EmptyViewState;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/stream/Stream$-CC;->of(Ljava/lang/Object;)Ljava9/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method private getRelatedOffersModuleTitle()Ljava/lang/String;
    .locals 2

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->resources:Landroid/content/res/Resources;

    const v1, 0x7f1101c7

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getRows(Lcom/ibotta/api/model/search/SearchResults;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/search/SearchResults;",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;",
            "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x3

    .line 85
    new-array v0, v0, [Ljava9/util/stream/Stream;

    .line 86
    invoke-direct {p0, p1}, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->getNoResultsStream(Lcom/ibotta/api/model/search/SearchResults;)Ljava9/util/stream/Stream;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 87
    invoke-direct {p0, p1}, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->getInformationRowStream(Lcom/ibotta/api/model/search/SearchResults;)Ljava9/util/stream/Stream;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 88
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->getSearchContentStream(Lcom/ibotta/api/model/search/SearchResults;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava9/util/stream/Stream;

    move-result-object p1

    const/4 p2, 0x2

    aput-object p1, v0, p2

    .line 85
    invoke-static {v0}, Ljava9/util/stream/Stream$-CC;->of([Ljava/lang/Object;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 92
    invoke-static {}, Ljava9/util/function/Function$-CC;->identity()Ljava9/util/function/Function;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->flatMap(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 93
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method private getSearchContentStream(Lcom/ibotta/api/model/search/SearchResults;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava9/util/stream/Stream;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/search/SearchResults;",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;",
            "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
            ")",
            "Ljava9/util/stream/Stream<",
            "Lcom/ibotta/android/views/list/ContentViewState;",
            ">;"
        }
    .end annotation

    .line 119
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x0

    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 121
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getSearchModules()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v6

    new-instance v7, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$fdm6AQqkLvsGhdeFsJfUcBEzpAI;

    move-object v0, v7

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$fdm6AQqkLvsGhdeFsJfUcBEzpAI;-><init>(Lcom/ibotta/android/reducers/search/SearchResultsReducer;Ljava/util/concurrent/atomic/AtomicInteger;Lcom/ibotta/api/model/search/SearchResults;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)V

    invoke-interface {v6, v7}, Ljava9/util/stream/Stream;->flatMap(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method static synthetic lambda$getCards$3(Ljava/util/List;)Ljava/util/List;
    .locals 2

    .line 179
    invoke-static {p0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p0

    const-class v0, Lcom/ibotta/api/model/OfferModel;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/reducers/search/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;

    invoke-direct {v1, v0}, Lcom/ibotta/android/reducers/search/-$$Lambda$FByiZr1DR_RWLtIHmSsCycoe-pg;-><init>(Ljava/lang/Class;)V

    .line 180
    invoke-interface {p0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p0

    const-class v0, Lcom/ibotta/api/model/OfferModel;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/ibotta/android/reducers/search/-$$Lambda$CZAbKqRAvs47OG_2XwwtfYdouk0;

    invoke-direct {v1, v0}, Lcom/ibotta/android/reducers/search/-$$Lambda$CZAbKqRAvs47OG_2XwwtfYdouk0;-><init>(Ljava/lang/Class;)V

    .line 181
    invoke-interface {p0, v1}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p0

    .line 182
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method static synthetic lambda$getCards$4(Ljava/util/List;)Z
    .locals 0

    .line 183
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static synthetic lambda$getCards$5(Lcom/ibotta/android/reducers/search/SearchResultsReducer;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Lcom/ibotta/api/model/search/SearchResults;Ljava/util/List;)Ljava9/util/stream/Stream;
    .locals 3

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

    .line 185
    invoke-direct {p0, p3}, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->mapToDisplayContent(Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    .line 187
    invoke-direct {p0}, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->getRelatedOffersModuleTitle()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, p1, p2, v1, v2}, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->addTrackingDataToPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Lcom/ibotta/api/model/search/SearchResults;Ljava/lang/String;I)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    .line 184
    invoke-virtual {v0, p3, p1}, Lcom/ibotta/android/content/ContentListReducerUtil;->stream(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava9/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic lambda$getSearchContentStream$0(Lcom/ibotta/android/reducers/search/SearchResultsReducer;Ljava/util/concurrent/atomic/AtomicInteger;Lcom/ibotta/api/model/search/SearchResults;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Lcom/ibotta/api/model/base/Module;)Ljava9/util/stream/Stream;
    .locals 4

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    .line 124
    invoke-virtual {p5}, Lcom/ibotta/api/model/base/Module;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object v1

    .line 125
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    invoke-virtual {p2}, Lcom/ibotta/api/model/search/SearchResults;->isHasExactResults()Z

    move-result v3

    invoke-direct {p0, v2, v3}, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->getMarginForSection(IZ)I

    move-result v2

    .line 123
    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;I)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/Stream$-CC;->of(Ljava/lang/Object;)Ljava9/util/stream/Stream;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->contentListReducerUtil:Lcom/ibotta/android/content/ContentListReducerUtil;

    .line 127
    invoke-virtual {p5}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v2

    sget-object v3, Lcom/ibotta/android/views/content/ContentStyle;->ROW:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-direct {p0, v2, p3, v3}, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->mapToDisplayContent(Ljava/util/List;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/views/content/ContentStyle;)Ljava/util/List;

    move-result-object p3

    .line 131
    invoke-virtual {p5}, Lcom/ibotta/api/model/base/Module;->getName()Ljava/lang/String;

    move-result-object p5

    .line 132
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    .line 128
    invoke-direct {p0, p4, p2, p5, p1}, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->addTrackingDataToPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Lcom/ibotta/api/model/search/SearchResults;Ljava/lang/String;I)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    .line 126
    invoke-virtual {v1, p3, p1}, Lcom/ibotta/android/content/ContentListReducerUtil;->stream(Ljava/util/List;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 122
    invoke-static {v0, p1}, Ljava9/util/stream/Stream$-CC;->concat(Ljava9/util/stream/Stream;Ljava9/util/stream/Stream;)Ljava9/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method static synthetic lambda$mapToDisplayContent$1(Lcom/ibotta/android/views/content/ContentStyle;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/api/model/base/BaseContent;)Lcom/ibotta/android/content/DisplayContent;
    .locals 2

    .line 140
    sget-object v0, Lcom/ibotta/android/reducers/search/SearchResultsReducer$1;->$SwitchMap$com$ibotta$api$model$ContentModel$Type:[I

    invoke-virtual {p2}, Lcom/ibotta/api/model/base/BaseContent;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/api/model/ContentModel$Type;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 151
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/ibotta/api/model/base/BaseContent;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " is not valid here"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 149
    :pswitch_0
    new-instance p1, Lcom/ibotta/android/content/ProductDisplayContent;

    check-cast p2, Lcom/ibotta/api/model/ProductModel;

    invoke-direct {p1, p2, p0}, Lcom/ibotta/android/content/ProductDisplayContent;-><init>(Lcom/ibotta/api/model/ProductModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    return-object p1

    .line 144
    :pswitch_1
    new-instance v0, Lcom/ibotta/android/content/RetailerDisplayContent;

    check-cast p2, Lcom/ibotta/api/model/RetailerModel;

    invoke-direct {v0, p2, p1, p0}, Lcom/ibotta/android/content/RetailerDisplayContent;-><init>(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/views/content/ContentStyle;)V

    return-object v0

    .line 142
    :pswitch_2
    new-instance p1, Lcom/ibotta/android/content/OfferDisplayContent;

    check-cast p2, Lcom/ibotta/api/model/OfferModel;

    invoke-direct {p1, p2, p0}, Lcom/ibotta/android/content/OfferDisplayContent;-><init>(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic lambda$mapToDisplayContent$2(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/content/OfferDisplayContent;
    .locals 2

    .line 159
    new-instance v0, Lcom/ibotta/android/content/OfferDisplayContent;

    sget-object v1, Lcom/ibotta/android/views/content/ContentStyle;->MEDIUM:Lcom/ibotta/android/views/content/ContentStyle;

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/content/OfferDisplayContent;-><init>(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/content/ContentStyle;)V

    return-object v0
.end method

.method private mapToDisplayContent(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/content/DisplayContent;",
            ">;"
        }
    .end annotation

    .line 157
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$i4st-x5fqCzFlK_QfZKS8bk_YQo;->INSTANCE:Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$i4st-x5fqCzFlK_QfZKS8bk_YQo;

    .line 159
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 160
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method private mapToDisplayContent(Ljava/util/List;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/views/content/ContentStyle;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/base/BaseContent;",
            ">;",
            "Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;",
            "Lcom/ibotta/android/views/content/ContentStyle;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/content/DisplayContent;",
            ">;"
        }
    .end annotation

    .line 139
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$rwPXFOtqXurh8bLmglMe-ZJwzkM;

    invoke-direct {v0, p3, p2}, Lcom/ibotta/android/reducers/search/-$$Lambda$SearchResultsReducer$rwPXFOtqXurh8bLmglMe-ZJwzkM;-><init>(Lcom/ibotta/android/views/content/ContentStyle;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;)V

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 153
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method


# virtual methods
.method public create(Lcom/ibotta/api/model/search/SearchResults;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/list/IbottaListViewState;
    .locals 3

    .line 70
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->isOfferTagResults()Z

    move-result v0

    .line 72
    new-instance v1, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    invoke-direct {v1}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;-><init>()V

    .line 73
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getSearchedTerm()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->searchTerm(Ljava/lang/String;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    move-result-object v1

    if-eqz v0, :cond_0

    .line 75
    invoke-direct {p0, p1, p3}, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->getCards(Lcom/ibotta/api/model/search/SearchResults;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    .line 76
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->getRows(Lcom/ibotta/api/model/search/SearchResults;Lcom/ibotta/api/model/favorites/FavoriteRetailersManager;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Ljava/util/List;

    move-result-object p1

    .line 74
    :goto_0
    invoke-virtual {v1, p1}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->rows(Ljava/util/List;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    move-result-object p1

    .line 78
    iget-object p2, p0, Lcom/ibotta/android/reducers/search/SearchResultsReducer;->ibottaListViewStyleReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    if-eqz v0, :cond_1

    sget-object p3, Lcom/ibotta/android/ilv/ListType;->OFFER_TAG_SEARCH:Lcom/ibotta/android/ilv/ListType;

    goto :goto_1

    :cond_1
    sget-object p3, Lcom/ibotta/android/ilv/ListType;->SEARCH:Lcom/ibotta/android/ilv/ListType;

    :goto_1
    invoke-virtual {p2, p1, p3}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->buildWithStyle(Lcom/ibotta/android/views/list/IbottaListViewState$Builder;Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    return-object p1
.end method
