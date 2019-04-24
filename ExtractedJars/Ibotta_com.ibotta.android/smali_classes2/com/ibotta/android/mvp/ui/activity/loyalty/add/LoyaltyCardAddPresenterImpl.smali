.class public Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "LoyaltyCardAddPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenter;"
    }
.end annotation


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private cardNumber:Ljava/lang/String;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private final retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

.field private final userState:Lcom/ibotta/android/state/user/UserState;

.field private final validation:Lcom/ibotta/android/util/Validation;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/util/Validation;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 63
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 64
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 65
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 66
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 67
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 68
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    .line 69
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    return-void
.end method

.method private saveCard(Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;)V
    .locals 2

    .line 214
    new-instance v0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;

    invoke-direct {v0}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;-><init>()V

    .line 215
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->setCustomerId(I)V

    .line 216
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->setRetailerId(I)V

    .line 217
    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->setType(Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;)V

    .line 218
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->cardNumber:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->setValue(Ljava/lang/String;)V

    .line 220
    new-instance p1, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall;

    invoke-direct {p1, v0}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall;-><init>(Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;)V

    .line 221
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method private validateForm(Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;Ljava/lang/String;)Z
    .locals 4

    .line 199
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-interface {v0, p2}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v0

    .line 202
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getCardValidationRegex()Ljava/lang/String;

    move-result-object v1

    .line 203
    sget-object v2, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->MANUAL:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    const/4 v3, 0x1

    if-ne p1, v2, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_0

    .line 204
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    .line 205
    invoke-virtual {p1, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    return v3
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

    .line 74
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 76
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 77
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 80
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 87
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    return-void
.end method

.method public onAddCardClicked()V
    .locals 1

    .line 144
    sget-object v0, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->MANUAL:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->saveCard(Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;)V

    return-void
.end method

.method public onBarcodeScanned([Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;)V
    .locals 3

    if-eqz p1, :cond_1

    .line 149
    array-length v0, p1

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 154
    aget-object p1, p1, v0

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/barcode/BarcodeParcel;->getUpc()Ljava/lang/String;

    move-result-object p1

    .line 155
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;

    invoke-interface {v1, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;->setScannedBarcode(Ljava/lang/String;)V

    const-string v1, "Loyalty card barcode value: %1$s"

    const/4 v2, 0x1

    .line 156
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p1, v2, v0

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    sget-object p1, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->SCANNED:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->saveCard(Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public onCardNumberChanged(Ljava/lang/String;)V
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getCardIdTypeEnum()Lcom/ibotta/api/model/RetailerModel$CardIdType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/RetailerModel$CardIdType;->PHONE:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    if-ne v0, v1, :cond_0

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Formatting;->normalizePhoneNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 126
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->cardNumber:Ljava/lang/String;

    .line 128
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;

    sget-object v1, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->MANUAL:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    invoke-direct {p0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->validateForm(Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;Ljava/lang/String;)Z

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;->setAddCardAllowed(Z)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 7

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;->setAddCardAllowed(Z)V

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 95
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v3}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v3

    invoke-interface {v2, v0, v3}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getCardNumberName()Ljava/lang/String;

    move-result-object v0

    .line 98
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v2}, Lcom/ibotta/api/model/RetailerModel;->getCardEntryDesc()Ljava/lang/String;

    move-result-object v2

    .line 99
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v3}, Lcom/ibotta/api/model/RetailerModel;->getCardScanBarcodeTypeEnum()Lcom/ibotta/api/model/common/BarcodeType;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 100
    :goto_0
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v5}, Lcom/ibotta/api/model/RetailerModel;->getCardIdTypeEnum()Lcom/ibotta/api/model/RetailerModel$CardIdType;

    move-result-object v5

    sget-object v6, Lcom/ibotta/api/model/RetailerModel$CardIdType;->PHONE:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    if-ne v5, v6, :cond_1

    const/4 v1, 0x1

    .line 102
    :cond_1
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v4, v5}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v4

    iput-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 103
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v4, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v4, v5}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 105
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v4, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;

    invoke-interface {v4, v0, v2, v3, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;->setup(Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-void
.end method

.method protected onFetchFinishedWithFailures()V
    .locals 1

    .line 110
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchFinishedWithFailures()V

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;->setTitleForLoadFailure()V

    return-void
.end method

.method public onHelpCenterClicked()V
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;->showHelpCenter()V

    return-void
.end method

.method public onHelpClicked()V
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;->showHelp()V

    return-void
.end method

.method public onHelpInstructionsClicked()V
    .locals 2

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;->showHelpInstructions(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public onScanClicked()V
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getCardScanBarcodeTypeEnum()Lcom/ibotta/api/model/common/BarcodeType;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/android/barcode/ScanType;->fromBarcodeType(Lcom/ibotta/api/model/common/BarcodeType;)Lcom/ibotta/android/barcode/ScanType;

    move-result-object v0

    if-nez v0, :cond_0

    .line 136
    sget-object v0, Lcom/ibotta/android/barcode/ScanType;->UPCA:Lcom/ibotta/android/barcode/ScanType;

    .line 139
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;->showLoyaltyBarcodeScanner(Lcom/ibotta/android/barcode/ScanType;)V

    return-void
.end method

.method protected onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 191
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 193
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall;

    if-eqz p1, :cond_0

    .line 194
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;->showAddCardFailed()V

    :cond_0
    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 2

    .line 179
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 181
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall;

    if-eqz v0, :cond_0

    .line 182
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostResponse;

    .line 184
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    new-instance v1, Lcom/ibotta/api/call/home/HomeCall;

    invoke-direct {v1}, Lcom/ibotta/api/call/home/HomeCall;-><init>()V

    invoke-interface {v0, v1}, Lcom/ibotta/android/appcache/AppCache;->remove(Lcom/ibotta/api/CacheableApiCall;)V

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;

    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostResponse;->getCustomerLoyalty()Lcom/ibotta/api/model/customer/CustomerLoyalty;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;->finishWithSuccess(Lcom/ibotta/api/model/customer/CustomerLoyalty;)V

    :cond_0
    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 116
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/add/LoyaltyCardAddView;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method
