.class public Lcom/huawei/feedback/logic/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String; = "---------------------------40612316912668"

.field private static final b:Ljava/lang/String; = "UploadFile"

.field private static final c:Ljava/lang/String; = "--"

.field private static final d:Ljava/lang/String; = "\r\n"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/io/DataOutputStream;)I
    .locals 3

    .line 385
    const-string v0, "-----------------------------40612316912668--\r\n"

    const-string v1, "utf-8"

    :try_start_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/DataOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 388
    goto :goto_0

    .line 386
    :catch_0
    move-exception v2

    .line 387
    const/16 v0, 0x3f2

    return v0

    .line 390
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I
    .locals 10

    .line 48
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    const/4 v0, 0x0

    return v0

    .line 53
    :cond_0
    invoke-static {p0}, Lcom/huawei/feedback/logic/s;->a(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v2

    .line 54
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    .line 55
    const/4 v0, 0x0

    return v0

    .line 59
    :cond_1
    const/16 v3, 0x400

    .line 60
    new-array v4, v3, [B

    .line 61
    const/4 v5, -0x1

    .line 63
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    const-string v0, "-----------------------------40612316912668\r\n"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    const-string v0, "Content-Disposition: form-data; name=\""

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    const-string v0, "screenshot"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    const-string v0, "\"; filename=\""

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    const-string v0, "\""

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    const-string v0, "\r\n"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    const-string v0, "Content-Type: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 75
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 77
    :cond_2
    const-string v0, "image/jpeg"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    :goto_0
    const-string v0, "\r\n"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    const-string v0, "\r\n"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    :try_start_0
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "utf-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 87
    :goto_1
    invoke-virtual {v2, v4}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 88
    const/4 v0, 0x0

    invoke-virtual {p2, v4, v0, v5}, Ljava/io/DataOutputStream;->write([BII)V

    goto :goto_1

    .line 91
    :cond_3
    const-string v0, "\r\n"

    const-string v1, "utf-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/DataOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    const-string v0, "UploadFile"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/FileInputStream;Ljava/lang/String;)V

    .line 96
    goto :goto_2

    .line 92
    :catch_0
    move-exception v7

    .line 93
    const/16 v8, 0x3f2

    .line 95
    const-string v0, "UploadFile"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/FileInputStream;Ljava/lang/String;)V

    return v8

    :catchall_0
    move-exception v9

    const-string v0, "UploadFile"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/FileInputStream;Ljava/lang/String;)V

    throw v9

    .line 98
    :goto_2
    const/4 v0, 0x0

    return v0
.end method

.method public static a(ZLjava/io/DataOutputStream;Ljava/lang/String;)I
    .locals 11

    .line 326
    move-object v2, p2

    .line 327
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 328
    const/4 v0, 0x0

    return v0

    .line 331
    :cond_0
    move-object v3, v2

    .line 332
    invoke-static {v3}, Lcom/huawei/feedback/logic/s;->a(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v4

    .line 334
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 335
    const/4 v0, 0x0

    return v0

    .line 338
    :cond_1
    :try_start_0
    invoke-virtual {v4}, Ljava/io/FileInputStream;->available()I

    move-result v0

    if-gtz v0, :cond_2

    .line 339
    const-string v0, "UploadFile"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/FileInputStream;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 340
    const/4 v0, 0x0

    return v0

    .line 346
    :cond_2
    goto :goto_0

    .line 342
    :catch_0
    move-exception v5

    .line 343
    const-string v0, "UploadFile"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/FileInputStream;Ljava/lang/String;)V

    .line 345
    const/4 v0, 0x0

    return v0

    .line 348
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 349
    const-string v0, "-----------------------------40612316912668\r\n"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    if-eqz p0, :cond_3

    .line 351
    const-string v0, "Content-Disposition: form-data; name=\""

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    const-string v0, "problemRecord"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    const-string v0, "\"; filename=\""

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    const-string v0, "\""

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    const-string v0, "\r\n"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    :cond_3
    const-string v0, "Content-Type: application/zip"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    const-string v0, "\r\n"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    const-string v0, "\r\n"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 363
    const/16 v0, 0x400

    new-array v6, v0, [B

    .line 364
    const/4 v7, -0x1

    .line 367
    :try_start_1
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "utf-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 369
    :goto_1
    invoke-virtual {v4, v6}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    move v7, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    .line 370
    const/4 v0, 0x0

    invoke-virtual {p1, v6, v0, v7}, Ljava/io/DataOutputStream;->write([BII)V

    goto :goto_1

    .line 372
    :cond_4
    const-string v0, "\r\n"

    const-string v1, "utf-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->write([B)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 376
    const-string v0, "UploadFile"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/FileInputStream;Ljava/lang/String;)V

    .line 377
    goto :goto_2

    .line 373
    :catch_1
    move-exception v8

    .line 374
    const/16 v9, 0x3f2

    .line 376
    const-string v0, "UploadFile"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/FileInputStream;Ljava/lang/String;)V

    return v9

    :catchall_0
    move-exception v10

    const-string v0, "UploadFile"

    invoke-static {v4, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/FileInputStream;Ljava/lang/String;)V

    throw v10

    .line 378
    :goto_2
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Ljava/lang/String;)Ljava/io/FileInputStream;
    .locals 4

    .line 109
    const/4 v2, 0x0

    .line 112
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v0

    .line 116
    goto :goto_0

    .line 113
    :catch_0
    move-exception v3

    .line 115
    const-string v0, "UploadFile"

    const-string v1, "FileNotFoundException ..."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    :goto_0
    return-object v2
