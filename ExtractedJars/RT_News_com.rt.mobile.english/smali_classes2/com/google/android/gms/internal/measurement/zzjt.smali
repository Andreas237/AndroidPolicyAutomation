.class final Lcom/google/android/gms/internal/measurement/zzjt;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzare:Lcom/google/android/gms/internal/measurement/zzjx;

.field private final synthetic zzarf:Lcom/google/android/gms/internal/measurement/zzjs;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzjs;Lcom/google/android/gms/internal/measurement/zzjx;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjt;->zzarf:Lcom/google/android/gms/internal/measurement/zzjs;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjt;->zzare:Lcom/google/android/gms/internal/measurement/zzjx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjt;->zzarf:Lcom/google/android/gms/internal/measurement/zzjs;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjt;->zzare:Lcom/google/android/gms/internal/measurement/zzjx;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(Lcom/google/android/gms/internal/measurement/zzjs;Lcom/google/android/gms/internal/measurement/zzjx;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjt;->zzarf:Lcom/google/android/gms/internal/measurement/zzjs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->start()V

    return-void
.end method
