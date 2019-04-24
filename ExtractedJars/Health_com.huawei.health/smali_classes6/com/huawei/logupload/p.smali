.class public Lcom/huawei/logupload/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "LogUpload Service"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    return-void
.end method

.method private a(Lcom/huawei/logupload/LogUpload;)J
    .locals 11

    .line 462
    const-wide/16 v3, 0x0

    .line 463
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->w()Ljava/lang/String;

    move-result-object v5

    .line 464
    if-nez v5, :cond_0

    .line 465
    const-wide/16 v0, 0x0

    return-wide v0

    .line 467
    :cond_0
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "completeRange"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 469
    const-string v0, "]"

    invoke-virtual {v5, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 471
    const/4 v7, 0x0

    goto :goto_0

    .line 472
    :cond_1
    aget-object v0, v6, v7

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 473
    const/4 v0, 0x0

    aget-object v0, v8, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    .line 474
    const/4 v0, 0x1

    aget-object v0, v8, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    .line 475
    if-nez v9, :cond_2

    .line 476
    add-int/lit8 v0, v10, 0x1

    int-to-long v3, v0

    .line 471
    :cond_2
    add-int/lit8 v7, v7, 0x1

    :goto_0
    array-length v0, v6

    if-lt v7, v0, :cond_1

    .line 484
    return-wide v3
.end method

.method private a(Lcom/huawei/logupload/LogUpload;Ljava/util/TreeMap;)Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/logupload/LogUpload;Ljava/util/TreeMap<Ljava/lang/String;Ljava/lang/String;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 398
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/util/TreeMap;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 399
    :cond_0
    const-string v0, ""

    return-object v0

    .line 401
    :cond_1
    const/4 v2, 0x0

    .line 402
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->v()I

    move-result v3

    .line 403
    const-string v4, "PUT"

    .line 404
    const-string v5, ""

    .line 405
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 421
    invoke-virtual {p2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    goto :goto_0

    :cond_2
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 422
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 423
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 424
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 421
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 427
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->deleteCharAt(I)Ljava/lang/StringBuffer;

    .line 428
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    .line 430
    const/4 v0, 0x2

    if-ne v3, v0, :cond_3

    .line 431
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->q()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "?resume"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 432
    goto :goto_1

    .line 434
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->q()Ljava/lang/String;

    move-result-object v2

    .line 436
    :goto_1
    const/4 v7, 0x0

    .line 438
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 439
    const-string v1, "UTF-8"

    invoke-static {v2, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 440
    const-string v1, "UTF-8"

    invoke-static {v5, v1}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 438
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v7, v0

    .line 441
    goto :goto_2

    :catch_0
    move-exception v8

    .line 446
    :goto_2
    const/4 v8, 0x0

    .line 447
    invoke-virtual {p1}, Lcom/huawei/logupload/LogUpload;->o()Ljava/lang/String;

    move-result-object v9

    .line 448
    if-nez v9, :cond_4

    .line 449
    const/4 v0, 0x0

    return-object v0

    .line 451
    :cond_4
    :try_start_1
    invoke-static {v7, v9}, Lcom/huawei/logupload/c/e;->a(Ljava/lang/String;Ljava/lang/String;)[B
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v8, v0

    .line 452
    goto :goto_3

    :catch_1
    move-exception v10

    .line 454
    :goto_3
    const/4 v10, 0x0

    .line 455
    if-eqz v8, :cond_5

    .line 456
    const/4 v0, 0x2

    invoke-static {v8, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v10

    .line 458
    :cond_5
    return-object v10
.end method

.method public static a(Ljava/lang/String;Lcom/huawei/logupload/LogUpload;)V
    .locals 10

    .line 488
    move-object v3, p1

    .line 489
    const/4 v4, 0x0

    .line 490
    const/4 v5, -0x1

    .line 491
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "rsp = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 493
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 495
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 497
    const-string v0, "LogUpload Service"

    const-string v1, "Input param invalid."

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 499
    :cond_0
    return-void

    .line 502
    :cond_1
    const/4 v6, 0x0

    .line 505
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 506
    goto :goto_0

    .line 507
    :catch_0
    move-exception v7

    .line 509
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 511
    const-string v0, "LogUpload Service"

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 513
    :cond_2
    return-void

    .line 518
    :goto_0
    const-string v0, "upload_status"

    :try_start_1
    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v5

    .line 519
    goto :goto_1

    .line 520
    :catch_1
    move-exception v7

    .line 522
    const/4 v0, 0x4

    invoke-static {v0}, Lcom/huawei/logupload/c/g;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 524
    const-string v0, "LogUpload Service"

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 526
    :cond_3
    return-void

    .line 529
    :goto_1
    const/4 v0, 0x2

    if-ne v5, v0, :cond_4

    .line 530
    const-string v0, "LogUpload Service"

    const-string v1, "\u65ad\u70b9\u6587\u4ef6\u4e0d\u5b58\u5728\uff0c\u9700\u8981\u91cd\u65b0\u4e0a\u4f20"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 531
    goto/16 :goto_3

    .line 532
    :cond_4
    const/4 v0, 0x1

    if-ne v5, v0, :cond_6

    .line 534
    const-string v0, "completed_range"

    :try_start_2
    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    .line 536
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 538
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "rangeArray.length()"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 539
    const/4 v9, 0x0

    goto :goto_2

    .line 540
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    .line 541
    invoke-virtual {v7, v9}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 542
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "rangeArray :"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 539
    add-int/lit8 v9, v9, 0x1

    :goto_2
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lt v9, v0, :cond_5

    .line 544
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v0

    move-object v4, v0

    .line 545
    goto :goto_3

    :catch_2
    move-exception v7

    .line 546
    const-string v0, "LogUpload Service"

    const-string v1, "JSONException"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 550
    :cond_6
    :goto_3
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "contentRanger"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 564
    invoke-virtual {v3, v4}, Lcom/huawei/logupload/LogUpload;->o(Ljava/lang/String;)V

    .line 566
    new-instance v7, Lcom/huawei/logupload/a/c;

    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    .line 567
    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    .line 566
    invoke-direct {v7, v0}, Lcom/huawei/logupload/a/c;-><init>(Landroid/content/Context;)V

    .line 568
    sget-object v8, Lcom/huawei/logupload/c/c;->D:Ljava/lang/Object;

    monitor-enter v8

    .line 570
    const/4 v0, 0x0

    :try_start_3
    invoke-static {v7, v3, v0}, Lcom/huawei/logupload/a/a;->a(Lcom/huawei/logupload/a/c;Lcom/huawei/logupload/LogUpload;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 568
    monitor-exit v8

    goto :goto_4

    :catchall_0
    move-exception v0

    monitor-exit v8

    throw v0

    .line 572
    :goto_4
    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;Lcom/huawei/logupload/LogUpload;)I
    .locals 39

    .line 47
    new-instance v5, Ljava/util/TreeMap;

    invoke-direct {v5}, Ljava/util/TreeMap;-><init>()V

    .line 48
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->t()Ljava/lang/String;

    move-result-object v6

    .line 49
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->s()Ljava/lang/String;

    move-result-object v7

    .line 51
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    .line 52
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "nspFileSize"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    const/4 v9, 0x0

    .line 55
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/32 v2, 0xfa000

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 56
    const/4 v9, 0x0

    .line 57
    goto :goto_0

    .line 59
    :cond_0
    const/4 v9, 0x1

    .line 62
    :goto_0
    const-string v10, "http://"

    .line 63
    const-wide/32 v11, 0x3e8000

    .line 64
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->length()J

    move-result-wide v13

    .line 65
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->v()I

    move-result v15

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    .line 67
    const/4 v0, 0x2

    if-ne v15, v0, :cond_1

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "?resume"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    .line 74
    :cond_1
    const-string v0, "http.keepAlive"

    const-string v1, "false"

    invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    new-instance v0, Ljava/net/URL;

    move-object/from16 v1, v16

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    move-object/from16 v17, v0

    .line 76
    invoke-virtual/range {v17 .. v17}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Ljava/net/HttpURLConnection;

    .line 77
    if-nez v18, :cond_2

    .line 78
    const/4 v0, -0x1

    return v0

    .line 79
    :cond_2
    move-object/from16 v0, v18

    const/16 v1, 0x7530

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 80
    move-object/from16 v0, v18

    const/16 v1, 0x7530

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 82
    move-object/from16 v0, v18

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 83
    move-object/from16 v0, v18

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 84
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 86
    const-string v0, "PUT"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 87
    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    const-string v0, "Charset"

    const-string v1, "UTF-8"

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const-string v0, "Content-Type"

    const-string v1, "binary/octet-stream"

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    const-string v0, "Expect"

    const-string v1, "100-continue"

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    const-string v0, "User-Agent"

    const-string v1, "PHONE_SERVICE"

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 93
    const-string v0, "nsp-callback"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0, v6}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const-string v0, "nsp-callback-status"

    const-string v1, "200"

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    const-string v0, "nsp-callback"

    invoke-virtual {v5, v0, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    const-string v0, "nsp-callback-Status"

    const-string v1, "200"

    invoke-virtual {v5, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    :cond_3
    const-string v0, "nsp-ts"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0, v7}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    const-string v0, "nsp-ts"

    invoke-virtual {v5, v0, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "nspTs"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "type"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    const-wide/16 v19, 0x0

    .line 105
    const-wide/16 v21, 0x0

    .line 106
    if-nez v15, :cond_4

    cmp-long v0, v13, v11

    if-lez v0, :cond_4

    .line 107
    const-wide/32 v21, 0x3e7fff

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static/range {v19 .. v20}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-wide/from16 v1, v21

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    .line 109
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "nspContentRange"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v2, v23

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    const-string v0, "nsp-content-range"

    move-object/from16 v1, v18

    move-object/from16 v2, v23

    invoke-virtual {v1, v0, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string v0, "nsp-content-range"

    move-object/from16 v1, v23

    invoke-virtual {v5, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    goto/16 :goto_1

    .line 113
    :cond_4
    const/4 v0, 0x1

    if-ne v15, v0, :cond_6

    .line 114
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    sub-long v21, v0, v2

    .line 115
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "endPos"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-wide/from16 v2, v21

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/huawei/logupload/p;->a(Lcom/huawei/logupload/LogUpload;)J

    move-result-wide v19

    .line 117
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "startPos"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-wide/from16 v2, v19

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    sub-long v0, v21, v19

    const-wide/16 v2, 0x1

    add-long v13, v0, v2

    .line 119
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "transfLength"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    cmp-long v0, v13, v11

    if-gtz v0, :cond_5

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static/range {v19 .. v20}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-wide/from16 v1, v21

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    .line 122
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "nspContentRange"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v2, v23

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    const-string v0, "nsp-content-range"

    move-object/from16 v1, v18

    move-object/from16 v2, v23

    invoke-virtual {v1, v0, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    const-string v0, "nsp-content-range"

    move-object/from16 v1, v23

    invoke-virtual {v5, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    goto :goto_1

    .line 127
    :cond_5
    add-long v0, v19, v11

    const-wide/16 v2, 0x1

    sub-long v21, v0, v2

    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static/range {v19 .. v20}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-wide/from16 v1, v21

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v23

    .line 129
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "nspContentRange"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v2, v23

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    const-string v0, "nsp-content-range"

    move-object/from16 v1, v18

    move-object/from16 v2, v23

    invoke-virtual {v1, v0, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    const-string v0, "nsp-content-range"

    move-object/from16 v1, v23

    invoke-virtual {v5, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    :cond_6
    :goto_1
    invoke-static/range {p1 .. p1}, Lcom/huawei/logupload/c/h;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v23

    .line 138
    const-string v0, "nsp-file-md5"

    move-object/from16 v1, v18

    move-object/from16 v2, v23

    invoke-virtual {v1, v0, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    const-string v0, "nsp-file-md5"

    move-object/from16 v1, v23

    invoke-virtual {v5, v0, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "nspFileSize"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    const-string v0, "nsp-file-size"

    move-object/from16 v1, v18

    invoke-virtual {v1, v0, v8}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    const-string v0, "nsp-file-size"

    invoke-virtual {v5, v0, v8}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1, v5}, Lcom/huawei/logupload/p;->a(Lcom/huawei/logupload/LogUpload;Ljava/util/TreeMap;)Ljava/lang/String;

    move-result-object v24

    .line 147
    const-string v0, "nsp-sig"

    move-object/from16 v1, v18

    move-object/from16 v2, v24

    invoke-virtual {v1, v0, v2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    const/4 v0, 0x2

    if-eq v15, v0, :cond_f

    .line 151
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object/from16 v25, v0

    .line 152
    const-string v0, "LogUpload Service"

    const-string v1, "getOutputStream"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    const/16 v26, 0x0

    .line 154
    const/16 v27, 0x400

    .line 155
    move/from16 v0, v27

    new-array v0, v0, [B

    move-object/from16 v28, v0

    .line 156
    const/16 v29, -0x1

    .line 158
    const/16 v30, 0x0

    .line 159
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object/from16 v26, v0

    .line 160
    const/4 v0, 0x1

    if-ne v15, v0, :cond_8

    .line 161
    move-object/from16 v0, v26

    move-wide/from16 v1, v19

    invoke-virtual {v0, v1, v2}, Ljava/io/FileInputStream;->skip(J)J

    move-result-wide v31

    .line 162
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "skip"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-wide/from16 v2, v31

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 164
    goto :goto_2

    .line 165
    :cond_7
    move-object/from16 v0, v25

    move-object/from16 v1, v28

    const/4 v2, 0x0

    move/from16 v3, v29

    invoke-virtual {v0, v1, v2, v3}, Ljava/io/DataOutputStream;->write([BII)V

    .line 166
    add-int v30, v30, v29

    .line 167
    move/from16 v0, v30

    int-to-long v0, v0

    cmp-long v0, v0, v11

    if-ltz v0, :cond_8

    .line 168
    goto :goto_3

    .line 164
    :cond_8
    :goto_2
    move-object/from16 v0, v26

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    move/from16 v29, v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_7

    .line 170
    :goto_3
    const-string v0, "LogUpload Service"

    const-string v1, "ds.flush()"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    invoke-virtual/range {v25 .. v25}, Ljava/io/DataOutputStream;->flush()V

    .line 172
    const-string v0, "LogUpload Service"

    const-string v1, "ds.flush() end"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    goto/16 :goto_4

    .line 174
    :catch_0
    move-exception v30

    .line 177
    :try_start_1
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->H()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_9

    .line 213
    const-string v0, "LogUpload Service"

    const-string v1, "CommonUtils.closeDataOutputStream"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v26

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 216
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 178
    const/4 v0, -0x3

    return v0

    .line 180
    :cond_9
    if-eqz v9, :cond_a

    .line 182
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 213
    :cond_a
    const-string v0, "LogUpload Service"

    const-string v1, "CommonUtils.closeDataOutputStream"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v26

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 216
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 184
    const/4 v0, -0x1

    return v0

    .line 188
    :catch_1
    move-exception v30

    .line 189
    const-string v0, "LogUpload Service"

    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "type = 1 IOException"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v30 .. v30}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 190
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->H()I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_b

    .line 213
    const-string v0, "LogUpload Service"

    const-string v1, "CommonUtils.closeDataOutputStream"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v26

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 216
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 191
    const/4 v0, -0x3

    return v0

    .line 193
    :cond_b
    if-eqz v9, :cond_c

    .line 195
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 213
    :cond_c
    const-string v0, "LogUpload Service"

    const-string v1, "CommonUtils.closeDataOutputStream"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v26

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 216
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 197
    const/4 v0, -0x1

    return v0

    .line 200
    :catch_2
    move-exception v30

    .line 201
    const-string v0, "LogUpload Service"

    const-string v1, "type = 1 Exception"

    :try_start_5
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 202
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->H()I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_d

    .line 213
    const-string v0, "LogUpload Service"

    const-string v1, "CommonUtils.closeDataOutputStream"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v26

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 216
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 203
    const/4 v0, -0x3

    return v0

    .line 205
    :cond_d
    if-eqz v9, :cond_e

    .line 207
    :try_start_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 213
    :cond_e
    const-string v0, "LogUpload Service"

    const-string v1, "CommonUtils.closeDataOutputStream"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v26

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 216
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 209
    const/4 v0, -0x1

    return v0

    .line 212
    :catchall_0
    move-exception v33

    .line 213
    const-string v0, "LogUpload Service"

    const-string v1, "CommonUtils.closeDataOutputStream"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v26

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 216
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 217
    throw v33

    .line 213
    :goto_4
    const-string v0, "LogUpload Service"

    const-string v1, "CommonUtils.closeDataOutputStream"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v26

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 216
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 220
    :cond_f
    const/16 v25, 0x0

    .line 221
    const/16 v26, -0x1

    .line 224
    const-wide/16 v27, 0x0

    .line 225
    const-wide/16 v29, 0x0

    .line 226
    const/16 v31, 0x0

    .line 227
    const/16 v32, 0x0

    .line 228
    const/16 v33, 0x0

    .line 230
    const-string v0, "LogUpload Service"

    const-string v1, " statusLine before"

    :try_start_7
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 231
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move-wide/from16 v27, v0

    .line 232
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->getHeaderField(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v31, v0

    .line 233
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->getHeaderFieldKey(I)Ljava/lang/String;

    move-result-object v32

    .line 234
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "statusLine"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v2, v31

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 235
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "statusLinekey"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v2, v32

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 236
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->getHeaderField(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v33, v0

    .line 237
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "statusLine2"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v2, v33

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 238
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move-wide/from16 v29, v0

    .line 239
    invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    move/from16 v26, v0

    .line 240
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u8fd4\u56de\u7801"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v2, v26

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 242
    invoke-virtual/range {v18 .. v18}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object/from16 v25, v0

    .line 243
    new-instance v34, Ljava/lang/StringBuffer;

    invoke-direct/range {v34 .. v34}, Ljava/lang/StringBuffer;-><init>()V

    .line 244
    const/16 v0, 0x400

    new-array v0, v0, [B

    move-object/from16 v35, v0

    .line 245
    const/16 v36, 0x0

    .line 247
    :goto_5
    move-object/from16 v0, v25

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v36

    .line 248
    const/4 v0, -0x1

    move/from16 v1, v36

    if-ne v0, v1, :cond_10

    .line 250
    const-string v0, "LogUpload Service"

    const-string v1, "\u8bfb\u53d6\u5b8c\u6bd5"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 251
    goto :goto_6

    .line 254
    :cond_10
    new-instance v0, Ljava/lang/String;

    const-string v1, "utf-8"

    move-object/from16 v2, v35

    const/4 v3, 0x0

    move/from16 v4, v36

    invoke-direct {v0, v2, v3, v4, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    move-object/from16 v1, v34

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 246
    goto :goto_5

    .line 258
    :goto_6
    const/16 v37, 0x0

    .line 259
    invoke-virtual/range {v34 .. v34}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v37

    .line 261
    move/from16 v0, v26

    const/16 v1, 0xc9

    if-ne v0, v1, :cond_1c

    .line 263
    const-string v0, "LogUpload Service"

    const-string v1, "parserContentRange"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 264
    move-object/from16 v0, v37

    move-object/from16 v1, p2

    invoke-static {v0, v1}, Lcom/huawei/logupload/p;->a(Ljava/lang/String;Lcom/huawei/logupload/LogUpload;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 266
    goto/16 :goto_8

    .line 267
    :catch_3
    move-exception v34

    .line 272
    const-string v0, "LogUpload Service"

    :try_start_8
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "uploading \u83b7\u53d6\u670d\u52a1\u5668\u54cd\u5e94  IOException"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v34 .. v34}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 273
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "code = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v2, v26

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "mLogUploadInfo.getUserType()"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 274
    invoke-virtual/range {v34 .. v34}, Ljava/io/IOException;->printStackTrace()V

    .line 281
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "afterTime - beforeTime:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-long v2, v29, v27

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 282
    sub-long v0, v29, v27

    const-wide/32 v2, 0x927c0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_12

    .line 283
    if-nez v31, :cond_12

    if-nez v33, :cond_12

    .line 285
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 286
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->a(I)V

    .line 288
    invoke-static {}, Lcom/huawei/logupload/c/i;->e()V

    .line 289
    invoke-static {}, Lcom/huawei/logupload/c/c;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_11

    .line 290
    new-instance v35, Landroid/content/Intent;

    invoke-direct/range {v35 .. v35}, Landroid/content/Intent;-><init>()V

    .line 291
    const-string v0, "com.example.logupload.progress"

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 292
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->E()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v35

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 295
    const-string v0, "exception"

    const-string v1, "2"

    move-object/from16 v2, v35

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 296
    const-string v0, "mLogUploadInfo"

    move-object/from16 v1, v35

    move-object/from16 v2, p2

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 298
    const-string v0, "exception"

    const-string v1, "2"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 299
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Application;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 300
    goto :goto_7

    .line 303
    :cond_11
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.huawei.phoneservice.AUTOUPLOAD_DELETE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    move-object/from16 v35, v0

    .line 304
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    const-string v1, "com.huawei.feedback.component.AutoUploadService"

    move-object/from16 v2, v35

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 306
    const-string v0, "isuploadsuccess"

    move-object/from16 v1, v35

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 307
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Landroid/app/Application;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 310
    :goto_7
    const-wide/16 v0, 0xbb8

    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 311
    const-string v0, "LogUpload Service"

    const-string v1, "start to kill process!"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 313
    invoke-static {}, Lcom/huawei/logupload/c/c;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 314
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->a(I)V

    .line 315
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->c(I)V

    .line 316
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/logupload/c/c;->b(I)V

    .line 317
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v2

    const-class v3, Lcom/huawei/logupload/LogUploadReceive;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/app/Application;->stopService(Landroid/content/Intent;)Z

    .line 318
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v2

    const-class v3, Lcom/huawei/logupload/LogUploadService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/app/Application;->stopService(Landroid/content/Intent;)Z

    .line 322
    :cond_12
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->H()I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_13

    .line 323
    move/from16 v0, v26

    const/16 v1, 0x191

    if-eq v0, v1, :cond_15

    .line 385
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 324
    const/4 v0, -0x3

    return v0

    .line 327
    :cond_13
    move/from16 v0, v26

    const/16 v1, 0x191

    if-eq v0, v1, :cond_15

    .line 328
    if-eqz v9, :cond_14

    .line 330
    :try_start_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 385
    :cond_14
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 332
    const/4 v0, -0x1

    return v0

    .line 385
    :cond_15
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    goto/16 :goto_9

    .line 335
    :catch_4
    move-exception v34

    .line 336
    const-string v0, "LogUpload Service"

    const-string v1, "Uploading RuntimeException"

    :try_start_a
    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 337
    invoke-virtual/range {v34 .. v34}, Ljava/lang/RuntimeException;->printStackTrace()V

    .line 338
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    if-eqz v0, :cond_16

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->H()I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_16

    .line 339
    move/from16 v0, v26

    const/16 v1, 0x191

    if-eq v0, v1, :cond_18

    .line 385
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 340
    const/4 v0, -0x3

    return v0

    .line 343
    :cond_16
    move/from16 v0, v26

    const/16 v1, 0x191

    if-eq v0, v1, :cond_18

    .line 344
    if-eqz v9, :cond_17

    .line 346
    :try_start_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 385
    :cond_17
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 348
    const/4 v0, -0x1

    return v0

    .line 385
    :cond_18
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    goto :goto_9

    .line 351
    :catch_5
    move-exception v34

    .line 356
    :try_start_c
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Exception;->printStackTrace()V

    .line 357
    const-string v0, "LogUpload Service"

    const-string v1, "Uploading Exception"

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 369
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->H()I

    move-result v0

    if-eqz v0, :cond_19

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->H()I
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_19

    .line 370
    move/from16 v0, v26

    const/16 v1, 0x191

    if-eq v0, v1, :cond_1b

    .line 385
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 371
    const/4 v0, -0x3

    return v0

    .line 374
    :cond_19
    move/from16 v0, v26

    const/16 v1, 0x191

    if-eq v0, v1, :cond_1b

    .line 375
    if-eqz v9, :cond_1a

    .line 377
    :try_start_d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/logupload/LogUpload;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/logupload/c/i;->d(Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 385
    :cond_1a
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 379
    const/4 v0, -0x1

    return v0

    .line 385
    :cond_1b
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    goto :goto_9

    .line 384
    :catchall_1
    move-exception v38

    .line 385
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 386
    throw v38

    .line 385
    :cond_1c
    :goto_8
    const-string v0, "LogUpload Service"

    move-object/from16 v1, v25

    invoke-static {v1, v0}, Lcom/huawei/logupload/c/i;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 387
    :goto_9
    return v26
.end method
