.class public Lcom/yandex/metrica/impl/bt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/bt$a;
    }
.end annotation


# static fields
.field private static volatile c:Lcom/yandex/metrica/impl/bt;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field private static final d:Ljava/lang/Object;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/net/wifi/WifiManager;

.field private e:Lcom/yandex/metrica/impl/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/c$a<",
            "Lorg/json/JSONArray;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/yandex/metrica/impl/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/c$a<",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/bt$a;",
            ">;>;"
        }
    .end annotation
.end field

.field private g:Lcom/yandex/metrica/impl/ob/ks;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 65
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/yandex/metrica/impl/bt;->d:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 73
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    invoke-direct {p0, p1, v0}, Lcom/yandex/metrica/impl/bt;-><init>(Landroid/content/Context;Landroid/net/wifi/WifiManager;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/net/wifi/WifiManager;)V
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 323
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    new-instance v0, Lcom/yandex/metrica/impl/c$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/c$a;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/bt;->e:Lcom/yandex/metrica/impl/c$a;

    .line 68
    new-instance v0, Lcom/yandex/metrica/impl/c$a;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/c$a;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/bt;->f:Lcom/yandex/metrica/impl/c$a;

    .line 324
    iput-object p1, p0, Lcom/yandex/metrica/impl/bt;->a:Landroid/content/Context;

    .line 325
    iput-object p2, p0, Lcom/yandex/metrica/impl/bt;->b:Landroid/net/wifi/WifiManager;

    .line 326
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object p1

    const-class p2, Lcom/yandex/metrica/impl/ob/r;

    new-instance v0, Lcom/yandex/metrica/impl/bt$1;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/bt$1;-><init>(Lcom/yandex/metrica/impl/bt;)V

    .line 328
    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/l;->a(Lcom/yandex/metrica/impl/ob/k;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v0

    .line 334
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/l$a;->a()Lcom/yandex/metrica/impl/ob/l;

    move-result-object v0

    .line 326
    invoke-virtual {p1, p0, p2, v0}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;Ljava/lang/Class;Lcom/yandex/metrica/impl/ob/l;)V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/yandex/metrica/impl/bt;
    .locals 2

    .line 77
    sget-object v0, Lcom/yandex/metrica/impl/bt;->c:Lcom/yandex/metrica/impl/bt;

    if-nez v0, :cond_1

    .line 78
    sget-object v0, Lcom/yandex/metrica/impl/bt;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 79
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/bt;->c:Lcom/yandex/metrica/impl/bt;

    if-nez v1, :cond_0

    .line 80
    new-instance v1, Lcom/yandex/metrica/impl/bt;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/bt;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/yandex/metrica/impl/bt;->c:Lcom/yandex/metrica/impl/bt;

    .line 82
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 85
    :cond_1
    :goto_0
    sget-object p0, Lcom/yandex/metrica/impl/bt;->c:Lcom/yandex/metrica/impl/bt;

    return-object p0
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/bt;Lcom/yandex/metrica/impl/ob/ks;)Lcom/yandex/metrica/impl/ob/ks;
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/yandex/metrica/impl/bt;->g:Lcom/yandex/metrica/impl/ob/ks;

    return-object p1
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 109
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, ":"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;ZI)Lorg/json/JSONObject;
    .locals 2

    .line 191
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "mac"

    .line 192
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p0

    const-string v0, "ssid"

    .line 193
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p0

    const-string p1, "signal_strength"

    .line 194
    invoke-virtual {p0, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object p0

    const-string p1, "is_connected"

    .line 195
    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private a(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/bt$a;",
            ">;)V"
        }
    .end annotation

    .line 220
    invoke-direct {p0}, Lcom/yandex/metrica/impl/bt;->g()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 223
    :try_start_0
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v1

    .line 224
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/NetworkInterface;

    .line 225
    invoke-virtual {v2}, Ljava/net/NetworkInterface;->getHardwareAddress()[B

    move-result-object v3

    if-eqz v3, :cond_0

    .line 231
    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_1
    const/4 v7, 0x1

    if-ge v6, v4, :cond_1

    aget-byte v8, v3, v6

    .line 232
    sget-object v9, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v10, "%02X:"

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v8

    aput-object v8, v7, v5

    invoke-static {v9, v10, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 234
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_0

    .line 235
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    sub-int/2addr v3, v7

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 236
    new-instance v3, Lcom/yandex/metrica/impl/bt$a;

    invoke-virtual {v2}, Ljava/net/NetworkInterface;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Lcom/yandex/metrica/impl/bt$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 237
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->setLength(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-void

    :catch_0
    :cond_3
    return-void
.end method

.method private c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/net/wifi/ScanResult;",
            ">;"
        }
    .end annotation

    .line 116
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->b:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private d()Lorg/json/JSONArray;
    .locals 8

    .line 138
    invoke-direct {p0}, Lcom/yandex/metrica/impl/bt;->i()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ar;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    invoke-direct {p0}, Lcom/yandex/metrica/impl/bt;->c()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 143
    :goto_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/bt;->h()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/yandex/metrica/impl/bt;->a:Landroid/content/Context;

    const-string v3, "android.permission.ACCESS_WIFI_STATE"

    .line 1050
    invoke-static {v2, v3}, Lcom/yandex/metrica/impl/ar;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1125
    iget-object v2, p0, Lcom/yandex/metrica/impl/bt;->b:Landroid/net/wifi/WifiManager;

    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "00:00:00:00:00:00"

    .line 1128
    invoke-virtual {v2}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 1129
    invoke-virtual {v2}, Landroid/net/wifi/WifiInfo;->getIpAddress()I

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    move-object v2, v1

    :cond_2
    if-nez v2, :cond_3

    move-object v3, v1

    goto :goto_1

    .line 146
    :cond_3
    invoke-virtual {v2}, Landroid/net/wifi/WifiInfo;->getBSSID()Ljava/lang/String;

    move-result-object v3

    .line 147
    :goto_1
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    if-eqz v0, :cond_6

    .line 149
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/wifi/ScanResult;

    if-eqz v2, :cond_4

    const/4 v5, 0x0

    .line 154
    :try_start_0
    iget-object v6, v2, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    if-eqz v6, :cond_5

    .line 156
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 157
    :try_start_1
    invoke-static {v6}, Lcom/yandex/metrica/impl/bt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_0
    :cond_5
    move v7, v5

    :catch_1
    move-object v5, v1

    .line 162
    :goto_3
    iget-object v6, v2, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    iget v2, v2, Landroid/net/wifi/ScanResult;->level:I

    invoke-static {v5, v6, v7, v2}, Lcom/yandex/metrica/impl/bt;->a(Ljava/lang/String;Ljava/lang/String;ZI)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 164
    invoke-virtual {v4, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_2

    :cond_6
    if-eqz v2, :cond_8

    .line 169
    invoke-static {v3}, Lcom/yandex/metrica/impl/bt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 170
    invoke-virtual {v2}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v1, "\""

    const-string v5, ""

    .line 1185
    invoke-virtual {v3, v1, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    :goto_4
    const/4 v3, 0x1

    .line 172
    invoke-virtual {v2}, Landroid/net/wifi/WifiInfo;->getRssi()I

    move-result v2

    invoke-static {v0, v1, v3, v2}, Lcom/yandex/metrica/impl/bt;->a(Ljava/lang/String;Ljava/lang/String;ZI)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 174
    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_8
    return-object v4
.end method

.method private e()Z
    .locals 1

    .line 204
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->b:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method private declared-synchronized f()Z
    .locals 1

    monitor-enter p0

    .line 303
    :try_start_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/bt;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->g:Lcom/yandex/metrica/impl/ob/ks;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/ks;->k:Lcom/yandex/metrica/impl/ob/kh;

    iget-boolean v0, v0, Lcom/yandex/metrica/impl/ob/kh;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized g()Z
    .locals 1

    monitor-enter p0

    .line 307
    :try_start_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/bt;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->g:Lcom/yandex/metrica/impl/ob/ks;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/ks;->k:Lcom/yandex/metrica/impl/ob/kh;

    iget-boolean v0, v0, Lcom/yandex/metrica/impl/ob/kh;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized h()Z
    .locals 1

    monitor-enter p0

    .line 311
    :try_start_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/bt;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->g:Lcom/yandex/metrica/impl/ob/ks;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/ks;->k:Lcom/yandex/metrica/impl/ob/kh;

    iget-boolean v0, v0, Lcom/yandex/metrica/impl/ob/kh;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized i()Z
    .locals 1

    monitor-enter p0

    .line 315
    :try_start_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/bt;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->g:Lcom/yandex/metrica/impl/ob/ks;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/ks;->k:Lcom/yandex/metrica/impl/ob/kh;

    iget-boolean v0, v0, Lcom/yandex/metrica/impl/ob/kh;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private declared-synchronized j()Z
    .locals 1

    monitor-enter p0

    .line 319
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->g:Lcom/yandex/metrica/impl/ob/ks;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public declared-synchronized a()Lorg/json/JSONArray;
    .locals 2

    monitor-enter p0

    .line 95
    :try_start_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/bt;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 97
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 100
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->e:Lcom/yandex/metrica/impl/c$a;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/c$a;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->e:Lcom/yandex/metrica/impl/c$a;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/c$a;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 101
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->e:Lcom/yandex/metrica/impl/c$a;

    invoke-direct {p0}, Lcom/yandex/metrica/impl/bt;->d()Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/c$a;->a(Ljava/lang/Object;)V

    .line 104
    :cond_2
    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->e:Lcom/yandex/metrica/impl/c$a;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/c$a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 94
    monitor-exit p0

    throw v0
.end method

.method public b(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 247
    invoke-direct {p0}, Lcom/yandex/metrica/impl/bt;->f()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    :try_start_0
    const-string v0, "android.permission.ACCESS_WIFI_STATE"

    .line 2050
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ar;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 250
    iget-object p1, p0, Lcom/yandex/metrica/impl/bt;->b:Landroid/net/wifi/WifiManager;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const-string v0, "getWifiApConfiguration"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {p1, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    .line 251
    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->b:Landroid/net/wifi/WifiManager;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/wifi/WifiConfiguration;

    if-eqz p1, :cond_0

    .line 252
    iget-object p1, p1, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_0
    return-object v1

    :catch_0
    :cond_1
    return-object v1
.end method

.method public b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/bt$a;",
            ">;"
        }
    .end annotation

    .line 211
    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->f:Lcom/yandex/metrica/impl/c$a;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/c$a;->b()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->f:Lcom/yandex/metrica/impl/c$a;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/c$a;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 212
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 213
    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/bt;->a(Ljava/util/List;)V

    .line 214
    iget-object v1, p0, Lcom/yandex/metrica/impl/bt;->f:Lcom/yandex/metrica/impl/c$a;

    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/c$a;->a(Ljava/lang/Object;)V

    .line 216
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->f:Lcom/yandex/metrica/impl/c$a;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/c$a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public c(Landroid/content/Context;)I
    .locals 4

    .line 271
    invoke-direct {p0}, Lcom/yandex/metrica/impl/bt;->f()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    :try_start_0
    const-string v0, "android.permission.ACCESS_WIFI_STATE"

    .line 3050
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/ar;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 274
    iget-object p1, p0, Lcom/yandex/metrica/impl/bt;->b:Landroid/net/wifi/WifiManager;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const-string v0, "getWifiApState"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {p1, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    .line 276
    iget-object v0, p0, Lcom/yandex/metrica/impl/bt;->b:Landroid/net/wifi/WifiManager;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v0, 0xa

    if-le p1, v0, :cond_0

    add-int/lit8 p1, p1, -0xa

    :cond_0
    move v1, p1

    :catch_0
    :cond_1
    return v1
.end method
