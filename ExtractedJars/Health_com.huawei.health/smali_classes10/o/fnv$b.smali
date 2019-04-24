.class Lo/fnv$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fnv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field a:Lo/fmu;

.field final synthetic c:Lo/fnv;


# direct methods
.method public constructor <init>(Lo/fnv;Lo/fmu;)V
    .locals 0

    .line 411
    iput-object p1, p0, Lo/fnv$b;->c:Lo/fnv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 412
    iput-object p2, p0, Lo/fnv$b;->a:Lo/fmu;

    .line 413
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 417
    iget-object v0, p0, Lo/fnv$b;->a:Lo/fmu;

    invoke-virtual {v0}, Lo/fmu;->h()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 418
    iget-object v0, p0, Lo/fnv$b;->a:Lo/fmu;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fmu;->d(Z)V

    .line 420
    iget-object v0, p0, Lo/fnv$b;->a:Lo/fmu;

    invoke-virtual {v0}, Lo/fmu;->h()Ljava/util/Queue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fmb;

    .line 422
    iget-object v0, p0, Lo/fnv$b;->c:Lo/fnv;

    invoke-virtual {v0, v5}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->e()I

    move-result v0

    const/4 v1, 0x7

    if-gt v0, v1, :cond_1

    .line 423
    iget-object v0, p0, Lo/fnv$b;->c:Lo/fnv;

    invoke-virtual {v0, v5}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v0

    invoke-virtual {v0}, Lo/fmu;->b()V

    .line 424
    invoke-virtual {v5}, Lo/fmb;->b()Lo/fma;

    move-result-object v0

    invoke-virtual {v0}, Lo/fma;->m()I

    move-result v0

    if-eqz v0, :cond_0

    .line 426
    iget-object v0, p0, Lo/fnv$b;->c:Lo/fnv;

    invoke-virtual {v5}, Lo/fmb;->b()Lo/fma;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Lo/fnv;->d(Lo/fmb;Lo/fma;)V

    goto :goto_0

    .line 427
    :cond_0
    invoke-virtual {v5}, Lo/fmb;->h()Lo/fly;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 429
    iget-object v0, p0, Lo/fnv$b;->c:Lo/fnv;

    invoke-virtual {v5}, Lo/fmb;->h()Lo/fly;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Lo/fnv;->e(Lo/fmb;Lo/fly;)V

    .line 433
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/fnv$b;->c:Lo/fnv;

    iget-object v0, v0, Lo/fnv;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lo/fnv$b;

    iget-object v2, p0, Lo/fnv$b;->c:Lo/fnv;

    iget-object v3, p0, Lo/fnv$b;->c:Lo/fnv;

    invoke-virtual {v3, v5}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lo/fnv$b;-><init>(Lo/fnv;Lo/fmu;)V

    iget-object v2, p0, Lo/fnv$b;->c:Lo/fnv;

    invoke-virtual {v2, v5}, Lo/fnv;->e(Lo/fmb;)Lo/fmu;

    move-result-object v2

    invoke-virtual {v2}, Lo/fmu;->i()J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 438
    goto :goto_1

    .line 439
    :cond_2
    iget-object v0, p0, Lo/fnv$b;->a:Lo/fmu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fmu;->d(Z)V

    .line 441
    :goto_1
    return-void
.end method
