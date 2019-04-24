.class public Lo/dxb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile b:Lo/dxb;


# instance fields
.field private d:Z

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dxb;->d:Z

    .line 69
    if-nez p1, :cond_0

    .line 70
    return-void

    .line 72
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dxb;->e:Landroid/content/Context;

    .line 73
    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/dxb;
    .locals 4

    .line 58
    sget-object v0, Lo/dxb;->b:Lo/dxb;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 59
    const-class v2, Lo/dxb;

    monitor-enter v2

    .line 60
    :try_start_0
    sget-object v0, Lo/dxb;->b:Lo/dxb;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 61
    new-instance v0, Lo/dxb;

    invoke-direct {v0, p0}, Lo/dxb;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dxb;->b:Lo/dxb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 65
    :cond_1
    :goto_0
    sget-object v0, Lo/dxb;->b:Lo/dxb;

    return-object v0
.end method

.method private a(Ljava/lang/String;JJII)Z
    .locals 2

    .line 281
    new-instance v1, Lo/dwl;

    invoke-direct {v1}, Lo/dwl;-><init>()V

    .line 282
    invoke-virtual {v1, p1}, Lo/dwl;->c(Ljava/lang/String;)V

    .line 283
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dwl;->a(Ljava/lang/Long;)V

    .line 284
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dwl;->e(Ljava/lang/Long;)V

    .line 285
    invoke-virtual {v1, p6}, Lo/dwl;->b(I)V

    .line 286
    invoke-virtual {v1, p7}, Lo/dwl;->a(I)V

    .line 287
    iget-object v0, p0, Lo/dxb;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwr;->a()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dwl;->setHuid(Ljava/lang/String;)V

    .line 288
    iget-object v0, p0, Lo/dxb;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/dwn;->c(Lo/dvf;)Z

    move-result v0

    return v0
.end method

