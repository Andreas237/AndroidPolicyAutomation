.class final Lcom/microblink/SummaryUtils;
.super Ljava/lang/Object;


# static fields
.field private static final TAG:Ljava/lang/String; = "SummaryUtils"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static merchantKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "merchant[%s]"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string p0, ""

    :cond_0
    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static parameters(Lcom/microblink/SummaryStats;Lcom/microblink/Receipt;Lcom/microblink/internal/merchant/MerchantResult;)Ljava/util/Map;
    .locals 11
    .param p0    # Lcom/microblink/SummaryStats;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p1    # Lcom/microblink/Receipt;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/internal/merchant/MerchantResult;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/SummaryStats;",
            "Lcom/microblink/Receipt;",
            "Lcom/microblink/internal/merchant/MerchantResult;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p1}, Lcom/microblink/Receipt;->retailer()Lcom/microblink/Retailer;

    move-result-object v1

    const-string v2, "sdk_version"

    invoke-static {}, Lcom/microblink/SdkVersion;->versionName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "blink_receipt_id"

    invoke-static {v2}, Lcom/microblink/SummaryUtils;->summaryKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/microblink/Receipt;->receiptId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "banner_id"

    invoke-static {v2}, Lcom/microblink/SummaryUtils;->summaryKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/microblink/Retailer;->bannerId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/microblink/Receipt;->purchaseDateTime()Lcom/microblink/DateTime;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/microblink/DateTime;->dateTime()Ljava/util/Date;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v3, "dd-MM-yyyy"

    invoke-static {v3, v2}, Lcom/microblink/internal/DateUtils;->dateToString(Ljava/lang/String;Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "purchased_date"

    invoke-static {v4}, Lcom/microblink/SummaryUtils;->summaryKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v3, "dd-MM-yyyy\'T\'HH:mm:SS"

    invoke-static {v3, v2}, Lcom/microblink/internal/DateUtils;->dateToString(Ljava/lang/String;Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "purchased_time"

    invoke-static {v3}, Lcom/microblink/SummaryUtils;->summaryKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {p1}, Lcom/microblink/Receipt;->register()Lcom/microblink/StringType;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "register_id"

    invoke-static {v3}, Lcom/microblink/SummaryUtils;->summaryKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p1}, Lcom/microblink/Receipt;->transactionId()Lcom/microblink/StringType;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "transaction_id"

    invoke-static {v3}, Lcom/microblink/SummaryUtils;->summaryKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {p1}, Lcom/microblink/Receipt;->subTotal()Lcom/microblink/FloatType;

    move-result-object v2

    if-eqz v2, :cond_4

    const-string v3, "subtotal"

    invoke-static {v3}, Lcom/microblink/SummaryUtils;->summaryKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/microblink/FloatType;->valueToString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-virtual {v1}, Lcom/microblink/Retailer;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "merchant_name"

    invoke-static {v2}, Lcom/microblink/SummaryUtils;->summaryKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    if-eqz p0, :cond_6

    const-string v1, "frame_count"

    invoke-static {v1}, Lcom/microblink/SummaryUtils;->summaryKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/microblink/SummaryStats;->frameCount()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "ocr_speed"

    invoke-static {v1}, Lcom/microblink/SummaryUtils;->summaryKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/microblink/SummaryStats;->averageOcrTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "session_length"

    invoke-static {v1}, Lcom/microblink/SummaryUtils;->summaryKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/microblink/SummaryStats;->duration()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-virtual {p1}, Lcom/microblink/Receipt;->cashierId()Lcom/microblink/StringType;

    move-result-object p0

    invoke-static {p0}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "cashier_name"

    invoke-static {v1}, Lcom/microblink/SummaryUtils;->summaryKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "cashier_id"

    invoke-static {v1}, Lcom/microblink/SummaryUtils;->summaryKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-virtual {p1}, Lcom/microblink/Receipt;->ocrPaymentMethods()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_9

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_9

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/microblink/internal/OcrPaymentMethod;

    const-string v4, "payment_type_id"

    invoke-static {v1, v4}, Lcom/microblink/SummaryUtils;->paymentKey(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget v5, v3, Lcom/microblink/internal/OcrPaymentMethod;->line:I

    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "payment_price"

    invoke-static {v1, v4}, Lcom/microblink/SummaryUtils;->paymentKey(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget v5, v3, Lcom/microblink/internal/OcrPaymentMethod;->price:F

    invoke-static {v5}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v3, Lcom/microblink/internal/OcrPaymentMethod;->itemText:Ljava/lang/String;

    invoke-static {v3}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_8

    const-string v4, "payment_type_id"

    invoke-static {v1, v4}, Lcom/microblink/SummaryUtils;->paymentKey(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_9
    invoke-virtual {p1}, Lcom/microblink/Receipt;->ocrProducts()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    const/4 v3, 0x1

    if-nez v1, :cond_e

    const-string v1, "product_count"

    invoke-static {v1}, Lcom/microblink/SummaryUtils;->summaryKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_e

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/microblink/internal/OcrProduct;

    if-eqz v4, :cond_d

    iget-object v5, v4, Lcom/microblink/internal/OcrProduct;->sku:Ljava/lang/String;

    invoke-static {v5}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_a

    const-string v6, "id"

    invoke-static {v1, v6}, Lcom/microblink/SummaryUtils;->productKey(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "upc"

    invoke-static {v1, v6}, Lcom/microblink/SummaryUtils;->productKey(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "receipt_product_number"

    invoke-static {v1, v6}, Lcom/microblink/SummaryUtils;->productKey(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    const-string v5, "purchased_price"

    invoke-static {v1, v5}, Lcom/microblink/SummaryUtils;->productKey(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget v6, v4, Lcom/microblink/internal/OcrProduct;->totalPrice:F

    invoke-static {v6}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "regular_price"

    invoke-static {v1, v5}, Lcom/microblink/SummaryUtils;->productKey(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget v6, v4, Lcom/microblink/internal/OcrProduct;->fullPrice:F

    invoke-static {v6}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    const-string v5, "discounted"

    invoke-static {v1, v5}, Lcom/microblink/SummaryUtils;->productKey(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget v6, v4, Lcom/microblink/internal/OcrProduct;->fullPrice:F

    iget v7, v4, Lcom/microblink/internal/OcrProduct;->totalPrice:F

    sub-float/2addr v6, v7

    float-to-double v6, v6

    sget-wide v8, Lcom/microblink/internal/Utility;->MIN_PRICE_THRESHOLD:D

    cmpl-double v10, v6, v8

    if-lez v10, :cond_b

    const/4 v6, 0x1

    goto :goto_2

    :cond_b
    const/4 v6, 0x0

    :goto_2
    invoke-static {v6}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v5

    const-string v6, "SummaryUtils"

    invoke-virtual {v5}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v7, v2, [Ljava/lang/Object;

    invoke-static {v6, v5, v7}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_3
    iget-object v5, v4, Lcom/microblink/internal/OcrProduct;->uom:Ljava/lang/String;

    invoke-static {v5}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_c

    const-string v6, "unit_of_measure"

    invoke-static {v1, v6}, Lcom/microblink/SummaryUtils;->productKey(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    const-string v5, "quantity"

    invoke-static {v1, v5}, Lcom/microblink/SummaryUtils;->productKey(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget v6, v4, Lcom/microblink/internal/OcrProduct;->quantity:I

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "unit_quantity"

    invoke-static {v1, v5}, Lcom/microblink/SummaryUtils;->productKey(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget v6, v4, Lcom/microblink/internal/OcrProduct;->quantity:I

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "unit_price"

    invoke-static {v1, v5}, Lcom/microblink/SummaryUtils;->productKey(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget v4, v4, Lcom/microblink/internal/OcrProduct;->uomPrice:F

    invoke-static {v4}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    :cond_e
    const-string p0, "latitude"

    invoke-static {p0}, Lcom/microblink/SummaryUtils;->summaryKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "longitude"

    invoke-static {p0}, Lcom/microblink/SummaryUtils;->summaryKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/microblink/Receipt;->storeAddress()Lcom/microblink/StringType;

    move-result-object p0

    const-string v1, ""

    invoke-static {p0, v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_f

    const-string v1, "store_address"

    invoke-static {v1}, Lcom/microblink/SummaryUtils;->storeKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    invoke-virtual {p1}, Lcom/microblink/Receipt;->storeCity()Lcom/microblink/StringType;

    move-result-object p0

    const-string v1, ""

    invoke-static {p0, v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_10

    const-string v1, "store_city"

    invoke-static {v1}, Lcom/microblink/SummaryUtils;->storeKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    invoke-virtual {p1}, Lcom/microblink/Receipt;->storeState()Lcom/microblink/StringType;

    move-result-object p0

    const-string v1, ""

    invoke-static {p0, v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_11

    const-string v1, "store_state"

    invoke-static {v1}, Lcom/microblink/SummaryUtils;->storeKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    invoke-virtual {p1}, Lcom/microblink/Receipt;->storeZip()Lcom/microblink/StringType;

    move-result-object p0

    const-string v1, ""

    invoke-static {p0, v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_12

    const-string v1, "store_zip_code"

    invoke-static {v1}, Lcom/microblink/SummaryUtils;->storeKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    invoke-virtual {p1}, Lcom/microblink/Receipt;->storeCountry()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_13

    const-string p0, "store_country"

    invoke-static {p0}, Lcom/microblink/SummaryUtils;->storeKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lcom/microblink/Receipt;->storeCountry()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_13
    invoke-virtual {p1}, Lcom/microblink/Receipt;->storePhone()Lcom/microblink/StringType;

    move-result-object p0

    const-string v1, ""

    invoke-static {p0, v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_14

    const-string v1, "store_phone_number"

    invoke-static {v1}, Lcom/microblink/SummaryUtils;->storeKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_14
    invoke-virtual {p1}, Lcom/microblink/Receipt;->googlePlaceId()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_15

    const-string p0, "google_place_id"

    invoke-static {p0}, Lcom/microblink/SummaryUtils;->storeKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lcom/microblink/Receipt;->googlePlaceId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_15
    invoke-virtual {p1}, Lcom/microblink/Receipt;->yelpId()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_16

    const-string p0, "yelp_place_id"

    invoke-static {p0}, Lcom/microblink/SummaryUtils;->storeKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lcom/microblink/Receipt;->yelpId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_16
    invoke-virtual {p1}, Lcom/microblink/Receipt;->merchantName()Lcom/microblink/StringType;

    move-result-object p0

    const-string v1, ""

    invoke-static {p0, v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_17

    const-string v1, "merchant_name"

    invoke-static {v1}, Lcom/microblink/SummaryUtils;->storeKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_17
    if-eqz p2, :cond_1b

    const-string p0, "blink_receipt_id"

    invoke-static {p0}, Lcom/microblink/SummaryUtils;->merchantKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lcom/microblink/Receipt;->receiptId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/microblink/internal/merchant/MerchantResult;->merchantSource()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_18

    const-string p0, "source"

    invoke-static {p0}, Lcom/microblink/SummaryUtils;->merchantKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2}, Lcom/microblink/internal/merchant/MerchantResult;->merchantSource()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_18
    iget-object p0, p2, Lcom/microblink/internal/merchant/MerchantResult;->googlePlaceId:Ljava/lang/String;

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_19

    const-string p0, "google_place_id"

    invoke-static {p0}, Lcom/microblink/SummaryUtils;->merchantKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iget-object p1, p2, Lcom/microblink/internal/merchant/MerchantResult;->googlePlaceId:Ljava/lang/String;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_19
    iget-object p0, p2, Lcom/microblink/internal/merchant/MerchantResult;->name:Ljava/lang/String;

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_1a

    const-string p0, "merchant_name"

    invoke-static {p0}, Lcom/microblink/SummaryUtils;->merchantKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iget-object p1, p2, Lcom/microblink/internal/merchant/MerchantResult;->name:Ljava/lang/String;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1a
    iget-object p0, p2, Lcom/microblink/internal/merchant/MerchantResult;->yelpId:Ljava/lang/String;

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_1b

    const-string p0, "yelp_place_id"

    invoke-static {p0}, Lcom/microblink/SummaryUtils;->merchantKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iget-object p1, p2, Lcom/microblink/internal/merchant/MerchantResult;->yelpId:Ljava/lang/String;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1b
    const-string p0, "got_results"

    invoke-static {p0}, Lcom/microblink/SummaryUtils;->merchantKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p2, :cond_1c

    const/4 v2, 0x1

    :cond_1c
    invoke-static {v2}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private static paymentKey(ILjava/lang/String;)Ljava/lang/String;
    .locals 4

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "receipt[payment][%d][%s]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p1, ""

    :cond_0
    const/4 p0, 0x1

    aput-object p1, v2, p0

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static productKey(ILjava/lang/String;)Ljava/lang/String;
    .locals 4

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "products[%d][%s]"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p1, ""

    :cond_0
    const/4 p0, 0x1

    aput-object p1, v2, p0

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static storeKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "store[%s]"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string p0, ""

    :cond_0
    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static summaryKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "receipt[%s]"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string p0, ""

    :cond_0
    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
