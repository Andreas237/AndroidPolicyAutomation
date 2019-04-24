.class public Lcom/ibotta/api/call/customer/giftcard/CustomerAddGiftCardPostResponse;
.super Lcom/ibotta/api/ApiResponse;
.source "CustomerAddGiftCardPostResponse.java"


# instance fields
.field private customerGiftCard:Lcom/ibotta/api/model/customer/CustomerGiftCard;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/ibotta/api/ApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getCustomerGiftCard()Lcom/ibotta/api/model/customer/CustomerGiftCard;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerAddGiftCardPostResponse;->customerGiftCard:Lcom/ibotta/api/model/customer/CustomerGiftCard;

    return-object v0
.end method

.method public setCustomerGiftCard(Lcom/ibotta/api/model/customer/CustomerGiftCard;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/ibotta/api/call/customer/giftcard/CustomerAddGiftCardPostResponse;->customerGiftCard:Lcom/ibotta/api/model/customer/CustomerGiftCard;

    return-void
.end method
