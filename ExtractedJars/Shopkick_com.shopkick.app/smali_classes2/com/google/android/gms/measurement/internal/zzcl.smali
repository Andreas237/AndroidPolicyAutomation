.class final Lcom/google/android/gms/measurement/internal/zzcl;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "[B>;"
    }
.end annotation


# instance fields
.field private final synthetic zzagi:Lcom/google/android/gms/measurement/internal/zzag;

.field private final synthetic zzagj:Ljava/lang/String;

.field private final synthetic zzaql:Lcom/google/android/gms/measurement/internal/zzby;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzby;Lcom/google/android/gms/measurement/internal/zzag;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzcl;->zzaql:Lcom/google/android/gms/measurement/internal/zzby;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzcl;->zzagi:Lcom/google/android/gms/measurement/internal/zzag;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzcl;->zzagj:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzcl;->zzaql:Lcom/google/android/gms/measurement/internal/zzby;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzby;->zza(Lcom/google/android/gms/measurement/internal/zzby;)Lcom/google/android/gms/measurement/internal/zzfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfo;->zzme()V

    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzcl;->zzaql:Lcom/google/android/gms/measurement/internal/zzby;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzby;->zza(Lcom/google/android/gms/measurement/internal/zzby;)Lcom/google/android/gms/measurement/internal/zzfo;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfo;->zzlw()Lcom/google/android/gms/measurement/internal/zzdv;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzcl;->zzagi:Lcom/google/android/gms/measurement/internal/zzag;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzcl;->zzagj:Ljava/lang/String;

    .line 6
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzdv;->zzb(Lcom/google/android/gms/measurement/internal/zzag;Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method
