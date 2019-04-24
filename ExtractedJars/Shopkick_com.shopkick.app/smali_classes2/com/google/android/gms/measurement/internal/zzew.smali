.class final Lcom/google/android/gms/measurement/internal/zzew;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzasr:Lcom/google/android/gms/measurement/internal/zzes;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzes;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzew;->zzasr:Lcom/google/android/gms/measurement/internal/zzes;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzew;->zzasr:Lcom/google/android/gms/measurement/internal/zzes;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzes;->zzasi:Lcom/google/android/gms/measurement/internal/zzeb;

    new-instance v1, Landroid/content/ComponentName;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzew;->zzasr:Lcom/google/android/gms/measurement/internal/zzes;

    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzes;->zzasi:Lcom/google/android/gms/measurement/internal/zzeb;

    .line 3
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzcr;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 4
    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzew;->zzasr:Lcom/google/android/gms/measurement/internal/zzes;

    iget-object v3, v3, Lcom/google/android/gms/measurement/internal/zzes;->zzasi:Lcom/google/android/gms/measurement/internal/zzeb;

    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzcr;->zzgw()Lcom/google/android/gms/measurement/internal/zzn;

    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    .line 6
    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 7
    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/zzeb;->zza(Lcom/google/android/gms/measurement/internal/zzeb;Landroid/content/ComponentName;)V

    return-void
.end method
