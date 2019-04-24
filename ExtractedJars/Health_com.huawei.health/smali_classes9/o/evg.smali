.class public Lo/evg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/evg$d;
    }
.end annotation


# instance fields
.field private a:Lo/evj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/evj<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/evp;>;"
        }
    .end annotation
.end field

.field private volatile c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/evp;>;"
        }
    .end annotation
.end field

.field private volatile d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/evp;>;"
        }
    .end annotation
.end field

.field private e:J

.field private f:J

.field private volatile g:Z

.field private i:Landroid/os/Handler;

.field private k:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Ljava/util/List;JLo/evj;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/evp;>;JLo/evj<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 181
    new-instance v0, Lo/evg$4;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/evg$4;-><init>(Lo/evg;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/evg;->i:Landroid/os/Handler;

    .line 47
    iput-object p1, p0, Lo/evg;->b:Ljava/util/List;

    .line 48
    invoke-direct {p0, p1}, Lo/evg;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/evg;->d:Ljava/util/List;

    .line 49
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/evg;->c:Ljava/util/List;

    .line 50
    iput-wide p2, p0, Lo/evg;->f:J

    .line 51
    new-instance v0, Lo/evg$d;

    invoke-direct {v0, p4}, Lo/evg$d;-><init>(Lo/evj;)V

    iput-object v0, p0, Lo/evg;->a:Lo/evj;

    .line 52
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lo/evg;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 53
    return-void
.end method

.method private a(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/evp;>;)Ljava/util/List<Lo/evp;>;"
        }
    .end annotation

    .line 112
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 113
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/evp;

    .line 114
    invoke-virtual {v3}, Lo/evp;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 115
    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 117
    :cond_0
    goto :goto_0

    .line 118
    :cond_1
    return-object v1
.end method

.method static synthetic a(Lo/evg;)Lo/evj;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/evg;->a:Lo/evj;

    return-object v0
.end method

.method static synthetic a(Lo/evg;Lo/evp;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1}, Lo/evg;->a(Lo/evp;)V

    return-void
.end method

.method private a(Lo/evp;)V
    .locals 5

    .line 125
    iget-boolean v0, p0, Lo/evg;->g:Z

    if-eqz v0, :cond_0

    .line 126
    return-void

    .line 128
    :cond_0
    iget-object v0, p0, Lo/evg;->a:Lo/evj;

    invoke-virtual {v0}, Lo/evj;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 129
    iget-object v0, p0, Lo/evg;->i:Landroid/os/Handler;

    .line 131
    const/4 v1, -0x2

    invoke-static {v1}, Lo/evo;->c(I)Ljava/lang/String;

    move-result-object v1

    .line 129
    const/4 v2, 0x4

    const/4 v3, -0x2

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 131
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 132
    return-void

    .line 134
    :cond_1
    const-string v0, "Stress_DownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startDownload() in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    invoke-static {}, Lo/euz;->d()Lo/euu;

    move-result-object v0

    invoke-virtual {p1}, Lo/evp;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lo/evp;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lo/evg$5;

    invoke-direct {v3, p0, p1}, Lo/evg$5;-><init>(Lo/evg;Lo/evp;)V

    invoke-interface {v0, v1, v2, v3}, Lo/euu;->a(Ljava/lang/String;Ljava/lang/String;Lo/evd;)V

    .line 179
    return-void
.end method

.method private a()Z
    .locals 6

    .line 70
    invoke-direct {p0}, Lo/evg;->d()Lo/evp;

    move-result-object v5

    .line 71
    if-eqz v5, :cond_1

    .line 72
    const-string v0, "Stress_DownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDownloadFlag() in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    iget-object v0, p0, Lo/evg;->a:Lo/evj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 74
    iget-object v0, p0, Lo/evg;->a:Lo/evj;

    invoke-virtual {v0}, Lo/evj;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lo/evg;->i:Landroid/os/Handler;

    .line 77
    const/4 v1, -0x2

    invoke-static {v1}, Lo/evo;->c(I)Ljava/lang/String;

    move-result-object v1

    .line 75
    const/4 v2, 0x4

    const/4 v3, -0x2

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 77
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 78
    const/4 v0, 0x0

    return v0

    .line 81
    :cond_0
    invoke-direct {p0, v5}, Lo/evg;->a(Lo/evp;)V

    .line 82
    const/4 v0, 0x1

    return v0

    .line 84
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lo/evg;Lo/evj;)Lo/evj;
    .locals 0

    .line 23
    iput-object p1, p0, Lo/evg;->a:Lo/evj;

    return-object p1
.end method

.method static synthetic b(Lo/evg;)Z
    .locals 1

    .line 23
    invoke-direct {p0}, Lo/evg;->a()Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lo/evg;)Z
    .locals 1

    .line 23
    iget-boolean v0, p0, Lo/evg;->g:Z

    return v0
.end method

.method static synthetic d(Lo/evg;J)J
    .locals 0

    .line 23
    iput-wide p1, p0, Lo/evg;->e:J

    return-wide p1
.end method

.method static synthetic d(Lo/evg;)Landroid/os/Handler;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/evg;->i:Landroid/os/Handler;

    return-object v0
.end method

.method private declared-synchronized d()Lo/evp;
    .locals 3

    monitor-enter p0

    .line 88
    const/4 v2, 0x0

    .line 89
    :try_start_0
    iget-object v0, p0, Lo/evg;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    iget-object v0, p0, Lo/evg;->d:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/evp;

    .line 91
    iget-object v0, p0, Lo/evg;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 92
    iget-object v0, p0, Lo/evg;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    :cond_0
    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method private declared-synchronized d(Lo/evp;)Z
    .locals 1

    monitor-enter p0

    .line 98
    :try_start_0
    iget-object v0, p0, Lo/evg;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 99
    iget-object v0, p0, Lo/evg;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/evg;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 100
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 102
    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic e(Lo/evg;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/evg;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method static synthetic e(Lo/evg;Lo/evp;)Z
    .locals 1

    .line 23
    invoke-direct {p0, p1}, Lo/evg;->d(Lo/evp;)Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lo/evg;Z)Z
    .locals 0

    .line 23
    iput-boolean p1, p0, Lo/evg;->g:Z

    return p1
.end method

.method static synthetic f(Lo/evg;)J
    .locals 2

    .line 23
    iget-wide v0, p0, Lo/evg;->f:J

    return-wide v0
.end method

.method static synthetic g(Lo/evg;)J
    .locals 2

    .line 23
    iget-wide v0, p0, Lo/evg;->e:J

    return-wide v0
.end method

.method static synthetic k(Lo/evg;)Ljava/util/List;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/evg;->b:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public b()V
    .locals 5

    .line 56
    const/4 v4, 0x0

    :goto_0
    const/4 v0, 0x1

    if-ge v4, v0, :cond_2

    .line 57
    const-string v0, "Stress_DownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "run() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    iget-object v0, p0, Lo/evg;->a:Lo/evj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 59
    iget-object v0, p0, Lo/evg;->a:Lo/evj;

    invoke-virtual {v0}, Lo/evj;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    return-void

    .line 62
    :cond_0
    invoke-direct {p0}, Lo/evg;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 63
    goto :goto_1

    .line 56
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 67
    :cond_2
    :goto_1
    return-void
.end method
