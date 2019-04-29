.class final Lcom/google/android/gms/internal/measurement/zzgp;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzano:Lcom/google/android/gms/internal/measurement/zzdz;

.field private final synthetic zzanp:Lcom/google/android/gms/internal/measurement/zzgo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzgo;Lcom/google/android/gms/internal/measurement/zzdz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzgp;->zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzgp;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgp;->zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgo;->zza(Lcom/google/android/gms/internal/measurement/zzgo;)Lcom/google/android/gms/internal/measurement/zzjs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlg()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgp;->zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgo;->zza(Lcom/google/android/gms/internal/measurement/zzgo;)Lcom/google/android/gms/internal/measurement/zzjs;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzgp;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjs;->zze(Lcom/google/android/gms/internal/measurement/zzdz;)V

    return-void
.end method
