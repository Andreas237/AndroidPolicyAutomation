.class public Lcom/google/android/gms/vision/clearcut/VisionClearcutLogger;
.super Ljava/lang/Object;


# annotations
.annotation build Landroid/support/annotation/Keep;
.end annotation


# instance fields
.field private final zzbw:Lcom/google/android/gms/clearcut/ClearcutLogger;

.field private zzbx:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/gms/vision/clearcut/VisionClearcutLogger;->zzbx:Z

    .line 3
    new-instance v0, Lcom/google/android/gms/clearcut/ClearcutLogger;

    const-string v1, "VISION"

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lcom/google/android/gms/clearcut/ClearcutLogger;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/vision/clearcut/VisionClearcutLogger;->zzbw:Lcom/google/android/gms/clearcut/ClearcutLogger;

    return-void
.end method


# virtual methods
.method public final zzb(ILcom/google/android/gms/internal/vision/zzdu;)V
    .locals 3

    .line 6
    invoke-virtual {p2}, Lcom/google/android/gms/internal/vision/zzjt;->zzeq()I

    move-result v0

    new-array v0, v0, [B

    .line 7
    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {p2, v0, v2, v1}, Lcom/google/android/gms/internal/vision/zzjt;->zza(Lcom/google/android/gms/internal/vision/zzjt;[BII)V

    if-ltz p1, :cond_2

    const/4 p2, 0x3

    if-le p1, p2, :cond_0

    goto :goto_0

    .line 15
    :cond_0
    :try_start_0
    iget-boolean p2, p0, Lcom/google/android/gms/vision/clearcut/VisionClearcutLogger;->zzbx:Z

    if-eqz p2, :cond_1

    .line 16
    iget-object p2, p0, Lcom/google/android/gms/vision/clearcut/VisionClearcutLogger;->zzbw:Lcom/google/android/gms/clearcut/ClearcutLogger;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/clearcut/ClearcutLogger;->newEvent([B)Lcom/google/android/gms/clearcut/ClearcutLogger$LogEventBuilder;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/clearcut/ClearcutLogger$LogEventBuilder;->setEventCode(I)Lcom/google/android/gms/clearcut/ClearcutLogger$LogEventBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/clearcut/ClearcutLogger$LogEventBuilder;->log()V

    return-void

    .line 17
    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/vision/zzdu;

    invoke-direct {p1}, Lcom/google/android/gms/internal/vision/zzdu;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 18
    :try_start_1
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/vision/zzjt;->zza(Lcom/google/android/gms/internal/vision/zzjt;[B)Lcom/google/android/gms/internal/vision/zzjt;

    const-string p2, "Would have logged:\n%s"

    const/4 v0, 0x1

    .line 19
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/vision/zzjt;->toString()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v2

    invoke-static {p2, v0}, Lcom/google/android/gms/vision/L;->zzc(Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    :try_start_2
    const-string p2, "Parsing error"

    .line 21
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/vision/L;->zza(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_1
    move-exception p1

    .line 24
    invoke-static {p1}, Lcom/google/android/gms/internal/vision/zzct;->zza(Ljava/lang/Throwable;)V

    const-string p2, "Failed to log"

    .line 25
    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lcom/google/android/gms/vision/L;->zza(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void

    :cond_2
    :goto_0
    const/16 p2, 0x1f

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p2, "Illegal event code: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, v2, [Ljava/lang/Object;

    const/4 v0, 0x4

    .line 12
    invoke-static {v0}, Lcom/google/android/gms/vision/L;->isLoggable(I)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "Vision"

    .line 13
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    return-void
.end method
