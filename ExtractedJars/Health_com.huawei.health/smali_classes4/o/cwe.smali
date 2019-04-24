.class public Lo/cwe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/operation/adapter/PluginOperationAdapter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cwe$b;
    }
.end annotation


# static fields
.field private static volatile a:Lo/cwe;

.field private static v:Lo/dnm;

.field private static y:Landroid/os/Handler;


# instance fields
.field b:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

.field c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private d:Landroid/content/Context;

.field e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private f:Lo/cmj;

.field private g:I

.field private h:I

.field private i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private l:I

.field private m:J

.field private n:I

.field private o:I

.field private p:J

.field private q:Lcom/huawei/operation/operation/PluginOperation;

.field private r:Lorg/json/JSONArray;

.field private s:J

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/operation/adapter/SportSummary;>;"
        }
    .end annotation
.end field

.field private u:Lorg/json/JSONObject;

.field private x:Ljava/lang/String;

.field private z:Ljava/lang/String;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 328
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 186
    const/4 v0, 0x0

    iput v0, p0, Lo/cwe;->h:I

    .line 187
    const/4 v0, 0x0

    iput v0, p0, Lo/cwe;->g:I

    .line 188
    const/4 v0, 0x0

    iput v0, p0, Lo/cwe;->o:I

    .line 189
    const/4 v0, 0x0

    iput v0, p0, Lo/cwe;->n:I

    .line 190
    const/4 v0, 0x0

    iput v0, p0, Lo/cwe;->l:I

    .line 191
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cwe;->m:J

    .line 192
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cwe;->p:J

    .line 193
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cwe;->s:J

    .line 294
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwe;->u:Lorg/json/JSONObject;

    .line 295
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwe;->q:Lcom/huawei/operation/operation/PluginOperation;

    .line 312
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwe;->z:Ljava/lang/String;

    .line 313
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwe;->x:Ljava/lang/String;

    .line 329
    if-eqz p1, :cond_0

    .line 330
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    goto :goto_0

    .line 332
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    .line 334
    :goto_0
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/operation/operation/PluginOperation;->getInstance(Landroid/content/Context;)Lcom/huawei/operation/operation/PluginOperation;

    move-result-object v0

    iput-object v0, p0, Lo/cwe;->q:Lcom/huawei/operation/operation/PluginOperation;

    .line 335
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/cwe;->k:Ljava/util/Map;

    .line 336
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/cwe;->i:Ljava/util/Map;

    .line 337
    invoke-direct {p0}, Lo/cwe;->a()V

    .line 338
    return-void
.end method

.method static synthetic a(Lo/cwe;)I
    .locals 1

    .line 120
    iget v0, p0, Lo/cwe;->o:I

    return v0
.end method

.method static synthetic a(Lo/cwe;I)I
    .locals 0

    .line 120
    iput p1, p0, Lo/cwe;->n:I

    return p1
.end method

