.class final Lcom/google/android/gms/internal/measurement/zzgn;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzank:Lcom/google/android/gms/internal/measurement/zzhk;

.field private final synthetic zzanl:Lcom/google/android/gms/internal/measurement/zzgm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzgm;Lcom/google/android/gms/internal/measurement/zzhk;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzgn;->zzanl:Lcom/google/android/gms/internal/measurement/zzgm;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzgn;->zzank:Lcom/google/android/gms/internal/measurement/zzhk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgn;->zzanl:Lcom/google/android/gms/internal/measurement/zzgm;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzgn;->zzank:Lcom/google/android/gms/internal/measurement/zzhk;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/zzgm;->zza(Lcom/google/android/gms/internal/measurement/zzgm;Lcom/google/android/gms/internal/measurement/zzhk;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzgn;->zzanl:Lcom/google/android/gms/internal/measurement/zzgm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzgm;->start()V

    return-void
.end method
