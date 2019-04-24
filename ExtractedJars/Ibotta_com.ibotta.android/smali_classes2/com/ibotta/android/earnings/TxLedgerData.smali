.class public Lcom/ibotta/android/earnings/TxLedgerData;
.super Ljava/lang/Object;
.source "TxLedgerData.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/earnings/TxLedgerData$TxState;
    }
.end annotation


# instance fields
.field private alternateText:Ljava/lang/String;

.field private bonuses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/bonus/Bonus;",
            ">;"
        }
    .end annotation
.end field

.field private iconUrl:Ljava/lang/String;

.field private ledgerTitle:Ljava/lang/String;

.field private offerEarnings:Ljava/lang/Float;

.field private offerMatches:Ljava/lang/Integer;

.field private pendingOffers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Offer;",
            ">;"
        }
    .end annotation
.end field

.field private pendingPeriod:Ljava/lang/String;

.field private processing:Ljava/lang/Boolean;

.field private processingStateMessage:Ljava/lang/String;

.field private purchaseTime:Ljava/util/Date;

.field private retailerName:Ljava/lang/String;

.field private status:Ljava/lang/String;

.field private submissionTime:Ljava/util/Date;

.field private totalEarnings:Ljava/lang/Float;

.field private totalPendingEarnings:Ljava/lang/Float;

.field private txState:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

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

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    sget-object v0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->PENDING:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    iput-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->txState:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    return-void
.end method

