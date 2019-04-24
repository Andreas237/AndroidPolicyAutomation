.class public Lcom/ibotta/api/model/buttonsdk/ButtonTx;
.super Ljava/lang/Object;
.source "ButtonTx.java"


# instance fields
.field private alternateText:Ljava/lang/String;

.field private bonusEarnings:Ljava/lang/Float;

.field private creditPendingDays:Ljava/lang/String;

.field private estimatedEarningsString:Ljava/lang/String;

.field private launchId:Ljava/lang/String;

.field private pendingPeriod:Ljava/lang/String;

.field private purchaseTime:Ljava/util/Date;

.field private rebateEarnings:Ljava/lang/Float;

.field private rebateMatches:Ljava/lang/Integer;

.field private status:Ljava/lang/String;

.field private totalPendingEarnings:Ljava/lang/Float;

.field private value:Ljava/lang/Float;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    sget-object v0, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->UNKNOWN:Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    invoke-virtual {v0}, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->status:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAlternateText()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->alternateText:Ljava/lang/String;

    return-object v0
.end method

.method public getBonusEarnings()Ljava/lang/Float;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->bonusEarnings:Ljava/lang/Float;

    return-object v0
.end method

.method public getCreditPendingDays()Ljava/lang/String;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->creditPendingDays:Ljava/lang/String;

    return-object v0
.end method

.method public getEstimatedEarningsString()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->estimatedEarningsString:Ljava/lang/String;

    return-object v0
.end method

.method public getLaunchId()Ljava/lang/String;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->launchId:Ljava/lang/String;

    return-object v0
.end method

.method public getPendingPeriod()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->pendingPeriod:Ljava/lang/String;

    return-object v0
.end method

.method public getPurchaseTime()Ljava/util/Date;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->purchaseTime:Ljava/util/Date;

    return-object v0
.end method

.method public getRebateEarnings()Ljava/lang/Float;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->rebateEarnings:Ljava/lang/Float;

    return-object v0
.end method

.method public getRebateMatches()Ljava/lang/Integer;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->rebateMatches:Ljava/lang/Integer;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getStatusEnum()Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->status:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/buttonsdk/ButtonTxStatus;

    move-result-object v0

    return-object v0
.end method

.method public getTotalPendingEarnings()Ljava/lang/Float;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->totalPendingEarnings:Ljava/lang/Float;

    return-object v0
.end method

.method public getValue()Ljava/lang/Float;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->value:Ljava/lang/Float;

    return-object v0
.end method

.method public setAlternateText(Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->alternateText:Ljava/lang/String;

    return-void
.end method

.method public setBonusEarnings(Ljava/lang/Float;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->bonusEarnings:Ljava/lang/Float;

    return-void
.end method

.method public setCreditPendingDays(Ljava/lang/String;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->creditPendingDays:Ljava/lang/String;

    return-void
.end method

.method public setEstimatedEarningsString(Ljava/lang/String;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->estimatedEarningsString:Ljava/lang/String;

    return-void
.end method

.method public setLaunchId(Ljava/lang/String;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->launchId:Ljava/lang/String;

    return-void
.end method

.method public setPendingPeriod(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->pendingPeriod:Ljava/lang/String;

    return-void
.end method

.method public setPurchaseTime(Ljava/util/Date;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->purchaseTime:Ljava/util/Date;

    return-void
.end method

.method public setRebateEarnings(Ljava/lang/Float;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->rebateEarnings:Ljava/lang/Float;

    return-void
.end method

.method public setRebateMatches(Ljava/lang/Integer;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->rebateMatches:Ljava/lang/Integer;

    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->status:Ljava/lang/String;

    return-void
.end method

.method public setTotalPendingEarnings(Ljava/lang/Float;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->totalPendingEarnings:Ljava/lang/Float;

    return-void
.end method

.method public setValue(Ljava/lang/Float;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/api/model/buttonsdk/ButtonTx;->value:Ljava/lang/Float;

    return-void
.end method
