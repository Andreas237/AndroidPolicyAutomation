.class public Lo/cgm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

.field private static b:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cfk;>;)I"
        }
    .end annotation

    .line 147
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 148
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 150
    :cond_1
    new-instance v0, Lo/cgm$15;

    invoke-direct {v0}, Lo/cgm$15;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfk;

    .line 157
    invoke-virtual {v0}, Lo/cfk;->b()I

    move-result v0

    .line 150
    return v0
.end method

.method public static a(Lo/cfd;)I
    .locals 1

    .line 95
    invoke-virtual {p0}, Lo/cfd;->c()I

    move-result v0

    return v0
.end method

.method private static a()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;
    .locals 8

    .line 387
    sget-object v0, Lo/cgm;->a:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    if-nez v0, :cond_1

    .line 388
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartZoneConf enter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 389
    invoke-static {}, Lo/cgm;->b()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 390
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHeartZoneConf enter ,age: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getAge()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 391
    new-instance v5, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getAge()I

    move-result v0

    invoke-direct {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;-><init>(I)V

    .line 393
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HeartZone_Config"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v6

    .line 394
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 395
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 396
    array-length v0, v7

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 397
    const/4 v0, 0x0

    aget-object v0, v7, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHRZoneConf(Ljava/lang/String;)V

    .line 398
    const/4 v0, 0x1

    aget-object v0, v7, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setThreshold(Ljava/lang/String;)V

    .line 401
    :cond_0
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartZoneConf "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    sput-object v5, Lo/cgm;->a:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    .line 404
    :cond_1
    sget-object v0, Lo/cgm;->a:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    return-object v0
.end method

.method public static a(Ljava/util/List;IJ)[I
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cev;>;IJ)[I"
        }
    .end annotation

    .line 209
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestHeartInteDuration "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    const/4 v4, 0x0

    .line 211
    const/4 v5, -0x1

    .line 212
    const/4 v0, 0x5

    new-array v6, v0, [I

    .line 214
    const/4 v7, 0x0

    .line 215
    const/4 v8, 0x5

    .line 217
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v9

    .line 220
    const/4 v10, 0x6

    .line 222
    const/4 v0, 0x1

    if-le v9, v0, :cond_5

    .line 223
    if-ge v9, v10, :cond_0

    .line 224
    move v10, v9

    .line 226
    :cond_0
    const/4 v11, 0x0

    .line 227
    const/4 v12, 0x0

    .line 228
    const/4 v13, 0x1

    :goto_0
    if-ge v13, v10, :cond_2

    .line 229
    move-object/from16 v0, p0

    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cev;

    invoke-virtual {v0}, Lo/cev;->e()J

    move-result-wide v0

    add-int/lit8 v2, v13, -0x1

    move-object/from16 v3, p0

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/cev;

    invoke-virtual {v2}, Lo/cev;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x9c40

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 231
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 233
    :cond_1
    add-int/lit8 v12, v12, 0x1

    .line 228
    :goto_1
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 236
    :cond_2
    if-le v11, v12, :cond_3

    .line 238
    const/4 v8, 0x5

    .line 239
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intervalNums5 > intervalNums60 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 240
    :cond_3
    mul-int/lit8 v0, v9, 0x3c

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    div-long v2, p2, v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    .line 242
    const/4 v8, 0x5

    .line 243
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "beyond total time "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    mul-int/lit8 v2, v9, 0x3c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 245
    :cond_4
    const/16 v8, 0x3c

    .line 246
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intervalNums5 > intervalNums60 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    :cond_5
    :goto_2
    move/from16 v0, p1

    const/4 v1, -0x1

    if-ne v0, v1, :cond_6

    .line 251
    const/16 p1, 0x0

    .line 255
    :cond_6
    if-eqz p1, :cond_7

    move/from16 v0, p1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    move/from16 v0, p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 257
    :cond_7
    invoke-static/range {p1 .. p1}, Lo/cgm;->e(I)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v11

    goto :goto_3

    .line 259
    :cond_8
    invoke-static {}, Lo/cgm;->a()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v11

    .line 260
    invoke-static {}, Lo/cgm;->c()V

    .line 264
    :goto_3
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v0, "heartzone:"

    invoke-direct {v12, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 266
    const/4 v13, 0x0

    :goto_4
    if-ge v13, v9, :cond_c

    .line 267
    move-object/from16 v0, p0

    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/cev;

    .line 268
    mul-int v7, v8, v13

    .line 270
    invoke-virtual {v14}, Lo/cev;->c()I

    move-result v0

    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getClassifyMethod()I

    move-result v1

    invoke-virtual {v11, v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->findRateRegion(II)I

    move-result v15

    .line 271
    invoke-virtual {v14}, Lo/cev;->c()I

    move-result v0

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    .line 272
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 273
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    .line 274
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    const/4 v0, -0x1

    if-eq v15, v0, :cond_a

    .line 277
    if-eq v5, v15, :cond_b

    .line 279
    const/4 v0, -0x1

    if-eq v5, v0, :cond_9

    .line 280
    aget v0, v6, v5

    sub-int v1, v7, v4

    add-int/2addr v0, v1

    aput v0, v6, v5

    .line 282
    :cond_9
    move v4, v7

    .line 283
    move v5, v15

    goto :goto_5

    .line 287
    :cond_a
    const/4 v0, -0x1

    if-eq v5, v0, :cond_b

    .line 288
    aget v0, v6, v5

    sub-int v1, v7, v4

    add-int/2addr v0, v1

    aput v0, v6, v5

    .line 289
    const/4 v5, -0x1

    .line 266
    :cond_b
    :goto_5
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_4

    .line 295
    :cond_c
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move-object/from16 v1, p0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/cev;

    .line 296
    invoke-virtual {v13}, Lo/cev;->c()I

    move-result v0

    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getClassifyMethod()I

    move-result v1

    invoke-virtual {v11, v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->findRateRegion(II)I

    move-result v14

    .line 297
    const/4 v0, -0x1

    if-eq v14, v0, :cond_d

    if-ne v14, v5, :cond_d

    .line 298
    aget v0, v6, v5

    sub-int v1, v7, v4

    add-int/2addr v0, v1

    aput v0, v6, v5

    .line 299
    invoke-virtual {v13}, Lo/cev;->c()I

    move-result v0

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    .line 300
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 301
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 304
    :cond_d
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    return-object v6
.end method

.method public static b(Ljava/util/List;)D
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cfp;>;)D"
        }
    .end annotation

    .line 120
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 121
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0

    .line 123
    :cond_1
    new-instance v0, Lo/cgm$14;

    invoke-direct {v0}, Lo/cgm$14;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfp;

    .line 129
    invoke-virtual {v0}, Lo/cfp;->d()D

    move-result-wide v0

    .line 123
    return-wide v0
.end method

.method public static b()Lcom/huawei/up/model/UserInfomation;
    .locals 6

    .line 409
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v5

    .line 410
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 411
    invoke-virtual {v5}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 412
    if-eqz v4, :cond_0

    .line 413
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLocalUserinfo return  MerryuserInfomation"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 415
    :cond_0
    new-instance v4, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v4}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    .line 416
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLocalUserinfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 419
    :cond_1
    new-instance v4, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v4}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    .line 420
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwUserProfileMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    :goto_0
    return-object v4
.end method

.method public static c(F)I
    .locals 2

    .line 457
    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr v0, p0

    float-to-int v0, v0

    div-int/lit8 v0, v0, 0x2

    mul-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public static c(Ljava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cev;>;)I"
        }
    .end annotation

    .line 99
    new-instance v0, Lo/cgm$10;

    invoke-direct {v0}, Lo/cgm$10;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cev;

    invoke-static {v0}, Lo/cgm;->e(Lo/cev;)I

    move-result v0

    return v0
