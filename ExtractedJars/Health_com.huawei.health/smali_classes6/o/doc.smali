.class public Lo/doc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dod$e;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lo/czn;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/doc;->e:Z

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doc;->b:Landroid/content/Context;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doc;->c:Lo/czn;

    .line 40
    invoke-static {p1}, Lo/czn;->e(Landroid/content/Context;)Lo/czn;

    move-result-object v0

    iput-object v0, p0, Lo/doc;->c:Lo/czn;

    .line 41
    iput-object p1, p0, Lo/doc;->b:Landroid/content/Context;

    .line 42
    return-void
.end method

.method private b(Lo/dod$e$b;)V
    .locals 7

    .line 82
    move-object v4, p0

    monitor-enter v4

    .line 83
    :try_start_0
    iget-boolean v0, p0, Lo/doc;->e:Z

    if-eqz v0, :cond_0

    .line 84
    const-string v0, "AccountReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "block!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    monitor-exit v4

    return-void

    .line 88
    :cond_0
    const-string v0, "AccountReader"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " downloadUserInfo Entry"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    new-instance v5, Lo/doc$4;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v5, p0, v0, p1}, Lo/doc$4;-><init>(Lo/doc;Landroid/os/Handler;Lo/dod$e$b;)V

    .line 103
    new-instance v0, Lo/doc$1;

    invoke-direct {v0, p0, v5}, Lo/doc$1;-><init>(Lo/doc;Lo/doi;)V

    invoke-virtual {v5, v0}, Lo/doi;->e(Lo/doi$a;)V

    .line 111
    invoke-virtual {v5}, Lo/doi;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 113
    :goto_0
    return-void
.end method

.method private c(Lo/doi;)V
    .locals 6

    .line 118
    move-object v4, p0

    monitor-enter v4

    .line 119
    :try_start_0
    iget-boolean v0, p0, Lo/doc;->e:Z

    if-eqz v0, :cond_0

    .line 120
    const-string v0, "AccountReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "block!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    monitor-exit v4

    return-void

    .line 124
    :cond_0
    const-string v0, "AccountReader"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " downloadUserInfoFromUp Entry"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    iget-object v0, p0, Lo/doc;->c:Lo/czn;

    new-instance v1, Lo/doc$5;

    invoke-direct {v1, p0, p1}, Lo/doc$5;-><init>(Lo/doc;Lo/doi;)V

    invoke-virtual {v0, v1}, Lo/czn;->b(Lo/cyx;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 161
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 162
    :goto_0
    return-void
.end method

.method static synthetic d(Lo/doc;Lo/doi;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/doc;->c(Lo/doi;)V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 6

    .line 71
    move-object v4, p0

    monitor-enter v4

    .line 72
    const-string v0, "AccountReader"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unBlock(AccountReader)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/doc;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 75
    :goto_0
    return-void
.end method

.method public e(Lo/dod$e$b;)V
    .locals 6

    .line 46
    move-object v4, p0

    monitor-enter v4

    .line 47
    :try_start_0
    iget-boolean v0, p0, Lo/doc;->e:Z

    if-eqz v0, :cond_0

    .line 48
    const-string v0, "AccountReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "block!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    monitor-exit v4

    return-void

    .line 51
    :cond_0
    :try_start_1
    iget-object v0, p0, Lo/doc;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->isLoginedByWear()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 52
    const-string v0, "AccountReader"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "K Scence logined by wear,dircet return null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    const/4 v0, -0x1

    invoke-static {p1, v0}, Lo/doe;->e(Lo/dod$e$b;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    monitor-exit v4

    return-void

    .line 56
    :cond_1
    const-string v0, "AccountReader"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync(AccountReader) callback:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    invoke-direct {p0, p1}, Lo/doc;->b(Lo/dod$e$b;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

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
