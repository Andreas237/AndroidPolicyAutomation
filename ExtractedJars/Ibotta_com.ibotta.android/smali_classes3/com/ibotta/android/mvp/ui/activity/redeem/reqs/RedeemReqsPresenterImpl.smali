.class public Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "RedeemReqsPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;"
    }
.end annotation


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private noUnlocksFound:Z

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private receiptVerificationType:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final redeemReqsReducer:Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private final storageSiloState:Lcom/ibotta/android/state/xprocess/StorageSiloState;

.field private unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final verificationManager:Lcom/ibotta/android/verification/VerificationManager;

.field private final windfallGatekeeper:Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;

.field private final windfallHelper:Lcom/ibotta/android/windfall/helper/WindfallHelper;

.field private final windfallRecognizerCallback:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/android/state/xprocess/StorageSiloState;Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;Lcom/ibotta/android/windfall/helper/WindfallHelper;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;)V
    .locals 0

    .line 95
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 97
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 98
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    .line 99
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->storageSiloState:Lcom/ibotta/android/state/xprocess/StorageSiloState;

    .line 100
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->windfallGatekeeper:Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;

    .line 101
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->windfallHelper:Lcom/ibotta/android/windfall/helper/WindfallHelper;

    .line 102
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 103
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 104
    iput-object p10, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->windfallRecognizerCallback:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;

    .line 105
    iput-object p12, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->redeemReqsReducer:Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;

    .line 108
    invoke-interface {p11}, Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcherFactory;->forAnyOffers()Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;

    move-result-object p1

    invoke-virtual {p7, p1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->invalidate(Lcom/ibotta/android/graphql/cache/matchers/CacheKeyMatcher;)V

    .line 109
    invoke-interface {p10, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;->attach(Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenter;)V

    return-void
.end method

.method private initGeneralInstructions()V
    .locals 4

    .line 230
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->receiptVerificationType:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    const v1, 0x7f110586

    const v2, 0x7f110583

    if-eqz v0, :cond_0

    .line 231
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$redeem$reqs$RedeemReqsPresenterImpl$ReceiptVerificationType:[I

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->receiptVerificationType:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;->ordinal()I

    move-result v3

    aget v0, v0, v3

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const v2, 0x7f110584

    const v1, 0x7f110587

    goto :goto_0

    :pswitch_1
    const v2, 0x7f110582

    const v1, 0x7f110585

    .line 247
    :cond_0
    :goto_0
    :pswitch_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->redeemReqsReducer:Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;

    invoke-virtual {v3, v2}, Lcom/ibotta/android/redeem/reqs/RedeemReqsReducer;->createTitle(I)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->setGeneralInstructionsTitle(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    .line 248
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->setGeneralInstructions(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private initImageResourceId()V
    .locals 3

    .line 209
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->receiptVerificationType:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    const v1, 0x7f0802a0

    if-eqz v0, :cond_0

    .line 210
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$redeem$reqs$RedeemReqsPresenterImpl$ReceiptVerificationType:[I

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->receiptVerificationType:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;->ordinal()I

    move-result v2

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const v1, 0x7f08029b

    goto :goto_0

    :pswitch_1
    const v1, 0x7f08029f

    .line 223
    :cond_0
    :goto_0
    :pswitch_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->setImage(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private initVerificationType()V
    .locals 3

    .line 192
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    .line 193
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRetailerBarcodeConfigurationParcel()Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;

    move-result-object v1

    .line 195
    sget-object v2, Lcom/ibotta/api/model/common/VerificationType;->RECEIPT:Lcom/ibotta/api/model/common/VerificationType;

    if-eq v0, v2, :cond_1

    if-eqz v1, :cond_1

    .line 196
    invoke-virtual {v1}, Lcom/ibotta/android/apiandroid/retailer/RetailerBarcodeConfigurationParcel;->isQrCode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;->QRCODE:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->receiptVerificationType:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    goto :goto_0

    .line 199
    :cond_0
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;->BARCODE:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->receiptVerificationType:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    goto :goto_0

    .line 202
    :cond_1
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;->IMAGE:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->receiptVerificationType:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl$ReceiptVerificationType;

    :goto_0
    return-void
.end method

.method private processWalmartQrCodeWithWindfall([Ljava/lang/String;)V
    .locals 8

    if-eqz p1, :cond_3

    .line 347
    array-length v0, p1

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->windfallRecognizerCallback:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 v0, 0x0

    .line 354
    array-length v1, p1

    const/4 v2, 0x0

    move-object v3, v0

    const/4 v0, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v0, v1, :cond_1

    aget-object v5, p1, v0

    .line 356
    :try_start_0
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    const-string v6, "Walmart QR code URI: %1$s"

    .line 357
    new-array v7, v4, [Ljava/lang/Object;

    aput-object v3, v7, v2

    invoke-static {v6, v7}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v6

    const-string v7, "Failed to parse Uri from: %1$s"

    .line 359
    new-array v4, v4, [Ljava/lang/Object;

    aput-object v5, v4, v2

    invoke-static {v6, v7, v4}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz v3, :cond_2

    const-string p1, "Submitting QR code to Windfall"

    .line 364
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    invoke-static {}, Lcom/microblink/ScanOptions;->newBuilder()Lcom/microblink/ScanOptions$Builder;

    move-result-object p1

    sget-object v0, Lcom/microblink/Retailer;->WALMART_QR:Lcom/microblink/Retailer;

    .line 367
    invoke-virtual {p1, v0}, Lcom/microblink/ScanOptions$Builder;->retailer(Lcom/microblink/Retailer;)Lcom/microblink/ScanOptions$Builder;

    move-result-object p1

    .line 368
    invoke-static {}, Lcom/microblink/FrameCharacteristics;->newBuilder()Lcom/microblink/FrameCharacteristics$Builder;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/microblink/FrameCharacteristics$Builder;->storeFrames(Z)Lcom/microblink/FrameCharacteristics$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/microblink/FrameCharacteristics$Builder;->externalStorage(Z)Lcom/microblink/FrameCharacteristics$Builder;

    move-result-object v0

    .line 369
    invoke-virtual {v0}, Lcom/microblink/FrameCharacteristics$Builder;->build()Lcom/microblink/FrameCharacteristics;

    move-result-object v0

    .line 368
    invoke-virtual {p1, v0}, Lcom/microblink/ScanOptions$Builder;->frameCharacteristics(Lcom/microblink/FrameCharacteristics;)Lcom/microblink/ScanOptions$Builder;

    move-result-object p1

    .line 371
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showProcessingWalmartQrCode()V

    .line 373
    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v0

    invoke-virtual {p1}, Lcom/microblink/ScanOptions$Builder;->build()Lcom/microblink/ScanOptions;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/microblink/Recognizer;->initialize(Lcom/microblink/ScanOptions;)V

    .line 375
    :try_start_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-static {}, Lcom/microblink/Recognizer;->getInstance()Lcom/microblink/Recognizer;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->windfallRecognizerCallback:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;

    invoke-interface {p1, v0, v3, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->recognizeWalmartQR(Lcom/microblink/Recognizer;Landroid/net/Uri;Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    const-string v0, "Failed to recognize QR code using Windfall."

    .line 377
    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallQrException;

    const-string v2, "Windfall QR code processing failed."

    invoke-direct {v1, v2, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallQrException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 380
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->showReceiptCapture()V

    goto :goto_2

    .line 384
    :cond_2
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->showReceiptCapture()V

    :goto_2
    return-void

    .line 348
    :cond_3
    :goto_3
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->showReceiptCapture()V

    return-void
.end method

.method private showReceiptCapture()V
    .locals 2

    .line 339
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->windfallGatekeeper:Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;->isSupported(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 340
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showOcrReceiptCaptureForResult(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    goto :goto_0

    .line 342
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showStandardReceiptCaptureForResult(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    :goto_0
    return-void
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

    .line 123
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 125
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 126
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createUnlockedOffersCall()Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;

    move-result-object v1

    const v2, 0x7fffffff

    .line 127
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->setLimit(Ljava/lang/Integer;)V

    const/4 v2, 0x1

    .line 128
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 130
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 133
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 3

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-nez v0, :cond_0

    .line 184
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/IllegalRetailerParcelStateException;

    const-string v2, "retailerParcel is null!"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/IllegalRetailerParcelStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showUnknownErrorMessage()V

    .line 187
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 145
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onContinueClicked()V
    .locals 2

    .line 258
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->disableContinueButton()V

    .line 261
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->storageSiloState:Lcom/ibotta/android/state/xprocess/StorageSiloState;

    invoke-virtual {v0}, Lcom/ibotta/android/state/xprocess/StorageSiloState;->destroyStorageSilos()V

    .line 263
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 264
    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->BARCODE:Lcom/ibotta/api/model/common/VerificationType;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 265
    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getVerificationType()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/common/VerificationType;->RECEIPT_BARCODE:Lcom/ibotta/api/model/common/VerificationType;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    .line 267
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-eqz v0, :cond_2

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showReceiptScannerForResult(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    goto :goto_2

    .line 270
    :cond_2
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->showReceiptCapture()V

    :goto_2
    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->windfallRecognizerCallback:Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/WindfallRecognizerCallback;->dispose()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 151
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "unlockedOffersJob is null!"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showUnknownErrorDialog()V

    return-void

    .line 157
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;

    .line 159
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 160
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v2

    .line 159
    invoke-interface {v1, v0, v2}, Lcom/ibotta/api/helper/offer/OfferHelper;->findActiveByRetailer(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    .line 161
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    invoke-interface {v1, v0}, Lcom/ibotta/android/verification/VerificationManager;->getOfferVerifications(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x1

    .line 163
    iput-boolean v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->noUnlocksFound:Z

    .line 164
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/verification/OfferVerification;

    .line 165
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/verification/OfferVerification;->isVerified(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    .line 166
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->noUnlocksFound:Z

    :cond_2
    return-void
.end method

.method public onNoSavedState()V
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    invoke-interface {v0}, Lcom/ibotta/android/verification/VerificationManager;->deleteReceiptBarcodes()V

    return-void
.end method

.method public onOcrReceiptCaptureCancelled()V
    .locals 1

    .line 314
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->finish()V

    return-void
.end method

.method public onOcrReceiptCaptureSuccess(I)V
    .locals 1

    .line 303
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->noUnlocksFound:Z

    if-eqz v0, :cond_0

    if-gtz p1, :cond_0

    .line 304
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showVerifyRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    goto :goto_0

    .line 306
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showVerifiedRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 309
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->finish()V

    return-void
.end method

.method public onRebatesFoundDisplayed()V
    .locals 2

    .line 335
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showVerifiedRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public onReceiptBarcodeCaptureCancelled()V
    .locals 1

    .line 297
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    invoke-interface {v0}, Lcom/ibotta/android/verification/VerificationManager;->deleteReceiptBarcodes()V

    .line 298
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->finish()V

    return-void
.end method

.method public onReceiptBarcodeCapturedSuccess([Ljava/lang/String;)V
    .locals 2

    .line 282
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/verification/VerificationManager;->saveReceiptBarcodes([Ljava/lang/String;)V

    .line 284
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->windfallGatekeeper:Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/windfall/gatekeeper/WindfallGatekeeper;->isWalmartQrCodeSupported(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 285
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->processWalmartQrCodeWithWindfall([Ljava/lang/String;)V

    goto :goto_0

    .line 286
    :cond_0
    iget-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->noUnlocksFound:Z

    if-eqz p1, :cond_1

    .line 287
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showVerifyRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 288
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->finish()V

    goto :goto_0

    .line 290
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showVerifiedRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 291
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->finish()V

    :goto_0
    return-void
.end method

.method public onStandardReceiptCaptureCancelled()V
    .locals 1

    .line 330
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->finish()V

    return-void
.end method

.method public onStandardReceiptCaptureSuccess()V
    .locals 2

    .line 319
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->noUnlocksFound:Z

    if-eqz v0, :cond_0

    .line 320
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showVerifyRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    goto :goto_0

    .line 322
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showVerifiedRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 325
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->finish()V

    return-void
.end method

.method public onStart()V
    .locals 2

    .line 114
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onStart()V

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    new-instance v1, Lcom/ibotta/android/api/windfall/WindfallResultsCall;

    invoke-direct {v1}, Lcom/ibotta/android/api/windfall/WindfallResultsCall;-><init>()V

    invoke-interface {v0, v1}, Lcom/ibotta/android/appcache/AppCache;->remove(Lcom/ibotta/api/CacheableApiCall;)V

    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 3

    .line 428
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 430
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;

    if-eqz v0, :cond_3

    .line 431
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostResponse;

    .line 432
    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostResponse;->getReceipt()Lcom/ibotta/api/model/receipt/Receipt;

    move-result-object p1

    .line 433
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/Receipt;->getVerifiedOffers()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 438
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/offer/Offer;

    .line 439
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    invoke-interface {v2, v1}, Lcom/ibotta/android/verification/VerificationManager;->savePreverified(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/verification/OfferVerification;

    goto :goto_0

    .line 442
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    :cond_1
    if-lez v0, :cond_2

    .line 446
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showRebatesFound(I)V

    goto :goto_1

    .line 448
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showVerifyRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public onTakePhotoInstead([Ljava/lang/String;)V
    .locals 1

    .line 276
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/verification/VerificationManager;->saveReceiptBarcodes([Ljava/lang/String;)V

    .line 277
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->showReceiptCapture()V

    return-void
.end method

.method public onWalmartQrCodeProcessedFailed(Ljava/lang/Throwable;)V
    .locals 2

    .line 413
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-eqz v0, :cond_0

    .line 414
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->hideProcessingWalmartQrCode()V

    :cond_0
    const-string v0, "Windfall scan failed."

    const/4 v1, 0x0

    .line 417
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 423
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->showReceiptCapture()V

    return-void
.end method

.method public onWalmartQrCodeProcessedSuccessfully(Lcom/microblink/ScanResults;)V
    .locals 2

    .line 391
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->hideProcessingWalmartQrCode()V

    const-string v0, "Windfall scanned Walmart QR code and receipt successfully."

    const/4 v1, 0x0

    .line 393
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->windfallHelper:Lcom/ibotta/android/windfall/helper/WindfallHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/android/windfall/helper/WindfallHelper;->saveWindfallResultsForLater(Lcom/microblink/ScanResults;)Lcom/ibotta/android/api/windfall/WindfallResultsResponse;

    move-result-object p1

    .line 395
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->windfallHelper:Lcom/ibotta/android/windfall/helper/WindfallHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/windfall/helper/WindfallHelper;->createVerificationCallIfNeeded(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Lcom/ibotta/android/api/windfall/WindfallResultsResponse;)Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsVerifyPostCall;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 399
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    goto :goto_0

    .line 400
    :cond_0
    iget-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->noUnlocksFound:Z

    if-eqz p1, :cond_1

    .line 401
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showVerifyRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 402
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->finish()V

    goto :goto_0

    .line 404
    :cond_1
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->showVerifiedRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 405
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsView;->finish()V

    :goto_0
    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 176
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->initVerificationType()V

    .line 177
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->initImageResourceId()V

    .line 178
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/reqs/RedeemReqsPresenterImpl;->initGeneralInstructions()V

    return-void
.end method
