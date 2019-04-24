.class public abstract Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields;
.super Ljava/lang/Object;
.source "ReceiptOfferDiffAdviceFields.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;
    .locals 1

    .line 16
    new-instance v0, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/aop/tracking/advice/AutoValue_ReceiptOfferDiffAdviceFields$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getActualQuantity()I
.end method

.method public abstract getExpectedQuantity()I
.end method

.method public abstract getOfferAmountType()Ljava/lang/String;
.end method

.method public abstract getOfferId()I
.end method

.method public abstract getRetailerId()I
.end method

.method public abstract toBuilder()Lcom/ibotta/android/aop/tracking/advice/ReceiptOfferDiffAdviceFields$Builder;
.end method
