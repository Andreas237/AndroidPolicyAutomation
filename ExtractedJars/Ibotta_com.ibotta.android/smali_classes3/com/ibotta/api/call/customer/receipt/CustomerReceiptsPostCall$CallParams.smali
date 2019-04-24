.class public Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;
.super Ljava/lang/Object;
.source "CustomerReceiptsPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private customerId:I

.field private offerDataList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;",
            ">;"
        }
    .end annotation
.end field

.field private receiptData:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;

.field private receiptScanContent:Ljava/lang/String;

.field private receipts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field private retailerId:I

.field private submissionId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 145
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->receipts:Ljava/util/List;

    .line 148
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->offerDataList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addReceipt(Ljava/io/File;)V
    .locals 1

    .line 175
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->receipts:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getCustomerId()I
    .locals 1

    .line 151
    iget v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->customerId:I

    return v0
.end method

.method public getOfferDataList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;",
            ">;"
        }
    .end annotation

    .line 203
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->offerDataList:Ljava/util/List;

    return-object v0
.end method

.method public getReceiptData()Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->receiptData:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;

    return-object v0
.end method

.method public getReceiptScanContent()Ljava/lang/String;
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->receiptScanContent:Ljava/lang/String;

    return-object v0
.end method

.method public getReceipts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .line 179
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->receipts:Ljava/util/List;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 167
    iget v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->retailerId:I

    return v0
.end method

.method public getSubmissionId()Ljava/lang/String;
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->submissionId:Ljava/lang/String;

    return-object v0
.end method

.method public setCustomerId(I)V
    .locals 0

    .line 155
    iput p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->customerId:I

    return-void
.end method

.method public setOfferDataList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;",
            ">;)V"
        }
    .end annotation

    .line 207
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->offerDataList:Ljava/util/List;

    return-void
.end method

.method public setReceiptData(Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->receiptData:Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;

    return-void
.end method

.method public setReceiptScanContent(Ljava/lang/String;)V
    .locals 0

    .line 191
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->receiptScanContent:Ljava/lang/String;

    return-void
.end method

.method public setReceipts(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    .line 183
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->receipts:Ljava/util/List;

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 171
    iput p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->retailerId:I

    return-void
.end method

.method public setSubmissionId(Ljava/lang/String;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->submissionId:Ljava/lang/String;

    return-void
.end method
