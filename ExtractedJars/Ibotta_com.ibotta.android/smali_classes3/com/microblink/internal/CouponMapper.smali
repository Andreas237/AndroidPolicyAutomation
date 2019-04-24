.class public final Lcom/microblink/internal/CouponMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Ljava/util/List<",
        "Lcom/microblink/Coupon;",
        ">;",
        "Ljava/util/List<",
        "Lcom/microblink/internal/OcrDiscount;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/CouponMapper;->transform(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final transform(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrDiscount;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/microblink/Coupon;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/OcrDiscount;

    sget-object v2, Lcom/microblink/CouponType;->UNKNOWN:Lcom/microblink/CouponType;

    const-string v3, "SC"

    iget-object v4, v1, Lcom/microblink/internal/OcrDiscount;->discountType:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v2, Lcom/microblink/CouponType;->STORE:Lcom/microblink/CouponType;

    goto :goto_1

    :cond_0
    const-string v3, "MC"

    iget-object v4, v1, Lcom/microblink/internal/OcrDiscount;->discountType:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v2, Lcom/microblink/CouponType;->MFGR:Lcom/microblink/CouponType;

    :cond_1
    :goto_1
    new-instance v3, Lcom/microblink/Coupon;

    new-instance v4, Lcom/microblink/FloatType;

    iget v5, v1, Lcom/microblink/internal/OcrDiscount;->price:F

    iget v6, v1, Lcom/microblink/internal/OcrDiscount;->priceConfidence:F

    invoke-direct {v4, v5, v6}, Lcom/microblink/FloatType;-><init>(FF)V

    new-instance v5, Lcom/microblink/StringType;

    iget-object v6, v1, Lcom/microblink/internal/OcrDiscount;->sku:Ljava/lang/String;

    iget v7, v1, Lcom/microblink/internal/OcrDiscount;->skuConfidence:F

    invoke-direct {v5, v6, v7}, Lcom/microblink/StringType;-><init>(Ljava/lang/String;F)V

    new-instance v6, Lcom/microblink/StringType;

    iget-object v7, v1, Lcom/microblink/internal/OcrDiscount;->description:Ljava/lang/String;

    iget v1, v1, Lcom/microblink/internal/OcrDiscount;->descriptionConfidence:F

    invoke-direct {v6, v7, v1}, Lcom/microblink/StringType;-><init>(Ljava/lang/String;F)V

    invoke-direct {v3, v2, v4, v5, v6}, Lcom/microblink/Coupon;-><init>(Lcom/microblink/CouponType;Lcom/microblink/FloatType;Lcom/microblink/StringType;Lcom/microblink/StringType;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method