.end method

.method public static c()V
    .locals 1

    .line 309
    const/4 v0, 0x0

    sput-object v0, Lo/cgm;->a:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    .line 310
    return-void
.end method

.method private static c(IILjava/util/ArrayList;FLo/chq;)V
    .locals 20

    .line 557
    mul-int v0, p0, p1

    int-to-float v6, v0

    .line 558
    sget v0, Lo/cgm;->b:I

    int-to-float v0, v0

    sub-float v0, p3, v0

    const/high16 v1, 0x42700000    # 60.0f

    mul-float/2addr v1, v6

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    .line 560
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5b9e\u9645\u663e\u793a\u8fd0\u52a8\u603b\u65f6\u957f \u5927\u4e8e \u5206\u6bb5\u663e\u793a\u65f6\u95f4--\u5b9e\u9645\u663e\u793a\u6700\u5927\u65f6\u95f4\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lo/cgm;->b:I

    int-to-float v3, v3

    sub-float v3, p3, v3

    const/high16 v4, 0x42700000    # 60.0f

    div-float/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u5206\u6bb5\u6700\u5927\u65f6\u95f4: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    mul-int v3, p0, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 563
    :cond_0
    sget v0, Lo/cgm;->b:I

    int-to-float v0, v0

    sub-float v0, p3, v0

    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr v0, v1

    cmpl-float v0, v0, v6

    if-lez v0, :cond_1

    sget v0, Lo/cgm;->b:I

    int-to-float v0, v0

    sub-float v0, p3, v0

    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr v0, v1

    goto :goto_0

    :cond_1
    move v0, v6

    :goto_0
    move v6, v0

    .line 565
    sget v0, Lo/cgm;->b:I

    int-to-float v7, v0

    .line 567
    sget v0, Lo/cgm;->b:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    const/high16 v0, 0x42700000    # 60.0f

    mul-float/2addr v0, v6

    sget v1, Lo/cgm;->b:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40a00000    # 5.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v8

    goto :goto_1

    :cond_2
    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr v0, v6

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v8

    .line 569
    :goto_1
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v8, :cond_3

    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_2

    :cond_3
    move v0, v8

    :goto_2
    move v8, v0

    .line 570
    const/16 v0, 0x96

    if-lt v8, v0, :cond_4

    .line 571
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--\u539f\u59cb\u6570\u636e\u8fc7\u591a\uff0c\u8fd1\u4f3c\u6570\u636e\u753b\u66f2\u7ebf \u9700\u8981\u624b\u52a8\u8c03\u6574\u6700\u5927\u6700\u5c0f\u503c: \u753b\u7ebf\u7684\u70b9\u4e2a\u6570"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/16 v3, 0x96

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u6700\u5927\u663e\u793a\u65f6\u95f4\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 574
    const/16 v8, 0x96

    .line 575
    const/high16 v0, 0x42700000    # 60.0f

    mul-float/2addr v0, v6

    sget v1, Lo/cgm;->b:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x43160000    # 150.0f

    div-float v7, v0, v1

    goto :goto_3

    .line 577
    :cond_4
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u753b\u7ebf\u7684\u70b9\u4e2a\u6570: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u5b9e\u9645\u6570\u636e\u70b9\u4e2a\u6570\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u6700\u5927\u663e\u793a\u65f6\u95f4\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 581
    :goto_3
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 582
    sget v0, Lo/cgm;->b:I

    int-to-float v0, v0

    sub-float p3, p3, v0

    .line 584
    const/4 v10, 0x0

    :goto_4
    if-ge v10, v8, :cond_a

    .line 585
    int-to-float v0, v10

    mul-float v11, v7, v0

    .line 586
    new-instance v12, Lo/chr;

    const-string v0, ""

    const/4 v1, 0x0

    invoke-direct {v12, v1, v0}, Lo/chr;-><init>(FLjava/lang/String;)V

    .line 587
    cmpl-float v0, v11, p3

    if-lez v0, :cond_5

    .line 588
    new-instance v12, Lo/chr;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/high16 v1, 0x42700000    # 60.0f

    div-float v1, v11, v1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/high16 v1, -0x3d380000    # -100.0f

    invoke-direct {v12, v1, v0}, Lo/chr;-><init>(FLjava/lang/String;)V

    goto/16 :goto_7

    .line 590
    :cond_5
    const/4 v0, 0x2

    new-array v13, v0, [I

    .line 592
    const/4 v0, 0x0

    aget v14, v13, v0

    :goto_5
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v14, v0, :cond_9

    .line 593
    sget v0, Lo/cgm;->b:I

    mul-int/2addr v0, v14

    const/4 v1, 0x1

    aput v0, v13, v1

    .line 594
    const/4 v0, 0x1

    aget v0, v13, v0

    int-to-float v0, v0

    sub-float/2addr v0, v11

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpg-double v0, v0, v2

    if-gez v0, :cond_6

    .line 595
    add-int/lit8 v0, v14, 0x1

    const/4 v1, 0x0

    aput v0, v13, v1

    .line 596
    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo/cgm;->d(Ljava/lang/Object;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v12, v0}, Lo/chr;->b(F)V

    goto/16 :goto_6

    .line 597
    :cond_6
    const/4 v0, 0x1

    aget v0, v13, v0

    int-to-float v0, v0

    cmpg-float v0, v0, v11

    if-gez v0, :cond_8

    .line 598
    add-int/lit8 v0, v14, 0x1

    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v0, v1, :cond_7

    .line 599
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mStepRateList out of bound"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 600
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo/cgm;->d(Ljava/lang/Object;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v12, v0}, Lo/chr;->b(F)V

    goto :goto_6

    .line 603
    :cond_7
    add-int/lit8 v0, v14, 0x1

    sget v1, Lo/cgm;->b:I

    mul-int/2addr v0, v1

    int-to-double v15, v0

    .line 604
    float-to-double v0, v11

    cmpl-double v0, v15, v0

    if-ltz v0, :cond_8

    .line 605
    add-int/lit8 v0, v14, 0x1

    const/4 v1, 0x0

    aput v0, v13, v1

    .line 607
    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo/cgm;->d(Ljava/lang/Object;)I

    move-result v17

    .line 608
    add-int/lit8 v0, v14, 0x1

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lo/cgm;->d(Ljava/lang/Object;)I

    move-result v18

    .line 609
    move/from16 v0, v17

    int-to-double v0, v0

    sub-int v2, v18, v17

    int-to-double v2, v2

    const/4 v4, 0x1

    aget v4, v13, v4

    int-to-double v4, v4

    sub-double v4, v15, v4

    div-double/2addr v2, v4

    const/4 v4, 0x1

    aget v4, v13, v4

    int-to-float v4, v4

    sub-float v4, v11, v4

    float-to-double v4, v4

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v2, v0

    move/from16 v19, v2

    .line 610
    move/from16 v0, v19

    int-to-float v0, v0

    invoke-virtual {v12, v0}, Lo/chr;->b(F)V

    .line 592
    :cond_8
    :goto_6
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_5

    .line 616
    :cond_9
    :goto_7
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 584
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_4

    .line 619
    :cond_a
    move-object/from16 v0, p2

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/cev;

    if-eqz v0, :cond_b

    .line 620
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5fc3\u7387*****===\u5206\u7ec4\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "*****\u6bcf\u7ec4\u65f6\u95f4"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "*****\u5b9e\u9645\u8fd0\u52a8\u65f6\u95f4(\u5206\u949f)\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/high16 v3, 0x42700000    # 60.0f

    div-float v3, p3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u753b\u7ebf\u7684\u70b9\u7684\u65f6\u95f4\u6b65\u8fdbs\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 621
    move-object/from16 v0, p2

    invoke-static {v0, v9}, Lo/cgm;->e(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 622
    move-object/from16 v0, p4

    move/from16 v1, p0

    move/from16 v2, p1

    invoke-virtual {v0, v1, v2, v6}, Lo/chq;->setXnums(IIF)V

    .line 623
    move-object/from16 v0, p4

    const/16 v1, 0xdc

    invoke-virtual {v0, v1}, Lo/chq;->b(I)V

    .line 624
    move-object/from16 v0, p4

    invoke-virtual {v0, v9}, Lo/chq;->e(Ljava/util/List;)V

    .line 625
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5fc3\u7387 \u66f2\u7ebf \u7684\u70b9\u4e2a\u6570>>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_8

    .line 627
    :cond_b
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6b65\u9891*****===\u5206\u7ec4\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "*****\u6bcf\u7ec4\u65f6\u95f4"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "*****\u5b9e\u9645\u8fd0\u52a8\u65f6\u95f4(\u5206\u949f)\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/high16 v3, 0x42700000    # 60.0f

    div-float v3, p3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u753b\u7ebf\u7684\u70b9\u7684\u65f6\u95f4\u6b65\u8fdbs: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 629
    move-object/from16 v0, p2

    invoke-static {v0, v9}, Lo/cgm;->d(Ljava/util/List;Ljava/util/List;)V

    .line 630
    move-object/from16 v0, p4

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/chq;->c(Z)V

    .line 631
    move-object/from16 v0, p4

    move/from16 v1, p0

    move/from16 v2, p1

    invoke-virtual {v0, v1, v2, v6}, Lo/chq;->setXnums(IIF)V

    .line 632
    move-object/from16 v0, p4

    const/16 v1, 0x12c

    invoke-virtual {v0, v1}, Lo/chq;->b(I)V

    .line 633
    move-object/from16 v0, p4

    invoke-virtual {v0, v9}, Lo/chq;->e(Ljava/util/List;)V

    .line 634
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6b65\u9891\u66f2\u7ebf \u5b9e\u9645\u7684\u70b9\u4e2a\u6570>>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 636
    :goto_8
    return-void
.end method

.method public static d(Ljava/util/List;)D
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cfp;>;)D"
        }
    .end annotation

    .line 133
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 134
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0

    .line 136
    :cond_1
    new-instance v0, Lo/cgm$11;

    invoke-direct {v0}, Lo/cgm$11;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfp;

    .line 143
    invoke-virtual {v0}, Lo/cfp;->d()D

    move-result-wide v0

    .line 136
    return-wide v0
