.class public final Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;
.super Ljava/lang/Object;
.source "IbottaListViewStyleReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0008J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0008H\u0002\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
        "",
        "()V",
        "buildWithStyle",
        "Lcom/ibotta/android/views/list/IbottaListViewState;",
        "builder",
        "Lcom/ibotta/android/views/list/IbottaListViewState$Builder;",
        "listType",
        "Lcom/ibotta/android/ilv/ListType;",
        "copyWithStyle",
        "viewState",
        "getDecorator",
        "Lcom/ibotta/android/views/list/Decorator;",
        "getLayoutType",
        "Lcom/ibotta/android/views/list/LayoutType;",
        "getPadding",
        "Lcom/ibotta/android/views/list/Padding;",
        "shouldUseSnapHelper",
        "",
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

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getDecorator(Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/Decorator;
    .locals 26

    .line 73
    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    packed-switch v0, :pswitch_data_0

    .line 95
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v0, Lcom/ibotta/android/views/list/Decorator;

    sget v6, Lcom/ibotta/android/reducers/R$dimen;->size_12:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    sget-object v1, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->CONTENT_CARD:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v13

    const/16 v14, 0x7e

    const/4 v15, 0x0

    move-object v5, v0

    invoke-direct/range {v5 .. v15}, Lcom/ibotta/android/views/list/Decorator;-><init>(IIIIIIZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_0

    .line 94
    :pswitch_1
    sget-object v0, Lcom/ibotta/android/views/list/Decorator;->EMPTY:Lcom/ibotta/android/views/list/Decorator;

    goto/16 :goto_0

    .line 87
    :pswitch_2
    new-instance v0, Lcom/ibotta/android/views/list/Decorator;

    .line 88
    sget v5, Lcom/ibotta/android/reducers/R$dimen;->size_1:I

    .line 89
    sget v6, Lcom/ibotta/android/reducers/R$dimen;->size_12:I

    .line 90
    sget v7, Lcom/ibotta/android/reducers/R$dimen;->size_0:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 91
    sget v10, Lcom/ibotta/android/reducers/R$color;->gray_ee:I

    const/4 v11, 0x1

    .line 93
    new-array v1, v1, [Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    sget-object v12, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->DECORATOR:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v12, v1, v3

    sget-object v3, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->SEARCH_SUGGESTION:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v3, v1, v2

    sget-object v2, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->SUGGESTION_TITLE:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v2, v1, v4

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v12

    const/16 v13, 0x18

    const/4 v14, 0x0

    move-object v1, v0

    move v2, v5

    move v3, v7

    move v4, v6

    move v5, v8

    move v6, v9

    move v7, v10

    move v8, v11

    move-object v9, v12

    move v10, v13

    move-object v11, v14

    .line 87
    invoke-direct/range {v1 .. v11}, Lcom/ibotta/android/views/list/Decorator;-><init>(IIIIIIZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_0

    .line 81
    :pswitch_3
    new-instance v0, Lcom/ibotta/android/views/list/Decorator;

    .line 82
    sget v16, Lcom/ibotta/android/reducers/R$dimen;->size_1:I

    .line 83
    sget v21, Lcom/ibotta/android/reducers/R$color;->gray_dd:I

    .line 84
    sget v18, Lcom/ibotta/android/reducers/R$dimen;->size_12:I

    const/16 v19, 0x0

    const/16 v20, 0x0

    .line 85
    sget v17, Lcom/ibotta/android/reducers/R$dimen;->size_0:I

    const/16 v22, 0x0

    .line 86
    new-array v1, v1, [Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    sget-object v5, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->CONTENT_ROW:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v5, v1, v3

    sget-object v3, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->PAYMENT_METHOD_ROW_WALLET:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v3, v1, v2

    sget-object v2, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->PWI_RETAILER:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v2, v1, v4

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v23

    const/16 v24, 0x58

    const/16 v25, 0x0

    move-object v15, v0

    .line 81
    invoke-direct/range {v15 .. v25}, Lcom/ibotta/android/views/list/Decorator;-><init>(IIIIIIZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    .line 75
    :pswitch_4
    new-instance v0, Lcom/ibotta/android/views/list/Decorator;

    .line 76
    sget v5, Lcom/ibotta/android/reducers/R$dimen;->size_1:I

    .line 77
    sget v7, Lcom/ibotta/android/reducers/R$color;->gray_dd:I

    .line 78
    sget v6, Lcom/ibotta/android/reducers/R$dimen;->size_12:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 79
    sget v10, Lcom/ibotta/android/reducers/R$dimen;->size_0:I

    const/4 v11, 0x0

    .line 80
    new-array v1, v4, [Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    sget-object v4, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->CONTENT_ROW:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v4, v1, v3

    sget-object v3, Lcom/ibotta/android/views/list/ContentViewState$ContentType;->TITLE:Lcom/ibotta/android/views/list/ContentViewState$ContentType;

    aput-object v3, v1, v2

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v12

    const/16 v13, 0x58

    const/4 v14, 0x0

    move-object v1, v0

    move v2, v5

    move v3, v10

    move v4, v6

    move v5, v8

    move v6, v9

    move v8, v11

    move-object v9, v12

    move v10, v13

    move-object v11, v14

    .line 75
    invoke-direct/range {v1 .. v11}, Lcom/ibotta/android/views/list/Decorator;-><init>(IIIIIIZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    .line 74
    :pswitch_5
    new-instance v0, Lcom/ibotta/android/views/list/Decorator;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0xff

    const/16 v25, 0x0

    move-object v15, v0

    invoke-direct/range {v15 .. v25}, Lcom/ibotta/android/views/list/Decorator;-><init>(IIIIIIZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final getLayoutType(Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/LayoutType;
    .locals 1

    .line 98
    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$2:[I

    invoke-virtual {p1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    .line 101
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lcom/ibotta/android/views/list/HorizontalLayout;->INSTANCE:Lcom/ibotta/android/views/list/HorizontalLayout;

    check-cast p1, Lcom/ibotta/android/views/list/LayoutType;

    goto :goto_0

    .line 100
    :pswitch_1
    sget-object p1, Lcom/ibotta/android/views/list/VerticalLayout;->INSTANCE:Lcom/ibotta/android/views/list/VerticalLayout;

    check-cast p1, Lcom/ibotta/android/views/list/LayoutType;

    goto :goto_0

    .line 99
    :pswitch_2
    new-instance p1, Lcom/ibotta/android/views/list/GridLayout;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Lcom/ibotta/android/views/list/GridLayout;-><init>(I)V

    check-cast p1, Lcom/ibotta/android/views/list/LayoutType;

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final getPadding(Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/Padding;
    .locals 11

    .line 53
    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    .line 70
    new-instance p1, Lcom/ibotta/android/views/list/Padding;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xf

    const/4 v10, 0x0

    move-object v4, p1

    invoke-direct/range {v4 .. v10}, Lcom/ibotta/android/views/list/Padding;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    .line 69
    :pswitch_0
    new-instance p1, Lcom/ibotta/android/views/list/Padding;

    const/4 v1, 0x0

    sget v2, Lcom/ibotta/android/reducers/R$dimen;->size_18:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xd

    const/4 v6, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/views/list/Padding;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    .line 64
    :pswitch_1
    new-instance p1, Lcom/ibotta/android/views/list/Padding;

    .line 65
    sget v0, Lcom/ibotta/android/reducers/R$dimen;->size_0:I

    .line 66
    sget v1, Lcom/ibotta/android/reducers/R$dimen;->size_12:I

    .line 67
    sget v2, Lcom/ibotta/android/reducers/R$dimen;->size_0:I

    .line 68
    sget v3, Lcom/ibotta/android/reducers/R$dimen;->size_12:I

    .line 64
    invoke-direct {p1, v0, v1, v2, v3}, Lcom/ibotta/android/views/list/Padding;-><init>(IIII)V

    goto :goto_0

    .line 59
    :pswitch_2
    new-instance p1, Lcom/ibotta/android/views/list/Padding;

    .line 60
    sget v0, Lcom/ibotta/android/reducers/R$dimen;->size_12:I

    .line 61
    sget v1, Lcom/ibotta/android/reducers/R$dimen;->size_18:I

    .line 62
    sget v2, Lcom/ibotta/android/reducers/R$dimen;->size_12:I

    .line 63
    sget v3, Lcom/ibotta/android/reducers/R$dimen;->size_36:I

    .line 59
    invoke-direct {p1, v0, v1, v2, v3}, Lcom/ibotta/android/views/list/Padding;-><init>(IIII)V

    goto :goto_0

    .line 54
    :pswitch_3
    new-instance p1, Lcom/ibotta/android/views/list/Padding;

    .line 55
    sget v0, Lcom/ibotta/android/reducers/R$dimen;->size_6:I

    .line 56
    sget v1, Lcom/ibotta/android/reducers/R$dimen;->size_0:I

    .line 57
    sget v2, Lcom/ibotta/android/reducers/R$dimen;->size_6:I

    .line 58
    sget v3, Lcom/ibotta/android/reducers/R$dimen;->size_0:I

    .line 54
    invoke-direct {p1, v0, v1, v2, v3}, Lcom/ibotta/android/views/list/Padding;-><init>(IIII)V

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final shouldUseSnapHelper(Lcom/ibotta/android/ilv/ListType;)Z
    .locals 1

    .line 104
    sget-object v0, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer$WhenMappings;->$EnumSwitchMapping$3:[I

    invoke-virtual {p1}, Lcom/ibotta/android/ilv/ListType;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method


# virtual methods
.method public final buildWithStyle(Lcom/ibotta/android/views/list/IbottaListViewState$Builder;Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/IbottaListViewState;
    .locals 1
    .param p1    # Lcom/ibotta/android/views/list/IbottaListViewState$Builder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/ilv/ListType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-direct {p0, p2}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->getLayoutType(Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/LayoutType;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->layoutType(Lcom/ibotta/android/views/list/LayoutType;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    move-result-object p1

    .line 42
    invoke-direct {p0, p2}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->getDecorator(Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/Decorator;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->decorator(Lcom/ibotta/android/views/list/Decorator;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    move-result-object p1

    .line 43
    invoke-direct {p0, p2}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->getPadding(Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/Padding;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->padding(Lcom/ibotta/android/views/list/Padding;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    move-result-object p1

    .line 44
    invoke-direct {p0, p2}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->shouldUseSnapHelper(Lcom/ibotta/android/ilv/ListType;)Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->useSnapHelper(Z)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    move-result-object p1

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->build()Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    return-object p1
.end method

.method public final copyWithStyle(Lcom/ibotta/android/views/list/IbottaListViewState;Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/IbottaListViewState;
    .locals 11
    .param p1    # Lcom/ibotta/android/views/list/IbottaListViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/ilv/ListType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    invoke-direct {p0, p2}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->getDecorator(Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/Decorator;

    move-result-object v4

    .line 49
    invoke-direct {p0, p2}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->getPadding(Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/Padding;

    move-result-object v5

    .line 50
    invoke-direct {p0, p2}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->shouldUseSnapHelper(Lcom/ibotta/android/ilv/ListType;)Z

    move-result v7

    .line 51
    invoke-direct {p0, p2}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->getLayoutType(Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/LayoutType;

    move-result-object v6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x43

    const/4 v10, 0x0

    move-object v1, p1

    .line 47
    invoke-static/range {v1 .. v10}, Lcom/ibotta/android/views/list/IbottaListViewState;->copy$default(Lcom/ibotta/android/views/list/IbottaListViewState;Ljava/lang/String;Ljava/util/List;Lcom/ibotta/android/views/list/Decorator;Lcom/ibotta/android/views/list/Padding;Lcom/ibotta/android/views/list/LayoutType;ZLcom/ibotta/android/tracking/content/TrackingPayload;ILjava/lang/Object;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    return-object p1
.end method
