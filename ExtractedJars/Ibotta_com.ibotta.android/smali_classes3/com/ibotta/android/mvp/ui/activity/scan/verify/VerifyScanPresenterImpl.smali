.class public Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;
.super Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;
.source "VerifyScanPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdviceFields;
.implements Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl<",
        "Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;",
        ">;",
        "Lcom/ibotta/android/aop/tracking/advice/ScannedBarcodeAdviceFields;",
        "Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenter;"
    }
.end annotation


# static fields
.field private static MONITORED_MISMATCH_COUNT:I

.field private static MONITORED_MISMATCH_OFFER_ID:I

.field private static final SCAN_THROTTLE:J

.field private static final synthetic ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final barcodeMatcher:Lcom/ibotta/android/verification/BarcodeMatcher;

.field private giveUpCount:I

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private lastBarcode:Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

.field private lastScanEvent:J

.field private mode:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

.field private offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private offerId:I

.field private offerModel:Lcom/ibotta/api/model/OfferModel;

.field private offerVerification:Lcom/ibotta/android/verification/OfferVerification;

.field private final productGroupHelper:Lcom/ibotta/api/helper/offer/ProductGroupHelper;

.field private productGroupId:Ljava/lang/Integer;

.field private readyForScanResults:Z

.field private retailerId:Ljava/lang/Integer;

.field private scanMetaCriteria:Lcom/ibotta/api/model/offer/ScanMetaCriteria;

.field private final verificationManager:Lcom/ibotta/android/verification/VerificationManager;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->ajc$preClinit()V

    .line 45
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->SCAN_THROTTLE:J

    const/4 v0, 0x0

    .line 47
    sput v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->MONITORED_MISMATCH_OFFER_ID:I

    .line 48
    sput v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->MONITORED_MISMATCH_COUNT:I

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/ProductGroupHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/verification/BarcodeMatcher;Lcom/ibotta/android/graphql/GraphQLCallFactory;)V
    .locals 0

    .line 79
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/scan/AbstractScanPresenterImpl;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/tracking/Tracker;)V

    .line 81
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 82
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->productGroupHelper:Lcom/ibotta/api/helper/offer/ProductGroupHelper;

    .line 83
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    .line 84
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->barcodeMatcher:Lcom/ibotta/android/verification/BarcodeMatcher;

    .line 85
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    return-void
.end method

