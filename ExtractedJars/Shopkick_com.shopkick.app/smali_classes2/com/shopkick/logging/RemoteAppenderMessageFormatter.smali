.class final Lcom/shopkick/logging/RemoteAppenderMessageFormatter;
.super Ljava/lang/Object;
.source "RemoteAppenderMessageFormatter.java"


# static fields
.field private static final AdvertisingIDExecutor:Ljava/util/concurrent/ExecutorService;

.field private static volatile AdvertisingId:Ljava/lang/String; = null

.field private static volatile DeviceId:Ljava/lang/String; = null

.field private static final EncryptKey:Ljava/lang/String; = "enter the dragon"

.field private static volatile IsLimitAdTrackingEnabled:Ljava/lang/Boolean; = null

.field private static final LogTag:Ljava/lang/String; = "RemoteAppenderMessageFormatter"

.field static final ParamKeyNamePrefix:Ljava/lang/String; = "param"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->AdvertisingIDExecutor:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    .line 27
    sget-object v0, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->AdvertisingId:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$002(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 27
    sput-object p0, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->AdvertisingId:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$102(Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    .line 27
    sput-object p0, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->IsLimitAdTrackingEnabled:Ljava/lang/Boolean;

    return-object p0
.end method

.method static synthetic access$200()Ljava/lang/String;
    .locals 1

    .line 27
    sget-object v0, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->LogTag:Ljava/lang/String;

    return-object v0
.end method

.method public static formatMessage(Landroid/content/Context;Lcom/shopkick/logging/Message;)Lorg/json/JSONObject;
    .locals 10

    if-eqz p0, :cond_11

    if-eqz p1, :cond_10

    const-string v0, "LEVEL"

    .line 47
    const-class v1, Lcom/shopkick/logging/Level;

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/logging/Level;

    const-string v1, "THREAD_ID"

    .line 48
    const-class v2, Ljava/lang/Long;

    invoke-virtual {p1, v1, v2}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    const-string v2, "CLASS_NAME"

    .line 49
    const-class v3, Ljava/lang/String;

    invoke-virtual {p1, v2, v3}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "LINE_NUMBER"

    .line 50
    const-class v4, Ljava/lang/Integer;

    invoke-virtual {p1, v3, v4}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    const-string v4, "EVENT"

    .line 51
    const-class v5, Ljava/lang/Integer;

    invoke-virtual {p1, v4, v5}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    const-string v5, "TEXT"

    .line 52
    const-class v6, Ljava/lang/String;

    invoke-virtual {p1, v5, v6}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, "THROWABLE"

    .line 53
    const-class v7, Ljava/lang/Throwable;

    invoke-virtual {p1, v6, v7}, Lcom/shopkick/logging/Message;->safelyExtract(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Throwable;

    .line 56
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v8, "base:context:class_name"

    .line 60
    invoke-virtual {v7, v8, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "base:areas"

    .line 61
    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getAreas()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "base:timestamp"

    .line 62
    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getTimestamp()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    const-string v2, "base:level"

    .line 64
    invoke-virtual {v0}, Lcom/shopkick/logging/Level;->getValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    if-eqz v1, :cond_1

    const-string v0, "base:context:thread"

    .line 67
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    if-eqz v3, :cond_2

    const-string v0, "base:context:line_no"

    .line 70
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    if-eqz v4, :cond_3

    const-string v0, "base:event"

    .line 73
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    :cond_3
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "base:message"

    .line 77
    invoke-virtual {v7, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_4
    if-eqz v6, :cond_5

    const-string v0, "base:exception"

    .line 80
    invoke-static {v6}, Lcom/shopkick/logging/DiagnosticLogger;->getThrowableDump(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    :cond_5
    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getParams()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    .line 83
    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getParams()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 84
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "%1$s:%2$s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "param"

    aput-object v6, v5, v1

    const/4 v6, 0x1

    aput-object v2, v5, v6

    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 85
    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getParams()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 84
    invoke-virtual {v7, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 88
    :cond_6
    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string/jumbo v0, "user:id"

    .line 89
    invoke-virtual {p1}, Lcom/shopkick/logging/Message;->getUserId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v7, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    :cond_7
    invoke-static {p0}, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 94
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "device:id"

    .line 95
    invoke-virtual {v7, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_8
    const-string p1, "device:make"

    .line 97
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v7, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "device:model"

    .line 98
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v7, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    invoke-static {p0}, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->getAdvertisingId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 100
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "device:advertising:id"

    .line 101
    invoke-virtual {v7, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    :cond_9
    invoke-static {p0}, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->isLimitAdTrackingEnabled(Landroid/content/Context;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_b

    const-string v0, "device:advertising:limit_tracking"

    .line 105
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_a

    const-string p1, "1"

    goto :goto_1

    :cond_a
    const-string p1, "0"

    :goto_1
    invoke-virtual {v7, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_b
    const-string p1, "os:name"

    const-string v0, "Android"

    .line 109
    invoke-virtual {v7, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "os:version"

    .line 110
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v7, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_5

    const/4 p1, 0x0

    .line 119
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_5

    .line 120
    :try_start_2
    iget-object v2, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_5

    .line 121
    :try_start_3
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_c

    const-string v3, "app:id"

    invoke-virtual {v7, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_5

    goto :goto_2

    :catch_0
    move-object v2, p1

    goto :goto_2

    :catch_1
    move-object v0, p1

    move-object v2, v0

    .line 126
    :catch_2
    :cond_c
    :goto_2
    :try_start_4
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    .line 127
    invoke-virtual {p1, v2, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    .line 128
    iget v1, p0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 129
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 130
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_d

    const-string v2, "app:version"

    invoke-virtual {v7, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_d
    if-eqz v1, :cond_e

    const-string p0, "app:version_code"

    .line 131
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_5

    .line 136
    :catch_3
    :cond_e
    :try_start_5
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0

    .line 137
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_f

    const-string p1, "app:name"

    invoke-virtual {v7, p1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_5

    :catch_4
    :cond_f
    return-object v7

    :catch_5
    move-exception p0

    .line 141
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    .line 44
    :cond_10
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'message\' cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 43
    :cond_11
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'context\' cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getAdvertisingId(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 151
    sget-object v0, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->AdvertisingId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    invoke-static {p0}, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->initializeAdvertisingIdData(Landroid/content/Context;)Ljava/util/concurrent/Future;

    move-result-object p0

    .line 153
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    :catch_0
    :cond_0
    sget-object p0, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->AdvertisingId:Ljava/lang/String;

    return-object p0
.end method

.method public static getDeviceId(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_1

    .line 181
    sget-object v0, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->DeviceId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "android.permission.READ_PHONE_STATE"

    .line 183
    invoke-virtual {p0, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "phone"

    .line 186
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/telephony/TelephonyManager;

    if-eqz p0, :cond_0

    .line 188
    invoke-virtual {p0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object p0

    .line 189
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "enter the dragon"

    .line 191
    invoke-static {p0, v0}, Lcom/shopkick/app/util/Crypto;->hmac(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 192
    sput-object p0, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->DeviceId:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 198
    :catch_0
    :cond_0
    sget-object p0, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->DeviceId:Ljava/lang/String;

    return-object p0

    .line 178
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'context\' cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static initializeAdvertisingIdData(Landroid/content/Context;)Ljava/util/concurrent/Future;
    .locals 2

    .line 207
    sget-object v0, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->AdvertisingIDExecutor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/shopkick/logging/RemoteAppenderMessageFormatter$1;

    invoke-direct {v1, p0}, Lcom/shopkick/logging/RemoteAppenderMessageFormatter$1;-><init>(Landroid/content/Context;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method public static isLimitAdTrackingEnabled(Landroid/content/Context;)Ljava/lang/Boolean;
    .locals 1

    .line 164
    sget-object v0, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->IsLimitAdTrackingEnabled:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    .line 165
    invoke-static {p0}, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->initializeAdvertisingIdData(Landroid/content/Context;)Ljava/util/concurrent/Future;

    move-result-object p0

    .line 166
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    :catch_0
    :cond_0
    sget-object p0, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->IsLimitAdTrackingEnabled:Ljava/lang/Boolean;

    return-object p0
.end method
