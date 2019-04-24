.class public Lcom/ibotta/api/call/card/GiftCardByIdResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "GiftCardByIdResponse.java"


# instance fields
.field private giftCard:Lcom/ibotta/api/model/card/GiftCard;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 25
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 26
    instance-of v0, p1, Lcom/ibotta/api/call/card/GiftCardByIdResponse;

    if-eqz v0, :cond_1

    .line 27
    check-cast p1, Lcom/ibotta/api/call/card/GiftCardByIdResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/card/GiftCardByIdResponse;->giftCard:Lcom/ibotta/api/model/card/GiftCard;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/card/GiftCardByIdResponse;->setGiftCard(Lcom/ibotta/api/model/card/GiftCard;)V

    :cond_1
    return-void
.end method

.method public getGiftCard()Lcom/ibotta/api/model/card/GiftCard;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/ibotta/api/call/card/GiftCardByIdResponse;->giftCard:Lcom/ibotta/api/model/card/GiftCard;

    return-object v0
.end method

.method public setGiftCard(Lcom/ibotta/api/model/card/GiftCard;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/ibotta/api/call/card/GiftCardByIdResponse;->giftCard:Lcom/ibotta/api/model/card/GiftCard;

    return-void
.end method