.method private static synthetic ajc$preClinit()V
    .locals 10

    .line 1
    new-instance v8, Lorg/aspectj/runtime/reflect/Factory;

    const-string v0, "VerifyScanPresenterImpl.java"

    const-class v1, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;

    invoke-direct {v8, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;-><init>(Ljava/lang/String;Ljava/lang/Class;)V

    const-string v9, "method-execution"

    const-string v1, "2"

    const-string v2, "tryToMatch"

    const-string v3, "com.ibotta.android.mvp.ui.activity.scan.verify.VerifyScanPresenterImpl"

    const-string v4, "com.ibotta.api.model.offer.ScanMetaCriteria:com.ibotta.android.apiandroid.barcode.BarcodeParcel"

    const-string v5, "scanMetaCriteria:scannedBarcode"

    const-string v6, ""

    const-string v7, "com.ibotta.android.verification.MatchOutcome"

    move-object v0, v8

    invoke-virtual/range {v0 .. v7}, Lorg/aspectj/runtime/reflect/Factory;->makeMethodSig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/aspectj/lang/reflect/MethodSignature;

    move-result-object v0

    const/16 v1, 0x11e

    invoke-virtual {v8, v9, v0, v1}, Lorg/aspectj/runtime/reflect/Factory;->makeSJP(Ljava/lang/String;Lorg/aspectj/lang/Signature;I)Lorg/aspectj/lang/JoinPoint$StaticPart;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    return-void
.end method

.method private finishWithSuccess()V
    .locals 2

    const/4 v0, 0x0

    .line 180
    sput v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->MONITORED_MISMATCH_COUNT:I

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerId:I

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;->finishWithSuccess(I)V

    return-void
.end method

.method private getScanMetaCriteria(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/api/model/offer/ScanMetaCriteria;
    .locals 3

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->mode:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    sget-object v1, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->VERIFY:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isCombo()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 272
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->productGroupHelper:Lcom/ibotta/api/helper/offer/ProductGroupHelper;

    .line 273
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getProductGroups()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->productGroupId:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 272
    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/helper/offer/ProductGroupHelper;->findById(Ljava/util/List;I)Lcom/ibotta/api/model/offer/ProductGroup;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    return-object p1
.end method

.method private getScannedCount()I
    .locals 4

    .line 331
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerVerification:Lcom/ibotta/android/verification/OfferVerification;

    invoke-virtual {v0}, Lcom/ibotta/android/verification/OfferVerification;->getVerifications()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/verification/Verification;

    .line 332
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->productGroupId:Ljava/lang/Integer;

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lcom/ibotta/android/verification/Verification;->getProductGroupId()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method private hasFinishedScanningSuccessfully(Lcom/ibotta/android/verification/MatchOutcome;)Z
    .locals 4

    .line 321
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->getScannedCount()I

    move-result v0

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->getScanCountRequired()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 322
    invoke-virtual {p1}, Lcom/ibotta/android/verification/MatchOutcome;->isMatch()Z

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_2

    .line 323
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->mode:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    sget-object v1, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->CHECK_PRODUCT:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    if-ne p1, v1, :cond_2

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    if-nez v0, :cond_4

    if-eqz p1, :cond_3

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :cond_4
    :goto_3
    return v2
.end method

.method private initProducts()V
    .locals 5

    .line 129
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/AppHelper;->getBestOfferImgUrl(Lcom/ibotta/api/model/OfferModel;)Ljava/lang/String;

    move-result-object v0

    .line 130
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->scanMetaCriteria:Lcom/ibotta/api/model/offer/ScanMetaCriteria;

    invoke-interface {v2}, Lcom/ibotta/api/model/offer/ScanMetaCriteria;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->getScanCountRequired()I

    move-result v3

    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->getScannedCount()I

    move-result v4

    invoke-interface {v1, v2, v0, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;->setup(Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method private resetMismatchTrackingIfNeeded()V
    .locals 2

    .line 258
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->giveUpCount:I

    if-lez v0, :cond_0

    sget v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->MONITORED_MISMATCH_OFFER_ID:I

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerId:I

    if-eq v0, v1, :cond_0

    .line 260
    sput v1, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->MONITORED_MISMATCH_OFFER_ID:I

    const/4 v0, 0x0

    .line 261
    sput v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->MONITORED_MISMATCH_COUNT:I

    :cond_0
    return-void
.end method

.method private resetVerificationIfCheckProduct()V
    .locals 2

    .line 252
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->mode:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    sget-object v1, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->CHECK_PRODUCT:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    if-ne v0, v1, :cond_0

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerId:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/verification/VerificationManager;->deleteByOfferId(Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method private saveVerification(Lcom/ibotta/android/verification/MatchOutcome;)V
    .locals 3

    .line 307
    invoke-virtual {p1}, Lcom/ibotta/android/verification/MatchOutcome;->isMatch()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/ibotta/android/verification/MatchOutcome;->isAlreadyTracked()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 311
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->mode:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    sget-object v1, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->VERIFY:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    if-ne v0, v1, :cond_1

    .line 312
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->productGroupId:Ljava/lang/Integer;

    .line 313
    invoke-virtual {p1}, Lcom/ibotta/android/verification/MatchOutcome;->getBarcode()Ljava/lang/String;

    move-result-object p1

    .line 312
    invoke-interface {v0, v1, v2, p1}, Lcom/ibotta/android/verification/VerificationManager;->saveRedemptionScannedVerification(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;Ljava/lang/String;)Lcom/ibotta/android/verification/OfferVerification;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerVerification:Lcom/ibotta/android/verification/OfferVerification;

    goto :goto_0

    .line 315
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->productGroupId:Ljava/lang/Integer;

    .line 316
    invoke-virtual {p1}, Lcom/ibotta/android/verification/MatchOutcome;->getBarcode()Ljava/lang/String;

    move-result-object p1

    .line 315
    invoke-interface {v0, v1, v2, p1}, Lcom/ibotta/android/verification/VerificationManager;->saveCheckProductScannedVerification(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;Ljava/lang/String;)Lcom/ibotta/android/verification/OfferVerification;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerVerification:Lcom/ibotta/android/verification/OfferVerification;

    :goto_0
    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method private showAlreadyMatched()V
    .locals 2

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->lastScanEvent:J

    .line 198
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;->showAlreadyMatched()V

    return-void
.end method

.method private showMatch()V
    .locals 2

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->lastScanEvent:J

    const/4 v0, 0x0

    .line 186
    sput v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->MONITORED_MISMATCH_COUNT:I

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;->showMatch()V

    return-void
.end method

.method private showMismatch()V
    .locals 2

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->lastScanEvent:J

    .line 192
    sget v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->MONITORED_MISMATCH_COUNT:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->MONITORED_MISMATCH_COUNT:I

    .line 193
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;->showMismatch()V

    return-void
.end method

.method private tryToMatch(Lcom/ibotta/api/model/offer/ScanMetaCriteria;Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)Lcom/ibotta/android/verification/MatchOutcome;
    .locals 4
    .annotation runtime Lcom/ibotta/android/aop/tracking/TrackingAround;
        value = .enum Lcom/ibotta/android/aop/tracking/TrackingType;->SCANNED_BARCODE:Lcom/ibotta/android/aop/tracking/TrackingType;
    .end annotation

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->ajc$tjp_0:Lorg/aspectj/lang/JoinPoint$StaticPart;

    invoke-static {v0, p0, p0, p1, p2}, Lorg/aspectj/runtime/reflect/Factory;->makeJP(Lorg/aspectj/lang/JoinPoint$StaticPart;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lorg/aspectj/lang/JoinPoint;

    move-result-object v0

    .line 286
    invoke-static {}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->aspectOf()Lcom/ibotta/android/aop/tracking/TrackingAspect;

    move-result-object v1

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const/4 v3, 0x1

    aput-object p1, v2, v3

    const/4 p1, 0x2

    aput-object p2, v2, p1

    const/4 p1, 0x3

    aput-object v0, v2, p1

    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl$AjcClosure1;

    invoke-direct {p1, v2}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl$AjcClosure1;-><init>([Ljava/lang/Object;)V

    const p2, 0x11010

    invoke-virtual {p1, p2}, Lorg/aspectj/runtime/internal/AroundClosure;->linkClosureAndJoinPoint(I)Lorg/aspectj/lang/ProceedingJoinPoint;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/aop/tracking/TrackingAspect;->around(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/verification/MatchOutcome;

    return-object p1
.end method

.method static final synthetic tryToMatch_aroundBody0(Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;Lcom/ibotta/api/model/offer/ScanMetaCriteria;Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;Lorg/aspectj/lang/JoinPoint;)Lcom/ibotta/android/verification/MatchOutcome;
    .locals 2

    .line 286
    new-instance p3, Lcom/ibotta/android/verification/MatchOutcome;

    invoke-direct {p3}, Lcom/ibotta/android/verification/MatchOutcome;-><init>()V

    if-nez p1, :cond_0

    return-object p3

    .line 291
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/offer/ScanMetaCriteria;->isMultiplesUnique()Z

    move-result p3

    .line 292
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->barcodeMatcher:Lcom/ibotta/android/verification/BarcodeMatcher;

    invoke-virtual {p2}, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->getUpc()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/verification/BarcodeMatcher;->tryToMatch(Lcom/ibotta/api/model/offer/ScanMetaCriteria;Ljava/lang/String;)Lcom/ibotta/android/verification/MatchOutcome;

    move-result-object p1

    if-eqz p3, :cond_1

    .line 295
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    iget p3, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerId:I

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->productGroupId:Ljava/lang/Integer;

    .line 296
    invoke-virtual {p1}, Lcom/ibotta/android/verification/MatchOutcome;->getBarcode()Ljava/lang/String;

    move-result-object v1

    .line 295
    invoke-interface {p2, p3, v0, v1}, Lcom/ibotta/android/verification/VerificationManager;->hasOfferVerification(ILjava/lang/Integer;Ljava/lang/String;)Z

    move-result p2

    .line 298
    invoke-virtual {p1, p2}, Lcom/ibotta/android/verification/MatchOutcome;->setAlreadyTracked(Z)V

    .line 301
    :cond_1
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->saveVerification(Lcom/ibotta/android/verification/MatchOutcome;)V

    return-object p1
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 90
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->readyForScanResults:Z

    .line 92
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 94
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 95
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOfferCall()Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;

    move-result-object v1

    .line 96
    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerId:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setOfferId(Ljava/lang/Integer;)V

    const/4 v2, 0x1

    .line 97
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 99
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 102
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getInstructions()Ljava/lang/String;
    .locals 1

    .line 216
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;->getBarcodeScanInstructions()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMode()Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;
    .locals 1

    .line 360
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->mode:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    return-object v0
.end method

.method public getOfferAmountType()Ljava/lang/String;
    .locals 1

    .line 370
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getOfferAmountType()Lcom/ibotta/api/model/offer/OfferAmountType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/api/model/offer/OfferAmountType;->getTrackingName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getOfferId()I
    .locals 1

    .line 365
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerId:I

    return v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 375
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getScanConfig()Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;
    .locals 2

    .line 203
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;-><init>()V

    .line 205
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->initWithDefaults()V

    .line 206
    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->EAN13:Lcom/ibotta/android/barcode/ScanType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->addScanType(Lcom/ibotta/android/barcode/ScanType;)V

    .line 207
    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->EAN8:Lcom/ibotta/android/barcode/ScanType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->addScanType(Lcom/ibotta/android/barcode/ScanType;)V

    .line 208
    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->UPCA:Lcom/ibotta/android/barcode/ScanType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->addScanType(Lcom/ibotta/android/barcode/ScanType;)V

    .line 209
    sget-object v1, Lcom/ibotta/android/barcode/ScanType;->UPCE:Lcom/ibotta/android/barcode/ScanType;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/scan/ScanConfig;->addScanType(Lcom/ibotta/android/barcode/ScanType;)V

    return-object v0
.end method

.method public getScanCountRequired()I
    .locals 2

    .line 343
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->mode:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    sget-object v1, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->VERIFY:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    if-ne v0, v1, :cond_1

    .line 344
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->scanMetaCriteria:Lcom/ibotta/api/model/offer/ScanMetaCriteria;

    invoke-interface {v0}, Lcom/ibotta/api/model/offer/ScanMetaCriteria;->isMultiples()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 345
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->scanMetaCriteria:Lcom/ibotta/api/model/offer/ScanMetaCriteria;

    invoke-interface {v0}, Lcom/ibotta/api/model/offer/ScanMetaCriteria;->getMultiplesCount()S

    move-result v0

    goto :goto_0

    .line 346
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerVerification:Lcom/ibotta/android/verification/OfferVerification;

    invoke-virtual {v0}, Lcom/ibotta/android/verification/OfferVerification;->getQuantity()I

    move-result v0

    if-lez v0, :cond_1

    .line 347
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerVerification:Lcom/ibotta/android/verification/OfferVerification;

    invoke-virtual {v0}, Lcom/ibotta/android/verification/OfferVerification;->getQuantity()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    if-ge v0, v1, :cond_2

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public isBarcodeHelpNeeded()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected isReadyForScanResults()Z
    .locals 1

    .line 135
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->readyForScanResults:Z

    return v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 109
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method protected onBarcodesParcelized(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;",
            ">;)V"
        }
    .end annotation

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    .line 141
    iget-wide v2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->lastScanEvent:J

    sub-long/2addr v0, v2

    sget-wide v2, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->SCAN_THROTTLE:J

    const/4 v4, 0x0

    cmp-long v5, v0, v2

    if-gez v5, :cond_0

    const-string p1, "Ignoring barcode scan due to throttle"

    .line 143
    new-array v0, v4, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 147
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 148
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->lastBarcode:Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    .line 151
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->scanMetaCriteria:Lcom/ibotta/api/model/offer/ScanMetaCriteria;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->lastBarcode:Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->tryToMatch(Lcom/ibotta/api/model/offer/ScanMetaCriteria;Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)Lcom/ibotta/android/verification/MatchOutcome;

    move-result-object p1

    .line 152
    invoke-virtual {p1}, Lcom/ibotta/android/verification/MatchOutcome;->isMatch()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 153
    invoke-virtual {p1}, Lcom/ibotta/android/verification/MatchOutcome;->isAlreadyTracked()Z

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 154
    :goto_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->hasFinishedScanningSuccessfully(Lcom/ibotta/android/verification/MatchOutcome;)Z

    move-result p1

    .line 156
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->getScanCountRequired()I

    move-result v3

    if-le v3, v1, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_4

    if-eqz v2, :cond_4

    const/4 v3, 0x1

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :goto_2
    if-nez v3, :cond_5

    if-nez v2, :cond_5

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    .line 160
    :goto_3
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;

    invoke-interface {v2}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;->playBeepVibrate()V

    if-eqz v0, :cond_6

    .line 163
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->initProducts()V

    :cond_6
    if-eqz p1, :cond_7

    .line 167
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->finishWithSuccess()V

    goto :goto_4

    :cond_7
    if-eqz v3, :cond_8

    .line 169
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->showMatch()V

    goto :goto_4

    :cond_8
    if-eqz v1, :cond_9

    .line 171
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->showMismatch()V

    goto :goto_4

    :cond_9
    if-eqz v0, :cond_a

    .line 173
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->showAlreadyMatched()V

    .line 176
    :cond_a
    :goto_4
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->onScanResultDisplayed()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 2

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;

    .line 116
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;->getOfferAsModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    if-eqz v0, :cond_0

    .line 119
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->getScanMetaCriteria(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/api/model/offer/ScanMetaCriteria;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->scanMetaCriteria:Lcom/ibotta/api/model/offer/ScanMetaCriteria;

    .line 120
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/verification/VerificationManager;->getOfferVerification(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/verification/OfferVerification;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerVerification:Lcom/ibotta/android/verification/OfferVerification;

    .line 122
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->initProducts()V

    const/4 v0, 0x1

    .line 124
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->readyForScanResults:Z

    :cond_0
    return-void
.end method

.method public onScanResultDisplayed()V
    .locals 3

    .line 241
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->giveUpCount:I

    if-gtz v0, :cond_0

    return-void

    .line 245
    :cond_0
    sget v1, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->MONITORED_MISMATCH_COUNT:I

    if-lt v1, v0, :cond_1

    .line 246
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->lastBarcode:Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerId:I

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanView;->finishWithGaveUp(Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;I)V

    const/4 v0, 0x0

    .line 247
    sput v0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->MONITORED_MISMATCH_COUNT:I

    :cond_1
    return-void
.end method

.method public setParams(Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;)V
    .locals 1

    .line 226
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->getVerifyBarcodeMode()Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->mode:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    .line 227
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->getOfferId()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->offerId:I

    .line 228
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->getProductGroupId()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->productGroupId:Ljava/lang/Integer;

    .line 229
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->getGiveUpCount()I

    move-result p1

    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->giveUpCount:I

    .line 231
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->resetVerificationIfCheckProduct()V

    .line 232
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->resetMismatchTrackingIfNeeded()V

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 237
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/scan/verify/VerifyScanPresenterImpl;->retailerId:Ljava/lang/Integer;

    return-void
.end method
