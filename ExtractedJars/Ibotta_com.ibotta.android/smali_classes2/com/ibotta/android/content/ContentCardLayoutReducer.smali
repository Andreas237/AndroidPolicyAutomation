.class public final Lcom/ibotta/android/content/ContentCardLayoutReducer;
.super Ljava/lang/Object;
.source "ContentCardLayoutReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0008H\u0002\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/ibotta/android/content/ContentCardLayoutReducer;",
        "",
        "()V",
        "create",
        "Lcom/ibotta/android/views/generic/LayoutViewState;",
        "contentType",
        "Lcom/ibotta/api/model/ContentModel$Type;",
        "contentStyle",
        "Lcom/ibotta/android/views/content/ContentStyle;",
        "getOfferCardLayoutParams",
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

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getOfferCardLayoutParams(Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/generic/LayoutViewState;
    .locals 2

    .line 24
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->SIDE_SCROLLER:Lcom/ibotta/android/views/content/ContentStyle;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ne p1, v1, :cond_1

    .line 25
    new-instance p1, Lcom/ibotta/android/views/generic/LayoutViewState;

    .line 26
    new-instance v0, Lcom/ibotta/android/views/generic/Hardcoded;

    sget-object v1, Lcom/ibotta/android/views/util/CardHelper;->INSTANCE:Lcom/ibotta/android/views/util/CardHelper;

    invoke-virtual {v1}, Lcom/ibotta/android/views/util/CardHelper;->getOfferSsWidth()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/views/generic/Hardcoded;-><init>(I)V

    check-cast v0, Lcom/ibotta/android/views/generic/LayoutAttribute;

    .line 27
    sget-object v1, Lcom/ibotta/android/views/generic/WrapContent;->INSTANCE:Lcom/ibotta/android/views/generic/WrapContent;

    check-cast v1, Lcom/ibotta/android/views/generic/LayoutAttribute;

    .line 25
    invoke-direct {p1, v0, v1}, Lcom/ibotta/android/views/generic/LayoutViewState;-><init>(Lcom/ibotta/android/views/generic/LayoutAttribute;Lcom/ibotta/android/views/generic/LayoutAttribute;)V

    goto :goto_1

    :cond_1
    if-nez p1, :cond_2

    .line 28
    new-instance p1, Lcom/ibotta/android/views/generic/LayoutViewState;

    sget-object v0, Lcom/ibotta/android/views/generic/MatchParent;->INSTANCE:Lcom/ibotta/android/views/generic/MatchParent;

    check-cast v0, Lcom/ibotta/android/views/generic/LayoutAttribute;

    sget-object v1, Lcom/ibotta/android/views/generic/WrapContent;->INSTANCE:Lcom/ibotta/android/views/generic/WrapContent;

    check-cast v1, Lcom/ibotta/android/views/generic/LayoutAttribute;

    invoke-direct {p1, v0, v1}, Lcom/ibotta/android/views/generic/LayoutViewState;-><init>(Lcom/ibotta/android/views/generic/LayoutAttribute;Lcom/ibotta/android/views/generic/LayoutAttribute;)V

    :goto_1
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/ContentModel$Type;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/generic/LayoutViewState;
    .locals 1
    .param p1    # Lcom/ibotta/api/model/ContentModel$Type;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/content/ContentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "contentType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    sget-object v0, Lcom/ibotta/android/content/ContentCardLayoutReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/ibotta/api/model/ContentModel$Type;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 21
    new-instance p1, Lcom/ibotta/android/views/generic/LayoutViewState;

    sget-object p2, Lcom/ibotta/android/views/generic/MatchParent;->INSTANCE:Lcom/ibotta/android/views/generic/MatchParent;

    check-cast p2, Lcom/ibotta/android/views/generic/LayoutAttribute;

    sget-object v0, Lcom/ibotta/android/views/generic/WrapContent;->INSTANCE:Lcom/ibotta/android/views/generic/WrapContent;

    check-cast v0, Lcom/ibotta/android/views/generic/LayoutAttribute;

    invoke-direct {p1, p2, v0}, Lcom/ibotta/android/views/generic/LayoutViewState;-><init>(Lcom/ibotta/android/views/generic/LayoutAttribute;Lcom/ibotta/android/views/generic/LayoutAttribute;)V

    goto :goto_0

    .line 20
    :cond_0
    invoke-direct {p0, p2}, Lcom/ibotta/android/content/ContentCardLayoutReducer;->getOfferCardLayoutParams(Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/generic/LayoutViewState;

    move-result-object p1

    :goto_0
    return-object p1
.end method
