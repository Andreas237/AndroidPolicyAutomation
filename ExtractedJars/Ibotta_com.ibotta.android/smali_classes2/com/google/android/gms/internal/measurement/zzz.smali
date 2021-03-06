.class public final Lcom/google/android/gms/internal/measurement/zzz;
.super Lcom/google/android/gms/analytics/zzi;


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/analytics/zzi<",
        "Lcom/google/android/gms/internal/measurement/zzz;",
        ">;"
    }
.end annotation


# instance fields
.field private zztu:Ljava/lang/String;

.field public zztv:I

.field public zztw:I

.field public zztx:I

.field public zzty:I

.field public zztz:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/analytics/zzi;-><init>()V

    return-void
.end method


# virtual methods
.method public final getLanguage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzz;->zztu:Ljava/lang/String;

    return-object v0
.end method

.method public final setLanguage(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzz;->zztu:Ljava/lang/String;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "language"

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzz;->zztu:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "screenColors"

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzz;->zztv:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "screenWidth"

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzz;->zztw:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "screenHeight"

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzz;->zztx:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "viewportWidth"

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzz;->zzty:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "viewportHeight"

    iget v2, p0, Lcom/google/android/gms/internal/measurement/zzz;->zztz:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzz;->zza(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic zzb(Lcom/google/android/gms/analytics/zzi;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzz;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzz;->zztv:I

    if-eqz v0, :cond_0

    iput v0, p1, Lcom/google/android/gms/internal/measurement/zzz;->zztv:I

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzz;->zztw:I

    if-eqz v0, :cond_1

    iput v0, p1, Lcom/google/android/gms/internal/measurement/zzz;->zztw:I

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzz;->zztx:I

    if-eqz v0, :cond_2

    iput v0, p1, Lcom/google/android/gms/internal/measurement/zzz;->zztx:I

    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzz;->zzty:I

    if-eqz v0, :cond_3

    iput v0, p1, Lcom/google/android/gms/internal/measurement/zzz;->zzty:I

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzz;->zztz:I

    if-eqz v0, :cond_4

    iput v0, p1, Lcom/google/android/gms/internal/measurement/zzz;->zztz:I

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzz;->zztu:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzz;->zztu:Ljava/lang/String;

    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/zzz;->zztu:Ljava/lang/String;

    :cond_5
    return-void
.end method
