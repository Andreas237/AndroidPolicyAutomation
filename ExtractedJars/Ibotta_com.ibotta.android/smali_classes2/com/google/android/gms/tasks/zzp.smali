.class final Lcom/google/android/gms/tasks/zzp;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzafn:Lcom/google/android/gms/tasks/Task;

.field private final synthetic zzafz:Lcom/google/android/gms/tasks/zzo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tasks/zzo;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tasks/zzp;->zzafz:Lcom/google/android/gms/tasks/zzo;

    iput-object p2, p0, Lcom/google/android/gms/tasks/zzp;->zzafn:Lcom/google/android/gms/tasks/Task;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tasks/zzp;->zzafz:Lcom/google/android/gms/tasks/zzo;

    invoke-static {v0}, Lcom/google/android/gms/tasks/zzo;->zza(Lcom/google/android/gms/tasks/zzo;)Lcom/google/android/gms/tasks/SuccessContinuation;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/tasks/zzp;->zzafn:Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/tasks/SuccessContinuation;->then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/tasks/RuntimeExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/tasks/zzp;->zzafz:Lcom/google/android/gms/tasks/zzo;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Continuation returned null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/zzo;->onFailure(Ljava/lang/Exception;)V

    return-void

    :cond_0
    sget-object v1, Lcom/google/android/gms/tasks/TaskExecutors;->zzagd:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lcom/google/android/gms/tasks/zzp;->zzafz:Lcom/google/android/gms/tasks/zzo;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    sget-object v1, Lcom/google/android/gms/tasks/TaskExecutors;->zzagd:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lcom/google/android/gms/tasks/zzp;->zzafz:Lcom/google/android/gms/tasks/zzo;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    sget-object v1, Lcom/google/android/gms/tasks/TaskExecutors;->zzagd:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lcom/google/android/gms/tasks/zzp;->zzafz:Lcom/google/android/gms/tasks/zzo;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnCanceledListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCanceledListener;)Lcom/google/android/gms/tasks/Task;

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/tasks/zzp;->zzafz:Lcom/google/android/gms/tasks/zzo;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/zzo;->onFailure(Ljava/lang/Exception;)V

    return-void

    :catch_1
    iget-object v0, p0, Lcom/google/android/gms/tasks/zzp;->zzafz:Lcom/google/android/gms/tasks/zzo;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/zzo;->onCanceled()V

    return-void

    :catch_2
    move-exception v0

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/RuntimeExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/tasks/zzp;->zzafz:Lcom/google/android/gms/tasks/zzo;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/RuntimeExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/zzo;->onFailure(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/tasks/zzp;->zzafz:Lcom/google/android/gms/tasks/zzo;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/tasks/zzo;->onFailure(Ljava/lang/Exception;)V

    return-void
.end method