.method private b(IJJILjava/util/Map;IIIIILjava/util/Map;)Z
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJILjava/util/Map<Ljava/lang/Long;Ljava/lang/Integer;>;IIIIILjava/util/Map<Ljava/lang/Long;Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 240
    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 241
    new-instance v8, Lo/dwg;

    invoke-direct {v8}, Lo/dwg;-><init>()V

    .line 242
    invoke-virtual {v8, p2, p3}, Lo/dwg;->d(J)V

    .line 243
    move-wide v0, p4

    invoke-virtual {v8, v0, v1}, Lo/dwg;->b(J)V

    .line 244
    move/from16 v0, p6

    invoke-virtual {v8, v0}, Lo/dwg;->c(I)V

    .line 245
    move-object/from16 v0, p7

    invoke-virtual {v8, v0}, Lo/dwg;->b(Ljava/util/Map;)V

    .line 246
    move/from16 v0, p8

    invoke-virtual {v8, v0}, Lo/dwg;->d(I)V

    .line 247
    move/from16 v0, p9

    invoke-virtual {v8, v0}, Lo/dwg;->e(I)V

    .line 248
    move/from16 v0, p8

    int-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dty;->a(DI)D

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/dwg;->e(D)V

    .line 250
    move/from16 v0, p10

    invoke-virtual {v8, v0}, Lo/dwg;->a(I)V

    .line 251
    move/from16 v0, p11

    invoke-virtual {v8, v0}, Lo/dwg;->b(I)V

    .line 252
    move/from16 v0, p12

    invoke-virtual {v8, v0}, Lo/dwg;->g(I)V

    .line 253
    move-object/from16 v0, p13

    invoke-virtual {v8, v0}, Lo/dwg;->c(Ljava/util/Map;)V

    .line 254
    move/from16 v0, p12

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lo/dty;->e(II)D

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/dwg;->a(D)V

    .line 255
    new-instance v9, Lcom/google/gson/Gson;

    invoke-direct {v9}, Lcom/google/gson/Gson;-><init>()V

    .line 256
    invoke-virtual {v9, v8}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 257
    move-object v0, p0

    move-object v1, v10

    move-wide v2, p2

    move-wide v4, p4

    const/4 v6, 0x1

    const/4 v7, 0x2

    invoke-direct/range {v0 .. v7}, Lo/dxb;->a(Ljava/lang/String;JJII)Z

    move-result v0

    return v0

    .line 260
    :cond_0
    new-instance v8, Lo/dwf;

    invoke-direct {v8}, Lo/dwf;-><init>()V

    .line 261
    invoke-virtual {v8, p2, p3}, Lo/dwf;->d(J)V

    .line 262
    move-wide v0, p4

    invoke-virtual {v8, v0, v1}, Lo/dwf;->e(J)V

    .line 263
    move/from16 v0, p6

    invoke-virtual {v8, v0}, Lo/dwf;->d(I)V

    .line 264
    move-object/from16 v0, p7

    invoke-virtual {v8, v0}, Lo/dwf;->d(Ljava/util/Map;)V

    .line 265
    move/from16 v0, p8

    invoke-virtual {v8, v0}, Lo/dwf;->a(I)V

    .line 266
    move/from16 v0, p9

    invoke-virtual {v8, v0}, Lo/dwf;->b(I)V

    .line 267
    move/from16 v0, p8

    int-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/dty;->a(DI)D

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/dwf;->d(D)V

    .line 269
    move/from16 v0, p10

    invoke-virtual {v8, v0}, Lo/dwf;->e(I)V

    .line 270
    move/from16 v0, p11

    invoke-virtual {v8, v0}, Lo/dwf;->c(I)V

    .line 271
    move/from16 v0, p12

    invoke-virtual {v8, v0}, Lo/dwf;->i(I)V

    .line 272
    move-object/from16 v0, p13

    invoke-virtual {v8, v0}, Lo/dwf;->a(Ljava/util/Map;)V

    .line 273
    invoke-static {p2, p3}, Lo/dzk;->b(J)I

    move-result v0

    move/from16 v1, p12

    invoke-static {v1, v0}, Lo/dty;->e(II)D

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lo/dwf;->c(D)V

    .line 274
    new-instance v9, Lcom/google/gson/Gson;

    invoke-direct {v9}, Lcom/google/gson/Gson;-><init>()V

    .line 275
    invoke-virtual {v9, v8}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 276
    move-object v0, p0

    move-object v1, v10

    move-wide v2, p2

    move-wide v4, p4

    const/4 v6, 0x2

    const/4 v7, 0x2

    invoke-direct/range {v0 .. v7}, Lo/dxb;->a(Ljava/lang/String;JJII)Z

    move-result v0

    return v0
.end method

