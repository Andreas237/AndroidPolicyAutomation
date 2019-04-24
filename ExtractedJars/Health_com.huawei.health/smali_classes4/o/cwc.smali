.class public Lo/cwc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cbp;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cwc$f;,
        Lo/cwc$e;,
        Lo/cwc$c;,
        Lo/cwc$a;,
        Lo/cwc$d;,
        Lo/cwc$b;
    }
.end annotation


# static fields
.field private static c:Lo/cwc;

.field private static final s:Ljava/lang/Object;


# instance fields
.field private a:Lo/cwc$a;

.field private b:Lo/fke;

.field private d:Landroid/os/HandlerThread;

.field private e:Lo/cmj;

.field private f:Ljava/lang/String;

.field private g:Lo/cer;

.field private h:Lo/ccq;

.field private i:Lo/cez;

.field private k:Lo/cet;

.field private l:Lo/ces;

.field private m:Landroid/content/Context;

.field private n:I

.field private o:Lo/cwc$c;

.field private p:Lo/ces;

.field private q:Landroid/os/Handler;

.field private r:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private u:Lo/dnm;

.field private w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private y:Lo/cmg;

.field private z:Lo/cmg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 122
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cwc;->s:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 435
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwc;->d:Landroid/os/HandlerThread;

    .line 103
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwc;->a:Lo/cwc$a;

    .line 104
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwc;->g:Lo/cer;

    .line 105
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwc;->i:Lo/cez;

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwc;->h:Lo/ccq;

    .line 107
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwc;->k:Lo/cet;

    .line 108
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwc;->f:Ljava/lang/String;

    .line 109
    const/4 v0, 0x0

    iput v0, p0, Lo/cwc;->n:I

    .line 111
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwc;->p:Lo/ces;

    .line 112
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwc;->l:Lo/ces;

    .line 376
    new-instance v0, Lo/cwc$4;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cwc$4;-><init>(Lo/cwc;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cwc;->q:Landroid/os/Handler;

    .line 479
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwc;->t:Ljava/util/List;

    .line 480
    new-instance v0, Lo/cwc$6;

    invoke-direct {v0, p0}, Lo/cwc$6;-><init>(Lo/cwc;)V

    iput-object v0, p0, Lo/cwc;->y:Lo/cmg;

    .line 1309
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwc;->w:Ljava/util/List;

    .line 1310
    new-instance v0, Lo/cwc$3;

    invoke-direct {v0, p0}, Lo/cwc$3;-><init>(Lo/cwc;)V

    iput-object v0, p0, Lo/cwc;->z:Lo/cmg;

    .line 436
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/cwc;->m:Landroid/content/Context;

    .line 437
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "Track_Adapter"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/cwc;->d:Landroid/os/HandlerThread;

    .line 438
    iget-object v0, p0, Lo/cwc;->d:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 439
    new-instance v0, Lo/cwc$a;

    iget-object v1, p0, Lo/cwc;->d:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/cwc$a;-><init>(Lo/cwc;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/cwc;->a:Lo/cwc$a;

    .line 440
    invoke-direct {p0}, Lo/cwc;->q()Lo/cmj;

    move-result-object v0

    iput-object v0, p0, Lo/cwc;->e:Lo/cmj;

    .line 441
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSDK "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cwc;->e:Lo/cmj;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 442
    invoke-static {p1}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iput-object v0, p0, Lo/cwc;->u:Lo/dnm;

    .line 443
    return-void
.end method

.method static synthetic a(Lo/cwc;Lo/ces;)Lo/ces;
    .locals 0

    .line 94
    iput-object p1, p0, Lo/cwc;->p:Lo/ces;

    return-object p1
.end method

.method static synthetic a(Lo/cwc;)Lo/fke;
    .locals 1

    .line 94
    iget-object v0, p0, Lo/cwc;->b:Lo/fke;

    return-object v0
.end method

.method private b(Lo/cex;I)Ljava/lang/String;
    .locals 19

    .line 653
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartDistribution enter "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 654
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 655
    const/4 v5, 0x0

    :goto_0
    const/4 v0, 0x6

    if-ge v5, v0, :cond_0

    .line 656
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 655
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 658
    :cond_0
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_3

    .line 659
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 661
    invoke-virtual/range {p1 .. p1}, Lo/cex;->a()Ljava/util/ArrayList;

    move-result-object v5

    .line 662
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 665
    move/from16 v0, p2

    int-to-long v0, v0

    const/4 v2, 0x3

    invoke-static {v5, v2, v0, v1}, Lo/cgm;->a(Ljava/util/List;IJ)[I

    move-result-object v6

    .line 667
    const/4 v0, 0x0

    aget v7, v6, v0

    .line 668
    const/4 v0, 0x1

    aget v8, v6, v0

    .line 669
    const/4 v0, 0x2

    aget v9, v6, v0

    .line 670
    const/4 v0, 0x3

    aget v10, v6, v0

    .line 671
    const/4 v0, 0x4

    aget v11, v6, v0

    .line 672
    add-int v0, v7, v8

    add-int/2addr v0, v9

    add-int/2addr v0, v10

    add-int v12, v0, v11

    .line 674
    move/from16 v0, p2

    if-ge v12, v0, :cond_1

    .line 675
    move/from16 v12, p2

    .line 677
    :cond_1
    mul-int/lit8 v0, v7, 0x64

    div-int v13, v0, v12

    .line 678
    mul-int/lit8 v0, v8, 0x64

    div-int v14, v0, v12

    .line 679
    mul-int/lit8 v0, v9, 0x64

    div-int v15, v0, v12

    .line 680
    mul-int/lit8 v0, v10, 0x64

    div-int v16, v0, v12

    .line 681
    mul-int/lit8 v0, v11, 0x64

    div-int v17, v0, v12

    .line 682
    rsub-int/lit8 v0, v13, 0x64

    sub-int/2addr v0, v14

    sub-int/2addr v0, v15

    sub-int v0, v0, v16

    sub-int v18, v0, v17

    .line 683
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 684
    move/from16 v0, v17

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 685
    move/from16 v0, v16

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 686
    invoke-virtual {v4, v15}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 687
    invoke-virtual {v4, v14}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 688
    invoke-virtual {v4, v13}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 689
    move/from16 v0, v18

    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 691
    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 694
    :cond_2
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartDistribution mHeartRateList = null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 697
    :cond_3
    invoke-virtual {v4}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/cwc;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 94
    iput-object p1, p0, Lo/cwc;->t:Ljava/util/List;

    return-object p1
.end method

.method static synthetic b(Lo/cwc;Lo/cer;)Lo/cer;
    .locals 0

    .line 94
    iput-object p1, p0, Lo/cwc;->g:Lo/cer;

    return-object p1
.end method

.method static synthetic b(Lo/cwc;)Lo/cmj;
    .locals 1

    .line 94
    iget-object v0, p0, Lo/cwc;->e:Lo/cmj;

    return-object v0
.end method

.method private b(Ljava/lang/String;)V
    .locals 4

    .line 793
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 794
    const/16 v1, 0x4e22

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "save_DB_End"

    .line 793
    const/4 v3, 0x0

    invoke-static {v0, v1, v2, p1, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 799
    return-void
.end method

.method private c(Ljava/util/List;)Ljava/lang/String;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 703
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportSpeedDistribution enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 704
    const/4 v4, 0x6

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    .line 705
    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 707
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getMetaData()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 708
    const-string v0, "paceMap"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    .line 710
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 711
    invoke-virtual {v8}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v9

    .line 712
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 713
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 714
    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v11

    .line 715
    const-wide v0, 0x4072c00000000000L    # 300.0

    cmpg-double v0, v11, v0

    if-gez v0, :cond_0

    .line 716
    const/4 v0, 0x0

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    aput v0, v4, v1

    goto :goto_1

    .line 717
    :cond_0
    const-wide v0, 0x4076800000000000L    # 360.0

    cmpg-double v0, v11, v0

    if-gez v0, :cond_1

    .line 718
    const/4 v0, 0x1

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    aput v0, v4, v1

    goto :goto_1

    .line 719
    :cond_1
    const-wide v0, 0x407a400000000000L    # 420.0

    cmpg-double v0, v11, v0

    if-gez v0, :cond_2

    .line 720
    const/4 v0, 0x2

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x2

    aput v0, v4, v1

    goto :goto_1

    .line 721
    :cond_2
    const-wide/high16 v0, 0x407e000000000000L    # 480.0

    cmpg-double v0, v11, v0

    if-gez v0, :cond_3

    .line 722
    const/4 v0, 0x3

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x3

    aput v0, v4, v1

    goto :goto_1

    .line 723
    :cond_3
    const-wide v0, 0x4080e00000000000L    # 540.0

    cmpg-double v0, v11, v0

    if-gez v0, :cond_4

    .line 724
    const/4 v0, 0x4

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x4

    aput v0, v4, v1

    goto :goto_1

    .line 726
    :cond_4
    const/4 v0, 0x5

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x5

    aput v0, v4, v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 728
    :goto_1
    goto/16 :goto_0

    .line 731
    :cond_5
    goto :goto_2

    .line 729
    :catch_0
    move-exception v6

    .line 730
    invoke-virtual {v6}, Lorg/json/JSONException;->printStackTrace()V

    .line 732
    :goto_2
    const/4 v0, 0x0

    aget v0, v4, v0

    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 733
    const/4 v0, 0x1

    aget v0, v4, v0

    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 734
    const/4 v0, 0x2

    aget v0, v4, v0

    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 735
    const/4 v0, 0x3

    aget v0, v4, v0

    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 736
    const/4 v0, 0x4

    aget v0, v4, v0

    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 737
    const/4 v0, 0x5

    aget v0, v4, v0

    invoke-virtual {v5, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 739
    invoke-virtual {v5}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method static synthetic c(Lo/cwc;)Lo/ces;
    .locals 1

    .line 94
    iget-object v0, p0, Lo/cwc;->p:Lo/ces;

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lo/cwc;
    .locals 6

    .line 470
    sget-object v4, Lo/cwc;->s:Ljava/lang/Object;

    monitor-enter v4

    .line 471
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mInstance is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lo/cwc;->c:Lo/cwc;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    sget-object v0, Lo/cwc;->c:Lo/cwc;

    if-nez v0, :cond_0

    .line 473
    new-instance v0, Lo/cwc;

    invoke-direct {v0, p0}, Lo/cwc;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/cwc;->c:Lo/cwc;

    .line 475
    :cond_0
    sget-object v0, Lo/cwc;->c:Lo/cwc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    .line 476
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method static synthetic c(Lo/cwc;Ljava/lang/String;)V
    .locals 0

    .line 94
    invoke-direct {p0, p1}, Lo/cwc;->b(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lo/cwc;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 94
    iput-object p1, p0, Lo/cwc;->f:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lo/cwc;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 94
    iput-object p1, p0, Lo/cwc;->w:Ljava/util/List;

    return-object p1
.end method

.method static synthetic d(Lo/cwc;Lo/cet;)Lo/cet;
    .locals 0

    .line 94
    iput-object p1, p0, Lo/cwc;->k:Lo/cet;

    return-object p1
.end method

.method static synthetic d(Lo/cwc;)Lo/cwc$c;
    .locals 1

    .line 94
    iget-object v0, p0, Lo/cwc;->o:Lo/cwc$c;

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 3

    .line 1158
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1159
    invoke-virtual {v2, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1160
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1161
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 1163
    :cond_0
    return-void
.end method

.method static synthetic e(Lo/cwc;)Lo/cwc$a;
    .locals 1

    .line 94
    iget-object v0, p0, Lo/cwc;->a:Lo/cwc$a;

    return-object v0
.end method

.method static synthetic e(Lo/cwc;Ljava/lang/String;)V
    .locals 0

    .line 94
    invoke-direct {p0, p1}, Lo/cwc;->d(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic f(Lo/cwc;)Lo/ces;
    .locals 1

    .line 94
    iget-object v0, p0, Lo/cwc;->l:Lo/ces;

    return-object v0
.end method

.method static synthetic g(Lo/cwc;)Landroid/os/Handler;
    .locals 1

    .line 94
    iget-object v0, p0, Lo/cwc;->q:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic h(Lo/cwc;)Lo/cer;
    .locals 1

    .line 94
    iget-object v0, p0, Lo/cwc;->g:Lo/cer;

    return-object v0
.end method

.method static synthetic i(Lo/cwc;)Lo/cez;
    .locals 1

    .line 94
    iget-object v0, p0, Lo/cwc;->i:Lo/cez;

    return-object v0
.end method

.method static synthetic k(Lo/cwc;)V
    .locals 0

    .line 94
    invoke-direct {p0}, Lo/cwc;->u()V

    return-void
.end method

.method static synthetic n(Lo/cwc;)Lo/cet;
    .locals 1

    .line 94
    iget-object v0, p0, Lo/cwc;->k:Lo/cet;

    return-object v0
.end method

.method static synthetic p(Lo/cwc;)Lo/ccq;
    .locals 1

    .line 94
    iget-object v0, p0, Lo/cwc;->h:Lo/ccq;

    return-object v0
.end method

.method private q()Lo/cmj;
    .locals 4

    .line 446
    iget-object v0, p0, Lo/cwc;->e:Lo/cmj;

    if-nez v0, :cond_0

    .line 447
    invoke-static {}, Lo/cwa;->d()Lo/cmj;

    move-result-object v0

    iput-object v0, p0, Lo/cwc;->e:Lo/cmj;

    .line 449
    iget-object v0, p0, Lo/cwc;->e:Lo/cmj;

    iget-object v1, p0, Lo/cwc;->m:Landroid/content/Context;

    new-instance v2, Lo/cwc$9;

    invoke-direct {v2, p0}, Lo/cwc$9;-><init>(Lo/cwc;)V

    const-string v3, "HuaweiHealth"

    invoke-virtual {v0, v1, v2, v3}, Lo/cmj;->a(Landroid/content/Context;Lo/cmo;Ljava/lang/String;)I

    .line 466
    :cond_0
    iget-object v0, p0, Lo/cwc;->e:Lo/cmj;

    return-object v0
.end method

.method private t()Ljava/lang/String;
    .locals 12

    .line 743
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportStartGPS enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 744
    iget-object v0, p0, Lo/cwc;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/cea;->e(Landroid/content/Context;)Lo/cex;

    move-result-object v4

    .line 745
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 748
    invoke-virtual {v4}, Lo/cex;->b()Ljava/util/Map;

    move-result-object v5

    .line 749
    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 750
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportStartGPS No GPS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 751
    const/4 v0, 0x0

    return-object v0

    .line 754
    :cond_0
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, [D

    .line 757
    const/4 v0, 0x0

    aget-wide v7, v6, v0

    .line 758
    const/4 v0, 0x1

    aget-wide v9, v6, v0

    .line 762
    new-instance v11, Lorg/json/JSONArray;

    invoke-direct {v11}, Lorg/json/JSONArray;-><init>()V

    .line 763
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 764
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 766
    invoke-virtual {v11}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 768
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private u()V
    .locals 5

    .line 822
    invoke-virtual {p0}, Lo/cwc;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 823
    invoke-static {}, Lo/fkc;->c()Lcom/huawei/hihealth/HiSyncOption;

    move-result-object v4

    .line 824
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V

    .line 825
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackData success synCloud begin..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 827
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Lo/cex;)I
    .locals 6

    .line 515
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackData MotionPath is enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 516
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 517
    :cond_0
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "simplifyData or motionPath is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 518
    const/4 v0, 0x5

    return v0

    .line 521
    :cond_1
    new-instance v4, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 522
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2, v4}, Lo/fkc;->a(Landroid/content/Context;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Lo/cex;Lcom/huawei/hihealth/HiDataInsertOption;)V

    .line 524
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    .line 526
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cwc$8;

    invoke-direct {v1, p0, v5}, Lo/cwc$8;-><init>(Lo/cwc;Ljava/lang/String;)V

    invoke-interface {v0, v4, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 543
    const/4 v0, 0x1

    return v0
.end method

.method public a()V
    .locals 4

    .line 1129
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterRealStepCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1130
    iget-object v0, p0, Lo/cwc;->a:Lo/cwc$a;

    if-eqz v0, :cond_0

    .line 1132
    iget-object v0, p0, Lo/cwc;->a:Lo/cwc$a;

    const/16 v1, 0x7d1

    invoke-virtual {v0, v1}, Lo/cwc$a;->removeMessages(I)V

    .line 1133
    iget-object v0, p0, Lo/cwc;->a:Lo/cwc$a;

    const/16 v1, 0x7d2

    invoke-virtual {v0, v1}, Lo/cwc$a;->sendEmptyMessage(I)Z

    .line 1135
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwc;->l:Lo/ces;

    .line 1136
    return-void
.end method

.method public a(Ljava/util/List;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cfg;>;I)V"
        }
    .end annotation

    .line 803
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lo/fkc;->a(Landroid/content/Context;Ljava/util/List;I)Lcom/huawei/hihealth/HiDataInsertOption;

    move-result-object v2

    .line 805
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cwc$7;

    invoke-direct {v1, p0}, Lo/cwc$7;-><init>(Lo/cwc;)V

    invoke-interface {v0, v2, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 815
    return-void
.end method

.method public b()V
    .locals 4

    .line 850
    iget-object v0, p0, Lo/cwc;->t:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cwc;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 851
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregHeartRateListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 852
    iget-object v0, p0, Lo/cwc;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    iget-object v1, p0, Lo/cwc;->t:Ljava/util/List;

    new-instance v2, Lo/cwc$11;

    invoke-direct {v2, p0}, Lo/cwc$11;-><init>(Lo/cwc;)V

    invoke-interface {v0, v1, v2}, Lo/clt;->e(Ljava/util/List;Lo/cmh;)V

    .line 861
    :cond_0
    return-void
.end method

.method public b(Lo/ces;JI)V
    .locals 4

    .line 1115
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerRealStepListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1116
    iput-object p1, p0, Lo/cwc;->p:Lo/ces;

    .line 1117
    new-instance v0, Lo/cwc$c;

    invoke-direct {v0, p0, p2, p3, p4}, Lo/cwc$c;-><init>(Lo/cwc;JI)V

    iput-object v0, p0, Lo/cwc;->o:Lo/cwc$c;

    .line 1118
    iget-object v0, p0, Lo/cwc;->o:Lo/cwc$c;

    invoke-virtual {v0}, Lo/cwc$c;->a()V

    .line 1119
    iget-object v0, p0, Lo/cwc;->a:Lo/cwc$a;

    if-eqz v0, :cond_0

    .line 1120
    iget-object v0, p0, Lo/cwc;->a:Lo/cwc$a;

    const/16 v1, 0x7d1

    invoke-virtual {v0, v1}, Lo/cwc$a;->removeMessages(I)V

    .line 1121
    iget-object v0, p0, Lo/cwc;->a:Lo/cwc$a;

    const/16 v1, 0x7d1

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/cwc$a;->sendEmptyMessageDelayed(IJ)Z

    .line 1125
    :cond_0
    return-void
.end method

.method public b(Z)V
    .locals 4

    .line 1283
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setPrivicyOfSportDataSwitch set to "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1286
    const/4 v0, 0x3

    invoke-virtual {p0, v0, p1}, Lo/cwc;->e(IZ)V

    .line 1288
    return-void
.end method

.method public c(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Ljava/lang/String;)Ljava/lang/String;
    .locals 19

    .line 605
    new-instance v4, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 606
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-static {v0, v1, v2, v4}, Lo/fkc;->c(Landroid/content/Context;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Ljava/lang/String;Lcom/huawei/hihealth/HiDataInsertOption;)V

    .line 608
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDataInsertOption;->getDatas()Ljava/util/List;

    move-result-object v5

    .line 610
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v6

    .line 613
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->o(J)Ljava/lang/String;

    move-result-object v7

    .line 616
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiHealthData;->getDeviceUUID()Ljava/lang/String;

    move-result-object v8

    .line 620
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v9, v0, v2

    .line 623
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11

    .line 625
    invoke-direct/range {p0 .. p0}, Lo/cwc;->t()Ljava/lang/String;

    move-result-object v13

    .line 627
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lo/cwc;->c(Ljava/util/List;)Ljava/lang/String;

    move-result-object v14

    .line 629
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cwc;->m:Landroid/content/Context;

    move-object/from16 v1, p2

    invoke-static {v0, v1}, Lo/cea;->d(Landroid/content/Context;Ljava/lang/String;)Lo/cex;

    move-result-object v15

    .line 630
    long-to-int v0, v9

    move-object/from16 v1, p0

    invoke-direct {v1, v15, v0}, Lo/cwc;->b(Lo/cex;I)Ljava/lang/String;

    move-result-object v16

    .line 631
    new-instance v17, Lorg/json/JSONObject;

    invoke-direct/range {v17 .. v17}, Lorg/json/JSONObject;-><init>()V

    .line 633
    const-string v0, "SportType"

    move-object/from16 v1, v17

    :try_start_0
    invoke-virtual {v1, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 634
    const-string v0, "SportStartTime"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 635
    const-string v0, "deviceID"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 636
    const-string v0, "SportStartGPS"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 637
    const-string v0, "SportDuration"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 638
    const-string v0, "HeartDistribution"

    move-object/from16 v1, v17

    move-object/from16 v2, v16

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 639
    const-string v0, "SportSpeedDistribution"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 640
    const-string v0, "HeatQuantity"

    move-object/from16 v1, v17

    invoke-virtual {v1, v0, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 642
    invoke-virtual/range {v17 .. v17}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 643
    :catch_0
    move-exception v18

    .line 644
    invoke-virtual/range {v18 .. v18}, Lorg/json/JSONException;->printStackTrace()V

    .line 646
    const/4 v0, 0x0

    return-object v0
.end method

.method public c()V
    .locals 6

    .line 980
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start measure!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 981
    invoke-static {}, Lo/aca;->e()Lo/aca;

    move-result-object v0

    iget-object v1, p0, Lo/cwc;->m:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/aca;->init(Landroid/content/Context;)V

    .line 983
    invoke-static {}, Lo/aca;->e()Lo/aca;

    move-result-object v0

    iget-object v1, p0, Lo/cwc;->m:Landroid/content/Context;

    iget v2, p0, Lo/cwc;->n:I

    sget-object v3, Lo/acl$a;->g:Lo/acl$a;

    new-instance v4, Lo/cwc$f;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lo/cwc$f;-><init>(Lo/cwc;Lo/cwc$4;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/aca;->b(Landroid/content/Context;ILo/acl$a;Lo/alk$e;)Ljava/lang/String;

    .line 986
    return-void
.end method

.method public c(Lo/ccq;)V
    .locals 4

    .line 1413
    iget-object v0, p0, Lo/cwc;->b:Lo/fke;

    if-eqz v0, :cond_0

    .line 1414
    iget-object v0, p0, Lo/cwc;->b:Lo/fke;

    new-instance v1, Lo/cwc$1;

    invoke-direct {v1, p0}, Lo/cwc$1;-><init>(Lo/cwc;)V

    invoke-virtual {v0, v1}, Lo/fke;->c(Lcom/huawei/exercise/modle/ITreadmillStyleCallback;)Z

    .line 1426
    iput-object p1, p0, Lo/cwc;->h:Lo/ccq;

    goto :goto_0

    .line 1429
    :cond_0
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerFreeIndoorRunninngStyle mTreadmillManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1432
    :goto_0
    return-void
.end method

.method public c(Lo/cez;II)Z
    .locals 5

    .line 908
    const/4 v4, 0x0

    .line 909
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regStepRateListener stepType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 910
    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    .line 912
    iget-object v0, p0, Lo/cwc;->b:Lo/fke;

    if-eqz v0, :cond_0

    .line 913
    iget-object v0, p0, Lo/cwc;->b:Lo/fke;

    new-instance v1, Lo/cwc$14;

    invoke-direct {v1, p0}, Lo/cwc$14;-><init>(Lo/cwc;)V

    invoke-virtual {v0, v1, p2}, Lo/fke;->a(Lo/cmx;I)Z

    move-result v4

    goto :goto_0

    .line 923
    :cond_0
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mTreadmillManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 926
    :cond_1
    invoke-virtual {p0, p1, p2}, Lo/cwc;->e(Lo/cez;I)Z

    move-result v4

    .line 929
    :goto_0
    if-eqz v4, :cond_2

    .line 930
    iput-object p1, p0, Lo/cwc;->i:Lo/cez;

    .line 931
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "new regStepRateListener success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 933
    :cond_2
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "new regStepRateListener failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 937
    :goto_1
    return v4
.end method

.method public d(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Ljava/lang/String;)J
    .locals 9

    .line 555
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveTrackData String is enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 556
    if-nez p1, :cond_0

    .line 557
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "simplifyData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 558
    const-wide/16 v0, 0x5

    return-wide v0

    .line 561
    :cond_0
    invoke-static {}, Lo/yy;->b()Lo/yy;

    move-result-object v0

    invoke-virtual {v0}, Lo/yy;->i()Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    move-result-object v4

    .line 562
    if-eqz v4, :cond_1

    .line 563
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 564
    invoke-static {v5, v4}, Lo/fkf;->a(Ljava/util/Map;Lcom/huawei/exercise/modle/RunPlanRecordInfo;)V

    .line 565
    invoke-virtual {p1, v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSportData(Ljava/util/Map;)V

    .line 566
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save ete result to track sportData finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v5

    .line 570
    if-eqz v5, :cond_2

    .line 571
    invoke-static {v5}, Lo/fkf;->c(Ljava/util/Map;)V

    goto :goto_0

    .line 573
    :cond_2
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 574
    invoke-static {v5}, Lo/fkf;->c(Ljava/util/Map;)V

    .line 575
    invoke-virtual {p1, v5}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->saveSportData(Ljava/util/Map;)V

    .line 578
    :goto_0
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportData()Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 580
    new-instance v6, Lcom/huawei/hihealth/HiDataInsertOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiDataInsertOption;-><init>()V

    .line 581
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1, p2, v6}, Lo/fkc;->c(Landroid/content/Context;Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Ljava/lang/String;Lcom/huawei/hihealth/HiDataInsertOption;)V

    .line 582
    invoke-virtual {p0, p1, p2}, Lo/cwc;->c(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 583
    iget-object v0, p0, Lo/cwc;->m:Landroid/content/Context;

    invoke-static {v0, v7}, Lo/dnn;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 584
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    .line 585
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lo/cwc$10;

    invoke-direct {v1, p0, v8}, Lo/cwc$10;-><init>(Lo/cwc;Ljava/lang/String;)V

    invoke-interface {v0, v6, v1}, Lo/clt;->c(Lcom/huawei/hihealth/HiDataInsertOption;Lo/cma;)V

    .line 601
    const-wide/16 v0, 0x1

    return-wide v0
.end method

.method public d()V
    .locals 2

    .line 993
    iget-object v0, p0, Lo/cwc;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 994
    invoke-static {}, Lo/aca;->e()Lo/aca;

    move-result-object v0

    iget-object v1, p0, Lo/cwc;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/aca;->d(Ljava/lang/String;)V

    .line 997
    :cond_0
    return-void
.end method

.method public d(I)V
    .locals 4

    .line 961
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregStepRateListener stepType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 962
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 964
    iget-object v0, p0, Lo/cwc;->i:Lo/cez;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cwc;->b:Lo/fke;

    if-eqz v0, :cond_0

    .line 965
    iget-object v0, p0, Lo/cwc;->b:Lo/fke;

    invoke-virtual {v0}, Lo/fke;->e()Z

    goto :goto_0

    .line 967
    :cond_0
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregStepRateListener mStepRateCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 969
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwc;->i:Lo/cez;

    goto :goto_1

    .line 971
    :cond_1
    invoke-virtual {p0}, Lo/cwc;->r()V

    .line 973
    :goto_1
    return-void
.end method

.method public d(Z)V
    .locals 4

    .line 1151
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pauseOrResumeStepRateRecord "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1152
    iget-object v0, p0, Lo/cwc;->o:Lo/cwc$c;

    if-eqz v0, :cond_0

    .line 1153
    iget-object v0, p0, Lo/cwc;->o:Lo/cwc$c;

    invoke-virtual {v0, p1}, Lo/cwc$c;->d(Z)V

    .line 1155
    :cond_0
    return-void
.end method

.method public d(Lo/cet;)Z
    .locals 3

    .line 1369
    iget-object v0, p0, Lo/cwc;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    iget-object v1, p0, Lo/cwc;->z:Lo/cmg;

    const/16 v2, 0xf

    invoke-interface {v0, v2, v1}, Lo/clt;->a(ILo/cmg;)V

    .line 1370
    iput-object p1, p0, Lo/cwc;->k:Lo/cet;

    .line 1372
    const/4 v0, 0x1

    return v0
.end method

.method public e()V
    .locals 2

    .line 1225
    iget-object v0, p0, Lo/cwc;->e:Lo/cmj;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cmj;->c(Z)V

    .line 1226
    iget-object v0, p0, Lo/cwc;->e:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->k()V

    .line 1227
    return-void
.end method

.method public e(IZ)V
    .locals 4

    .line 1290
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setPersonalPrivacySettingValue... privacyId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", isOpen = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1291
    iget-object v0, p0, Lo/cwc;->u:Lo/dnm;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lo/cwc$5;

    invoke-direct {v2, p0}, Lo/cwc$5;-><init>(Lo/cwc;)V

    invoke-virtual {v0, p1, p2, v1, v2}, Lo/dnm;->e(IZLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1301
    return-void
.end method

.method public e(Lo/ces;)V
    .locals 4

    .line 1140
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reportCurrentStepCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1141
    iput-object p1, p0, Lo/cwc;->l:Lo/ces;

    .line 1142
    iget-object v0, p0, Lo/cwc;->a:Lo/cwc$a;

    if-eqz v0, :cond_0

    .line 1144
    iget-object v0, p0, Lo/cwc;->a:Lo/cwc$a;

    const/16 v1, 0x7d3

    invoke-virtual {v0, v1}, Lo/cwc$a;->sendEmptyMessage(I)Z

    .line 1146
    :cond_0
    return-void
.end method

.method public e(Lo/cer;I)Z
    .locals 3

    .line 837
    iget-object v0, p0, Lo/cwc;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    iget-object v1, p0, Lo/cwc;->y:Lo/cmg;

    const/16 v2, 0xd

    invoke-interface {v0, v2, v1}, Lo/clt;->a(ILo/cmg;)V

    .line 838
    iput-object p1, p0, Lo/cwc;->g:Lo/cer;

    .line 840
    const/4 v0, 0x1

    return v0
.end method

.method public e(Lo/cez;I)Z
    .locals 5

    .line 872
    const/4 v4, 0x0

    .line 874
    iget-object v0, p0, Lo/cwc;->e:Lo/cmj;

    if-eqz v0, :cond_0

    .line 875
    iget-object v0, p0, Lo/cwc;->e:Lo/cmj;

    new-instance v1, Lo/cwc$15;

    invoke-direct {v1, p0}, Lo/cwc$15;-><init>(Lo/cwc;)V

    invoke-virtual {v0, v1, p2}, Lo/cmj;->a(Lo/cmx;I)Z

    move-result v4

    goto :goto_0

    .line 885
    :cond_0
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHealthOpenSDk is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 888
    :goto_0
    if-eqz v4, :cond_1

    .line 889
    iput-object p1, p0, Lo/cwc;->i:Lo/cez;

    .line 890
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regStepRateListener success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 892
    :cond_1
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "regStepRateListener failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 896
    :goto_1
    return v4
.end method

.method public f()V
    .locals 2

    .line 1231
    iget-object v0, p0, Lo/cwc;->e:Lo/cmj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cmj;->c(Z)V

    .line 1232
    return-void
.end method

.method public g()I
    .locals 3

    .line 1260
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->d()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v0

    iput-object v0, p0, Lo/cwc;->r:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    .line 1261
    const/16 v2, 0xb0

    .line 1262
    iget-object v0, p0, Lo/cwc;->r:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1263
    iget-object v0, p0, Lo/cwc;->r:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getWarningLimitHR()I

    move-result v2

    .line 1266
    :cond_0
    return v2
.end method

.method public h()Z
    .locals 5

    .line 1271
    iget-object v0, p0, Lo/cwc;->u:Lo/dnm;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/dnm;->c(I)Ljava/lang/String;

    move-result-object v4

    .line 1272
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isPrivicyOfSportDataSwitchOn = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1273
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 1274
    :cond_0
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isPrivicyOfSportDataSwitchOn not set"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1275
    const/4 v0, 0x0

    return v0

    .line 1277
    :cond_1
    const-string v0, "true"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 3

    .line 1244
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->d()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v0

    iput-object v0, p0, Lo/cwc;->r:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    .line 1245
    const/4 v2, 0x1

    .line 1246
    iget-object v0, p0, Lo/cwc;->r:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1247
    iget-object v0, p0, Lo/cwc;->r:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->isWarningEnble()Z

    move-result v2

    .line 1250
    :cond_0
    return v2
.end method

.method public k()V
    .locals 1

    .line 1236
    iget-object v0, p0, Lo/cwc;->e:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->k()V

    .line 1237
    return-void
.end method

.method public l()V
    .locals 1

    .line 1404
    iget-object v0, p0, Lo/cwc;->b:Lo/fke;

    if-eqz v0, :cond_0

    .line 1405
    iget-object v0, p0, Lo/cwc;->b:Lo/fke;

    invoke-virtual {v0}, Lo/fke;->c()V

    .line 1406
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwc;->b:Lo/fke;

    .line 1408
    :cond_0
    return-void
.end method

.method public m()V
    .locals 2

    .line 1397
    iget-object v0, p0, Lo/cwc;->b:Lo/fke;

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/cwc;->m:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 1398
    new-instance v0, Lo/fke;

    iget-object v1, p0, Lo/cwc;->m:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/fke;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/cwc;->b:Lo/fke;

    .line 1400
    :cond_0
    return-void
.end method

.method public n()Z
    .locals 1

    .line 1304
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    return v0
.end method

.method public o()V
    .locals 4

    .line 1382
    iget-object v0, p0, Lo/cwc;->w:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cwc;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1383
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregRunningPostureListener"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1384
    iget-object v0, p0, Lo/cwc;->m:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    iget-object v1, p0, Lo/cwc;->w:Ljava/util/List;

    new-instance v2, Lo/cwc$2;

    invoke-direct {v2, p0}, Lo/cwc$2;-><init>(Lo/cwc;)V

    invoke-interface {v0, v1, v2}, Lo/clt;->e(Ljava/util/List;Lo/cmh;)V

    .line 1393
    :cond_0
    return-void
.end method

.method public p()V
    .locals 4

    .line 1438
    iget-object v0, p0, Lo/cwc;->b:Lo/fke;

    if-eqz v0, :cond_0

    .line 1439
    iget-object v0, p0, Lo/cwc;->b:Lo/fke;

    invoke-virtual {v0}, Lo/fke;->b()Z

    goto :goto_0

    .line 1441
    :cond_0
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterFreeIndoorRunninngStyle mTreadmillManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1443
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwc;->h:Lo/ccq;

    .line 1444
    return-void
.end method

.method public r()V
    .locals 4

    .line 946
    iget-object v0, p0, Lo/cwc;->i:Lo/cez;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cwc;->e:Lo/cmj;

    if-eqz v0, :cond_0

    .line 947
    iget-object v0, p0, Lo/cwc;->e:Lo/cmj;

    invoke-virtual {v0}, Lo/cmj;->c()Z

    goto :goto_0

    .line 949
    :cond_0
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregStepRateListener mStepRateCallback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 951
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cwc;->i:Lo/cez;

    .line 954
    return-void
.end method

.method public s()Z
    .locals 5

    .line 1212
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "auto_synchronous_flag"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1214
    if-eqz v4, :cond_0

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "1"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1215
    :cond_0
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Auto Sync is open"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1216
    const/4 v0, 0x1

    return v0

    .line 1218
    :cond_1
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Auto Sync is closed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1219
    const/4 v0, 0x0

    return v0
.end method
