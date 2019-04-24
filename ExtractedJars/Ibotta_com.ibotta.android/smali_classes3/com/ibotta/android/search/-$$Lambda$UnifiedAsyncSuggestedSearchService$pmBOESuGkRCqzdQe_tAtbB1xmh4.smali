.class public final synthetic Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$pmBOESuGkRCqzdQe_tAtbB1xmh4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Consumer;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;

.field private final synthetic f$1:Ljava/lang/String;

.field private final synthetic f$2:Ljava9/util/function/Consumer;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;Ljava/lang/String;Ljava9/util/function/Consumer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$pmBOESuGkRCqzdQe_tAtbB1xmh4;->f$0:Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;

    iput-object p2, p0, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$pmBOESuGkRCqzdQe_tAtbB1xmh4;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$pmBOESuGkRCqzdQe_tAtbB1xmh4;->f$2:Ljava9/util/function/Consumer;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$pmBOESuGkRCqzdQe_tAtbB1xmh4;->f$0:Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;

    iget-object v1, p0, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$pmBOESuGkRCqzdQe_tAtbB1xmh4;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$pmBOESuGkRCqzdQe_tAtbB1xmh4;->f$2:Ljava9/util/function/Consumer;

    check-cast p1, Lcom/ibotta/api/model/search/SuggestedSearches;

    invoke-static {v0, v1, v2, p1}, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->lambda$getSuggestedTerms$1(Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;Ljava/lang/String;Ljava9/util/function/Consumer;Lcom/ibotta/api/model/search/SuggestedSearches;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TT;>;)",
            "Ljava9/util/function/Consumer<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Consumer$-CC;->$default$andThen(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
