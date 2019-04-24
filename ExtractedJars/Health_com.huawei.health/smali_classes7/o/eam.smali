.class public Lo/eam;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eam$a;
    }
.end annotation


# static fields
.field private static d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 58
    const/4 v0, 0x0

    sput-object v0, Lo/eam;->d:Landroid/content/Context;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Ljava/lang/String;)Lo/eam$a;
    .locals 10

    .line 436
    const/4 v4, 0x0

    .line 438
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 439
    const-string v6, ""

    .line 440
    const-string v7, ""

    .line 441
    const-string v8, ""

    .line 442
    const-string v9, ""

    .line 444
    const-string v0, "resultCode"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 445
    const-string v0, "resultCode"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 448
    :cond_0
    const-string v0, "resultDesc"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 449
    const-string v0, "resultDesc"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 452
    :cond_1
    const-string v0, "messages"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 453
    const-string v0, "messages"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 456
    :cond_2
    const-string v0, "moreInfoUrl"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 457
    const-string v0, "moreInfoUrl"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 460
    :cond_3
    const-string v0, "revokeMsgIds"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 461
    const-string v0, "revokeMsgIds"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 464
    :cond_4
    new-instance v0, Lo/eam$a;

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-direct {v0, v1, v7, v8, v9}, Lo/eam$a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v4, v0

    .line 465
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resResult = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/eam$a;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 467
    return-object v4

    .line 468
    :catch_0
    move-exception v5

    .line 469
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseResult() ==> JSONException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 470
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseResult======="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    return-object v4
.end method

