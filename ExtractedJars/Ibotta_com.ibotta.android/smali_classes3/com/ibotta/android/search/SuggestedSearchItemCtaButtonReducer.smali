.class public final Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;
.super Ljava/lang/Object;
.source "SuggestedSearchItemCtaButtonReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0003J\u0010\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u0010\u0010\u000b\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0003\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;",
        "",
        "()V",
        "create",
        "Lcom/ibotta/android/views/base/button/IbottaButtonViewState;",
        "buttonType",
        "Lcom/ibotta/android/search/ButtonType;",
        "getContentDescription",
        "",
        "searchTerm",
        "Lcom/ibotta/android/search/SearchTerm;",
        "getDrawable",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getContentDescription(Lcom/ibotta/android/search/ButtonType;)I
    .locals 1
    .annotation build Landroid/support/annotation/StringRes;
    .end annotation

    .line 28
    sget-object v0, Lcom/ibotta/android/search/Barcode;->INSTANCE:Lcom/ibotta/android/search/Barcode;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget p1, Lcom/ibotta/android/reducers/R$string;->search_by_barcode:I

    goto :goto_0

    .line 29
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/search/SearchTerm;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/ibotta/android/search/SearchTerm;

    invoke-direct {p0, p1}, Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;->getContentDescription(Lcom/ibotta/android/search/SearchTerm;)I

    move-result p1

    :goto_0
    return p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final getContentDescription(Lcom/ibotta/android/search/SearchTerm;)I
    .locals 1
    .annotation build Landroid/support/annotation/StringRes;
    .end annotation

    .line 33
    invoke-virtual {p1}, Lcom/ibotta/android/search/SearchTerm;->getSuggestedSearchMode()Lcom/ibotta/android/search/SuggestedSearchMode;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/ibotta/android/search/SuggestedSearchMode;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    .line 35
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget p1, Lcom/ibotta/android/reducers/R$string;->search_term:I

    goto :goto_0

    .line 34
    :pswitch_1
    sget p1, Lcom/ibotta/android/reducers/R$string;->clear_term:I

    :goto_0
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final getDrawable(Lcom/ibotta/android/search/ButtonType;)I
    .locals 1
    .annotation build Landroid/support/annotation/DrawableRes;
    .end annotation

    .line 40
    sget-object v0, Lcom/ibotta/android/search/Barcode;->INSTANCE:Lcom/ibotta/android/search/Barcode;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget p1, Lcom/ibotta/android/reducers/R$drawable;->svg_barcode_scan:I

    goto :goto_0

    .line 41
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/search/SearchTerm;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/ibotta/android/search/SearchTerm;

    invoke-direct {p0, p1}, Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;->getDrawable(Lcom/ibotta/android/search/SearchTerm;)I

    move-result p1

    :goto_0
    return p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final getDrawable(Lcom/ibotta/android/search/SearchTerm;)I
    .locals 1
    .annotation build Landroid/support/annotation/DrawableRes;
    .end annotation

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/search/SearchTerm;->getSuggestedSearchMode()Lcom/ibotta/android/search/SuggestedSearchMode;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Lcom/ibotta/android/search/SuggestedSearchMode;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    .line 47
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget p1, Lcom/ibotta/android/reducers/R$drawable;->svg_search:I

    goto :goto_0

    .line 46
    :pswitch_1
    sget p1, Lcom/ibotta/android/reducers/R$drawable;->svg_clear:I

    :goto_0
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final create(Lcom/ibotta/android/search/ButtonType;)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
    .locals 9
    .param p1    # Lcom/ibotta/android/search/ButtonType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "buttonType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    new-instance v0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;->getDrawable(Lcom/ibotta/android/search/ButtonType;)I

    move-result v4

    .line 24
    invoke-direct {p0, p1}, Lcom/ibotta/android/search/SuggestedSearchItemCtaButtonReducer;->getContentDescription(Lcom/ibotta/android/search/ButtonType;)I

    move-result v3

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x19

    const/4 v8, 0x0

    move-object v1, v0

    .line 22
    invoke-direct/range {v1 .. v8}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;-><init>(ZIIZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
