.class Lo/exp$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exp;->b(JJLo/exn$d;Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egg;

.field final synthetic b:Lo/exn$d;

.field final synthetic c:J

.field final synthetic d:Lo/exp;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/exp;JJLo/exn$d;Lo/egg;)V
    .locals 0

    .line 2245
    iput-object p1, p0, Lo/exp$3;->d:Lo/exp;

    iput-wide p2, p0, Lo/exp$3;->e:J

    iput-wide p4, p0, Lo/exp$3;->c:J

    iput-object p6, p0, Lo/exp$3;->b:Lo/exn$d;

    iput-object p7, p0, Lo/exp$3;->a:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 2249
    if-nez p1, :cond_0

    .line 2250
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMonth BaseTime datas is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2251
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$3;->d:Lo/exp;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/exp;->n(Lo/exp;I)I

    .line 2252
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$3;->d:Lo/exp;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/exp;->q(Lo/exp;I)I

    .line 2253
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$3;->d:Lo/exp;

    move-object/from16 v1, p0

    iget-wide v1, v1, Lo/exp$3;->e:J

    move-object/from16 v3, p0

    iget-wide v3, v3, Lo/exp$3;->c:J

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/exp$3;->b:Lo/exn$d;

    move-object/from16 v6, p0

    iget-object v6, v6, Lo/exp$3;->a:Lo/egg;

    invoke-static/range {v0 .. v6}, Lo/exp;->b(Lo/exp;JJLo/exn$d;Lo/egg;)V

    .line 2254
    return-void

    .line 2257
    :cond_0
    move-object/from16 v7, p1

    .line 2258
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2259
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMonth BaseTime sumDataList is empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2260
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$3;->d:Lo/exp;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/exp;->n(Lo/exp;I)I

    .line 2261
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$3;->d:Lo/exp;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/exp;->q(Lo/exp;I)I

    .line 2262
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$3;->d:Lo/exp;

    move-object/from16 v1, p0

    iget-wide v1, v1, Lo/exp$3;->e:J

    move-object/from16 v3, p0

    iget-wide v3, v3, Lo/exp$3;->c:J

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/exp$3;->b:Lo/exn$d;

    move-object/from16 v6, p0

    iget-object v6, v6, Lo/exp$3;->a:Lo/egg;

    invoke-static/range {v0 .. v6}, Lo/exp;->b(Lo/exp;JJLo/exn$d;Lo/egg;)V

    .line 2263
    return-void

    .line 2265
    :cond_1
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBaseTime sumDataList="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2267
    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 2269
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$3;->d:Lo/exp;

    invoke-static {v0}, Lo/exp;->q(Lo/exp;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2270
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/hihealth/HiHealthData;

    .line 2271
    new-instance v16, Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepWakeSleepData;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepWakeSleepData;-><init>()V

    .line 2272
    invoke-virtual {v15}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->o(J)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/ui/main/stories/recommendcloud/data/CoreSleepWakeSleepData;->setCurrentDay(Ljava/lang/String;)V

    .line 2273
    const-string v0, "core_sleep_fall_key"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v10

    .line 2274
    const-wide/16 v0, 0x0

    cmpl-double v0, v0, v10

    if-eqz v0, :cond_2

    .line 2275
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "HH"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object/from16 v17, v0

    .line 2277
    new-instance v0, Ljava/util/Date;

    double-to-long v1, v10

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v18

    .line 2278
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "mm"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object/from16 v17, v0

    .line 2279
    new-instance v0, Ljava/util/Date;

    double-to-long v1, v10

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v19

    .line 2280
    const/16 v20, 0x0

    .line 2281
    const/16 v21, 0x0

    .line 2283
    :try_start_0
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move/from16 v20, v0

    .line 2284
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move/from16 v21, v0

    .line 2287
    goto :goto_1

    .line 2285
    :catch_0
    move-exception v22

    .line 2286
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBaseTime NumberFormatException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2288
    :goto_1
    add-int/lit8 v8, v8, 0x1

    .line 2289
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$3;->d:Lo/exp;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/exp$3;->d:Lo/exp;

    invoke-static {v1}, Lo/exp;->s(Lo/exp;)I

    move-result v1

    mul-int/lit8 v2, v20, 0x3c

    add-int v2, v2, v21

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/exp;->n(Lo/exp;I)I

    .line 2292
    :cond_2
    const-string v0, "core_sleep_wake_up_key"

    invoke-virtual {v15, v0}, Lcom/huawei/hihealth/HiHealthData;->getDouble(Ljava/lang/String;)D

    move-result-wide v12

    .line 2293
    const-wide/16 v0, 0x0

    cmpl-double v0, v0, v12

    if-eqz v0, :cond_3

    .line 2294
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "HH"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object/from16 v17, v0

    .line 2295
    new-instance v0, Ljava/util/Date;

    double-to-long v1, v12

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v18

    .line 2296
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "mm"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object/from16 v17, v0

    .line 2297
    new-instance v0, Ljava/util/Date;

    double-to-long v1, v12

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v19

    .line 2298
    const/16 v20, 0x0

    .line 2299
    const/16 v21, 0x0

    .line 2301
    :try_start_1
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    move/from16 v20, v0

    .line 2302
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    move/from16 v21, v0

    .line 2305
    goto :goto_2

    .line 2303
    :catch_1
    move-exception v22

    .line 2304
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBaseTime NumberFormatException !"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2306
    :goto_2
    add-int/lit8 v9, v9, 0x1

    .line 2307
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$3;->d:Lo/exp;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/exp$3;->d:Lo/exp;

    invoke-static {v1}, Lo/exp;->u(Lo/exp;)I

    move-result v1

    mul-int/lit8 v2, v21, 0x3c

    add-int v2, v2, v20

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/exp;->q(Lo/exp;I)I

    .line 2309
    :cond_3
    goto/16 :goto_0

    .line 2311
    :cond_4
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 2312
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$3;->d:Lo/exp;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/exp$3;->d:Lo/exp;

    invoke-static {v1}, Lo/exp;->s(Lo/exp;)I

    move-result v1

    div-int/2addr v1, v8

    invoke-static {v0, v1}, Lo/exp;->n(Lo/exp;I)I

    .line 2315
    :cond_5
    const/4 v0, 0x0

    if-eq v0, v9, :cond_6

    .line 2316
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$3;->d:Lo/exp;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/exp$3;->d:Lo/exp;

    invoke-static {v1}, Lo/exp;->u(Lo/exp;)I

    move-result v1

    div-int/2addr v1, v9

    invoke-static {v0, v1}, Lo/exp;->q(Lo/exp;I)I

    .line 2318
    :cond_6
    const-string v0, "UIHLH_FitnessCoreSleepDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMonth BaseTime  mBaseTimeWakeUp = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/exp$3;->d:Lo/exp;

    invoke-static {v3}, Lo/exp;->u(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " , mBaseTimeFall = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lo/exp$3;->d:Lo/exp;

    invoke-static {v3}, Lo/exp;->s(Lo/exp;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2320
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/exp$3;->d:Lo/exp;

    move-object/from16 v1, p0

    iget-wide v1, v1, Lo/exp$3;->e:J

    move-object/from16 v3, p0

    iget-wide v3, v3, Lo/exp$3;->c:J

    move-object/from16 v5, p0

    iget-object v5, v5, Lo/exp$3;->b:Lo/exn$d;

    move-object/from16 v6, p0

    iget-object v6, v6, Lo/exp$3;->a:Lo/egg;

    invoke-static/range {v0 .. v6}, Lo/exp;->b(Lo/exp;JJLo/exn$d;Lo/egg;)V

    .line 2321
    return-void
.end method
