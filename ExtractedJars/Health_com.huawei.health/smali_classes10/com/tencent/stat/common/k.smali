.class public Lcom/tencent/stat/common/k;
.super Ljava/lang/Object;


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;

.field private static d:Ljava/lang/String;

.field private static e:Ljava/util/Random;

.field private static f:Lcom/tencent/stat/common/StatLogger;

.field private static g:Ljava/lang/String;

.field private static h:Lcom/tencent/stat/common/l;

.field private static i:Lcom/tencent/stat/common/n;

.field private static j:Ljava/lang/String;

.field private static k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/stat/common/k;->a:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/stat/common/k;->b:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/stat/common/k;->c:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/stat/common/k;->d:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/stat/common/k;->e:Ljava/util/Random;

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/stat/common/k;->g:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/stat/common/k;->h:Lcom/tencent/stat/common/l;

    const/4 v0, 0x0

    sput-object v0, Lcom/tencent/stat/common/k;->i:Lcom/tencent/stat/common/n;

    const-string v0, "__MTA_FIRST_ACTIVATE__"

    sput-object v0, Lcom/tencent/stat/common/k;->j:Ljava/lang/String;

    const/4 v0, -0x1

    sput v0, Lcom/tencent/stat/common/k;->k:I

    return-void
.end method

