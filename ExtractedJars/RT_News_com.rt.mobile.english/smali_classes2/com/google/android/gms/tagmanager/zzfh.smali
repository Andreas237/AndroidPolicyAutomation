.class final Lcom/google/android/gms/tagmanager/zzfh;
.super Ljava/lang/Object;


# instance fields
.field private zzbbt:Lcom/google/android/gms/tagmanager/zzdz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tagmanager/zzdz<",
            "Lcom/google/android/gms/internal/measurement/zzm;",
            ">;"
        }
    .end annotation
.end field

.field private zzbbu:Lcom/google/android/gms/internal/measurement/zzm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/tagmanager/zzdz;Lcom/google/android/gms/internal/measurement/zzm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tagmanager/zzdz<",
            "Lcom/google/android/gms/internal/measurement/zzm;",
            ">;",
            "Lcom/google/android/gms/internal/measurement/zzm;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzfh;->zzbbt:Lcom/google/android/gms/tagmanager/zzdz;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/zzfh;->zzbbu:Lcom/google/android/gms/internal/measurement/zzm;

    return-void
.end method


# virtual methods
.method public final getSize()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzfh;->zzbbt:Lcom/google/android/gms/tagmanager/zzdz;

    invoke-virtual {v0}, Lcom/google/android/gms/tagmanager/zzdz;->getObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzacg;->zzvu()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzfh;->zzbbu:Lcom/google/android/gms/internal/measurement/zzm;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzfh;->zzbbu:Lcom/google/android/gms/internal/measurement/zzm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzacg;->zzvu()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final zzoo()Lcom/google/android/gms/tagmanager/zzdz;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tagmanager/zzdz<",
            "Lcom/google/android/gms/internal/measurement/zzm;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzfh;->zzbbt:Lcom/google/android/gms/tagmanager/zzdz;

    return-object v0
.end method

.method public final zzop()Lcom/google/android/gms/internal/measurement/zzm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzfh;->zzbbu:Lcom/google/android/gms/internal/measurement/zzm;

    return-object v0
.end method
