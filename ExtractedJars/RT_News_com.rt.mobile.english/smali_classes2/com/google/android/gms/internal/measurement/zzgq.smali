.class final Lcom/google/android/gms/internal/measurement/zzgq;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzano:Lcom/google/android/gms/internal/measurement/zzdz;

.field private final synthetic zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

.field private final synthetic zzanq:Lcom/google/android/gms/internal/measurement/zzee;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzgo;Lcom/google/android/gms/internal/measurement/zzee;Lcom/google/android/gms/internal/measurement/zzdz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzgq;->zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzgq;->zzanq:Lcom/google/android/gms/internal/measurement/zzee;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzgq;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgq;->zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgo;->zza(Lcom/google/android/gms/internal/measurement/zzgo;)Lcom/google/android/gms/internal/measurement/zzjs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlg()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgq;->zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgo;->zza(Lcom/google/android/gms/internal/measurement/zzgo;)Lcom/google/android/gms/internal/measurement/zzjs;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzgq;->zzanq:Lcom/google/android/gms/internal/measurement/zzee;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzgq;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzjs;->zzc(Lcom/google/android/gms/internal/measurement/zzee;Lcom/google/android/gms/internal/measurement/zzdz;)V

    return-void
.end method
