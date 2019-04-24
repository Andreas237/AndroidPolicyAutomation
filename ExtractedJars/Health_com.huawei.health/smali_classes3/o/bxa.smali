.class public Lo/bxa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bru;


# static fields
.field private static volatile s:Lo/bxa;


# instance fields
.field private A:I

.field private B:I

.field private D:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

.field a:I

.field b:I

.field c:Lo/cai;

.field d:I

.field e:I

.field f:Lo/cai;

.field g:Lo/cai;

.field h:Lo/cai;

.field i:Lo/cai;

.field k:Lo/cai;

.field l:Z

.field m:J

.field n:Lo/cai;

.field o:Lo/cab;

.field p:Lo/cab;

.field private q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lcom/huawei/health/suggestion/model/FitRunPlayAudio;>;>;"
        }
    .end annotation
.end field

.field private r:Lcom/huawei/health/suggestion/model/Userinfo;

.field private t:Lo/brv;

.field private u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

.field private v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/WorkoutAction;>;"
        }
    .end annotation
.end field

.field private w:I

.field private x:Z

.field private y:Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;

.field private z:Lo/bzn;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 66
    const/4 v0, 0x0

    sput-object v0, Lo/bxa;->s:Lo/bxa;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 69
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/bxa;->q:Ljava/util/Map;

    .line 71
    const/4 v0, -0x1

    iput v0, p0, Lo/bxa;->d:I

    .line 72
    const/4 v0, 0x0

    iput v0, p0, Lo/bxa;->b:I

    .line 73
    const/4 v0, 0x0

    iput v0, p0, Lo/bxa;->a:I

    .line 74
    const/4 v0, 0x0

    iput v0, p0, Lo/bxa;->e:I

    .line 76
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->c:Lo/cai;

    .line 77
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->g:Lo/cai;

    .line 78
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->i:Lo/cai;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->h:Lo/cai;

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->k:Lo/cai;

    .line 81
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->f:Lo/cai;

    .line 82
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->n:Lo/cai;

    .line 84
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->o:Lo/cab;

    .line 85
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->p:Lo/cab;

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bxa;->l:Z

    .line 87
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/bxa;->m:J

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->v:Ljava/util/List;

    .line 95
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bxa;->x:Z

    .line 97
    const/16 v0, 0x3c

    iput v0, p0, Lo/bxa;->A:I

    .line 102
    return-void
.end method

.method private A()V
    .locals 4

    .line 1471
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastReserveHRNormal"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1472
    return-void
.end method

.method private B()V
    .locals 4

    .line 1399
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "    private void broadcastReserveIntervalUpperLimit() {\n \u50a8\u5b58\u5fc3\u7387\u5927\u4e8e\u4e0a\u9650\uff0c\u8bf7\u51cf\u901f\uff01 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v2

    invoke-interface {v2}, Lo/bzo;->m()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1400
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0}, Lo/bzo;->n()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 1401
    return-void
.end method

.method private C()V
    .locals 4

    .line 1466
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastReserveHRNo \u4e0d\u64ad\u62a5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1467
    return-void
.end method

.method private D()V
    .locals 4

    .line 1476
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastReserveHRLowerLimit \u5b58\u50a8\u5fc3\u7387\u4f4e\u4e8e\u4e0b\u9650 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v2

    invoke-interface {v2}, Lo/bzo;->k()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1477
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0}, Lo/bzo;->k()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 1478
    return-void
.end method

