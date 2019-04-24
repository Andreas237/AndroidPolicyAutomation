.class public Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$MgrHandler;
    }
.end annotation


# static fields
.field public static final DEVICE_CONNECTED:Ljava/lang/String; = "health_deviceConnected"

.field public static final DEVICE_DISCONNECTED:Ljava/lang/String; = "health_deviceDisconnected"

.field public static final DEVICE_INSTANT_CONNECTETED:Ljava/lang/String; = "health_deviceInstantConnected"

.field public static final DEVICE_INSTANT_DISCONNECTETED:Ljava/lang/String; = "health_deviceInstantDisconnected"

.field private static final EXERCISEADVICE_BLUETOOTH_PINGPONG_TIMEOUT:I = 0x493e0

.field public static final FUNC_NAME:Ljava/lang/String; = "funcName"

.field private static final MAX_DELAYED_TIME_OF_RECONNECTION:J = 0x927c0L

.field private static final MSG_EXERCISEADVICE_BT_DISCONNECTED:I = 0x1

.field private static final PACKAGE_COM_HUAWEI_BONE:Ljava/lang/String; = "com.huawei.bone"

.field private static final PACKAGE_NAME_HUAWEI_HEALTH:Ljava/lang/String; = "com.huawei.health"

.field public static final PARAMETERS:Ljava/lang/String; = "parameters"

.field public static final PRODUCT_TYPE:Ljava/lang/String; = "product_type"

.field public static final STATE:Ljava/lang/String; = "state"

.field private static final TAG:Ljava/lang/String; = "RemoteServiceMgr"

.field public static final THREAD_POOL_SIZE:I = 0x14

.field private static gson:Lcom/google/gson/Gson; = null

.field private static hwDeviceMgr:Lo/dea; = null

.field private static iBaseResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback; = null

.field private static iCallbackInterface:Lo/aau; = null

.field private static instance:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr; = null

.field private static isDisconnectedReported:Z = false

.field private static lastKnownDeviceIdentify:Ljava/lang/String; = null

.field private static lock:[B = null

.field private static methodMap:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/hwservicesmgr/remote/parser/IParser;>;"
        }
    .end annotation
.end field

.field private static mgrHandler:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$MgrHandler; = null


# instance fields
.field private executorService:Ljava/util/concurrent/ExecutorService;

.field private handler:Landroid/os/Handler;

.field private iRemoteProxyCallback:Lo/aaz;

.field private mConnectStateChangedReceiver:Landroid/content/BroadcastReceiver;

.field private mConnectedDelayTime:J

.field private mConnection:Landroid/content/ServiceConnection;

.field private mContext:Landroid/content/Context;

.field private mDeviceInfoConfigSuccessList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private mHiSubscribeTypeList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private mHiUnSubscribeListener:Lo/cmh;

.field private mSubscribeListener:Lo/cmg;

.field private mToken:Landroid/os/IBinder;

