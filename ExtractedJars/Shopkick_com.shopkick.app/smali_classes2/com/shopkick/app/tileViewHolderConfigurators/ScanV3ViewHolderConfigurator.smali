.class public Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "ScanV3ViewHolderConfigurator.java"

# interfaces
.implements Lcom/shopkick/app/cpg/LocationAvailableDialog$IScanGoToScreen;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanLaunchScreen;,
        Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;,
        Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;
    }
.end annotation


# instance fields
.field private final LEFT_PADDING_WITHOUT_PLUS_BUTTON_DP:I

.field protected adapterRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;",
            ">;"
        }
    .end annotation
.end field

.field protected ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

.field protected appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field protected appScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field protected clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field protected context:Landroid/content/Context;

.field public dialog:Landroid/app/Dialog;

.field protected listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

.field protected locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

.field protected scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

.field protected urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/cpg/LocationDataSource;Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/application/AppPreferences;)V
    .locals 1

    .line 88
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    const/16 v0, 0xf

    .line 62
    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->LEFT_PADDING_WITHOUT_PLUS_BUTTON_DP:I

    .line 89
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->context:Landroid/content/Context;

    .line 90
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 91
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    .line 92
    iput-object p6, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 93
    iput-object p7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    .line 94
    iput-object p8, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    .line 95
    iput-object p9, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    .line 98
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 99
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->adapterRef:Ljava/lang/ref/WeakReference;

    .line 100
    iput-object p10, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    return-void
.end method

