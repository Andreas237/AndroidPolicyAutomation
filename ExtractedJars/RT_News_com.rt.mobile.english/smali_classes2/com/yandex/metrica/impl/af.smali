.class public Lcom/yandex/metrica/impl/af;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/af$a;
    }
.end annotation


# static fields
.field public static final a:J


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/os/Handler;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/af$a;",
            ">;"
        }
    .end annotation
.end field

.field private volatile e:Lcom/yandex/metrica/IMetricaService;

.field private final f:Ljava/lang/Runnable;

.field private final g:Landroid/content/ServiceConnection;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 36
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/yandex/metrica/impl/af;->a:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/af;->d:Ljava/util/List;

    const/4 v0, 0x0

    .line 43
    iput-object v0, p0, Lcom/yandex/metrica/impl/af;->e:Lcom/yandex/metrica/IMetricaService;

    .line 81
    new-instance v0, Lcom/yandex/metrica/impl/af$1;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/af$1;-><init>(Lcom/yandex/metrica/impl/af;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/af;->f:Ljava/lang/Runnable;

    .line 106
    new-instance v0, Lcom/yandex/metrica/impl/af$2;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/af$2;-><init>(Lcom/yandex/metrica/impl/af;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/af;->g:Landroid/content/ServiceConnection;

    .line 46
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/af;->b:Landroid/content/Context;

    .line 47
    iput-object p2, p0, Lcom/yandex/metrica/impl/af;->c:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/af;Lcom/yandex/metrica/IMetricaService;)Lcom/yandex/metrica/IMetricaService;
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/yandex/metrica/impl/af;->e:Lcom/yandex/metrica/IMetricaService;

    return-object p1
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/af;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/yandex/metrica/impl/af;->f()V

    return-void
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/af;)V
    .locals 1

    .line 1127
    iget-object p0, p0, Lcom/yandex/metrica/impl/af;->d:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/af$a;

    .line 1128
    invoke-interface {v0}, Lcom/yandex/metrica/impl/af$a;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/yandex/metrica/impl/af;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/yandex/metrica/impl/af;->g()V

    return-void
.end method

.method private declared-synchronized f()V
    .locals 3

    monitor-enter p0

    .line 91
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/af;->b:Landroid/content/Context;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/af;->d()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 95
    :try_start_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/af;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/yandex/metrica/impl/af;->g:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 96
    iput-object v1, p0, Lcom/yandex/metrica/impl/af;->e:Lcom/yandex/metrica/IMetricaService;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    :catch_0
    :cond_0
    :try_start_2
    iput-object v1, p0, Lcom/yandex/metrica/impl/af;->e:Lcom/yandex/metrica/IMetricaService;

    .line 103
    invoke-direct {p0}, Lcom/yandex/metrica/impl/af;->g()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 104
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 90
    monitor-exit p0

    throw v0
.end method

.method private g()V
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/yandex/metrica/impl/af;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 4

    monitor-enter p0

    .line 53
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/af;->e:Lcom/yandex/metrica/IMetricaService;

    if-nez v0, :cond_0

    .line 54
    iget-object v0, p0, Lcom/yandex/metrica/impl/af;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/yandex/metrica/impl/bl;->c(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    :try_start_1
    iget-object v1, p0, Lcom/yandex/metrica/impl/af;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/yandex/metrica/impl/af;->g:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    monitor-exit p0

    return-void

    .line 62
    :catch_0
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 52
    monitor-exit p0

    throw v0
.end method

.method public a(Lcom/yandex/metrica/impl/af$a;)V
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/yandex/metrica/impl/af;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b()V
    .locals 4

    .line 65
    iget-object v0, p0, Lcom/yandex/metrica/impl/af;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/yandex/metrica/impl/af;->f:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 66
    iget-object v0, p0, Lcom/yandex/metrica/impl/af;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/yandex/metrica/impl/af;->f:Ljava/lang/Runnable;

    sget-wide v2, Lcom/yandex/metrica/impl/af;->a:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method c()V
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/yandex/metrica/impl/af;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/yandex/metrica/impl/af;->f:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d()Z
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/yandex/metrica/impl/af;->e:Lcom/yandex/metrica/IMetricaService;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e()Lcom/yandex/metrica/IMetricaService;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/yandex/metrica/impl/af;->e:Lcom/yandex/metrica/IMetricaService;

    return-object v0
.end method
