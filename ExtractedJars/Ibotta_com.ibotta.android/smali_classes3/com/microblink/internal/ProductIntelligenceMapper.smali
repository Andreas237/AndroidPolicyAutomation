.class public final Lcom/microblink/internal/ProductIntelligenceMapper;
.super Ljava/lang/Object;


# static fields
.field private static final TAG:Ljava/lang/String; = "ProductIntelligenceMapper"


# instance fields
.field private final ocrProducts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrProduct;",
            ">;"
        }
    .end annotation
.end field

.field private final searches:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/product/ProductLookupItem;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrProduct;",
            ">;",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/product/ProductLookupItem;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/ProductIntelligenceMapper;->ocrProducts:Ljava/util/List;

    iput-object p2, p0, Lcom/microblink/internal/ProductIntelligenceMapper;->searches:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final products(Lcom/microblink/internal/services/product/ProductLookupResponse;)Ljava/util/List;
    .locals 42
    .param p1    # Lcom/microblink/internal/services/product/ProductLookupResponse;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/internal/services/product/ProductLookupResponse;",
            ")",
            "Ljava/util/List<",
            "Lcom/microblink/internal/ProductSummary;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/microblink/internal/services/product/ProductLookupResponse;->products()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/microblink/internal/services/product/ProductLookupResponse;->products()Ljava/util/List;

    move-result-object v0

    new-instance v2, Lcom/microblink/internal/AdditionalLinesMapper;

    invoke-direct {v2}, Lcom/microblink/internal/AdditionalLinesMapper;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/product/ProductResult;

    :try_start_0
    invoke-virtual {v0}, Lcom/microblink/internal/services/product/ProductResult;->productIndex()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v5, p0

    iget-object v6, v5, Lcom/microblink/internal/ProductIntelligenceMapper;->ocrProducts:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/microblink/internal/OcrProduct;

    invoke-virtual {v0}, Lcom/microblink/internal/services/product/ProductResult;->product()Lcom/microblink/internal/services/product/LookedUpProduct;

    move-result-object v6

    const/4 v7, -0x1

    const/4 v8, 0x0

    if-eqz v4, :cond_2

    iget-object v7, v4, Lcom/microblink/internal/OcrProduct;->shippingStatus:Ljava/lang/String;

    iget-object v8, v4, Lcom/microblink/internal/OcrProduct;->sku:Ljava/lang/String;

    iget v11, v4, Lcom/microblink/internal/OcrProduct;->skuConfidence:F

    iget-object v12, v4, Lcom/microblink/internal/OcrProduct;->description:Ljava/lang/String;

    iget v13, v4, Lcom/microblink/internal/OcrProduct;->descriptionConfidence:F

    new-instance v14, Lcom/microblink/FloatType;

    iget v15, v4, Lcom/microblink/internal/OcrProduct;->quantity:I

    int-to-float v15, v15

    iget v9, v4, Lcom/microblink/internal/OcrProduct;->quantityConfidence:F

    invoke-direct {v14, v15, v9}, Lcom/microblink/FloatType;-><init>(FF)V

    new-instance v9, Lcom/microblink/FloatType;

    iget v15, v4, Lcom/microblink/internal/OcrProduct;->price:F

    iget v10, v4, Lcom/microblink/internal/OcrProduct;->priceConfidence:F

    invoke-direct {v9, v15, v10}, Lcom/microblink/FloatType;-><init>(FF)V

    iget-object v10, v4, Lcom/microblink/internal/OcrProduct;->uom:Ljava/lang/String;

    iget v15, v4, Lcom/microblink/internal/OcrProduct;->uomConfidence:F

    move-object/from16 v17, v3

    iget v3, v4, Lcom/microblink/internal/OcrProduct;->line:I

    move/from16 v18, v3

    iget v3, v4, Lcom/microblink/internal/OcrProduct;->fullPrice:F

    move-object/from16 v19, v7

    move-object/from16 v20, v8

    float-to-double v7, v3

    sget-wide v21, Lcom/microblink/internal/Utility;->MIN_PRICE_THRESHOLD:D

    cmpl-double v3, v7, v21

    if-lez v3, :cond_0

    iget v3, v4, Lcom/microblink/internal/OcrProduct;->fullPrice:F

    goto :goto_1

    :cond_0
    const/high16 v3, -0x40800000    # -1.0f

    :goto_1
    iget v7, v4, Lcom/microblink/internal/OcrProduct;->totalPrice:F

    float-to-double v7, v7

    sget-wide v21, Lcom/microblink/internal/Utility;->MIN_PRICE_THRESHOLD:D

    cmpl-double v23, v7, v21

    if-lez v23, :cond_1

    iget v7, v4, Lcom/microblink/internal/OcrProduct;->totalPrice:F

    goto :goto_2

    :cond_1
    const/high16 v7, -0x40800000    # -1.0f

    :goto_2
    iget-object v8, v4, Lcom/microblink/internal/OcrProduct;->infoLines:Ljava/util/ArrayList;

    invoke-virtual {v2, v8}, Lcom/microblink/internal/AdditionalLinesMapper;->transform(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    move-object/from16 v21, v2

    new-instance v2, Lcom/microblink/FloatType;

    move/from16 v22, v3

    iget v3, v4, Lcom/microblink/internal/OcrProduct;->priceAfterCoupons:F

    iget v5, v4, Lcom/microblink/internal/OcrProduct;->priceAfterConfidence:F

    invoke-direct {v2, v3, v5}, Lcom/microblink/FloatType;-><init>(FF)V

    move-object/from16 v40, v2

    move/from16 v28, v7

    move-object/from16 v39, v8

    move-object/from16 v26, v9

    move v8, v13

    move-object/from16 v25, v14

    move/from16 v30, v18

    move-object/from16 v41, v19

    move-object/from16 v2, v20

    move/from16 v29, v22

    goto :goto_3

    :cond_2
    move-object/from16 v21, v2

    move-object/from16 v17, v3

    const/4 v2, 0x0

    const/4 v10, 0x0

    const/high16 v11, -0x40800000    # -1.0f

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/high16 v28, -0x40800000    # -1.0f

    const/high16 v29, -0x40800000    # -1.0f

    const/16 v30, -0x1

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    :goto_3
    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lcom/microblink/internal/services/product/LookedUpProduct;->brand()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6}, Lcom/microblink/internal/services/product/LookedUpProduct;->category()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6}, Lcom/microblink/internal/services/product/LookedUpProduct;->upc()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Lcom/microblink/internal/services/product/LookedUpProduct;->imageUrl()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6}, Lcom/microblink/internal/services/product/LookedUpProduct;->productName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lcom/microblink/internal/services/product/LookedUpProduct;->size()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6}, Lcom/microblink/internal/services/product/LookedUpProduct;->rewardsGroup()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lcom/microblink/internal/services/product/LookedUpProduct;->competitorRewardsGroup()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v32, v3

    move-object/from16 v33, v5

    move-object/from16 v36, v6

    move-object/from16 v37, v7

    move-object/from16 v38, v9

    move-object/from16 v31, v13

    move-object/from16 v34, v14

    move-object/from16 v35, v16

    goto :goto_4

    :cond_3
    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    :goto_4
    new-instance v3, Lcom/microblink/internal/ProductSummary;

    invoke-direct {v3}, Lcom/microblink/internal/ProductSummary;-><init>()V

    invoke-virtual {v3, v4}, Lcom/microblink/internal/ProductSummary;->ocrProduct(Lcom/microblink/internal/OcrProduct;)Lcom/microblink/internal/ProductSummary;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/microblink/internal/ProductSummary;->result(Lcom/microblink/internal/services/product/ProductResult;)Lcom/microblink/internal/ProductSummary;

    move-result-object v0

    new-instance v3, Lcom/microblink/Product;

    move-object/from16 v22, v3

    new-instance v4, Lcom/microblink/StringType;

    move-object/from16 v23, v4

    invoke-direct {v4, v2, v11}, Lcom/microblink/StringType;-><init>(Ljava/lang/String;F)V

    new-instance v2, Lcom/microblink/StringType;

    move-object/from16 v24, v2

    invoke-direct {v2, v12, v8}, Lcom/microblink/StringType;-><init>(Ljava/lang/String;F)V

    new-instance v2, Lcom/microblink/StringType;

    move-object/from16 v27, v2

    invoke-direct {v2, v10, v15}, Lcom/microblink/StringType;-><init>(Ljava/lang/String;F)V

    invoke-direct/range {v22 .. v41}, Lcom/microblink/Product;-><init>(Lcom/microblink/StringType;Lcom/microblink/StringType;Lcom/microblink/FloatType;Lcom/microblink/FloatType;Lcom/microblink/StringType;FFILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/microblink/FloatType;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/microblink/internal/ProductSummary;->product(Lcom/microblink/Product;)Lcom/microblink/internal/ProductSummary;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :catch_0
    move-exception v0

    move-object/from16 v21, v2

    move-object/from16 v17, v3

    const-string v2, "ProductIntelligenceMapper"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v0, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_5
    move-object/from16 v3, v17

    move-object/from16 v2, v21

    goto/16 :goto_0

    :cond_4
    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ProductIntelligenceMapper{ocrProducts="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/ProductIntelligenceMapper;->ocrProducts:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", searches="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/ProductIntelligenceMapper;->searches:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
