.class public final Lcom/microblink/internal/ProductMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Lcom/microblink/Product;",
        "Lcom/microblink/internal/OcrProduct;",
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
.method public final transform(Lcom/microblink/internal/OcrProduct;)Lcom/microblink/Product;
    .locals 26
    .param p1    # Lcom/microblink/internal/OcrProduct;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    move-object/from16 v0, p1

    iget v1, v0, Lcom/microblink/internal/OcrProduct;->fullPrice:F

    float-to-double v1, v1

    sget-wide v3, Lcom/microblink/internal/Utility;->MIN_PRICE_THRESHOLD:D

    const/high16 v5, -0x40800000    # -1.0f

    cmpl-double v6, v1, v3

    if-lez v6, :cond_0

    iget v1, v0, Lcom/microblink/internal/OcrProduct;->fullPrice:F

    move v13, v1

    goto :goto_0

    :cond_0
    const/high16 v13, -0x40800000    # -1.0f

    :goto_0
    iget v1, v0, Lcom/microblink/internal/OcrProduct;->totalPrice:F

    float-to-double v1, v1

    sget-wide v3, Lcom/microblink/internal/Utility;->MIN_PRICE_THRESHOLD:D

    cmpl-double v6, v1, v3

    if-lez v6, :cond_1

    iget v5, v0, Lcom/microblink/internal/OcrProduct;->totalPrice:F

    move v12, v5

    goto :goto_1

    :cond_1
    const/high16 v12, -0x40800000    # -1.0f

    :goto_1
    new-instance v1, Lcom/microblink/Product;

    move-object v6, v1

    new-instance v2, Lcom/microblink/StringType;

    move-object v7, v2

    iget-object v3, v0, Lcom/microblink/internal/OcrProduct;->sku:Ljava/lang/String;

    iget v4, v0, Lcom/microblink/internal/OcrProduct;->skuConfidence:F

    invoke-direct {v2, v3, v4}, Lcom/microblink/StringType;-><init>(Ljava/lang/String;F)V

    new-instance v2, Lcom/microblink/StringType;

    move-object v8, v2

    iget-object v3, v0, Lcom/microblink/internal/OcrProduct;->description:Ljava/lang/String;

    iget v4, v0, Lcom/microblink/internal/OcrProduct;->descriptionConfidence:F

    invoke-direct {v2, v3, v4}, Lcom/microblink/StringType;-><init>(Ljava/lang/String;F)V

    new-instance v2, Lcom/microblink/FloatType;

    move-object v9, v2

    iget v3, v0, Lcom/microblink/internal/OcrProduct;->quantity:I

    int-to-float v3, v3

    iget v4, v0, Lcom/microblink/internal/OcrProduct;->quantityConfidence:F

    invoke-direct {v2, v3, v4}, Lcom/microblink/FloatType;-><init>(FF)V

    new-instance v2, Lcom/microblink/FloatType;

    move-object v10, v2

    iget v3, v0, Lcom/microblink/internal/OcrProduct;->price:F

    iget v4, v0, Lcom/microblink/internal/OcrProduct;->priceConfidence:F

    invoke-direct {v2, v3, v4}, Lcom/microblink/FloatType;-><init>(FF)V

    new-instance v2, Lcom/microblink/StringType;

    move-object v11, v2

    iget-object v3, v0, Lcom/microblink/internal/OcrProduct;->uom:Ljava/lang/String;

    iget v4, v0, Lcom/microblink/internal/OcrProduct;->uomConfidence:F

    invoke-direct {v2, v3, v4}, Lcom/microblink/StringType;-><init>(Ljava/lang/String;F)V

    iget v14, v0, Lcom/microblink/internal/OcrProduct;->line:I

    iget-object v15, v0, Lcom/microblink/internal/OcrProduct;->name:Ljava/lang/String;

    iget-object v2, v0, Lcom/microblink/internal/OcrProduct;->brand:Ljava/lang/String;

    move-object/from16 v16, v2

    iget-object v2, v0, Lcom/microblink/internal/OcrProduct;->category:Ljava/lang/String;

    move-object/from16 v17, v2

    iget-object v2, v0, Lcom/microblink/internal/OcrProduct;->size:Ljava/lang/String;

    move-object/from16 v18, v2

    iget-object v2, v0, Lcom/microblink/internal/OcrProduct;->rewardsGroup:Ljava/lang/String;

    move-object/from16 v19, v2

    iget-object v2, v0, Lcom/microblink/internal/OcrProduct;->competitorRewardsGroup:Ljava/lang/String;

    move-object/from16 v20, v2

    iget-object v2, v0, Lcom/microblink/internal/OcrProduct;->upc:Ljava/lang/String;

    move-object/from16 v21, v2

    iget-object v2, v0, Lcom/microblink/internal/OcrProduct;->imageUrl:Ljava/lang/String;

    move-object/from16 v22, v2

    new-instance v2, Lcom/microblink/internal/AdditionalLinesMapper;

    invoke-direct {v2}, Lcom/microblink/internal/AdditionalLinesMapper;-><init>()V

    iget-object v3, v0, Lcom/microblink/internal/OcrProduct;->infoLines:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Lcom/microblink/internal/AdditionalLinesMapper;->transform(Ljava/util/List;)Ljava/util/List;

    move-result-object v23

    new-instance v2, Lcom/microblink/FloatType;

    move-object/from16 v24, v2

    iget v3, v0, Lcom/microblink/internal/OcrProduct;->priceAfterCoupons:F

    iget v4, v0, Lcom/microblink/internal/OcrProduct;->priceAfterConfidence:F

    invoke-direct {v2, v3, v4}, Lcom/microblink/FloatType;-><init>(FF)V

    iget-object v0, v0, Lcom/microblink/internal/OcrProduct;->shippingStatus:Ljava/lang/String;

    move-object/from16 v25, v0

    invoke-direct/range {v6 .. v25}, Lcom/microblink/Product;-><init>(Lcom/microblink/StringType;Lcom/microblink/StringType;Lcom/microblink/FloatType;Lcom/microblink/FloatType;Lcom/microblink/StringType;FFILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/microblink/FloatType;Ljava/lang/String;)V

    return-object v1
.end method

.method public final bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    check-cast p1, Lcom/microblink/internal/OcrProduct;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/ProductMapper;->transform(Lcom/microblink/internal/OcrProduct;)Lcom/microblink/Product;

    move-result-object p1

    return-object p1
.end method
