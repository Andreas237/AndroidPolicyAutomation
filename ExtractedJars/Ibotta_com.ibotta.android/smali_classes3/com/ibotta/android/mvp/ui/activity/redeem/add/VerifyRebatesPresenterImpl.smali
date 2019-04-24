.class public Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "VerifyRebatesPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenter;"
    }
.end annotation


# instance fields
.field private excludedOfferIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private final offerCategoryHelper:Lcom/ibotta/api/helper/offer/OfferCategoryHelper;

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final scanRules:Lcom/ibotta/api/rules/ScanRules;

.field private showVerifiedOnFinish:Z

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

.field private unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final verificationManager:Lcom/ibotta/android/verification/VerificationManager;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/offer/OfferCategoryHelper;Lcom/ibotta/android/verification/VerificationManager;Lcom/ibotta/api/rules/ScanRules;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/title/TitleBarReducer;)V
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 59
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->excludedOfferIds:Ljava/util/Set;

    .line 72
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 73
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->offerCategoryHelper:Lcom/ibotta/api/helper/offer/OfferCategoryHelper;

    .line 74
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    .line 75
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->scanRules:Lcom/ibotta/api/rules/ScanRules;

    .line 76
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 77
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 78
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    return-void
.end method

.method private createRebateRows(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;",
            ">;"
        }
    .end annotation

    .line 216
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 218
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-nez v1, :cond_0

    .line 219
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/redeem/IllegalRetailerParcelStateException;

    const-string v2, "retailerParcel is null!"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/IllegalRetailerParcelStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 220
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;->finish()V

    return-object v0

    .line 224
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 225
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    invoke-interface {v2, v1}, Lcom/ibotta/android/verification/VerificationManager;->getOfferVerification(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/verification/OfferVerification;

    move-result-object v2

    .line 226
    new-instance v3, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;

    invoke-direct {v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;-><init>()V

    .line 227
    invoke-virtual {v3, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->setOfferModel(Lcom/ibotta/api/model/OfferModel;)V

    .line 228
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v3, v4}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 229
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    invoke-interface {v4, v1}, Lcom/ibotta/android/verification/VerificationManager;->getOfferVerification(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/verification/OfferVerification;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->setOfferVerification(Lcom/ibotta/android/verification/OfferVerification;)V

    .line 230
    invoke-virtual {v2}, Lcom/ibotta/android/verification/OfferVerification;->getQuantity()I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->setCount(I)V

    .line 232
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private createRows(Ljava/util/Map;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;",
            ">;"
        }
    .end annotation

    .line 198
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 200
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 201
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 202
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/OfferCategoryModel;

    invoke-direct {p0, v2}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->createTitleBarRow(Lcom/ibotta/api/model/OfferCategoryModel;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/TitleBarRow;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 203
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->createRebateRows(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private createTitleBarRow(Lcom/ibotta/api/model/OfferCategoryModel;)Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/TitleBarRow;
    .locals 2

    .line 211
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/TitleBarRow;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferCategoryModel;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/TitleBarRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    return-object v0
.end method

.method private extractOfferModels(Ljava/util/Map;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation

    .line 333
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 335
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 336
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private getUnlockedApiCallParams()Ljava/lang/String;
    .locals 2

    const-string v0, ""

    .line 150
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 152
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;

    .line 153
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->getApiCallParams()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private initAddButton(Ljava/util/List;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;",
            ">;",
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;)V"
        }
    .end annotation

    .line 310
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 311
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;

    .line 312
    instance-of v2, v1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;

    if-nez v2, :cond_0

    goto :goto_0

    .line 316
    :cond_0
    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/VerifiableRebateRow;->getOfferVerification()Lcom/ibotta/android/verification/OfferVerification;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 319
    :cond_1
    new-instance p1, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-direct {p1, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;-><init>(Lcom/ibotta/api/helper/offer/OfferHelper;)V

    .line 320
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {p1, v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;->setVerifiedTotals(Ljava/util/List;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 322
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;->getVerifiedAmount()F

    move-result v0

    .line 323
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;->getVerifiedCount()I

    move-result p1

    .line 325
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    float-to-double v2, v0

    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v0

    .line 326
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-direct {p0, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->extractOfferModels(Ljava/util/Map;)Ljava/util/List;

    move-result-object p2

    invoke-interface {v1, p2}, Lcom/ibotta/api/helper/offer/OfferHelper;->isPercentBackOfferPresent(Ljava/util/List;)Z

    move-result p2

    .line 328
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    invoke-interface {v1, p2, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;->setVerificationSummary(ZILjava/lang/String;)V

    .line 329
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    if-lez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;->setAddButtonEnabled(Z)V

    return-void
.end method

.method private initRows(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/activity/redeem/add/row/AbstractVerifyRebatesRow;",
            ">;"
        }
    .end annotation

    .line 172
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->createRows(Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    .line 173
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;->setRows(Ljava/util/List;)V

    return-object p1
.end method

.method private offerToggled(Lcom/ibotta/api/model/OfferModel;)V
    .locals 3

    .line 343
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-nez v0, :cond_0

    .line 344
    sget-object p1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/redeem/IllegalRetailerParcelStateException;

    const-string v1, "retailerParcel is null!"

    invoke-direct {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/IllegalRetailerParcelStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 345
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;->finish()V

    return-void

    .line 349
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    invoke-interface {v0, p1}, Lcom/ibotta/android/verification/VerificationManager;->getOfferVerification(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/verification/OfferVerification;

    move-result-object v0

    .line 351
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/verification/OfferVerification;->isVerified(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 352
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/verification/VerificationManager;->deleteByOfferId(Ljava/lang/Integer;)V

    .line 353
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->updateUI()V

    goto :goto_0

    .line 354
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->scanRules:Lcom/ibotta/api/rules/ScanRules;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 355
    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->isBarcode()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {v2, p1}, Lcom/ibotta/api/helper/offer/OfferHelper;->isVariablePercentBack(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v2

    .line 354
    invoke-interface {v0, p1, v1, v2}, Lcom/ibotta/api/rules/ScanRules;->isAutoCheckAllowed(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Boolean;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 356
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/verification/VerificationManager;->saveManuallyCheckedVerification(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)Lcom/ibotta/android/verification/OfferVerification;

    .line 357
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->updateUI()V

    goto :goto_0

    .line 358
    :cond_2
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isMultipleRedemptions()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 359
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;->showChangeQuantityForResult(Lcom/ibotta/api/model/OfferModel;)V

    goto :goto_0

    .line 361
    :cond_3
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p1

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;->showBarcodeScannerForResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    :goto_0
    return-void
.end method

.method private removeExcludedOffers(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/ibotta/api/model/OfferCategoryModel;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;)V"
        }
    .end annotation

    .line 179
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 181
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 182
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 183
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 185
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 186
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->excludedOfferIds:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v3}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 187
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 191
    :cond_2
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 192
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    return-void
.end method

.method private savePreselectedOffers(Ljava/util/Collection;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;>;)V"
        }
    .end annotation

    .line 160
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 161
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 162
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 163
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->isPreselect()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 164
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->verificationManager:Lcom/ibotta/android/verification/VerificationManager;

    const/4 v3, 0x0

    invoke-interface {v2, v1, v3}, Lcom/ibotta/android/verification/VerificationManager;->saveManuallyCheckedVerification(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)Lcom/ibotta/android/verification/OfferVerification;

    goto :goto_0

    :cond_2
    return-void
.end method

.method private updateUI()V
    .locals 5

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v0, :cond_0

    .line 120
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    const-string v2, "unlockedOfferCategoriesJob is null!"

    invoke-direct {v1, v2}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;->finish()V

    return-void

    .line 126
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLResponse;

    if-nez v0, :cond_1

    .line 129
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->getUnlockedApiCallParams()Ljava/lang/String;

    move-result-object v0

    .line 130
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "UnlockedOfferCategoriesGraphQLResponse is null! Params:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/ibotta/android/mvp/ui/activity/find/IllegalApiJobStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;->finish()V

    return-void

    .line 136
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->offerCategoryHelper:Lcom/ibotta/api/helper/offer/OfferCategoryHelper;

    .line 137
    invoke-virtual {v0}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLResponse;->getOfferCategoriesAsModels()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/ibotta/api/helper/offer/OfferCategoryHelper;->dedupeOffersAcrossCategories(Ljava/util/List;)Ljava/util/LinkedHashMap;

    move-result-object v0

    .line 139
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->removeExcludedOffers(Ljava/util/Map;)V

    .line 141
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->savePreselectedOffers(Ljava/util/Collection;)V

    .line 143
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->initRows(Ljava/util/Map;)Ljava/util/List;

    move-result-object v1

    .line 144
    invoke-direct {p0, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->initAddButton(Ljava/util/List;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 83
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 85
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 86
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    invoke-interface {v1}, Lcom/ibotta/android/graphql/GraphQLCallFactory;->createUnlockedOfferCategoriesCall()Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;

    move-result-object v1

    .line 88
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-nez v2, :cond_0

    .line 89
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/redeem/IllegalRetailerParcelStateException;

    const-string v3, "retailerParcel is null!"

    invoke-direct {v2, v3}, Lcom/ibotta/android/mvp/ui/activity/redeem/IllegalRetailerParcelStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 90
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;->finish()V

    return-object v0

    .line 94
    :cond_0
    invoke-virtual {v2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->setRetailerId(Ljava/lang/Integer;)V

    const v2, 0x7fffffff

    .line 95
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->setLimit(Ljava/lang/Integer;)V

    const/4 v3, 0x1

    .line 96
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->setContentMin(Ljava/lang/Integer;)V

    .line 97
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->setContentMax(Ljava/lang/Integer;)V

    .line 98
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/android/graphql/offer/unlocked/UnlockedOfferCategoriesGraphQLCall;->setProducts(Ljava/lang/Boolean;)V

    .line 100
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v2, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 103
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 110
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->unlockedOfferCategoriesJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onAddClicked()V
    .locals 2

    .line 286
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->showVerifiedOnFinish:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-eqz v0, :cond_0

    .line 287
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;->showVerifiedRebates(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    .line 290
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;->finish()V

    return-void
.end method

.method public onChangeQuantityClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 261
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;->showChangeQuantityForResult(Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method public onCheckClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    .line 271
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->offerToggled(Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 0

    .line 115
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->updateUI()V

    return-void
.end method

.method public onProductVerificationFailed()V
    .locals 0

    return-void
.end method

.method public onProductVerificationSuccess()V
    .locals 1

    .line 276
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;->showProductVerifiedSuccess()V

    return-void
.end method

.method public onQuantityDecreased(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0

    return-void
.end method

.method public onQuantityIncreased(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 305
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;->showBarcodeScannerForResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public onQuantityNoChange(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    .line 295
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesView;->showBarcodeScannerForResult(ILcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    return-void
.end method

.method public onRowClicked(Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    .line 266
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->offerToggled(Lcom/ibotta/api/model/OfferModel;)V

    return-void
.end method

.method public setExcludedOfferIds([I)V
    .locals 3
    .param p1    # [I
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 245
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->excludedOfferIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 248
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    .line 249
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->excludedOfferIds:Ljava/util/Set;

    aget v2, p1, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setRetailerParcel(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/fragment/retailer/RetailerParcel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 240
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method

.method public setShowVerifiedOnFinish(Z)V
    .locals 0

    .line 256
    iput-boolean p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/add/VerifyRebatesPresenterImpl;->showVerifiedOnFinish:Z

    return-void
.end method
