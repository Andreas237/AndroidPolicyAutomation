.class public Lcom/shopkick/app/permissions/PermissionsRequestController;
.super Ljava/lang/Object;
.source "PermissionsRequestController.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;
.implements Lcom/shopkick/app/activities/IActivityResultListener;
.implements Lcom/shopkick/app/permissions/IRequestPermissionsResultListener;


# static fields
.field public static final HIGH_ACCURACY_LOCATION:Ljava/lang/String; = "HIGH_ACCURACY_LOCATION"

.field public static final PERM_BLUETOOTH:I = 0x1

.field public static final PERM_CAMERA:I = 0x5

.field public static final PERM_HIGH_ACCURACY_LOCATION:I = 0x2

.field public static final PERM_LOCATION:I = 0x4

.field public static final PERM_MICROPHONE:I = 0x3

.field public static final WALKIN_PERMISSIONS:Ljava/lang/String; = "WALKIN_PERMISSIONS"


# instance fields
.field private appScreenWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/screens/AppScreen;",
            ">;"
        }
    .end annotation
.end field

.field private final callbacksExecutor:Ljava/util/concurrent/Executor;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private isPermissionRequestInProgress:Z

.field private permToViewWeakRefMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/logging/UserEventLogger;)V
    .locals 1

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->callbacksExecutor:Ljava/util/concurrent/Executor;

    const/4 v0, 0x0

    .line 70
    iput-boolean v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionRequestInProgress:Z

    .line 95
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    .line 96
    iput-object p2, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 97
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p2

    .line 98
    invoke-virtual {p2, p0}, Lcom/shopkick/app/activities/BaseActivity;->addActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 99
    invoke-virtual {p2, p0}, Lcom/shopkick/app/activities/BaseActivity;->addPermissionResultListener(Lcom/shopkick/app/permissions/IRequestPermissionsResultListener;)V

    .line 100
    new-instance p2, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p1

    .line 101
    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p1

    sget-object p2, Lcom/google/android/gms/location/LocationServices;->API:Lcom/google/android/gms/common/api/Api;

    .line 102
    invoke-virtual {p1, p2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p1

    .line 103
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 104
    iget-object p1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    .line 106
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->permToViewWeakRefMap:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 0

    .line 90
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/permissions/PermissionsRequestController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/logging/UserEventLogger;)V

    .line 91
    iput-object p3, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/permissions/PermissionsRequestController;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->callbacksExecutor:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/permissions/PermissionsRequestController;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/permissions/PermissionsRequestController;ILjava/lang/String;Landroid/content/Context;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
    .locals 0

    .line 57
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/app/permissions/PermissionsRequestController;->getLogRecord(ILjava/lang/String;Landroid/content/Context;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/permissions/PermissionsRequestController;)Lcom/shopkick/app/logging/UserEventLogger;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/permissions/PermissionsRequestController;)Lcom/google/android/gms/common/api/GoogleApiClient;
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    return-object p0
.end method

