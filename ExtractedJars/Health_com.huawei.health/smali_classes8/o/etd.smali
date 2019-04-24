.class public Lo/etd;
.super Lo/esz;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/etd$e;,
        Lo/etd$a;
    }
.end annotation


# static fields
.field static a:Z

.field static d:Z

.field static e:Z


# instance fields
.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/etg;>;"
        }
    .end annotation
.end field

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/etg;>;"
        }
    .end annotation
.end field

.field private h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/etg;>;"
        }
    .end annotation
.end field

.field private k:Lo/etf;

.field private l:Lcom/huawei/health/suggestion/model/Plan;

.field private m:Landroid/os/Handler;

.field private n:Lcom/huawei/health/suggestion/model/Plan;

.field private o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/etg;>;"
        }
    .end annotation
.end field

.field private p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/etg;>;"
        }
    .end annotation
.end field

.field private q:Z

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/etg;>;"
        }
    .end annotation
.end field

.field private s:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fil;>;"
        }
    .end annotation
.end field

.field private u:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 81
    const/4 v0, 0x0

    sput-boolean v0, Lo/etd;->a:Z

    .line 82
    const/4 v0, 0x0

    sput-boolean v0, Lo/etd;->e:Z

    .line 83
    const/4 v0, 0x0

    sput-boolean v0, Lo/etd;->d:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 115
    invoke-direct {p0, p1}, Lo/esz;-><init>(Landroid/content/Context;)V

    .line 71
    new-instance v0, Lo/etd$a;

    invoke-direct {v0, p0}, Lo/etd$a;-><init>(Lo/etd;)V

    iput-object v0, p0, Lo/etd;->m:Landroid/os/Handler;

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/etd;->r:Ljava/util/List;

    .line 73
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/etd;->u:Ljava/util/concurrent/ExecutorService;

    .line 84
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/etd;->q:Z

    .line 116
    const-string v0, "Suggestion_TodoCardData-TodoCardData constructor enter"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 117
    invoke-static {p1}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    move-result-object v0

    iput-object v0, p0, Lo/etd;->s:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    .line 120
    iget-object v0, p0, Lo/etd;->u:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/etd$1;

    invoke-direct {v1, p0}, Lo/etd$1;-><init>(Lo/etd;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 126
    const-string v0, "Suggestion_TodoCardData-TodoCardData constructor end"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 127
    return-void
.end method

.method private a(Lcom/huawei/health/suggestion/model/Plan;Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/suggestion/model/Plan;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;"
        }
    .end annotation

    .line 540
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Plan;->acquireWorkouts()Ljava/util/List;

    move-result-object v4

    .line 541
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 542
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 543
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 544
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDate()Ljava/lang/String;

    move-result-object v0

    const-string v1, "yyyy-MM-dd"

    invoke-static {v0, v1}, Lo/bzv;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 546
    invoke-virtual {p2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 548
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popWorkoutId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 549
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 551
    :cond_0
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==today have workouts: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 542
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 554
    :cond_2
    return-object v5
.end method

.method private a(Lo/fil;)Lo/etg;
    .locals 7

    .line 478
    new-instance v4, Lo/etg;

    invoke-direct {v4}, Lo/etg;-><init>()V

    .line 479
    invoke-virtual {p1}, Lo/fil;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/etg;->c(Ljava/lang/String;)V

    .line 480
    invoke-virtual {p1}, Lo/fil;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 481
    invoke-virtual {p1}, Lo/fil;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/etg;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 483
    :cond_0
    invoke-virtual {p1}, Lo/fil;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/etg;->b(Ljava/lang/String;)V

    .line 485
    :goto_0
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lo/etg;->a(I)V

    .line 487
    :try_start_0
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 488
    const-string v0, "GMT"

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 489
    invoke-virtual {p1}, Lo/fil;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    .line 490
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/etg;->b(J)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 493
    goto :goto_1

    .line 491
    :catch_0
    move-exception v5

    .line 492
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u683c\u5f0f\u65e5\u671f\u51fa\u9519:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 494
    :goto_1
    invoke-virtual {v4, p1}, Lo/etg;->b(Lo/fil;)V

    .line 495
    return-object v4
.end method

.method private a(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 8

    .line 520
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handlerFitnessPlanData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 522
    return-void

    .line 525
    :cond_0
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 527
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    .line 528
    invoke-direct {p0, p1, v5}, Lo/etd;->a(Lcom/huawei/health/suggestion/model/Plan;Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    .line 529
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/suggestion/model/PlanWorkout;

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    .line 530
    :goto_0
    if-nez v7, :cond_2

    .line 531
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rest day"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 533
    :cond_2
    invoke-direct {p0, v7}, Lo/etd;->c(Lcom/huawei/health/suggestion/model/PlanWorkout;)V

    .line 536
    :goto_1
    return-void
.end method

.method private a(Lcom/huawei/health/suggestion/model/PlanWorkout;)V
    .locals 8

    .line 581
    iget-object v0, p0, Lo/etd;->l:Lcom/huawei/health/suggestion/model/Plan;

    invoke-direct {p0, v0}, Lo/etd;->b(Lcom/huawei/health/suggestion/model/Plan;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 582
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "today run task has done"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 584
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popName()Ljava/lang/String;

    move-result-object v4

    .line 585
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 586
    iget-object v0, p0, Lo/etd;->l:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v5

    .line 587
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runPlanName:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, "todayName:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 588
    new-instance v6, Lo/etg;

    invoke-direct {v6}, Lo/etg;-><init>()V

    .line 589
    invoke-virtual {v6, v5}, Lo/etg;->c(Ljava/lang/String;)V

    .line 590
    invoke-virtual {v6, v4}, Lo/etg;->b(Ljava/lang/String;)V

    .line 593
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->b()I

    move-result v7

    .line 594
    int-to-long v0, v7

    invoke-virtual {v6, v0, v1}, Lo/etg;->b(J)V

    .line 595
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lo/etg;->a(I)V

    .line 596
    iget-object v0, p0, Lo/etd;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 599
    :cond_1
    :goto_0
    return-void
.end method

.method private static a(Lo/etd;)V
    .locals 4

    .line 241
    sget-boolean v0, Lo/etd;->e:Z

    if-eqz v0, :cond_0

    sget-boolean v0, Lo/etd;->a:Z

    if-eqz v0, :cond_0

    sget-boolean v0, Lo/etd;->d:Z

    if-eqz v0, :cond_0

    .line 242
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mRunPlanReached && mRunPlanReached && mActivityReached"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 243
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/etd;->q:Z

    .line 244
    invoke-direct {p0}, Lo/etd;->f()V

    .line 245
    invoke-direct {p0}, Lo/etd;->i()V

    .line 247
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/etd;Z)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Lo/etd;->c(Z)V

    return-void
.end method

.method static synthetic b(Lo/etd;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 0

    .line 60
    iput-object p1, p0, Lo/etd;->l:Lcom/huawei/health/suggestion/model/Plan;

    return-object p1
.end method

.method static synthetic b(Lo/etd;)Ljava/util/List;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/etd;->t:Ljava/util/List;

    return-object v0
.end method

.method private b()V
    .locals 1

    .line 182
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/etd;->g:Ljava/util/ArrayList;

    .line 183
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/etd;->f:Ljava/util/ArrayList;

    .line 184
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/etd;->h:Ljava/util/ArrayList;

    .line 185
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/etd;->p:Ljava/util/ArrayList;

    .line 186
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/etd;->o:Ljava/util/ArrayList;

    .line 187
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/etd;->t:Ljava/util/List;

    .line 191
    invoke-direct {p0}, Lo/etd;->h()V

    .line 192
    return-void
.end method

.method private b(Lcom/huawei/health/suggestion/model/Plan;)Z
    .locals 1

    .line 619
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/brt;->b(Lcom/huawei/health/suggestion/model/Plan;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 620
    const/4 v0, 0x1

    return v0

    .line 622
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lo/etd;)Landroid/os/Handler;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/etd;->m:Landroid/os/Handler;

    return-object v0
.end method

.method private c(Lcom/huawei/health/suggestion/model/PlanWorkout;)V
    .locals 7

    .line 559
    invoke-direct {p0}, Lo/etd;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 560
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "today fitness plan finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 562
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/PlanWorkout;->popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->acquireDayTitle()Ljava/lang/String;

    move-result-object v4

    .line 563
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dayTitle:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 564
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 565
    iget-object v0, p0, Lo/etd;->n:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->acquireName()Ljava/lang/String;

    move-result-object v5

    .line 566
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitnessName:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    new-instance v6, Lo/etg;

    invoke-direct {v6}, Lo/etg;-><init>()V

    .line 568
    invoke-virtual {v6, v5}, Lo/etg;->c(Ljava/lang/String;)V

    .line 569
    invoke-virtual {v6, v4}, Lo/etg;->b(Ljava/lang/String;)V

    .line 570
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/etg;->a(I)V

    .line 571
    iget-object v0, p0, Lo/etd;->n:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/Plan;->getRemindTime()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v6, v0, v1}, Lo/etg;->b(J)V

    .line 572
    iget-object v0, p0, Lo/etd;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 574
    goto :goto_0

    .line 575
    :cond_1
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dayTitle == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 578
    :goto_0
    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/etg;>;)V"
        }
    .end annotation

    .line 451
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 452
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "todoModes.size():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    iget-object v0, p0, Lo/etd;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 455
    :cond_0
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "todoModes.size():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 457
    :goto_0
    return-void
.end method

.method private c(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/etg;>;Ljava/util/List<Lo/etg;>;Ljava/util/List<Lo/etg;>;Ljava/util/List<Lo/etg;>;Ljava/util/List<Lo/etg;>;)V"
        }
    .end annotation

    .line 443
    invoke-direct {p0, p1}, Lo/etd;->c(Ljava/util/List;)V

    .line 444
    invoke-direct {p0, p2}, Lo/etd;->c(Ljava/util/List;)V

    .line 445
    invoke-direct {p0, p3}, Lo/etd;->c(Ljava/util/List;)V

    .line 446
    invoke-direct {p0, p4}, Lo/etd;->c(Ljava/util/List;)V

    .line 447
    invoke-direct {p0, p5}, Lo/etd;->c(Ljava/util/List;)V

    .line 448
    return-void
.end method

.method private c(Z)V
    .locals 4

    .line 295
    iget-boolean v0, p0, Lo/etd;->q:Z

    if-nez v0, :cond_0

    .line 296
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getPlanData mRequestReached:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/etd;->q:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    return-void

    .line 299
    :cond_0
    invoke-direct {p0}, Lo/etd;->k()V

    .line 300
    const-string v0, "Suggestion_TodoCardData-getPlanData enter"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 303
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    new-instance v1, Lo/etd$2;

    invoke-direct {v1, p0}, Lo/etd$2;-><init>(Lo/etd;)V

    invoke-virtual {v0, v1}, Lo/brt;->e(Lo/bui;)V

    .line 326
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-virtual {v0}, Lo/brt;->l()Z

    move-result v0

    if-nez v0, :cond_1

    .line 327
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not in chinese or isOversea"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    const/4 v0, 0x0

    iput-object v0, p0, Lo/etd;->n:Lcom/huawei/health/suggestion/model/Plan;

    .line 329
    iget-object v0, p0, Lo/etd;->m:Landroid/os/Handler;

    const/16 v1, 0x6a

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 331
    :cond_1
    const-string v0, "Suggestion_TodoCardDatagetCurrentFitnessPlan enter"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 332
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    new-instance v1, Lo/etd$4;

    invoke-direct {v1, p0}, Lo/etd$4;-><init>(Lo/etd;)V

    invoke-virtual {v0, v1}, Lo/brt;->b(Lo/bui;)V

    .line 353
    :goto_0
    invoke-direct {p0, p1}, Lo/etd;->e(Z)V

    .line 355
    return-void
.end method

.method private c()Z
    .locals 4

    .line 139
    iget-object v0, p0, Lo/etd;->s:Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/npsstate/NpsUserShowController;->isShowNps()Z

    move-result v3

    .line 140
    const-string v0, "NpsUserShowController"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "todoCardData isShowNps: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    return v3
.end method

.method private d(Lcom/huawei/health/suggestion/model/Plan;)V
    .locals 8

    .line 499
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleRunPlanData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 501
    return-void

    .line 504
    :cond_0
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 506
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    .line 507
    invoke-direct {p0, p1, v5}, Lo/etd;->a(Lcom/huawei/health/suggestion/model/Plan;Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    .line 508
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/suggestion/model/PlanWorkout;

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    .line 510
    :goto_0
    if-nez v7, :cond_2

    .line 511
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rest day"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 513
    :cond_2
    invoke-direct {p0, v7}, Lo/etd;->a(Lcom/huawei/health/suggestion/model/PlanWorkout;)V

    .line 517
    :goto_1
    return-void
.end method

.method static synthetic d(Lo/etd;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Lo/etd;->b()V

    return-void
.end method

.method static synthetic e(Lo/etd;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 0

    .line 60
    iput-object p1, p0, Lo/etd;->n:Lcom/huawei/health/suggestion/model/Plan;

    return-object p1
.end method

.method static synthetic e(Lo/etd;)V
    .locals 0

    .line 60
    invoke-static {p0}, Lo/etd;->a(Lo/etd;)V

    return-void
.end method

.method private e(Z)V
    .locals 5

    .line 362
    const/4 v4, 0x0

    .line 363
    iget-object v0, p0, Lo/etd;->k:Lo/etf;

    if-eqz v0, :cond_0

    .line 364
    iget-object v0, p0, Lo/etd;->k:Lo/etf;

    invoke-virtual {v0}, Lo/etf;->a()Z

    move-result v4

    .line 366
    :cond_0
    if-eqz p1, :cond_1

    if-nez v4, :cond_1

    .line 367
    iget-object v0, p0, Lo/etd;->m:Landroid/os/Handler;

    const/16 v1, 0x6b

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 369
    :cond_1
    iget-object v0, p0, Lo/etd;->k:Lo/etf;

    if-eqz v0, :cond_2

    .line 370
    iget-object v0, p0, Lo/etd;->k:Lo/etf;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/etf;->b(Z)V

    .line 373
    :cond_2
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 375
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Utils.isOversea()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 376
    iget-object v0, p0, Lo/etd;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 377
    iget-object v0, p0, Lo/etd;->m:Landroid/os/Handler;

    const/16 v1, 0x6b

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 378
    return-void

    .line 380
    :cond_3
    invoke-static {}, Lo/eta;->a()Lo/eta;

    move-result-object v0

    new-instance v1, Lo/etd$3;

    invoke-direct {v1, p0}, Lo/etd$3;-><init>(Lo/etd;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3, v1}, Lo/eta;->b(IZLo/etc;)V

    .line 395
    :goto_0
    return-void
.end method

.method private e()Z
    .locals 5

    .line 151
    const/4 v4, 0x0

    .line 152
    iget-object v0, p0, Lo/etd;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Lo/etd;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    iget-object v0, p0, Lo/etd;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->getInstance(Landroid/content/Context;)Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->isShowToDo()Z

    move-result v4

    .line 157
    :cond_0
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isShowDeviceNps:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    return v4
.end method

.method private f()V
    .locals 6

    .line 410
    iget-object v0, p0, Lo/etd;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 411
    iget-object v0, p0, Lo/etd;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 412
    iget-object v0, p0, Lo/etd;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 413
    iget-object v0, p0, Lo/etd;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 414
    iget-object v0, p0, Lo/etd;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 415
    iget-object v0, p0, Lo/etd;->l:Lcom/huawei/health/suggestion/model/Plan;

    invoke-direct {p0, v0}, Lo/etd;->d(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 416
    iget-object v0, p0, Lo/etd;->n:Lcom/huawei/health/suggestion/model/Plan;

    invoke-direct {p0, v0}, Lo/etd;->a(Lcom/huawei/health/suggestion/model/Plan;)V

    .line 417
    invoke-direct {p0}, Lo/etd;->m()V

    .line 418
    invoke-direct {p0}, Lo/etd;->g()V

    .line 419
    move-object v0, p0

    iget-object v1, p0, Lo/etd;->r:Ljava/util/List;

    iget-object v2, p0, Lo/etd;->h:Ljava/util/ArrayList;

    iget-object v3, p0, Lo/etd;->f:Ljava/util/ArrayList;

    iget-object v4, p0, Lo/etd;->p:Ljava/util/ArrayList;

    iget-object v5, p0, Lo/etd;->o:Ljava/util/ArrayList;

    invoke-direct/range {v0 .. v5}, Lo/etd;->c(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 420
    return-void
.end method

.method private g()V
    .locals 5

    .line 426
    invoke-direct {p0}, Lo/etd;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 427
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showHealthNps"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 428
    new-instance v4, Lo/etg;

    invoke-direct {v4}, Lo/etg;-><init>()V

    .line 429
    const-string v0, "\u8fd0\u52a8\u5065\u5eb7\u7528\u6237\u4f53\u9a8c\u95ee\u5377\u8c03\u67e5"

    invoke-virtual {v4, v0}, Lo/etg;->b(Ljava/lang/String;)V

    .line 430
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lo/etg;->a(I)V

    .line 431
    iget-object v0, p0, Lo/etd;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 432
    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lo/etd;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 433
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ShowDeviceNps"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    new-instance v4, Lo/etg;

    invoke-direct {v4}, Lo/etg;-><init>()V

    .line 435
    const-string v0, "\u7a7f\u6234\u8bbe\u5907\u7528\u6237\u4f53\u9a8c\u95ee\u5377\u8c03\u67e5"

    invoke-virtual {v4, v0}, Lo/etg;->b(Ljava/lang/String;)V

    .line 436
    const/4 v0, 0x4

    invoke-virtual {v4, v0}, Lo/etg;->a(I)V

    .line 437
    iget-object v0, p0, Lo/etd;->o:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 439
    :cond_1
    :goto_0
    return-void
.end method

.method private h()V
    .locals 2

    .line 278
    const-string v0, "sportSuggestUrl"

    new-instance v1, Lo/etd$5;

    invoke-direct {v1, p0}, Lo/etd$5;-><init>(Lo/etd;)V

    invoke-static {v0, v1}, Lo/bzu$c;->e(Ljava/lang/String;Lo/cza;)V

    .line 291
    return-void
.end method

.method private i()V
    .locals 4

    .line 250
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshUi"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    iget-object v0, p0, Lo/etd;->k:Lo/etf;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 252
    iget-object v0, p0, Lo/etd;->g:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/etd;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 253
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mTodoCardRecyModels.size:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/etd;->g:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    iget-object v0, p0, Lo/etd;->k:Lo/etf;

    iget-object v1, p0, Lo/etd;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lo/etf;->d(Ljava/util/List;)V

    goto :goto_0

    .line 256
    :cond_0
    iget-object v0, p0, Lo/etd;->k:Lo/etf;

    invoke-virtual {v0}, Lo/etf;->b()V

    goto :goto_0

    .line 259
    :cond_1
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == mTodoCardViewHolder"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    :goto_0
    return-void
.end method

.method private k()V
    .locals 1

    .line 398
    const/4 v0, 0x0

    sput-boolean v0, Lo/etd;->a:Z

    .line 399
    const/4 v0, 0x0

    sput-boolean v0, Lo/etd;->e:Z

    .line 400
    const/4 v0, 0x0

    sput-boolean v0, Lo/etd;->d:Z

    .line 401
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/etd;->q:Z

    .line 402
    iget-object v0, p0, Lo/etd;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 403
    iget-object v0, p0, Lo/etd;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 404
    iget-object v0, p0, Lo/etd;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 405
    iget-object v0, p0, Lo/etd;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 406
    iget-object v0, p0, Lo/etd;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 407
    return-void
.end method

.method private m()V
    .locals 4

    .line 464
    iget-object v0, p0, Lo/etd;->t:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/etd;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 465
    iget-object v0, p0, Lo/etd;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/fil;

    .line 466
    if-eqz v3, :cond_0

    .line 467
    iget-object v0, p0, Lo/etd;->p:Ljava/util/ArrayList;

    invoke-direct {p0, v3}, Lo/etd;->a(Lo/fil;)Lo/etg;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 469
    :cond_0
    goto :goto_0

    .line 470
    :cond_1
    iget-object v0, p0, Lo/etd;->p:Ljava/util/ArrayList;

    new-instance v1, Lo/etd$e;

    invoke-direct {v1}, Lo/etd$e;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 472
    :cond_2
    return-void
.end method

.method private n()Z
    .locals 4

    .line 610
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/brt;->d(J)I

    move-result v3

    .line 611
    const/4 v0, 0x2

    if-eq v0, v3, :cond_0

    const/4 v0, 0x1

    if-ne v0, v3, :cond_1

    .line 612
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 614
    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 174
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    return-void
.end method

.method public b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 2

    .line 197
    const-string v0, "Suggestion_TodoCardData"

    const-string v1, "-getCardViewHolder enter"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    invoke-super {p0, p1, p2}, Lo/esz;->b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;

    move-result-object v0

    check-cast v0, Lo/etf;

    iput-object v0, p0, Lo/etd;->k:Lo/etf;

    .line 200
    invoke-direct {p0}, Lo/etd;->i()V

    .line 201
    const-string v0, "Suggestion_TodoCardData"

    const-string v1, "-getCardViewHolder end"

    invoke-static {v0, v1}, Lo/dbf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    iget-object v0, p0, Lo/etd;->k:Lo/etf;

    return-object v0
.end method

.method public d()V
    .locals 4

    .line 164
    invoke-super {p0}, Lo/esz;->d()V

    .line 165
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onresume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    iget-object v0, p0, Lo/etd;->k:Lo/etf;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 168
    const-string v0, "Suggestion_TodoCardData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mRequestReached:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/etd;->q:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/etd;->c(Z)V

    .line 171
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 274
    return-void
.end method
