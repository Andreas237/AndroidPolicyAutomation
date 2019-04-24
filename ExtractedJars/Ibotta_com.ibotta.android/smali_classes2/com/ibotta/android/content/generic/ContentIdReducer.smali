.class public final Lcom/ibotta/android/content/generic/ContentIdReducer;
.super Ljava/lang/Object;
.source "ContentIdReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\n \u0008*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\n \u0008*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\n \u0008*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/ibotta/android/content/generic/ContentIdReducer;",
        "",
        "()V",
        "create",
        "Lcom/ibotta/android/apiandroid/content/ContentId;",
        "contentModel",
        "Lcom/ibotta/api/model/ContentModel;",
        "reduceOffer",
        "kotlin.jvm.PlatformType",
        "offerModel",
        "Lcom/ibotta/api/model/OfferModel;",
        "reduceProduct",
        "productModel",
        "Lcom/ibotta/api/model/ProductModel;",
        "reduceRetailer",
        "retailerModel",
        "Lcom/ibotta/api/model/RetailerModel;",
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

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final reduceOffer(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/apiandroid/content/ContentId;
    .locals 1

    .line 23
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p1

    const/4 v0, 0x1

    invoke-static {v0, p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->create(II)Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object p1

    return-object p1
.end method

.method private final reduceProduct(Lcom/ibotta/api/model/ProductModel;)Lcom/ibotta/android/apiandroid/content/ContentId;
    .locals 1

    .line 25
    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getIdString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x3

    invoke-static {v0, p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->create(ILjava/lang/String;)Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object p1

    return-object p1
.end method

.method private final reduceRetailer(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/apiandroid/content/ContentId;
    .locals 1

    .line 21
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    const/4 v0, 0x2

    invoke-static {v0, p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->create(II)Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/ContentModel;)Lcom/ibotta/android/apiandroid/content/ContentId;
    .locals 2
    .param p1    # Lcom/ibotta/api/model/ContentModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "contentModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-interface {p1}, Lcom/ibotta/api/model/ContentModel;->getTypeEnum()Lcom/ibotta/api/model/ContentModel$Type;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lcom/ibotta/android/content/generic/ContentIdReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/ibotta/api/model/ContentModel$Type;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 17
    :pswitch_0
    check-cast p1, Lcom/ibotta/api/model/ProductModel;

    invoke-direct {p0, p1}, Lcom/ibotta/android/content/generic/ContentIdReducer;->reduceProduct(Lcom/ibotta/api/model/ProductModel;)Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object p1

    const-string v0, "reduceProduct(contentModel as ProductModel)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 16
    :pswitch_1
    check-cast p1, Lcom/ibotta/api/model/OfferModel;

    invoke-direct {p0, p1}, Lcom/ibotta/android/content/generic/ContentIdReducer;->reduceOffer(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object p1

    const-string v0, "reduceOffer(contentModel as OfferModel)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 15
    :pswitch_2
    check-cast p1, Lcom/ibotta/api/model/RetailerModel;

    invoke-direct {p0, p1}, Lcom/ibotta/android/content/generic/ContentIdReducer;->reduceRetailer(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object p1

    const-string v0, "reduceRetailer(contentModel as RetailerModel)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1

    .line 18
    :cond_0
    :goto_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid ContentModel type"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
