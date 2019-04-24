.class final Lcom/google/android/gms/measurement/internal/zzbn;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaoe:Lcom/google/android/gms/measurement/internal/zzbw;

.field private final synthetic zzaof:Lcom/google/android/gms/measurement/internal/zzas;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzbm;Lcom/google/android/gms/measurement/internal/zzbw;Lcom/google/android/gms/measurement/internal/zzas;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzbn;->zzaoe:Lcom/google/android/gms/measurement/internal/zzbw;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzbn;->zzaof:Lcom/google/android/gms/measurement/internal/zzas;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbn;->zzaoe:Lcom/google/android/gms/measurement/internal/zzbw;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzkk()Lcom/google/android/gms/measurement/internal/zzbj;

    move-result-object v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbn;->zzaof:Lcom/google/android/gms/measurement/internal/zzas;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "Install Referrer Reporter is null"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzau;->zzby(Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbn;->zzaoe:Lcom/google/android/gms/measurement/internal/zzbw;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->zzkk()Lcom/google/android/gms/measurement/internal/zzbj;

    move-result-object v0

    .line 6
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzbj;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzbw;->zzgg()V

    .line 7
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzbj;->zzada:Lcom/google/android/gms/measurement/internal/zzbw;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzbw;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzbj;->zzce(Ljava/lang/String;)V

    return-void
.end method
