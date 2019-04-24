.class public Lcom/microblink/camera/hardware/DeviceManager;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static sNumberOfCores:I = 0x1

.field private static sProcessorCompatible:Z = false

.field private static sProcessorFrequency:I = -0x1


# instance fields
.field private context:Landroid/content/Context;

.field private devices:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/microblink/camera/hardware/DeviceInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->isArm7Processor()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->hasNeon()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/microblink/camera/hardware/DeviceManager;->sProcessorCompatible:Z

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->calcNumberOfCoresAndMaxClock()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/camera/hardware/DeviceManager;->context:Landroid/content/Context;

    if-eqz p2, :cond_1

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->loadDeviceListJson()Ljava/lang/String;

    move-result-object p1

    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object p2

    new-instance v0, Ljava/util/HashMap;

    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lcom/microblink/camera/hardware/DeviceManager;->devices:Ljava/util/Map;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p2, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    new-instance v3, Lcom/microblink/camera/hardware/DeviceInfo;

    invoke-direct {v3, v2, v1}, Lcom/microblink/camera/hardware/DeviceInfo;-><init>(Lorg/json/JSONObject;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/microblink/camera/hardware/DeviceManager;->devices:Ljava/util/Map;

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    const-string v0, "Failed to parse /res/raw/device_config.json. Please make sure JSON syntax is correct!"

    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_1
    return-void
.end method

.method private static calcNumberOfCoresAndMaxClock()V
    .locals 8

    const/4 v0, -0x1

    :try_start_0
    new-instance v1, Ljava/io/File;

    const-string v2, "/sys/devices/system/cpu/"

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/microblink/camera/hardware/DeviceManager$1;

    invoke-direct {v2}, Lcom/microblink/camera/hardware/DeviceManager$1;-><init>()V

    invoke-virtual {v1, v2}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v1

    array-length v2, v1

    sput v2, Lcom/microblink/camera/hardware/DeviceManager;->sNumberOfCores:I

    sput v0, Lcom/microblink/camera/hardware/DeviceManager;->sProcessorFrequency:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    array-length v4, v1

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v6, v1, v3

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/cpufreq/cpuinfo_max_freq"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-class v6, Lcom/microblink/camera/hardware/DeviceManager;

    const-string v7, "Examining file {}"

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v4, v5, v2

    invoke-static {v6, v7, v5}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v4}, Lcom/microblink/camera/hardware/DeviceManager;->readFreq(Ljava/lang/String;)I

    move-result v4

    sget v5, Lcom/microblink/camera/hardware/DeviceManager;->sProcessorFrequency:I

    if-le v4, v5, :cond_0

    sput v4, Lcom/microblink/camera/hardware/DeviceManager;->sProcessorFrequency:I

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sget v1, Lcom/microblink/camera/hardware/DeviceManager;->sProcessorFrequency:I

    if-eq v1, v0, :cond_2

    sget v1, Lcom/microblink/camera/hardware/DeviceManager;->sProcessorFrequency:I

    int-to-float v1, v1

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    sput v1, Lcom/microblink/camera/hardware/DeviceManager;->sProcessorFrequency:I

    :cond_2
    const-class v1, Lcom/microblink/camera/hardware/DeviceManager;

    const-string v3, "Calculated max CPU frequency: {} MHz"

    new-array v4, v5, [Ljava/lang/Object;

    sget v5, Lcom/microblink/camera/hardware/DeviceManager;->sProcessorFrequency:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v1, v3, v4}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v1

    sput v1, Lcom/microblink/camera/hardware/DeviceManager;->sNumberOfCores:I

    sput v0, Lcom/microblink/camera/hardware/DeviceManager;->sProcessorFrequency:I

    return-void
.end method

