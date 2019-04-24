.class final Lcom/microblink/OcrResultsTransformer;
.super Ljava/lang/Object;


# instance fields
.field private receipt:Lcom/microblink/Receipt;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/microblink/Receipt;)V
    .locals 0
    .param p1    # Lcom/microblink/Receipt;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    return-void
.end method


# virtual methods
.method public final transform(Lcom/microblink/OcrResult;)V
    .locals 5
    .param p1    # Lcom/microblink/OcrResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    invoke-virtual {v0}, Lcom/microblink/Receipt;->clearOcrProducts()V

    invoke-virtual {p1}, Lcom/microblink/OcrResult;->hasProducts()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/microblink/OcrResult;->products:[Lcom/microblink/internal/OcrProduct;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    iget-object v4, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    invoke-virtual {v4, v3}, Lcom/microblink/Receipt;->addOcrProduct(Lcom/microblink/internal/OcrProduct;)Lcom/microblink/Receipt;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    invoke-virtual {v0}, Lcom/microblink/Receipt;->sortProductsByLineNumber()V

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    invoke-virtual {v0}, Lcom/microblink/Receipt;->clearCoupons()V

    iget-object v0, p1, Lcom/microblink/OcrResult;->discounts:[Lcom/microblink/internal/OcrDiscount;

    if-eqz v0, :cond_2

    new-instance v1, Lcom/microblink/internal/OcrDiscountMapper;

    invoke-direct {v1}, Lcom/microblink/internal/OcrDiscountMapper;-><init>()V

    invoke-virtual {v1, v0}, Lcom/microblink/internal/OcrDiscountMapper;->transform([Lcom/microblink/internal/OcrDiscount;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    invoke-virtual {v1, v0}, Lcom/microblink/Receipt;->addCoupons(Ljava/util/List;)V

    :cond_2
    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    invoke-virtual {v0}, Lcom/microblink/Receipt;->sortCouponsByLineNumber()V

    new-instance v0, Lcom/microblink/internal/OcrDateMapper;

    invoke-direct {v0}, Lcom/microblink/internal/OcrDateMapper;-><init>()V

    invoke-virtual {v0, p1}, Lcom/microblink/internal/OcrDateMapper;->transform(Lcom/microblink/OcrResult;)Lcom/microblink/DateTime;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    invoke-virtual {v1, v0}, Lcom/microblink/Receipt;->purchaseDateTime(Lcom/microblink/DateTime;)Lcom/microblink/Receipt;

    :cond_3
    iget v0, p1, Lcom/microblink/OcrResult;->total:F

    invoke-static {v0}, Lcom/microblink/internal/Utility;->checkMinPriceThreshold(F)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget v2, p1, Lcom/microblink/OcrResult;->total:F

    iget v3, p1, Lcom/microblink/OcrResult;->totalConfidence:F

    invoke-static {v2, v3}, Lcom/microblink/TypeValueUtils;->valueOf(FF)Lcom/microblink/FloatType;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/microblink/Receipt;->total(Lcom/microblink/FloatType;)Lcom/microblink/Receipt;

    :cond_4
    iget v0, p1, Lcom/microblink/OcrResult;->subTotal:F

    invoke-static {v0}, Lcom/microblink/internal/Utility;->checkMinPriceThreshold(F)F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget v2, p1, Lcom/microblink/OcrResult;->subTotal:F

    iget v3, p1, Lcom/microblink/OcrResult;->subTotalConfidence:F

    invoke-static {v2, v3}, Lcom/microblink/TypeValueUtils;->valueOf(FF)Lcom/microblink/FloatType;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/microblink/Receipt;->subTotal(Lcom/microblink/FloatType;)Lcom/microblink/Receipt;

    :cond_5
    iget v0, p1, Lcom/microblink/OcrResult;->taxes:F

    invoke-static {v0}, Lcom/microblink/internal/Utility;->checkMinPriceThreshold(F)F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget v1, p1, Lcom/microblink/OcrResult;->taxes:F

    iget v2, p1, Lcom/microblink/OcrResult;->taxesConfidence:F

    invoke-static {v1, v2}, Lcom/microblink/TypeValueUtils;->valueOf(FF)Lcom/microblink/FloatType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->taxes(Lcom/microblink/FloatType;)Lcom/microblink/Receipt;

    :cond_6
    iget-object v0, p1, Lcom/microblink/OcrResult;->cashier:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget-object v1, p1, Lcom/microblink/OcrResult;->cashier:Ljava/lang/String;

    iget v2, p1, Lcom/microblink/OcrResult;->cashierConfidence:F

    invoke-static {v1, v2}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->cashier(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_7
    iget-object v0, p1, Lcom/microblink/OcrResult;->transaction:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget-object v1, p1, Lcom/microblink/OcrResult;->transaction:Ljava/lang/String;

    iget v2, p1, Lcom/microblink/OcrResult;->transactionConfidence:F

    invoke-static {v1, v2}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->transaction(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_8
    iget-object v0, p1, Lcom/microblink/OcrResult;->register:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget-object v1, p1, Lcom/microblink/OcrResult;->register:Ljava/lang/String;

    iget v2, p1, Lcom/microblink/OcrResult;->registerConfidence:F

    invoke-static {v1, v2}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->register(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_9
    iget-object v0, p1, Lcom/microblink/OcrResult;->store:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget-object v1, p1, Lcom/microblink/OcrResult;->store:Ljava/lang/String;

    iget v2, p1, Lcom/microblink/OcrResult;->storeConfidence:F

    invoke-static {v1, v2}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->storeNumber(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_a
    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    invoke-virtual {v0}, Lcom/microblink/Receipt;->clearPayments()V

    iget-object v0, p1, Lcom/microblink/OcrResult;->paymentMethods:[Lcom/microblink/internal/OcrPaymentMethod;

    if-eqz v0, :cond_b

    new-instance v0, Lcom/microblink/internal/OcrPaymentMethodMapper;

    invoke-direct {v0}, Lcom/microblink/internal/OcrPaymentMethodMapper;-><init>()V

    iget-object v1, p1, Lcom/microblink/OcrResult;->paymentMethods:[Lcom/microblink/internal/OcrPaymentMethod;

    invoke-virtual {v0, v1}, Lcom/microblink/internal/OcrPaymentMethodMapper;->transform([Lcom/microblink/internal/OcrPaymentMethod;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v1

    if-nez v1, :cond_b

    iget-object v1, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    invoke-virtual {v1, v0}, Lcom/microblink/Receipt;->addPayments(Ljava/util/List;)V

    :cond_b
    iget-object v0, p1, Lcom/microblink/OcrResult;->street:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget-object v1, p1, Lcom/microblink/OcrResult;->street:Ljava/lang/String;

    iget v2, p1, Lcom/microblink/OcrResult;->streetConfidence:F

    invoke-static {v1, v2}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->storeAddress(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_c
    iget-object v0, p1, Lcom/microblink/OcrResult;->city:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_d

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget-object v1, p1, Lcom/microblink/OcrResult;->city:Ljava/lang/String;

    iget v2, p1, Lcom/microblink/OcrResult;->cityConfidence:F

    invoke-static {v1, v2}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->storeCity(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_d
    iget-object v0, p1, Lcom/microblink/OcrResult;->state:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget-object v1, p1, Lcom/microblink/OcrResult;->state:Ljava/lang/String;

    iget v2, p1, Lcom/microblink/OcrResult;->stateConfidence:F

    invoke-static {v1, v2}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->storeState(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_e
    iget-object v0, p1, Lcom/microblink/OcrResult;->zip:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_f

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget-object v1, p1, Lcom/microblink/OcrResult;->zip:Ljava/lang/String;

    iget v2, p1, Lcom/microblink/OcrResult;->zipConfidence:F

    invoke-static {v1, v2}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->storeZip(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_f
    iget-object v0, p1, Lcom/microblink/OcrResult;->taxId:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_10

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget-object v1, p1, Lcom/microblink/OcrResult;->taxId:Ljava/lang/String;

    iget v2, p1, Lcom/microblink/OcrResult;->taxIdConfidence:F

    invoke-static {v1, v2}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->taxId(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_10
    iget-object v0, p1, Lcom/microblink/OcrResult;->mall:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget-object v1, p1, Lcom/microblink/OcrResult;->mall:Ljava/lang/String;

    iget v2, p1, Lcom/microblink/OcrResult;->mallConfidence:F

    invoke-static {v1, v2}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->mallName(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_11
    invoke-virtual {p1}, Lcom/microblink/OcrResult;->detectedBannerId()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_12

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    invoke-virtual {p1}, Lcom/microblink/OcrResult;->detectedBannerId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->detectedBannerId(I)Lcom/microblink/Receipt;

    :cond_12
    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget-object v1, p1, Lcom/microblink/OcrResult;->merchantMatchName:Ljava/lang/String;

    iget v2, p1, Lcom/microblink/OcrResult;->merchantMatchNameConfidence:F

    invoke-static {v1, v2}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->merchantName(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    iget-object v0, p1, Lcom/microblink/OcrResult;->phones:[Lcom/microblink/internal/OcrPhone;

    if-eqz v0, :cond_13

    iget-object v1, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    new-instance v2, Lcom/microblink/internal/OcrPhoneMapper;

    invoke-direct {v2}, Lcom/microblink/internal/OcrPhoneMapper;-><init>()V

    invoke-virtual {v2, v0}, Lcom/microblink/internal/OcrPhoneMapper;->transform([Lcom/microblink/internal/OcrPhone;)Lcom/microblink/StringType;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/microblink/Receipt;->storePhone(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_13
    iget-object v0, p1, Lcom/microblink/OcrResult;->last4Digits:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_14

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget-object v1, p1, Lcom/microblink/OcrResult;->last4Digits:Ljava/lang/String;

    iget v2, p1, Lcom/microblink/OcrResult;->last4DigitsConfidence:F

    invoke-static {v1, v2}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->last4Digits(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_14
    iget-object v0, p1, Lcom/microblink/OcrResult;->longTransactionId:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_15

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget-object v1, p1, Lcom/microblink/OcrResult;->longTransactionId:Ljava/lang/String;

    iget v2, p1, Lcom/microblink/OcrResult;->longTransactionIdConfidence:F

    invoke-static {v1, v2}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->longTransactionId(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_15
    iget-object v0, p1, Lcom/microblink/OcrResult;->subtotalMatches:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_16

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget-object v1, p1, Lcom/microblink/OcrResult;->subtotalMatches:Ljava/lang/String;

    iget v2, p1, Lcom/microblink/OcrResult;->subtotalMatchesConfidence:F

    invoke-static {v1, v2}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->subtotalMatches(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_16
    iget-object v0, p1, Lcom/microblink/OcrResult;->combinedRaw:Ljava/lang/String;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_17

    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget-object v1, p1, Lcom/microblink/OcrResult;->combinedRaw:Ljava/lang/String;

    iget v2, p1, Lcom/microblink/OcrResult;->combinedRawConfidence:F

    invoke-static {v1, v2}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/microblink/Receipt;->combinedRaw(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    :cond_17
    iget-object v0, p0, Lcom/microblink/OcrResultsTransformer;->receipt:Lcom/microblink/Receipt;

    iget-object p1, p1, Lcom/microblink/OcrResult;->rawResults:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/microblink/Receipt;->addRawResult(Ljava/lang/String;)Lcom/microblink/Receipt;

    return-void
.end method
