.class public abstract Lcom/google/android/gms/vision/Detector;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/vision/Detector$Processor;,
        Lcom/google/android/gms/vision/Detector$Detections;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final zzad:Ljava/lang/Object;

.field private zzae:Lcom/google/android/gms/vision/Detector$Processor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/vision/Detector$Processor<",
            "TT;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "processorLock"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/vision/Detector;->zzad:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public abstract detect(Lcom/google/android/gms/vision/Frame;)Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/Frame;",
            ")",
            "Landroid/util/SparseArray<",
            "TT;>;"
        }
    .end annotation
.end method

.method public isOperational()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public receiveFrame(Lcom/google/android/gms/vision/Frame;)V
    .locals 3

    .line 9
    new-instance v0, Lcom/google/android/gms/vision/Frame$Metadata;

    invoke-virtual {p1}, Lcom/google/android/gms/vision/Frame;->getMetadata()Lcom/google/android/gms/vision/Frame$Metadata;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/vision/Frame$Metadata;-><init>(Lcom/google/android/gms/vision/Frame$Metadata;)V

    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/vision/Frame$Metadata;->zzd()V

    .line 11
    invoke-virtual {p0, p1}, Lcom/google/android/gms/vision/Detector;->detect(Lcom/google/android/gms/vision/Frame;)Landroid/util/SparseArray;

    move-result-object p1

    .line 12
    invoke-virtual {p0}, Lcom/google/android/gms/vision/Detector;->isOperational()Z

    move-result v1

    .line 13
    new-instance v2, Lcom/google/android/gms/vision/Detector$Detections;

    invoke-direct {v2, p1, v0, v1}, Lcom/google/android/gms/vision/Detector$Detections;-><init>(Landroid/util/SparseArray;Lcom/google/android/gms/vision/Frame$Metadata;Z)V

    .line 15
    iget-object p1, p0, Lcom/google/android/gms/vision/Detector;->zzad:Ljava/lang/Object;

    monitor-enter p1

    .line 16
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/vision/Detector;->zzae:Lcom/google/android/gms/vision/Detector$Processor;

    if-eqz v0, :cond_0

    .line 18
    iget-object v0, p0, Lcom/google/android/gms/vision/Detector;->zzae:Lcom/google/android/gms/vision/Detector$Processor;

    invoke-interface {v0, v2}, Lcom/google/android/gms/vision/Detector$Processor;->receiveDetections(Lcom/google/android/gms/vision/Detector$Detections;)V

    .line 19
    monitor-exit p1

    return-void

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Detector processor must first be set with setProcessor in order to receive detection results."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    .line 19
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public release()V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/vision/Detector;->zzad:Ljava/lang/Object;

    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/vision/Detector;->zzae:Lcom/google/android/gms/vision/Detector$Processor;

    if-eqz v1, :cond_0

    .line 5
    iget-object v1, p0, Lcom/google/android/gms/vision/Detector;->zzae:Lcom/google/android/gms/vision/Detector$Processor;

    invoke-interface {v1}, Lcom/google/android/gms/vision/Detector$Processor;->release()V

    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lcom/google/android/gms/vision/Detector;->zzae:Lcom/google/android/gms/vision/Detector$Processor;

    .line 7
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public setFocus(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public setProcessor(Lcom/google/android/gms/vision/Detector$Processor;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/vision/Detector$Processor<",
            "TT;>;)V"
        }
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/google/android/gms/vision/Detector;->zzad:Ljava/lang/Object;

    monitor-enter v0

    .line 21
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/vision/Detector;->zzae:Lcom/google/android/gms/vision/Detector$Processor;

    if-eqz v1, :cond_0

    .line 22
    iget-object v1, p0, Lcom/google/android/gms/vision/Detector;->zzae:Lcom/google/android/gms/vision/Detector$Processor;

    invoke-interface {v1}, Lcom/google/android/gms/vision/Detector$Processor;->release()V

    .line 23
    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/vision/Detector;->zzae:Lcom/google/android/gms/vision/Detector$Processor;

    .line 24
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
