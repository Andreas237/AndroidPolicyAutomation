.class public Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;
.super Ljava/lang/Object;
.source "ScanBCDataSource.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;
.implements Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;


# static fields
.field public static final OFFLINE_SCAN_BARCODE_ENQUEUED:Ljava/lang/String; = "offlineScanBarcodeEnqueued"

.field public static final OFFLINE_SCAN_BARCODE_READY:Ljava/lang/String; = "offlineScanBarcodeReady"

.field public static final PREFIX_OFFLINE_DATA_STORE:Ljava/lang/String; = "SCAN_INFO-"

.field public static final SCANS_BARCODE_UPDATED_EVENT:Ljava/lang/String; = "scansBarcodeUpdatedEvent"

.field public static final SCANS_BARCODE_UPDATE_FAILED_EVENT:Ljava/lang/String; = "scansBarcodeUpdateFailedEvent"

.field public static final SCAN_BARCODE_CLIENT_SIDE_VALIDATION_ERROR_WITH_STATUS:Ljava/lang/String; = "scanBarcodeErrorWithStatus"

.field public static final SCAN_BARCODE_ERROR_STATUS_KEY:Ljava/lang/String; = "scanBarcodeErrorStatusKey"

.field public static final SCAN_BARCODE_RESPONSE_COMPLETED:Ljava/lang/String; = "scanBarcodeResponseCompleted"

.field public static final SCAN_BARCODE_RESPONSE_FAILURE:Ljava/lang/String; = "scanBarcodeResponseFailure"

.field public static final SCAN_BARCODE_RESPONSE_KEY:Ljava/lang/String; = "scanBarcodeResponseKey"


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appPref:Lcom/shopkick/app/application/AppPreferences;

.field private awardsManager:Lcom/shopkick/app/awards/AwardsManager;

.field private barcodesToProductFamilyIds:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private chainIdsToProductFamilyIds:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private errorRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsRecordScanErrorsRequest;

.field private failedOfflineScanPersistentMap:Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;

.field private getProductScanInfosRequests:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/GetProductScanInfosRequest;",
            ">;"
        }
    .end annotation
.end field

.field private lastScanTimeMs:J

.field public final locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

.field private logger:Lcom/shopkick/app/application/SKLogger;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

.field private productFamilyIdsToEntities:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;",
            ">;"
        }
    .end annotation
.end field

.field private productFamilyIdsToScanInfos:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;",
            ">;"
        }
    .end annotation
.end field

.field private scanErrors:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ScanError;",
            ">;"
        }
    .end annotation
.end field

.field private scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;