.field private threadPool:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 78
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->methodMap:Ljava/util/Map;

    .line 83
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->lock:[B

    .line 87
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->lastKnownDeviceIdentify:Ljava/lang/String;

    .line 88
    const/4 v0, 0x0

    sput-boolean v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->isDisconnectedReported:Z

    .line 89
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->gson:Lcom/google/gson/Gson;

    .line 177
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$3;

    invoke-direct {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$3;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->iBaseResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 299
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    const-wide/16 v0, 0x3e8

    iput-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mConnectedDelayTime:J

    .line 90
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->handler:Landroid/os/Handler;

    .line 91
    new-instance v0, Landroid/os/Binder;

    invoke-direct {v0}, Landroid/os/Binder;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mToken:Landroid/os/IBinder;

    .line 94
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 95
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mHiSubscribeTypeList:Ljava/util/List;

    .line 96
    const/16 v0, 0x14

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->threadPool:Ljava/util/concurrent/ExecutorService;

    .line 98
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mDeviceInfoConfigSuccessList:Ljava/util/List;

    .line 105
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$1;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$1;-><init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mConnection:Landroid/content/ServiceConnection;

    .line 169
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$2;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$2;-><init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mHiUnSubscribeListener:Lo/cmh;

    .line 236
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$4;-><init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->iRemoteProxyCallback:Lo/aaz;

    .line 310
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$5;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$5;-><init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mConnectStateChangedReceiver:Landroid/content/BroadcastReceiver;

    .line 536
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$8;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$8;-><init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mSubscribeListener:Lo/cmg;

    .line 300
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mContext:Landroid/content/Context;

    .line 301
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->initConnection()V

    .line 302
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->initializeListener()V

    .line 303
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 304
    const-string v0, "com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 305
    const-string v0, "com.huawei.plugin_device.am16_bind_success"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 306
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mConnectStateChangedReceiver:Landroid/content/BroadcastReceiver;

    sget-object v2, Lo/dac;->a:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 307
    return-void
.end method

.method static synthetic access$000()[B
    .locals 1

    .line 63
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->lock:[B

    return-object v0
.end method

.method static synthetic access$100()Lo/aau;
    .locals 1

    .line 63
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->iCallbackInterface:Lo/aau;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Landroid/content/Context;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$102(Lo/aau;)Lo/aau;
    .locals 0

    .line 63
    sput-object p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->iCallbackInterface:Lo/aau;

    return-object p0
.end method

.method static synthetic access$1100()Z
    .locals 1

    .line 63
    sget-boolean v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->isDisconnectedReported:Z

    return v0
.end method

.method static synthetic access$1102(Z)Z
    .locals 0

    .line 63
    sput-boolean p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->isDisconnectedReported:Z

    return p0
.end method

.method static synthetic access$1200()Ljava/util/Map;
    .locals 1

    .line 63
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->methodMap:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$1300()Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 63
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->iBaseResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic access$1400(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->threadPool:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method static synthetic access$1500()Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$MgrHandler;
    .locals 1

    .line 63
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mgrHandler:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$MgrHandler;

    return-object v0
.end method

.method static synthetic access$1600()Ljava/lang/String;
    .locals 1

    .line 63
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->lastKnownDeviceIdentify:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1602(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 63
    sput-object p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->lastKnownDeviceIdentify:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$1700(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 0

    .line 63
    invoke-direct {p0, p1}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->setLastDeviceIdentify(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    return-void
.end method

.method static synthetic access$1800(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->initConnection()V

    return-void
.end method

.method static synthetic access$1900(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Z
    .locals 1

    .line 63
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->checkIsHealthAPPInstalled()Z

    move-result v0

    return v0
.end method

.method static synthetic access$200(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Lo/aaz;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->iRemoteProxyCallback:Lo/aaz;

    return-object v0
.end method

.method static synthetic access$2000(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->startRemoteService()V

    return-void
.end method

.method static synthetic access$2100(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)J
    .locals 2

    .line 63
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->getDelayedTime()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic access$2200(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Landroid/os/Handler;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$2302(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;J)J
    .locals 0

    .line 63
    iput-wide p1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mConnectedDelayTime:J

    return-wide p1
.end method

.method static synthetic access$300()Lo/dea;
    .locals 1

    .line 63
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->hwDeviceMgr:Lo/dea;

    return-object v0
.end method

.method static synthetic access$400()Lcom/google/gson/Gson;
    .locals 1

    .line 63
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->gson:Lcom/google/gson/Gson;

    return-object v0
.end method

.method static synthetic access$500()Ljava/util/List;
    .locals 1

    .line 63
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->getDeviceInfoList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Landroid/os/IBinder;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mToken:Landroid/os/IBinder;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->initialHiLogin()V

    return-void
.end method

.method static synthetic access$800(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Ljava/util/List;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mDeviceInfoConfigSuccessList:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$802(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mDeviceInfoConfigSuccessList:Ljava/util/List;

    return-object p1
.end method

.method static synthetic access$900(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Lo/cmh;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mHiUnSubscribeListener:Lo/cmh;

    return-object v0
.end method

.method private checkIsHealthAPPInstalled()Z
    .locals 4

    .line 517
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.huawei.health"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 518
    const/4 v0, 0x1

    return v0

    .line 519
    :catch_0
    move-exception v3

    .line 520
    const/4 v0, 0x0

    return v0
.end method

.method private static createDeviceInfo(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;
    .locals 3

    .line 587
    new-instance v2, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    invoke-direct {v2}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;-><init>()V

    .line 589
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setDeviceActiveState(I)V

    .line 590
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setDeviceConnectState(I)V

    .line 591
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 592
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/fju;->c(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setProductType(I)V

    .line 593
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setDeviceIdentify(Ljava/lang/String;)V

    .line 594
    const-string v0, ""

    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecUUID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 595
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setUUID(Ljava/lang/String;)V

    goto :goto_0

    .line 597
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecUUID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setUUID(Ljava/lang/String;)V

    .line 599
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setDeviceProtocol(I)V

    .line 600
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getEncryptType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setEncryptType(I)V

    .line 601
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setDeviceBTType(I)V

    .line 602
    invoke-virtual {p0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDevIdType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;->setDevIdType(I)V

    .line 603
    return-object v2
.end method

.method private getDelayedTime()J
    .locals 4

    .line 457
    iget-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mConnectedDelayTime:J

    const-wide/32 v2, 0x927c0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 458
    const-wide/32 v0, 0x927c0

    return-wide v0

    .line 460
    :cond_0
    iget-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mConnectedDelayTime:J

    const-wide/16 v2, 0x2

    mul-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mConnectedDelayTime:J

    .line 461
    iget-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mConnectedDelayTime:J

    const-wide/32 v2, 0x927c0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    iget-wide v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mConnectedDelayTime:J

    goto :goto_0

    :cond_1
    const-wide/32 v0, 0x927c0

    :goto_0
    return-wide v0
.end method

.method private static getDeviceInfoList()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;>;"
        }
    .end annotation

    .line 573
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->a()Ljava/util/List;

    move-result-object v4

    .line 574
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 575
    invoke-interface {v5}, Ljava/util/List;->clear()V

    .line 576
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 577
    invoke-static {v7}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->createDeviceInfo(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Lcom/huawei/hwservicesmgr/datetype/DeviceInfo;

    move-result-object v8

    .line 578
    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 579
    goto :goto_0

    .line 580
    :cond_0
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "return getUsedDeviceList() with deviceInfoListBak size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 582
    return-object v5
.end method

.method public static getInstance()Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;
    .locals 2

    .line 290
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->instance:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 291
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->instance:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    .line 292
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$MgrHandler;

    sget-object v1, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->instance:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$MgrHandler;-><init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mgrHandler:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$MgrHandler;

    .line 293
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->hwDeviceMgr:Lo/dea;

    .line 294
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->initializeMethodMap()V

    .line 296
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->instance:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    return-object v0
.end method

.method private initConnection()V
    .locals 2

    .line 419
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$7;

    invoke-direct {v1, p0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$7;-><init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 434
    return-void
.end method

.method private initialHiLogin()V
    .locals 1

    .line 509
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    move-result-object v0

    .line 510
    invoke-virtual {v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->initLogin()V

    .line 512
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->regDeviceInfoConfigListener()V

    .line 513
    return-void
.end method

.method private initializeListener()V
    .locals 4

    .line 494
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;

    move-result-object v1

    .line 495
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->iBaseResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v1, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->registerNotificationHRCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 496
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->iBaseResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v1, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->registerNotificationStressCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 497
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->iBaseResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v1, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->registerNotificationPressCallBack(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 498
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    move-result-object v2

    .line 499
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->iBaseResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v2, v0}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->registerNotificationRunPlanRecordInfoCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 500
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    move-result-object v3

    .line 501
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->iBaseResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v3, v0}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->registerNotificationSportReminderCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 502
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->iBaseResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v3, v0}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->registerNotificationStatusCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 503
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->iBaseResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v3, v0}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->registerNotificationGetWorkoutRecordStatisticCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 505
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->iBaseResponseCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v3, v0}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->registerNotificationWorkoutRecordSpeechPlayCallbackList(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 506
    return-void
.end method

.method private static initializeMethodMap()V
    .locals 12

    .line 466
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWWorkoutServiceManager;

    move-result-object v2

    .line 467
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    move-result-object v3

    .line 468
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;

    move-result-object v4

    .line 471
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v5

    .line 472
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v6

    .line 473
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v7

    .line 476
    move-object v8, v5

    array-length v9, v8

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_0

    aget-object v11, v8, v10

    .line 477
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->methodMap:Ljava/util/Map;

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 480
    :cond_0
    move-object v8, v6

    array-length v9, v8

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v9, :cond_1

    aget-object v11, v8, v10

    .line 481
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->methodMap:Ljava/util/Map;

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 484
    :cond_1
    move-object v8, v7

    array-length v9, v8

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v9, :cond_2

    aget-object v11, v8, v10

    .line 485
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->methodMap:Ljava/util/Map;

    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 491
    :cond_2
    return-void
.end method

.method public static reconnect()V
    .locals 4

    .line 405
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->instance:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 406
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->getInstance()Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    .line 408
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->instance:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 409
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->instance:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-direct {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->initConnection()V

    goto :goto_0

    .line 411
    :cond_1
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "instance is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    :goto_0
    return-void
.end method

.method private regDeviceInfoConfigListener()V
    .locals 4

    .line 528
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regDeviceInfoConfigListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mHiSubscribeTypeList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 530
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mHiSubscribeTypeList:Ljava/util/List;

    const/16 v1, 0x66

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 531
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mHiSubscribeTypeList:Ljava/util/List;

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 532
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mHiSubscribeTypeList:Ljava/util/List;

    const/16 v1, 0x65

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 533
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mHiSubscribeTypeList:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mSubscribeListener:Lo/cmg;

    invoke-interface {v0, v1, v2}, Lo/clt;->a(Ljava/util/List;Lo/cmg;)V

    .line 534
    return-void
.end method

.method private setLastDeviceIdentify(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 2

    .line 393
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecUUID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->setLastKnownDeviceIdentify(Ljava/lang/String;)V

    .line 394
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->executorService:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$6;

    invoke-direct {v1, p0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$6;-><init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 400
    return-void
.end method

.method private static setLastKnownDeviceIdentify(Ljava/lang/String;)V
    .locals 0

    .line 102
    sput-object p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->lastKnownDeviceIdentify:Ljava/lang/String;

    .line 103
    return-void
.end method

.method private startRemoteService()V
    .locals 6

    .line 437
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->iCallbackInterface:Lo/aau;

    if-nez v0, :cond_1

    .line 438
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0}, Lo/dea;->a()Ljava/util/List;

    move-result-object v4

    .line 440
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    invoke-static {}, Lo/ahd;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 441
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no device, so don\'t start RemoteService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 442
    return-void

    .line 444
    :cond_0
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "starting callbackservice ...."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 445
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 446
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mContext:Landroid/content/Context;

    const-string v1, "com.huawei.health.hwhealthlinkage.wearsdk.CallbackService"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 447
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mConnection:Landroid/content/ServiceConnection;

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->mContext:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-virtual {v0, v5, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 449
    :cond_1
    return-void
.end method


# virtual methods
.method public callbackIsNull()Z
    .locals 3

    .line 621
    sget-object v1, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->lock:[B

    monitor-enter v1

    .line 622
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->iCallbackInterface:Lo/aau;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit v1

    return v0

    .line 623
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public isLoudspeakerMuteOpenOrCloseHeartRate(IILo/djt;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 607
    new-instance v1, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$9;

    invoke-direct {v1, p0, p3}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$9;-><init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;Lo/djt;)V

    .line 617
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2, v1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->isLoudspeakerMuteOpenOrCloseHeartRate(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 618
    return-void
.end method

.method public sendDeviceData(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V
    .locals 1

    .line 453
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, p1}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 454
    return-void
.end method
