.class public Lo/ahy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Lo/acu;

.field private d:Lo/abz;


# direct methods
.method public constructor <init>(Lo/acu;Lo/abz;)V
    .locals 0

    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    iput-object p1, p0, Lo/ahy;->b:Lo/acu;

    .line 139
    iput-object p2, p0, Lo/ahy;->d:Lo/abz;

    .line 140
    return-void
.end method

.method private a(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hihealth/HiHealthData;
    .locals 8

    .line 252
    if-nez p1, :cond_0

    .line 253
    const/4 v0, 0x0

    return-object v0

    .line 255
    :cond_0
    iget-object v0, p0, Lo/ahy;->b:Lo/acu;

    if-nez v0, :cond_1

    .line 256
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WiFiWeightSaveHandler convertHeartRateData mCurrentUser is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 257
    const/4 v0, 0x0

    return-object v0

    .line 259
    :cond_1
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "convertHeartRateData DeviceUUID is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 260
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v4

    .line 261
    iget-object v0, p0, Lo/ahy;->b:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v5

    .line 262
    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    .line 263
    const-string v0, "0"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 264
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WiFiWeightSaveHandler convertHeartRateData mCurrentUserId is 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 265
    const/4 v0, 0x0

    return-object v0

    .line 268
    :cond_2
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "0"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 269
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WiFiWeightSaveHandler convertHeartRateData mCurrentUser is not mainUser"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 270
    const/4 v0, 0x0

    return-object v0

    .line 273
    :cond_3
    const/16 v0, 0x7d2

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 274
    const-string v0, "weight_heart_rate"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    .line 275
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WiFiWeightSaveHandler convertHeartRateData mHeartRate is : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 276
    double-to-int v0, v6

    const/4 v1, 0x0

    const/16 v2, 0x12c

    invoke-direct {p0, p1, v0, v1, v2}, Lo/ahy;->c(Lcom/huawei/hihealth/HiHealthData;III)V

    .line 277
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_4

    .line 278
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WiFiWeightSaveHandler convertHeartRateData verifyHeartRateData is less zero"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 279
    const/4 v0, 0x0

    return-object v0

    .line 281
    :cond_4
    return-object p1
.end method

.method private b(Lcom/huawei/hihealth/HiHealthData;)V
    .locals 4

    .line 230
    invoke-direct {p0, p1}, Lo/ahy;->a(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v1

    .line 231
    if-eqz v1, :cond_0

    .line 232
    new-instance v2, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 233
    invoke-virtual {v2, v1}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 234
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setOwnerID(I)V

    .line 235
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v3

    .line 236
    new-instance v0, Lo/ahy$4;

    invoke-direct {v0, p0, v1}, Lo/ahy$4;-><init>(Lo/ahy;Lcom/huawei/hihealth/HiHealthData;)V

    invoke-interface {v3, v2, v0}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 249
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/ahy;)Lo/abz;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/ahy;->d:Lo/abz;

    return-object v0
.end method

.method private c(Lcom/huawei/hihealth/HiHealthData;III)V
    .locals 4

    .line 285
    if-lez p2, :cond_0

    .line 286
    invoke-virtual {p1, p2}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    goto :goto_0

    .line 288
    :cond_0
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "verifyHeartRateData value:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 290
    :goto_0
    if-le p2, p4, :cond_1

    .line 291
    invoke-virtual {p1, p4}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    goto :goto_1

    .line 292
    :cond_1
    if-ge p2, p3, :cond_2

    .line 293
    invoke-virtual {p1, p3}, Lcom/huawei/hihealth/HiHealthData;->setValue(I)V

    .line 295
    :cond_2
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/ahy;Lcom/huawei/hihealth/HiHealthData;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lo/ahy;->b(Lcom/huawei/hihealth/HiHealthData;)V

    return-void
.end method

.method private static c(DDD)Z
    .locals 1

    .line 221
    cmpl-double v0, p0, p4

    if-lez v0, :cond_0

    .line 222
    const/4 v0, 0x0

    return v0

    .line 223
    :cond_0
    cmpg-double v0, p0, p2

    if-gez v0, :cond_1

    .line 224
    const/4 v0, 0x0

    return v0

    .line 226
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static c(Ljava/lang/String;D)Z
    .locals 6

    .line 179
    const-string v0, "weight_bmi"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    move-wide v0, p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 181
    :cond_0
    const-string v0, "weight"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 182
    move-wide v0, p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const-wide v4, 0x407f400000000000L    # 500.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 183
    :cond_1
    const-string v0, "weight_bodyfat"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 184
    move-wide v0, p1

    const-wide/16 v2, 0x0

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 185
    :cond_2
    const-string v0, "weight_water"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 186
    move-wide v0, p1

    const-wide/16 v2, 0x0

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 187
    :cond_3
    const-string v0, "weight_waterrate"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 188
    move-wide v0, p1

    const-wide/16 v2, 0x0

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 189
    :cond_4
    const-string v0, "weight_fatlevel"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 190
    move-wide v0, p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const-wide v4, 0x404d800000000000L    # 59.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 191
    :cond_5
    const-string v0, "weight_muscles"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 192
    move-wide v0, p1

    const-wide/high16 v2, 0x4034000000000000L    # 20.0

    const-wide v4, 0x4051800000000000L    # 70.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 193
    :cond_6
    const-string v0, "weight_bone_mineral"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 194
    move-wide v0, p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 195
    :cond_7
    const-string v0, "weight_protein"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 196
    move-wide v0, p1

    const-wide/16 v2, 0x0

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 197
    :cond_8
    const-string v0, "weight_body_age"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 198
    move-wide v0, p1

    const-wide/high16 v2, 0x4032000000000000L    # 18.0

    const-wide/high16 v4, 0x4054000000000000L    # 80.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 199
    :cond_9
    const-string v0, "weight_body_score"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 200
    move-wide v0, p1

    const-wide/16 v2, 0x0

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 201
    :cond_a
    const-string v0, "weight_heart_rate"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 202
    move-wide v0, p1

    const-wide/16 v2, 0x0

    const-wide v4, 0x4072c00000000000L    # 300.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 203
    :cond_b
    const-string v0, "weight_pressure"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 204
    move-wide v0, p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const-wide v4, 0x4058c00000000000L    # 99.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 205
    :cond_c
    const-string v0, "weight_impedance"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 206
    move-wide v0, p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const-wide v4, 0x40f86a0000000000L    # 100000.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 207
    :cond_d
    const-string v0, "weight_skeletalmusclelmass"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 208
    move-wide v0, p1

    const-wide/high16 v2, 0x4034000000000000L    # 20.0

    const-wide v4, 0x4051800000000000L    # 70.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 209
    :cond_e
    const-string v0, "weight_age"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 210
    move-wide v0, p1

    const-wide/16 v2, 0x0

    const-wide v4, 0x4062c00000000000L    # 150.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 211
    :cond_f
    const-string v0, "weight_gender"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 212
    move-wide v0, p1

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 213
    :cond_10
    const-string v0, "weight_height"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 214
    move-wide v0, p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const-wide v4, 0x4072c00000000000L    # 300.0

    invoke-static/range {v0 .. v5}, Lo/ahy;->c(DDD)Z

    move-result v0

    return v0

    .line 216
    :cond_11
    const/4 v0, 0x1

    return v0
.end method

.method private d(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hihealth/HiHealthData;
    .locals 20

    .line 49
    if-nez p1, :cond_0

    .line 50
    const/4 v0, 0x0

    return-object v0

    .line 52
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahy;->b:Lo/acu;

    if-nez v0, :cond_1

    .line 53
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WiFiWeightSaveHandler convertData mCurrentUser is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 54
    const/4 v0, 0x0

    return-object v0

    .line 56
    :cond_1
    move-object/from16 v0, p1

    const/16 v1, 0x2716

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setType(I)V

    .line 57
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WiFiWeightSaveHandler DeviceUUID is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 58
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WiFiWeightSaveHandler starTime is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 59
    const-string v0, "weight"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    .line 60
    const-string v0, "weight_impedance"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v10

    .line 61
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WiFiWeightSaveHandler weight is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " impedance:"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 62
    const-string v0, "weight_heart_rate"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v12

    .line 63
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WiFiWeightSaveHandler mHeartRate is : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 64
    const-wide/16 v14, 0x0

    .line 65
    const-wide/16 v0, 0x0

    cmpl-double v0, v10, v0

    if-lez v0, :cond_2

    .line 66
    new-instance v16, Lo/kn;

    invoke-direct/range {v16 .. v16}, Lo/kn;-><init>()V

    .line 67
    move-object/from16 v0, v16

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/ahy;->b:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->d()I

    move-result v1

    int-to-float v1, v1

    double-to-float v2, v8

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/ahy;->b:Lo/acu;

    .line 68
    invoke-virtual {v3}, Lo/acu;->c()B

    move-result v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/ahy;->b:Lo/acu;

    invoke-virtual {v4}, Lo/acu;->b()I

    move-result v4

    double-to-float v5, v10

    .line 67
    invoke-virtual/range {v0 .. v5}, Lo/kn;->e(FFBIF)V

    .line 69
    invoke-virtual/range {v16 .. v16}, Lo/kn;->d()F

    move-result v0

    float-to-double v14, v0

    .line 70
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WiFiWeightSaveHandler bodyfatvalue is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14, v15}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 71
    const-string v0, "weight_bodyfat"

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v1, v14, v15, v2, v0}, Lo/ahy;->d(DLcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V

    .line 74
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahy;->b:Lo/acu;

    double-to-float v1, v8

    invoke-virtual {v0, v1}, Lo/acu;->e(F)V

    .line 75
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v16

    .line 76
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahy;->b:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v17

    .line 77
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-ne v0, v1, :cond_3

    .line 78
    const-string v0, "0"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    goto :goto_0

    .line 80
    :cond_3
    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 81
    const-string v0, "0"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    goto :goto_0

    .line 83
    :cond_4
    move-object/from16 v0, p1

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->setMetaData(Ljava/lang/String;)V

    .line 87
    :goto_0
    new-instance v18, Lo/acn;

    invoke-direct/range {v18 .. v18}, Lo/acn;-><init>()V

    .line 89
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahy;->b:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->b()I

    move-result v0

    int-to-double v0, v0

    const-string v2, "weight_age"

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v0, v1, v4, v2}, Lo/ahy;->d(DLcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V

    .line 90
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahy;->b:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->d()I

    move-result v0

    int-to-double v0, v0

    const-string v2, "weight_height"

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v0, v1, v4, v2}, Lo/ahy;->d(DLcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V

    .line 91
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahy;->b:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->c()B

    move-result v0

    int-to-double v0, v0

    const-string v2, "weight_gender"

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v0, v1, v4, v2}, Lo/ahy;->d(DLcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V

    .line 93
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v14, v0

    if-lez v0, :cond_5

    const-wide/16 v0, 0x0

    cmpl-double v0, v10, v0

    if-lez v0, :cond_5

    .line 94
    new-instance v0, Lo/ahl;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/ahy;->b:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->d()I

    move-result v1

    int-to-float v1, v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/ahy;->b:Lo/acu;

    invoke-virtual {v2}, Lo/acu;->f()F

    move-result v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/ahy;->b:Lo/acu;

    invoke-virtual {v3}, Lo/acu;->c()B

    move-result v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/ahy;->b:Lo/acu;

    invoke-virtual {v4}, Lo/acu;->b()I

    move-result v4

    double-to-float v5, v14

    move-wide v6, v10

    invoke-direct/range {v0 .. v7}, Lo/ahl;-><init>(FFBIFD)V

    move-object/from16 v19, v0

    .line 97
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->h()F

    move-result v0

    float-to-double v0, v0

    const-string v2, "weight_bmi"

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v0, v1, v4, v2}, Lo/ahy;->d(DLcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V

    .line 98
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->d()F

    move-result v0

    float-to-double v0, v0

    const-string v2, "weight_bmr"

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v0, v1, v4, v2}, Lo/ahy;->d(DLcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V

    .line 99
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->f()F

    move-result v0

    float-to-double v0, v0

    const-string v2, "weight_body_age"

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v0, v1, v4, v2}, Lo/ahy;->d(DLcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V

    .line 100
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->i()F

    move-result v0

    float-to-double v0, v0

    const-string v2, "weight_body_score"

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v0, v1, v4, v2}, Lo/ahy;->d(DLcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V

    .line 101
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->k()F

    move-result v0

    float-to-double v0, v0

    const-string v2, "weight_bone_mineral"

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v0, v1, v4, v2}, Lo/ahy;->d(DLcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V

    .line 102
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->c()F

    move-result v0

    float-to-double v0, v0

    const-string v2, "weight_muscles"

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v0, v1, v4, v2}, Lo/ahy;->d(DLcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V

    .line 103
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->g()F

    move-result v0

    float-to-double v0, v0

    const-string v2, "weight_protein"

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v0, v1, v4, v2}, Lo/ahy;->d(DLcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V

    .line 104
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->b()F

    move-result v0

    float-to-double v0, v0

    const-string v2, "weight_waterrate"

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v0, v1, v4, v2}, Lo/ahy;->d(DLcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V

    .line 105
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->a()F

    move-result v0

    float-to-double v0, v0

    const-string v2, "weight_fatlevel"

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v0, v1, v4, v2}, Lo/ahy;->d(DLcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V

    .line 106
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->e()F

    move-result v0

    float-to-double v0, v0

    const-string v2, "weight_impedance"

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v0, v1, v4, v2}, Lo/ahy;->d(DLcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V

    .line 107
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->m()F

    move-result v0

    float-to-double v0, v0

    const-string v2, "weight_skeletalmusclelmass"

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v3, v0, v1, v4, v2}, Lo/ahy;->d(DLcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V

    .line 109
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->f()F

    move-result v0

    float-to-double v0, v0

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Lo/acn;->m(D)V

    .line 110
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->i()F

    move-result v0

    float-to-double v0, v0

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Lo/acn;->o(D)V

    .line 111
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->g()F

    move-result v0

    float-to-double v0, v0

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Lo/acn;->n(D)V

    .line 112
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->h()F

    move-result v0

    float-to-double v0, v0

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Lo/acn;->k(D)V

    .line 113
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->d()F

    move-result v0

    float-to-double v0, v0

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Lo/acn;->h(D)V

    .line 114
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->c()F

    move-result v0

    float-to-double v0, v0

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Lo/acn;->p(D)V

    .line 115
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->a()F

    move-result v0

    float-to-double v0, v0

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Lo/acn;->i(D)V

    .line 116
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->k()F

    move-result v0

    float-to-double v0, v0

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Lo/acn;->g(D)V

    .line 117
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->b()F

    move-result v0

    float-to-double v0, v0

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Lo/acn;->f(D)V

    .line 118
    move-object/from16 v0, v18

    invoke-virtual {v0, v12, v13}, Lo/acn;->l(D)V

    .line 119
    invoke-virtual/range {v19 .. v19}, Lo/ahl;->m()F

    move-result v0

    float-to-double v0, v0

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Lo/acn;->r(D)V

    .line 121
    :cond_5
    const-string v0, "trackdata_deviceType"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lo/acn;->a(I)V

    .line 123
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Lo/acn;->a(J)V

    .line 124
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    move-object/from16 v2, v18

    invoke-virtual {v2, v0, v1}, Lo/acn;->c(J)V

    .line 125
    move-object/from16 v0, v18

    invoke-virtual {v0, v14, v15}, Lo/acn;->c(D)V

    .line 126
    move-object/from16 v0, v18

    invoke-virtual {v0, v8, v9}, Lo/acn;->e(D)V

    .line 127
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahy;->b:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->b()I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lo/acn;->b(I)V

    .line 128
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahy;->b:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->d()I

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lo/acn;->d(I)V

    .line 129
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ahy;->b:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->c()B

    move-result v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lo/acn;->a(B)V

    .line 130
    sget-object v0, Lo/act;->a:Lo/act;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/ahy;->b:Lo/acu;

    invoke-virtual {v0, v1}, Lo/act;->c(Lo/acu;)V

    .line 131
    sget-object v0, Lo/acs;->c:Lo/acs;

    move-object/from16 v1, v18

    move-object/from16 v2, v17

    invoke-virtual {v0, v1, v2}, Lo/acs;->a(Lo/acn;Ljava/lang/String;)V

    .line 133
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WiFiWeightSaveHandler endTime is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-object p1
.end method

.method private d(DLcom/huawei/hihealth/HiHealthData;Ljava/lang/String;)V
    .locals 4

    .line 41
    invoke-static {p4, p1, p2}, Lo/ahy;->c(Ljava/lang/String;D)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    invoke-virtual {p3, p4, p1, p2}, Lcom/huawei/hihealth/HiHealthData;->putDouble(Ljava/lang/String;D)V

    goto :goto_0

    .line 44
    :cond_0
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WiFiWeightSaveHandler setData key:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p4, v1, v2

    const-string v2, "value:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 46
    :goto_0
    return-void
.end method

.method private f(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hihealth/data/model/HiStressMetaData;
    .locals 9

    .line 316
    const/4 v4, 0x0

    .line 317
    if-nez p1, :cond_0

    .line 318
    const/4 v0, 0x0

    return-object v0

    .line 320
    :cond_0
    iget-object v0, p0, Lo/ahy;->b:Lo/acu;

    if-nez v0, :cond_1

    .line 321
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WiFiWeightSaveHandler convertPressureData mCurrentUser is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 322
    const/4 v0, 0x0

    return-object v0

    .line 324
    :cond_1
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v5

    .line 325
    iget-object v0, p0, Lo/ahy;->b:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v6

    .line 326
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 327
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 328
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WiFiWeightSaveHandler convertPressureData mCurrentUser is not mainUser"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 329
    const/4 v0, 0x0

    return-object v0

    .line 332
    :cond_2
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WiFiWeightSaveHandler convertPressureData don\'t recognition user ,so don\'t insert pressure data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 333
    const/4 v0, 0x0

    return-object v0

    .line 335
    :cond_3
    const-string v0, "weight_pressure"

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    .line 336
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WiFiWeightSaveHandler convertPressureData mPressure is : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 337
    const-string v0, "weight_pressure"

    invoke-static {v0, v7, v8}, Lo/ahy;->c(Ljava/lang/String;D)Z

    move-result v0

    if-nez v0, :cond_4

    .line 338
    const/4 v0, 0x0

    return-object v0

    .line 340
    :cond_4
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "convert pressure data start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 341
    new-instance v4, Lcom/huawei/hihealth/data/model/HiStressMetaData;

    invoke-direct {v4}, Lcom/huawei/hihealth/data/model/HiStressMetaData;-><init>()V

    .line 342
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_start_time(J)V

    .line 343
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_end_time(J)V

    .line 344
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_measure_type(I)V

    .line 345
    double-to-int v0, v7

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_score(I)V

    .line 346
    double-to-int v0, v7

    invoke-virtual {p0, v0}, Lo/ahy;->e(I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData;->configStress_grade(I)V

    .line 348
    return-object v4
.end method


# virtual methods
.method public c(Lcom/huawei/hihealth/HiHealthData;)V
    .locals 4

    .line 299
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v2

    .line 300
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 301
    const-string v2, "-1"

    .line 303
    :cond_0
    invoke-direct {p0, p1}, Lo/ahy;->f(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hihealth/data/model/HiStressMetaData;

    move-result-object v3

    .line 304
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 305
    invoke-static {}, Lo/dgx;->e()Lo/dgx;

    move-result-object v0

    new-instance v1, Lo/ahy$5;

    invoke-direct {v1, p0}, Lo/ahy$5;-><init>(Lo/ahy;)V

    invoke-virtual {v0, v2, v3, v1}, Lo/dgx;->c(Ljava/lang/String;Lcom/huawei/hihealth/data/model/HiStressMetaData;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 312
    :cond_1
    return-void
.end method

.method public e(I)I
    .locals 2

    .line 353
    const/4 v1, 0x0

    .line 354
    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    const/16 v0, 0x1d

    if-gt p1, v0, :cond_0

    .line 355
    const/4 v1, 0x1

    goto :goto_0

    .line 356
    :cond_0
    const/16 v0, 0x1d

    if-le p1, v0, :cond_1

    const/16 v0, 0x3c

    if-ge p1, v0, :cond_1

    .line 357
    const/4 v1, 0x2

    goto :goto_0

    .line 358
    :cond_1
    const/16 v0, 0x3c

    if-lt p1, v0, :cond_2

    const/16 v0, 0x50

    if-ge p1, v0, :cond_2

    .line 359
    const/4 v1, 0x3

    goto :goto_0

    .line 361
    :cond_2
    const/4 v1, 0x4

    .line 363
    :goto_0
    return v1
.end method

.method public e(Lcom/huawei/hihealth/HiHealthData;)V
    .locals 9

    .line 144
    if-nez p1, :cond_0

    .line 145
    const-string v0, "WiFiWeightSaveHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WiFiWeightSaveHandler onDataChanged parameter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 146
    return-void

    .line 148
    :cond_0
    move-object v4, p1

    .line 149
    move-object v5, p1

    .line 150
    invoke-direct {p0, p1}, Lo/ahy;->d(Lcom/huawei/hihealth/HiHealthData;)Lcom/huawei/hihealth/HiHealthData;

    move-result-object v6

    .line 151
    if-eqz v6, :cond_1

    .line 152
    new-instance v7, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v7}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 153
    invoke-virtual {v7, v6}, Lcom/huawei/hihealth/HiDataInsertOption;->addData(Lcom/huawei/hihealth/HiHealthData;)V

    .line 154
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiHealthData;->setOwnerID(I)V

    .line 155
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v8

    .line 156
    new-instance v0, Lo/ahy$3;

    invoke-direct {v0, p0, v4, v5}, Lo/ahy$3;-><init>(Lo/ahy;Lcom/huawei/hihealth/HiHealthData;Lcom/huawei/hihealth/HiHealthData;)V

    invoke-interface {v8, v7, v0}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 176
    :cond_1
    return-void
.end method