.method private static a(ILjava/lang/String;Lo/eaf;)V
    .locals 4

    .line 357
    const/16 v0, 0xc8

    if-ne p0, v0, :cond_2

    .line 358
    invoke-static {p1}, Lo/eam;->a(Ljava/lang/String;)Lo/eam$a;

    move-result-object v1

    .line 359
    if-eqz v1, :cond_1

    .line 360
    invoke-virtual {v1}, Lo/eam$a;->c()I

    move-result v0

    if-nez v0, :cond_0

    .line 361
    invoke-virtual {v1}, Lo/eam$a;->a()Ljava/lang/String;

    move-result-object v2

    .line 362
    invoke-virtual {v1}, Lo/eam$a;->b()Ljava/lang/String;

    move-result-object v3

    .line 363
    invoke-static {p2, v2, v3}, Lo/eam;->e(Lo/eaf;Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    goto :goto_0

    .line 365
    :cond_0
    invoke-virtual {v1}, Lo/eam$a;->c()I

    move-result v0

    invoke-static {p2, v0}, Lo/eam;->c(Lo/eaf;I)V

    goto :goto_0

    .line 368
    :cond_1
    const/4 v0, -0x1

    invoke-static {p2, v0}, Lo/eam;->c(Lo/eaf;I)V

    .line 370
    :goto_0
    goto :goto_1

    .line 371
    :cond_2
    const/4 v0, -0x2

    invoke-static {p2, v0}, Lo/eam;->c(Lo/eaf;I)V

    .line 373
    :goto_1
    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo/eaf;)V
    .locals 20

    .line 255
    invoke-static/range {p1 .. p1}, Lo/eam;->d(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 256
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "url is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    return-void

    .line 259
    :cond_0
    invoke-static/range {p0 .. p0}, Lo/eag;->c(Landroid/content/Context;)Lo/dzz;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 260
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "adapter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    return-void

    .line 263
    :cond_1
    invoke-static/range {p0 .. p0}, Lo/eag;->c(Landroid/content/Context;)Lo/dzz;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "getLoginInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAppInfo"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-interface {v0, v1}, Lo/dzz;->c([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .line 264
    const/4 v5, 0x0

    .line 265
    const/4 v6, 0x0

    .line 267
    const/4 v7, 0x0

    .line 268
    const/4 v8, 0x0

    .line 269
    const-string v9, ""

    .line 270
    const-string v0, "huid"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 271
    const-string v0, "grayVersion"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    .line 272
    const/4 v12, -0x1

    .line 274
    :try_start_0
    new-instance v13, Ljava/net/URL;

    move-object/from16 v0, p1

    invoke-direct {v13, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 275
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doPost==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 277
    invoke-virtual {v13}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 278
    invoke-virtual {v13}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    move-object v5, v0

    .line 279
    move-object v0, v5

    check-cast v0, Ljavax/net/ssl/HttpsURLConnection;

    invoke-static {v0}, Lo/eam;->d(Ljavax/net/ssl/HttpsURLConnection;)V

    goto :goto_0

    .line 281
    :cond_2
    invoke-virtual {v13}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v5, v0

    .line 284
    :goto_0
    const-string v0, "POST"

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 285
    const-string v0, "accept"

    const-string v1, "*/*"

    invoke-virtual {v5, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    const-string v0, "connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {v5, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    const-string v0, "Content-Type"

    const-string v1, "application/x-www-form-urlencoded"

    invoke-virtual {v5, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    const-string v0, "charset"

    const-string v1, "utf-8"

    invoke-virtual {v5, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    const-string v0, "x-huid"

    invoke-virtual {v5, v0, v10}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    const-string v0, "x-version"

    invoke-virtual {v5, v0, v11}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    const-string v0, "Date"

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 294
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 295
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 296
    const/16 v0, 0x2710

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 297
    const/16 v0, 0x2710

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 299
    if-eqz p2, :cond_3

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 301
    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V

    move-object v8, v0

    .line 302
    new-instance v0, Ljava/io/PrintWriter;

    invoke-direct {v0, v8}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    move-object v6, v0

    .line 304
    move-object/from16 v0, p2

    invoke-virtual {v6, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 306
    invoke-virtual {v6}, Ljava/io/PrintWriter;->flush()V

    .line 309
    :cond_3
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->connect()V

    .line 310
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v14

    .line 311
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "responseCode == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    new-instance v0, Ljava/io/InputStreamReader;

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    move-object v7, v0

    .line 317
    const/16 v0, 0x400

    new-array v0, v0, [C

    move-object/from16 v16, v0

    .line 318
    new-instance v17, Ljava/lang/StringBuilder;

    invoke-direct/range {v17 .. v17}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 320
    :goto_1
    move-object/from16 v0, v16

    const/4 v1, 0x0

    const/16 v2, 0x400

    :try_start_1
    invoke-virtual {v7, v0, v1, v2}, Ljava/io/InputStreamReader;->read([CII)I

    move-result v0

    move v15, v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_4

    .line 321
    move-object/from16 v0, v17

    move-object/from16 v1, v16

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v15}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/net/ProtocolException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 325
    :cond_4
    goto :goto_2

    .line 323
    :catch_0
    move-exception v18

    .line 324
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doPost result e:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v18 .. v18}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 328
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "result == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    move-object/from16 v0, p3

    invoke-static {v14, v9, v0}, Lo/eam;->a(ILjava/lang/String;Lo/eaf;)V
    :try_end_2
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/net/ProtocolException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 344
    invoke-static {v7}, Lo/eam;->a(Ljava/io/InputStreamReader;)V

    .line 346
    invoke-static {v8}, Lo/eam;->a(Ljava/io/OutputStreamWriter;)V

    .line 347
    invoke-static {v6}, Lo/eam;->a(Ljava/io/PrintWriter;)V

    .line 348
    invoke-static {v5}, Lo/eam;->e(Ljava/net/HttpURLConnection;)V

    .line 350
    sget-object v0, Lo/eam;->d:Landroid/content/Context;

    if-eqz v0, :cond_6

    .line 351
    const/4 v0, 0x0

    sput-object v0, Lo/eam;->d:Landroid/content/Context;

    goto/16 :goto_3

    .line 332
    :catch_1
    move-exception v13

    .line 333
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doPost======="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 334
    move-object/from16 v0, p3

    invoke-static {v0, v12}, Lo/eam;->c(Lo/eaf;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 344
    invoke-static {v7}, Lo/eam;->a(Ljava/io/InputStreamReader;)V

    .line 346
    invoke-static {v8}, Lo/eam;->a(Ljava/io/OutputStreamWriter;)V

    .line 347
    invoke-static {v6}, Lo/eam;->a(Ljava/io/PrintWriter;)V

    .line 348
    invoke-static {v5}, Lo/eam;->e(Ljava/net/HttpURLConnection;)V

    .line 350
    sget-object v0, Lo/eam;->d:Landroid/content/Context;

    if-eqz v0, :cond_6

    .line 351
    const/4 v0, 0x0

    sput-object v0, Lo/eam;->d:Landroid/content/Context;

    goto/16 :goto_3

    .line 335
    :catch_2
    move-exception v13

    .line 336
    move-object/from16 v0, p3

    :try_start_4
    invoke-static {v0, v12}, Lo/eam;->c(Lo/eaf;I)V

    .line 337
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doPost======="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Ljava/net/ProtocolException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 344
    invoke-static {v7}, Lo/eam;->a(Ljava/io/InputStreamReader;)V

    .line 346
    invoke-static {v8}, Lo/eam;->a(Ljava/io/OutputStreamWriter;)V

    .line 347
    invoke-static {v6}, Lo/eam;->a(Ljava/io/PrintWriter;)V

    .line 348
    invoke-static {v5}, Lo/eam;->e(Ljava/net/HttpURLConnection;)V

    .line 350
    sget-object v0, Lo/eam;->d:Landroid/content/Context;

    if-eqz v0, :cond_6

    .line 351
    const/4 v0, 0x0

    sput-object v0, Lo/eam;->d:Landroid/content/Context;

    goto :goto_3

    .line 338
    :catch_3
    move-exception v13

    .line 339
    move-object/from16 v0, p3

    :try_start_5
    invoke-static {v0, v12}, Lo/eam;->c(Lo/eaf;I)V

    .line 340
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doPost======="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 344
    invoke-static {v7}, Lo/eam;->a(Ljava/io/InputStreamReader;)V

    .line 346
    invoke-static {v8}, Lo/eam;->a(Ljava/io/OutputStreamWriter;)V

    .line 347
    invoke-static {v6}, Lo/eam;->a(Ljava/io/PrintWriter;)V

    .line 348
    invoke-static {v5}, Lo/eam;->e(Ljava/net/HttpURLConnection;)V

    .line 350
    sget-object v0, Lo/eam;->d:Landroid/content/Context;

    if-eqz v0, :cond_6

    .line 351
    const/4 v0, 0x0

    sput-object v0, Lo/eam;->d:Landroid/content/Context;

    goto :goto_3

    .line 344
    :catchall_0
    move-exception v19

    invoke-static {v7}, Lo/eam;->a(Ljava/io/InputStreamReader;)V

    .line 346
    invoke-static {v8}, Lo/eam;->a(Ljava/io/OutputStreamWriter;)V

    .line 347
    invoke-static {v6}, Lo/eam;->a(Ljava/io/PrintWriter;)V

    .line 348
    invoke-static {v5}, Lo/eam;->e(Ljava/net/HttpURLConnection;)V

    .line 350
    sget-object v0, Lo/eam;->d:Landroid/content/Context;

    if-eqz v0, :cond_5

    .line 351
    const/4 v0, 0x0

    sput-object v0, Lo/eam;->d:Landroid/content/Context;

    .line 353
    :cond_5
    throw v19

    .line 354
    :cond_6
    :goto_3
    return-void
.end method

.method private static a(Ljava/io/InputStreamReader;)V
    .locals 5

    .line 384
    if-eqz p0, :cond_0

    .line 385
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStreamReader;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 386
    const/4 p0, 0x0

    .line 390
    :cond_0
    goto :goto_0

    .line 388
    :catch_0
    move-exception v4

    .line 389
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doPost======="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    :goto_0
    return-void
.end method

.method private static a(Ljava/io/OutputStreamWriter;)V
    .locals 5

    .line 406
    if-eqz p0, :cond_0

    .line 407
    :try_start_0
    invoke-virtual {p0}, Ljava/io/OutputStreamWriter;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 408
    const/4 p0, 0x0

    .line 412
    :cond_0
    goto :goto_0

    .line 410
    :catch_0
    move-exception v4

    .line 411
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doPost======="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    :goto_0
    return-void
.end method

.method private static a(Ljava/io/PrintWriter;)V
    .locals 1

    .line 416
    if-eqz p0, :cond_0

    .line 417
    invoke-virtual {p0}, Ljava/io/PrintWriter;->close()V

    .line 418
    const/4 p0, 0x0

    .line 420
    :cond_0
    return-void
.end method

.method static synthetic b()Landroid/content/Context;
    .locals 1

    .line 42
    sget-object v0, Lo/eam;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo/eaf;)V
    .locals 0

    .line 42
    invoke-static {p0, p1, p2, p3}, Lo/eam;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo/eaf;)V

    return-void
.end method

.method private static c(Lo/eaf;I)V
    .locals 0

    .line 141
    if-eqz p0, :cond_0

    .line 142
    invoke-interface {p0, p1}, Lo/eaf;->onFailed(I)V

    .line 144
    :cond_0
    return-void
.end method

.method public static d(Ljavax/net/ssl/HttpsURLConnection;)V
    .locals 7

    .line 115
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v4

    .line 116
    const/4 v5, 0x0

    .line 118
    :try_start_0
    invoke-static {v4}, Lo/ecv;->e(Landroid/content/Context;)Lo/ecv;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v0

    move-object v5, v0

    .line 129
    goto/16 :goto_0

    .line 119
    :catch_0
    move-exception v6

    .line 120
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    goto/16 :goto_0

    .line 121
    :catch_1
    move-exception v6

    .line 122
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NoSuchAlgorithmException e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    goto :goto_0

    .line 123
    :catch_2
    move-exception v6

    .line 124
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KeyStoreException e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/security/KeyStoreException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    goto :goto_0

    .line 125
    :catch_3
    move-exception v6

    .line 126
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KeyManagementException e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/security/KeyManagementException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    goto :goto_0

    .line 127
    :catch_4
    move-exception v6

    .line 128
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    :goto_0
    if-eqz v5, :cond_0

    .line 133
    invoke-virtual {p0, v5}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 135
    :cond_0
    sget-object v6, Lorg/apache/http/conn/ssl/SSLSocketFactory;->BROWSER_COMPATIBLE_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    .line 137
    invoke-virtual {p0, v6}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 138
    return-void
.end method

.method private static d(Ljava/lang/String;)Z
    .locals 1

    .line 376
    if-eqz p0, :cond_0

    const-string v0, ""

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 377
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 379
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo/eaf;)V
    .locals 4

    .line 69
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NoCloudVersion no doPostReq"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    return-void

    .line 73
    :cond_0
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 74
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "storedemo no message center"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    const/4 v0, -0x1

    invoke-static {p3, v0}, Lo/eam;->c(Lo/eaf;I)V

    .line 76
    return-void

    .line 78
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 79
    :cond_2
    const-string v0, "UIDV_MessageHttpUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "params is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    const/4 v0, -0x1

    invoke-static {p3, v0}, Lo/eam;->c(Lo/eaf;I)V

    .line 81
    return-void

    .line 83
    :cond_3
    sput-object p0, Lo/eam;->d:Landroid/content/Context;

    .line 84
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lo/eam$2;

    invoke-direct {v1, p1, p2, p3}, Lo/eam$2;-><init>(Ljava/lang/String;Ljava/lang/String;Lo/eaf;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 91
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 92
    return-void
.end method

.method private static e(Ljava/net/HttpURLConnection;)V
    .locals 1

    .line 423
    if-eqz p0, :cond_0

    .line 424
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 425
    const/4 p0, 0x0

    .line 427
    :cond_0
    return-void
.end method

.method private static e(Lo/eaf;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 146
    if-eqz p0, :cond_0

    .line 147
    invoke-interface {p0, p1, p2}, Lo/eaf;->onSucceed(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    :cond_0
    return-void
.end method
