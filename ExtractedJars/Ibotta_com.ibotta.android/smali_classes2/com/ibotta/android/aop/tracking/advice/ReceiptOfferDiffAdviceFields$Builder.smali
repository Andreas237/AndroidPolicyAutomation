.class public abstract Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;
.super Ljava/lang/Object;
.source "ReceiptOfferDiffAdviceFields.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract actualQuantity(I)Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;
.end method

.method public abstract build()Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;
.end method

.method public abstract expectedQuantity(I)Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;
.end method

.method public abstract offerAmountType(Ljava/lang/String;)Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;
.end method

.method public abstract offerId(I)Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;
.end method

.method public abstract retailerId(I)Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;
.end method
