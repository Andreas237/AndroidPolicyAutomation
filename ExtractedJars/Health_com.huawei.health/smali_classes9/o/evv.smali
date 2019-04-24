.class public Lo/evv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejk;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/util/Date;Ljava/util/List;I)Ljava/util/Map;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Date;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;"
        }
    .end annotation

    .line 321
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 322
    const-wide/32 v7, 0x4d3f6400

    .line 325
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/evv;->b(Ljava/util/Date;)Ljava/util/Date;

    move-result-object p1

    .line 327
    const/4 v9, 0x0

    :goto_0
    move/from16 v0, p3

    if-ge v9, v0, :cond_2

    .line 328
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dbu;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v10

    .line 329
    const/4 v0, -0x1

    invoke-static {v10, v0}, Lo/dbu;->e(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v11

    .line 331
    invoke-static {v11}, Lo/dbu;->p(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v11

    .line 332
    invoke-static/range {p1 .. p1}, Lo/dbu;->i(Ljava/util/Date;)J

    move-result-wide v12

    .line 333
    invoke-static {v11}, Lo/dbu;->i(Ljava/util/Date;)J

    move-result-wide v14

    .line 334
    const/16 v16, 0x0

    .line 335
    const-wide/16 v17, 0x0

    .line 337
    move-object/from16 v0, p0

    move-wide v1, v12

    move-wide v3, v14

    move-object/from16 v5, p2

    invoke-direct/range {v0 .. v5}, Lo/evv;->e(JJLjava/util/List;)Ljava/util/List;

    move-result-object v19

    .line 339
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v20

    .line 340
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 341
    const/16 v21, 0x0

    :goto_1
    move/from16 v0, v21

    move/from16 v1, v20

    if-ge v0, v1, :cond_0

    .line 342
    move-object/from16 v0, v19

    move/from16 v1, v21

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lcom/huawei/hihealth/HiHealthData;

    .line 343
    invoke-virtual/range {v22 .. v22}, Lcom/huawei/hihealth/HiHealthData;->getIntValue()I

    move-result v23

    .line 344
    add-int v16, v16, v23

    .line 341
    add-int/lit8 v21, v21, 0x1

    goto :goto_1

    .line 346
    :cond_0
    move/from16 v0, v16

    int-to-float v0, v0

    move/from16 v1, v20

    int-to-float v1, v1

    div-float/2addr v0, v1

    float-to-int v1, v0

    move/from16 v16, v1

    .line 347
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lo/evv;->d(Ljava/util/Date;)J

    move-result-wide v17

    .line 348
    add-long v0, v17, v7

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Lo/eis;

    move/from16 v2, v16

    int-to-float v2, v2

    invoke-direct {v1, v2}, Lo/eis;-><init>(F)V

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    :cond_1
    move-object/from16 p1, v10

    .line 327
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_0

    .line 352
    :cond_2
    return-object v6
.end method

.method private a(Landroid/content/Context;JJLo/ekr;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJLo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 241
    new-instance v8, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v8}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 242
    invoke-virtual {v8, p2, p3}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 243
    invoke-virtual {v8, p4, p5}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 245
    const/4 v0, 0x1

    new-array v9, v0, [I

    .line 246
    const v0, 0xad12

    const/4 v1, 0x0

    aput v0, v9, v1

    .line 247
    invoke-virtual {v8, v9}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 248
    invoke-static {p1}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/evv$2;

    move-object v2, p0

    move-object/from16 v3, p6

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lo/evv$2;-><init>(Lo/evv;Lo/ekr;JJ)V

    invoke-virtual {v0, v8, v1}, Lo/clq;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 280
    return-void
.end method

.method static synthetic a(Lo/evv;Ljava/util/List;Lo/ekr;JJ)V
    .locals 0

    .line 32
    invoke-direct/range {p0 .. p6}, Lo/evv;->d(Ljava/util/List;Lo/ekr;JJ)V

    return-void
.end method

.method private b(Ljava/util/Date;)Ljava/util/Date;
    .locals 3

    .line 313
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 314
    invoke-virtual {v2, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 315
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 316
    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/util/Date;)J
    .locals 9

    .line 296
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    .line 297
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMM"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 298
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 300
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 302
    :try_start_0
    invoke-virtual {v6, v7}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    .line 304
    :catch_0
    move-exception v8

    .line 306
    const-string v0, "PressureLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireMonthZeroTimeFromDate, wrong parse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private d(Landroid/content/Context;JJLo/ekr;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJLo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 189
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 190
    invoke-virtual {v2, p2, p3}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 191
    invoke-virtual {v2, p4, p5}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 192
    const/4 v0, 0x1

    new-array v3, v0, [I

    .line 193
    const v0, 0xad12

    const/4 v1, 0x0

    aput v0, v3, v1

    .line 194
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 195
    invoke-static {p1}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/evv$1;

    invoke-direct {v1, p0, p6}, Lo/evv$1;-><init>(Lo/evv;Lo/ekr;)V

    invoke-virtual {v0, v2, v1}, Lo/clq;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 238
    return-void
.end method

.method private d(Ljava/util/List;Lo/ekr;JJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;JJ)V"
        }
    .end annotation

    .line 283
    const-wide v2, 0x9a7ec800L

    .line 284
    sub-long v0, p5, p3

    div-long/2addr v0, v2

    long-to-int v4, v0

    .line 287
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6, p3, p4}, Ljava/util/Date;-><init>(J)V

    .line 288
    invoke-direct {p0, v6, p1, v4}, Lo/evv;->a(Ljava/util/Date;Ljava/util/List;I)Ljava/util/Map;

    move-result-object v5

    .line 290
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 291
    const/4 v0, 0x0

    invoke-interface {p2, v0, v5}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 293
    :cond_0
    return-void
.end method

.method private e(JJLjava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJLjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 356
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 357
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 358
    invoke-interface {p5, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v6, v0, v2

    .line 359
    cmp-long v0, v6, p1

    if-ltz v0, :cond_0

    cmp-long v0, v6, p3

    if-gtz v0, :cond_0

    .line 360
    invoke-interface {p5, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 357
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 364
    :cond_1
    return-object v4
.end method

.method private e(Landroid/content/Context;JJLo/ekr;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJLo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 74
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 75
    invoke-virtual {v2, p2, p3}, Lcom/huawei/hihealth/HiDataReadOption;->setStartTime(J)V

    .line 76
    invoke-virtual {v2, p4, p5}, Lcom/huawei/hihealth/HiDataReadOption;->setEndTime(J)V

    .line 77
    const/4 v0, 0x1

    new-array v3, v0, [I

    .line 78
    const/16 v0, 0x7f2

    const/4 v1, 0x0

    aput v0, v3, v1

    .line 79
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 81
    invoke-static {p1}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/evv$4;

    invoke-direct {v1, p0, p6}, Lo/evv$4;-><init>(Lo/evv;Lo/ekr;)V

    invoke-virtual {v0, v2, v1}, Lo/clq;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 186
    return-void
.end method


# virtual methods
.method public d(Landroid/content/Context;JJLo/eic;Lo/ehe$a;Lo/ekr;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;JJLo/eic;Lo/ehe$a;Lo/ekr<Ljava/util/Map<Ljava/lang/Long;Lo/ejp;>;>;)V"
        }
    .end annotation

    .line 39
    invoke-virtual/range {p6 .. p6}, Lo/eic;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 41
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 42
    invoke-virtual {v7, p2, p3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 43
    const/16 v0, 0xb

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v8

    .line 44
    const/16 v0, 0xc

    invoke-virtual {v7, v0}, Ljava/util/Calendar;->get(I)I

    move-result v9

    .line 45
    if-nez v8, :cond_0

    if-eqz v9, :cond_1

    .line 46
    :cond_0
    move-object/from16 v0, p8

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/ekr;->b(ILjava/lang/Object;)V

    .line 47
    return-void

    .line 51
    :cond_1
    sget-object v0, Lo/evv$5;->a:[I

    invoke-virtual/range {p6 .. p6}, Lo/eic;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 53
    :pswitch_0
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object/from16 v6, p8

    invoke-direct/range {v0 .. v6}, Lo/evv;->e(Landroid/content/Context;JJLo/ekr;)V

    .line 55
    goto :goto_0

    .line 57
    :pswitch_1
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object/from16 v6, p8

    invoke-direct/range {v0 .. v6}, Lo/evv;->d(Landroid/content/Context;JJLo/ekr;)V

    .line 59
    goto :goto_0

    .line 61
    :pswitch_2
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object/from16 v6, p8

    invoke-direct/range {v0 .. v6}, Lo/evv;->d(Landroid/content/Context;JJLo/ekr;)V

    .line 63
    goto :goto_0

    .line 65
    :pswitch_3
    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object/from16 v6, p8

    invoke-direct/range {v0 .. v6}, Lo/evv;->a(Landroid/content/Context;JJLo/ekr;)V

    .line 67
    .line 71
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
