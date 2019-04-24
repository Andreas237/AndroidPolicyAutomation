.class public abstract Lorg/androidannotations/api/a$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/androidannotations/api/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:J

.field private c:J

.field private d:Ljava/lang/String;

.field private e:Z

.field private f:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field private g:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lorg/androidannotations/api/a$a;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lorg/androidannotations/api/a$a;->a:Ljava/lang/String;

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-lez p1, :cond_1

    iput-wide p2, p0, Lorg/androidannotations/api/a$a;->b:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    add-long/2addr v0, p2

    iput-wide v0, p0, Lorg/androidannotations/api/a$a;->c:J

    :cond_1
    const-string p1, ""

    invoke-virtual {p1, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iput-object p4, p0, Lorg/androidannotations/api/a$a;->d:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method static synthetic a(Lorg/androidannotations/api/a$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/androidannotations/api/a$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic a(Lorg/androidannotations/api/a$a;Ljava/util/concurrent/Future;)Ljava/util/concurrent/Future;
    .locals 0

    iput-object p1, p0, Lorg/androidannotations/api/a$a;->f:Ljava/util/concurrent/Future;

    return-object p1
.end method

.method static synthetic a(Lorg/androidannotations/api/a$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lorg/androidannotations/api/a$a;->e:Z

    return p1
.end method

.method static synthetic b(Lorg/androidannotations/api/a$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lorg/androidannotations/api/a$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method private b()V
    .locals 9

    iget-object v0, p0, Lorg/androidannotations/api/a$a;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/androidannotations/api/a$a;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lorg/androidannotations/api/a;->a()Ljava/lang/ThreadLocal;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const-class v0, Lorg/androidannotations/api/a;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lorg/androidannotations/api/a;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v1, p0, Lorg/androidannotations/api/a$a;->d:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/androidannotations/api/a$a;->d:Ljava/lang/String;

    invoke-static {v1}, Lorg/androidannotations/api/a;->a(Ljava/lang/String;)Lorg/androidannotations/api/a$a;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-wide v2, v1, Lorg/androidannotations/api/a$a;->b:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_1

    iget-wide v2, v1, Lorg/androidannotations/api/a$a;->c:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v6

    const/4 v8, 0x0

    sub-long/2addr v2, v6

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, v1, Lorg/androidannotations/api/a$a;->b:J

    :cond_1
    invoke-static {v1}, Lorg/androidannotations/api/a;->a(Lorg/androidannotations/api/a$a;)V

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

.method static synthetic c(Lorg/androidannotations/api/a$a;)J
    .locals 2

    iget-wide v0, p0, Lorg/androidannotations/api/a$a;->b:J

    return-wide v0
.end method

.method static synthetic d(Lorg/androidannotations/api/a$a;)Ljava/util/concurrent/Future;
    .locals 0

    iget-object p0, p0, Lorg/androidannotations/api/a$a;->f:Ljava/util/concurrent/Future;

    return-object p0
.end method

.method static synthetic e(Lorg/androidannotations/api/a$a;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lorg/androidannotations/api/a$a;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static synthetic f(Lorg/androidannotations/api/a$a;)V
    .locals 0

    invoke-direct {p0}, Lorg/androidannotations/api/a$a;->b()V

    return-void
.end method

.method static synthetic g(Lorg/androidannotations/api/a$a;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/androidannotations/api/a$a;->e:Z

    return p0
.end method


# virtual methods
.method public abstract a()V
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lorg/androidannotations/api/a$a;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {}, Lorg/androidannotations/api/a;->a()Ljava/lang/ThreadLocal;

    move-result-object v0

    iget-object v1, p0, Lorg/androidannotations/api/a$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lorg/androidannotations/api/a$a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, Lorg/androidannotations/api/a$a;->b()V

    return-void

    :catchall_0
    move-exception v0

    invoke-direct {p0}, Lorg/androidannotations/api/a$a;->b()V

    throw v0
.end method
