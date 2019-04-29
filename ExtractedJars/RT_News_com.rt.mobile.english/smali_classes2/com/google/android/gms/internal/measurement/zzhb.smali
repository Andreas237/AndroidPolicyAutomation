.class final Lcom/google/android/gms/internal/measurement/zzhb;
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
.field private final synthetic zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

.field private final synthetic zzant:Ljava/lang/String;

.field private final synthetic zzanu:Lcom/google/android/gms/internal/measurement/zzew;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzgo;Lcom/google/android/gms/internal/measurement/zzew;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzhb;->zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzhb;->zzanu:Lcom/google/android/gms/internal/measurement/zzew;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzhb;->zzant:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhb;->zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgo;->zza(Lcom/google/android/gms/internal/measurement/zzgo;)Lcom/google/android/gms/internal/measurement/zzjs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlg()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhb;->zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgo;->zza(Lcom/google/android/gms/internal/measurement/zzgo;)Lcom/google/android/gms/internal/measurement/zzjs;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzhb;->zzanu:Lcom/google/android/gms/internal/measurement/zzew;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhb;->zzant:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(Lcom/google/android/gms/internal/measurement/zzew;Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method
