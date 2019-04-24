.class public final Lcom/microblink/ScanResults;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/ScanResults$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/microblink/ScanResults;",
            ">;"
        }
    .end annotation
.end field


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
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/microblink/ScanResults$1;

    invoke-direct {v0}, Lcom/microblink/ScanResults$1;-><init>()V

    sput-object v0, Lcom/microblink/ScanResults;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->receiptDate:Lcom/microblink/StringType;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->receiptTime:Lcom/microblink/StringType;

    const-class v0, Lcom/microblink/Retailer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/Retailer;

    iput-object v0, p0, Lcom/microblink/ScanResults;->retailerId:Lcom/microblink/Retailer;

    sget-object v0, Lcom/microblink/Product;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->products:Ljava/util/List;

    sget-object v0, Lcom/microblink/Coupon;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->coupons:Ljava/util/List;

    const-class v0, Lcom/microblink/FloatType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/FloatType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->total:Lcom/microblink/FloatType;

    const-class v0, Lcom/microblink/FloatType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/FloatType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->subtotal:Lcom/microblink/FloatType;

    const-class v0, Lcom/microblink/FloatType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/FloatType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->taxes:Lcom/microblink/FloatType;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->storeNumber:Lcom/microblink/StringType;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->merchantName:Lcom/microblink/StringType;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->storeAddress:Lcom/microblink/StringType;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->storeCity:Lcom/microblink/StringType;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->blinkReceiptId:Ljava/lang/String;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->storeState:Lcom/microblink/StringType;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->storeZip:Lcom/microblink/StringType;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->storePhone:Lcom/microblink/StringType;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->cashierId:Lcom/microblink/StringType;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->transactionId:Lcom/microblink/StringType;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->registerId:Lcom/microblink/StringType;

    sget-object v0, Lcom/microblink/PaymentMethod;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->paymentMethods:Ljava/util/List;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->taxId:Lcom/microblink/StringType;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->mallName:Lcom/microblink/StringType;

    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/microblink/ScanResults;->ocrConfidence:F

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->merchantSource:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/microblink/ScanResults;->foundTopEdge:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/microblink/ScanResults;->foundBottomEdge:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->eReceiptOrderNumber:Ljava/lang/String;

    sget-object v0, Lcom/microblink/Shipment;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->shipments:Ljava/util/List;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->last4Digits:Lcom/microblink/StringType;

    const-class v0, Lcom/microblink/StringType;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/StringType;

    iput-object v0, p0, Lcom/microblink/ScanResults;->longTransactionId:Lcom/microblink/StringType;

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    iput-boolean v1, p0, Lcom/microblink/ScanResults;->subtotalMatches:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->eReceiptRawHtml:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->eReceiptShippingAddress:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->eReceiptEmailProvider:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/ScanResults;->eReceiptEmailId:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/microblink/ScanResults$Builder;)V
    .locals 1
    .param p1    # Lcom/microblink/ScanResults$Builder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$000(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->receiptDate:Lcom/microblink/StringType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$100(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->receiptTime:Lcom/microblink/StringType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$200(Lcom/microblink/ScanResults$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->merchantSource:Ljava/lang/String;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$300(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/Retailer;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->retailerId:Lcom/microblink/Retailer;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$400(Lcom/microblink/ScanResults$Builder;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->products:Ljava/util/List;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$500(Lcom/microblink/ScanResults$Builder;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->coupons:Ljava/util/List;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$600(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/FloatType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->total:Lcom/microblink/FloatType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$700(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/FloatType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->subtotal:Lcom/microblink/FloatType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$800(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/FloatType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->taxes:Lcom/microblink/FloatType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$900(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->storeNumber:Lcom/microblink/StringType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$1000(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->merchantName:Lcom/microblink/StringType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$1100(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->storeAddress:Lcom/microblink/StringType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$1200(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->storeCity:Lcom/microblink/StringType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$1300(Lcom/microblink/ScanResults$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->blinkReceiptId:Ljava/lang/String;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$1400(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->storeState:Lcom/microblink/StringType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$1500(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->storeZip:Lcom/microblink/StringType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$1600(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->storePhone:Lcom/microblink/StringType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$1700(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->cashierId:Lcom/microblink/StringType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$1800(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->transactionId:Lcom/microblink/StringType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$1900(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->registerId:Lcom/microblink/StringType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$2000(Lcom/microblink/ScanResults$Builder;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->paymentMethods:Ljava/util/List;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$2100(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->taxId:Lcom/microblink/StringType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$2200(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->mallName:Lcom/microblink/StringType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$2300(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->last4Digits:Lcom/microblink/StringType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$2400(Lcom/microblink/ScanResults$Builder;)F

    move-result v0

    iput v0, p0, Lcom/microblink/ScanResults;->ocrConfidence:F

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$2500(Lcom/microblink/ScanResults$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/microblink/ScanResults;->foundTopEdge:Z

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$2600(Lcom/microblink/ScanResults$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/microblink/ScanResults;->foundBottomEdge:Z

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$2700(Lcom/microblink/ScanResults$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->eReceiptOrderNumber:Ljava/lang/String;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$2800(Lcom/microblink/ScanResults$Builder;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->shipments:Ljava/util/List;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$2900(Lcom/microblink/ScanResults$Builder;)Lcom/microblink/StringType;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->longTransactionId:Lcom/microblink/StringType;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$3000(Lcom/microblink/ScanResults$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/microblink/ScanResults;->subtotalMatches:Z

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$3100(Lcom/microblink/ScanResults$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->eReceiptRawHtml:Ljava/lang/String;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$3200(Lcom/microblink/ScanResults$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->eReceiptShippingAddress:Ljava/lang/String;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$3300(Lcom/microblink/ScanResults$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanResults;->eReceiptEmailProvider:Ljava/lang/String;

    invoke-static {p1}, Lcom/microblink/ScanResults$Builder;->access$3400(Lcom/microblink/ScanResults$Builder;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/ScanResults;->eReceiptEmailId:Ljava/lang/String;

    return-void
.end method

.method public static newBuilder()Lcom/microblink/ScanResults$Builder;
    .locals 1

    new-instance v0, Lcom/microblink/ScanResults$Builder;

    invoke-direct {v0}, Lcom/microblink/ScanResults$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final blinkReceiptId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/ScanResults;->blinkReceiptId:Ljava/lang/String;

    return-object v0
.end method

.method public final cashierId()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->cashierId:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final coupons()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/Coupon;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->coupons:Ljava/util/List;

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final eReceiptEmailId()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->eReceiptEmailId:Ljava/lang/String;

    return-object v0
.end method

.method public final eReceiptEmailProvider()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->eReceiptEmailProvider:Ljava/lang/String;

    return-object v0
.end method

.method public final eReceiptOrderNumber()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->eReceiptOrderNumber:Ljava/lang/String;

    return-object v0
.end method

.method public final eReceiptRawHtml()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->eReceiptRawHtml:Ljava/lang/String;

    return-object v0
.end method

.method public final eReceiptShippingAddress()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->eReceiptShippingAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/microblink/ScanResults;

    iget-object v2, p0, Lcom/microblink/ScanResults;->retailerId:Lcom/microblink/Retailer;

    iget-object v3, p1, Lcom/microblink/ScanResults;->retailerId:Lcom/microblink/Retailer;

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lcom/microblink/ScanResults;->blinkReceiptId:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object p1, p1, Lcom/microblink/ScanResults;->blinkReceiptId:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    iget-object p1, p1, Lcom/microblink/ScanResults;->blinkReceiptId:Ljava/lang/String;

    if-nez p1, :cond_4

    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public final foundBottomEdge()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/ScanResults;->foundBottomEdge:Z

    return v0
.end method

.method public final foundTopEdge()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/ScanResults;->foundTopEdge:Z

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/microblink/ScanResults;->retailerId:Lcom/microblink/Retailer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/Retailer;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/ScanResults;->blinkReceiptId:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final last4cc()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->last4Digits:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final longTransactionId()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->longTransactionId:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final mallName()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->mallName:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final merchantName()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->merchantName:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final merchantSource()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->merchantSource:Ljava/lang/String;

    return-object v0
.end method

.method public final ocrConfidence()F
    .locals 1

    iget v0, p0, Lcom/microblink/ScanResults;->ocrConfidence:F

    return v0
.end method

.method public final paymentMethods()Ljava/util/List;
    .locals 1
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

    iget-object v0, p0, Lcom/microblink/ScanResults;->paymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final products()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->products:Ljava/util/List;

    return-object v0
.end method

.method public final receiptDate()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->receiptDate:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final receiptTime()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->receiptTime:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final registerId()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->registerId:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final retailerId()Lcom/microblink/Retailer;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->retailerId:Lcom/microblink/Retailer;

    return-object v0
.end method

.method public final shipments()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/Shipment;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->shipments:Ljava/util/List;

    return-object v0
.end method

.method public final storeAddress()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->storeAddress:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final storeCity()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->storeCity:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final storeNumber()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->storeNumber:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final storePhone()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->storePhone:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final storeState()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->storeState:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final storeZip()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->storeZip:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final subtotal()Lcom/microblink/FloatType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->subtotal:Lcom/microblink/FloatType;

    return-object v0
.end method

.method public final subtotalMatches()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/ScanResults;->subtotalMatches:Z

    return v0
.end method

.method public final taxId()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->taxId:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final taxes()Lcom/microblink/FloatType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->taxes:Lcom/microblink/FloatType;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ScanResults{receiptDate="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/ScanResults;->receiptDate:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", receiptTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults;->receiptTime:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults;->retailerId:Lcom/microblink/Retailer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", products="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults;->products:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", coupons="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults;->coupons:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", total="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults;->total:Lcom/microblink/FloatType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subtotal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults;->subtotal:Lcom/microblink/FloatType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", taxes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults;->taxes:Lcom/microblink/FloatType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", storeNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults;->storeNumber:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", merchantName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults;->merchantName:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", storeAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults;->storeAddress:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", storeCity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults;->storeCity:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", blinkReceiptId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanResults;->blinkReceiptId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", storeState="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->storeState:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", storeZip="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->storeZip:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", storePhone="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->storePhone:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", cashierId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->cashierId:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", transactionId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->transactionId:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", registerId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->registerId:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", paymentMethods="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->paymentMethods:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", taxId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->taxId:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", mallName="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->mallName:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", last4Digits="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->last4Digits:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", ocrConfidence="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/ScanResults;->ocrConfidence:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ", merchantSource=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->merchantSource:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", foundTopEdge="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/microblink/ScanResults;->foundTopEdge:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", foundBottomEdge="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/microblink/ScanResults;->foundBottomEdge:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", eReceiptOrderNumber=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->eReceiptOrderNumber:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", eReceiptRawHtml=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->eReceiptRawHtml:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", eReceiptShippingAddress=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->eReceiptShippingAddress:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", shipments="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->shipments:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", longTransactionId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->longTransactionId:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", subtotalMatches="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/microblink/ScanResults;->subtotalMatches:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", eReceiptEmailProvider=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->eReceiptEmailProvider:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", eReceiptEmailId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/ScanResults;->eReceiptEmailId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final total()Lcom/microblink/FloatType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->total:Lcom/microblink/FloatType;

    return-object v0
.end method

.method public final transactionId()Lcom/microblink/StringType;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanResults;->transactionId:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/ScanResults;->receiptDate:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->receiptTime:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->retailerId:Lcom/microblink/Retailer;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->products:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->coupons:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->total:Lcom/microblink/FloatType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->subtotal:Lcom/microblink/FloatType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->taxes:Lcom/microblink/FloatType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->storeNumber:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->merchantName:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->storeAddress:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->storeCity:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->blinkReceiptId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->storeState:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->storeZip:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->storePhone:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->cashierId:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->transactionId:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->registerId:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->paymentMethods:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->taxId:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->mallName:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget v0, p0, Lcom/microblink/ScanResults;->ocrConfidence:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->merchantSource:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/microblink/ScanResults;->foundTopEdge:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget-boolean v0, p0, Lcom/microblink/ScanResults;->foundBottomEdge:Z

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->eReceiptOrderNumber:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->shipments:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->last4Digits:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanResults;->longTransactionId:Lcom/microblink/StringType;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-boolean p2, p0, Lcom/microblink/ScanResults;->subtotalMatches:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    iget-object p2, p0, Lcom/microblink/ScanResults;->eReceiptRawHtml:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/microblink/ScanResults;->eReceiptShippingAddress:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/microblink/ScanResults;->eReceiptEmailProvider:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/microblink/ScanResults;->eReceiptEmailId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
