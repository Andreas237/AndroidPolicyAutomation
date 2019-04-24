.class public Lo/fkb;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(I)I
    .locals 2

    .line 356
    if-gez p0, :cond_0

    .line 357
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "error argument"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 358
    :cond_0
    shr-int/lit8 v0, p0, 0x3

    return v0
.end method

.method public static a(Ljava/io/FileInputStream;)Lcom/huawei/datatype/PeriodRRIEntity;
    .locals 13

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v5, 0x0

    .line 43
    move-object v5, p0

    .line 45
    const-string v0, "ParsePeriodRRIFileUtil"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u89e3\u6790\u5934\u6587\u4ef6Header..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    new-instance v0, Lcom/huawei/datatype/PeriodRRIEntity;

    invoke-direct {v0}, Lcom/huawei/datatype/PeriodRRIEntity;-><init>()V

    move-object v4, v0

    .line 47
    const/16 v6, 0x30

    .line 48
    new-array v7, v6, [B

    .line 49
    invoke-virtual {v5, v7}, Ljava/io/FileInputStream;->read([B)I
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v8

    .line 50
    const/4 v0, -0x1

    if-ne v0, v8, :cond_1

    .line 51
    move-object v9, v4

    .line 77
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 79
    :try_start_1
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 82
    goto :goto_0

    .line 80
    :catch_0
    move-exception v10

    .line 81
    const-string v0, "ParsePeriodRRIFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    :cond_0
    :goto_0
    return-object v9

    .line 54
    :cond_1
    :try_start_2
    invoke-static {v7, v4}, Lo/fkb;->e([BLcom/huawei/datatype/PeriodRRIEntity;)I

    move-result v9

    .line 56
    invoke-virtual {v4}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchVersion()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 60
    :pswitch_0
    invoke-static {v7, v9, v4}, Lo/fkb;->a([BILcom/huawei/datatype/PeriodRRIEntity;)V

    .line 61
    invoke-static {v5, v4}, Lo/fkb;->e(Ljava/io/FileInputStream;Lcom/huawei/datatype/PeriodRRIEntity;)V

    .line 62
    invoke-virtual {v4}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchRriDataList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/fkb;->a(Ljava/util/List;)V

    .line 63
    goto :goto_1

    .line 65
    :pswitch_1
    invoke-static {v7, v9, v4}, Lo/fkb;->c([BILcom/huawei/datatype/PeriodRRIEntity;)V

    .line 66
    invoke-static {v5, v4}, Lo/fkb;->c(Ljava/io/FileInputStream;Lcom/huawei/datatype/PeriodRRIEntity;)V

    .line 67
    invoke-virtual {v4}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchPressDataList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lo/fkb;->e(Ljava/util/List;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    .line 77
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 79
    :try_start_3
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 82
    goto/16 :goto_3

    .line 80
    :catch_1
    move-exception v6

    .line 81
    const-string v0, "ParsePeriodRRIFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    goto/16 :goto_3

    .line 72
    :catch_2
    move-exception v6

    .line 73
    const-string v0, "ParsePeriodRRIFileUtil"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 77
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 79
    :try_start_5
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 82
    goto :goto_3

    .line 80
    :catch_3
    move-exception v6

    .line 81
    const-string v0, "ParsePeriodRRIFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    goto :goto_3

    .line 74
    :catch_4
    move-exception v6

    .line 75
    const-string v0, "ParsePeriodRRIFileUtil"

    const/4 v1, 0x1

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 77
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 79
    :try_start_7
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 82
    goto :goto_3

    .line 80
    :catch_5
    move-exception v6

    .line 81
    const-string v0, "ParsePeriodRRIFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    goto :goto_3

    .line 77
    :catchall_0
    move-exception v11

    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 79
    :try_start_8
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    .line 82
    goto :goto_2

    .line 80
    :catch_6
    move-exception v12

    .line 81
    const-string v0, "ParsePeriodRRIFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v12}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    :cond_2
    :goto_2
    throw v11

    .line 85
    :cond_3
    :goto_3
    const-string v0, "ParsePeriodRRIFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Period_RRI parse end"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/datatype/PeriodRRIEntity;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;>;)V"
        }
    .end annotation

    .line 363
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 364
    new-instance v0, Lo/fkb$4;

    invoke-direct {v0}, Lo/fkb$4;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 373
    :cond_0
    return-void
.end method

.method private static a([BILcom/huawei/datatype/PeriodRRIEntity;)V
    .locals 7

    .line 136
    const/4 v1, 0x1

    .line 137
    const/16 v2, 0x23

    .line 139
    add-int/lit8 v3, p1, 0x1

    .line 140
    invoke-static {p0, p1, v3}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v4

    .line 141
    const/16 v0, 0x10

    invoke-static {v4, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 142
    invoke-virtual {p2, v5}, Lcom/huawei/datatype/PeriodRRIEntity;->configSize(I)V

    .line 143
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2, v0}, Lcom/huawei/datatype/PeriodRRIEntity;->configRriDataList(Ljava/util/List;)V

    .line 144
    move p1, v3

    .line 146
    add-int/lit8 v3, p1, 0x23

    .line 147
    invoke-static {p0, p1, v3}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v6

    .line 148
    invoke-virtual {p2, v6}, Lcom/huawei/datatype/PeriodRRIEntity;->configHeaderReserved(Ljava/lang/String;)V

    .line 150
    return-void
.end method

.method private static a([BLcom/huawei/datatype/PeriodRRIEntity;)V
    .locals 31

    .line 250
    const/16 v4, 0x10

    .line 252
    const/4 v5, 0x4

    const/4 v6, 0x4

    const/4 v7, 0x4

    const/4 v8, 0x4

    .line 253
    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x1

    const/4 v12, 0x1

    const/4 v13, 0x1

    const/4 v14, 0x1

    .line 254
    const/16 v15, 0xc

    .line 256
    const/16 v16, 0x0

    .line 259
    new-instance v18, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct/range {v18 .. v18}, Lcom/huawei/hihealth/data/model/HiStressMetaData;-><init>()V

    .line 261
    const/16 v17, 0x4

    .line 262
    move-object/from16 v0, p0

    move/from16 v1, v16

    move/from16 v2, v17

    invoke-static {v0, v1, v2}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v19

    .line 263
    move-object/from16 v0, v19

    invoke-static {v0, v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    .line 264
    const-string v0, "ParsePeriodRRIFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remove startTime = 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    return-void

    .line 267
    :cond_0
    move-object/from16 v0, v19

    invoke-static {v0, v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_start_time(J)V

    .line 268
    const/16 v16, 0x4

    .line 271
    const/16 v17, 0x8

    .line 272
    move-object/from16 v0, p0

    move/from16 v1, v16

    move/from16 v2, v17

    invoke-static {v0, v1, v2}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v20

    .line 273
    move-object/from16 v0, v20

    invoke-static {v0, v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-nez v0, :cond_1

    .line 274
    const-string v0, "ParsePeriodRRIFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remove endTime = 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    return-void

    .line 277
    :cond_1
    move-object/from16 v0, v20

    invoke-static {v0, v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_end_time(J)V

    .line 278
    const/16 v16, 0x8

    .line 281
    const/16 v17, 0xc

    .line 282
    move-object/from16 v0, p0

    move/from16 v1, v16

    move/from16 v2, v17

    invoke-static {v0, v1, v2}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v21

    .line 283
    move-object/from16 v0, v21

    invoke-static {v0, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_algorithm_ver(I)V

    .line 284
    const/16 v16, 0xc

    .line 287
    const/16 v17, 0xd

    .line 288
    move-object/from16 v0, p0

    move/from16 v1, v16

    move/from16 v2, v17

    invoke-static {v0, v1, v2}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v22

    .line 289
    move-object/from16 v0, v22

    invoke-static {v0, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_score(I)V

    .line 290
    const/16 v16, 0xd

    .line 293
    const/16 v17, 0xe

    .line 294
    move-object/from16 v0, p0

    move/from16 v1, v16

    move/from16 v2, v17

    invoke-static {v0, v1, v2}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v23

    .line 295
    move-object/from16 v0, v23

    invoke-static {v0, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_grade(I)V

    .line 296
    const/16 v16, 0xe

    .line 299
    const/16 v17, 0xf

    .line 300
    move-object/from16 v0, p0

    move/from16 v1, v16

    move/from16 v2, v17

    invoke-static {v0, v1, v2}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v24

    .line 301
    move-object/from16 v0, v24

    invoke-static {v0, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_calib_flag(I)V

    .line 302
    const/16 v16, 0xf

    .line 305
    const/16 v17, 0x10

    .line 306
    move-object/from16 v0, p0

    move/from16 v1, v16

    move/from16 v2, v17

    invoke-static {v0, v1, v2}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v25

    .line 307
    move-object/from16 v0, v25

    invoke-static {v0, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_measure_type(I)V

    .line 308
    const/16 v16, 0x10

    .line 311
    const/16 v17, 0x11

    .line 312
    move-object/from16 v0, p0

    move/from16 v1, v16

    move/from16 v2, v17

    invoke-static {v0, v1, v2}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v26

    .line 313
    move-object/from16 v0, v26

    invoke-static {v0, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_acc_flag(I)V

    .line 314
    const/16 v16, 0x11

    .line 317
    const/16 v17, 0x12

    .line 318
    move-object/from16 v0, p0

    move/from16 v1, v16

    move/from16 v2, v17

    invoke-static {v0, v1, v2}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v27

    .line 319
    move-object/from16 v0, v27

    invoke-static {v0, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_ppg_flag(I)V

    .line 320
    const/16 v16, 0x12

    .line 323
    new-instance v28, Ljava/util/ArrayList;

    invoke-direct/range {v28 .. v28}, Ljava/util/ArrayList;-><init>()V

    .line 324
    const/16 v29, 0x0

    :goto_0
    move/from16 v0, v29

    if-ge v0, v15, :cond_2

    .line 325
    add-int/lit8 v17, v16, 0x4

    .line 326
    move-object/from16 v0, p0

    move/from16 v1, v16

    move/from16 v2, v17

    invoke-static {v0, v1, v2}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v30

    .line 327
    invoke-static/range {v30 .. v30}, Lo/czx;->f(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object/from16 v1, v28

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 328
    move/from16 v16, v17

    .line 324
    add-int/lit8 v29, v29, 0x1

    goto :goto_0

    .line 330
    :cond_2
    move-object/from16 v0, v18

    move-object/from16 v1, v28

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_feature(Ljava/util/List;)V

    .line 331
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchPressDataList()Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 332
    return-void
.end method

.method private static c(Ljava/io/FileInputStream;Lcom/huawei/datatype/PeriodRRIEntity;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 236
    const/16 v2, 0x42

    .line 238
    new-array v3, v2, [B

    .line 240
    const/4 v4, 0x0

    .line 241
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1, v0}, Lcom/huawei/datatype/PeriodRRIEntity;->configPressDataList(Ljava/util/List;)V

    .line 242
    :goto_0
    invoke-virtual {p0, v3}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    .line 243
    invoke-static {v3, p1}, Lo/fkb;->a([BLcom/huawei/datatype/PeriodRRIEntity;)V

    .line 244
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 246
    :cond_0
    return-void
.end method

.method private static c([BILcom/huawei/datatype/PeriodRRIEntity;)V
    .locals 4

    .line 128
    const/16 v1, 0x24

    .line 130
    add-int/lit8 v2, p1, 0x24

    .line 131
    invoke-static {p0, p1, v2}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v3

    .line 132
    invoke-virtual {p2, v3}, Lcom/huawei/datatype/PeriodRRIEntity;->configHeaderReserved(Ljava/lang/String;)V

    .line 133
    return-void
.end method

.method private static d([BII)Ljava/lang/String;
    .locals 4

    .line 336
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    if-le p1, p2, :cond_1

    .line 337
    :cond_0
    const-string v0, ""

    return-object v0

    .line 339
    :cond_1
    sub-int v0, p2, p1

    new-array v1, v0, [B

    .line 340
    move v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v2, p2, :cond_2

    .line 341
    aget-byte v0, p0, v2

    aput-byte v0, v1, v3

    .line 340
    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 344
    :cond_2
    invoke-static {v1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    .line 346
    return-object v2
.end method

.method private static d([BLcom/huawei/datatype/PeriodRRIEntity;)V
    .locals 17

    .line 179
    const/16 v4, 0x10

    .line 180
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchSize()I

    move-result v5

    .line 182
    const/4 v6, 0x4

    .line 183
    const/4 v7, 0x2

    .line 184
    const/4 v8, 0x1

    .line 185
    const/4 v9, 0x1

    .line 186
    const/4 v10, 0x1

    .line 188
    const/4 v11, 0x0

    .line 191
    new-instance v13, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;

    invoke-direct {v13}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;-><init>()V

    .line 193
    const/4 v12, 0x4

    .line 194
    move-object/from16 v0, p0

    invoke-static {v0, v11, v12}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v14

    .line 195
    invoke-static {v14, v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-nez v0, :cond_0

    .line 196
    const-string v0, "ParsePeriodRRIFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remove startTime = 0 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    return-void

    .line 199
    :cond_0
    invoke-static {v14, v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    invoke-virtual {v13, v0, v1}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->configStartTime(J)V

    .line 200
    const/4 v11, 0x4

    .line 203
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->configRriList(Ljava/util/List;)V

    .line 204
    const/4 v15, 0x0

    :goto_0
    if-ge v15, v5, :cond_1

    .line 205
    add-int/lit8 v12, v11, 0x2

    .line 206
    move-object/from16 v0, p0

    invoke-static {v0, v11, v12}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v16

    .line 207
    move-object/from16 v0, v16

    invoke-static {v0, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->addRri(I)V

    .line 208
    move v11, v12

    .line 204
    add-int/lit8 v15, v15, 0x1

    goto :goto_0

    .line 211
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->configSqiList(Ljava/util/List;)V

    .line 212
    const/4 v15, 0x0

    :goto_1
    if-ge v15, v5, :cond_2

    .line 213
    add-int/lit8 v12, v11, 0x1

    .line 214
    move-object/from16 v0, p0

    invoke-static {v0, v11, v12}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v16

    .line 215
    move-object/from16 v0, v16

    invoke-static {v0, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->addSqi(I)V

    .line 216
    move v11, v12

    .line 212
    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    .line 219
    :cond_2
    add-int/lit8 v12, v11, 0x1

    .line 220
    move-object/from16 v0, p0

    invoke-static {v0, v11, v12}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v15

    .line 221
    invoke-static {v15, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->configIntensity(I)V

    .line 222
    move v11, v12

    .line 226
    add-int/lit8 v12, v11, 0x1

    .line 227
    move-object/from16 v0, p0

    invoke-static {v0, v11, v12}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v16

    .line 228
    move-object/from16 v0, v16

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->configReserved(Ljava/lang/String;)V

    .line 231
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchRriDataList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 232
    return-void
.end method

.method private static e([BLcom/huawei/datatype/PeriodRRIEntity;)I
    .locals 14

    .line 90
    const-string v0, "ParsePeriodRRIFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u89e3\u6790\u5468\u671fRRI\u5934\u6587\u4ef6"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    const/16 v4, 0x30

    .line 92
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    array-length v0, p0

    if-eq v4, v0, :cond_1

    .line 93
    :cond_0
    const-string v0, "ParsePeriodRRIFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "header is error argument"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    const/4 v0, -0x1

    return v0

    .line 96
    :cond_1
    const-string v0, "ParsePeriodRRIFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "header : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    const/16 v5, 0x10

    .line 99
    const/4 v6, 0x0

    .line 101
    const/16 v8, 0x40

    .line 102
    const/16 v9, 0x10

    .line 103
    const/16 v10, 0x10

    .line 106
    invoke-static {v8}, Lo/fkb;->a(I)I

    move-result v0

    add-int/lit8 v7, v0, 0x0

    .line 107
    invoke-static {p0, v6, v7}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v11

    .line 108
    invoke-static {v11, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/datatype/PeriodRRIEntity;->configFileSize(I)V

    .line 109
    move v6, v7

    .line 112
    invoke-static {v9}, Lo/fkb;->a(I)I

    move-result v0

    add-int v7, v6, v0

    .line 113
    invoke-static {p0, v6, v7}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v12

    .line 114
    const-string v0, "ParsePeriodRRIFileUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bitmap : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    invoke-static {v12, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/datatype/PeriodRRIEntity;->configBitmap(I)V

    .line 116
    move v6, v7

    .line 119
    invoke-static {v10}, Lo/fkb;->a(I)I

    move-result v0

    add-int v7, v6, v0

    .line 120
    invoke-static {p0, v6, v7}, Lo/fkb;->d([BII)Ljava/lang/String;

    move-result-object v13

    .line 121
    invoke-static {v13, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/datatype/PeriodRRIEntity;->configVersion(I)V

    .line 122
    move v6, v7

    .line 124
    return v6
.end method

.method private static e(Ljava/io/FileInputStream;Lcom/huawei/datatype/PeriodRRIEntity;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 161
    const/4 v3, 0x6

    .line 162
    const/4 v4, 0x3

    .line 164
    invoke-virtual {p1}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchSize()I

    move-result v0

    mul-int/lit8 v0, v0, 0x3

    add-int/lit8 v2, v0, 0x6

    .line 165
    new-array v5, v2, [B

    .line 167
    const/4 v6, 0x0

    .line 168
    :goto_0
    invoke-virtual {p0, v5}, Ljava/io/FileInputStream;->read([B)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    .line 169
    invoke-static {v5, p1}, Lo/fkb;->d([BLcom/huawei/datatype/PeriodRRIEntity;)V

    .line 170
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 172
    :cond_0
    return-void
.end method

.method private static e(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;)V"
        }
    .end annotation

    .line 376
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 377
    new-instance v0, Lo/fkb$5;

    invoke-direct {v0}, Lo/fkb$5;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 386
    :cond_0
    return-void
.end method
