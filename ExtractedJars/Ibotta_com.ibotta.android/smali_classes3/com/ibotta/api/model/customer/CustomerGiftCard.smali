.class public Lcom/ibotta/api/model/customer/CustomerGiftCard;
.super Ljava/lang/Object;
.source "CustomerGiftCard.java"


# annotations
.annotation runtime Lcom/ibotta/api/security/Confidential;
.end annotation


# instance fields
.field private accessCode:Ljava/lang/String;

.field private actionUrl:Ljava/lang/String;

.field private active:Z

.field private balanceLastUpdated:Ljava/util/Date;

.field private balanceUrl:Ljava/lang/String;

.field private cardNumber:Ljava/lang/String;

.field private createdAt:Ljava/util/Date;

.field private currentBalance:F

.field private formattedCurrentBalance:Ljava/lang/String;

.field private formattedInitialBalance:Ljava/lang/String;

.field private giftCard:Lcom/ibotta/api/model/card/GiftCard;

.field private id:I

.field private initialBalance:F

.field private passbookUrl:Ljava/lang/String;

.field private redemptionInstr:Ljava/lang/String;

.field private status:Ljava/lang/String;

.field private template:Lcom/ibotta/api/model/card/GiftCard$Template;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAccessCode()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->accessCode:Ljava/lang/String;

    return-object v0
.end method

.method public getActionUrl()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->actionUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getBalanceLastUpdated()Ljava/util/Date;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->balanceLastUpdated:Ljava/util/Date;

    return-object v0
.end method

.method public getBalanceUrl()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->balanceUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getCardNumber()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->cardNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getCreatedAt()Ljava/util/Date;
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public getCurrentBalance()F
    .locals 1

    .line 50
    iget v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->currentBalance:F

    return v0
.end method

.method public getFormattedCurrentBalance()Ljava/lang/String;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->formattedCurrentBalance:Ljava/lang/String;

    return-object v0
.end method

.method public getFormattedInitialBalance()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->formattedInitialBalance:Ljava/lang/String;

    return-object v0
.end method

.method public getGiftCard()Lcom/ibotta/api/model/card/GiftCard;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->giftCard:Lcom/ibotta/api/model/card/GiftCard;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 34
    iget v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->id:I

    return v0
.end method

.method public getInitialBalance()D
    .locals 2

    .line 42
    iget v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->initialBalance:F

    float-to-double v0, v0

    return-wide v0
.end method

.method public getPassbookUrl()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->passbookUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getRedemptionInstr()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->redemptionInstr:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getTemplate()Lcom/ibotta/api/model/card/GiftCard$Template;
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->template:Lcom/ibotta/api/model/card/GiftCard$Template;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->url:Ljava/lang/String;

    return-object v0
.end method

.method public isActive()Z
    .locals 1

    .line 122
    iget-boolean v0, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->active:Z

    return v0
.end method

.method public setAccessCode(Ljava/lang/String;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->accessCode:Ljava/lang/String;

    return-void
.end method

.method public setActionUrl(Ljava/lang/String;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->actionUrl:Ljava/lang/String;

    return-void
.end method

.method public setActive(Z)V
    .locals 0

    .line 126
    iput-boolean p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->active:Z

    return-void
.end method

.method public setBalanceLastUpdated(Ljava/util/Date;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->balanceLastUpdated:Ljava/util/Date;

    return-void
.end method

.method public setBalanceUrl(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->balanceUrl:Ljava/lang/String;

    return-void
.end method

.method public setCardNumber(Ljava/lang/String;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->cardNumber:Ljava/lang/String;

    return-void
.end method

.method public setCreatedAt(Ljava/util/Date;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->createdAt:Ljava/util/Date;

    return-void
.end method

.method public setCurrentBalance(F)V
    .locals 0

    .line 54
    iput p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->currentBalance:F

    return-void
.end method

.method public setFormattedCurrentBalance(Ljava/lang/String;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->formattedCurrentBalance:Ljava/lang/String;

    return-void
.end method

.method public setFormattedInitialBalance(Ljava/lang/String;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->formattedInitialBalance:Ljava/lang/String;

    return-void
.end method

.method public setGiftCard(Lcom/ibotta/api/model/card/GiftCard;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->giftCard:Lcom/ibotta/api/model/card/GiftCard;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 38
    iput p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->id:I

    return-void
.end method

.method public setInitialBalance(F)V
    .locals 0

    .line 46
    iput p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->initialBalance:F

    return-void
.end method

.method public setPassbookUrl(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->passbookUrl:Ljava/lang/String;

    return-void
.end method

.method public setRedemptionInstr(Ljava/lang/String;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->redemptionInstr:Ljava/lang/String;

    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->status:Ljava/lang/String;

    return-void
.end method

.method public setTemplate(Lcom/ibotta/api/model/card/GiftCard$Template;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->template:Lcom/ibotta/api/model/card/GiftCard$Template;

    return-void
.end method

.method public setUrl(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/ibotta/api/model/customer/CustomerGiftCard;->url:Ljava/lang/String;

    return-void
.end method
