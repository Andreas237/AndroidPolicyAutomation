.class public final Lcom/ibotta/android/retailer/RetailerStackReducer;
.super Ljava/lang/Object;
.source "RetailerStackReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRetailerStackReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetailerStackReducer.kt\ncom/ibotta/android/retailer/RetailerStackReducer\n*L\n1#1,46:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000cJ\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/ibotta/android/retailer/RetailerStackReducer;",
        "",
        "retailerHelper",
        "Lcom/ibotta/api/helper/retailer/RetailerHelper;",
        "retailerIconVariant",
        "Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;",
        "(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)V",
        "create",
        "Lcom/ibotta/android/views/spotlight/RetailerStackViewState;",
        "offerModel",
        "Lcom/ibotta/api/model/OfferModel;",
        "retailerContext",
        "Lcom/ibotta/api/model/RetailerModel;",
        "getIconUrl",
        "",
        "getModelCUrlFromOffer",
        "getStackVisibility",
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
.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private final retailerIconVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;)V
    .locals 1
    .param p1    # Lcom/ibotta/api/helper/retailer/RetailerHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "retailerHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retailerIconVariant"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/retailer/RetailerStackReducer;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    iput-object p2, p0, Lcom/ibotta/android/retailer/RetailerStackReducer;->retailerIconVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    return-void
.end method

.method public static synthetic create$default(Lcom/ibotta/android/retailer/RetailerStackReducer;Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;ILjava/lang/Object;)Lcom/ibotta/android/views/spotlight/RetailerStackViewState;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 17
    check-cast p2, Lcom/ibotta/api/model/RetailerModel;

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/retailer/RetailerStackReducer;->create(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    move-result-object p0

    return-object p0
.end method

.method private final getIconUrl(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;
    .locals 1

    if-eqz p2, :cond_1

    .line 32
    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v0

    if-eqz v0, :cond_1

    .line 33
    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getModelCImageUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/retailer/RetailerStackReducer;->getModelCUrlFromOffer(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    .line 35
    :cond_1
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getAvailableAtRetailers()Ljava/util/List;

    move-result-object p1

    const-string p2, "offerModel.availableAtRetailers"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/RetailerModel;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getModelCImageUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, ""

    :goto_1
    return-object p1
.end method

.method private final getModelCUrlFromOffer(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;
    .locals 2

    .line 44
    iget-object v0, p0, Lcom/ibotta/android/retailer/RetailerStackReducer;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getAvailableAtRetailers()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-interface {v0, p1, v1}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getModelCImageUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v0, p1

    goto :goto_0

    .line 45
    :cond_0
    instance-of p1, p2, Lcom/ibotta/api/model/module/RetailerModule;

    if-nez p1, :cond_1

    move-object p2, v0

    :cond_1
    check-cast p2, Lcom/ibotta/api/model/module/RetailerModule;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/ibotta/api/model/module/RetailerModule;->getUrl()Ljava/lang/String;

    move-result-object v0

    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, ""

    :goto_1
    return-object v0
.end method

.method private final getStackVisibility(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/views/components/Visibility;
    .locals 1

    .line 39
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getAvailableAtRetailers()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    sget-object p1, Lcom/ibotta/android/views/components/Visibility;->VISIBLE:Lcom/ibotta/android/views/components/Visibility;

    goto :goto_0

    .line 40
    :cond_0
    sget-object p1, Lcom/ibotta/android/views/components/Visibility;->GONE:Lcom/ibotta/android/views/components/Visibility;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/views/spotlight/RetailerStackViewState;
    .locals 8
    .param p1    # Lcom/ibotta/api/model/OfferModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/model/RetailerModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "offerModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/retailer/RetailerStackReducer;->getIconUrl(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;

    move-result-object v2

    .line 21
    move-object v0, v2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/retailer/RetailerStackReducer;->retailerIconVariant:Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;

    invoke-interface {v0}, Lcom/ibotta/android/features/variant/offer/RetailerIconOnOfferVariant;->shouldShowRetailerStackView()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-ne v0, v1, :cond_3

    .line 22
    new-instance v0, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    if-eqz p2, :cond_2

    goto :goto_2

    .line 23
    :cond_2
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getAvailableAtRetailers()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    const-string v1, "offerModel.availableAtRetailers[0]"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/ibotta/api/model/RetailerModel;

    :goto_2
    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p2

    move v3, p2

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/retailer/RetailerStackReducer;->getStackVisibility(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/views/components/Visibility;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v7, 0x0

    move-object v1, v0

    .line 22
    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;-><init>(Ljava/lang/String;ILcom/ibotta/android/views/components/Visibility;Lcom/ibotta/android/views/components/Visibility;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_3
    if-nez v0, :cond_4

    .line 27
    sget-object v0, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;->GONE:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    :goto_3
    return-object v0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
