.class public final Lcom/microblink/internal/services/linux/LinuxResultsTransformer;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/EntityMapper;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/EntityMapper<",
        "Lcom/microblink/OcrResult;",
        "Lcom/microblink/internal/services/linux/LinuxResponse;",
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
.method public final transform(Lcom/microblink/internal/services/linux/LinuxResponse;)Lcom/microblink/OcrResult;
    .locals 5
    .param p1    # Lcom/microblink/internal/services/linux/LinuxResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/OcrResult;

    invoke-direct {v0}, Lcom/microblink/OcrResult;-><init>()V

    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->merchantLogo()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/microblink/OcrResult;->merchantLogo:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->merchantCsv()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/microblink/OcrResult;->merchantCsv:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->merchantSource()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/microblink/OcrResult;->merchantSource:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->merchantName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/microblink/OcrResult;->merchantMatchName:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->time()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/OcrResult;->time:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/OcrResult;->timeConfidence:F

    :cond_0
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->longTransactionId()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/OcrResult;->longTransactionId:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/OcrResult;->longTransactionIdConfidence:F

    :cond_1
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->dateTime()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/OcrResult;->date:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/OcrResult;->dateConfidence:F

    :cond_2
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->subtotal()Lcom/microblink/FloatType;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/FloatType;)F

    move-result v2

    iput v2, v0, Lcom/microblink/OcrResult;->subTotal:F

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/FloatType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/OcrResult;->subTotalConfidence:F

    :cond_3
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->total()Lcom/microblink/FloatType;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/FloatType;)F

    move-result v2

    iput v2, v0, Lcom/microblink/OcrResult;->total:F

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/FloatType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/OcrResult;->totalConfidence:F

    :cond_4
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->taxes()Lcom/microblink/FloatType;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/FloatType;)F

    move-result v2

    iput v2, v0, Lcom/microblink/OcrResult;->taxes:F

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/FloatType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/OcrResult;->taxesConfidence:F

    :cond_5
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->cashier()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/OcrResult;->cashier:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/OcrResult;->cashierConfidence:F

    :cond_6
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->transaction()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/OcrResult;->transaction:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/OcrResult;->transactionConfidence:F

    :cond_7
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->register()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/OcrResult;->register:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/OcrResult;->registerConfidence:F

    :cond_8
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->taxId()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/OcrResult;->taxId:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/OcrResult;->taxIdConfidence:F

    :cond_9
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->store()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/OcrResult;->store:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/OcrResult;->storeConfidence:F

    :cond_a
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->products()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_d

    new-instance v2, Lcom/microblink/internal/services/linux/LinuxProductMapper;

    invoke-direct {v2}, Lcom/microblink/internal/services/linux/LinuxProductMapper;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_b
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/microblink/internal/services/linux/Product;

    if-eqz v4, :cond_b

    invoke-interface {v2, v4}, Lcom/microblink/EntityMapper;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/microblink/internal/OcrProduct;

    if-eqz v4, :cond_b

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_c
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lcom/microblink/internal/OcrProduct;

    invoke-interface {v3, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/microblink/internal/OcrProduct;

    iput-object v1, v0, Lcom/microblink/OcrResult;->products:[Lcom/microblink/internal/OcrProduct;

    :cond_d
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->paymentMethods()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_10

    new-instance v2, Lcom/microblink/internal/services/linux/LinuxPaymentMapper;

    invoke-direct {v2}, Lcom/microblink/internal/services/linux/LinuxPaymentMapper;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_e
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/microblink/internal/services/linux/PaymentMethod;

    if-eqz v4, :cond_e

    invoke-interface {v2, v4}, Lcom/microblink/EntityMapper;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/microblink/internal/OcrPaymentMethod;

    if-eqz v4, :cond_e

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_f
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lcom/microblink/internal/OcrPaymentMethod;

    invoke-interface {v3, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/microblink/internal/OcrPaymentMethod;

    iput-object v1, v0, Lcom/microblink/OcrResult;->paymentMethods:[Lcom/microblink/internal/OcrPaymentMethod;

    :cond_10
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->phones()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_13

    new-instance v2, Lcom/microblink/internal/services/linux/LinuxPhoneMapper;

    invoke-direct {v2}, Lcom/microblink/internal/services/linux/LinuxPhoneMapper;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_11
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/microblink/StringType;

    if-eqz v4, :cond_11

    invoke-interface {v2, v4}, Lcom/microblink/EntityMapper;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/microblink/internal/OcrPhone;

    if-eqz v4, :cond_11

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_12
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lcom/microblink/internal/OcrPhone;

    invoke-interface {v3, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/microblink/internal/OcrPhone;

    iput-object v1, v0, Lcom/microblink/OcrResult;->phones:[Lcom/microblink/internal/OcrPhone;

    :cond_13
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->discounts()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_16

    new-instance v2, Lcom/microblink/internal/services/linux/LinuxDiscountMapper;

    invoke-direct {v2}, Lcom/microblink/internal/services/linux/LinuxDiscountMapper;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_14
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/microblink/internal/services/linux/Discount;

    if-eqz v4, :cond_14

    invoke-interface {v2, v4}, Lcom/microblink/EntityMapper;->transform(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/microblink/internal/OcrDiscount;

    if-eqz v4, :cond_14

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_15
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lcom/microblink/internal/OcrDiscount;

    invoke-interface {v3, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/microblink/internal/OcrDiscount;

    iput-object v1, v0, Lcom/microblink/OcrResult;->discounts:[Lcom/microblink/internal/OcrDiscount;

    :cond_16
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->rawText()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/microblink/OcrResult;->rawResults:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->storeStreet()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_17

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/OcrResult;->street:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/OcrResult;->streetConfidence:F

    :cond_17
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->storeCity()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/OcrResult;->city:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/OcrResult;->cityConfidence:F

    :cond_18
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->storeState()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_19

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/OcrResult;->state:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/OcrResult;->stateConfidence:F

    :cond_19
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->storeZip()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_1a

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/OcrResult;->zip:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/OcrResult;->zipConfidence:F

    :cond_1a
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->last4cc()Lcom/microblink/StringType;

    move-result-object v1

    if-eqz v1, :cond_1b

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->value(Lcom/microblink/StringType;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/microblink/OcrResult;->last4Digits:Ljava/lang/String;

    invoke-static {v1}, Lcom/microblink/TypeValueUtils;->confidence(Lcom/microblink/StringType;)F

    move-result v1

    iput v1, v0, Lcom/microblink/OcrResult;->last4DigitsConfidence:F

    :cond_1b
    invoke-virtual {p1}, Lcom/microblink/internal/services/linux/LinuxResponse;->subtotalMatches()Z

    move-result p1

    if-eqz p1, :cond_1c

    const-string p1, "YES"

    goto :goto_4

    :cond_1c
    const/4 p1, 0x0

    :goto_4
    iput-object p1, v0, Lcom/microblink/OcrResult;->subtotalMatches:Ljava/lang/String;

    return-object v0
.end method

.method public final bridge synthetic transform(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Lcom/microblink/internal/services/linux/LinuxResponse;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/linux/LinuxResultsTransformer;->transform(Lcom/microblink/internal/services/linux/LinuxResponse;)Lcom/microblink/OcrResult;

    move-result-object p1

    return-object p1
.end method
