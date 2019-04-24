.class public Lcom/ibotta/api/call/problem/OfferFeedbackResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "OfferFeedbackResponse.java"


# instance fields
.field private promoCode:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/problem/OfferFeedback;",
            ">;"
        }
    .end annotation
.end field

.field private rebate:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/problem/OfferFeedback;",
            ">;"
        }
    .end annotation
.end field

.field private sale:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/problem/OfferFeedback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;->rebate:Ljava/util/List;

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;->promoCode:Ljava/util/List;

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;->sale:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 43
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 44
    instance-of v0, p1, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;

    if-eqz v0, :cond_1

    .line 45
    check-cast p1, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;->rebate:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;->setRebate(Ljava/util/List;)V

    .line 46
    iget-object v0, p0, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;->promoCode:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;->setPromoCode(Ljava/util/List;)V

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;->sale:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;->setSale(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public getPromoCode()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/problem/OfferFeedback;",
            ">;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;->promoCode:Ljava/util/List;

    return-object v0
.end method

.method public getRebate()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/problem/OfferFeedback;",
            ">;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;->rebate:Ljava/util/List;

    return-object v0
.end method

.method public getSale()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/problem/OfferFeedback;",
            ">;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;->sale:Ljava/util/List;

    return-object v0
.end method

.method public setPromoCode(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/problem/OfferFeedback;",
            ">;)V"
        }
    .end annotation

    .line 27
    iput-object p1, p0, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;->promoCode:Ljava/util/List;

    return-void
.end method

.method public setRebate(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/problem/OfferFeedback;",
            ">;)V"
        }
    .end annotation

    .line 19
    iput-object p1, p0, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;->rebate:Ljava/util/List;

    return-void
.end method

.method public setSale(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/problem/OfferFeedback;",
            ">;)V"
        }
    .end annotation

    .line 35
    iput-object p1, p0, Lcom/ibotta/api/call/problem/OfferFeedbackResponse;->sale:Ljava/util/List;

    return-void
.end method
