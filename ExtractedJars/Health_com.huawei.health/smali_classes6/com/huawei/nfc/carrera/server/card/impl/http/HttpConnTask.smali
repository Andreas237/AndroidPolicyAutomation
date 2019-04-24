.class public abstract Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Result:Ljava/lang/Object;RequestParams:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final CONTENT_TYPE_APP_JSON:Ljava/lang/String; = "application/json"

.field private static final DEFAULT_TIMEOUT:I = 0x7530

.field protected static final ERROR_CODE_CONNECTION_FAILED:I = -0x2

.field protected static final ERROR_CODE_NO_NETWORK:I = -0x1

.field protected static final ERROR_CODE_PARAMS_ERROR:I = -0x3

.field protected static final ERROR_CODE_SERVER_OVERLOAD:I = -0x4

.field private static final SERVER_OVERLOAD_ERRORCODE:I = 0x1f7

.field private static final TAG:Ljava/lang/String; = "HttpConnTask"


# instance fields
.field private mConnTimeout:I

.field protected mContext:Landroid/content/Context;

.field private mSocketTimeout:I

.field private final mUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    const/16 v0, 0x7530

    iput v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->mConnTimeout:I

    .line 105
    const/16 v0, 0x7530

    iput v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->mSocketTimeout:I

    .line 115
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->mContext:Landroid/content/Context;

    .line 116
    iput-object p2, p0, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->mUrl:Ljava/lang/String;

    .line 117
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;II)V
    .locals 1

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    const/16 v0, 0x7530

    iput v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->mConnTimeout:I

    .line 105
    const/16 v0, 0x7530

    iput v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->mSocketTimeout:I

    .line 129
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->mContext:Landroid/content/Context;

    .line 130
    iput-object p2, p0, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->mUrl:Ljava/lang/String;

    .line 131
    iput p3, p0, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->mConnTimeout:I

    .line 132
    iput p4, p0, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->mSocketTimeout:I

    .line 133
    return-void
.end method

.method private closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V
    .locals 2

    .line 275
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 279
    :try_start_0
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 284
    goto :goto_0

    .line 281
    :catch_0
    move-exception v1

    .line 283
    const-string v0, "processTask close stream error1."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 287
    :cond_0
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 291
    :try_start_1
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 296
    goto :goto_1

    .line 293
    :catch_1
    move-exception v1

    .line 295
    const-string v0, "processTask close stream error2."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 299
    :cond_1
    :goto_1
    const/4 v0, 0x0

    if-eq v0, p3, :cond_2

    .line 303
    :try_start_2
    invoke-virtual {p3}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 308
    goto :goto_2

    .line 305
    :catch_2
    move-exception v1

    .line 307
    const-string v0, "processTask close stream error3."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 311
    :cond_2
    :goto_2
    const/4 v0, 0x0

    if-eq v0, p4, :cond_3

    .line 313
    invoke-virtual {p4}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 315
    :cond_3
    return-void
.end method

