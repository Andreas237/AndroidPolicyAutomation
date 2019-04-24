.class abstract Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState;
.super Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;
.source "$AutoValue_VerifiedOfferQuantityState.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState$Builder;
    }
.end annotation


# instance fields
.field private final expectedQuantity:I

.field private final offerId:I


# direct methods
.method constructor <init>(II)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;-><init>()V

    .line 16
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState;->offerId:I

    .line 17
    iput p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState;->expectedQuantity:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 43
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 44
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;

    .line 45
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState;->offerId:I

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;->getOfferId()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState;->expectedQuantity:I

    .line 46
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/VerifiedOfferQuantityState;->getExpectedQuantity()I

    move-result p1

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public getExpectedQuantity()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState;->expectedQuantity:I

    return v0
.end method

.method public getOfferId()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState;->offerId:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 55
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState;->offerId:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 57
    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState;->expectedQuantity:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VerifiedOfferQuantityState{offerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState;->offerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", expectedQuantity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/verify/$AutoValue_VerifiedOfferQuantityState;->expectedQuantity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
