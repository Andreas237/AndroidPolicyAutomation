.class final Lcom/google/android/gms/internal/measurement/zzgb;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzali:Lcom/google/android/gms/internal/measurement/zzga;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzga;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzgb;->zzali:Lcom/google/android/gms/internal/measurement/zzga;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgb;->zzali:Lcom/google/android/gms/internal/measurement/zzga;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzga;->zzalh:Lcom/google/android/gms/internal/measurement/zzfy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfy;->zzjq()Landroid/os/Bundle;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzgb;->zzali:Lcom/google/android/gms/internal/measurement/zzga;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzga;->zzalh:Lcom/google/android/gms/internal/measurement/zzfy;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/zzfy;->zzc(Landroid/os/Bundle;)V

    return-void
.end method
