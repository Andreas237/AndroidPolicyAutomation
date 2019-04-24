.class Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService$1;
.super Ljava/lang/Object;
.source "TypeAheadAsyncSuggestedSearchService.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->lambda$getSuggestedTerms$3(Ljava/lang/String;Ljava9/util/Optional;Ljava9/util/function/Consumer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;

.field final synthetic val$consumer:Ljava9/util/function/Consumer;

.field final synthetic val$searchText:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;Ljava9/util/function/Consumer;Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService$1;->this$0:Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;

    iput-object p2, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService$1;->val$consumer:Ljava9/util/function/Consumer;

    iput-object p3, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService$1;->val$searchText:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$onApiJobFinished$0(Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestion;)Lcom/ibotta/api/model/search/SuggestedSearchItem;
    .locals 2

    .line 93
    invoke-static {}, Lcom/ibotta/api/model/search/SuggestedSearchItem;->builder()Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;

    move-result-object v0

    .line 94
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestion;->getSuggestedTerm()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;->searchTerm(Ljava/lang/String;)Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/search/SearchType;->TYPE_AHEAD:Lcom/ibotta/api/model/search/SearchType;

    .line 95
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;->searchType(Lcom/ibotta/api/model/search/SearchType;)Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;

    move-result-object v0

    .line 96
    invoke-virtual {p0}, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestion;->getHighlights()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;->highlights(Ljava/util/List;)Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;

    move-result-object p0

    .line 97
    invoke-virtual {p0}, Lcom/ibotta/api/model/search/SuggestedSearchItem$Builder;->build()Lcom/ibotta/api/model/search/SuggestedSearchItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 3

    .line 88
    move-object v0, p1

    check-cast v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;

    .line 89
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->getOutcome()Lcom/ibotta/android/service/api/Outcome;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/service/api/Outcome;->SUCCESS:Lcom/ibotta/android/service/api/Outcome;

    if-ne p1, v1, :cond_0

    if-eqz v0, :cond_0

    .line 90
    iget-object p1, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService$1;->val$consumer:Ljava9/util/function/Consumer;

    iget-object v1, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService$1;->val$searchText:Ljava/lang/String;

    .line 92
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/search/typeahead/TypeAheadSuggestionResponse;->getSuggestions()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v2, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$1$etwpV4V6W9giNQ7tsaPPKq00wAs;->INSTANCE:Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$1$etwpV4V6W9giNQ7tsaPPKq00wAs;

    .line 93
    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object v0

    .line 98
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 90
    invoke-static {v1, v0}, Lcom/ibotta/api/model/search/SuggestedSearches;->create(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/api/model/search/SuggestedSearches;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    .line 100
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService$1;->val$consumer:Ljava9/util/function/Consumer;

    iget-object v0, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService$1;->val$searchText:Ljava/lang/String;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ibotta/api/model/search/SuggestedSearches;->create(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/api/model/search/SuggestedSearches;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 102
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService$1;->this$0:Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;

    invoke-static {p1}, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->access$000(Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;)V

    return-void
.end method

.method public onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    return-void
.end method
