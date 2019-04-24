.class public final Lcom/microblink/internal/services/linux/LinuxDiscountMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Lcom/microblink/internal/OcrDiscount;",
        "Lcom/microblink/internal/services/linux/Discount;",
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
.method public final transform(Lcom/microblink/internal/services/linux/Discount;)Lcom/microblink/internal/OcrDiscount;
    .locals 3
    .param p1    # Lcom/microblink/internal/services/linux/Discount;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    new-instance v0, Lcom/microblink/internal/OcrDiscount;

    invoke-direct {v0}, Lcom/microblink/internal/OcrDiscount;-><init>()V

    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/Discount;->description()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/internal/OcrDiscount;->description:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/internal/OcrDiscount;->descriptionConfidence:F

    :cond_0
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/Discount;->price()Lcom/microblink/FloatType;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/FloatType;)F

    move-result v2

    iput v2, v0, Lcom/microblink/internal/OcrDiscount;->price:F

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/FloatType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/internal/OcrDiscount;->priceConfidence:F

    :cond_1
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/Discount;->line()I

    move-result v1

    iput v1, v0, Lcom/microblink/internal/OcrDiscount;->line:I

    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/Discount;->sku()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/internal/OcrDiscount;->sku:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/internal/OcrDiscount;->skuConfidence:F

    :cond_2
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/Discount;->type()Lcom/microblink/StringType;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/microblink/internal/OcrDiscount;->discountType:Ljava/lang/String;

    :cond_3
    return-object v0
.end method

.method public final bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    check-cast p1, Lcom/microblink/internal/services/linux/Discount;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/linux/LinuxDiscountMapper;->transform(Lcom/microblink/internal/services/linux/Discount;)Lcom/microblink/internal/OcrDiscount;

    move-result-object p1

    return-object p1
.end method
