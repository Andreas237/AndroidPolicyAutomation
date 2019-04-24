.class public Lcom/ibotta/android/verification/VerificationManagerImpl;
.super Ljava/lang/Object;
.source "VerificationManagerImpl.java"

# interfaces
.implements Lcom/ibotta/android/verification/VerificationManager;


# annotations
.annotation runtime Ljavax/inject/Singleton;
.end annotation


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final context:Landroid/content/Context;

.field private final offerQuantityDatabase:Lcom/ibotta/android/verification/OfferQuantityDatabase;

.field private receiptBarcodes:[Ljava/lang/String;

.field private final scanRules:Lcom/ibotta/api/rules/ScanRules;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/verification/OfferQuantityDatabase;Lcom/ibotta/api/rules/ScanRules;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->context:Landroid/content/Context;

    .line 48
    iput-object p2, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 49
    iput-object p3, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->offerQuantityDatabase:Lcom/ibotta/android/verification/OfferQuantityDatabase;

    .line 50
    iput-object p4, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->scanRules:Lcom/ibotta/api/rules/ScanRules;

    return-void
.end method

.method private closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V
    .locals 2

    const-string v0, "closeVerificationDatabase"

    const/4 v1, 0x0

    .line 623
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p1, :cond_0

    return-void

    .line 630
    :cond_0
    :try_start_0
    invoke-interface {p1}, Lcom/ibotta/android/verification/VerificationDatabase;->release()V
    :try_end_0
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to release verification database."

    .line 633
    invoke-virtual {p0, p1, v0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->onFailure(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private deleteOldVerifications(Lcom/ibotta/android/verification/VerificationDatabase;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/verification/VerificationDatabaseFatalException;
        }
    .end annotation

    .line 595
    iget-object v0, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->offerQuantityDatabase:Lcom/ibotta/android/verification/OfferQuantityDatabase;

    invoke-interface {v0}, Lcom/ibotta/android/verification/OfferQuantityDatabase;->deleteOld()V

    .line 596
    invoke-interface {p1}, Lcom/ibotta/android/verification/VerificationDatabase;->deleteOldVerifications()V

    return-void
.end method

.method private getSavedScanCountByOffer(Lcom/ibotta/api/model/OfferModel;)S
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 576
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p1

    const/4 v1, 0x0

    .line 581
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->openVerificationDatabase()Lcom/ibotta/android/verification/VerificationDatabase;

    move-result-object v1

    .line 582
    invoke-interface {v1, p1}, Lcom/ibotta/android/verification/VerificationDatabase;->getScanCountByOfferId(I)S

    move-result v0
    :try_end_0
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 587
    :goto_0
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    const-string v2, "Failed to get scan count by offer id."

    .line 585
    invoke-virtual {p0, p1, v2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->onFailure(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return v0

    .line 587
    :goto_2
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    throw p1
.end method

.method private getScanCountRequired(Lcom/ibotta/api/model/OfferModel;)S
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 543
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isCombo()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    .line 544
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getProductGroups()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 545
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getProductGroups()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/offer/ProductGroup;

    .line 546
    invoke-virtual {v0}, Lcom/ibotta/api/model/offer/ProductGroup;->isMultiples()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 547
    invoke-virtual {v0}, Lcom/ibotta/api/model/offer/ProductGroup;->getMultiplesCount()S

    move-result v0

    add-int/2addr v2, v0

    int-to-short v0, v2

    move v2, v0

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    int-to-short v0, v2

    move v2, v0

    goto :goto_0

    .line 556
    :cond_2
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isMultiples()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 557
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getMultiplesCount()S

    move-result v2

    :cond_3
    return v2
.end method

.method private getScanProgress(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/verification/ScanProgress;
    .locals 2

    .line 454
    new-instance v0, Lcom/ibotta/android/verification/ScanProgress;

    invoke-direct {v0}, Lcom/ibotta/android/verification/ScanProgress;-><init>()V

    if-nez p1, :cond_0

    return-object v0

    .line 460
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->getScanCountRequired(Lcom/ibotta/api/model/OfferModel;)S

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/verification/ScanProgress;->setCountRequired(S)V

    .line 461
    invoke-direct {p0, p1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->getSavedScanCountByOffer(Lcom/ibotta/api/model/OfferModel;)S

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/verification/ScanProgress;->setCountScanned(S)V

    return-object v0
.end method

.method private saveScannedVerification(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/ibotta/android/verification/OfferVerification;
    .locals 4

    const/4 v0, 0x0

    .line 472
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->openVerificationDatabase()Lcom/ibotta/android/verification/VerificationDatabase;

    move-result-object v1
    :try_end_0
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 475
    :try_start_1
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->deleteOldVerifications(Lcom/ibotta/android/verification/VerificationDatabase;)V

    .line 477
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v2

    if-eqz p4, :cond_0

    .line 483
    iget-object p4, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->offerQuantityDatabase:Lcom/ibotta/android/verification/OfferQuantityDatabase;

    const/4 v3, 0x1

    invoke-interface {p4, v2, v3}, Lcom/ibotta/android/verification/OfferQuantityDatabase;->save(II)Lcom/ibotta/android/verification/OfferQuantity;

    .line 484
    invoke-interface {v1, v2}, Lcom/ibotta/android/verification/VerificationDatabase;->deleteVerifications(I)V

    .line 487
    :cond_0
    invoke-interface {v1, v2, p2}, Lcom/ibotta/android/verification/VerificationDatabase;->findByOfferIdAndProductGroupId(ILjava/lang/Integer;)Ljava/util/List;

    move-result-object p4

    .line 492
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/verification/Verification;

    .line 493
    invoke-virtual {v2}, Lcom/ibotta/android/verification/Verification;->getScannedData()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_2
    move-object v2, v0

    :goto_0
    if-eqz v2, :cond_3

    .line 503
    invoke-virtual {v2, p3}, Lcom/ibotta/android/verification/Verification;->setScannedData(Ljava/lang/String;)V

    goto :goto_1

    .line 507
    :cond_3
    invoke-virtual {p0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->createVerification()Lcom/ibotta/android/verification/Verification;

    move-result-object v2

    .line 508
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p4

    invoke-virtual {v2, p4}, Lcom/ibotta/android/verification/Verification;->setOfferId(I)V

    .line 509
    invoke-virtual {v2, p2}, Lcom/ibotta/android/verification/Verification;->setProductGroupId(Ljava/lang/Integer;)V

    .line 510
    invoke-virtual {v2, p3}, Lcom/ibotta/android/verification/Verification;->setScannedData(Ljava/lang/String;)V

    .line 513
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-virtual {v2, p2, p3}, Lcom/ibotta/android/verification/Verification;->setSaveTime(J)V

    .line 516
    invoke-interface {v1, v2}, Lcom/ibotta/android/verification/VerificationDatabase;->saveVerification(Lcom/ibotta/android/verification/Verification;)V

    .line 518
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p2

    invoke-interface {v1, p2}, Lcom/ibotta/android/verification/VerificationDatabase;->findByOfferId(I)Ljava/util/List;

    move-result-object p2

    .line 519
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->createOfferVerification(Lcom/ibotta/api/model/OfferModel;Ljava/util/List;)Lcom/ibotta/android/verification/OfferVerification;

    move-result-object v0
    :try_end_1
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v1, v0

    goto :goto_4

    :catch_1
    move-exception p1

    move-object v1, v0

    :goto_2
    :try_start_2
    const-string p2, "Failed to save verification."

    .line 522
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->onFailure(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 524
    :goto_3
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    return-object v0

    :goto_4
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    throw p1
.end method


# virtual methods
.method protected createOfferVerification(Lcom/ibotta/api/model/OfferModel;Ljava/util/List;)Lcom/ibotta/android/verification/OfferVerification;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/OfferModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/verification/Verification;",
            ">;)",
            "Lcom/ibotta/android/verification/OfferVerification;"
        }
    .end annotation

    .line 415
    new-instance v0, Lcom/ibotta/android/verification/OfferVerification;

    iget-object v1, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->scanRules:Lcom/ibotta/api/rules/ScanRules;

    invoke-direct {v0, v1}, Lcom/ibotta/android/verification/OfferVerification;-><init>(Lcom/ibotta/api/rules/ScanRules;)V

    .line 417
    invoke-virtual {v0, p1}, Lcom/ibotta/android/verification/OfferVerification;->setOfferModel(Lcom/ibotta/api/model/OfferModel;)V

    .line 418
    invoke-direct {p0, p1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->getScanProgress(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/verification/ScanProgress;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/verification/OfferVerification;->setScanProgress(Lcom/ibotta/android/verification/ScanProgress;)V

    .line 419
    invoke-virtual {v0, p2}, Lcom/ibotta/android/verification/OfferVerification;->setVerifications(Ljava/util/List;)V

    .line 420
    iget-object p2, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->offerQuantityDatabase:Lcom/ibotta/android/verification/OfferQuantityDatabase;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p1

    invoke-interface {p2, p1}, Lcom/ibotta/android/verification/OfferQuantityDatabase;->getQuantity(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/verification/OfferVerification;->setQuantity(I)V

    return-object v0
.end method

.method protected createPreverifiedOfferVerification(Lcom/ibotta/api/model/OfferModel;Ljava/util/List;)Lcom/ibotta/android/verification/OfferVerification;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/OfferModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/verification/Verification;",
            ">;)",
            "Lcom/ibotta/android/verification/OfferVerification;"
        }
    .end annotation

    .line 434
    new-instance v0, Lcom/ibotta/android/verification/OfferVerification;

    iget-object v1, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->scanRules:Lcom/ibotta/api/rules/ScanRules;

    invoke-direct {v0, v1}, Lcom/ibotta/android/verification/OfferVerification;-><init>(Lcom/ibotta/api/rules/ScanRules;)V

    .line 436
    invoke-virtual {v0, p1}, Lcom/ibotta/android/verification/OfferVerification;->setOfferModel(Lcom/ibotta/api/model/OfferModel;)V

    .line 437
    invoke-direct {p0, p1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->getScanProgress(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/verification/ScanProgress;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/verification/OfferVerification;->setScanProgress(Lcom/ibotta/android/verification/ScanProgress;)V

    .line 438
    invoke-virtual {v0, p2}, Lcom/ibotta/android/verification/OfferVerification;->setVerifications(Ljava/util/List;)V

    if-eqz p2, :cond_0

    .line 441
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getVerifiedCount()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/verification/OfferVerification;->setQuantity(I)V

    :cond_0
    return-object v0
.end method

.method protected createVerification()Lcom/ibotta/android/verification/Verification;
    .locals 1

    .line 54
    new-instance v0, Lcom/ibotta/android/verification/Verification;

    invoke-direct {v0}, Lcom/ibotta/android/verification/Verification;-><init>()V

    return-object v0
.end method

.method public deleteAll()V
    .locals 4

    const/4 v0, 0x0

    .line 244
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->openVerificationDatabase()Lcom/ibotta/android/verification/VerificationDatabase;

    move-result-object v1
    :try_end_0
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 245
    :try_start_1
    invoke-interface {v1}, Lcom/ibotta/android/verification/VerificationDatabase;->deleteEverything()V

    .line 246
    iget-object v2, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->offerQuantityDatabase:Lcom/ibotta/android/verification/OfferQuantityDatabase;

    invoke-interface {v2}, Lcom/ibotta/android/verification/OfferQuantityDatabase;->deleteAll()V

    .line 247
    iput-object v0, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->receiptBarcodes:[Ljava/lang/String;
    :try_end_1
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    goto :goto_2

    :catch_1
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_0
    :try_start_2
    const-string v2, "Failed to delete all verifications."

    .line 250
    invoke-virtual {p0, v0, v2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->onFailure(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 252
    :goto_1
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    return-void

    :goto_2
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    throw v0
.end method

.method public deleteByOfferId(Ljava/lang/Integer;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 225
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->openVerificationDatabase()Lcom/ibotta/android/verification/VerificationDatabase;

    move-result-object v0

    .line 226
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/verification/VerificationDatabase;->deleteVerifications(I)V
    :try_end_0
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 231
    :goto_0
    invoke-direct {p0, v0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    const-string v1, "Failed to delete verification."

    .line 229
    invoke-virtual {p0, p1, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->onFailure(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    .line 231
    :goto_2
    invoke-direct {p0, v0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    throw p1
.end method

.method public deleteReceiptBarcodes()V
    .locals 1

    const/4 v0, 0x0

    .line 403
    iput-object v0, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->receiptBarcodes:[Ljava/lang/String;

    return-void
.end method

.method public getOfferVerification(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/verification/OfferVerification;
    .locals 3

    const/4 v0, 0x0

    .line 298
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->openVerificationDatabase()Lcom/ibotta/android/verification/VerificationDatabase;

    move-result-object v1
    :try_end_0
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 301
    :try_start_1
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->deleteOldVerifications(Lcom/ibotta/android/verification/VerificationDatabase;)V

    .line 303
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/verification/VerificationDatabase;->findByOfferId(I)Ljava/util/List;

    move-result-object v2

    .line 304
    invoke-virtual {p0, p1, v2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->createOfferVerification(Lcom/ibotta/api/model/OfferModel;Ljava/util/List;)Lcom/ibotta/android/verification/OfferVerification;

    move-result-object v0
    :try_end_1
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    move-object v1, v0

    goto :goto_2

    :catch_1
    move-exception p1

    move-object v1, v0

    :goto_0
    :try_start_2
    const-string v2, "Failed to get offer verification status."

    .line 307
    invoke-virtual {p0, p1, v2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->onFailure(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 309
    :goto_1
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    return-object v0

    :goto_2
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    throw p1
.end method

.method public getOfferVerifications(Ljava/util/List;)Ljava/util/Map;
    .locals 6
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

    if-eqz p1, :cond_3

    .line 324
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 328
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 329
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 330
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 333
    :cond_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 334
    new-instance v1, Ljava/util/HashSet;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 v2, 0x0

    .line 338
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->openVerificationDatabase()Lcom/ibotta/android/verification/VerificationDatabase;

    move-result-object v2

    .line 341
    invoke-direct {p0, v2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->deleteOldVerifications(Lcom/ibotta/android/verification/VerificationDatabase;)V

    .line 343
    invoke-interface {v2, v1}, Lcom/ibotta/android/verification/VerificationDatabase;->findByOfferIds(Ljava/util/Set;)Ljava/util/Map;

    move-result-object v1

    .line 345
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 346
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/api/model/OfferModel;

    .line 347
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 349
    invoke-virtual {p0, v4, v5}, Lcom/ibotta/android/verification/VerificationManagerImpl;->createOfferVerification(Lcom/ibotta/api/model/OfferModel;Ljava/util/List;)Lcom/ibotta/android/verification/OfferVerification;

    move-result-object v4

    .line 351
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-interface {p1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_1
    const-string v1, "Failed to get offer verification statuses."

    .line 356
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->onFailure(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 358
    :cond_2
    invoke-direct {p0, v2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    return-object p1

    :goto_2
    invoke-direct {p0, v2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    throw p1

    .line 325
    :cond_3
    :goto_3
    new-instance p1, Ljava/util/HashMap;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/HashMap;-><init>(I)V

    return-object p1
.end method

.method public getReceiptBarcodes()[Ljava/lang/String;
    .locals 1

    .line 398
    iget-object v0, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->receiptBarcodes:[Ljava/lang/String;

    return-object v0
.end method

.method public getVerifications(ILjava/lang/Integer;)Ljava/util/List;
    .locals 2
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

    .line 268
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 270
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->openVerificationDatabase()Lcom/ibotta/android/verification/VerificationDatabase;

    move-result-object v1

    .line 273
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->deleteOldVerifications(Lcom/ibotta/android/verification/VerificationDatabase;)V

    .line 275
    invoke-interface {v1, p1, p2}, Lcom/ibotta/android/verification/VerificationDatabase;->findByOfferIdAndProductGroupId(ILjava/lang/Integer;)Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 280
    :goto_0
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    const-string p2, "Failed to get verifications by offerId and productGroupId."

    .line 278
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->onFailure(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return-object v0

    .line 280
    :goto_2
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    throw p1
.end method

.method public hasOfferVerification(ILjava/lang/Integer;Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 379
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->openVerificationDatabase()Lcom/ibotta/android/verification/VerificationDatabase;

    move-result-object v1

    .line 380
    invoke-interface {v1, p1, p2, p3}, Lcom/ibotta/android/verification/VerificationDatabase;->findCountWithScannedData(ILjava/lang/Integer;Ljava/lang/String;)S

    move-result p1
    :try_end_0
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    const-string p2, "Failed to get whether offer verification exists."

    .line 383
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->onFailure(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 385
    :cond_0
    :goto_0
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    return v0

    :goto_1
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    throw p1
.end method

.method onFailure(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const/4 v0, 0x0

    .line 644
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 645
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onLogOut(Z)V
    .locals 0

    .line 639
    invoke-virtual {p0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->deleteAll()V

    return-void
.end method

.method protected openVerificationDatabase()Lcom/ibotta/android/verification/VerificationDatabase;
    .locals 2

    const-string v0, "openVerificationDatabase"

    const/4 v1, 0x0

    .line 605
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 609
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->context:Landroid/content/Context;

    iget-object v1, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-static {v0, v1}, Lcom/ibotta/android/verification/SQLiteVerificationDatabase;->open(Landroid/content/Context;Lcom/ibotta/android/state/app/config/AppConfig;)Lcom/ibotta/android/verification/VerificationDatabase;

    move-result-object v0
    :try_end_0
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Failed to open verification database."

    .line 611
    invoke-virtual {p0, v0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->onFailure(Ljava/lang/Exception;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public saveCheckProductScannedVerification(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;Ljava/lang/String;)Lcom/ibotta/android/verification/OfferVerification;
    .locals 1

    const/4 v0, 0x1

    .line 163
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->saveScannedVerification(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/ibotta/android/verification/OfferVerification;

    move-result-object p1

    return-object p1
.end method

.method public saveManuallyCheckedVerification(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)Lcom/ibotta/android/verification/OfferVerification;
    .locals 5

    const/4 v0, 0x0

    .line 115
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->openVerificationDatabase()Lcom/ibotta/android/verification/VerificationDatabase;

    move-result-object v1
    :try_end_0
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 118
    :try_start_1
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->deleteOldVerifications(Lcom/ibotta/android/verification/VerificationDatabase;)V

    .line 121
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v2

    .line 120
    invoke-interface {v1, v2, p2}, Lcom/ibotta/android/verification/VerificationDatabase;->findByOfferIdAndProductGroupId(ILjava/lang/Integer;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 125
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 126
    :cond_0
    invoke-virtual {p0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->createVerification()Lcom/ibotta/android/verification/Verification;

    move-result-object v2

    .line 127
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/android/verification/Verification;->setOfferId(I)V

    .line 128
    invoke-virtual {v2, p2}, Lcom/ibotta/android/verification/Verification;->setProductGroupId(Ljava/lang/Integer;)V

    .line 129
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/ibotta/android/verification/Verification;->setSaveTime(J)V

    .line 132
    invoke-interface {v1, v2}, Lcom/ibotta/android/verification/VerificationDatabase;->saveVerification(Lcom/ibotta/android/verification/Verification;)V

    .line 133
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p2

    invoke-interface {v1, p2}, Lcom/ibotta/android/verification/VerificationDatabase;->findByOfferId(I)Ljava/util/List;

    move-result-object v2

    .line 136
    :cond_1
    invoke-virtual {p0, p1, v2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->createOfferVerification(Lcom/ibotta/api/model/OfferModel;Ljava/util/List;)Lcom/ibotta/android/verification/OfferVerification;

    move-result-object v0
    :try_end_1
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    move-object v1, v0

    goto :goto_2

    :catch_1
    move-exception p1

    move-object v1, v0

    :goto_0
    :try_start_2
    const-string p2, "Failed to save verification."

    .line 139
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->onFailure(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 141
    :goto_1
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    return-object v0

    :goto_2
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    throw p1
.end method

.method public savePreverified(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/verification/OfferVerification;
    .locals 7

    const/4 v0, 0x0

    .line 172
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->openVerificationDatabase()Lcom/ibotta/android/verification/VerificationDatabase;

    move-result-object v1
    :try_end_0
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 175
    :try_start_1
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->deleteOldVerifications(Lcom/ibotta/android/verification/VerificationDatabase;)V

    .line 177
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v2

    .line 179
    invoke-interface {v1, v2, v0}, Lcom/ibotta/android/verification/VerificationDatabase;->findByOfferIdAndProductGroupId(ILjava/lang/Integer;)Ljava/util/List;

    move-result-object v3

    .line 183
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/ibotta/android/verification/Verification;

    .line 184
    invoke-virtual {v4}, Lcom/ibotta/android/verification/Verification;->getId()I

    move-result v4

    invoke-interface {v1, v4}, Lcom/ibotta/android/verification/VerificationDatabase;->deleteVerification(I)V

    goto :goto_0

    .line 187
    :cond_0
    iget-object v3, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->offerQuantityDatabase:Lcom/ibotta/android/verification/OfferQuantityDatabase;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v4

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getVerifiedCount()I

    move-result v5

    invoke-interface {v3, v4, v5}, Lcom/ibotta/android/verification/OfferQuantityDatabase;->save(II)Lcom/ibotta/android/verification/OfferQuantity;

    const/4 v3, 0x0

    .line 189
    :goto_1
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getVerifiedCount()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 190
    invoke-virtual {p0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->createVerification()Lcom/ibotta/android/verification/Verification;

    move-result-object v4

    .line 191
    invoke-virtual {v4, v2}, Lcom/ibotta/android/verification/Verification;->setOfferId(I)V

    const/4 v5, 0x1

    .line 192
    invoke-virtual {v4, v5}, Lcom/ibotta/android/verification/Verification;->setPreverified(Z)V

    .line 193
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Lcom/ibotta/android/verification/Verification;->setSaveTime(J)V

    .line 196
    invoke-interface {v1, v4}, Lcom/ibotta/android/verification/VerificationDatabase;->saveVerification(Lcom/ibotta/android/verification/Verification;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 199
    :cond_1
    invoke-interface {v1, v2}, Lcom/ibotta/android/verification/VerificationDatabase;->findByOfferId(I)Ljava/util/List;

    move-result-object v2

    .line 200
    invoke-virtual {p0, p1, v2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->createPreverifiedOfferVerification(Lcom/ibotta/api/model/OfferModel;Ljava/util/List;)Lcom/ibotta/android/verification/OfferVerification;

    move-result-object v0
    :try_end_1
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v1, v0

    goto :goto_4

    :catch_1
    move-exception p1

    move-object v1, v0

    :goto_2
    :try_start_2
    const-string v2, "Failed to save verification."

    .line 203
    invoke-virtual {p0, p1, v2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->onFailure(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 205
    :goto_3
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    return-object v0

    :goto_4
    invoke-direct {p0, v1}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    throw p1
.end method

.method public saveQuantity(Lcom/ibotta/android/verification/OfferVerification;I)V
    .locals 5

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/android/verification/OfferVerification;->getQuantity()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 60
    :goto_0
    invoke-virtual {p1}, Lcom/ibotta/android/verification/OfferVerification;->getQuantity()I

    move-result v3

    if-le p2, v3, :cond_1

    const/4 v1, 0x1

    .line 62
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/verification/OfferVerification;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v3

    invoke-interface {v3}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v3

    .line 63
    iget-object v4, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->offerQuantityDatabase:Lcom/ibotta/android/verification/OfferQuantityDatabase;

    invoke-interface {v4, v3, p2}, Lcom/ibotta/android/verification/OfferQuantityDatabase;->save(II)Lcom/ibotta/android/verification/OfferQuantity;

    .line 64
    iget-object v4, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->offerQuantityDatabase:Lcom/ibotta/android/verification/OfferQuantityDatabase;

    invoke-interface {v4, v3}, Lcom/ibotta/android/verification/OfferQuantityDatabase;->getQuantity(I)I

    move-result v4

    invoke-virtual {p1, v4}, Lcom/ibotta/android/verification/OfferVerification;->setQuantity(I)V

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    .line 71
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->openVerificationDatabase()Lcom/ibotta/android/verification/VerificationDatabase;

    move-result-object v4

    .line 72
    invoke-virtual {p1}, Lcom/ibotta/android/verification/OfferVerification;->getVerifications()Ljava/util/List;

    move-result-object p1

    .line 74
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p2, :cond_2

    .line 75
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/verification/Verification;

    .line 76
    invoke-virtual {v0}, Lcom/ibotta/android/verification/Verification;->getId()I

    move-result v1

    invoke-interface {v4, v1}, Lcom/ibotta/android/verification/VerificationDatabase;->deleteVerification(I)V

    .line 77
    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    const-string p2, "Failed to trim verifications."

    .line 81
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->onFailure(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    :cond_2
    invoke-direct {p0, v4}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    goto :goto_5

    :goto_2
    invoke-direct {p0, v4}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    throw p1

    :cond_3
    if-eqz v1, :cond_4

    .line 90
    :try_start_2
    invoke-virtual {p0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->openVerificationDatabase()Lcom/ibotta/android/verification/VerificationDatabase;

    move-result-object v4

    .line 91
    invoke-interface {v4, v3}, Lcom/ibotta/android/verification/VerificationDatabase;->deleteVerifications(I)V
    :try_end_2
    .catch Lcom/ibotta/android/verification/VerificationDatabaseFatalException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 96
    :goto_3
    invoke-direct {p0, v4}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    goto :goto_5

    :catchall_1
    move-exception p1

    goto :goto_4

    :catch_1
    move-exception p1

    :try_start_3
    const-string p2, "Failed to trim verifications."

    .line 94
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/verification/VerificationManagerImpl;->onFailure(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    .line 96
    :goto_4
    invoke-direct {p0, v4}, Lcom/ibotta/android/verification/VerificationManagerImpl;->closeVerificationDatabase(Lcom/ibotta/android/verification/VerificationDatabase;)V

    throw p1

    :cond_4
    :goto_5
    return-void
.end method

.method public saveReceiptBarcodes([Ljava/lang/String;)V
    .locals 0

    .line 393
    iput-object p1, p0, Lcom/ibotta/android/verification/VerificationManagerImpl;->receiptBarcodes:[Ljava/lang/String;

    return-void
.end method

.method public saveRedemptionScannedVerification(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;Ljava/lang/String;)Lcom/ibotta/android/verification/OfferVerification;
    .locals 1

    const/4 v0, 0x0

    .line 157
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/verification/VerificationManagerImpl;->saveScannedVerification(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/ibotta/android/verification/OfferVerification;

    move-result-object p1

    return-object p1
.end method
