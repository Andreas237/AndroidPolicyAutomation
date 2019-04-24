.class Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)V
    .locals 0

    .line 186
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 10

    .line 189
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_3

    .line 191
    :sswitch_0
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 192
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dgi;

    .line 193
    const-string v0, "DeviceRecordSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "courseRecord:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lo/dgi;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    new-instance v7, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;-><init>()V

    .line 197
    invoke-virtual {v6}, Lo/dgi;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutId(Ljava/lang/String;)V

    .line 198
    invoke-virtual {v6}, Lo/dgi;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutName(Ljava/lang/String;)V

    .line 199
    invoke-virtual {v6}, Lo/dgi;->k()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v7, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 200
    invoke-virtual {v6}, Lo/dgi;->h()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveDuring(I)V

    .line 201
    invoke-virtual {v6}, Lo/dgi;->d()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveFinishRate(F)V

    .line 203
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-virtual {v6}, Lo/dgi;->l()Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->e(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActionSummary(Ljava/lang/String;)V

    .line 204
    const-string v0, "DeviceRecordSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveActionSummary"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v6}, Lo/dgi;->l()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    invoke-virtual {v6}, Lo/dgi;->i()F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActualCalorie(F)V

    .line 206
    new-instance v8, Lcom/huawei/health/suggestion/model/RateInfo;

    invoke-direct {v8}, Lcom/huawei/health/suggestion/model/RateInfo;-><init>()V

    .line 207
    invoke-virtual {v6}, Lo/dgi;->c()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveMaxRate(I)V

    .line 208
    invoke-virtual {v6}, Lo/dgi;->e()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveMinRate(I)V

    .line 209
    invoke-virtual {v6}, Lo/dgi;->g()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveLimit(I)V

    .line 210
    invoke-virtual {v6}, Lo/dgi;->f()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveNoRaise(I)V

    .line 211
    invoke-virtual {v6}, Lo/dgi;->n()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveHaveRaise(I)V

    .line 212
    invoke-virtual {v6}, Lo/dgi;->p()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveFatBurning(I)V

    .line 213
    invoke-virtual {v6}, Lo/dgi;->m()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveWarmUp(I)V

    .line 214
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1, v8}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExtend(ZILcom/huawei/health/suggestion/model/RateInfo;)V

    .line 215
    invoke-virtual {v6}, Lo/dgi;->b()I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWearType(I)V

    .line 216
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, v7}, Lo/bsp;->a(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 217
    goto/16 :goto_0

    .line 218
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->c(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;Z)Z

    .line 219
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->e(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    const/4 v1, 0x7

    const v2, 0x186a0

    invoke-virtual {v0, v1, v2}, Lo/dge;->d(II)V

    .line 220
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->g(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->h(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 221
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->i(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->b(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;I)V

    .line 222
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->k(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)V

    goto/16 :goto_3

    .line 226
    :sswitch_1
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 227
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/dgm;

    .line 228
    const-string v0, "DeviceRecordSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postureRecord:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Lo/dgm;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    new-instance v8, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    invoke-direct {v8}, Lcom/huawei/health/suggestion/model/WorkoutRecord;-><init>()V

    .line 232
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "D"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Lo/dgm;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutId(Ljava/lang/String;)V

    .line 233
    invoke-virtual {v7}, Lo/dgm;->s()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWorkoutName(Ljava/lang/String;)V

    .line 234
    invoke-virtual {v7}, Lo/dgm;->f()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v8, v0, v1}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExerciseTime(J)V

    .line 235
    invoke-virtual {v7}, Lo/dgm;->g()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveDuring(I)V

    .line 236
    const-string v0, "[]"

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActionSummary(Ljava/lang/String;)V

    .line 237
    invoke-virtual {v7}, Lo/dgm;->b()I

    move-result v0

    if-eqz v0, :cond_2

    .line 238
    invoke-virtual {v7}, Lo/dgm;->e()I

    move-result v0

    if-nez v0, :cond_1

    .line 239
    invoke-virtual {v7}, Lo/dgm;->a()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    invoke-virtual {v7}, Lo/dgm;->b()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveFinishRate(F)V

    goto :goto_2

    .line 240
    :cond_1
    invoke-virtual {v7}, Lo/dgm;->e()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 241
    invoke-virtual {v7}, Lo/dgm;->g()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    mul-float/2addr v0, v1

    invoke-virtual {v7}, Lo/dgm;->b()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveFinishRate(F)V

    .line 245
    :cond_2
    :goto_2
    invoke-virtual {v7}, Lo/dgm;->h()F

    move-result v0

    const/high16 v1, 0x447a0000    # 1000.0f

    mul-float/2addr v0, v1

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveActualCalorie(F)V

    .line 246
    new-instance v9, Lcom/huawei/health/suggestion/model/RateInfo;

    invoke-direct {v9}, Lcom/huawei/health/suggestion/model/RateInfo;-><init>()V

    .line 247
    invoke-virtual {v7}, Lo/dgm;->i()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveMaxRate(I)V

    .line 248
    invoke-virtual {v7}, Lo/dgm;->c()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveMinRate(I)V

    .line 249
    invoke-virtual {v7}, Lo/dgm;->n()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveLimit(I)V

    .line 250
    invoke-virtual {v7}, Lo/dgm;->l()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveNoRaise(I)V

    .line 251
    invoke-virtual {v7}, Lo/dgm;->p()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveHaveRaise(I)V

    .line 252
    invoke-virtual {v7}, Lo/dgm;->m()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveFatBurning(I)V

    .line 253
    invoke-virtual {v7}, Lo/dgm;->u()I

    move-result v0

    invoke-virtual {v9, v0}, Lcom/huawei/health/suggestion/model/RateInfo;->saveWarmUp(I)V

    .line 254
    invoke-virtual {v7}, Lo/dgm;->a()I

    move-result v0

    invoke-virtual {v7}, Lo/dgm;->k()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {v8, v2, v0, v1, v9}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveExtend(ZIILcom/huawei/health/suggestion/model/RateInfo;)V

    .line 255
    invoke-virtual {v7}, Lo/dgm;->o()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->saveWearType(I)V

    .line 256
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0, v8}, Lo/bsp;->a(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    .line 257
    goto/16 :goto_1

    .line 258
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->e(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;Z)Z

    .line 259
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->e(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dge;->c(Landroid/content/Context;)Lo/dge;

    move-result-object v0

    const/4 v1, 0x5

    const v2, 0x186a0

    invoke-virtual {v0, v1, v2}, Lo/dge;->d(II)V

    .line 260
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->g(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->h(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 261
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->i(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->b(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;I)V

    .line 262
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->k(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;)V

    goto :goto_3

    .line 266
    :sswitch_2
    move-object v0, p2

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 267
    const-string v0, "DeviceRecordSyncService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync fail error code:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$3;->d:Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v0, v2, v1}, Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;->e(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService;ILjava/lang/String;)V

    .line 269
    .line 273
    :cond_4
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_1
        0x7 -> :sswitch_0
        0x7f -> :sswitch_2
    .end sparse-switch
.end method
