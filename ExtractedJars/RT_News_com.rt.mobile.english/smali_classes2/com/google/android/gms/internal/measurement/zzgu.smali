.class final Lcom/google/android/gms/internal/measurement/zzgu;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/util/List<",
        "Lcom/google/android/gms/internal/measurement/zzkb;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final synthetic zzano:Lcom/google/android/gms/internal/measurement/zzdz;

.field private final synthetic zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

.field private final synthetic zzanr:Ljava/lang/String;

.field private final synthetic zzans:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzgo;Lcom/google/android/gms/internal/measurement/zzdz;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzgu;->zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzgu;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzgu;->zzanr:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/zzgu;->zzans:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgu;->zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgo;->zza(Lcom/google/android/gms/internal/measurement/zzgo;)Lcom/google/android/gms/internal/measurement/zzjs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlg()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgu;->zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgo;->zza(Lcom/google/android/gms/internal/measurement/zzgo;)Lcom/google/android/gms/internal/measurement/zzjs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzgu;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzgu;->zzanr:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzgu;->zzans:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzej;->zzb(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
