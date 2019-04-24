.class public Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;
.super Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;
.source "VerifiableRebateRow.java"


# instance fields
.field private count:I

.field private offerModel:Lcom/ibotta/api/model/OfferModel;

.field private retailerId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;->REBATE:Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/AbstractVerifiedRebatesRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedRebatesRowType;)V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 36
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;->count:I

    return v0
.end method

.method public getOfferModel()Lcom/ibotta/api/model/OfferModel;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;->offerModel:Lcom/ibotta/api/model/OfferModel;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public setCount(I)V
    .locals 0

    .line 40
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;->count:I

    return-void
.end method

.method public setOfferModel(Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;->offerModel:Lcom/ibotta/api/model/OfferModel;

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/row/VerifiableRebateRow;->retailerId:Ljava/lang/Integer;

    return-void
.end method
