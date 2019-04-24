.class Lo/esr$c;
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
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lo/esr;

.field private c:I


# direct methods
.method private constructor <init>(Lo/esr;I)V
    .locals 0

    .line 348
    iput-object p1, p0, Lo/esr$c;->a:Lo/esr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 349
    iput p2, p0, Lo/esr$c;->c:I

    .line 350
    return-void
.end method

.method synthetic constructor <init>(Lo/esr;ILo/esr$3;)V
    .locals 0

    .line 346
    invoke-direct {p0, p1, p2}, Lo/esr$c;-><init>(Lo/esr;I)V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 353
    if-nez p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_2

    .line 356
    :cond_0
    invoke-static {}, Lo/esr;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LastFitnessCallBack failed err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    invoke-static {}, Lo/esr;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LastFitnessCallBack failed objData may be none."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 358
    iget v0, p0, Lo/esr$c;->c:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 360
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    invoke-static {v0}, Lo/esr;->a(Lo/esr;)V

    goto :goto_0

    .line 362
    :cond_1
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    invoke-static {v0}, Lo/esr;->b(Lo/esr;)V

    .line 364
    :goto_0
    return-void

    .line 366
    :cond_2
    move-object v5, p2

    check-cast v5, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;

    .line 367
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->acquireExerciseStartTime()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/esr;->d(Lo/esr;J)J

    .line 368
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->acquireExerciseEndTime()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/esr;->c(Lo/esr;J)J

    .line 369
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->acquireExerciseDuring()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/esr;->f(Lo/esr;J)J

    .line 370
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->acquireActualCalorie()F

    move-result v1

    float-to-double v1, v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/esr;->d(Lo/esr;Ljava/lang/String;)Ljava/lang/String;

    .line 371
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/esr;->b(Lo/esr;Ljava/lang/String;)Ljava/lang/String;

    .line 372
    const/4 v6, 0x0

    .line 373
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    iget-object v1, p0, Lo/esr$c;->a:Lo/esr;

    invoke-static {v1}, Lo/esr;->k(Lo/esr;)I

    move-result v1

    invoke-static {v0, v1}, Lo/esr;->h(Lo/esr;I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 374
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    invoke-static {v0}, Lo/esr;->f(Lo/esr;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/esr$c;->a:Lo/esr;

    iget-object v1, v1, Lo/esr;->e:Landroid/content/Context;

    invoke-static {v0, v1}, Lo/etp;->e(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 375
    invoke-static {}, Lo/esr;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8fd9\u91cc\u662f\u62c9\u4f38\u8bad\u7ec3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    iget-object v1, p0, Lo/esr$c;->a:Lo/esr;

    invoke-static {v1}, Lo/esr;->g(Lo/esr;)J

    move-result-wide v1

    const-wide/32 v3, 0x36ee80

    add-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lo/esr;->b(Lo/esr;J)J

    .line 377
    const/4 v6, 0x1

    goto :goto_1

    .line 379
    :cond_3
    invoke-static {}, Lo/esr;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e0d\u662f\u62c9\u4f38\u8bad\u7ec3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 383
    :cond_4
    :goto_1
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    invoke-static {v0}, Lo/esr;->h(Lo/esr;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-nez v0, :cond_5

    iget v0, p0, Lo/esr$c;->c:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 385
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    invoke-static {v0}, Lo/esr;->b(Lo/esr;)V

    .line 386
    return-void

    .line 390
    :cond_5
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    invoke-static {v0}, Lo/esr;->g(Lo/esr;)J

    move-result-wide v0

    iget-object v2, p0, Lo/esr$c;->a:Lo/esr;

    invoke-static {v2}, Lo/esr;->h(Lo/esr;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_7

    .line 391
    if-eqz v6, :cond_6

    .line 392
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    iget-object v1, p0, Lo/esr$c;->a:Lo/esr;

    invoke-static {v1}, Lo/esr;->g(Lo/esr;)J

    move-result-wide v1

    const-wide/32 v3, 0x36ee80

    sub-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lo/esr;->b(Lo/esr;J)J

    .line 394
    :cond_6
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    invoke-static {v0}, Lo/esr;->a(Lo/esr;)V

    goto :goto_2

    .line 396
    :cond_7
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lo/esr;->g(Lo/esr;I)I

    .line 397
    if-eqz v6, :cond_8

    .line 398
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    iget-object v1, p0, Lo/esr$c;->a:Lo/esr;

    invoke-static {v1}, Lo/esr;->g(Lo/esr;)J

    move-result-wide v1

    const-wide/32 v3, 0x36ee80

    sub-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lo/esr;->b(Lo/esr;J)J

    .line 400
    :cond_8
    iget-object v0, p0, Lo/esr$c;->a:Lo/esr;

    invoke-static {v0}, Lo/esr;->i(Lo/esr;)V

    .line 403
    :goto_2
    invoke-static {}, Lo/esr;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireDetailFitnessRecord recentRecord = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    return-void
.end method
