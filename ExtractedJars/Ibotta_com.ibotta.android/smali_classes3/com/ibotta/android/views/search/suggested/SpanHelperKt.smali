.class public final Lcom/ibotta/android/views/search/suggested/SpanHelperKt;
.super Ljava/lang/Object;
.source "SpanHelper.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSpanHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanHelper.kt\ncom/ibotta/android/views/search/suggested/SpanHelperKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,41:1\n528#2:42\n*E\n*S KotlinDebug\n*F\n+ 1 SpanHelper.kt\ncom/ibotta/android/views/search/suggested/SpanHelperKt\n*L\n38#1:42\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0005\u001a\u001e\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0002\u001a\u001c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u0002\u001a$\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u0002\u001a\"\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t\u00a8\u0006\u000e"
    }
    d2 = {
        "getUnspannedSpans",
        "Lkotlin/sequences/Sequence;",
        "Lcom/ibotta/android/views/search/suggested/TextSpan;",
        "parentSpan",
        "subSpan",
        "isSanitary",
        "",
        "span",
        "sanitize",
        "",
        "spans",
        "unspannedSpanner",
        "subSpans",
        "unspannedSpans",
        "ibotta-views_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final synthetic access$isSanitary(Lcom/ibotta/android/views/search/suggested/TextSpan;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/ibotta/android/views/search/suggested/SpanHelperKt;->isSanitary(Lcom/ibotta/android/views/search/suggested/TextSpan;)Z

    move-result p0

    return p0
.end method

.method private static final getUnspannedSpans(Lcom/ibotta/android/views/search/suggested/TextSpan;Lcom/ibotta/android/views/search/suggested/TextSpan;)Lkotlin/sequences/Sequence;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/search/suggested/TextSpan;",
            "Lcom/ibotta/android/views/search/suggested/TextSpan;",
            ")",
            "Lkotlin/sequences/Sequence<",
            "Lcom/ibotta/android/views/search/suggested/TextSpan;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 36
    new-array v0, v0, [Lcom/ibotta/android/views/search/suggested/TextSpan;

    new-instance v1, Lcom/ibotta/android/views/search/suggested/TextSpan;

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/suggested/TextSpan;->getStart()I

    move-result p0

    invoke-virtual {p1}, Lcom/ibotta/android/views/search/suggested/TextSpan;->getStart()I

    move-result p1

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/views/search/suggested/TextSpan;-><init>(II)V

    const/4 p0, 0x0

    aput-object v1, v0, p0

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object p0

    return-object p0
.end method

.method private static final isSanitary(Lcom/ibotta/android/views/search/suggested/TextSpan;)Z
    .locals 1

    .line 40
    invoke-virtual {p0}, Lcom/ibotta/android/views/search/suggested/TextSpan;->getEnd()I

    move-result v0

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/suggested/TextSpan;->getStart()I

    move-result p0

    sub-int/2addr v0, p0

    if-lez v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final sanitize(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/search/suggested/TextSpan;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/search/suggested/TextSpan;",
            ">;"
        }
    .end annotation

    .line 38
    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->asSequence(Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;

    move-result-object p0

    .line 42
    new-instance v0, Lcom/ibotta/android/views/search/suggested/SpanHelperKt$sanitize$$inlined$sortedBy$1;

    invoke-direct {v0}, Lcom/ibotta/android/views/search/suggested/SpanHelperKt$sanitize$$inlined$sortedBy$1;-><init>()V

    check-cast v0, Ljava/util/Comparator;

    invoke-static {p0, v0}, Lkotlin/sequences/SequencesKt;->sortedWith(Lkotlin/sequences/Sequence;Ljava/util/Comparator;)Lkotlin/sequences/Sequence;

    move-result-object p0

    .line 38
    sget-object v0, Lcom/ibotta/android/views/search/suggested/SpanHelperKt$sanitize$2;->INSTANCE:Lcom/ibotta/android/views/search/suggested/SpanHelperKt$sanitize$2;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, v0}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object p0

    invoke-static {p0}, Lkotlin/sequences/SequencesKt;->toList(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final unspannedSpanner(Lcom/ibotta/android/views/search/suggested/TextSpan;Ljava/util/List;)Lkotlin/sequences/Sequence;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/search/suggested/TextSpan;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/search/suggested/TextSpan;",
            ">;)",
            "Lkotlin/sequences/Sequence<",
            "Lcom/ibotta/android/views/search/suggested/TextSpan;",
            ">;"
        }
    .end annotation

    .line 30
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ne v0, v2, :cond_1

    .line 31
    new-array v0, v2, [Lcom/ibotta/android/views/search/suggested/TextSpan;

    new-instance v2, Lcom/ibotta/android/views/search/suggested/TextSpan;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/views/search/suggested/TextSpan;

    invoke-virtual {v3}, Lcom/ibotta/android/views/search/suggested/TextSpan;->getEnd()I

    move-result v3

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/suggested/TextSpan;->getEnd()I

    move-result v4

    invoke-direct {v2, v3, v4}, Lcom/ibotta/android/views/search/suggested/TextSpan;-><init>(II)V

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->sequenceOf([Ljava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    goto :goto_1

    :cond_1
    if-nez v0, :cond_2

    .line 32
    new-instance v0, Lcom/ibotta/android/views/search/suggested/TextSpan;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/views/search/suggested/TextSpan;

    invoke-virtual {v1}, Lcom/ibotta/android/views/search/suggested/TextSpan;->getEnd()I

    move-result v1

    invoke-virtual {p0}, Lcom/ibotta/android/views/search/suggested/TextSpan;->getEnd()I

    move-result v3

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/views/search/suggested/TextSpan;-><init>(II)V

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->drop(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ibotta/android/views/search/suggested/SpanHelperKt;->unspannedSpanner(Lcom/ibotta/android/views/search/suggested/TextSpan;Ljava/util/List;)Lkotlin/sequences/Sequence;

    move-result-object v0

    .line 33
    :goto_1
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/search/suggested/TextSpan;

    invoke-static {p0, p1}, Lcom/ibotta/android/views/search/suggested/SpanHelperKt;->getUnspannedSpans(Lcom/ibotta/android/views/search/suggested/TextSpan;Lcom/ibotta/android/views/search/suggested/TextSpan;)Lkotlin/sequences/Sequence;

    move-result-object p0

    invoke-static {v0, p0}, Lkotlin/sequences/SequencesKt;->plus(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;

    move-result-object p0

    return-object p0

    .line 32
    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final unspannedSpans(Lcom/ibotta/android/views/search/suggested/TextSpan;Ljava/util/List;)Ljava/util/List;
    .locals 2
    .param p0    # Lcom/ibotta/android/views/search/suggested/TextSpan;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/search/suggested/TextSpan;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/search/suggested/TextSpan;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/search/suggested/TextSpan;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "parentSpan"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subSpans"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-static {p1}, Lcom/ibotta/android/views/search/suggested/SpanHelperKt;->sanitize(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 18
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    .line 19
    invoke-static {p1}, Lcom/ibotta/android/views/search/suggested/SpanHelperKt;->sanitize(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/ibotta/android/views/search/suggested/SpanHelperKt;->unspannedSpanner(Lcom/ibotta/android/views/search/suggested/TextSpan;Ljava/util/List;)Lkotlin/sequences/Sequence;

    move-result-object p0

    sget-object p1, Lcom/ibotta/android/views/search/suggested/SpanHelperKt$unspannedSpans$1;->INSTANCE:Lcom/ibotta/android/views/search/suggested/SpanHelperKt$unspannedSpans$1;

    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-static {p0, p1}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object p0

    invoke-static {p0}, Lkotlin/sequences/SequencesKt;->toList(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