.method private a(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)Ljava/lang/String;
    .locals 6

    .line 643
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getAction()Lcom/huawei/pluginFitnessAdvice/Action;

    move-result-object v4

    .line 644
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 645
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutActionNameAudios  null == action"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 646
    invoke-direct {p0, p1}, Lo/bxa;->b(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 648
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/pluginFitnessAdvice/Action;->getAudios()Ljava/util/List;

    move-result-object v5

    .line 649
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 650
    :cond_1
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutActionNameAudios  null == audios || audios.size() <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 651
    invoke-direct {p0, p1}, Lo/bxa;->b(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 653
    :cond_2
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Audio;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/Audio;->getUrl()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/WorkoutAction;>;"
        }
    .end annotation

    .line 866
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 868
    if-eqz p0, :cond_5

    .line 869
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireWarmUpRunAction()Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    move-result-object v5

    .line 870
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 871
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 874
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireWorkoutActions()Ljava/util/List;

    move-result-object v6

    .line 875
    const/4 v7, 0x1

    .line 876
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->getType()I

    move-result v8

    .line 877
    const/4 v0, 0x3

    if-ne v0, v8, :cond_1

    .line 878
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireRepeatTimes()I

    move-result v7

    .line 881
    :cond_1
    const/4 v9, 0x0

    :goto_0
    if-ge v9, v7, :cond_3

    .line 882
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 883
    invoke-interface {v4, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 884
    goto :goto_1

    .line 881
    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 887
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCoolDownRunAction()Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    move-result-object v9

    .line 888
    const/4 v0, 0x0

    if-eq v0, v9, :cond_4

    .line 889
    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 891
    :cond_4
    goto :goto_2

    .line 892
    :cond_5
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutActionRunWorkoutAll fitworkout is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 895
    :goto_2
    return-object v4
.end method

.method public static a()Lo/bxa;
    .locals 4

    .line 225
    sget-object v0, Lo/bxa;->s:Lo/bxa;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 226
    const-class v2, Lo/bxa;

    monitor-enter v2

    .line 227
    :try_start_0
    sget-object v0, Lo/bxa;->s:Lo/bxa;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 228
    new-instance v0, Lo/bxa;

    invoke-direct {v0}, Lo/bxa;-><init>()V

    sput-object v0, Lo/bxa;->s:Lo/bxa;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 230
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 232
    :cond_1
    :goto_0
    sget-object v0, Lo/bxa;->s:Lo/bxa;

    return-object v0
.end method

.method private a(IIIIF)V
    .locals 9

    .line 679
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "speakAside"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 681
    iget-object v0, p0, Lo/bxa;->q:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 682
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 683
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "speakAside  null == fitRunPlayAudios"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 684
    return-void

    .line 686
    :cond_0
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 687
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;

    .line 688
    move-object v0, p0

    move-object v1, v8

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lo/bxa;->e(Lcom/huawei/health/suggestion/model/FitRunPlayAudio;IIIF)V

    .line 686
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 691
    :cond_1
    return-void
.end method

.method private a(Lcom/huawei/health/suggestion/model/FitRunPlayAudio;I)V
    .locals 4

    .line 729
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->acquirePlayValue()F

    move-result v1

    .line 731
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->acquireOpportunity()Ljava/lang/String;

    move-result-object v2

    .line 732
    const-string v0, "e"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 733
    int-to-float v0, p2

    cmpl-float v0, v1, v0

    if-nez v0, :cond_2

    .line 734
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->acquireAudioUrl()Ljava/lang/String;

    move-result-object v3

    .line 735
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->saveIsPlay(Z)V

    .line 736
    invoke-direct {p0, v3}, Lo/bxa;->a(Ljava/lang/String;)V

    .line 737
    goto :goto_0

    .line 738
    :cond_0
    const-string v0, "m"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 739
    int-to-float v0, p2

    cmpl-float v0, v1, v0

    if-lez v0, :cond_2

    .line 740
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->acquireAudioUrl()Ljava/lang/String;

    move-result-object v3

    .line 741
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->saveIsPlay(Z)V

    .line 742
    invoke-direct {p0, v3}, Lo/bxa;->a(Ljava/lang/String;)V

    .line 743
    goto :goto_0

    .line 745
    :cond_1
    const-string v0, "p"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 746
    int-to-float v0, p2

    cmpg-float v0, v1, v0

    if-gez v0, :cond_2

    .line 747
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->acquireAudioUrl()Ljava/lang/String;

    move-result-object v3

    .line 748
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->saveIsPlay(Z)V

    .line 749
    invoke-direct {p0, v3}, Lo/bxa;->a(Ljava/lang/String;)V

    .line 752
    :cond_2
    :goto_0
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 5

    .line 781
    invoke-static {p1}, Lo/bzi;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 782
    const-string v0, "FitRunManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastSpeakAside  audioUrl = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ",   audiosFilePath = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 783
    invoke-direct {p0, v4}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 784
    return-void
.end method

.method private a(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V
    .locals 9

    .line 968
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireAbsoluteHeartRateL()Ljava/lang/String;

    move-result-object v4

    .line 969
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireAbsoluteHeartRateH()Ljava/lang/String;

    move-result-object v5

    .line 970
    const/4 v6, 0x0

    .line 971
    const/4 v7, 0x0

    .line 973
    :try_start_0
    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    .line 974
    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v7

    .line 979
    goto :goto_0

    .line 976
    :catch_0
    move-exception v8

    .line 977
    const-string v0, "FitRunManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cloud config error "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 978
    return-void

    .line 980
    :goto_0
    iget-object v0, p0, Lo/bxa;->i:Lo/cai;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 981
    new-instance v0, Lo/cai;

    invoke-static {}, Lo/cai;->d()[I

    move-result-object v1

    invoke-direct {v0, v6, v7, v1}, Lo/cai;-><init>(FF[I)V

    iput-object v0, p0, Lo/bxa;->i:Lo/cai;

    goto :goto_1

    .line 983
    :cond_0
    if-eqz p1, :cond_1

    .line 984
    iget-object v0, p0, Lo/bxa;->i:Lo/cai;

    invoke-static {}, Lo/cai;->d()[I

    move-result-object v1

    invoke-virtual {v0, v6, v7, v1}, Lo/cai;->d(FF[I)V

    .line 987
    :cond_1
    :goto_1
    invoke-direct {p0, p3}, Lo/bxa;->c(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 988
    iget-object v0, p0, Lo/bxa;->i:Lo/cai;

    int-to-float v1, p3

    invoke-virtual {v0, v1}, Lo/cai;->b(F)V

    .line 989
    iget-object v0, p0, Lo/bxa;->i:Lo/cai;

    int-to-float v1, p3

    invoke-virtual {v0, v1}, Lo/cai;->b(F)V

    goto :goto_2

    .line 991
    :cond_2
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideAbsolute()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "isValidHeartRate() = false"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 994
    :goto_2
    iget-object v0, p0, Lo/bxa;->i:Lo/cai;

    invoke-virtual {v0}, Lo/cai;->e()I

    move-result v8

    .line 995
    packed-switch v8, :pswitch_data_0

    goto/16 :goto_3

    .line 998
    :pswitch_0
    const-string v0, "FitRunManager"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideAbsolute"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " H "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " L "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " v "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 999
    invoke-direct {p0}, Lo/bxa;->f()V

    .line 1000
    goto :goto_3

    .line 1003
    :pswitch_1
    const-string v0, "FitRunManager"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideAbsolute"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " H "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " L "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " v "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1004
    invoke-direct {p0}, Lo/bxa;->h()V

    .line 1005
    goto :goto_3

    .line 1009
    :pswitch_2
    nop

    .line 1013
    .line 1017
    :goto_3
    :pswitch_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private b(Lcom/huawei/health/suggestion/model/Summary;)Lcom/huawei/health/suggestion/model/WorkoutRecord;
    .locals 8

    .line 288
    new-instance v4, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;-><init>()V

    .line 289
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireDistance()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActualDistance(F)V

    .line 290
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireCalorie()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActualCalorie(F)V

    .line 291
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireDuring()I

    move-result v0

    invoke-static {v0}, Lo/bzr;->e(I)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveDuring(I)V

    .line 292
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireExerciseTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 293
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireSportId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveTrajectoryId(Ljava/lang/String;)V

    .line 294
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireCalorie()F

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveCalorie(F)V

    .line 295
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveRecordType(I)V

    .line 296
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireSportId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExtendRunWorkout(Ljava/lang/String;)V

    .line 298
    iget-object v0, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    if-nez v0, :cond_0

    .line 299
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4fdd\u5b58\u8bb0\u5f55\u5931\u8d25\uff0crunWorkout\u4e3anull"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    const/4 v0, 0x0

    return-object v0

    .line 303
    :cond_0
    iget-object v0, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireMeasurementType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 304
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireDuring()I

    move-result v0

    int-to-float v0, v0

    iget-object v1, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDuration()I

    move-result v1

    invoke-static {v0, v1}, Lo/bya;->d(FI)F

    move-result v5

    .line 305
    invoke-virtual {v4, v5}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveFinishRate(F)V

    .line 306
    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireMeasurementType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 307
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireDistance()F

    move-result v0

    iget-object v1, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDistance()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-static {v0, v1}, Lo/bya;->d(FI)F

    move-result v5

    .line 308
    invoke-virtual {v4, v5}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveFinishRate(F)V

    .line 310
    :cond_2
    :goto_0
    iget-object v0, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireDistance()D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveDistance(F)V

    .line 311
    iget-object v0, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutId(Ljava/lang/String;)V

    .line 312
    iget-object v0, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutName(Ljava/lang/String;)V

    .line 313
    iget-object v0, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveVersion(Ljava/lang/String;)V

    .line 314
    invoke-virtual {p0}, Lo/bxa;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/bxa;->a(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v5

    .line 315
    iget v0, p0, Lo/bxa;->d:I

    iget v1, p0, Lo/bxa;->b:I

    invoke-virtual {p0, v5, v0, v1}, Lo/bxa;->d(Ljava/util/ArrayList;II)Ljava/util/ArrayList;

    move-result-object v6

    .line 316
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v6}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 317
    invoke-virtual {v4, v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActionSummary(Ljava/lang/String;)V

    .line 319
    return-object v4
.end method

.method private b(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)Ljava/lang/String;
    .locals 5

    .line 657
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getActionId()Ljava/lang/String;

    move-result-object v4

    .line 658
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getActionID  actionId = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 659
    return-object v4
.end method

.method private b(Ljava/lang/Object;)V
    .locals 4

    .line 848
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 849
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "playSound null == sound"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 850
    return-void

    .line 852
    :cond_0
    iget-object v0, p0, Lo/bxa;->t:Lo/brv;

    if-eqz v0, :cond_4

    .line 853
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 854
    iget-object v0, p0, Lo/bxa;->t:Lo/brv;

    move-object v1, p1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/brv;->a(ILjava/lang/String;)V

    goto :goto_0

    .line 855
    :cond_1
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 856
    iget-object v0, p0, Lo/bxa;->t:Lo/brv;

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/brv;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 857
    :cond_2
    instance-of v0, p1, [I

    if-eqz v0, :cond_3

    .line 858
    iget-object v0, p0, Lo/bxa;->t:Lo/brv;

    move-object v1, p1

    check-cast v1, [I

    check-cast v1, [I

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/brv;->c([ILjava/lang/String;)V

    goto :goto_0

    .line 859
    :cond_3
    instance-of v0, p1, [Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 860
    iget-object v0, p0, Lo/bxa;->t:Lo/brv;

    move-object v1, p1

    check-cast v1, [Ljava/lang/String;

    check-cast v1, [Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/brv;->e([Ljava/lang/String;Ljava/lang/String;)V

    .line 863
    :cond_4
    :goto_0
    return-void
.end method

.method private b(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V
    .locals 9

    .line 1106
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideRelative"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1109
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireRelativeHeartRatePercentL()I

    move-result v4

    .line 1110
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireRelativeHeartRatePercentH()I

    move-result v5

    .line 1112
    iget v0, p0, Lo/bxa;->w:I

    mul-int/2addr v0, v4

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float v6, v0, v1

    .line 1113
    iget v0, p0, Lo/bxa;->w:I

    mul-int/2addr v0, v5

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float v7, v0, v1

    .line 1115
    iget-object v0, p0, Lo/bxa;->g:Lo/cai;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1116
    new-instance v0, Lo/cai;

    invoke-static {}, Lo/cai;->d()[I

    move-result-object v1

    invoke-direct {v0, v6, v7, v1}, Lo/cai;-><init>(FF[I)V

    iput-object v0, p0, Lo/bxa;->g:Lo/cai;

    goto :goto_0

    .line 1118
    :cond_0
    if-eqz p1, :cond_1

    .line 1119
    iget-object v0, p0, Lo/bxa;->g:Lo/cai;

    invoke-static {}, Lo/cai;->d()[I

    move-result-object v1

    invoke-virtual {v0, v6, v7, v1}, Lo/cai;->d(FF[I)V

    .line 1122
    :cond_1
    :goto_0
    invoke-direct {p0, p3}, Lo/bxa;->c(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1123
    iget-object v0, p0, Lo/bxa;->g:Lo/cai;

    int-to-float v1, p3

    invoke-virtual {v0, v1}, Lo/cai;->b(F)V

    goto :goto_1

    .line 1125
    :cond_2
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideRelative()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "isValidHeartRate() = false"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1128
    :goto_1
    iget-object v0, p0, Lo/bxa;->g:Lo/cai;

    invoke-virtual {v0}, Lo/cai;->e()I

    move-result v8

    .line 1129
    packed-switch v8, :pswitch_data_0

    goto/16 :goto_2

    .line 1132
    :pswitch_0
    const-string v0, "FitRunManager"

    const/16 v1, 0xb

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideRelative"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " H "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " L "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const-string v2, " v "

    const/16 v3, 0x9

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1133
    invoke-direct {p0}, Lo/bxa;->l()V

    .line 1134
    goto :goto_2

    .line 1137
    :pswitch_1
    const-string v0, "FitRunManager"

    const/16 v1, 0xb

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideRelative"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " H "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " L "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const-string v2, " v "

    const/16 v3, 0x9

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1138
    invoke-direct {p0}, Lo/bxa;->n()V

    .line 1139
    goto :goto_2

    .line 1142
    :pswitch_2
    invoke-direct {p0}, Lo/bxa;->p()V

    .line 1143
    goto :goto_2

    .line 1146
    :pswitch_3
    invoke-direct {p0}, Lo/bxa;->o()V

    .line 1147
    .line 1151
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private c()V
    .locals 4

    .line 152
    iget-object v0, p0, Lo/bxa;->z:Lo/bzn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 154
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->Q(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 155
    iget-object v0, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    if-eqz v0, :cond_0

    .line 156
    new-instance v0, Lo/bzn;

    const-string v1, "F"

    iget-object v2, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireComeFrom(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ".mp3"

    invoke-direct {v0, v1, v2, v3}, Lo/bzn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/bxa;->z:Lo/bzn;

    goto :goto_0

    .line 158
    :cond_0
    new-instance v0, Lo/bzn;

    const-string v1, "F"

    const-string v2, ""

    const-string v3, ".mp3"

    invoke-direct {v0, v1, v2, v3}, Lo/bzn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/bxa;->z:Lo/bzn;

    goto :goto_0

    .line 161
    :cond_1
    iget-object v0, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    if-eqz v0, :cond_2

    .line 162
    new-instance v0, Lo/bzn;

    const-string v1, "M"

    iget-object v2, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireComeFrom(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ".mp3"

    invoke-direct {v0, v1, v2, v3}, Lo/bzn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/bxa;->z:Lo/bzn;

    goto :goto_0

    .line 164
    :cond_2
    new-instance v0, Lo/bzn;

    const-string v1, "M"

    const-string v2, ""

    const-string v3, ".mp3"

    invoke-direct {v0, v1, v2, v3}, Lo/bzn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lo/bxa;->z:Lo/bzn;

    .line 168
    :cond_3
    :goto_0
    return-void
.end method

.method private c(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)V
    .locals 7

    .line 634
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changeLastAction  workoutAction = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 635
    invoke-direct {p0, p1}, Lo/bxa;->a(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)Ljava/lang/String;

    move-result-object v4

    .line 636
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v5

    .line 637
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementType()I

    move-result v6

    .line 639
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0, v4, v5, v6}, Lo/bzo;->a(Ljava/lang/String;II)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 640
    return-void
.end method

.method private c(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;II)V
    .locals 0

    .line 674
    iput p3, p0, Lo/bxa;->b:I

    .line 675
    return-void
.end method

.method private c(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V
    .locals 9

    .line 1333
    iget-object v0, p0, Lo/bxa;->D:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1334
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideReserveInterval null == mHeartRateZone"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1335
    return-void

    .line 1338
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireReserveHeartRateRangeL()I

    move-result v4

    .line 1339
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireReserveHeartRateRangeH()I

    move-result v5

    .line 1341
    iget-object v0, p0, Lo/bxa;->y:Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;

    const/4 v1, 0x1

    invoke-virtual {v0, v4, v1}, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->handleBits(IZ)I

    move-result v0

    int-to-float v6, v0

    .line 1342
    iget-object v0, p0, Lo/bxa;->y:Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->handleBits(IZ)I

    move-result v0

    int-to-float v7, v0

    .line 1344
    iget-object v0, p0, Lo/bxa;->n:Lo/cai;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1345
    new-instance v0, Lo/cai;

    invoke-static {}, Lo/cai;->d()[I

    move-result-object v1

    invoke-direct {v0, v6, v7, v1}, Lo/cai;-><init>(FF[I)V

    iput-object v0, p0, Lo/bxa;->n:Lo/cai;

    goto :goto_0

    .line 1347
    :cond_1
    if-eqz p1, :cond_2

    .line 1348
    iget-object v0, p0, Lo/bxa;->n:Lo/cai;

    invoke-static {}, Lo/cai;->d()[I

    move-result-object v1

    invoke-virtual {v0, v6, v7, v1}, Lo/cai;->d(FF[I)V

    .line 1351
    :cond_2
    :goto_0
    invoke-direct {p0, p3}, Lo/bxa;->c(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1352
    iget-object v0, p0, Lo/bxa;->n:Lo/cai;

    int-to-float v1, p3

    invoke-virtual {v0, v1}, Lo/cai;->b(F)V

    goto :goto_1

    .line 1354
    :cond_3
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideReserveInterval()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "isValidHeartRate() = false"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1357
    :goto_1
    iget-object v0, p0, Lo/bxa;->n:Lo/cai;

    invoke-virtual {v0}, Lo/cai;->e()I

    move-result v8

    .line 1358
    packed-switch v8, :pswitch_data_0

    goto/16 :goto_2

    .line 1361
    :pswitch_0
    const-string v0, "FitRunManager"

    const/16 v1, 0xb

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideReserveInterval"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " H "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " L "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " v "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-string v2, " zones "

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const-string v2, " "

    const/16 v3, 0x9

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1362
    invoke-direct {p0}, Lo/bxa;->B()V

    .line 1363
    goto :goto_2

    .line 1366
    :pswitch_1
    const-string v0, "FitRunManager"

    const/16 v1, 0xb

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideReserveInterval"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " H "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " L "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " v "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-string v2, " zones "

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const-string v2, " "

    const/16 v3, 0x9

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1367
    invoke-direct {p0}, Lo/bxa;->y()V

    .line 1368
    goto :goto_2

    .line 1371
    :pswitch_2
    invoke-direct {p0}, Lo/bxa;->v()V

    .line 1372
    goto :goto_2

    .line 1375
    :pswitch_3
    invoke-direct {p0}, Lo/bxa;->w()V

    .line 1376
    .line 1380
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private c(I)Z
    .locals 1

    .line 787
    const/16 v0, 0x1e

    if-ge p1, v0, :cond_0

    .line 788
    const/4 v0, 0x0

    return v0

    .line 789
    :cond_0
    const/16 v0, 0x1e

    if-lt p1, v0, :cond_1

    const/16 v0, 0xf0

    if-gt p1, v0, :cond_1

    .line 790
    const/4 v0, 0x1

    return v0

    .line 792
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Z
    .locals 7

    .line 584
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 585
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == fitWorkout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 586
    const/4 v0, 0x0

    return v0

    .line 589
    :cond_0
    invoke-static {p0}, Lo/bxa;->a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/List;

    move-result-object v4

    .line 596
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 597
    invoke-virtual {v6}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireIntensityType()I

    move-result v0

    if-eqz v0, :cond_1

    .line 598
    const/4 v0, 0x1

    return v0

    .line 600
    :cond_1
    goto :goto_0

    .line 601
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private d()V
    .locals 5

    .line 119
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v4

    .line 120
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 121
    invoke-interface {v4}, Lo/brr;->e()Lo/brv;

    move-result-object v0

    iput-object v0, p0, Lo/bxa;->t:Lo/brv;

    .line 122
    iget-object v0, p0, Lo/bxa;->t:Lo/brv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 123
    iget-object v0, p0, Lo/bxa;->t:Lo/brv;

    invoke-interface {v0}, Lo/brv;->k()Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;

    move-result-object v0

    iput-object v0, p0, Lo/bxa;->y:Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;

    goto :goto_0

    .line 125
    :cond_0
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHeatRateZone null != mRunAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 128
    :cond_1
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initHeatRateZone null != instance"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    :goto_0
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->d()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v0

    iput-object v0, p0, Lo/bxa;->D:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    .line 131
    iget-object v0, p0, Lo/bxa;->D:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    if-nez v0, :cond_3

    .line 132
    iget-object v0, p0, Lo/bxa;->r:Lcom/huawei/health/suggestion/model/Userinfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 133
    iget-object v0, p0, Lo/bxa;->r:Lcom/huawei/health/suggestion/model/Userinfo;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Userinfo;->getAge()I

    move-result v0

    rsub-int v0, v0, 0xdc

    iput v0, p0, Lo/bxa;->w:I

    goto :goto_1

    .line 135
    :cond_2
    const/16 v0, 0xbe

    iput v0, p0, Lo/bxa;->w:I

    .line 137
    :goto_1
    const/16 v0, 0x3c

    iput v0, p0, Lo/bxa;->A:I

    .line 138
    iget v0, p0, Lo/bxa;->w:I

    iput v0, p0, Lo/bxa;->B:I

    goto :goto_2

    .line 141
    :cond_3
    iget-object v0, p0, Lo/bxa;->D:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getMaxThreshold()I

    move-result v0

    iput v0, p0, Lo/bxa;->w:I

    .line 142
    iget-object v0, p0, Lo/bxa;->D:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getRestHeartRate()I

    move-result v0

    iput v0, p0, Lo/bxa;->A:I

    .line 143
    iget-object v0, p0, Lo/bxa;->D:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getHRRMaxThreshold()I

    move-result v0

    iput v0, p0, Lo/bxa;->B:I

    .line 144
    iget v0, p0, Lo/bxa;->A:I

    if-nez v0, :cond_4

    .line 145
    const/16 v0, 0x3c

    iput v0, p0, Lo/bxa;->A:I

    .line 148
    :cond_4
    :goto_2
    const-string v0, "FitRunManager"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "max "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/bxa;->w:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " rest "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/bxa;->A:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " reserve "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lo/bxa;->B:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    return-void
.end method

.method private d(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 3

    .line 105
    iput-object p1, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 106
    iget-object v0, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-static {v0}, Lo/bxa;->a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/bxa;->v:Ljava/util/List;

    .line 107
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->g()Lcom/huawei/health/suggestion/model/Userinfo;

    move-result-object v0

    iput-object v0, p0, Lo/bxa;->r:Lcom/huawei/health/suggestion/model/Userinfo;

    .line 108
    new-instance v0, Lo/cab;

    const-wide/16 v1, 0x708

    invoke-direct {v0, v1, v2}, Lo/cab;-><init>(J)V

    iput-object v0, p0, Lo/bxa;->o:Lo/cab;

    .line 109
    invoke-direct {p0}, Lo/bxa;->i()V

    .line 110
    invoke-direct {p0}, Lo/bxa;->c()V

    .line 111
    invoke-direct {p0}, Lo/bxa;->d()V

    .line 112
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bxa;->l:Z

    .line 113
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/bxa;->m:J

    .line 114
    new-instance v0, Lo/cab;

    const-wide/16 v1, 0x4e20

    invoke-direct {v0, v1, v2}, Lo/cab;-><init>(J)V

    iput-object v0, p0, Lo/bxa;->p:Lo/cab;

    .line 115
    iget-object v0, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-static {v0}, Lo/bxa;->c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Z

    move-result v0

    iput-boolean v0, p0, Lo/bxa;->x:Z

    .line 116
    return-void
.end method

.method private d(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;II)V
    .locals 4

    .line 605
    const-string v0, "FitRunManager"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "change index = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "  workoutAction = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p1, v1, v2

    const-string v2, "  size="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 608
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 610
    invoke-direct {p0, p1}, Lo/bxa;->f(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)V

    goto :goto_0

    .line 611
    :cond_0
    add-int/lit8 v0, p3, -0x1

    if-ne p2, v0, :cond_1

    .line 613
    invoke-direct {p0, p1}, Lo/bxa;->c(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)V

    goto :goto_0

    .line 614
    :cond_1
    if-ge p2, p3, :cond_2

    .line 616
    invoke-direct {p0, p1}, Lo/bxa;->e(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)V

    .line 618
    :cond_2
    :goto_0
    return-void
.end method

.method private d(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;F)V
    .locals 7

    .line 1184
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideSpeed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1186
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireSpeedL()F

    move-result v4

    .line 1187
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireSpeedH()F

    move-result v5

    .line 1188
    iget-object v0, p0, Lo/bxa;->c:Lo/cai;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1189
    new-instance v0, Lo/cai;

    invoke-static {}, Lo/cai;->a()[I

    move-result-object v1

    invoke-direct {v0, v4, v5, v1}, Lo/cai;-><init>(FF[I)V

    iput-object v0, p0, Lo/bxa;->c:Lo/cai;

    goto :goto_0

    .line 1191
    :cond_0
    if-eqz p1, :cond_1

    .line 1192
    iget-object v0, p0, Lo/bxa;->c:Lo/cai;

    invoke-static {}, Lo/cai;->a()[I

    move-result-object v1

    invoke-virtual {v0, v4, v5, v1}, Lo/cai;->d(FF[I)V

    .line 1196
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/bxa;->c:Lo/cai;

    invoke-virtual {v0, p3}, Lo/cai;->b(F)V

    .line 1198
    iget-object v0, p0, Lo/bxa;->c:Lo/cai;

    invoke-virtual {v0}, Lo/cai;->e()I

    move-result v6

    .line 1199
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_1

    .line 1201
    :pswitch_0
    const-string v0, "FitRunManager"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideSpeed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " H "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " L "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " v "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1202
    invoke-direct {p0}, Lo/bxa;->u()V

    .line 1203
    goto :goto_1

    .line 1206
    :pswitch_1
    const-string v0, "FitRunManager"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideSpeed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " H "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " L "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " v "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1207
    invoke-direct {p0}, Lo/bxa;->r()V

    .line 1208
    goto :goto_1

    .line 1211
    :pswitch_2
    invoke-direct {p0}, Lo/bxa;->s()V

    .line 1212
    goto :goto_1

    .line 1215
    :pswitch_3
    invoke-direct {p0}, Lo/bxa;->m()V

    .line 1216
    .line 1220
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private d(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V
    .locals 9

    .line 1053
    iget-object v0, p0, Lo/bxa;->y:Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1054
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideRelativeInterval null == mHeartRateZone"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1055
    return-void

    .line 1058
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireRelativeHeartRateRangeL()I

    move-result v4

    .line 1059
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireRelativeHeartRateRangeH()I

    move-result v5

    .line 1060
    iget-object v0, p0, Lo/bxa;->y:Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;

    const/4 v1, 0x1

    invoke-virtual {v0, v4, v1}, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->handleBits(IZ)I

    move-result v0

    int-to-float v6, v0

    .line 1061
    iget-object v0, p0, Lo/bxa;->y:Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->handleBits(IZ)I

    move-result v0

    int-to-float v7, v0

    .line 1063
    iget-object v0, p0, Lo/bxa;->h:Lo/cai;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1064
    new-instance v0, Lo/cai;

    invoke-static {}, Lo/cai;->d()[I

    move-result-object v1

    invoke-direct {v0, v6, v7, v1}, Lo/cai;-><init>(FF[I)V

    iput-object v0, p0, Lo/bxa;->h:Lo/cai;

    goto :goto_0

    .line 1066
    :cond_1
    if-eqz p1, :cond_2

    .line 1067
    iget-object v0, p0, Lo/bxa;->h:Lo/cai;

    invoke-static {}, Lo/cai;->d()[I

    move-result-object v1

    invoke-virtual {v0, v6, v7, v1}, Lo/cai;->d(FF[I)V

    .line 1070
    :cond_2
    :goto_0
    invoke-direct {p0, p3}, Lo/bxa;->c(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1071
    iget-object v0, p0, Lo/bxa;->h:Lo/cai;

    int-to-float v1, p3

    invoke-virtual {v0, v1}, Lo/cai;->b(F)V

    goto :goto_1

    .line 1073
    :cond_3
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideRelativeInterval()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "isValidHeartRate() = false"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1076
    :goto_1
    iget-object v0, p0, Lo/bxa;->h:Lo/cai;

    invoke-virtual {v0}, Lo/cai;->e()I

    move-result v8

    .line 1077
    packed-switch v8, :pswitch_data_0

    goto/16 :goto_2

    .line 1080
    :pswitch_0
    const-string v0, "FitRunManager"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideRelativeInterval"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " H "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " L "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " v "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1081
    invoke-direct {p0}, Lo/bxa;->f()V

    .line 1082
    goto :goto_2

    .line 1085
    :pswitch_1
    const-string v0, "FitRunManager"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideRelativeInterval"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " H "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " L "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " v "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1086
    invoke-direct {p0}, Lo/bxa;->h()V

    .line 1087
    goto :goto_2

    .line 1091
    :pswitch_2
    nop

    .line 1095
    .line 1099
    :goto_2
    :pswitch_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private e(F)F
    .locals 2

    .line 1460
    iget v0, p0, Lo/bxa;->B:I

    iget v1, p0, Lo/bxa;->A:I

    sub-int/2addr v0, v1

    int-to-float v0, v0

    mul-float/2addr v0, p1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    iget v1, p0, Lo/bxa;->A:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    return v0
.end method

.method private static e(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/FitRunPlayAudio;
    .locals 7

    .line 694
    new-instance v4, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;

    invoke-direct {v4}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;-><init>()V

    .line 695
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    .line 696
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "playValue.length() < 3 \u6570\u636e\u957f\u5ea6\u4e0d\u80fd\u5c0f\u4e8e3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 697
    return-object v4

    .line 699
    :cond_0
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    .line 701
    :try_start_0
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 702
    int-to-float v0, v6

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->savePlayValue(F)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 706
    goto :goto_0

    .line 703
    :catch_0
    move-exception v6

    .line 704
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runCourseMediaListInfo parse exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 705
    return-object v4

    .line 707
    :goto_0
    const/4 v0, 0x1

    const/4 v1, 0x2

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->saveOpportunity(Ljava/lang/String;)V

    .line 708
    return-object v4
.end method

.method private e(J)V
    .locals 5

    .line 560
    iget-boolean v0, p0, Lo/bxa;->x:Z

    if-nez v0, :cond_0

    .line 561
    return-void

    .line 564
    :cond_0
    iget-object v0, p0, Lo/bxa;->p:Lo/cab;

    invoke-virtual {v0, p1, p2}, Lo/cab;->e(J)V

    .line 565
    iget-object v0, p0, Lo/bxa;->p:Lo/cab;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/cab;->c(J)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 566
    iget-boolean v0, p0, Lo/bxa;->l:Z

    if-nez v0, :cond_1

    .line 568
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " heartRateDevice HeartRateDeviceError"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0}, Lo/bzo;->h()Ljava/lang/Object;

    move-result-object v4

    .line 570
    invoke-direct {p0, v4}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 572
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/bxa;->l:Z

    goto :goto_0

    .line 574
    :cond_2
    iget-boolean v0, p0, Lo/bxa;->l:Z

    if-eqz v0, :cond_3

    .line 575
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " heartRateDevice getHeartRateDeviceConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 576
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0}, Lo/bzo;->f()Ljava/lang/Object;

    move-result-object v4

    .line 577
    invoke-direct {p0, v4}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 579
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bxa;->l:Z

    .line 581
    :goto_0
    return-void
.end method

.method private e(Lcom/huawei/health/suggestion/model/FitRunPlayAudio;F)V
    .locals 4

    .line 755
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->acquirePlayValue()F

    move-result v1

    .line 757
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->acquireOpportunity()Ljava/lang/String;

    move-result-object v2

    .line 758
    const-string v0, "e"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 759
    cmpl-float v0, v1, p2

    if-nez v0, :cond_2

    .line 760
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->acquireAudioUrl()Ljava/lang/String;

    move-result-object v3

    .line 761
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->saveIsPlay(Z)V

    .line 762
    invoke-direct {p0, v3}, Lo/bxa;->a(Ljava/lang/String;)V

    .line 763
    goto :goto_0

    .line 764
    :cond_0
    const-string v0, "m"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 765
    cmpl-float v0, v1, p2

    if-lez v0, :cond_2

    .line 766
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->acquireAudioUrl()Ljava/lang/String;

    move-result-object v3

    .line 767
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->saveIsPlay(Z)V

    .line 768
    invoke-direct {p0, v3}, Lo/bxa;->a(Ljava/lang/String;)V

    .line 769
    goto :goto_0

    .line 771
    :cond_1
    const-string v0, "p"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 772
    cmpg-float v0, v1, p2

    if-gez v0, :cond_2

    .line 773
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->acquireAudioUrl()Ljava/lang/String;

    move-result-object v3

    .line 774
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->saveIsPlay(Z)V

    .line 775
    invoke-direct {p0, v3}, Lo/bxa;->a(Ljava/lang/String;)V

    .line 778
    :cond_2
    :goto_0
    return-void
.end method

.method private e(Lcom/huawei/health/suggestion/model/FitRunPlayAudio;IIIF)V
    .locals 5

    .line 712
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "speakAside fitRunPlayAudio="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 713
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->acquireIsPlay()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 714
    return-void

    .line 716
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->acquirePlayType()Ljava/lang/String;

    move-result-object v4

    .line 717
    const-string v0, "d"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 718
    invoke-direct {p0, p1, p2}, Lo/bxa;->a(Lcom/huawei/health/suggestion/model/FitRunPlayAudio;I)V

    goto :goto_0

    .line 719
    :cond_1
    const-string v0, "h"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 720
    invoke-direct {p0, p1, p4}, Lo/bxa;->a(Lcom/huawei/health/suggestion/model/FitRunPlayAudio;I)V

    goto :goto_0

    .line 721
    :cond_2
    const-string v0, "t"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 722
    invoke-direct {p0, p1, p3}, Lo/bxa;->a(Lcom/huawei/health/suggestion/model/FitRunPlayAudio;I)V

    goto :goto_0

    .line 723
    :cond_3
    const-string v0, "v"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 724
    invoke-direct {p0, p1, p5}, Lo/bxa;->e(Lcom/huawei/health/suggestion/model/FitRunPlayAudio;F)V

    .line 726
    :cond_4
    :goto_0
    return-void
.end method

.method private e(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 2

    .line 329
    invoke-static {}, Lo/bzs;->a()Lo/bzs;

    move-result-object v0

    new-instance v1, Lo/bxa$4;

    invoke-direct {v1, p0, p1}, Lo/bxa$4;-><init>(Lo/bxa;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    invoke-virtual {v0, v1}, Lo/bzs;->c(Ljava/lang/Runnable;)V

    .line 337
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, p1}, Lo/bsp;->a(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 338
    return-void
.end method

.method private e(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)V
    .locals 7

    .line 623
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changeNextAction  workoutAction = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 624
    invoke-direct {p0, p1}, Lo/bxa;->a(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)Ljava/lang/String;

    move-result-object v4

    .line 625
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v5

    .line 626
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementType()I

    move-result v6

    .line 628
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0, v4, v5, v6}, Lo/bzo;->b(Ljava/lang/String;II)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 629
    return-void
.end method

.method private e(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;FI)V
    .locals 5

    .line 910
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guide"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 911
    if-nez p2, :cond_0

    .line 912
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guide workoutAction is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 913
    return-void

    .line 915
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireIntensityType()I

    move-result v4

    .line 916
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_0

    .line 918
    :pswitch_0
    invoke-direct {p0, p1, p2, p3}, Lo/bxa;->d(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;F)V

    .line 919
    goto :goto_0

    .line 921
    :pswitch_1
    invoke-direct {p0, p1, p2, p3}, Lo/bxa;->d(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;F)V

    .line 922
    invoke-direct {p0, p1, p2, p4}, Lo/bxa;->b(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V

    .line 923
    goto :goto_0

    .line 925
    :pswitch_2
    invoke-direct {p0, p1, p2, p4}, Lo/bxa;->b(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V

    .line 926
    goto :goto_0

    .line 928
    :pswitch_3
    invoke-direct {p0, p1, p2, p4}, Lo/bxa;->a(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V

    .line 929
    goto :goto_0

    .line 931
    :pswitch_4
    invoke-direct {p0, p1, p2, p4}, Lo/bxa;->d(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V

    .line 932
    goto :goto_0

    .line 934
    :pswitch_5
    invoke-direct {p0, p1, p2, p3}, Lo/bxa;->d(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;F)V

    .line 935
    invoke-direct {p0, p1, p2, p4}, Lo/bxa;->a(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V

    .line 936
    goto :goto_0

    .line 938
    :pswitch_6
    invoke-direct {p0, p1, p2, p4}, Lo/bxa;->d(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V

    .line 939
    invoke-direct {p0, p1, p2, p3}, Lo/bxa;->d(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;F)V

    .line 940
    goto :goto_0

    .line 942
    :pswitch_7
    invoke-direct {p0, p1, p2, p4}, Lo/bxa;->e(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V

    .line 943
    goto :goto_0

    .line 945
    :pswitch_8
    invoke-direct {p0, p1, p2, p4}, Lo/bxa;->c(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V

    .line 946
    goto :goto_0

    .line 948
    :pswitch_9
    invoke-direct {p0, p1, p2, p4}, Lo/bxa;->g(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V

    .line 949
    .line 954
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method

.method private e(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V
    .locals 9

    .line 1256
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMAF180HeartRateBase()I

    move-result v4

    .line 1257
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMAF180HeartRateRange()I

    move-result v5

    .line 1258
    sub-int v0, v4, v5

    iget-object v1, p0, Lo/bxa;->r:Lcom/huawei/health/suggestion/model/Userinfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Userinfo;->getAge()I

    move-result v1

    sub-int v6, v0, v1

    .line 1259
    add-int v0, v4, v5

    iget-object v1, p0, Lo/bxa;->r:Lcom/huawei/health/suggestion/model/Userinfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Userinfo;->getAge()I

    move-result v1

    sub-int v7, v0, v1

    .line 1261
    iget-object v0, p0, Lo/bxa;->k:Lo/cai;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1262
    new-instance v0, Lo/cai;

    int-to-float v1, v6

    int-to-float v2, v7

    invoke-static {}, Lo/cai;->d()[I

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lo/cai;-><init>(FF[I)V

    iput-object v0, p0, Lo/bxa;->k:Lo/cai;

    goto :goto_0

    .line 1264
    :cond_0
    if-eqz p1, :cond_1

    .line 1265
    iget-object v0, p0, Lo/bxa;->k:Lo/cai;

    int-to-float v1, v6

    int-to-float v2, v7

    invoke-static {}, Lo/cai;->d()[I

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lo/cai;->d(FF[I)V

    .line 1268
    :cond_1
    :goto_0
    invoke-direct {p0, p3}, Lo/bxa;->c(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1269
    iget-object v0, p0, Lo/bxa;->k:Lo/cai;

    int-to-float v1, p3

    invoke-virtual {v0, v1}, Lo/cai;->b(F)V

    goto :goto_1

    .line 1271
    :cond_2
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideMAF180()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "isValidHeartRate() = false"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1274
    :goto_1
    iget-object v0, p0, Lo/bxa;->k:Lo/cai;

    invoke-virtual {v0}, Lo/cai;->e()I

    move-result v8

    .line 1275
    packed-switch v8, :pswitch_data_0

    goto/16 :goto_2

    .line 1278
    :pswitch_0
    const-string v0, "FitRunManager"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideMAF180"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " H "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " L "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " v "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1279
    invoke-direct {p0}, Lo/bxa;->z()V

    .line 1280
    goto :goto_2

    .line 1283
    :pswitch_1
    const-string v0, "FitRunManager"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideMAF180"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " H "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " L "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " v "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1284
    invoke-direct {p0}, Lo/bxa;->x()V

    .line 1285
    goto :goto_2

    .line 1288
    :pswitch_2
    invoke-direct {p0}, Lo/bxa;->t()V

    .line 1289
    goto :goto_2

    .line 1292
    :pswitch_3
    invoke-direct {p0}, Lo/bxa;->q()V

    .line 1293
    .line 1297
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private f()V
    .locals 4

    .line 1037
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastAbsoluteUpperLimit \u7edd\u5bf9\u5fc3\u7387\u5927\u4e8e\u4e0a\u9650\uff0c\u8bf7\u51cf\u901f\uff01"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1038
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0}, Lo/bzo;->i()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 1039
    return-void
.end method

.method private f(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)V
    .locals 7

    .line 665
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "changeFirstAction  workoutAction = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 666
    invoke-direct {p0, p1}, Lo/bxa;->a(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)Ljava/lang/String;

    move-result-object v4

    .line 667
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v5

    .line 668
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementType()I

    move-result v6

    .line 670
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0, v4, v5, v6}, Lo/bzo;->c(Ljava/lang/String;II)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 671
    return-void
.end method

.method private g()V
    .locals 1

    .line 205
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 206
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->r:Lcom/huawei/health/suggestion/model/Userinfo;

    .line 207
    const/4 v0, -0x1

    iput v0, p0, Lo/bxa;->d:I

    .line 208
    const/4 v0, 0x0

    iput v0, p0, Lo/bxa;->b:I

    .line 209
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->c:Lo/cai;

    .line 210
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->g:Lo/cai;

    .line 211
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->i:Lo/cai;

    .line 212
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->t:Lo/brv;

    .line 213
    iget-object v0, p0, Lo/bxa;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 214
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->o:Lo/cab;

    .line 215
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->z:Lo/bzn;

    .line 216
    const/4 v0, 0x0

    iput v0, p0, Lo/bxa;->a:I

    .line 217
    const/4 v0, 0x0

    iput v0, p0, Lo/bxa;->e:I

    .line 218
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->y:Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;

    .line 219
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bxa;->v:Ljava/util/List;

    .line 220
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bxa;->x:Z

    .line 221
    return-void
.end method

.method private g(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;I)V
    .locals 9

    .line 1416
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireReserveHeartRatePercentL()I

    move-result v4

    .line 1417
    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireReserveHeartRatePercentH()I

    move-result v5

    .line 1418
    int-to-float v0, v4

    invoke-direct {p0, v0}, Lo/bxa;->e(F)F

    move-result v6

    .line 1419
    int-to-float v0, v5

    invoke-direct {p0, v0}, Lo/bxa;->e(F)F

    move-result v7

    .line 1421
    iget-object v0, p0, Lo/bxa;->f:Lo/cai;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1422
    new-instance v0, Lo/cai;

    invoke-static {}, Lo/cai;->d()[I

    move-result-object v1

    invoke-direct {v0, v6, v7, v1}, Lo/cai;-><init>(FF[I)V

    iput-object v0, p0, Lo/bxa;->f:Lo/cai;

    goto :goto_0

    .line 1424
    :cond_0
    if-eqz p1, :cond_1

    .line 1425
    iget-object v0, p0, Lo/bxa;->f:Lo/cai;

    invoke-static {}, Lo/cai;->d()[I

    move-result-object v1

    invoke-virtual {v0, v6, v7, v1}, Lo/cai;->d(FF[I)V

    .line 1428
    :cond_1
    :goto_0
    invoke-direct {p0, p3}, Lo/bxa;->c(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1429
    iget-object v0, p0, Lo/bxa;->f:Lo/cai;

    int-to-float v1, p3

    invoke-virtual {v0, v1}, Lo/cai;->b(F)V

    goto :goto_1

    .line 1431
    :cond_2
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideReserve()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "isValidHeartRate() = false"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1434
    :goto_1
    iget-object v0, p0, Lo/bxa;->f:Lo/cai;

    invoke-virtual {v0}, Lo/cai;->e()I

    move-result v8

    .line 1435
    packed-switch v8, :pswitch_data_0

    goto/16 :goto_2

    .line 1438
    :pswitch_0
    const-string v0, "FitRunManager"

    const/16 v1, 0xb

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideReserve"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " H "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " L "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " v "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-string v2, " zones "

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const-string v2, " "

    const/16 v3, 0x9

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1439
    invoke-direct {p0}, Lo/bxa;->j()V

    .line 1440
    goto :goto_2

    .line 1443
    :pswitch_1
    const-string v0, "FitRunManager"

    const/16 v1, 0xb

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "guideReserve"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " H "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " L "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " v "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-string v2, " zones "

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    const-string v2, " "

    const/16 v3, 0x9

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1444
    invoke-direct {p0}, Lo/bxa;->D()V

    .line 1445
    goto :goto_2

    .line 1448
    :pswitch_2
    invoke-direct {p0}, Lo/bxa;->A()V

    .line 1449
    goto :goto_2

    .line 1452
    :pswitch_3
    invoke-direct {p0}, Lo/bxa;->C()V

    .line 1453
    .line 1457
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private h()V
    .locals 4

    .line 1031
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastAbsoluteLowerLimit \u7edd\u5bf9\u5fc3\u7387\u5c0f\u4e8e\u4e0b\u9650\uff0c\u8bf7\u52a0\u901f\uff01"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1032
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0}, Lo/bzo;->e()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 1033
    return-void
.end method

.method private i()V
    .locals 15

    .line 171
    iget-object v0, p0, Lo/bxa;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 172
    invoke-virtual {p0}, Lo/bxa;->e()Ljava/util/List;

    move-result-object v4

    .line 173
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 174
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSpeakAsideMap  null == workoutActions"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    return-void

    .line 177
    :cond_0
    const/4 v5, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 178
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 179
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 180
    invoke-virtual {v6}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getCommentaryTraining()Ljava/util/List;

    move-result-object v8

    .line 181
    const/4 v0, 0x0

    if-ne v0, v8, :cond_1

    .line 182
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initSpeakAsideMap  null == commentaryTraining"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    goto/16 :goto_2

    .line 185
    :cond_1
    const/4 v9, 0x0

    :goto_1
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_2

    .line 187
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Comment;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquirePlayType()Ljava/lang/String;

    move-result-object v10

    .line 188
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Comment;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquirePlayValue()Ljava/lang/String;

    move-result-object v11

    .line 189
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Comment;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquireName()Ljava/lang/String;

    move-result-object v12

    .line 190
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/Comment;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/Comment;->getId()Ljava/lang/String;

    move-result-object v13

    .line 193
    invoke-static {v11}, Lo/bxa;->e(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/FitRunPlayAudio;

    move-result-object v14

    .line 194
    invoke-virtual {v14, v13}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->saveAudioId(Ljava/lang/String;)V

    .line 195
    invoke-virtual {v14, v12}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->saveAudioUrl(Ljava/lang/String;)V

    .line 196
    invoke-virtual {v14, v10}, Lcom/huawei/health/suggestion/model/FitRunPlayAudio;->savePlayType(Ljava/lang/String;)V

    .line 198
    invoke-interface {v7, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 200
    :cond_2
    iget-object v0, p0, Lo/bxa;->q:Ljava/util/Map;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 202
    :cond_3
    return-void
.end method

.method private j()V
    .locals 4

    .line 1482
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastReserveHRUpperLimit \u5b58\u50a8\u5fc3\u7387\u8d85\u8fc7\u4e0a\u9650 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v2

    invoke-interface {v2}, Lo/bzo;->g()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1483
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0}, Lo/bzo;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 1484
    return-void
.end method

.method private k()V
    .locals 4

    .line 843
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "play remindDrink"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 844
    invoke-static {}, Lo/bzj;->b()Lo/bzj;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bzj;->b(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 845
    return-void
.end method

.method private l()V
    .locals 4

    .line 1171
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastRelativeUpperLimit \u76f8\u5bf9\u5fc3\u7387\u5927\u4e8e\u4e0a\u9650\uff0c\u8bf7\u51cf\u901f\uff01 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v2

    invoke-interface {v2}, Lo/bzo;->c()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1172
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0}, Lo/bzo;->c()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 1173
    return-void
.end method

.method private m()V
    .locals 4

    .line 1224
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastSpeedNo \u4e0d\u64ad\u62a5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1225
    return-void
.end method

.method private n()V
    .locals 4

    .line 1165
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastRelativeLowerLimit \u76f8\u5bf9\u5fc3\u7387\u5c0f\u4e8e\u4e0b\u9650\uff0c\u8bf7\u52a0\u901f\uff01 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v2

    invoke-interface {v2}, Lo/bzo;->b()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1166
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0}, Lo/bzo;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 1167
    return-void
.end method

.method private o()V
    .locals 4

    .line 1155
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastRelativeNo \u4e0d\u64ad\u62a5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1156
    return-void
.end method

.method private p()V
    .locals 4

    .line 1160
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastRelativeNormal \u76f8\u5bf9\u5fc3\u7387\u9002\u4e2d\uff0c\u7ee7\u7eed\u4fdd\u6301\uff01"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1161
    return-void
.end method

.method private q()V
    .locals 4

    .line 1301
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastMAF180No \u4e0d\u64ad\u62a5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1302
    return-void
.end method

.method private r()V
    .locals 4

    .line 1234
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastSpeedLowerLimit \u901f\u5ea6\u5c0f\u4e8e\u4e0b\u9650\uff0c\u8bf7\u52a0\u901f\uff01 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v2

    invoke-interface {v2}, Lo/bzo;->d()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1235
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0}, Lo/bzo;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 1236
    return-void
.end method

.method private s()V
    .locals 4

    .line 1229
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastSpeedNormal \u901f\u5ea6\u9002\u4e2d\uff0c\u7ee7\u7eed\u4fdd\u6301\uff01"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1230
    return-void
.end method

.method private t()V
    .locals 4

    .line 1306
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastMAF180Normal MAF180\u9002\u4e2d\uff0c\u7ee7\u7eed\u4fdd\u6301\uff01"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1307
    return-void
.end method

.method private u()V
    .locals 4

    .line 1240
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastSpeedUpperLimit \u901f\u5ea6\u5927\u4e8e\u4e0a\u9650\uff0c\u8bf7\u51cf\u901f\uff01 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v2

    invoke-interface {v2}, Lo/bzo;->a()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1241
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0}, Lo/bzo;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 1242
    return-void
.end method

.method private v()V
    .locals 4

    .line 1388
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastReserveIntervalNormal \u50a8\u5b58\u5fc3\u7387\u9002\u4e2d\uff0c\u7ee7\u7eed\u4fdd\u6301\uff01"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1389
    return-void
.end method

.method private w()V
    .locals 4

    .line 1383
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastReserveIntervalNo \u4e0d\u64ad\u62a5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1384
    return-void
.end method

.method private x()V
    .locals 4

    .line 1311
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastMAF180LowerLimit MAF180\u5fc3\u7387\u5c0f\u4e8e\u4e0b\u9650\uff0c\u8bf7\u52a0\u901f\uff01 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v2

    invoke-interface {v2}, Lo/bzo;->m()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1312
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0}, Lo/bzo;->m()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 1313
    return-void
.end method

.method private y()V
    .locals 4

    .line 1393
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastReserveIntervalLowerLimit \u50a8\u5b58\u5fc3\u7387\u5c0f\u4e8e\u4e0b\u9650\uff0c\u8bf7\u52a0\u901f\uff01 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v2

    invoke-interface {v2}, Lo/bzo;->m()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1394
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0}, Lo/bzo;->p()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 1395
    return-void
.end method

.method private z()V
    .locals 4

    .line 1317
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastMAF180pperLimit  MAF180\u5fc3\u7387\u5927\u4e8e\u4e0a\u9650\uff0c\u8bf7\u51cf\u901f\uff01 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v2

    invoke-interface {v2}, Lo/bzo;->m()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1318
    invoke-virtual {p0}, Lo/bxa;->b()Lo/bzo;

    move-result-object v0

    invoke-interface {v0}, Lo/bzo;->o()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/bxa;->b(Ljava/lang/Object;)V

    .line 1319
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/WorkoutAction;>;)Ljava/util/ArrayList<Lcom/huawei/health/suggestion/model/RecordAction;>;"
        }
    .end annotation

    .line 821
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 822
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 823
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 824
    invoke-virtual {p0, v3}, Lo/bxa;->d(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)Lcom/huawei/health/suggestion/model/RecordAction;

    move-result-object v4

    .line 825
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 822
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 827
    :cond_0
    return-object v1
.end method

.method public a(Lcom/huawei/health/suggestion/model/Summary;)V
    .locals 8

    .line 257
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 260
    invoke-direct {p0, p1}, Lo/bxa;->b(Lcom/huawei/health/suggestion/model/Summary;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v4

    .line 261
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualDistance()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3fb999999999999aL    # 0.1

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    .line 262
    invoke-direct {p0, v4}, Lo/bxa;->e(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    goto :goto_0

    .line 264
    :cond_0
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutRecord != null && workoutRecord.acquireActualDistance() > 0.1  =  false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    :goto_0
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 267
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 269
    :try_start_0
    invoke-static {}, Lo/bzm;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 270
    const-string v0, "start_time"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquiretStartTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/bzm;->e(J)J

    move-result-wide v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 271
    const-string v0, "end_time"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireEndTime()J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/bzm;->e(J)J

    move-result-wide v1

    invoke-virtual {v6, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 272
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 273
    const-string v0, "finish_rate"

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireFinishRate()F

    move-result v1

    invoke-static {v1}, Lo/bzm;->e(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 276
    :cond_1
    const-string v0, "workout_name"

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Summary;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 277
    const-string v0, "data"

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    const-string v0, "1120005"

    invoke-static {v0, v5}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 281
    goto :goto_1

    .line 279
    :catch_0
    move-exception v7

    .line 280
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    :goto_1
    goto :goto_2

    .line 283
    :cond_2
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "summary != null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 285
    :goto_2
    return-void
.end method

.method public b()Lo/bzo;
    .locals 1

    .line 839
    iget-object v0, p0, Lo/bxa;->z:Lo/bzn;

    return-object v0
.end method

.method public b(ILandroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/content/Context;)V
    .locals 0

    .line 805
    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 25

    .line 369
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpdate(Bundle sportInfo):"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 370
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 371
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == sportInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    return-void

    .line 376
    :cond_0
    const-string v0, "sportState"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v6

    .line 378
    const/4 v0, 0x2

    if-ne v0, v6, :cond_1

    .line 379
    const-wide/16 v0, 0x0

    move-object/from16 v2, p0

    iput-wide v0, v2, Lo/bxa;->m:J

    .line 382
    :cond_1
    const/4 v0, 0x1

    if-eq v0, v6, :cond_2

    .line 383
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sportState = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 384
    return-void

    .line 387
    :cond_2
    const/4 v7, 0x0

    .line 389
    move-object/from16 v0, p0

    iget v0, v0, Lo/bxa;->d:I

    const/4 v1, -0x1

    if-ne v1, v0, :cond_3

    .line 390
    const/4 v7, 0x1

    .line 391
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/bxa;->d:I

    .line 393
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lo/bxa;->e()Ljava/util/List;

    move-result-object v8

    .line 394
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    .line 395
    add-int/lit8 v0, v9, -0x1

    move-object/from16 v1, p0

    iget v1, v1, Lo/bxa;->d:I

    if-ge v0, v1, :cond_4

    .line 396
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutActions  workoutActionSize <= index"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    return-void

    .line 401
    :cond_4
    const/4 v10, 0x0

    .line 404
    move-object/from16 v0, p0

    iget v0, v0, Lo/bxa;->d:I

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 406
    const-string v0, "heartRateTime"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v12

    .line 407
    const-string v0, "distance"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v14

    .line 408
    const-string v0, "duration"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v15

    .line 409
    const-string v0, "timeTarget"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v16

    .line 410
    const-string v0, "distanceTarget"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v17

    .line 411
    const-string v0, "heartRate"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v18

    .line 412
    const-string v0, "speed"

    move-object/from16 v1, p1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v19

    .line 413
    invoke-static/range {v19 .. v19}, Lo/bzr;->m(F)F

    move-result v20

    .line 415
    move-object/from16 v0, p0

    iget v0, v0, Lo/bxa;->a:I

    sub-int v21, v14, v0

    .line 416
    move-object/from16 v0, p0

    iget v0, v0, Lo/bxa;->e:I

    sub-int v22, v15, v0

    .line 458
    const-string v0, "FitRunManager"

    const/16 v1, 0x12

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "totalDistance="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "  totalTime="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "  currentHeartRate = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 459
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " currentSpeedKmH = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " curDistanceTarget="

    const/16 v3, 0x8

    aput-object v2, v1, v3

    .line 460
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, " curTimeTarget="

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const-string v2, "  mStartDistanceTarget="

    const/16 v3, 0xc

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget v2, v2, Lo/bxa;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xd

    aput-object v2, v1, v3

    const-string v2, " mStarttimeTarget="

    const/16 v3, 0xe

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget v2, v2, Lo/bxa;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xf

    aput-object v2, v1, v3

    const-string v2, "  heartRateTime = "

    const/16 v3, 0x10

    aput-object v2, v1, v3

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v3, 0x11

    aput-object v2, v1, v3

    .line 458
    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    move-object/from16 v0, p0

    iget-wide v0, v0, Lo/bxa;->m:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_5

    .line 463
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move-object/from16 v2, p0

    iput-wide v0, v2, Lo/bxa;->m:J

    .line 465
    :cond_5
    move-object/from16 v0, p0

    iget-wide v0, v0, Lo/bxa;->m:J

    cmp-long v0, v12, v0

    if-gez v0, :cond_6

    .line 466
    move-object/from16 v0, p0

    iget-wide v12, v0, Lo/bxa;->m:J

    .line 468
    :cond_6
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "heartRateTime="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 470
    invoke-virtual {v11}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementType()I

    move-result v23

    .line 471
    const/4 v0, 0x0

    move/from16 v1, v23

    if-ne v0, v1, :cond_b

    .line 472
    invoke-virtual {v11}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v0

    move/from16 v1, v21

    if-lt v1, v0, :cond_a

    .line 473
    const/16 v24, 0x0

    .line 475
    :cond_7
    move-object/from16 v0, p0

    iget v0, v0, Lo/bxa;->d:I

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v0

    add-int v0, v0, v24

    move/from16 v1, v21

    if-lt v1, v0, :cond_8

    .line 476
    move-object/from16 v0, p0

    iget v0, v0, Lo/bxa;->d:I

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v0

    add-int v24, v24, v0

    .line 477
    move-object/from16 v0, p0

    iget v0, v0, Lo/bxa;->d:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lo/bxa;->d:I

    .line 478
    const-string v0, "FitRunManager"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpdate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "mTargetIndex = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget v2, v2, Lo/bxa;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "value = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 479
    move-object/from16 v0, p0

    iget v0, v0, Lo/bxa;->d:I

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_7

    .line 480
    const-string v0, "FitRunManager"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpdate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "mTargetIndex >= workoutActions.size() "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "break"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 481
    .line 484
    :cond_8
    move/from16 v0, v17

    move-object/from16 v1, p0

    iput v0, v1, Lo/bxa;->a:I

    .line 485
    move/from16 v0, v16

    move-object/from16 v1, p0

    iput v0, v1, Lo/bxa;->e:I

    .line 487
    const/16 v21, 0x0

    .line 488
    const/16 v22, 0x0

    .line 489
    add-int/lit8 v0, v9, -0x1

    move-object/from16 v1, p0

    iget v1, v1, Lo/bxa;->d:I

    if-ge v0, v1, :cond_9

    .line 490
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutActions  workoutActionSize <= index  DISTANCE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 491
    return-void

    .line 493
    :cond_9
    move-object/from16 v0, p0

    iget v0, v0, Lo/bxa;->d:I

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 494
    const/4 v7, 0x1

    .line 496
    :cond_a
    move/from16 v10, v21

    goto/16 :goto_0

    .line 498
    :cond_b
    invoke-virtual {v11}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v0

    move/from16 v1, v22

    if-lt v1, v0, :cond_f

    .line 499
    const/16 v24, 0x0

    .line 501
    :cond_c
    move-object/from16 v0, p0

    iget v0, v0, Lo/bxa;->d:I

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v0

    add-int v0, v0, v24

    move/from16 v1, v22

    if-lt v1, v0, :cond_d

    .line 502
    move-object/from16 v0, p0

    iget v0, v0, Lo/bxa;->d:I

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v0

    add-int v24, v24, v0

    .line 503
    move-object/from16 v0, p0

    iget v0, v0, Lo/bxa;->d:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lo/bxa;->d:I

    .line 504
    const-string v0, "FitRunManager"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpdate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "mTargetIndex = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget v2, v2, Lo/bxa;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "value = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 505
    move-object/from16 v0, p0

    iget v0, v0, Lo/bxa;->d:I

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_c

    .line 506
    const-string v0, "FitRunManager"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpdate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "mTargetIndex >= workoutActions.size() "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "break"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    .line 510
    :cond_d
    move/from16 v0, v17

    move-object/from16 v1, p0

    iput v0, v1, Lo/bxa;->a:I

    .line 511
    move/from16 v0, v16

    move-object/from16 v1, p0

    iput v0, v1, Lo/bxa;->e:I

    .line 513
    const/16 v21, 0x0

    .line 514
    const/16 v22, 0x0

    .line 515
    add-int/lit8 v0, v9, -0x1

    move-object/from16 v1, p0

    iget v1, v1, Lo/bxa;->d:I

    if-ge v0, v1, :cond_e

    .line 516
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutActions  workoutActionSize <= index  time"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 517
    return-void

    .line 519
    :cond_e
    move-object/from16 v0, p0

    iget v0, v0, Lo/bxa;->d:I

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 520
    const/4 v7, 0x1

    .line 522
    :cond_f
    move/from16 v10, v22

    .line 525
    :goto_0
    const-string v0, "FitRunManager"

    const/16 v1, 0x10

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "totalDistance="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "  totalTime="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "  currentHeartRate = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 526
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " currentSpeedKmH = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, " curDistanceTarget="

    const/16 v3, 0x8

    aput-object v2, v1, v3

    .line 527
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, " curTimeTarget="

    const/16 v3, 0xa

    aput-object v2, v1, v3

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    const-string v2, "  mStartDistanceTarget="

    const/16 v3, 0xc

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget v2, v2, Lo/bxa;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xd

    aput-object v2, v1, v3

    const-string v2, " mStarttimeTarget="

    const/16 v3, 0xe

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget v2, v2, Lo/bxa;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0xf

    aput-object v2, v1, v3

    .line 525
    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 528
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doingValue = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isChange = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 530
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mTargetIndex = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p0

    iget v2, v2, Lo/bxa;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutAction = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    if-eqz v7, :cond_10

    .line 537
    move-object/from16 v0, p0

    iget v0, v0, Lo/bxa;->d:I

    move-object/from16 v1, p0

    invoke-direct {v1, v11, v0, v9}, Lo/bxa;->d(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;II)V

    .line 541
    :cond_10
    invoke-static/range {v22 .. v22}, Lo/bzr;->e(I)I

    move-result v24

    .line 542
    move-object/from16 v0, p0

    move-object/from16 v1, p0

    iget v1, v1, Lo/bxa;->d:I

    move/from16 v2, v21

    move/from16 v3, v24

    move/from16 v4, v18

    move/from16 v5, v20

    invoke-direct/range {v0 .. v5}, Lo/bxa;->a(IIIIF)V

    .line 544
    move-object/from16 v0, p0

    move/from16 v1, v20

    move/from16 v2, v18

    invoke-direct {v0, v7, v11, v1, v2}, Lo/bxa;->e(ZLcom/huawei/pluginFitnessAdvice/WorkoutAction;FI)V

    .line 547
    move-object/from16 v0, p0

    invoke-direct {v0, v12, v13}, Lo/bxa;->e(J)V

    .line 550
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/bxa;->o:Lo/cab;

    int-to-long v1, v15

    invoke-virtual {v0, v1, v2}, Lo/cab;->c(J)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_11

    .line 551
    invoke-direct/range {p0 .. p0}, Lo/bxa;->k()V

    .line 555
    :cond_11
    move-object/from16 v0, p0

    iget v0, v0, Lo/bxa;->d:I

    move-object/from16 v1, p0

    invoke-direct {v1, v11, v0, v10}, Lo/bxa;->c(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;II)V

    .line 556
    return-void
.end method

.method public d(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;)Lcom/huawei/health/suggestion/model/RecordAction;
    .locals 5

    .line 831
    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementType()I

    move-result v0

    if-nez v0, :cond_0

    .line 832
    new-instance v0, Lcom/huawei/health/suggestion/model/RecordAction;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getAction()Lcom/huawei/pluginFitnessAdvice/Action;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/Action;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v2

    int-to-float v2, v2

    const-string v3, "run_distance"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/huawei/health/suggestion/model/RecordAction;-><init>(Ljava/lang/String;IFLjava/lang/String;)V

    return-object v0

    .line 834
    :cond_0
    new-instance v0, Lcom/huawei/health/suggestion/model/RecordAction;

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getAction()Lcom/huawei/pluginFitnessAdvice/Action;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/Action;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->acquireMeasurementValue()I

    move-result v2

    int-to-float v2, v2

    const-string v3, "run_time"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2, v3}, Lcom/huawei/health/suggestion/model/RecordAction;-><init>(Ljava/lang/String;IFLjava/lang/String;)V

    return-object v0
.end method

.method public d(Ljava/util/ArrayList;II)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/suggestion/model/RecordAction;>;II)Ljava/util/ArrayList<Lcom/huawei/health/suggestion/model/RecordAction;>;"
        }
    .end annotation

    .line 809
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 810
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/suggestion/model/RecordAction;

    .line 811
    if-ge v1, p2, :cond_0

    .line 812
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/RecordAction;->getTheoryAct()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RecordAction;->setFinishedAct(I)V

    goto :goto_1

    .line 813
    :cond_0
    if-ne v1, p2, :cond_1

    .line 814
    invoke-virtual {v2, p3}, Lcom/huawei/health/suggestion/model/RecordAction;->setFinishedAct(I)V

    .line 809
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 817
    :cond_2
    return-object p1
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/WorkoutAction;>;"
        }
    .end annotation

    .line 899
    iget-object v0, p0, Lo/bxa;->v:Ljava/util/List;

    return-object v0
.end method

.method public e(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Landroid/content/Context;)V
    .locals 5

    .line 236
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 237
    return-void

    .line 239
    :cond_0
    invoke-direct {p0}, Lo/bxa;->g()V

    .line 240
    invoke-direct {p0, p1}, Lo/bxa;->d(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 241
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v4

    .line 242
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 243
    invoke-interface {v4}, Lo/brr;->e()Lo/brv;

    move-result-object v0

    iput-object v0, p0, Lo/bxa;->t:Lo/brv;

    .line 244
    iget-object v0, p0, Lo/bxa;->t:Lo/brv;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 245
    const-string v0, "FitRunManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ShowPlanHelper:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bxa;->u:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    iget-object v0, p0, Lo/bxa;->t:Lo/brv;

    invoke-interface {v0, p1, p0, p2}, Lo/brv;->e(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lo/bru;Landroid/content/Context;)V

    goto :goto_0

    .line 248
    :cond_1
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start() null == runAdapter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 251
    :cond_2
    const-string v0, "FitRunManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start() null == instance"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    :goto_0
    return-void
.end method
