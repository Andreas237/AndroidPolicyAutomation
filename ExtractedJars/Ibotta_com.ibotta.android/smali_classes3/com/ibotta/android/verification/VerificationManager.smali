.class public interface abstract Lcom/ibotta/android/verification/VerificationManager;
.super Ljava/lang/Object;
.source "VerificationManager.java"

# interfaces
.implements Lcom/ibotta/android/state/user/LogOutListener;


# virtual methods
.method public abstract deleteAll()V
.end method

.method public abstract deleteByOfferId(Ljava/lang/Integer;)V
.end method

.method public abstract deleteReceiptBarcodes()V
.end method

.method public abstract getOfferVerification(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/verification/OfferVerification;
.end method

.method public abstract getOfferVerifications(Ljava/util/List;)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/android/verification/OfferVerification;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getReceiptBarcodes()[Ljava/lang/String;
.end method

.method public abstract getVerifications(ILjava/lang/Integer;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Integer;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/verification/Verification;",
            ">;"
        }
    .end annotation
.end method

.method public abstract hasOfferVerification(ILjava/lang/Integer;Ljava/lang/String;)Z
.end method

.method public abstract saveCheckProductScannedVerification(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;Ljava/lang/String;)Lcom/ibotta/android/verification/OfferVerification;
.end method

.method public abstract saveManuallyCheckedVerification(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)Lcom/ibotta/android/verification/OfferVerification;
.end method

.method public abstract savePreverified(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/verification/OfferVerification;
.end method

.method public abstract saveQuantity(Lcom/ibotta/android/verification/OfferVerification;I)V
.end method

.method public abstract saveReceiptBarcodes([Ljava/lang/String;)V
.end method

.method public abstract saveRedemptionScannedVerification(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;Ljava/lang/String;)Lcom/ibotta/android/verification/OfferVerification;
.end method
