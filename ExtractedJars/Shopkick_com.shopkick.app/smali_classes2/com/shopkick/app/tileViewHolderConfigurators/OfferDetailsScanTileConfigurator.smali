.class public Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "OfferDetailsScanTileConfigurator.java"


# instance fields
.field private ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

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

.field private context:Landroid/content/Context;

.field private locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/screens/AppScreen;Landroid/content/Context;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 53
    iput-object p8, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 54
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->context:Landroid/content/Context;

    .line 55
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 56
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    .line 57
    iput-object p5, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    .line 58
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    .line 59
    iput-object p6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 60
    iput-object p7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 61
    iput-object p9, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;)Lcom/shopkick/app/util/NotificationCenter;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-object p0
.end method

.method private disableButton(Lcom/shopkick/app/widget/SKButton;)V
    .locals 2

    .line 250
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080187

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x0

    .line 251
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    return-void
.end method

.method private enableButton(Lcom/shopkick/app/widget/SKButton;)V
    .locals 2

    .line 245
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f080091

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x1

    .line 246
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c013a

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v9, p2

    .line 71
    invoke-virtual/range {p0 .. p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 74
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060022

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v10

    .line 75
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0600c6

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 76
    iget-object v3, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0600fe

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    const v4, 0x7f090068

    .line 79
    invoke-virtual {v1, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/widget/SKTextView;

    const v5, 0x7f090067

    .line 80
    invoke-virtual {v1, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/widget/SKTextView;

    const v6, 0x7f090066

    .line 81
    invoke-virtual {v1, v6}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v6

    const v7, 0x7f0904c3

    .line 82
    invoke-virtual {v1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    move-object v11, v7

    check-cast v11, Landroid/view/ViewGroup;

    const v7, 0x7f0904c2

    .line 83
    invoke-virtual {v1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    move-object v12, v7

    check-cast v12, Lcom/shopkick/app/widget/SKTextView;

    const v7, 0x7f0904c1

    .line 84
    invoke-virtual {v1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v13

    const v7, 0x7f0905ff

    .line 85
    invoke-virtual {v1, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    move-object v14, v7

    check-cast v14, Lcom/shopkick/app/widget/SKButton;

    .line 88
    iget-object v7, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-static {v7}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v7

    if-eqz v7, :cond_0

    iget-object v7, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    .line 89
    :goto_0
    iget-object v8, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    invoke-static {v8}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v8

    if-eqz v8, :cond_1

    iget-object v8, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    .line 90
    :goto_1
    iget-object v15, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    invoke-static {v15}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v15

    if-eqz v15, :cond_2

    iget-object v15, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    goto :goto_2

    :cond_2
    const/4 v15, 0x0

    .line 93
    :goto_2
    invoke-static/range {p2 .. p2}, Lcom/shopkick/app/util/TileUtils;->isBarcodeScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v17

    .line 94
    iget-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1, v9}, Lcom/shopkick/app/util/TileUtils;->isIRScanAvailable(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v1

    move-object/from16 v18, v13

    .line 95
    iget-object v13, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v13, v9}, Lcom/shopkick/app/util/TileUtils;->isVideoAvailable(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v13

    if-eqz v17, :cond_3

    move-object/from16 v19, v12

    .line 101
    iget-object v12, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-lez v12, :cond_4

    const/4 v12, 0x0

    const/16 v20, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v19, v12

    :cond_4
    const/4 v12, 0x0

    add-int v16, v12, v7

    move/from16 v20, v16

    :goto_3
    if-eqz v1, :cond_5

    add-int v21, v12, v8

    goto :goto_4

    .line 108
    :cond_5
    iget-object v12, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v12, v12, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v12, v12, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableImageRecognitionScans:Ljava/lang/Boolean;

    invoke-static {v12}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    add-int v20, v20, v8

    const/16 v21, 0x0

    goto :goto_4

    :cond_6
    const/16 v21, 0x0

    :goto_4
    if-eqz v13, :cond_7

    add-int v21, v21, v15

    move/from16 v12, v21

    goto :goto_5

    .line 113
    :cond_7
    iget-object v12, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v12, v12, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v12, v12, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableImageRecognitionScans:Ljava/lang/Boolean;

    invoke-static {v12}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    add-int v20, v20, v15

    move/from16 v12, v21

    goto :goto_5

    :cond_8
    move/from16 v12, v21

    :goto_5
    const/high16 v15, 0x3f800000    # 1.0f

    if-eqz v17, :cond_d

    .line 125
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 126
    invoke-virtual {v4, v15}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 127
    invoke-virtual {v5, v15}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 129
    iget-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v7, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v1, v7}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->isPending(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 130
    invoke-virtual {v4, v3}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 131
    invoke-virtual {v5, v3}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const v1, 0x7f080082

    .line 132
    invoke-virtual {v6, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 133
    iget-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080232

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v14, v1}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const v1, 0x7f110368

    .line 134
    invoke-virtual {v14, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    const/4 v1, 0x0

    goto/16 :goto_7

    .line 136
    :cond_9
    iget-object v1, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const v3, 0x7f110385

    if-nez v1, :cond_b

    iget-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v1, v1, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->limitBbyScans:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 137
    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->getBestBuyScanLimit()I

    move-result v1

    if-gtz v1, :cond_a

    const-string v1, "40560331"

    iget-object v7, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_6

    .line 146
    :cond_a
    invoke-virtual {v4, v10}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 147
    invoke-virtual {v5, v10}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const v1, 0x7f08007f

    .line 148
    invoke-virtual {v6, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 149
    invoke-direct {v0, v14}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->enableButton(Lcom/shopkick/app/widget/SKButton;)V

    .line 150
    invoke-virtual {v14, v3}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 151
    iget-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080091

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v14, v1}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 152
    new-instance v1, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;

    iget-object v13, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    new-instance v8, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;

    iget-object v3, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    iget-object v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    new-instance v6, Ljava/lang/ref/WeakReference;

    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-direct {v6, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v7, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    .line 159
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v17

    move-object v2, v8

    move-object/from16 v5, p2

    move-object v15, v8

    move/from16 v8, v17

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;-><init>(Ljava/lang/ref/WeakReference;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/application/ClientFlagsManager;I)V

    invoke-direct {v1, v13, v9, v15}, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;-><init>(Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View$OnClickListener;)V

    .line 152
    invoke-virtual {v14, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v1, 0x0

    goto :goto_7

    .line 139
    :cond_b
    :goto_6
    invoke-virtual {v4, v2}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 140
    invoke-virtual {v5, v2}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const v1, 0x7f080081

    .line 141
    invoke-virtual {v6, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 142
    iget-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080187

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v14, v1}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x0

    .line 143
    invoke-virtual {v14, v1}, Lcom/shopkick/app/widget/SKButton;->setClickable(Z)V

    .line 144
    invoke-virtual {v14, v3}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    :goto_7
    if-lez v12, :cond_c

    .line 164
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 165
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v1

    const v1, 0x7f0f002a

    invoke-virtual {v2, v1, v12, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v3, v19

    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 166
    invoke-virtual {v3, v10}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    move-object/from16 v15, v18

    const/high16 v1, 0x3f800000    # 1.0f

    .line 168
    invoke-virtual {v15, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 169
    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    goto/16 :goto_8

    :cond_c
    const/16 v1, 0x8

    .line 171
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto/16 :goto_8

    :cond_d
    move/from16 v17, v2

    move-object/from16 v15, v18

    move-object/from16 v3, v19

    const v2, 0x3e99999a    # 0.3f

    if-eqz v1, :cond_e

    .line 176
    invoke-static/range {v20 .. v20}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 177
    invoke-virtual {v4, v10}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 178
    invoke-virtual {v4, v2}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 179
    invoke-virtual {v5, v10}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 180
    invoke-virtual {v5, v2}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    const v1, 0x7f08018d

    .line 181
    invoke-virtual {v6, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    const/4 v1, 0x0

    .line 184
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 185
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    const v1, 0x7f0f002a

    invoke-virtual {v2, v1, v12, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 186
    invoke-virtual {v3, v10}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    .line 188
    invoke-virtual {v15, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 189
    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 191
    invoke-direct {v0, v14}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->enableButton(Lcom/shopkick/app/widget/SKButton;)V

    const v1, 0x7f1101aa

    .line 192
    invoke-virtual {v14, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 193
    new-instance v1, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;

    iget-object v10, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    new-instance v11, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;

    iget-object v3, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    iget-object v4, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    new-instance v6, Ljava/lang/ref/WeakReference;

    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-direct {v6, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v7, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v2, v9, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    .line 200
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    move-object v2, v11

    move-object/from16 v5, p2

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/app/util/ScanClickUtils$GoToScanClickListener;-><init>(Ljava/lang/ref/WeakReference;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/application/ClientFlagsManager;I)V

    invoke-direct {v1, v10, v9, v11}, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;-><init>(Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View$OnClickListener;)V

    .line 193
    invoke-virtual {v14, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_8

    :cond_e
    if-eqz v13, :cond_f

    add-int/2addr v7, v8

    .line 204
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 205
    invoke-virtual {v4, v10}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 206
    invoke-virtual {v4, v2}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 207
    invoke-virtual {v5, v10}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 208
    invoke-virtual {v5, v2}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    const v1, 0x7f08018d

    .line 209
    invoke-virtual {v6, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    const/4 v1, 0x0

    .line 212
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 213
    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v1

    const v1, 0x7f0f002a

    invoke-virtual {v2, v1, v12, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 215
    iget-object v1, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080091

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v14, v1}, Lcom/shopkick/app/widget/SKButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const v1, 0x7f110459

    .line 216
    invoke-virtual {v14, v1}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 217
    new-instance v1, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;

    iget-object v2, v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    new-instance v3, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator$1;

    invoke-direct {v3, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator$1;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;)V

    invoke-direct {v1, v2, v9, v3}, Lcom/shopkick/app/account/AgeVerificationController$VerifyAgeClickListener;-><init>(Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View$OnClickListener;)V

    invoke-virtual {v14, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_8

    .line 228
    :cond_f
    invoke-static/range {v20 .. v20}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    move/from16 v1, v17

    .line 229
    invoke-virtual {v4, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    const/high16 v2, 0x3f800000    # 1.0f

    .line 230
    invoke-virtual {v4, v2}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 231
    invoke-virtual {v5, v1}, Lcom/shopkick/app/widget/SKTextView;->setTextColor(I)V

    .line 232
    invoke-virtual {v5, v2}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    const v1, 0x7f08018d

    .line 233
    invoke-virtual {v6, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    const/16 v1, 0x8

    .line 236
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 238
    invoke-direct {v0, v14}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->disableButton(Lcom/shopkick/app/widget/SKButton;)V

    .line 241
    :goto_8
    invoke-virtual/range {p0 .. p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

.method protected setupLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    const v0, 0x7f0905ff

    .line 256
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    .line 257
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x153

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 258
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setChainId(Ljava/lang/String;)V

    .line 259
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumScanKicks(Ljava/lang/Integer;)V

    .line 260
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 262
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 263
    invoke-virtual {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    const/4 v3, 0x1

    .line 264
    iput-boolean v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 265
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object p1, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 266
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    iput-object p1, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 268
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfferDetailsScanTileConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, v1, p1, v2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method
