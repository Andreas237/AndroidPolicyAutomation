.class public Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "EarningsDetailPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenter;"
    }
.end annotation


# instance fields
.field private final bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

.field private bonusesTitle:Ljava/lang/String;

.field private buyableGiftCardByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private earningDetailParcel:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

.field private earningsDetailRows:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/ibotta/android/mvp/ui/view/earningsdetail/AbstractEarningsDetailRow;",
            ">;"
        }
    .end annotation
.end field

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private itemType:Ljava/lang/String;

.field private offersTitle:Ljava/lang/String;

.field private receipt:Lcom/ibotta/api/model/receipt/Receipt;

.field private receiptByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/bonus/BonusHelper;Lcom/ibotta/android/title/TitleBarReducer;)V
    .locals 0

    .line 72
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 64
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningsDetailRows:Ljava/util/ArrayList;

    .line 73
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 74
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 75
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->bonusHelper:Lcom/ibotta/api/helper/bonus/BonusHelper;

    .line 76
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    return-void
.end method

.method private addOfferRows(Ljava/util/List;ZLjava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Offer;",
            ">;Z",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;",
            ">;"
        }
    .end annotation

    .line 350
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/OfferModel;

    .line 351
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;

    invoke-direct {v1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;-><init>()V

    .line 352
    invoke-virtual {v1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;->setOfferModel(Lcom/ibotta/api/model/OfferModel;)V

    .line 353
    invoke-virtual {v1, p2}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;->setVerified(Z)V

    .line 354
    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p3
.end method

.method private buildBonusRows(Lcom/ibotta/android/earnings/TxLedgerData;)V
    .locals 4

    .line 361
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 363
    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->getBonuses()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/bonus/Bonus;

    .line 364
    invoke-virtual {v1}, Lcom/ibotta/api/model/bonus/Bonus;->getPercentComplete()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_0

    .line 365
    new-instance v2, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;

    invoke-direct {v2}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;-><init>()V

    .line 366
    invoke-virtual {v2, v1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;->setBonusModel(Lcom/ibotta/api/model/BonusModel;)V

    .line 367
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 371
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 372
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->bonusesTitle:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->buildTitleRow(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 373
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;->setFirstBonus(Z)V

    .line 374
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;

    invoke-virtual {p1, v1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxBonusRow;->setLastBonus(Z)V

    .line 375
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningsDetailRows:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_2
    return-void
.end method

.method private buildOffersRows(Lcom/ibotta/android/earnings/TxLedgerData;)V
    .locals 3

    .line 337
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->offersTitle:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->buildTitleRow(Ljava/lang/String;)V

    .line 339
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 340
    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->getPendingOffers()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->addOfferRows(Ljava/util/List;ZLjava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 341
    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->getVerifiedOffers()Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {p0, p1, v1, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->addOfferRows(Ljava/util/List;ZLjava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 343
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;->setFirstOffer(Z)V

    .line 344
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxOfferRow;->setLastOffer(Z)V

    .line 346
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningsDetailRows:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private buildTitleRow(Ljava/lang/String;)V
    .locals 3

    .line 380
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningsDetailRows:Ljava/util/ArrayList;

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxTitleRow;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    invoke-static {p1}, Lcom/ibotta/android/views/generic/ResValueKt;->createResValue(Ljava/lang/String;)Lcom/ibotta/android/views/generic/ResValue;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/ibotta/android/title/TitleBarReducer;->create(Lcom/ibotta/android/views/generic/ResValue;)Lcom/ibotta/android/views/base/title/TitleBarViewState;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxTitleRow;-><init>(Lcom/ibotta/android/views/base/title/TitleBarViewState;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private buildTxLedgerFooterRow(Lcom/ibotta/android/earnings/TxLedgerData;)V
    .locals 1

    .line 330
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerFooterRow;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerFooterRow;-><init>()V

    .line 331
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerFooterRow;->setTxLedgerData(Lcom/ibotta/android/earnings/TxLedgerData;)V

    .line 333
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningsDetailRows:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private buildTxLedgerRow(Lcom/ibotta/android/earnings/TxLedgerData;)V
    .locals 1

    .line 323
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerRow;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerRow;-><init>()V

    .line 324
    invoke-virtual {v0, p1}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/row/TxLedgerRow;->setTxLedgerData(Lcom/ibotta/android/earnings/TxLedgerData;)V

    .line 326
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningsDetailRows:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private getReceiptUrls()[Ljava/lang/String;
    .locals 4

    .line 112
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->receipt:Lcom/ibotta/api/model/receipt/Receipt;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 116
    :cond_0
    invoke-virtual {v0}, Lcom/ibotta/api/model/receipt/Receipt;->getReceiptImages()Ljava/util/List;

    move-result-object v0

    .line 117
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    .line 118
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    .line 119
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/receipt/ReceiptImage;

    invoke-virtual {v3}, Lcom/ibotta/api/model/receipt/ReceiptImage;->getUrl()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private init(Lcom/ibotta/android/earnings/TxLedgerData;)V
    .locals 2

    .line 250
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningsDetailRows:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 252
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->setToolbarInfo(Lcom/ibotta/android/earnings/TxLedgerData;)V

    .line 254
    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->getTxState()Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->ERROR:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    if-eq v0, v1, :cond_0

    .line 255
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->buildTxLedgerRow(Lcom/ibotta/android/earnings/TxLedgerData;)V

    .line 257
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->buildTxLedgerFooterRow(Lcom/ibotta/android/earnings/TxLedgerData;)V

    .line 259
    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->getOfferMatches()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 260
    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->getOfferMatches()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->isProcessing()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 261
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->buildOffersRows(Lcom/ibotta/android/earnings/TxLedgerData;)V

    .line 264
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->getBonuses()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 265
    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->getBonuses()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 266
    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->getTxState()Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->COMPLETE:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    if-ne v0, v1, :cond_2

    .line 267
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->buildBonusRows(Lcom/ibotta/android/earnings/TxLedgerData;)V

    .line 270
    :cond_2
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningsDetailRows:Ljava/util/ArrayList;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->setRows(Ljava/util/List;)V

    return-void
.end method

.method private initWithEarning(Lcom/ibotta/api/model/earnings/Earning;)V
    .locals 0

    .line 242
    invoke-static {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->fromEarning(Lcom/ibotta/api/model/earnings/Earning;)Lcom/ibotta/android/earnings/TxLedgerData;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->init(Lcom/ibotta/android/earnings/TxLedgerData;)V

    return-void
.end method

.method private initWithReceipt(Lcom/ibotta/api/model/receipt/Receipt;)V
    .locals 0

    .line 246
    invoke-static {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->fromReceipt(Lcom/ibotta/api/model/receipt/Receipt;)Lcom/ibotta/android/earnings/TxLedgerData;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->init(Lcom/ibotta/android/earnings/TxLedgerData;)V

    return-void
.end method

.method private setToolbarInfo(Lcom/ibotta/android/earnings/TxLedgerData;)V
    .locals 7

    .line 294
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->receipt:Lcom/ibotta/api/model/receipt/Receipt;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/api/model/receipt/Receipt;->getLaunchId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    move-object v6, v0

    .line 296
    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->isProcessing()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/ibotta/android/earnings/TxLedgerData$TxState;->PENDING:Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->getTxState()Lcom/ibotta/android/earnings/TxLedgerData$TxState;

    move-result-object v1

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, 0x1

    .line 297
    :goto_2
    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->getRetailerName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 298
    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->getRetailerName()Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    goto :goto_3

    .line 300
    :cond_3
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->getDefaultTitle()Ljava/lang/String;

    move-result-object v1

    move-object v3, v1

    .line 303
    :goto_3
    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->isProcessing()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 304
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->getSubtitleProcessing()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    move-object v4, v0

    move-object v5, v1

    goto :goto_5

    :cond_4
    if-eqz v0, :cond_5

    .line 308
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->getAmountPendingSubtitle()Ljava/lang/String;

    move-result-object v0

    .line 309
    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->getTotalPendingEarnings()Ljava/lang/Float;

    move-result-object v1

    goto :goto_4

    .line 311
    :cond_5
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->getTotalEarningsSubtitle()Ljava/lang/String;

    move-result-object v0

    .line 312
    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->getTotalEarnings()Ljava/lang/Float;

    move-result-object v1

    .line 314
    :goto_4
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    float-to-double v4, v1

    invoke-interface {v2, v4, v5}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v1

    move-object v4, v0

    move-object v5, v1

    .line 317
    :goto_5
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;

    .line 318
    invoke-virtual {p1}, Lcom/ibotta/android/earnings/TxLedgerData;->getIconUrl()Ljava/lang/String;

    move-result-object v2

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->setupToolbar(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;)V

    return-void
.end method


# virtual methods
.method public getEarningDetailParcel()Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningDetailParcel:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    return-object v0
.end method

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

    .line 172
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 174
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningDetailParcel:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    sget-object v2, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->EMPTY:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 175
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "earningDetailParcel should not be empty"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 176
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->finish()V

    return-object v0

    .line 180
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningDetailParcel:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->getEarningType()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    const/4 v0, 0x1

    .line 196
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningDetailParcel:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    invoke-virtual {v2}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->getEarningType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const-string v1, "Invalid Earning Type: %1$s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 197
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 189
    :pswitch_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->receiptByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_1

    .line 190
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 191
    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningDetailParcel:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    invoke-virtual {v4}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->getEarningId()I

    move-result v4

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdCall;-><init>(II)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->receiptByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 193
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->receiptByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 182
    :pswitch_1
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->buyableGiftCardByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_2

    .line 183
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 184
    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningDetailParcel:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    invoke-virtual {v4}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->getEarningId()I

    move-result v4

    invoke-direct {v2, v3, v4}, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdCall;-><init>(II)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->buyableGiftCardByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 186
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->buyableGiftCardByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public initBonusesTitle(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->bonusesTitle:Ljava/lang/String;

    return-void
.end method

.method public initItemType(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->itemType:Ljava/lang/String;

    return-void
.end method

.method public initOffersTitle(Ljava/lang/String;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->offersTitle:Ljava/lang/String;

    return-void
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 205
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->receiptByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 206
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->buyableGiftCardByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onBonusRowClicked(Lcom/ibotta/api/model/BonusModel;)V
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->showBonusDetails(Lcom/ibotta/api/model/BonusModel;)V

    return-void
.end method

.method public onBottomButtonsDialogCancelClicked()V
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->cancelDialog()V

    return-void
.end method

.method public onDoubleCheckContinue()V
    .locals 2

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->receipt:Lcom/ibotta/api/model/receipt/Receipt;

    invoke-virtual {v1}, Lcom/ibotta/api/model/receipt/Receipt;->getLaunchId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->showReportAnIssueDialog(Ljava/lang/String;)V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->receiptByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    .line 229
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdResponse;

    .line 230
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptByIdResponse;->getReceipt()Lcom/ibotta/api/model/receipt/Receipt;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->receipt:Lcom/ibotta/api/model/receipt/Receipt;

    .line 232
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->receipt:Lcom/ibotta/api/model/receipt/Receipt;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->initWithReceipt(Lcom/ibotta/api/model/receipt/Receipt;)V

    goto :goto_0

    .line 233
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->buyableGiftCardByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_1

    .line 235
    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse;

    .line 237
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse;->getEarning()Lcom/ibotta/api/model/earnings/Earning;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->initWithEarning(Lcom/ibotta/api/model/earnings/Earning;)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onFetchFinishedWithFailures()V
    .locals 2

    .line 275
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onFetchFinishedWithFailures()V

    .line 276
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->getDefaultTitle()Ljava/lang/String;

    move-result-object v0

    .line 277
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;

    invoke-direct {v1, v0}, Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;-><init>(Ljava/lang/String;)V

    .line 278
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->setupToolbar(Lcom/ibotta/android/mvp/ui/view/earningsdetail/EarningsDetailToolbarViewModel;)V

    return-void
.end method

.method public onHelpCenterClicked()V
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->showHelpCenter()V

    return-void
.end method

.method public onHelpIconClicked()V
    .locals 2

    .line 106
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->getReceiptUrls()[Ljava/lang/String;

    move-result-object v0

    .line 108
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {v1, v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->showHelpDialog([Ljava/lang/String;)V

    return-void
.end method

.method public onReportAnIssueClicked()V
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->showDoubleCheckDialog()V

    return-void
.end method

.method public onReportAnIssueFailed()V
    .locals 1

    .line 283
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpPresenterActions:Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/base/MvpPresenterActions;->isNetworkConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 284
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->showReportAnIssueFailed()V

    goto :goto_0

    .line 286
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->showNetworkConnectionErrorDialog()V

    :goto_0
    return-void
.end method

.method public onReportReadyToSend(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 143
    new-instance v0, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;

    invoke-direct {v0}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;-><init>()V

    .line 144
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningDetailParcel:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->getEarningId()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->setItemId(J)V

    .line 145
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->itemType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->setItemType(Ljava/lang/String;)V

    .line 146
    invoke-virtual {v0, p2}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->setPhoneData(Ljava/lang/String;)V

    .line 147
    invoke-virtual {v0, p1}, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->setText(Ljava/lang/String;)V

    .line 149
    new-instance p1, Lcom/ibotta/api/call/problem/ProblemsPostCall;

    invoke-direct {p1, v0}, Lcom/ibotta/api/call/problem/ProblemsPostCall;-><init>(Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;)V

    .line 150
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method protected onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 219
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 220
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/api/call/problem/ProblemsPostCall;

    if-eqz p1, :cond_0

    .line 221
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->notifyReportFailure()V

    :cond_0
    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 211
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 212
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/api/call/problem/ProblemsPostCall;

    if-eqz p1, :cond_0

    .line 213
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->notifyReportSuccess()V

    :cond_0
    return-void
.end method

.method public onViewReceipt()V
    .locals 2

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningDetailParcel:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    invoke-virtual {v0}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->getEarningType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningDetailParcel:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->getEarningId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailView;->showReceipt(I)V

    :cond_0
    return-void
.end method

.method public setEarningDetailParcel(Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailPresenterImpl;->earningDetailParcel:Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    return-void
.end method