.method public static fromButtonTx(Lcom/ibotta/api/model/buttonsdk/ButtonTx;Ljava/lang/String;)Lcom/ibotta/android/earnings/TxLedgerData;
    .locals 2

    .line 47
    new-instance v0, Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-direct {v0}, Lcom/ibotta/android/earnings/TxLedgerData;-><init>()V

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setStatus(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getPurchaseTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setPurchaseTime(Ljava/util/Date;)V

    .line 51
    invoke-virtual {p0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getPendingPeriod()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setPendingPeriod(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getRebateMatches()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setOfferMatches(Ljava/lang/Integer;)V

    .line 53
    invoke-virtual {p0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getRebateEarnings()Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setOfferEarnings(Ljava/lang/Float;)V

    .line 54
    invoke-virtual {p0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getTotalPendingEarnings()Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setTotalPendingEarnings(Ljava/lang/Float;)V

    .line 55
    invoke-virtual {p0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getAlternateText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setAlternateText(Ljava/lang/String;)V

    .line 56
    invoke-virtual {v0, p1}, Lcom/ibotta/android/earnings/TxLedgerData;->setRetailerName(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 57
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/earnings/TxLedgerData;->setProcessing(Ljava/lang/Boolean;)V

    .line 59
    invoke-virtual {p0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getStatusEnum()Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    move-result-object p1

    sget-object v1, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->COMPLETE:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    if-ne p1, v1, :cond_0

    .line 60
    sget-object p0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->COMPLETE:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/earnings/TxLedgerData;->setTxState(Lcom/ibotta/android/earnings/TxLedgerData$TxState;)V

    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getStatusEnum()Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    move-result-object p1

    sget-object v1, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->ERROR:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    if-ne p1, v1, :cond_1

    .line 62
    sget-object p0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->ERROR:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/earnings/TxLedgerData;->setTxState(Lcom/ibotta/android/earnings/TxLedgerData$TxState;)V

    goto :goto_0

    .line 63
    :cond_1
    invoke-virtual {p0}, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->getStatusEnum()Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    move-result-object p0

    sget-object p1, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->PENDING:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    if-ne p0, p1, :cond_2

    .line 64
    sget-object p0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->PENDING:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/earnings/TxLedgerData;->setTxState(Lcom/ibotta/android/earnings/TxLedgerData$TxState;)V

    goto :goto_0

    .line 66
    :cond_2
    sget-object p0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->UNKNOWN:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-virtual {v0, p0}, Lcom/ibotta/android/earnings/TxLedgerData;->setTxState(Lcom/ibotta/android/earnings/TxLedgerData$TxState;)V

    :goto_0
    return-object v0
.end method

.method public static fromEarning(Lcom/ibotta/api/model/earnings/Earning;)Lcom/ibotta/android/earnings/TxLedgerData;
    .locals 3

    .line 121
    new-instance v0, Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-direct {v0}, Lcom/ibotta/android/earnings/TxLedgerData;-><init>()V

    .line 123
    invoke-virtual {p0}, Lcom/ibotta/api/model/earnings/Earning;->getProcessingState()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setStatus(Ljava/lang/String;)V

    .line 124
    invoke-virtual {p0}, Lcom/ibotta/api/model/earnings/Earning;->getSubmittedTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setPurchaseTime(Ljava/util/Date;)V

    .line 125
    invoke-virtual {p0}, Lcom/ibotta/api/model/earnings/Earning;->getEarnedAmount()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setTotalEarnings(Ljava/lang/Float;)V

    .line 126
    invoke-virtual {p0}, Lcom/ibotta/api/model/earnings/Earning;->getSubmittedTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setSubmissionTime(Ljava/util/Date;)V

    .line 127
    invoke-virtual {p0}, Lcom/ibotta/api/model/earnings/Earning;->getAlternateText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setAlternateText(Ljava/lang/String;)V

    .line 128
    invoke-virtual {p0}, Lcom/ibotta/api/model/earnings/Earning;->isProcessing()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setProcessing(Ljava/lang/Boolean;)V

    .line 130
    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$1;->$SwitchMap$com$ibotta$api$model$earnings$Earning$ProcessingState:[I

    invoke-virtual {p0}, Lcom/ibotta/api/model/earnings/Earning;->getEarningProcessingStateEnum()Lcom/ibotta/api/model/earnings/Earning$ProcessingState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/earnings/Earning$ProcessingState;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 146
    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->UNKNOWN:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setTxState(Lcom/ibotta/android/earnings/TxLedgerData$TxState;)V

    goto :goto_0

    .line 142
    :pswitch_0
    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->PENDING:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setTxState(Lcom/ibotta/android/earnings/TxLedgerData$TxState;)V

    goto :goto_0

    .line 138
    :pswitch_1
    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->CANCELED:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setTxState(Lcom/ibotta/android/earnings/TxLedgerData$TxState;)V

    goto :goto_0

    .line 135
    :pswitch_2
    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->ERROR:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setTxState(Lcom/ibotta/android/earnings/TxLedgerData$TxState;)V

    goto :goto_0

    .line 132
    :pswitch_3
    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->COMPLETE:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setTxState(Lcom/ibotta/android/earnings/TxLedgerData$TxState;)V

    .line 149
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/api/model/earnings/Earning;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setLedgerTitle(Ljava/lang/String;)V

    .line 150
    invoke-virtual {p0}, Lcom/ibotta/api/model/earnings/Earning;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setIconUrl(Ljava/lang/String;)V

    .line 151
    invoke-virtual {p0}, Lcom/ibotta/api/model/earnings/Earning;->getTitle()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/earnings/TxLedgerData;->setRetailerName(Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static fromReceipt(Lcom/ibotta/api/model/receipt/Receipt;)Lcom/ibotta/android/earnings/TxLedgerData;
    .locals 3

    .line 73
    new-instance v0, Lcom/ibotta/android/earnings/TxLedgerData;

    invoke-direct {v0}, Lcom/ibotta/android/earnings/TxLedgerData;-><init>()V

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt;->getProcessingState()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setStatus(Ljava/lang/String;)V

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt;->getPurchaseTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setPurchaseTime(Ljava/util/Date;)V

    .line 77
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt;->getRebateMatches()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setOfferMatches(Ljava/lang/Integer;)V

    .line 78
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt;->getRebateEarnings()Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setOfferEarnings(Ljava/lang/Float;)V

    .line 79
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt;->getRebateEarnings()Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setTotalEarnings(Ljava/lang/Float;)V

    .line 80
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt;->getPendingAmount()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setTotalPendingEarnings(Ljava/lang/Float;)V

    .line 81
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt;->getPendingOffers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setPendingOffers(Ljava/util/List;)V

    .line 82
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt;->getVerifiedOffers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setVerifiedOffers(Ljava/util/List;)V

    .line 83
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt;->getBonuses()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setBonuses(Ljava/util/List;)V

    .line 84
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt;->getCreatedAt()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setSubmissionTime(Ljava/util/Date;)V

    .line 85
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt;->getAlternateText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setAlternateText(Ljava/lang/String;)V

    .line 86
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setProcessingStateMessage(Ljava/lang/String;)V

    .line 87
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt;->isProcessing()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setProcessing(Ljava/lang/Boolean;)V

    .line 89
    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$1;->$SwitchMap$com$ibotta$api$model$receipt$Receipt$ProcessingState:[I

    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt;->getProcessingStateEnum()Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/receipt/Receipt$ProcessingState;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 104
    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->UNKNOWN:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setTxState(Lcom/ibotta/android/earnings/TxLedgerData$TxState;)V

    goto :goto_0

    .line 100
    :pswitch_0
    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->PENDING:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setTxState(Lcom/ibotta/android/earnings/TxLedgerData$TxState;)V

    goto :goto_0

    .line 97
    :pswitch_1
    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->CANCELED:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setTxState(Lcom/ibotta/android/earnings/TxLedgerData$TxState;)V

    goto :goto_0

    .line 94
    :pswitch_2
    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->ERROR:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setTxState(Lcom/ibotta/android/earnings/TxLedgerData$TxState;)V

    goto :goto_0

    .line 91
    :pswitch_3
    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->COMPLETE:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setTxState(Lcom/ibotta/android/earnings/TxLedgerData$TxState;)V

    .line 107
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/api/model/receipt/Receipt;->getRetailerData()Lcom/ibotta/api/model/retailer/Retailer;

    move-result-object p0

    if-nez p0, :cond_0

    return-object v0

    .line 112
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/Retailer;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setLedgerTitle(Ljava/lang/String;)V

    .line 113
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/Retailer;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setIconUrl(Ljava/lang/String;)V

    .line 114
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/Retailer;->getCreditPendingPeriod()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/earnings/TxLedgerData;->setPendingPeriod(Ljava/lang/String;)V

    .line 115
    invoke-virtual {p0}, Lcom/ibotta/api/model/retailer/Retailer;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/ibotta/android/earnings/TxLedgerData;->setRetailerName(Ljava/lang/String;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public getAlternateText()Ljava/lang/String;
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->alternateText:Ljava/lang/String;

    return-object v0
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

    .line 285
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->bonuses:Ljava/util/List;

    return-object v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLedgerTitle()Ljava/lang/String;
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->ledgerTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getOfferEarnings()Ljava/lang/Float;
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->offerEarnings:Ljava/lang/Float;

    return-object v0
.end method

.method public getOfferMatches()Ljava/lang/Integer;
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->offerMatches:Ljava/lang/Integer;

    return-object v0
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

    .line 269
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->pendingOffers:Ljava/util/List;

    return-object v0
.end method

.method public getPendingPeriod()Ljava/lang/String;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->pendingPeriod:Ljava/lang/String;

    return-object v0
.end method

.method public getProcessingStateMessage()Ljava/lang/String;
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->processingStateMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getPurchaseTime()Ljava/util/Date;
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->purchaseTime:Ljava/util/Date;

    return-object v0
.end method

.method public getRetailerName()Ljava/lang/String;
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->retailerName:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getSubmissionTime()Ljava/util/Date;
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->submissionTime:Ljava/util/Date;

    return-object v0
.end method

.method public getTotalEarnings()Ljava/lang/Float;
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->totalEarnings:Ljava/lang/Float;

    return-object v0
.end method

.method public getTotalPendingEarnings()Ljava/lang/Float;
    .locals 1

    .line 229
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->totalPendingEarnings:Ljava/lang/Float;

    return-object v0
.end method

.method public getTxState()Lcom/ibotta/android/earnings/TxLedgerData$TxState;
    .locals 1

    .line 293
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->txState:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

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

    .line 277
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->verifiedOffers:Ljava/util/List;

    return-object v0
.end method

.method public isProcessing()Ljava/lang/Boolean;
    .locals 1

    .line 261
    iget-object v0, p0, Lcom/ibotta/android/earnings/TxLedgerData;->processing:Ljava/lang/Boolean;

    return-object v0
.end method

.method public setAlternateText(Ljava/lang/String;)V
    .locals 0

    .line 241
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->alternateText:Ljava/lang/String;

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

    .line 289
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->bonuses:Ljava/util/List;

    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->iconUrl:Ljava/lang/String;

    return-void
.end method

.method public setLedgerTitle(Ljava/lang/String;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->ledgerTitle:Ljava/lang/String;

    return-void
.end method

.method public setOfferEarnings(Ljava/lang/Float;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->offerEarnings:Ljava/lang/Float;

    return-void
.end method

.method public setOfferMatches(Ljava/lang/Integer;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->offerMatches:Ljava/lang/Integer;

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

    .line 273
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->pendingOffers:Ljava/util/List;

    return-void
.end method

.method public setPendingPeriod(Ljava/lang/String;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->pendingPeriod:Ljava/lang/String;

    return-void
.end method

.method public setProcessing(Ljava/lang/Boolean;)V
    .locals 0

    .line 265
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->processing:Ljava/lang/Boolean;

    return-void
.end method

.method public setProcessingStateMessage(Ljava/lang/String;)V
    .locals 0

    .line 257
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->processingStateMessage:Ljava/lang/String;

    return-void
.end method

.method public setPurchaseTime(Ljava/util/Date;)V
    .locals 0

    .line 185
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->purchaseTime:Ljava/util/Date;

    return-void
.end method

.method public setRetailerName(Ljava/lang/String;)V
    .locals 0

    .line 249
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->retailerName:Ljava/lang/String;

    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 177
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->status:Ljava/lang/String;

    return-void
.end method

.method public setSubmissionTime(Ljava/util/Date;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->submissionTime:Ljava/util/Date;

    return-void
.end method

.method public setTotalEarnings(Ljava/lang/Float;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->totalEarnings:Ljava/lang/Float;

    return-void
.end method

.method public setTotalPendingEarnings(Ljava/lang/Float;)V
    .locals 0

    .line 233
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->totalPendingEarnings:Ljava/lang/Float;

    return-void
.end method

.method public setTxState(Lcom/ibotta/android/earnings/TxLedgerData$TxState;)V
    .locals 0

    .line 297
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->txState:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

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

    .line 281
    iput-object p1, p0, Lcom/ibotta/android/earnings/TxLedgerData;->verifiedOffers:Ljava/util/List;

    return-void
.end method
