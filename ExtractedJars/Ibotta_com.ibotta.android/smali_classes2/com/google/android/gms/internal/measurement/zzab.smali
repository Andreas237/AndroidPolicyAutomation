.class public final Lcom/google/android/gms/internal/measurement/zzab;
.super Lcom/google/android/gms/analytics/zzi;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/analytics/zzi<",
        "Lcom/google/android/gms/internal/measurement/zzab;",
        ">;"
    }
.end annotation


# instance fields
.field private category:Ljava/lang/String;

.field private label:Ljava/lang/String;

.field private value:J

.field private zzua:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/analytics/zzi;-><init>()V

    return-void
.end method


# virtual methods
.method public final getAction()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzab;->zzua:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzab;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getValue()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzab;->value:J

    return-wide v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "category"

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzab;->category:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "action"

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzab;->zzua:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "label"

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzab;->label:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "value"

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzab;->value:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzab;->zza(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzax()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzab;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final synthetic zzb(Lcom/google/android/gms/analytics/zzi;)V
    .locals 5

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzab;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzab;->category:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzab;->category:Ljava/lang/String;

    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/zzab;->category:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzab;->zzua:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzab;->zzua:Ljava/lang/String;

    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/zzab;->zzua:Ljava/lang/String;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzab;->label:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzab;->label:Ljava/lang/String;

    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/zzab;->label:Ljava/lang/String;

    :cond_2
    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzab;->value:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_3

    iput-wide v0, p1, Lcom/google/android/gms/internal/measurement/zzab;->value:J

    :cond_3
    return-void
.end method
