.class final Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/Continuation<",
        "Ljava/util/List<",
        "Lcom/microblink/internal/services/mailboxes/Inbox;",
        ">;",
        "Ljava/util/List<",
        "Lcom/microblink/ScanResults;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "GmailInboxScanResultsCallable"


# instance fields
.field private service:Lcom/microblink/internal/services/mailboxes/InboxService;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private signInAccount:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    .locals 0
    .param p1    # Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable;->signInAccount:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    new-instance p1, Lcom/microblink/internal/services/mailboxes/InboxServiceImpl;

    invoke-direct {p1}, Lcom/microblink/internal/services/mailboxes/InboxServiceImpl;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable;->service:Lcom/microblink/internal/services/mailboxes/InboxService;

    return-void
.end method


# virtual methods
.method public final bridge synthetic then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lcom/google/android/gms/tasks/Task;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable;->then(Lcom/google/android/gms/tasks/Task;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/util/List;
    .locals 9
    .param p1    # Lcom/google/android/gms/tasks/Task;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/Inbox;",
            ">;>;)",
            "Ljava/util/List<",
            "Lcom/microblink/ScanResults;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/microblink/ScanResults;

    invoke-static {v1}, Lcom/microblink/internal/Utility;->newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_4

    new-instance v2, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable$1;

    invoke-direct {v2, p0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable$1;-><init>(Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable;)V

    invoke-static {p1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/microblink/internal/services/mailboxes/Inbox;

    invoke-virtual {v2}, Lcom/microblink/internal/services/mailboxes/Inbox;->message()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {}, Lcom/microblink/ScanResults;->newBuilder()Lcom/microblink/ScanResults$Builder;

    move-result-object v3

    sget-object v4, Lcom/microblink/Retailer;->UNKNOWN:Lcom/microblink/Retailer;

    invoke-virtual {v3, v4}, Lcom/microblink/ScanResults$Builder;->retailerId(Lcom/microblink/Retailer;)Lcom/microblink/ScanResults$Builder;

    move-result-object v3

    invoke-virtual {v2}, Lcom/microblink/internal/services/mailboxes/Inbox;->html()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/microblink/ScanResults$Builder;->eReceiptRawHtml(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/microblink/ScanResults$Builder;->build()Lcom/microblink/ScanResults;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/microblink/Receipt;

    sget-object v4, Lcom/microblink/Retailer;->UNKNOWN:Lcom/microblink/Retailer;

    invoke-direct {v3, v4}, Lcom/microblink/Receipt;-><init>(Lcom/microblink/Retailer;)V

    invoke-virtual {v2}, Lcom/microblink/internal/services/mailboxes/Inbox;->total()F

    move-result v4

    const/high16 v5, 0x42c80000    # 100.0f

    invoke-static {v4, v5}, Lcom/microblink/TypeValueUtils;->valueOf(FF)Lcom/microblink/FloatType;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/microblink/Receipt;->total(Lcom/microblink/FloatType;)Lcom/microblink/Receipt;

    invoke-virtual {v2}, Lcom/microblink/internal/services/mailboxes/Inbox;->taxes()F

    move-result v4

    invoke-static {v4, v5}, Lcom/microblink/TypeValueUtils;->valueOf(FF)Lcom/microblink/FloatType;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/microblink/Receipt;->taxes(Lcom/microblink/FloatType;)Lcom/microblink/Receipt;

    invoke-virtual {v2}, Lcom/microblink/internal/services/mailboxes/Inbox;->subtotal()F

    move-result v4

    invoke-static {v4, v5}, Lcom/microblink/TypeValueUtils;->valueOf(FF)Lcom/microblink/FloatType;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/microblink/Receipt;->subTotal(Lcom/microblink/FloatType;)Lcom/microblink/Receipt;

    invoke-virtual {v2}, Lcom/microblink/internal/services/mailboxes/Inbox;->merchant()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/microblink/Receipt;->merchantName(Lcom/microblink/StringType;)Lcom/microblink/Receipt;

    invoke-virtual {v2}, Lcom/microblink/internal/services/mailboxes/Inbox;->products()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/microblink/internal/services/mailboxes/InboxProduct;

    new-instance v7, Lcom/microblink/internal/OcrProduct;

    invoke-direct {v7}, Lcom/microblink/internal/OcrProduct;-><init>()V

    invoke-virtual {v6}, Lcom/microblink/internal/services/mailboxes/InboxProduct;->quantity()F

    move-result v8

    float-to-int v8, v8

    iput v8, v7, Lcom/microblink/internal/OcrProduct;->quantity:I

    iput v5, v7, Lcom/microblink/internal/OcrProduct;->quantityConfidence:F

    invoke-virtual {v6}, Lcom/microblink/internal/services/mailboxes/InboxProduct;->unitPrice()F

    move-result v8

    iput v8, v7, Lcom/microblink/internal/OcrProduct;->price:F

    iput v5, v7, Lcom/microblink/internal/OcrProduct;->priceConfidence:F

    invoke-virtual {v6}, Lcom/microblink/internal/services/mailboxes/InboxProduct;->totalPrice()F

    move-result v8

    iput v8, v7, Lcom/microblink/internal/OcrProduct;->totalPrice:F

    iput v5, v7, Lcom/microblink/internal/OcrProduct;->totalPriceConfidence:F

    invoke-virtual {v6}, Lcom/microblink/internal/services/mailboxes/InboxProduct;->uom()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/microblink/internal/OcrProduct;->uom:Ljava/lang/String;

    iput v5, v7, Lcom/microblink/internal/OcrProduct;->uomConfidence:F

    invoke-virtual {v6}, Lcom/microblink/internal/services/mailboxes/InboxProduct;->brandName()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/microblink/internal/OcrProduct;->brand:Ljava/lang/String;

    invoke-virtual {v6}, Lcom/microblink/internal/services/mailboxes/InboxProduct;->productName()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/microblink/internal/OcrProduct;->name:Ljava/lang/String;

    invoke-virtual {v6}, Lcom/microblink/internal/services/mailboxes/InboxProduct;->imageUrl()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/microblink/internal/OcrProduct;->imageUrl:Ljava/lang/String;

    invoke-virtual {v6}, Lcom/microblink/internal/services/mailboxes/InboxProduct;->categoryNode()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/microblink/internal/OcrProduct;->category:Ljava/lang/String;

    invoke-virtual {v6}, Lcom/microblink/internal/services/mailboxes/InboxProduct;->upc()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/microblink/internal/OcrProduct;->upc:Ljava/lang/String;

    invoke-virtual {v6}, Lcom/microblink/internal/services/mailboxes/InboxProduct;->size()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/microblink/internal/OcrProduct;->size:Ljava/lang/String;

    invoke-virtual {v6}, Lcom/microblink/internal/services/mailboxes/InboxProduct;->fetchRewardsGroup()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/microblink/internal/OcrProduct;->rewardsGroup:Ljava/lang/String;

    invoke-virtual {v6}, Lcom/microblink/internal/services/mailboxes/InboxProduct;->fetchCompetitorRewardsGroup()Ljava/lang/String;

    move-result-object v8

    iput-object v8, v7, Lcom/microblink/internal/OcrProduct;->competitorRewardsGroup:Ljava/lang/String;

    invoke-virtual {v6}, Lcom/microblink/internal/services/mailboxes/InboxProduct;->shippingStatus()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v7, Lcom/microblink/internal/OcrProduct;->shippingStatus:Ljava/lang/String;

    invoke-virtual {v3, v7}, Lcom/microblink/Receipt;->addOcrProduct(Lcom/microblink/internal/OcrProduct;)Lcom/microblink/Receipt;

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/microblink/internal/services/mailboxes/Inbox;->date()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_2

    invoke-static {v4, v5}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object v4, v7

    :goto_2
    invoke-virtual {v2}, Lcom/microblink/internal/services/mailboxes/Inbox;->time()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3

    invoke-static {v6, v5}, Lcom/microblink/TypeValueUtils;->valueOf(Ljava/lang/String;F)Lcom/microblink/StringType;

    move-result-object v7

    :cond_3
    invoke-static {}, Lcom/microblink/ScanResults;->newBuilder()Lcom/microblink/ScanResults$Builder;

    move-result-object v5

    invoke-virtual {v3}, Lcom/microblink/Receipt;->retailer()Lcom/microblink/Retailer;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/microblink/ScanResults$Builder;->retailerId(Lcom/microblink/Retailer;)Lcom/microblink/ScanResults$Builder;

    move-result-object v5

    new-instance v6, Lcom/microblink/internal/OcrToProductMapper;

    invoke-direct {v6}, Lcom/microblink/internal/OcrToProductMapper;-><init>()V

    invoke-virtual {v3}, Lcom/microblink/Receipt;->ocrProducts()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v6, v8}, Lcom/microblink/internal/OcrToProductMapper;->transform(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/microblink/ScanResults$Builder;->products(Ljava/util/List;)Lcom/microblink/ScanResults$Builder;

    move-result-object v5

    invoke-virtual {v2}, Lcom/microblink/internal/services/mailboxes/Inbox;->shippingAddress()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/microblink/ScanResults$Builder;->eReceiptShippingAddress(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;

    move-result-object v5

    invoke-virtual {v2}, Lcom/microblink/internal/services/mailboxes/Inbox;->html()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/microblink/ScanResults$Builder;->eReceiptRawHtml(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;

    move-result-object v5

    iget-object v6, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable;->signInAccount:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    invoke-virtual {v6}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getEmail()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/microblink/ScanResults$Builder;->eReceiptEmailId(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;

    move-result-object v5

    const-string v6, "gmail"

    invoke-virtual {v5, v6}, Lcom/microblink/ScanResults$Builder;->eReceiptEmailProvider(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;

    move-result-object v5

    invoke-virtual {v2}, Lcom/microblink/internal/services/mailboxes/Inbox;->shippingAddress()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/microblink/ScanResults$Builder;->eReceiptShippingAddress(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;

    move-result-object v5

    invoke-virtual {v2}, Lcom/microblink/internal/services/mailboxes/Inbox;->orderNumber()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/microblink/ScanResults$Builder;->eReceiptOrderNumber(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;

    move-result-object v5

    invoke-virtual {v3}, Lcom/microblink/Receipt;->total()Lcom/microblink/FloatType;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/microblink/ScanResults$Builder;->total(Lcom/microblink/FloatType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v5

    invoke-virtual {v3}, Lcom/microblink/Receipt;->subTotal()Lcom/microblink/FloatType;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/microblink/ScanResults$Builder;->subTotal(Lcom/microblink/FloatType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v5

    invoke-virtual {v3}, Lcom/microblink/Receipt;->taxes()Lcom/microblink/FloatType;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/microblink/ScanResults$Builder;->taxes(Lcom/microblink/FloatType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/microblink/ScanResults$Builder;->receiptDate(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v4, v7}, Lcom/microblink/ScanResults$Builder;->receiptTime(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->storeNumber()Lcom/microblink/StringType;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->storeNumber(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->merchantName()Lcom/microblink/StringType;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->merchantName(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->storeAddress()Lcom/microblink/StringType;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->storeAddress(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->storeCity()Lcom/microblink/StringType;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->storeCity(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->storeState()Lcom/microblink/StringType;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->storeState(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->storeZip()Lcom/microblink/StringType;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->storeZip(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->storePhone()Lcom/microblink/StringType;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->storePhone(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->cashierId()Lcom/microblink/StringType;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->cashierId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->transactionId()Lcom/microblink/StringType;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->transactionId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->register()Lcom/microblink/StringType;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->registerId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->paymentMethods()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->paymentMethods(Ljava/util/List;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->receiptId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->blinkReceiptId(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->taxId()Lcom/microblink/StringType;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->taxId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->mallName()Lcom/microblink/StringType;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->mallName(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->ocrConfidence()F

    move-result v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->ocrConfidence(F)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->merchantSource()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->merchantSource(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->foundTopEdge()Z

    move-result v5

    invoke-virtual {v4, v5}, Lcom/microblink/ScanResults$Builder;->foundTopEdge(Z)Lcom/microblink/ScanResults$Builder;

    move-result-object v4

    invoke-virtual {v3}, Lcom/microblink/Receipt;->foundBottomEdge()Z

    move-result v3

    invoke-virtual {v4, v3}, Lcom/microblink/ScanResults$Builder;->foundBottomEdge(Z)Lcom/microblink/ScanResults$Builder;

    move-result-object v3

    invoke-virtual {v3}, Lcom/microblink/ScanResults$Builder;->build()Lcom/microblink/ScanResults;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable;->service:Lcom/microblink/internal/services/mailboxes/InboxService;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable$2;

    invoke-direct {v5, p0}, Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable$2;-><init>(Lcom/microblink/internal/mailboxes/gmail/GmailInboxScanResultsCallable;)V

    invoke-interface {v3, v4, v2, v5}, Lcom/microblink/internal/services/mailboxes/InboxService;->receipt(Ljava/lang/String;Lcom/microblink/internal/services/mailboxes/Inbox;Lcom/microblink/OnCompleteListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception p1

    const-string v2, "GmailInboxScanResultsCallable"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    return-object v1
.end method
