.class Lo/dgz$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgz;->a(JIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic b:J

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Lo/dgz;


# direct methods
.method constructor <init>(Lo/dgz;IJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 208
    iput-object p1, p0, Lo/dgz$2;->e:Lo/dgz;

    iput p2, p0, Lo/dgz$2;->c:I

    iput-wide p3, p0, Lo/dgz$2;->b:J

    iput p5, p0, Lo/dgz$2;->d:I

    iput-object p6, p0, Lo/dgz$2;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 34

    .line 211
    .line 214
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 215
    move-object/from16 v5, p1

    check-cast v5, Landroid/util/SparseArray;

    .line 216
    const/4 v6, 0x0

    .line 218
    const/4 v7, 0x1

    .line 219
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    const/4 v8, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    .line 220
    :goto_0
    if-eqz v8, :cond_2

    .line 221
    const/4 v7, 0x0

    .line 222
    invoke-static {}, Lo/dgz;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dataFlag = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 224
    :cond_2
    const/16 v0, 0x5654

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    .line 225
    move-object v6, v9

    check-cast v6, Ljava/util/List;

    .line 226
    invoke-static {}, Lo/dgz;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sleepDataList is not null,size is :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-nez v6, :cond_3

    const/4 v3, 0x0

    goto :goto_1

    :cond_3
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    :goto_2
    const/16 v9, 0x5657

    .line 231
    const/16 v10, 0x5655

    .line 232
    const/16 v11, 0x5658

    .line 233
    const/16 v12, 0x5656

    .line 234
    const/16 v13, 0x5659

    .line 236
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-lt v1, v0, :cond_5

    :cond_4
    const/4 v14, 0x1

    goto :goto_3

    :cond_5
    const/4 v14, 0x0

    .line 238
    :goto_3
    if-eqz v14, :cond_8

    .line 239
    if-eqz v7, :cond_7

    .line 240
    const/16 v0, 0x55f0

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v15

    .line 241
    move-object v6, v15

    check-cast v6, Ljava/util/List;

    .line 242
    invoke-static {}, Lo/dgz;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getCoreSleepDailyDetail normalSleep is sleepDataList.size  = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-nez v6, :cond_6

    const/4 v3, 0x0

    goto :goto_4

    :cond_6
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    :goto_4
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    :cond_7
    const/16 v9, 0x55f1

    .line 245
    const/16 v10, 0x55f2

    .line 246
    const/16 v11, 0x55f3

    .line 249
    :cond_8
    const/4 v15, 0x0

    .line 250
    const-wide/16 v16, 0x0

    .line 251
    const/16 v18, 0x0

    .line 252
    new-instance v19, Ljava/util/ArrayList;

    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    .line 253
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->clear()V

    .line 254
    new-instance v20, Ljava/util/HashMap;

    invoke-direct/range {v20 .. v20}, Ljava/util/HashMap;-><init>()V

    .line 255
    const/16 v21, 0x0

    :goto_5
    move-object/from16 v0, p0

    iget v0, v0, Lo/dgz$2;->c:I

    move/from16 v1, v21

    if-ge v1, v0, :cond_15

    .line 256
    new-instance v22, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    invoke-direct/range {v22 .. v22}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;-><init>()V

    .line 257
    if-eqz v7, :cond_14

    .line 258
    move-object/from16 v0, p0

    iget-wide v0, v0, Lo/dgz$2;->b:J

    move-object/from16 v2, p0

    iget v2, v2, Lo/dgz$2;->d:I

    mul-int v2, v2, v21

    mul-int/lit8 v2, v2, 0x3c

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long v16, v0, v2

    .line 259
    if-eqz v6, :cond_9

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v15, :cond_9

    .line 260
    invoke-interface {v6, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    const-wide/32 v2, 0xea60

    div-long v2, v16, v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_9

    const/16 v23, 0x1

    goto :goto_6

    :cond_9
    const/16 v23, 0x0

    .line 261
    :goto_6
    if-eqz v23, :cond_14

    .line 262
    invoke-interface {v6, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Lcom/huawei/hihealth/HiHealthData;

    .line 263
    const-string v0, "trackdata_deviceType"

    move-object/from16 v1, v24

    invoke-virtual {v1, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v18

    .line 264
    invoke-virtual/range {v24 .. v24}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    if-ne v9, v0, :cond_a

    .line 265
    move-object/from16 v0, v22

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setType(I)V

    .line 266
    move-object/from16 v0, v22

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setDeepSleepTime(I)V

    goto/16 :goto_8

    .line 268
    :cond_a
    invoke-virtual/range {v24 .. v24}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    if-ne v10, v0, :cond_b

    .line 269
    move-object/from16 v0, v22

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setType(I)V

    .line 270
    move-object/from16 v0, v22

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setShallowSleepTime(I)V

    goto/16 :goto_8

    .line 272
    :cond_b
    invoke-virtual/range {v24 .. v24}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    if-ne v11, v0, :cond_c

    .line 273
    move-object/from16 v0, v22

    const/16 v1, 0xea

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setType(I)V

    .line 274
    move-object/from16 v0, v22

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setWakeupDuration(I)V

    goto/16 :goto_8

    .line 276
    :cond_c
    invoke-virtual/range {v24 .. v24}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    if-ne v12, v0, :cond_d

    .line 277
    move-object/from16 v0, v22

    const/16 v1, 0xec

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setType(I)V

    .line 278
    move-object/from16 v0, v22

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setSlumberSleepTime(I)V

    goto/16 :goto_8

    .line 280
    :cond_d
    invoke-virtual/range {v24 .. v24}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    if-ne v13, v0, :cond_13

    .line 281
    const-string v0, "core_sleep_start_time_key"

    move-object/from16 v1, v20

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_e

    .line 283
    const-string v0, "core_sleep_start_time_key"

    invoke-virtual/range {v24 .. v24}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v2, v20

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    :cond_e
    add-int/lit8 v0, v15, 0x1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_11

    .line 289
    add-int/lit8 v0, v15, 0x1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v25, v0

    check-cast v25, Lcom/huawei/hihealth/HiHealthData;

    .line 290
    invoke-virtual/range {v25 .. v25}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v0

    if-eq v0, v13, :cond_f

    .line 291
    const-string v0, "core_sleep_end_time_key"

    invoke-virtual/range {v24 .. v24}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v2, v20

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 294
    new-instance v20, Ljava/util/HashMap;

    invoke-direct/range {v20 .. v20}, Ljava/util/HashMap;-><init>()V

    goto :goto_7

    .line 296
    :cond_f
    invoke-virtual/range {v25 .. v25}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-virtual/range {v24 .. v24}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_10

    .line 299
    const-string v0, "core_sleep_end_time_key"

    invoke-virtual/range {v24 .. v24}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v2, v20

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 301
    new-instance v20, Ljava/util/HashMap;

    invoke-direct/range {v20 .. v20}, Ljava/util/HashMap;-><init>()V

    goto :goto_7

    .line 303
    :cond_10
    const-string v0, "core_sleep_end_time_key"

    invoke-virtual/range {v25 .. v25}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v2, v20

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    :cond_11
    :goto_7
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v15, v0, :cond_12

    .line 308
    move-object/from16 v0, v19

    move-object/from16 v1, v20

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 310
    :cond_12
    move-object/from16 v0, v22

    const/16 v1, 0xed

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setType(I)V

    .line 311
    move-object/from16 v0, v22

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setNoonSleepTime(I)V

    .line 313
    :cond_13
    :goto_8
    move-object/from16 v0, v22

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setmDeviceId(I)V

    .line 314
    add-int/lit8 v15, v15, 0x1

    .line 317
    :cond_14
    move-object/from16 v0, v22

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 255
    add-int/lit8 v21, v21, 0x1

    goto/16 :goto_5

    .line 320
    :cond_15
    new-instance v21, Ljava/lang/StringBuffer;

    invoke-direct/range {v21 .. v21}, Ljava/lang/StringBuffer;-><init>()V

    .line 321
    new-instance v22, Ljava/lang/StringBuffer;

    invoke-direct/range {v22 .. v22}, Ljava/lang/StringBuffer;-><init>()V

    .line 322
    const/16 v23, 0x0

    :goto_9
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v23

    if-ge v1, v0, :cond_17

    .line 323
    move-object/from16 v0, v19

    move/from16 v1, v23

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v24, v0

    check-cast v24, Ljava/util/Map;

    .line 324
    const-string v0, "core_sleep_start_time_key"

    move-object/from16 v1, v24

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v25

    .line 325
    const-string v0, "core_sleep_end_time_key"

    move-object/from16 v1, v24

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v27

    .line 326
    new-instance v0, Ljava/util/Date;

    move-wide/from16 v1, v25

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    move-object/from16 v29, v0

    .line 327
    invoke-virtual/range {v29 .. v29}, Ljava/util/Date;->getHours()I

    move-result v30

    .line 328
    invoke-virtual/range {v29 .. v29}, Ljava/util/Date;->getMinutes()I

    move-result v31

    .line 329
    move-object/from16 v0, v29

    move-wide/from16 v1, v27

    invoke-virtual {v0, v1, v2}, Ljava/util/Date;->setTime(J)V

    .line 330
    invoke-virtual/range {v29 .. v29}, Ljava/util/Date;->getHours()I

    move-result v32

    .line 331
    invoke-virtual/range {v29 .. v29}, Ljava/util/Date;->getMinutes()I

    move-result v33

    .line 332
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move/from16 v1, v23

    if-ne v1, v0, :cond_16

    .line 333
    move-object/from16 v0, v21

    move-wide/from16 v1, v25

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 334
    move-object/from16 v0, v22

    move-wide/from16 v1, v27

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    goto :goto_a

    .line 336
    :cond_16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v1, v25

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 337
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v1, v27

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 322
    :goto_a
    add-int/lit8 v23, v23, 0x1

    goto/16 :goto_9

    .line 341
    :cond_17
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_18

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_18

    .line 342
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;

    .line 343
    invoke-virtual/range {v21 .. v21}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setNoonStartTime(Ljava/lang/String;)V

    .line 344
    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v23

    invoke-virtual {v1, v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;->setNoonEndTime(Ljava/lang/String;)V

    .line 345
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 346
    const/4 v0, 0x0

    move-object/from16 v1, v23

    invoke-interface {v4, v0, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 350
    :cond_18
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgz$2;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_19

    .line 351
    invoke-static {}, Lo/dgz;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "XXXX dataManager call back success sleepTotalDatas.size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 352
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dgz$2;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 354
    :cond_19
    return-void
.end method
