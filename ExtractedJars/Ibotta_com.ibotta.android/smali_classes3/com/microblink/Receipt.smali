.class public final Lcom/microblink/Receipt;
.super Ljava/lang/Object;


# instance fields
.field private address:Lcom/microblink/StringType;

.field private candidateMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/microblink/internal/candidate/Candidate;",
            ">;"
        }
    .end annotation
.end field

.field private cashier:Lcom/microblink/StringType;

.field private combinedRaw:Lcom/microblink/StringType;

.field private coupons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrDiscount;",
            ">;"
        }
    .end annotation
.end field

.field private detectedBannerId:I

.field private foundBottomEdge:Z

.field private foundTopEdge:Z

.field private googlePlaceId:Ljava/lang/String;

.field private last4Digits:Lcom/microblink/StringType;

.field private final lock:Ljava/lang/Object;

.field private longTransactionId:Lcom/microblink/StringType;

.field private mallName:Lcom/microblink/StringType;

.field private merchantName:Lcom/microblink/StringType;

.field private merchantSource:Ljava/lang/String;

.field private ocrConfidence:F

.field private ocrProducts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrProduct;",
            ">;"
        }
    .end annotation
.end field

.field private paymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrPaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private purchaseDate:Lcom/microblink/DateTime;

.field private rawResults:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private receiptId:Ljava/lang/String;

.field private register:Lcom/microblink/StringType;

.field private retailer:Lcom/microblink/Retailer;

.field private retailerFromLogo:Lcom/microblink/StringType;

.field private storeCity:Lcom/microblink/StringType;

.field private storeCountry:Ljava/lang/String;

.field private storeNumber:Lcom/microblink/StringType;

.field private storePhone:Lcom/microblink/StringType;

.field private storeState:Lcom/microblink/StringType;

.field private storeZip:Lcom/microblink/StringType;

.field private subTotal:Lcom/microblink/FloatType;

.field private subtotalMatches:Lcom/microblink/StringType;

.field private taxId:Lcom/microblink/StringType;

.field private taxes:Lcom/microblink/FloatType;

.field private total:Lcom/microblink/FloatType;

.field private transaction:Lcom/microblink/StringType;

.field private yelpId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/microblink/Retailer;)V
    .locals 1
    .param p1    # Lcom/microblink/Retailer;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    sget-object v0, Lcom/microblink/Retailer;->UNKNOWN:Lcom/microblink/Retailer;

    invoke-virtual {v0}, Lcom/microblink/Retailer;->bannerId()I

    move-result v0

    iput v0, p0, Lcom/microblink/Receipt;->detectedBannerId:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/microblink/Receipt;->rawResults:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/microblink/Receipt;->candidateMap:Ljava/util/Map;

    iput-object p1, p0, Lcom/microblink/Receipt;->retailer:Lcom/microblink/Retailer;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/microblink/Receipt;->ocrProducts:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/microblink/Receipt;->coupons:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/microblink/Receipt;->paymentMethods:Ljava/util/List;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/Receipt;->receiptId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final addCoupon(Lcom/microblink/internal/OcrDiscount;)V
    .locals 2
    .param p1    # Lcom/microblink/internal/OcrDiscount;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/Receipt;->coupons:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final addCoupons(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrDiscount;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/Receipt;->coupons:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final addOcrProduct(Lcom/microblink/internal/OcrProduct;)Lcom/microblink/Receipt;
    .locals 2
    .param p1    # Lcom/microblink/internal/OcrProduct;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/Receipt;->ocrProducts:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final addPayments(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrPaymentMethod;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/Receipt;->paymentMethods:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final addRawResult(Ljava/lang/String;)Lcom/microblink/Receipt;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/Receipt;->rawResults:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final candidateMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/microblink/internal/candidate/Candidate;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/Receipt;->candidateMap:Ljava/util/Map;

    return-object v0
.end method

