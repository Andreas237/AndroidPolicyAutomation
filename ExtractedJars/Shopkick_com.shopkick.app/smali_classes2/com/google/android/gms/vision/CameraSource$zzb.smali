.class final Lcom/google/android/gms/vision/CameraSource$zzb;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/vision/CameraSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "zzb"
.end annotation


# instance fields
.field private final lock:Ljava/lang/Object;

.field private zzr:Lcom/google/android/gms/vision/Detector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/vision/Detector<",
            "*>;"
        }
    .end annotation
.end field

.field private final synthetic zzt:Lcom/google/android/gms/vision/CameraSource;

.field private zzu:J

.field private zzv:Z

.field private zzw:J

.field private zzx:I

.field private zzy:Ljava/nio/ByteBuffer;


# direct methods
.method constructor <init>(Lcom/google/android/gms/vision/CameraSource;Lcom/google/android/gms/vision/Detector;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/Detector<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzt:Lcom/google/android/gms/vision/CameraSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzu:J

    .line 3
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->lock:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzv:Z

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzx:I

    .line 6
    iput-object p2, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzr:Lcom/google/android/gms/vision/Detector;

    return-void
.end method


# virtual methods
.method final release()V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "Assert"
        }
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzr:Lcom/google/android/gms/vision/Detector;

    invoke-virtual {v0}, Lcom/google/android/gms/vision/Detector;->release()V

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzr:Lcom/google/android/gms/vision/Detector;

    return-void
.end method

.method public final run()V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .line 27
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->lock:Ljava/lang/Object;

    monitor-enter v0

    .line 28
    :goto_1
    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzv:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzy:Ljava/nio/ByteBuffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v1, :cond_0

    .line 29
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->lock:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_2
    const-string v2, "CameraSource"

    const-string v3, "Frame processing loop terminated."

    .line 32
    invoke-static {v2, v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 33
    monitor-exit v0

    return-void

    .line 34
    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzv:Z

    if-nez v1, :cond_1

    .line 35
    monitor-exit v0

    return-void

    .line 36
    :cond_1
    new-instance v1, Lcom/google/android/gms/vision/Frame$Builder;

    invoke-direct {v1}, Lcom/google/android/gms/vision/Frame$Builder;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzy:Ljava/nio/ByteBuffer;

    iget-object v3, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzt:Lcom/google/android/gms/vision/CameraSource;

    .line 37
    invoke-static {v3}, Lcom/google/android/gms/vision/CameraSource;->zzf(Lcom/google/android/gms/vision/CameraSource;)Lcom/google/android/gms/common/images/Size;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/common/images/Size;->getWidth()I

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzt:Lcom/google/android/gms/vision/CameraSource;

    .line 38
    invoke-static {v4}, Lcom/google/android/gms/vision/CameraSource;->zzf(Lcom/google/android/gms/vision/CameraSource;)Lcom/google/android/gms/common/images/Size;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/common/images/Size;->getHeight()I

    move-result v4

    const/16 v5, 0x11

    .line 39
    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/google/android/gms/vision/Frame$Builder;->setImageData(Ljava/nio/ByteBuffer;III)Lcom/google/android/gms/vision/Frame$Builder;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzx:I

    .line 40
    invoke-virtual {v1, v2}, Lcom/google/android/gms/vision/Frame$Builder;->setId(I)Lcom/google/android/gms/vision/Frame$Builder;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzw:J

    .line 41
    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/vision/Frame$Builder;->setTimestampMillis(J)Lcom/google/android/gms/vision/Frame$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzt:Lcom/google/android/gms/vision/CameraSource;

    .line 42
    invoke-static {v2}, Lcom/google/android/gms/vision/CameraSource;->zze(Lcom/google/android/gms/vision/CameraSource;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/vision/Frame$Builder;->setRotation(I)Lcom/google/android/gms/vision/Frame$Builder;

    move-result-object v1

    .line 43
    invoke-virtual {v1}, Lcom/google/android/gms/vision/Frame$Builder;->build()Lcom/google/android/gms/vision/Frame;

    move-result-object v1

    .line 44
    iget-object v2, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzy:Ljava/nio/ByteBuffer;

    const/4 v3, 0x0

    .line 45
    iput-object v3, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzy:Ljava/nio/ByteBuffer;

    .line 46
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 47
    :try_start_3
    iget-object v0, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzr:Lcom/google/android/gms/vision/Detector;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/vision/Detector;->receiveFrame(Lcom/google/android/gms/vision/Frame;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 48
    iget-object v0, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzt:Lcom/google/android/gms/vision/CameraSource;

    invoke-static {v0}, Lcom/google/android/gms/vision/CameraSource;->zzb(Lcom/google/android/gms/vision/CameraSource;)Landroid/hardware/Camera;

    move-result-object v0

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    :try_start_4
    const-string v1, "CameraSource"

    const-string v3, "Exception thrown from receiver."

    .line 51
    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 52
    iget-object v0, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzt:Lcom/google/android/gms/vision/CameraSource;

    invoke-static {v0}, Lcom/google/android/gms/vision/CameraSource;->zzb(Lcom/google/android/gms/vision/CameraSource;)Landroid/hardware/Camera;

    move-result-object v0

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    goto/16 :goto_0

    .line 54
    :goto_2
    iget-object v1, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzt:Lcom/google/android/gms/vision/CameraSource;

    invoke-static {v1}, Lcom/google/android/gms/vision/CameraSource;->zzb(Lcom/google/android/gms/vision/CameraSource;)Landroid/hardware/Camera;

    move-result-object v1

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    throw v0

    :catchall_1
    move-exception v1

    .line 46
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1
.end method

.method final setActive(Z)V
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->lock:Ljava/lang/Object;

    monitor-enter v0

    .line 12
    :try_start_0
    iput-boolean p1, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzv:Z

    .line 13
    iget-object p1, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->lock:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 14
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method final zza([BLandroid/hardware/Camera;)V
    .locals 5

    .line 15
    iget-object v0, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->lock:Ljava/lang/Object;

    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzy:Ljava/nio/ByteBuffer;

    if-eqz v1, :cond_0

    .line 17
    iget-object v1, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzy:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    const/4 p2, 0x0

    .line 18
    iput-object p2, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzy:Ljava/nio/ByteBuffer;

    .line 19
    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzt:Lcom/google/android/gms/vision/CameraSource;

    invoke-static {p2}, Lcom/google/android/gms/vision/CameraSource;->zzd(Lcom/google/android/gms/vision/CameraSource;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p1, "CameraSource"

    const-string p2, "Skipping frame. Could not find ByteBuffer associated with the image data from the camera."

    .line 20
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    monitor-exit v0

    return-void

    .line 22
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzu:J

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzw:J

    .line 23
    iget p2, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzx:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzx:I

    .line 24
    iget-object p2, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzt:Lcom/google/android/gms/vision/CameraSource;

    invoke-static {p2}, Lcom/google/android/gms/vision/CameraSource;->zzd(Lcom/google/android/gms/vision/CameraSource;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/nio/ByteBuffer;

    iput-object p1, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->zzy:Ljava/nio/ByteBuffer;

    .line 25
    iget-object p1, p0, Lcom/google/android/gms/vision/CameraSource$zzb;->lock:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 26
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
