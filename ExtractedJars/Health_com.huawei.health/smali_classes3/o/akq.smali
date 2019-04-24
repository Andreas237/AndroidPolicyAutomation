.class public Lo/akq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/akq$a;
    }
.end annotation


# static fields
.field private static final b:Ljava/lang/Object;


# instance fields
.field private a:I

.field private c:I

.field private d:I

.field private e:I

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private k:I

.field private m:Lo/ceu;

.field private n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private o:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/akq;->b:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lo/akq;->d:I

    .line 32
    const/4 v0, 0x0

    iput v0, p0, Lo/akq;->a:I

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akq;->f:Z

    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akq;->g:Z

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akq;->i:Z

    .line 41
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akq;->h:Z

    .line 65
    new-instance v0, Lo/akq$2;

    invoke-direct {v0, p0}, Lo/akq$2;-><init>(Lo/akq;)V

    iput-object v0, p0, Lo/akq;->m:Lo/ceu;

    .line 329
    new-instance v0, Lo/akq$4;

    invoke-direct {v0, p0}, Lo/akq$4;-><init>(Lo/akq;)V

    iput-object v0, p0, Lo/akq;->n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 407
    new-instance v0, Lo/akq$5;

    invoke-direct {v0, p0}, Lo/akq$5;-><init>(Lo/akq;)V

    iput-object v0, p0, Lo/akq;->p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 423
    new-instance v0, Lo/akq$3;

    invoke-direct {v0, p0}, Lo/akq$3;-><init>(Lo/akq;)V

    iput-object v0, p0, Lo/akq;->o:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 48
    return-void
.end method

.method synthetic constructor <init>(Lo/akq$2;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lo/akq;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/akq;)I
    .locals 1

    .line 28
    iget v0, p0, Lo/akq;->d:I

    return v0
.end method

.method static synthetic a(Lo/akq;I)I
    .locals 0

    .line 28
    iput p1, p0, Lo/akq;->d:I

    return p1
.end method

