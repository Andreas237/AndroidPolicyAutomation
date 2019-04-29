.class final Lcom/google/android/gms/internal/measurement/zzia;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

.field private final synthetic zzaom:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzhl;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzia;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/zzia;->zzaom:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzia;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzia;->zzaom:Z

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzhl;->zza(Lcom/google/android/gms/internal/measurement/zzhl;Z)V

    return-void
.end method
