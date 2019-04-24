.class public final synthetic Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$rs5PUC9irjsZKpH6pbsObljeWHM;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;

.field private final synthetic f$1:Ljava/lang/String;

.field private final synthetic f$2:Ljava9/util/function/Consumer;

.field private final synthetic f$3:Ljava9/util/Optional;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;Ljava/lang/String;Ljava9/util/function/Consumer;Ljava9/util/Optional;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$rs5PUC9irjsZKpH6pbsObljeWHM;->f$0:Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;

    iput-object p2, p0, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$rs5PUC9irjsZKpH6pbsObljeWHM;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$rs5PUC9irjsZKpH6pbsObljeWHM;->f$2:Ljava9/util/function/Consumer;

    iput-object p4, p0, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$rs5PUC9irjsZKpH6pbsObljeWHM;->f$3:Ljava9/util/Optional;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$rs5PUC9irjsZKpH6pbsObljeWHM;->f$0:Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;

    iget-object v1, p0, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$rs5PUC9irjsZKpH6pbsObljeWHM;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$rs5PUC9irjsZKpH6pbsObljeWHM;->f$2:Ljava9/util/function/Consumer;

    iget-object v3, p0, Lcom/ibotta/android/search/-$$Lambda$UnifiedAsyncSuggestedSearchService$rs5PUC9irjsZKpH6pbsObljeWHM;->f$3:Ljava9/util/Optional;

    invoke-static {v0, v1, v2, v3}, Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;->lambda$getSuggestedTerms$2(Lcom/ibotta/android/search/UnifiedAsyncSuggestedSearchService;Ljava/lang/String;Ljava9/util/function/Consumer;Ljava9/util/Optional;)V

    return-void
.end method