.end method

.method public static a([Ljava/lang/String;)Ljava/lang/String;
    .locals 23

    .line 403
    if-nez p0, :cond_0

    .line 404
    const-string v0, ""

    return-object v0

    .line 406
    :cond_0
    const/4 v4, 0x0

    .line 408
    invoke-static {}, Lcom/huawei/feedback/e;->a()Ljava/lang/String;

    move-result-object v5

    .line 409
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 411
    const-string v0, "UploadFile"

    const-string v1, "storagePath null!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    const-string v0, ""

    return-object v0

    .line 415
    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 416
    const-string v0, "/phoneservice/image"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    new-instance v7, Ljava/io/File;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 419
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_2

    .line 421
    const-string v0, ""

    return-object v0

    .line 424
    :cond_2
    const/16 v0, 0x2f

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/feedback/e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".zip"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 426
    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 428
    move-object/from16 v0, p0

    array-length v10, v0

    .line 429
    if-lez v10, :cond_3

    .line 430
    new-array v4, v10, [Ljava/io/File;

    .line 431
    const/4 v11, 0x0

    :goto_0
    if-ge v11, v10, :cond_3

    .line 432
    const-string v0, "UploadFile"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fileName"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, p0, v11

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 433
    new-instance v0, Ljava/io/File;

    aget-object v1, p0, v11

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    aput-object v0, v4, v11

    .line 431
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 437
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    array-length v0, v4

    const/4 v1, 0x4

    if-le v0, v1, :cond_5

    .line 438
    :cond_4
    const-string v0, ""

    return-object v0

    .line 440
    :cond_5
    const/16 v0, 0x400

    new-array v11, v0, [B

    .line 443
    const/4 v12, 0x0

    .line 445
    :try_start_0
    new-instance v0, Ljava/util/zip/ZipOutputStream;

    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v12, v0

    .line 447
    const/4 v13, 0x0

    :goto_1
    array-length v0, v4

    if-ge v13, v0, :cond_e

    .line 448
    const/4 v14, 0x0

    .line 451
    aget-object v0, v4, v13

    if-eqz v0, :cond_d

    aget-object v0, v4, v13

    .line 452
    invoke-virtual {v0}, Ljava/io/File;->length()J
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_9
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-wide v0

    const-wide/32 v2, 0x500000

    cmp-long v0, v0, v2

    if-gtz v0, :cond_d

    .line 454
    const-string v0, "UploadFile"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "srcThirdFile["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    aget-object v2, v4, v13

    invoke-virtual {v2}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 455
    new-instance v0, Ljava/io/FileInputStream;

    aget-object v1, v4, v13

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v14, v0

    .line 456
    new-instance v0, Ljava/util/zip/ZipEntry;

    aget-object v1, v4, v13

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 457
    :goto_2
    invoke-virtual {v14, v11}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    move v15, v0

    if-lez v0, :cond_6

    .line 458
    const/4 v0, 0x0

    invoke-virtual {v12, v11, v0, v15}, Ljava/util/zip/ZipOutputStream;->write([BII)V

    goto :goto_2

    .line 460
    :cond_6
    invoke-virtual {v12}, Ljava/util/zip/ZipOutputStream;->closeEntry()V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 470
    if-eqz v14, :cond_7

    .line 471
    :try_start_2
    invoke-virtual {v14}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_9
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 476
    :cond_7
    goto/16 :goto_8

    .line 474
    :catch_0
    move-exception v16

    .line 475
    const-string v0, "UploadFile"

    const-string v1, "IOException two..."

    :try_start_3
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_9
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 477
    goto/16 :goto_8

    .line 462
    :catch_1
    move-exception v16

    .line 463
    const-string v0, "UploadFile"

    const-string v1, "FileNotFoundException ..."

    :try_start_4
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 464
    const-string v17, ""

    .line 470
    if-eqz v14, :cond_8

    .line 471
    :try_start_5
    invoke-virtual {v14}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_9
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 476
    :cond_8
    goto :goto_3

    .line 474
    :catch_2
    move-exception v18

    .line 475
    const-string v0, "UploadFile"

    const-string v1, "IOException two..."

    :try_start_6
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_9
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 484
    :goto_3
    if-eqz v12, :cond_9

    .line 485
    :try_start_7
    invoke-virtual {v12}, Ljava/util/zip/ZipOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    .line 490
    :cond_9
    goto :goto_4

    .line 488
    :catch_3
    move-exception v18

    .line 489
    const-string v0, "UploadFile"

    const-string v1, "IOException three..."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 490
    :goto_4
    return-object v17

    .line 465
    :catch_4
    move-exception v16

    .line 466
    const-string v0, "UploadFile"

    :try_start_8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "IOException one..."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual/range {v16 .. v16}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 467
    const-string v17, ""

    .line 470
    if-eqz v14, :cond_a

    .line 471
    :try_start_9
    invoke-virtual {v14}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5
    .catch Ljava/io/FileNotFoundException; {:try_start_9 .. :try_end_9} :catch_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 476
    :cond_a
    goto :goto_5

    .line 474
    :catch_5
    move-exception v18

    .line 475
    const-string v0, "UploadFile"

    const-string v1, "IOException two..."

    :try_start_a
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/io/FileNotFoundException; {:try_start_a .. :try_end_a} :catch_9
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 484
    :goto_5
    if-eqz v12, :cond_b

    .line 485
    :try_start_b
    invoke-virtual {v12}, Ljava/util/zip/ZipOutputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_6

    .line 490
    :cond_b
    goto :goto_6

    .line 488
    :catch_6
    move-exception v18

    .line 489
    const-string v0, "UploadFile"

    const-string v1, "IOException three..."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 490
    :goto_6
    return-object v17

    .line 469
    :catchall_0
    move-exception v19

    .line 470
    if-eqz v14, :cond_c

    .line 471
    :try_start_c
    invoke-virtual {v14}, Ljava/io/FileInputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_7
    .catch Ljava/io/FileNotFoundException; {:try_start_c .. :try_end_c} :catch_9
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 476
    :cond_c
    goto :goto_7

    .line 474
    :catch_7
    move-exception v20

    .line 475
    const-string v0, "UploadFile"

    const-string v1, "IOException two..."

    :try_start_d
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 476
    :goto_7
    throw v19
    :try_end_d
    .catch Ljava/io/FileNotFoundException; {:try_start_d .. :try_end_d} :catch_9
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    .line 447
    :cond_d
    :goto_8
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_1

    .line 484
    :cond_e
    if-eqz v12, :cond_f

    .line 485
    :try_start_e
    invoke-virtual {v12}, Ljava/util/zip/ZipOutputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_8

    .line 490
    :cond_f
    goto :goto_b

    .line 488
    :catch_8
    move-exception v13

    .line 489
    const-string v0, "UploadFile"

    const-string v1, "IOException three..."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 491
    goto :goto_b

    .line 480
    :catch_9
    move-exception v13

    .line 481
    const-string v14, ""

    .line 484
    if-eqz v12, :cond_10

    .line 485
    :try_start_f
    invoke-virtual {v12}, Ljava/util/zip/ZipOutputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_a

    .line 490
    :cond_10
    goto :goto_9

    .line 488
    :catch_a
    move-exception v15

    .line 489
    const-string v0, "UploadFile"

    const-string v1, "IOException three..."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 490
    :goto_9
    return-object v14

    .line 483
    :catchall_1
    move-exception v21

    .line 484
    if-eqz v12, :cond_11

    .line 485
    :try_start_10
    invoke-virtual {v12}, Ljava/util/zip/ZipOutputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_b

    .line 490
    :cond_11
    goto :goto_a

    .line 488
    :catch_b
    move-exception v22

    .line 489
    const-string v0, "UploadFile"

    const-string v1, "IOException three..."

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 490
    :goto_a
    throw v21

    .line 492
    :goto_b
    return-object v8
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I
    .locals 4

    .line 121
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 122
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 125
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    const-string v0, "-----------------------------40612316912668\r\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    const-string v0, "Content-Disposition: form-data; name=\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    const-string v0, "\""

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    const-string v0, "\r\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    const-string v0, "\r\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    const-string v0, "\r\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "utf-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/DataOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    goto :goto_0

    .line 139
    :catch_0
    move-exception v3

    .line 140
    const/16 v0, 0x3f2

    return v0

    .line 143
    :goto_0
    const/4 v0, 0x0

    return v0
.end method
