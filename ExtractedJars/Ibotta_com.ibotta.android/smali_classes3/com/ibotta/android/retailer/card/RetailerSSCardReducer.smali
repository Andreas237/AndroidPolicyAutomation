.class public final Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;
.super Ljava/lang/Object;
.source "RetailerSSCardReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nJ \u0010\u000b\u001a\n \u000c*\u0004\u0018\u00010\n0\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0008H\u0002J\u0018\u0010\u0011\u001a\n \u000c*\u0004\u0018\u00010\u000f0\u000f2\u0006\u0010\u0010\u001a\u00020\u0008H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0008H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;",
        "",
        "resources",
        "Landroid/content/res/Resources;",
        "(Landroid/content/res/Resources;)V",
        "create",
        "Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;",
        "retailerModel",
        "Lcom/ibotta/api/model/RetailerModel;",
        "payload",
        "Lcom/ibotta/android/tracking/content/ContentTrackingPayload;",
        "getContentTrackingPayload",
        "kotlin.jvm.PlatformType",
        "parent",
        "getImageUrl",
        "",
        "contentModel",
        "getTypeString",
        "isMcommRetailer",
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
.field private final resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 1
    .param p1    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;->resources:Landroid/content/res/Resources;

    return-void
.end method

.method private final getContentTrackingPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
    .locals 1

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload;->toBuilder()Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 28
    sget-object v0, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;->RETAILER:Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->contentType(Lcom/ibotta/android/tracking/content/ContentTrackingPayload$TrackingContent;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 29
    invoke-interface {p2}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->retailerId(Ljava/lang/Integer;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;

    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/content/ContentTrackingPayload$Builder;->build()Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    return-object p1
.end method

.method private final getImageUrl(Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;
    .locals 1

    .line 35
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getModelCImageUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    const-string v0, "contentModel.modelCImageUrl ?: \"\""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final getTypeString(Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;
    .locals 1

    .line 37
    invoke-direct {p0, p1}, Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;->isMcommRetailer(Lcom/ibotta/api/model/RetailerModel;)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 38
    iget-object p1, p0, Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;->resources:Landroid/content/res/Resources;

    sget v0, Lcom/ibotta/android/reducers/R$string;->common_online:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 39
    iget-object p1, p0, Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;->resources:Landroid/content/res/Resources;

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

.method private final isMcommRetailer(Lcom/ibotta/api/model/RetailerModel;)Z
    .locals 1

    .line 33
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object p1

    sget-object v0, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/android/tracking/content/ContentTrackingPayload;)Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;
    .locals 12
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/tracking/content/ContentTrackingPayload;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "retailerModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v0, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;

    .line 19
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    const/4 v2, 0x2

    invoke-static {v2, v1}, Lcom/ibotta/android/apiandroid/content/ContentId;->create(II)Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object v2

    const-string v1, "ContentId.create(Content\u2026TAILER, retailerModel.id)"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v1, "retailerModel.name"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0, p1}, Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;->getTypeString(Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "getTypeString(retailerModel)"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0, p1}, Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;->getImageUrl(Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;

    move-result-object v5

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;->isMcommRetailer(Lcom/ibotta/api/model/RetailerModel;)Z

    move-result v7

    .line 24
    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/retailer/card/RetailerSSCardReducer;->getContentTrackingPayload(Lcom/ibotta/android/tracking/content/ContentTrackingPayload;Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/tracking/content/ContentTrackingPayload;

    move-result-object p1

    const-string p2, "getContentTrackingPayload(payload, retailerModel)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, p1

    check-cast v8, Lcom/ibotta/android/tracking/content/TrackingPayload;

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x90

    const/4 v11, 0x0

    move-object v1, v0

    .line 18
    invoke-direct/range {v1 .. v11}, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;-><init>(Lcom/ibotta/android/apiandroid/content/ContentId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLcom/ibotta/android/tracking/content/TrackingPayload;Lcom/ibotta/android/views/list/ContentViewState$ContentType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
