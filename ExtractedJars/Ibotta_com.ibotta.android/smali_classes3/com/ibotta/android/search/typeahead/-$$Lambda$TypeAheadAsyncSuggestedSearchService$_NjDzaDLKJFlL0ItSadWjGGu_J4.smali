.class public final synthetic Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$_NjDzaDLKJFlL0ItSadWjGGu_J4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;

.field private final synthetic f$1:Ljava9/util/function/Consumer;

.field private final synthetic f$2:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;Ljava9/util/function/Consumer;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$_NjDzaDLKJFlL0ItSadWjGGu_J4;->f$0:Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;

    iput-object p2, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$_NjDzaDLKJFlL0ItSadWjGGu_J4;->f$1:Ljava9/util/function/Consumer;

    iput-object p3, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$_NjDzaDLKJFlL0ItSadWjGGu_J4;->f$2:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$_NjDzaDLKJFlL0ItSadWjGGu_J4;->f$0:Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;

    iget-object v1, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$_NjDzaDLKJFlL0ItSadWjGGu_J4;->f$1:Ljava9/util/function/Consumer;

    iget-object v2, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$_NjDzaDLKJFlL0ItSadWjGGu_J4;->f$2:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->lambda$getSuggestedTerms$1(Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;Ljava9/util/function/Consumer;Ljava/lang/String;)V

    return-void
.end method
