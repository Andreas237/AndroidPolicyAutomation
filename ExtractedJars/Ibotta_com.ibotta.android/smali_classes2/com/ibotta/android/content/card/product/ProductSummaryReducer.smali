.class public final Lcom/ibotta/android/content/card/product/ProductSummaryReducer;
.super Ljava/lang/Object;
.source "ProductSummaryReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\u00080\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u00020\u0008*\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/ibotta/android/content/card/product/ProductSummaryReducer;",
        "",
        "resources",
        "Landroid/content/res/Resources;",
        "formatting",
        "Lcom/ibotta/android/util/Formatting;",
        "(Landroid/content/res/Resources;Lcom/ibotta/android/util/Formatting;)V",
        "type",
        "",
        "kotlin.jvm.PlatformType",
        "desc",
        "Lcom/ibotta/api/model/ProductModel;",
        "getDesc",
        "(Lcom/ibotta/api/model/ProductModel;)Ljava/lang/String;",
        "createForCard",
        "Lcom/ibotta/android/views/content/SummaryContentViewState;",
        "productModel",
        "createForRow",
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

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lcom/ibotta/android/util/Formatting;)V
    .locals 1
    .param p1    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/util/Formatting;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatting"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/ibotta/android/content/card/product/ProductSummaryReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 26
    sget p2, Lcom/ibotta/android/reducers/R$string;->common_online:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/content/card/product/ProductSummaryReducer;->type:Ljava/lang/String;

    return-void
.end method

.method private final getDesc(Lcom/ibotta/api/model/ProductModel;)Ljava/lang/String;
    .locals 0
    .param p1    # Lcom/ibotta/api/model/ProductModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 28
    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getDescription()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final createForCard(Lcom/ibotta/api/model/ProductModel;)Lcom/ibotta/android/views/content/SummaryContentViewState;
    .locals 11
    .param p1    # Lcom/ibotta/api/model/ProductModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "productModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    new-instance v0, Lcom/ibotta/android/views/content/SummaryContentViewState;

    .line 21
    iget-object v2, p0, Lcom/ibotta/android/content/card/product/ProductSummaryReducer;->type:Ljava/lang/String;

    const-string v1, "type"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v1, "productModel.name"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0, p1}, Lcom/ibotta/android/content/card/product/ProductSummaryReducer;->getDesc(Lcom/ibotta/api/model/ProductModel;)Ljava/lang/String;

    move-result-object v5

    const/4 p1, 0x2

    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x52

    const/4 v10, 0x0

    move-object v1, v0

    .line 20
    invoke-direct/range {v1 .. v10}, Lcom/ibotta/android/views/content/SummaryContentViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final createForRow(Lcom/ibotta/api/model/ProductModel;)Lcom/ibotta/android/views/content/SummaryContentViewState;
    .locals 11
    .param p1    # Lcom/ibotta/api/model/ProductModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "productModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    new-instance v0, Lcom/ibotta/android/views/content/SummaryContentViewState;

    .line 15
    iget-object v2, p0, Lcom/ibotta/android/content/card/product/ProductSummaryReducer;->type:Ljava/lang/String;

    const-string v1, "type"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-object v1, p0, Lcom/ibotta/android/content/card/product/ProductSummaryReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getPrice()F

    move-result v3

    float-to-double v3, v3

    invoke-interface {v1, v3, v4}, Lcom/ibotta/android/util/Formatting;->currency(D)Ljava/lang/String;

    move-result-object v4

    const-string v1, "formatting.currency(productModel.price.toDouble())"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-interface {p1}, Lcom/ibotta/api/model/ProductModel;->getName()Ljava/lang/String;

    move-result-object v5

    const-string p1, "productModel.name"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x2

    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x62

    const/4 v10, 0x0

    move-object v1, v0

    .line 14
    invoke-direct/range {v1 .. v10}, Lcom/ibotta/android/views/content/SummaryContentViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
