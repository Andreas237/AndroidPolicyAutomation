.class public Lcom/shopkick/app/btledetector/BTLEDetectorScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "BTLEDetectorScreen.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# static fields
.field private static beaconComparator:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private beaconAddress:Landroid/widget/TextView;

.field private final beaconCache:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/scanner/Beacon;",
            ">;"
        }
    .end annotation
.end field

.field private final beaconCacheLock:Ljava/lang/Object;

.field private beaconId:Landroid/widget/TextView;

.field private chainName:Landroid/widget/TextView;

.field private currentClosestBeacon:Lcom/shopkick/sdk/scanner/Beacon;

.field private departmentName:Landroid/widget/TextView;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

.field private proximity:Landroid/widget/TextView;

.field private final readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

.field private shopBeaconSensor:Lcom/shopkick/sdk/sensor/Sensor;

.field private final statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

.field private storeAddress:Landroid/widget/TextView;

.field private uiViewBeaconFailure:Landroid/view/View;

.field private uiViewBeaconSuccess:Landroid/view/View;

.field private uiViewBluetoothOff:Landroid/view/View;

.field private uiViewDetecting:Landroid/view/View;

.field private uiViewLocationPermission:Landroid/view/View;

.field private uiViewMessagingDisabled:Landroid/view/View;

.field private uiViewSDKUninitialized:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 194
    new-instance v0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$2;

    invoke-direct {v0}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$2;-><init>()V

    sput-object v0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->beaconComparator:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 51
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 53
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    .line 54
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 55
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 57
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->shopBeaconSensor:Lcom/shopkick/sdk/sensor/Sensor;

    .line 58
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->currentClosestBeacon:Lcom/shopkick/sdk/scanner/Beacon;

    .line 60
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->beaconCache:Ljava/util/List;

    .line 61
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->beaconCacheLock:Ljava/lang/Object;

    .line 63
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewDetecting:Landroid/view/View;

    .line 64
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewBeaconSuccess:Landroid/view/View;

    .line 65
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewBeaconFailure:Landroid/view/View;

    .line 66
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewBluetoothOff:Landroid/view/View;

    .line 67
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewMessagingDisabled:Landroid/view/View;

    .line 68
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewSDKUninitialized:Landroid/view/View;

    .line 70
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewLocationPermission:Landroid/view/View;

    .line 72
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->chainName:Landroid/widget/TextView;

    .line 73
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->departmentName:Landroid/widget/TextView;

    .line 74
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->storeAddress:Landroid/widget/TextView;

    .line 75
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->beaconId:Landroid/widget/TextView;

    .line 76
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->proximity:Landroid/widget/TextView;

    .line 77
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->beaconAddress:Landroid/widget/TextView;

    .line 167
    new-instance v0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$1;-><init>(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    .line 207
    new-instance v0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$3;

    invoke-direct {v0, p0}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$3;-><init>(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)V

    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)Ljava/lang/Object;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->beaconCacheLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)Ljava/util/List;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->beaconCache:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$200()Ljava/util/Comparator;
    .locals 1

    .line 51
    sget-object v0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->beaconComparator:Ljava/util/Comparator;

    return-object v0
.end method

.method static synthetic access$300(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)Lcom/shopkick/sdk/scanner/Beacon;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->currentClosestBeacon:Lcom/shopkick/sdk/scanner/Beacon;

    return-object p0
.end method

.method static synthetic access$302(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;Lcom/shopkick/sdk/scanner/Beacon;)Lcom/shopkick/sdk/scanner/Beacon;
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->currentClosestBeacon:Lcom/shopkick/sdk/scanner/Beacon;

    return-object p1
.end method

