.class public Lo/btz;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/TreeMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeMap<Ljava/lang/Integer;Lcom/huawei/health/suggestion/model/ExerciseProfile;>;"
        }
    .end annotation
.end field

.field private b:Lo/bue;

.field private e:Lo/bua;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lo/btz;->a:Ljava/util/TreeMap;

    .line 24
    new-instance v0, Lo/bua;

    invoke-direct {v0, p1}, Lo/bua;-><init>(I)V

    iput-object v0, p0, Lo/btz;->e:Lo/bua;

    .line 25
    new-instance v0, Lo/bue;

    invoke-direct {v0, p1}, Lo/bue;-><init>(I)V

    iput-object v0, p0, Lo/btz;->b:Lo/bue;

    .line 26
    return-void
.end method

.method private b(I)I
    .locals 6

    .line 111
    const/16 v5, 0xe10

    .line 112
    if-ge p1, v5, :cond_0

    .line 113
    const/4 v4, 0x1

    goto :goto_0

    .line 115
    :cond_0
    const/4 v4, 0x3

    .line 118
    :goto_0
    const-string v0, "MyRunAnalysis"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "state:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 119
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",pace:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 120
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",restDeceleratePaceUpper:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 121
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 118
    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    return v4
.end method

.method private d(ILcom/huawei/health/suggestion/model/ExerciseLimits;)I
    .locals 17

    .line 76
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    div-double/2addr v0, v2

    const-wide v2, 0x40ac200000000000L    # 3600.0

    div-double v0, v2, v0

    double-to-int v5, v0

    .line 77
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    div-double/2addr v0, v2

    const-wide v2, 0x40ac200000000000L    # 3600.0

    div-double v0, v2, v0

    double-to-int v6, v0

    .line 78
    int-to-long v0, v5

    int-to-long v2, v6

    add-long/2addr v0, v2

    const-wide/16 v2, 0x2

    div-long v7, v0, v2

    .line 79
    const-wide/16 v0, 0x3c

    sub-long v9, v7, v0

    .line 80
    const-wide/16 v0, 0x1e

    sub-long v11, v7, v0

    .line 81
    const-wide/16 v0, 0x1e

    add-long v13, v7, v0

    .line 82
    const-wide/16 v0, 0x3c

    add-long v15, v7, v0

    .line 84
    move/from16 v0, p1

    int-to-long v0, v0

    cmp-long v0, v0, v9

    if-gez v0, :cond_0

    .line 85
    const/4 v4, 0x1

    goto :goto_0

    .line 86
    :cond_0
    move/from16 v0, p1

    int-to-long v0, v0

    cmp-long v0, v0, v11

    if-gez v0, :cond_1

    .line 87
    const/4 v4, 0x2

    goto :goto_0

    .line 88
    :cond_1
    move/from16 v0, p1

    int-to-long v0, v0

    cmp-long v0, v0, v13

    if-gez v0, :cond_2

    .line 89
    const/4 v4, 0x3

    goto :goto_0

    .line 90
    :cond_2
    move/from16 v0, p1

    int-to-long v0, v0

    cmp-long v0, v0, v15

    if-gez v0, :cond_3

    .line 91
    const/4 v4, 0x4

    goto :goto_0

    .line 93
    :cond_3
    const/4 v4, 0x5

    .line 96
    :goto_0
    const-string v0, "MyRunAnalysis"

    const/16 v1, 0xc

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "state:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 97
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",pace:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 98
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",deceleratePaceUpper:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    .line 99
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",slightlySlowerPaceUpper:"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    .line 100
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    const-string v2, ",holdPaceUpper"

    const/16 v3, 0x8

    aput-object v2, v1, v3

    .line 101
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x9

    aput-object v2, v1, v3

    const-string v2, ",slightlyFasterPaceUpper"

    const/16 v3, 0xa

    aput-object v2, v1, v3

    .line 102
    invoke-static/range {v15 .. v16}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v1, v3

    .line 96
    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    return v4
.end method

