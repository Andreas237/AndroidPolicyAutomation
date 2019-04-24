.class Lcom/moat/analytics/mobile/spck/x;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/moat/analytics/mobile/spck/x$b;,
        Lcom/moat/analytics/mobile/spck/x$e;,
        Lcom/moat/analytics/mobile/spck/x$c;,
        Lcom/moat/analytics/mobile/spck/x$a;,
        Lcom/moat/analytics/mobile/spck/x$d;
    }
.end annotation


# static fields
.field private static g:Lcom/moat/analytics/mobile/spck/x;

.field private static final h:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/moat/analytics/mobile/spck/x$c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field volatile a:Lcom/moat/analytics/mobile/spck/x$d;

.field volatile b:Z

.field volatile c:Z

.field volatile d:I

.field private e:J

.field private f:J

.field private i:Landroid/os/Handler;

.field private final j:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private volatile k:J

.field private final l:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final m:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    sput-object v0, Lcom/moat/analytics/mobile/spck/x;->h:Ljava/util/Queue;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0x1b7740

    iput-wide v0, p0, Lcom/moat/analytics/mobile/spck/x;->e:J

    const-wide/32 v0, 0xea60

    iput-wide v0, p0, Lcom/moat/analytics/mobile/spck/x;->f:J

    sget-object v0, Lcom/moat/analytics/mobile/spck/x$d;->a:Lcom/moat/analytics/mobile/spck/x$d;

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/x;->a:Lcom/moat/analytics/mobile/spck/x$d;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/moat/analytics/mobile/spck/x;->b:Z

    iput-boolean v0, p0, Lcom/moat/analytics/mobile/spck/x;->c:Z

    const/16 v1, 0xc8

    iput v1, p0, Lcom/moat/analytics/mobile/spck/x;->d:I

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/moat/analytics/mobile/spck/x;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/moat/analytics/mobile/spck/x;->k:J

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Lcom/moat/analytics/mobile/spck/x;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lcom/moat/analytics/mobile/spck/x;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    :try_start_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/x;->i:Landroid/os/Handler;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Lcom/moat/analytics/mobile/spck/n;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method static synthetic a(Lcom/moat/analytics/mobile/spck/x;J)J
    .locals 0

    iput-wide p1, p0, Lcom/moat/analytics/mobile/spck/x;->k:J

    return-wide p1
.end method

.method static declared-synchronized a()Lcom/moat/analytics/mobile/spck/x;
    .locals 2

    const-class v0, Lcom/moat/analytics/mobile/spck/x;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/moat/analytics/mobile/spck/x;->g:Lcom/moat/analytics/mobile/spck/x;

    if-nez v1, :cond_0

    new-instance v1, Lcom/moat/analytics/mobile/spck/x;

    invoke-direct {v1}, Lcom/moat/analytics/mobile/spck/x;-><init>()V

    sput-object v1, Lcom/moat/analytics/mobile/spck/x;->g:Lcom/moat/analytics/mobile/spck/x;

    :cond_0
    sget-object v1, Lcom/moat/analytics/mobile/spck/x;->g:Lcom/moat/analytics/mobile/spck/x;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private a(J)V
    .locals 3

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/x;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x3

    const-string v1, "OnOff"

    const-string v2, "Performing status check."

    invoke-static {v0, v1, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/moat/analytics/mobile/spck/x$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/moat/analytics/mobile/spck/x$1;-><init>(Lcom/moat/analytics/mobile/spck/x;J)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method static synthetic a(Lcom/moat/analytics/mobile/spck/x;)V
    .locals 0

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/x;->d()V

    return-void
.end method

.method static synthetic b(Lcom/moat/analytics/mobile/spck/x;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/moat/analytics/mobile/spck/x;->i:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic b(Lcom/moat/analytics/mobile/spck/x;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/moat/analytics/mobile/spck/x;->a(J)V

    return-void
.end method

.method static synthetic c()Ljava/util/Queue;
    .locals 1

    sget-object v0, Lcom/moat/analytics/mobile/spck/x;->h:Ljava/util/Queue;

    return-object v0
.end method

.method static synthetic c(Lcom/moat/analytics/mobile/spck/x;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/moat/analytics/mobile/spck/x;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static synthetic d(Lcom/moat/analytics/mobile/spck/x;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/moat/analytics/mobile/spck/x;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method private d()V
    .locals 8

    sget-object v0, Lcom/moat/analytics/mobile/spck/x;->h:Ljava/util/Queue;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget-object v3, Lcom/moat/analytics/mobile/spck/x;->h:Ljava/util/Queue;

    invoke-interface {v3}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/moat/analytics/mobile/spck/x$c;

    iget-object v4, v4, Lcom/moat/analytics/mobile/spck/x$c;->a:Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long v4, v1, v4

    const-wide/32 v6, 0xea60

    cmp-long v4, v4, v6

    if-ltz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    sget-object v1, Lcom/moat/analytics/mobile/spck/x;->h:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->size()I

    move-result v1

    const/16 v2, 0xf

    if-lt v1, v2, :cond_2

    const/4 v1, 0x0

    :goto_1
    const/4 v2, 0x5

    if-ge v1, v2, :cond_2

    sget-object v2, Lcom/moat/analytics/mobile/spck/x;->h:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method static synthetic e(Lcom/moat/analytics/mobile/spck/x;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lcom/moat/analytics/mobile/spck/x;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method private e()V
    .locals 4

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/x;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/moat/analytics/mobile/spck/x$2;

    invoke-direct {v0, p0}, Lcom/moat/analytics/mobile/spck/x$2;-><init>(Lcom/moat/analytics/mobile/spck/x;)V

    iget-object v1, p0, Lcom/moat/analytics/mobile/spck/x;->i:Landroid/os/Handler;

    const-wide/32 v2, 0xea60

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method static synthetic f(Lcom/moat/analytics/mobile/spck/x;)J
    .locals 2

    iget-wide v0, p0, Lcom/moat/analytics/mobile/spck/x;->f:J

    return-wide v0
.end method


# virtual methods
.method a(Lcom/moat/analytics/mobile/spck/x$b;)V
    .locals 4

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/x;->a:Lcom/moat/analytics/mobile/spck/x$d;

    sget-object v1, Lcom/moat/analytics/mobile/spck/x$d;->b:Lcom/moat/analytics/mobile/spck/x$d;

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Lcom/moat/analytics/mobile/spck/x$b;->b()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/x;->d()V

    sget-object v0, Lcom/moat/analytics/mobile/spck/x;->h:Ljava/util/Queue;

    new-instance v1, Lcom/moat/analytics/mobile/spck/x$c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v1, p0, v2, p1}, Lcom/moat/analytics/mobile/spck/x$c;-><init>(Lcom/moat/analytics/mobile/spck/x;Ljava/lang/Long;Lcom/moat/analytics/mobile/spck/x$b;)V

    invoke-interface {v0, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/moat/analytics/mobile/spck/x;->e()V

    :goto_0
    return-void
.end method

.method b()V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/moat/analytics/mobile/spck/x;->k:J

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lcom/moat/analytics/mobile/spck/x;->e:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/moat/analytics/mobile/spck/x;->a(J)V

    :cond_0
    return-void
.end method
