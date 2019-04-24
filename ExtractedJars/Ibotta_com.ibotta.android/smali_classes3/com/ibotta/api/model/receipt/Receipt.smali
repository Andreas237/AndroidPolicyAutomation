.class public Lcom/ibotta/api/model/receipt/Receipt;
.super Ljava/lang/Object;
.source "Receipt.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;
    }
.end annotation


# instance fields
.field private alternateText:Ljava/lang/String;

.field private bonusEarnings:F

.field private bonuses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/bonus/Bonus;",
            ">;"
        }
    .end annotation
.end field

.field private createdAt:Ljava/util/Date;

.field private estimatedEarningsDate:Ljava/lang/String;

.field private id:I

.field private launchId:Ljava/lang/String;

.field private message:Ljava/lang/String;

.field private pendingAmount:F

.field private pendingOffers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Offer;",
            ">;"
        }
    .end annotation
.end field

.field private processing:Z

.field private processingState:Ljava/lang/String;

.field private purchaseTime:Ljava/util/Date;

.field private rebateEarnings:Ljava/lang/Float;

.field private rebateMatches:Ljava/lang/Integer;

.field private receiptData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;",
            ">;"
        }
    .end annotation
.end field

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

.field private retailerData:Lcom/ibotta/api/model/retailer/Retailer;

.field private retailerId:I

.field private uploadMessage:Lcom/ibotta/api/model/receipt/UploadMessage;

.field private verifiedOffers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Offer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->receiptImages:Ljava/util/List;

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->receiptData:Ljava/util/List;

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->verifiedOffers:Ljava/util/List;

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->pendingOffers:Ljava/util/List;

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->bonuses:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getAlternateText()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->alternateText:Ljava/lang/String;

    return-object v0
.end method

.method public getBonusEarnings()F
    .locals 1

    .line 232
    iget v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->bonusEarnings:F

    return v0
.end method

.method public getBonuses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/bonus/Bonus;",
            ">;"
        }
    .end annotation

    .line 224
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->bonuses:Ljava/util/List;

    return-object v0
.end method

.method public getCreatedAt()Ljava/util/Date;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public getEstimatedEarningsDate()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->estimatedEarningsDate:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 68
    iget v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->id:I

    return v0
.end method

.method public getLaunchId()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->launchId:Ljava/lang/String;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getPendingAmount()F
    .locals 1

    .line 184
    iget v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->pendingAmount:F

    return v0
.end method

.method public getPendingOffers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Offer;",
            ">;"
        }
    .end annotation

    .line 208
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->pendingOffers:Ljava/util/List;

    return-object v0
.end method

.method public getProcessingState()Ljava/lang/String;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->processingState:Ljava/lang/String;

    return-object v0
.end method

.method public getProcessingStateEnum()Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->processingState:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    move-result-object v0

    return-object v0
.end method

.method public getPurchaseTime()Ljava/util/Date;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->purchaseTime:Ljava/util/Date;

    return-object v0
.end method

.method public getRebateEarnings()Ljava/lang/Float;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->rebateEarnings:Ljava/lang/Float;

    return-object v0
.end method

.method public getRebateMatches()Ljava/lang/Integer;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->rebateMatches:Ljava/lang/Integer;

    return-object v0
.end method

.method public getReceiptData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;",
            ">;"
        }
    .end annotation

    .line 192
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->receiptData:Ljava/util/List;

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

    .line 216
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->receiptImages:Ljava/util/List;

    return-object v0
.end method

.method public getReceiptScanContent()Ljava/lang/String;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->receiptScanContent:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerData()Lcom/ibotta/api/model/retailer/Retailer;
    .locals 1

    .line 240
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->retailerData:Lcom/ibotta/api/model/retailer/Retailer;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 84
    iget v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->retailerId:I

    return v0
.end method

.method public getUploadMessage()Lcom/ibotta/api/model/receipt/UploadMessage;
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->uploadMessage:Lcom/ibotta/api/model/receipt/UploadMessage;

    return-object v0
.end method

.method public getVerifiedOffers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Offer;",
            ">;"
        }
    .end annotation

    .line 200
    iget-object v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->verifiedOffers:Ljava/util/List;

    return-object v0
.end method

.method public isProcessing()Z
    .locals 1

    .line 148
    iget-boolean v0, p0, Lcom/ibotta/api/model/receipt/Receipt;->processing:Z

    return v0
.end method

.method public setAlternateText(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->alternateText:Ljava/lang/String;

    return-void
.end method

.method public setBonusEarnings(F)V
    .locals 0

    .line 236
    iput p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->bonusEarnings:F

    return-void
.end method

.method public setBonuses(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/bonus/Bonus;",
            ">;)V"
        }
    .end annotation

    .line 228
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->bonuses:Ljava/util/List;

    return-void
.end method

.method public setCreatedAt(Ljava/util/Date;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->createdAt:Ljava/util/Date;

    return-void
.end method

.method public setEstimatedEarningsDate(Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->estimatedEarningsDate:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 72
    iput p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->id:I

    return-void
.end method

.method public setLaunchId(Ljava/lang/String;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->launchId:Ljava/lang/String;

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->message:Ljava/lang/String;

    return-void
.end method

.method public setPendingAmount(F)V
    .locals 0

    .line 188
    iput p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->pendingAmount:F

    return-void
.end method

.method public setPendingOffers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Offer;",
            ">;)V"
        }
    .end annotation

    .line 212
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->pendingOffers:Ljava/util/List;

    return-void
.end method

.method public setProcessing(Z)V
    .locals 0

    .line 152
    iput-boolean p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->processing:Z

    return-void
.end method

.method public setProcessingState(Ljava/lang/String;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->processingState:Ljava/lang/String;

    return-void
.end method

.method public setPurchaseTime(Ljava/util/Date;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->purchaseTime:Ljava/util/Date;

    return-void
.end method

.method public setRebateEarnings(Ljava/lang/Float;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->rebateEarnings:Ljava/lang/Float;

    return-void
.end method

.method public setRebateMatches(Ljava/lang/Integer;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->rebateMatches:Ljava/lang/Integer;

    return-void
.end method

.method public setReceiptData(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;",
            ">;)V"
        }
    .end annotation

    .line 196
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->receiptData:Ljava/util/List;

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

    .line 220
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->receiptImages:Ljava/util/List;

    return-void
.end method

.method public setReceiptScanContent(Ljava/lang/String;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->receiptScanContent:Ljava/lang/String;

    return-void
.end method

.method public setRetailerData(Lcom/ibotta/api/model/retailer/Retailer;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->retailerData:Lcom/ibotta/api/model/retailer/Retailer;

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 88
    iput p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->retailerId:I

    return-void
.end method

.method public setUploadMessage(Lcom/ibotta/api/model/receipt/UploadMessage;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->uploadMessage:Lcom/ibotta/api/model/receipt/UploadMessage;

    return-void
.end method

.method public setVerifiedOffers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Offer;",
            ">;)V"
        }
    .end annotation

    .line 204
    iput-object p1, p0, Lcom/ibotta/api/model/receipt/Receipt;->verifiedOffers:Ljava/util/List;

    return-void
.end method
