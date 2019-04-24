.class public Lcom/ibotta/api/call/bonuses/BonusByIdResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "BonusByIdResponse.java"


# instance fields
.field private bonus:Lcom/ibotta/api/model/bonus/Bonus;


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

    .line 27
    instance-of v0, p1, Lcom/ibotta/api/call/bonuses/BonusByIdResponse;

    if-eqz v0, :cond_1

    .line 28
    check-cast p1, Lcom/ibotta/api/call/bonuses/BonusByIdResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/bonuses/BonusByIdResponse;->bonus:Lcom/ibotta/api/model/bonus/Bonus;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/bonuses/BonusByIdResponse;->setBonus(Lcom/ibotta/api/model/bonus/Bonus;)V

    :cond_1
    return-void
.end method

.method public getBonus()Lcom/ibotta/api/model/bonus/Bonus;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/ibotta/api/call/bonuses/BonusByIdResponse;->bonus:Lcom/ibotta/api/model/bonus/Bonus;

    return-object v0
.end method

.method public setBonus(Lcom/ibotta/api/model/bonus/Bonus;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/ibotta/api/call/bonuses/BonusByIdResponse;->bonus:Lcom/ibotta/api/model/bonus/Bonus;

    return-void
.end method
