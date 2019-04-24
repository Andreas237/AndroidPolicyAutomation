.class public final Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;
.super Ljava/lang/Object;
.source "OfferBadgeViewReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u000e\u0010\r\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nJ;\u0010\u000f\u001a\u0002H\u0010\"\u0004\u0008\u0000\u0010\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u0002H\u00102\u0006\u0010\u0012\u001a\u0002H\u00102\u0006\u0010\u0013\u001a\u0002H\u00102\u0006\u0010\u0014\u001a\u0002H\u0010H\u0002\u00a2\u0006\u0002\u0010\u0015J\'\u0010\u0016\u001a\u00020\u000c2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;",
        "",
        "appConfig",
        "Lcom/ibotta/android/state/app/config/AppConfig;",
        "resources",
        "Landroid/content/res/Resources;",
        "(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/content/res/Resources;)V",
        "create",
        "Lcom/ibotta/android/views/offer/badge/BadgeViewState;",
        "offerModel",
        "Lcom/ibotta/api/model/OfferModel;",
        "isGone",
        "",
        "createOrGone",
        "createOrInvisible",
        "getContent",
        "T",
        "redemptionLimitVal",
        "redemptionMinVal",
        "comboVal",
        "defaultVal",
        "(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
        "isBadgeViewStatePopulated",
        "drawableRes",
        "",
        "contentDescription",
        "",
        "text",
        "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Z",
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
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/config/AppConfig;Landroid/content/res/Resources;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/state/app/config/AppConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    iput-object p2, p0, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;->resources:Landroid/content/res/Resources;

    return-void
.end method

.method private final create(Lcom/ibotta/api/model/OfferModel;Z)Lcom/ibotta/android/views/offer/badge/BadgeViewState;
    .locals 17

    move-object/from16 v6, p0

    .line 21
    sget v0, Lcom/ibotta/android/reducers/R$drawable;->svg_icn_redemption_limit:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 22
    sget-object v0, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->Companion:Lcom/ibotta/android/offer/badge/OfferBadgeMultiples$Companion;

    invoke-interface/range {p1 .. p1}, Lcom/ibotta/api/model/OfferModel;->getMultiplesCount()S

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples$Companion;->fromQuantity(I)Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/offer/badge/OfferBadgeMultiples;->getDrawableResId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 23
    sget v0, Lcom/ibotta/android/reducers/R$drawable;->svg_icn_ampersand:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v7, 0x0

    .line 24
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 19
    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;->getContent(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v10

    .line 28
    iget-object v0, v6, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->badge_type_limit_accessibility:I

    const/4 v8, 0x1

    new-array v2, v8, [Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, Lcom/ibotta/api/model/OfferModel;->getRedemptionMax()S

    move-result v3

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 29
    iget-object v0, v6, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->badge_type_must_buy_accessibility:I

    new-array v3, v8, [Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, Lcom/ibotta/api/model/OfferModel;->getMultiplesCount()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-virtual {v0, v1, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 30
    iget-object v0, v6, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->offer_type_indicator_combo_accessibility:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 26
    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;->getContent(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/String;

    .line 35
    iget-object v0, v6, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->badge_type_limit:I

    new-array v2, v8, [Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, Lcom/ibotta/api/model/OfferModel;->getRedemptionMax()S

    move-result v3

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 36
    iget-object v0, v6, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->badge_type_must_buy:I

    new-array v3, v8, [Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, Lcom/ibotta/api/model/OfferModel;->getMultiplesCount()S

    move-result v4

    invoke-static {v4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-virtual {v0, v1, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 37
    iget-object v0, v6, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->badge_type_combo:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, ""

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 33
    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;->getContent(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/lang/String;

    .line 40
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "contentDescription"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "text"

    invoke-static {v14, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v0, v13, v14}, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;->isBadgeViewStatePopulated(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-ne v0, v8, :cond_0

    .line 41
    new-instance v0, Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    const/4 v9, 0x0

    .line 44
    sget v11, Lcom/ibotta/android/reducers/R$drawable;->background_gray_94_rounded_corners:I

    .line 45
    sget v12, Lcom/ibotta/android/reducers/R$dimen;->size_11:I

    const/4 v15, 0x1

    const/16 v16, 0x0

    move-object v8, v0

    .line 41
    invoke-direct/range {v8 .. v16}, Lcom/ibotta/android/views/offer/badge/BadgeViewState;-><init>(Lcom/ibotta/android/views/components/Visibility;IIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    if-nez v0, :cond_2

    if-eqz p2, :cond_1

    .line 47
    sget-object v0, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->GONE:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->INVISIBLE:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    :goto_0
    return-object v0

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private final getContent(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/ibotta/api/model/OfferModel;",
            "TT;TT;TT;TT;)TT;"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->showQuantityBadge()Z

    move-result v0

    .line 66
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isMultipleRedemptions()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 67
    :goto_0
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isMultiples()Z

    move-result v1

    .line 68
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isCombo()Z

    move-result p1

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v1, :cond_2

    move-object p2, p3

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_3

    move-object p2, p4

    goto :goto_1

    :cond_3
    move-object p2, p5

    :goto_1
    return-object p2
.end method

.method private final isBadgeViewStatePopulated(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const-string p1, ""

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v0

    if-eqz p1, :cond_1

    const-string p1, ""

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v0

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method


# virtual methods
.method public final createOrGone(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/views/offer/badge/BadgeViewState;
    .locals 1
    .param p1    # Lcom/ibotta/api/model/OfferModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "offerModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 51
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;->create(Lcom/ibotta/api/model/OfferModel;Z)Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    move-result-object p1

    return-object p1
.end method

.method public final createOrInvisible(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/views/offer/badge/BadgeViewState;
    .locals 1
    .param p1    # Lcom/ibotta/api/model/OfferModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "offerModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 53
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;->create(Lcom/ibotta/api/model/OfferModel;Z)Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    move-result-object p1

    return-object p1
.end method
