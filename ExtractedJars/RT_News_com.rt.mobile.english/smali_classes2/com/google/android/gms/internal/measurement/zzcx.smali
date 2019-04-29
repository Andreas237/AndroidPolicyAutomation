.class final Lcom/google/android/gms/internal/measurement/zzcx;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzca;


# instance fields
.field private final synthetic zzabt:Ljava/lang/Runnable;

.field private final synthetic zzabu:Lcom/google/android/gms/internal/measurement/zzcu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzcu;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcx;->zzabu:Lcom/google/android/gms/internal/measurement/zzcu;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzcx;->zzabt:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcx;->zzabu:Lcom/google/android/gms/internal/measurement/zzcu;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzcu;->zza(Lcom/google/android/gms/internal/measurement/zzcu;)Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzcx;->zzabt:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
