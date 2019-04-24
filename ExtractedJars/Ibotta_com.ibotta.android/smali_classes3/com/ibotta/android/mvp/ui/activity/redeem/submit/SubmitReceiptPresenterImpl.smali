.class public Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "SubmitReceiptPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl$FilenameComparator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenter;"
    }
.end annotation


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

.field private final brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field private final cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private final handler:Landroid/os/Handler;

.field private final ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private final receiptSubmissionHelper:Lcom/ibotta/android/submission/ReceiptSubmissionHelper;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private state:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;

.field private submissionStartTime:J

.field private unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final userState:Lcom/ibotta/android/state/user/UserState;

.field private final verificationManager:Lcom/ibotta/android/verification/VerificationManager;

.field private verifiedAmount:F

.field private windfallResultsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/verification/VerificationManager;Landroid/os/Handler;Lcom/ibotta/android/submission/ReceiptSubmissionHelper;Lcom/ibotta/android/tracking/braze/BrazeTracking;Lcom/ibotta/android/graphql/cache/IbottaApolloCache;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/tracking/timing/AppTimingTracker;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V
    .locals 0

    .line 98
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 100
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 101
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 102
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    .line 103
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->handler:Landroid/os/Handler;

    .line 104
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->receiptSubmissionHelper:Lcom/ibotta/android/submission/ReceiptSubmissionHelper;

    .line 105
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    .line 106
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    .line 107
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 108
    iput-object p10, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    .line 109
    iput-object p11, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    .line 110
    iput-object p12, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 111
    iput-object p13, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    .line 113
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;

    invoke-direct {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;

    .line 114
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;

    sget-object p2, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->UNKNOWN:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;->setSubmitReceiptStatusEnum(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;)V

    return-void
.end method

.method private debugReceiptParams(Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;)V
    .locals 4

    .line 501
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v0}, Lcom/ibotta/android/profile/BuildProfile;->isDebugReceiptCapture()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 505
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 507
    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getOfferDataList()Ljava/util/List;

    move-result-object p1

    .line 508
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;

    const-string v2, "Offer: "

    .line 509
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getOfferId()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    .line 511
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Offer UPCs: "

    .line 513
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getUpcs()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 515
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ","

    .line 516
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v2, "\n"

    .line 518
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Product Group Count: "

    .line 520
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getProductGroupDataList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    .line 522
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    invoke-virtual {v1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getProductGroupDataList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;

    const-string v3, "Product Group: "

    .line 525
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;->getProductGroupId()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "\n"

    .line 527
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "Product Group UPCs: "

    .line 529
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 530
    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;->getUpcs()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 531
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ","

    .line 532
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_2
    const-string v2, "\n"

    .line 534
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    const-string v1, "\n"

    .line 537
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 540
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private getOfferDataList(Ljava/util/Map;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/android/verification/OfferVerification;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;",
            ">;"
        }
    .end annotation

    .line 443
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 445
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/verification/OfferVerification;

    .line 446
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/verification/OfferVerification;->isVerified(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 451
    :cond_0
    new-instance v2, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;

    invoke-direct {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;-><init>()V

    .line 452
    invoke-virtual {v1}, Lcom/ibotta/android/verification/OfferVerification;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v3

    invoke-interface {v3}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->setOfferId(I)V

    .line 453
    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getProductGroupDataList()Ljava/util/List;

    move-result-object v3

    invoke-direct {p0, v2, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->getProductGroupDataList(Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;Lcom/ibotta/android/verification/OfferVerification;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 456
    invoke-virtual {v1}, Lcom/ibotta/android/verification/OfferVerification;->getOcrVerifiedCount()I

    move-result v3

    if-lez v3, :cond_1

    .line 458
    invoke-virtual {v1}, Lcom/ibotta/android/verification/OfferVerification;->getOcrVerifiedCount()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->setSubmittedCount(I)V

    goto :goto_1

    .line 459
    :cond_1
    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getUpcs()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 461
    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getUpcs()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->setSubmittedCount(I)V

    goto :goto_1

    .line 464
    :cond_2
    invoke-virtual {v1}, Lcom/ibotta/android/verification/OfferVerification;->getQuantity()I

    move-result v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->setSubmittedCount(I)V

    .line 467
    :goto_1
    invoke-virtual {v1}, Lcom/ibotta/android/verification/OfferVerification;->isPreverified()Z

    move-result v1

    invoke-virtual {v2, v1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->setVerified(Z)V

    .line 469
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method private getProductGroupDataList(Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;Lcom/ibotta/android/verification/OfferVerification;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;",
            "Lcom/ibotta/android/verification/OfferVerification;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;",
            ">;"
        }
    .end annotation

    .line 476
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 478
    invoke-virtual {p2}, Lcom/ibotta/android/verification/OfferVerification;->getVerifications()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/verification/Verification;

    .line 479
    invoke-virtual {v1}, Lcom/ibotta/android/verification/Verification;->getProductGroupId()Ljava/lang/Integer;

    move-result-object v2

    if-nez v2, :cond_1

    .line 481
    invoke-virtual {v1}, Lcom/ibotta/android/verification/Verification;->getScannedData()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/ibotta/android/verification/Verification;->getScannedData()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 482
    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->getUpcs()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1}, Lcom/ibotta/android/verification/Verification;->getScannedData()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 486
    :cond_1
    new-instance v2, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;

    invoke-direct {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;-><init>()V

    .line 487
    invoke-virtual {v1}, Lcom/ibotta/android/verification/Verification;->getProductGroupId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;->setProductGroupId(I)V

    .line 489
    invoke-virtual {v1}, Lcom/ibotta/android/verification/Verification;->getScannedData()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v1}, Lcom/ibotta/android/verification/Verification;->getScannedData()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_2

    .line 490
    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;->getUpcs()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Lcom/ibotta/android/verification/Verification;->getScannedData()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 493
    :cond_2
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method private getReceiptImageFiles()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 428
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;->getReceiptSilo()Lcom/ibotta/android/commons/disk/StorageSilo;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 432
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/commons/disk/StorageSilo;->listFiles()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 436
    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl$FilenameComparator;

    invoke-direct {v2, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl$FilenameComparator;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl$1;)V

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    return-object v0
.end method

.method private getSuccessMessage(Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;)Ljava/lang/String;
    .locals 0
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 361
    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;->getUploadMessage()Lcom/ibotta/api/model/receipt/UploadMessage;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 366
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/receipt/UploadMessage;->getBody()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private handleProgress(JJ)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-gtz v2, :cond_0

    return-void

    :cond_0
    long-to-float p1, p1

    long-to-float p2, p3

    div-float/2addr p1, p2

    const p2, 0x3f7d70a4    # 0.99f

    cmpl-float p3, p1, p2

    if-lez p3, :cond_1

    const p1, 0x3f7d70a4    # 0.99f

    .line 250
    :cond_1
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->handler:Landroid/os/Handler;

    new-instance p3, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/-$$Lambda$SubmitReceiptPresenterImpl$QzFT9Oma48QUK2hZLl66T51Stw8;

    invoke-direct {p3, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/-$$Lambda$SubmitReceiptPresenterImpl$QzFT9Oma48QUK2hZLl66T51Stw8;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;F)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic lambda$6L7J9EJhVsw8u3Yesf7ECwdaGDQ(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;JJ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->handleProgress(JJ)V

    return-void
.end method

.method public static synthetic lambda$handleProgress$0(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;F)V
    .locals 1

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    if-eqz v0, :cond_0

    .line 252
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;->setSubmittingProgress(F)V

    :cond_0
    return-void
.end method

.method private onFailed()V
    .locals 1

    .line 356
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;->showFailed()V

    return-void
.end method

.method private onSubmitted()V
    .locals 1

    .line 343
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;->showSubmitted()V

    return-void
.end method

.method private onSubmitting()V
    .locals 1

    .line 339
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;->showSubmitting()V

    return-void
.end method

.method private onSuccess()V
    .locals 2

    .line 347
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->ibottaApolloCache:Lcom/ibotta/android/graphql/cache/IbottaApolloCache;

    invoke-virtual {v0}, Lcom/ibotta/android/graphql/cache/IbottaApolloCache;->clearAll()V

    .line 349
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->verifiedAmount:F

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackReceiptUploaded(F)V

    .line 350
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->brazeTracking:Lcom/ibotta/android/tracking/braze/BrazeTracking;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->verifiedAmount:F

    invoke-interface {v0, v1}, Lcom/ibotta/android/tracking/braze/BrazeTracking;->trackReceiptEarningsTenPlus(F)V

    .line 352
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;->showSuccess()V

    return-void
.end method

.method private startSubmission()V
    .locals 3

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 165
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "unlockedOffersJob is null!"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;->showUnknownErrorDialog()V

    return-void

    .line 171
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;

    .line 173
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 174
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLResponse;->getOffersAsModels()Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v2

    .line 173
    invoke-interface {v1, v0, v2}, Lcom/ibotta/api/helper/offer/OfferHelper;->findActiveByRetailer(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    .line 176
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    .line 177
    invoke-interface {v1, v0}, Lcom/ibotta/android/verification/VerificationManager;->getOfferVerifications(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    .line 179
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->windfallResultsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 180
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "windfallResultsJob is null!"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;->showUnknownErrorDialog()V

    return-void

    .line 185
    :cond_1
    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;

    .line 189
    invoke-virtual {v1}, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;->getWindfallResultsJson()Ljava/lang/String;

    move-result-object v2

    .line 190
    invoke-virtual {v1}, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;->getWindfallResultsSignature()Ljava/lang/String;

    move-result-object v1

    .line 187
    invoke-direct {p0, v0, v2, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->startSubmission(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private startSubmission(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/android/verification/OfferVerification;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "Starting receipt submission."

    const/4 v1, 0x0

    .line 197
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->getReceiptImageFiles()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 204
    :cond_0
    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->SUBMITTING:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    invoke-virtual {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->setStatus(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;)V

    .line 206
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    invoke-interface {v2}, Lcom/ibotta/android/verification/VerificationManager;->getReceiptBarcodes()[Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 207
    array-length v3, v2

    if-lez v3, :cond_1

    aget-object v1, v2, v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 209
    :goto_0
    new-instance v2, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;

    invoke-direct {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;-><init>()V

    .line 210
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->setCustomerId(I)V

    .line 211
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->receiptSubmissionHelper:Lcom/ibotta/android/submission/ReceiptSubmissionHelper;

    invoke-interface {v3}, Lcom/ibotta/android/submission/ReceiptSubmissionHelper;->getSubmissionId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->setSubmissionId(Ljava/lang/String;)V

    .line 212
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v3}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->setRetailerId(I)V

    .line 213
    invoke-virtual {v2, v1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->setReceiptScanContent(Ljava/lang/String;)V

    if-eqz p2, :cond_2

    if-eqz p3, :cond_2

    .line 216
    new-instance v1, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;

    invoke-direct {v1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;-><init>()V

    const-string v3, "Windfall"

    .line 217
    invoke-virtual {v1, v3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;->setSource(Ljava/lang/String;)V

    .line 218
    invoke-virtual {v1, p2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;->setData(Ljava/lang/String;)V

    .line 219
    invoke-virtual {v1, p3}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;->setSignature(Ljava/lang/String;)V

    .line 221
    invoke-virtual {v2, v1}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->setReceiptData(Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ReceiptData;)V

    .line 224
    :cond_2
    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getReceipts()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 225
    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;->getOfferDataList()Ljava/util/List;

    move-result-object p2

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->getOfferDataList(Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 227
    invoke-direct {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->debugReceiptParams(Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;)V

    .line 229
    new-instance p1, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;

    invoke-direct {p1, v2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;-><init>(Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$CallParams;)V

    .line 230
    new-instance p2, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/-$$Lambda$SubmitReceiptPresenterImpl$6L7J9EJhVsw8u3Yesf7ECwdaGDQ;

    invoke-direct {p2, p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/-$$Lambda$SubmitReceiptPresenterImpl$6L7J9EJhVsw8u3Yesf7ECwdaGDQ;-><init>(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;)V

    invoke-virtual {p1, p2}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->setProgressListener(Lcom/ibotta/api/execution/ApiUploadProgressListener;)V

    .line 232
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {p2}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide p2

    iput-wide p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->submissionStartTime:J

    .line 233
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method private trackDetailedSubmissionError(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 4

    .line 293
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;

    if-nez v0, :cond_0

    return-void

    .line 297
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;

    .line 299
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to submit receipt:\n"

    .line 300
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;->getParams()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 304
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 305
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " = "

    .line 306
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    .line 308
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 313
    :cond_1
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptException;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getException()Lcom/ibotta/api/ApiException;

    move-result-object p1

    invoke-direct {v2, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v2}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

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

    .line 129
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 131
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 132
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createUnlockedOffersCall()Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;

    move-result-object v1

    const v2, 0x7fffffff

    .line 133
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->setLimit(Ljava/lang/Integer;)V

    const/4 v2, 0x1

    .line 134
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOffersGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 136
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 138
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->windfallResultsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 139
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/android/api/windfall/WindfallResultsCall;

    invoke-direct {v2}, Lcom/ibotta/android/api/windfall/WindfallResultsCall;-><init>()V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->windfallResultsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 142
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 143
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->windfallResultsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public getPersistedState()Ljava/lang/Object;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;

    return-object v0
.end method

.method public getRetailerParcel()Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .locals 1

    .line 381
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-object v0
.end method

.method public getVerifiedAmount()F
    .locals 1

    .line 391
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->verifiedAmount:F

    return v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 150
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->unlockedOffersJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 151
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->windfallResultsJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onCancelClicked()V
    .locals 1

    .line 408
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;->finish()V

    return-void
.end method

.method public onDoneClicked()V
    .locals 1

    .line 402
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;->showAccount()V

    .line 403
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;->finish()V

    return-void
.end method

.method public onFailedToGetReceiptSilo()V
    .locals 1

    .line 423
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->FAILED:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->setStatus(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 2

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;->getSubmitReceiptStatusEnum()Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->UNKNOWN:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    if-ne v0, v1, :cond_0

    .line 157
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->startSubmission()V

    goto :goto_0

    .line 159
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;->getSubmitReceiptStatusEnum()Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->setStatus(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;)V

    :goto_0
    return-void
.end method

.method public onRedeemAnotherClicked()V
    .locals 2

    .line 396
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;->showRedeemRequirements(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 397
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;->finish()V

    return-void
.end method

.method public onRetryClicked()V
    .locals 0

    .line 413
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->startSubmission()V

    return-void
.end method

.method protected onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 282
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 284
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getException()Lcom/ibotta/api/ApiException;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 285
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->trackDetailedSubmissionError(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 288
    :cond_0
    sget-object p1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->FAILED:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->setStatus(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;)V

    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 4

    .line 259
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 262
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->submissionStartTime:J

    sub-long/2addr v0, v2

    .line 263
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->appTimingTracker:Lcom/ibotta/android/tracking/timing/AppTimingTracker;

    invoke-interface {v2, v0, v1}, Lcom/ibotta/android/tracking/timing/AppTimingTracker;->trackTimeToUploadReceipt(J)V

    .line 265
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;

    .line 267
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->SUBMITTED:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->setStatus(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;)V

    .line 269
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->getSuccessMessage(Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostResponse;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;->showSuccessMessage(Ljava/lang/String;)V

    .line 271
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    const/4 v0, 0x0

    .line 272
    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomer(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    .line 273
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearNotifications()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    .line 274
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearPendingNotifications()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    .line 275
    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearOffers(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    .line 276
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    .line 277
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    invoke-interface {p1}, Lcom/ibotta/android/verification/VerificationManager;->deleteAll()V

    return-void
.end method

.method public onSubmittedAnimationFinished()V
    .locals 1

    .line 418
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->SUCCESS:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->setStatus(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;)V

    return-void
.end method

.method public setPersistedState(Ljava/lang/Object;)V
    .locals 0

    .line 124
    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;

    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 372
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/IllegalRetailerParcelStateException;

    const-string v1, "retailerParcel is null!"

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/IllegalRetailerParcelStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 373
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptView;->showUnknownErrorDialog()V

    goto :goto_0

    .line 375
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    :goto_0
    return-void
.end method

.method protected setStatus(Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;)V
    .locals 2

    .line 317
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->state:Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptState;->setSubmitReceiptStatus(Ljava/lang/String;)V

    .line 319
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$redeem$submit$SubmitReceiptStatus:[I

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptStatus;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 333
    :pswitch_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->onFailed()V

    goto :goto_0

    .line 330
    :pswitch_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->onSuccess()V

    goto :goto_0

    .line 327
    :pswitch_2
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->onSubmitted()V

    goto :goto_0

    .line 324
    :pswitch_3
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->onSubmitting()V

    :goto_0
    :pswitch_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setVerifiedAmount(F)V
    .locals 0

    .line 386
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/submit/SubmitReceiptPresenterImpl;->verifiedAmount:F

    return-void
.end method
