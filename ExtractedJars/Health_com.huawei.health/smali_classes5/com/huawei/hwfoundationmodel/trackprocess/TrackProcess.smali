.class public Lcom/huawei/hwfoundationmodel/trackprocess/TrackProcess;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mTrackCallback:Lcom/huawei/hwfoundationmodel/trackprocess/callback/ITrackProcessCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 8
    const-string v0, "TrackProcess"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getOptimizedTrack(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwfoundationmodel/trackprocess/callback/ITrackProcessCallback;)I
    .locals 4

    .line 14
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_2

    .line 15
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    .line 16
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/huawei/hwfoundationmodel/trackprocess/callback/ITrackProcessCallback;->onResponse(ILjava/util/ArrayList;)V

    .line 18
    :cond_1
    const/4 v0, -0x1

    return v0

    .line 20
    :cond_2
    const-string v0, "tatatee"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getOptimizedTrack gpsFilePath:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ";pdrFilePath:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    iput-object p3, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrackProcess;->mTrackCallback:Lcom/huawei/hwfoundationmodel/trackprocess/callback/ITrackProcessCallback;

    .line 22
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/huawei/hwfoundationmodel/trackprocess/TrackProcess;->native_postProcessing([CI[CI)I

    move-result v0

    return v0
.end method

.method getPostProcessingResult(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;>;)V"
        }
    .end annotation

    .line 26
    const-string v0, "tatatee"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "callback processresult"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    iget-object v0, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrackProcess;->mTrackCallback:Lcom/huawei/hwfoundationmodel/trackprocess/callback/ITrackProcessCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/huawei/hwfoundationmodel/trackprocess/callback/ITrackProcessCallback;->onResponse(ILjava/util/ArrayList;)V

    .line 28
    return-void
.end method

.method public native native_postProcessing([CI[CI)I
.end method
