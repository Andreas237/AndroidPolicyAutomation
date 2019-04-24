.class public final Lcom/microblink/internal/amazon/AmazonProductMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Lcom/microblink/Product;",
        "Lcom/microblink/internal/services/amazon/AmazonProduct;",
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
.method public final transform(Lcom/microblink/internal/services/amazon/AmazonProduct;)Lcom/microblink/Product;
    .locals 23
    .param p1    # Lcom/microblink/internal/services/amazon/AmazonProduct;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    invoke-virtual/range {p1 .. p1}, Lcom/microblink/internal/services/amazon/AmazonProduct;->qty()I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/microblink/internal/services/amazon/AmazonProduct;->qty()I

    move-result v0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/microblink/internal/services/amazon/AmazonProduct;->price()F

    move-result v1

    int-to-float v0, v0

    mul-float v8, v0, v1

    new-instance v22, Lcom/microblink/Product;

    move-object/from16 v2, v22

    new-instance v4, Lcom/microblink/StringType;

    move-object v3, v4

    invoke-virtual/range {p1 .. p1}, Lcom/microblink/internal/services/amazon/AmazonProduct;->asin()Ljava/lang/String;

    move-result-object v5

    const/high16 v7, 0x42c80000    # 100.0f

    invoke-direct {v4, v5, v7}, Lcom/microblink/StringType;-><init>(Ljava/lang/String;F)V

    new-instance v5, Lcom/microblink/StringType;

    move-object v4, v5

    invoke-virtual/range {p1 .. p1}, Lcom/microblink/internal/services/amazon/AmazonProduct;->description()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6, v7}, Lcom/microblink/StringType;-><init>(Ljava/lang/String;F)V

    new-instance v6, Lcom/microblink/FloatType;

    move-object v5, v6

    invoke-direct {v6, v0, v7}, Lcom/microblink/FloatType;-><init>(FF)V

    new-instance v0, Lcom/microblink/FloatType;

    move-object v6, v0

    invoke-direct {v0, v1, v7}, Lcom/microblink/FloatType;-><init>(FF)V

    const/4 v7, 0x0

    const/high16 v9, -0x40800000    # -1.0f

    const/4 v10, -0x1

    invoke-virtual/range {p1 .. p1}, Lcom/microblink/internal/services/amazon/AmazonProduct;->productName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/microblink/internal/services/amazon/AmazonProduct;->brand()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/microblink/internal/services/amazon/AmazonProduct;->category()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/microblink/internal/services/amazon/AmazonProduct;->size()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/microblink/internal/services/amazon/AmazonProduct;->rewardsGroup()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/microblink/internal/services/amazon/AmazonProduct;->competitorRewardsGroup()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lcom/microblink/internal/services/amazon/AmazonProduct;->upc()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, Lcom/microblink/internal/services/amazon/AmazonProduct;->imageUrl()Ljava/lang/String;

    move-result-object v18

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v2 .. v21}, Lcom/microblink/Product;-><init>(Lcom/microblink/StringType;Lcom/microblink/StringType;Lcom/microblink/FloatType;Lcom/microblink/FloatType;Lcom/microblink/StringType;FFILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/microblink/FloatType;Ljava/lang/String;)V

    return-object v22
.end method

.method public final bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    check-cast p1, Lcom/microblink/internal/services/amazon/AmazonProduct;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/amazon/AmazonProductMapper;->transform(Lcom/microblink/internal/services/amazon/AmazonProduct;)Lcom/microblink/Product;

    move-result-object p1

    return-object p1
.end method