.method private d(Lcom/huawei/health/suggestion/model/SportInfo;)I
    .locals 6

    .line 49
    iget-object v0, p0, Lo/btz;->a:Ljava/util/TreeMap;

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/SportInfo;->acquireTime()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v2

    .line 51
    if-nez v2, :cond_0

    .line 52
    const/4 v0, -0x1

    return v0

    .line 56
    :cond_0
    iget-object v0, p0, Lo/btz;->e:Lo/bua;

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/SportInfo;->getPace()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/bua;->b(I)I

    move-result v4

    .line 58
    if-ltz v4, :cond_3

    .line 59
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/ExerciseProfile;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getRunningSpeed()Lcom/huawei/health/suggestion/model/ExerciseLimits;

    move-result-object v5

    .line 61
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMax()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/ExerciseLimits;->getMin()I

    move-result v0

    if-eqz v0, :cond_2

    .line 62
    :cond_1
    invoke-direct {p0, v4, v5}, Lo/btz;->d(ILcom/huawei/health/suggestion/model/ExerciseLimits;)I

    move-result v3

    goto :goto_0

    .line 65
    :cond_2
    invoke-direct {p0, v4}, Lo/btz;->b(I)I

    move-result v3

    .line 68
    :goto_0
    iget-object v0, p0, Lo/btz;->b:Lo/bue;

    invoke-virtual {v0, v3}, Lo/bue;->b(I)I

    move-result v0

    return v0

    .line 70
    :cond_3
    const/4 v0, -0x1

    return v0
.end method

.method private d(Lcom/huawei/health/suggestion/model/RunWorkout;)V
    .locals 8

    .line 152
    iget-object v0, p0, Lo/btz;->a:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->clear()V

    .line 153
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWarmup()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v2

    .line 154
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunWorkout;->getRest()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v3

    .line 155
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunWorkout;->getWork()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v4

    .line 156
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunWorkout;->getCooldown()Lcom/huawei/health/suggestion/model/ExerciseProfile;

    move-result-object v5

    .line 158
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/RunWorkout;->getRepeats()I

    move-result v6

    .line 159
    const/4 v0, 0x1

    if-le v6, v0, :cond_1

    .line 162
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v7

    .line 164
    iget-object v0, p0, Lo/btz;->a:Ljava/util/TreeMap;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    :goto_0
    if-lez v6, :cond_0

    .line 167
    iget-object v0, p0, Lo/btz;->a:Ljava/util/TreeMap;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v0

    add-int/2addr v7, v0

    .line 170
    iget-object v0, p0, Lo/btz;->a:Ljava/util/TreeMap;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/ExerciseProfile;->getDuration()I

    move-result v0

    add-int/2addr v7, v0

    .line 172
    add-int/lit8 v6, v6, -0x1

    goto :goto_0

    .line 174
    :cond_0
    iget-object v0, p0, Lo/btz;->a:Ljava/util/TreeMap;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    goto :goto_1

    .line 176
    :cond_1
    iget-object v0, p0, Lo/btz;->a:Ljava/util/TreeMap;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    :goto_1
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/suggestion/model/RunWorkout;)V
    .locals 1

    .line 29
    invoke-direct {p0, p1}, Lo/btz;->d(Lcom/huawei/health/suggestion/model/RunWorkout;)V

    .line 30
    iget-object v0, p0, Lo/btz;->b:Lo/bue;

    invoke-virtual {v0}, Lo/bue;->b()V

    .line 31
    iget-object v0, p0, Lo/btz;->e:Lo/bua;

    invoke-virtual {v0}, Lo/bua;->e()V

    .line 32
    return-void
.end method

.method public b(Lcom/huawei/health/suggestion/model/SportInfo;)I
    .locals 1

    .line 39
    invoke-direct {p0, p1}, Lo/btz;->d(Lcom/huawei/health/suggestion/model/SportInfo;)I

    move-result v0

    return v0
.end method

.method public e()I
    .locals 1

    .line 44
    iget-object v0, p0, Lo/btz;->b:Lo/bue;

    invoke-virtual {v0}, Lo/bue;->a()I

    move-result v0

    return v0
.end method
