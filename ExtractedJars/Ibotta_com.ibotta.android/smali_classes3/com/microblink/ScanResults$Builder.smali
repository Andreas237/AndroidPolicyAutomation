.class public final Lcom/microblink/ScanResults$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/ScanResults;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private blinkReceiptId:Ljava/lang/String;

.field private cashierId:Lcom/microblink/StringType;

.field private coupons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/Coupon;",
            ">;"
        }
    .end annotation
.end field

.field private eReceiptEmailId:Ljava/lang/String;

.field private eReceiptEmailProvider:Ljava/lang/String;

.field private eReceiptOrderNumber:Ljava/lang/String;

.field private eReceiptRawHtml:Ljava/lang/String;

.field private eReceiptShippingAddress:Ljava/lang/String;

.field private foundBottomEdge:Z

.field private foundTopEdge:Z

.field private last4Digits:Lcom/microblink/StringType;

.field private longTransactionId:Lcom/microblink/StringType;

.field private mallName:Lcom/microblink/StringType;

.field private merchantName:Lcom/microblink/StringType;

.field private merchantSource:Ljava/lang/String;

.field private ocrConfidence:F

.field private paymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/PaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private products:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;"
        }
    .end annotation
.end field

.field private receiptDate:Lcom/microblink/StringType;

.field private receiptTime:Lcom/microblink/StringType;

.field private registerId:Lcom/microblink/StringType;

.field private retailerId:Lcom/microblink/Retailer;

.field private shipments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/Shipment;",
            ">;"
        }
    .end annotation
.end field

.field private storeAddress:Lcom/microblink/StringType;

.field private storeCity:Lcom/microblink/StringType;

.field private storeNumber:Lcom/microblink/StringType;

.field private storePhone:Lcom/microblink/StringType;

.field private storeState:Lcom/microblink/StringType;

.field private storeZip:Lcom/microblink/StringType;

.field private subtotal:Lcom/microblink/FloatType;

.field private subtotalMatches:Z

.field private taxId:Lcom/microblink/StringType;

.field private taxes:Lcom/microblink/FloatType;

.field private total:Lcom/microblink/FloatType;

.field private transactionId:Lcom/microblink/StringType;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->receiptDate:Lcom/microblink/StringType;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->receiptTime:Lcom/microblink/StringType;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->merchantName:Lcom/microblink/StringType;

    return-object p0
.end method

