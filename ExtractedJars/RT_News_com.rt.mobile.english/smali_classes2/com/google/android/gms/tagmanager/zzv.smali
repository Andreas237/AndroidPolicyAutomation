.class final Lcom/google/android/gms/tagmanager/zzv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/ContainerHolder;


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# instance fields
.field private zzacu:Lcom/google/android/gms/common/api/Status;

.field private final zzawb:Landroid/os/Looper;

.field private zzawc:Lcom/google/android/gms/tagmanager/Container;

.field private zzawd:Lcom/google/android/gms/tagmanager/Container;

.field private zzawe:Lcom/google/android/gms/tagmanager/zzx;

.field private zzawf:Lcom/google/android/gms/tagmanager/zzw;

.field private zzawg:Z

.field private zzawh:Lcom/google/android/gms/tagmanager/TagManager;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzv;->zzacu:Lcom/google/android/gms/common/api/Status;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawb:Landroid/os/Looper;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/tagmanager/TagManager;Landroid/os/Looper;Lcom/google/android/gms/tagmanager/Container;Lcom/google/android/gms/tagmanager/zzw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawh:Lcom/google/android/gms/tagmanager/TagManager;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawb:Landroid/os/Looper;

    iput-object p3, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawc:Lcom/google/android/gms/tagmanager/Container;

    iput-object p4, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawf:Lcom/google/android/gms/tagmanager/zzw;

    sget-object p2, Lcom/google/android/gms/common/api/Status;->RESULT_SUCCESS:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/zzv;->zzacu:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/tagmanager/TagManager;->zza(Lcom/google/android/gms/tagmanager/zzv;)I

    return-void
.end method

.method private final zzml()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawe:Lcom/google/android/gms/tagmanager/zzx;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawe:Lcom/google/android/gms/tagmanager/zzx;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawd:Lcom/google/android/gms/tagmanager/Container;

    invoke-virtual {v1}, Lcom/google/android/gms/tagmanager/Container;->zzmi()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/tagmanager/zzx;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/zzx;->sendMessage(Landroid/os/Message;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final declared-synchronized getContainer()Lcom/google/android/gms/tagmanager/Container;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawg:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "ContainerHolder is released."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawd:Lcom/google/android/gms/tagmanager/Container;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawd:Lcom/google/android/gms/tagmanager/Container;

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawc:Lcom/google/android/gms/tagmanager/Container;

    iput-object v1, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawd:Lcom/google/android/gms/tagmanager/Container;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawc:Lcom/google/android/gms/tagmanager/Container;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method final getContainerId()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawg:Z

    if-eqz v0, :cond_0

    const-string v0, "getContainerId called on a released ContainerHolder."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    const-string v0, ""

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawc:Lcom/google/android/gms/tagmanager/Container;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/Container;->getContainerId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzacu:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public final declared-synchronized refresh()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawg:Z

    if-eqz v0, :cond_0

    const-string v0, "Refreshing a released ContainerHolder."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawf:Lcom/google/android/gms/tagmanager/zzw;

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/zzw;->zzmm()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized release()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawg:Z

    if-eqz v0, :cond_0

    const-string v0, "Releasing a released ContainerHolder."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawg:Z

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawh:Lcom/google/android/gms/tagmanager/TagManager;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/tagmanager/TagManager;->zzb(Lcom/google/android/gms/tagmanager/zzv;)Z

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawc:Lcom/google/android/gms/tagmanager/Container;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/Container;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawc:Lcom/google/android/gms/tagmanager/Container;

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawd:Lcom/google/android/gms/tagmanager/Container;

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawf:Lcom/google/android/gms/tagmanager/zzw;

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawe:Lcom/google/android/gms/tagmanager/zzx;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized setContainerAvailableListener(Lcom/google/android/gms/tagmanager/ContainerHolder$ContainerAvailableListener;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawg:Z

    if-eqz v0, :cond_0

    const-string p1, "ContainerHolder is released."

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    :try_start_1
    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawe:Lcom/google/android/gms/tagmanager/zzx;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    new-instance v0, Lcom/google/android/gms/tagmanager/zzx;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawb:Landroid/os/Looper;

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/tagmanager/zzx;-><init>(Lcom/google/android/gms/tagmanager/zzv;Lcom/google/android/gms/tagmanager/ContainerHolder$ContainerAvailableListener;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawe:Lcom/google/android/gms/tagmanager/zzx;

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawd:Lcom/google/android/gms/tagmanager/Container;

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzv;->zzml()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zza(Lcom/google/android/gms/tagmanager/Container;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawg:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawd:Lcom/google/android/gms/tagmanager/Container;

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzv;->zzml()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized zzco(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawg:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawc:Lcom/google/android/gms/tagmanager/Container;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tagmanager/Container;->zzco(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method final zzcp(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawg:Z

    if-eqz v0, :cond_0

    const-string p1, "setCtfeUrlPathAndQuery called on a released ContainerHolder."

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawf:Lcom/google/android/gms/tagmanager/zzw;

    invoke-interface {v0, p1}, Lcom/google/android/gms/tagmanager/zzw;->zzcp(Ljava/lang/String;)V

    return-void
.end method

.method final zzmk()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawg:Z

    if-eqz v0, :cond_0

    const-string v0, "setCtfeUrlPathAndQuery called on a released ContainerHolder."

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdi;->e(Ljava/lang/String;)V

    const-string v0, ""

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzv;->zzawf:Lcom/google/android/gms/tagmanager/zzw;

    invoke-interface {v0}, Lcom/google/android/gms/tagmanager/zzw;->zzmk()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
