.class public Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "ReceiptKicksHeaderV2ViewHolderConfigurator.java"

# interfaces
.implements Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;


# static fields
.field private static final ChainIdHistory:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final HEADER_ANIMATION_DURATION_MILLISECONDS:I = 0x190

.field private static final MINIMUM_HEIGHT:I = 0x5a


# instance fields
.field private locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

.field private locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

.field private locationSelectorDialog:Lcom/shopkick/app/cpg/LocationAvailableDialog;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private final screenAdapter:Lcom/shopkick/app/products/ScansListAdapter;

.field private showLocationSelector:Z

.field private final urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->ChainIdHistory:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/products/ScansListAdapter;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    if-eqz p1, :cond_0

    .line 62
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 63
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->screenAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    return-void

    .line 61
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'urlDispatcher\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic access$000(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;)Z
    .locals 0

    .line 33
    iget-boolean p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->showLocationSelector:Z

    return p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;)Lcom/shopkick/app/cpg/LocationDataSource;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    return-object p0
.end method


# virtual methods
.method public dismissLocationSelectorDialog()V
    .locals 1

    .line 186
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->locationSelectorDialog:Lcom/shopkick/app/cpg/LocationAvailableDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->locationSelectorDialog:Lcom/shopkick/app/cpg/LocationAvailableDialog;

    invoke-virtual {v0}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->dismiss()V

    const/4 v0, 0x0

    .line 188
    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->locationSelectorDialog:Lcom/shopkick/app/cpg/LocationAvailableDialog;

    :cond_0
    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c019c

    return v0
.end method

.method public goToReceiptScanScreen(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    .line 134
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "chain_id"

    .line 135
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "origin_element"

    .line 136
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "location_id"

    .line 137
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    new-instance p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class p2, Lcom/shopkick/app/activities/ReceiptScanActivity;

    const-class p3, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    const/4 v1, 0x0

    invoke-direct {p1, p2, p3, v1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 140
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;)Z

    return-void
.end method

.method public goToScreenFromDialog(ZLcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 203
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->chainId:Ljava/lang/String;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    const/16 p3, 0xc6

    invoke-virtual {p0, p1, p2, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->goToReceiptScanScreen(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    .line 75
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    const v0, 0x7f090746

    .line 78
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f09074b

    .line 79
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v0, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    .line 83
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0xa8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 84
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 86
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 87
    invoke-virtual {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 89
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v1, v3, v2}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 91
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;

    invoke-direct {v1, p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator$1;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->ChainIdHistory:Ljava/util/List;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->screenAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    if-eqz v0, :cond_0

    .line 120
    sget-object v0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->ChainIdHistory:Ljava/util/List;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/16 p2, 0x5a

    .line 124
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p2, p1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result p1

    .line 125
    new-instance p2, Landroid/view/animation/TranslateAnimation;

    neg-int p1, p1

    int-to-float p1, p1

    const/4 v0, 0x0

    invoke-direct {p2, v0, v0, p1, v0}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    const-wide/16 v0, 0x190

    .line 126
    invoke-virtual {p2, v0, v1}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 127
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->screenAdapter:Lcom/shopkick/app/products/ScansListAdapter;

    invoke-virtual {p1}, Lcom/shopkick/app/products/ScansListAdapter;->getSKRecyclerView()Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    return-void
.end method

.method public setModulesForLocationSelectorDialog(Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 1

    const/4 v0, 0x1

    .line 151
    iput-boolean v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->showLocationSelector:Z

    .line 152
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 153
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 154
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    .line 155
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-void
.end method

.method public showLocationSelectorDialog(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 16

    move-object/from16 v14, p0

    move-object/from16 v0, p2

    .line 160
    iget-object v1, v14, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->locationSelectorDialog:Lcom/shopkick/app/cpg/LocationAvailableDialog;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 161
    iget-object v1, v14, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->locationSelectorDialog:Lcom/shopkick/app/cpg/LocationAvailableDialog;

    invoke-virtual {v1}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->dismiss()V

    .line 164
    :cond_0
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 167
    :cond_1
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    move-object v10, v1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x0

    move-object v10, v1

    .line 169
    :goto_1
    new-instance v15, Lcom/shopkick/app/cpg/LocationAvailableDialog;

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v3, v14, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v4, v14, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v5, v14, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v6, v14, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object v7, v14, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v8, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    iget-object v9, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    const/4 v11, 0x0

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    .line 180
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v12

    const/4 v13, 0x1

    move-object v0, v15

    move-object/from16 v2, p0

    invoke-direct/range {v0 .. v13}, Lcom/shopkick/app/cpg/LocationAvailableDialog;-><init>(Landroid/content/Context;Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/util/NotificationCenter;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V

    iput-object v15, v14, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->locationSelectorDialog:Lcom/shopkick/app/cpg/LocationAvailableDialog;

    .line 182
    iget-object v0, v14, Lcom/shopkick/app/tileViewHolderConfigurators/ReceiptKicksHeaderV2ViewHolderConfigurator;->locationSelectorDialog:Lcom/shopkick/app/cpg/LocationAvailableDialog;

    invoke-virtual {v0}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->show()V

    return-void
.end method
