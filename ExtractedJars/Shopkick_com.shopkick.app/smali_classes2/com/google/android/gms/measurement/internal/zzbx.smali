.class final Lcom/google/android/gms/measurement/internal/zzbx;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaqg:Lcom/google/android/gms/measurement/internal/zzcz;

.field private final synthetic zzaqh:Lcom/google/android/gms/measurement/internal/zzbw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzbw;Lcom/google/android/gms/measurement/internal/zzcz;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzbx;->zzaqh:Lcom/google/android/gms/measurement/internal/zzbw;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzbx;->zzaqg:Lcom/google/android/gms/measurement/internal/zzcz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbx;->zzaqh:Lcom/google/android/gms/measurement/internal/zzbw;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzbx;->zzaqg:Lcom/google/android/gms/measurement/internal/zzcz;

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/zzbw;->zza(Lcom/google/android/gms/measurement/internal/zzbw;Lcom/google/android/gms/measurement/internal/zzcz;)V

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzbx;->zzaqh:Lcom/google/android/gms/measurement/internal/zzbw;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbw;->start()V

    return-void
.end method
