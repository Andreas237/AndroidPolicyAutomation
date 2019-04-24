.class public abstract Lo/bte;
.super Lo/btg;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lo/btg;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Landroid/content/ContentValues;
    .locals 3

    .line 163
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 164
    const-string v0, "userId"

    invoke-virtual {v2, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    const-string v0, "workoutId"

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    const-string v0, "version"

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    return-object v2
.end method

.method private b(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Z
    .locals 8

    .line 98
    const-string v0, "FitWorkoutListDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isRelationWorkout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 100
    const-string v0, "FitWorkoutListDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workout is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const/4 v0, 0x0

    return v0

    .line 103
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 104
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    invoke-virtual {p0}, Lo/bte;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? AND "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? AND "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "version"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 106
    const/4 v0, 0x3

    new-array v5, v0, [Ljava/lang/String;

    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    invoke-virtual {p2}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v5, v1

    .line 109
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v4, v5}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 113
    const/4 v7, 0x0

    .line 114
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 115
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 116
    const/4 v7, 0x1

    .line 118
    :cond_1
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 120
    :cond_2
    const-string v0, "FitWorkoutListDao"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isRelationWorkout has = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    return v7
.end method

.method private e(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 5

    .line 149
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 150
    const-string v0, "FitWorkoutListDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "workout is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    return-void

    .line 153
    :cond_0
    const-string v0, "FitWorkoutListDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertRelationWorkout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    invoke-direct {p0, p1, p2}, Lo/bte;->a(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Landroid/content/ContentValues;

    move-result-object v4

    .line 155
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    .line 156
    invoke-virtual {p0}, Lo/bte;->c()Ljava/lang/String;

    move-result-object v1

    .line 155
    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, v4}, Lcom/huawei/health/suggestion/data/DBFactory;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    .line 159
    const-string v0, "FitWorkoutListDao"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertRelationWorkout\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/content/ContentValues;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 6

    .line 44
    const-string v0, "FitWorkoutListDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delWorkouts"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    .line 46
    invoke-virtual {p0}, Lo/bte;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "userId=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    .line 47
    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 45
    const/4 v4, 0x1

    invoke-virtual {v0, v1, v4, v2, v3}, Lcom/huawei/health/suggestion/data/DBFactory;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)I

    .line 48
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 70
    const-string v0, "FitWorkoutListDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delWorkout delWorkout List<FitWorkout> workouts "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->c()V

    .line 72
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 73
    invoke-virtual {v5}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lo/bte;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->e()V

    .line 76
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .line 126
    const-string v0, "FitWorkoutListDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isRelationWorkout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select * from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 128
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v1

    invoke-virtual {p0}, Lo/bte;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "userId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? AND "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 130
    const/4 v0, 0x2

    new-array v5, v0, [Ljava/lang/String;

    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    invoke-static {p2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 133
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v4, v5}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 137
    const/4 v7, 0x0

    .line 138
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    .line 139
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    const/4 v7, 0x1

    .line 142
    :cond_0
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 144
    :cond_1
    const-string v0, "FitWorkoutListDao"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isRelationWorkout has = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    return v7
.end method

.method protected abstract c()Ljava/lang/String;
.end method

.method public c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;)Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;"
        }
    .end annotation

    .line 184
    const-string v0, "FitWorkoutListDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkouts"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    move-object v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move/from16 v4, p6

    move-object/from16 v5, p7

    invoke-virtual/range {v0 .. v5}, Lo/bte;->c([Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object v6

    .line 187
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {p0}, Lo/bte;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 188
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-static {}, Lo/btg;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/data/DBFactory;->getTableFullName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 190
    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    .line 192
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "select "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".* from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 193
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " where "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 194
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "userId"

    invoke-static {v7, v1}, Lo/bte;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "userId"

    invoke-static {v8, v1}, Lo/bte;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "=? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 198
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "workoutId"

    invoke-static {v7, v1}, Lo/bte;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "workoutId"

    invoke-static {v8, v1}, Lo/bte;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 199
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "version"

    invoke-static {v7, v1}, Lo/bte;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "version"

    invoke-static {v8, v1}, Lo/bte;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 200
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " LIMIT ?,?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 202
    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v10

    .line 203
    const-string v0, "FitWorkoutListDao"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkouts sql = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    const/4 v0, 0x4

    new-array v11, v0, [Ljava/lang/String;

    invoke-static/range {p8 .. p8}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v11, v1

    invoke-static/range {p8 .. p8}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v11, v1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v11, v1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v11, v1

    .line 207
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v10, v11}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v12

    .line 212
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 213
    const/4 v0, 0x0

    if-eq v0, v12, :cond_1

    .line 214
    :goto_0
    invoke-interface {v12}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    invoke-virtual {p0, v12}, Lo/bte;->a(Landroid/database/Cursor;)Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v14

    .line 216
    invoke-interface {v13, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 217
    goto :goto_0

    .line 218
    :cond_0
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 220
    :cond_1
    const-string v0, "FitWorkoutListDao"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkouts workouts.size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    const-string v0, "FitWorkoutListDao"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkouts\uff1a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    return-object v13
.end method

.method public c(Ljava/lang/String;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/pluginFitnessAdvice/FitWorkout;>;)V"
        }
    .end annotation

    .line 84
    const-string v0, "FitWorkoutListDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertWorkouts List<FitWorkout> workouts "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->c()V

    .line 86
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    .line 87
    const-class v6, Lo/bte;

    monitor-enter v6

    .line 88
    :try_start_0
    invoke-direct {p0, p1, v5}, Lo/bte;->b(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 89
    invoke-direct {p0, p1, v5}, Lo/bte;->e(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 91
    :cond_0
    invoke-virtual {p0, p1, v5}, Lo/bte;->c(Ljava/lang/String;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    monitor-exit v6

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 93
    :goto_1
    goto :goto_0

    .line 94
    :cond_1
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->e()V

    .line 95
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 56
    const-string v0, "FitWorkoutListDao"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delWorkout workoutId= "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    .line 58
    invoke-virtual {p0}, Lo/bte;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "userId=? AND workoutId=?"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    .line 60
    invoke-static {p1}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {p2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 57
    const/4 v4, 0x1

    invoke-virtual {v0, v1, v4, v2, v3}, Lcom/huawei/health/suggestion/data/DBFactory;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;)I

    .line 61
    return-void
.end method
