.class public final Lcom/ibotta/android/search/SearchReducerKt;
.super Ljava/lang/Object;
.source "SearchReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0003\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0003\u00a8\u0006\u0007"
    }
    d2 = {
        "isLeftBack",
        "",
        "Lcom/ibotta/android/views/search/SearchViewState;",
        "(Lcom/ibotta/android/views/search/SearchViewState;)Z",
        "isLeftSearch",
        "isRightBarcodeScan",
        "isRightClear",
        "ibotta-reducers_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final isLeftBack(Lcom/ibotta/android/views/search/SearchViewState;)Z
    .locals 1
    .param p0    # Lcom/ibotta/android/views/search/SearchViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchViewState;->getLeftIcon()I

    move-result p0

    sget v0, Lcom/ibotta/android/reducers/R$drawable;->svg_icn_back_arrow:I

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isLeftSearch(Lcom/ibotta/android/views/search/SearchViewState;)Z
    .locals 1
    .param p0    # Lcom/ibotta/android/views/search/SearchViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchViewState;->getLeftIcon()I

    move-result p0

    sget v0, Lcom/ibotta/android/reducers/R$drawable;->svg_search:I

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isRightBarcodeScan(Lcom/ibotta/android/views/search/SearchViewState;)Z
    .locals 1
    .param p0    # Lcom/ibotta/android/views/search/SearchViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchViewState;->getRightIcon()I

    move-result p0

    sget v0, Lcom/ibotta/android/reducers/R$drawable;->svg_barcode_scan:I

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isRightClear(Lcom/ibotta/android/views/search/SearchViewState;)Z
    .locals 1
    .param p0    # Lcom/ibotta/android/views/search/SearchViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "receiver$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-virtual {p0}, Lcom/ibotta/android/views/search/SearchViewState;->getRightIcon()I

    move-result p0

    sget v0, Lcom/ibotta/android/reducers/R$drawable;->svg_clear:I

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
