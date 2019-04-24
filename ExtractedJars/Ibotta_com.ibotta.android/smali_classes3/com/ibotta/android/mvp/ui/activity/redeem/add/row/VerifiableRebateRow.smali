.class public Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;
.super Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;
.source "VerifiableRebateRow.java"


# instance fields
.field private count:I

.field private offerModel:Lcom/ibotta/api/model/OfferModel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private offerVerification:Lcom/ibotta/android/verification/OfferVerification;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRowType;->REBATE:Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRowType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesRowType;)V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 61
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->count:I

    return v0
.end method

.method public getOfferModel()Lcom/ibotta/api/model/OfferModel;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->offerModel:Lcom/ibotta/api/model/OfferModel;

    return-object v0
.end method

.method public getOfferVerification()Lcom/ibotta/android/verification/OfferVerification;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->offerVerification:Lcom/ibotta/android/verification/OfferVerification;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object v0
.end method

.method public isVerified()Z
    .locals 2

    .line 52
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->offerVerification:Lcom/ibotta/android/verification/OfferVerification;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/verification/OfferVerification;->isVerified(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setCount(I)V
    .locals 0

    .line 65
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->count:I

    return-void
.end method

.method public setOfferModel(Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->offerModel:Lcom/ibotta/api/model/OfferModel;

    return-void
.end method

.method public setOfferVerification(Lcom/ibotta/android/verification/OfferVerification;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->offerVerification:Lcom/ibotta/android/verification/OfferVerification;

    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method
