.class public final Lcom/ibotta/android/search/MisspellingReducer;
.super Ljava/lang/Object;
.source "MisspellingReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMisspellingReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MisspellingReducer.kt\ncom/ibotta/android/search/MisspellingReducer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1301#2:69\n1370#2,3:70\n*E\n*S KotlinDebug\n*F\n+ 1 MisspellingReducer.kt\ncom/ibotta/android/search/MisspellingReducer\n*L\n67#1:69\n67#1,3:70\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ibotta/android/search/MisspellingReducer;",
        "",
        "resources",
        "Landroid/content/res/Resources;",
        "(Landroid/content/res/Resources;)V",
        "noResultsDeadEnd",
        "Lcom/ibotta/android/views/empty/EmptyViewState;",
        "getResources",
        "()Landroid/content/res/Resources;",
        "totalResults",
        "",
        "Lcom/ibotta/api/model/search/SearchResults;",
        "getTotalResults",
        "(Lcom/ibotta/api/model/search/SearchResults;)I",
        "createEmptyView",
        "misspelling",
        "Lcom/ibotta/api/model/search/Misspelling;",
        "createInformationRow",
        "Lcom/ibotta/android/views/base/info/InformationRowViewState;",
        "searchResults",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final noResultsDeadEnd:Lcom/ibotta/android/views/empty/EmptyViewState;

