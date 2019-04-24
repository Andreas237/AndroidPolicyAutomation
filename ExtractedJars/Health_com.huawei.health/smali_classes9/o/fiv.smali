.class public Lo/fiv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lo/fiv;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 109
    const/4 v0, 0x0

    sput-object v0, Lo/fiv;->d:Lo/fiv;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/fiv;->a:Landroid/content/Context;

    return-void
.end method

.method public static a(II)I
    .locals 5

    .line 447
    new-instance v3, Ljava/security/SecureRandom;

    invoke-direct {v3}, Ljava/security/SecureRandom;-><init>()V

    .line 448
    invoke-virtual {v3, p1}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v0

    sub-int v1, p1, p0

    add-int/lit8 v1, v1, 0x1

    rem-int/2addr v0, v1

    add-int v4, v0, p0

    .line 449
    return v4
.end method

.method private a(JFF)Lcom/huawei/hihealth/HiHealthData;
    .locals 10

    .line 326
    new-instance v8, Lcom/huawei/hihealth/HiHealthData;

    const/16 v0, 0x2716

    invoke-direct {v8, v0}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    .line 328
    invoke-static {}, Lo/fiv;->g()V

    .line 329
    const-string v0, "C8:A2:2E:5A:45:BD"

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 330
    const-string v0, "0"

    invoke-virtual {v8, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 331
    invoke-virtual {v8, p1, p2}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 332
    invoke-virtual {v8, p1, p2}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 334
    const-string v0, "weight_age"

    const-wide/high16 v1, 0x403d000000000000L    # 29.0

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 335
    const-string v0, "weight_height"

    const-wide/high16 v1, 0x4066000000000000L    # 176.0

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 336
    const-string v0, "weight_gender"

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 338
    const-string v0, "weight"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 339
    const-string v0, "weight_bodyfat"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 341
    new-instance v0, Lo/ahl;

    move v2, p3

    move v5, p4

    const/high16 v1, 0x43300000    # 176.0f

    const/4 v3, 0x1

    const/16 v4, 0x1d

    const-wide/16 v6, 0x0

    invoke-direct/range {v0 .. v7}, Lo/ahl;-><init>(FFBIFD)V

    move-object v9, v0

    .line 343
    const-string v0, "weight_bmi"

    invoke-virtual {v9}, Lo/ahl;->h()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 344
    const-string v0, "weight_bmr"

    invoke-virtual {v9}, Lo/ahl;->d()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 345
    const-string v0, "weight_body_age"

    invoke-virtual {v9}, Lo/ahl;->f()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 346
    const-string v0, "weight_body_score"

    invoke-virtual {v9}, Lo/ahl;->i()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 347
    const-string v0, "weight_bone_mineral"

    invoke-virtual {v9}, Lo/ahl;->k()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 348
    const-string v0, "weight_muscles"

    invoke-virtual {v9}, Lo/ahl;->c()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 349
    const-string v0, "weight_protein"

    invoke-virtual {v9}, Lo/ahl;->g()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 350
    const-string v0, "weight_waterrate"

    invoke-virtual {v9}, Lo/ahl;->b()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 351
    const-string v0, "weight_fatlevel"

    invoke-virtual {v9}, Lo/ahl;->a()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 352
    const-string v0, "weight_impedance"

    invoke-virtual {v9}, Lo/ahl;->e()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 353
    const-string v0, "weight_skeletalmusclelmass"

    invoke-virtual {v9}, Lo/ahl;->m()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v8, v0, v1, v2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    .line 356
    return-object v8
.end method

.method public static a()Lo/fiv;
    .locals 2

    .line 112
    sget-object v0, Lo/fiv;->d:Lo/fiv;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 113
    new-instance v0, Lo/fiv;

    invoke-direct {v0}, Lo/fiv;-><init>()V

    sput-object v0, Lo/fiv;->d:Lo/fiv;

    .line 115
    :cond_0
    sget-object v0, Lo/fiv;->d:Lo/fiv;

    return-object v0
.end method

.method private b(II)Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 278
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 279
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 280
    invoke-static {v5, v6}, Lo/dbu;->b(J)J

    move-result-wide v7

    .line 281
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getInsertWeightHihealthDatas startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, v7, v8}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    move/from16 v9, p1

    :goto_0
    move/from16 v0, p2

    if-ge v9, v0, :cond_1

    .line 283
    const/4 v10, 0x0

    :goto_1
    const/4 v0, 0x7

    if-ge v10, v0, :cond_0

    .line 287
    mul-int/lit8 v0, v9, 0x7

    add-int/2addr v0, v10

    int-to-long v0, v0

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    sub-long v11, v7, v0

    .line 289
    const-wide/32 v0, 0x1b77400

    add-long v13, v11, v0

    .line 290
    rsub-int/lit8 v0, v9, 0x45

    add-int/lit8 v15, v0, -0x1

    .line 291
    rsub-int/lit8 v0, v9, 0x47

    add-int/lit8 v16, v0, -0x1

    .line 292
    move/from16 v0, v16

    invoke-static {v15, v0}, Lo/fiv;->a(II)I

    move-result v0

    int-to-float v1, v0

    move/from16 v17, v1

    .line 293
    const/4 v0, 0x5

    const/16 v1, 0x1e

    invoke-static {v0, v1}, Lo/fiv;->a(II)I

    move-result v0

    int-to-float v1, v0

    move/from16 v18, v1

    .line 294
    const v0, 0x3f7ae148    # 0.98f

    mul-float v0, v0, v17

    const v1, 0x3f7ae148    # 0.98f

    mul-float v1, v1, v18

    move-object/from16 v2, p0

    invoke-direct {v2, v13, v14, v0, v1}, Lo/fiv;->a(JFF)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v19

    .line 295
    move-object/from16 v0, v19

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 297
    const-wide/32 v0, 0x2932e00

    add-long v13, v11, v0

    .line 298
    move-object/from16 v0, p0

    move/from16 v1, v17

    move/from16 v2, v18

    invoke-direct {v0, v13, v14, v1, v2}, Lo/fiv;->a(JFF)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v20

    .line 299
    move-object/from16 v0, v20

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 301
    const-wide/32 v0, 0x44aa200

    add-long v13, v11, v0

    .line 302
    const v0, 0x3f7d70a4    # 0.99f

    mul-float v0, v0, v17

    const v1, 0x3f7d70a4    # 0.99f

    mul-float v1, v1, v18

    move-object/from16 v2, p0

    invoke-direct {v2, v13, v14, v0, v1}, Lo/fiv;->a(JFF)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v21

    .line 303
    move-object/from16 v0, v21

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 283
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_1

    .line 282
    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 306
    :cond_1
    return-object v4