.end method

.method private static d(F)I
    .locals 2

    .line 453
    const/high16 v0, 0x40200000    # 2.5f

    add-float/2addr v0, p0

    float-to-int v0, v0

    div-int/lit8 v0, v0, 0x5

    mul-int/lit8 v0, v0, 0x5

    return v0
.end method

.method private static d(Ljava/lang/Object;)I
    .locals 1

    .line 87
    instance-of v0, p0, Lo/cfd;

    if-eqz v0, :cond_0

    .line 88
    move-object v0, p0

    check-cast v0, Lo/cfd;

    invoke-static {v0}, Lo/cgm;->a(Lo/cfd;)I

    move-result v0

    return v0

    .line 90
    :cond_0
    move-object v0, p0

    check-cast v0, Lo/cev;

    invoke-static {v0}, Lo/cgm;->e(Lo/cev;)I

    move-result v0

    return v0
.end method

.method public static d(Ljava/util/ArrayList;II)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/cfd;>;II)Ljava/util/ArrayList<Lo/cfd;>;"
        }
    .end annotation

    .line 668
    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfd;

    invoke-virtual {v0}, Lo/cfd;->e()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/cfd;

    invoke-virtual {v2}, Lo/cfd;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    int-to-long v2, p2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 669
    :cond_0
    return-object p0

    .line 672
    :cond_1
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestStepRateList arrange StepRateList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 673
    const/4 v4, 0x0

    .line 674
    const/4 v5, 0x0

    .line 675
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 676
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_3

    .line 677
    add-int/lit8 v4, v4, 0x1

    .line 678
    invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfd;

    invoke-virtual {v0}, Lo/cfd;->c()I

    move-result v0

    add-int/2addr v5, v0

    .line 679
    const/16 v0, 0xc

    if-ne v4, v0, :cond_2

    .line 680
    invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfd;

    div-int v1, v5, v4

    invoke-virtual {v0, v1}, Lo/cfd;->e(I)V

    .line 681
    invoke-virtual {p0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 682
    const/4 v4, 0x0

    .line 683
    const/4 v5, 0x0

    .line 676
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 686
    :cond_3
    if-eqz v4, :cond_4

    .line 687
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfd;

    div-int/lit8 v1, v5, 0xc

    invoke-virtual {v0, v1}, Lo/cfd;->e(I)V

    .line 688
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 690
    :cond_4
    return-object v6
.end method

.method public static d(Ljava/util/ArrayList;ILo/chq;)V
    .locals 12

    .line 471
    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/cfd;

    if-eqz v0, :cond_2

    .line 472
    :cond_0
    const/16 v0, 0x3c

    sput v0, Lo/cgm;->b:I

    .line 473
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x3c

    int-to-float v4, v0

    .line 474
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_3

    .line 475
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/cfd;

    if-eqz v0, :cond_1

    .line 477
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfd;

    invoke-virtual {v0}, Lo/cfd;->e()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/cfd;

    invoke-virtual {v2}, Lo/cfd;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x9c40

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    .line 478
    const/4 v0, 0x5

    sput v0, Lo/cgm;->b:I

    .line 479
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x5

    int-to-float v4, v0

    goto :goto_0

    .line 482
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cev;

    invoke-virtual {v0}, Lo/cev;->e()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/cev;

    invoke-virtual {v2}, Lo/cev;->e()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x9c40

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    .line 483
    const/4 v0, 0x5

    sput v0, Lo/cgm;->b:I

    .line 484
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x5

    int-to-float v4, v0

    goto :goto_0

    .line 489
    :cond_2
    const/4 v0, 0x5

    sput v0, Lo/cgm;->b:I

    .line 490
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x5

    int-to-float v4, v0

    .line 492
    :cond_3
    :goto_0
    sget v0, Lo/cgm;->b:I

    int-to-float v0, v0

    sub-float v0, v4, v0

    const/high16 v1, 0x42700000    # 60.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v5

    .line 494
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u70b9\u4e2a\u6570\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "*****-\u663e\u793a\u8fd0\u52a8\u603b\u65f6\u957f\uff08\u5206\u949f\uff09\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "...tracktype: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\u91c7\u6837\u95f4\u9694\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget v3, Lo/cgm;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 499
    const/16 v0, 0xf

    if-le v5, v0, :cond_6

    .line 500
    div-int/lit8 v6, v5, 0x5

    .line 501
    div-int/lit8 v7, v5, 0x4

    .line 502
    div-int/lit8 v8, v5, 0x3

    .line 504
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 505
    int-to-float v0, v6

    invoke-static {v0}, Lo/cgm;->d(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x5

    sub-int v0, v5, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 506
    int-to-float v0, v7

    invoke-static {v0}, Lo/cgm;->d(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x4

    sub-int v0, v5, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 507
    int-to-float v0, v8

    invoke-static {v0}, Lo/cgm;->d(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x3

    sub-int v0, v5, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 509
    invoke-static {v9}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/Integer;

    .line 510
    const/4 v11, 0x0

    :goto_1
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v11, v0, :cond_5

    .line 511
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v10, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    if-nez v0, :cond_4

    .line 512
    rsub-int/lit8 v0, v11, 0x5

    int-to-float v1, v5

    rsub-int/lit8 v2, v11, 0x5

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v1}, Lo/cgm;->d(F)I

    move-result v1

    invoke-static {v0, v1, p0, v4, p2}, Lo/cgm;->c(IILjava/util/ArrayList;FLo/chq;)V

    .line 513
    goto :goto_2

    .line 510
    :cond_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 516
    :cond_5
    :goto_2
    goto/16 :goto_4

    :cond_6
    const/4 v0, 0x3

    if-gt v5, v0, :cond_7

    .line 517
    const/4 v0, 0x3

    const/4 v1, 0x1

    invoke-static {v0, v1, p0, v4, p2}, Lo/cgm;->c(IILjava/util/ArrayList;FLo/chq;)V

    goto/16 :goto_4

    .line 520
    :cond_7
    div-int/lit8 v6, v5, 0x5

    .line 521
    div-int/lit8 v7, v5, 0x4

    .line 522
    div-int/lit8 v8, v5, 0x3

    .line 524
    rem-int/lit8 v0, v5, 0x5

    if-nez v0, :cond_8

    .line 525
    const/4 v0, 0x5

    invoke-static {v0, v6, p0, v4, p2}, Lo/cgm;->c(IILjava/util/ArrayList;FLo/chq;)V

    goto/16 :goto_4

    .line 526
    :cond_8
    rem-int/lit8 v0, v5, 0x4

    if-nez v0, :cond_9

    .line 527
    const/4 v0, 0x4

    invoke-static {v0, v7, p0, v4, p2}, Lo/cgm;->c(IILjava/util/ArrayList;FLo/chq;)V

    goto/16 :goto_4

    .line 528
    :cond_9
    rem-int/lit8 v0, v5, 0x3

    if-nez v0, :cond_a

    .line 529
    const/4 v0, 0x3

    invoke-static {v0, v8, p0, v4, p2}, Lo/cgm;->c(IILjava/util/ArrayList;FLo/chq;)V

    goto/16 :goto_4

    .line 531
    :cond_a
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 532
    mul-int/lit8 v0, v6, 0x5

    sub-int v0, v5, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 533
    mul-int/lit8 v0, v7, 0x4

    sub-int v0, v5, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 534
    mul-int/lit8 v0, v8, 0x3

    sub-int v0, v5, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 535
    invoke-static {v9}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/Integer;

    .line 536
    const/4 v11, 0x0

    :goto_3
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v11, v0, :cond_c

    .line 537
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v10, v0}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    if-nez v0, :cond_b

    .line 538
    rsub-int/lit8 v0, v11, 0x5

    rsub-int/lit8 v1, v11, 0x5

    div-int v1, v5, v1

    invoke-static {v0, v1, p0, v4, p2}, Lo/cgm;->c(IILjava/util/ArrayList;FLo/chq;)V

    .line 539
    goto :goto_4

    .line 536
    :cond_b
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    .line 544
    :cond_c
    :goto_4
    return-void
.end method

.method private static d(Ljava/util/List;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cfd;>;Ljava/util/List<Lo/chr;>;)V"
        }
    .end annotation

    .line 42
    new-instance v0, Lo/cgm$2;

    invoke-direct {v0}, Lo/cgm$2;-><init>()V

    invoke-static {p1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/chr;

    .line 49
    new-instance v0, Lo/cgm$9;

    invoke-direct {v0}, Lo/cgm$9;-><init>()V

    invoke-static {p1, v0}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/chr;

    .line 57
    new-instance v0, Lo/cgm$8;

    invoke-direct {v0}, Lo/cgm$8;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cfd;

    .line 64
    new-instance v0, Lo/cgm$7;

    invoke-direct {v0}, Lo/cgm$7;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/cfd;

    .line 71
    invoke-virtual {v5}, Lo/chr;->b()F

    move-result v0

    invoke-static {v6}, Lo/cgm;->a(Lo/cfd;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6b65\u9891\u663e\u793a \u8fd1\u4f3c\u6570\u636e \u624b\u52a8\u6821\u6b63\u6700\u5c0f\u503c "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/chr;->b()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v6}, Lo/cgm;->a(Lo/cfd;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    invoke-static {v6}, Lo/cgm;->a(Lo/cfd;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v5, v0}, Lo/chr;->b(F)V

    .line 75
    :cond_0
    invoke-virtual {v4}, Lo/chr;->b()F

    move-result v0

    invoke-static {v7}, Lo/cgm;->a(Lo/cfd;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_1

    .line 76
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6b65\u9891\u663e\u793a \u8fd1\u4f3c\u6570\u636e \u624b\u52a8\u6821\u6b63\u6700\u5927\u503c "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/chr;->b()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v7}, Lo/cgm;->a(Lo/cfd;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    invoke-static {v7}, Lo/cgm;->a(Lo/cfd;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v4, v0}, Lo/chr;->b(F)V

    .line 79
    :cond_1
    return-void
.end method

.method public static e()I
    .locals 7

    .line 427
    const/4 v4, 0x0

    .line 428
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HeartRate_Classify_Method"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v5

    .line 429
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 431
    :try_start_0
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 434
    goto :goto_0

    .line 432
    :catch_0
    move-exception v6

    .line 433
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " parse userPreference value fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    :cond_0
    :goto_0
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initHeartZoneClassifyMethed   ClassifyMethed  is"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    if-nez v4, :cond_1

    .line 438
    const/4 v0, 0x2

    return v0

    .line 440
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static e(Ljava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cev;>;)I"
        }
    .end annotation

    .line 109
    new-instance v0, Lo/cgm$6;

    invoke-direct {v0}, Lo/cgm$6;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cev;

    invoke-static {v0}, Lo/cgm;->e(Lo/cev;)I

    move-result v0

    return v0
.end method

.method public static e(Lo/cev;)I
    .locals 2

    .line 83
    invoke-virtual {p0}, Lo/cev;->c()I

    move-result v0

    const/16 v1, 0xdc

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lo/cev;->c()I

    move-result v0

    :goto_0
    return v0
.end method

.method public static e(I)Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;
    .locals 8

    .line 323
    sget-object v0, Lo/cgm;->a:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    if-nez v0, :cond_7

    .line 324
    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    .line 325
    const/4 p0, 0x0

    .line 327
    :cond_0
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHeartZoneConf  enter  heartRateType: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    invoke-static {}, Lo/cgm;->b()Lcom/huawei/up/model/UserInfomation;

    move-result-object v4

    .line 329
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getHeartZoneConf enter ,age: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getAge()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    new-instance v5, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v4}, Lcom/huawei/up/model/UserInfomation;->getAge()I

    move-result v0

    invoke-direct {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;-><init>(I)V

    .line 332
    if-nez p0, :cond_2

    .line 333
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HeartRate_Classify_Method"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v6

    .line 334
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 336
    :try_start_0
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move p0, v0

    .line 339
    goto :goto_0

    .line 337
    :catch_0
    move-exception v7

    .line 338
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " parse UserPreference value fail "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    :cond_1
    :goto_0
    invoke-virtual {v5, p0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setClassifyMethod(I)V

    .line 344
    goto :goto_1

    .line 346
    :cond_2
    const/4 v0, 0x2

    if-ne p0, v0, :cond_3

    .line 347
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setClassifyMethod(I)V

    goto :goto_1

    .line 349
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setClassifyMethod(I)V

    .line 352
    :goto_1
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setClassifyMethod   heartRateType"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getClassifyMethod()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 354
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HeartZone_Config"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v6

    .line 355
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 357
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 358
    array-length v0, v7

    const/4 v1, 0x2

    if-ne v1, v0, :cond_4

    .line 359
    const/4 v0, 0x0

    aget-object v0, v7, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHRZoneConf(Ljava/lang/String;)V

    .line 360
    const/4 v0, 0x1

    aget-object v0, v7, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setThreshold(Ljava/lang/String;)V

    .line 363
    :cond_4
    goto :goto_2

    .line 364
    :cond_5
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.UserPreference_HRRHeartZone_Config"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v6

    .line 365
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    .line 367
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    .line 368
    array-length v0, v7

    const/4 v1, 0x2

    if-ne v1, v0, :cond_6

    .line 369
    const/4 v0, 0x0

    aget-object v0, v7, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHRRHRZoneConf(Ljava/lang/String;)V

    .line 370
    const/4 v0, 0x1

    aget-object v0, v7, v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->setHRRThreshold(Ljava/lang/String;)V

    .line 374
    :cond_6
    :goto_2
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartZoneConf "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    sput-object v5, Lo/cgm;->a:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    .line 377
    :cond_7
    sget-object v0, Lo/cgm;->a:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    return-object v0
.end method

.method private static e(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList;Ljava/util/ArrayList<Lo/chr;>;)V"
        }
    .end annotation

    .line 640
    new-instance v0, Lo/cgm$1;

    invoke-direct {v0}, Lo/cgm$1;-><init>()V

    invoke-static {p1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/chr;

    .line 647
    invoke-static {p0}, Lo/cgm;->c(Ljava/util/List;)I

    move-result v0

    int-to-float v5, v0

    .line 649
    invoke-virtual {v4}, Lo/chr;->b()F

    move-result v0

    invoke-static {v0, v5}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_0

    .line 650
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5fc3\u7387\u663e\u793a \u8fd1\u4f3c\u6570\u636e \u624b\u52a8\u6821\u6b63\u6700\u5927\u503c "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lo/chr;->b()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 651
    invoke-virtual {v4, v5}, Lo/chr;->b(F)V

    .line 654
    :cond_0
    new-instance v0, Lo/cgm$4;

    invoke-direct {v0}, Lo/cgm$4;-><init>()V

    invoke-static {p1, v0}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/chr;

    .line 660
    invoke-static {p0}, Lo/cgm;->e(Ljava/util/List;)I

    move-result v7

    .line 661
    invoke-virtual {v6}, Lo/chr;->b()F

    move-result v0

    int-to-float v1, v7

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-eqz v0, :cond_1

    .line 662
    const-string v0, "Track_HeartRateAndStepsUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5fc3\u7387\u663e\u793a \u8fd1\u4f3c\u6570\u636e \u624b\u52a8\u6821\u6b63\u6700\u5c0f\u503c "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lo/chr;->b()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-->"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 663
    int-to-float v0, v7

    invoke-virtual {v6, v0}, Lo/chr;->b(F)V

    .line 665
    :cond_1
    return-void
.end method

.method public static f(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cfj;>;)I"
        }
    .end annotation

    .line 695
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 696
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 698
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 699
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 700
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfj;

    invoke-virtual {v0}, Lo/cfj;->a()I

    move-result v0

    return v0

    .line 704
    :cond_2
    const/4 v2, 0x0

    .line 706
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_4

    .line 707
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/cfj;

    .line 708
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lo/cfj;->a()I

    move-result v0

    if-le v0, v2, :cond_3

    .line 709
    invoke-virtual {v3}, Lo/cfj;->a()I

    move-result v2

    .line 706
    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 712
    :cond_4
    return v2

    .line 715
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public static h(Ljava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cvv;>;)I"
        }
    .end annotation

    .line 187
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 188
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 190
    :cond_1
    new-instance v0, Lo/cgm$3;

    invoke-direct {v0}, Lo/cgm$3;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->min(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cvv;

    .line 196
    invoke-virtual {v0}, Lo/cvv;->e()I

    move-result v0

    .line 190
    return v0
.end method

.method public static i(Ljava/util/List;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cfl;>;)I"
        }
    .end annotation

    .line 720
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 721
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 723
    :cond_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 724
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 725
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfl;

    invoke-virtual {v0}, Lo/cfl;->d()I

    move-result v0

    return v0

    .line 729
    :cond_2
    const v2, 0x7fffffff

    .line 731
    const/4 v3, 0x0

    .line 732
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_4

    .line 733
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfl;

    invoke-virtual {v0}, Lo/cfl;->d()I

    move-result v0

    if-lez v0, :cond_3

    .line 734
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cfl;

    invoke-virtual {v0}, Lo/cfl;->d()I

    move-result v2

    .line 735
    goto :goto_1

    .line 732
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 740
    :cond_4
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v3, v0, :cond_5

    .line 741
    const/4 v0, 0x0

    return v0

    .line 745
    :cond_5
    move v5, v3

    :goto_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_7

    .line 746
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cfl;

    .line 747
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lo/cfl;->d()I

    move-result v0

    if-lez v0, :cond_6

    invoke-virtual {v4}, Lo/cfl;->d()I

    move-result v0

    if-ge v0, v2, :cond_6

    .line 748
    invoke-virtual {v4}, Lo/cfl;->d()I

    move-result v2

    .line 745
    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 752
    :cond_7
    const v0, 0x7fffffff

    if-ne v2, v0, :cond_8

    .line 753
    const/4 v0, 0x0

    return v0

    .line 755
    :cond_8
    return v2

    .line 758
    :cond_9
    const/4 v0, 0x0

    return v0
.end method

.method public static k(Ljava/util/List;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cvv;>;)I"
        }
    .end annotation

    .line 175
    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 176
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 178
    :cond_1
    new-instance v0, Lo/cgm$5;

    invoke-direct {v0}, Lo/cgm$5;-><init>()V

    invoke-static {p0, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/cvv;

    .line 183
    invoke-virtual {v0}, Lo/cvv;->c()I

    move-result v0

    .line 178
    return v0
.end method
