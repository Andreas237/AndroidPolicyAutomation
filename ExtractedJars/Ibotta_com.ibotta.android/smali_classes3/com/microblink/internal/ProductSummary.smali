.class public final Lcom/microblink/internal/ProductSummary;
.super Ljava/lang/Object;


# instance fields
.field private ocrProduct:Lcom/microblink/internal/OcrProduct;

.field private product:Lcom/microblink/Product;

.field private productResult:Lcom/microblink/internal/services/product/ProductResult;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ocrProduct()Lcom/microblink/internal/OcrProduct;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/ProductSummary;->ocrProduct:Lcom/microblink/internal/OcrProduct;

    return-object v0
.end method

.method public final ocrProduct(Lcom/microblink/internal/OcrProduct;)Lcom/microblink/internal/ProductSummary;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/ProductSummary;->ocrProduct:Lcom/microblink/internal/OcrProduct;

    return-object p0
.end method

.method public final product()Lcom/microblink/Product;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/ProductSummary;->product:Lcom/microblink/Product;

    return-object v0
.end method

.method public final product(Lcom/microblink/Product;)Lcom/microblink/internal/ProductSummary;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/ProductSummary;->product:Lcom/microblink/Product;

    return-object p0
.end method

.method public final result(Lcom/microblink/internal/services/product/ProductResult;)Lcom/microblink/internal/ProductSummary;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/ProductSummary;->productResult:Lcom/microblink/internal/services/product/ProductResult;

    return-object p0
.end method

.method public final result()Lcom/microblink/internal/services/product/ProductResult;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/ProductSummary;->productResult:Lcom/microblink/internal/services/product/ProductResult;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ProductSummary{ocrProduct="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/ProductSummary;->ocrProduct:Lcom/microblink/internal/OcrProduct;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", productResult="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/ProductSummary;->productResult:Lcom/microblink/internal/services/product/ProductResult;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", product="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/ProductSummary;->product:Lcom/microblink/Product;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
