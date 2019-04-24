.class final Lcom/google/android/gms/measurement/internal/zzce;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/util/List<",
        "Lcom/google/android/gms/measurement/internal/zzfx;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final synthetic zzads:Ljava/lang/String;

.field private final synthetic zzadz:Ljava/lang/String;

.field private final synthetic zzaqk:Lcom/google/android/gms/measurement/internal/zzk;

.field private final synthetic zzaql:Lcom/google/android/gms/measurement/internal/zzby;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzby;Lcom/google/android/gms/measurement/internal/zzk;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzce;->zzaql:Lcom/google/android/gms/measurement/internal/zzby;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzce;->zzaqk:Lcom/google/android/gms/measurement/internal/zzk;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzce;->zzads:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/zzce;->zzadz:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzce;->zzaql:Lcom/google/android/gms/measurement/internal/zzby;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzby;->zza(Lcom/google/android/gms/measurement/internal/zzby;)Lcom/google/android/gms/measurement/internal/zzfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfo;->zzme()V

    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzce;->zzaql:Lcom/google/android/gms/measurement/internal/zzby;

    invoke-static {v0}, Lcom/google/android/gms/measurement/internal/zzby;->zza(Lcom/google/android/gms/measurement/internal/zzby;)Lcom/google/android/gms/measurement/internal/zzfo;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfo;->zzjt()Lcom/google/android/gms/measurement/internal/zzt;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzce;->zzaqk:Lcom/google/android/gms/measurement/internal/zzk;

    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/zzk;->packageName:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzce;->zzads:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzce;->zzadz:Ljava/lang/String;

    .line 6
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzt;->zzb(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
