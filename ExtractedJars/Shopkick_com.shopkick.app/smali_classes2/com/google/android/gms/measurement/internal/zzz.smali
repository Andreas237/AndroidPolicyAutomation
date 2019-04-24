.class final Lcom/google/android/gms/measurement/internal/zzz;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaho:Lcom/google/android/gms/measurement/internal/zzct;

.field private final synthetic zzahp:Lcom/google/android/gms/measurement/internal/zzy;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzy;Lcom/google/android/gms/measurement/internal/zzct;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzz;->zzahp:Lcom/google/android/gms/measurement/internal/zzy;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzz;->zzaho:Lcom/google/android/gms/measurement/internal/zzct;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzz;->zzaho:Lcom/google/android/gms/measurement/internal/zzct;

    invoke-interface {v0}, Lcom/google/android/gms/measurement/internal/zzct;->zzgw()Lcom/google/android/gms/measurement/internal/zzn;

    invoke-static {}, Lcom/google/android/gms/measurement/internal/zzn;->isMainThread()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzz;->zzaho:Lcom/google/android/gms/measurement/internal/zzct;

    invoke-interface {v0}, Lcom/google/android/gms/measurement/internal/zzct;->zzgs()Lcom/google/android/gms/measurement/internal/zzbr;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/measurement/internal/zzbr;->zzc(Ljava/lang/Runnable;)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzz;->zzahp:Lcom/google/android/gms/measurement/internal/zzy;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzy;->zzej()Z

    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzz;->zzahp:Lcom/google/android/gms/measurement/internal/zzy;

    const-wide/16 v2, 0x0

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzy;->zza(Lcom/google/android/gms/measurement/internal/zzy;J)J

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzz;->zzahp:Lcom/google/android/gms/measurement/internal/zzy;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzy;->run()V

    :cond_1
    return-void
.end method