.end method

.method private c(JII)Lcom/huawei/hihealth/HiHealthData;
    .locals 4

    .line 429
    new-instance v1, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v1}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 430
    new-instance v2, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {v2}, Lcom/huawei/hihealth/data/model/HiStressMetaData;-><init>()V

    .line 431
    invoke-static {p4, p3}, Lo/fiv;->a(II)I

    move-result v3

    .line 432
    invoke-virtual {v2, p1, p2}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_start_time(J)V

    .line 433
    invoke-virtual {v2, p1, p2}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_end_time(J)V

    .line 434
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_score(I)V

    .line 435
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_measure_type(I)V

    .line 436
    invoke-virtual {v1, v3}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 437
    const-string v0, "-1"

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 438
    invoke-virtual {v1, p1, p2, p1, p2}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 439
    const/16 v0, 0x7f2

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 440
    invoke-static {v2}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 441
    return-object v1
.end method

.method private c(I)Ljava/lang/String;
    .locals 12

    .line 244
    const-string v4, "sleepdata"

    .line 245
    const-string v5, ""

    .line 246
    const/4 v6, 0x0

    .line 248
    const-string v0, "health"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".txt"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dmq;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v6, v0

    .line 250
    invoke-virtual {v6}, Ljava/io/InputStream;->available()I

    move-result v7

    .line 251
    new-array v8, v7, [B

    .line 252
    invoke-virtual {v6, v8}, Ljava/io/InputStream;->read([B)I

    move-result v9

    .line 253
    if-lez v9, :cond_0

    .line 254
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v8, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v5, v0

    .line 259
    :cond_0
    if-eqz v6, :cond_2

    .line 261
    :try_start_1
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 264
    goto/16 :goto_1

    .line 262
    :catch_0
    move-exception v7

    .line 263
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    goto :goto_1

    .line 256
    :catch_1
    move-exception v7

    .line 257
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 259
    if-eqz v6, :cond_2

    .line 261
    :try_start_3
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 264
    goto :goto_1

    .line 262
    :catch_2
    move-exception v7

    .line 263
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    goto :goto_1

    .line 259
    :catchall_0
    move-exception v10

    if-eqz v6, :cond_1

    .line 261
    :try_start_4
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 264
    goto :goto_0

    .line 262
    :catch_3
    move-exception v11

    .line 263
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBetaFile e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    :cond_1
    :goto_0
    throw v10

    .line 267
    :cond_2
    :goto_1
    return-object v5
.end method

.method private c(JJLjava/lang/String;)Ljava/util/ArrayList;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJLjava/lang/String;)Ljava/util/ArrayList<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 453
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 455
    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    long-to-double v4, v3

    const v3, 0xaca9

    invoke-direct/range {v0 .. v5}, Lo/fiv;->d(JID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v7

    .line 456
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 458
    :try_start_0
    new-instance v8, Lorg/json/JSONArray;

    move-object/from16 v0, p5

    invoke-direct {v8, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 459
    invoke-static/range {p3 .. p4}, Lo/cnk;->h(J)J

    move-result-wide v9

    .line 460
    const/4 v11, 0x0

    .line 461
    const/4 v12, 0x0

    :goto_0
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v12, v0, :cond_b

    .line 462
    invoke-virtual {v8, v12}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lorg/json/JSONObject;

    .line 463
    const/4 v14, 0x0

    .line 464
    const/4 v15, 0x0

    .line 465
    const-string v0, "SHALLOW"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 466
    const-string v0, "SHALLOW"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 467
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v14

    .line 468
    const/16 v15, 0x5655

    .line 469
    goto/16 :goto_2

    :cond_0
    const-string v0, "DEEP"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 470
    const-string v0, "DEEP"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 471
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v14

    .line 472
    const/16 v15, 0x5657

    .line 473
    goto/16 :goto_2

    :cond_1
    const-string v0, "DREAM"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 474
    const-string v0, "DREAM"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 475
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v14

    .line 476
    const/16 v15, 0x5656

    .line 477
    goto/16 :goto_2

    :cond_2
    const-string v0, "WAKE"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 478
    const-string v0, "WAKE"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 479
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v14

    .line 480
    const/16 v15, 0x5658

    .line 481
    goto/16 :goto_2

    .line 482
    :cond_3
    const-string v0, "CORE_SLEEP_SCORE"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 483
    const-string v0, "CORE_SLEEP_SCORE"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 484
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v17

    .line 485
    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move/from16 v3, v17

    int-to-double v4, v3

    const v3, 0xacab

    invoke-direct/range {v0 .. v5}, Lo/fiv;->d(JID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v18

    .line 486
    move-object/from16 v0, v18

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 487
    goto/16 :goto_2

    :cond_4
    const-string v0, "SLEEP_DEEP_PART_COUNT"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 488
    const-string v0, "SLEEP_DEEP_PART_COUNT"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 489
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v17

    .line 490
    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move/from16 v3, v17

    int-to-double v4, v3

    const v3, 0xac4a

    invoke-direct/range {v0 .. v5}, Lo/fiv;->d(JID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v18

    .line 491
    move-object/from16 v0, v18

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 492
    goto/16 :goto_2

    :cond_5
    const-string v0, "CORE_SLEEP_SNORE_FREQ"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 493
    const-string v0, "CORE_SLEEP_SNORE_FREQ"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 494
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v17

    .line 495
    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move/from16 v3, v17

    int-to-double v4, v3

    const v3, 0xacb0

    invoke-direct/range {v0 .. v5}, Lo/fiv;->d(JID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v18

    .line 496
    move-object/from16 v0, v18

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 497
    goto :goto_2

    :cond_6
    const-string v0, "CORE_SLEEP_NOON"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 498
    const-string v0, "CORE_SLEEP_NOON"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 499
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v14

    .line 500
    const/16 v15, 0x5659

    .line 501
    const-wide/32 v0, 0x2932e00

    add-long v0, v0, p1

    const-wide/16 v2, 0x7530

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Lo/cnk;->h(J)J

    move-result-wide v17

    .line 502
    const/16 v19, 0x0

    :goto_1
    move/from16 v0, v19

    if-ge v0, v14, :cond_7

    .line 503
    new-instance v0, Lcom/huawei/hihealth/HiHealthData;

    move v1, v15

    const/16 v1, 0x5659

    invoke-direct {v0, v1}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    move-object/from16 v20, v0

    .line 504
    const-wide/32 v0, 0xea60

    add-long v0, v0, v17

    move-object/from16 v2, v20

    move-wide/from16 v3, v17

    invoke-virtual {v2, v3, v4, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 505
    const-string v0, "-1"

    move-object/from16 v1, v20

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 506
    move-object/from16 v0, v20

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 507
    const-wide/32 v0, 0xea60

    add-long v17, v17, v0

    .line 502
    add-int/lit8 v19, v19, 0x1

    goto :goto_1

    .line 510
    :cond_7
    :goto_2
    const-string v0, "SHALLOW"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "DEEP"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "DREAM"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "WAKE"

    invoke-virtual {v13, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 511
    :cond_8
    const/16 v16, 0x0

    :goto_3
    move/from16 v0, v16

    if-ge v0, v14, :cond_9

    .line 512
    new-instance v0, Lcom/huawei/hihealth/HiHealthData;

    move v1, v15

    invoke-direct {v0, v1}, Lcom/huawei/hihealth/HiHealthData;-><init>(I)V

    move-object/from16 v17, v0

    .line 513
    const-wide/32 v0, 0xea60

    add-long/2addr v0, v9

    move-object/from16 v2, v17

    invoke-virtual {v2, v9, v10, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setTimeInterval(JJ)V

    .line 514
    const-string v0, "-1"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 515
    move-object/from16 v0, v17

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 516
    const-wide/32 v0, 0xea60

    add-long/2addr v9, v0

    .line 511
    add-int/lit8 v16, v16, 0x1

    goto :goto_3

    .line 518
    :cond_9
    add-int/2addr v11, v14

    .line 461
    :cond_a
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 522
    :cond_b
    int-to-long v0, v11

    const-wide/32 v2, 0xea60

    mul-long/2addr v0, v2

    add-long v12, p3, v0

    .line 523
    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    long-to-double v4, v12

    const v3, 0xacaa

    invoke-direct/range {v0 .. v5}, Lo/fiv;->d(JID)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v14

    .line 524
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 530
    goto :goto_4

    .line 525
    :catch_0
    move-exception v8

    .line 526
    throw v8

    .line 528
    :catch_1
    move-exception v8

    .line 529
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "json parse error"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    :goto_4
    return-object v6
.end method

.method private c(II)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 227
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 228
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 229
    invoke-static {v8, v9}, Lo/dbu;->b(J)J

    move-result-wide v10

    .line 230
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getInsertSleepHiHealthDatas startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3, v10, v11}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    move/from16 v12, p1

    :goto_0
    move/from16 v0, p2

    if-ge v12, v0, :cond_1

    .line 232
    const/4 v13, 0x0

    :goto_1
    const/4 v0, 0x7

    if-ge v13, v0, :cond_0

    .line 233
    mul-int/lit8 v0, v12, 0x7

    add-int/2addr v0, v13

    int-to-long v0, v0

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    sub-long v14, v10, v0

    .line 234
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lo/fiv;->a(II)I

    move-result v0

    int-to-long v0, v0

    const-wide/32 v2, 0x36ee80

    mul-long/2addr v0, v2

    sub-long v0, v14, v0

    const/4 v2, 0x1

    const/16 v3, 0x14

    invoke-static {v2, v3}, Lo/fiv;->a(II)I

    move-result v2

    int-to-long v2, v2

    const-wide/32 v4, 0x36ee80

    div-long v2, v4, v2

    add-long v16, v0, v2

    .line 235
    move-object/from16 v0, p0

    move-wide v1, v14

    move-wide/from16 v3, v16

    const/4 v5, 0x0

    const/4 v6, 0x6

    invoke-static {v5, v6}, Lo/fiv;->a(II)I

    move-result v5

    move-object/from16 v6, p0

    invoke-direct {v6, v5}, Lo/fiv;->c(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lo/fiv;->c(JJLjava/lang/String;)Ljava/util/ArrayList;

    move-result-object v18

    .line 236
    move-object/from16 v0, v18

    invoke-interface {v7, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 232
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 231
    :cond_0
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 239
    :cond_1
    return-object v7
.end method

.method private c(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 366
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 367
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertMockWeightDatas,hiHealthDataList is invaild"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    return-void

    .line 370
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 371
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertMockWeightDatas,hiHealthDataList\'s size is invaild"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    return-void

    .line 374
    :cond_1
    new-instance v4, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 375
    invoke-virtual {v4, p1}, Lcom/huawei/hihealth/HiDataInsertOption;->setDatas(Ljava/util/List;)V

    .line 376
    const/4 v0, 0x1

    invoke-direct {p0, v4, p2, v0}, Lo/fiv;->d(Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V

    .line 377
    return-void
.end method

.method private d(JID)Lcom/huawei/hihealth/HiHealthData;
    .locals 3

    .line 535
    new-instance v2, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiHealthData;-><init>()V

    .line 536
    invoke-virtual {v2, p3}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 537
    const-string v0, "-1"

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiHealthData;->setDeviceUUID(Ljava/lang/String;)V

    .line 538
    invoke-static {p1, p2}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setStartTime(J)V

    .line 539
    invoke-static {p1, p2}, Lo/cnk;->h(J)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setEndTime(J)V

    .line 540
    invoke-virtual {v2, p4, p5}, Lcom/huawei/hihealth/HiHealthData;->setValue(D)V

    .line 541
    return-object v2
.end method

.method private d(II)Ljava/util/List;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 401
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 402
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    mul-int/lit8 v2, p1, 0x7

    add-int v2, v2, p2

    int-to-long v2, v2

    const-wide/32 v4, 0x5265c00

    mul-long/2addr v2, v4

    sub-long v7, v0, v2

    .line 403
    invoke-static {v7, v8}, Lo/dbu;->b(J)J

    move-result-wide v9

    .line 405
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x1b7740

    sub-long v11, v0, v2

    .line 406
    const-wide/32 v0, 0x1b77400

    add-long v13, v9, v0

    .line 407
    const-wide/32 v0, 0x4b87f00

    add-long v15, v9, v0

    .line 408
    const-wide/32 v0, 0x5265c00

    add-long v17, v9, v0

    .line 409
    const/16 v19, 0x1

    .line 410
    :goto_0
    cmp-long v0, v9, v11

    if-gez v0, :cond_3

    .line 411
    cmp-long v0, v9, v13

    if-gez v0, :cond_0

    .line 412
    const/16 v19, 0x1

    .line 413
    move-object/from16 v0, p0

    const/16 v1, 0x1e

    const/16 v2, 0xf

    invoke-direct {v0, v9, v10, v1, v2}, Lo/fiv;->c(JII)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 414
    :cond_0
    cmp-long v0, v9, v15

    if-gez v0, :cond_1

    .line 415
    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lo/fiv;->a(II)I

    move-result v19

    .line 416
    move-object/from16 v0, p0

    const/16 v1, 0x5a

    const/16 v2, 0x32

    invoke-direct {v0, v9, v10, v1, v2}, Lo/fiv;->c(JII)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 417
    :cond_1
    cmp-long v0, v9, v17

    if-gez v0, :cond_2

    .line 418
    const/16 v19, 0x1

    .line 419
    move-object/from16 v0, p0

    const/16 v1, 0x3c

    const/16 v2, 0x1e

    invoke-direct {v0, v9, v10, v1, v2}, Lo/fiv;->c(JII)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 421
    :cond_2
    :goto_1
    mul-int/lit8 v0, v19, 0x1e

    mul-int/lit8 v0, v0, 0x3c

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    add-long/2addr v9, v0

    goto :goto_0

    .line 423
    :cond_3
    return-object v6
.end method

.method private d(Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V
    .locals 4

    .line 380
    if-gez p3, :cond_0

    .line 381
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "tryTime < 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 382
    return-void

    .line 384
    :cond_0
    iget-object v0, p0, Lo/fiv;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/fiv$8;

    invoke-direct {v1, p0, p2, p3, p1}, Lo/fiv$8;-><init>(Lo/fiv;Lcom/huawei/hwbasemgr/IBaseResponseCallback;ILcom/huawei/hihealth/HiDataInsertOption;)V

    invoke-virtual {v0, p1, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 396
    return-void
.end method

.method static synthetic d(Lo/fiv;Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lo/fiv;->d(Lcom/huawei/hihealth/HiDataInsertOption;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V

    return-void
.end method

.method private e(II)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 216
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 217
    move v2, p1

    :goto_0
    if-ge v2, p2, :cond_1

    .line 218
    const/4 v3, 0x0

    :goto_1
    const/4 v0, 0x7

    if-ge v3, v0, :cond_0

    .line 219
    invoke-direct {p0, v2, v3}, Lo/fiv;->d(II)Ljava/util/List;

    move-result-object v4

    .line 220
    invoke-interface {v1, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 218
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 217
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 223
    :cond_1
    return-object v1
.end method

.method public static g()V
    .locals 6

    .line 310
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDeviceToHiHealth enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    new-instance v4, Lcom/huawei/hihealth/HiDeviceInfo;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDeviceInfo;-><init>()V

    .line 312
    const-string v0, "C8:A2:2E:5A:45:BD"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceUniqueCode(Ljava/lang/String;)V

    .line 313
    const-string v0, "CH18"

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 314
    const/16 v0, 0x39

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceType(I)V

    .line 315
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 316
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 317
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v4, v5, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDeviceInfo;Ljava/util/List;Lo/cme;)V

    .line 318
    return-void
.end method


# virtual methods
.method public b()V
    .locals 5

    .line 170
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 171
    return-void

    .line 173
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertWeightMonthData inter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lo/fiv;->b(II)Ljava/util/List;

    move-result-object v4

    .line 175
    new-instance v0, Lo/fiv$2;

    invoke-direct {v0, p0}, Lo/fiv$2;-><init>(Lo/fiv;)V

    invoke-direct {p0, v4, v0}, Lo/fiv;->c(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 181
    return-void
.end method

.method public c()V
    .locals 5

    .line 156
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 157
    return-void

    .line 159
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertWeightWeekDatas inter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/fiv;->b(II)Ljava/util/List;

    move-result-object v4

    .line 161
    new-instance v0, Lo/fiv$1;

    invoke-direct {v0, p0}, Lo/fiv$1;-><init>(Lo/fiv;)V

    invoke-direct {p0, v4, v0}, Lo/fiv;->c(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 167
    return-void
.end method

.method public d()V
    .locals 5

    .line 125
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 126
    return-void

    .line 128
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertSleepWeekData inter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/fiv;->c(II)Ljava/util/List;

    move-result-object v4

    .line 130
    new-instance v0, Lo/fiv$4;

    invoke-direct {v0, p0}, Lo/fiv$4;-><init>(Lo/fiv;)V

    invoke-direct {p0, v4, v0}, Lo/fiv;->c(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 136
    return-void
.end method

.method public e()V
    .locals 5

    .line 138
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 139
    return-void

    .line 141
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertSleepMonthData inter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lo/fiv;->c(II)Ljava/util/List;

    move-result-object v4

    .line 143
    new-instance v0, Lo/fiv$3;

    invoke-direct {v0, p0}, Lo/fiv$3;-><init>(Lo/fiv;)V

    invoke-direct {p0, v4, v0}, Lo/fiv;->c(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 150
    return-void
.end method

.method public h()V
    .locals 5

    .line 201
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 202
    return-void

    .line 204
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertPressureMonthData inter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lo/fiv;->e(II)Ljava/util/List;

    move-result-object v4

    .line 206
    new-instance v0, Lo/fiv$10;

    invoke-direct {v0, p0}, Lo/fiv$10;-><init>(Lo/fiv;)V

    invoke-direct {p0, v4, v0}, Lo/fiv;->c(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 212
    return-void
.end method

.method public i()V
    .locals 5

    .line 187
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 188
    return-void

    .line 190
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertPressureWeekData inter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/fiv;->e(II)Ljava/util/List;

    move-result-object v4

    .line 192
    new-instance v0, Lo/fiv$5;

    invoke-direct {v0, p0}, Lo/fiv$5;-><init>(Lo/fiv;)V

    invoke-direct {p0, v4, v0}, Lo/fiv;->c(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 199
    return-void
.end method
