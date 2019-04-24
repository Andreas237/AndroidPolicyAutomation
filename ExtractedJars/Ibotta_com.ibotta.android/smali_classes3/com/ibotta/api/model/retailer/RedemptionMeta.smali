.class public Lcom/ibotta/api/model/retailer/RedemptionMeta;
.super Ljava/lang/Object;
.source "RedemptionMeta.java"


# instance fields
.field private additionalRedemptionInstructions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private buttonDepartingUserMessage:Ljava/lang/String;

.field private buttonPendingActivityMessage:Ljava/lang/String;

.field private buttonReturningUserMessage:Ljava/lang/String;

.field private maxReceiptAgeDays:I

.field private onlinePostDesc:Ljava/lang/String;

.field private onlinePostTitle:Ljava/lang/String;

.field private receiptName:Ljava/lang/String;

.field private redeemString:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->additionalRedemptionInstructions:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getAdditionalRedemptionInstructions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->additionalRedemptionInstructions:Ljava/util/List;

    return-object v0
.end method

.method public getButtonDepartingUserMessage()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->buttonDepartingUserMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getButtonPendingActivityMessage()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->buttonPendingActivityMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getButtonReturningUserMessage()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->buttonReturningUserMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getMaxReceiptAgeDays()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->maxReceiptAgeDays:I

    return v0
.end method

.method public getOnlinePostDesc()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->onlinePostDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getOnlinePostTitle()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->onlinePostTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getReceiptName()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->receiptName:Ljava/lang/String;

    return-object v0
.end method

.method public getRedeemString()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->redeemString:Ljava/lang/String;

    return-object v0
.end method

.method public setAdditionalRedemptionInstructions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 84
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->additionalRedemptionInstructions:Ljava/util/List;

    return-void
.end method

.method public setButtonDepartingUserMessage(Ljava/lang/String;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->buttonDepartingUserMessage:Ljava/lang/String;

    return-void
.end method

.method public setButtonPendingActivityMessage(Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->buttonPendingActivityMessage:Ljava/lang/String;

    return-void
.end method

.method public setButtonReturningUserMessage(Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->buttonReturningUserMessage:Ljava/lang/String;

    return-void
.end method

.method public setMaxReceiptAgeDays(I)V
    .locals 0

    .line 44
    iput p1, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->maxReceiptAgeDays:I

    return-void
.end method

.method public setOnlinePostDesc(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->onlinePostDesc:Ljava/lang/String;

    return-void
.end method

.method public setOnlinePostTitle(Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->onlinePostTitle:Ljava/lang/String;

    return-void
.end method

.method public setReceiptName(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->receiptName:Ljava/lang/String;

    return-void
.end method

.method public setRedeemString(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/RedemptionMeta;->redeemString:Ljava/lang/String;

    return-void
.end method