.method public static deviceHasAutofocus(Landroid/content/Context;)Z
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v0, "android.hardware.camera.autofocus"

    invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    const-class v0, Lcom/microblink/camera/hardware/DeviceManager;

    invoke-virtual {p0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, p0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v1
.end method

.method public static getAndroidRelease()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    return-object v0
.end method

.method public static getAndroidVersion()Lcom/microblink/camera/hardware/Version;
    .locals 2

    new-instance v0, Lcom/microblink/camera/hardware/Version;

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getAndroidRelease()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/microblink/camera/hardware/Version;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static getDevice()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    return-object v0
.end method

.method public static getDeviceInfo()Lcom/microblink/camera/hardware/DeviceInfo;
    .locals 3

    new-instance v0, Lcom/microblink/camera/hardware/DeviceInfo;

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getDevice()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getModel()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/microblink/camera/hardware/DeviceInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;
    .locals 2

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfo()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/microblink/camera/hardware/DeviceManager;->devices:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getUniqueName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/camera/hardware/DeviceInfo;

    return-object v0
.end method

.method public static getManufacturer()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    return-object v0
.end method

.method public static getMaxCPUFrequency()I
    .locals 1

    sget v0, Lcom/microblink/camera/hardware/DeviceManager;->sProcessorFrequency:I

    return v0
.end method

.method public static getModel()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    return-object v0
.end method

.method public static getNumberOfCores()I
    .locals 1

    sget v0, Lcom/microblink/camera/hardware/DeviceManager;->sNumberOfCores:I

    return v0
.end method

.method public static getProcessorABI()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    return-object v0
.end method

.method public static getSdkVersion()I
    .locals 1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    return v0
.end method

.method private static hasNeon()Z
    .locals 6

    new-instance v0, Ljava/io/File;

    const-string v1, "/proc/cpuinfo"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    :try_start_0
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/FileReader;

    new-instance v4, Ljava/io/File;

    const-string v5, "/proc/cpuinfo"

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :cond_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    const-string v4, "neon"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    return v1

    :cond_1
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :catch_0
    move-exception v0

    const-class v3, Lcom/microblink/camera/hardware/DeviceManager;

    const-string v4, "Cannot read /proc/cpuinfo to obtain whether NEON is supported. Will assume it is (and risk crash)."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v3, v0, v4, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return v1

    :cond_2
    const-class v0, Lcom/microblink/camera/hardware/DeviceManager;

    const-string v3, "File /proc/cpuinfo seems to be missing. Cannot determine whether NEON is supported. Will assume it is (and risk crash)."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v3, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v1
.end method

.method static isArm7Processor()Z
    .locals 2

    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    const-string v1, "armeabi-v7a"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static isProcessorCompatible()Z
    .locals 1

    sget-boolean v0, Lcom/microblink/camera/hardware/DeviceManager;->sProcessorCompatible:Z

    return v0
.end method

.method private loadDeviceListJson()Ljava/lang/String;
    .locals 3

    :try_start_0
    new-instance v0, Lcom/microblink/internal/services/io/AssetManagerRepository;

    iget-object v1, p0, Lcom/microblink/camera/hardware/DeviceManager;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/microblink/internal/services/io/AssetManagerRepository;-><init>(Landroid/content/Context;)V

    const-string v1, "microblink/device_config.json"

    invoke-virtual {v0, v1}, Lcom/microblink/internal/services/io/AssetManagerRepository;->executeReadFileFromAssets(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Cannot load asset microblink/device_config.json. Please make sure that this asset exists!"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private matchesVersionInterval(Lcom/microblink/camera/hardware/VersionInterval;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getAndroidVersion()Lcom/microblink/camera/hardware/Version;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/microblink/camera/hardware/VersionInterval;->contains(Lcom/microblink/camera/hardware/Version;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    const-string v1, "Failed to extract android version number!"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p0, p1, v1, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return v0
.end method

.method private static readFreq(Ljava/lang/String;)I
    .locals 8

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    :try_start_0
    new-instance v4, Ljava/io/RandomAccessFile;

    const-string v5, "r"

    invoke-direct {v4, p0, v5}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->readLine()Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_0

    :try_start_2
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    return p0

    :catch_1
    :try_start_4
    const-class v5, Lcom/microblink/camera/hardware/DeviceManager;

    const-string v6, "Failed to parse CPU frequency: \'{}\'"

    new-array v7, v2, [Ljava/lang/Object;

    aput-object v3, v7, v1

    invoke-static {v5, v6, v7}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    :catch_2
    return v0

    :cond_0
    :try_start_6
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    goto :goto_1

    :catchall_0
    move-exception p0

    move-object v3, v4

    goto :goto_2

    :catch_3
    move-object v3, v4

    goto :goto_0

    :catchall_1
    move-exception p0

    goto :goto_2

    :catch_4
    :goto_0
    :try_start_7
    const-class v4, Lcom/microblink/camera/hardware/DeviceManager;

    const-string v5, "Failed to open {} for reading"

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v1

    invoke-static {v4, v5, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-eqz v3, :cond_1

    :try_start_8
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    :catch_5
    :cond_1
    :goto_1
    return v0

    :goto_2
    if-eqz v3, :cond_2

    :try_start_9
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    :catch_6
    :cond_2
    throw p0
.end method


# virtual methods
.method public adjustZoomLevel(F)F
    .locals 6

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getMinZoomLevel()D

    move-result-wide v3

    double-to-float v3, v3

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getMaxZoomLevel()D

    move-result-wide v4

    double-to-float v0, v4

    sub-float/2addr v0, v3

    mul-float v0, v0, p1

    add-float/2addr v3, v0

    const-string v0, "Adjusting zoom level from {} to {}"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    aput-object p1, v4, v1

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    aput-object p1, v4, v2

    invoke-static {p0, v0, v4}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return v3

    :cond_0
    const-string v0, "Keeping zoom level at {}"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-static {p0, v0, v2}, Lcom/microblink/internal/Logger;->i(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return p1
.end method

.method public deviceHasCamera()Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceManager;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.camera"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceManager;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.camera.front"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public getCameraInitDelay()I
    .locals 1

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getCameraInitDelay()I

    move-result v0

    return v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceManager;->context:Landroid/content/Context;

    return-object v0
.end method

.method public getFrameQualityFactor()D
    .locals 2

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getFrameQualityFactor()D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    return-wide v0
.end method

.method public getOptimalBackFacingPhotoSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;
    .locals 1

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getOptimalBackFacingPictureSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    move-result-object v0

    return-object v0
.end method

.method public getOptimalBackFacingPreviewSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;
    .locals 1

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getOptimalBackFacingPreviewSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    move-result-object v0

    return-object v0
.end method

.method public getOptimalFrontFacingPhotoSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;
    .locals 1

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getOptimalFrontFacingPictureSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    move-result-object v0

    return-object v0
.end method

.method public getOptimalFrontFacingPreviewSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;
    .locals 1

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getOptimalFrontFacingPreviewSize()Lcom/microblink/camera/hardware/camera/camera1/strategy/CameraStrategy$PreviewSize;

    move-result-object v0

    return-object v0
.end method

.method public getReasonForLackOfSupport(Z)Lcom/microblink/camera/view/NotSupportedReason;
    .locals 2

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getSdkVersion()I

    move-result v0

    const/4 v1, 0x7

    if-ge v0, v1, :cond_0

    sget-object p1, Lcom/microblink/camera/view/NotSupportedReason;->UNSUPPORTED_ANDROID_VERSION:Lcom/microblink/camera/view/NotSupportedReason;

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lcom/microblink/camera/hardware/DeviceManager;->deviceHasCamera()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object p1, Lcom/microblink/camera/view/NotSupportedReason;->NO_CAMERA:Lcom/microblink/camera/view/NotSupportedReason;

    return-object p1

    :cond_1
    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/microblink/camera/hardware/DeviceManager;->context:Landroid/content/Context;

    invoke-static {p1}, Lcom/microblink/camera/hardware/DeviceManager;->deviceHasAutofocus(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_2

    sget-object p1, Lcom/microblink/camera/view/NotSupportedReason;->NO_AUTOFOCUS_CAMERA:Lcom/microblink/camera/view/NotSupportedReason;

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lcom/microblink/camera/hardware/DeviceManager;->isDeviceOnBlackList()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lcom/microblink/camera/view/NotSupportedReason;->BLACKLISTED_DEVICE:Lcom/microblink/camera/view/NotSupportedReason;

    return-object p1

    :cond_3
    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->isProcessorCompatible()Z

    move-result p1

    if-nez p1, :cond_4

    sget-object p1, Lcom/microblink/camera/view/NotSupportedReason;->UNSUPPORTED_PROCESSOR_ARCHITECTURE:Lcom/microblink/camera/view/NotSupportedReason;

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public hasDeviceListsLoaded()Z
    .locals 1

    iget-object v0, p0, Lcom/microblink/camera/hardware/DeviceManager;->devices:Ljava/util/Map;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isAllowedToUseZeroCopyBuffer()Z
    .locals 1

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getZeroCopyBufferAllowedInVersions()Lcom/microblink/camera/hardware/VersionInterval;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/microblink/camera/hardware/DeviceManager;->matchesVersionInterval(Lcom/microblink/camera/hardware/VersionInterval;)Z

    move-result v0

    return v0
.end method

.method public isDeviceLandscapeLeftTablet()Z
    .locals 1

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getNaturalOrientationIsLandscapeLeftInVersions()Lcom/microblink/camera/hardware/VersionInterval;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/microblink/camera/hardware/DeviceManager;->matchesVersionInterval(Lcom/microblink/camera/hardware/VersionInterval;)Z

    move-result v0

    return v0
.end method

.method public isDeviceOnBlackList()Z
    .locals 1

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getBlacklistedInVersions()Lcom/microblink/camera/hardware/VersionInterval;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/microblink/camera/hardware/DeviceManager;->matchesVersionInterval(Lcom/microblink/camera/hardware/VersionInterval;)Z

    move-result v0

    return v0
.end method

.method public isDeviceSupported()Z
    .locals 4

    invoke-static {}, Lcom/microblink/camera/hardware/DeviceManager;->getSdkVersion()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x7

    if-lt v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/microblink/camera/hardware/DeviceManager;->deviceHasCamera()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/microblink/camera/hardware/DeviceManager;->context:Landroid/content/Context;

    invoke-static {v3}, Lcom/microblink/camera/hardware/DeviceManager;->deviceHasAutofocus(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v0, :cond_2

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/microblink/camera/hardware/DeviceManager;->isDeviceOnBlackList()Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    return v2
.end method

.method public isDisplayOrientationBlacklisted()Z
    .locals 1

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getDisplayOrientationNotWorkingInVersions()Lcom/microblink/camera/hardware/VersionInterval;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/microblink/camera/hardware/DeviceManager;->matchesVersionInterval(Lcom/microblink/camera/hardware/VersionInterval;)Z

    move-result v0

    return v0
.end method

.method public isEGLPbufferNotSupported()Z
    .locals 1

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getEglPbufferNotSupportedInVersions()Lcom/microblink/camera/hardware/VersionInterval;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/microblink/camera/hardware/DeviceManager;->matchesVersionInterval(Lcom/microblink/camera/hardware/VersionInterval;)Z

    move-result v0

    return v0
.end method

.method public isFocusCallbackUntrusty()Z
    .locals 1

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getFocusUntrustyInVersions()Lcom/microblink/camera/hardware/VersionInterval;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/microblink/camera/hardware/DeviceManager;->matchesVersionInterval(Lcom/microblink/camera/hardware/VersionInterval;)Z

    move-result v0

    return v0
.end method

.method public isForceUseLegacyCameraAPI()Z
    .locals 1

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getForceUseLegacyCamera()Lcom/microblink/camera/hardware/VersionInterval;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/microblink/camera/hardware/DeviceManager;->matchesVersionInterval(Lcom/microblink/camera/hardware/VersionInterval;)Z

    move-result v0

    return v0
.end method

.method public isMeteringAreaBuggy()Z
    .locals 1

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getMeteringNotWorkingInVersions()Lcom/microblink/camera/hardware/VersionInterval;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/microblink/camera/hardware/DeviceManager;->matchesVersionInterval(Lcom/microblink/camera/hardware/VersionInterval;)Z

    move-result v0

    return v0
.end method

.method public isPhaseAutofocusBuggy()Z
    .locals 2

    invoke-direct {p0}, Lcom/microblink/camera/hardware/DeviceManager;->getDeviceInfoFromList()Lcom/microblink/camera/hardware/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lcom/microblink/camera/hardware/DeviceInfo;->getPhaseAutofocusSupportedInVersions()Lcom/microblink/camera/hardware/VersionInterval;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/microblink/camera/hardware/DeviceManager;->matchesVersionInterval(Lcom/microblink/camera/hardware/VersionInterval;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
