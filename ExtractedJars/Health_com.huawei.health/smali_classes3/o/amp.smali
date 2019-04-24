.class public Lo/amp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:I


# instance fields
.field private a:Ljava/util/concurrent/Semaphore;

.field private b:Landroid/content/Context;

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const/16 v0, 0x7d0

    sput v0, Lo/amp;->d:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/16 v0, 0x2710

    iput v0, p0, Lo/amp;->e:I

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amp;->b:Landroid/content/Context;

    .line 28
    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Lo/amp;->a:Ljava/util/concurrent/Semaphore;

    .line 32
    iput-object p1, p0, Lo/amp;->b:Landroid/content/Context;

    .line 33
    iget-object v0, p0, Lo/amp;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 34
    iget-object v0, p0, Lo/amp;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/amy;->f(Landroid/content/Context;)I

    move-result v0

    iput v0, p0, Lo/amp;->e:I

    .line 36
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/amp;)Ljava/util/concurrent/Semaphore;
    .locals 1

    .line 20
    iget-object v0, p0, Lo/amp;->a:Ljava/util/concurrent/Semaphore;

    return-object v0
.end method

.method static synthetic b(Lo/amp;I)I
    .locals 0

    .line 20
    iput p1, p0, Lo/amp;->e:I

    return p1
.end method

.method static synthetic c(Lo/amp;)I
    .locals 1

    .line 20
    iget v0, p0, Lo/amp;->e:I

    return v0
.end method

.method static synthetic d(Lo/amp;)Landroid/content/Context;
    .locals 1

    .line 20
    iget-object v0, p0, Lo/amp;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public d()V
    .locals 5

    .line 40
    const-string v0, "Step_GoalValue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetch lock"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    :try_start_0
    iget-object v0, p0, Lo/amp;->a:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquire()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    goto :goto_0

    .line 44
    :catch_0
    move-exception v4

    .line 45
    const-string v0, "Step_GoalValue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetch lock get failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    :goto_0
    iget-object v0, p0, Lo/amp;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/amp$2;

    invoke-direct {v1, p0}, Lo/amp$2;-><init>(Lo/amp;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {v0, v2, v3, v1}, Lo/clq;->d(IILo/clz;)V

    .line 78
    return-void
.end method

.method public e()I
    .locals 8

    .line 81
    const/4 v4, 0x0

    .line 82
    const/4 v5, -0x1

    .line 84
    :try_start_0
    iget-object v0, p0, Lo/amp;->a:Ljava/util/concurrent/Semaphore;

    sget v1, Lo/amp;->d:I

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    move v4, v0

    .line 85
    if-eqz v4, :cond_0

    .line 86
    iget v5, p0, Lo/amp;->e:I

    goto :goto_0

    .line 88
    :cond_0
    const/16 v5, 0x2710

    .line 89
    const-string v0, "Step_GoalValue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGoalValue over time"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    :goto_0
    if-eqz v4, :cond_2

    .line 96
    iget-object v0, p0, Lo/amp;->a:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    goto :goto_1

    .line 91
    :catch_0
    move-exception v6

    .line 92
    const/16 v5, 0x2710

    .line 93
    const-string v0, "Step_GoalValue"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGoalValue InterruptedException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    if-eqz v4, :cond_2

    .line 96
    iget-object v0, p0, Lo/amp;->a:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    goto :goto_1

    .line 95
    :catchall_0
    move-exception v7

    if-eqz v4, :cond_1

    .line 96
    iget-object v0, p0, Lo/amp;->a:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 98
    :cond_1
    throw v7

    .line 99
    :cond_2
    :goto_1
    return v5
.end method
