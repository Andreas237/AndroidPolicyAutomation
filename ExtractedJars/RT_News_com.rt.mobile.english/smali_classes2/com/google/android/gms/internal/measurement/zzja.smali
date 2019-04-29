.class final Lcom/google/android/gms/internal/measurement/zzja;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzapw:Lcom/google/android/gms/internal/measurement/zzix;

.field private final synthetic zzapx:Lcom/google/android/gms/internal/measurement/zzez;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzix;Lcom/google/android/gms/internal/measurement/zzez;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzja;->zzapw:Lcom/google/android/gms/internal/measurement/zzix;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzja;->zzapx:Lcom/google/android/gms/internal/measurement/zzez;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzja;->zzapw:Lcom/google/android/gms/internal/measurement/zzix;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzja;->zzapw:Lcom/google/android/gms/internal/measurement/zzix;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/measurement/zzix;->zza(Lcom/google/android/gms/internal/measurement/zzix;Z)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzja;->zzapw:Lcom/google/android/gms/internal/measurement/zzix;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzix;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzij;->isConnected()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzja;->zzapw:Lcom/google/android/gms/internal/measurement/zzix;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzix;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzhh;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzfh;->zziy()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v1

    const-string v2, "Connected to remote service"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzja;->zzapw:Lcom/google/android/gms/internal/measurement/zzix;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzix;->zzapn:Lcom/google/android/gms/internal/measurement/zzij;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzja;->zzapx:Lcom/google/android/gms/internal/measurement/zzez;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/zzij;->zza(Lcom/google/android/gms/internal/measurement/zzez;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
