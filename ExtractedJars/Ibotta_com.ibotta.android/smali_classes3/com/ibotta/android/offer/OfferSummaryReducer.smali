.class public final Lcom/ibotta/android/offer/OfferSummaryReducer;
.super Ljava/lang/Object;
.source "OfferSummaryReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cJ\u000e\u0010\r\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002\u00a2\u0006\u0002\u0010\u0010J\u0018\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u000cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/ibotta/android/offer/OfferSummaryReducer;",
        "",
        "offerHelper",
        "Lcom/ibotta/api/helper/offer/OfferHelper;",
        "resources",
        "Landroid/content/res/Resources;",
        "(Lcom/ibotta/api/helper/offer/OfferHelper;Landroid/content/res/Resources;)V",
        "createForCard",
        "Lcom/ibotta/android/views/content/SummaryContentViewState;",
        "offerModel",
        "Lcom/ibotta/api/model/OfferModel;",
        "style",
        "Lcom/ibotta/android/views/content/ContentStyle;",
        "createForRow",
        "getBottomTextLines",
        "",
        "(Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/Integer;",
        "getBottomTextMaxLines",
        "getDescription",
        "",
        "kotlin.jvm.PlatformType",
        "getType",
        "isHeroOrSpotlight",
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


# instance fields
.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private final resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/helper/offer/OfferHelper;Landroid/content/res/Resources;)V
    .locals 1
    .param p1    # Lcom/ibotta/api/helper/offer/OfferHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "offerHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/offer/OfferSummaryReducer;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iput-object p2, p0, Lcom/ibotta/android/offer/OfferSummaryReducer;->resources:Landroid/content/res/Resources;

    return-void
.end method

.method private final getBottomTextLines(Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/Integer;
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/ibotta/android/offer/OfferSummaryReducer;->isHeroOrSpotlight(Lcom/ibotta/android/views/content/ContentStyle;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final getBottomTextMaxLines(Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/Integer;
    .locals 0

    .line 34
    invoke-direct {p0, p1}, Lcom/ibotta/android/offer/OfferSummaryReducer;->isHeroOrSpotlight(Lcom/ibotta/android/views/content/ContentStyle;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private final getDescription(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;
    .locals 5

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/offer/OfferSummaryReducer;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->offer_card_description:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getDescription()Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x1

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getType(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/offer/OfferSummaryReducer;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/api/helper/offer/OfferHelper;->isShopNow(Lcom/ibotta/api/model/OfferModel;)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 39
    iget-object p1, p0, Lcom/ibotta/android/offer/OfferSummaryReducer;->resources:Landroid/content/res/Resources;

    sget v0, Lcom/ibotta/android/reducers/R$string;->common_online:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 40
    iget-object p1, p0, Lcom/ibotta/android/offer/OfferSummaryReducer;->resources:Landroid/content/res/Resources;

    sget v0, Lcom/ibotta/android/reducers/R$string;->offer_card_in_store:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final isHeroOrSpotlight(Lcom/ibotta/android/views/content/ContentStyle;)Z
    .locals 1

    .line 32
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->SPOTLIGHT:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public final createForCard(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/content/SummaryContentViewState;
    .locals 11
    .param p1    # Lcom/ibotta/api/model/OfferModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/content/ContentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "offerModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    new-instance v0, Lcom/ibotta/android/views/content/SummaryContentViewState;

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/offer/OfferSummaryReducer;->getType(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;

    move-result-object v2

    const-string v1, "getType(offerModel)"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getCurrentValue()Ljava/lang/String;

    move-result-object v4

    const-string v1, "offerModel.currentValue"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/offer/OfferSummaryReducer;->getDescription(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;

    move-result-object v5

    const-string p1, "getDescription(offerModel)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0, p2}, Lcom/ibotta/android/offer/OfferSummaryReducer;->getBottomTextMaxLines(Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/Integer;

    move-result-object v6

    .line 24
    invoke-direct {p0, p2}, Lcom/ibotta/android/offer/OfferSummaryReducer;->getBottomTextLines(Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/Integer;

    move-result-object v7

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x42

    const/4 v10, 0x0

    move-object v1, v0

    .line 19
    invoke-direct/range {v1 .. v10}, Lcom/ibotta/android/views/content/SummaryContentViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final createForRow(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/views/content/SummaryContentViewState;
    .locals 11
    .param p1    # Lcom/ibotta/api/model/OfferModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "offerModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    new-instance v0, Lcom/ibotta/android/views/content/SummaryContentViewState;

    .line 27
    invoke-direct {p0, p1}, Lcom/ibotta/android/offer/OfferSummaryReducer;->getType(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;

    move-result-object v2

    const-string v1, "getType(offerModel)"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getCurrentValue()Ljava/lang/String;

    move-result-object v4

    const-string v1, "offerModel.currentValue"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-direct {p0, p1}, Lcom/ibotta/android/offer/OfferSummaryReducer;->getDescription(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;

    move-result-object v5

    const-string p1, "getDescription(offerModel)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x2

    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x62

    const/4 v10, 0x0

    move-object v1, v0

    .line 26
    invoke-direct/range {v1 .. v10}, Lcom/ibotta/android/views/content/SummaryContentViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
