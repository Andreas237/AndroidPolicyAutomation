.class final Lcom/google/android/gms/measurement/internal/zzex;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzasr:Lcom/google/android/gms/measurement/internal/zzes;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzes;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzex;->zzasr:Lcom/google/android/gms/measurement/internal/zzes;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzex;->zzasr:Lcom/google/android/gms/measurement/internal/zzes;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzes;->zzasi:Lcom/google/android/gms/measurement/internal/zzeb;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/measurement/internal/zzeb;->zza(Lcom/google/android/gms/measurement/internal/zzeb;Lcom/google/android/gms/measurement/internal/zzaj;)Lcom/google/android/gms/measurement/internal/zzaj;

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzex;->zzasr:Lcom/google/android/gms/measurement/internal/zzes;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzes;->zzasi:Lcom/google/android/gms/measurement/internal/zzeb;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzeb;->zzb(Lcom/google/android/gms/measurement/internal/zzeb;)V

    return-void
.end method