.field private validatingScanDialog:Landroid/app/ProgressDialog;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/offline/OfflineDataStore;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/awards/AwardsManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/dialog/DialogsManager;Lcom/shopkick/app/application/SKLogger;Lcom/shopkick/app/application/AppPreferences;)V
    .locals 1

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    new-instance v0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource$1;-><init>(Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;)V

    iput-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    .line 122
    iput-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    .line 123
    iput-object p3, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 124
    iput-object p4, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 125
    iput-object p5, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 126
    iput-object p6, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    .line 127
    iput-object p7, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 128
    iput-object p9, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->logger:Lcom/shopkick/app/application/SKLogger;

    .line 129
    iput-object p8, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    .line 130
    iput-object p10, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->appPref:Lcom/shopkick/app/application/AppPreferences;

    const-string p2, "AppActivityManagerSessionStartDelayedEvent"

    .line 132
    invoke-virtual {p3, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p2, "UserAccountIdChangedEvent"

    .line 133
    invoke-virtual {p3, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p2, "offlineScanSucceeded"

    .line 134
    invoke-virtual {p3, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p2, "eventScanIrResponseSuccess"

    .line 135
    invoke-virtual {p3, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p2, "EventVideoAwardRequestCompleted"

    .line 136
    invoke-virtual {p3, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 138
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->barcodesToProductFamilyIds:Ljava/util/HashMap;

    .line 139
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->chainIdsToProductFamilyIds:Ljava/util/HashMap;

    .line 140
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToScanInfos:Ljava/util/HashMap;

    .line 141
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToEntities:Ljava/util/HashMap;

    .line 142
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanErrors:Ljava/util/ArrayList;

    const-wide/16 p8, 0x0

    .line 143
    iput-wide p8, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->lastScanTimeMs:J

    .line 145
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getProductScanInfosRequests:Ljava/util/ArrayList;

    .line 146
    invoke-static {p1, p5, p7, p3}, Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;->getInstance(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->failedOfflineScanPersistentMap:Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;

    .line 150
    invoke-static {p1, p7, p3}, Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;->getInstance(Landroid/content/Context;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)Lcom/shopkick/app/products/ScanUnavailabilityReportPersistentMap;

    .line 152
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 153
    new-instance p2, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource$2;

    invoke-direct {p2, p0}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource$2;-><init>(Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;)V

    invoke-virtual {p1, p2, p8, p9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Landroid/location/Location;)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->handleLocationUpdate(Landroid/location/Location;)V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->startLoad()V

    return-void
.end method

.method private createIdentifier(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 462
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "scan:v3:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v1}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getScanInfoForBarcodeAndProductFamilyIdHelper(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;
    .locals 2

    .line 466
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->barcodesToProductFamilyIds:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 467
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->barcodesToProductFamilyIds:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 468
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToScanInfos:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 469
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToScanInfos:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private handleLocationUpdate(Landroid/location/Location;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 163
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {p1, v0}, Lcom/shopkick/sdk/presence/LocationManager;->removeLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    const/4 p1, 0x1

    .line 164
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->syncScans(Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

.method private logFailedScanRequest(I)V
    .locals 5

    .line 491
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    if-eqz v0, :cond_1

    .line 492
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x3b9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 493
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 494
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->lat:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLat(Ljava/lang/Double;)V

    .line 495
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->lng:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLng(Ljava/lang/Double;)V

    .line 496
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->accuracy:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAccuracy(Ljava/lang/Double;)V

    .line 497
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->currTimestamp:Ljava/lang/Long;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->coordTimestamp:Ljava/lang/Long;

    if-eqz v1, :cond_0

    .line 498
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->currTimestamp:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v3, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object v3, v3, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->coordTimestamp:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sub-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setCoordAge(Ljava/lang/Integer;)V

    .line 500
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductIds(Ljava/util/ArrayList;)V

    .line 501
    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->getProductIds()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 502
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setHttpStatusCode(Ljava/lang/Integer;)V

    const/4 p1, 0x1

    .line 503
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMode(Ljava/lang/String;)V

    .line 505
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method private recordScanError(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 478
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ScanError;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ScanError;-><init>()V

    .line 479
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/ScanError;->barcode:Ljava/lang/String;

    .line 480
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/ScanError;->locationId:Ljava/lang/String;

    .line 481
    iput-object p3, v0, Lcom/shopkick/app/fetchers/api/skapi/ScanError;->productFamilyIds:Ljava/util/List;

    .line 482
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/ScanError;->status:Ljava/lang/Integer;

    .line 483
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/ScanError;->clientTimestampMs:Ljava/lang/Long;

    .line 484
    invoke-static {p4}, Lcom/shopkick/app/util/TypeUtils;->isEmptyString(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 485
    iput-object p4, v0, Lcom/shopkick/app/fetchers/api/skapi/ScanError;->bundleId:Ljava/lang/String;

    .line 487
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanErrors:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private startLoad()V
    .locals 2

    .line 458
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    const/4 v1, 0x5

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntitiesForOfflineDataCategory(ILcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;)V

    return-void
.end method

.method private syncScans(Ljava/lang/Integer;)V
    .locals 2

    .line 296
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x5

    .line 297
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 298
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-virtual {v1, v0, p0, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->syncOfflineDataCategories(Ljava/util/List;Lcom/shopkick/app/offline/IOfflineDataCategorySyncCallback;Ljava/lang/Integer;)V

    return-void
.end method

.method private updateScansFromEntities(Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;",
            ">;)V"
        }
    .end annotation

    .line 510
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    .line 511
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->scanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    if-nez v1, :cond_1

    goto :goto_0

    .line 514
    :cond_1
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->scanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    .line 515
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodes:Ljava/util/List;

    if-nez v2, :cond_2

    goto :goto_0

    .line 519
    :cond_2
    iget-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodes:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 520
    iget-object v4, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->barcodesToProductFamilyIds:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 521
    iget-object v4, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->barcodesToProductFamilyIds:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    iget-object v4, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 523
    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 524
    iget-object v5, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 525
    iget-object v5, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->barcodesToProductFamilyIds:Ljava/util/HashMap;

    invoke-virtual {v5, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 529
    :cond_4
    iget-object v2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToScanInfos:Ljava/util/HashMap;

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    iget-object v2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToEntities:Ljava/util/HashMap;

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 532
    iget-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->chainIds:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 533
    iget-object v3, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->chainIdsToProductFamilyIds:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 534
    iget-object v3, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->chainIdsToProductFamilyIds:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    iget-object v3, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 536
    :cond_5
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 537
    iget-object v4, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 538
    iget-object v4, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->chainIdsToProductFamilyIds:Ljava/util/HashMap;

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 543
    :cond_6
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "scansBarcodeUpdatedEvent"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 3

    .line 172
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->clearStateOnScreenDestroyed()V

    .line 173
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/shopkick/app/offline/OfflineDataStore;->clearCategory(I)V

    .line 174
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->barcodesToProductFamilyIds:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 175
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->chainIdsToProductFamilyIds:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToScanInfos:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 177
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToEntities:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 178
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanErrors:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const-wide/16 v0, 0x0

    .line 179
    iput-wide v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->lastScanTimeMs:J

    .line 181
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getProductScanInfosRequests:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/GetProductScanInfosRequest;

    .line 182
    iget-object v2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    goto :goto_0

    .line 184
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getProductScanInfosRequests:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public clearStateOnScreenDestroyed()V
    .locals 2

    .line 191
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->errorRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsRecordScanErrorsRequest;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    const/4 v0, 0x0

    .line 193
    iput-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    .line 194
    iput-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->errorRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsRecordScanErrorsRequest;

    .line 195
    iput-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->validatingScanDialog:Landroid/app/ProgressDialog;

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 6

    .line 663
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_5

    .line 664
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v2, "scanBarcodeResponseKey"

    .line 665
    invoke-virtual {v0, v2, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 666
    iget-boolean v2, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    .line 667
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;

    .line 669
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->status:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-nez p2, :cond_0

    .line 670
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->currTimestamp:Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->lastScanTimeMs:J

    .line 671
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToEntities:Ljava/util/HashMap;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanV2Response;->updatedOfferTile:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    if-eqz p1, :cond_0

    .line 673
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->scanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanCompleted:Ljava/lang/Boolean;

    .line 674
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->setEntity(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    .line 677
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "scanBarcodeResponseCompleted"

    invoke-virtual {p1, p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    goto/16 :goto_1

    .line 679
    :cond_1
    iget v2, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 v4, 0x2

    if-eq v2, v4, :cond_3

    iget v2, p2, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 v4, 0x7

    if-ne v2, v4, :cond_2

    goto :goto_0

    .line 708
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "scanBarcodeResponseFailure"

    invoke-virtual {p1, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 709
    invoke-virtual {p2}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->logFailedScanRequest(I)V

    goto/16 :goto_1

    .line 680
    :cond_3
    :goto_0
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->productFamilyId:Ljava/lang/String;

    invoke-direct {p0, v2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->createIdentifier(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 681
    iget-object v4, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    invoke-virtual {v4, v2}, Lcom/shopkick/app/awards/AwardsManager;->containsRequestWithIdentifier(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_4

    iget-object v4, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->productFamilyId:Ljava/lang/String;

    .line 682
    invoke-virtual {p0, v4}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfoForProductFamilyId(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 687
    const-class p2, Lcom/shopkick/app/overlays/scans/OfflineScanOverlay;

    invoke-static {p2}, Lcom/shopkick/app/overlays/base/OverlaysManager;->buildOverlaySpec(Ljava/lang/Class;)Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;

    move-result-object p2

    .line 688
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->tapToDismiss:Ljava/lang/Boolean;

    const-string v0, "offline_scan"

    .line 689
    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;->overlayType:Ljava/lang/String;

    .line 690
    invoke-static {}, Lcom/shopkick/app/overlays/base/OverlaysManager;->getInstance()Lcom/shopkick/app/overlays/base/OverlaysManager;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/shopkick/app/overlays/base/OverlaysManager;->addOverlay(Lcom/shopkick/app/fetchers/api/skapi/OverlaySpec;)V

    .line 692
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->currTimestamp:Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->lastScanTimeMs:J

    .line 693
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->barcode:Ljava/lang/String;

    invoke-virtual {p2, v2, v0, p1}, Lcom/shopkick/app/awards/AwardsManager;->makeScanRequest(Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;)V

    .line 696
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "offlineScanBarcodeEnqueued"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_1

    .line 698
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "scanBarcodeResponseFailure"

    invoke-virtual {p1, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 699
    invoke-virtual {p2}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->logFailedScanRequest(I)V

    .line 700
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p2, 0x76

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 701
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 702
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->lat:Ljava/lang/Double;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLat(Ljava/lang/Double;)V

    .line 703
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->lng:Ljava/lang/Double;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLng(Ljava/lang/Double;)V

    .line 704
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMode(Ljava/lang/String;)V

    .line 705
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 712
    :goto_1
    iput-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    goto :goto_4

    .line 713
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->errorRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsRecordScanErrorsRequest;

    if-ne p1, v0, :cond_7

    .line 714
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_6

    .line 715
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanErrors:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 717
    :cond_6
    iput-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->errorRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsRecordScanErrorsRequest;

    goto :goto_4

    .line 718
    :cond_7
    instance-of v0, p1, Lcom/shopkick/app/fetchers/api/skapi/GetProductScanInfosRequest;

    if-eqz v0, :cond_a

    .line 719
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_9

    .line 720
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 721
    iget-object p2, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/GetProductScanInfosResponse;

    .line 722
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/GetProductScanInfosResponse;->productScanInfos:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    .line 723
    new-instance v2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    invoke-direct {v2}, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;-><init>()V

    .line 724
    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->scanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    .line 725
    iget-object v3, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->productFamilyId:Ljava/lang/String;

    const-string v4, "SCAN_INFO-"

    const/4 v5, 0x5

    invoke-virtual {v3, v1, v5, v4}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntityKeyForId(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityKey:Ljava/lang/String;

    const-string v1, "OFFLINE_DATA_TEMP_ENTITY_VERSION"

    .line 727
    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->entityVersion:Ljava/lang/String;

    .line 728
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->dataCategory:Ljava/lang/Integer;

    .line 729
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 731
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/offline/OfflineDataStore;->setEntity(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    goto :goto_2

    .line 733
    :cond_8
    invoke-direct {p0, v0}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->updateScansFromEntities(Ljava/util/ArrayList;)V

    goto :goto_3

    .line 735
    :cond_9
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "scansBarcodeUpdateFailedEvent"

    invoke-virtual {p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 737
    :goto_3
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getProductScanInfosRequests:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_a
    :goto_4
    return-void
.end method

.method public fetchScanInfos(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 283
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 286
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetProductScanInfosRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetProductScanInfosRequest;-><init>()V

    .line 287
    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetProductScanInfosRequest;->productFamilyIds:Ljava/util/List;

    .line 288
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getProductScanInfosRequests:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 289
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public getChainIds()Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 204
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->chainIdsToProductFamilyIds:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public getScanErrorCodeOnOfflineScan(Ljava/lang/String;)I
    .locals 2

    .line 445
    invoke-virtual {p0, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->isPending(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 449
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->failedOfflineScanPersistentMap:Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 450
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_1
    return v1
.end method

.method public getScanInfoForBarcodeAndProductFamilyId(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;
    .locals 5

    const-string v0, "^0*"

    const-string v1, ""

    .line 258
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 261
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToScanInfos:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 265
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfoForBarcodeAndProductFamilyIdHelper(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const/4 v0, 0x0

    move v2, v0

    .line 270
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-gt v2, v3, :cond_3

    .line 272
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "*"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 273
    invoke-direct {p0, v3, p2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfoForBarcodeAndProductFamilyIdHelper(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object v3

    if-eqz v3, :cond_2

    return-object v3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public getScanInfoForProductFamilyId(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToScanInfos:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 243
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToScanInfos:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getScanInfosForChain(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;",
            ">;"
        }
    .end annotation

    .line 223
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 225
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->chainIdsToProductFamilyIds:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 226
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->chainIdsToProductFamilyIds:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 227
    iget-object v2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToScanInfos:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 228
    iget-object v2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToScanInfos:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 232
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p1
.end method

.method public hasScanInfos()Z
    .locals 1

    .line 213
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToScanInfos:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public isPending(Ljava/lang/String;)Z
    .locals 1

    .line 434
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->createIdentifier(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/awards/AwardsManager;->containsRequestWithIdentifier(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public makeRecordScanErrorsRequest()V
    .locals 2

    .line 419
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->errorRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsRecordScanErrorsRequest;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanErrors:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 422
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ProductsRecordScanErrorsRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ProductsRecordScanErrorsRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->errorRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsRecordScanErrorsRequest;

    .line 423
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->errorRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsRecordScanErrorsRequest;

    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanErrors:Ljava/util/ArrayList;

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ProductsRecordScanErrorsRequest;->scanErrors:Ljava/util/List;

    .line 424
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public onCategoryReadFromDisk(ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;",
            ">;)V"
        }
    .end annotation

    .line 568
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->barcodesToProductFamilyIds:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 569
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->chainIdsToProductFamilyIds:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 570
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToScanInfos:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 571
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToEntities:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 573
    invoke-direct {p0, p2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->updateScansFromEntities(Ljava/util/ArrayList;)V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 582
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    const/4 v3, 0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "offlineScanSucceeded"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    goto :goto_1

    :sswitch_1
    const-string v0, "AppActivityManagerSessionStartDelayedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_1

    :sswitch_2
    const-string v0, "UserAccountIdChangedEvent"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v3

    goto :goto_1

    :sswitch_3
    const-string v0, "firstUseCompletedByUser"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_1

    :sswitch_4
    const-string v0, "eventScanIrResponseSuccess"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v2

    goto :goto_1

    :sswitch_5
    const-string v0, "EventVideoAwardRequestCompleted"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x5

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_5

    :pswitch_0
    const-string p1, "ParamVideoId"

    .line 632
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 636
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToEntities:Ljava/util/HashMap;

    invoke-virtual {p2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 637
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToEntities:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 638
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToEntities:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    .line 639
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->scanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->videoId:Ljava/lang/Long;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 640
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->scanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->videoCompleted:Ljava/lang/Boolean;

    .line 641
    iget-object v1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/offline/OfflineDataStore;->setEntity(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    goto :goto_2

    :pswitch_1
    const-string p1, "paramProductFamilyId"

    .line 621
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 623
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToEntities:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 624
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToEntities:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    .line 625
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->scanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->imageRecognitionScanCompleted:Ljava/lang/Boolean;

    .line 626
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/offline/OfflineDataStore;->setEntity(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    goto/16 :goto_5

    .line 615
    :pswitch_2
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "firstUseCompletedByUser"

    invoke-virtual {p1, p0, p2}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 616
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->syncScans(Ljava/lang/Integer;)V

    goto/16 :goto_5

    :pswitch_3
    const-string p1, "productFamilyIdsKey"

    .line 601
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    .line 603
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 604
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToEntities:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 605
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->productFamilyIdsToEntities:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;

    .line 606
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;->scanInfo:Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;->barcodeScanCompleted:Ljava/lang/Boolean;

    .line 607
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-virtual {v0, p2}, Lcom/shopkick/app/offline/OfflineDataStore;->setEntity(Lcom/shopkick/app/fetchers/api/skapi/OfflineDataEntity;)V

    goto :goto_3

    .line 611
    :cond_3
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->makeRecordScanErrorsRequest()V

    .line 612
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "offlineScanBarcodeReady"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_5

    .line 593
    :pswitch_4
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->clear()V

    .line 594
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getFirstUseCompleted()Z

    move-result p1

    if-nez p1, :cond_4

    .line 595
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "firstUseCompletedByUser"

    invoke-virtual {p1, p0, p2, v1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    goto :goto_5

    .line 597
    :cond_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->syncScans(Ljava/lang/Integer;)V

    goto :goto_5

    .line 584
    :pswitch_5
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 586
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->syncScans(Ljava/lang/Integer;)V

    goto :goto_4

    .line 588
    :cond_5
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->locationUpdateListener:Lcom/shopkick/sdk/presence/LocationUpdateListener;

    invoke-virtual {p1, p2}, Lcom/shopkick/sdk/presence/LocationManager;->addLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 590
    :goto_4
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->makeRecordScanErrorsRequest()V

    :cond_6
    :goto_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6bae06a8 -> :sswitch_5
        -0x1b10bf5e -> :sswitch_4
        -0xc4b42ca -> :sswitch_3
        0x44e6563 -> :sswitch_2
        0x4bde1661 -> :sswitch_1
        0x58aa2341 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onSyncFailed(I)V
    .locals 0

    return-void
.end method

.method public onSyncFinished(IZ)V
    .locals 1

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    if-eqz p2, :cond_0

    .line 553
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->offlineDataStore:Lcom/shopkick/app/offline/OfflineDataStore;

    invoke-virtual {p2, p1, p0}, Lcom/shopkick/app/offline/OfflineDataStore;->getEntitiesForOfflineDataCategory(ILcom/shopkick/app/offline/IReadOfflineCategoryFromDiskCallback;)V

    :cond_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    .line 656
    iget-object p2, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->validatingScanDialog:Landroid/app/ProgressDialog;

    if-eqz p1, :cond_0

    .line 657
    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method public removeFamilyIdFromFailedOfflineScan(Ljava/lang/String;)V
    .locals 1

    .line 454
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->failedOfflineScanPersistentMap:Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/products/FailedOfflineScanPersistentMap;->removeKey(Ljava/lang/String;)V

    return-void
.end method

.method public requestValidateBarcode(Ljava/lang/String;[BLjava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/shopkick/app/application/DeviceInfo;Landroid/app/ProgressDialog;Lcom/shopkick/app/application/ProfileInfo;Lcom/shopkick/app/application/AppPreferences;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[B",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/shopkick/app/application/DeviceInfo;",
            "Landroid/app/ProgressDialog;",
            "Lcom/shopkick/app/application/ProfileInfo;",
            "Lcom/shopkick/app/application/AppPreferences;",
            ")V"
        }
    .end annotation

    move-object v6, p0

    move-object v1, p1

    move-object/from16 v0, p9

    move-object/from16 v2, p8

    move-object/from16 v3, p10

    .line 311
    iput-object v2, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->validatingScanDialog:Landroid/app/ProgressDialog;

    .line 312
    iget-object v4, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    if-nez v4, :cond_b

    if-eqz p3, :cond_b

    invoke-virtual {p3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_3

    .line 316
    :cond_0
    iget-object v4, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    invoke-virtual {v4}, Lcom/shopkick/app/awards/AwardsManager;->clearExpiredRequests()V

    .line 319
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v7, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->lastScanTimeMs:J

    iget-object v9, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v9, v9, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v9, v9, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->scanningMinimumIntervalSec:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    mul-int/lit16 v9, v9, 0x3e8

    int-to-long v9, v9

    add-long/2addr v7, v9

    cmp-long v4, v4, v7

    if-gtz v4, :cond_1

    .line 320
    invoke-virtual/range {p8 .. p8}, Landroid/app/ProgressDialog;->dismiss()V

    const/4 v5, 0x5

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p5

    move-object v3, p3

    move-object/from16 v4, p4

    .line 322
    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->recordScanError(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;I)V

    .line 323
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "scanBarcodeErrorStatusKey"

    const/4 v2, 0x5

    .line 324
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    iget-object v1, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "scanBarcodeErrorWithStatus"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void

    :cond_1
    if-eqz v1, :cond_a

    const-string v4, ""

    .line 333
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 334
    invoke-virtual {p0, v7}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfoForProductFamilyId(Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object v8

    if-nez v8, :cond_3

    goto :goto_0

    .line 337
    :cond_3
    invoke-virtual {p0, p1, v7}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->getScanInfoForBarcodeAndProductFamilyId(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/fetchers/api/skapi/ProductScanInfo;

    move-result-object v8

    if-eqz v8, :cond_2

    goto :goto_0

    :cond_4
    move-object v7, v4

    .line 345
    :goto_0
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    const/4 v8, 0x1

    if-eqz v4, :cond_5

    .line 346
    invoke-virtual/range {p8 .. p8}, Landroid/app/ProgressDialog;->dismiss()V

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p5

    move-object v3, p3

    move-object/from16 v4, p4

    .line 347
    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->recordScanError(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;I)V

    .line 348
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "scanBarcodeErrorStatusKey"

    .line 349
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    iget-object v1, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "scanBarcodeErrorWithStatus"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    goto/16 :goto_2

    .line 353
    :cond_5
    new-instance v4, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    invoke-direct {v4}, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;-><init>()V

    iput-object v4, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    .line 354
    iget-object v4, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iput-object v7, v4, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->productFamilyId:Ljava/lang/String;

    move-object/from16 v5, p5

    .line 355
    iput-object v5, v4, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->locationId:Ljava/lang/String;

    move-object/from16 v7, p6

    .line 356
    iput-object v7, v4, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->chainId:Ljava/lang/String;

    .line 357
    iput-object v1, v4, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->barcode:Ljava/lang/String;

    .line 358
    invoke-virtual/range {p7 .. p7}, Lcom/shopkick/app/application/DeviceInfo;->getAdd()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->add:Ljava/lang/String;

    .line 359
    iget-object v4, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    const v7, 0x7f10000a

    move-object/from16 v9, p7

    invoke-virtual {v9, v7}, Lcom/shopkick/app/application/DeviceInfo;->getKcid(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v4, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->kcid:Ljava/lang/String;

    .line 362
    iget-object v4, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz v4, :cond_6

    iget-object v4, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    invoke-static {v4}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 363
    iget-object v3, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iget-object v0, v0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->birthdate:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/DateUtils;->stringToDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 364
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v10

    .line 363
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v3, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->userSpecifiedBirthdateMs:Ljava/lang/Long;

    goto :goto_1

    :cond_6
    const-string/jumbo v0, "user_birthday"

    .line 365
    invoke-virtual {v3, v0}, Lcom/shopkick/app/application/AppPreferences;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 366
    iget-object v0, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    const-string/jumbo v4, "user_birthday"

    invoke-virtual {v3, v4}, Lcom/shopkick/app/application/AppPreferences;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/shopkick/app/util/DateUtils;->stringToDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    .line 367
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    .line 366
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v0, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->userSpecifiedBirthdateMs:Ljava/lang/Long;

    .line 372
    :cond_7
    :goto_1
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 374
    iget-object v1, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->lat:Ljava/lang/Double;

    .line 375
    iget-object v1, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->lng:Ljava/lang/Double;

    .line 376
    iget-object v1, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->accuracy:Ljava/lang/Double;

    .line 377
    iget-object v1, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->coordTimestamp:Ljava/lang/Long;

    .line 378
    iget-object v1, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    invoke-virtual {v0}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->provider:Ljava/lang/String;

    .line 379
    iget-object v1, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    invoke-virtual {v0}, Landroid/location/Location;->isFromMockProvider()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->mStatus:Ljava/lang/Boolean;

    .line 392
    iget-object v0, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->currTimestamp:Ljava/lang/Long;

    .line 393
    iget-object v0, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->sendScanImage:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_8

    if-eqz p2, :cond_8

    .line 394
    new-instance v0, Ljava/lang/String;

    invoke-static {p2}, Lorg/bouncycastle/util/encoders/Base64;->encode([B)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    .line 395
    iget-object v1, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;->imageData:Ljava/lang/String;

    .line 397
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_8

    .line 398
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 399
    invoke-virtual/range {p7 .. p7}, Lcom/shopkick/app/application/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setDeviceModel(Ljava/lang/String;)V

    const/4 v1, 0x3

    .line 400
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setScanImageFailureType(Ljava/lang/Integer;)V

    .line 401
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMode(Ljava/lang/String;)V

    .line 402
    iget-object v1, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    .line 407
    :cond_8
    iget-object v0, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v1, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->scanRequest:Lcom/shopkick/app/fetchers/api/skapi/ProductsScanRequestV3;

    invoke-virtual {v0, v1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    .line 410
    invoke-virtual {p0}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->makeRecordScanErrorsRequest()V

    goto :goto_2

    .line 381
    :cond_9
    invoke-virtual/range {p8 .. p8}, Landroid/app/ProgressDialog;->dismiss()V

    const/4 v7, 0x2

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p5

    move-object v3, p3

    move-object/from16 v4, p4

    move v5, v7

    .line 382
    invoke-direct/range {v0 .. v5}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->recordScanError(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;I)V

    .line 384
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "scanBarcodeErrorStatusKey"

    const/4 v2, 0x2

    .line 385
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    iget-object v1, v6, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "scanBarcodeErrorWithStatus"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void

    :cond_a
    :goto_2
    return-void

    :cond_b
    :goto_3
    return-void
.end method
