.class final Lcom/google/android/gms/internal/ads/zzaqk;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic val$message:Ljava/lang/String;

.field private final synthetic zzcce:Ljava/lang/String;

.field private final synthetic zzdba:Ljava/lang/String;

.field private final synthetic zzdbe:Lcom/google/android/gms/internal/ads/zzaqh;

.field private final synthetic zzdbf:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzaqh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqk;->zzdbe:Lcom/google/android/gms/internal/ads/zzaqh;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaqk;->zzcce:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzaqk;->zzdba:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzaqk;->zzdbf:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzaqk;->val$message:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "event"

    const-string v2, "precacheCanceled"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "src"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaqk;->zzcce:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaqk;->zzdba:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "cachedSrc"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaqk;->zzdba:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v1, "type"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaqk;->zzdbe:Lcom/google/android/gms/internal/ads/zzaqh;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaqk;->zzdbf:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzaqh;->zza(Lcom/google/android/gms/internal/ads/zzaqh;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "reason"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaqk;->zzdbf:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaqk;->val$message:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "message"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaqk;->val$message:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaqk;->zzdbe:Lcom/google/android/gms/internal/ads/zzaqh;

    const-string v2, "onPrecacheEvent"

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzaqh;->zza(Lcom/google/android/gms/internal/ads/zzaqh;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
