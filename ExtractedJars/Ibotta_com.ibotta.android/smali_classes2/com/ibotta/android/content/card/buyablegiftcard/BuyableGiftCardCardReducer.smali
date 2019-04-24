.class public final Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;
.super Ljava/lang/Object;
.source "BuyableGiftCardCardReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;",
        "",
        "buyableGiftCardImageReducer",
        "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;",
        "buyableGiftCardSummaryReducer",
        "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;",
        "payAtRetailerButtonReducer",
        "Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;",
        "contentBackgroundReducer",
        "Lcom/ibotta/android/content/ContentBackgroundReducer;",
        "(Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)V",
        "create",
        "Lcom/ibotta/android/content/card/ContentCardViewState;",
        "buyableGiftCardModel",
        "Lcom/ibotta/api/model/BuyableGiftCardModel;",
        "retailerModel",
        "Lcom/ibotta/api/model/RetailerModel;",
        "contentStyle",
        "Lcom/ibotta/android/views/content/ContentStyle;",
        "getPayAtRetailerButtonVisibility",
        "Lcom/ibotta/android/views/components/Visibility;",
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
.field private final buyableGiftCardImageReducer:Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;

.field private final buyableGiftCardSummaryReducer:Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;

.field private final contentBackgroundReducer:Lcom/ibotta/android/content/ContentBackgroundReducer;

.field private final payAtRetailerButtonReducer:Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/content/ContentBackgroundReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "buyableGiftCardImageReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buyableGiftCardSummaryReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payAtRetailerButtonReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentBackgroundReducer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;->buyableGiftCardImageReducer:Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;

    iput-object p2, p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;->buyableGiftCardSummaryReducer:Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;

    iput-object p3, p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;->payAtRetailerButtonReducer:Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;

    iput-object p4, p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;->contentBackgroundReducer:Lcom/ibotta/android/content/ContentBackgroundReducer;

    return-void
.end method

.method private final getPayAtRetailerButtonVisibility(Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/components/Visibility;
    .locals 2

    .line 35
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->SPOTLIGHT:Lcom/ibotta/android/views/content/ContentStyle;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ne p1, v1, :cond_1

    .line 36
    sget-object p1, Lcom/ibotta/android/views/components/Visibility;->VISIBLE:Lcom/ibotta/android/views/components/Visibility;

    goto :goto_1

    :cond_1
    if-nez p1, :cond_2

    .line 37
    sget-object p1, Lcom/ibotta/android/views/components/Visibility;->GONE:Lcom/ibotta/android/views/components/Visibility;

    :goto_1
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/BuyableGiftCardModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/content/card/ContentCardViewState;
    .locals 18
    .param p1    # Lcom/ibotta/api/model/BuyableGiftCardModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/content/ContentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    move-object/from16 v2, p3

    const-string v4, "buyableGiftCardModel"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "retailerModel"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "contentStyle"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    new-instance v16, Lcom/ibotta/android/content/card/ContentCardViewState;

    .line 22
    move-object v4, v1

    check-cast v4, Lcom/ibotta/api/model/ContentModel;

    .line 24
    iget-object v5, v0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;->buyableGiftCardImageReducer:Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;

    invoke-virtual {v5, v1, v2}, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardImageReducer;->create(Lcom/ibotta/api/model/BuyableGiftCardModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/content/ContentImageViewState;

    move-result-object v6

    .line 25
    iget-object v5, v0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;->buyableGiftCardSummaryReducer:Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;

    invoke-virtual {v5, v1, v2}, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;->create(Lcom/ibotta/api/model/BuyableGiftCardModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/content/SummaryContentViewState;

    move-result-object v5

    .line 26
    iget-object v1, v0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;->contentBackgroundReducer:Lcom/ibotta/android/content/ContentBackgroundReducer;

    const/4 v7, 0x0

    invoke-virtual {v1, v7}, Lcom/ibotta/android/content/ContentBackgroundReducer;->create(Z)I

    move-result v10

    .line 27
    sget-object v7, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->EMPTY:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    .line 28
    sget-object v8, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->GONE:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    .line 29
    sget-object v9, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->GONE:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    .line 30
    iget-object v1, v0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;->payAtRetailerButtonReducer:Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;

    .line 31
    invoke-direct {v0, v2}, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardCardReducer;->getPayAtRetailerButtonVisibility(Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/components/Visibility;

    move-result-object v2

    .line 30
    invoke-virtual {v1, v3, v2}, Lcom/ibotta/android/content/card/buyablegiftcard/PayAtRetailerButtonReducer;->create(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/components/Visibility;)Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;

    move-result-object v11

    .line 32
    sget-object v12, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;->GONE:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0xc00

    const/16 v17, 0x0

    move-object/from16 v1, v16

    move-object v2, v4

    move-object v4, v5

    move-object v5, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v12

    move-object v12, v13

    move-object v13, v14

    move v14, v15

    move-object/from16 v15, v17

    .line 21
    invoke-direct/range {v1 .. v15}, Lcom/ibotta/android/content/card/ContentCardViewState;-><init>(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/SummaryContentViewState;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;Lcom/ibotta/android/views/content/ContentImageViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/spotlight/RetailerStackViewState;ILcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;Lcom/ibotta/android/views/generic/LayoutViewState;Lcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v16
.end method
