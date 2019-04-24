.class public Lo/btb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/btb$d;
    }
.end annotation


# instance fields
.field private volatile a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;"
        }
    .end annotation
.end field

.field private b:Lo/bui;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/bui<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private c:J

.field private volatile d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;"
        }
    .end annotation
.end field

.field private f:Landroid/os/Handler;

.field private volatile h:Z

.field private i:J

.field private k:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Ljava/util/List;JLo/bui;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;JLo/bui<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    new-instance v0, Lo/btb$5;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/btb$5;-><init>(Lo/btb;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/btb;->f:Landroid/os/Handler;

    .line 45
    iput-object p1, p0, Lo/btb;->e:Ljava/util/List;

    .line 46
    invoke-direct {p0, p1}, Lo/btb;->e(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/btb;->a:Ljava/util/List;

    .line 47
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lo/btb;->d:Ljava/util/List;

    .line 48
    iput-wide p2, p0, Lo/btb;->i:J

    .line 49
    new-instance v0, Lo/btb$d;

    invoke-direct {v0, p4}, Lo/btb$d;-><init>(Lo/bui;)V

    iput-object v0, p0, Lo/btb;->b:Lo/bui;

    .line 50
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lo/btb;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 51
    return-void
.end method

.method static synthetic a(Lo/btb;)Z
    .locals 1

    .line 22
    invoke-direct {p0}, Lo/btb;->e()Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lo/btb;Lcom/huawei/health/suggestion/model/Media;)Z
    .locals 1

    .line 22
    invoke-direct {p0, p1}, Lo/btb;->c(Lcom/huawei/health/suggestion/model/Media;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lo/btb;)Landroid/os/Handler;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/btb;->f:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic c(Lo/btb;)J
    .locals 2

    .line 22
    iget-wide v0, p0, Lo/btb;->c:J

    return-wide v0
.end method

.method static synthetic c(Lo/btb;J)J
    .locals 0

    .line 22
    iput-wide p1, p0, Lo/btb;->c:J

    return-wide p1
.end method

.method private declared-synchronized c()Lcom/huawei/health/suggestion/model/Media;
    .locals 3

    monitor-enter p0

    .line 71
    const/4 v2, 0x0

    .line 72
    :try_start_0
    iget-object v0, p0, Lo/btb;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lo/btb;->a:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/suggestion/model/Media;

    .line 74
    iget-object v0, p0, Lo/btb;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 75
    iget-object v0, p0, Lo/btb;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    :cond_0
    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2
.end method

.method private declared-synchronized c(Lcom/huawei/health/suggestion/model/Media;)Z
    .locals 1

    monitor-enter p0

    .line 81
    :try_start_0
    iget-object v0, p0, Lo/btb;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 82
    iget-object v0, p0, Lo/btb;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/btb;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 83
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 85
    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private d(Lcom/huawei/health/suggestion/model/Media;)V
    .locals 5

    .line 109
    iget-boolean v0, p0, Lo/btb;->h:Z

    if-eqz v0, :cond_0

    .line 110
    return-void

    .line 113
    :cond_0
    iget-object v0, p0, Lo/btb;->b:Lo/bui;

    invoke-virtual {v0}, Lo/bui;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    iget-object v0, p0, Lo/btb;->f:Landroid/os/Handler;

    .line 116
    const/4 v1, -0x2

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    .line 114
    const/4 v2, 0x4

    const/4 v3, -0x2

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 116
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 117
    return-void

    .line 120
    :cond_1
    invoke-static {}, Lo/bsd;->d()Lo/brz;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Media;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/Media;->getPath()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lo/btb$4;

    invoke-direct {v3, p0, p1}, Lo/btb$4;-><init>(Lo/btb;Lcom/huawei/health/suggestion/model/Media;)V

    invoke-interface {v0, v1, v2, v3}, Lo/brz;->c(Ljava/lang/String;Ljava/lang/String;Lo/bsr;)V

    .line 159
    return-void
.end method

.method static synthetic d(Lo/btb;)Z
    .locals 1

    .line 22
    iget-boolean v0, p0, Lo/btb;->h:Z

    return v0
.end method

.method static synthetic d(Lo/btb;Z)Z
    .locals 0

    .line 22
    iput-boolean p1, p0, Lo/btb;->h:Z

    return p1
.end method

.method private e(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;)Ljava/util/List<Lcom/huawei/health/suggestion/model/Media;>;"
        }
    .end annotation

    .line 95
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 96
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/suggestion/model/Media;

    .line 97
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/Media;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    .line 98
    invoke-virtual {v1, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 100
    :cond_0
    goto :goto_0

    .line 101
    :cond_1
    return-object v1
.end method

.method static synthetic e(Lo/btb;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/btb;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method static synthetic e(Lo/btb;Lcom/huawei/health/suggestion/model/Media;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lo/btb;->d(Lcom/huawei/health/suggestion/model/Media;)V

    return-void
.end method

.method private e()Z
    .locals 2

    .line 62
    invoke-direct {p0}, Lo/btb;->c()Lcom/huawei/health/suggestion/model/Media;

    move-result-object v1

    .line 63
    if-eqz v1, :cond_0

    .line 64
    invoke-direct {p0, v1}, Lo/btb;->d(Lcom/huawei/health/suggestion/model/Media;)V

    .line 65
    const/4 v0, 0x1

    return v0

    .line 67
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic g(Lo/btb;)J
    .locals 2

    .line 22
    iget-wide v0, p0, Lo/btb;->i:J

    return-wide v0
.end method

.method static synthetic h(Lo/btb;)Ljava/util/List;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/btb;->e:Ljava/util/List;

    return-object v0
.end method

.method static synthetic i(Lo/btb;)Lo/bui;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/btb;->b:Lo/bui;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 54
    const/4 v1, 0x0

    :goto_0
    const/4 v0, 0x3

    if-ge v1, v0, :cond_1

    .line 55
    invoke-direct {p0}, Lo/btb;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 56
    goto :goto_1

    .line 54
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 59
    :cond_1
    :goto_1
    return-void
.end method
