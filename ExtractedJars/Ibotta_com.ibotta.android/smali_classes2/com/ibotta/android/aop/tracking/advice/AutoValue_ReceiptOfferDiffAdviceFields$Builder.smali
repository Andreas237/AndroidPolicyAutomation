.class final Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;
.super Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;
.source "AutoValue_ReceiptOfferDiffAdviceFields.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private actualQuantity:Ljava/lang/Integer;

.field private expectedQuantity:Ljava/lang/Integer;

.field private offerAmountType:Ljava/lang/String;

.field private offerId:Ljava/lang/Integer;

.field private retailerId:Ljava/lang/Integer;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 108
    invoke-direct {p0}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;)V
    .locals 1

    .line 110
    invoke-direct {p0}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;-><init>()V

    .line 111
    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;->getRetailerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->retailerId:Ljava/lang/Integer;

    .line 112
    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;->getOfferId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->offerId:Ljava/lang/Integer;

    .line 113
    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;->getOfferAmountType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->offerAmountType:Ljava/lang/String;

    .line 114
    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;->getExpectedQuantity()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->expectedQuantity:Ljava/lang/Integer;

    .line 115
    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;->getActualQuantity()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->actualQuantity:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$1;)V
    .locals 0

    .line 102
    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;-><init>(Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;)V

    return-void
.end method


# virtual methods
.method public actualQuantity(I)Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;
    .locals 0

    .line 142
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->actualQuantity:Ljava/lang/Integer;

    return-object p0
.end method

.method public build()Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;
    .locals 9

    const-string v0, ""

    .line 148
    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->retailerId:Ljava/lang/Integer;

    if-nez v1, :cond_0

    .line 149
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " retailerId"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 151
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->offerId:Ljava/lang/Integer;

    if-nez v1, :cond_1

    .line 152
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " offerId"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 154
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->offerAmountType:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 155
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " offerAmountType"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 157
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->expectedQuantity:Ljava/lang/Integer;

    if-nez v1, :cond_3

    .line 158
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " expectedQuantity"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 160
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->actualQuantity:Ljava/lang/Integer;

    if-nez v1, :cond_4

    .line 161
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " actualQuantity"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 163
    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 166
    new-instance v0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->retailerId:Ljava/lang/Integer;

    .line 167
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->offerId:Ljava/lang/Integer;

    .line 168
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v5, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->offerAmountType:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->expectedQuantity:Ljava/lang/Integer;

    .line 170
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->actualQuantity:Ljava/lang/Integer;

    .line 171
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields;-><init>(IILjava/lang/String;IILcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$1;)V

    return-object v0

    .line 164
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public expectedQuantity(I)Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;
    .locals 0

    .line 137
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->expectedQuantity:Ljava/lang/Integer;

    return-object p0
.end method

.method public offerAmountType(Ljava/lang/String;)Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 132
    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->offerAmountType:Ljava/lang/String;

    return-object p0

    .line 130
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null offerAmountType"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public offerId(I)Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;
    .locals 0

    .line 124
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->offerId:Ljava/lang/Integer;

    return-object p0
.end method

.method public retailerId(I)Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;
    .locals 0

    .line 119
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;->retailerId:Ljava/lang/Integer;

    return-object p0
.end method