.method private initHttpsConnection(Ljavax/net/ssl/HttpsURLConnection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/KeyManagementException;,
            Ljava/security/cert/CertificateException;,
            Ljava/lang/IllegalAccessException;,
            Ljava/security/KeyStoreException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 355
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->mContext:Landroid/content/Context;

    .line 356
    invoke-static {v0}, Lo/ecv;->e(Landroid/content/Context;)Lo/ecv;

    move-result-object v1

    .line 357
    invoke-virtual {p1, v1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 358
    new-instance v0, Lorg/apache/http/conn/ssl/StrictHostnameVerifier;

    invoke-direct {v0}, Lorg/apache/http/conn/ssl/StrictHostnameVerifier;-><init>()V

    invoke-virtual {p1, v0}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 359
    return-void
.end method

.method private openHttpConnection(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 343
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/net/HttpURLConnection;

    .line 344
    return-object v1
.end method

.method private openHttpsConnection(Ljava/net/URL;)Ljavax/net/ssl/HttpsURLConnection;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/KeyManagementException;,
            Ljava/security/cert/CertificateException;,
            Ljava/lang/IllegalAccessException;,
            Ljava/security/KeyStoreException;
        }
    .end annotation

    .line 328
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljavax/net/ssl/HttpsURLConnection;

    .line 329
    invoke-direct {p0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->initHttpsConnection(Ljavax/net/ssl/HttpsURLConnection;)V

    .line 331
    return-object v1
.end method


# virtual methods
.method protected handleResponse(Ljava/lang/String;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)TResult;"
        }
    .end annotation

    .line 384
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleResponse response str : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 385
    const/16 v2, -0x63

    .line 386
    const/4 v3, 0x0

    .line 387
    const/4 v4, 0x0

    .line 388
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 390
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 392
    :cond_0
    const/4 v5, 0x0

    .line 395
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 396
    const-string v0, "keyIndex"

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getIntValue(Lorg/json/JSONObject;Ljava/lang/String;)I

    move-result v6

    .line 397
    const-string v0, "merchantID"

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 398
    const-string v0, "errorCode"

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 399
    const-string v0, "errorMsg"

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 400
    const-string v0, "response"

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 401
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 403
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleResponse, error code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "error msg : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 404
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 405
    const/4 v0, 0x0

    invoke-virtual {p0, v2, v9, v0}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 408
    :cond_1
    const-string v0, "260086000000068459"

    :try_start_1
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    if-ne v0, v6, :cond_2

    .line 409
    const/4 v0, 0x1

    invoke-static {v10, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 411
    :cond_2
    const-string v0, "handleResponse, unexpected error from server."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 412
    const/16 v2, -0x63

    .line 413
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    return-object v0

    .line 416
    :cond_3
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleResponse, responseDataStr : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 418
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v10}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    .line 419
    const-string v0, "returnCode"

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 420
    const/4 v0, 0x0

    if-ne v0, v11, :cond_4

    .line 422
    const-string v0, "handleResponse, returnCode is invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 423
    const/16 v2, -0x63

    .line 424
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    return-object v0

    .line 428
    :cond_4
    :try_start_3
    invoke-virtual {p0, v11}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->isNumber(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 430
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    goto :goto_0

    .line 434
    :cond_5
    const/16 v2, -0x62

    .line 436
    :goto_0
    const-string v0, "returnDesc"

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    move-result-object v0

    move-object v3, v0

    .line 447
    goto :goto_1

    .line 438
    :catch_0
    move-exception v6

    .line 440
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "readSuccessResponse, NumberFormatException : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v6}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 441
    const/16 v2, -0x63

    .line 447
    goto :goto_1

    .line 443
    :catch_1
    move-exception v6

    .line 445
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "readSuccessResponse, JSONException : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v6}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 446
    const/16 v2, -0x63

    .line 448
    :goto_1
    invoke-virtual {p0, v2, v3, v4}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public isNumber(Ljava/lang/String;)Z
    .locals 7

    .line 459
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 461
    const-string v0, "[0-9]*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v4

    .line 462
    invoke-virtual {v4, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 463
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 465
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    .line 466
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/32 v2, -0x80000000

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 468
    const/4 v0, 0x1

    return v0

    .line 472
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected abstract prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRequestParams;)Ljava/lang/String;"
        }
    .end annotation
.end method

.method public processTask(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRequestParams;)TResult;"
        }
    .end annotation

    .line 145
    const/4 v4, 0x0

    .line 147
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 149
    const-string v0, "processTask, no network."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 150
    move-object/from16 v0, p0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;

    move-result-object v4

    .line 151
    return-object v4

    .line 155
    :cond_0
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 156
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 158
    const-string v0, "processTask, invalid request params."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 159
    move-object/from16 v0, p0

    const/4 v1, -0x3

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;

    move-result-object v4

    .line 160
    return-object v4

    .line 163
    :cond_1
    const/4 v6, 0x0

    .line 164
    const/4 v7, 0x0

    .line 165
    const/4 v8, 0x0

    .line 166
    const/4 v9, 0x0

    .line 170
    :try_start_0
    new-instance v10, Ljava/net/URL;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->mUrl:Ljava/lang/String;

    invoke-direct {v10, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 171
    const-string v0, "HttpConnTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processTask, check url."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    const-string v0, "https"

    invoke-virtual {v10}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 173
    move-object/from16 v0, p0

    invoke-direct {v0, v10}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->openHttpsConnection(Ljava/net/URL;)Ljavax/net/ssl/HttpsURLConnection;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    .line 175
    :cond_2
    move-object/from16 v0, p0

    invoke-direct {v0, v10}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->openHttpConnection(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v0

    move-object v6, v0

    .line 177
    :goto_0
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->mConnTimeout:I

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 178
    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->mSocketTimeout:I

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 179
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 180
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 181
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 182
    const-string v0, "POST"

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 183
    const-string v0, "Content-Type"

    const-string v1, "application/json"

    invoke-virtual {v6, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    const-string v0, "Charset"

    const-string v1, "UTF-8"

    invoke-virtual {v6, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->connect()V

    .line 187
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v7, v0

    .line 189
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "processTask request string : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 190
    const-string v0, "UTF-8"

    invoke-virtual {v5, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 191
    invoke-virtual {v7}, Ljava/io/DataOutputStream;->flush()V

    .line 193
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v11

    .line 194
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "processTask connection result code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 195
    const/16 v0, 0xc8

    if-ne v0, v11, :cond_4

    .line 197
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v8, v0

    .line 199
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v9, v0

    .line 200
    const/16 v0, 0x400

    new-array v12, v0, [B

    .line 201
    const/4 v13, 0x0

    .line 202
    :goto_1
    invoke-virtual {v8, v12}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v13, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 204
    const/4 v0, 0x0

    invoke-virtual {v9, v12, v0, v13}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_1

    .line 206
    :cond_3
    invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v14

    .line 207
    new-instance v0, Ljava/lang/String;

    move-object v1, v14

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    move-object v15, v0

    .line 208
    move-object/from16 v0, p0

    invoke-virtual {v0, v15}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->handleResponse(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 209
    goto :goto_2

    .line 210
    :cond_4
    const/16 v0, 0x1f7

    if-ne v0, v11, :cond_5

    .line 215
    move-object/from16 v0, p0

    const/4 v1, -0x4

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;

    move-result-object v4

    goto :goto_2

    .line 219
    :cond_5
    move-object/from16 v0, p0

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 258
    :goto_2
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8, v9, v6}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 259
    goto/16 :goto_3

    .line 222
    :catch_0
    move-exception v10

    .line 224
    const-string v0, "processTask url invalid."

    :try_start_1
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 225
    move-object/from16 v0, p0

    const/4 v1, -0x3

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v4

    .line 258
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8, v9, v6}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 259
    goto/16 :goto_3

    .line 227
    :catch_1
    move-exception v10

    .line 229
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "processTask, NoSuchAlgorithmException : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v10}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 231
    move-object/from16 v0, p0

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v4

    .line 258
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8, v9, v6}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 259
    goto/16 :goto_3

    .line 233
    :catch_2
    move-exception v10

    .line 234
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "processTask CertificateException : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v10}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 235
    move-object/from16 v0, p0

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v4

    .line 258
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8, v9, v6}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 259
    goto/16 :goto_3

    .line 236
    :catch_3
    move-exception v10

    .line 238
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "processTask IllegalAccessException : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v10}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 239
    move-object/from16 v0, p0

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v4

    .line 258
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8, v9, v6}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 259
    goto/16 :goto_3

    .line 240
    :catch_4
    move-exception v10

    .line 242
    :try_start_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "processTask KeyStoreException : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v10}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 243
    move-object/from16 v0, p0

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result-object v4

    .line 258
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8, v9, v6}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 259
    goto :goto_3

    .line 245
    :catch_5
    move-exception v10

    .line 247
    :try_start_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "processTask, KeyManagementException : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v10}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 248
    move-object/from16 v0, p0

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v4

    .line 258
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8, v9, v6}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 259
    goto :goto_3

    .line 250
    :catch_6
    move-exception v10

    .line 252
    :try_start_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "processTask IOException : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v10}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 253
    move-object/from16 v0, p0

    const/4 v1, -0x2

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->readErrorResponse(I)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-result-object v4

    .line 258
    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8, v9, v6}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 259
    goto :goto_3

    .line 258
    :catchall_0
    move-exception v16

    move-object/from16 v0, p0

    invoke-direct {v0, v7, v8, v9, v6}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;->closeStream(Ljava/io/DataOutputStream;Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 259
    throw v16

    .line 261
    :goto_3
    return-object v4
.end method

.method protected abstract readErrorResponse(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TResult;"
        }
    .end annotation
.end method

.method protected abstract readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Lorg/json/JSONObject;)TResult;"
        }
    .end annotation
.end method
