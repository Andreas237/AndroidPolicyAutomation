.class public final Lcom/google/android/gms/internal/measurement/zzad;
.super Lcom/google/android/gms/analytics/zzi;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/analytics/zzi<",
        "Lcom/google/android/gms/internal/measurement/zzad;",
        ">;"
    }
.end annotation


# instance fields
.field private zzud:Ljava/lang/String;

.field private zzue:Ljava/lang/String;

.field private zzuf:Ljava/lang/String;

.field private zzug:Ljava/lang/String;

.field private zzuh:Z

.field private zzui:Ljava/lang/String;

.field private zzuj:Z

.field private zzuk:D


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/analytics/zzi;-><init>()V

    return-void
.end method


# virtual methods
.method public final setClientId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzue:Ljava/lang/String;

    return-void
.end method

.method public final setUserId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzuf:Ljava/lang/String;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "hitType"

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzud:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "clientId"

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzue:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "userId"

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzuf:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "androidAdId"

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzug:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AdTargetingEnabled"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzuh:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "sessionControl"

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzui:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "nonInteraction"

    iget-boolean v2, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzuj:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "sampleRate"

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzuk:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzad;->zza(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzuh:Z

    return-void
.end method

.method public final zzay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzud:Ljava/lang/String;

    return-object v0
.end method

.method public final zzaz()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzue:Ljava/lang/String;

    return-object v0
.end method

.method public final synthetic zzb(Lcom/google/android/gms/analytics/zzi;)V
    .locals 6

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzad;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzud:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzud:Ljava/lang/String;

    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/zzad;->zzud:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzue:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzue:Ljava/lang/String;

    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/zzad;->zzue:Ljava/lang/String;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzuf:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzuf:Ljava/lang/String;

    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/zzad;->zzuf:Ljava/lang/String;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzug:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzug:Ljava/lang/String;

    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/zzad;->zzug:Ljava/lang/String;

    :cond_3
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzuh:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    iput-boolean v1, p1, Lcom/google/android/gms/internal/measurement/zzad;->zzuh:Z

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzui:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzui:Ljava/lang/String;

    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/zzad;->zzui:Ljava/lang/String;

    :cond_5
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzuj:Z

    if-eqz v0, :cond_6

    iput-boolean v0, p1, Lcom/google/android/gms/internal/measurement/zzad;->zzuj:Z

    :cond_6
    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzuk:D

    const-wide/16 v4, 0x0

    cmpl-double v0, v2, v4

    if-eqz v0, :cond_8

    cmpl-double v0, v2, v4

    if-ltz v0, :cond_7

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    cmpg-double v0, v2, v4

    if-gtz v0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v1, 0x0

    :goto_0
    const-string v0, "Sample rate must be between 0% and 100%"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    iput-wide v2, p1, Lcom/google/android/gms/internal/measurement/zzad;->zzuk:D

    :cond_8
    return-void
.end method

.method public final zzb(Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzuj:Z

    return-void
.end method

.method public final zzba()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzuf:Ljava/lang/String;

    return-object v0
.end method

.method public final zzbb()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzug:Ljava/lang/String;

    return-object v0
.end method

.method public final zzbc()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzuh:Z

    return v0
.end method

.method public final zzbd()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzui:Ljava/lang/String;

    return-object v0
.end method

.method public final zzbe()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzuj:Z

    return v0
.end method

.method public final zzbf()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzuk:D

    return-wide v0
.end method

.method public final zzl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzud:Ljava/lang/String;

    return-void
.end method

.method public final zzm(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzad;->zzug:Ljava/lang/String;

    return-void
.end method
