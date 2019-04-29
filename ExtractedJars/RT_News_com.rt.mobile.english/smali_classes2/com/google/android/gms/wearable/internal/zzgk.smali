.class final Lcom/google/android/gms/wearable/internal/zzgk;
.super Ljava/lang/Object;


# direct methods
.method private static zza(Ljava/util/List;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/wearable/internal/zzah;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/wearable/CapabilityInfo;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/wearable/internal/zzah;

    invoke-virtual {v1}, Lcom/google/android/gms/wearable/internal/zzah;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/wearable/internal/zzw;

    invoke-direct {v3, v1}, Lcom/google/android/gms/wearable/internal/zzw;-><init>(Lcom/google/android/gms/wearable/CapabilityInfo;)V

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method static synthetic zzb(Ljava/util/List;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/wearable/internal/zzgk;->zza(Ljava/util/List;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method
