.class public final Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;
.super Ljava/lang/Object;
.source "BuyableGiftCardSummaryReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u000cH\u0002\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\u000cH\u0002\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;",
        "",
        "formatting",
        "Lcom/ibotta/android/util/Formatting;",
        "resources",
        "Landroid/content/res/Resources;",
        "(Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;)V",
        "create",
        "Lcom/ibotta/android/views/content/SummaryContentViewState;",
        "buyableGiftCardModel",
        "Lcom/ibotta/api/model/BuyableGiftCardModel;",
        "contentStyle",
        "Lcom/ibotta/android/views/content/ContentStyle;",
        "getBottomText",
        "",
        "getBottomTextLines",
        "",
        "(Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/Integer;",
        "getBottomTextMaxLines",
        "getCenterText",
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
.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private final resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/util/Formatting;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "formatting"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    iput-object p2, p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;->resources:Landroid/content/res/Resources;

    return-void
.end method

.method private final getBottomText(Lcom/ibotta/api/model/BuyableGiftCardModel;)Ljava/lang/String;
    .locals 5

    .line 34
    iget-object v0, p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRewardPercentage()F

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Formatting;->prettifyFloatToStringPercentage(F)Ljava/lang/String;

    move-result-object v0

    .line 35
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getName()Ljava/lang/String;

    move-result-object v1

    .line 36
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_gift_cards_card_description:I

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v0, v3, v1

    invoke-virtual {p1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "resources.getString(R.st\u2026retailerName, percentage)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final getBottomTextLines(Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/Integer;
    .locals 1

    .line 44
    sget-object v0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/ContentStyle;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x2

    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final getBottomTextMaxLines(Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/Integer;
    .locals 1

    .line 39
    sget-object v0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/ContentStyle;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x2

    .line 40
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final getCenterText(Lcom/ibotta/api/model/BuyableGiftCardModel;)Ljava/lang/String;
    .locals 4

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRewardPercentage()F

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Formatting;->prettifyFloatToStringPercentage(F)Ljava/lang/String;

    move-result-object p1

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->common_percent_cash_back:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "resources.getString(R.st\u2026nt_cash_back, percentage)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/BuyableGiftCardModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/content/SummaryContentViewState;
    .locals 11
    .param p1    # Lcom/ibotta/api/model/BuyableGiftCardModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/content/ContentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "buyableGiftCardModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    new-instance v0, Lcom/ibotta/android/views/content/SummaryContentViewState;

    .line 20
    sget-object v3, Lcom/ibotta/android/views/components/Visibility;->INVISIBLE:Lcom/ibotta/android/views/components/Visibility;

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;->getCenterText(Lcom/ibotta/api/model/BuyableGiftCardModel;)Ljava/lang/String;

    move-result-object v4

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;->getBottomText(Lcom/ibotta/api/model/BuyableGiftCardModel;)Ljava/lang/String;

    move-result-object v5

    .line 23
    invoke-direct {p0, p2}, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;->getBottomTextMaxLines(Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/Integer;

    move-result-object v6

    .line 24
    invoke-direct {p0, p2}, Lcom/ibotta/android/content/card/buyablegiftcard/BuyableGiftCardSummaryReducer;->getBottomTextLines(Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/Integer;

    move-result-object v7

    const/4 v2, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x41

    const/4 v10, 0x0

    move-object v1, v0

    .line 19
    invoke-direct/range {v1 .. v10}, Lcom/ibotta/android/views/content/SummaryContentViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
