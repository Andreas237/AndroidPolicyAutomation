.class public Lo/cvs;
.super Lo/cvt;

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hsf/internal/PPSHsfService;>;"
        }
    .end annotation
.end field

.field private final b:Landroid/content/Context;

.field private volatile c:Lo/cvl;

.field private d:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final e:Lo/cvt$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lo/cvt$d;)V
    .locals 2

    invoke-direct {p0}, Lo/cvt;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cvs;->a:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lo/cvs;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lo/cvs;->b:Landroid/content/Context;

    iput-object p2, p0, Lo/cvs;->e:Lo/cvt$d;

    return-void
.end method

.method private b()V
    .locals 7

    :try_start_0
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.android.hsf.service.CoreService"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "com.huawei.android.hsf"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lo/cvs;->b:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-virtual {v0, v5, p0, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v6

    const-string v0, "PPSHsfApiImpl"

    const-string v1, "bindCoreService: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez v6, :cond_0

    iget-object v0, p0, Lo/cvs;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p0, Lo/cvs;->e:Lo/cvt$d;

    const/4 v1, 0x5

    invoke-interface {v0, v1}, Lo/cvt$d;->b(I)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "PPSHsfApiImpl"

    const-string v1, "bindService SecurityException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lo/cvs;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p0, Lo/cvs;->e:Lo/cvt$d;

    const/4 v1, 0x5

    invoke-interface {v0, v1}, Lo/cvt$d;->b(I)V

    goto :goto_0

    :catch_1
    move-exception v5

    const-string v0, "PPSHsfApiImpl"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bindService "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lo/cvs;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p0, Lo/cvs;->e:Lo/cvt$d;

    const/4 v1, 0x5

    invoke-interface {v0, v1}, Lo/cvt$d;->b(I)V

    :goto_0
    return-void
.end method

.method private static c(I)I
    .locals 1

    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const/4 v0, 0x0

    return v0

    :sswitch_1
    const/16 v0, 0x8

    return v0

    :goto_0
    const/4 v0, 0x4

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x2 -> :sswitch_1
        0x0 -> :sswitch_0
    .end sparse-switch
.end method

.method private c(Lo/cvl;)I
    .locals 5

    if-nez p1, :cond_0

    const/4 v0, 0x4

    return v0

    :cond_0
    :try_start_0
    iget-object v2, p0, Lo/cvs;->a:Ljava/util/List;

    monitor-enter v2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, p0, Lo/cvs;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lo/cvs;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/cvs;->a:Ljava/util/List;

    invoke-interface {p1, v0, v1}, Lo/cvl;->b(Ljava/lang/String;Ljava/util/List;)I

    move-result v3

    invoke-static {v3}, Lo/cvs;->c(I)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    monitor-exit v2

    return v0

    :catchall_0
    move-exception v4

    monitor-exit v2

    :try_start_2
    throw v4
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v2

    const-string v0, "PPSHsfApiImpl"

    const-string v1, "Failed to call remote interface for querying the HSF services."

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x4

    return v0
.end method


# virtual methods
.method public final c()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lo/cvs;->b:Landroid/content/Context;

    return-object v0
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lo/cvs;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Ljava/lang/String;)Lcom/huawei/hsf/internal/PPSHsfService;
    .locals 7

    iget-object v0, p0, Lo/cvs;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v2, 0x0

    iget-object v3, p0, Lo/cvs;->a:Ljava/util/List;

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lo/cvs;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hsf/internal/PPSHsfService;

    invoke-virtual {v5}, Lcom/huawei/hsf/internal/PPSHsfService;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    move-object v2, v5

    :cond_1
    goto :goto_0

    :cond_2
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v3

    throw v6

    :goto_1
    return-object v2
.end method

.method public e()V
    .locals 3

    iget-object v0, p0, Lo/cvs;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lo/cvs;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.android.hsf"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/c;->b(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v0, p0, Lo/cvs;->e:Lo/cvt$d;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/cvt$d;->b(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/cvs;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    invoke-direct {p0}, Lo/cvs;->b()V

    :goto_0
    goto :goto_1

    :cond_1
    iget-object v0, p0, Lo/cvs;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lo/cvs;->e:Lo/cvt$d;

    invoke-interface {v0}, Lo/cvt$d;->b()V

    :cond_2
    :goto_1
    return-void
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    invoke-static {p2}, Lo/cvl$e;->e(Landroid/os/IBinder;)Lo/cvl;

    move-result-object v0

    iput-object v0, p0, Lo/cvs;->c:Lo/cvl;

    iget-object v0, p0, Lo/cvs;->c:Lo/cvl;

    if-eqz v0, :cond_0

    const-string v0, "com.huawei.hsf.internal.CoreService"

    invoke-virtual {p1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "PPSHsfApiImpl"

    const-string v1, "Maybe mCoreService is null or illegal."

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lo/cvs;->b:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v0, p0, Lo/cvs;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p0, Lo/cvs;->e:Lo/cvt$d;

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lo/cvt$d;->b(I)V

    return-void

    :cond_1
    iget-object v0, p0, Lo/cvs;->c:Lo/cvl;

    invoke-direct {p0, v0}, Lo/cvs;->c(Lo/cvl;)I

    move-result v2

    if-nez v2, :cond_2

    iget-object v0, p0, Lo/cvs;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p0, Lo/cvs;->e:Lo/cvt$d;

    invoke-interface {v0}, Lo/cvt$d;->b()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lo/cvs;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v0, p0, Lo/cvs;->e:Lo/cvt$d;

    invoke-interface {v0, v2}, Lo/cvt$d;->b(I)V

    iget-object v0, p0, Lo/cvs;->b:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    :goto_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4

    iget-object v0, p0, Lo/cvs;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v2, p0, Lo/cvs;->a:Ljava/util/List;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lo/cvs;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cvs;->c:Lo/cvl;

    iget-object v0, p0, Lo/cvs;->e:Lo/cvt$d;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/cvt$d;->c(I)V

    return-void
.end method
