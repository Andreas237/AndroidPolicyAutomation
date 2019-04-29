.class abstract Lcom/google/android/gms/tagmanager/zzgh;
.super Lcom/google/android/gms/tagmanager/zzbq;


# direct methods
.method public varargs constructor <init>(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/tagmanager/zzbq;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public zzd(Ljava/util/Map;)Lcom/google/android/gms/internal/measurement/zzm;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/measurement/zzm;",
            ">;)",
            "Lcom/google/android/gms/internal/measurement/zzm;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/tagmanager/zzgh;->zzf(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzgj;->zzpj()Lcom/google/android/gms/internal/measurement/zzm;

    move-result-object p1

    return-object p1
.end method

.method public abstract zzf(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/measurement/zzm;",
            ">;)V"
        }
    .end annotation
.end method

.method public zzme()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