.method private getClickLogging(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;II)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
    .locals 4

    .line 380
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->adapterRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;

    .line 383
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0x91

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 384
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 385
    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->ageVerificationController:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-virtual {v2, p1}, Lcom/shopkick/app/account/AgeVerificationController;->getAgeVerificationStatus(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMinimumAgeEligibility(Ljava/lang/Integer;)V

    .line 387
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->isCPGScreen()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->isTaxonomyKeywordRelatedOffersScreen()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_2

    .line 390
    invoke-interface {v0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;->getCategoryTileForPosition(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object p2

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductHierarchyId(Ljava/lang/String;)V

    goto :goto_1

    .line 388
    :cond_1
    :goto_0
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductHierarchyId(Ljava/lang/String;)V

    .line 392
    :cond_2
    :goto_1
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanMissionId:Ljava/lang/String;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScanMissionId(Ljava/lang/String;)V

    .line 393
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumKicks(Ljava/lang/Integer;)V

    .line 394
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    .line 395
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_3

    move p2, v0

    goto :goto_2

    :cond_3
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    :goto_2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumScanKicks(Ljava/lang/Integer;)V

    .line 397
    :cond_4
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    if-eqz p2, :cond_6

    .line 398
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_3

    :cond_5
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumReceiptScanKicks(Ljava/lang/Integer;)V

    :cond_6
    if-eqz p3, :cond_7

    .line 401
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOfflineScanFailureStatus(Ljava/lang/Integer;)V

    .line 403
    :cond_7
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    return-object v1
.end method

.method public static goToReceiptScanScreen(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 536
    instance-of v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanLaunchScreen;

    if-eqz v0, :cond_0

    .line 537
    check-cast p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanLaunchScreen;

    invoke-interface {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanLaunchScreen;->setLastGoToScanTileIndex(I)V

    :cond_0
    if-eqz p1, :cond_1

    .line 541
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string p2, "chain_id"

    .line 542
    invoke-virtual {p0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "origin_element"

    .line 543
    invoke-static {p7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "location_id"

    .line 544
    invoke-static {p4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "preselected_product_family_id"

    .line 545
    invoke-virtual {p0, p2, p5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "preselected_bundle_id"

    .line 546
    invoke-virtual {p0, p2, p6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    new-instance p2, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class p3, Lcom/shopkick/app/activities/ReceiptScanActivity;

    const-class p4, Lcom/shopkick/app/receipts/ReceiptProductSelectorScreen;

    const/4 p5, 0x0

    invoke-direct {p2, p3, p4, p5}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 549
    invoke-virtual {p2}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;Ljava/util/Map;)Z

    :cond_1
    return-void
.end method

.method public static goToScan(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Ljava/lang/String;Ljava/lang/String;ILjava/lang/ref/WeakReference;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/screens/AppScreen;",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/application/ClientFlagsManager;",
            ">;)V"
        }
    .end annotation

    .line 449
    instance-of v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanLaunchScreen;

    if-eqz v0, :cond_0

    .line 450
    move-object v0, p0

    check-cast v0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanLaunchScreen;

    invoke-interface {v0, p4}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanLaunchScreen;->setLastGoToScanTileIndex(I)V

    :cond_0
    const/4 p4, 0x0

    .line 454
    invoke-virtual {p5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lcom/shopkick/app/application/ClientFlagsManager;

    if-eqz p5, :cond_1

    .line 456
    iget-object p4, p5, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p4, p4, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->enableScanMissionOdp:Ljava/lang/Boolean;

    invoke-static {p4}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p4

    .line 459
    :cond_1
    new-instance p5, Ljava/util/HashMap;

    invoke-direct {p5}, Ljava/util/HashMap;-><init>()V

    const/4 v0, 0x0

    if-eqz p4, :cond_5

    const-string p2, "chain_id"

    .line 461
    iget-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {p5, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "location_id"

    .line 462
    iget-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {p5, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    if-eqz p2, :cond_4

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_1

    .line 467
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 468
    iget-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyIds:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    .line 469
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ","

    .line 470
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    const-string p3, "product_family_ids"

    .line 472
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p5, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "bundle_id"

    .line 473
    invoke-virtual {p1}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object p1

    const-string p3, "bundle_id"

    invoke-virtual {p1, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p5, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    :goto_1
    const-string p2, "product_family_ids"

    .line 464
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p5, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "bundle_id"

    .line 465
    invoke-virtual {p5, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    :goto_2
    const-class p1, Lcom/shopkick/app/products/ScanV2Screen;

    invoke-virtual {p0, p1, p5}, Lcom/shopkick/app/screens/AppScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    goto/16 :goto_7

    :cond_5
    const-string p4, "origin_screen"

    .line 478
    iget-object v1, p0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v1, v1, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p5, p4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p4, "origin_element"

    const/16 v1, 0x91

    .line 479
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p5, p4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p4, "product_family_id"

    .line 480
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p5, p4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p4, "chain_id"

    .line 481
    invoke-virtual {p5, p4, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p3, "location_id"

    .line 482
    invoke-virtual {p5, p3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_6

    const-string p2, "num_kicks"

    const-string p3, "0"

    .line 485
    invoke-virtual {p5, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_6
    const-string p2, "num_kicks"

    .line 487
    iget-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p5, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    const-string p2, "offer_preview_image_url"

    .line 489
    iget-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p5, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "offer_large_image_url"

    .line 490
    iget-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->largeImageUrl:Ljava/lang/String;

    invoke-virtual {p5, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "offer_description"

    .line 491
    iget-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {p5, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "receipt_kicks_available"

    .line 493
    invoke-static {p1}, Lcom/shopkick/app/util/TileUtils;->isReceiptScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result p3

    if-eqz p3, :cond_7

    iget-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object p3

    goto :goto_4

    :cond_7
    move-object p3, v0

    :goto_4
    invoke-virtual {p5, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "receipt_scan_completed"

    .line 494
    invoke-static {p1}, Lcom/shopkick/app/util/TileUtils;->isReceiptScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result p3

    if-eqz p3, :cond_8

    iget-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_8
    invoke-virtual {p5, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "image_rec_token_id"

    .line 496
    iget-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanTokenId:Ljava/lang/String;

    invoke-virtual {p5, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_a

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result p2

    if-nez p2, :cond_9

    goto :goto_5

    :cond_9
    const-string p2, "image_rec_scan_kicks"

    .line 500
    iget-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p5, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_a
    :goto_5
    const-string p2, "image_rec_scan_kicks"

    const-string p3, "0"

    .line 498
    invoke-virtual {p5, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_6
    const-string p2, "image_rec_scan_thumbnail_image_url"

    .line 502
    iget-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanThumbnailImageUrl:Ljava/lang/String;

    invoke-virtual {p5, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "image_rec_scan_description_text"

    .line 503
    iget-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanDescriptionText:Ljava/lang/String;

    invoke-virtual {p5, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "image_rec_scan_large_image_url"

    .line 504
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanLargeImageUrl:Ljava/lang/String;

    invoke-virtual {p5, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    const-class p1, Lcom/shopkick/app/products/ScanScreen;

    invoke-virtual {p0, p1, p5}, Lcom/shopkick/app/screens/AppScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    :goto_7
    return-void
.end method

.method public static goToStoreDetailsScreen(Ljava/lang/ref/WeakReference;Lcom/shopkick/app/cpg/LocationDataSource;Ljava/lang/String;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;",
            "Lcom/shopkick/app/cpg/LocationDataSource;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 626
    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/screens/AppScreen;

    .line 627
    invoke-virtual {p1, p2}, Lcom/shopkick/app/cpg/LocationDataSource;->getLocation(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;

    move-result-object p1

    if-eqz p1, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    .line 631
    :cond_0
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "chain_id"

    .line 633
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "location_id"

    .line 634
    iget-object v1, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "location_name"

    .line 635
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->name:Ljava/lang/String;

    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 638
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/screens/ScreenInfo;->getScreenEnum(Ljava/lang/Class;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const-string v0, "origin_screen"

    .line 639
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "origin_element"

    .line 640
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 641
    const-class p1, Lcom/shopkick/app/store/StoreDetailsScreen;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/screens/AppScreen;->goToScreen(Ljava/lang/Class;Ljava/util/Map;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method private isCPGScreen()Z
    .locals 2

    .line 649
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    .line 650
    instance-of v1, v0, Lcom/shopkick/app/cpg/CPGLocationScreen;

    if-nez v1, :cond_1

    instance-of v0, v0, Lcom/shopkick/app/cpg/CPGCategoryScreen;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private isTaxonomyKeywordRelatedOffersScreen()Z
    .locals 1

    .line 654
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    .line 655
    instance-of v0, v0, Lcom/shopkick/app/shoppinglists/TaxonomyKeywordRelatedOffersScreen;

    return v0
.end method

.method private setupImpressionLogging(Lcom/shopkick/app/logging/UserEventImageView;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ILandroid/view/View;I)V
    .locals 5

    .line 331
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    .line 332
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->adapterRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;

    if-eqz v0, :cond_a

    if-nez v1, :cond_0

    goto/16 :goto_4

    .line 337
    :cond_0
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v3, 0x91

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 338
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 339
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 340
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->isCPGScreen()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->isTaxonomyKeywordRelatedOffersScreen()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 344
    :cond_1
    invoke-interface {v1, p3}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$IScanV3TileAdapter;->getCategoryTileForPosition(I)Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    move-result-object v1

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    .line 343
    invoke-virtual {v2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductHierarchyId(Ljava/lang/String;)V

    goto :goto_1

    .line 341
    :cond_2
    :goto_0
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductHierarchyId(Ljava/lang/String;)V

    .line 346
    :goto_1
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanMissionId:Ljava/lang/String;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScanMissionId(Ljava/lang/String;)V

    .line 347
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumKicks(Ljava/lang/Integer;)V

    .line 348
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    .line 349
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    move v1, v3

    goto :goto_2

    :cond_3
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumScanKicks(Ljava/lang/Integer;)V

    .line 351
    :cond_4
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    if-eqz v1, :cond_6

    .line 352
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :goto_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumReceiptScanKicks(Ljava/lang/Integer;)V

    :cond_6
    if-eqz p5, :cond_7

    .line 355
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    invoke-virtual {v2, p5}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setOfflineScanFailureStatus(Ljava/lang/Integer;)V

    .line 358
    :cond_7
    new-instance p5, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p5}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 359
    invoke-virtual {p0, p5}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 360
    iput-object p4, p5, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 361
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    iput-object p4, p5, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 362
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->isMOATScanEnabled()Z

    move-result p4

    if-eqz p4, :cond_8

    .line 363
    iget-object p4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    iput-object p4, p5, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->viewabilityTrackingDetails:Lcom/shopkick/app/fetchers/api/skapi/ViewabilityTrackingDetails;

    const/4 p4, 0x1

    .line 364
    iput-boolean p4, p5, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->useZMoatIID:Z

    .line 367
    :cond_8
    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    iput-object p4, p5, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    .line 368
    invoke-virtual {p1}, Lcom/shopkick/app/logging/UserEventImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p4

    if-nez p4, :cond_9

    .line 369
    iget-object p4, p5, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->extraImpressionConstraintKeys:Ljava/util/ArrayList;

    const-string v1, "ImageConstraintKey"

    invoke-virtual {p4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 371
    :cond_9
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    iput-object p3, p5, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->verticalListDisplayPos:Ljava/lang/Integer;

    .line 372
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object p2, p5, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 374
    iget-object p2, v0, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v2, p2, p5}, Lcom/shopkick/app/logging/UserEventImageView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void

    :cond_a
    :goto_4
    return-void
.end method

.method public static shouldShowLocationAvailableButton(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z
    .locals 1

    .line 645
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationIds:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f09053e

    .line 433
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public dismissDialog()V
    .locals 1

    .line 617
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->dialog:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 618
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->dialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0193

    return v0
.end method

.method public goToScreenFromDialog(ZLcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 8

    if-eqz p1, :cond_0

    .line 596
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->chainId:Ljava/lang/String;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    const/16 v7, 0xc6

    move v2, p5

    move-object v5, p3

    move-object v6, p4

    invoke-static/range {v0 .. v7}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->goToReceiptScanScreen(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 605
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    iget-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->locationDataSource:Lcom/shopkick/app/cpg/LocationDataSource;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/BasicLocationInfoV2;->locationId:Ljava/lang/String;

    const/16 p4, 0xc2

    invoke-static {p1, p3, p2, p4}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->goToStoreDetailsScreen(Ljava/lang/ref/WeakReference;Lcom/shopkick/app/cpg/LocationDataSource;Ljava/lang/String;I)V

    :goto_0
    return-void
.end method

.method protected isBBYScanLimitEnableAndReached(Ljava/lang/String;)Z
    .locals 1

    .line 579
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->limitBbyScans:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 580
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getBestBuyScanLimit()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "40560331"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f09053e

    .line 415
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    .line 416
    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$1;

    invoke-direct {v1, p0, v0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$1;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;Landroid/widget/ImageView;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 428
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->mainImageUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequest;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 31

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 109
    invoke-virtual/range {p0 .. p1}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 117
    iget-object v1, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f060022

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    .line 118
    iget-object v3, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0600c6

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    const v4, 0x7f0904ba

    .line 122
    invoke-virtual {v0, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v4

    const v5, 0x7f090066

    .line 123
    invoke-virtual {v0, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v5

    const v7, 0x7f090590

    .line 125
    invoke-virtual {v0, v7}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v7

    const v8, 0x7f090589

    .line 126
    invoke-virtual {v0, v8}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v8

    const v9, 0x7f090494

    .line 127
    invoke-virtual {v0, v9}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v9

    .line 130
    iget-object v10, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v10}, Lcom/shopkick/app/util/FeatureFlagHelper;->areImageRecognitionScansEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v10

    .line 131
    invoke-static/range {p2 .. p2}, Lcom/shopkick/app/util/TileUtils;->isBarcodeScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v11

    .line 132
    iget-object v12, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v12, v2}, Lcom/shopkick/app/util/TileUtils;->isIRScanAvailable(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v12

    .line 133
    iget-object v13, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v13, v2}, Lcom/shopkick/app/util/TileUtils;->isVideoAvailable(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v13

    .line 134
    invoke-static/range {p2 .. p2}, Lcom/shopkick/app/util/TileUtils;->isReceiptScanAvailable(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Z

    move-result v14

    const v15, 0x7f090545

    .line 137
    invoke-virtual {v0, v15}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v15

    move-object/from16 v16, v8

    .line 138
    iget-object v8, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v15, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    iget-object v8, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-static {v8}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v8

    if-eqz v8, :cond_0

    iget-object v8, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    .line 142
    :goto_0
    iget-object v15, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    invoke-static {v15}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v15

    if-eqz v15, :cond_1

    iget-object v15, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->imageRecScanKicks:Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v15

    move-object/from16 v17, v7

    goto :goto_1

    :cond_1
    move-object/from16 v17, v7

    const/4 v15, 0x0

    .line 143
    :goto_1
    iget-object v7, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    invoke-static {v7}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v7

    if-eqz v7, :cond_2

    iget-object v7, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoKicks:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move-object/from16 v18, v9

    goto :goto_2

    :cond_2
    move-object/from16 v18, v9

    const/4 v7, 0x0

    .line 144
    :goto_2
    iget-object v9, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-static {v9}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v9

    if-eqz v9, :cond_3

    iget-object v9, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanKicks:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    move/from16 v19, v14

    goto :goto_3

    :cond_3
    move/from16 v19, v14

    const/4 v9, 0x0

    :goto_3
    if-gtz v8, :cond_5

    if-eqz v10, :cond_4

    if-gtz v15, :cond_5

    if-lez v7, :cond_4

    goto :goto_4

    :cond_4
    const/16 v20, 0x0

    goto :goto_5

    :cond_5
    :goto_4
    const/16 v20, 0x1

    :goto_5
    if-lez v9, :cond_6

    const/16 v21, 0x1

    goto :goto_6

    :cond_6
    const/16 v21, 0x0

    :goto_6
    const v14, 0x7f090671

    .line 155
    invoke-virtual {v0, v14}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v14

    move/from16 v22, v9

    if-eqz v20, :cond_7

    if-eqz v21, :cond_7

    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    const/16 v9, 0x8

    .line 156
    :goto_7
    invoke-virtual {v14, v9}, Landroid/view/View;->setVisibility(I)V

    if-nez v11, :cond_8

    if-nez v12, :cond_8

    if-eqz v13, :cond_9

    .line 159
    :cond_8
    iget-object v9, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainId:Ljava/lang/String;

    invoke-virtual {v6, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->isBBYScanLimitEnableAndReached(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_a

    .line 161
    :cond_9
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const v9, 0x7f080081

    .line 162
    invoke-virtual {v5, v9}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_8

    .line 164
    :cond_a
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const v9, 0x7f08007f

    .line 165
    invoke-virtual {v5, v9}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_8
    if-eqz v11, :cond_b

    add-int/lit8 v9, v8, 0x0

    goto :goto_9

    :cond_b
    const/4 v9, 0x0

    :goto_9
    if-eqz v12, :cond_c

    add-int/2addr v9, v15

    :cond_c
    if-eqz v13, :cond_d

    add-int/2addr v9, v7

    const/4 v14, 0x0

    goto :goto_a

    :cond_d
    const/4 v14, 0x0

    :goto_a
    add-int/2addr v8, v14

    if-eqz v10, :cond_e

    add-int/2addr v8, v7

    add-int/2addr v8, v15

    .line 188
    :cond_e
    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setVisibility(I)V

    .line 189
    invoke-virtual {v5, v14}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v5, 0x1

    if-ge v9, v5, :cond_f

    .line 190
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_b

    :cond_f
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    :goto_b
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 193
    iget-object v4, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v5, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->isPending(Ljava/lang/String;)Z

    move-result v4

    const v5, 0x7f09051b

    if-eqz v4, :cond_10

    .line 194
    invoke-virtual {v0, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_c

    .line 196
    :cond_10
    invoke-virtual {v0, v5}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    :goto_c
    const v4, 0x7f090272

    .line 200
    invoke-virtual {v0, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    .line 201
    iget-object v5, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v7, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v5, v7}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanErrorCodeOnOfflineScan(Ljava/lang/String;)I

    move-result v5

    if-eqz v11, :cond_11

    .line 202
    iget-object v8, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-nez v8, :cond_11

    if-eqz v5, :cond_11

    const/4 v8, 0x0

    .line 203
    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    .line 204
    new-instance v8, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;

    iget-object v9, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->context:Landroid/content/Context;

    iget-object v10, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v14, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    iget-object v15, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v7, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    .line 208
    invoke-virtual {v15, v7}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanErrorCodeOnOfflineScan(Ljava/lang/String;)I

    move-result v28

    .line 209
    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v7

    invoke-direct {v6, v2, v7, v5}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->getClickLogging(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;II)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v29

    iget-object v7, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    move-object/from16 v23, v8

    move-object/from16 v24, v9

    move-object/from16 v25, v10

    move-object/from16 v26, v4

    move-object/from16 v27, v14

    move-object/from16 v30, v7

    invoke-direct/range {v23 .. v30}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator$FailedOfflineScanOverlayListener;-><init>(Landroid/content/Context;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Landroid/view/View;Ljava/lang/String;ILcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;)V

    .line 204
    invoke-virtual {v4, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_d

    :cond_11
    const/16 v5, 0x8

    .line 213
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    const/4 v5, 0x0

    .line 214
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 v5, 0x0

    :goto_d
    const v4, 0x7f0906bc

    .line 217
    invoke-virtual {v0, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v4

    .line 218
    iget-object v7, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isSpecial:Ljava/lang/Boolean;

    invoke-static {v7}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_12

    const/4 v7, 0x0

    goto :goto_e

    :cond_12
    const/16 v7, 0x8

    :goto_e
    invoke-virtual {v4, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    const v4, 0x7f090600

    .line 221
    invoke-virtual {v0, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/RelativeLayout;

    .line 222
    invoke-virtual {v7}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    .line 223
    instance-of v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v9, :cond_13

    .line 224
    check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v9, 0x0

    iput v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 225
    iput v9, v8, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 227
    :cond_13
    invoke-virtual {v7}, Landroid/widget/RelativeLayout;->requestLayout()V

    .line 230
    new-instance v8, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v8}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 231
    invoke-virtual {v6, v8}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    const/4 v9, 0x1

    .line 232
    iput-boolean v9, v8, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    if-nez v11, :cond_14

    if-nez v12, :cond_14

    if-nez v13, :cond_14

    if-eqz v19, :cond_17

    .line 233
    :cond_14
    iget-object v9, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    iget-object v10, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    .line 234
    invoke-virtual {v9, v10}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->isPending(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_17

    .line 235
    iget-object v9, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    if-eqz v9, :cond_16

    .line 236
    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v9

    invoke-virtual {v6, v7, v2, v9}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->setupOpenKDOClickListener(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)V

    .line 237
    iget-object v9, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v9}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/shopkick/app/screens/AppScreen;

    if-eqz v9, :cond_15

    .line 238
    instance-of v10, v7, Lcom/shopkick/app/logging/IUserEventView;

    if-eqz v10, :cond_15

    .line 239
    check-cast v7, Lcom/shopkick/app/logging/IUserEventView;

    .line 243
    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v10

    .line 241
    invoke-direct {v6, v2, v10, v5}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->getClickLogging(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;II)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v10

    iget-object v9, v9, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 240
    invoke-interface {v7, v10, v9, v8}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    :cond_15
    const/4 v8, 0x0

    goto :goto_f

    :cond_16
    const/4 v8, 0x0

    goto :goto_f

    .line 252
    :cond_17
    invoke-virtual {v0, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 253
    invoke-virtual {v0, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v7, v8}, Landroid/view/View;->setClickable(Z)V

    :goto_f
    if-eqz v21, :cond_1a

    .line 258
    iget-object v7, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    invoke-static {v7}, Lcom/shopkick/app/util/TypeUtils;->isPositive(Ljava/lang/Integer;)Z

    move-result v7

    if-eqz v7, :cond_18

    .line 259
    iget-object v7, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->context:Landroid/content/Context;

    const v9, 0x7f110630

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    iget-object v11, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumPurchaseRequirement:Ljava/lang/Integer;

    aput-object v11, v10, v8

    invoke-virtual {v7, v9, v10}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v9, v18

    invoke-virtual {v9, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 261
    invoke-virtual {v9, v8}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_10

    :cond_18
    move-object/from16 v9, v18

    const/16 v7, 0x8

    .line 263
    invoke-virtual {v9, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 265
    :goto_10
    invoke-static/range {v22 .. v22}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v8, v17

    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v7, 0x7f080262

    .line 270
    iget-object v9, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->receiptScanCompleted:Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_19

    const v7, 0x7f080261

    move v1, v3

    .line 276
    :cond_19
    invoke-virtual {v8, v1}, Landroid/widget/TextView;->setTextColor(I)V

    move-object/from16 v1, v16

    .line 277
    invoke-virtual {v1, v7}, Landroid/widget/ImageView;->setImageResource(I)V

    const/4 v3, 0x0

    .line 279
    invoke-virtual {v8, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 280
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_11

    :cond_1a
    move-object/from16 v1, v16

    move-object/from16 v8, v17

    move-object/from16 v9, v18

    const/16 v3, 0x8

    .line 283
    invoke-virtual {v9, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 284
    invoke-virtual {v8, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 285
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_11
    const v1, 0x7f090530

    .line 289
    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v1

    .line 290
    iget-object v3, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v3}, Lcom/shopkick/app/util/FeatureFlagHelper;->isShoppingListEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v3

    if-eqz v3, :cond_1e

    iget-object v3, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    if-eqz v3, :cond_1e

    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    if-eqz v3, :cond_1c

    iget-object v3, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->isOfferBundle:Ljava/lang/Boolean;

    .line 291
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_1b

    const/4 v3, 0x0

    goto :goto_12

    :cond_1b
    const/16 v3, 0x8

    goto :goto_14

    :cond_1c
    const/4 v3, 0x0

    .line 292
    :goto_12
    invoke-virtual {v1, v3}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 293
    iget-object v3, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-virtual {v3, v7, v4}, Lcom/shopkick/app/shoppinglists/ListAddController;->hasBeenAdded(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1d

    const v3, 0x7f080249

    .line 294
    invoke-virtual {v1, v3}, Lcom/shopkick/app/logging/UserEventImageView;->setImageResource(I)V

    goto :goto_13

    :cond_1d
    const v3, 0x7f080191

    .line 296
    invoke-virtual {v1, v3}, Lcom/shopkick/app/logging/UserEventImageView;->setImageResource(I)V

    .line 298
    :goto_13
    new-instance v3, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;

    iget-object v4, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->listAddController:Lcom/shopkick/app/shoppinglists/ListAddController;

    iget-object v7, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {v3, v2, v4, v7}, Lcom/shopkick/app/util/ScanClickUtils$AddToListClickListener;-><init>(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/shoppinglists/ListAddController;Lcom/shopkick/app/logging/UserEventLogger;)V

    invoke-virtual {v1, v3}, Lcom/shopkick/app/logging/UserEventImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_15

    :cond_1e
    const/16 v3, 0x8

    .line 302
    :goto_14
    invoke-virtual {v1, v3}, Lcom/shopkick/app/logging/UserEventImageView;->setVisibility(I)V

    .line 305
    invoke-virtual {v0, v4}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    const/16 v3, 0xf

    iget-object v4, v6, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->context:Landroid/content/Context;

    .line 306
    invoke-static {v3, v4}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    :goto_15
    const v1, 0x7f090601

    .line 312
    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    const/4 v1, 0x0

    .line 313
    invoke-virtual {v4, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const v1, 0x7f09053e

    .line 316
    invoke-virtual {v0, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getUserEventImageView(I)Lcom/shopkick/app/logging/UserEventImageView;

    move-result-object v1

    .line 320
    invoke-virtual/range {p1 .. p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v3

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    .line 317
    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->setupImpressionLogging(Lcom/shopkick/app/logging/UserEventImageView;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;ILandroid/view/View;I)V

    return-void
.end method

.method public setupOpenKDOClickListener(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;I)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p3, 0x1

    .line 438
    invoke-virtual {p1, p3}, Landroid/view/View;->setClickable(Z)V

    .line 439
    new-instance p3, Lcom/shopkick/app/util/ScanClickUtils$OfferDetailsScreenOnClickListener;

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 440
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    invoke-direct {p3, p2, v0}, Lcom/shopkick/app/util/ScanClickUtils$OfferDetailsScreenOnClickListener;-><init>(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/screens/AppScreen;)V

    .line 439
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setupZoomClickListener(Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 5

    const/4 v0, 0x1

    .line 554
    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 555
    new-instance v1, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->context:Landroid/content/Context;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    .line 558
    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/screens/AppScreen;

    iget-object v4, v4, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {v1, p2, v2, v3, v4}, Lcom/shopkick/app/util/ScanClickUtils$ZoomClickListener;-><init>(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/logging/UserEventLogger;)V

    .line 555
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 560
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->appScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/screens/AppScreen;

    if-nez v1, :cond_0

    return-void

    .line 565
    :cond_0
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v3, 0x92

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 566
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v2, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 568
    new-instance p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 569
    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/ScanV3ViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 570
    iput-boolean v0, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 572
    instance-of v0, p1, Lcom/shopkick/app/logging/IUserEventView;

    if-eqz v0, :cond_1

    .line 573
    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    .line 574
    iget-object v0, v1, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p1, v2, v0, p2}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    :cond_1
    return-void
.end method
