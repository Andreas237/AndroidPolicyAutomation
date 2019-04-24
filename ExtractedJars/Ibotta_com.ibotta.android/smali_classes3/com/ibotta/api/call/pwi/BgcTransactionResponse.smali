.class public Lcom/ibotta/api/call/pwi/BgcTransactionResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "BgcTransactionResponse.java"


# instance fields
.field private bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 23
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 25
    instance-of v0, p1, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;

    if-eqz v0, :cond_1

    .line 26
    check-cast p1, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;->setBgcTransaction(Lcom/ibotta/api/model/pwi/BgcTransaction;)V

    :cond_1
    return-void
.end method

.method public getBgcTransaction()Lcom/ibotta/api/model/pwi/BgcTransaction;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    return-object v0
.end method

.method public setBgcTransaction(Lcom/ibotta/api/model/pwi/BgcTransaction;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;->bgcTransaction:Lcom/ibotta/api/model/pwi/BgcTransaction;

    return-void
.end method
