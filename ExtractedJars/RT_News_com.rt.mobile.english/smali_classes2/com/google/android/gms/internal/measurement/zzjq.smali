.class Lcom/google/android/gms/internal/measurement/zzjq;
.super Lcom/google/android/gms/internal/measurement/zzhh;

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzed;


# instance fields
.field protected final zzajy:Lcom/google/android/gms/internal/measurement/zzjs;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzjs;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlj()Lcom/google/android/gms/internal/measurement/zzgm;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/zzhh;-><init>(Lcom/google/android/gms/internal/measurement/zzgm;)V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjq;->zzajy:Lcom/google/android/gms/internal/measurement/zzjs;

    return-void
.end method


# virtual methods
.method public zzjc()Lcom/google/android/gms/internal/measurement/zzjy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjq;->zzajy:Lcom/google/android/gms/internal/measurement/zzjs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzjc()Lcom/google/android/gms/internal/measurement/zzjy;

    move-result-object v0

    return-object v0
.end method

.method public zzjd()Lcom/google/android/gms/internal/measurement/zzeb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjq;->zzajy:Lcom/google/android/gms/internal/measurement/zzjs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzjd()Lcom/google/android/gms/internal/measurement/zzeb;

    move-result-object v0

    return-object v0
.end method

.method public zzje()Lcom/google/android/gms/internal/measurement/zzej;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjq;->zzajy:Lcom/google/android/gms/internal/measurement/zzjs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzje()Lcom/google/android/gms/internal/measurement/zzej;

    move-result-object v0

    return-object v0
.end method
