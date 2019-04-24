.class Lo/bqa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:Lo/bqe;

.field private c:Ljava/util/concurrent/ExecutorService;

.field private d:J


# direct methods
.method constructor <init>()V
    .locals 1

    .line 30
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/bqa;-><init>(Lo/bqe;)V

    .line 31
    return-void
.end method

.method constructor <init>(Lo/bqe;)V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/bqa;->d:J

    .line 18
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/bqa;->a:J

    .line 24
    iput-object p1, p0, Lo/bqa;->b:Lo/bqe;

    .line 25
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/bqa;->c:Ljava/util/concurrent/ExecutorService;

    .line 26
    return-void
.end method

.method private a()V
    .locals 11

    .line 40
    iget-object v0, p0, Lo/bqa;->b:Lo/bqe;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bqa;->c:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_1

    .line 42
    :cond_0
    return-void

    .line 45
    :cond_1
    iget-wide v7, p0, Lo/bqa;->a:J

    .line 46
    iget-wide v9, p0, Lo/bqa;->d:J

    .line 48
    iget-object v0, p0, Lo/bqa;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/bqa$1;

    move-object v2, p0

    move-wide v3, v7

    move-wide v5, v9

    invoke-direct/range {v1 .. v6}, Lo/bqa$1;-><init>(Lo/bqa;JJ)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 56
    return-void
.end method

.method static synthetic b(Lo/bqa;)Lo/bqe;
    .locals 1

    .line 11
    iget-object v0, p0, Lo/bqa;->b:Lo/bqe;

    return-object v0
.end method


# virtual methods
.method a(J)V
    .locals 2

    .line 60
    iget-wide v0, p0, Lo/bqa;->a:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lo/bqa;->a:J

    .line 61
    invoke-direct {p0}, Lo/bqa;->a()V

    .line 62
    return-void
.end method

.method d()V
    .locals 1

    .line 77
    iget-object v0, p0, Lo/bqa;->c:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lo/bqa;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bqa;->c:Ljava/util/concurrent/ExecutorService;

    .line 82
    :cond_0
    return-void
.end method

.method e(J)V
    .locals 2

    .line 66
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    .line 68
    iput-wide p1, p0, Lo/bqa;->d:J

    .line 70
    :cond_0
    return-void
.end method
