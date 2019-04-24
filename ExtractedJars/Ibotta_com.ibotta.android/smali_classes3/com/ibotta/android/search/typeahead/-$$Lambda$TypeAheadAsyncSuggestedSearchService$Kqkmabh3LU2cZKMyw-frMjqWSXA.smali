.class public final synthetic Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$Kqkmabh3LU2cZKMyw-frMjqWSXA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Ljava9/util/function/Consumer;

.field private final synthetic f$1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/function/Consumer;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$Kqkmabh3LU2cZKMyw-frMjqWSXA;->f$0:Ljava9/util/function/Consumer;

    iput-object p2, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$Kqkmabh3LU2cZKMyw-frMjqWSXA;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$Kqkmabh3LU2cZKMyw-frMjqWSXA;->f$0:Ljava9/util/function/Consumer;

    iget-object v1, p0, Lcom/ibotta/android/search/typeahead/-$$Lambda$TypeAheadAsyncSuggestedSearchService$Kqkmabh3LU2cZKMyw-frMjqWSXA;->f$1:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/ibotta/android/search/typeahead/TypeAheadAsyncSuggestedSearchService;->lambda$getSuggestedTerms$0(Ljava9/util/function/Consumer;Ljava/lang/String;)V

    return-void
.end method
