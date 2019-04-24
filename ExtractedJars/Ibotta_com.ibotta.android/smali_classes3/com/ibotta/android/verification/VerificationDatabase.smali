.class public interface abstract Lcom/ibotta/android/verification/VerificationDatabase;
.super Ljava/lang/Object;
.source "VerificationDatabase.java"


# virtual methods
.method public abstract deleteEverything()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract deleteOldVerifications()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract deleteVerification(I)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract deleteVerifications(I)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract findByOfferId(I)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/verification/Verification;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract findByOfferIdAndProductGroupId(ILjava/lang/Integer;)Ljava/util/List;
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

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract findByOfferIds(Ljava/util/Set;)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/verification/Verification;",
            ">;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract findCountWithScannedData(ILjava/lang/Integer;Ljava/lang/String;)S
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract getScanCountByOfferId(I)S
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract release()V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation
.end method

.method public abstract saveVerification(Lcom/ibotta/android/verification/Verification;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation
.end method
