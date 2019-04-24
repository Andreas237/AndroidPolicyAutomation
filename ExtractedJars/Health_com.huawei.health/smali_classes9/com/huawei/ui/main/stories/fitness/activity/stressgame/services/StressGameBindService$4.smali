.class Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V
    .locals 0

    .line 339
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 342
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->i(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 343
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 344
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "begin mTimerTask System.currentTimeMillis()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->g(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I

    .line 346
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TimerTask mHeartRateMeasureTimerCounter == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->l(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TimerTask dataSize == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->o(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I

    move-result v9

    .line 350
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->l(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I

    move-result v0

    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b()I

    move-result v1

    const/16 v2, 0xb4

    div-int v1, v2, v1

    if-lt v0, v1, :cond_2

    .line 351
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6d4b\u91cf\u6b63\u5e38\u7ed3\u675f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/exb;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 355
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/exb;

    move-result-object v0

    const/high16 v1, 0x42c80000    # 100.0f

    invoke-interface {v0, v1}, Lo/exb;->a(F)V

    .line 357
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/eww;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/eww;

    move-result-object v0

    invoke-interface {v0}, Lo/eww;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/eww;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/eww;->b(Z)V

    .line 359
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d(I)V

    .line 360
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " \u6d4b\u91cf\u6b63\u5e38\u7ed3\u675f \u5173\u95ed\u8bbe\u5907"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 363
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->h(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V

    .line 364
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/eww;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/eww;

    move-result-object v0

    invoke-interface {v0}, Lo/eww;->d()Z

    move-result v0

    if-nez v0, :cond_8

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/eww;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/eww;->d(Z)V

    .line 366
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " \u6d4b\u91cf\u6b63\u5e38\u7ed3\u675f\u8fdb\u5165stopTimer()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 367
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->e()V

    goto/16 :goto_0

    .line 371
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;J)J

    .line 372
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fourSecondCycleTime"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->l(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    .line 376
    invoke-static {v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->n(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->p(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)J

    move-result-wide v3

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->b(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;JJ)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I

    move-result v0

    if-lez v0, :cond_7

    .line 377
    :cond_4
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter is12SecondWithoutData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/exb;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 379
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->f(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/exb;

    move-result-object v0

    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->c()I

    move-result v1

    int-to-float v1, v1

    invoke-interface {v0, v1}, Lo/exb;->a(F)V

    .line 381
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/eww;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/eww;

    move-result-object v0

    invoke-interface {v0}, Lo/eww;->b()Z

    move-result v0

    if-nez v0, :cond_6

    .line 382
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/eww;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/eww;->b(Z)V

    .line 383
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "12\u79d2\u63a5\u6536\u4e0d\u5230\u6570\u636e  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d(I)V

    .line 388
    :cond_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->h(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V

    .line 389
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/eww;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/eww;

    move-result-object v0

    invoke-interface {v0}, Lo/eww;->d()Z

    move-result v0

    if-nez v0, :cond_8

    .line 390
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->m(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)Lo/eww;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/eww;->d(Z)V

    .line 391
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " 12\u79d2\u63a5\u6536\u4e0d\u5230\u6570\u636e \u8fdb\u5165stopTimer()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->e()V

    goto :goto_0

    .line 395
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I

    move-result v0

    if-ne v9, v0, :cond_8

    .line 396
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "algcallback  == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "callbackCounter == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->c(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 397
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService$4;->b:Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->h(Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;)V

    .line 401
    :cond_8
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    .line 402
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "end mTimerTask System.currentTimeMillis()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    invoke-static {}, Lcom/huawei/ui/main/stories/fitness/activity/stressgame/services/StressGameBindService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "end mTimerTask System.currentTimeMillis()- begin mTimerTask System.currentTimeMillis()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-long v3, v10, v7

    const-wide/16 v5, 0x3e8

    div-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    :cond_9
    return-void
.end method
