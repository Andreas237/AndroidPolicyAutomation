.class public final Lcom/ibotta/android/content/card/offer/OfferCardReducer;
.super Ljava/lang/Object;
.source "OfferCardReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J@\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001e2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u001aH\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"
    }
    d2 = {
        "Lcom/ibotta/android/content/card/offer/OfferCardReducer;",
        "",
        "offerButtonReducer",
        "Lcom/ibotta/android/button/OfferButtonReducer;",
        "offerBadgeViewReducer",
        "Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;",
        "offerExpiringBannerReducer",
        "Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;",
        "offerSummaryReducer",
        "Lcom/ibotta/android/offer/OfferSummaryReducer;",
        "offerImageReducer",
        "Lcom/ibotta/android/content/card/offer/OfferImageReducer;",
        "contentCardLayoutReducer",
        "Lcom/ibotta/android/content/ContentCardLayoutReducer;",
        "retailerStackReducer",
        "Lcom/ibotta/android/retailer/RetailerStackReducer;",
        "contentBackgroundReducer",
        "Lcom/ibotta/android/content/ContentBackgroundReducer;",
        "(Lcom/ibotta/android/button/OfferButtonReducer;Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;Lcom/ibotta/android/offer/OfferSummaryReducer;Lcom/ibotta/android/content/card/offer/OfferImageReducer;Lcom/ibotta/android/content/ContentCardLayoutReducer;Lcom/ibotta/android/retailer/RetailerStackReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)V",
        "create",
        "Lcom/ibotta/android/content/card/ContentCardViewState;",
        "offerModel",
        "Lcom/ibotta/api/model/OfferModel;",
        "retailerModel",
        "Lcom/ibotta/api/model/RetailerModel;",
        "contentStyle",
        "Lcom/ibotta/android/views/content/ContentStyle;",
        "customer",
        "Lcom/ibotta/api/model/customer/Customer;",
        "isEditing",
        "",
        "isSelected",
        "getLayoutViewState",
        "Lcom/ibotta/android/views/generic/LayoutViewState;",
        "style",
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
.field private final contentBackgroundReducer:Lcom/ibotta/android/content/ContentBackgroundReducer;

.field private final contentCardLayoutReducer:Lcom/ibotta/android/content/ContentCardLayoutReducer;

.field private final offerBadgeViewReducer:Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;

.field private final offerButtonReducer:Lcom/ibotta/android/button/OfferButtonReducer;

.field private final offerExpiringBannerReducer:Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;

.field private final offerImageReducer:Lcom/ibotta/android/content/card/offer/OfferImageReducer;

.field private final offerSummaryReducer:Lcom/ibotta/android/offer/OfferSummaryReducer;

.field private final retailerStackReducer:Lcom/ibotta/android/retailer/RetailerStackReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/button/OfferButtonReducer;Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;Lcom/ibotta/android/offer/OfferSummaryReducer;Lcom/ibotta/android/content/card/offer/OfferImageReducer;Lcom/ibotta/android/content/ContentCardLayoutReducer;Lcom/ibotta/android/retailer/RetailerStackReducer;Lcom/ibotta/android/content/ContentBackgroundReducer;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/button/OfferButtonReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/offer/OfferSummaryReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/content/card/offer/OfferImageReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/ibotta/android/content/ContentCardLayoutReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/ibotta/android/retailer/RetailerStackReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/ibotta/android/content/ContentBackgroundReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "offerButtonReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offerBadgeViewReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offerExpiringBannerReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offerSummaryReducer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offerImageReducer"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentCardLayoutReducer"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retailerStackReducer"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentBackgroundReducer"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->offerButtonReducer:Lcom/ibotta/android/button/OfferButtonReducer;

    iput-object p2, p0, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->offerBadgeViewReducer:Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;

    iput-object p3, p0, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->offerExpiringBannerReducer:Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;

    iput-object p4, p0, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->offerSummaryReducer:Lcom/ibotta/android/offer/OfferSummaryReducer;

    iput-object p5, p0, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->offerImageReducer:Lcom/ibotta/android/content/card/offer/OfferImageReducer;

    iput-object p6, p0, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->contentCardLayoutReducer:Lcom/ibotta/android/content/ContentCardLayoutReducer;

    iput-object p7, p0, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->retailerStackReducer:Lcom/ibotta/android/retailer/RetailerStackReducer;

    iput-object p8, p0, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->contentBackgroundReducer:Lcom/ibotta/android/content/ContentBackgroundReducer;

    return-void
.end method

.method public static synthetic create$default(Lcom/ibotta/android/content/card/offer/OfferCardReducer;Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;Lcom/ibotta/api/model/customer/Customer;ZZILjava/lang/Object;)Lcom/ibotta/android/content/card/ContentCardViewState;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    const/4 p4, 0x0

    .line 36
    check-cast p4, Lcom/ibotta/api/model/customer/Customer;

    move-object v4, p4

    goto :goto_0

    :cond_0
    move-object v4, p4

    :goto_0
    and-int/lit8 p4, p7, 0x10

    const/4 p8, 0x0

    if-eqz p4, :cond_1

    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    move v5, p5

    :goto_1
    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_2

    const/4 v6, 0x0

    goto :goto_2

    :cond_2
    move v6, p6

    :goto_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    .line 38
    invoke-virtual/range {v0 .. v6}, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->create(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;Lcom/ibotta/api/model/customer/Customer;ZZ)Lcom/ibotta/android/content/card/ContentCardViewState;

    move-result-object p0

    return-object p0
.end method

.method private final getLayoutViewState(Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/generic/LayoutViewState;
    .locals 2

    .line 55
    sget-object v0, Lcom/ibotta/android/content/card/offer/OfferCardReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/ContentStyle;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 56
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->contentCardLayoutReducer:Lcom/ibotta/android/content/ContentCardLayoutReducer;

    sget-object v1, Lcom/ibotta/api/model/ContentModel$Type;->OFFER:Lcom/ibotta/api/model/ContentModel$Type;

    invoke-virtual {v0, v1, p1}, Lcom/ibotta/android/content/ContentCardLayoutReducer;->create(Lcom/ibotta/api/model/ContentModel$Type;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/generic/LayoutViewState;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/ContentStyle;Lcom/ibotta/api/model/customer/Customer;ZZ)Lcom/ibotta/android/content/card/ContentCardViewState;
    .locals 20
    .param p1    # Lcom/ibotta/api/model/OfferModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/content/ContentStyle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/api/model/customer/Customer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move/from16 v3, p6

    const-string v4, "offerModel"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "contentStyle"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    new-instance v4, Lcom/ibotta/android/content/card/ContentCardViewState;

    .line 39
    move-object v6, v1

    check-cast v6, Lcom/ibotta/api/model/ContentModel;

    .line 41
    iget-object v5, v0, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->offerImageReducer:Lcom/ibotta/android/content/card/offer/OfferImageReducer;

    invoke-virtual {v5, v1, v2}, Lcom/ibotta/android/content/card/offer/OfferImageReducer;->create(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/content/ContentImageViewState;

    move-result-object v10

    .line 42
    iget-object v5, v0, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->offerBadgeViewReducer:Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;

    invoke-virtual {v5, v1}, Lcom/ibotta/android/offer/badge/OfferBadgeViewReducer;->createOrInvisible(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    move-result-object v12

    .line 43
    iget-object v5, v0, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->offerSummaryReducer:Lcom/ibotta/android/offer/OfferSummaryReducer;

    invoke-virtual {v5, v1, v2}, Lcom/ibotta/android/offer/OfferSummaryReducer;->createForCard(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/content/SummaryContentViewState;

    move-result-object v8

    .line 44
    iget-object v5, v0, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->contentBackgroundReducer:Lcom/ibotta/android/content/ContentBackgroundReducer;

    invoke-virtual {v5, v3}, Lcom/ibotta/android/content/ContentBackgroundReducer;->create(Z)I

    move-result v14

    .line 45
    iget-object v5, v0, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->offerExpiringBannerReducer:Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;

    invoke-virtual {v5, v1}, Lcom/ibotta/android/offer/badge/OfferExpiringBannerReducer;->createLarge(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    move-result-object v11

    .line 46
    iget-object v5, v0, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->retailerStackReducer:Lcom/ibotta/android/retailer/RetailerStackReducer;

    move-object/from16 v7, p2

    invoke-virtual {v5, v1, v7}, Lcom/ibotta/android/retailer/RetailerStackReducer;->create(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    move-result-object v13

    .line 47
    sget-object v15, Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;->GONE:Lcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;

    .line 48
    invoke-direct {v0, v2}, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->getLayoutViewState(Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/generic/LayoutViewState;

    move-result-object v16

    .line 49
    iget-object v2, v0, Lcom/ibotta/android/content/card/offer/OfferCardReducer;->offerButtonReducer:Lcom/ibotta/android/button/OfferButtonReducer;

    move-object/from16 v5, p4

    move/from16 v9, p5

    invoke-virtual {v2, v1, v5, v9, v3}, Lcom/ibotta/android/button/OfferButtonReducer;->create(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/customer/Customer;ZZ)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object v9

    const/16 v17, 0x0

    const/16 v18, 0x800

    const/16 v19, 0x0

    move-object v5, v4

    .line 38
    invoke-direct/range {v5 .. v19}, Lcom/ibotta/android/content/card/ContentCardViewState;-><init>(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/views/content/SummaryContentViewState;Lcom/ibotta/android/views/base/button/IbottaButtonViewState;Lcom/ibotta/android/views/content/ContentImageViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/offer/badge/BadgeViewState;Lcom/ibotta/android/views/spotlight/RetailerStackViewState;ILcom/ibotta/android/views/pwi/PayAtRetailerButtonViewState;Lcom/ibotta/android/views/generic/LayoutViewState;Lcom/ibotta/android/tracking/content/TrackingPayload;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method
