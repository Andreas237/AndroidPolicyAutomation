.class abstract Lcom/google/android/gms/tagmanager/zzdy;
.super Lcom/google/android/gms/tagmanager/zzef;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/zzef;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final zza(Lcom/google/android/gms/internal/measurement/zzm;Lcom/google/android/gms/internal/measurement/zzm;Ljava/util/Map;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/measurement/zzm;",
            "Lcom/google/android/gms/internal/measurement/zzm;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/measurement/zzm;",
            ">;)Z"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzgj;->zzd(Lcom/google/android/gms/internal/measurement/zzm;)Lcom/google/android/gms/tagmanager/zzgi;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/tagmanager/zzgj;->zzd(Lcom/google/android/gms/internal/measurement/zzm;)Lcom/google/android/gms/tagmanager/zzgi;

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzgj;->zzph()Lcom/google/android/gms/tagmanager/zzgi;

    move-result-object v0

    if-eq p1, v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzgj;->zzph()Lcom/google/android/gms/tagmanager/zzgi;

    move-result-object v0

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/tagmanager/zzdy;->zza(Lcom/google/android/gms/tagmanager/zzgi;Lcom/google/android/gms/tagmanager/zzgi;Ljava/util/Map;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method protected abstract zza(Lcom/google/android/gms/tagmanager/zzgi;Lcom/google/android/gms/tagmanager/zzgi;Ljava/util/Map;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tagmanager/zzgi;",
            "Lcom/google/android/gms/tagmanager/zzgi;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/measurement/zzm;",
            ">;)Z"
        }
    .end annotation
.end method
