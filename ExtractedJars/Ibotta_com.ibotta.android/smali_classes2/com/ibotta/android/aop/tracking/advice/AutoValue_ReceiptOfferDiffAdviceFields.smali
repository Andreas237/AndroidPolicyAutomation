.class final Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;
.super Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;
.source "AutoValue_ReceiptOfferDiffAdviceFields.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;
    }
.end annotation


# instance fields
.field private final actualQuantity:I

.field private final expectedQuantity:I

.field private final offerAmountType:Ljava/lang/String;

.field private final offerId:I

.field private final retailerId:I


# direct methods
.method private constructor <init>(IILjava/lang/String;II)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;-><init>()V

    .line 22
    iput p1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->retailerId:I

    .line 23
    iput p2, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->offerId:I

    .line 24
    iput-object p3, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->offerAmountType:Ljava/lang/String;

    .line 25
    iput p4, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->expectedQuantity:I

    .line 26
    iput p5, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->actualQuantity:I

    return-void
.end method

.method synthetic constructor <init>(IILjava/lang/String;IILcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$1;)V
    .locals 0

    .line 8
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;-><init>(IILjava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 70
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 71
    check-cast p1, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;

    .line 72
    iget v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->retailerId:I

    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;->getRetailerId()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->offerId:I

    .line 73
    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;->getOfferId()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->offerAmountType:Ljava/lang/String;

    .line 74
    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;->getOfferAmountType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->expectedQuantity:I

    .line 75
    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;->getExpectedQuantity()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->actualQuantity:I

    .line 76
    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;->getActualQuantity()I

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

.method public getActualQuantity()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->actualQuantity:I

    return v0
.end method

.method public getExpectedQuantity()I
    .locals 1

    .line 46
    iget v0, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->expectedQuantity:I

    return v0
.end method

.method public getOfferAmountType()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->offerAmountType:Ljava/lang/String;

    return-object v0
.end method

.method public getOfferId()I
    .locals 1

    .line 36
    iget v0, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->offerId:I

    return v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->retailerId:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 85
    iget v0, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->retailerId:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 87
    iget v2, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->offerId:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 89
    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->offerAmountType:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 91
    iget v2, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->expectedQuantity:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 93
    iget v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->actualQuantity:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toBuilder()Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;
    .locals 2

    .line 99
    new-instance v0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;-><init>(Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$1;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ReceiptOfferDiffAdviceFields{retailerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->retailerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", offerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->offerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", offerAmountType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->offerAmountType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expectedQuantity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->expectedQuantity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", actualQuantity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;->actualQuantity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
