.class public final synthetic Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$GjlzkJPaHP27zn2b6b-lkNQHlxE;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;

.field private final synthetic f$1:Ljava/lang/String;

.field private final synthetic f$2:Ljava9/util/Optional;

.field private final synthetic f$3:Ljava9/util/function/Consumer;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;Ljava/lang/String;Ljava9/util/Optional;Ljava9/util/function/Consumer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$GjlzkJPaHP27zn2b6b-lkNQHlxE;->f$0:Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;

    iput-object p2, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$GjlzkJPaHP27zn2b6b-lkNQHlxE;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$GjlzkJPaHP27zn2b6b-lkNQHlxE;->f$2:Ljava9/util/Optional;

    iput-object p4, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$GjlzkJPaHP27zn2b6b-lkNQHlxE;->f$3:Ljava9/util/function/Consumer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$GjlzkJPaHP27zn2b6b-lkNQHlxE;->f$0:Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;

    iget-object v1, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$GjlzkJPaHP27zn2b6b-lkNQHlxE;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$GjlzkJPaHP27zn2b6b-lkNQHlxE;->f$2:Ljava9/util/Optional;

    iget-object v3, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$GjlzkJPaHP27zn2b6b-lkNQHlxE;->f$3:Ljava9/util/function/Consumer;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->lambda$getSuggestedTerms$3(Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;Ljava/lang/String;Ljava9/util/Optional;Ljava9/util/function/Consumer;)V

    return-void
.end method
