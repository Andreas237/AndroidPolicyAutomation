.class public Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;
.super Lcom/huawei/health/suggestion/ui/BaseStateActivity;
.source "SourceFile"


# instance fields
.field private A:Z

.field private B:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Long;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private C:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Object;>;"
        }
    .end annotation
.end field

.field private D:J

.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:Landroid/content/Context;

.field private L:I

.field private M:I

.field private d:Lo/bwa;

.field private f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

.field private g:Lo/bvb;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/ui/fitness/module/Motion;>;"
        }
    .end annotation
.end field

.field private i:Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;

.field private j:J

.field private k:F

.field private l:F

.field private m:Lo/egw;

.field private n:Z

.field private o:I

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/suggestion/model/RecordAction;>;"
        }
    .end annotation
.end field

.field private t:F

.field private u:F

.field private v:F

.field private w:I

.field private x:I

.field private y:J

.field private z:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 82
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;-><init>()V

    .line 96
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->r:Z

    .line 97
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->q:Z

    .line 108
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->A:Z

    .line 109
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->D:J

    .line 110
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->j:J

    .line 111
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->C:Ljava/util/List;

    .line 112
    const/16 v0, 0x3e7

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->I:I

    .line 113
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->H:I

    .line 114
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->G:I

    .line 115
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->F:I

    .line 116
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->E:I

    .line 117
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->L:I

    .line 118
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->M:I

    return-void
.end method

.method private a(JI)V
    .locals 4

    .line 758
    move v3, p3

    .line 759
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->B:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 760
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->B:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v3, v0

    .line 762
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->B:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 763
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->l()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;JJ)V
    .locals 0

    .line 82
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b(JJ)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;Z)Z
    .locals 0

    .line 82
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->q:Z

    return p1
.end method

.method private b(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)F
    .locals 3

    .line 515
    int-to-float v0, p2

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->getTotalBeats()F

    move-result v1

    div-float v2, v0, v1

    .line 516
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v2, v0

    if-lez v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    move v2, v0

    .line 517
    return v2
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;J)J
    .locals 0

    .line 82
    iput-wide p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->j:J

    return-wide p1
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/bwa;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    return-object v0
.end method

