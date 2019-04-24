.class public Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "LoyaltyCardShowPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenter;"
    }
.end annotation


# instance fields
.field private final appCache:Lcom/ibotta/android/appcache/AppCache;

.field private customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field private final retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/appcache/AppCache;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 59
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 60
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    .line 61
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 62
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    .line 63
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 64
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    return-void
.end method

.method private generateCard(Lcom/ibotta/api/model/RetailerModel;)V
    .locals 2

    .line 178
    new-instance v0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;

    invoke-direct {v0}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;-><init>()V

    .line 179
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->setCustomerId(I)V

    .line 180
    sget-object v1, Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;->GENERATED:Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->setType(Lcom/ibotta/api/model/customer/CustomerLoyalty$EntryType;)V

    .line 181
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;->setRetailerId(I)V

    .line 183
    new-instance p1, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall;

    invoke-direct {p1, v0}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall;-><init>(Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall$CallParams;)V

    .line 184
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method private initPresentation()V
    .locals 13

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getCardInputTypeEnum()Lcom/ibotta/api/model/RetailerModel$CardInputType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/RetailerModel$CardInputType;->GENERATED:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 189
    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getLargeCardLogoUrl()Ljava/lang/String;

    move-result-object v1

    .line 190
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v4}, Lcom/ibotta/api/model/RetailerModel;->getCardName()Ljava/lang/String;

    move-result-object v4

    .line 191
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v5}, Lcom/ibotta/api/model/RetailerModel;->getCardNumberName()Ljava/lang/String;

    move-result-object v5

    .line 192
    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v6}, Lcom/ibotta/api/model/RetailerModel;->getCardLinkText()Ljava/lang/String;

    move-result-object v6

    .line 193
    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v7}, Lcom/ibotta/api/model/RetailerModel;->getCardDescription()Ljava/lang/String;

    move-result-object v7

    .line 198
    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

    const/4 v9, 0x0

    if-eqz v8, :cond_1

    .line 199
    invoke-virtual {v8}, Lcom/ibotta/api/model/customer/CustomerLoyalty;->getDisplayValue()Ljava/lang/String;

    move-result-object v9

    .line 200
    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

    invoke-virtual {v8}, Lcom/ibotta/api/model/customer/CustomerLoyalty;->getValue()Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :cond_1
    move-object v8, v9

    .line 203
    :goto_1
    iget-object v10, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v10}, Lcom/ibotta/api/model/RetailerModel;->getCardDisplayBarcodeType()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/ibotta/android/barcode/Format;->fromApiName(Ljava/lang/String;)Lcom/ibotta/android/barcode/Format;

    move-result-object v10

    .line 204
    iget-object v11, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v11}, Lcom/ibotta/api/model/RetailerModel;->getCardIdTypeEnum()Lcom/ibotta/api/model/RetailerModel$CardIdType;

    move-result-object v11

    sget-object v12, Lcom/ibotta/api/model/RetailerModel$CardIdType;->PHONE:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    if-ne v11, v12, :cond_2

    if-nez v10, :cond_2

    .line 206
    iget-object v11, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v11, v9}, Lcom/ibotta/android/util/Formatting;->formatPhoneNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 209
    :cond_2
    new-instance v11, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;

    invoke-direct {v11}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;-><init>()V

    .line 210
    invoke-virtual {v11, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->setLargeCardLogoUrl(Ljava/lang/String;)V

    .line 211
    invoke-virtual {v11, v4}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->setCardName(Ljava/lang/String;)V

    .line 212
    invoke-virtual {v11, v5}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->setCardNumberName(Ljava/lang/String;)V

    .line 213
    invoke-virtual {v11, v6}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->setCardLinkText(Ljava/lang/String;)V

    .line 214
    invoke-virtual {v11, v7}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->setCardDescription(Ljava/lang/String;)V

    .line 215
    invoke-virtual {v11, v9}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->setDisplayValue(Ljava/lang/String;)V

    .line 216
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v1}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v1

    sget-object v4, Lcom/ibotta/api/model/common/VerificationType;->POS_RECEIPT:Lcom/ibotta/api/model/common/VerificationType;

    if-ne v1, v4, :cond_3

    const/4 v2, 0x1

    :cond_3
    invoke-virtual {v11, v2}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->setCanUseReceipt(Z)V

    xor-int/2addr v0, v3

    .line 217
    invoke-virtual {v11, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->setCanRemove(Z)V

    .line 218
    invoke-virtual {v11, v10}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->setFormat(Lcom/ibotta/android/barcode/Format;)V

    .line 219
    invoke-virtual {v11, v8}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->setBarcode(Ljava/lang/String;)V

    .line 221
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, v1}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->isLinked(Lcom/ibotta/api/model/RetailerModel;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 222
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;->NOT_CONNECTED:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;

    invoke-virtual {v11, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->setState(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;)V

    goto :goto_2

    .line 223
    :cond_4
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getCardIdTypeEnum()Lcom/ibotta/api/model/RetailerModel$CardIdType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/RetailerModel$CardIdType;->PHONE:Lcom/ibotta/api/model/RetailerModel$CardIdType;

    if-ne v0, v1, :cond_5

    .line 224
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;->NUMERIC_CARD:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;

    invoke-virtual {v11, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->setState(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;)V

    goto :goto_2

    .line 226
    :cond_5
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;->BARCODE_CARD:Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;

    invoke-virtual {v11, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;->setState(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation$State;)V

    .line 229
    :goto_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;

    invoke-interface {v0, v11}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;->setPresentation(Lcom/ibotta/android/mvp/ui/activity/loyalty/show/Presentation;)V

    return-void
.end method

.method private onCardGeneratedFailed()V
    .locals 1

    .line 260
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;->showFailedToGenerateCard()V

    return-void
.end method

.method private onCardGeneratedSuccessfully()V
    .locals 2

    .line 255
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    new-instance v1, Lcom/ibotta/api/call/home/HomeCall;

    invoke-direct {v1}, Lcom/ibotta/api/call/home/HomeCall;-><init>()V

    invoke-interface {v0, v1}, Lcom/ibotta/android/appcache/AppCache;->remove(Lcom/ibotta/api/CacheableApiCall;)V

    .line 256
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->reload()V

    return-void
.end method

.method private onCardRemoveFailed()V
    .locals 1

    .line 272
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;->showFailedToRemoveCard()V

    return-void
.end method

.method private onCardRemovedSuccessfully()V
    .locals 2

    .line 264
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/api/model/RetailerModel;->setCustomerLoyalty(Lcom/ibotta/api/model/customer/CustomerLoyalty;)V

    .line 265
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->initPresentation()V

    .line 267
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->appCache:Lcom/ibotta/android/appcache/AppCache;

    new-instance v1, Lcom/ibotta/api/call/home/HomeCall;

    invoke-direct {v1}, Lcom/ibotta/api/call/home/HomeCall;-><init>()V

    invoke-interface {v0, v1}, Lcom/ibotta/android/appcache/AppCache;->remove(Lcom/ibotta/api/CacheableApiCall;)V

    .line 268
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->reload()V

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

    .line 69
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 71
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    if-nez v1, :cond_0

    .line 72
    new-instance v1, Lcom/ibotta/android/service/api/job/HomeApiJob;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/HomeApiJob;-><init>(I)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    .line 75
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 82
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    return-void
.end method

.method public onAddCardClicked()V
    .locals 2

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;->showLoyaltyCardAdd(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public onCardAdded(IILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 149
    new-instance v0, Lcom/ibotta/api/model/customer/CustomerLoyalty;

    invoke-direct {v0}, Lcom/ibotta/api/model/customer/CustomerLoyalty;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

    .line 150
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/customer/CustomerLoyalty;->setId(I)V

    .line 151
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

    invoke-virtual {p1, p2}, Lcom/ibotta/api/model/customer/CustomerLoyalty;->setRetailerId(I)V

    .line 152
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

    invoke-virtual {p1, p3}, Lcom/ibotta/api/model/customer/CustomerLoyalty;->setValue(Ljava/lang/String;)V

    .line 153
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

    invoke-virtual {p1, p4}, Lcom/ibotta/api/model/customer/CustomerLoyalty;->setDisplayValue(Ljava/lang/String;)V

    .line 155
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

    invoke-interface {p1, p2}, Lcom/ibotta/api/model/RetailerModel;->setCustomerLoyalty(Lcom/ibotta/api/model/customer/CustomerLoyalty;)V

    .line 157
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->initPresentation()V

    .line 159
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;->showCardAddedSuccess()V

    return-void
.end method

.method public onFailedToGenerateCardDisplayed()V
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;->finish()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->homeJob:Lcom/ibotta/android/service/api/job/HomeApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/HomeApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/home/HomeResponse;

    .line 88
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    invoke-virtual {v0}, Lcom/ibotta/api/call/home/HomeResponse;->getRetailersAsModels()Ljava/util/List;

    move-result-object v0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v2

    invoke-interface {v1, v0, v2}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->findRetailerById(Ljava/util/List;I)Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getCustomerLoyalty()Lcom/ibotta/api/model/customer/CustomerLoyalty;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

    .line 91
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerParcelHelper:Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcelHelper;->toRetailerParcel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 92
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getCardInputTypeEnum()Lcom/ibotta/api/model/RetailerModel$CardInputType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/RetailerModel$CardInputType;->GENERATED:Lcom/ibotta/api/model/RetailerModel$CardInputType;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    .line 95
    invoke-interface {v0, v1}, Lcom/ibotta/api/helper/retailer/RetailerHelper;->isLinked(Lcom/ibotta/api/model/RetailerModel;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->generateCard(Lcom/ibotta/api/model/RetailerModel;)V

    goto :goto_0

    .line 98
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->initPresentation()V

    :goto_0
    return-void
.end method

.method protected onFetchFinishedWithFailures()V
    .locals 1

    .line 104
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchFinishedWithFailures()V

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;->setTitleForLoadFailure()V

    return-void
.end method

.method public onHelpCenterClicked()V
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;->showHelpCenter()V

    return-void
.end method

.method public onHelpClicked()V
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;->showHelp()V

    return-void
.end method

.method public onHelpInstructionsClicked()V
    .locals 2

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;->showHelpInstructions(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public onRemoveCanceled()V
    .locals 0

    return-void
.end method

.method public onRemoveCardClicked()V
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;->showRemoveCardConfirmation()V

    return-void
.end method

.method public onRemoveConfirmed()V
    .locals 3

    .line 142
    new-instance v0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 143
    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->customerLoyalty:Lcom/ibotta/api/model/customer/CustomerLoyalty;

    invoke-virtual {v2}, Lcom/ibotta/api/model/customer/CustomerLoyalty;->getId()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;-><init>(II)V

    .line 144
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method protected onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 245
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 247
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall;

    if-eqz v0, :cond_0

    .line 248
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->onCardGeneratedFailed()V

    goto :goto_0

    .line 249
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;

    if-eqz p1, :cond_1

    .line 250
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->onCardRemoveFailed()V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 234
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 236
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesPostCall;

    if-eqz v0, :cond_0

    .line 237
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->onCardGeneratedSuccessfully()V

    goto :goto_0

    .line 238
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/api/call/customer/loyalty/CustomerLoyaltiesDeleteCall;

    if-eqz p1, :cond_1

    .line 239
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->onCardRemovedSuccessfully()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onUseReceiptClicked()V
    .locals 2

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;->showRedeemReqs(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;->finish()V

    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 110
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 111
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/loyalty/show/LoyaltyCardShowView;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method
