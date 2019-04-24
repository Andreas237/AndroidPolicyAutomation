.class public Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "OfferDetailsReceiptTileConfigurator.java"

# interfaces
.implements Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;


# instance fields
.field private ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

.field private appScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field protected context:Landroid/content/Context;

.field private locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

.field private locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/screens/AppScreen;Landroid/content/Context;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 51
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->context:Landroid/content/Context;

    .line 52
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 53
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    .line 54
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    .line 55
    iput-object p5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 56
    iput-object p6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 57
    iput-object p7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 58
    iput-object p8, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 59
    iput-object p9, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method public static synthetic lambda$onBindViewHolder$247(Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;)V
    .locals 0

    .line 90
    invoke-virtual {p0, p3, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->receiptButtonClick(Landroid/view/View;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0135

    return v0
.end method

.method public goToScreenFromDialog(ZLcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 8

    if-eqz p1, :cond_0

    .line 146
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->chainId:Ljava/lang/String;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    const/16 v7, 0xc6

    move v2, p5

    move-object v5, p3

    move-object v6, p4

    invoke-static/range {v0 .. v7}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->goToReceiptScanScreen(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 155
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    iget-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    const/16 p4, 0xc2

    invoke-static {p1, p3, p2, p4}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->goToStoreDetailsScreen(Ljava/lang/ref/WeakReference;Lcom/shopkick/app/cpg/LocationDataSource;Ljava/lang/String;I)V

    :goto_0
    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 7

    .line 69
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    const v0, 0x7f0904ba

    .line 70
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f0903e7

    .line 71
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKTextView;

    const v2, 0x7f090589

    .line 72
    invoke-virtual {p1, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    const v3, 0x7f090587

    .line 73
    invoke-virtual {p1, v3}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v3

    .line 74
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 75
    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060022

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 76
    iget-object v5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0600c6

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 77
    iget-object v6, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-nez v6, :cond_1

    iget-object v6, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    if-nez v6, :cond_0

    iget-object v6, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    if-nez v6, :cond_0

    iget-object v6, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    if-nez v6, :cond_0

    goto :goto_0

    .line 85
    :cond_0
    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 86
    invoke-virtual {v1, v4}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const v0, 0x7f080262

    .line 87
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080091

    .line 89
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 88
    invoke-virtual {v3, v0}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 90
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsReceiptTileConfigurator$s-FwHpbdNKIZn1mIZGjxXA95bY4;

    invoke-direct {v0, p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$OfferDetailsReceiptTileConfigurator$s-FwHpbdNKIZn1mIZGjxXA95bY4;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {v3, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    :goto_0
    const v4, 0x7f080261

    .line 79
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 80
    invoke-virtual {v1, v5}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 81
    invoke-virtual {v0, v5}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 82
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080187

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x0

    .line 83
    invoke-virtual {v3, v0}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    .line 92
    :goto_1
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

.method protected receiptButtonClick(Landroid/view/View;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 13

    move-object v10, p0

    move-object/from16 v11, p3

    .line 115
    iget-object v0, v11, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, v11, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 116
    new-instance v12, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;

    iget-object v2, v10, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    iget-object v3, v10, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object v4, v10, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v5, v10, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v6, v10, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v0, v11, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    .line 123
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    const/4 v9, 0x1

    move-object v0, v12

    move-object v1, p0

    move-object/from16 v7, p3

    invoke-direct/range {v0 .. v9}, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;-><init>(Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;IZ)V

    goto :goto_0

    .line 126
    :cond_0
    new-instance v7, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;

    .line 127
    invoke-virtual {p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v2

    iget-object v3, v10, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    new-instance v4, Ljava/lang/ref/WeakReference;

    iget-object v0, v10, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    invoke-direct {v4, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v5, Ljava/lang/ref/WeakReference;

    iget-object v0, v10, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-direct {v5, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v6, v10, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    move-object v0, v7

    move-object/from16 v1, p3

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/app/util/ScanClickUtils$GoToReceiptScanClickListener;-><init>(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ILjava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/application/ClientFlagsManager;)V

    move-object v12, v7

    .line 134
    :goto_0
    iget-object v0, v10, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    const/4 v1, 0x0

    move-object v2, p1

    invoke-virtual {v0, v11, p1, v12, v1}, Lcom/shopkick/app/account/AgeVerificationController;->maybeVerifyAge(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method protected setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    const v0, 0x7f090587

    .line 97
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    .line 98
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x154

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 99
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 100
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumScanKicks(Ljava/lang/Integer;)V

    .line 101
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 103
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 104
    invoke-virtual {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    const/4 v3, 0x1

    .line 105
    iput-boolean v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 106
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object p1, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 107
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    iput-object p1, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsReceiptTileConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v1, p1, v2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method
