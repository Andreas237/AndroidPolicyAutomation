.class public Lcom/shopkick/app/application/DeviceInfo;
.super Ljava/lang/Object;
.source "DeviceInfo.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/application/DeviceInfo$GetAdvertisingInfoTask;,
        Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;
    }
.end annotation


# static fields
.field public static final ADVERTISING_ID_READY:Ljava/lang/String; = "advertisingIdReady"

.field private static final ENCRYPT_KEY:Ljava/lang/String; = "enter the dragon"

.field private static final GOOGLE_TYPE:Ljava/lang/String; = "com.google"

.field private static final HASH_ALGORITHM:Ljava/lang/String; = "SHA"

.field private static final KCID_LEN:I = 0x20

.field private static final SUPERUSER_PERMISSIONS_PACKAGE_NAME:Ljava/lang/String; = "com.noshufou.android.su"


# instance fields
.field private SHOULD_EXTRACT_ADVERTISING_ID:Z

.field acctMgr:Landroid/accounts/AccountManager;

.field private advertisingInfo:Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;

.field appHeapSize:I

.field bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

.field configuration:Landroid/content/res/Configuration;

.field contentResolver:Landroid/content/ContentResolver;

.field private context:Landroid/content/Context;

.field private deviceId:Ljava/lang/String;

.field deviceMake:Ljava/lang/String;

.field deviceModel:Ljava/lang/String;

.field deviceString:Ljava/lang/String;

.field displayMetrics:Landroid/util/DisplayMetrics;

.field private googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field libPrefs:Lcom/shopkick/app/application/LibPreferences;

.field locationMockAppsInstalled:Z

.field memoryIsRooted:Z

.field memoryKCID:Ljava/lang/String;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field osName:Ljava/lang/String;

.field osString:Ljava/lang/String;

.field osVersion:Ljava/lang/String;

.field packageMgr:Landroid/content/pm/PackageManager;

.field resources:Landroid/content/res/Resources;

.field screenString:Ljava/lang/String;

.field telMgr:Landroid/telephony/TelephonyManager;

.field wifiManager:Landroid/net/wifi/WifiManager;


