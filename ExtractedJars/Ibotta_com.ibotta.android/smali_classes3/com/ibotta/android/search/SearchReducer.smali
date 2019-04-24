.class public final Lcom/ibotta/android/search/SearchReducer;
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
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/ibotta/android/search/SearchReducer;",
        "",
        "()V",
        "create",
        "Lcom/ibotta/android/views/search/SearchViewState;",
        "action",
        "Lcom/ibotta/android/search/SearchAction;",
        "hint",
        "",
        "searchTerm",
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

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/ibotta/android/search/SearchAction;Ljava/lang/String;)Lcom/ibotta/android/views/search/SearchViewState;
    .locals 1
    .param p1    # Lcom/ibotta/android/search/SearchAction;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, ""

    .line 28
    invoke-virtual {p0, p1, v0, p2}, Lcom/ibotta/android/search/SearchReducer;->create(Lcom/ibotta/android/search/SearchAction;Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/views/search/SearchViewState;

    move-result-object p1

    return-object p1
.end method

.method public final create(Lcom/ibotta/android/search/SearchAction;Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/views/search/SearchViewState;
    .locals 9
    .param p1    # Lcom/ibotta/android/search/SearchAction;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "searchTerm"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hint"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    sget-object v0, Lcom/ibotta/android/search/SearchReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/ibotta/android/search/SearchAction;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    .line 43
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    new-instance p1, Lcom/ibotta/android/views/search/SearchTextViewState;

    .line 46
    sget v3, Lcom/ibotta/android/reducers/R$drawable;->svg_icn_back_arrow:I

    .line 47
    sget v4, Lcom/ibotta/android/reducers/R$drawable;->svg_clear:I

    .line 48
    sget v5, Lcom/ibotta/android/reducers/R$string;->navigate_up:I

    .line 49
    sget v6, Lcom/ibotta/android/reducers/R$string;->clear_term:I

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    .line 43
    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/views/search/SearchTextViewState;-><init>(Ljava/lang/String;Ljava/lang/String;IIII)V

    check-cast p1, Lcom/ibotta/android/views/search/SearchViewState;

    goto :goto_0

    .line 38
    :pswitch_1
    new-instance p1, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;

    .line 39
    sget p2, Lcom/ibotta/android/reducers/R$drawable;->svg_icn_back_arrow:I

    .line 40
    sget p3, Lcom/ibotta/android/reducers/R$drawable;->svg_clear:I

    .line 41
    sget v0, Lcom/ibotta/android/reducers/R$string;->navigate_up:I

    .line 42
    sget v1, Lcom/ibotta/android/reducers/R$string;->clear_term:I

    .line 38
    invoke-direct {p1, p2, p3, v0, v1}, Lcom/ibotta/android/views/search/SearchIconOnlyViewState;-><init>(IIII)V

    check-cast p1, Lcom/ibotta/android/views/search/SearchViewState;

    goto :goto_0

    .line 32
    :pswitch_2
    new-instance p1, Lcom/ibotta/android/views/search/SearchTextViewState;

    const/4 v1, 0x0

    .line 34
    sget v3, Lcom/ibotta/android/reducers/R$drawable;->svg_icn_back_arrow:I

    .line 35
    sget v4, Lcom/ibotta/android/reducers/R$drawable;->svg_clear:I

    .line 36
    sget v5, Lcom/ibotta/android/reducers/R$string;->navigate_up:I

    .line 37
    sget v6, Lcom/ibotta/android/reducers/R$string;->clear_term:I

    const/4 v7, 0x1

    const/4 v8, 0x0

    move-object v0, p1

    move-object v2, p3

    .line 32
    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/views/search/SearchTextViewState;-><init>(Ljava/lang/String;Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Lcom/ibotta/android/views/search/SearchViewState;

    goto :goto_0

    .line 31
    :pswitch_3
    new-instance p1, Lcom/ibotta/android/views/search/SearchTextViewState;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3d

    const/4 v8, 0x0

    move-object v0, p1

    move-object v2, p3

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/views/search/SearchTextViewState;-><init>(Ljava/lang/String;Ljava/lang/String;IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Lcom/ibotta/android/views/search/SearchViewState;

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