.method private c()V
    .locals 3

    .line 78
    new-instance v1, Lo/dwl;

    invoke-direct {v1}, Lo/dwl;-><init>()V

    .line 79
    iget-object v0, p0, Lo/dxb;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dwr;->b(Landroid/content/Context;)Lo/dwr;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwr;->a()Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v2

    .line 80
    invoke-virtual {v2}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/dwl;->setHuid(Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lo/dxb;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dwn;->c(Landroid/content/Context;)Lo/dwn;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/dwn;->e(Lo/dvf;)Z

    .line 82
    return-void
.end method

.method private d(JI)J
    .locals 3

    .line 419
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 420
    invoke-virtual {v2, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 421
    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    .line 422
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->getMinimum(I)I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 423
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 424
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 425
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 426
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 427
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0

    .line 429
    :cond_0
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->getActualMaximum(I)I

    move-result v0

    const/4 v1, 0x5

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->set(II)V

    .line 430
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 431
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 432
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 433
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 434
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic d(Lo/dxb;ILjava/util/List;Lo/duh;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2, p3}, Lo/dxb;->e(ILjava/util/List;Lo/duh;)V

    return-void
.end method

.method private e(ILjava/util/List;Lo/duh;)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lo/duh;)V"
        }
    .end annotation

    .line 131
    const-string v0, "PLGACHIEVE_AchieveReportDataService"

    const-string v1, "Enter dataClassification "

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    if-eqz p2, :cond_0

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 133
    :cond_0
    return-void

    .line 135
    :cond_1
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 136
    const/4 v15, 0x0

    :goto_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge v15, v0, :cond_2

    .line 137
    move-object/from16 v0, p2

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 136
    add-int/lit8 v15, v15, 0x1

    goto :goto_0

    .line 141
    :cond_2
    move/from16 v0, p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 142
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move-object/from16 v2, p0

    iget-boolean v2, v2, Lo/dxb;->d:Z

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, Lo/dzk;->d(JIZ)J

    move-result-wide v17

    goto :goto_1

    .line 144
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move-object/from16 v2, p0

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lo/dxb;->d(JI)J

    move-result-wide v17

    .line 146
    :goto_1
    const-string v0, "PLGACHIEVE_AchieveReportDataService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AchieveReport_dataClassification currentStartTime"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-wide/from16 v2, v17

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    const/16 v19, 0x0

    :goto_2
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v19

    if-ge v1, v0, :cond_5

    .line 148
    move/from16 v0, v19

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v15

    .line 149
    cmp-long v0, v15, v17

    if-ltz v0, :cond_4

    .line 150
    move/from16 v0, v19

    invoke-interface {v14, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 151
    add-int/lit8 v19, v19, -0x1

    .line 147
    :cond_4
    add-int/lit8 v19, v19, 0x1

    goto :goto_2

    .line 155
    :cond_5
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_6

    .line 156
    const-string v0, "PLGACHIEVE_AchieveReportDataService"

    const-string v1, "classificationList.size()<= 0"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    return-void

    .line 161
    :cond_6
    move/from16 v0, p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    .line 162
    const/4 v0, 0x0

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    move-object/from16 v2, p0

    iget-boolean v2, v2, Lo/dxb;->d:Z

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, Lo/dzk;->d(JIZ)J

    move-result-wide v19

    .line 163
    const/4 v0, 0x0

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    move-object/from16 v2, p0

    iget-boolean v2, v2, Lo/dxb;->d:Z

    const/4 v3, 0x2

    invoke-static {v0, v1, v3, v2}, Lo/dzk;->d(JIZ)J

    move-result-wide v21

    goto :goto_3

    .line 165
    :cond_7
    const/4 v0, 0x0

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    move-object/from16 v2, p0

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Lo/dxb;->d(JI)J

    move-result-wide v19

    .line 166
    const/4 v0, 0x0

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    move-object/from16 v2, p0

    const/4 v3, 0x2

    invoke-direct {v2, v0, v1, v3}, Lo/dxb;->d(JI)J

    move-result-wide v21

    .line 168
    :goto_3
    const-string v0, "PLGACHIEVE_AchieveReportDataService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AchieveReport_dataClassification startTime"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-wide/from16 v2, v19

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    const-string v0, "PLGACHIEVE_AchieveReportDataService"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AchieveReport_dataClassification endTime"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-wide/from16 v2, v21

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    new-instance v23, Ljava/util/LinkedHashMap;

    invoke-direct/range {v23 .. v23}, Ljava/util/LinkedHashMap;-><init>()V

    .line 171
    new-instance v24, Ljava/util/LinkedHashMap;

    invoke-direct/range {v24 .. v24}, Ljava/util/LinkedHashMap;-><init>()V

    .line 172
    const/16 v25, 0x0

    .line 173
    const/16 v26, 0x0

    .line 174
    const/16 v27, 0x0

    .line 175
    const/16 v28, 0x0

    .line 176
    const/16 v29, 0x0

    .line 177
    const/16 v30, 0x0

    .line 178
    const/4 v0, 0x0

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "sport_walk_step_sum"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v31

    .line 179
    const/16 v32, 0x0

    .line 180
    const/16 v33, 0x0

    :goto_4
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v33

    if-ge v1, v0, :cond_f

    .line 181
    move/from16 v0, v33

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v0, v0, v21

    if-gtz v0, :cond_b

    move/from16 v0, v33

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long v0, v0, v19

    if-ltz v0, :cond_b

    .line 182
    move/from16 v0, v33

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move/from16 v1, v33

    invoke-interface {v14, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    const-string v2, "Track_Run_Distance_Sum"

    invoke-virtual {v1, v2}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v23

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    move/from16 v0, v33

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "Track_Run_Duration_Sum"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int v25, v25, v0

    .line 184
    move/from16 v0, v33

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "Track_Run_Distance_Sum"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int v26, v26, v0

    .line 185
    move/from16 v0, v33

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "Track_Run_Count_Sum"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 186
    move/from16 v1, v33

    invoke-interface {v14, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    const-string v2, "Track_Run_Abnormal_Count_Sum"

    invoke-virtual {v1, v2}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v1

    sub-int/2addr v0, v1

    add-int v27, v27, v0

    .line 187
    move/from16 v0, v33

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "start_time"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move/from16 v1, v33

    invoke-interface {v14, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/HiHealthData;

    const-string v2, "sport_walk_step_sum"

    invoke-virtual {v1, v2}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v24

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    move/from16 v0, v33

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "sport_walk_step_sum"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    move/from16 v1, v31

    if-le v0, v1, :cond_8

    .line 189
    move/from16 v0, v33

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "sport_walk_step_sum"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v31

    .line 191
    :cond_8
    move/from16 v0, v33

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "sport_walk_step_sum"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    add-int v28, v28, v0

    .line 192
    move/from16 v0, v33

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    const-string v1, "sport_walk_step_sum"

    invoke-virtual {v0, v1}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_9

    .line 193
    add-int/lit8 v29, v29, 0x1

    .line 195
    :cond_9
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move/from16 v1, v33

    if-ne v1, v0, :cond_e

    .line 196
    if-eqz v29, :cond_a

    .line 197
    move/from16 v0, v28

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    move/from16 v1, v29

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v30

    .line 199
    :cond_a
    move-object/from16 v0, p0

    move/from16 v1, p1

    move-wide/from16 v2, v19

    move-wide/from16 v4, v21

    move/from16 v6, v25

    move-object/from16 v7, v23

    move/from16 v8, v26

    move/from16 v9, v27

    move/from16 v10, v30

    move/from16 v11, v31

    move/from16 v12, v28

    move-object/from16 v13, v24

    invoke-direct/range {v0 .. v13}, Lo/dxb;->b(IJJILjava/util/Map;IIIIILjava/util/Map;)Z

    move-result v32

    goto/16 :goto_6

    .line 202
    :cond_b
    if-eqz v29, :cond_c

    .line 203
    move/from16 v0, v28

    int-to-float v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    move/from16 v1, v29

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v30

    .line 205
    :cond_c
    move-object/from16 v0, p0

    move/from16 v1, p1

    move-wide/from16 v2, v19

    move-wide/from16 v4, v21

    move/from16 v6, v25

    move-object/from16 v7, v23

    move/from16 v8, v26

    move/from16 v9, v27

    move/from16 v10, v30

    move/from16 v11, v31

    move/from16 v12, v28

    move-object/from16 v13, v24

    invoke-direct/range {v0 .. v13}, Lo/dxb;->b(IJJILjava/util/Map;IIIIILjava/util/Map;)Z

    move-result v32

    .line 206
    const/16 v25, 0x0

    .line 207
    const/16 v26, 0x0

    .line 208
    const/16 v27, 0x0

    .line 209
    const/16 v28, 0x0

    .line 210
    new-instance v23, Ljava/util/LinkedHashMap;

    invoke-direct/range {v23 .. v23}, Ljava/util/LinkedHashMap;-><init>()V

    .line 211
    new-instance v24, Ljava/util/LinkedHashMap;

    invoke-direct/range {v24 .. v24}, Ljava/util/LinkedHashMap;-><init>()V

    .line 212
    const/16 v31, 0x0

    .line 213
    const/16 v29, 0x0

    .line 214
    const/16 v30, 0x0

    .line 215
    move/from16 v0, p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_d

    .line 216
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/dxb;->d:Z

    const/4 v1, 0x1

    const/4 v2, 0x1

    move-wide/from16 v3, v19

    invoke-static {v1, v2, v3, v4, v0}, Lo/dzk;->b(IIJZ)J

    move-result-wide v19

    .line 217
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/dxb;->d:Z

    const/4 v1, 0x2

    const/4 v2, 0x1

    move-wide/from16 v3, v21

    invoke-static {v1, v2, v3, v4, v0}, Lo/dzk;->b(IIJZ)J

    move-result-wide v21

    goto :goto_5

    .line 219
    :cond_d
    const/4 v0, -0x1

    move-wide/from16 v1, v19

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/dzk;->c(IJI)J

    move-result-wide v19

    .line 220
    const/4 v0, -0x1

    move-wide/from16 v1, v21

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/dzk;->c(IJI)J

    move-result-wide v21

    .line 222
    :goto_5
    add-int/lit8 v33, v33, -0x1

    .line 180
    :cond_e
    :goto_6
    add-int/lit8 v33, v33, 0x1

    goto/16 :goto_4

    .line 225
    :cond_f
    if-eqz v32, :cond_11

    .line 226
    const/4 v0, 0x0

    move-object/from16 v1, p3

    if-eq v0, v1, :cond_10

    .line 227
    invoke-static/range {v32 .. v32}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v1, p3

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 229
    :cond_10
    new-instance v33, Landroid/content/Intent;

    invoke-direct/range {v33 .. v33}, Landroid/content/Intent;-><init>()V

    .line 230
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dxb;->e:Landroid/content/Context;

    const-string v1, "com.huawei.health.action.UPDATE_UI_CHART"

    move-object/from16 v2, v33

    invoke-virtual {v2, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dbg;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 231
    goto :goto_7

    .line 232
    :cond_11
    const/4 v0, 0x0

    move-object/from16 v1, p3

    if-eq v0, v1, :cond_12

    .line 233
    invoke-static/range {v32 .. v32}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v1, p3

    const/4 v2, -0x1

    invoke-interface {v1, v2, v0}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 236
    :cond_12
    :goto_7
    return-void
.end method


# virtual methods
.method public b(JJILo/duh;)V
    .locals 11

    .line 85
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dxb;->d:Z

    goto :goto_0

    .line 88
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dxb;->d:Z

    .line 90
    :goto_0
    iget-object v0, p0, Lo/dxb;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    if-nez v0, :cond_1

    .line 91
    const-string v0, "PLGACHIEVE_AchieveReportDataService"

    const-string v1, "PluginAchieve.getInstance(mContext).getAdapter() is null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    return-void

    .line 94
    :cond_1
    iget-object v0, p0, Lo/dxb;->e:Landroid/content/Context;

    const-string v1, "reportTimeZone"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 95
    invoke-static {}, Lo/dzo;->b()Ljava/lang/String;

    move-result-object v10

    .line 96
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 97
    iget-object v0, p0, Lo/dxb;->e:Landroid/content/Context;

    const-string v1, "reportTimeZone"

    invoke-static {v0, v1, v10}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    invoke-direct {p0}, Lo/dxb;->c()V

    goto :goto_1

    .line 100
    :cond_2
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 101
    const-string v0, "PLGACHIEVE_AchieveReportDataService"

    const-string v1, "TimeZone changed"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    invoke-direct {p0}, Lo/dxb;->c()V

    .line 103
    iget-object v0, p0, Lo/dxb;->e:Landroid/content/Context;

    const-string v1, "reportTimeZone"

    invoke-static {v0, v1, v10}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    :cond_3
    :goto_1
    iget-object v0, p0, Lo/dxb;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    iget-object v1, p0, Lo/dxb;->e:Landroid/content/Context;

    move-wide v2, p1

    move-wide v4, p3

    move/from16 v6, p5

    new-instance v7, Lo/dxb$1;

    move-object/from16 v8, p6

    invoke-direct {v7, p0, v8}, Lo/dxb$1;-><init>(Lo/dxb;Lo/duh;)V

    invoke-interface/range {v0 .. v7}, Lo/dti;->d(Landroid/content/Context;JJILo/duh;)V

    .line 122
    return-void
.end method
