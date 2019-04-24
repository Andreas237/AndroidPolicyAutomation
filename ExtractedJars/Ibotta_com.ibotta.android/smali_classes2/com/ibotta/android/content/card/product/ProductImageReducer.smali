.class public final Lcom/ibotta/android/content/card/product/ProductImageReducer;
.super Ljava/lang/Object;
.source "ProductImageReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nProductImageReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductImageReducer.kt\ncom/ibotta/android/content/card/product/ProductImageReducer\n*L\n1#1,25:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\u00080\u00082\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/ibotta/android/content/card/product/ProductImageReducer;",
        "",
        "()V",
        "createForRow",
        "Lcom/ibotta/android/views/content/row/ContentImageViewState;",
        "productModel",
        "Lcom/ibotta/api/model/ProductModel;",
        "getProductRowImageUrl",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getProductRowImageUrl(Lcom/ibotta/api/model/ProductModel;)Ljava/lang/String;
    .locals 3

    .line 20
    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getImageUrlThumbnail()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_2

    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getImageUrlThumbnail()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    .line 21
    :cond_2
    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getImageUrlLarge()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    const/4 v1, 0x1

    :cond_4
    if-nez v1, :cond_5

    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getImageUrlLarge()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    .line 22
    :cond_5
    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getImageUrlSmall()Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1
.end method


# virtual methods
.method public final createForRow(Lcom/ibotta/api/model/ProductModel;)Lcom/ibotta/android/views/content/row/ContentImageViewState;
    .locals 8
    .param p1    # Lcom/ibotta/api/model/ProductModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "productModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    new-instance v0, Lcom/ibotta/android/views/content/row/ContentImageViewState;

    .line 12
    invoke-direct {p0, p1}, Lcom/ibotta/android/content/card/product/ProductImageReducer;->getProductRowImageUrl(Lcom/ibotta/api/model/ProductModel;)Ljava/lang/String;

    move-result-object v2

    const-string p1, "getProductRowImageUrl(productModel)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    sget-object p1, Lcom/ibotta/android/views/images/Sizes;->MODEL_C_OFFER_ROW:Lcom/ibotta/android/views/images/Sizes;

    move-object v3, p1

    check-cast v3, Lcom/ibotta/android/images/ImageCache$Size;

    .line 16
    sget v6, Lcom/ibotta/android/reducers/R$dimen;->size_0:I

    .line 17
    sget v7, Lcom/ibotta/android/reducers/R$dimen;->size_0:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v1, v0

    .line 11
    invoke-direct/range {v1 .. v7}, Lcom/ibotta/android/views/content/row/ContentImageViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/images/ImageCache$Size;ZZII)V

    return-object v0
.end method