.method static synthetic access$400(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)Landroid/widget/TextView;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->beaconId:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic access$500(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;Ljava/lang/String;I)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->fetchDiagnosticInfoForBtlePeripheral(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic access$600(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)Landroid/view/View;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewBluetoothOff:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;Landroid/view/View;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->showUiLayer(Landroid/view/View;)V

    return-void
.end method

.method static synthetic access$800(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)Landroid/view/View;
    .locals 0

    .line 51
    iget-object p0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewDetecting:Landroid/view/View;

    return-object p0
.end method

.method private fetchDiagnosticInfoForBtlePeripheral(Ljava/lang/String;I)V
    .locals 8

    .line 273
    new-instance v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetailsRequest;

    invoke-direct {v2}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetailsRequest;-><init>()V

    .line 274
    iput-object p1, v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetailsRequest;->beaconData:Ljava/lang/String;

    .line 275
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v2, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetailsRequest;->signalStrength:Ljava/lang/Integer;

    .line 277
    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v1, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_SDK:Lcom/shopkick/fetchers/api/RequestDomainId;

    sget-object v5, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v6, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v7, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    const/4 v4, 0x1

    move-object v3, p0

    invoke-virtual/range {v0 .. v7}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method private isBluetoothEnabled()Z
    .locals 3

    .line 249
    invoke-virtual {p0}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string v2, "android.permission.BLUETOOTH"

    .line 253
    invoke-virtual {v0, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 258
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 260
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    return v0

    :cond_1
    return v1
.end method

.method private showUiLayer(Landroid/view/View;)V
    .locals 2

    .line 225
    invoke-direct {p0}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->isBluetoothEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 226
    iget-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewBluetoothOff:Landroid/view/View;

    .line 228
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    if-nez p1, :cond_1

    return-void

    .line 234
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewBluetoothOff:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 235
    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewMessagingDisabled:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 236
    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewDetecting:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 237
    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewBeaconFailure:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 238
    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewBeaconSuccess:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 239
    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewSDKUninitialized:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 240
    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewLocationPermission:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x0

    .line 241
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 5

    .line 295
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_7

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    instance-of p1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetailsResponse;

    if-eqz p1, :cond_7

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetailsResponse;

    iget-object p1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetailsResponse;->btleId:Ljava/lang/Integer;

    if-eqz p1, :cond_7

    .line 299
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetailsResponse;

    const-string p2, "Beacon ID: %1$s"

    .line 301
    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetailsResponse;->btleId:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-static {p2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v3, "Proximity: %1$s"

    .line 302
    new-array v2, v2, [Ljava/lang/Object;

    iget-object v4, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetailsResponse;->proximityLevelName:Ljava/lang/String;

    .line 303
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "Unknown"

    goto :goto_0

    :cond_0
    iget-object v4, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetailsResponse;->proximityLevelName:Ljava/lang/String;

    :goto_0
    aput-object v4, v2, v1

    .line 302
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 304
    iget-object v2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->chainName:Landroid/widget/TextView;

    if-eqz v2, :cond_1

    iget-object v3, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetailsResponse;->chainName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 305
    :cond_1
    iget-object v2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->departmentName:Landroid/widget/TextView;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetailsResponse;->departmentName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 306
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->storeAddress:Landroid/widget/TextView;

    if-eqz v2, :cond_3

    iget-object p1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$BeaconDetailsResponse;->address:Ljava/lang/String;

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 307
    :cond_3
    iget-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->beaconId:Landroid/widget/TextView;

    if-eqz p1, :cond_4

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 308
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->proximity:Landroid/widget/TextView;

    if-eqz p1, :cond_5

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 309
    :cond_5
    iget-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->beaconAddress:Landroid/widget/TextView;

    if-eqz p1, :cond_6

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 311
    :cond_6
    iget-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewBeaconSuccess:Landroid/view/View;

    invoke-direct {p0, p1}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->showUiLayer(Landroid/view/View;)V

    goto :goto_1

    .line 312
    :cond_7
    iget-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->currentClosestBeacon:Lcom/shopkick/sdk/scanner/Beacon;

    if-eqz p1, :cond_b

    const-string p2, "Beacon mac address:\n %1$s"

    .line 313
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/shopkick/sdk/scanner/Beacon;->getAddress()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v1

    invoke-static {p2, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 314
    iget-object p2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->beaconId:Landroid/widget/TextView;

    if-eqz p2, :cond_8

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 315
    :cond_8
    iget-object p2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->proximity:Landroid/widget/TextView;

    if-eqz p2, :cond_9

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 316
    :cond_9
    iget-object p2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->beaconAddress:Landroid/widget/TextView;

    if-eqz p2, :cond_a

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 317
    :cond_a
    iget-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewBeaconSuccess:Landroid/view/View;

    invoke-direct {p0, p1}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->showUiLayer(Landroid/view/View;)V

    goto :goto_1

    .line 319
    :cond_b
    iget-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewBeaconFailure:Landroid/view/View;

    invoke-direct {p0, p1}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->showUiLayer(Landroid/view/View;)V

    :goto_1
    return-void
.end method

.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f11065a

    .line 92
    invoke-virtual {p0, p3}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->setAppScreenTitle(I)V

    const p3, 0x7f0c003d

    const/4 v0, 0x0

    .line 95
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    .line 96
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object p2

    const p3, 0x103012b

    .line 97
    invoke-virtual {p2, p3}, Landroid/content/Context;->setTheme(I)V

    .line 100
    iget-object p2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    if-eqz p2, :cond_0

    .line 104
    iget-object p3, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-static {p3, p2}, Lcom/shopkick/app/util/ShopkickAppStateProvider;->initialize(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;)V

    .line 107
    :cond_0
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p2

    invoke-virtual {p2}, Lcom/shopkick/sdk/SDKClient;->getSensorManager()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object p2

    iget-object p3, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p2, p3}, Lcom/shopkick/sdk/sensor/SensorManager;->setApiManager(Lcom/shopkick/fetchers/api/APIManager;)V

    const p2, 0x7f09008a

    .line 109
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewBluetoothOff:Landroid/view/View;

    const p2, 0x7f09047b

    .line 110
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewMessagingDisabled:Landroid/view/View;

    const p2, 0x7f0901f2

    .line 111
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewDetecting:Landroid/view/View;

    const p2, 0x7f09007d

    .line 112
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewBeaconFailure:Landroid/view/View;

    const p2, 0x7f090080

    .line 113
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewBeaconSuccess:Landroid/view/View;

    const p2, 0x7f09063a

    .line 114
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewSDKUninitialized:Landroid/view/View;

    const p2, 0x7f090443

    .line 115
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewLocationPermission:Landroid/view/View;

    const p3, 0x7f0900e9

    .line 117
    invoke-virtual {p1, p3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->chainName:Landroid/widget/TextView;

    const p3, 0x7f0901e4

    .line 118
    invoke-virtual {p1, p3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->departmentName:Landroid/widget/TextView;

    const p3, 0x7f0906df

    .line 119
    invoke-virtual {p1, p3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->storeAddress:Landroid/widget/TextView;

    const p3, 0x7f09007e

    .line 120
    invoke-virtual {p1, p3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->beaconId:Landroid/widget/TextView;

    const p3, 0x7f090573

    .line 121
    invoke-virtual {p1, p3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->proximity:Landroid/widget/TextView;

    const p3, 0x7f09007c

    .line 122
    invoke-virtual {p1, p3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->beaconAddress:Landroid/widget/TextView;

    .line 125
    new-instance p3, Lcom/shopkick/app/permissions/PermissionsRequestController;

    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-direct {p3, p0, v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/logging/UserEventLogger;)V

    iput-object p3, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    .line 127
    iget-object p3, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 128
    invoke-virtual {p1, p2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p2

    .line 127
    invoke-virtual {p3, v0, p2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->requestPermission(Ljava/lang/String;Landroid/view/View;)V

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 84
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    iput-object p2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->apiManagerV2:Lcom/shopkick/fetchers/api/APIManager;

    .line 85
    iget-object p2, p1, Lcom/shopkick/app/application/ScreenGlobals;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    iput-object p2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 86
    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    iput-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-void
.end method

.method protected onScreenDidHide()V
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->shopBeaconSensor:Lcom/shopkick/sdk/sensor/Sensor;

    if-eqz v0, :cond_0

    .line 161
    invoke-interface {v0}, Lcom/shopkick/sdk/sensor/Sensor;->close()V

    const/4 v0, 0x0

    .line 162
    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->shopBeaconSensor:Lcom/shopkick/sdk/sensor/Sensor;

    :cond_0
    return-void
.end method

.method protected onScreenDidShow()V
    .locals 4

    .line 138
    invoke-direct {p0}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->isBluetoothEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewDetecting:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->showUiLayer(Landroid/view/View;)V

    goto :goto_0

    .line 141
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->uiViewBluetoothOff:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->showUiLayer(Landroid/view/View;)V

    .line 145
    :goto_0
    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->permissionsRequestController:Lcom/shopkick/app/permissions/PermissionsRequestController;

    invoke-virtual {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    .line 148
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object v0

    .line 149
    invoke-virtual {v0}, Lcom/shopkick/sdk/SDKClient;->getSensorManager()Lcom/shopkick/sdk/sensor/SensorManager;

    move-result-object v0

    const-class v1, Lcom/shopkick/sdk/sensor/ShopBeaconSensor;

    iget-object v2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->readingListener:Lcom/shopkick/sdk/sensor/ReadingListener;

    iget-object v3, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->statusListener:Lcom/shopkick/sdk/sensor/StatusListener;

    .line 150
    invoke-virtual {v0, v1, v2, v3}, Lcom/shopkick/sdk/sensor/SensorManager;->open(Ljava/lang/Class;Lcom/shopkick/sdk/sensor/ReadingListener;Lcom/shopkick/sdk/sensor/StatusListener;)Lcom/shopkick/sdk/sensor/Sensor;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->shopBeaconSensor:Lcom/shopkick/sdk/sensor/Sensor;

    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method
