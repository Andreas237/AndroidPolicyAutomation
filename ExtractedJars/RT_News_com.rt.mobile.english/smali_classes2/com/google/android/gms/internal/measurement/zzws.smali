.class final Lcom/google/android/gms/internal/measurement/zzws;
.super Landroid/database/ContentObserver;


# instance fields
.field private final synthetic zzbnn:Lcom/google/android/gms/internal/measurement/zzwr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzwr;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzws;->zzbnn:Lcom/google/android/gms/internal/measurement/zzwr;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onChange(Z)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzws;->zzbnn:Lcom/google/android/gms/internal/measurement/zzwr;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzwr;->zzsd()V

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzws;->zzbnn:Lcom/google/android/gms/internal/measurement/zzwr;

    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/zzwr;->zza(Lcom/google/android/gms/internal/measurement/zzwr;)V

    return-void
.end method