.method private a(Ljava/util/Date;)J
    .locals 3

    .line 1408
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 1409
    invoke-virtual {v2, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 1410
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1411
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1412
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1413
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1414
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic a(Lo/cwe;J)J
    .locals 0

    .line 120
    iput-wide p1, p0, Lo/cwe;->m:J

    return-wide p1
.end method

.method public static a(Landroid/content/Context;)Lo/cwe;
    .locals 3

    .line 317
    sget-object v0, Lo/cwe;->a:Lo/cwe;

    if-nez v0, :cond_1

    .line 318
    const-class v1, Lo/cwe;

    monitor-enter v1

    .line 319
    :try_start_0
    sget-object v0, Lo/cwe;->a:Lo/cwe;

    if-nez v0, :cond_0

    .line 320
    new-instance v0, Lo/cwe;

    invoke-direct {v0, p0}, Lo/cwe;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/cwe;->a:Lo/cwe;

    .line 321
    sget-object v0, Lo/cwe;->a:Lo/cwe;

    iget-object v0, v0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    sput-object v0, Lo/cwe;->v:Lo/dnm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 323
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 325
    :cond_1
    :goto_0
    sget-object v0, Lo/cwe;->a:Lo/cwe;

    return-object v0
.end method

.method private a()V
    .locals 3

    .line 341
    iget-object v0, p0, Lo/cwe;->k:Ljava/util/Map;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x102

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    iget-object v0, p0, Lo/cwe;->k:Ljava/util/Map;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x101

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    iget-object v0, p0, Lo/cwe;->k:Ljava/util/Map;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x103

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    iget-object v0, p0, Lo/cwe;->i:Ljava/util/Map;

    const-string v1, "km"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    iget-object v0, p0, Lo/cwe;->i:Ljava/util/Map;

    const-string v1, "s"

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    iget-object v0, p0, Lo/cwe;->i:Ljava/util/Map;

    const-string v1, "cal"

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    return-void
.end method

.method private a(Lcom/huawei/hihealth/HiDataReadOption;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 440
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cwe$2;

    invoke-direct {v1, p0, p3, p2}, Lo/cwe$2;-><init>(Lo/cwe;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V

    invoke-interface {v0, p1, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 464
    return-void
.end method

.method private a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 1501
    iget-object v0, p0, Lo/cwe;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/operation/adapter/SportSummary;

    .line 1503
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-virtual {v5}, Lcom/huawei/operation/adapter/SportSummary;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1504
    iget-object v0, p0, Lo/cwe;->r:Lorg/json/JSONArray;

    invoke-virtual {v0, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1509
    goto :goto_1

    .line 1505
    :catch_0
    move-exception v6

    .line 1506
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "responseSportData sportSummary exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1507
    iget-object v0, p0, Lo/cwe;->u:Lorg/json/JSONObject;

    const/16 v1, 0x7cf

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1508
    return-void

    .line 1510
    :goto_1
    goto :goto_0

    .line 1513
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/cwe;->u:Lorg/json/JSONObject;

    const-string v1, "summaries"

    iget-object v2, p0, Lo/cwe;->r:Lorg/json/JSONArray;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1514
    iget-object v0, p0, Lo/cwe;->u:Lorg/json/JSONObject;

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1518
    goto :goto_2

    .line 1515
    :catch_1
    move-exception v4

    .line 1516
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "responseSportData sportDataJson exception "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1517
    iget-object v0, p0, Lo/cwe;->u:Lorg/json/JSONObject;

    const/16 v1, 0x7cf

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1519
    :goto_2
    return-void
.end method

.method private a(Lorg/json/JSONArray;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 586
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiHealthData;

    .line 587
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v6

    .line 588
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v8

    .line 589
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v10

    .line 590
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v11

    .line 591
    const-string v12, ""

    .line 592
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v13

    .line 593
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiHealthData;->getFloatValue()F

    move-result v14

    .line 595
    new-instance v15, Lorg/json/JSONObject;

    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    .line 596
    new-instance v16, Lorg/json/JSONArray;

    invoke-direct/range {v16 .. v16}, Lorg/json/JSONArray;-><init>()V

    .line 597
    new-instance v17, Lorg/json/JSONObject;

    invoke-direct/range {v17 .. v17}, Lorg/json/JSONObject;-><init>()V

    .line 601
    const-string v0, "startTime"

    move-object/from16 v1, v17

    :try_start_0
    invoke-virtual {v1, v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 602
    const-string v0, "endTime"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 603
    const-string v0, "key"

    move-object/from16 v1, v17

    move-object/from16 v2, p3

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 604
    const-string v0, "value"

    float-to-double v1, v14

    move-object/from16 v3, v17

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 605
    const-string v0, "unit"

    move-object/from16 v1, v17

    move-object/from16 v2, p4

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 606
    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 607
    const-string v0, "startTime"

    invoke-virtual {v15, v0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 608
    const-string v0, "endTime"

    invoke-virtual {v15, v0, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 609
    const-string v0, "metadata"

    invoke-virtual {v15, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 610
    const-string v0, "recordId"

    invoke-virtual {v15, v0, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 611
    const-string v0, "type"

    invoke-virtual {v15, v0, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 612
    const-string v0, "timeZone"

    invoke-virtual {v15, v0, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 613
    const-string v0, "samplePoints"

    move-object/from16 v1, v16

    invoke-virtual {v15, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 618
    goto :goto_1

    .line 614
    :catch_0
    move-exception v18

    .line 615
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealHealthData healthData Exception = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v18 .. v18}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 616
    move-object/from16 v0, p5

    const/16 v1, 0x7cf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 617
    return-void

    .line 619
    :goto_1
    move-object/from16 v0, p1

    invoke-virtual {v0, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 621
    goto/16 :goto_0

    .line 622
    :cond_0
    return-void
.end method

.method static synthetic b(Lo/cwe;)I
    .locals 1

    .line 120
    iget v0, p0, Lo/cwe;->h:I

    return v0
.end method

.method static synthetic b(Lo/cwe;I)I
    .locals 0

    .line 120
    iput p1, p0, Lo/cwe;->h:I

    return p1
.end method

.method private b(JJI)Lcom/huawei/hihealth/HiAggregateOption;
    .locals 5

    .line 1021
    new-instance v2, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 1022
    invoke-virtual {v2, p1, p2}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 1023
    invoke-virtual {v2, p3, p4}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 1024
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 1025
    const/4 v3, 0x0

    .line 1026
    const/4 v4, 0x0

    .line 1027
    packed-switch p5, :pswitch_data_0

    goto/16 :goto_0

    .line 1031
    :pswitch_0
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 1032
    const/4 v3, 0x7

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 1040
    const/4 v0, 0x7

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "startTime"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "endTime"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "deepDuration"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    const-string v0, "lightDuration"

    const/4 v1, 0x3

    aput-object v0, v4, v1

    const-string v0, "awakeDuration"

    const/4 v1, 0x4

    aput-object v0, v4, v1

    const-string v0, "awakeTimes"

    const/4 v1, 0x5

    aput-object v0, v4, v1

    const-string v0, "totalDuration"

    const/4 v1, 0x6

    aput-object v0, v4, v1

    .line 1041
    goto/16 :goto_0

    .line 1045
    :pswitch_1
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 1046
    const/16 v3, 0x8

    new-array v3, v3, [I

    fill-array-data v3, :array_1

    .line 1054
    const/16 v0, 0x8

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "bloodsugar_bf_before"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "bloodsugar_bf_after"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "bloodsugar_lc_before"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    const-string v0, "bloodsugar_lc_after"

    const/4 v1, 0x3

    aput-object v0, v4, v1

    const-string v0, "bloodsugar_dn_before"

    const/4 v1, 0x4

    aput-object v0, v4, v1

    const-string v0, "bloodsugar_dn_after"

    const/4 v1, 0x5

    aput-object v0, v4, v1

    const-string v0, "bloodsugar_sl_before"

    const/4 v1, 0x6

    aput-object v0, v4, v1

    const-string v0, "bloodsugar_before_dawn"

    const/4 v1, 0x7

    aput-object v0, v4, v1

    .line 1064
    goto/16 :goto_0

    .line 1068
    :pswitch_2
    const/4 v3, 0x3

    new-array v3, v3, [I

    fill-array-data v3, :array_2

    .line 1071
    const/4 v0, 0x3

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "bloodpressure_systolic"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "bloodpressure_diastolic"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "heart_rate"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    .line 1075
    goto/16 :goto_0

    .line 1079
    :pswitch_3
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 1080
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setSortOrder(I)V

    .line 1081
    const-string v0, ""

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setFilter(Ljava/lang/String;)V

    .line 1082
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_3

    .line 1085
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "test"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 1088
    goto :goto_0

    .line 1092
    :pswitch_4
    const/4 v0, 0x3

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 1093
    invoke-static {}, Lo/cmk;->c()[I

    move-result-object v3

    .line 1094
    const/16 v0, 0x10

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "stat_core_sleep_dream_duration"

    const/4 v1, 0x0

    aput-object v0, v4, v1

    const-string v0, "stat_core_sleep_deep_duration"

    const/4 v1, 0x1

    aput-object v0, v4, v1

    const-string v0, "stat_core_sleep_shallow_duration"

    const/4 v1, 0x2

    aput-object v0, v4, v1

    const-string v0, "stat_core_sleep_wake_duration"

    const/4 v1, 0x3

    aput-object v0, v4, v1

    const-string v0, "stat_core_sleep_duration_sum"

    const/4 v1, 0x4

    aput-object v0, v4, v1

    const-string v0, "stat_core_sleep_deep_part_count"

    const/4 v1, 0x5

    aput-object v0, v4, v1

    const-string v0, "stat_core_sleep_wake_count"

    const/4 v1, 0x6

    aput-object v0, v4, v1

    const-string v0, "stat_core_sleep_noon_duration"

    const/4 v1, 0x7

    aput-object v0, v4, v1

    const-string v0, "stat_out_core_sleep_fall_time"

    const/16 v1, 0x8

    aput-object v0, v4, v1

    const-string v0, "stat_out_core_sleep_wake_up_time"

    const/16 v1, 0x9

    aput-object v0, v4, v1

    const-string v0, "stat_out_core_sleep_score"

    const/16 v1, 0xa

    aput-object v0, v4, v1

    const-string v0, "stat_out_core_sleep_latency"

    const/16 v1, 0xb

    aput-object v0, v4, v1

    const-string v0, "stat_out_core_sleep_go_bed_time"

    const/16 v1, 0xc

    aput-object v0, v4, v1

    const-string v0, "stat_out_core_sleep_valid_data"

    const/16 v1, 0xd

    aput-object v0, v4, v1

    const-string v0, "stat_out_core_sleep_efficiency"

    const/16 v1, 0xe

    aput-object v0, v4, v1

    const-string v0, "stat_out_core_sleep_snore_freq"

    const/16 v1, 0xf

    aput-object v0, v4, v1

    .line 1113
    .line 1119
    :goto_0
    :pswitch_5
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 1120
    invoke-virtual {v2, v4}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 1122
    const/16 v0, 0x8

    if-eq v0, p5, :cond_0

    .line 1123
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitSize(I)V

    .line 1124
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setReadType(I)V

    .line 1126
    :cond_0
    return-object v2

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch

    :array_0
    .array-data 4
        0xabe6
        0xabe7
        0xabe1
        0xabe2
        0xabe3
        0xabe5
        0xabe4
    .end array-data

    :array_1
    .array-data 4
        0x7d8
        0x7d9
        0x7da
        0x7db
        0x7dc
        0x7dd
        0x7de
        0x7df
    .end array-data

    :array_2
    .array-data 4
        0x7d6
        0x7d7
        0x7d2
    .end array-data

    :array_3
    .array-data 4
        0x2716
    .end array-data
.end method

.method private b()V
    .locals 4

    .line 2167
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter_obtainToken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2168
    new-instance v0, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    invoke-direct {v0}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;-><init>()V

    iput-object v0, p0, Lo/cwe;->b:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    .line 2169
    new-instance v0, Lo/cwe$b;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1, p0}, Lo/cwe$b;-><init>(Lo/cwe;Landroid/os/Looper;Lo/cwe;)V

    sput-object v0, Lo/cwe;->y:Landroid/os/Handler;

    .line 2170
    iget-object v0, p0, Lo/cwe;->b:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    sget-object v1, Lo/cwe;->y:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->initHandler(Landroid/os/Handler;)V

    .line 2171
    iget-object v0, p0, Lo/cwe;->b:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    iget-object v1, p0, Lo/cwe;->d:Landroid/content/Context;

    new-instance v2, Lo/cwe$3;

    invoke-direct {v2, p0}, Lo/cwe$3;-><init>(Lo/cwe;)V

    new-instance v3, Lo/cwe$6;

    invoke-direct {v3, p0}, Lo/cwe$6;-><init>(Lo/cwe;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->hmsConnect(Landroid/content/Context;Lcom/huawei/hms/api/HuaweiApiClient$ConnectionCallbacks;Lcom/huawei/hms/api/HuaweiApiClient$OnConnectionFailedListener;)V

    .line 2193
    return-void
.end method

.method private b(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 1658
    new-instance v2, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 1659
    invoke-virtual {v2, p1, p2, p3, p4}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 1661
    const/4 v3, 0x1

    new-array v3, v3, [I

    fill-array-data v3, :array_0

    .line 1663
    invoke-virtual {v2, v3}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 1664
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cwe$12;

    invoke-direct {v1, p0, p5}, Lo/cwe$12;-><init>(Lo/cwe;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 1757
    return-void

    :array_0
    .array-data 4
        0x7532
    .end array-data
.end method

.method private b(Lcom/huawei/hihealth/HiAggregateOption;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 468
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cwe$9;

    invoke-direct {v1, p0, p3, p2}, Lo/cwe$9;-><init>(Lo/cwe;Lcom/huawei/hwbasemgr/IBaseResponseCallback;I)V

    invoke-interface {v0, p1, v1}, Lo/clt;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 484
    return-void
.end method

.method private b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 1421
    new-instance v3, Lcom/huawei/hihealth/HiAggregateOption;

    invoke-direct {v3}, Lcom/huawei/hihealth/HiAggregateOption;-><init>()V

    .line 1423
    iget-wide v0, p0, Lo/cwe;->p:J

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setStartTime(J)V

    .line 1424
    iget-wide v0, p0, Lo/cwe;->s:J

    invoke-virtual {v3, v0, v1}, Lcom/huawei/hihealth/HiAggregateOption;->setEndTime(J)V

    .line 1425
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setType([I)V

    .line 1431
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "step_sum"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "calorie_sum"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "distance_sum"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "track_distance_sum"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "track_calories_sum"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setConstantsKey([Ljava/lang/String;)V

    .line 1432
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setAggregateType(I)V

    .line 1433
    const/4 v0, 0x3

    invoke-virtual {v3, v0}, Lcom/huawei/hihealth/HiAggregateOption;->setGroupUnitType(I)V

    .line 1434
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/cwe$8;

    invoke-direct {v1, p0, p1}, Lo/cwe$8;-><init>(Lo/cwe;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {v0, v3, v1}, Lo/clq;->b(Lcom/huawei/hihealth/HiAggregateOption;Lo/cly;)V

    .line 1494
    return-void

    :array_0
    .array-data 4
        0x9c42
        0x9c43
        0x9c44
        0xa413
        0xa412
    .end array-data
.end method

.method static synthetic b(Lo/cwe;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 120
    invoke-direct {p0, p1, p2}, Lo/cwe;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lo/cwe;)I
    .locals 1

    .line 120
    iget v0, p0, Lo/cwe;->g:I

    return v0
.end method

.method static synthetic c(Lo/cwe;I)I
    .locals 0

    .line 120
    iput p1, p0, Lo/cwe;->l:I

    return p1
.end method

.method private c(Ljava/util/Date;)J
    .locals 3

    .line 1397
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 1398
    invoke-virtual {v2, p1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 1399
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1400
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1401
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1402
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 1403
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private c()V
    .locals 12

    .line 1300
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 1301
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 1302
    invoke-direct {p0, v6}, Lo/cwe;->c(Ljava/util/Date;)J

    move-result-wide v7

    .line 1303
    const/4 v0, 0x0

    iput v0, p0, Lo/cwe;->n:I

    .line 1304
    const/4 v0, 0x0

    iput v0, p0, Lo/cwe;->l:I

    .line 1307
    new-instance v9, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v9}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 1308
    invoke-virtual {v9, v7, v8, v4, v5}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 1310
    const/4 v10, 0x1

    new-array v10, v10, [I

    fill-array-data v10, :array_0

    .line 1311
    invoke-virtual {v9, v10}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 1313
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cwe$7;

    invoke-direct {v1, p0}, Lo/cwe$7;-><init>(Lo/cwe;)V

    invoke-interface {v0, v9, v1}, Lo/clt;->e(Lcom/huawei/hihealth/HiDataReadOption;Lo/cmd;)V

    .line 1389
    const-wide/16 v0, 0x1f4

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1392
    goto :goto_0

    .line 1390
    :catch_0
    move-exception v11

    .line 1391
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "thread waiting fail!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1393
    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x7532
    .end array-data
.end method

.method private c(ILjava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/hihealth/HiHealthData;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 675
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_f

    .line 679
    :pswitch_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 680
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 681
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 682
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getDay()J

    move-result-wide v8

    .line 683
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getCreateTime()J

    move-result-wide v10

    .line 684
    const-string v0, "startTime"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v12

    .line 685
    const-string v0, "endTime"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v14

    .line 686
    const-string v0, "deepDuration"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v16

    .line 687
    const-string v0, "lightDuration"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v17

    .line 688
    const-string v0, "awakeDuration"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v18

    .line 689
    const-string v0, "awakeTimes"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v19

    .line 690
    const-string v0, "totalDuration"

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v20

    .line 692
    new-instance v21, Lorg/json/JSONObject;

    invoke-direct/range {v21 .. v21}, Lorg/json/JSONObject;-><init>()V

    .line 693
    new-instance v22, Lorg/json/JSONObject;

    invoke-direct/range {v22 .. v22}, Lorg/json/JSONObject;-><init>()V

    .line 696
    const-string v0, "startTime"

    move-object/from16 v1, v22

    :try_start_0
    invoke-virtual {v1, v0, v12, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 697
    const-string v0, "endTime"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0, v14, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 698
    const-string v0, "deepDuration"

    move/from16 v1, v16

    float-to-double v1, v1

    move-object/from16 v3, v22

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 699
    const-string v0, "lightDuration"

    move/from16 v1, v17

    float-to-double v1, v1

    move-object/from16 v3, v22

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 700
    const-string v0, "awakeDuration"

    move/from16 v1, v18

    float-to-double v1, v1

    move-object/from16 v3, v22

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 701
    const-string v0, "awakeTimes"

    move/from16 v1, v19

    float-to-double v1, v1

    move-object/from16 v3, v22

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 702
    const-string v0, "totalDuration"

    move/from16 v1, v20

    float-to-double v1, v1

    move-object/from16 v3, v22

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 704
    const-string v0, "date"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 705
    const-string v0, "generateTime"

    move-object/from16 v1, v21

    invoke-virtual {v1, v0, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 706
    const-string v0, "sleepBasic"

    move-object/from16 v1, v21

    move-object/from16 v2, v22

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 711
    goto :goto_1

    .line 707
    :catch_0
    move-exception v23

    .line 708
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v23 .. v23}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 709
    move-object/from16 v0, p3

    const/16 v1, 0x3e9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 710
    return-void

    .line 712
    :goto_1
    move-object/from16 v0, v21

    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 714
    goto/16 :goto_0

    .line 716
    :cond_0
    const-string v0, "sleepTotal"

    :try_start_1
    invoke-virtual {v4, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 721
    goto :goto_2

    .line 717
    :catch_1
    move-exception v6

    .line 718
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 719
    move-object/from16 v0, p3

    const/16 v1, 0x7cf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 720
    return-void

    .line 722
    :goto_2
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jsonObject = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 723
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-interface {v0, v1, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 724
    goto/16 :goto_f

    .line 729
    :pswitch_1
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 730
    new-instance v7, Lorg/json/JSONArray;

    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V

    .line 731
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hihealth/HiHealthData;

    .line 732
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v10

    .line 733
    const-string v11, ""

    .line 734
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v12

    .line 735
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v13

    .line 736
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v15

    .line 737
    const-string v0, "bloodsugar_bf_before"

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v17

    .line 738
    const-string v0, "bloodsugar_bf_after"

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v18

    .line 739
    const-string v0, "bloodsugar_lc_before"

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v19

    .line 740
    const-string v0, "bloodsugar_lc_after"

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v20

    .line 741
    const-string v0, "bloodsugar_dn_before"

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v21

    .line 742
    const-string v0, "bloodsugar_dn_after"

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v22

    .line 743
    const-string v0, "bloodsugar_sl_before"

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v23

    .line 744
    const-string v0, "bloodsugar_before_dawn"

    invoke-virtual {v9, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v24

    .line 746
    new-instance v25, Lorg/json/JSONObject;

    invoke-direct/range {v25 .. v25}, Lorg/json/JSONObject;-><init>()V

    .line 747
    new-instance v26, Lorg/json/JSONArray;

    invoke-direct/range {v26 .. v26}, Lorg/json/JSONArray;-><init>()V

    .line 748
    new-instance v27, Lorg/json/JSONObject;

    invoke-direct/range {v27 .. v27}, Lorg/json/JSONObject;-><init>()V

    .line 749
    new-instance v28, Lorg/json/JSONObject;

    invoke-direct/range {v28 .. v28}, Lorg/json/JSONObject;-><init>()V

    .line 753
    const-string v0, "BLOOD_SUGAR_BF_BEFORE"

    move/from16 v1, v17

    float-to-double v1, v1

    move-object/from16 v3, v28

    :try_start_2
    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 754
    const-string v0, "BLOOD_SUGAR_BF_AFTER"

    move/from16 v1, v18

    float-to-double v1, v1

    move-object/from16 v3, v28

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 755
    const-string v0, "BLOOD_SUGAR_LC_BEFORE"

    move/from16 v1, v19

    float-to-double v1, v1

    move-object/from16 v3, v28

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 756
    const-string v0, "BLOOD_SUGAR_LC_AFTER"

    move/from16 v1, v20

    float-to-double v1, v1

    move-object/from16 v3, v28

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 757
    const-string v0, "BLOOD_SUGAR_DN_BEFORE"

    move/from16 v1, v21

    float-to-double v1, v1

    move-object/from16 v3, v28

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 758
    const-string v0, "BLOOD_SUGAR_DN_AFTER"

    move/from16 v1, v22

    float-to-double v1, v1

    move-object/from16 v3, v28

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 759
    const-string v0, "BLOOD_SUGAR_SL_BEFORE"

    move/from16 v1, v23

    float-to-double v1, v1

    move-object/from16 v3, v28

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 760
    const-string v0, "BLOOD_SUGAR_BEFORE_DAWN"

    move/from16 v1, v24

    float-to-double v1, v1

    move-object/from16 v3, v28

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 761
    const-string v0, "startTime"

    move-object/from16 v1, v27

    invoke-virtual {v1, v0, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 762
    const-string v0, "endTime"

    move-object/from16 v1, v27

    move-wide v2, v15

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 763
    const-string v0, "key"

    const-string v1, "BLOODGLUCOSE_BLOODSUGAR"

    move-object/from16 v2, v27

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 764
    const-string v0, "value"

    move-object/from16 v1, v27

    move-object/from16 v2, v28

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 765
    const-string v0, "unit"

    const-string v1, ""

    move-object/from16 v2, v27

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 766
    move-object/from16 v0, v26

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 767
    const-string v0, "startTime"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0, v13, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 768
    const-string v0, "endTime"

    move-object/from16 v1, v25

    move-wide v2, v15

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 769
    const-string v0, "metadata"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 770
    const-string v0, "recordId"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 771
    const-string v0, "type"

    move-object/from16 v1, v25

    move/from16 v2, p1

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 772
    const-string v0, "timeZone"

    move-object/from16 v1, v25

    invoke-virtual {v1, v0, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 773
    const-string v0, "samplePoints"

    move-object/from16 v1, v25

    move-object/from16 v2, v26

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 778
    goto :goto_4

    .line 774
    :catch_2
    move-exception v29

    .line 775
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealHiHealthAggregateData type4 exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v29 .. v29}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 776
    move-object/from16 v0, p3

    const/16 v1, 0x7cf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 777
    return-void

    .line 779
    :goto_4
    move-object/from16 v0, v25

    invoke-virtual {v7, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 781
    goto/16 :goto_3

    .line 784
    :cond_1
    const-string v0, "data"

    :try_start_3
    invoke-virtual {v6, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    .line 789
    goto :goto_5

    .line 785
    :catch_3
    move-exception v8

    .line 786
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealHiHealthAggregateData type4 json exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 787
    move-object/from16 v0, p3

    const/16 v1, 0x7cf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 788
    return-void

    .line 790
    :goto_5
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bloodSugarObject = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 791
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-interface {v0, v1, v6}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 792
    goto/16 :goto_f

    .line 798
    :pswitch_2
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 799
    new-instance v9, Lorg/json/JSONArray;

    invoke-direct {v9}, Lorg/json/JSONArray;-><init>()V

    .line 800
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hihealth/HiHealthData;

    .line 801
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v12

    .line 802
    const-string v13, ""

    .line 803
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v14

    .line 804
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v15

    .line 805
    invoke-virtual {v11}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v17

    .line 806
    const-string v0, "bloodpressure_systolic"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v19

    .line 807
    const-string v0, "bloodpressure_diastolic"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v20

    .line 808
    const-string v0, "heart_rate"

    invoke-virtual {v11, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v21

    .line 810
    new-instance v22, Lorg/json/JSONObject;

    invoke-direct/range {v22 .. v22}, Lorg/json/JSONObject;-><init>()V

    .line 811
    new-instance v23, Lorg/json/JSONArray;

    invoke-direct/range {v23 .. v23}, Lorg/json/JSONArray;-><init>()V

    .line 812
    new-instance v24, Lorg/json/JSONObject;

    invoke-direct/range {v24 .. v24}, Lorg/json/JSONObject;-><init>()V

    .line 813
    new-instance v25, Lorg/json/JSONObject;

    invoke-direct/range {v25 .. v25}, Lorg/json/JSONObject;-><init>()V

    .line 816
    const-string v0, "BLOODPRESSURE_DIASTOLIC"

    move/from16 v1, v20

    float-to-double v1, v1

    move-object/from16 v3, v25

    :try_start_4
    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 817
    const-string v0, "BLOODPRESSURE_SYSTOLIC"

    move/from16 v1, v19

    float-to-double v1, v1

    move-object/from16 v3, v25

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 818
    const-string v0, "DATA_POINT_DYNAMIC_HEARTRATE"

    move/from16 v1, v21

    float-to-double v1, v1

    move-object/from16 v3, v25

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 819
    const-string v0, "startTime"

    move-object/from16 v1, v24

    move-wide v2, v15

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 820
    const-string v0, "endTime"

    move-object/from16 v1, v24

    move-wide/from16 v2, v17

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 821
    const-string v0, "key"

    const-string v1, "BLOODPRESSURE"

    move-object/from16 v2, v24

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 822
    const-string v0, "value"

    move-object/from16 v1, v24

    move-object/from16 v2, v25

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 823
    const-string v0, "unit"

    const-string v1, ""

    move-object/from16 v2, v24

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 824
    move-object/from16 v0, v23

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 825
    const-string v0, "startTime"

    move-object/from16 v1, v22

    move-wide v2, v15

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 826
    const-string v0, "endTime"

    move-object/from16 v1, v22

    move-wide/from16 v2, v17

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 827
    const-string v0, "metadata"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 828
    const-string v0, "recordId"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 829
    const-string v0, "type"

    move-object/from16 v1, v22

    move/from16 v2, p1

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 830
    const-string v0, "timeZone"

    move-object/from16 v1, v22

    invoke-virtual {v1, v0, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 831
    const-string v0, "samplePoints"

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_4

    .line 836
    goto :goto_7

    .line 832
    :catch_4
    move-exception v26

    .line 833
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealHiHealthAggregateData type5 exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v26 .. v26}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 834
    move-object/from16 v0, p3

    const/16 v1, 0x7cf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 835
    return-void

    .line 837
    :goto_7
    move-object/from16 v0, v22

    invoke-virtual {v9, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 839
    goto/16 :goto_6

    .line 841
    :cond_2
    const-string v0, "data"

    :try_start_5
    invoke-virtual {v8, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_5

    .line 846
    goto :goto_8

    .line 842
    :catch_5
    move-exception v10

    .line 843
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealHiHealthAggregateData type5 json exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 844
    move-object/from16 v0, p3

    const/16 v1, 0x7cf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 845
    return-void

    .line 847
    :goto_8
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bloodPresureObject = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 848
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-interface {v0, v1, v8}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 849
    goto/16 :goto_f

    .line 854
    :pswitch_3
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 855
    new-instance v11, Lorg/json/JSONArray;

    invoke-direct {v11}, Lorg/json/JSONArray;-><init>()V

    .line 856
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_9
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/hihealth/HiHealthData;

    .line 857
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v14

    .line 858
    const/4 v0, 0x0

    if-eq v0, v14, :cond_3

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "null"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "0"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 860
    :cond_3
    const-string v15, ""

    .line 861
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getTimeZone()Ljava/lang/String;

    move-result-object v16

    .line 862
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v17

    .line 863
    invoke-virtual {v13}, Lcom/huawei/hihealth/HiHealthData;->getEndTime()J

    move-result-wide v19

    .line 865
    const-string v0, "trackdata_deviceType"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getInt(Ljava/lang/String;)I

    move-result v21

    .line 866
    const-string v0, "weight"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v22

    .line 867
    const-string v0, "weight_bodyfatvalue"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v24

    .line 868
    const-string v0, "weight_bodyfat"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v26

    .line 869
    const-string v0, "weight_impedance"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v28

    .line 870
    const-string v0, "weight_bmi"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v30

    .line 871
    const-string v0, "weight_muscles"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v32

    .line 872
    const-string v0, "weight_water"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v34

    .line 873
    const-string v0, "weight_bone_mineral"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v36

    .line 874
    const-string v0, "weight_body_age"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v38

    .line 875
    const-string v0, "weight_body_score"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v40

    .line 876
    const-string v0, "weight_bmr"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v42

    .line 877
    const-string v0, "weight_waterrate"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v44

    .line 878
    const-string v0, "weight_fatlevel"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v46

    .line 879
    const-string v0, "weight_protein"

    invoke-virtual {v13, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v48

    .line 881
    new-instance v50, Lorg/json/JSONObject;

    invoke-direct/range {v50 .. v50}, Lorg/json/JSONObject;-><init>()V

    .line 882
    new-instance v51, Lorg/json/JSONArray;

    invoke-direct/range {v51 .. v51}, Lorg/json/JSONArray;-><init>()V

    .line 883
    new-instance v52, Lorg/json/JSONObject;

    invoke-direct/range {v52 .. v52}, Lorg/json/JSONObject;-><init>()V

    .line 884
    new-instance v53, Lorg/json/JSONObject;

    invoke-direct/range {v53 .. v53}, Lorg/json/JSONObject;-><init>()V

    .line 888
    const-string v0, "extendAttribute"

    const-string v1, ""

    move-object/from16 v2, v53

    :try_start_6
    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 889
    const-string v0, "weightSource"

    move-object/from16 v1, v53

    move/from16 v2, v21

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 890
    const-string v0, "bodyFatRate"

    move-object/from16 v1, v53

    move-wide/from16 v2, v26

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 891
    const-string v0, "bodyWeight"

    move-object/from16 v1, v53

    move-wide/from16 v2, v22

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 892
    const-string v0, "bodyFat"

    move-object/from16 v1, v53

    move-wide/from16 v2, v24

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 893
    const-string v0, "impedance"

    move-object/from16 v1, v53

    move-wide/from16 v2, v28

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 894
    const-string v0, "bmi"

    move-object/from16 v1, v53

    move-wide/from16 v2, v30

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 895
    const-string v0, "muscleMass"

    move-object/from16 v1, v53

    move-wide/from16 v2, v32

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 896
    const-string v0, "moisture"

    move-object/from16 v1, v53

    move-wide/from16 v2, v34

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 897
    const-string v0, "boneSalt"

    move-object/from16 v1, v53

    move-wide/from16 v2, v36

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 898
    const-string v0, "bodyAge"

    move-object/from16 v1, v53

    move-wide/from16 v2, v38

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 899
    const-string v0, "bodyScore"

    move-object/from16 v1, v53

    move-wide/from16 v2, v40

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 900
    const-string v0, "basalMetabolism"

    move-object/from16 v1, v53

    move-wide/from16 v2, v42

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 901
    const-string v0, "moistureRate"

    move-object/from16 v1, v53

    move-wide/from16 v2, v44

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 902
    const-string v0, "visceralFatLevel"

    move-object/from16 v1, v53

    move-wide/from16 v2, v46

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 903
    const-string v0, "proteinRate"

    move-object/from16 v1, v53

    move-wide/from16 v2, v48

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 905
    const-string v0, "startTime"

    move-object/from16 v1, v52

    move-wide/from16 v2, v17

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 906
    const-string v0, "endTime"

    move-object/from16 v1, v52

    move-wide/from16 v2, v19

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 907
    const-string v0, "key"

    const-string v1, "WEIGHT_BODYFAT_BROAD"

    move-object/from16 v2, v52

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 908
    const-string v0, "value"

    move-object/from16 v1, v52

    move-object/from16 v2, v53

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 909
    const-string v0, "unit"

    const-string v1, ""

    move-object/from16 v2, v52

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 910
    move-object/from16 v0, v51

    move-object/from16 v1, v52

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 911
    const-string v0, "startTime"

    move-object/from16 v1, v50

    move-wide/from16 v2, v17

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 912
    const-string v0, "endTime"

    move-object/from16 v1, v50

    move-wide/from16 v2, v19

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 913
    const-string v0, "metadata"

    move-object/from16 v1, v50

    invoke-virtual {v1, v0, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 914
    const-string v0, "recordId"

    move-object/from16 v1, v50

    invoke-virtual {v1, v0, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 915
    const-string v0, "type"

    move-object/from16 v1, v50

    move/from16 v2, p1

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 916
    const-string v0, "timeZone"

    move-object/from16 v1, v50

    move-object/from16 v2, v16

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 917
    const-string v0, "samplePoints"

    move-object/from16 v1, v50

    move-object/from16 v2, v51

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_6

    .line 922
    goto :goto_a

    .line 918
    :catch_6
    move-exception v54

    .line 919
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealHiHealthAggregateData type8 exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v54 .. v54}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 920
    move-object/from16 v0, p3

    const/16 v1, 0x7cf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 921
    return-void

    .line 923
    :goto_a
    move-object/from16 v0, v50

    invoke-virtual {v11, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 925
    :cond_4
    goto/16 :goto_9

    .line 927
    :cond_5
    const-string v0, "data"

    :try_start_7
    invoke-virtual {v10, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_7
    .catch Lorg/json/JSONException; {:try_start_7 .. :try_end_7} :catch_7

    .line 932
    goto :goto_b

    .line 928
    :catch_7
    move-exception v12

    .line 929
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealHiHealthAggregateData type5 json exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 930
    move-object/from16 v0, p3

    const/16 v1, 0x7cf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 931
    return-void

    .line 933
    :goto_b
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weightObj = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 934
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-interface {v0, v1, v10}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 935
    goto/16 :goto_f

    .line 940
    :pswitch_4
    new-instance v12, Lorg/json/JSONObject;

    invoke-direct {v12}, Lorg/json/JSONObject;-><init>()V

    .line 941
    new-instance v13, Lorg/json/JSONArray;

    invoke-direct {v13}, Lorg/json/JSONArray;-><init>()V

    .line 942
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_c
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/hihealth/HiHealthData;

    .line 943
    invoke-virtual {v15}, Lcom/huawei/hihealth/HiHealthData;->getDay()J

    move-result-wide v16

    .line 944
    invoke-virtual {v15}, Lcom/huawei/hihealth/HiHealthData;->getCreateTime()J

    move-result-wide v18

    .line 945
    const-string v0, "stat_out_core_sleep_fall_time"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v20

    .line 946
    const-string v0, "stat_out_core_sleep_wake_up_time"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v22

    .line 947
    const-string v0, "stat_out_core_sleep_score"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getLong(Ljava/lang/String;)J

    move-result-wide v24

    .line 948
    const-string v0, "stat_out_core_sleep_latency"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v26

    .line 949
    const-string v0, "stat_out_core_sleep_go_bed_time"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v27

    .line 950
    const-string v0, "stat_out_core_sleep_valid_data"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v28

    .line 951
    const-string v0, "stat_out_core_sleep_efficiency"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v29

    .line 952
    const-string v0, "stat_core_sleep_shallow_duration"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v30

    .line 953
    const-string v0, "stat_core_sleep_deep_duration"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v31

    .line 954
    const-string v0, "stat_core_sleep_dream_duration"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v32

    .line 955
    const-string v0, "stat_core_sleep_wake_duration"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v33

    .line 956
    const-string v0, "stat_core_sleep_duration_sum"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v34

    .line 957
    const-string v0, "stat_core_sleep_wake_count"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v35

    .line 958
    const-string v0, "stat_core_sleep_deep_part_count"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v36

    .line 959
    const-string v0, "stat_out_core_sleep_snore_freq"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v37

    .line 960
    const-string v0, "stat_core_sleep_noon_duration"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getFloat(Ljava/lang/String;)F

    move-result v38

    .line 961
    const/16 v39, 0x0

    .line 963
    new-instance v40, Lorg/json/JSONObject;

    invoke-direct/range {v40 .. v40}, Lorg/json/JSONObject;-><init>()V

    .line 964
    new-instance v41, Lorg/json/JSONObject;

    invoke-direct/range {v41 .. v41}, Lorg/json/JSONObject;-><init>()V

    .line 967
    const-string v0, "fallAsleepTime"

    move-object/from16 v1, v41

    move-wide/from16 v2, v20

    :try_start_8
    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 968
    const-string v0, "wakeupTime"

    move-object/from16 v1, v41

    move-wide/from16 v2, v22

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 969
    const-string v0, "sleepScore"

    move-object/from16 v1, v41

    move-wide/from16 v2, v24

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 970
    const-string v0, "sleepLatency "

    move/from16 v1, v26

    float-to-double v1, v1

    move-object/from16 v3, v41

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 971
    const-string v0, "goBedTime"

    move/from16 v1, v27

    float-to-double v1, v1

    move-object/from16 v3, v41

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 972
    const-string v0, "validData"

    move/from16 v1, v28

    float-to-double v1, v1

    move-object/from16 v3, v41

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 973
    const-string v0, "sleepEfficiency"

    move/from16 v1, v29

    float-to-double v1, v1

    move-object/from16 v3, v41

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 974
    const-string v0, "lightSleepTime"

    move/from16 v1, v30

    float-to-double v1, v1

    move-object/from16 v3, v41

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 975
    const-string v0, "deepSleepTime"

    move/from16 v1, v31

    float-to-double v1, v1

    move-object/from16 v3, v41

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 976
    const-string v0, "dreamTime"

    move/from16 v1, v32

    float-to-double v1, v1

    move-object/from16 v3, v41

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 977
    const-string v0, "awakeTime"

    move/from16 v1, v33

    float-to-double v1, v1

    move-object/from16 v3, v41

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 978
    const-string v0, "allSleepTime"

    move/from16 v1, v34

    float-to-double v1, v1

    move-object/from16 v3, v41

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 979
    const-string v0, "wakeupCnt"

    move/from16 v1, v35

    float-to-double v1, v1

    move-object/from16 v3, v41

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 980
    const-string v0, "deepSleepPart"

    move/from16 v1, v36

    float-to-double v1, v1

    move-object/from16 v3, v41

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 981
    const-string v0, "snoreFreq"

    move/from16 v1, v37

    float-to-double v1, v1

    move-object/from16 v3, v41

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 982
    const-string v0, "daySleepTime"

    move/from16 v1, v38

    float-to-double v1, v1

    move-object/from16 v3, v41

    invoke-virtual {v3, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 983
    const-string v0, "sleepSuggestion"

    move-object/from16 v1, v41

    move-object/from16 v2, v39

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 985
    const-string v0, "date"

    move-object/from16 v1, v40

    move-wide/from16 v2, v16

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 986
    const-string v0, "generateTime"

    move-object/from16 v1, v40

    move-wide/from16 v2, v18

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 987
    const-string v0, "professionalSleep"

    move-object/from16 v1, v40

    move-object/from16 v2, v41

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_8
    .catch Lorg/json/JSONException; {:try_start_8 .. :try_end_8} :catch_8

    .line 992
    goto :goto_d

    .line 988
    :catch_8
    move-exception v42

    .line 989
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual/range {v42 .. v42}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 990
    move-object/from16 v0, p3

    const/16 v1, 0x7cf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 991
    return-void

    .line 993
    :goto_d
    move-object/from16 v0, v40

    invoke-virtual {v13, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 994
    goto/16 :goto_c

    .line 996
    :cond_6
    const-string v0, "professionalSleepTotal"

    :try_start_9
    invoke-virtual {v12, v0, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_9
    .catch Lorg/json/JSONException; {:try_start_9 .. :try_end_9} :catch_9

    .line 1001
    goto :goto_e

    .line 997
    :catch_9
    move-exception v14

    .line 998
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v14}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 999
    move-object/from16 v0, p3

    const/16 v1, 0x7cf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1000
    return-void

    .line 1002
    :goto_e
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "coreSleepObject = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1003
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-interface {v0, v1, v12}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1004
    .line 1009
    :goto_f
    :pswitch_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method static synthetic c(Lo/cwe;ILandroid/util/SparseArray;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 120
    invoke-direct {p0, p1, p2, p3}, Lo/cwe;->e(ILandroid/util/SparseArray;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic c(Lo/cwe;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 120
    invoke-direct {p0, p1, p2}, Lo/cwe;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private c([II)Z
    .locals 5

    .line 429
    move-object v1, p1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget v4, v1, v3

    .line 430
    if-ne v4, p2, :cond_0

    .line 431
    const/4 v0, 0x1

    return v0

    .line 429
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 434
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic d(Lo/cwe;I)I
    .locals 0

    .line 120
    iput p1, p0, Lo/cwe;->g:I

    return p1
.end method

.method private d(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 10

    .line 1898
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 1899
    const/4 v0, 0x0

    invoke-virtual {v4, p2, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v5

    .line 1900
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_1

    .line 1901
    :cond_0
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the activity to jump to is not found or found more than one!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1902
    const/4 v0, 0x0

    return-object v0

    .line 1904
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 1905
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v7, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 1906
    new-instance v8, Landroid/content/ComponentName;

    invoke-direct {v8, v6, v7}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1907
    new-instance v9, Landroid/content/Intent;

    invoke-direct {v9, p2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 1908
    invoke-virtual {v9, v8}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 1909
    return-object v9
.end method

.method private d(JJI)Lcom/huawei/hihealth/HiDataReadOption;
    .locals 6

    .line 1137
    new-instance v4, Lcom/huawei/hihealth/HiDataReadOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataReadOption;-><init>()V

    .line 1138
    invoke-virtual {v4, p1, p2, p3, p4}, Lcom/huawei/hihealth/HiDataReadOption;->setTimeInterval(JJ)V

    .line 1139
    const/4 v5, 0x0

    .line 1140
    sparse-switch p5, :sswitch_data_0

    goto :goto_0

    .line 1143
    :sswitch_0
    const/4 v5, 0x2

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    .line 1145
    goto :goto_1

    .line 1148
    :sswitch_1
    const/4 v5, 0x4

    new-array v5, v5, [I

    fill-array-data v5, :array_1

    .line 1154
    goto :goto_1

    .line 1156
    :goto_0
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHiDataReadOptionByType in default branch"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1160
    :goto_1
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiDataReadOption;->setType([I)V

    .line 1161
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch

    :array_0
    .array-data 4
        0x7d2
        0x7e2
    .end array-data

    :array_1
    .array-data 4
        0x7e3
        0x7e4
        0x7e5
        0xad12
    .end array-data
.end method

.method static synthetic d(Lo/cwe;)Ljava/util/List;
    .locals 1

    .line 120
    iget-object v0, p0, Lo/cwe;->t:Ljava/util/List;

    return-object v0
.end method

.method public static d()V
    .locals 2

    .line 350
    sget-object v0, Lo/cwe;->a:Lo/cwe;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 351
    sget-object v0, Lo/cwe;->a:Lo/cwe;

    iget-object v0, v0, Lo/cwe;->b:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 352
    sget-object v0, Lo/cwe;->a:Lo/cwe;

    iget-object v0, v0, Lo/cwe;->b:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    invoke-virtual {v0}, Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;->shutDownThread()V

    .line 353
    sget-object v0, Lo/cwe;->a:Lo/cwe;

    const/4 v1, 0x0

    iput-object v1, v0, Lo/cwe;->b:Lcom/huawei/hwcloudmodel/agreement/AccessTokenManager;

    .line 357
    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lo/cwe;->a:Lo/cwe;

    .line 358
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 2147
    iput-object p1, p0, Lo/cwe;->z:Ljava/lang/String;

    .line 2148
    iput-object p2, p0, Lo/cwe;->x:Ljava/lang/String;

    .line 2150
    new-instance v1, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;

    invoke-direct {v1}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;-><init>()V

    .line 2153
    new-instance v0, Lo/cwe$1;

    invoke-direct {v0, p0}, Lo/cwe$1;-><init>(Lo/cwe;)V

    invoke-virtual {v1, p1, p2, v0}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->queryHttpReq(Ljava/lang/String;Ljava/lang/String;Lo/czi;)Ljava/lang/String;

    .line 2165
    return-void
.end method

.method static synthetic d(Lo/cwe;ILjava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 120
    invoke-direct {p0, p1, p2, p3}, Lo/cwe;->c(ILjava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 6

    .line 1174
    const/4 v4, 0x0

    .line 1176
    const-string v0, "yyyyMMdd"

    :try_start_0
    invoke-static {p1, p2, v0}, Lo/cnk;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v4

    .line 1183
    goto :goto_0

    .line 1177
    :catch_0
    move-exception v5

    .line 1178
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parse date exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1179
    const/4 v0, 0x0

    return v0

    .line 1180
    :catch_1
    move-exception v5

    .line 1181
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isLegalTimeInterval exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1182
    const/4 v0, 0x0

    return v0

    .line 1184
    :goto_0
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isLegalTimeInterval dayCounts = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1185
    const/4 v0, 0x1

    if-lt v4, v0, :cond_0

    if-le v4, p3, :cond_1

    .line 1186
    :cond_0
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dayCounts is illegal !!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1187
    const/4 v0, 0x0

    return v0

    .line 1189
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic e(Lo/cwe;I)I
    .locals 0

    .line 120
    iput p1, p0, Lo/cwe;->o:I

    return p1
.end method

.method private e()V
    .locals 2

    .line 1254
    const/4 v0, 0x0

    iput v0, p0, Lo/cwe;->h:I

    .line 1255
    const/4 v0, 0x0

    iput v0, p0, Lo/cwe;->g:I

    .line 1256
    const/4 v0, 0x0

    iput v0, p0, Lo/cwe;->o:I

    .line 1257
    iget-object v0, p0, Lo/cwe;->f:Lo/cmj;

    if-nez v0, :cond_0

    .line 1258
    invoke-static {}, Lo/cwa;->d()Lo/cmj;

    move-result-object v0

    iput-object v0, p0, Lo/cwe;->f:Lo/cmj;

    .line 1261
    :cond_0
    iget-object v0, p0, Lo/cwe;->f:Lo/cmj;

    new-instance v1, Lo/cwe$10;

    invoke-direct {v1, p0}, Lo/cwe$10;-><init>(Lo/cwe;)V

    invoke-virtual {v0, v1}, Lo/cmj;->e(Lo/cmo;)Z

    .line 1287
    return-void
.end method

.method private e(ILandroid/util/SparseArray;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILandroid/util/SparseArray<Ljava/lang/Object;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 493
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_2

    .line 498
    :sswitch_0
    move-object/from16 v0, p2

    const/16 v1, 0x7d2

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 499
    move-object/from16 v0, p2

    const/16 v1, 0x7e2

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 500
    move-object v8, v6

    check-cast v8, Ljava/util/List;

    .line 501
    move-object v9, v7

    check-cast v9, Ljava/util/List;

    .line 503
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    const/4 v0, 0x0

    if-ne v0, v9, :cond_0

    .line 504
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealHealthData The return run case7 list is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 505
    move-object/from16 v0, p3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 506
    return-void

    .line 509
    :cond_0
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 510
    new-instance v11, Lorg/json/JSONArray;

    invoke-direct {v11}, Lorg/json/JSONArray;-><init>()V

    .line 511
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 512
    move-object/from16 v0, p0

    move-object v1, v11

    move-object v2, v8

    const-string v3, "DATA_POINT_DYNAMIC_HEARTRATE"

    const-string v4, "bpm"

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v5}, Lo/cwe;->a(Lorg/json/JSONArray;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 515
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v9, :cond_2

    .line 516
    move-object/from16 v0, p0

    move-object v1, v11

    move-object v2, v9

    const-string v3, "DATA_POINT_REST_HEARTRATE"

    const-string v4, "bpm"

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v5}, Lo/cwe;->a(Lorg/json/JSONArray;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 520
    :cond_2
    const-string v0, "data"

    :try_start_0
    invoke-virtual {v10, v0, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 525
    goto :goto_0

    .line 521
    :catch_0
    move-exception v12

    .line 522
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealHealthData heartRateObject Exception = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v12}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    move-object/from16 v0, p3

    const/16 v1, 0x7cf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 524
    return-void

    .line 526
    :goto_0
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "heartRateObject = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 527
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-interface {v0, v1, v10}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 528
    goto/16 :goto_3

    .line 533
    :sswitch_1
    move-object/from16 v0, p2

    const/16 v1, 0x7e3

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v12

    .line 534
    move-object/from16 v0, p2

    const/16 v1, 0x7e4

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v13

    .line 535
    move-object/from16 v0, p2

    const/16 v1, 0x7e5

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 536
    move-object/from16 v0, p2

    const v1, 0xad12

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v15

    .line 538
    move-object/from16 v16, v12

    check-cast v16, Ljava/util/List;

    .line 539
    move-object/from16 v17, v13

    check-cast v17, Ljava/util/List;

    .line 540
    move-object/from16 v18, v14

    check-cast v18, Ljava/util/List;

    .line 541
    move-object/from16 v19, v15

    check-cast v19, Ljava/util/List;

    .line 543
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-ne v0, v1, :cond_3

    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-ne v0, v1, :cond_3

    const/4 v0, 0x0

    move-object/from16 v1, v18

    if-ne v0, v1, :cond_3

    const/4 v0, 0x0

    move-object/from16 v1, v19

    if-ne v0, v1, :cond_3

    .line 544
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealHealthData The return run case10 list is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 545
    move-object/from16 v0, p3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 546
    return-void

    .line 549
    :cond_3
    new-instance v20, Lorg/json/JSONObject;

    invoke-direct/range {v20 .. v20}, Lorg/json/JSONObject;-><init>()V

    .line 550
    new-instance v21, Lorg/json/JSONArray;

    invoke-direct/range {v21 .. v21}, Lorg/json/JSONArray;-><init>()V

    .line 551
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_4

    .line 552
    move-object/from16 v0, p0

    move-object/from16 v1, v21

    move-object/from16 v2, v16

    const-string v3, "STRESS_PASSIVE_MEASUREMENT"

    const-string v4, ""

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v5}, Lo/cwe;->a(Lorg/json/JSONArray;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 555
    :cond_4
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_5

    .line 556
    move-object/from16 v0, p0

    move-object/from16 v1, v21

    move-object/from16 v2, v17

    const-string v3, "STRESS_POSITIVE_MEASUREMENT"

    const-string v4, ""

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v5}, Lo/cwe;->a(Lorg/json/JSONArray;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 559
    :cond_5
    const/4 v0, 0x0

    move-object/from16 v1, v18

    if-eq v0, v1, :cond_6

    .line 560
    move-object/from16 v0, p0

    move-object/from16 v1, v21

    move-object/from16 v2, v18

    const-string v3, "BREATHING_RELAXATION"

    const-string v4, ""

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v5}, Lo/cwe;->a(Lorg/json/JSONArray;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 563
    :cond_6
    const/4 v0, 0x0

    move-object/from16 v1, v19

    if-eq v0, v1, :cond_7

    .line 564
    move-object/from16 v0, p0

    move-object/from16 v1, v21

    move-object/from16 v2, v19

    const-string v3, "PRESSURE_MESURE_VALUE_AVG"

    const-string v4, ""

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v5}, Lo/cwe;->a(Lorg/json/JSONArray;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 569
    :cond_7
    const-string v0, "data"

    move-object/from16 v1, v20

    move-object/from16 v2, v21

    :try_start_1
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 574
    goto :goto_1

    .line 570
    :catch_1
    move-exception v22

    .line 571
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealHealthData stressObject Exception = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v22 .. v22}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 572
    move-object/from16 v0, p3

    const/16 v1, 0x7cf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 573
    return-void

    .line 575
    :goto_1
    move-object/from16 v0, p3

    const/4 v1, 0x0

    move-object/from16 v2, v20

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 576
    goto :goto_3

    .line 578
    :goto_2
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dealHealthData stressObject in default branch "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 579
    move-object/from16 v0, p3

    const/16 v1, 0x7cf

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 582
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_0
        0xa -> :sswitch_1
    .end sparse-switch
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    .line 2089
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "agr_first_sign_country"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 2091
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MainActivty_signAgrHttp country is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2092
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2093
    return-void

    .line 2095
    :cond_0
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "agr_first_sign_language"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 2098
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 2099
    const/16 v0, 0x86

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2100
    const/16 v0, 0x2727

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2104
    new-instance v11, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;

    invoke-direct {v11}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;-><init>()V

    .line 2107
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "First sign country "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2108
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "First sign language "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v9, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2109
    move-object v0, v11

    move-object v1, p1

    move-object v2, p2

    move-object v4, v10

    move-object v5, v8

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v6, "_"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lo/cwe$4;

    invoke-direct {v7, p0}, Lo/cwe$4;-><init>(Lo/cwe;)V

    const/4 v3, 0x1

    invoke-virtual/range {v0 .. v7}, Lcom/huawei/hwcloudmodel/agreement/AgrHttp;->signHttpReq(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lo/czi;)Ljava/lang/String;

    .line 2128
    return-void
.end method

.method static synthetic e(Lo/cwe;)V
    .locals 0

    .line 120
    invoke-direct {p0}, Lo/cwe;->e()V

    return-void
.end method

.method static synthetic e(Lo/cwe;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 120
    invoke-direct {p0, p1}, Lo/cwe;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic k(Lo/cwe;)Landroid/content/Context;
    .locals 1

    .line 120
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public breatheControl(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 1914
    invoke-static {}, Lo/dmv;->e()Lo/dmv;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/dmv;->c(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1915
    return-void
.end method

.method public calibrationControl(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 1844
    invoke-static {}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a()Lcom/huawei/hwstressmgr/StressAppInteractor;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->b(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1845
    return-void
.end method

.method public canFinish(Landroid/app/Activity;)I
    .locals 1

    .line 1924
    invoke-static {}, Lo/dmv;->e()Lo/dmv;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dmv;->c(Landroid/app/Activity;)I

    move-result v0

    return v0
.end method

.method public checkCalibration(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 1859
    invoke-static {}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a()Lcom/huawei/hwstressmgr/StressAppInteractor;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1860
    return-void
.end method

.method public checkConnected(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 1849
    invoke-static {}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a()Lcom/huawei/hwstressmgr/StressAppInteractor;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1850
    return-void
.end method

.method public checkCurrentUrlAuth(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1794
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->checkUrlAuth(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public checkWhiteUrl(Ljava/lang/String;)Z
    .locals 1

    .line 1869
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->checkWhiteUrl(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public d(JLo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLo/cyx<Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;>;)V"
        }
    .end annotation

    .line 2051
    new-instance v1, Lcom/huawei/hwcloudmodel/model/unite/DelEvaluationResultReq;

    invoke-direct {v1, p1, p2}, Lcom/huawei/hwcloudmodel/model/unite/DelEvaluationResultReq;-><init>(J)V

    .line 2052
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    invoke-virtual {v0, v1, p3}, Lo/czg;->e(Lcom/huawei/hwcloudmodel/model/unite/DelEvaluationResultReq;Lo/cyx;)V

    .line 2053
    return-void
.end method

.method public deleteSleepQuestionnaireResult(JLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 2056
    new-instance v0, Lo/cwe$5;

    invoke-direct {v0, p0, p3}, Lo/cwe$5;-><init>(Lo/cwe;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {p0, p1, p2, v0}, Lo/cwe;->d(JLo/cyx;)V

    .line 2075
    return-void
.end method

.method public e(JLjava/lang/String;Lo/cyx;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/lang/String;Lo/cyx<Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;>;)V"
        }
    .end annotation

    .line 1988
    new-instance v1, Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;

    invoke-direct {v1, p1, p2, p3}, Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;-><init>(JLjava/lang/String;)V

    .line 1989
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1990
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1991
    new-instance v3, Lcom/huawei/hwcloudmodel/model/unite/AddEvaluationResultReq;

    invoke-direct {v3, v2}, Lcom/huawei/hwcloudmodel/model/unite/AddEvaluationResultReq;-><init>(Ljava/util/List;)V

    .line 1992
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    invoke-virtual {v0, v3, p4}, Lo/czg;->b(Lcom/huawei/hwcloudmodel/model/unite/AddEvaluationResultReq;Lo/cyx;)V

    .line 1993
    return-void
.end method

.method public e(JLo/cyx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLo/cyx<Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;>;)V"
        }
    .end annotation

    .line 2017
    new-instance v1, Lcom/huawei/hwcloudmodel/model/unite/GetEvaluationResultReq;

    invoke-direct {v1, p1, p2}, Lcom/huawei/hwcloudmodel/model/unite/GetEvaluationResultReq;-><init>(J)V

    .line 2018
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/czg;->e(Landroid/content/Context;)Lo/czg;

    move-result-object v0

    invoke-virtual {v0, v1, p3}, Lo/czg;->b(Lcom/huawei/hwcloudmodel/model/unite/GetEvaluationResultReq;Lo/cyx;)V

    .line 2019
    return-void
.end method

.method public gameControl(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 1839
    invoke-static {}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a()Lcom/huawei/hwstressmgr/StressAppInteractor;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/huawei/hwstressmgr/StressAppInteractor;->e(IIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1840
    return-void
.end method

.method public getAnnualInitalData()Ljava/lang/String;
    .locals 5

    .line 420
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAnnualInitalData!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 421
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lo/cwe;->d:Landroid/content/Context;

    .line 422
    invoke-virtual {v0, v1}, Lo/dth;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 423
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAnnualInitalData\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 424
    return-object v4
.end method

.method public getAnnualReport(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 408
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAnnualReport year = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 409
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-virtual {v0, v1, p1, p2}, Lo/dth;->a(Landroid/content/Context;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 411
    return-void
.end method

.method public getAuthType(Ljava/lang/String;Ljava/lang/String;)I
    .locals 5

    .line 1944
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getAuthType huid = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",serviceId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1945
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryServiceAuth(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    move-result-object v4

    .line 1946
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->fetchAuthType()I

    move-result v0

    if-nez v0, :cond_1

    .line 1947
    :cond_0
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAuthType auth == null || auth.getAuthType = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1948
    const/4 v0, 0x0

    return v0

    .line 1949
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->fetchAuthType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 1950
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAuthType auth.getAuthType = 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1951
    const/4 v0, 0x1

    return v0

    .line 1953
    :cond_2
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAuthType can not get AuthType"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1954
    const/4 v0, 0x2

    return v0
.end method

.method public getHealthData(JJILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 11

    .line 374
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthData startTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " endTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    sub-long v4, p3, p1

    .line 377
    long-to-double v0, v4

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    const-wide v2, 0x4194997000000000L    # 8.64E7

    div-double v6, v0, v2

    .line 378
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dayCounts = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-ltz v0, :cond_0

    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    cmpl-double v0, v6, v0

    if-lez v0, :cond_1

    .line 380
    :cond_0
    move-object/from16 v0, p6

    const/16 v1, 0x3e9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 381
    return-void

    .line 384
    :cond_1
    const/4 v8, 0x2

    new-array v8, v8, [I

    fill-array-data v8, :array_0

    .line 386
    const/4 v9, 0x3

    new-array v9, v9, [I

    fill-array-data v9, :array_1

    .line 388
    move/from16 v0, p5

    invoke-direct {p0, v8, v0}, Lo/cwe;->c([II)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 389
    invoke-direct/range {p0 .. p5}, Lo/cwe;->d(JJI)Lcom/huawei/hihealth/HiDataReadOption;

    move-result-object v10

    .line 390
    move/from16 v0, p5

    move-object/from16 v1, p6

    invoke-direct {p0, v10, v0, v1}, Lo/cwe;->a(Lcom/huawei/hihealth/HiDataReadOption;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 391
    goto :goto_0

    :cond_2
    move/from16 v0, p5

    invoke-direct {p0, v9, v0}, Lo/cwe;->c([II)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 392
    invoke-direct/range {p0 .. p5}, Lo/cwe;->b(JJI)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v10

    .line 393
    move/from16 v0, p5

    move-object/from16 v1, p6

    invoke-direct {p0, v10, v0, v1}, Lo/cwe;->b(Lcom/huawei/hihealth/HiAggregateOption;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 394
    goto :goto_0

    .line 396
    :cond_3
    move-object/from16 v0, p6

    const/16 v1, 0x3e9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 399
    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x7
        0xa
    .end array-data

    :array_1
    .array-data 4
        0x4
        0x5
        0x8
    .end array-data
.end method

.method public getHealthStat(Ljava/lang/String;Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 16

    .line 633
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHealthStat startDay = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " endDay = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 635
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/16 v3, 0xa

    invoke-direct {v0, v1, v2, v3}, Lo/cwe;->d(Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v6

    .line 636
    if-nez v6, :cond_0

    .line 637
    move-object/from16 v0, p4

    const/16 v1, 0x3e9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 638
    return-void

    .line 641
    :cond_0
    const/4 v7, 0x0

    .line 642
    const/4 v8, 0x0

    .line 643
    new-instance v9, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    invoke-direct {v9, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 645
    move-object/from16 v0, p1

    :try_start_0
    invoke-virtual {v9, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v7

    .line 646
    move-object/from16 v0, p2

    invoke-virtual {v9, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v8

    .line 651
    goto :goto_0

    .line 647
    :catch_0
    move-exception v10

    .line 648
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 649
    move-object/from16 v0, p4

    const/16 v1, 0x3e9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 650
    return-void

    .line 653
    :goto_0
    move-object/from16 v0, p0

    invoke-direct {v0, v7}, Lo/cwe;->c(Ljava/util/Date;)J

    move-result-wide v10

    .line 654
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lo/cwe;->a(Ljava/util/Date;)J

    move-result-wide v12

    .line 657
    const/4 v14, 0x2

    new-array v14, v14, [I

    fill-array-data v14, :array_0

    .line 658
    move-object/from16 v0, p0

    move/from16 v1, p3

    invoke-direct {v0, v14, v1}, Lo/cwe;->c([II)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 659
    move-object/from16 v0, p0

    move-wide v1, v10

    move-wide v3, v12

    move/from16 v5, p3

    invoke-direct/range {v0 .. v5}, Lo/cwe;->b(JJI)Lcom/huawei/hihealth/HiAggregateOption;

    move-result-object v15

    .line 660
    move-object/from16 v0, p0

    move/from16 v1, p3

    move-object/from16 v2, p4

    invoke-direct {v0, v15, v1, v2}, Lo/cwe;->b(Lcom/huawei/hihealth/HiAggregateOption;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 661
    goto :goto_1

    .line 663
    :cond_1
    move-object/from16 v0, p4

    const/16 v1, 0x3e9

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 666
    :goto_1
    return-void

    nop

    :array_0
    .array-data 4
        0x3
        0x9
    .end array-data
.end method

.method public getInfo([Ljava/lang/String;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 362
    invoke-static {p1}, Lo/fjy;->c([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getJanusDeviceConnect()I
    .locals 1

    .line 1919
    invoke-static {}, Lo/dmv;->e()Lo/dmv;

    move-result-object v0

    invoke-virtual {v0}, Lo/dmv;->c()I

    move-result v0

    return v0
.end method

.method public getMotionPathData(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 1593
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", endTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1595
    sub-long v4, p3, p1

    .line 1596
    long-to-double v0, v4

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    const-wide v2, 0x4194997000000000L    # 8.64E7

    div-double v6, v0, v2

    .line 1597
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dayCounts = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1598
    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-ltz v0, :cond_0

    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    cmpl-double v0, v6, v0

    if-lez v0, :cond_1

    .line 1599
    :cond_0
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-interface {p5, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1600
    return-void

    .line 1603
    :cond_1
    invoke-direct/range {p0 .. p5}, Lo/cwe;->b(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1604
    return-void
.end method

.method public getPersonalPrivacySettingValue(I)Ljava/lang/String;
    .locals 2

    .line 1879
    const/4 v0, 0x6

    if-ne p1, v0, :cond_0

    .line 1880
    sget-object v0, Lo/cwe;->v:Lo/dnm;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lo/dnm;->c(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1882
    :cond_0
    sget-object v0, Lo/cwe;->v:Lo/dnm;

    invoke-virtual {v0, p1}, Lo/dnm;->c(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRecordsByDateRange(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;"
        }
    .end annotation

    .line 1974
    invoke-static {p1}, Lcom/huawei/operation/utils/Utils;->stringToDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v4

    .line 1975
    invoke-static {p2}, Lcom/huawei/operation/utils/Utils;->stringToDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    .line 1977
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 1978
    :cond_0
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == startDate || null == endDate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1979
    const/4 v0, 0x0

    return-object v0

    .line 1982
    :cond_1
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getRecordsByDateRange startDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",endDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1983
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lo/brt;->c(Ljava/util/Date;Ljava/util/Date;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getServiceIdByUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1929
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getServiceIdByUrl url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1930
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getServiceIdByUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSportData()Lcom/huawei/operation/adapter/SportData;
    .locals 7

    .line 1198
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "entry getMySportData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1199
    new-instance v4, Lcom/huawei/operation/adapter/SportData;

    invoke-direct {v4}, Lcom/huawei/operation/adapter/SportData;-><init>()V

    .line 1200
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1202
    invoke-direct {p0}, Lo/cwe;->e()V

    .line 1205
    new-instance v6, Lcom/huawei/operation/adapter/SportData$Data;

    invoke-direct {v6}, Lcom/huawei/operation/adapter/SportData$Data;-><init>()V

    .line 1206
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/operation/adapter/SportData$Data;->configType(I)V

    .line 1207
    iget v0, p0, Lo/cwe;->h:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/operation/adapter/SportData$Data;->configValue(Ljava/lang/String;)V

    .line 1208
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1211
    new-instance v6, Lcom/huawei/operation/adapter/SportData$Data;

    invoke-direct {v6}, Lcom/huawei/operation/adapter/SportData$Data;-><init>()V

    .line 1212
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/operation/adapter/SportData$Data;->configType(I)V

    .line 1213
    iget v0, p0, Lo/cwe;->o:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/operation/adapter/SportData$Data;->configValue(Ljava/lang/String;)V

    .line 1214
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1217
    new-instance v6, Lcom/huawei/operation/adapter/SportData$Data;

    invoke-direct {v6}, Lcom/huawei/operation/adapter/SportData$Data;-><init>()V

    .line 1218
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/operation/adapter/SportData$Data;->configType(I)V

    .line 1219
    iget v0, p0, Lo/cwe;->g:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/operation/adapter/SportData$Data;->configValue(Ljava/lang/String;)V

    .line 1220
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1222
    invoke-direct {p0}, Lo/cwe;->c()V

    .line 1224
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "run = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/cwe;->n:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "; ride = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/cwe;->l:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "; run duration = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/cwe;->m:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1226
    new-instance v6, Lcom/huawei/operation/adapter/SportData$Data;

    invoke-direct {v6}, Lcom/huawei/operation/adapter/SportData$Data;-><init>()V

    .line 1227
    const/4 v0, 0x4

    invoke-virtual {v6, v0}, Lcom/huawei/operation/adapter/SportData$Data;->configType(I)V

    .line 1228
    iget v0, p0, Lo/cwe;->n:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/operation/adapter/SportData$Data;->configValue(Ljava/lang/String;)V

    .line 1229
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1232
    new-instance v6, Lcom/huawei/operation/adapter/SportData$Data;

    invoke-direct {v6}, Lcom/huawei/operation/adapter/SportData$Data;-><init>()V

    .line 1233
    const/4 v0, 0x5

    invoke-virtual {v6, v0}, Lcom/huawei/operation/adapter/SportData$Data;->configType(I)V

    .line 1234
    iget v0, p0, Lo/cwe;->l:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/operation/adapter/SportData$Data;->configValue(Ljava/lang/String;)V

    .line 1235
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1238
    new-instance v6, Lcom/huawei/operation/adapter/SportData$Data;

    invoke-direct {v6}, Lcom/huawei/operation/adapter/SportData$Data;-><init>()V

    .line 1239
    const/4 v0, 0x6

    invoke-virtual {v6, v0}, Lcom/huawei/operation/adapter/SportData$Data;->configType(I)V

    .line 1240
    iget-wide v0, p0, Lo/cwe;->m:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/operation/adapter/SportData$Data;->configValue(Ljava/lang/String;)V

    .line 1241
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1244
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SportData.Data list size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1245
    invoke-virtual {v4, v5}, Lcom/huawei/operation/adapter/SportData;->configData(Ljava/util/List;)V

    .line 1246
    const-string v0, "PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exit getMySportData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1247
    return-object v4
.end method

.method public getSportData(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 12

    .line 1529
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startDay = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ",endDay = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1530
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lo/cwe;->u:Lorg/json/JSONObject;

    .line 1531
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cwe;->t:Ljava/util/List;

    .line 1532
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    iput-object v0, p0, Lo/cwe;->r:Lorg/json/JSONArray;

    .line 1534
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1536
    const/4 v5, 0x0

    .line 1537
    const/4 v6, 0x0

    .line 1539
    :try_start_0
    invoke-virtual {v4, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    .line 1540
    invoke-virtual {v4, p2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 1545
    goto :goto_0

    .line 1541
    :catch_0
    move-exception v7

    .line 1542
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportData dateFormat exception: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1543
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1544
    return-void

    .line 1547
    :goto_0
    invoke-direct {p0, v5}, Lo/cwe;->c(Ljava/util/Date;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/cwe;->p:J

    .line 1548
    invoke-direct {p0, v6}, Lo/cwe;->a(Ljava/util/Date;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/cwe;->s:J

    .line 1550
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    .line 1553
    const/4 v8, 0x0

    .line 1555
    const-string v0, "yyyyMMdd"

    :try_start_1
    invoke-static {p1, p2, v0}, Lo/cnk;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v8

    .line 1560
    goto :goto_1

    .line 1556
    :catch_1
    move-exception v9

    .line 1557
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parse date exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1558
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1559
    return-void

    .line 1561
    :goto_1
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dayCounts = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1562
    const/4 v0, 0x1

    if-lt v8, v0, :cond_0

    const/16 v0, 0xa

    if-le v8, v0, :cond_1

    .line 1563
    :cond_0
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dayCounts is illegal !!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1564
    const/16 v0, 0x3e9

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1565
    return-void

    .line 1567
    :cond_1
    const/4 v9, 0x0

    :goto_2
    add-int/lit8 v0, v8, -0x1

    if-gt v9, v0, :cond_2

    .line 1569
    iget-wide v0, p0, Lo/cwe;->p:J

    neg-int v2, v9

    invoke-static {v0, v1, v2}, Lo/cnk;->b(JI)I

    move-result v7

    .line 1570
    new-instance v10, Lcom/huawei/operation/adapter/SportSummary;

    invoke-direct {v10}, Lcom/huawei/operation/adapter/SportSummary;-><init>()V

    .line 1571
    invoke-virtual {v10, v7}, Lcom/huawei/operation/adapter/SportSummary;->configDate(I)V

    .line 1572
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lcom/huawei/operation/adapter/SportSummary;->configSportType(I)V

    .line 1573
    new-instance v11, Lcom/huawei/operation/adapter/SportSummary$SportUnit;

    invoke-direct {v11}, Lcom/huawei/operation/adapter/SportSummary$SportUnit;-><init>()V

    .line 1574
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lcom/huawei/operation/adapter/SportSummary$SportUnit;->configSteps(I)V

    .line 1575
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lcom/huawei/operation/adapter/SportSummary$SportUnit;->configDistance(I)V

    .line 1576
    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lcom/huawei/operation/adapter/SportSummary$SportUnit;->configCalorie(I)V

    .line 1577
    invoke-virtual {v10, v11}, Lcom/huawei/operation/adapter/SportSummary;->configSportUnit(Lcom/huawei/operation/adapter/SportSummary$SportUnit;)V

    .line 1578
    iget-object v0, p0, Lo/cwe;->t:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1567
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 1581
    :cond_2
    invoke-direct {p0, p3}, Lo/cwe;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1583
    return-void
.end method

.method public getUserInfo(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 1608
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cwe$13;

    invoke-direct {v1, p0, p1}, Lo/cwe$13;-><init>(Lo/cwe;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Lo/clt;->a(Lo/clz;)V

    .line 1654
    return-void
.end method

.method public go2PersonalPrivacySettingsActivity()V
    .locals 5

    .line 1887
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.ui.main.stories.settings.activity.PersonalPrivacySettingsActivity"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1888
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-direct {p0, v0, v4}, Lo/cwe;->d(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object v4

    .line 1889
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 1890
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the intent to Health share data is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1891
    return-void

    .line 1893
    :cond_0
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1894
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1895
    return-void
.end method

.method public queryServiceNameByID(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1935
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryServiceByID(Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/OpenService;

    move-result-object v1

    .line 1936
    if-eqz v1, :cond_0

    .line 1937
    invoke-virtual {v1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getProductName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1939
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public querySleepQuestionnaireResults(JLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 2023
    new-instance v0, Lo/cwe$15;

    invoke-direct {v0, p0, p3}, Lo/cwe$15;-><init>(Lo/cwe;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {p0, p1, p2, v0}, Lo/cwe;->e(JLo/cyx;)V

    .line 2049
    return-void
.end method

.method public queryUrlList(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 1799
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->queryUrlList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public queryWebViewConfig()Lcom/huawei/operation/beans/WebViewConfig;
    .locals 8

    .line 1804
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "lightcloud"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "servicefw"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1805
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryWebViewConfig"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1806
    const-string v5, ""

    .line 1807
    invoke-static {}, Lo/dbf;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1808
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    const-string v1, "WebViewConfig.txt"

    invoke-static {v0, v1}, Lcom/huawei/ui/openservice/OpenServiceUtil;->getBetaFile(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 1810
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "WebViewConfig.txt"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/openservice/OpenServiceUtil;->getStringFile(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1812
    :goto_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1813
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryWebViewConfig str is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1814
    const/4 v0, 0x0

    return-object v0

    .line 1816
    :cond_1
    const/4 v6, 0x0

    .line 1818
    :try_start_0
    const-class v0, Lcom/huawei/operation/beans/WebViewConfig;

    invoke-static {v5, v0}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/operation/beans/WebViewConfig;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v6, v0

    .line 1823
    goto :goto_1

    .line 1819
    :catch_0
    move-exception v7

    .line 1820
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "JsonSyntaxException, e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1823
    goto :goto_1

    .line 1821
    :catch_1
    move-exception v7

    .line 1822
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryWebViewConfig error , e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1824
    :goto_1
    return-object v6
.end method

.method public relaxControl(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 1834
    invoke-static {}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a()Lcom/huawei/hwstressmgr/StressAppInteractor;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1835
    return-void
.end method

.method public resetCalibration(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 1854
    invoke-static {}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a()Lcom/huawei/hwstressmgr/StressAppInteractor;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hwstressmgr/StressAppInteractor;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1855
    return-void
.end method

.method public setAchieveEvent(Ljava/lang/String;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 1874
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setAchieveEvent key"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " map = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1875
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lo/cwe;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    .line 1876
    return-void
.end method

.method public share(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 9

    .line 1769
    move-object v0, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    sget-object v1, Lo/dae;->R:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v8

    const/4 v1, 0x2

    const/4 v7, 0x0

    invoke-static/range {v0 .. v8}, Lo/fjy;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;ZLjava/lang/String;)V

    .line 1770
    return-void
.end method

.method public showServiceTips(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 1960
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "showServiceTips dialogType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",serviceName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1961
    invoke-static {p1}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/openservice/db/control/OpenServiceControl;

    move-result-object v4

    .line 1962
    new-instance v5, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    invoke-direct {v5}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;-><init>()V

    .line 1963
    invoke-virtual {v5, p5}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configHuid(Ljava/lang/String;)V

    .line 1964
    invoke-virtual {v5, p4}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configServiceID(Ljava/lang/String;)V

    .line 1965
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configAuthType(I)V

    .line 1966
    invoke-virtual {v4, v5}, Lcom/huawei/ui/openservice/db/control/OpenServiceControl;->insertOrUpdateUserAuth(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Z

    .line 1967
    const-string v0, "0"

    const/4 v1, 0x1

    invoke-interface {p6, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1969
    return-void
.end method

.method public startAchieveAwardShare(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1762
    invoke-static {p1}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v1

    .line 1763
    new-instance v0, Lo/cvz;

    invoke-direct {v0}, Lo/cvz;-><init>()V

    invoke-virtual {v1, v0}, Lo/dth;->setAdapter(Lo/eab;)V

    .line 1764
    invoke-virtual {v1, p1, p2, p3}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1765
    return-void
.end method

.method public startFitnessList()V
    .locals 1

    .line 1789
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->i()V

    .line 1790
    return-void
.end method

.method public startFitnessPage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1784
    invoke-static {p1, p2, p3}, Lo/fjy;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1785
    return-void
.end method

.method public startGPSTrackPage(Landroid/content/Context;ILjava/lang/String;F)V
    .locals 2

    .line 1774
    iget-object v0, p0, Lo/cwe;->k:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lo/cwe;->i:Ljava/util/Map;

    invoke-interface {v1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {p1, v0, v1, p4}, Lo/fjy;->b(Landroid/content/Context;IIF)V

    .line 1775
    return-void
.end method

.method public startSocialDetailPage(Landroid/content/Context;J)V
    .locals 0

    .line 1779
    invoke-static {p1, p2, p3}, Lo/fjy;->a(Landroid/content/Context;J)V

    .line 1780
    return-void
.end method

.method public stressAbort(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 1

    .line 1864
    invoke-static {}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a()Lcom/huawei/hwstressmgr/StressAppInteractor;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1865
    return-void
.end method

.method public stressControl(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 1829
    invoke-static {}, Lcom/huawei/hwstressmgr/StressAppInteractor;->a()Lcom/huawei/hwstressmgr/StressAppInteractor;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/hwstressmgr/StressAppInteractor;->d(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1830
    return-void
.end method

.method public uploadSleepQuestionnaireResults(JLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 1

    .line 1998
    new-instance v0, Lo/cwe$11;

    invoke-direct {v0, p0, p4}, Lo/cwe$11;-><init>(Lo/cwe;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {p0, p1, p2, p3, v0}, Lo/cwe;->e(JLjava/lang/String;Lo/cyx;)V

    .line 2015
    return-void
.end method

.method public vmallAgrQuery(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 2133
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enter isSignVamllArg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2134
    iget-object v0, p0, Lo/cwe;->d:Landroid/content/Context;

    const-string v1, "IsSignVamllArg"

    invoke-static {v0, v1}, Lo/xt;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    .line 2135
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isSignVamllArg = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2136
    if-nez v4, :cond_0

    .line 2137
    const-string v0, "false"

    const/16 v1, 0xc8

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 2139
    :cond_0
    const-string v0, "Opera_PluginOperationAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "vmallAgrQuery aToken"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2140
    invoke-direct {p0}, Lo/cwe;->b()V

    .line 2141
    iput-object p1, p0, Lo/cwe;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 2144
    :goto_0
    return-void
.end method

.method public vmallAgrSign(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 2079
    iput-object p1, p0, Lo/cwe;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 2080
    iget-object v0, p0, Lo/cwe;->z:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2081
    iget-object v0, p0, Lo/cwe;->z:Ljava/lang/String;

    iget-object v1, p0, Lo/cwe;->x:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/cwe;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 2083
    :cond_0
    invoke-direct {p0}, Lo/cwe;->b()V

    .line 2085
    :goto_0
    return-void
.end method
