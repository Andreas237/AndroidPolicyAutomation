.class public final Lcom/google/android/gms/internal/measurement/zzwe;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation


# instance fields
.field private zzbbu:Lcom/google/android/gms/internal/measurement/zzm;

.field private final zzbld:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/measurement/zzm;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwe;->zzbld:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/measurement/zzwc;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzwe;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzm;)Lcom/google/android/gms/internal/measurement/zzwe;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwe;->zzbld:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final zzm(Lcom/google/android/gms/internal/measurement/zzm;)Lcom/google/android/gms/internal/measurement/zzwe;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzwe;->zzbbu:Lcom/google/android/gms/internal/measurement/zzm;

    return-object p0
.end method

.method public final zzrt()Lcom/google/android/gms/internal/measurement/zzwd;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzwd;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzwe;->zzbld:Ljava/util/Map;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzwe;->zzbbu:Lcom/google/android/gms/internal/measurement/zzm;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzwd;-><init>(Ljava/util/Map;Lcom/google/android/gms/internal/measurement/zzm;Lcom/google/android/gms/internal/measurement/zzwc;)V

    return-object v0
.end method
