.class Lo/fni$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fni;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private a:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<*>;"
        }
    .end annotation
.end field

.field private final b:J

.field final synthetic c:Lo/fni;

.field private final d:J


# direct methods
.method public constructor <init>(Lo/fni;Lo/fmw;)V
    .locals 2

    .line 177
    iput-object p1, p0, Lo/fni$e;->c:Lo/fni;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 178
    const-string v0, "EXCHANGE_LIFETIME"

    invoke-virtual {p2, v0}, Lo/fmw;->c(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/fni$e;->b:J

    .line 179
    const-string v0, "MARK_AND_SWEEP_INTERVAL"

    invoke-virtual {p2, v0}, Lo/fmw;->c(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lo/fni$e;->d:J

    .line 180
    return-void
.end method

.method static synthetic a(Lo/fni$e;)V
    .locals 0

    .line 168
    invoke-direct {p0}, Lo/fni$e;->e()V

    return-void
.end method

.method static synthetic b(Lo/fni$e;)V
    .locals 0

    .line 168
    invoke-direct {p0}, Lo/fni$e;->d()V

    return-void
.end method

.method private c()V
    .locals 12

    .line 209
    iget-object v0, p0, Lo/fni$e;->c:Lo/fni;

    invoke-static {v0}, Lo/fni;->a(Lo/fni;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 210
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    .line 211
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v1, p0, Lo/fni$e;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sub-long v7, v5, v0

    .line 214
    iget-object v0, p0, Lo/fni$e;->c:Lo/fni;

    invoke-static {v0}, Lo/fni;->a(Lo/fni;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/util/Map$Entry;

    .line 215
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/fni$d;

    .line 216
    iget-wide v0, v11, Lo/fni$d;->b:J

    sub-long/2addr v0, v7

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 218
    invoke-static {}, Lo/fni;->d()Lo/fty;

    move-result-object v0

    const-string v1, "Mark-And-Sweep removes {}"

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 219
    iget-object v0, p0, Lo/fni$e;->c:Lo/fni;

    invoke-static {v0}, Lo/fni;->a(Lo/fni;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    :cond_0
    goto :goto_0

    .line 222
    :cond_1
    invoke-static {}, Lo/fni;->d()Lo/fty;

    move-result-object v0

    const-string v1, "Sweep run took {}ms"

    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    sub-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 224
    :cond_2
    return-void
.end method

.method private d()V
    .locals 2

    .line 239
    iget-object v0, p0, Lo/fni$e;->a:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 240
    iget-object v0, p0, Lo/fni$e;->a:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 242
    :cond_0
    return-void
.end method

.method private e()V
    .locals 4

    .line 230
    iget-object v0, p0, Lo/fni$e;->c:Lo/fni;

    invoke-static {v0}, Lo/fni;->e(Lo/fni;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 231
    iget-object v0, p0, Lo/fni$e;->c:Lo/fni;

    invoke-static {v0}, Lo/fni;->e(Lo/fni;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iget-wide v1, p0, Lo/fni$e;->d:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, p0, v1, v2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lo/fni$e;->a:Ljava/util/concurrent/ScheduledFuture;

    .line 233
    :cond_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 189
    :try_start_0
    invoke-static {}, Lo/fni;->d()Lo/fty;

    move-result-object v0

    const-string v1, "Start Mark-And-Sweep with {} entries"

    iget-object v2, p0, Lo/fni$e;->c:Lo/fni;

    invoke-static {v2}, Lo/fni;->a(Lo/fni;)Ljava/util/concurrent/ConcurrentMap;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/ConcurrentMap;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 190
    invoke-direct {p0}, Lo/fni$e;->c()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 197
    :try_start_1
    invoke-direct {p0}, Lo/fni$e;->e()V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    .line 200
    goto :goto_1

    .line 198
    :catch_0
    move-exception v3

    .line 199
    invoke-static {}, Lo/fni;->d()Lo/fty;

    move-result-object v0

    const-string v1, "Exception while scheduling Mark-and-Sweep algorithm"

    invoke-interface {v0, v1, v3}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 201
    goto :goto_1

    .line 192
    :catch_1
    move-exception v3

    .line 193
    :try_start_2
    invoke-static {}, Lo/fni;->d()Lo/fty;

    move-result-object v0

    const-string v1, "Exception in Mark-and-Sweep algorithm"

    invoke-interface {v0, v1, v3}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 197
    :try_start_3
    invoke-direct {p0}, Lo/fni$e;->e()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_2

    .line 200
    goto :goto_1

    .line 198
    :catch_2
    move-exception v3

    .line 199
    invoke-static {}, Lo/fni;->d()Lo/fty;

    move-result-object v0

    const-string v1, "Exception while scheduling Mark-and-Sweep algorithm"

    invoke-interface {v0, v1, v3}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 201
    goto :goto_1

    .line 196
    :catchall_0
    move-exception v4

    .line 197
    :try_start_4
    invoke-direct {p0}, Lo/fni$e;->e()V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_3

    .line 200
    goto :goto_0

    .line 198
    :catch_3
    move-exception v5

    .line 199
    invoke-static {}, Lo/fni;->d()Lo/fty;

    move-result-object v0

    const-string v1, "Exception while scheduling Mark-and-Sweep algorithm"

    invoke-interface {v0, v1, v5}, Lo/fty;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 200
    :goto_0
    throw v4

    .line 202
    :goto_1
    return-void
.end method