.method static synthetic access$1100(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->storeAddress:Lcom/microblink/StringType;

    return-object p0
.end method

.method static synthetic access$1200(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->storeCity:Lcom/microblink/StringType;

    return-object p0
.end method

.method static synthetic access$1300(Lcom/microblink/ScanResults$Builder;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->blinkReceiptId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1400(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->storeState:Lcom/microblink/StringType;

    return-object p0
.end method

.method static synthetic access$1500(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->storeZip:Lcom/microblink/StringType;

    return-object p0
.end method

.method static synthetic access$1600(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->storePhone:Lcom/microblink/StringType;

    return-object p0
.end method

.method static synthetic access$1700(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->cashierId:Lcom/microblink/StringType;

    return-object p0
.end method

.method static synthetic access$1800(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->transactionId:Lcom/microblink/StringType;

    return-object p0
.end method

.method static synthetic access$1900(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->registerId:Lcom/microblink/StringType;

    return-object p0
.end method

.method static synthetic access$200(Lcom/microblink/ScanResults$Builder;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->merchantSource:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$2000(Lcom/microblink/ScanResults$Builder;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->paymentMethods:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$2100(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->taxId:Lcom/microblink/StringType;

    return-object p0
.end method

.method static synthetic access$2200(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->mallName:Lcom/microblink/StringType;

    return-object p0
.end method

.method static synthetic access$2300(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->last4Digits:Lcom/microblink/StringType;

    return-object p0
.end method

.method static synthetic access$2400(Lcom/microblink/ScanResults$Builder;)F
    .locals 0

    iget p0, p0, Lcom/microblink/ScanResults$Builder;->ocrConfidence:F

    return p0
.end method

.method static synthetic access$2500(Lcom/microblink/ScanResults$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/ScanResults$Builder;->foundTopEdge:Z

    return p0
.end method

.method static synthetic access$2600(Lcom/microblink/ScanResults$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/ScanResults$Builder;->foundBottomEdge:Z

    return p0
.end method

.method static synthetic access$2700(Lcom/microblink/ScanResults$Builder;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->eReceiptOrderNumber:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$2800(Lcom/microblink/ScanResults$Builder;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->shipments:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$2900(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->longTransactionId:Lcom/microblink/StringType;

    return-object p0
.end method

.method static synthetic access$300(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/Retailer;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->retailerId:Lcom/microblink/Retailer;

    return-object p0
.end method

.method static synthetic access$3000(Lcom/microblink/ScanResults$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/ScanResults$Builder;->subtotalMatches:Z

    return p0
.end method

.method static synthetic access$3100(Lcom/microblink/ScanResults$Builder;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->eReceiptRawHtml:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$3200(Lcom/microblink/ScanResults$Builder;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->eReceiptShippingAddress:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$3300(Lcom/microblink/ScanResults$Builder;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->eReceiptEmailProvider:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$3400(Lcom/microblink/ScanResults$Builder;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->eReceiptEmailId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$400(Lcom/microblink/ScanResults$Builder;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->products:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$500(Lcom/microblink/ScanResults$Builder;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->coupons:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$600(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/FloatType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->total:Lcom/microblink/FloatType;

    return-object p0
.end method

.method static synthetic access$700(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/FloatType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->subtotal:Lcom/microblink/FloatType;

    return-object p0
.end method

.method static synthetic access$800(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/FloatType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->taxes:Lcom/microblink/FloatType;

    return-object p0
.end method

.method static synthetic access$900(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanResults$Builder;->storeNumber:Lcom/microblink/StringType;

    return-object p0
.end method


# virtual methods
.method public final blinkReceiptId(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->blinkReceiptId:Ljava/lang/String;

    return-object p0
.end method

.method public final build()Lcom/microblink/ScanResults;
    .locals 1

    new-instance v0, Lcom/microblink/ScanResults;

    invoke-direct {v0, p0}, Lcom/microblink/ScanResults;-><init>(Lcom/microblink/ScanResults$Builder;)V

    return-object v0
.end method

.method public final cashierId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->cashierId:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final coupons(Ljava/util/List;)Lcom/microblink/ScanResults$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/Coupon;",
            ">;)",
            "Lcom/microblink/ScanResults$Builder;"
        }
    .end annotation

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->coupons:Ljava/util/List;

    return-object p0
.end method

.method public final eReceiptEmailId(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->eReceiptEmailId:Ljava/lang/String;

    return-object p0
.end method

.method public final eReceiptEmailProvider(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->eReceiptEmailProvider:Ljava/lang/String;

    return-object p0
.end method

.method public final eReceiptOrderNumber(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->eReceiptOrderNumber:Ljava/lang/String;

    return-object p0
.end method

.method public final eReceiptRawHtml(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->eReceiptRawHtml:Ljava/lang/String;

    return-object p0
.end method

.method public final eReceiptShippingAddress(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->eReceiptShippingAddress:Ljava/lang/String;

    return-object p0
.end method

.method public final foundBottomEdge(Z)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/ScanResults$Builder;->foundBottomEdge:Z

    return-object p0
.end method

.method public final foundTopEdge(Z)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/ScanResults$Builder;->foundTopEdge:Z

    return-object p0
.end method

.method public final last4Digits(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->last4Digits:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final longTransactionId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->longTransactionId:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final mallName(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->mallName:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final merchantName(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->merchantName:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final merchantSource(Ljava/lang/String;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->merchantSource:Ljava/lang/String;

    return-object p0
.end method

.method public final ocrConfidence(F)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput p1, p0, Lcom/microblink/ScanResults$Builder;->ocrConfidence:F

    return-object p0
.end method

.method public final paymentMethods(Ljava/util/List;)Lcom/microblink/ScanResults$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/PaymentMethod;",
            ">;)",
            "Lcom/microblink/ScanResults$Builder;"
        }
    .end annotation

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->paymentMethods:Ljava/util/List;

    return-object p0
.end method

.method public final products(Ljava/util/List;)Lcom/microblink/ScanResults$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;)",
            "Lcom/microblink/ScanResults$Builder;"
        }
    .end annotation

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->products:Ljava/util/List;

    return-object p0
.end method

.method public final receiptDate(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->receiptDate:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final receiptTime(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->receiptTime:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final registerId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->registerId:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final retailerId(Lcom/microblink/Retailer;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->retailerId:Lcom/microblink/Retailer;

    return-object p0
.end method

.method public final shipments(Ljava/util/List;)Lcom/microblink/ScanResults$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/Shipment;",
            ">;)",
            "Lcom/microblink/ScanResults$Builder;"
        }
    .end annotation

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->shipments:Ljava/util/List;

    return-object p0
.end method

.method public final storeAddress(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->storeAddress:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final storeCity(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->storeCity:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final storeNumber(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->storeNumber:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final storePhone(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->storePhone:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final storeState(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->storeState:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final storeZip(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->storeZip:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final subTotal(Lcom/microblink/FloatType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->subtotal:Lcom/microblink/FloatType;

    return-object p0
.end method

.method public final subtotalMatches(Z)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/ScanResults$Builder;->subtotalMatches:Z

    return-object p0
.end method

.method public final taxId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->taxId:Lcom/microblink/StringType;

    return-object p0
.end method

.method public final taxes(Lcom/microblink/FloatType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->taxes:Lcom/microblink/FloatType;

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Builder{retailerId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/ScanResults$Builder;->retailerId:Lcom/microblink/Retailer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", products="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults$Builder;->products:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", coupons="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults$Builder;->coupons:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", total="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults$Builder;->total:Lcom/microblink/FloatType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subtotal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults$Builder;->subtotal:Lcom/microblink/FloatType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", taxes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults$Builder;->taxes:Lcom/microblink/FloatType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", storeNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults$Builder;->storeNumber:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", merchantName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults$Builder;->merchantName:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", storeAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults$Builder;->storeAddress:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", storeCity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults$Builder;->storeCity:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", blinkReceiptId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults$Builder;->blinkReceiptId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", storeState="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->storeState:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", storeZip="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->storeZip:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", storePhone="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->storePhone:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", cashierId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->cashierId:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", transactionId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->transactionId:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", registerId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->registerId:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", paymentMethods="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->paymentMethods:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", taxId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->taxId:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", mallName="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->mallName:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", last4Digits="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->last4Digits:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", ocrConfidence="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/ScanResults$Builder;->ocrConfidence:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", merchantSource=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->merchantSource:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", receiptDate="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->receiptDate:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", receiptTime="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->receiptTime:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", foundBottomEdge="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/microblink/ScanResults$Builder;->foundBottomEdge:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", foundTopEdge="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/microblink/ScanResults$Builder;->foundTopEdge:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", eReceiptOrderNumber=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->eReceiptOrderNumber:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", eReceiptRawHtml=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->eReceiptRawHtml:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", eReceiptEmailProvider=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->eReceiptEmailProvider:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", eReceiptShippingAddress=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->eReceiptShippingAddress:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", eReceiptEmailId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults$Builder;->eReceiptEmailId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", shipments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults$Builder;->shipments:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", longTransactionId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults$Builder;->longTransactionId:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subtotalMatches="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/ScanResults$Builder;->subtotalMatches:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final total(Lcom/microblink/FloatType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->total:Lcom/microblink/FloatType;

    return-object p0
.end method

.method public final transactionId(Lcom/microblink/StringType;)Lcom/microblink/ScanResults$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanResults$Builder;->transactionId:Lcom/microblink/StringType;

    return-object p0
.end method
