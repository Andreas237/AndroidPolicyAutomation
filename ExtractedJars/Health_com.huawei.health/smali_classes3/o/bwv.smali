.class public Lo/bwv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile e:Lo/bwv;


# instance fields
.field private d:Lo/brq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    const/4 v0, 0x0

    sput-object v0, Lo/bwv;->e:Lo/bwv;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    return-void
.end method

.method public static b()Lo/bwv;
    .locals 4

    .line 28
    sget-object v0, Lo/bwv;->e:Lo/bwv;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 29
    const-class v2, Lo/bwv;

    monitor-enter v2

    .line 30
    :try_start_0
    sget-object v0, Lo/bwv;->e:Lo/bwv;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 31
    new-instance v0, Lo/bwv;

    invoke-direct {v0}, Lo/bwv;-><init>()V

    sput-object v0, Lo/bwv;->e:Lo/bwv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 35
    :cond_1
    :goto_0
    sget-object v0, Lo/bwv;->e:Lo/bwv;

    return-object v0
.end method

.method public static d(Lcom/huawei/health/suggestion/model/OperationPage;)Z
    .locals 6

    .line 59
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 60
    const/4 v0, 0x0

    return v0

    .line 62
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/model/OperationPage;->acquireUrl()Ljava/lang/String;

    move-result-object v1

    .line 63
    const/4 v0, 0x0

    if-eq v0, v1, :cond_1

    const-string v0, "huaweischeme://healthapp/fitnesspage"

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 64
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 65
    const-string v0, "id"

    invoke-virtual {v2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 66
    const-string v0, "version"

    invoke-virtual {v2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 67
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 68
    new-instance v5, Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-direct {v5}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;-><init>()V

    .line 69
    invoke-virtual {v5, v3}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveId(Ljava/lang/String;)V

    .line 70
    invoke-virtual {v5, v4}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->saveVersion(Ljava/lang/String;)V

    .line 71
    invoke-static {}, Lo/bry;->e()Lo/bry;

    move-result-object v0

    invoke-virtual {v0, p0, v5}, Lo/bry;->a(Lcom/huawei/health/suggestion/model/OperationPage;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V

    .line 72
    const/4 v0, 0x1

    return v0

    .line 75
    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public e(Lcom/huawei/health/suggestion/model/OperationPage;)V
    .locals 3

    .line 39
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 40
    return-void

    .line 42
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/OperationPage;->acquireUrl()Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-static {p1}, Lo/bwv;->d(Lcom/huawei/health/suggestion/model/OperationPage;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 44
    return-void

    .line 47
    :cond_1
    invoke-static {}, Lo/brp;->e()Lo/brr;

    move-result-object v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    invoke-interface {v2}, Lo/brr;->b()Lo/brq;

    move-result-object v0

    iput-object v0, p0, Lo/bwv;->d:Lo/brq;

    .line 52
    :cond_2
    iget-object v0, p0, Lo/bwv;->d:Lo/brq;

    if-eqz v0, :cond_3

    .line 53
    iget-object v0, p0, Lo/bwv;->d:Lo/brq;

    invoke-interface {v0, v1}, Lo/brq;->c(Ljava/lang/String;)V

    .line 56
    :cond_3
    return-void
.end method
