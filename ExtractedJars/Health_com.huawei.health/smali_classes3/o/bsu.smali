.class public Lo/bsu;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/util/List;)Lcom/huawei/health/suggestion/model/Media;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;)Lcom/huawei/health/suggestion/model/Media;"
        }
    .end annotation

    .line 269
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/suggestion/model/Media;

    .line 270
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/Media;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    .line 271
    return-object v2

    .line 273
    :cond_0
    goto :goto_0

    .line 274
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a()V
    .locals 4

    .line 222
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cad;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 223
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/huawei/health/suggestion/data/DataSyncService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 225
    :cond_0
    return-void
.end method

.method public static a(Lcom/huawei/health/suggestion/data/DataSyncService$a;)V
    .locals 4

    .line 233
    new-instance v2, Lo/bsu$4;

    invoke-direct {v2, p0}, Lo/bsu$4;-><init>(Lcom/huawei/health/suggestion/data/DataSyncService$a;)V

    .line 258
    new-instance v3, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/data/DataSyncService;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 259
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v3, v2, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 260
    return-void
.end method

.method public static b(Ljava/lang/String;)Ljava/util/TreeSet;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/TreeSet<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 119
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 120
    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    return-object v0

    .line 122
    :cond_0
    new-instance v1, Ljava/util/TreeSet;

    invoke-direct {v1}, Ljava/util/TreeSet;-><init>()V

    .line 123
    const-string v0, ","

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 124
    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    .line 126
    invoke-static {v6}, Lo/caj;->e(Ljava/lang/Object;)I

    move-result v7

    .line 127
    if-lez v7, :cond_1

    .line 128
    add-int/lit8 v0, v7, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 124
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 131
    :cond_2
    return-object v1
.end method

.method public static b(Lcom/huawei/health/suggestion/model/WorkoutRecord;)Z
    .locals 4

    .line 326
    if-nez p0, :cond_0

    .line 327
    const/4 v0, 0x0

    return v0

    .line 330
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualCalorie()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3f1a36e2eb1c432dL    # 1.0E-4

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireActualDistance()F

    move-result v0

    float-to-double v0, v0

    const-wide v2, 0x3f1a36e2eb1c432dL    # 1.0E-4

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    .line 331
    const/4 v0, 0x0

    return v0

    .line 334
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static c(Lcom/huawei/health/suggestion/model/PlanWorkout;)Lcom/huawei/health/suggestion/model/RunWorkout;
    .locals 3

    .line 205
    new-instance v2, Lcom/huawei/health/suggestion/model/RunWorkout;

    invoke-direct {v2}, Lcom/huawei/health/suggestion/model/RunWorkout;-><init>()V

    .line 206
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 207
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popExtendParams()Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/model/RunWorkout;

    invoke-static {v0, v1}, Lo/cae;->d(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/suggestion/model/RunWorkout;

    .line 208
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWorkoutId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->saveId(Ljava/lang/String;)V

    .line 209
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->saveName(Ljava/lang/String;)V

    .line 210
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->putWorkoutDate(Ljava/lang/String;)V

    .line 211
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->saveDescription(Ljava/lang/String;)V

    .line 212
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->saveVersion(Ljava/lang/String;)V

    .line 215
    :cond_0
    return-object v2
.end method

.method public static c(Ljava/util/List;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/RunWorkout;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/RunWorkout;>;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/RunWorkout;"
        }
    .end annotation

    .line 190
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/suggestion/model/RunWorkout;

    .line 191
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 192
    return-object v2

    .line 194
    :cond_0
    goto :goto_0

    .line 195
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static c(Ljava/util/TreeSet;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/TreeSet<Ljava/lang/Integer;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 94
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 95
    const-string v0, ""

    return-object v0

    .line 98
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    invoke-virtual {p0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 100
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 102
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    const-string v0, ","

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 106
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_2

    .line 107
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 109
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;Ljava/util/List<Lcom/huawei/health/suggestion/model/RunWorkout;>;)Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;"
        }
    .end annotation

    .line 169
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 170
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWorkoutId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lo/bsu;->c(Ljava/util/List;Ljava/lang/String;)Lcom/huawei/health/suggestion/model/RunWorkout;

    move-result-object v3

    .line 171
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 172
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putWorkoutId(Ljava/lang/String;)V

    .line 173
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putName(Ljava/lang/String;)V

    .line 174
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putDescription(Ljava/lang/String;)V

    .line 175
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/RunWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putVersion(Ljava/lang/String;)V

    .line 176
    invoke-static {v3}, Lo/bsx;->a(Lcom/huawei/health/suggestion/model/RunWorkout;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putExtendParams(Ljava/lang/String;)V

    .line 178
    :cond_0
    goto :goto_0

    .line 179
    :cond_1
    return-object p0
.end method

.method public static c(Lorg/json/JSONObject;)V
    .locals 1

    .line 140
    const-string v0, "resultCode"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 141
    const-string v0, "resultDesc"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 142
    return-void
.end method

.method public static d(III)V
    .locals 2

    .line 311
    const-string v0, "finishPlanCount"

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 313
    const-string v0, "totalTrainingDays"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 315
    const-string v0, "totalCalorie"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 316
    return-void
.end method

.method public static d(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;)V
    .locals 4

    .line 350
    new-instance v2, Lo/bsu$1;

    invoke-direct {v2, p0}, Lo/bsu$1;-><init>(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;)V

    .line 380
    new-instance v3, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 381
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v3, v2, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 382
    return-void
.end method

.method public static e(Ljava/util/List;)J
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;)J"
        }
    .end annotation

    .line 285
    const-wide/16 v2, 0x0

    .line 286
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/Media;

    .line 287
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Media;->getDownloadLength()J

    move-result-wide v0

    add-long/2addr v2, v0

    .line 288
    goto :goto_0

    .line 289
    :cond_0
    return-wide v2
.end method

.method public static e(I)Ljava/lang/String;
    .locals 1

    .line 152
    const-string v0, ""

    return-object v0
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 2

    .line 82
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->a()Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v1

    .line 83
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/Plan;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
