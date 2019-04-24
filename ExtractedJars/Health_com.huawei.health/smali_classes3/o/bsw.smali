.class public Lo/bsw;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Ljava/util/List;I)I
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;I)I"
        }
    .end annotation

    .line 105
    const/4 v4, 0x0

    .line 106
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    .line 108
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 109
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireWorkoutActions()Ljava/util/List;

    move-result-object v6

    .line 110
    invoke-static {v6}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-ltz p2, :cond_0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p2, :cond_0

    .line 112
    invoke-interface {v6, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 113
    const-string v0, "DataMediaFilesHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutAction:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    invoke-static {v7, v5, p1}, Lo/btr;->a(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;Ljava/util/Map;Ljava/util/List;)I

    move-result v0

    add-int/lit8 v4, v0, 0x0

    .line 116
    goto :goto_0

    .line 117
    :cond_0
    const-string v0, "DataMediaFilesHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTotalLength checkList(workoutActions)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    :goto_0
    const-string v0, "DataMediaFilesHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseMultiLanguageLength time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    goto :goto_1

    .line 122
    :cond_1
    const-string v0, "DataMediaFilesHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTotalLength null != fitWorkout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    :goto_1
    return v4
.end method

.method private static a(Ljava/util/List;Ljava/lang/String;)I
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;Ljava/lang/String;)I"
        }
    .end annotation

    .line 129
    const/4 v4, 0x0

    .line 130
    invoke-static {p1}, Lo/bsw;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 132
    invoke-static {p1}, Lo/bsm;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/btr;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 133
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 134
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/suggestion/model/Data;

    .line 135
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/Data;->acquireFileName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->n(Ljava/lang/String;)J

    move-result-wide v8

    .line 136
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/Data;->acquireFileName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/Data;->acquireUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v8, v9, v1}, Lo/bsm;->d(Ljava/lang/String;JLjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 137
    int-to-long v0, v4

    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/Data;->acquireSize()J

    move-result-wide v2

    add-long/2addr v0, v2

    long-to-int v4, v0

    .line 138
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 139
    new-instance v10, Lcom/huawei/health/suggestion/model/Media;

    invoke-direct {v10}, Lcom/huawei/health/suggestion/model/Media;-><init>()V

    .line 140
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/Data;->acquireUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/suggestion/model/Media;->setUrl(Ljava/lang/String;)V

    .line 141
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/Data;->acquireFileName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/suggestion/model/Media;->setPath(Ljava/lang/String;)V

    .line 142
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/Data;->acquireSize()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/suggestion/model/Media;->setLength(J)V

    .line 143
    const/4 v0, 0x2

    invoke-virtual {v10, v0}, Lcom/huawei/health/suggestion/model/Media;->setType(I)V

    .line 144
    invoke-interface {p0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 148
    :cond_1
    goto :goto_1

    .line 149
    :cond_2
    const/high16 v4, 0xa00000

    .line 152
    :goto_1
    return v4
.end method

.method public static b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)I
    .locals 2

    .line 39
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lo/bsw;->c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Ljava/util/List;)I

    move-result v1

    .line 40
    return v1
.end method

.method private static c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Ljava/util/List;)I
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;)I"
        }
    .end annotation

    .line 64
    const/4 v4, 0x0

    .line 65
    const/4 v0, 0x0

    if-eq v0, p0, :cond_5

    .line 67
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 69
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 71
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireWarmUpRunAction()Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 72
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireWarmUpRunAction()Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireWorkoutActions()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 76
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireWorkoutActions()Ljava/util/List;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 80
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCoolDownRunAction()Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 81
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireCoolDownRunAction()Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    :cond_2
    invoke-static {v6}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 85
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 86
    invoke-static {v8, v5, p1}, Lo/bsw;->d(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;Ljava/util/Map;Ljava/util/List;)I

    move-result v0

    add-int/2addr v4, v0

    .line 87
    invoke-static {v8, v5, p1}, Lo/btr;->c(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;Ljava/util/Map;Ljava/util/List;)I

    move-result v0

    add-int/2addr v4, v0

    .line 88
    goto :goto_0

    :cond_3
    goto :goto_1

    .line 90
    :cond_4
    const-string v0, "DataMediaFilesHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTotalLength checkList(workoutActions)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 94
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireComeFrom()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lo/bsw;->a(Ljava/util/List;Ljava/lang/String;)I

    move-result v0

    add-int/2addr v4, v0

    .line 95
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 96
    const-string v0, "DataMediaFilesHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseMultiLanguageLength time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sub-long v2, v9, v7

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    goto :goto_2

    .line 99
    :cond_5
    const-string v0, "DataMediaFilesHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTotalLength null != fitWorkout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    :goto_2
    return v4
