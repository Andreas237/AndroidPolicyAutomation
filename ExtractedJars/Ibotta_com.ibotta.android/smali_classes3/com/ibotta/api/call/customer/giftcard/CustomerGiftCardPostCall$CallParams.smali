.class public Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;
.super Ljava/lang/Object;
.source "CustomerGiftCardPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private amount:F

.field private customerId:I

.field private existingCardId:Ljava/lang/Integer;

.field private giftCardId:I

.field private giftCardTemplateId:I

.field private password:Ljava/lang/String;

.field private referenceId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAmount()F
    .locals 1

    .line 98
    iget v0, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->amount:F

    return v0
.end method

.method public getCustomerId()I
    .locals 1

    .line 74
    iget v0, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->customerId:I

    return v0
.end method

.method public getExistingCardId()Ljava/lang/Integer;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->existingCardId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getGiftCardId()I
    .locals 1

    .line 82
    iget v0, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->giftCardId:I

    return v0
.end method

.method public getGiftCardTemplateId()I
    .locals 1

    .line 90
    iget v0, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->giftCardTemplateId:I

    return v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->password:Ljava/lang/String;

    return-object v0
.end method

.method public getReferenceId()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->referenceId:Ljava/lang/String;

    return-object v0
.end method

.method public setAmount(F)V
    .locals 0

    .line 102
    iput p1, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->amount:F

    return-void
.end method

.method public setCustomerId(I)V
    .locals 0

    .line 78
    iput p1, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->customerId:I

    return-void
.end method

.method public setExistingCardId(Ljava/lang/Integer;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->existingCardId:Ljava/lang/Integer;

    return-void
.end method

.method public setGiftCardId(I)V
    .locals 0

    .line 86
    iput p1, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->giftCardId:I

    return-void
.end method

.method public setGiftCardTemplateId(I)V
    .locals 0

    .line 94
    iput p1, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->giftCardTemplateId:I

    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->password:Ljava/lang/String;

    return-void
.end method

.method public setReferenceId(Ljava/lang/String;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerGiftCardPostCall$CallParams;->referenceId:Ljava/lang/String;

    return-void
.end method
