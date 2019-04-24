.class Lo/esr$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic d:Lo/esr;


# direct methods
.method private constructor <init>(Lo/esr;)V
    .locals 0

    .line 291
    iput-object p1, p0, Lo/esr$b;->d:Lo/esr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/esr;Lo/esr$3;)V
    .locals 0

    .line 291
    invoke-direct {p0, p1}, Lo/esr$b;-><init>(Lo/esr;)V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 294
    if-eqz p1, :cond_0

    .line 295
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    new-instance v1, Lo/esr$c;

    iget-object v2, p0, Lo/esr$b;->d:Lo/esr;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lo/esr$c;-><init>(Lo/esr;ILo/esr$3;)V

    invoke-static {v0, v1}, Lo/esr;->e(Lo/esr;Lo/esr$c;)Lo/esr$c;

    .line 297
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    .line 298
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v1, p0, Lo/esr$b;->d:Lo/esr;

    invoke-static {v1}, Lo/esr;->e(Lo/esr;)Lo/esr$c;

    move-result-object v5

    .line 297
    const-wide/16 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/brt;->e(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 299
    return-void

    .line 301
    :cond_0
    const/4 v6, 0x0

    .line 303
    move-object v6, p2

    :try_start_0
    check-cast v6, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 307
    goto :goto_0

    .line 304
    :catch_0
    move-exception v7

    .line 305
    const/4 v6, 0x0

    .line 306
    invoke-static {}, Lo/esr;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    :goto_0
    if-nez v6, :cond_1

    .line 310
    invoke-static {}, Lo/esr;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LastTrackCallBack trackData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    new-instance v1, Lo/esr$c;

    iget-object v2, p0, Lo/esr$b;->d:Lo/esr;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lo/esr$c;-><init>(Lo/esr;ILo/esr$3;)V

    invoke-static {v0, v1}, Lo/esr;->e(Lo/esr;Lo/esr$c;)Lo/esr$c;

    .line 313
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    .line 314
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v1, p0, Lo/esr$b;->d:Lo/esr;

    invoke-static {v1}, Lo/esr;->e(Lo/esr;)Lo/esr$c;

    move-result-object v5

    .line 313
    const-wide/16 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/brt;->e(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 315
    return-void

    .line 318
    :cond_1
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestSportType()I

    move-result v1

    invoke-static {v0, v1}, Lo/esr;->e(Lo/esr;I)I

    .line 319
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/esr;->a(Lo/esr;J)J

    .line 320
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v1

    invoke-static {v0, v1}, Lo/esr;->c(Lo/esr;I)I

    .line 321
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v1

    invoke-static {v0, v1}, Lo/esr;->b(Lo/esr;I)I

    .line 322
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestChiefSportDataType()I

    move-result v1

    invoke-static {v0, v1}, Lo/esr;->d(Lo/esr;I)I

    .line 323
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgHeartRate()I

    move-result v1

    invoke-static {v0, v1}, Lo/esr;->a(Lo/esr;I)I

    .line 324
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestEndTime()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/esr;->b(Lo/esr;J)J

    .line 325
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/esr;->e(Lo/esr;J)J

    .line 326
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestCreepingWave()F

    move-result v1

    const/high16 v2, 0x41200000    # 10.0f

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Lo/esr;->c(Lo/esr;F)F

    .line 327
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAvgPace()F

    move-result v1

    invoke-static {v0, v1}, Lo/esr;->b(Lo/esr;F)F

    .line 328
    invoke-static {}, Lo/esr;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u904b\u52d5\u8fd4\u56de\u503c = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    invoke-static {v0}, Lo/esr;->c(Lo/esr;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 330
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/esr;->g(Lo/esr;I)I

    goto :goto_1

    .line 331
    :cond_2
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    invoke-static {v0}, Lo/esr;->c(Lo/esr;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 332
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/esr;->g(Lo/esr;I)I

    goto :goto_1

    .line 334
    :cond_3
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/esr;->g(Lo/esr;I)I

    .line 336
    :goto_1
    iget-object v0, p0, Lo/esr$b;->d:Lo/esr;

    new-instance v1, Lo/esr$c;

    iget-object v2, p0, Lo/esr$b;->d:Lo/esr;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lo/esr$c;-><init>(Lo/esr;ILo/esr$3;)V

    invoke-static {v0, v1}, Lo/esr;->e(Lo/esr;Lo/esr$c;)Lo/esr$c;

    .line 338
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    .line 339
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v1, p0, Lo/esr$b;->d:Lo/esr;

    invoke-static {v1}, Lo/esr;->e(Lo/esr;)Lo/esr$c;

    move-result-object v5

    .line 338
    const-wide/16 v1, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/brt;->e(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 340
    return-void
.end method
