.class final Lcom/google/android/gms/internal/measurement/zzxj;
.super Lcom/google/android/gms/internal/measurement/zzxg;


# instance fields
.field private final zzboo:Lcom/google/android/gms/internal/measurement/zzxh;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzxg;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzxh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzxh;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzxj;->zzboo:Lcom/google/android/gms/internal/measurement/zzxh;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;Ljava/io/PrintStream;)V
    .locals 3

    invoke-static {p1, p2}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->printStackTrace(Ljava/lang/Throwable;Ljava/io/PrintStream;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzxj;->zzboo:Lcom/google/android/gms/internal/measurement/zzxh;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/measurement/zzxh;->zza(Ljava/lang/Throwable;Z)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    monitor-enter p1

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    const-string v2, "Suppressed: "

    invoke-virtual {p2, v2}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    invoke-static {v1, p2}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->printStackTrace(Ljava/lang/Throwable;Ljava/io/PrintStream;)V

    goto :goto_0

    :cond_1
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
