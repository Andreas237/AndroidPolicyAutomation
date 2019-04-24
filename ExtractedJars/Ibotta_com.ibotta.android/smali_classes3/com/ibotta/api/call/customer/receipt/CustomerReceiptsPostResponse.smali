.class public Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "CustomerReceiptsPostResponse.java"


# instance fields
.field private id:I

.field private processingState:Ljava/lang/String;

.field private receiptImages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/receipt/ReceiptImage;",
            ">;"
        }
    .end annotation
.end field

.field private receiptScanContent:Ljava/lang/String;

.field private retailerId:I

.field private uploadMessage:Lcom/ibotta/api/model/receipt/UploadMessage;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;->receiptImages:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getId()I
    .locals 1

    .line 19
    iget v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;->id:I

    return v0
.end method

.method public getProcessingState()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;->processingState:Ljava/lang/String;

    return-object v0
.end method

.method public getReceiptImages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/receipt/ReceiptImage;",
            ">;"
        }
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;->receiptImages:Ljava/util/List;

    return-object v0
.end method

.method public getReceiptScanContent()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;->receiptScanContent:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;->retailerId:I

    return v0
.end method

.method public getUploadMessage()Lcom/ibotta/api/model/receipt/UploadMessage;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;->uploadMessage:Lcom/ibotta/api/model/receipt/UploadMessage;

    return-object v0
.end method

.method public setId(I)V
    .locals 0

    .line 23
    iput p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;->id:I

    return-void
.end method

.method public setProcessingState(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;->processingState:Ljava/lang/String;

    return-void
.end method

.method public setReceiptImages(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/receipt/ReceiptImage;",
            ">;)V"
        }
    .end annotation

    .line 63
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;->receiptImages:Ljava/util/List;

    return-void
.end method

.method public setReceiptScanContent(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;->receiptScanContent:Ljava/lang/String;

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 31
    iput p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;->retailerId:I

    return-void
.end method

.method public setUploadMessage(Lcom/ibotta/api/model/receipt/UploadMessage;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;->uploadMessage:Lcom/ibotta/api/model/receipt/UploadMessage;

    return-void
.end method