.method public static A(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    const-string v0, "sensor"

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/hardware/SensorManager;

    if-eqz v2, :cond_2

    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Sensor;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-eq v5, v0, :cond_0

    const-string v0, ","

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :cond_2
    goto :goto_1

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_1
    const-string v0, ""

    return-object v0
.end method

.method public static B(Landroid/content/Context;)Landroid/net/wifi/WifiInfo;
    .locals 4

    const-string v0, "android.permission.ACCESS_WIFI_STATE"

    invoke-static {p0, v0}, Lcom/tencent/stat/common/k;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v0, "wifi"

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/wifi/WifiManager;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v3

    return-object v3

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static C(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-static {p0}, Lcom/tencent/stat/common/k;->B(Landroid/content/Context;)Landroid/net/wifi/WifiInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v1

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static D(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-static {p0}, Lcom/tencent/stat/common/k;->B(Landroid/content/Context;)Landroid/net/wifi/WifiInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v1

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static declared-synchronized E(Landroid/content/Context;)I
    .locals 3

    const-class v2, Lcom/tencent/stat/common/k;

    monitor-enter v2

    :try_start_0
    sget v0, Lcom/tencent/stat/common/k;->k:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    sget v0, Lcom/tencent/stat/common/k;->k:I

    monitor-exit v2

    return v0

    :cond_0
    invoke-static {p0}, Lcom/tencent/stat/common/k;->F(Landroid/content/Context;)V

    sget v0, Lcom/tencent/stat/common/k;->k:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static F(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lcom/tencent/stat/common/k;->j:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/tencent/stat/common/p;->a(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    sput v0, Lcom/tencent/stat/common/k;->k:I

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    sget v1, Lcom/tencent/stat/common/k;->k:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    sget v0, Lcom/tencent/stat/common/k;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/tencent/stat/common/k;->j:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lcom/tencent/stat/common/p;->b(Landroid/content/Context;Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method private static G(Landroid/content/Context;)J
    .locals 4

    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/ActivityManager;

    new-instance v3, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v3}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    invoke-virtual {v2, v3}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    iget-wide v0, v3, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    return-wide v0
.end method

.method public static a()I
    .locals 2

    invoke-static {}, Lcom/tencent/stat/common/k;->h()Ljava/util/Random;

    move-result-object v0

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    return v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Long;)Ljava/lang/Long;
    .locals 9

    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    return-object p4

    :cond_1
    const-string v0, "."

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "|"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\\"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_3
    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v0, v6

    if-ne v0, p3, :cond_5

    const-wide/16 v0, 0x0

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const/4 v8, 0x0

    :goto_0
    array-length v0, v6

    if-ge v8, v0, :cond_4

    int-to-long v0, p2

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    aget-object v4, v6, v8

    invoke-static {v4}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    add-long/2addr v2, v4

    mul-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_4
    return-object v7

    :catch_0
    move-exception v7

    return-object p4

    :cond_5
    return-object p4
.end method

.method public static a(J)Ljava/lang/String;
    .locals 2

    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    invoke-direct {v1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, "0"

    return-object v0

    :cond_0
    const-string v0, "MD5"

    :try_start_0
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v5, 0x0

    :goto_0
    array-length v0, v3

    if-ge v5, v0, :cond_2

    aget-byte v0, v3, v5

    and-int/lit16 v6, v0, 0xff

    const/16 v0, 0x10

    if-ge v6, v0, :cond_1

    const-string v0, "0"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_1
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v2

    const-string v0, "0"

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lorg/apache/http/HttpHost;
    .locals 7

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    const-string v0, "connectivity"

    :try_start_1
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/net/ConnectivityManager;

    invoke-virtual {v4}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v5

    if-nez v5, :cond_2

    const/4 v0, 0x0

    return-object v0

    :cond_2
    :try_start_2
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WIFI"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    return-object v0

    :cond_3
    :try_start_3
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    move-result-object v6

    if-nez v6, :cond_4

    const/4 v0, 0x0

    return-object v0

    :cond_4
    const-string v0, "cmwap"

    :try_start_4
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "3gwap"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "uniwap"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    new-instance v0, Lorg/apache/http/HttpHost;

    const-string v1, "10.0.0.172"

    const/16 v2, 0x50

    invoke-direct {v0, v1, v2}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0

    return-object v0

    :cond_6
    const-string v0, "ctwap"

    :try_start_5
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Lorg/apache/http/HttpHost;

    const-string v1, "10.0.0.200"

    const/16 v2, 0x50

    invoke-direct {v0, v1, v2}, Lorg/apache/http/HttpHost;-><init>(Ljava/lang/String;I)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0

    return-object v0

    :cond_7
    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-eqz p2, :cond_0

    :try_start_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v1

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 3

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v1, v0

    goto :goto_1

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_1
    return v1
.end method

.method public static a([B)[B
    .locals 8

    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-direct {v2, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance v3, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v3, v2}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    const/16 v0, 0x1000

    new-array v4, v0, [B

    new-instance v5, Ljava/io/ByteArrayOutputStream;

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {v5, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v3, v4}, Ljava/util/zip/GZIPInputStream;->read([B)I

    move-result v0

    move v6, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v5, v4, v0, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v7

    invoke-virtual {v2}, Ljava/io/ByteArrayInputStream;->close()V

    invoke-virtual {v3}, Ljava/util/zip/GZIPInputStream;->close()V

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V

    return-object v7
.end method

.method public static b(Ljava/lang/String;)J
    .locals 4

    const-string v0, "."

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/16 v2, 0x64

    const/4 v3, 0x3

    invoke-static {p0, v0, v2, v3, v1}, Lcom/tencent/stat/common/k;->a(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Long;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public static declared-synchronized b()Lcom/tencent/stat/common/StatLogger;
    .locals 4

    const-class v2, Lcom/tencent/stat/common/k;

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    if-nez v0, :cond_0

    new-instance v0, Lcom/tencent/stat/common/StatLogger;

    const-string v1, "MtaSDK"

    invoke-direct {v0, v1}, Lcom/tencent/stat/common/StatLogger;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->setDebugEnable(Z)V

    :cond_0
    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method public static declared-synchronized b(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-class v2, Lcom/tencent/stat/common/k;

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/tencent/stat/common/k;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    sget-object v0, Lcom/tencent/stat/common/k;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/tencent/stat/common/k;->a:Ljava/lang/String;

    monitor-exit v2

    return-object v0

    :cond_0
    invoke-static {p0}, Lcom/tencent/stat/common/k;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tencent/stat/common/k;->a:Ljava/lang/String;

    sget-object v0, Lcom/tencent/stat/common/k;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    sget-object v0, Lcom/tencent/stat/common/k;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    invoke-static {}, Lcom/tencent/stat/common/k;->h()Ljava/util/Random;

    move-result-object v0

    const v1, 0x7fffffff

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tencent/stat/common/k;->a:Ljava/lang/String;

    :cond_2
    sget-object v0, Lcom/tencent/stat/common/k;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/tencent/stat/StatConfig;->isEnableConcurrentProcess()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    sget-object v0, Lcom/tencent/stat/common/k;->g:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/tencent/stat/common/k;->u(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tencent/stat/common/k;->g:Ljava/lang/String;

    :cond_0
    sget-object v0, Lcom/tencent/stat/common/k;->g:Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/tencent/stat/common/k;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    return-object p1
.end method

.method public static c()J
    .locals 5

    :try_start_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    add-long/2addr v0, v2

    return-wide v0

    :catch_0
    move-exception v4

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v4}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public static declared-synchronized c(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-class v2, Lcom/tencent/stat/common/k;

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/tencent/stat/common/k;->c:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, ""

    sget-object v1, Lcom/tencent/stat/common/k;->c:Ljava/lang/String;

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-static {p0}, Lcom/tencent/stat/common/k;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tencent/stat/common/k;->c:Ljava/lang/String;

    :cond_1
    sget-object v0, Lcom/tencent/stat/common/k;->c:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    if-nez p0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-ge v0, v1, :cond_1

    return-object p0

    :cond_1
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/stat/common/e;->a([B)[B

    move-result-object v2

    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/tencent/stat/common/g;->b([BI)[B

    move-result-object v3

    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v3, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static d()I
    .locals 1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    return v0
.end method

.method public static d(Landroid/content/Context;)Landroid/util/DisplayMetrics;
    .locals 3

    new-instance v2, Landroid/util/DisplayMetrics;

    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    return-object v2
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    if-nez p0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-ge v0, v1, :cond_1

    return-object p0

    :cond_1
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/tencent/stat/common/g;->a([BI)[B

    move-result-object v3

    invoke-static {v3}, Lcom/tencent/stat/common/e;->b([B)[B

    move-result-object v3

    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v3, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static e()Ljava/lang/String;
    .locals 14

    invoke-static {}, Lcom/tencent/stat/common/k;->f()J

    move-result-wide v0

    const-wide/32 v2, 0xf4240

    div-long v4, v0, v2

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v6

    new-instance v7, Landroid/os/StatFs;

    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v8, v0

    invoke-virtual {v7}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v10, v0

    mul-long v0, v8, v10

    const-wide/32 v2, 0xf4240

    div-long v12, v0, v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 6

    const-string v0, "android.permission.ACCESS_WIFI_STATE"

    :try_start_0
    invoke-static {p0, v0}, Lcom/tencent/stat/common/k;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v0, "connectivity"

    invoke-virtual {v2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/net/ConnectivityManager;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getAllNetworkInfo()[Landroid/net/NetworkInfo;

    move-result-object v4

    if-eqz v4, :cond_1

    const/4 v5, 0x0

    :goto_0
    array-length v0, v4

    if-ge v5, v0, :cond_1

    aget-object v0, v4, v5

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WIFI"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    aget-object v0, v4, v5

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    :try_start_1
    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "can not get the permission of android.permission.ACCESS_WIFI_STATE"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->warn(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public static f()J
    .locals 8

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v2

    new-instance v3, Landroid/os/StatFs;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v4, v0

    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockCount()I

    move-result v0

    int-to-long v6, v0

    mul-long v0, v6, v4

    return-wide v0
.end method

.method public static f(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-string v0, "android.permission.ACCESS_WIFI_STATE"

    invoke-static {p0, v0}, Lcom/tencent/stat/common/k;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "wifi"

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/wifi/WifiManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v2, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V

    const-string v0, ""

    return-object v0

    :cond_1
    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "Could not get permission of android.permission.ACCESS_WIFI_STATE"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    const-string v0, ""

    return-object v0
.end method

.method static synthetic g()Lcom/tencent/stat/common/StatLogger;
    .locals 1

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    return-object v0
.end method

.method public static g(Landroid/content/Context;)Z
    .locals 4

    const-string v0, "android.permission.INTERNET"

    :try_start_0
    invoke-static {p0, v0}, Lcom/tencent/stat/common/k;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {p0, v0}, Lcom/tencent/stat/common/k;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WIFI"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    goto :goto_0

    :cond_2
    :try_start_1
    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "can not get the permisson of android.permission.INTERNET"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->warn(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method private static declared-synchronized h()Ljava/util/Random;
    .locals 4

    const-class v2, Lcom/tencent/stat/common/k;

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/tencent/stat/common/k;->e:Ljava/util/Random;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sput-object v0, Lcom/tencent/stat/common/k;->e:Ljava/util/Random;

    :cond_0
    sget-object v0, Lcom/tencent/stat/common/k;->e:Ljava/util/Random;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method public static h(Landroid/content/Context;)Z
    .locals 4

    const-string v0, "android.permission.INTERNET"

    :try_start_0
    invoke-static {p0, v0}, Lcom/tencent/stat/common/k;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {p0, v0}, Lcom/tencent/stat/common/k;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isAvailable()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    :try_start_1
    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "Network error"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->w(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v0, 0x0

    return v0

    :cond_1
    goto :goto_0

    :cond_2
    :try_start_2
    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "can not get the permisson of android.permission.INTERNET"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->warn(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v2

    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method private static i()J
    .locals 9

    const-string v2, "/proc/meminfo"

    const-wide/16 v5, 0x0

    :try_start_0
    new-instance v7, Ljava/io/FileReader;

    invoke-direct {v7, v2}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    new-instance v8, Ljava/io/BufferedReader;

    const/16 v0, 0x2000

    invoke-direct {v8, v7, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    invoke-virtual {v8}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    const-string v0, "\\s+"

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    const/4 v0, 0x1

    aget-object v0, v4, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    mul-int/lit16 v0, v0, 0x400

    int-to-long v0, v0

    move-wide v5, v0

    invoke-virtual {v8}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v7

    :goto_0
    return-wide v5
.end method

.method public static i(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    sget-object v0, Lcom/tencent/stat/common/k;->b:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    sget-object v0, Lcom/tencent/stat/common/k;->b:Ljava/lang/String;

    return-object v0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v0, v3, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "TA_APPKEY"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    sput-object v4, Lcom/tencent/stat/common/k;->b:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-object v4

    :cond_1
    :try_start_1
    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "Could not read APPKEY meta-data from AndroidManifest.xml"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->w(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :cond_2
    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "Could not read APPKEY meta-data from AndroidManifest.xml"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->w(Ljava/lang/Object;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static j(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v0, v3, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v1, "InstallChannel"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :cond_0
    :try_start_1
    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "Could not read InstallChannel meta-data from AndroidManifest.xml"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->w(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "Could not read InstallChannel meta-data from AndroidManifest.xml"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static k(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static l(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const-string v0, "android.permission.READ_PHONE_STATE"

    :try_start_0
    invoke-static {p0, v0}, Lcom/tencent/stat/common/k;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v2, ""

    invoke-static {p0}, Lcom/tencent/stat/common/k;->o(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/telephony/TelephonyManager;

    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    :cond_0
    if-eqz v2, :cond_1

    return-object v2

    :cond_1
    goto :goto_0

    :cond_2
    :try_start_1
    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "Could not get permission of android.permission.READ_PHONE_STATE"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v2

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v2}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static m(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const/4 v2, 0x0

    const-string v0, "android.permission.READ_PHONE_STATE"

    :try_start_0
    invoke-static {p0, v0}, Lcom/tencent/stat/common/k;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lcom/tencent/stat/common/k;->o(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/telephony/TelephonyManager;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    :cond_0
    goto :goto_0

    :cond_1
    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "Could not get permission of android.permission.READ_PHONE_STATE"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    goto :goto_1

    :catch_0
    move-exception v3

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_1
    return-object v2
.end method

.method public static n(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    const-string v2, ""

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    iget-object v0, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    if-nez v2, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    return-object v2
.end method

.method public static o(Landroid/content/Context;)Z
    .locals 3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const-string v0, "android.permission.READ_PHONE_STATE"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static p(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    const/4 v2, 0x0

    const-string v0, "android.permission.INTERNET"

    :try_start_0
    invoke-static {p0, v0}, Lcom/tencent/stat/common/k;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {p0, v0}, Lcom/tencent/stat/common/k;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/net/ConnectivityManager;

    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v4}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v6

    if-eqz v5, :cond_4

    const-string v0, "WIFI"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "WIFI"

    move-object v2, v0

    goto :goto_0

    :cond_0
    const-string v0, "MOBILE"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz v6, :cond_1

    move-object v2, v6

    goto :goto_0

    :cond_1
    const-string v0, "MOBILE"

    move-object v2, v0

    goto :goto_0

    :cond_2
    if-eqz v6, :cond_3

    move-object v2, v6

    goto :goto_0

    :cond_3
    move-object v2, v5

    :cond_4
    :goto_0
    goto :goto_1

    :cond_5
    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "can not get the permission of android.permission.ACCESS_WIFI_STATE"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    goto :goto_2

    :catch_0
    move-exception v3

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_2
    return-object v2
.end method

.method public static q(Landroid/content/Context;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "phone"

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/telephony/TelephonyManager;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v1

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static r(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    const-string v2, ""

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    iget-object v0, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    move-object v2, v0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "unknown"

    return-object v0

    :cond_1
    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    return-object v2
.end method

.method public static s(Landroid/content/Context;)I
    .locals 2

    :try_start_0
    invoke-static {}, Lcom/tencent/stat/common/o;->a()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v1

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static t(Landroid/content/Context;)Ljava/lang/String;
    .locals 11

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    :try_start_0
    invoke-static {p0, v0}, Lcom/tencent/stat/common/k;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    const-string v0, "mounted"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    new-instance v6, Landroid/os/StatFs;

    invoke-direct {v6, v5}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Landroid/os/StatFs;->getBlockCount()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v6}, Landroid/os/StatFs;->getBlockSize()I

    move-result v2

    int-to-long v2, v2

    mul-long/2addr v0, v2

    const-wide/32 v2, 0xf4240

    div-long v7, v0, v2

    invoke-virtual {v6}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v6}, Landroid/os/StatFs;->getBlockSize()I

    move-result v2

    int-to-long v2, v2

    mul-long/2addr v0, v2

    const-wide/32 v2, 0xf4240

    div-long v9, v0, v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :cond_0
    goto :goto_0

    :cond_1
    :try_start_1
    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    const-string v1, "can not get the permission of android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {v0, v1}, Lcom/tencent/stat/common/StatLogger;->warn(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v0, 0x0

    return-object v0

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v4

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v4}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method static u(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    :try_start_0
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/ActivityManager;

    invoke-virtual {v2}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/app/ActivityManager$RunningAppProcessInfo;

    iget v0, v4, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v0, v1, :cond_0

    iget-object v5, v4, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-object v5

    :cond_0
    goto :goto_0

    :cond_1
    goto :goto_1

    :catch_0
    move-exception v1

    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static v(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/tencent/stat/common/StatConstants;->a:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/tencent/stat/common/k;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static declared-synchronized w(Landroid/content/Context;)Ljava/lang/Integer;
    .locals 5

    const-class v4, Lcom/tencent/stat/common/k;

    monitor-enter v4

    const/4 v2, 0x0

    const-string v0, "MTA_EVENT_INDEX"

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, v0, v1}, Lcom/tencent/stat/common/p;->a(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    move v2, v0

    const v0, 0x7ffffffe

    if-lt v2, v0, :cond_0

    const/4 v2, 0x0

    :cond_0
    const-string v0, "MTA_EVENT_INDEX"

    add-int/lit8 v1, v2, 0x1

    invoke-static {p0, v0, v1}, Lcom/tencent/stat/common/p;->b(Landroid/content/Context;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v3

    :try_start_1
    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V

    :goto_0
    add-int/lit8 v0, v2, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    monitor-exit v4

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v4

    throw p0
.end method

.method public static x(Landroid/content/Context;)Ljava/lang/String;
    .locals 8

    invoke-static {p0}, Lcom/tencent/stat/common/k;->G(Landroid/content/Context;)J

    move-result-wide v0

    const-wide/32 v2, 0xf4240

    div-long v4, v0, v2

    invoke-static {}, Lcom/tencent/stat/common/k;->i()J

    move-result-wide v0

    const-wide/32 v2, 0xf4240

    div-long v6, v0, v2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static declared-synchronized y(Landroid/content/Context;)Lcom/tencent/stat/common/l;
    .locals 2

    const-class v1, Lcom/tencent/stat/common/k;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/tencent/stat/common/k;->h:Lcom/tencent/stat/common/l;

    if-nez v0, :cond_0

    new-instance v0, Lcom/tencent/stat/common/l;

    invoke-direct {v0}, Lcom/tencent/stat/common/l;-><init>()V

    sput-object v0, Lcom/tencent/stat/common/k;->h:Lcom/tencent/stat/common/l;

    :cond_0
    sget-object v0, Lcom/tencent/stat/common/k;->h:Lcom/tencent/stat/common/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public static z(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 5

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-static {p0}, Lcom/tencent/stat/common/k;->y(Landroid/content/Context;)Lcom/tencent/stat/common/l;

    invoke-static {}, Lcom/tencent/stat/common/l;->b()I

    move-result v3

    if-lez v3, :cond_0

    const-string v0, "fx"

    const v1, 0xf4240

    div-int v1, v3, v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_0
    invoke-static {p0}, Lcom/tencent/stat/common/k;->y(Landroid/content/Context;)Lcom/tencent/stat/common/l;

    invoke-static {}, Lcom/tencent/stat/common/l;->c()I

    move-result v3

    if-lez v3, :cond_1

    const-string v0, "fn"

    const v1, 0xf4240

    div-int v1, v3, v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_1
    invoke-static {p0}, Lcom/tencent/stat/common/k;->y(Landroid/content/Context;)Lcom/tencent/stat/common/l;

    invoke-static {}, Lcom/tencent/stat/common/l;->a()I

    move-result v3

    if-lez v3, :cond_2

    const-string v0, "n"

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_2
    invoke-static {p0}, Lcom/tencent/stat/common/k;->y(Landroid/content/Context;)Lcom/tencent/stat/common/l;

    invoke-static {}, Lcom/tencent/stat/common/l;->d()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "na"

    invoke-static {p0}, Lcom/tencent/stat/common/k;->y(Landroid/content/Context;)Lcom/tencent/stat/common/l;

    invoke-static {}, Lcom/tencent/stat/common/l;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/tencent/stat/common/k;->f:Lcom/tencent/stat/common/StatLogger;

    invoke-virtual {v0, v3}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V

    :goto_0
    return-object v2
.end method