.method private b(JJ)V
    .locals 19

    .line 715
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "HH:mm:ss"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 716
    const-wide/32 v0, 0xea60

    div-long v0, p1, v0

    const-wide/32 v2, 0xea60

    mul-long v5, v0, v2

    .line 717
    const-wide/32 v0, 0xea60

    div-long v0, p3, v0

    const-wide/32 v2, 0xea60

    mul-long v7, v0, v2

    .line 718
    const-wide/32 v0, 0xea60

    div-long v0, p3, v0

    const-wide/32 v2, 0xea60

    div-long v2, p1, v2

    sub-long/2addr v0, v2

    long-to-int v9, v0

    .line 719
    sub-long v0, p3, p1

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v10, v0

    .line 720
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 721
    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 722
    const-wide/16 v13, 0x0

    .line 723
    const-wide/16 v15, 0x0

    .line 724
    const/16 v17, 0x0

    .line 725
    const-string v0, "CoachActivity"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveFitnessIntensityToMap durationSecond"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "--durationMin"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "--startTimeFormat:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object v11, v1, v2

    const-string v2, "-endTimeFormat:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x7

    aput-object v12, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 726
    if-nez v9, :cond_0

    .line 727
    move-object/from16 v0, p0

    invoke-direct {v0, v5, v6, v10}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->a(JI)V

    .line 728
    int-to-long v0, v10

    add-long/2addr v13, v0

    goto/16 :goto_2

    .line 729
    :cond_0
    if-gez v9, :cond_1

    .line 730
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveFitnessIntensityToMap durationMin < 0 error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 732
    :cond_1
    const/16 v18, 0x0

    :goto_0
    move/from16 v0, v18

    if-gt v0, v9, :cond_4

    .line 733
    if-nez v18, :cond_2

    .line 734
    const-wide/32 v0, 0xea60

    add-long/2addr v0, v5

    sub-long v0, v0, p1

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v2, v0

    move/from16 v17, v2

    .line 735
    move-object/from16 v0, p0

    move/from16 v1, v17

    invoke-direct {v0, v5, v6, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->a(JI)V

    .line 736
    move/from16 v0, v17

    int-to-long v0, v0

    add-long/2addr v13, v0

    goto :goto_1

    .line 737
    :cond_2
    if-lez v18, :cond_3

    move/from16 v0, v18

    if-ge v0, v9, :cond_3

    .line 738
    move/from16 v0, v18

    int-to-long v0, v0

    const-wide/32 v2, 0xea60

    mul-long/2addr v0, v2

    add-long v15, v5, v0

    .line 739
    const/16 v17, 0x3c

    .line 740
    const-wide/16 v0, 0x3c

    add-long/2addr v13, v0

    .line 741
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->B:Ljava/util/Map;

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 743
    :cond_3
    move-wide v15, v7

    .line 744
    sub-long v0, p3, v7

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v2, v0

    move/from16 v17, v2

    .line 745
    move/from16 v0, v17

    int-to-long v0, v0

    add-long/2addr v13, v0

    .line 746
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->B:Ljava/util/Map;

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 732
    :goto_1
    add-int/lit8 v18, v18, 0x1

    goto/16 :goto_0

    .line 750
    :cond_4
    :goto_2
    int-to-long v0, v10

    cmp-long v0, v0, v13

    if-eqz v0, :cond_5

    .line 751
    const-string v0, "CoachActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "durationSecond:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--valueSum:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "warning durationSecond !=valuesum"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 753
    :cond_5
    const-string v0, "CoachActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "durationSecond:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--valueSum:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "durationSecond ==valuesum"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 755
    :goto_3
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)J
    .locals 2

    .line 82
    iget-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->D:J

    return-wide v0
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;Z)Z
    .locals 0

    .line 82
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->A:Z

    return p1
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)J
    .locals 2

    .line 82
    iget-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->j:J

    return-wide v0
.end method

.method private d(Lo/dgj;)V
    .locals 6

    .line 395
    invoke-virtual {p1}, Lo/dgj;->c()I

    move-result v0

    if-nez v0, :cond_0

    .line 396
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "heartrate is zero!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    return-void

    .line 399
    :cond_0
    invoke-virtual {p1}, Lo/dgj;->c()I

    move-result v4

    .line 400
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->I:I

    if-gt v4, v0, :cond_1

    move v0, v4

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->I:I

    :goto_0
    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->I:I

    .line 401
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->H:I

    if-lt v4, v0, :cond_2

    move v0, v4

    goto :goto_1

    :cond_2
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->H:I

    :goto_1
    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->H:I

    .line 402
    invoke-static {}, Lo/bvo;->c()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v5

    .line 403
    invoke-virtual {v5, v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->findRateRegion(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    .line 405
    :pswitch_0
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->M:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->M:I

    .line 406
    goto :goto_2

    .line 408
    :pswitch_1
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->L:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->L:I

    .line 409
    goto :goto_2

    .line 411
    :pswitch_2
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->E:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->E:I

    .line 412
    goto :goto_2

    .line 414
    :pswitch_3
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->F:I

    .line 415
    goto :goto_2

    .line 417
    :pswitch_4
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->G:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->G:I

    .line 418
    nop

    .line 420
    .line 424
    :goto_2
    :pswitch_5
    return-void

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_5
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private d(Landroid/content/Intent;)Z
    .locals 4

    .line 251
    const-string v0, "workoutrecord"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 252
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->acquireMotions()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h:Ljava/util/List;

    if-nez v0, :cond_1

    .line 253
    :cond_0
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCoachData,mRecord,mMotions is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->finish()V

    .line 255
    const/4 v0, 0x1

    return v0

    .line 257
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;J)J
    .locals 0

    .line 82
    iput-wide p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->D:J

    return-wide p1
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/bvb;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->g:Lo/bvb;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;Lo/dgj;)V
    .locals 0

    .line 82
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d(Lo/dgj;)V

    return-void
