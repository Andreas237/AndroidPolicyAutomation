.class public Lo/dlu;
.super Lo/dlv;
.source "SourceFile"


# instance fields
.field private a:Lo/dll;

.field private d:Lo/dln;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 56
    invoke-direct {p0, p1}, Lo/dlv;-><init>(Landroid/content/Context;)V

    .line 57
    iget-object v0, p0, Lo/dlu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dll;->d(Landroid/content/Context;)Lo/dll;

    move-result-object v0

    iput-object v0, p0, Lo/dlu;->a:Lo/dll;

    .line 58
    iget-object v0, p0, Lo/dlu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    iput-object v0, p0, Lo/dlu;->d:Lo/dln;

    .line 59
    return-void
.end method

.method private a(ILjava/lang/String;)V
    .locals 11

    .line 76
    new-instance v6, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-direct {v6}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;-><init>()V

    .line 77
    const/16 v0, 0x7531

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgType(I)V

    .line 78
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgSrc(I)V

    .line 79
    invoke-static {v6, p2, p1}, Lo/dlu;->c(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;Ljava/lang/String;I)V

    .line 80
    const-string v0, "ai-bloodp-002"

    const/16 v1, 0x7532

    invoke-static {v1, v0}, Lo/dmn;->e(ILjava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setPriority(I)V

    .line 82
    const/4 v7, 0x0

    .line 83
    iget-object v0, p0, Lo/dlu;->d:Lo/dln;

    const/16 v1, 0x7531

    invoke-virtual {v0, v1}, Lo/dln;->b(I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v8

    .line 84
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    .line 85
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setMeasureMsgnull == smartMsgDBObject"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    iget-object v0, p0, Lo/dlu;->d:Lo/dln;

    invoke-virtual {v0, v6}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v7

    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {v8}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getUpdateTime()J

    move-result-wide v9

    .line 89
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setMeasureMsg createTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, v9, v10}, Ljava/util/Date;-><init>(J)V

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v9

    int-to-long v2, p1

    const-wide/32 v4, 0x5265c00

    mul-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 92
    iget-object v0, p0, Lo/dlu;->d:Lo/dln;

    const/16 v1, 0x7531

    invoke-virtual {v0, v1}, Lo/dln;->d(I)I

    .line 93
    iget-object v0, p0, Lo/dlu;->d:Lo/dln;

    invoke-virtual {v0, v6}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v7

    .line 96
    :cond_1
    :goto_0
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setMeasureMsg null == result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List<Ljava/lang/Object;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 462
    const-string v0, "show_device"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 464
    iget-object v0, p0, Lo/dlu;->b:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_bloodp_last_suggest_kind"

    const-string v3, "show_device"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 466
    const/16 v0, 0x6e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 467
    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 468
    const/4 v0, 0x0

    invoke-interface {p4, v0, p3}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 470
    :cond_0
    iget-object v0, p0, Lo/dlu;->b:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_bloodp_last_suggest_kind"

    const-string v3, "show_service"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 472
    const/16 v0, 0x6f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 473
    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 474
    const/4 v0, 0x0

    invoke-interface {p4, v0, p3}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 476
    :goto_0
    return-void
.end method

.method private a(Lo/egg;)V
    .locals 4

    .line 191
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBloodpDeviceDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    new-instance v0, Lo/dlu$4;

    invoke-direct {v0, p0, p1}, Lo/dlu$4;-><init>(Lo/dlu;Lo/egg;)V

    invoke-direct {p0, v0}, Lo/dlu;->e(Lo/egg;)V

    .line 223
    return-void
.end method

.method private b(Landroid/content/Context;ILo/egg;)V
    .locals 13

    .line 380
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 381
    int-to-long v0, p2

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    sub-long v11, v9, v0

    .line 382
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object v1, p1

    move-wide v2, v11

    move-wide v4, v9

    new-instance v8, Lo/dlu$10;

    move-object/from16 v6, p3

    invoke-direct {v8, p0, v6}, Lo/dlu$10;-><init>(Lo/dlu;Lo/egg;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v8}, Lo/dgu;->e(Landroid/content/Context;JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 393
    return-void
.end method

.method static synthetic b(Lo/dlu;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2, p3, p4}, Lo/dlu;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic c(Lo/dlu;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .line 49
    invoke-direct {p0, p1}, Lo/dlu;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static c(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;Ljava/lang/String;I)V
    .locals 4

    .line 480
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContentType(I)V

    .line 482
    new-instance v2, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;

    invoke-direct {v2, p2}, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;-><init>(I)V

    .line 483
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    const-class v1, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;

    invoke-virtual {v0, v2, v1}, Lo/dmo;->b(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v3

    .line 484
    invoke-virtual {p0, v3}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContent(Ljava/lang/String;)V

    .line 486
    const-string v0, "110000"

    invoke-virtual {p0, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowMethod(Ljava/lang/String;)V

    .line 487
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 488
    invoke-virtual {p0, p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowTime(Ljava/lang/String;)V

    goto :goto_0

    .line 490
    :cond_0
    const-string v0, "00002400"

    invoke-virtual {p0, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowTime(Ljava/lang/String;)V

    .line 492
    :goto_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setStatus(I)V

    .line 493
    return-void
.end method

.method static synthetic c(Lo/dlu;ILjava/lang/String;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2}, Lo/dlu;->a(ILjava/lang/String;)V

    return-void
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 496
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 497
    const-string v0, ""

    return-object v0

    .line 499
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 501
    :try_start_0
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 503
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 504
    invoke-virtual {v5, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    .line 505
    const-string v0, "start_time"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 506
    const-string v0, "end_time"

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 507
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 503
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 511
    :cond_1
    goto :goto_1

    .line 509
    :catch_0
    move-exception v5

    .line 510
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg JSONException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 513
    :goto_1
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 514
    return-object v5
.end method

.method static synthetic d(Lo/dlu;Lo/egg;)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Lo/dlu;->a(Lo/egg;)V

    return-void
.end method

.method private d(Lo/egg;)V
    .locals 7

    .line 232
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodpService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    iget-object v0, p0, Lo/dlu;->b:Landroid/content/Context;

    const-string v1, "bloodpressure_sevice"

    invoke-static {v0, v1}, Lo/dmn;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    .line 234
    const-string v0, "ai-bloodp-003"

    const/16 v1, 0x7532

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v5

    .line 235
    const-string v0, "ai-bloodp-003"

    const-string v1, "suggest_bloodp_professional_service_average_data"

    const/16 v2, 0x7532

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 238
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodpService rule = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodpService isSuggestTimeOk = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    iget-object v0, p0, Lo/dlu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 244
    iget-object v0, p0, Lo/dlu;->b:Landroid/content/Context;

    new-instance v1, Lo/dlu$3;

    invoke-direct {v1, p0, p1, v6}, Lo/dlu$3;-><init>(Lo/dlu;Lo/egg;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lo/dmn;->c(Landroid/content/Context;Lo/egg;)V

    goto :goto_0

    .line 285
    :cond_0
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 287
    :goto_0
    return-void
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 2

    .line 403
    const/4 v1, 0x0

    .line 404
    const-string v0, "HDK_BLOOD_PRESSURE"

    invoke-static {p0, v0}, Lo/dmn;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 405
    const/4 v1, 0x1

    .line 407
    :cond_0
    return v1
.end method

.method private e(Ljava/lang/String;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Ljava/util/List<Ljava/lang/Integer;>;>;"
        }
    .end annotation

    .line 340
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 345
    :try_start_0
    new-instance v9, Lorg/json/JSONArray;

    invoke-direct {v9, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 346
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAgeAndBloodList ageAndBloodArray.lenght = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    const/4 v10, 0x0

    :goto_0
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v10, v0, :cond_2

    .line 348
    invoke-virtual {v9, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    .line 350
    const-string v0, "month_average_high_bloodp_exceed"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 351
    const-string v0, "min_age"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 352
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 353
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 354
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 355
    const/4 v0, 0x2

    if-eq v10, v0, :cond_0

    .line 356
    const-string v0, "max_age"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 357
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 358
    :cond_0
    const/4 v0, 0x2

    if-ne v10, v0, :cond_1

    .line 360
    const/16 v0, 0x3e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 362
    :cond_1
    :goto_1
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    .line 347
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 368
    :cond_2
    goto :goto_2

    .line 364
    :catch_0
    move-exception v5

    .line 365
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAgeAndBloodList JSONException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 368
    goto :goto_2

    .line 366
    :catch_1
    move-exception v5

    .line 367
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAgeAndBloodList NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 369
    :goto_2
    return-object v4
.end method

.method private e(Lo/egg;)V
    .locals 9

    .line 150
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodpDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    iget-object v0, p0, Lo/dlu;->a:Lo/dll;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/dll;->a(I)Z

    move-result v4

    .line 153
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "judgeSuggestBloodpDevice isFollowBloodpress="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    iget-object v0, p0, Lo/dlu;->b:Landroid/content/Context;

    const-string v1, "bloodpressure_device"

    invoke-static {v0, v1}, Lo/dmn;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    .line 156
    const-string v0, "ai-bloodp-001"

    const/16 v1, 0x7532

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v6

    .line 157
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodpDevice isSuggestTimeOk = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodpDevice ruleOpen = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    if-eqz v5, :cond_1

    if-eqz v6, :cond_1

    iget-object v0, p0, Lo/dlu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/dlu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dlu;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 162
    iget-object v0, p0, Lo/dlu;->a:Lo/dll;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/dll;->a(I)Z

    move-result v7

    .line 163
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "judgeSuggestBloodpDevice isFollowBloodp="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    if-eqz v7, :cond_0

    .line 165
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_0

    .line 168
    :cond_0
    const-string v0, "ai-bloodp-001"

    const-string v1, "recently_num_days_have_data"

    const/16 v2, 0x7532

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    .line 170
    iget-object v0, p0, Lo/dlu;->b:Landroid/content/Context;

    new-instance v1, Lo/dlu$2;

    invoke-direct {v1, p0, p1}, Lo/dlu$2;-><init>(Lo/dlu;Lo/egg;)V

    invoke-direct {p0, v0, v8, v1}, Lo/dlu;->b(Landroid/content/Context;ILo/egg;)V

    .line 181
    :goto_0
    goto :goto_1

    .line 182
    :cond_1
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 184
    :goto_1
    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 414
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodpDialog enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 415
    iget-object v0, p0, Lo/dlu;->b:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_bloodp_last_suggest_kind"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 418
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 420
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "show_service"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 421
    :cond_0
    new-instance v0, Lo/dlu$6;

    invoke-direct {v0, p0, v5, p1}, Lo/dlu$6;-><init>(Lo/dlu;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-direct {p0, v0}, Lo/dlu;->a(Lo/egg;)V

    goto :goto_0

    .line 439
    :cond_1
    new-instance v0, Lo/dlu$8;

    invoke-direct {v0, p0, v5, p1}, Lo/dlu$8;-><init>(Lo/dlu;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {p0, v0}, Lo/dlu;->b(Lo/egg;)V

    .line 458
    :goto_0
    return-void
.end method

.method public b(Lo/egg;)V
    .locals 4

    .line 294
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBloodpServiceDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    new-instance v0, Lo/dlu$1;

    invoke-direct {v0, p0, p1}, Lo/dlu$1;-><init>(Lo/dlu;Lo/egg;)V

    invoke-direct {p0, v0}, Lo/dlu;->d(Lo/egg;)V

    .line 324
    return-void
.end method

.method public c()V
    .locals 12

    .line 105
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    iget-object v0, p0, Lo/dlu;->a:Lo/dll;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lo/dll;->a(I)Z

    move-result v4

    .line 108
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setOrDeleteMeasureMsg isFollowBloodpress= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    iget-object v0, p0, Lo/dlu;->b:Landroid/content/Context;

    const/16 v1, 0x2725

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "telled_user_measure_blood_pressure"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 111
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg sp = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    const-string v0, "ai-bloodp-002"

    const/16 v1, 0x7532

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v6

    .line 113
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg ruleOpen = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    if-eqz v6, :cond_0

    const-string v0, "1"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/dlu;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dlu;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    const-string v0, "ai-bloodp-002"

    const-string v1, "recently_num_days_no_data"

    const/16 v2, 0x7532

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 117
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg daystr = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    const-string v0, "ai-bloodp-002"

    const-string v1, "recommended_time"

    const/16 v2, 0x7532

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 120
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg recommendTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    invoke-static {v8}, Lo/dlu;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 122
    const/4 v10, 0x0

    .line 124
    :try_start_0
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v10, v0

    .line 127
    goto :goto_0

    .line 125
    :catch_0
    move-exception v11

    .line 126
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    :goto_0
    move v11, v10

    .line 129
    iget-object v0, p0, Lo/dlu;->b:Landroid/content/Context;

    new-instance v1, Lo/dlu$5;

    invoke-direct {v1, p0, v11, v9}, Lo/dlu$5;-><init>(Lo/dlu;ILjava/lang/String;)V

    invoke-direct {p0, v0, v10, v1}, Lo/dlu;->b(Landroid/content/Context;ILo/egg;)V

    .line 140
    goto :goto_1

    .line 141
    :cond_0
    iget-object v0, p0, Lo/dlu;->b:Landroid/content/Context;

    const/16 v1, 0x7531

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 143
    :goto_1
    return-void
.end method

.method public e()V
    .locals 4

    .line 63
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTimerCheck"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    invoke-super {p0}, Lo/dlv;->e()V

    .line 65
    invoke-virtual {p0}, Lo/dlu;->c()V

    .line 66
    return-void
.end method