.method public static final a()Lo/akq;
    .locals 1

    .line 51
    invoke-static {}, Lo/akq$a;->b()Lo/akq;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lo/akq;Landroid/os/Bundle;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lo/akq;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method private a(Lorg/json/JSONObject;II)V
    .locals 8

    .line 478
    const-string v0, "sport_type"

    :try_start_0
    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 479
    const-string v0, "operator_type"

    invoke-virtual {p1, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 480
    const-string v0, "workout_type"

    iget v1, p0, Lo/akq;->k:I

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 481
    const-string v0, "operation_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 482
    const/4 v0, 0x1

    if-ne v0, p2, :cond_0

    .line 484
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildJsonObject current is single track"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 485
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p2, :cond_4

    .line 486
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildJsonObject current is Not single track"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 487
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->a()I

    move-result v5

    .line 488
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 489
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildJsonObject current is run plan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 490
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cwi;->a(Landroid/content/Context;)Lo/cwi;

    move-result-object v0

    invoke-virtual {v0}, Lo/cwi;->k()Lcom/huawei/health/suggestion/model/RunWorkout;

    move-result-object v6

    .line 491
    if-eqz v6, :cond_1

    .line 492
    const-string v7, "yyyy-MM-dd"

    .line 493
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "workout is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 494
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "workout is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3, v7}, Lo/akq;->b(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    const-string v0, "run_plan_date"

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1, v7}, Lo/akq;->b(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 497
    :cond_1
    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    if-ne v0, v5, :cond_3

    .line 498
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildJsonObject current is RUN_COURSE_NO_HEART"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 499
    const-string v0, "sport_type"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_0

    .line 500
    :cond_3
    const/4 v0, 0x2

    if-ne v0, v5, :cond_4

    .line 501
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildJsonObject current is RUN_COURSE_WITH_HEART"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 502
    const-string v0, "sport_type"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 507
    :cond_4
    :goto_0
    goto :goto_1

    .line 505
    :catch_0
    move-exception v5

    .line 506
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 508
    :goto_1
    return-void
.end method

.method static synthetic a(Lo/akq;Z)Z
    .locals 0

    .line 28
    iput-boolean p1, p0, Lo/akq;->i:Z

    return p1
.end method

.method private b(I)I
    .locals 1

    .line 321
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 323
    :sswitch_0
    const/4 v0, 0x2

    return v0

    .line 325
    :goto_0
    const/4 v0, 0x1

    return v0

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method static synthetic b(Lo/akq;)I
    .locals 1

    .line 28
    iget v0, p0, Lo/akq;->e:I

    return v0
.end method

.method static synthetic b(Lo/akq;I)I
    .locals 0

    .line 28
    iput p1, p0, Lo/akq;->e:I

    return p1
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)J
    .locals 5

    .line 513
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, ""

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 514
    new-instance v4, Ljava/text/SimpleDateFormat;

    invoke-direct {v4, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 515
    invoke-virtual {v4, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    .line 519
    :cond_0
    goto :goto_0

    .line 517
    :catch_0
    move-exception v4

    .line 518
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SimpleDateFormat parse error: e= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 520
    :goto_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private b(Landroid/os/Bundle;)V
    .locals 7

    .line 339
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    invoke-virtual {v0}, Lo/akv;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    invoke-virtual {v0}, Lo/akv;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 341
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 344
    const-string v0, "exercise_duration"

    const-string v1, "duration"

    :try_start_0
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 345
    const-string v0, "pace"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 346
    const-string v0, "pace"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_0

    .line 348
    :cond_0
    const-string v0, "pace"

    const-string v1, "pace"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 350
    :goto_0
    const-string v0, "speed"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 351
    const-string v0, "speed"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_1

    .line 353
    :cond_1
    const-string v0, "speed"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v5

    .line 354
    float-to-int v0, v5

    mul-int/lit8 v6, v0, 0xa

    .line 355
    const-string v0, "speed"

    invoke-virtual {v4, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 357
    :goto_1
    const-string v0, "calorie"

    const-string v1, "calorie"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 358
    const-string v0, "distance"

    const-string v1, "distance"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 361
    goto :goto_2

    .line 359
    :catch_0
    move-exception v5

    .line 360
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    :goto_2
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    iget-object v1, p0, Lo/akq;->n:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v4, v1}, Lo/akt;->a(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 365
    :cond_2
    return-void
.end method

.method private b()Z
    .locals 6

    .line 198
    iget v0, p0, Lo/akq;->k:I

    const/16 v1, 0x102

    if-eq v0, v1, :cond_0

    iget v0, p0, Lo/akq;->k:I

    const/16 v1, 0x108

    if-ne v0, v1, :cond_1

    .line 200
    :cond_0
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDeviceSupportRunPosture sport type is outdoor RUN or TREADMILL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 202
    :cond_1
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDeviceSupportRunPosture sport type is NOT outdoor RUN or TREADMILL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    const/4 v0, 0x0

    return v0

    .line 205
    :goto_0
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->g()Ljava/util/List;

    move-result-object v4

    .line 206
    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    .line 207
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDeviceSupportRunPosture null == healthDeviceList"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    const/4 v0, 0x0

    return v0

    .line 211
    :cond_2
    const/4 v5, 0x0

    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_4

    .line 212
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDeviceSupportRunPosture healthDeviceList "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportRunPosture()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 214
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isDeviceSupportRunPosture has support run posture device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    const/4 v0, 0x1

    return v0

    .line 211
    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 219
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lo/akq;Z)Z
    .locals 0

    .line 28
    iput-boolean p1, p0, Lo/akq;->g:Z

    return p1
.end method

.method static synthetic c(Lo/akq;I)I
    .locals 1

    .line 28
    invoke-direct {p0, p1}, Lo/akq;->b(I)I

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/akq;)Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lo/akq;->i:Z

    return v0
.end method

.method static synthetic d(Lo/akq;I)I
    .locals 0

    .line 28
    iput p1, p0, Lo/akq;->c:I

    return p1
.end method

.method static synthetic d(Lo/akq;)Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lo/akq;->g:Z

    return v0
.end method

.method static synthetic d(Lo/akq;Z)Z
    .locals 0

    .line 28
    iput-boolean p1, p0, Lo/akq;->h:Z

    return p1
.end method

.method static synthetic e(Lo/akq;)I
    .locals 1

    .line 28
    iget v0, p0, Lo/akq;->a:I

    return v0
.end method

.method static synthetic e(Lo/akq;I)I
    .locals 0

    .line 28
    iput p1, p0, Lo/akq;->k:I

    return p1
.end method

.method static synthetic e()Ljava/lang/Object;
    .locals 1

    .line 28
    sget-object v0, Lo/akq;->b:Ljava/lang/Object;

    return-object v0
.end method

.method private e(II)Z
    .locals 6

    .line 441
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notifyWearDeviceState sportType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", sportState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", deviceReportState="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/akq;->f:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 443
    iget-boolean v0, p0, Lo/akq;->f:Z

    if-eqz v0, :cond_1

    .line 444
    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    .line 445
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->f()V

    .line 447
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 450
    :cond_1
    invoke-static {}, Lo/akv;->e()Lo/akv;

    move-result-object v0

    invoke-virtual {v0}, Lo/akv;->a()Z

    move-result v4

    .line 452
    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    if-nez v4, :cond_2

    .line 453
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "failed to linkage and linking status is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 454
    const/4 v0, 0x0

    return v0

    .line 458
    :cond_2
    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    if-eqz v4, :cond_6

    .line 459
    :cond_3
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyWearDeviceState is linking"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 461
    invoke-direct {p0, v5, p1, p2}, Lo/akq;->a(Lorg/json/JSONObject;II)V

    .line 466
    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 v0, 0x3

    if-ne p2, v0, :cond_5

    .line 467
    :cond_4
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    iget-object v1, p0, Lo/akq;->p:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v5, v1}, Lo/akt;->b(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 469
    :cond_5
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    iget-object v1, p0, Lo/akq;->o:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v5, v1}, Lo/akt;->b(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 473
    :cond_6
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic e(Lo/akq;Z)Z
    .locals 0

    .line 28
    iput-boolean p1, p0, Lo/akq;->f:Z

    return p1
.end method

.method private f()V
    .locals 4

    .line 224
    invoke-static {}, Lo/akr;->b()Lo/akr;

    move-result-object v0

    invoke-virtual {v0}, Lo/akr;->c()V

    .line 226
    iget-boolean v0, p0, Lo/akq;->g:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lo/akq;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 227
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current link strategy is OldLinkStrategy and single track, stop sport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->i()V

    goto :goto_0

    .line 229
    :cond_0
    iget-boolean v0, p0, Lo/akq;->g:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lo/akq;->c:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 230
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current link strategy is OldLinkStrategy and suggest plan, stop sport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    invoke-static {}, Lo/yy;->b()Lo/yy;

    move-result-object v0

    invoke-virtual {v0}, Lo/yy;->d()Z

    move-result v0

    if-nez v0, :cond_1

    .line 232
    iget v0, p0, Lo/akq;->c:I

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lo/akq;->e(II)Z

    .line 234
    :cond_1
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->i()V

    goto :goto_0

    .line 235
    :cond_2
    iget-boolean v0, p0, Lo/akq;->i:Z

    if-eqz v0, :cond_3

    .line 236
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current link strategy is NewLinkStrategy, stop sport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    iget v0, p0, Lo/akq;->c:I

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lo/akq;->e(II)Z

    .line 238
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->i()V

    goto :goto_0

    .line 239
    :cond_3
    iget-boolean v0, p0, Lo/akq;->h:Z

    if-eqz v0, :cond_4

    .line 241
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current link strategy only support heart rate, stop sport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 242
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->i()V

    .line 244
    :cond_4
    :goto_0
    invoke-direct {p0}, Lo/akq;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 245
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopSport support run posture"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/akt;->a(I)V

    .line 248
    :cond_5
    return-void
.end method

.method static synthetic f(Lo/akq;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lo/akq;->i()V

    return-void
.end method

.method static synthetic g(Lo/akq;I)I
    .locals 0

    .line 28
    iput p1, p0, Lo/akq;->a:I

    return p1
.end method

.method private g()V
    .locals 4

    .line 277
    iget-boolean v0, p0, Lo/akq;->g:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lo/akq;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 278
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current link strategy is OldLinkStrategy and single track, resume sport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->f()V

    goto :goto_0

    .line 280
    :cond_0
    iget-boolean v0, p0, Lo/akq;->g:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lo/akq;->c:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 281
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current link strategy is OldLinkStrategy and suggest plan, resume sport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    iget v0, p0, Lo/akq;->c:I

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lo/akq;->e(II)Z

    goto :goto_0

    .line 283
    :cond_1
    iget-boolean v0, p0, Lo/akq;->i:Z

    if-eqz v0, :cond_2

    .line 284
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current link strategy is NewLinkStrategy, resume sport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    iget v0, p0, Lo/akq;->c:I

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lo/akq;->e(II)Z

    goto :goto_0

    .line 286
    :cond_2
    iget-boolean v0, p0, Lo/akq;->h:Z

    if-eqz v0, :cond_3

    .line 288
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current link strategy only support heart rate, resume sport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->f()V

    .line 292
    :cond_3
    :goto_0
    invoke-direct {p0}, Lo/akq;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 293
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resumeSport only support run posture"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/akt;->e(I)V

    .line 296
    :cond_4
    return-void
.end method

.method static synthetic g(Lo/akq;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lo/akq;->g()V

    return-void
.end method

.method static synthetic h(Lo/akq;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lo/akq;->k()V

    return-void
.end method

.method private h()Z
    .locals 12

    .line 373
    const/4 v4, 0x0

    .line 374
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/aks;->d(Z)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 375
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/aks;->d(Z)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 376
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 377
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v7

    .line 378
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 379
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdvice()Z

    move-result v8

    .line 380
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutExerciseDisplayLink()Z

    move-result v9

    .line 381
    if-eqz v8, :cond_0

    if-nez v9, :cond_0

    .line 382
    const/4 v4, 0x1

    .line 386
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 387
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    invoke-virtual {v0}, Lo/aks;->g()Ljava/util/List;

    move-result-object v7

    .line 388
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 389
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_2

    .line 390
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    .line 391
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    .line 392
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdvice()Z

    move-result v10

    .line 393
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutExerciseDisplayLink()Z

    move-result v11

    .line 394
    if-eqz v10, :cond_1

    if-nez v11, :cond_1

    .line 395
    const/4 v4, 0x1

    .line 396
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isExitOldLinkDevice has existed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    return v4

    .line 389
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 403
    :cond_2
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isExitOldLinkDevice\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    return v4
.end method

.method private i()V
    .locals 4

    .line 252
    iget-boolean v0, p0, Lo/akq;->g:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lo/akq;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 253
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current link strategy is OldLinkStrategy and single track, pause sport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->i()V

    goto :goto_0

    .line 255
    :cond_0
    iget-boolean v0, p0, Lo/akq;->g:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lo/akq;->c:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 256
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current link strategy is OldLinkStrategy and suggest plan, pause sport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    iget v0, p0, Lo/akq;->c:I

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lo/akq;->e(II)Z

    .line 258
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->i()V

    goto :goto_0

    .line 259
    :cond_1
    iget-boolean v0, p0, Lo/akq;->i:Z

    if-eqz v0, :cond_2

    .line 260
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current link strategy is NewLinkStrategy, pause sport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    iget v0, p0, Lo/akq;->c:I

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lo/akq;->e(II)Z

    .line 262
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->i()V

    goto :goto_0

    .line 263
    :cond_2
    iget-boolean v0, p0, Lo/akq;->h:Z

    if-eqz v0, :cond_3

    .line 265
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current link strategy only support heart rate, pause sport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->i()V

    .line 269
    :cond_3
    :goto_0
    invoke-direct {p0}, Lo/akq;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 270
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pauseSport only support run posture"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/akt;->a(I)V

    .line 273
    :cond_4
    return-void
.end method

.method static synthetic i(Lo/akq;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lo/akq;->f()V

    return-void
.end method

.method private k()V
    .locals 4

    .line 300
    iget-boolean v0, p0, Lo/akq;->g:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lo/akq;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 301
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current link strategy is OldLinkStrategy and single track, start sport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->f()V

    goto :goto_0

    .line 303
    :cond_0
    iget-boolean v0, p0, Lo/akq;->g:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lo/akq;->c:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 304
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current link strategy is OldLinkStrategy and suggest plan, start sport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    iget v0, p0, Lo/akq;->c:I

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/akq;->e(II)Z

    goto :goto_0

    .line 306
    :cond_1
    iget-boolean v0, p0, Lo/akq;->i:Z

    if-eqz v0, :cond_2

    .line 307
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current link strategy is NewLinkStrategy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    iget v0, p0, Lo/akq;->c:I

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/akq;->e(II)Z

    goto :goto_0

    .line 309
    :cond_2
    iget-boolean v0, p0, Lo/akq;->h:Z

    if-eqz v0, :cond_3

    .line 311
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "only support heart rate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    invoke-virtual {v0}, Lo/akt;->f()V

    .line 314
    :cond_3
    :goto_0
    invoke-direct {p0}, Lo/akq;->b()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 315
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSport only support run posture"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    invoke-static {}, Lo/akt;->d()Lo/akt;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/akt;->e(I)V

    .line 318
    :cond_4
    return-void
.end method

.method static synthetic k(Lo/akq;)Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lo/akq;->h:Z

    return v0
.end method

.method static synthetic p(Lo/akq;)Z
    .locals 1

    .line 28
    invoke-direct {p0}, Lo/akq;->h()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public c(Z)V
    .locals 0

    .line 61
    iput-boolean p1, p0, Lo/akq;->f:Z

    .line 62
    return-void
.end method

.method public c()Z
    .locals 4

    .line 187
    const-string v0, "HWhealthLinkage_"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerTrackStateListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    iget-object v1, p0, Lo/akq;->m:Lo/ceu;

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/cbl;->b(Lo/ceu;J)I

    .line 194
    const/4 v0, 0x1

    return v0
.end method

.method public d()I
    .locals 3

    .line 55
    sget-object v1, Lo/akq;->b:Ljava/lang/Object;

    monitor-enter v1

    .line 56
    :try_start_0
    iget v0, p0, Lo/akq;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v0

    .line 57
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method