.method private getLogRecord(ILjava/lang/String;Landroid/content/Context;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;
    .locals 2

    .line 570
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 571
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "android.permission.RECORD_AUDIO"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_1

    :sswitch_1
    const-string v1, "HIGH_ACCURACY_LOCATION"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x5

    goto :goto_1

    :sswitch_2
    const-string v1, "WALKIN_PERMISSIONS"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x2

    goto :goto_1

    :sswitch_3
    const-string v1, "android.permission.CAMERA"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_1

    :sswitch_4
    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_1

    :sswitch_5
    const-string v1, "android.permission.BLUETOOTH"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x3

    goto :goto_1

    :cond_0
    :goto_0
    const/4 p2, -0x1

    :goto_1
    packed-switch p2, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    const/16 p2, 0x11c

    .line 592
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    goto :goto_2

    :pswitch_1
    const/16 p2, 0xd3

    .line 589
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    goto :goto_2

    :pswitch_2
    const/16 p2, 0xd4

    .line 586
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    goto :goto_2

    :pswitch_3
    const/16 p2, 0x128

    .line 580
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    const-string p2, "HIGH_ACCURACY_LOCATION"

    .line 581
    invoke-static {p2, p3}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setGpsPermissionGranted(Ljava/lang/Boolean;)V

    const-string p2, "android.permission.BLUETOOTH"

    .line 582
    invoke-static {p2, p3}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setBlePermissionGranted(Ljava/lang/Boolean;)V

    const-string p2, "android.permission.RECORD_AUDIO"

    .line 583
    invoke-static {p2, p3}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setMicPermissionGranted(Ljava/lang/Boolean;)V

    goto :goto_2

    :pswitch_4
    const/16 p2, 0xd5

    .line 576
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    goto :goto_2

    :pswitch_5
    const/16 p2, 0xd6

    .line 573
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 597
    :goto_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x2ccd38b2 -> :sswitch_5
        -0x3c1ac56 -> :sswitch_4
        0x1b9efa65 -> :sswitch_3
        0x46489653 -> :sswitch_2
        0x615b7ade -> :sswitch_1
        0x6d24f988 -> :sswitch_0
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

.method private static isHighAccuracyLocationEnabled(Landroid/content/Context;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-string v1, "location"

    .line 624
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/location/LocationManager;

    const-string v1, "gps"

    .line 625
    invoke-virtual {p0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "network"

    .line 626
    invoke-virtual {p0, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz v1, :cond_1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public static isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z
    .locals 1

    const/4 v0, 0x0

    .line 546
    invoke-static {p0, p1, v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p0

    return p0
.end method

.method public static isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;)Z
    .locals 3
    .param p2    # Lcom/shopkick/app/application/ClientFlagsManager;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 511
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "android.permission.RECORD_AUDIO"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_1

    :sswitch_1
    const-string v0, "HIGH_ACCURACY_LOCATION"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_1

    :sswitch_2
    const-string v0, "WALKIN_PERMISSIONS"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    goto :goto_1

    :sswitch_3
    const-string v0, "android.permission.CAMERA"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_1

    :sswitch_4
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_1

    :sswitch_5
    const-string v0, "android.permission.BLUETOOTH"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, -0x1

    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 540
    invoke-static {p0, p1}, Lcom/shopkick/app/permissions/PermissionUtils;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p0

    return p0

    :pswitch_0
    const-string p0, "android.permission.BLUETOOTH"

    .line 531
    invoke-static {p0, p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "HIGH_ACCURACY_LOCATION"

    invoke-static {p0, p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_2

    :cond_1
    move v1, v2

    :goto_2
    if-eqz v1, :cond_3

    if-eqz p2, :cond_2

    .line 534
    invoke-virtual {p2}, Lcom/shopkick/app/application/ClientFlagsManager;->getClientAppUIFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    move-result-object p0

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->disableMicrophonePermission:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_3

    :cond_2
    const-string p0, "android.permission.RECORD_AUDIO"

    .line 535
    invoke-static {p0, p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p0

    return p0

    :cond_3
    return v1

    .line 529
    :pswitch_1
    invoke-static {p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isHighAccuracyLocationEnabled(Landroid/content/Context;)Z

    move-result p0

    return p0

    :pswitch_2
    const-string p0, "android.permission.RECORD_AUDIO"

    .line 527
    invoke-static {p0, p1}, Lcom/shopkick/app/permissions/PermissionUtils;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p0

    return p0

    :pswitch_3
    const-string p0, "android.permission.CAMERA"

    .line 525
    invoke-static {p0, p1}, Lcom/shopkick/app/permissions/PermissionUtils;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p0

    return p0

    .line 516
    :pswitch_4
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p0

    if-nez p0, :cond_4

    return v2

    .line 522
    :cond_4
    invoke-virtual {p0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result p0

    if-eqz p0, :cond_5

    const-string p0, "android.permission.BLUETOOTH"

    invoke-static {p0, p1}, Lcom/shopkick/app/permissions/PermissionUtils;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_5

    goto :goto_3

    :cond_5
    move v1, v2

    :goto_3
    return v1

    .line 513
    :pswitch_5
    invoke-static {p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isSystemLocationEnabled(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_6

    const-string p0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 514
    invoke-static {p0, p1}, Lcom/shopkick/app/permissions/PermissionUtils;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_6

    goto :goto_4

    :cond_6
    move v1, v2

    :goto_4
    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x2ccd38b2 -> :sswitch_5
        -0x3c1ac56 -> :sswitch_4
        0x1b9efa65 -> :sswitch_3
        0x46489653 -> :sswitch_2
        0x615b7ade -> :sswitch_1
        0x6d24f988 -> :sswitch_0
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

.method public static isSystemLocationEnabled(Landroid/content/Context;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const-string v1, "location"

    .line 609
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/location/LocationManager;

    const-string v1, "gps"

    .line 610
    invoke-virtual {p0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "network"

    .line 611
    invoke-virtual {p0, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p0

    if-nez v1, :cond_1

    if-eqz p0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public static synthetic lambda$setupBluetoothPermissionView$52(Lcom/shopkick/app/permissions/PermissionsRequestController;Landroid/view/View;)V
    .locals 3

    .line 393
    iget-object p1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-nez p1, :cond_0

    return-void

    .line 398
    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 403
    :cond_1
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    .line 405
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.bluetooth.adapter.action.REQUEST_ENABLE"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 406
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/shopkick/app/activities/BaseActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    :cond_2
    const-string v0, "android.permission.BLUETOOTH"

    .line 407
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/shopkick/app/permissions/PermissionUtils;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 409
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    const-string v2, "android.permission.BLUETOOTH"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    :cond_3
    :goto_0
    const/4 v0, 0x7

    const-string v1, "android.permission.BLUETOOTH"

    .line 414
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 412
    invoke-direct {p0, v0, v1, p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->getLogRecord(ILjava/lang/String;Landroid/content/Context;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p1

    .line 415
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method public static synthetic lambda$setupCameraPermissionView$53(Lcom/shopkick/app/permissions/PermissionsRequestController;Landroid/view/View;)V
    .locals 3

    .line 424
    iget-object p1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-eqz p1, :cond_1

    .line 425
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x7

    const-string v1, "android.permission.CAMERA"

    .line 431
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 429
    invoke-direct {p0, v0, v1, v2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->getLogRecord(ILjava/lang/String;Landroid/content/Context;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v0

    .line 432
    iget-object v1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 433
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/permissions/PermissionUtils;->openSettingsApp(Landroid/content/Context;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic lambda$setupMicrophonePermissionView$54(Lcom/shopkick/app/permissions/PermissionsRequestController;Landroid/view/View;)V
    .locals 3

    .line 442
    iget-object p1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-eqz p1, :cond_1

    .line 443
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x7

    const-string v1, "android.permission.RECORD_AUDIO"

    .line 449
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 447
    invoke-direct {p0, v0, v1, v2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->getLogRecord(ILjava/lang/String;Landroid/content/Context;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v0

    .line 450
    iget-object v1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 451
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/shopkick/app/permissions/PermissionUtils;->openSettingsApp(Landroid/content/Context;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic lambda$setupWalkinPermissionsView$49(Lcom/shopkick/app/permissions/PermissionsRequestController;Lcom/shopkick/app/screens/AppScreen;Landroid/view/View;)V
    .locals 1

    .line 169
    iget-boolean p2, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionRequestInProgress:Z

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x1

    .line 172
    iput-boolean p2, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionRequestInProgress:Z

    const/4 p2, 0x7

    const-string v0, "WALKIN_PERMISSIONS"

    .line 175
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 173
    invoke-direct {p0, p2, v0, p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->getLogRecord(ILjava/lang/String;Landroid/content/Context;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p1

    .line 176
    iget-object p2, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    const/4 p1, 0x0

    .line 177
    invoke-direct {p0, p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->maybeShowNextPermissionRequestDialog(I)V

    return-void
.end method

.method public static synthetic lambda$showMicrophonePermissionRequestDialog$55(Lcom/shopkick/app/permissions/PermissionsRequestController;Landroid/content/DialogInterface;)V
    .locals 0

    const/4 p1, 0x0

    .line 561
    iput-boolean p1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionRequestInProgress:Z

    return-void
.end method

.method private maybeShowNextPermissionRequestDialog(I)V
    .locals 4

    .line 258
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    if-nez v0, :cond_0

    return-void

    .line 263
    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v1

    const-string v2, "android.permission.BLUETOOTH"

    .line 264
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v2

    const/4 v3, 0x1

    if-nez v2, :cond_2

    if-ge p1, v3, :cond_2

    .line 266
    invoke-virtual {v1}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result p1

    if-nez p1, :cond_1

    .line 268
    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.bluetooth.adapter.action.REQUEST_ENABLE"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 269
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    invoke-virtual {v0, p1, v3}, Lcom/shopkick/app/activities/BaseActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto/16 :goto_0

    :cond_1
    const-string p1, "android.permission.BLUETOOTH"

    .line 270
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/shopkick/app/permissions/PermissionUtils;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_6

    .line 272
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    const-string v0, "android.permission.BLUETOOTH"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v3}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    const-string v1, "HIGH_ACCURACY_LOCATION"

    .line 274
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x2

    if-ge p1, v1, :cond_3

    .line 277
    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->create()Lcom/google/android/gms/location/LocationRequest;

    move-result-object p1

    const/16 v1, 0x64

    .line 278
    invoke-virtual {p1, v1}, Lcom/google/android/gms/location/LocationRequest;->setPriority(I)Lcom/google/android/gms/location/LocationRequest;

    .line 280
    new-instance v1, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;-><init>()V

    invoke-virtual {v1, p1}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;->addLocationRequest(Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/location/LocationSettingsRequest$Builder;

    move-result-object p1

    .line 281
    invoke-virtual {p1, v3}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;->setAlwaysShow(Z)Lcom/google/android/gms/location/LocationSettingsRequest$Builder;

    .line 283
    sget-object v1, Lcom/google/android/gms/location/LocationServices;->SettingsApi:Lcom/google/android/gms/location/SettingsApi;

    iget-object v2, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 285
    invoke-virtual {p1}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;->build()Lcom/google/android/gms/location/LocationSettingsRequest;

    move-result-object p1

    .line 283
    invoke-interface {v1, v2, p1}, Lcom/google/android/gms/location/SettingsApi;->checkLocationSettings(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/location/LocationSettingsRequest;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object p1

    .line 286
    new-instance v1, Lcom/shopkick/app/permissions/PermissionsRequestController$1;

    invoke-direct {v1, p0, v0}, Lcom/shopkick/app/permissions/PermissionsRequestController$1;-><init>(Lcom/shopkick/app/permissions/PermissionsRequestController;Lcom/shopkick/app/screens/AppScreen;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    goto :goto_0

    .line 312
    :cond_3
    iget-object v1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/shopkick/app/application/ClientFlagsManager;->getClientAppUIFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    move-result-object v1

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->disableMicrophonePermission:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    const-string v1, "android.permission.RECORD_AUDIO"

    .line 313
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v1, 0x3

    if-ge p1, v1, :cond_5

    .line 315
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    sget-object v0, Lcom/shopkick/app/permissions/PermissionUtils;->WALKIN_PERMISSIONS:[Ljava/lang/String;

    const/16 v1, 0x1e

    invoke-static {p1, v0, v1}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    .line 317
    iput-boolean p1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionRequestInProgress:Z

    .line 318
    invoke-virtual {p0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showPermViewsIfDisabled()V

    :cond_6
    :goto_0
    return-void
.end method

.method private setupBluetoothPermissionView(Landroid/view/View;)V
    .locals 1

    .line 390
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 392
    :cond_0
    new-instance v0, Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$-O4jhoDF6pthSLA260OCCTzt3l8;

    invoke-direct {v0, p0}, Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$-O4jhoDF6pthSLA260OCCTzt3l8;-><init>(Lcom/shopkick/app/permissions/PermissionsRequestController;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setupCameraPermissionView(Landroid/view/View;)V
    .locals 2

    .line 420
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v0, 0x7f090014

    .line 422
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f11033d

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 423
    new-instance v0, Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$h4611LQiOCln2fUcZ4wreqmZJwg;

    invoke-direct {v0, p0}, Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$h4611LQiOCln2fUcZ4wreqmZJwg;-><init>(Lcom/shopkick/app/permissions/PermissionsRequestController;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setupCoarseLocationPermissionView(Landroid/view/View;)V
    .locals 2

    .line 323
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v1, 0x7f090014

    .line 328
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    .line 329
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isSystemLocationEnabled(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f11033d

    .line 330
    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 333
    :cond_1
    new-instance v0, Lcom/shopkick/app/permissions/PermissionsRequestController$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/permissions/PermissionsRequestController$2;-><init>(Lcom/shopkick/app/permissions/PermissionsRequestController;)V

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setupMicrophonePermissionView(Landroid/view/View;)V
    .locals 2

    .line 438
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v0, 0x7f090014

    .line 440
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/widget/SKTextView;

    const v1, 0x7f1104b7

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 441
    new-instance v0, Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$fLxtdiG8vyzlG9bvt9RfxISd2nQ;

    invoke-direct {v0, p0}, Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$fLxtdiG8vyzlG9bvt9RfxISd2nQ;-><init>(Lcom/shopkick/app/permissions/PermissionsRequestController;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private setupWalkinPermissionsView(Landroid/view/View;)V
    .locals 3

    .line 161
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const v1, 0x7f0900b8

    .line 166
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    .line 167
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x41800000    # 16.0f

    mul-float/2addr v1, v2

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setWidthToTextWidth(F)V

    .line 168
    new-instance v1, Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$Zyksm4Dwkrp_WyBYTwbRCy7cCRA;

    invoke-direct {v1, p0, v0}, Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$Zyksm4Dwkrp_WyBYTwbRCy7cCRA;-><init>(Lcom/shopkick/app/permissions/PermissionsRequestController;Lcom/shopkick/app/screens/AppScreen;)V

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private showMicrophonePermissionRequestDialog(Lcom/shopkick/app/screens/AppScreen;)V
    .locals 2

    .line 553
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 557
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v0, Lcom/shopkick/app/permissions/PermissionUtils;->WALKIN_PERMISSIONS:[Ljava/lang/String;

    new-instance v1, Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$at2ssQdx-Y2Uh21demRg4f3k0xQ;

    invoke-direct {v1, p0}, Lcom/shopkick/app/permissions/-$$Lambda$PermissionsRequestController$at2ssQdx-Y2Uh21demRg4f3k0xQ;-><init>(Lcom/shopkick/app/permissions/PermissionsRequestController;)V

    .line 556
    invoke-static {p1, v0, v1}, Lcom/shopkick/app/permissions/PermissionUtils;->showOpenSettingsAppDialog(Landroid/content/Context;[Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method private updateWalkinPermissionsViewText()V
    .locals 10

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    if-eqz v0, :cond_6

    .line 183
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 187
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->permToViewWeakRefMap:Ljava/util/HashMap;

    const-string v2, "WALKIN_PERMISSIONS"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 188
    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_1

    return-void

    .line 193
    :cond_1
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    float-to-int v2, v2

    .line 195
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const-string v4, "android.permission.BLUETOOTH"

    .line 197
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v4

    const v5, 0x7f090308

    if-nez v4, :cond_2

    .line 198
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f110774

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 200
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    .line 201
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f080240

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 203
    invoke-virtual {v4}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/widget/RelativeLayout$LayoutParams;

    mul-int/lit8 v7, v2, 0x10

    mul-int/lit8 v8, v2, 0x18

    .line 204
    invoke-virtual {v6, v7, v7, v8, v7}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 205
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_2
    const-string v4, "HIGH_ACCURACY_LOCATION"

    .line 208
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v4, v6}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v4

    const v6, 0x7f080241

    const/4 v7, 0x0

    if-nez v4, :cond_3

    .line 209
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v8, 0x7f110778

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    .line 212
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8, v6}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 214
    invoke-virtual {v4}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Landroid/widget/RelativeLayout$LayoutParams;

    mul-int/lit8 v9, v2, 0x10

    .line 215
    invoke-virtual {v8, v7, v7, v7, v9}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 216
    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 219
    :cond_3
    iget-object v4, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/shopkick/app/application/ClientFlagsManager;->getClientAppUIFlags()Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    move-result-object v4

    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->disableMicrophonePermission:Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    const-string v4, "android.permission.RECORD_AUDIO"

    .line 220
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-static {v4, v8}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v4

    if-nez v4, :cond_5

    .line 221
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v8, 0x7f11077a

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    .line 224
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 226
    invoke-virtual {v4}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/widget/RelativeLayout$LayoutParams;

    mul-int/lit8 v2, v2, 0x10

    .line 227
    invoke-virtual {v5, v7, v7, v7, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 228
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_5
    const-string v2, ""

    .line 233
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    packed-switch v4, :pswitch_data_0

    goto :goto_0

    .line 242
    :pswitch_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", and "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 238
    :pswitch_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v6, 0x7f1101b1

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 235
    :pswitch_2
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :goto_0
    const v3, 0x7f090709

    .line 246
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f1104bf

    new-array v4, v5, [Ljava/lang/Object;

    aput-object v2, v4, v7

    .line 247
    invoke-virtual {v0, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 246
    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    return-void

    :cond_6
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    if-eqz v0, :cond_1

    .line 115
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 117
    invoke-virtual {v0, p0}, Lcom/shopkick/app/activities/BaseActivity;->removeActivityResultListener(Lcom/shopkick/app/activities/IActivityResultListener;)V

    .line 118
    invoke-virtual {v0, p0}, Lcom/shopkick/app/activities/BaseActivity;->removePermissionResultListener(Lcom/shopkick/app/permissions/IRequestPermissionsResultListener;)V

    :cond_1
    return-void
.end method

.method public hidePermViews()V
    .locals 3

    .line 491
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->permToViewWeakRefMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 492
    iget-object v2, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->permToViewWeakRefMap:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_0

    const/16 v2, 0x8

    .line 494
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onActivityResult(Lcom/shopkick/app/activities/BaseActivity;IILandroid/content/Intent;)V
    .locals 0

    .line 652
    iget-object p1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    if-nez p1, :cond_0

    return-void

    .line 657
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->isTopScreen()Z

    move-result p4

    if-nez p4, :cond_1

    return-void

    :cond_1
    if-nez p3, :cond_2

    const/16 p3, 0x9

    goto :goto_0

    :cond_2
    const/16 p3, 0x8

    :goto_0
    const-string p4, ""

    packed-switch p2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const-string p4, "android.permission.CAMERA"

    goto :goto_1

    :pswitch_1
    const-string p4, "android.permission.ACCESS_COARSE_LOCATION"

    goto :goto_1

    :pswitch_2
    const-string p4, "android.permission.RECORD_AUDIO"

    goto :goto_1

    :pswitch_3
    const-string p4, "HIGH_ACCURACY_LOCATION"

    goto :goto_1

    :pswitch_4
    const-string p4, "android.permission.BLUETOOTH"

    .line 680
    :goto_1
    invoke-virtual {p1}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p3, p4, p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->getLogRecord(ILjava/lang/String;Landroid/content/Context;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object p1

    .line 681
    iget-object p3, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p3, p1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 683
    iget-boolean p1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionRequestInProgress:Z

    if-eqz p1, :cond_3

    .line 684
    invoke-direct {p0, p2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->maybeShowNextPermissionRequestDialog(I)V

    :cond_3
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 0

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 2

    .line 694
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    if-nez v0, :cond_0

    return-void

    .line 700
    :cond_0
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->isTopScreen()Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    .line 704
    :cond_1
    iget-boolean v1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionRequestInProgress:Z

    if-eqz v1, :cond_2

    .line 705
    invoke-direct {p0, p1}, Lcom/shopkick/app/permissions/PermissionsRequestController;->maybeShowNextPermissionRequestDialog(I)V

    :cond_2
    const/16 v1, 0x1e

    if-ne p1, v1, :cond_7

    .line 711
    array-length p1, p3

    if-nez p1, :cond_3

    return-void

    .line 713
    :cond_3
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    if-nez p1, :cond_4

    return-void

    :cond_4
    const/4 v1, 0x0

    .line 716
    aget p3, p3, v1

    if-nez p3, :cond_5

    .line 718
    invoke-virtual {p1}, Lcom/shopkick/app/activities/BaseActivity;->getApplication()Landroid/app/Application;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/application/SKApp;

    invoke-virtual {p1}, Lcom/shopkick/app/application/SKApp;->checkAndStartRecording()V

    goto :goto_0

    .line 720
    :cond_5
    aget-object p2, p2, v1

    invoke-static {p1, p2}, Landroid/support/v4/app/ActivityCompat;->shouldShowRequestPermissionRationale(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_0

    .line 725
    :cond_6
    invoke-direct {p0, v0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->showMicrophonePermissionRequestDialog(Lcom/shopkick/app/screens/AppScreen;)V

    :cond_7
    :goto_0
    return-void
.end method

.method public requestPermission(Ljava/lang/String;Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x1

    .line 133
    invoke-virtual {p2, v0}, Landroid/view/View;->setClickable(Z)V

    .line 135
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "android.permission.RECORD_AUDIO"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_1

    :sswitch_1
    const-string v0, "WALKIN_PERMISSIONS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_1

    :sswitch_2
    const-string v1, "android.permission.CAMERA"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :sswitch_3
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :sswitch_4
    const-string v0, "android.permission.BLUETOOTH"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, -0x1

    :goto_1
    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x8

    .line 152
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 149
    :pswitch_0
    invoke-direct {p0, p2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->setupWalkinPermissionsView(Landroid/view/View;)V

    goto :goto_2

    .line 146
    :pswitch_1
    invoke-direct {p0, p2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->setupMicrophonePermissionView(Landroid/view/View;)V

    goto :goto_2

    .line 143
    :pswitch_2
    invoke-direct {p0, p2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->setupBluetoothPermissionView(Landroid/view/View;)V

    goto :goto_2

    .line 140
    :pswitch_3
    invoke-direct {p0, p2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->setupCameraPermissionView(Landroid/view/View;)V

    goto :goto_2

    .line 137
    :pswitch_4
    invoke-direct {p0, p2}, Lcom/shopkick/app/permissions/PermissionsRequestController;->setupCoarseLocationPermissionView(Landroid/view/View;)V

    .line 157
    :goto_2
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->permToViewWeakRefMap:Ljava/util/HashMap;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x2ccd38b2 -> :sswitch_4
        -0x3c1ac56 -> :sswitch_3
        0x1b9efa65 -> :sswitch_2
        0x46489653 -> :sswitch_1
        0x6d24f988 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public showPermViewsIfDisabled()V
    .locals 6

    .line 462
    iget-object v0, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->appScreenWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/screens/AppScreen;

    if-nez v0, :cond_0

    return-void

    .line 468
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->permToViewWeakRefMap:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 469
    iget-object v3, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->permToViewWeakRefMap:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    .line 470
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v2, v4, v5}, Lcom/shopkick/app/permissions/PermissionsRequestController;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v4

    if-nez v4, :cond_3

    if-eqz v3, :cond_1

    const-string v4, "WALKIN_PERMISSIONS"

    .line 472
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 473
    invoke-direct {p0}, Lcom/shopkick/app/permissions/PermissionsRequestController;->updateWalkinPermissionsViewText()V

    :cond_2
    const/4 v4, 0x0

    .line 475
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    const/4 v3, 0x3

    .line 478
    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 476
    invoke-direct {p0, v3, v2, v4}, Lcom/shopkick/app/permissions/PermissionsRequestController;->getLogRecord(ILjava/lang/String;Landroid/content/Context;)Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    move-result-object v2

    .line 479
    iget-object v3, p0, Lcom/shopkick/app/permissions/PermissionsRequestController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v3, v2}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_1

    const/16 v2, 0x8

    .line 484
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_4
    return-void
.end method
