.class public final Lcom/microblink/internal/services/linux/LinuxProductMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Lcom/microblink/internal/OcrProduct;",
        "Lcom/microblink/internal/services/linux/Product;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final transform(Lcom/microblink/internal/services/linux/Product;)Lcom/microblink/internal/OcrProduct;
    .locals 3
    .param p1    # Lcom/microblink/internal/services/linux/Product;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/internal/OcrProduct;

    invoke-direct {v0}, Lcom/microblink/internal/OcrProduct;-><init>()V

    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/Product;->fullPrice()Lcom/microblink/FloatType;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/FloatType;)F

    move-result v2

    iput v2, v0, Lcom/microblink/internal/OcrProduct;->fullPrice:F

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/FloatType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/internal/OcrProduct;->fullPriceConfidence:F

    :cond_0
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/Product;->price()Lcom/microblink/FloatType;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/FloatType;)F

    move-result v2

    iput v2, v0, Lcom/microblink/internal/OcrProduct;->price:F

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/FloatType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/internal/OcrProduct;->priceConfidence:F

    :cond_1
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/Product;->quantity()Lcom/microblink/IntType;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/IntType;)I

    move-result v2

    iput v2, v0, Lcom/microblink/internal/OcrProduct;->quantity:I

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/IntType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/internal/OcrProduct;->quantityConfidence:F

    :cond_2
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/Product;->rpn()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/internal/OcrProduct;->sku:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/internal/OcrProduct;->skuConfidence:F

    goto :goto_0

    :cond_3
    const-string v1, ""

    iput-object v1, v0, Lcom/microblink/internal/OcrProduct;->sku:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/Product;->rsd()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/internal/OcrProduct;->description:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/internal/OcrProduct;->descriptionConfidence:F

    :cond_4
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/Product;->totalPrice()Lcom/microblink/FloatType;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/FloatType;)F

    move-result v2

    iput v2, v0, Lcom/microblink/internal/OcrProduct;->totalPrice:F

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/FloatType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/internal/OcrProduct;->totalPriceConfidence:F

    :cond_5
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/Product;->uom()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/internal/OcrProduct;->uom:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/internal/OcrProduct;->uomConfidence:F

    :cond_6
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/Product;->uomPrice()Lcom/microblink/FloatType;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/FloatType;)F

    move-result v2

    iput v2, v0, Lcom/microblink/internal/OcrProduct;->uomPrice:F

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/FloatType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/internal/OcrProduct;->uomPriceConfidence:F

    :cond_7
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/Product;->line()I

    move-result v1

    iput v1, v0, Lcom/microblink/internal/OcrProduct;->line:I

    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/Product;->infoLines()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_8

    new-instance v1, Lcom/microblink/internal/services/linux/LinuxInfoLinesMapper;

    invoke-direct {v1}, Lcom/microblink/internal/services/linux/LinuxInfoLinesMapper;-><init>()V

    invoke-virtual {v1, p1}, Lcom/microblink/internal/services/linux/LinuxInfoLinesMapper;->transform(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, v0, Lcom/microblink/internal/OcrProduct;->infoLines:Ljava/util/ArrayList;

    :cond_8
    return-object v0
.end method

.method public final bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/internal/services/linux/Product;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/linux/LinuxProductMapper;->transform(Lcom/microblink/internal/services/linux/Product;)Lcom/microblink/internal/OcrProduct;

    move-result-object p1

    return-object p1
.end method
