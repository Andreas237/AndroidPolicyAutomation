.class public Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;
.super Ljava/lang/Object;
.source "ScanClickUtils.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/ScanClickUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AvailableStoreOnClickListener"
.end annotation


# instance fields
.field private appScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private configuratorRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;",
            ">;"
        }
    .end annotation
.end field

.field private isReceiptScan:Z

.field private locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

.field private locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

.field private tilePosition:I

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;Ljava/lang/ref/WeakReference;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;IZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Lcom/shopkick/app/cpg/LocationDataSource;",
            "Lcom/shopkick/app/location/LocationNotifier;",
            "Lcom/shopkick/app/util/NotificationCenter;",
            "Lcom/shopkick/app/account/UserAccount;",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            "IZ)V"
        }
    .end annotation

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 176
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    .line 177
    iput-object p2, p0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 178
    iput-object p3, p0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    .line 179
    iput-object p4, p0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    .line 180
    iput-object p5, p0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 181
    iput-object p6, p0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 182
    iput-object p7, p0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 183
    iput p8, p0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->tilePosition:I

    .line 184
    iput-boolean p9, p0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->isReceiptScan:Z

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 17

    move-object/from16 v0, p0

    .line 189
    iget-object v1, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->configuratorRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;

    .line 190
    iget-object v2, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/screens/AppScreen;

    .line 192
    iget-object v3, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    if-eqz v3, :cond_6

    if-eqz v1, :cond_6

    if-nez v2, :cond_0

    goto/16 :goto_3

    .line 194
    :cond_0
    iget-object v3, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v3, v4, :cond_1

    iget-boolean v3, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->isReceiptScan:Z

    if-nez v3, :cond_1

    .line 195
    iget-object v1, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->appScreenRef:Ljava/lang/ref/WeakReference;

    iget-object v2, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object v3, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    .line 197
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/16 v4, 0xc1

    .line 195
    invoke-static {v1, v2, v3, v4}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->goToStoreDetailsScreen(Ljava/lang/ref/WeakReference;Lcom/shopkick/app/cpg/LocationDataSource;Ljava/lang/String;I)V

    goto/16 :goto_2

    .line 201
    :cond_1
    iget-object v3, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-static {v3}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    if-eqz v3, :cond_3

    iget-object v3, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    .line 202
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    .line 205
    :cond_2
    iget-object v3, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->offerBundleIds:Ljava/util/List;

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object v12, v3

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v3, 0x0

    move-object v12, v3

    .line 207
    :goto_1
    new-instance v15, Lcom/shopkick/app/cpg/LocationAvailableDialog;

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v5, v2, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v6, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->locationNotifier:Lcom/shopkick/app/location/LocationNotifier;

    iget-object v7, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->userAccount:Lcom/shopkick/app/account/UserAccount;

    iget-object v8, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object v9, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iget-object v2, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v10, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    iget-object v2, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v11, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object v2, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v13, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    iget v14, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->tilePosition:I

    iget-boolean v4, v0, Lcom/shopkick/app/util/ScanClickUtils$AvailableStoreOnClickListener;->isReceiptScan:Z

    move-object v2, v15

    move/from16 v16, v4

    move-object v4, v1

    move-object v0, v15

    move/from16 v15, v16

    invoke-direct/range {v2 .. v15}, Lcom/shopkick/app/cpg/LocationAvailableDialog;-><init>(Landroid/content/Context;Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/location/LocationNotifier;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/util/NotificationCenter;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 222
    instance-of v2, v1, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    if-eqz v2, :cond_5

    .line 223
    check-cast v1, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;

    .line 224
    iget-object v2, v1, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->dialog:Landroid/app/Dialog;

    if-eqz v2, :cond_4

    iget-object v2, v1, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->dialog:Landroid/app/Dialog;

    invoke-virtual {v2}, Landroid/app/Dialog;->isShowing()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 225
    iget-object v2, v1, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->dialog:Landroid/app/Dialog;

    invoke-virtual {v2}, Landroid/app/Dialog;->dismiss()V

    .line 227
    :cond_4
    iput-object v0, v1, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->dialog:Landroid/app/Dialog;

    .line 230
    :cond_5
    invoke-virtual {v0}, Lcom/shopkick/app/cpg/LocationAvailableDialog;->show()V

    :goto_2
    return-void

    :cond_6
    :goto_3
    return-void
.end method
