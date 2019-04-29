.class final Lcom/google/android/gms/tagmanager/zzff;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/zzfg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/zzfb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/measurement/zzwh;Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/zzeq;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/measurement/zzwh;",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/internal/measurement/zzwd;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/internal/measurement/zzwd;",
            ">;",
            "Lcom/google/android/gms/tagmanager/zzeq;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzwh;->zzrf()Ljava/util/List;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzwh;->zzrg()Ljava/util/List;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/zzeq;->zznx()Lcom/google/android/gms/tagmanager/zzeo;

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/zzeq;->zzny()Lcom/google/android/gms/tagmanager/zzeo;

    return-void
.end method
