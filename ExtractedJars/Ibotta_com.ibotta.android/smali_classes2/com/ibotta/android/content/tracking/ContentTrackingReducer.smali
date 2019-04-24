.class public final Lcom/ibotta/android/content/tracking/ContentTrackingReducer;
.super Ljava/lang/Object;
.source "ContentTrackingReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ/\u0010\u000b\u001a\n \u000c*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0002\u0010\u0010J/\u0010\u0011\u001a\n \u000c*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0002\u0010\u0014J/\u0010\u0015\u001a\n \u000c*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0002\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/ibotta/android/content/tracking/ContentTrackingReducer;",
        "",
        "()V",
        "getContentTrackingPayload",
        "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
        "contentModel",
        "Lcom/ibotta/api/model/ContentModel;",
        "contentTrackingPayload",
        "index",
        "",
        "(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
        "getOfferTrackingPayload",
        "kotlin.jvm.PlatformType",
        "offerModel",
        "Lcom/ibotta/api/model/OfferModel;",
        "payload",
        "(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
        "getProductTrackingPayload",
        "productModel",
        "Lcom/ibotta/api/model/ProductModel;",
        "(Lcom/ibotta/api/model/ProductModel;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
        "getRetailerTrackingPayload",
        "retailerModel",
        "Lcom/ibotta/api/model/RetailerModel;",
        "(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
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

.method private final getOfferTrackingPayload(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
    .locals 1

    .line 47
    invoke-virtual {p2}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toBuilder()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p2

    .line 48
    sget-object v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->OFFER:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->contentType(Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p2

    const/4 v0, 0x1

    .line 49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->counter(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p2

    .line 50
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->offerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p2

    .line 51
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getOfferSegmentId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->offerSegmentId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 52
    invoke-virtual {p1, p3}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->listIndex(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 53
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    return-object p1
.end method

.method private final getProductTrackingPayload(Lcom/ibotta/api/model/ProductModel;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
    .locals 1

    .line 64
    invoke-virtual {p2}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toBuilder()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p2

    .line 65
    sget-object v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->PRODUCT:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->contentType(Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p2

    const/4 v0, 0x1

    .line 66
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->counter(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p2

    .line 67
    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getIdString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->productId(Ljava/lang/String;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p2

    .line 68
    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getRetailerId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 69
    invoke-virtual {p1, p3}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->listIndex(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 70
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    return-object p1
.end method

.method private final getRetailerTrackingPayload(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
    .locals 1

    .line 56
    invoke-virtual {p2}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toBuilder()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p2

    .line 57
    sget-object v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->RETAILER:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->contentType(Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p2

    const/4 v0, 0x1

    .line 58
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->counter(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p2

    .line 59
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 60
    invoke-virtual {p1, p3}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->listIndex(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final getContentTrackingPayload(Lcom/ibotta/api/model/ContentModel;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
    .locals 2
    .param p1    # Lcom/ibotta/api/model/ContentModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "contentModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentTrackingPayload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p2}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->isNoTracking()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->NO_TRACKING:Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    const-string p2, "ContentTrackingPayload.NO_TRACKING"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    .line 29
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/ibotta/android/content/tracking/ContentTrackingReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/ibotta/api/model/ContentModel$Type;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 41
    :pswitch_0
    check-cast p1, Lcom/ibotta/api/model/ProductModel;

    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/content/tracking/ContentTrackingReducer;->getProductTrackingPayload(Lcom/ibotta/api/model/ProductModel;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    const-string p2, "getProductTrackingPayloa\u2026ntTrackingPayload, index)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 37
    :pswitch_1
    check-cast p1, Lcom/ibotta/api/model/RetailerModel;

    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/content/tracking/ContentTrackingReducer;->getRetailerTrackingPayload(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    const-string p2, "getRetailerTrackingPaylo\u2026ntTrackingPayload, index)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 33
    :pswitch_2
    check-cast p1, Lcom/ibotta/api/model/OfferModel;

    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/content/tracking/ContentTrackingReducer;->getOfferTrackingPayload(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    const-string p2, "getOfferTrackingPayload(\u2026ntTrackingPayload, index)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1

    .line 42
    :cond_1
    :goto_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ContentTrackingReducer does not support: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Throwable;

    throw p2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
