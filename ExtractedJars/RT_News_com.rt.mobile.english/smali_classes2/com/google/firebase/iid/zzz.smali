.class public final Lcom/google/firebase/iid/zzz;
.super Ljava/lang/Object;


# static fields
.field private static zzbk:Lcom/google/firebase/iid/zzz;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "MessengerIpcClient.class"
    .end annotation
.end field


# instance fields
.field private final zzbl:Ljava/util/concurrent/ScheduledExecutorService;

.field private zzbm:Lcom/google/firebase/iid/zzab;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private zzbn:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final zzv:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/firebase/iid/zzab;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/firebase/iid/zzab;-><init>(Lcom/google/firebase/iid/zzz;Lcom/google/firebase/iid/zzaa;)V

    iput-object v0, p0, Lcom/google/firebase/iid/zzz;->zzbm:Lcom/google/firebase/iid/zzab;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/firebase/iid/zzz;->zzbn:I

    iput-object p2, p0, Lcom/google/firebase/iid/zzz;->zzbl:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/iid/zzz;->zzv:Landroid/content/Context;

    return-void
.end method

.method static synthetic zza(Lcom/google/firebase/iid/zzz;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/iid/zzz;->zzv:Landroid/content/Context;

    return-object p0
.end method

.method private final declared-synchronized zza(Lcom/google/firebase/iid/zzai;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/firebase/iid/zzai<",
            "TT;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "MessengerIpcClient"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MessengerIpcClient"

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x9

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Queueing "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/iid/zzz;->zzbm:Lcom/google/firebase/iid/zzab;

    invoke-virtual {v0, p1}, Lcom/google/firebase/iid/zzab;->zzb(Lcom/google/firebase/iid/zzai;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/firebase/iid/zzab;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/firebase/iid/zzab;-><init>(Lcom/google/firebase/iid/zzz;Lcom/google/firebase/iid/zzaa;)V

    iput-object v0, p0, Lcom/google/firebase/iid/zzz;->zzbm:Lcom/google/firebase/iid/zzab;

    iget-object v0, p0, Lcom/google/firebase/iid/zzz;->zzbm:Lcom/google/firebase/iid/zzab;

    invoke-virtual {v0, p1}, Lcom/google/firebase/iid/zzab;->zzb(Lcom/google/firebase/iid/zzai;)Z

    :cond_1
    iget-object p1, p1, Lcom/google/firebase/iid/zzai;->zzbx:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic zzb(Lcom/google/firebase/iid/zzz;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/iid/zzz;->zzbl:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method public static declared-synchronized zzc(Landroid/content/Context;)Lcom/google/firebase/iid/zzz;
    .locals 3

    const-class v0, Lcom/google/firebase/iid/zzz;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/firebase/iid/zzz;->zzbk:Lcom/google/firebase/iid/zzz;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/firebase/iid/zzz;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/google/firebase/iid/zzz;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V

    sput-object v1, Lcom/google/firebase/iid/zzz;->zzbk:Lcom/google/firebase/iid/zzz;

    :cond_0
    sget-object p0, Lcom/google/firebase/iid/zzz;->zzbk:Lcom/google/firebase/iid/zzz;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private final declared-synchronized zzw()I
    .locals 2

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/google/firebase/iid/zzz;->zzbn:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/firebase/iid/zzz;->zzbn:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final zza(ILandroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/google/firebase/iid/zzah;

    invoke-direct {p0}, Lcom/google/firebase/iid/zzz;->zzw()I

    move-result v0

    const/4 v1, 0x2

    invoke-direct {p1, v0, v1, p2}, Lcom/google/firebase/iid/zzah;-><init>(IILandroid/os/Bundle;)V

    invoke-direct {p0, p1}, Lcom/google/firebase/iid/zzz;->zza(Lcom/google/firebase/iid/zzai;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(ILandroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/os/Bundle;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/google/firebase/iid/zzak;

    invoke-direct {p0}, Lcom/google/firebase/iid/zzz;->zzw()I

    move-result v0

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1, p2}, Lcom/google/firebase/iid/zzak;-><init>(IILandroid/os/Bundle;)V

    invoke-direct {p0, p1}, Lcom/google/firebase/iid/zzz;->zza(Lcom/google/firebase/iid/zzai;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