# direct methods
.method public constructor <init>(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;Landroid/app/ActivityManager;Landroid/accounts/AccountManager;Landroid/telephony/TelephonyManager;Landroid/content/pm/PackageManager;Landroid/content/ContentResolver;Landroid/content/res/Resources;Lcom/shopkick/app/application/LibPreferences;Landroid/net/wifi/WifiManager;Landroid/content/Context;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 1

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Android"

    .line 60
    iput-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->osName:Ljava/lang/String;

    const/16 v0, 0x10

    .line 62
    iput v0, p0, Lcom/shopkick/app/application/DeviceInfo;->appHeapSize:I

    const/4 v0, 0x1

    .line 82
    iput-boolean v0, p0, Lcom/shopkick/app/application/DeviceInfo;->SHOULD_EXTRACT_ADVERTISING_ID:Z

    .line 103
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->deviceMake:Ljava/lang/String;

    .line 104
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->deviceModel:Ljava/lang/String;

    .line 105
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->osVersion:Ljava/lang/String;

    .line 106
    iput-object p1, p0, Lcom/shopkick/app/application/DeviceInfo;->configuration:Landroid/content/res/Configuration;

    .line 107
    iput-object p2, p0, Lcom/shopkick/app/application/DeviceInfo;->displayMetrics:Landroid/util/DisplayMetrics;

    .line 108
    iput-object p4, p0, Lcom/shopkick/app/application/DeviceInfo;->acctMgr:Landroid/accounts/AccountManager;

    .line 109
    iput-object p5, p0, Lcom/shopkick/app/application/DeviceInfo;->telMgr:Landroid/telephony/TelephonyManager;

    .line 110
    iput-object p6, p0, Lcom/shopkick/app/application/DeviceInfo;->packageMgr:Landroid/content/pm/PackageManager;

    .line 111
    iput-object p7, p0, Lcom/shopkick/app/application/DeviceInfo;->contentResolver:Landroid/content/ContentResolver;

    .line 112
    iput-object p8, p0, Lcom/shopkick/app/application/DeviceInfo;->resources:Landroid/content/res/Resources;

    .line 113
    iput-object p9, p0, Lcom/shopkick/app/application/DeviceInfo;->libPrefs:Lcom/shopkick/app/application/LibPreferences;

    .line 114
    iput-object p10, p0, Lcom/shopkick/app/application/DeviceInfo;->wifiManager:Landroid/net/wifi/WifiManager;

    .line 115
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/application/DeviceInfo;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    if-eqz p3, :cond_0

    .line 117
    invoke-virtual {p3}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/application/DeviceInfo;->appHeapSize:I

    .line 119
    :cond_0
    iput-object p11, p0, Lcom/shopkick/app/application/DeviceInfo;->context:Landroid/content/Context;

    .line 120
    iput-object p12, p0, Lcom/shopkick/app/application/DeviceInfo;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 121
    new-instance p1, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    invoke-direct {p1, p11}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object p2, Lcom/google/android/gms/safetynet/SafetyNet;->API:Lcom/google/android/gms/common/api/Api;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p1

    .line 122
    invoke-virtual {p1, p0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object p1

    .line 123
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/application/DeviceInfo;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 124
    iget-object p1, p0, Lcom/shopkick/app/application/DeviceInfo;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/application/DeviceInfo;Ljava/lang/String;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Lcom/shopkick/app/application/DeviceInfo;->processSafetyNetApiResponse(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/application/DeviceInfo;)Landroid/content/Context;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/shopkick/app/application/DeviceInfo;->context:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic access$300(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 55
    invoke-static {p0, p1}, Lcom/shopkick/app/application/DeviceInfo;->log(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic access$400(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 0

    .line 55
    invoke-static {p0, p1}, Lcom/shopkick/app/application/DeviceInfo;->log(Ljava/lang/Exception;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$502(Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;)Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/shopkick/app/application/DeviceInfo;->advertisingInfo:Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;

    return-object p1
.end method

.method static synthetic access$600(Lcom/shopkick/app/application/DeviceInfo;)Lcom/shopkick/app/util/NotificationCenter;
    .locals 0

    .line 55
    iget-object p0, p0, Lcom/shopkick/app/application/DeviceInfo;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    return-object p0
.end method

.method private areThereLocationMockApps()Z
    .locals 3

    .line 438
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    const-string v1, "pm list packages -f -e -3"

    invoke-virtual {v0, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v0

    .line 439
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 441
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 444
    :cond_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v2, "fakegps"

    .line 446
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "mocklocation"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "fakelocation"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    :cond_1
    const/4 v0, 0x1

    return v0

    :catch_0
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private canExecuteCommand(Ljava/lang/String;)Z
    .locals 1

    .line 404
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method private getRequestNonce()[B
    .locals 2

    .line 616
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    const/16 v1, 0x10

    .line 617
    new-array v1, v1, [B

    .line 618
    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    return-object v1
.end method

.method private getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 474
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    const-string v1, "SHA"

    .line 480
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    .line 481
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 482
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    if-eqz p1, :cond_1

    .line 484
    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {p1, v2}, Landroid/util/Base64;->encode([BI)[B

    move-result-object p1

    const-string v2, "ASCII"

    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    :cond_1
    return-object v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method private isAllowMockLocationsSet()Z
    .locals 2

    .line 416
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->contentResolver:Landroid/content/ContentResolver;

    if-eqz v0, :cond_0

    :try_start_0
    const-string v1, "mock_location"

    .line 420
    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :catch_0
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static log(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 7

    .line 715
    :try_start_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v0, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const/4 v0, 0x0

    new-array v6, v0, [Ljava/lang/Object;

    move-object v4, p0

    move-object v5, p1

    invoke-virtual/range {v1 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "APP_LAUNCH"

    .line 717
    invoke-static {v0, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method private static varargs log(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 705
    :try_start_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v1, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p0, p1}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "APP_LAUNCH"

    .line 707
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v1, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method private processSafetyNetApiResponse(Ljava/lang/String;)V
    .locals 3

    const-string v0, "\\."

    .line 386
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 388
    array-length v0, p1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 389
    new-instance v0, Ljava/lang/String;

    const/4 v1, 0x1

    aget-object p1, p1, v1

    const/4 v2, 0x0

    invoke-static {p1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    .line 391
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "ctsProfileMatch"

    .line 392
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "ctsProfileMatch"

    .line 393
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v2

    .line 394
    :goto_0
    iget-boolean v0, p0, Lcom/shopkick/app/application/DeviceInfo;->memoryIsRooted:Z

    if-nez v0, :cond_2

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :cond_2
    :goto_1
    iput-boolean v1, p0, Lcom/shopkick/app/application/DeviceInfo;->memoryIsRooted:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    return-void
.end method

.method private safetyNetSystemCheck()V
    .locals 3

    .line 318
    invoke-direct {p0}, Lcom/shopkick/app/application/DeviceInfo;->getRequestNonce()[B

    move-result-object v0

    .line 323
    sget-object v1, Lcom/google/android/gms/safetynet/SafetyNet;->SafetyNetApi:Lcom/google/android/gms/safetynet/SafetyNetApi;

    iget-object v2, p0, Lcom/shopkick/app/application/DeviceInfo;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/safetynet/SafetyNetApi;->attest(Lcom/google/android/gms/common/api/GoogleApiClient;[B)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/application/DeviceInfo$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/application/DeviceInfo$1;-><init>(Lcom/shopkick/app/application/DeviceInfo;)V

    .line 324
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    return-void
.end method


# virtual methods
.method public btEnabled()Z
    .locals 1

    .line 457
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->bluetoothAdapter:Landroid/bluetooth/BluetoothAdapter;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 460
    :cond_0
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public checkIsRooted()Z
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 343
    :try_start_0
    iget-object v2, p0, Lcom/shopkick/app/application/DeviceInfo;->packageMgr:Landroid/content/pm/PackageManager;

    const-string v3, "com.noshufou.android.su"

    invoke-virtual {v2, v3, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    .line 349
    :catch_0
    sget-object v2, Landroid/os/Build;->TAGS:Ljava/lang/String;

    if-eqz v2, :cond_0

    const-string/jumbo v3, "test-keys"

    .line 350
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    const-string v3, "/system/app/Superuser.apk"

    const-string v4, "/data/data/eu.chainfire.supersu"

    const-string v5, "com.noshufou.android.su"

    const-string v6, "/sbin/su"

    const-string v7, "/system/bin/su"

    const-string v8, "/system/xbin/su"

    const-string v9, "/data/local/xbin/su"

    const-string v10, "/data/local/bin/su"

    const-string v11, "/system/sd/xbin/su"

    const-string v12, "/system/bin/failsafe/su"

    const-string v13, "/data/local/su"

    .line 355
    filled-new-array/range {v3 .. v13}, [Ljava/lang/String;

    move-result-object v2

    .line 368
    array-length v3, v2

    move v4, v0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    .line 370
    :try_start_1
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 371
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz v5, :cond_1

    return v1

    :catch_1
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    const-string v2, "/system/xbin/which su"

    .line 380
    invoke-direct {p0, v2}, Lcom/shopkick/app/application/DeviceInfo;->canExecuteCommand(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "/system/bin/which su"

    invoke-direct {p0, v2}, Lcom/shopkick/app/application/DeviceInfo;->canExecuteCommand(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string/jumbo v2, "which su"

    .line 381
    invoke-direct {p0, v2}, Lcom/shopkick/app/application/DeviceInfo;->canExecuteCommand(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_3
    move v0, v1

    :cond_4
    return v0
.end method

.method public fetchAdvertisingId()V
    .locals 2

    .line 656
    iget-boolean v0, p0, Lcom/shopkick/app/application/DeviceInfo;->SHOULD_EXTRACT_ADVERTISING_ID:Z

    if-eqz v0, :cond_0

    .line 657
    new-instance v0, Lcom/shopkick/app/application/DeviceInfo$GetAdvertisingInfoTask;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/shopkick/app/application/DeviceInfo$GetAdvertisingInfoTask;-><init>(Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/DeviceInfo$1;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/DeviceInfo$GetAdvertisingInfoTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 659
    :cond_0
    new-instance v0, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;

    invoke-direct {v0}, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->advertisingInfo:Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;

    :goto_0
    return-void
.end method

.method public getAdd()Ljava/lang/String;
    .locals 6

    .line 242
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 244
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->telMgr:Landroid/telephony/TelephonyManager;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->context:Landroid/content/Context;

    const-string v2, "android.permission.READ_PHONE_STATE"

    .line 245
    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "a"

    .line 246
    iget-object v2, p0, Lcom/shopkick/app/application/DeviceInfo;->telMgr:Landroid/telephony/TelephonyManager;

    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/shopkick/app/application/DeviceInfo;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v1, "b"

    .line 248
    iget-object v2, p0, Lcom/shopkick/app/application/DeviceInfo;->telMgr:Landroid/telephony/TelephonyManager;

    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getSimSerialNumber()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    :try_start_2
    const-string v1, "b"

    const-string v2, "0"

    .line 253
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 256
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->acctMgr:Landroid/accounts/AccountManager;

    if-eqz v1, :cond_2

    .line 257
    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->acctMgr:Landroid/accounts/AccountManager;

    const-string v2, "com.google"

    invoke-virtual {v1, v2}, Landroid/accounts/AccountManager;->getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 259
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 260
    array-length v3, v1

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_1

    aget-object v5, v1, v4

    .line 261
    iget-object v5, v5, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-direct {p0, v5}, Lcom/shopkick/app/application/DeviceInfo;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    const-string v1, "c"

    .line 263
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    const-string v1, "d"

    .line 266
    invoke-virtual {p0}, Lcom/shopkick/app/application/DeviceInfo;->isLocationFaked()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "e"

    .line 267
    invoke-virtual {p0}, Lcom/shopkick/app/application/DeviceInfo;->getAndroidId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "f"

    .line 268
    invoke-virtual {p0}, Lcom/shopkick/app/application/DeviceInfo;->isRooted()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 272
    :catch_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAdd(Z)Ljava/lang/String;
    .locals 6

    .line 276
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 278
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->telMgr:Landroid/telephony/TelephonyManager;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->context:Landroid/content/Context;

    const-string v2, "android.permission.READ_PHONE_STATE"

    .line 279
    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "a"

    .line 280
    iget-object v2, p0, Lcom/shopkick/app/application/DeviceInfo;->telMgr:Landroid/telephony/TelephonyManager;

    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/shopkick/app/application/DeviceInfo;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v1, "b"

    .line 282
    iget-object v2, p0, Lcom/shopkick/app/application/DeviceInfo;->telMgr:Landroid/telephony/TelephonyManager;

    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getSimSerialNumber()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    :try_start_2
    const-string v1, "b"

    const-string v2, "0"

    .line 287
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 290
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->acctMgr:Landroid/accounts/AccountManager;

    if-eqz v1, :cond_2

    .line 291
    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->acctMgr:Landroid/accounts/AccountManager;

    const-string v2, "com.google"

    invoke-virtual {v1, v2}, Landroid/accounts/AccountManager;->getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 293
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 294
    array-length v3, v1

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_1

    aget-object v5, v1, v4

    .line 295
    iget-object v5, v5, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-direct {p0, v5}, Lcom/shopkick/app/application/DeviceInfo;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    const-string v1, "c"

    .line 297
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    const-string v1, "d"

    .line 300
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string p1, "e"

    .line 301
    invoke-virtual {p0}, Lcom/shopkick/app/application/DeviceInfo;->getAndroidId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "f"

    .line 302
    invoke-virtual {p0}, Lcom/shopkick/app/application/DeviceInfo;->isRooted()Z

    move-result v1

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 306
    :catch_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getAdvertisingInfo()Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;
    .locals 1

    .line 668
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->advertisingInfo:Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;

    return-object v0
.end method

.method public getAndroidId()Ljava/lang/String;
    .locals 2

    .line 234
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->contentResolver:Landroid/content/ContentResolver;

    if-eqz v0, :cond_0

    const-string v1, "android_id"

    .line 235
    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 236
    invoke-static {v0}, Lcom/shopkick/app/util/Crypto;->sha1Hash(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCarrierName()Ljava/lang/String;
    .locals 1

    .line 583
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->telMgr:Landroid/telephony/TelephonyManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 586
    :cond_0
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDeviceEmail()Ljava/lang/String;
    .locals 6

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->acctMgr:Landroid/accounts/AccountManager;

    const-string v1, "com.google"

    invoke-virtual {v0, v1}, Landroid/accounts/AccountManager;->getAccountsByType(Ljava/lang/String;)[Landroid/accounts/Account;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 224
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 225
    iget-object v4, v3, Landroid/accounts/Account;->name:Ljava/lang/String;

    if-eqz v4, :cond_0

    sget-object v4, Landroid/util/Patterns;->EMAIL_ADDRESS:Ljava/util/regex/Pattern;

    iget-object v5, v3, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 226
    iget-object v0, v3, Landroid/accounts/Account;->name:Ljava/lang/String;

    return-object v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 3

    .line 178
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    const-string v1, "generic"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "SKAID000000000000000"

    return-object v0

    .line 180
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->deviceId:Ljava/lang/String;

    if-nez v0, :cond_3

    const/4 v0, 0x0

    .line 183
    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->context:Landroid/content/Context;

    const-string v2, "android.permission.READ_PHONE_STATE"

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_1

    .line 185
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->context:Landroid/content/Context;

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    :cond_1
    if-eqz v0, :cond_2

    .line 188
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 191
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SKAID"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "enter the dragon"

    invoke-static {v0, v2}, Lcom/shopkick/app/util/Crypto;->hmac(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 194
    :catch_0
    iput-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->deviceId:Ljava/lang/String;

    .line 195
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->deviceId:Ljava/lang/String;

    return-object v0

    :cond_2
    const-string v0, "SKAIDUnknown"

    return-object v0

    :cond_3
    return-object v0
.end method

.method public getDeviceModel()Ljava/lang/String;
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->deviceModel:Ljava/lang/String;

    return-object v0
.end method

.method public getDevicePhoneNumber()Ljava/lang/String;
    .locals 2

    .line 208
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->telMgr:Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->context:Landroid/content/Context;

    const-string v1, "android.permission.READ_PHONE_STATE"

    .line 209
    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    .line 210
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->telMgr:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDeviceString()Ljava/lang/String;
    .locals 2

    .line 150
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->deviceString:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->deviceMake:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->deviceModel:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->deviceMake:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->deviceModel:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->deviceString:Ljava/lang/String;

    .line 153
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->deviceString:Ljava/lang/String;

    return-object v0
.end method

.method public getHeapSize()I
    .locals 1

    .line 537
    iget v0, p0, Lcom/shopkick/app/application/DeviceInfo;->appHeapSize:I

    return v0
.end method

.method public getKcid(I)Ljava/lang/String;
    .locals 3

    .line 541
    iget-object p1, p0, Lcom/shopkick/app/application/DeviceInfo;->libPrefs:Lcom/shopkick/app/application/LibPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/LibPreferences;->getKCID()Ljava/lang/String;

    move-result-object p1

    .line 545
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->memoryKCID:Ljava/lang/String;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 547
    iput-object p1, p0, Lcom/shopkick/app/application/DeviceInfo;->memoryKCID:Ljava/lang/String;

    goto :goto_0

    .line 549
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->libPrefs:Lcom/shopkick/app/application/LibPreferences;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/LibPreferences;->generateIV(I)[B

    move-result-object v0

    if-eqz v0, :cond_1

    .line 551
    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroid/util/Base64;->encode([BI)[B

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    iput-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->memoryKCID:Ljava/lang/String;

    :cond_1
    :goto_0
    if-nez p1, :cond_2

    .line 557
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->memoryKCID:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 559
    iget-object p1, p0, Lcom/shopkick/app/application/DeviceInfo;->libPrefs:Lcom/shopkick/app/application/LibPreferences;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/application/LibPreferences;->setKCID(Ljava/lang/String;)V

    move-object p1, v0

    .line 562
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->memoryKCID:Ljava/lang/String;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    .line 563
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 564
    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->memoryKCID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    .line 565
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->memoryKCID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    .line 570
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public getOsString()Ljava/lang/String;
    .locals 2

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->osString:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->osName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->osVersion:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->osName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->osVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->osString:Ljava/lang/String;

    .line 163
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->osString:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageManager()Landroid/content/pm/PackageManager;
    .locals 1

    .line 579
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->packageMgr:Landroid/content/pm/PackageManager;

    return-object v0
.end method

.method public getPhoneName()Ljava/lang/String;
    .locals 7

    .line 597
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->acctMgr:Landroid/accounts/AccountManager;

    invoke-virtual {v0}, Landroid/accounts/AccountManager;->getAccounts()[Landroid/accounts/Account;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 601
    :cond_0
    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    .line 602
    iget-object v5, v4, Landroid/accounts/Account;->name:Ljava/lang/String;

    if-nez v5, :cond_1

    goto :goto_1

    .line 605
    :cond_1
    sget-object v5, Landroid/util/Patterns;->EMAIL_ADDRESS:Ljava/util/regex/Pattern;

    iget-object v6, v4, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 606
    iget-object v0, v4, Landroid/accounts/Account;->name:Ljava/lang/String;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v2

    return-object v0

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const-string/jumbo v0, "unknown"

    return-object v0
.end method

.method public getScreenDensity()I
    .locals 1

    .line 502
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->displayMetrics:Landroid/util/DisplayMetrics;

    if-eqz v0, :cond_0

    .line 503
    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    return v0

    :cond_0
    const/16 v0, 0xa0

    return v0
.end method

.method public getScreenHeight()I
    .locals 1

    .line 519
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->displayMetrics:Landroid/util/DisplayMetrics;

    if-eqz v0, :cond_0

    .line 520
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    return v0

    :cond_0
    const/16 v0, 0x280

    return v0
.end method

.method public getScreenLayout()I
    .locals 1

    .line 494
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->configuration:Landroid/content/res/Configuration;

    if-eqz v0, :cond_0

    .line 495
    iget v0, v0, Landroid/content/res/Configuration;->screenLayout:I

    return v0

    :cond_0
    const/4 v0, 0x2

    return v0
.end method

.method public getScreenScale()F
    .locals 1

    .line 529
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->displayMetrics:Landroid/util/DisplayMetrics;

    if-eqz v0, :cond_0

    .line 530
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    return v0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public getScreenString()Ljava/lang/String;
    .locals 2

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->screenString:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->displayMetrics:Landroid/util/DisplayMetrics;

    if-eqz v0, :cond_0

    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->displayMetrics:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->displayMetrics:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->displayMetrics:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->xdpi:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/application/DeviceInfo;->displayMetrics:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->ydpi:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->screenString:Ljava/lang/String;

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->screenString:Ljava/lang/String;

    return-object v0
.end method

.method public getScreenWidth()I
    .locals 1

    .line 510
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->displayMetrics:Landroid/util/DisplayMetrics;

    if-eqz v0, :cond_0

    .line 511
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0

    :cond_0
    const/16 v0, 0x140

    return v0
.end method

.method public getSimCountry()Ljava/lang/String;
    .locals 1

    .line 590
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->telMgr:Landroid/telephony/TelephonyManager;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 593
    :cond_0
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isAdvertisingInfoReady()Z
    .locals 1

    .line 664
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->advertisingInfo:Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isContactsPermissionGranted()Z
    .locals 2

    .line 469
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->context:Landroid/content/Context;

    const-string v1, "android.permission.READ_CONTACTS"

    invoke-static {v0, v1}, Landroid/support/v4/content/PermissionChecker;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isLocationFaked()Z
    .locals 1

    .line 412
    iget-boolean v0, p0, Lcom/shopkick/app/application/DeviceInfo;->locationMockAppsInstalled:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/shopkick/app/application/DeviceInfo;->isAllowMockLocationsSet()Z

    move-result v0

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

.method public isMicPermissionGranted()Z
    .locals 2

    .line 464
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->context:Landroid/content/Context;

    const-string v1, "android.permission.RECORD_AUDIO"

    invoke-static {v0, v1}, Landroid/support/v4/content/PermissionChecker;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isRooted()Z
    .locals 1

    .line 310
    iget-boolean v0, p0, Lcom/shopkick/app/application/DeviceInfo;->memoryIsRooted:Z

    return v0
.end method

.method public isWifiEnabled()Z
    .locals 1

    .line 314
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->wifiManager:Landroid/net/wifi/WifiManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onConnected(Landroid/os/Bundle;)V
    .locals 0

    .line 630
    invoke-direct {p0}, Lcom/shopkick/app/application/DeviceInfo;->safetyNetSystemCheck()V

    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 0

    return-void
.end method

.method public onDestroy()V
    .locals 0

    return-void
.end method

.method public reloadCachedInfo()V
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    invoke-direct {p0}, Lcom/shopkick/app/application/DeviceInfo;->safetyNetSystemCheck()V

    goto :goto_0

    .line 138
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnecting()Z

    move-result v0

    if-nez v0, :cond_1

    .line 139
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo;->googleApiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    .line 142
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/shopkick/app/application/DeviceInfo;->memoryIsRooted:Z

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/shopkick/app/application/DeviceInfo;->checkIsRooted()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x1

    :goto_2
    iput-boolean v0, p0, Lcom/shopkick/app/application/DeviceInfo;->memoryIsRooted:Z

    .line 143
    invoke-direct {p0}, Lcom/shopkick/app/application/DeviceInfo;->areThereLocationMockApps()Z

    move-result v0

    iput-boolean v0, p0, Lcom/shopkick/app/application/DeviceInfo;->locationMockAppsInstalled:Z

    return-void
.end method
