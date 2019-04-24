.class Lcom/moat/analytics/mobile/spck/j;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lcom/moat/analytics/mobile/spck/j;


# instance fields
.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/moat/analytics/mobile/spck/k;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/moat/analytics/mobile/spck/b;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/concurrent/ScheduledExecutorService;

.field private e:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private f:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/moat/analytics/mobile/spck/j;

    invoke-direct {v0}, Lcom/moat/analytics/mobile/spck/j;-><init>()V

    sput-object v0, Lcom/moat/analytics/mobile/spck/j;->a:Lcom/moat/analytics/mobile/spck/j;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/j;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/j;->b:Ljava/util/Map;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/moat/analytics/mobile/spck/j;->c:Ljava/util/Map;

    return-void
.end method

.method static a()Lcom/moat/analytics/mobile/spck/j;
    .locals 1

    sget-object v0, Lcom/moat/analytics/mobile/spck/j;->a:Lcom/moat/analytics/mobile/spck/j;

    return-object v0
.end method

.method static synthetic a(Lcom/moat/analytics/mobile/spck/j;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/moat/analytics/mobile/spck/j;->b:Ljava/util/Map;

    return-object p0
.end method

.method private a(Landroid/content/Context;)V
    .locals 10

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/j;->f:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledFuture;->isDone()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x3

    const-string v1, "JSUpdateLooper"

    const-string v2, "Starting metadata reporting loop"

    invoke-static {v0, v1, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/moat/analytics/mobile/spck/j$1;

    invoke-direct {v4, p0, p1}, Lcom/moat/analytics/mobile/spck/j$1;-><init>(Lcom/moat/analytics/mobile/spck/j;Landroid/content/Context;)V

    iget-object v3, p0, Lcom/moat/analytics/mobile/spck/j;->d:Ljava/util/concurrent/ScheduledExecutorService;

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x32

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v3 .. v9}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/j;->f:Ljava/util/concurrent/ScheduledFuture;

    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/moat/analytics/mobile/spck/j;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    iget-object p0, p0, Lcom/moat/analytics/mobile/spck/j;->f:Ljava/util/concurrent/ScheduledFuture;

    return-object p0
.end method

.method private b(Landroid/content/Context;)V
    .locals 10

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/j;->e:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledFuture;->isDone()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x3

    const-string v1, "JSUpdateLooper"

    const-string v2, "Starting view update loop"

    invoke-static {v0, v1, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/moat/analytics/mobile/spck/j$2;

    invoke-direct {v4, p0, p1}, Lcom/moat/analytics/mobile/spck/j$2;-><init>(Lcom/moat/analytics/mobile/spck/j;Landroid/content/Context;)V

    iget-object v3, p0, Lcom/moat/analytics/mobile/spck/j;->d:Ljava/util/concurrent/ScheduledExecutorService;

    const-wide/16 v5, 0x0

    invoke-static {}, Lcom/moat/analytics/mobile/spck/x;->a()Lcom/moat/analytics/mobile/spck/x;

    move-result-object p1

    iget p1, p1, Lcom/moat/analytics/mobile/spck/x;->d:I

    int-to-long v7, p1

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v3 .. v9}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/moat/analytics/mobile/spck/j;->e:Ljava/util/concurrent/ScheduledFuture;

    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/moat/analytics/mobile/spck/j;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/moat/analytics/mobile/spck/j;->c:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic d(Lcom/moat/analytics/mobile/spck/j;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    iget-object p0, p0, Lcom/moat/analytics/mobile/spck/j;->e:Ljava/util/concurrent/ScheduledFuture;

    return-object p0
.end method


# virtual methods
.method a(Landroid/content/Context;Lcom/moat/analytics/mobile/spck/b;)V
    .locals 4

    if-eqz p2, :cond_0

    const/4 v0, 0x3

    const-string v1, "JSUpdateLooper"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addActiveTracker"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/j;->c:Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-interface {v0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/j;->c:Ljava/util/Map;

    const-string v1, ""

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/j;->b(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method a(Landroid/content/Context;Lcom/moat/analytics/mobile/spck/k;)V
    .locals 2

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/j;->b:Ljava/util/Map;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    const-string v1, ""

    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1}, Lcom/moat/analytics/mobile/spck/j;->a(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method a(Lcom/moat/analytics/mobile/spck/b;)V
    .locals 4

    if-eqz p1, :cond_0

    const/4 v0, 0x3

    const-string v1, "JSUpdateLooper"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "removeActiveTracker"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/j;->c:Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method a(Lcom/moat/analytics/mobile/spck/k;)V
    .locals 4

    if-eqz p1, :cond_0

    const/4 v0, 0x3

    const-string v1, "JSUpdateLooper"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "removeSetupNeededBridge"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, p0, v2}, Lcom/moat/analytics/mobile/spck/q;->a(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/moat/analytics/mobile/spck/j;->b:Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
