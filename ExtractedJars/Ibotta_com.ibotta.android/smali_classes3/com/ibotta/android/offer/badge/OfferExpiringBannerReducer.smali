.class public final Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;
.super Ljava/lang/Object;
.source "OfferExpiringBannerReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0008H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;",
        "",
        "expiringBannerCalculation",
        "Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;",
        "(Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;)V",
        "createLarge",
        "Lcom/ibotta/android/views/offer/badge/BadgeViewState;",
        "offerModel",
        "Lcom/ibotta/api/model/OfferModel;",
        "createSmall",
        "getExpiringBadgeViewState",
        "isSmallBadge",
        "",
        "getTimeCalc",
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
.field private final expiringBannerCalculation:Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "expiringBannerCalculation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;->expiringBannerCalculation:Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;

    return-void
.end method

.method private final getExpiringBadgeViewState(Lcom/ibotta/api/model/OfferModel;Z)Lcom/ibotta/android/views/offer/badge/BadgeViewState;
    .locals 11

    .line 17
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isExpiringSoon()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 18
    new-instance v0, Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    const/4 v3, 0x0

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;->getTimeCalc(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;

    move-result-object v8

    .line 20
    sget v5, Lcom/ibotta/android/reducers/R$drawable;->background_light_green_transparent_rounded_corners:I

    if-eqz p2, :cond_0

    .line 21
    sget p1, Lcom/ibotta/android/reducers/R$dimen;->size_14:I

    goto :goto_0

    :cond_0
    sget p1, Lcom/ibotta/android/reducers/R$dimen;->size_16:I

    :goto_0
    move v6, p1

    const/4 v7, 0x0

    .line 22
    sget v4, Lcom/ibotta/android/reducers/R$drawable;->svg_activity_timer:I

    const/16 v9, 0x11

    const/4 v10, 0x0

    move-object v2, v0

    .line 18
    invoke-direct/range {v2 .. v10}, Lcom/ibotta/android/views/offer/badge/BadgeViewState;-><init>(Lcom/ibotta/android/views/components/Visibility;IIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    if-nez v0, :cond_2

    .line 23
    sget-object v0, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->GONE:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    :goto_1
    return-object v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final getTimeCalc(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;
    .locals 3

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;->expiringBannerCalculation:Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getExpiration()Ljava/util/Date;

    move-result-object p1

    const-string v1, "offerModel.expiration"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/offer/badge/ExpiringBannerCalculation;->getExpiringBanner(J)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final createLarge(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/views/offer/badge/BadgeViewState;
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

    .line 12
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;->getExpiringBadgeViewState(Lcom/ibotta/api/model/OfferModel;Z)Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    move-result-object p1

    return-object p1
.end method

.method public final createSmall(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/views/offer/badge/BadgeViewState;
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

    .line 14
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;->getExpiringBadgeViewState(Lcom/ibotta/api/model/OfferModel;Z)Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    move-result-object p1

    return-object p1
.end method
