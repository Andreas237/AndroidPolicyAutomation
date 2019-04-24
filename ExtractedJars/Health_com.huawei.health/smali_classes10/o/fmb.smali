.class public Lo/fmb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fmb$e;,
        Lo/fmb$b;
    }
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field private final b:J

.field private volatile c:Lo/fmf;

.field private volatile d:Z

.field private volatile e:Lo/fmg;

.field private volatile f:Lo/fly;

.field private volatile g:Lo/fly;

.field private volatile h:Lo/fma;

.field private volatile i:Lo/fma;

.field private final k:Lo/fmb$b;

.field private volatile l:I

.field private volatile m:Lo/fll;

.field private volatile n:Z

.field private volatile o:I

.field private final p:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<Ljava/util/concurrent/ScheduledFuture<*>;>;"
        }
    .end annotation
.end field

.field private final r:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<Lo/fow;>;"
        }
    .end annotation
.end field

.field private volatile s:Lo/foo;

.field private volatile t:Z

.field private volatile u:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 91
    const-class v0, Lo/fmb;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lo/fmb;->a:Z

    return-void
.end method

.method public constructor <init>(Lo/fma;Lo/fmb$b;)V
    .locals 1

    .line 198
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/fmb;-><init>(Lo/fma;Lo/fmb$b;Lo/fow;)V

    .line 199
    return-void
.end method

.method public constructor <init>(Lo/fma;Lo/fmb$b;Lo/fow;)V
    .locals 2

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fmb;->d:Z

    .line 169
    const/4 v0, 0x0

    iput v0, p0, Lo/fmb;->o:I

    .line 172
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lo/fmb;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 186
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fmb;->t:Z

    .line 188
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lo/fmb;->r:Ljava/util/concurrent/atomic/AtomicReference;

    .line 210
    iput-object p1, p0, Lo/fmb;->i:Lo/fma;

    .line 211
    iput-object p2, p0, Lo/fmb;->k:Lo/fmb$b;

    .line 212
    iget-object v0, p0, Lo/fmb;->r:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 213
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lo/fmb;->b:J

    .line 214
    return-void
.end method


# virtual methods
.method public a()Lo/fmb$b;
    .locals 1

    .line 254
    iget-object v0, p0, Lo/fmb;->k:Lo/fmb$b;

    return-object v0
.end method

.method public a(Lo/flq;)V
    .locals 2

    .line 408
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fmb;->n:Z

    .line 410
    invoke-virtual {p0}, Lo/fmb;->l()V

    .line 412
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/flq;->a(Z)V

    .line 413
    iget-object v1, p0, Lo/fmb;->h:Lo/fma;

    .line 414
    if-eqz v1, :cond_0

    iget-object v0, p0, Lo/fmb;->i:Lo/fma;

    if-ne v0, p1, :cond_0

    if-eq v1, p1, :cond_0

    .line 416
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/fma;->a(Z)V

    .line 418
    :cond_0
    return-void
.end method

.method public a(Lo/fmg;)V
    .locals 0

    .line 484
    iput-object p1, p0, Lo/fmb;->e:Lo/fmg;

    .line 485
    return-void
.end method

.method public b()Lo/fma;
    .locals 1

    .line 292
    iget-object v0, p0, Lo/fmb;->i:Lo/fma;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 433
    iput p1, p0, Lo/fmb;->l:I

    .line 434
    return-void
.end method

.method public b(Lo/fll;)V
    .locals 0

    .line 365
    iput-object p1, p0, Lo/fmb;->m:Lo/fll;

    .line 366
    return-void
.end method

.method public b(Lo/fow;)V
    .locals 3

    .line 622
    iget-object v0, p0, Lo/fmb;->r:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 623
    iget-object v2, p0, Lo/fmb;->e:Lo/fmg;

    .line 624
    if-eqz v2, :cond_0

    .line 625
    invoke-interface {v2, p0}, Lo/fmg;->a(Lo/fmb;)V

    .line 627
    :cond_0
    goto :goto_0

    .line 628
    :cond_1
    iget-object v0, p0, Lo/fmb;->r:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 630
    :goto_0
    return-void
.end method

.method public c()Lo/fma;
    .locals 1

    .line 270
    iget-object v0, p0, Lo/fmb;->h:Lo/fma;

    return-object v0
.end method

.method public c(Ljava/util/concurrent/ScheduledFuture;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/concurrent/ScheduledFuture<*>;)V"
        }
    .end annotation

    .line 442
    iget-object v0, p0, Lo/fmb;->p:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/concurrent/ScheduledFuture;

    .line 443
    if-eqz v1, :cond_0

    .line 444
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 446
    :cond_0
    return-void
.end method

