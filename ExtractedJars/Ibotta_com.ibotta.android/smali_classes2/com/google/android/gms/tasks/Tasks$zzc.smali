.class final Lcom/google/android/gms/tasks/Tasks$zzc;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/Tasks$zzb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/tasks/Tasks;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "zzc"
.end annotation


# instance fields
.field private final mLock:Ljava/lang/Object;

.field private final zzafh:Lcom/google/android/gms/tasks/zzu;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/zzu<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private zzagh:Ljava/lang/Exception;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private final zzagl:I

.field private zzagm:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private zzagn:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private zzago:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private zzagp:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILcom/google/android/gms/tasks/zzu;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/tasks/zzu<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->mLock:Ljava/lang/Object;

    iput p1, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzagl:I

    iput-object p2, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzafh:Lcom/google/android/gms/tasks/zzu;

    return-void
.end method

.method private final zzdu()V
    .locals 6
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation

    iget v0, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzagm:I

    iget v1, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzagn:I

    add-int/2addr v0, v1

    iget v2, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzago:I

    add-int/2addr v0, v2

    iget v2, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzagl:I

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzagh:Ljava/lang/Exception;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzafh:Lcom/google/android/gms/tasks/zzu;

    new-instance v3, Ljava/util/concurrent/ExecutionException;

    const/16 v4, 0x36

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " out of "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " underlying tasks failed"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzagh:Ljava/lang/Exception;

    invoke-direct {v3, v1, v2}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v3}, Lcom/google/android/gms/tasks/zzu;->setException(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzagp:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzafh:Lcom/google/android/gms/tasks/zzu;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/zzu;->zzdp()Z

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzafh:Lcom/google/android/gms/tasks/zzu;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/zzu;->setResult(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzago:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzago:I

    iput-boolean v2, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzagp:Z

    invoke-direct {p0}, Lcom/google/android/gms/tasks/Tasks$zzc;->zzdu()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final onFailure(Ljava/lang/Exception;)V
    .locals 2
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzagn:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzagn:I

    iput-object p1, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzagh:Ljava/lang/Exception;

    invoke-direct {p0}, Lcom/google/android/gms/tasks/Tasks$zzc;->zzdu()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->mLock:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzagm:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/tasks/Tasks$zzc;->zzagm:I

    invoke-direct {p0}, Lcom/google/android/gms/tasks/Tasks$zzc;->zzdu()V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