.end method

.method public static c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginFitnessAdvice/FitWorkout;I)Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;"
        }
    .end annotation

    .line 219
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 220
    const/4 v0, 0x0

    return-object v0

    .line 221
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 222
    invoke-static {p0, v1, p1}, Lo/bsw;->a(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Ljava/util/List;I)I

    .line 223
    return-object v1
.end method

.method private static d(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;Ljava/util/Map;Ljava/util/List;)I
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;)I"
        }
    .end annotation

    .line 156
    const/4 v4, 0x0

    .line 157
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;->getCommentaryTraining()Ljava/util/List;

    move-result-object v5

    .line 158
    invoke-static {v5}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 159
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginFitnessAdvice/Comment;

    .line 161
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->n(Ljava/lang/String;)J

    move-result-wide v8

    .line 162
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-nez v0, :cond_0

    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bsm;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/bsp;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 164
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lo/bsm;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 165
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->n(Ljava/lang/String;)J

    move-result-wide v8

    .line 168
    :cond_0
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8, v9}, Lo/bsm;->c(Ljava/lang/String;J)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 170
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquireName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Comment;->getLength()I

    move-result v0

    add-int/2addr v4, v0

    .line 173
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 174
    new-instance v10, Lcom/huawei/health/suggestion/model/Media;

    invoke-direct {v10}, Lcom/huawei/health/suggestion/model/Media;-><init>()V

    .line 175
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Comment;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/suggestion/model/Media;->setUrl(Ljava/lang/String;)V

    .line 176
    invoke-virtual {v10}, Lcom/huawei/health/suggestion/model/Media;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/suggestion/model/Media;->setPath(Ljava/lang/String;)V

    .line 177
    invoke-virtual {v7}, Lcom/huawei/pluginFitnessAdvice/Comment;->getLength()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/suggestion/model/Media;->setLength(J)V

    .line 178
    const/4 v0, 0x2

    invoke-virtual {v10, v0}, Lcom/huawei/health/suggestion/model/Media;->setType(I)V

    .line 179
    invoke-interface {p2, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 182
    :cond_1
    goto/16 :goto_0

    :cond_2
    goto :goto_1

    .line 184
    :cond_3
    const-string v0, "DataMediaFilesHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workoutAction.getCommentaryTraining() == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 187
    :goto_1
    return v4
.end method

.method public static e(Lcom/huawei/pluginFitnessAdvice/FitWorkout;I)I
    .locals 8

    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v0, 0x0

    if-eq v0, p0, :cond_1

    .line 47
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 48
    invoke-virtual {p0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireWorkoutActions()Ljava/util/List;

    move-result-object v6

    .line 49
    invoke-static {v6}, Lo/buk;->c(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p1, :cond_0

    .line 50
    invoke-interface {v6, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/pluginFitnessAdvice/WorkoutAction;

    .line 51
    const/4 v0, 0x0

    invoke-static {v7, v5, v0}, Lo/btr;->a(Lcom/huawei/pluginFitnessAdvice/WorkoutAction;Ljava/util/Map;Ljava/util/List;)I

    move-result v4

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const-string v0, "DataMediaFilesHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTotalLength checkList(workoutActions)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    :goto_0
    const-string v0, "DataMediaFilesHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parseMultiLanguageLength time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const-string v0, "DataMediaFilesHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getTotalLength null != fitWorkout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    :goto_1
    return v4
.end method

.method public static e(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;"
        }
    .end annotation

    .line 197
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 198
    const/4 v0, 0x0

    return-object v0

    .line 213
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 214
    invoke-static {p0, v1}, Lo/bsw;->c(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Ljava/util/List;)I

    .line 215
    return-object v1
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 2

    .line 29
    new-instance v0, Ljava/io/File;

    invoke-static {p0}, Lo/bsm;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    return v0
.end method