.field private final resources:Landroid/content/res/Resources;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 8
    .param p1    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/search/MisspellingReducer;->resources:Landroid/content/res/Resources;

    .line 21
    new-instance p1, Lcom/ibotta/android/views/empty/EmptyViewState;

    .line 22
    sget v2, Lcom/ibotta/android/reducers/R$drawable;->svg_finding_cash_illustration:I

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/search/MisspellingReducer;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->search_no_results_found:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v0, "resources.getString(R.st\u2026.search_no_results_found)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v1, p1

    .line 21
    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/views/empty/EmptyViewState;-><init>(ILjava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ibotta/android/search/MisspellingReducer;->noResultsDeadEnd:Lcom/ibotta/android/views/empty/EmptyViewState;

    return-void
.end method

.method private final getTotalResults(Lcom/ibotta/api/model/search/SearchResults;)I
    .locals 3
    .param p1    # Lcom/ibotta/api/model/search/SearchResults;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 67
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getSearchModules()Ljava/util/List;

    move-result-object p1

    const-string v0, "searchModules"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 70
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 71
    check-cast v1, Lcom/ibotta/api/model/base/Module;

    const-string v2, "it"

    .line 67
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/api/model/base/Module;->getContent()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 72
    :cond_0
    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 67
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->sumOfInt(Ljava/lang/Iterable;)I

    move-result p1

    return p1
.end method


# virtual methods
.method public final createEmptyView(Lcom/ibotta/api/model/search/Misspelling;)Lcom/ibotta/android/views/empty/EmptyViewState;
    .locals 8
    .param p1    # Lcom/ibotta/api/model/search/Misspelling;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "misspelling"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    sget-object v0, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->Companion:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel$Companion;

    invoke-virtual {p1}, Lcom/ibotta/api/model/search/Misspelling;->getConfidence()Ljava/lang/String;

    move-result-object v1

    const-string v2, "misspelling.confidence"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel$Companion;->fromValue(Ljava/lang/String;)Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/search/MisspellingReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v0}, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 57
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    new-instance v0, Lcom/ibotta/android/views/empty/EmptyViewState;

    .line 58
    sget v2, Lcom/ibotta/android/reducers/R$drawable;->svg_finding_cash_illustration:I

    const/4 v4, 0x1

    .line 60
    iget-object v1, p0, Lcom/ibotta/android/search/MisspellingReducer;->resources:Landroid/content/res/Resources;

    .line 61
    sget v3, Lcom/ibotta/android/reducers/R$string;->search_empty_view_weak_confidence_results_found:I

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    .line 62
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/Misspelling;->getOriginal()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x1

    .line 63
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/Misspelling;->getSuggested()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v5, v6

    .line 60
    invoke-virtual {v1, v3, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string p1, "resources.getString(\n   \u2026   misspelling.suggested)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, v0

    .line 57
    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/views/empty/EmptyViewState;-><init>(ILjava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    .line 56
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/search/MisspellingReducer;->noResultsDeadEnd:Lcom/ibotta/android/views/empty/EmptyViewState;

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final createInformationRow(Lcom/ibotta/api/model/search/SearchResults;)Lcom/ibotta/android/views/base/info/InformationRowViewState;
    .locals 9
    .param p1    # Lcom/ibotta/api/model/search/SearchResults;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "searchResults"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0, p1}, Lcom/ibotta/android/search/MisspellingReducer;->getTotalResults(Lcom/ibotta/api/model/search/SearchResults;)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 29
    :cond_0
    sget-object v0, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->Companion:Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel$Companion;

    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getMisspellingState()Lcom/ibotta/api/model/search/Misspelling;

    move-result-object v1

    const-string v2, "searchResults.misspellingState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/ibotta/api/model/search/Misspelling;->getConfidence()Ljava/lang/String;

    move-result-object v1

    const-string v2, "searchResults.misspellingState.confidence"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel$Companion;->fromValue(Ljava/lang/String;)Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;

    move-result-object v0

    .line 31
    sget-object v1, Lcom/ibotta/android/search/MisspellingReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x2

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x1

    packed-switch v1, :pswitch_data_0

    .line 42
    iget-object v1, p0, Lcom/ibotta/android/search/MisspellingReducer;->resources:Landroid/content/res/Resources;

    .line 43
    sget v2, Lcom/ibotta/android/reducers/R$plurals;->search_strong_confidence_number_results_found:I

    .line 44
    invoke-direct {p0, p1}, Lcom/ibotta/android/search/MisspellingReducer;->getTotalResults(Lcom/ibotta/api/model/search/SearchResults;)I

    move-result v3

    new-array v5, v5, [Ljava/lang/Object;

    .line 45
    invoke-direct {p0, p1}, Lcom/ibotta/android/search/MisspellingReducer;->getTotalResults(Lcom/ibotta/api/model/search/SearchResults;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v4

    .line 42
    invoke-virtual {v1, v2, v3, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 37
    :pswitch_0
    iget-object v1, p0, Lcom/ibotta/android/search/MisspellingReducer;->resources:Landroid/content/res/Resources;

    .line 38
    sget v6, Lcom/ibotta/android/reducers/R$string;->search_weak_confidence_results_found:I

    new-array v3, v3, [Ljava/lang/Object;

    .line 39
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getMisspellingState()Lcom/ibotta/api/model/search/Misspelling;

    move-result-object v7

    const-string v8, "searchResults.misspellingState"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/ibotta/api/model/search/Misspelling;->getOriginal()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v4

    .line 40
    invoke-direct {p0, p1}, Lcom/ibotta/android/search/MisspellingReducer;->getTotalResults(Lcom/ibotta/api/model/search/SearchResults;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    .line 41
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getMisspellingState()Lcom/ibotta/api/model/search/Misspelling;

    move-result-object v4

    const-string v5, "searchResults.misspellingState"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/ibotta/api/model/search/Misspelling;->getSuggested()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v2

    .line 37
    invoke-virtual {v1, v6, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 32
    :pswitch_1
    iget-object v1, p0, Lcom/ibotta/android/search/MisspellingReducer;->resources:Landroid/content/res/Resources;

    .line 33
    sget v6, Lcom/ibotta/android/reducers/R$string;->search_medium_confidence_results_found:I

    new-array v3, v3, [Ljava/lang/Object;

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getMisspellingState()Lcom/ibotta/api/model/search/Misspelling;

    move-result-object v7

    const-string v8, "searchResults.misspellingState"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/ibotta/api/model/search/Misspelling;->getSuggested()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v3, v4

    .line 35
    invoke-direct {p0, p1}, Lcom/ibotta/android/search/MisspellingReducer;->getTotalResults(Lcom/ibotta/api/model/search/SearchResults;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    .line 36
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getMisspellingState()Lcom/ibotta/api/model/search/Misspelling;

    move-result-object v4

    const-string v5, "searchResults.misspellingState"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/ibotta/api/model/search/Misspelling;->getOriginal()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v2

    .line 32
    invoke-virtual {v1, v6, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 48
    :goto_0
    new-instance v2, Lcom/ibotta/android/views/base/info/InformationRowViewState;

    const-string v3, "result"

    .line 49
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getMisspellingState()Lcom/ibotta/api/model/search/Misspelling;

    move-result-object v3

    const-string v4, "searchResults.misspellingState"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/ibotta/api/model/search/Misspelling;->getOriginal()Ljava/lang/String;

    move-result-object v3

    const-string v4, "searchResults.misspellingState.original"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/SearchResults;->getMisspellingState()Lcom/ibotta/api/model/search/Misspelling;

    move-result-object p1

    const-string v4, "searchResults.misspellingState"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/api/model/search/Misspelling;->getSuggested()Ljava/lang/String;

    move-result-object p1

    const-string v4, "searchResults.misspellingState.suggested"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-direct {v2, v1, v3, p1, v0}, Lcom/ibotta/android/views/base/info/InformationRowViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/views/base/info/MisspellingConfidenceLevel;)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/search/MisspellingReducer;->resources:Landroid/content/res/Resources;

    return-object v0
.end method
