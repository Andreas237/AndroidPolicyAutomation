.class public Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "VerifyWizardPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenter;"
    }
.end annotation


# instance fields
.field private currentPageIndex:I

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private offerId:I

.field private offerModel:Lcom/ibotta/api/model/OfferModel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private pages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;",
            ">;"
        }
    .end annotation
.end field

.field private retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final scanRules:Lcom/ibotta/api/rules/ScanRules;

.field private final verificationManager:Lcom/ibotta/android/verification/VerificationManager;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/api/rules/ScanRules;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    const/4 p1, 0x0

    .line 45
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->currentPageIndex:I

    .line 47
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->pages:Ljava/util/List;

    .line 60
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 61
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    .line 62
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->scanRules:Lcom/ibotta/api/rules/ScanRules;

    return-void
.end method

.method private createPage(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;ILjava/lang/Integer;Ljava/lang/String;I)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;
    .locals 7
    .param p3    # Ljava/lang/Integer;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 262
    new-instance v6, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    move-object v0, v6

    move v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v4, p1

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;-><init>(ILjava/lang/Integer;Ljava/lang/String;Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;I)V

    return-object v6
.end method

.method private createScanPage(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;
    .locals 6

    .line 225
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->SCAN:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v2

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getName()Ljava/lang/String;

    move-result-object v4

    .line 226
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getMultiplesCount()S

    move-result v5

    const/4 v3, 0x0

    move-object v0, p0

    .line 225
    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->createPage(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;ILjava/lang/Integer;Ljava/lang/String;I)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    move-result-object p1

    return-object p1
.end method

.method private createScanPage(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/offer/ProductGroup;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;
    .locals 6

    .line 237
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->SCAN:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    .line 239
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v2

    .line 240
    invoke-virtual {p2}, Lcom/ibotta/api/model/offer/ProductGroup;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 241
    invoke-virtual {p2}, Lcom/ibotta/api/model/offer/ProductGroup;->getName()Ljava/lang/String;

    move-result-object v4

    .line 242
    invoke-virtual {p2}, Lcom/ibotta/api/model/offer/ProductGroup;->getMultiplesCount()S

    move-result v5

    move-object v0, p0

    .line 237
    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->createPage(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;ILjava/lang/Integer;Ljava/lang/String;I)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    move-result-object p1

    return-object p1
.end method

.method private createWizardSteps()V
    .locals 5

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    if-nez v0, :cond_0

    return-void

    .line 164
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->pages:Ljava/util/List;

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->isBarcode()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 167
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isCombo()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 169
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getProductGroups()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/offer/ProductGroup;

    .line 170
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->scanRules:Lcom/ibotta/api/rules/ScanRules;

    invoke-interface {v3, v2, v0}, Lcom/ibotta/api/rules/ScanRules;->isScanRequired(Lcom/ibotta/api/model/offer/ScanMetaCriteria;Ljava/lang/Boolean;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 172
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->pages:Ljava/util/List;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-direct {p0, v4, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->createScanPage(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/offer/ProductGroup;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 175
    :cond_2
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->pages:Ljava/util/List;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-direct {p0, v4, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->createYesNoPage(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/offer/ProductGroup;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 178
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->scanRules:Lcom/ibotta/api/rules/ScanRules;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v1, v2, v0}, Lcom/ibotta/api/rules/ScanRules;->isScanRequired(Lcom/ibotta/api/model/offer/ScanMetaCriteria;Ljava/lang/Boolean;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->pages:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->createScanPage(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 183
    :cond_4
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->pages:Ljava/util/List;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->createYesNoPage(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 186
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->pages:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->pages:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;->setPages(Ljava/util/List;)V

    return-void
.end method

.method private createYesNoPage(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;
    .locals 6

    .line 198
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->YES_NO:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v2

    .line 199
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getMultiplesCount()S

    move-result v5

    const/4 v3, 0x0

    move-object v0, p0

    .line 198
    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->createPage(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;ILjava/lang/Integer;Ljava/lang/String;I)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    move-result-object p1

    return-object p1
.end method

.method private createYesNoPage(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/offer/ProductGroup;)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;
    .locals 6

    .line 210
    sget-object v1, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->YES_NO:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    .line 212
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v2

    .line 213
    invoke-virtual {p2}, Lcom/ibotta/api/model/offer/ProductGroup;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 214
    invoke-virtual {p2}, Lcom/ibotta/api/model/offer/ProductGroup;->getName()Ljava/lang/String;

    move-result-object v4

    .line 215
    invoke-virtual {p2}, Lcom/ibotta/api/model/offer/ProductGroup;->getMultiplesCount()S

    move-result v5

    move-object v0, p0

    .line 210
    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->createPage(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;ILjava/lang/Integer;Ljava/lang/String;I)Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    move-result-object p1

    return-object p1
.end method

.method private initCurrentPage()V
    .locals 5

    .line 269
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "Not ready to initialize current page. No Offer available yet."

    .line 270
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 274
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->pages:Ljava/util/List;

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->currentPageIndex:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    .line 276
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->getVerifyWizardPageType()Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    move-result-object v2

    sget-object v3, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->YES_NO:Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    if-ne v2, v3, :cond_1

    .line 280
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;

    iget v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->currentPageIndex:I

    add-int/lit8 v3, v3, 0x1

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->pages:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;->setTitleForCurrentPage(II)V

    .line 283
    :cond_1
    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl$1;->$SwitchMap$com$ibotta$android$mvp$ui$activity$redeem$receipt$page$VerifyWizardPageType:[I

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->getVerifyWizardPageType()Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPageType;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 289
    :pswitch_0
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->isExpectingActivityResult()Z

    move-result v1

    if-nez v1, :cond_2

    .line 291
    new-instance v1, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;

    invoke-direct {v1}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;-><init>()V

    .line 292
    sget-object v2, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;->VERIFY:Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->setVerifyBarcodeMode(Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeMode;)V

    .line 293
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->setOfferId(I)V

    .line 294
    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->getProductGroupId()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;->setProductGroupId(Ljava/lang/Integer;)V

    .line 295
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;->startScanActivity(Lcom/ibotta/android/apiandroid/barcode/VerifyBarcodeParamsParcel;)V

    goto :goto_0

    .line 285
    :pswitch_1
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v2, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;

    invoke-interface {v2, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;->initYesNoPage(Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;)V

    .line 286
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;->setInitializing(Z)V

    :cond_2
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private moveToNextPage()V
    .locals 2

    .line 305
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->currentPageIndex:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->currentPageIndex:I

    .line 307
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->currentPageIndex:I

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->pages:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 309
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;->finishWithSuccess()V

    goto :goto_0

    .line 312
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->initCurrentPage()V

    :goto_0
    return-void
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 72
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 74
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    if-nez v1, :cond_1

    .line 75
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 76
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createOfferCall()Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;

    move-result-object v1

    .line 77
    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerId:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setOfferId(Ljava/lang/Integer;)V

    const/4 v2, 0x1

    .line 78
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setIgnoreTargeting(Ljava/lang/Boolean;)V

    .line 79
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/OfferGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 81
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 83
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 90
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 153
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->onNoClicked()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;->finishWithError()V

    return-void

    .line 103
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;

    .line 104
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/OfferGraphQLResponse;->getOfferAsModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    if-eqz v0, :cond_1

    .line 107
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->createWizardSteps()V

    .line 109
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getException()Lcom/ibotta/api/ApiException;

    move-result-object v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->pages:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 116
    :cond_2
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->currentPageIndex:I

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->pages:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 117
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->initCurrentPage()V

    goto :goto_1

    .line 111
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getException()Lcom/ibotta/api/ApiException;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getException()Lcom/ibotta/api/ApiException;

    move-result-object v0

    const-string v1, "Unexpected load failure"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    :cond_4
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;->showErrorMessage()V

    :cond_5
    :goto_1
    return-void
.end method

.method public onNoClicked()V
    .locals 2

    .line 323
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerId:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/verification/VerificationManager;->deleteByOfferId(Ljava/lang/Integer;)V

    .line 325
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;->finishWithCancel()V

    return-void
.end method

.method public onScanFailed()V
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardView;->finishWithError()V

    return-void
.end method

.method public onScanSuccess()V
    .locals 0

    .line 143
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->moveToNextPage()V

    return-void
.end method

.method public onYesClicked()V
    .locals 3

    .line 334
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->pages:Ljava/util/List;

    iget v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->currentPageIndex:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;

    .line 335
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;->getProductGroupId()Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/ibotta/android/verification/VerificationManager;->saveManuallyCheckedVerification(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)Lcom/ibotta/android/verification/OfferVerification;

    .line 336
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->moveToNextPage()V

    return-void
.end method

.method public setData(ILcom/ibotta/android/fragment/retailer/RetailerParcel;ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            "I",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/page/VerifyWizardPage;",
            ">;)V"
        }
    .end annotation

    .line 135
    iput p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->offerId:I

    .line 136
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 137
    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->currentPageIndex:I

    .line 138
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/receipt/VerifyWizardPresenterImpl;->pages:Ljava/util/List;

    return-void
.end method
