.class public Lcom/ibotta/android/windfall/WindfallResults;
.super Ljava/lang/Object;
.source "WindfallResults.java"


# instance fields
.field private barcode:Ljava/lang/String;

.field private cashierId:Ljava/lang/String;

.field private coupons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/windfall/WindfallCoupon;",
            ">;"
        }
    .end annotation
.end field

.field private products:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/windfall/WindfallProduct;",
            ">;"
        }
    .end annotation
.end field

.field private purchaseDate:Ljava/lang/String;

.field private receiptDate:Ljava/lang/String;

.field private receiptTime:Ljava/lang/String;

.field private registerId:Ljava/lang/String;

.field private retailerId:Ljava/lang/String;

.field private storeAddress:Ljava/lang/String;

.field private storeCity:Ljava/lang/String;

.field private storeName:Ljava/lang/String;

.field private storeNumber:Ljava/lang/String;

.field private storePhone:Ljava/lang/String;

.field private storeState:Ljava/lang/String;

.field private storeZip:Ljava/lang/String;

.field private subtotal:Ljava/lang/String;

.field private taxes:Ljava/lang/String;

.field private total:Ljava/lang/String;

.field private transactionId:Ljava/lang/String;

.field private windfallReceiptId:Ljava/lang/String;

.field private windfallVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->products:Ljava/util/List;

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->coupons:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getBarcode()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->barcode:Ljava/lang/String;

    return-object v0
.end method

.method public getCashierId()Ljava/lang/String;
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->cashierId:Ljava/lang/String;

    return-object v0
.end method

.method public getCoupons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/windfall/WindfallCoupon;",
            ">;"
        }
    .end annotation

    .line 203
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->coupons:Ljava/util/List;

    return-object v0
.end method

.method public getProducts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/windfall/WindfallProduct;",
            ">;"
        }
    .end annotation

    .line 195
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->products:Ljava/util/List;

    return-object v0
.end method

.method public getPurchaseDate()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->purchaseDate:Ljava/lang/String;

    return-object v0
.end method

.method public getReceiptDate()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->receiptDate:Ljava/lang/String;

    return-object v0
.end method

.method public getReceiptTime()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->receiptTime:Ljava/lang/String;

    return-object v0
.end method

.method public getRegisterId()Ljava/lang/String;
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->registerId:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->retailerId:Ljava/lang/String;

    return-object v0
.end method

.method public getStoreAddress()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->storeAddress:Ljava/lang/String;

    return-object v0
.end method

.method public getStoreCity()Ljava/lang/String;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->storeCity:Ljava/lang/String;

    return-object v0
.end method

.method public getStoreName()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->storeName:Ljava/lang/String;

    return-object v0
.end method

.method public getStoreNumber()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->storeNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getStorePhone()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->storePhone:Ljava/lang/String;

    return-object v0
.end method

.method public getStoreState()Ljava/lang/String;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->storeState:Ljava/lang/String;

    return-object v0
.end method

.method public getStoreZip()Ljava/lang/String;
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->storeZip:Ljava/lang/String;

    return-object v0
.end method

.method public getSubtotal()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->subtotal:Ljava/lang/String;

    return-object v0
.end method

.method public getTaxes()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->taxes:Ljava/lang/String;

    return-object v0
.end method

.method public getTotal()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->total:Ljava/lang/String;

    return-object v0
.end method

.method public getTransactionId()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->transactionId:Ljava/lang/String;

    return-object v0
.end method

.method public getWindfallReceiptId()Ljava/lang/String;
    .locals 1

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->windfallReceiptId:Ljava/lang/String;

    return-object v0
.end method

.method public getWindfallVersion()Ljava/lang/String;
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/windfall/WindfallResults;->windfallVersion:Ljava/lang/String;

    return-object v0
.end method

.method public setBarcode(Ljava/lang/String;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->barcode:Ljava/lang/String;

    return-void
.end method

.method public setCashierId(Ljava/lang/String;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->cashierId:Ljava/lang/String;

    return-void
.end method

.method public setCoupons(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/windfall/WindfallCoupon;",
            ">;)V"
        }
    .end annotation

    .line 207
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->coupons:Ljava/util/List;

    return-void
.end method

.method public setProducts(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/windfall/WindfallProduct;",
            ">;)V"
        }
    .end annotation

    .line 199
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->products:Ljava/util/List;

    return-void
.end method

.method public setPurchaseDate(Ljava/lang/String;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->purchaseDate:Ljava/lang/String;

    return-void
.end method

.method public setReceiptDate(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->receiptDate:Ljava/lang/String;

    return-void
.end method

.method public setReceiptTime(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->receiptTime:Ljava/lang/String;

    return-void
.end method

.method public setRegisterId(Ljava/lang/String;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->registerId:Ljava/lang/String;

    return-void
.end method

.method public setRetailerId(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->retailerId:Ljava/lang/String;

    return-void
.end method

.method public setStoreAddress(Ljava/lang/String;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->storeAddress:Ljava/lang/String;

    return-void
.end method

.method public setStoreCity(Ljava/lang/String;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->storeCity:Ljava/lang/String;

    return-void
.end method

.method public setStoreName(Ljava/lang/String;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->storeName:Ljava/lang/String;

    return-void
.end method

.method public setStoreNumber(Ljava/lang/String;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->storeNumber:Ljava/lang/String;

    return-void
.end method

.method public setStorePhone(Ljava/lang/String;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->storePhone:Ljava/lang/String;

    return-void
.end method

.method public setStoreState(Ljava/lang/String;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->storeState:Ljava/lang/String;

    return-void
.end method

.method public setStoreZip(Ljava/lang/String;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->storeZip:Ljava/lang/String;

    return-void
.end method

.method public setSubtotal(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->subtotal:Ljava/lang/String;

    return-void
.end method

.method public setTaxes(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->taxes:Ljava/lang/String;

    return-void
.end method

.method public setTotal(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->total:Ljava/lang/String;

    return-void
.end method

.method public setTransactionId(Ljava/lang/String;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->transactionId:Ljava/lang/String;

    return-void
.end method

.method public setWindfallReceiptId(Ljava/lang/String;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->windfallReceiptId:Ljava/lang/String;

    return-void
.end method

.method public setWindfallVersion(Ljava/lang/String;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lcom/ibotta/android/windfall/WindfallResults;->windfallVersion:Ljava/lang/String;

    return-void
.end method
