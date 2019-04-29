.class final Lcom/google/android/gms/internal/measurement/zzhg;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

.field private final synthetic zzant:Ljava/lang/String;

.field private final synthetic zzanw:Ljava/lang/String;

.field private final synthetic zzanx:Ljava/lang/String;

.field private final synthetic zzany:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzgo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzanw:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzant:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzanx:Ljava/lang/String;

    iput-wide p5, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzany:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzanw:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzgo;->zza(Lcom/google/android/gms/internal/measurement/zzgo;)Lcom/google/android/gms/internal/measurement/zzjs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlj()Lcom/google/android/gms/internal/measurement/zzgm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfz()Lcom/google/android/gms/internal/measurement/zzig;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzant:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzig;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzif;)V

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzif;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzanx:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzanw:Ljava/lang/String;

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzany:J

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/measurement/zzif;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzanp:Lcom/google/android/gms/internal/measurement/zzgo;

    invoke-static {v1}, Lcom/google/android/gms/internal/measurement/zzgo;->zza(Lcom/google/android/gms/internal/measurement/zzgo;)Lcom/google/android/gms/internal/measurement/zzjs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlj()Lcom/google/android/gms/internal/measurement/zzgm;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zzfz()Lcom/google/android/gms/internal/measurement/zzig;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhg;->zzant:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/zzig;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzif;)V

    return-void
.end method