.method public final cashier(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->cashier:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final cashierId()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->cashier:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final clearCoupons()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/Receipt;->coupons:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final clearOcrProducts()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/Receipt;->ocrProducts:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final clearPayments()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/Receipt;->paymentMethods:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final combinedRaw(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->combinedRaw:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final combinedRaw()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->combinedRaw:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final coupons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrDiscount;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/Receipt;->coupons:Ljava/util/List;

    return-object v0
.end method

.method public final detectedBannerId()I
    .locals 1

    iget v0, p0, Lcom/microblink/Receipt;->detectedBannerId:I

    return v0
.end method

.method public final detectedBannerId(I)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput p1, p0, Lcom/microblink/Receipt;->detectedBannerId:I

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final foundBottomEdge(Z)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-boolean p1, p0, Lcom/microblink/Receipt;->foundBottomEdge:Z

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final foundBottomEdge()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/Receipt;->foundBottomEdge:Z

    return v0
.end method

.method public final foundTopEdge(Z)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-boolean p1, p0, Lcom/microblink/Receipt;->foundTopEdge:Z

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final foundTopEdge()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/Receipt;->foundTopEdge:Z

    return v0
.end method

.method public final googlePlaceId(Ljava/lang/String;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->googlePlaceId:Ljava/lang/String;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final googlePlaceId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->googlePlaceId:Ljava/lang/String;

    return-object v0
.end method

.method public final last4Digits(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->last4Digits:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final last4Digits()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->last4Digits:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final longTransactionId(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->longTransactionId:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final longTransactionId()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->longTransactionId:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final mallName(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->mallName:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final mallName()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->mallName:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final merchantName(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->merchantName:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final merchantName()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->merchantName:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final merchantSource(Ljava/lang/String;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->merchantSource:Ljava/lang/String;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final merchantSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->merchantSource:Ljava/lang/String;

    return-object v0
.end method

.method public final ocrConfidence()F
    .locals 1

    iget v0, p0, Lcom/microblink/Receipt;->ocrConfidence:F

    return v0
.end method

.method public final ocrConfidence(F)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput p1, p0, Lcom/microblink/Receipt;->ocrConfidence:F

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ocrPaymentMethods()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrPaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/Receipt;->paymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final ocrProducts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/OcrProduct;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/Receipt;->ocrProducts:Ljava/util/List;

    return-object v0
.end method

.method public final paymentMethods()Ljava/util/List;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/PaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/Receipt;->paymentMethods:Ljava/util/List;

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/microblink/internal/PaymentMethodsMapper;

    invoke-direct {v0}, Lcom/microblink/internal/PaymentMethodsMapper;-><init>()V

    iget-object v1, p0, Lcom/microblink/Receipt;->paymentMethods:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/microblink/internal/PaymentMethodsMapper;->transform(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final purchaseDateTime()Lcom/microblink/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->purchaseDate:Lcom/microblink/DateTime;

    return-object v0
.end method

.method public final purchaseDateTime(Lcom/microblink/DateTime;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->purchaseDate:Lcom/microblink/DateTime;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final rawResults()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/Receipt;->rawResults:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final receiptId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->receiptId:Ljava/lang/String;

    return-object v0
.end method

.method public final register(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->register:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final register()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->register:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final retailer()Lcom/microblink/Retailer;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->retailer:Lcom/microblink/Retailer;

    return-object v0
.end method

.method public final retailerFromLogo(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->retailerFromLogo:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final retailerFromLogo()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->retailerFromLogo:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final sortCouponsByLineNumber()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/Receipt;->coupons:Ljava/util/List;

    new-instance v2, Lcom/microblink/Receipt$2;

    invoke-direct {v2, p0}, Lcom/microblink/Receipt$2;-><init>(Lcom/microblink/Receipt;)V

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final sortProductsByLineNumber()V
    .locals 3

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/Receipt;->ocrProducts:Ljava/util/List;

    new-instance v2, Lcom/microblink/Receipt$1;

    invoke-direct {v2, p0}, Lcom/microblink/Receipt$1;-><init>(Lcom/microblink/Receipt;)V

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final storeAddress(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->address:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final storeAddress()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->address:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final storeCity(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->storeCity:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final storeCity()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->storeCity:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final storeCountry(Ljava/lang/String;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->storeCountry:Ljava/lang/String;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final storeCountry()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->storeCountry:Ljava/lang/String;

    return-object v0
.end method

.method public final storeNumber(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->storeNumber:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final storeNumber()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->storeNumber:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final storePhone(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->storePhone:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final storePhone()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->storePhone:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final storeState(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->storeState:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final storeState()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->storeState:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final storeZip(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->storeZip:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final storeZip()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->storeZip:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final subTotal()Lcom/microblink/FloatType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->subTotal:Lcom/microblink/FloatType;

    return-object v0
.end method

.method public final subTotal(Lcom/microblink/FloatType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->subTotal:Lcom/microblink/FloatType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final subtotalMatches(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->subtotalMatches:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final subtotalMatches()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->subtotalMatches:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final taxId(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->taxId:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final taxId()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->taxId:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final taxes()Lcom/microblink/FloatType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->taxes:Lcom/microblink/FloatType;

    return-object v0
.end method

.method public final taxes(Lcom/microblink/FloatType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->taxes:Lcom/microblink/FloatType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Receipt{lock="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ocrProducts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/Receipt;->ocrProducts:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", coupons="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/Receipt;->coupons:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", paymentMethods="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/Receipt;->paymentMethods:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", receiptId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/Receipt;->receiptId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", subTotal="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->subTotal:Lcom/microblink/FloatType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", total="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->total:Lcom/microblink/FloatType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", taxes="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->taxes:Lcom/microblink/FloatType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", purchaseDate="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->purchaseDate:Lcom/microblink/DateTime;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", cashier="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->cashier:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", transaction="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->transaction:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", register="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->register:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", merchantName="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->merchantName:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", retailer="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->retailer:Lcom/microblink/Retailer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", storePhone="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->storePhone:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", storeNumber="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->storeNumber:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", storeCity="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->storeCity:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", storeState="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->storeState:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", storeZip="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->storeZip:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", storeCountry=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->storeCountry:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", yelpId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->yelpId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", googlePlaceId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->googlePlaceId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", address="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->address:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", candidateMap="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->candidateMap:Ljava/util/Map;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", rawResults="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->rawResults:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", taxId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->taxId:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", mallName="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->mallName:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", longTransactionId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->longTransactionId:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", last4Digits="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->last4Digits:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", ocrConfidence="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/Receipt;->ocrConfidence:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", merchantSource=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/Receipt;->merchantSource:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", detectedBannerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/Receipt;->detectedBannerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", retailerFromLogo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/Receipt;->retailerFromLogo:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", foundTopEdge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/Receipt;->foundTopEdge:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", foundBottomEdge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/Receipt;->foundBottomEdge:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", subtotalMatches="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/Receipt;->subtotalMatches:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", combinedRaw="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/Receipt;->combinedRaw:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final total()Lcom/microblink/FloatType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->total:Lcom/microblink/FloatType;

    return-object v0
.end method

.method public final total(Lcom/microblink/FloatType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->total:Lcom/microblink/FloatType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final transaction(Lcom/microblink/StringType;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->transaction:Lcom/microblink/StringType;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final transactionId()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->transaction:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final yelpId(Ljava/lang/String;)Lcom/microblink/Receipt;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/microblink/Receipt;->yelpId:Ljava/lang/String;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final yelpId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/Receipt;->yelpId:Ljava/lang/String;

    return-object v0
.end method