.method public c(Lo/fly;)V
    .locals 0

    .line 322
    iput-object p1, p0, Lo/fmb;->f:Lo/fly;

    .line 323
    return-void
.end method

.method public d(I)V
    .locals 2

    .line 459
    if-ltz p1, :cond_0

    const v0, 0xffffff

    if-le p1, v0, :cond_1

    .line 460
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "illegal observe number"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 462
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lo/fmb;->u:Ljava/lang/Integer;

    .line 463
    return-void
.end method

.method public d(Lo/fma;)V
    .locals 0

    .line 280
    iput-object p1, p0, Lo/fmb;->h:Lo/fma;

    .line 281
    return-void
.end method

.method public d()Z
    .locals 2

    .line 258
    iget-object v0, p0, Lo/fmb;->k:Lo/fmb$b;

    sget-object v1, Lo/fmb$b;->e:Lo/fmb$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()V
    .locals 3

    .line 235
    sget-boolean v0, Lo/fmb;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/fmb;->k:Lo/fmb$b;

    sget-object v1, Lo/fmb$b;->b:Lo/fmb$b;

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 236
    :cond_0
    iget-object v0, p0, Lo/fmb;->h:Lo/fma;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fma;->c(Z)V

    .line 237
    iget-object v0, p0, Lo/fmb;->h:Lo/fma;

    invoke-static {v0}, Lo/flo;->d(Lo/flq;)Lo/flo;

    move-result-object v2

    .line 238
    iget-object v0, p0, Lo/fmb;->c:Lo/fmf;

    invoke-interface {v0, p0, v2}, Lo/fmf;->e(Lo/fmb;Lo/flo;)V

    .line 239
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 425
    iput p1, p0, Lo/fmb;->o:I

    .line 426
    return-void
.end method

.method public e(Lo/fly;)V
    .locals 0

    .line 344
    iput-object p1, p0, Lo/fmb;->g:Lo/fly;

    .line 345
    return-void
.end method

.method public e(Lo/fma;)V
    .locals 0

    .line 302
    iput-object p1, p0, Lo/fmb;->i:Lo/fma;

    .line 303
    return-void
.end method

.method public e(Lo/fmf;)V
    .locals 0

    .line 383
    iput-object p1, p0, Lo/fmb;->c:Lo/fmf;

    .line 384
    return-void
.end method

.method public f()I
    .locals 1

    .line 429
    iget v0, p0, Lo/fmb;->l:I

    return v0
.end method

.method public g()I
    .locals 1

    .line 421
    iget v0, p0, Lo/fmb;->o:I

    return v0
.end method

.method public h()Lo/fly;
    .locals 1

    .line 334
    iget-object v0, p0, Lo/fmb;->g:Lo/fly;

    return-object v0
.end method

.method public i()Lo/fly;
    .locals 1

    .line 313
    iget-object v0, p0, Lo/fmb;->f:Lo/fly;

    return-object v0
.end method

.method public k()Lo/fll;
    .locals 1

    .line 355
    iget-object v0, p0, Lo/fmb;->m:Lo/fll;

    return-object v0
.end method

.method public l()V
    .locals 2

    .line 520
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fmb;->c(Ljava/util/concurrent/ScheduledFuture;)V

    .line 521
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fmb;->d:Z

    .line 522
    iget-object v1, p0, Lo/fmb;->e:Lo/fmg;

    .line 523
    if-eqz v1, :cond_0

    .line 524
    invoke-interface {v1, p0}, Lo/fmg;->c(Lo/fmb;)V

    .line 526
    :cond_0
    return-void
.end method

.method public m()Z
    .locals 1

    .line 503
    iget-boolean v0, p0, Lo/fmb;->d:Z

    return v0
.end method

.method public n()Ljava/lang/Integer;
    .locals 1

    .line 475
    iget-object v0, p0, Lo/fmb;->u:Ljava/lang/Integer;

    return-object v0
.end method

.method public o()V
    .locals 2

    .line 540
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/fmb;->c(Ljava/util/concurrent/ScheduledFuture;)V

    .line 541
    iget-object v1, p0, Lo/fmb;->e:Lo/fmg;

    .line 542
    if-eqz v1, :cond_0

    .line 543
    invoke-interface {v1, p0}, Lo/fmg;->c(Lo/fmb;)V

    .line 545
    :cond_0
    return-void
.end method

.method public p()J
    .locals 5

    .line 565
    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    iget-wide v3, p0, Lo/fmb;->b:J

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public r()Lo/fow;
    .locals 1

    .line 640
    iget-object v0, p0, Lo/fmb;->r:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fow;

    return-object v0
.end method

.method public t()Lo/foo;
    .locals 1

    .line 574
    iget-object v0, p0, Lo/fmb;->s:Lo/foo;

    return-object v0
.end method
