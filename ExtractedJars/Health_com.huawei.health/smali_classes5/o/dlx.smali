.class public Lo/dlx;
.super Lo/dlv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dlx$a;
    }
.end annotation


# instance fields
.field private c:Lo/dll;

.field private e:Lo/dln;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 46
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dlv;-><init>(Landroid/content/Context;)V

    .line 47
    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dll;->d(Landroid/content/Context;)Lo/dll;

    move-result-object v0

    iput-object v0, p0, Lo/dlx;->c:Lo/dll;

    .line 48
    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    iput-object v0, p0, Lo/dlx;->e:Lo/dln;

    .line 49
    return-void
.end method

.method synthetic constructor <init>(Lo/dlx$4;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lo/dlx;-><init>()V

    return-void
.end method

.method private a(Landroid/content/Context;ILo/egg;)V
    .locals 12

    .line 313
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 314
    int-to-long v0, p2

    const-wide/32 v2, 0x5265c00

    mul-long/2addr v0, v2

    sub-long v10, v8, v0

    .line 315
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    move-object v1, p1

    move-wide v2, v10

    move-wide v4, v8

    new-instance v7, Lo/dlx$8;

    invoke-direct {v7, p0, p3}, Lo/dlx$8;-><init>(Lo/dlx;Lo/egg;)V

    const/4 v6, 0x1

    invoke-virtual/range {v0 .. v7}, Lo/dgu;->c(Landroid/content/Context;JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 326
    return-void
.end method

.method private a(Lo/egg;)V
    .locals 4

    .line 269
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBloodsgServiceDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    new-instance v0, Lo/dlx$5;

    invoke-direct {v0, p0, p1}, Lo/dlx$5;-><init>(Lo/dlx;Lo/egg;)V

    invoke-direct {p0, v0}, Lo/dlx;->c(Lo/egg;)V

    .line 300
    return-void
.end method

.method static synthetic b(Lo/dlx;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2, p3, p4}, Lo/dlx;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic b(Lo/dlx;Lo/egg;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lo/dlx;->a(Lo/egg;)V

    return-void
.end method

.method public static c()Lo/dlx;
    .locals 1

    .line 61
    invoke-static {}, Lo/dlx$a;->d()Lo/dlx;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/dlx;ILjava/lang/String;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2}, Lo/dlx;->d(ILjava/lang/String;)V

    return-void
.end method

.method private c(Lo/egg;)V
    .locals 8

    .line 229
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodsgService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 230
    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    const-string v1, "bloodsugar_sevice"

    invoke-static {v0, v1}, Lo/dmn;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    .line 231
    const-string v0, "ai-bloodsg-003"

    const/16 v1, 0x7536

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v5

    .line 233
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodsgService rule = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodsgService isSuggestTimeOk = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    if-eqz v4, :cond_1

    if-eqz v5, :cond_1

    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 237
    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dlx;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 238
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_1

    .line 242
    :cond_0
    const-string v0, "ai-bloodsg-003"

    const-string v1, "recently_num_days_have_data"

    const/16 v2, 0x7536

    :try_start_0
    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    .line 247
    goto :goto_0

    .line 244
    :catch_0
    move-exception v7

    .line 245
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    const/16 v6, 0x5a

    .line 248
    :goto_0
    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    new-instance v1, Lo/dlx$1;

    invoke-direct {v1, p0, p1}, Lo/dlx$1;-><init>(Lo/dlx;Lo/egg;)V

    invoke-direct {p0, v0, v6, v1}, Lo/dlx;->a(Landroid/content/Context;ILo/egg;)V

    .line 258
    goto :goto_1

    .line 260
    :cond_1
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 262
    :goto_1
    return-void
.end method

.method private d(ILjava/lang/String;)V
    .locals 11

    .line 79
    const v0, 0x11171

    const/4 v1, 0x7

    invoke-static {v0, v1, p2, p1}, Lo/dlx;->e(IILjava/lang/String;I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v6

    .line 80
    const-string v0, "ai-bloodsg-002"

    const/16 v1, 0x7536

    invoke-static {v1, v0}, Lo/dmn;->e(ILjava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setPriority(I)V

    .line 81
    const/4 v7, 0x0

    .line 82
    iget-object v0, p0, Lo/dlx;->e:Lo/dln;

    const v1, 0x11171

    invoke-virtual {v0, v1}, Lo/dln;->b(I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v8

    .line 83
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    .line 84
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setMeasureMsgnull == smartMsgDBObject"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    iget-object v0, p0, Lo/dlx;->e:Lo/dln;

    invoke-virtual {v0, v6}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v7

    goto :goto_0

    .line 87
    :cond_0
    invoke-virtual {v8}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getUpdateTime()J

    move-result-wide v9

    .line 88
    const-string v0, "SMART_BloodSugarSmarter"

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

    .line 89
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v9

    int-to-long v2, p1

    const-wide/32 v4, 0x5265c00

    mul-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 90
    iget-object v0, p0, Lo/dlx;->e:Lo/dln;

    const v1, 0x11171

    invoke-virtual {v0, v1}, Lo/dln;->d(I)I

    .line 91
    iget-object v0, p0, Lo/dlx;->e:Lo/dln;

    invoke-virtual {v0, v6}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v7

    .line 94
    :cond_1
    :goto_0
    const-string v0, "SMART_BloodSugarSmarter"

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

    .line 95
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List<Ljava/lang/Object;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 395
    const-string v0, "show_device"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 397
    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_bloodsg_last_suggest_kind"

    const-string v3, "show_device"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 399
    const/16 v0, 0x6e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 400
    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 401
    const/4 v0, 0x0

    invoke-interface {p4, v0, p3}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 403
    :cond_0
    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_bloodsg_last_suggest_kind"

    const-string v3, "show_service"

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 405
    const/16 v0, 0x6f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 406
    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 407
    const/4 v0, 0x0

    invoke-interface {p4, v0, p3}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 409
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/dlx;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lo/dlx;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic d(Lo/dlx;Lo/egg;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lo/dlx;->d(Lo/egg;)V

    return-void
.end method

.method private d(Lo/egg;)V
    .locals 4

    .line 187
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBloodsgDeviceDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    new-instance v0, Lo/dlx$2;

    invoke-direct {v0, p0, p1}, Lo/dlx$2;-><init>(Lo/dlx;Lo/egg;)V

    invoke-direct {p0, v0}, Lo/dlx;->e(Lo/egg;)V

    .line 220
    return-void
.end method

.method private static d(Landroid/content/Context;)Z
    .locals 2

    .line 336
    const/4 v1, 0x0

    .line 337
    const-string v0, "HDK_BLOOD_SUGAR"

    invoke-static {p0, v0}, Lo/dmn;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 338
    const/4 v1, 0x1

    .line 340
    :cond_0
    return v1
.end method

.method private static e(IILjava/lang/String;I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;
    .locals 5

    .line 414
    new-instance v2, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-direct {v2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;-><init>()V

    .line 415
    invoke-virtual {v2, p0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgType(I)V

    .line 416
    invoke-virtual {v2, p1}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgSrc(I)V

    .line 417
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContentType(I)V

    .line 418
    new-instance v3, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;

    invoke-direct {v3, p3}, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;-><init>(I)V

    .line 419
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    const-class v1, Lcom/huawei/hwsmartinteractmgr/data/ContentMearsure;

    invoke-virtual {v0, v3, v1}, Lo/dmo;->b(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v4

    .line 420
    invoke-virtual {v2, v4}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContent(Ljava/lang/String;)V

    .line 423
    const-string v0, "100000"

    invoke-virtual {v2, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowMethod(Ljava/lang/String;)V

    .line 424
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 425
    invoke-virtual {v2, p2}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowTime(Ljava/lang/String;)V

    goto :goto_0

    .line 427
    :cond_0
    const-string v0, "00002400"

    invoke-virtual {v2, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowTime(Ljava/lang/String;)V

    .line 429
    :goto_0
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setStatus(I)V

    .line 430
    return-object v2
.end method

.method private e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 347
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodsgDialog enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    const/16 v1, 0x2716

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_bloodsg_last_suggest_kind"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 351
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 353
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "show_service"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 354
    :cond_0
    new-instance v0, Lo/dlx$6;

    invoke-direct {v0, p0, v5, p1}, Lo/dlx$6;-><init>(Lo/dlx;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-direct {p0, v0}, Lo/dlx;->d(Lo/egg;)V

    goto :goto_0

    .line 372
    :cond_1
    new-instance v0, Lo/dlx$10;

    invoke-direct {v0, p0, v5, p1}, Lo/dlx$10;-><init>(Lo/dlx;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-direct {p0, v0}, Lo/dlx;->a(Lo/egg;)V

    .line 391
    :goto_0
    return-void
.end method

.method private e(Lo/egg;)V
    .locals 9

    .line 144
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodsgDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    const-string v1, "bloodsugar_device"

    invoke-static {v0, v1}, Lo/dmn;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    .line 146
    const-string v0, "ai-bloodsg-001"

    const/16 v1, 0x7536

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v5

    .line 147
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodsgDevice isSuggestTimeOk = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "judgeSuggestBloodsgDevice ruleOpen = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    if-eqz v4, :cond_1

    if-eqz v5, :cond_1

    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dlx;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 152
    iget-object v0, p0, Lo/dlx;->c:Lo/dll;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lo/dll;->a(I)Z

    move-result v6

    .line 153
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "judgeSuggestBloodsgDevice isFollowBloodp="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    if-eqz v6, :cond_0

    .line 155
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_1

    .line 160
    :cond_0
    const-string v0, "ai-bloodsg-001"

    const-string v1, "recently_num_days_have_data"

    const/16 v2, 0x7536

    :try_start_0
    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v7

    .line 165
    goto :goto_0

    .line 162
    :catch_0
    move-exception v8

    .line 163
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "judgeSuggestBloodsgDevice NumberFormatException ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    const/16 v7, 0x5a

    .line 166
    :goto_0
    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    new-instance v1, Lo/dlx$3;

    invoke-direct {v1, p0, p1}, Lo/dlx$3;-><init>(Lo/dlx;Lo/egg;)V

    invoke-direct {p0, v0, v7, v1}, Lo/dlx;->a(Landroid/content/Context;ILo/egg;)V

    .line 177
    :goto_1
    goto :goto_2

    .line 178
    :cond_1
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 180
    :goto_2
    return-void
.end method


# virtual methods
.method public a()V
    .locals 10

    .line 103
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    const-string v0, "ai-bloodsg-002"

    const/16 v1, 0x7536

    invoke-static {v1, v0}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v4

    .line 105
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg ruleOpen = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    if-eqz v4, :cond_0

    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dlx;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    const-string v0, "ai-bloodsg-002"

    const-string v1, "recently_num_days_no_data"

    const/16 v2, 0x7536

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 109
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg daystr = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    const-string v0, "ai-bloodsg-002"

    const-string v1, "recommended_time"

    const/16 v2, 0x7536

    invoke-static {v2, v0, v1}, Lo/dmn;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 112
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg recommendTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    invoke-static {v6}, Lo/dlu;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 114
    const/4 v8, 0x3

    .line 116
    :try_start_0
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v8

    .line 120
    goto :goto_0

    .line 117
    :catch_0
    move-exception v9

    .line 118
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg NumberFormatException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    const/4 v8, 0x3

    .line 121
    :goto_0
    move v9, v8

    .line 122
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setOrDeleteMeasureMsg day = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    new-instance v1, Lo/dlx$4;

    invoke-direct {v1, p0, v9, v7}, Lo/dlx$4;-><init>(Lo/dlx;ILjava/lang/String;)V

    invoke-direct {p0, v0, v8, v1}, Lo/dlx;->a(Landroid/content/Context;ILo/egg;)V

    .line 134
    goto :goto_1

    .line 135
    :cond_0
    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    const v1, 0x11171

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 137
    :goto_1
    return-void
.end method

.method public e()V
    .locals 4

    .line 66
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTimerCheck"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    invoke-super {p0}, Lo/dlv;->e()V

    .line 68
    invoke-virtual {p0}, Lo/dlx;->a()V

    .line 69
    return-void
.end method

.method public e(Landroid/os/Handler;)V
    .locals 4

    .line 440
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkShowBloodsgDialog "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 441
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 442
    :cond_0
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkShowBloodsgDialog null == mHandler || null == mContext"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    return-void

    .line 445
    :cond_1
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo/dlx;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dmn;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 446
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/dlx$7;

    invoke-direct {v1, p0, p1}, Lo/dlx$7;-><init>(Lo/dlx;Landroid/os/Handler;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 465
    :cond_2
    return-void
.end method
