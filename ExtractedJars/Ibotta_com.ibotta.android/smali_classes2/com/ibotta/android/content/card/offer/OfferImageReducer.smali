.class public final Lcom/ibotta/android/content/card/offer/OfferImageReducer;
.super Ljava/lang/Object;
.source "OfferImageReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOfferImageReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfferImageReducer.kt\ncom/ibotta/android/content/card/offer/OfferImageReducer\n*L\n1#1,34:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/ibotta/android/content/card/offer/OfferImageReducer;",
        "",
        "appHelper",
        "Lcom/ibotta/android/util/AppHelper;",
        "offerHelper",
        "Lcom/ibotta/api/helper/offer/OfferHelper;",
        "resources",
        "Landroid/content/res/Resources;",
        "(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Landroid/content/res/Resources;)V",
        "create",
        "Lcom/ibotta/android/views/content/ContentImageViewState;",
        "offerModel",
        "Lcom/ibotta/api/model/OfferModel;",
        "contentStyle",
        "Lcom/ibotta/android/views/content/ContentStyle;",
        "getImageUrl",
        "",
        "kotlin.jvm.PlatformType",
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
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private final resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Landroid/content/res/Resources;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/util/AppHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/helper/offer/OfferHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offerHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/content/card/offer/OfferImageReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iput-object p2, p0, Lcom/ibotta/android/content/card/offer/OfferImageReducer;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iput-object p3, p0, Lcom/ibotta/android/content/card/offer/OfferImageReducer;->resources:Landroid/content/res/Resources;

    return-void
.end method

.method private final getImageUrl(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/String;
    .locals 3

    .line 29
    sget-object v0, Lcom/ibotta/android/views/content/ContentStyle;->HERO:Lcom/ibotta/android/views/content/ContentStyle;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p2, v0, :cond_0

    sget-object p2, Lcom/ibotta/android/views/content/ContentStyle;->SPOTLIGHT:Lcom/ibotta/android/views/content/ContentStyle;

    if-ne p1, p2, :cond_3

    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getLargeUrl()Ljava/lang/String;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p2, 0x1

    :goto_1
    if-nez p2, :cond_3

    const/4 v1, 0x1

    :cond_3
    if-ne v1, v2, :cond_4

    .line 30
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getLargeUrl()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    if-nez v1, :cond_5

    .line 31
    iget-object p2, p0, Lcom/ibotta/android/content/card/offer/OfferImageReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p2, p1}, Lcom/ibotta/android/util/AppHelper;->getBestOfferImgUrl(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/content/ContentImageViewState;
    .locals 7
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

    const-string v0, "contentStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    new-instance v0, Lcom/ibotta/android/views/content/ContentImageViewState;

    .line 22
    iget-object v1, p0, Lcom/ibotta/android/content/card/offer/OfferImageReducer;->resources:Landroid/content/res/Resources;

    iget-object v2, p0, Lcom/ibotta/android/content/card/offer/OfferImageReducer;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {v2, p1}, Lcom/ibotta/api/helper/offer/OfferHelper;->isShopNow(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v2

    invoke-static {p2, v1, v2}, Lcom/ibotta/android/content/card/ContentImageUtilKt;->getImagePaddingRLT(Lcom/ibotta/android/views/content/ContentStyle;Landroid/content/res/Resources;Z)I

    move-result v3

    .line 23
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/content/card/offer/OfferImageReducer;->getImageUrl(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/views/content/ContentStyle;)Ljava/lang/String;

    move-result-object v2

    .line 24
    sget-object p1, Lcom/ibotta/android/views/util/CardHelper;->INSTANCE:Lcom/ibotta/android/views/util/CardHelper;

    iget-object v1, p0, Lcom/ibotta/android/content/card/offer/OfferImageReducer;->resources:Landroid/content/res/Resources;

    invoke-virtual {p1, p2, v1}, Lcom/ibotta/android/views/util/CardHelper;->getImageHeight(Lcom/ibotta/android/views/content/ContentStyle;Landroid/content/res/Resources;)I

    move-result v4

    .line 25
    sget-object v5, Lcom/ibotta/android/views/content/ScaleType;->FIT_CENTER:Lcom/ibotta/android/views/content/ScaleType;

    .line 26
    invoke-static {p2}, Lcom/ibotta/android/content/card/ContentImageUtilKt;->getGlideSize(Lcom/ibotta/android/views/content/ContentStyle;)Lcom/ibotta/android/views/images/Sizes;

    move-result-object v6

    move-object v1, v0

    .line 21
    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/views/content/ContentImageViewState;-><init>(Ljava/lang/String;IILcom/ibotta/android/views/content/ScaleType;Lcom/ibotta/android/views/images/Sizes;)V

    return-object v0
.end method
