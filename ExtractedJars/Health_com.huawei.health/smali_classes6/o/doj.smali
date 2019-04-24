.class public Lo/doj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dod$e;


# instance fields
.field private b:Landroid/content/Context;

.field private d:Z


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doj;->b:Landroid/content/Context;

    .line 27
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/doj;->d:Z

    .line 30
    iput-object p1, p0, Lo/doj;->b:Landroid/content/Context;

    .line 31
    return-void
.end method

.method static synthetic d(Lo/doj;)Landroid/content/Context;
    .locals 1

    .line 21
    iget-object v0, p0, Lo/doj;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public c()V
    .locals 6

    .line 55
    move-object v4, p0

    monitor-enter v4

    .line 56
    const-string v0, "HiHealthReader"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unBlock(HiHealthReader)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/doj;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 59
    :goto_0
    return-void
.end method

.method public d(Lo/dod$e$b;)V
    .locals 6

    .line 63
    move-object v4, p0

    monitor-enter v4

    .line 64
    :try_start_0
    iget-boolean v0, p0, Lo/doj;->d:Z

    if-eqz v0, :cond_0

    .line 65
    const-string v0, "HiHealthReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "block!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    monitor-exit v4

    return-void

    .line 69
    :cond_0
    const-string v0, "TimeEat_HiHealthReader"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start to fetchUserData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    iget-object v0, p0, Lo/doj;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/doj$4;

    invoke-direct {v1, p0, p1}, Lo/doj$4;-><init>(Lo/doj;Lo/dod$e$b;)V

    invoke-virtual {v0, v1}, Lo/clq;->a(Lo/clz;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 131
    :goto_0
    return-void
.end method

.method public e(Lo/dod$e$b;)V
    .locals 6

    .line 35
    move-object v4, p0

    monitor-enter v4

    .line 36
    :try_start_0
    iget-boolean v0, p0, Lo/doj;->d:Z

    if-eqz v0, :cond_0

    .line 37
    const-string v0, "HiHealthReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "block!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit v4

    return-void

    .line 40
    :cond_0
    const-string v0, "HiHealthReader"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync(HiHealthReader) callback:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    invoke-virtual {p0, p1}, Lo/doj;->d(Lo/dod$e$b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 43
    :goto_0
    return-void
.end method
