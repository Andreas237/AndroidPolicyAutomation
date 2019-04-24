.class public final Lo/fni;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fnb;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fni$e;,
        Lo/fni$d;
    }
.end annotation


# static fields
.field private static final b:Lo/fty;


# instance fields
.field private a:Z

.field private final c:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<Lo/fmb$e;Lo/fni$d;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/concurrent/ScheduledExecutorService;

.field private final e:Lo/fni$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 57
    const-class v0, Lo/fni;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fni;->b:Lo/fty;

    return-void
.end method

.method public constructor <init>(Lo/fmw;)V
    .locals 1

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lo/fni;->c:Ljava/util/concurrent/ConcurrentMap;

    .line 88
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fni;->a:Z

    .line 106
    new-instance v0, Lo/fni$e;

    invoke-direct {v0, p0, p1}, Lo/fni$e;-><init>(Lo/fni;Lo/fmw;)V

    iput-object v0, p0, Lo/fni;->e:Lo/fni$e;

    .line 107
    return-void
.end method

.method static synthetic a(Lo/fni;)Ljava/util/concurrent/ConcurrentMap;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/fni;->c:Ljava/util/concurrent/ConcurrentMap;

    return-object v0
.end method

.method static synthetic d()Lo/fty;
    .locals 1

    .line 55
    sget-object v0, Lo/fni;->b:Lo/fty;

    return-object v0
.end method

.method static synthetic e(Lo/fni;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/fni;->d:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method


# virtual methods
.method public a(Lo/fmb$e;)Lo/fmb;
    .locals 2

    .line 145
    iget-object v0, p0, Lo/fni;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/fni$d;

    .line 146
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v1, Lo/fni$d;->c:Lo/fmb;

    :goto_0
    return-object v0
.end method

.method public a(Lo/fmb$e;Lo/fmb;)Lo/fmb;
    .locals 3

    .line 139
    iget-object v0, p0, Lo/fni;->c:Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, Lo/fni$d;

    invoke-direct {v1, p2}, Lo/fni$d;-><init>(Lo/fmb;)V

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/fni$d;

    .line 140
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v2, Lo/fni$d;->c:Lo/fmb;

    :goto_0
    return-object v0
.end method

.method public declared-synchronized a()V
    .locals 3

    monitor-enter p0

    .line 111
    :try_start_0
    iget-boolean v0, p0, Lo/fni;->a:Z

    if-nez v0, :cond_2

    .line 112
    iget-object v0, p0, Lo/fni;->d:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/fni;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 113
    :cond_0
    new-instance v0, Lo/fpn;

    const-string v1, "Deduplicator"

    invoke-direct {v0, v1}, Lo/fpn;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/fni;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 115
    :cond_1
    iget-object v0, p0, Lo/fni;->e:Lo/fni$e;

    invoke-static {v0}, Lo/fni$e;->a(Lo/fni$e;)V

    .line 116
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/fni;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method public b()V
    .locals 1

    .line 151
    iget-object v0, p0, Lo/fni;->c:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/concurrent/ConcurrentMap;->clear()V

    .line 152
    return-void
.end method

.method public declared-synchronized e()V
    .locals 2

    monitor-enter p0

    .line 122
    :try_start_0
    iget-boolean v0, p0, Lo/fni;->a:Z

    if-eqz v0, :cond_0

    .line 123
    iget-object v0, p0, Lo/fni;->e:Lo/fni$e;

    invoke-static {v0}, Lo/fni$e;->b(Lo/fni$e;)V

    .line 124
    iget-object v0, p0, Lo/fni;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 125
    invoke-virtual {p0}, Lo/fni;->b()V

    .line 126
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fni;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method
