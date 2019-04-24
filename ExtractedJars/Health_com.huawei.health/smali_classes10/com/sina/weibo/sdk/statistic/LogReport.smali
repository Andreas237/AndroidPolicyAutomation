.class Lcom/sina/weibo/sdk/statistic/LogReport;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CONNECTION_TIMEOUT:I = 0x61a8

.field private static final PRIVATE_CODE:Ljava/lang/String; = "dqwef1864il4c9m6"

.field private static final SOCKET_TIMEOUT:I = 0x4e20

.field private static UPLOADTIME:Ljava/lang/String; = null

.field private static mAid:Ljava/lang/String; = null

.field private static mAppkey:Ljava/lang/String; = null

.field private static mBaseUrl:Ljava/lang/String; = null

.field private static mChannel:Ljava/lang/String; = null

.field private static mKeyHash:Ljava/lang/String; = null

.field public static mLogReport:Lcom/sina/weibo/sdk/statistic/LogReport; = null

.field private static mPackageName:Ljava/lang/String; = null

.field private static mParams:Lorg/json/JSONObject; = null

.field private static mVersionName:Ljava/lang/String; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    const-string v0, "uploadtime"

    sput-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->UPLOADTIME:Ljava/lang/String;

    .line 43
    const-string v0, "https://api.weibo.com/2/proxy/sdk/statistic.json"

    sput-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mBaseUrl:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mPackageName:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mPackageName:Ljava/lang/String;

    .line 50
    :cond_0
    invoke-static {p1}, Lcom/sina/weibo/sdk/statistic/StatisticConfig;->getAppkey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mAppkey:Ljava/lang/String;

    .line 51
    invoke-static {p1}, Lcom/sina/weibo/sdk/statistic/LogReport;->checkAid(Landroid/content/Context;)Z

    .line 52
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mPackageName:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/sina/weibo/sdk/utils/Utility;->getSign(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mKeyHash:Ljava/lang/String;

    .line 53
    invoke-static {p1}, Lcom/sina/weibo/sdk/statistic/LogBuilder;->getVersion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mVersionName:Ljava/lang/String;

    .line 54
    invoke-static {p1}, Lcom/sina/weibo/sdk/statistic/StatisticConfig;->getChannel(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mChannel:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    goto :goto_0

    .line 55
    :catch_0
    move-exception v2

    .line 56
    const-string v0, "WBAgent"

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    :goto_0
    invoke-static {}, Lcom/sina/weibo/sdk/statistic/LogReport;->initCommonParams()Lorg/json/JSONObject;

    .line 59
    return-void
.end method

.method private static checkAid(Landroid/content/Context;)Z
    .locals 4

    .line 84
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mAid:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mAppkey:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/sina/weibo/sdk/utils/Utility;->getAid(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mAid:Ljava/lang/String;

    .line 87
    :cond_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mParams:Lorg/json/JSONObject;

    if-nez v0, :cond_1

    .line 88
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    sput-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mParams:Lorg/json/JSONObject;

    .line 91
    :cond_1
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mParams:Lorg/json/JSONObject;

    const-string v1, "aid"

    sget-object v2, Lcom/sina/weibo/sdk/statistic/LogReport;->mAid:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    goto :goto_0

    .line 92
    :catch_0
    move-exception v3

    .line 94
    invoke-virtual {v3}, Lorg/json/JSONException;->printStackTrace()V

    .line 96
    :goto_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mAid:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 97
    const/4 v0, 0x0

    return v0

    .line 99
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public static getPackageName()Ljava/lang/String;
    .locals 1

    .line 107
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mPackageName:Ljava/lang/String;

    return-object v0
.end method

.method private static getSign(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
    .locals 7

    .line 285
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 286
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 287
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    :cond_0
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "dqwef1864il4c9m6"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 290
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/MD5;->hexdigest(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 291
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x6

    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    .line 292
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {v5, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sina/weibo/sdk/utils/MD5;->hexdigest(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 294
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v6, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getTime(Landroid/content/Context;)J
    .locals 4

    .line 320
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->UPLOADTIME:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 322
    const-string v0, "lasttime"

    const-wide/16 v1, 0x0

    invoke-interface {v3, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private static gzipLogs(Ljava/lang/String;)[B
    .locals 4

    .line 304
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 305
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 307
    :cond_1
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 309
    const-string v0, "utf-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    .line 310
    new-instance v3, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v3, v1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 311
    invoke-virtual {v3, v2}, Ljava/util/zip/GZIPOutputStream;->write([B)V

    .line 312
    invoke-virtual {v3}, Ljava/util/zip/GZIPOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 315
    goto :goto_0

    .line 313
    :catch_0
    move-exception v2

    .line 314
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    .line 316
    :goto_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method private static initCommonParams()Lorg/json/JSONObject;
    .locals 4

    .line 65
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mParams:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    .line 66
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    sput-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mParams:Lorg/json/JSONObject;

    .line 69
    :cond_0
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mParams:Lorg/json/JSONObject;

    const-string v1, "appkey"

    sget-object v2, Lcom/sina/weibo/sdk/statistic/LogReport;->mAppkey:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 70
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mParams:Lorg/json/JSONObject;

    const-string v1, "platform"

    const-string v2, "Android"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mParams:Lorg/json/JSONObject;

    const-string v1, "packagename"

    sget-object v2, Lcom/sina/weibo/sdk/statistic/LogReport;->mPackageName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 72
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mParams:Lorg/json/JSONObject;

    const-string v1, "key_hash"

    sget-object v2, Lcom/sina/weibo/sdk/statistic/LogReport;->mKeyHash:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mParams:Lorg/json/JSONObject;

    const-string v1, "version"

    sget-object v2, Lcom/sina/weibo/sdk/statistic/LogReport;->mVersionName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mParams:Lorg/json/JSONObject;

    const-string v1, "channel"

    sget-object v2, Lcom/sina/weibo/sdk/statistic/LogReport;->mChannel:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    goto :goto_0

    .line 75
    :catch_0
    move-exception v3

    .line 77
    invoke-virtual {v3}, Lorg/json/JSONException;->printStackTrace()V

    .line 80
    :goto_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mParams:Lorg/json/JSONObject;

    return-object v0
.end method

.method private static requestHttpExecute(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;Landroid/content/Context;)Z
    .locals 14

    .line 176
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mAppkey:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 177
    const-string v0, "WBAgent"

    const-string v1, "unexpected null AppKey"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    const/4 v0, 0x0

    return v0

    .line 180
    :cond_0
    const/4 v5, 0x0

    .line 182
    if-nez p2, :cond_1

    .line 183
    :try_start_0
    invoke-static {}, Lcom/sina/weibo/sdk/statistic/LogReport;->initCommonParams()Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object p2

    .line 186
    :cond_1
    const-string v0, "time"

    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    move-object/from16 v3, p2

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 187
    const-string v0, "length"

    invoke-virtual/range {p3 .. p3}, Lorg/json/JSONArray;->length()I

    move-result v1

    move-object/from16 v2, p2

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 188
    const-string v0, "sign"

    const-string v1, "aid"

    .line 189
    move-object/from16 v2, p2

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "appkey"

    .line 190
    move-object/from16 v3, p2

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "time"

    .line 191
    move-object/from16 v4, p2

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    .line 189
    invoke-static {v1, v2, v3, v4}, Lcom/sina/weibo/sdk/statistic/LogReport;->getSign(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    .line 188
    move-object/from16 v2, p2

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 192
    const-string v0, "content"

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 193
    const-string v0, "WBAgent"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "post content--- "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 197
    goto :goto_0

    .line 195
    :catch_0
    move-exception v6

    .line 196
    :try_start_2
    invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V

    .line 198
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/sina/weibo/sdk/statistic/LogReport;->mAppkey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 199
    move-object/from16 v0, p4

    invoke-static {p0, v0}, Lcom/sina/weibo/sdk/net/ConnectionFactory;->createConnect(Ljava/lang/String;Landroid/content/Context;)Ljava/net/HttpURLConnection;

    move-result-object v6

    .line 201
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v5, v0

    .line 202
    invoke-static {}, Lcom/sina/weibo/sdk/statistic/StatisticConfig;->isNeedGizp()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 203
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sina/weibo/sdk/statistic/LogReport;->gzipLogs(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    goto :goto_1

    .line 205
    :cond_2
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 207
    :goto_1
    invoke-static {v6}, Lcom/sina/weibo/sdk/statistic/LogReport;->setPost(Ljava/net/HttpURLConnection;)V

    .line 208
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->connect()V

    .line 209
    new-instance v7, Ljava/io/DataOutputStream;

    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 210
    invoke-virtual/range {p2 .. p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sina/weibo/sdk/statistic/LogReport;->gzipLogs(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 211
    invoke-virtual {v7}, Ljava/io/DataOutputStream;->flush()V

    .line 212
    invoke-virtual {v7}, Ljava/io/DataOutputStream;->close()V

    .line 213
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v8

    .line 214
    const/16 v0, 0xc8

    if-ne v8, v0, :cond_4

    .line 216
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v9

    .line 217
    const/4 v10, 0x1

    .line 227
    if-eqz v5, :cond_3

    .line 229
    :try_start_3
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 231
    goto :goto_2

    .line 230
    :catch_1
    move-exception v11

    .line 231
    :cond_3
    :goto_2
    return v10

    .line 220
    :cond_4
    const-string v0, "WBAgent"

    :try_start_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "status code = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 227
    if-eqz v5, :cond_6

    .line 229
    :try_start_5
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 231
    goto :goto_4

    .line 230
    :catch_2
    move-exception v6

    .line 231
    goto :goto_4

    .line 222
    :catch_3
    move-exception v6

    .line 223
    :try_start_6
    invoke-virtual {v6}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 227
    if-eqz v5, :cond_6

    .line 229
    :try_start_7
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    .line 231
    goto :goto_4

    .line 230
    :catch_4
    move-exception v6

    .line 231
    goto :goto_4

    .line 224
    :catch_5
    move-exception v6

    .line 225
    :try_start_8
    invoke-virtual {v6}, Ljava/io/IOException;->printStackTrace()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 227
    if-eqz v5, :cond_6

    .line 229
    :try_start_9
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    .line 231
    goto :goto_4

    .line 230
    :catch_6
    move-exception v6

    .line 231
    goto :goto_4

    .line 227
    :catchall_0
    move-exception v12

    if-eqz v5, :cond_5

    .line 229
    :try_start_a
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7

    .line 231
    goto :goto_3

    .line 230
    :catch_7
    move-exception v13

    .line 231
    :cond_5
    :goto_3
    throw v12

    .line 235
    :cond_6
    :goto_4
    const/4 v0, 0x0

    return v0
.end method

.method public static setPackageName(Ljava/lang/String;)V
    .locals 0

    .line 103
    sput-object p0, Lcom/sina/weibo/sdk/statistic/LogReport;->mPackageName:Ljava/lang/String;

    .line 104
    return-void
.end method

.method private static setPost(Ljava/net/HttpURLConnection;)V
    .locals 3

    .line 242
    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 243
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 244
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 245
    const-string v0, "POST"

    invoke-virtual {p0, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 247
    const-string v0, "Content-Type"

    const-string v1, "application/x-www-form-urlencoded"

    invoke-virtual {p0, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {p0, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    const-string v0, "Charset"

    const-string v1, "UTF-8"

    invoke-virtual {p0, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 251
    goto :goto_0

    .line 250
    :catch_0
    move-exception v2

    .line 252
    :goto_0
    return-void
.end method

.method private static updateTime(Landroid/content/Context;Ljava/lang/Long;)V
    .locals 5

    .line 326
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->UPLOADTIME:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 329
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    .line 330
    const-string v0, "lasttime"

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {v4, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 331
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 332
    return-void
.end method

.method public static declared-synchronized uploadAppLogs(Landroid/content/Context;Ljava/lang/String;)V
    .locals 10

    const-class v9, Lcom/sina/weibo/sdk/statistic/LogReport;

    monitor-enter v9

    .line 116
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mLogReport:Lcom/sina/weibo/sdk/statistic/LogReport;

    if-nez v0, :cond_0

    .line 117
    new-instance v0, Lcom/sina/weibo/sdk/statistic/LogReport;

    invoke-direct {v0, p0}, Lcom/sina/weibo/sdk/statistic/LogReport;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mLogReport:Lcom/sina/weibo/sdk/statistic/LogReport;

    .line 120
    :cond_0
    invoke-static {p0}, Lcom/sina/weibo/sdk/net/NetStateManager;->isNetworkConnected(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 121
    const-string v0, "WBAgent"

    const-string v1, "network is not connected"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    const-string v0, "app_logs"

    .line 124
    invoke-static {v0}, Lcom/sina/weibo/sdk/statistic/LogFileUtil;->getAppLogPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 123
    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Lcom/sina/weibo/sdk/statistic/LogFileUtil;->writeToFile(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 126
    monitor-exit v9

    return-void

    .line 129
    :cond_1
    invoke-static {p1}, Lcom/sina/weibo/sdk/statistic/LogBuilder;->getValidUploadLogs(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 130
    if-nez v3, :cond_2

    .line 131
    const-string v0, "WBAgent"

    const-string v1, "applogs is null"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    monitor-exit v9

    return-void

    .line 135
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 137
    invoke-static {p0}, Lcom/sina/weibo/sdk/statistic/LogReport;->checkAid(Landroid/content/Context;)Z

    move-result v5

    .line 138
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lorg/json/JSONArray;

    .line 139
    const/4 v8, 0x0

    .line 140
    if-eqz v5, :cond_3

    .line 141
    sget-object v0, Lcom/sina/weibo/sdk/statistic/LogReport;->mBaseUrl:Ljava/lang/String;

    const-string v1, "POST"

    sget-object v2, Lcom/sina/weibo/sdk/statistic/LogReport;->mParams:Lorg/json/JSONObject;

    invoke-static {v0, v1, v2, v7, p0}, Lcom/sina/weibo/sdk/statistic/LogReport;->requestHttpExecute(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;Landroid/content/Context;)Z

    move-result v8

    .line 143
    :cond_3
    if-nez v8, :cond_4

    .line 144
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    const-string v0, "WBAgent"

    const-string v1, "upload applogs error"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 147
    :cond_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/sina/weibo/sdk/statistic/LogReport;->updateTime(Landroid/content/Context;Ljava/lang/Long;)V

    .line 149
    :goto_1
    goto :goto_0

    .line 151
    :cond_5
    const-string v0, "app_logs"

    .line 152
    invoke-static {v0}, Lcom/sina/weibo/sdk/statistic/LogFileUtil;->getAppLogPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 151
    invoke-static {v0}, Lcom/sina/weibo/sdk/statistic/LogFileUtil;->delete(Ljava/lang/String;)Z

    .line 154
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 155
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lorg/json/JSONArray;

    .line 156
    const-string v0, "app_logs"

    .line 157
    invoke-static {v0}, Lcom/sina/weibo/sdk/statistic/LogFileUtil;->getAppLogPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 158
    invoke-virtual {v7}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    .line 156
    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/sina/weibo/sdk/statistic/LogFileUtil;->writeToFile(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 159
    const-string v0, "WBAgent"

    const-string v1, "save failed_log"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    goto :goto_2

    .line 163
    :cond_6
    monitor-exit v9

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v9

    throw p0
.end method
