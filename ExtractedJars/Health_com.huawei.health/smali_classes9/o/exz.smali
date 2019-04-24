.class public Lo/exz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejk;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(D)F
    .locals 1

    .line 46
    invoke-static {p0, p1}, Lo/exz;->c(D)F

    move-result v0

    return v0
.end method

.method public static a(Landroid/content/Context;JJ[I[Ljava/lang/String;Lo/ekr;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJ[I[Ljava/lang/String;Lo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 251
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 252
    new-instance v3, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v3}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 253
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 254
    invoke-virtual {v3, p1, p2}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 255
    invoke-virtual {v3, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 256
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 257
    const/4 v0, 0x5

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 258
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 259
    invoke-virtual {v3, p6}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 260
    invoke-virtual {v3, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 261
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 263
    invoke-static {p0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/exz$3;

    invoke-direct {v1, p7, p6}, Lo/exz$3;-><init>(Lo/ekr;[Ljava/lang/String;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 300
    return-void
.end method

.method private b(Ljava/lang/Object;I)Ljava/util/Map;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Object;I)Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;"
        }
    .end annotation

    .line 122
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 123
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 124
    const-string v0, "TrackModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == objData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    return-object v4

    .line 128
    :cond_0
    const/4 v0, 0x7

    if-ne v0, p2, :cond_1

    .line 129
    const-wide/16 v5, 0x0

    goto :goto_0

    .line 130
    :cond_1
    const/4 v0, 0x6

    if-ne v0, p2, :cond_2

    .line 132
    const-wide/32 v5, 0x48190800

    goto :goto_0

    .line 134
    :cond_2
    const-wide/32 v5, 0x2932e00

    .line 136
    :goto_0
    move-object v7, p1

    check-cast v7, Ljava/util/List;

    .line 137
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;

    .line 138
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireMonthZeroTime()J

    move-result-wide v10

    .line 139
    const/4 v0, 0x7

    if-ne v0, p2, :cond_3

    .line 140
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v12

    .line 141
    invoke-virtual {v12, v10, v11}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 142
    const/4 v0, 0x2

    const/4 v1, 0x5

    invoke-virtual {v12, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 143
    const/4 v0, 0x5

    const/16 v1, 0x1e

    invoke-virtual {v12, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 144
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v12, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 145
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v12, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 146
    invoke-virtual {v12}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v10

    .line 148
    :cond_3
    invoke-virtual {v9}, Lcom/huawei/health/suggestion/model/fitness/FitnessTrackRecord;->acquireSumExerciseTime()J

    move-result-wide v0

    long-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x42700000    # 60.0f

    div-float v12, v0, v1

    .line 149
    const-string v0, "TrackModuleChartStorageHelper"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitnessTrackRecords startTime:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "-duringMin:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    add-long v0, v10, v5

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/ehz;

    invoke-direct {v1, v12}, Lo/ehz;-><init>(F)V

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    goto/16 :goto_1

    .line 154
    :cond_4
    return-object v4
.end method

.method public static b(Landroid/content/Context;JJ[I[Ljava/lang/String;Lo/ekr;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJ[I[Ljava/lang/String;Lo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 200
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 201
    new-instance v3, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v3}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 202
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 203
    invoke-virtual {v3, p1, p2}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 204
    invoke-virtual {v3, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 205
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 206
    const/4 v0, 0x6

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 207
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 208
    invoke-virtual {v3, p6}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 209
    invoke-virtual {v3, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 210
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 212
    invoke-static {p0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/exz$2;

    invoke-direct {v1, p7, p6}, Lo/exz$2;-><init>(Lo/ekr;[Ljava/lang/String;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 245
    return-void
.end method

.method private static c(D)F
    .locals 5

    .line 352
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 353
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double v0, p0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    const/4 v4, 0x3

    invoke-static {v2, v3, v4}, Lo/cxh;->a(DI)D

    move-result-wide v2

    mul-double/2addr v0, v2

    double-to-float v0, v0

    return v0

    .line 355
    :cond_0
    double-to-float v0, p0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    return v0
.end method

.method private c(Lo/eic;)I
    .locals 2

    .line 158
    const v1, 0x9c42

    .line 159
    invoke-virtual {p1}, Lo/eic;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 160
    invoke-virtual {p1}, Lo/eic;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 161
    const v1, 0x9c42

    goto/16 :goto_0

    .line 163
    :cond_0
    const/4 v1, 0x2

    goto/16 :goto_0

    .line 165
    :cond_1
    invoke-virtual {p1}, Lo/eic;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 166
    invoke-virtual {p1}, Lo/eic;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 167
    const v1, 0x9c43

    goto :goto_0

    .line 169
    :cond_2
    const/4 v1, 0x4

    goto :goto_0

    .line 172
    :cond_3
    invoke-virtual {p1}, Lo/eic;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 173
    invoke-virtual {p1}, Lo/eic;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 174
    const v1, 0x9c44

    goto :goto_0

    .line 176
    :cond_4
    const/4 v1, 0x3

    goto :goto_0

    .line 178
    :cond_5
    invoke-virtual {p1}, Lo/eic;->k()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 179
    invoke-virtual {p1}, Lo/eic;->i()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 180
    const v1, 0x9c45

    goto :goto_0

    .line 182
    :cond_6
    const/4 v1, 0x5

    goto :goto_0

    .line 184
    :cond_7
    invoke-virtual {p1}, Lo/eic;->o()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 185
    const/16 v1, 0x102

    goto :goto_0

    .line 186
    :cond_8
    invoke-virtual {p1}, Lo/eic;->m()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 187
    const/16 v1, 0x101

    goto :goto_0

    .line 188
    :cond_9
    invoke-virtual {p1}, Lo/eic;->n()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 189
    const/16 v1, 0x103

    goto :goto_0

    .line 190
    :cond_a
    invoke-virtual {p1}, Lo/eic;->r()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 191
    const/16 v1, 0x2711

    .line 193
    :cond_b
    :goto_0
    return v1
.end method

.method private c(JJILo/ekr;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJILo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 112
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    new-instance v6, Lo/exz$1;

    invoke-direct {v6, p0, p5, p6}, Lo/exz$1;-><init>(Lo/exz;ILo/ekr;)V

    invoke-virtual/range {v0 .. v6}, Lo/brt;->b(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 119
    return-void
.end method

.method public static d(Landroid/content/Context;JJ[I[Ljava/lang/String;Lo/ekr;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJ[I[Ljava/lang/String;Lo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 305
    const-string v0, "TrackModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestMonthTrackBarData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 307
    new-instance v5, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v5}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 308
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 309
    invoke-virtual {v5, p1, p2}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 310
    invoke-virtual {v5, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 311
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 312
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 313
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 314
    invoke-virtual {v5, p6}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 315
    invoke-virtual {v5, p5}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 316
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 318
    invoke-static {p0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/exz$4;

    invoke-direct {v1, p7, p6}, Lo/exz$4;-><init>(Lo/ekr;[Ljava/lang/String;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->b(Ljava/util/List;Lo/clx;)V

    .line 346
    return-void
.end method

.method static synthetic e(Lo/exz;Ljava/lang/Object;I)Ljava/util/Map;
    .locals 1

    .line 46
    invoke-direct {p0, p1, p2}, Lo/exz;->b(Ljava/lang/Object;I)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public d(Landroid/content/Context;JJLo/eic;Lo/ehe$a;Lo/ekr;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJLo/eic;Lo/ehe$a;Lo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 55
    move-object/from16 v0, p6

    invoke-direct {p0, v0}, Lo/exz;->c(Lo/eic;)I

    move-result v8

    .line 56
    new-instance v9, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmm"

    invoke-direct {v9, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 57
    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 58
    invoke-static/range {p4 .. p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 59
    const/16 v0, 0x2711

    if-ne v0, v8, :cond_5

    .line 60
    const-string v0, "TrackModuleChartStorageHelper"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-wide/from16 v3, p2

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--startTime :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "dataType:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "-statTimeS:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v10, v1, v2

    const-string v2, "-endTimeS:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x7

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 62
    invoke-virtual/range {p6 .. p6}, Lo/eic;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    move-object v0, p0

    move-wide/from16 v1, p2

    move-wide/from16 v3, p4

    move-object/from16 v6, p8

    const/4 v5, 0x7

    invoke-direct/range {v0 .. v6}, Lo/exz;->c(JJILo/ekr;)V

    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual/range {p6 .. p6}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    move-object v0, p0

    move-wide/from16 v1, p2

    move-wide/from16 v3, p4

    move-object/from16 v6, p8

    const/4 v5, 0x6

    invoke-direct/range {v0 .. v6}, Lo/exz;->c(JJILo/ekr;)V

    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual/range {p6 .. p6}, Lo/eic;->c()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual/range {p6 .. p6}, Lo/eic;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 67
    :cond_2
    move-object v0, p0

    move-wide/from16 v1, p2

    move-wide/from16 v3, p4

    move-object/from16 v6, p8

    const/4 v5, 0x4

    invoke-direct/range {v0 .. v6}, Lo/exz;->c(JJILo/ekr;)V

    goto :goto_0

    .line 69
    :cond_3
    const-string v0, "TrackModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stepDataType error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 72
    :cond_4
    const-string v0, "TrackModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isFitnessCourseDisplay can not be false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    :goto_0
    return-void

    .line 77
    :cond_5
    invoke-virtual/range {p6 .. p6}, Lo/eic;->n()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual/range {p6 .. p6}, Lo/eic;->m()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual/range {p6 .. p6}, Lo/eic;->o()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 80
    :cond_6
    packed-switch v8, :pswitch_data_0

    goto :goto_1

    .line 82
    :pswitch_0
    const/4 v12, 0x1

    new-array v12, v12, [I

    fill-array-data v12, :array_0

    .line 83
    const/4 v0, 0x1

    new-array v13, v0, [Ljava/lang/String;

    const-string v0, "Track_Run_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v13, v1

    .line 84
    goto :goto_2

    .line 86
    :pswitch_1
    const/4 v12, 0x1

    new-array v12, v12, [I

    fill-array-data v12, :array_1

    .line 87
    const/4 v0, 0x1

    new-array v13, v0, [Ljava/lang/String;

    const-string v0, "Track_Walk_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v13, v1

    .line 88
    goto :goto_2

    .line 90
    :pswitch_2
    const/4 v12, 0x1

    new-array v12, v12, [I

    fill-array-data v12, :array_2

    .line 91
    const/4 v0, 0x1

    new-array v13, v0, [Ljava/lang/String;

    const-string v0, "Track_Ride_Distance_Sum"

    const/4 v1, 0x0

    aput-object v0, v13, v1

    .line 92
    goto :goto_2

    .line 94
    :goto_1
    const-string v0, "TrackModuleChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestTrackBarData not supported"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    return-void

    .line 97
    :goto_2
    invoke-virtual/range {p6 .. p6}, Lo/eic;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 98
    move-object v0, p1

    move-wide/from16 v1, p2

    move-wide/from16 v3, p4

    move-object v5, v12

    move-object v6, v13

    move-object/from16 v7, p8

    invoke-static/range {v0 .. v7}, Lo/exz;->b(Landroid/content/Context;JJ[I[Ljava/lang/String;Lo/ekr;)V

    goto :goto_3

    .line 99
    :cond_7
    invoke-virtual/range {p6 .. p6}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 100
    move-object v0, p1

    move-wide/from16 v1, p2

    move-wide/from16 v3, p4

    move-object v5, v12

    move-object v6, v13

    move-object/from16 v7, p8

    invoke-static/range {v0 .. v7}, Lo/exz;->a(Landroid/content/Context;JJ[I[Ljava/lang/String;Lo/ekr;)V

    goto :goto_3

    .line 102
    :cond_8
    move-object v0, p1

    move-wide/from16 v1, p2

    move-wide/from16 v3, p4

    move-object v5, v12

    move-object v6, v13

    move-object/from16 v7, p8

    invoke-static/range {v0 .. v7}, Lo/exz;->d(Landroid/content/Context;JJ[I[Ljava/lang/String;Lo/ekr;)V

    .line 105
    :goto_3
    return-void

    .line 108
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "unsupport Type in TrackModuleChartStorageHelper"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :array_0
    .array-data 4
        0xa476
    .end array-data

    :array_1
    .array-data 4
        0xa444
    .end array-data

    :array_2
    .array-data 4
        0xa4a8
    .end array-data
.end method
