.class public final Lo/edm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/edm$d;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ScheduledExecutorService;

.field private final c:Landroid/app/Activity;

.field private e:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Lo/edm$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/edm$d;-><init>(Lo/edm$3;)V

    .line 23
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/edm;->a:Ljava/util/concurrent/ScheduledExecutorService;

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/edm;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 35
    const-string v0, "InactivityTimer"

    const-string v1, "Construct-start"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    iput-object p1, p0, Lo/edm;->c:Landroid/app/Activity;

    .line 37
    invoke-virtual {p0}, Lo/edm;->e()V

    .line 38
    const-string v0, "InactivityTimer"

    const-string v1, "Construct-end"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    return-void
.end method

.method private c()V
    .locals 2

    .line 49
    const-string v0, "InactivityTimer"

    const-string v1, "cancels-start"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    iget-object v0, p0, Lo/edm;->e:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Lo/edm;->e:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lo/edm;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 54
    :cond_0
    const-string v0, "InactivityTimer"

    const-string v1, "cancels-end"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    return-void
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 42
    const-string v0, "InactivityTimer"

    const-string v1, "shutdown-start"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    invoke-direct {p0}, Lo/edm;->c()V

    .line 44
    iget-object v0, p0, Lo/edm;->a:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 45
    const-string v0, "InactivityTimer"

    const-string v1, "shutdown-end"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    return-void
.end method

.method public e()V
    .locals 5

    .line 27
    const-string v0, "InactivityTimer"

    const-string v1, "onActivity-start"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    invoke-direct {p0}, Lo/edm;->c()V

    .line 29
    iget-object v0, p0, Lo/edm;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lo/edo;

    iget-object v2, p0, Lo/edm;->c:Landroid/app/Activity;

    invoke-direct {v1, v2}, Lo/edo;-><init>(Landroid/app/Activity;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 30
    const-wide/16 v3, 0x12c

    invoke-interface {v0, v1, v3, v4, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lo/edm;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 31
    const-string v0, "InactivityTimer"

    const-string v1, "onActivity-end"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    return-void
.end method
