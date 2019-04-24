.class Lo/djf$b;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/djf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic b:Lo/djf;


# direct methods
.method constructor <init>(Lo/djf;)V
    .locals 1

    .line 473
    iput-object p1, p0, Lo/djf$b;->b:Lo/djf;

    .line 474
    const-string v0, "TrafficMonitoringService-RefreshThread"

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 475
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 481
    :cond_0
    iget-object v0, p0, Lo/djf$b;->b:Lo/djf;

    iget-object v1, p0, Lo/djf$b;->b:Lo/djf;

    invoke-static {v1}, Lo/djf;->e(Lo/djf;)Ljava/util/Date;

    move-result-object v1

    invoke-static {v0, v1}, Lo/djf;->c(Lo/djf;Ljava/util/Date;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 483
    const-class v4, Lo/djf;

    monitor-enter v4

    .line 485
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Cross day@RefreshThread"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 486
    const/4 v0, 0x0

    invoke-static {v0}, Lo/djf;->a(Z)V

    .line 488
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Writing yesterday traffic to DB: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/djf;->k()Lo/djd;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 498
    invoke-static {}, Lo/djf;->k()Lo/djd;

    move-result-object v0

    invoke-static {v0}, Lo/djf;->e(Lo/djd;)V

    .line 500
    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 503
    iget-object v0, p0, Lo/djf$b;->b:Lo/djf;

    invoke-static {v0, v5}, Lo/djf;->a(Lo/djf;Ljava/util/Date;)Z

    move-result v6

    .line 504
    invoke-static {v6}, Lo/djf;->b(Z)V

    .line 506
    invoke-static {}, Lo/djf;->i()Lo/diz;

    move-result-object v0

    invoke-static {v5}, Lo/djc;->d(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/diz;->b(Ljava/lang/String;)Lo/djd;

    move-result-object v0

    invoke-static {v0}, Lo/djf;->b(Lo/djd;)Lo/djd;

    .line 507
    invoke-static {}, Lo/djf;->k()Lo/djd;

    move-result-object v0

    if-nez v0, :cond_1

    .line 509
    new-instance v0, Lo/djd;

    invoke-static {v5}, Lo/djc;->d(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/djd;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lo/djf;->b(Lo/djd;)Lo/djd;

    .line 510
    invoke-static {}, Lo/djf;->i()Lo/diz;

    move-result-object v0

    invoke-static {}, Lo/djf;->k()Lo/djd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/diz;->a(Lo/djd;)J

    .line 512
    :cond_1
    iget-object v0, p0, Lo/djf$b;->b:Lo/djf;

    invoke-static {v0, v5}, Lo/djf;->d(Lo/djf;Ljava/util/Date;)Ljava/util/Date;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 513
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 515
    :cond_2
    :goto_0
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateTodayTraffic@refresh thread"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 516
    iget-object v0, p0, Lo/djf$b;->b:Lo/djf;

    invoke-static {v0}, Lo/djf;->d(Lo/djf;)V

    .line 519
    const-wide/32 v0, 0x124f80

    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 522
    goto :goto_1

    .line 520
    :catch_0
    move-exception v4

    .line 521
    const-string v0, "TrafficMonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 523
    :goto_1
    invoke-static {}, Lo/djf;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lo/djf;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 525
    :cond_3
    return-void
.end method
