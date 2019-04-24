.class public Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;
.super Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;
.source "TxOfferRow.java"


# instance fields
.field private isFirstOffer:Z

.field private isLastOffer:Z

.field private isVerified:Z

.field private offerModel:Lcom/ibotta/api/model/OfferModel;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;->OFFER:Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;-><init>(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailRowType;)V

    return-void
.end method


# virtual methods
.method public getOfferModel()Lcom/ibotta/api/model/OfferModel;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;->offerModel:Lcom/ibotta/api/model/OfferModel;

    return-object v0
.end method

.method public isFirstOffer()Z
    .locals 1

    .line 38
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;->isFirstOffer:Z

    return v0
.end method

.method public isLastOffer()Z
    .locals 1

    .line 46
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;->isLastOffer:Z

    return v0
.end method

.method public isVerified()Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;->isVerified:Z

    return v0
.end method

.method public setFirstOffer(Z)V
    .locals 0

    .line 42
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;->isFirstOffer:Z

    return-void
.end method

.method public setLastOffer(Z)V
    .locals 0

    .line 50
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;->isLastOffer:Z

    return-void
.end method

.method public setOfferModel(Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;->offerModel:Lcom/ibotta/api/model/OfferModel;

    return-void
.end method

.method public setVerified(Z)V
    .locals 0

    .line 34
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;->isVerified:Z

    return-void
.end method