.end method

.method private e(Ljava/util/Map;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Long;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 766
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 767
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 768
    const/4 v6, 0x0

    .line 769
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v0, "HH:mm:ss"

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 770
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 771
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 772
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/util/Map$Entry;

    .line 773
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/Integer;

    .line 774
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_0

    .line 775
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 776
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 777
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v6, v0

    .line 778
    const-string v0, "~key:"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-value:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 779
    goto :goto_1

    .line 780
    :cond_0
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveMapToFitnessIntensity key < = 0 error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 781
    goto :goto_0

    .line 783
    :goto_1
    goto :goto_0

    .line 784
    :cond_1
    const-string v0, "CoachActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveMapToFitnessIntensity sumSecond:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "--logStr:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 785
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-interface {v0, v1, v5}, Lo/bsp;->b(Landroid/content/Context;Ljava/util/List;)V

    .line 786
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 787
    return-void
.end method

.method private static e(Landroid/content/Context;Z)Z
    .locals 7

    .line 191
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 192
    const-string v0, "ANDROID_LAB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "context is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    const/4 v0, 0x0

    return v0

    .line 197
    :cond_0
    const-string v0, "audio"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/media/AudioManager;

    .line 198
    if-eqz p1, :cond_2

    .line 199
    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x2

    invoke-virtual {v5, v0, v1, v2}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    move-result v6

    .line 200
    const/4 v0, 0x1

    if-ne v6, v0, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    .line 201
    :goto_0
    goto :goto_1

    .line 202
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    move-result v6

    .line 203
    const/4 v0, 0x1

    if-ne v6, v0, :cond_3

    const/4 v4, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    .line 205
    :goto_1
    const-string v0, "ANDROID_LAB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pauseMusic bMute="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " result="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    return v4
.end method

.method static synthetic f(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Landroid/content/Context;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->J:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Z
    .locals 1

    .line 82
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->q()Z

    move-result v0

    return v0
.end method

.method static synthetic h(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lcom/huawei/health/suggestion/model/WorkoutRecord;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->u()V

    return-void
.end method

.method static synthetic k(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->n()V

    return-void
.end method

.method private l()V
    .locals 2

    .line 390
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->D:J

    .line 391
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->j:J

    .line 392
    return-void
.end method

.method static synthetic l(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->w()V

    return-void
.end method

.method private m()V
    .locals 1

    .line 436
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    if-eqz v0, :cond_0

    .line 437
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->k()V

    .line 439
    :cond_0
    return-void
.end method

.method static synthetic m(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Z
    .locals 1

    .line 82
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->p:Z

    return v0
.end method

.method private n()V
    .locals 1

    .line 442
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    iget-boolean v0, v0, Lo/bwa;->E:Z

    if-nez v0, :cond_0

    .line 444
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->r()V

    goto :goto_0

    .line 446
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->s()V

    .line 448
    :goto_0
    return-void
.end method

.method static synthetic n(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->z()V

    return-void
.end method

.method static synthetic o(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Z
    .locals 1

    .line 82
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->q:Z

    return v0
.end method

.method private p()V
    .locals 3

    .line 159
    invoke-static {p0}, Lo/bvb;->c(Landroid/app/Activity;)Lo/bvb;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->g:Lo/bvb;

    .line 160
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->g:Lo/bvb;

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_coach_dialog_exit:I

    invoke-virtual {v0, v1}, Lo/bvb;->e(I)Lo/bvb;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_coach_dialog_No:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$3;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V

    .line 161
    invoke-virtual {v0, v1, v2}, Lo/bvb;->d(ILandroid/view/View$OnClickListener;)Lo/bvb;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$id;->sug_coach_dialog_yse:I

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$5;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V

    .line 174
    invoke-virtual {v0, v1, v2}, Lo/bvb;->d(ILandroid/view/View$OnClickListener;)Lo/bvb;

    .line 181
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->g:Lo/bvb;

    invoke-virtual {v0}, Lo/bvb;->a()Landroid/app/Dialog;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 188
    return-void
.end method

.method static synthetic p(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Z
    .locals 1

    .line 82
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->A:Z

    return v0
.end method

.method private q()Z
    .locals 5

    .line 555
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 556
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Lo/brr;->c(I)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->A:Z

    goto :goto_0

    .line 558
    :cond_0
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginSuggestionAdapterManager.getInstance() is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 560
    :goto_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const-string v1, "privacynotremind"

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 561
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dialog not remind:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 562
    const-string v0, "CoachActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mValid:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    iget-boolean v2, v2, Lo/bwa;->E:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 563
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    iget-boolean v0, v0, Lo/bwa;->E:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->A:Z

    if-nez v0, :cond_1

    const-string v0, "true"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private r()V
    .locals 1

    .line 467
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->g:Lo/bvb;

    invoke-virtual {v0}, Lo/bvb;->d()Lo/bvb;

    .line 468
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->d()V

    .line 470
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->q()V

    .line 471
    return-void
.end method

.method private s()V
    .locals 7

    .line 524
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4fdd\u5b58\u5230record\uff1a\u540d\u5b57:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--saveFinishRate:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->l:F

    float-to-int v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--saveActualCalorie:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->u:F

    float-to-int v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--saveDuring:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->t:F

    float-to-int v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--saveExerciseTime:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 526
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 528
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->v:F

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveCalorie(F)V

    .line 529
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 531
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 532
    const/4 v6, 0x0

    goto :goto_0

    .line 534
    :cond_0
    const/4 v6, 0x1

    .line 537
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0, v6}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveRecordType(I)V

    .line 538
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->l:F

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveFinishRate(F)V

    .line 539
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->u:F

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActualCalorie(F)V

    .line 540
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->t:F

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveDuring(I)V

    .line 541
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0, v5}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActionSummary(Ljava/lang/String;)V

    .line 542
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 543
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$8;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$8;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_1

    .line 550
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->w()V

    .line 552
    :goto_1
    return-void
.end method

.method static synthetic t(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)Lo/egw;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->m:Lo/egw;

    return-object v0
.end method

.method private t()Z
    .locals 2

    .line 451
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->getTrainStation()I

    move-result v0

    const/16 v1, 0xbf

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->getTrainStation()I

    move-result v0

    const/16 v1, 0xbe

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private u()V
    .locals 11

    .line 476
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->B:Ljava/util/Map;

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->e(Ljava/util/Map;)V

    .line 479
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->l:F

    .line 480
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->t:F

    .line 481
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->u:F

    .line 483
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->v:F

    .line 484
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->s:Ljava/util/ArrayList;

    .line 485
    const/4 v5, 0x0

    .line 486
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    .line 488
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireProgress()I

    move-result v8

    .line 489
    if-lez v8, :cond_0

    add-int/lit8 v0, v5, 0x1

    goto :goto_1

    :cond_0
    move v0, v5

    :goto_1
    move v5, v0

    .line 491
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->getRecordAction()Lcom/huawei/health/suggestion/model/RecordAction;

    move-result-object v9

    .line 492
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->s:Ljava/util/ArrayList;

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 494
    invoke-direct {p0, v7, v8}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/module/Motion;I)F

    move-result v10

    .line 497
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->u:F

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireCalorie()F

    move-result v1

    mul-float/2addr v1, v10

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDuration()F

    move-result v2

    mul-float/2addr v1, v2

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->z:F

    mul-float/2addr v1, v2

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->u:F

    .line 498
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->v:F

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireCalorie()F

    move-result v1

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDuration()F

    move-result v2

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->z:F

    mul-float/2addr v1, v2

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->v:F

    .line 500
    const-string v0, "COACH"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "rate\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " duration\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDuration()F

    move-result v3

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    const/high16 v4, 0x447a0000    # 1000.0f

    div-float/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " kcal\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireCalorie()F

    move-result v3

    mul-float/2addr v3, v10

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDuration()F

    move-result v4

    mul-float/2addr v3, v4

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireGroups()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    iget v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->z:F

    mul-float/2addr v3, v4

    const/high16 v4, 0x447a0000    # 1000.0f

    div-float/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "--stand kcal2 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 501
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireCalorie()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==times: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireDuration()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  weight: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->z:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 500
    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 502
    goto/16 :goto_0

    .line 503
    :cond_1
    const-string v0, "CoachActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "train_kcal:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->u:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "___totalKcal:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->v:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 504
    iput v5, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->x:I

    .line 505
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->u:F

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->v:F

    div-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->l:F

    .line 506
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->l:F

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->acquireDuration()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->t:F

    .line 507
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 508
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->w:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 509
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->s()V

    .line 510
    return-void
.end method

.method private v()V
    .locals 10

    .line 676
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_RUN_END_2050006:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v0, v2, v1}, Lcom/huawei/operation/OpAnalyticsUtil;->setEventWithActionType(ILjava/lang/String;)V

    .line 677
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 678
    const-string v0, "actiontype"

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 679
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_PVUV_85050001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 681
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v5

    .line 682
    const/4 v6, 0x0

    .line 683
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 684
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "entrance"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 686
    :cond_0
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 687
    const-string v6, "otherModel"

    .line 689
    :cond_1
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 690
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 691
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 692
    return-void

    .line 695
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lo/bvs;->c(Lcom/huawei/health/suggestion/model/Plan;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 696
    const-string v0, "plan_name"

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 697
    const-string v0, "type"

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Plan;->acquireType()I

    move-result v1

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 699
    :cond_3
    invoke-static {}, Lo/bzm;->c()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 700
    const-string v0, "start_time"

    iget-wide v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->y:J

    invoke-static {v1, v2}, Lo/bzm;->e(J)J

    move-result-wide v1

    invoke-virtual {v8, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 702
    :cond_4
    const-string v0, "entrance"

    invoke-virtual {v8, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 703
    const-string v0, "course_version"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 704
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0, v8}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->getBIJson(Lorg/json/JSONObject;)V

    .line 705
    const-string v0, "data"

    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 706
    const-string v0, "1120005"

    invoke-static {v0, v7}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 710
    goto :goto_0

    .line 708
    :catch_0
    move-exception v9

    .line 709
    const-string v0, "CoachActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 711
    :goto_0
    return-void
.end method

.method private w()V
    .locals 7

    .line 566
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    iget-boolean v0, v0, Lo/bwa;->z:Z

    if-eqz v0, :cond_2

    .line 567
    const/4 v4, 0x0

    .line 568
    const/4 v5, 0x0

    .line 569
    new-instance v6, Lcom/huawei/health/suggestion/model/RateInfo;

    invoke-direct {v6}, Lcom/huawei/health/suggestion/model/RateInfo;-><init>()V

    .line 570
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->I:I

    const/16 v1, 0x3e7

    if-eq v0, v1, :cond_0

    .line 571
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->I:I

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveMinRate(I)V

    .line 573
    :cond_0
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->H:I

    if-eqz v0, :cond_1

    .line 574
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->H:I

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveMaxRate(I)V

    .line 576
    :cond_1
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->G:I

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveLimit(I)V

    .line 577
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->F:I

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveNoRaise(I)V

    .line 578
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->E:I

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveHaveRaise(I)V

    .line 579
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->L:I

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveFatBurning(I)V

    .line 580
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->M:I

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveWarmUp(I)V

    .line 581
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0, v4, v5, v6}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExtend(ZILcom/huawei/health/suggestion/model/RateInfo;)V

    .line 583
    :cond_2
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-interface {v0, v1}, Lo/bsp;->a(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 585
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 586
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "planId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 587
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v0, v1}, Lo/btj;->c(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 589
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$6;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$6;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 599
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$11;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$11;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 631
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5b58\u50a8\u8bad\u7ec3\u8bb0\u5f55 \u66f4\u65b0\u8bad\u7ec3\u8fdb\u5ea6 -- mRecord:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  is plan: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquirePlanId()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    const/4 v3, 0x1

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 634
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->v()V

    .line 635
    return-void
.end method

.method private z()V
    .locals 5

    .line 638
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->J:Landroid/content/Context;

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_coach_dialog_post_data:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 639
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->J:Landroid/content/Context;

    invoke-static {v0}, Lo/dom;->a(Landroid/content/Context;)Lo/dom;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->J:Landroid/content/Context;

    const-string v2, "privacy_sport_data_num"

    invoke-virtual {v0, v1, v2}, Lo/dom;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    .line 640
    const/4 v0, 0x3

    if-lt v4, v0, :cond_1

    .line 641
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    iget-object v0, v0, Lo/bwa;->p:Lo/bwa$d;

    if-eqz v0, :cond_0

    .line 642
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    iget-object v0, v0, Lo/bwa;->p:Lo/bwa$d;

    const/16 v1, -0x64

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 644
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->w()V

    .line 645
    return-void

    .line 647
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->J:Landroid/content/Context;

    invoke-static {v0}, Lo/dom;->a(Landroid/content/Context;)Lo/dom;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->J:Landroid/content/Context;

    const-string v2, "privacy_sport_data_num"

    invoke-virtual {v0, v1, v2}, Lo/dom;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 648
    new-instance v0, Lo/egw$c;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->J:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egw$c;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->J:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_coach_dialog_exit_title:I

    .line 649
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egw$c;->a(Ljava/lang/String;)Lo/egw$c;

    move-result-object v0

    .line 650
    invoke-virtual {v0, v3}, Lo/egw$c;->e(Landroid/view/View;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->J:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_common_disagree:I

    .line 651
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->c(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->J:Landroid/content/Context;

    sget v2, Lcom/huawei/health/suggestion/R$string;->IDS_user_permission_ok:I

    .line 657
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V

    invoke-virtual {v0, v1, v2}, Lo/egw$c;->a(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egw$c;

    move-result-object v0

    .line 670
    invoke-virtual {v0}, Lo/egw$c;->e()Lo/egw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->m:Lo/egw;

    .line 671
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->m:Lo/egw;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egw;->setCancelable(Z)V

    .line 672
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->m:Lo/egw;

    invoke-virtual {v0}, Lo/egw;->show()V

    .line 673
    return-void
.end method


# virtual methods
.method public d()I
    .locals 1

    .line 155
    const/4 v0, 0x0

    return v0
.end method

.method public finish()V
    .locals 3

    .line 456
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->finish()V

    .line 457
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->q:Z

    if-eqz v0, :cond_0

    .line 458
    invoke-static {}, Lo/bxb;->b()Lo/bxb;

    move-result-object v0

    invoke-virtual {v0}, Lo/bxb;->d()V

    goto :goto_0

    .line 459
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->n:Z

    if-eqz v0, :cond_1

    .line 460
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 461
    const-string v0, "finish"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 462
    invoke-virtual {p0, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->startActivity(Landroid/content/Intent;)V

    .line 464
    :cond_1
    :goto_0
    return-void
.end method

.method public g()V
    .locals 1

    .line 140
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_activity_coach:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->setContentView(I)V

    .line 141
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->p()V

    .line 142
    return-void
.end method

.method public h()I
    .locals 1

    .line 146
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_loading_layout:I

    return v0
.end method

.method public i()V
    .locals 7

    .line 210
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 211
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 212
    const-string v0, "coachstartposition"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->o:I

    .line 213
    const-string v0, "havenexttrain"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->n:Z

    .line 214
    const-string v0, "isafterrun"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->q:Z

    .line 215
    const-string v0, "motions"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 216
    const-string v0, "motions"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;

    .line 218
    :cond_0
    const-string v0, "ISPLANFIT"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->p:Z

    .line 219
    invoke-direct {p0, v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 220
    :cond_1
    const-string v0, "islinkedfitness"

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 221
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->setDeviceConnected()V

    .line 224
    :cond_2
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "is_first_to_coachacitivyt"

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 226
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->i:Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/CoachData;->acquireWorkId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireComeFrom(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bwa;->a(Ljava/lang/String;)V

    .line 227
    invoke-static {}, Lo/caa;->a()Lo/caa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/caa;->c(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 228
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bwa;->setGender(I)V

    .line 229
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->h:Ljava/util/List;

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->o:I

    invoke-virtual {v0, v1, v2}, Lo/bwa;->setMotions(Ljava/util/List;I)V

    .line 230
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$7;

    invoke-direct {v0, p0, v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$7;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 241
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->z:F

    .line 242
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->g()Lcom/huawei/health/suggestion/model/Userinfo;

    move-result-object v6

    .line 243
    if-eqz v6, :cond_3

    .line 244
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Userinfo;->acquireWeight()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->z:F

    goto :goto_0

    .line 246
    :cond_3
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_weight_error:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 248
    :goto_0
    return-void
.end method

.method public k()V
    .locals 1

    .line 150
    sget v0, Lcom/huawei/health/suggestion/R$id;->cv_coua:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/bwa;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    .line 151
    return-void
.end method

.method public o()V
    .locals 2

    .line 262
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$10;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V

    invoke-virtual {v0, v1}, Lo/bwa;->b(Lo/bwi;)V

    .line 354
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    iget-boolean v0, v0, Lo/bwa;->z:Z

    if-eqz v0, :cond_0

    .line 355
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->J:Landroid/content/Context;

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity$9;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;)V

    invoke-virtual {v0, v1}, Lo/dge;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 384
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    const-string v1, "D010"

    invoke-virtual {v0, v1}, Lo/bwa;->c(Ljava/lang/String;)Lo/bwa;

    .line 385
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->b()V

    .line 386
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 893
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 894
    const-string v0, "CoachActivity"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onActivityResult "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const/4 v2, 0x5

    aput-object p3, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 895
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 428
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 429
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->n()V

    goto :goto_0

    .line 431
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->m()V

    .line 433
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 124
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onCreate(Landroid/os/Bundle;)V

    .line 126
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 127
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x480

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 128
    iput-object p0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->J:Landroid/content/Context;

    .line 129
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->y:J

    .line 130
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->B:Ljava/util/Map;

    .line 131
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v4

    .line 132
    invoke-virtual {v4}, Landroid/view/Display;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->k:F

    .line 133
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->w:I

    .line 134
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->setRequestedOrientation(I)V

    .line 137
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 838
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 839
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8d44\u6e90\u91ca\u653e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 841
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->setRequestedOrientation(I)V

    .line 845
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 846
    invoke-static {}, Lo/caa;->a()Lo/caa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->f:Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/caa;->c(Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 848
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->l()V

    .line 849
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onDestroy()V

    .line 850
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->unregResultCallback()V

    .line 851
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->J:Landroid/content/Context;

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    invoke-virtual {v0}, Lo/dge;->c()V

    .line 852
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 821
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 823
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 824
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->g()V

    .line 826
    :cond_0
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onPause()V

    .line 828
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->J:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->e(Landroid/content/Context;Z)Z

    .line 829
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 791
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 793
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lo/buk;->d([Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 795
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 796
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x1706

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 806
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/bwa$d;->b()I

    move-result v0

    const/16 v1, 0xc0

    if-ne v0, v1, :cond_1

    .line 807
    const-string v0, "CoachActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume() play again"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 808
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->t()Lo/bwa$d;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    invoke-virtual {v1}, Lo/bwa;->x()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bwa$d;->e(I)V

    .line 809
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->u()Lo/bwe;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/bwe;->setVisibility(I)V

    .line 811
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->d:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->e()V

    .line 814
    :cond_2
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onResume()V

    .line 816
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->J:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/CoachActivity;->e(Landroid/content/Context;Z)Z

    .line 817
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 833
    invoke-super {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onStop()V

    .line 834
    return-void
.end method
