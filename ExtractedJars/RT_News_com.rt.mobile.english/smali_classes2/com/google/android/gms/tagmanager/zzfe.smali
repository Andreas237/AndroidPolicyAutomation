.class final Lcom/google/android/gms/tagmanager/zzfe;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/zzfg;


# instance fields
.field private final synthetic zzbbp:Ljava/util/Map;

.field private final synthetic zzbbq:Ljava/util/Map;

.field private final synthetic zzbbr:Ljava/util/Map;

.field private final synthetic zzbbs:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/zzfb;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/zzfe;->zzbbp:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/android/gms/tagmanager/zzfe;->zzbbq:Ljava/util/Map;

    iput-object p4, p0, Lcom/google/android/gms/tagmanager/zzfe;->zzbbr:Ljava/util/Map;

    iput-object p5, p0, Lcom/google/android/gms/tagmanager/zzfe;->zzbbs:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/measurement/zzwh;Ljava/util/Set;Ljava/util/Set;Lcom/google/android/gms/tagmanager/zzeq;)V
    .locals 2
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

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzfe;->zzbbp:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzfe;->zzbbq:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-interface {p2, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/zzeq;->zznv()Lcom/google/android/gms/tagmanager/zzeo;

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/tagmanager/zzfe;->zzbbr:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzfe;->zzbbs:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_1

    invoke-interface {p3, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-interface {p4}, Lcom/google/android/gms/tagmanager/zzeq;->zznw()Lcom/google/android/gms/tagmanager/zzeo;

    :cond_1
    return-void
.end method
