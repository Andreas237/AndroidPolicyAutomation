.class public final Lcom/google/android/gms/internal/measurement/zzbl;
.super Lcom/google/android/gms/internal/measurement/zzar;


# instance fields
.field private volatile zzue:Ljava/lang/String;

.field private zzxs:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/measurement/zzat;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzar;-><init>(Lcom/google/android/gms/internal/measurement/zzat;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzbl;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzbl;->zzdq()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final zzb(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 3

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    const-string v0, "ClientId should be saved from worker thread"

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotMainThread(Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "Storing clientId"

    invoke-virtual {p0, v2, p2}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "gaClientId"

    invoke-virtual {p1, v2, v0}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/io/FileOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    :try_start_1
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Failed to close clientId writing stream"

    invoke-virtual {p0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    :goto_0
    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    :try_start_2
    const-string p2, "Error writing to clientId file"

    invoke-virtual {p0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_1

    :try_start_3
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    :catch_2
    move-exception p1

    const-string p2, "Failed to close clientId writing stream"

    invoke-virtual {p0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    :goto_1
    return v0

    :catch_3
    move-exception p1

    :try_start_4
    const-string p2, "Error creating clientId file"

    invoke-virtual {p0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v1, :cond_2

    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_2

    :catch_4
    move-exception p1

    const-string p2, "Failed to close clientId writing stream"

    invoke-virtual {p0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    :goto_2
    return v0

    :goto_3
    if-eqz v1, :cond_3

    :try_start_6
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    goto :goto_4

    :catch_5
    move-exception p2

    const-string v0, "Failed to close clientId writing stream"

    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    :goto_4
    throw p1
.end method

.method private final zzd(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    const-string v0, "ClientId should be loaded from worker thread"

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotMainThread(Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "gaClientId"

    invoke-virtual {p1, v1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v2, 0x24

    :try_start_1
    new-array v3, v2, [B

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4, v2}, Ljava/io/FileInputStream;->read([BII)I

    move-result v2

    invoke-virtual {v1}, Ljava/io/FileInputStream;->available()I

    move-result v5

    if-lez v5, :cond_1

    const-string v2, "clientId file seems corrupted, deleting it."

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/zzaq;->zzt(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    const-string v2, "gaClientId"

    invoke-virtual {p1, v2}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v1, :cond_0

    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Failed to close client id reading stream"

    invoke-virtual {p0, v1, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    const/16 v5, 0xe

    if-ge v2, v5, :cond_3

    :try_start_3
    const-string v2, "clientId file is empty, deleting it."

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/zzaq;->zzt(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    const-string v2, "gaClientId"

    invoke-virtual {p1, v2}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v1, :cond_2

    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    const-string v1, "Failed to close client id reading stream"

    invoke-virtual {p0, v1, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    :goto_1
    return-object v0

    :cond_3
    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, v3, v4, v2}, Ljava/lang/String;-><init>([BII)V

    const-string v2, "Read client id from disk"

    invoke-virtual {p0, v2, v5}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_8
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz v1, :cond_4

    :try_start_6
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    const-string v0, "Failed to close client id reading stream"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    :goto_2
    return-object v5

    :catch_3
    move-exception v2

    goto :goto_3

    :catchall_0
    move-exception p1

    move-object v1, v0

    goto :goto_5

    :catch_4
    move-exception v2

    move-object v1, v0

    :goto_3
    :try_start_7
    const-string v3, "Error reading client id file, deleting it"

    invoke-virtual {p0, v3, v2}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "gaClientId"

    invoke-virtual {p1, v2}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-eqz v1, :cond_5

    :try_start_8
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_4

    :catch_5
    move-exception p1

    const-string v1, "Failed to close client id reading stream"

    invoke-virtual {p0, v1, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_5
    :goto_4
    return-object v0

    :catchall_1
    move-exception p1

    :goto_5
    if-eqz v1, :cond_6

    :try_start_9
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    goto :goto_6

    :catch_6
    move-exception v0

    const-string v1, "Failed to close client id reading stream"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_6
    :goto_6
    throw p1

    :catch_7
    move-object v1, v0

    :catch_8
    if-eqz v1, :cond_7

    :try_start_a
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    goto :goto_7

    :catch_9
    move-exception p1

    const-string v1, "Failed to close client id reading stream"

    invoke-virtual {p0, v1, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_7
    :goto_7
    return-object v0
.end method

.method private final zzdq()Ljava/lang/String;
    .locals 2
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbw()Lcom/google/android/gms/analytics/zzk;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/analytics/zzk;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/measurement/zzbl;->zzb(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v0, "0"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Error saving clientId file"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "0"

    return-object v0
.end method


# virtual methods
.method protected final zzac()V
    .locals 0

    return-void
.end method

.method public final zzdn()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzar;->zzch()V

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbl;->zzue:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbw()Lcom/google/android/gms/analytics/zzk;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzbm;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/measurement/zzbm;-><init>(Lcom/google/android/gms/internal/measurement/zzbl;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/zzk;->zza(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbl;->zzxs:Ljava/util/concurrent/Future;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbl;->zzxs:Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbl;->zzxs:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbl;->zzue:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_2
    const-string v1, "Failed to load or generate client id"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "0"

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbl;->zzue:Ljava/lang/String;

    goto :goto_1

    :catch_1
    move-exception v0

    const-string v1, "ClientId loading or generation was interrupted"

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzd(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "0"

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbl;->zzue:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, "0"

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbl;->zzue:Ljava/lang/String;

    :cond_1
    const-string v0, "Loaded clientId"

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzbl;->zzue:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/zzaq;->zza(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbl;->zzxs:Ljava/util/concurrent/Future;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbl;->zzue:Ljava/lang/String;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method final zzdo()Ljava/lang/String;
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbl;->zzue:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbw()Lcom/google/android/gms/analytics/zzk;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzbn;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/measurement/zzbn;-><init>(Lcom/google/android/gms/internal/measurement/zzbl;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/zzk;->zza(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbl;->zzxs:Ljava/util/concurrent/Future;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzbl;->zzdn()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method final zzdp()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbw()Lcom/google/android/gms/analytics/zzk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/zzk;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzbl;->zzd(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzbl;->zzdq()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method
