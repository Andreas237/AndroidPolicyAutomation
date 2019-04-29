.class final Lcom/google/android/gms/internal/measurement/zzjw;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzano:Lcom/google/android/gms/internal/measurement/zzdz;

.field private final synthetic zzarf:Lcom/google/android/gms/internal/measurement/zzjs;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzjs;Lcom/google/android/gms/internal/measurement/zzdz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjw;->zzarf:Lcom/google/android/gms/internal/measurement/zzjs;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjw;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjw;->zzarf:Lcom/google/android/gms/internal/measurement/zzjs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzgh()Lcom/google/android/gms/internal/measurement/zzeg;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjw;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzeg;->zzay(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjw;->zzarf:Lcom/google/android/gms/internal/measurement/zzjs;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjw;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjs;->zza(Lcom/google/android/gms/internal/measurement/zzjs;Lcom/google/android/gms/internal/measurement/zzdz;)Lcom/google/android/gms/internal/measurement/zzdy;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjw;->zzarf:Lcom/google/android/gms/internal/measurement/zzjs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjw;->zzano:Lcom/google/android/gms/internal/measurement/zzdz;

    iget-object v1, v1, Lcom/google/android/gms/internal/measurement/zzdz;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzej;->zzbb(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzdy;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjw;->zzarf:Lcom/google/android/gms/internal/measurement/zzjs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzgf()Lcom/google/android/gms/internal/measurement/zzfh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzfh;->zziv()Lcom/google/android/gms/internal/measurement/zzfj;

    move-result-object v0

    const-string v1, "App info was null when attempting to get app instance id"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzfj;->log(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzdy;->getAppInstanceId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
