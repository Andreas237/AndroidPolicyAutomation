.class final Lcom/google/android/gms/internal/stable/zzf;
.super Landroid/database/ContentObserver;


# instance fields
.field private final synthetic zzagr:Lcom/google/android/gms/internal/stable/zzh;


# direct methods
.method constructor <init>(Landroid/os/Handler;Lcom/google/android/gms/internal/stable/zzh;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/stable/zzf;->zzagr:Lcom/google/android/gms/internal/stable/zzh;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onChange(Z)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/stable/zzf;->zzagr:Lcom/google/android/gms/internal/stable/zzh;

    iget-object p1, p1, Lcom/google/android/gms/internal/stable/zzh;->zzagu:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
