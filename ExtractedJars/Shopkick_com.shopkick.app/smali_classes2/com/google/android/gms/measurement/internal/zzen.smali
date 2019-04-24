.class final Lcom/google/android/gms/measurement/internal/zzen;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaqk:Lcom/google/android/gms/measurement/internal/zzk;

.field private final synthetic zzasi:Lcom/google/android/gms/measurement/internal/zzeb;

.field private final synthetic zzask:Z

.field private final synthetic zzasl:Z

.field private final synthetic zzasm:Lcom/google/android/gms/measurement/internal/zzo;

.field private final synthetic zzasn:Lcom/google/android/gms/measurement/internal/zzo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzeb;ZZLcom/google/android/gms/measurement/internal/zzo;Lcom/google/android/gms/measurement/internal/zzk;Lcom/google/android/gms/measurement/internal/zzo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzasi:Lcom/google/android/gms/measurement/internal/zzeb;

    iput-boolean p2, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzask:Z

    iput-boolean p3, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzasl:Z

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzasm:Lcom/google/android/gms/measurement/internal/zzo;

    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzaqk:Lcom/google/android/gms/measurement/internal/zzk;

    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzasn:Lcom/google/android/gms/measurement/internal/zzo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzasi:Lcom/google/android/gms/measurement/internal/zzeb;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzeb;->zzd(Lcom/google/android/gms/measurement/internal/zzeb;)Lcom/google/android/gms/measurement/internal/zzaj;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzasi:Lcom/google/android/gms/measurement/internal/zzeb;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v0

    const-string v1, "Discarding data. Failed to send conditional user property to service"

    .line 6
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzau;->zzby(Ljava/lang/String;)V

    return-void

    .line 8
    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzask:Z

    if-eqz v1, :cond_2

    .line 9
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzasi:Lcom/google/android/gms/measurement/internal/zzeb;

    iget-boolean v2, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzasl:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzasm:Lcom/google/android/gms/measurement/internal/zzo;

    :goto_0
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzaqk:Lcom/google/android/gms/measurement/internal/zzk;

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/measurement/internal/zzeb;->zza(Lcom/google/android/gms/measurement/internal/zzaj;Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;Lcom/google/android/gms/measurement/internal/zzk;)V

    goto :goto_1

    .line 10
    :cond_2
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzasn:Lcom/google/android/gms/measurement/internal/zzo;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzo;->packageName:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 11
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzasm:Lcom/google/android/gms/measurement/internal/zzo;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzaqk:Lcom/google/android/gms/measurement/internal/zzk;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzaj;->zza(Lcom/google/android/gms/measurement/internal/zzo;Lcom/google/android/gms/measurement/internal/zzk;)V

    goto :goto_1

    .line 12
    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzasm:Lcom/google/android/gms/measurement/internal/zzo;

    invoke-interface {v0, v1}, Lcom/google/android/gms/measurement/internal/zzaj;->zzb(Lcom/google/android/gms/measurement/internal/zzo;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 15
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzasi:Lcom/google/android/gms/measurement/internal/zzeb;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgt()Lcom/google/android/gms/measurement/internal/zzas;

    move-result-object v1

    .line 16
    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/zzas;->zzjg()Lcom/google/android/gms/measurement/internal/zzau;

    move-result-object v1

    const-string v2, "Failed to send conditional user property to the service"

    .line 17
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/measurement/internal/zzau;->zzg(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzen;->zzasi:Lcom/google/android/gms/measurement/internal/zzeb;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzeb;->zze(Lcom/google/android/gms/measurement/internal/zzeb;)V

    return-void
.end method
