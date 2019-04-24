.class public Lo/fkh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fkh$e;,
        Lo/fkh$d;
    }
.end annotation


# static fields
.field private static e:Landroid/content/Context;


# instance fields
.field private a:Lo/eeu;

.field private b:Ljava/util/concurrent/ScheduledExecutorService;

.field private c:Lo/cmj;

.field private d:Lo/cmo;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fkh;->a:Lo/eeu;

    .line 135
    new-instance v0, Lo/fkh$1;

    invoke-direct {v0, p0}, Lo/fkh$1;-><init>(Lo/fkh;)V

    iput-object v0, p0, Lo/fkh;->d:Lo/cmo;

    .line 44
    return-void
.end method

.method synthetic constructor <init>(Lo/fkh$5;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lo/fkh;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/fkh;
    .locals 1

    .line 38
    sput-object p0, Lo/fkh;->e:Landroid/content/Context;

    .line 39
    invoke-static {}, Lo/fkh$d;->d()Lo/fkh;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/fkh;)Lo/cmj;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/fkh;->c:Lo/cmj;

    return-object v0
.end method

.method private c()Lo/cmj;
    .locals 4

    .line 111
    iget-object v0, p0, Lo/fkh;->c:Lo/cmj;

    if-nez v0, :cond_0

    .line 112
    invoke-static {}, Lo/cwa;->d()Lo/cmj;

    move-result-object v0

    iput-object v0, p0, Lo/fkh;->c:Lo/cmj;

    .line 114
    iget-object v0, p0, Lo/fkh;->c:Lo/cmj;

    sget-object v1, Lo/fkh;->e:Landroid/content/Context;

    new-instance v2, Lo/fkh$5;

    invoke-direct {v2, p0}, Lo/fkh$5;-><init>(Lo/fkh;)V

    const-string v3, "HuaweiHealth"

    invoke-virtual {v0, v1, v2, v3}, Lo/cmj;->a(Landroid/content/Context;Lo/cmo;Ljava/lang/String;)I

    .line 131
    :cond_0
    iget-object v0, p0, Lo/fkh;->c:Lo/cmj;

    return-object v0
.end method

.method static synthetic d(Lo/fkh;)Lo/cmo;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/fkh;->d:Lo/cmo;

    return-object v0
.end method

.method static synthetic e(Lo/fkh;)Lo/eeu;
    .locals 1

    .line 19
    iget-object v0, p0, Lo/fkh;->a:Lo/eeu;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 97
    iget-object v0, p0, Lo/fkh;->a:Lo/eeu;

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lo/fkh;->a:Lo/eeu;

    invoke-virtual {v0}, Lo/eeu;->a()V

    .line 99
    const-string v0, "Track_VibraStepCounterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopVibraStepsCount: stopCountSteps"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    :cond_0
    iget-object v0, p0, Lo/fkh;->b:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_1

    .line 102
    iget-object v0, p0, Lo/fkh;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 104
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fkh;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 105
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fkh;->c:Lo/cmj;

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fkh;->a:Lo/eeu;

    .line 107
    return-void
.end method

.method public c(III)Z
    .locals 4

    .line 88
    iget-object v0, p0, Lo/fkh;->a:Lo/eeu;

    if-nez v0, :cond_0

    .line 89
    const-string v0, "Track_VibraStepCounterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshWorkoutParameters, stepsCounter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    const/4 v0, 0x0

    return v0

    .line 92
    :cond_0
    iget-object v0, p0, Lo/fkh;->a:Lo/eeu;

    invoke-virtual {v0, p1, p2, p3}, Lo/eeu;->e(III)Z

    move-result v0

    return v0
.end method

.method public d()I
    .locals 4

    .line 68
    iget-object v0, p0, Lo/fkh;->a:Lo/eeu;

    if-nez v0, :cond_0

    .line 69
    const-string v0, "Track_VibraStepCounterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentsteps, stepsCounter is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    const/4 v0, -0x1

    return v0

    .line 72
    :cond_0
    iget-object v0, p0, Lo/fkh;->a:Lo/eeu;

    invoke-virtual {v0}, Lo/eeu;->e()I

    move-result v0

    return v0
.end method

.method public e(Lo/eex;Lo/eey;I)Z
    .locals 8

    .line 47
    sget-object v0, Lo/fkh;->e:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/eeu;->c(Landroid/content/Context;Z)Lo/eeu;

    move-result-object v0

    iput-object v0, p0, Lo/fkh;->a:Lo/eeu;

    .line 48
    iget-object v0, p0, Lo/fkh;->a:Lo/eeu;

    if-nez v0, :cond_0

    .line 49
    const-string v0, "Track_VibraStepCounterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initAndStartVibraStepCount, getInstance of StepsCounter returns null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    const/4 v0, 0x0

    return v0

    .line 52
    :cond_0
    iget-object v0, p0, Lo/fkh;->a:Lo/eeu;

    invoke-virtual {v0, p1, p2, p3}, Lo/eeu;->d(Lo/eex;Lo/eey;I)Z

    move-result v7

    .line 53
    if-eqz v7, :cond_2

    .line 54
    const-string v0, "Track_VibraStepCounterHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "now will start scheduleAtFixedRate for set cur steps from stepCountModule to vibraStepsCounter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    iget-object v0, p0, Lo/fkh;->c:Lo/cmj;

    if-nez v0, :cond_1

    .line 56
    invoke-direct {p0}, Lo/fkh;->c()Lo/cmj;

    move-result-object v0

    iput-object v0, p0, Lo/fkh;->c:Lo/cmj;

    .line 58
    :cond_1
    iget-object v0, p0, Lo/fkh;->b:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v0, :cond_2

    .line 59
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/fkh;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 60
    iget-object v0, p0, Lo/fkh;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lo/fkh$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/fkh$e;-><init>(Lo/fkh;Lo/fkh$5;)V

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x1f4

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 63
    :cond_2
    return v7
.end method
