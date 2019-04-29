.class public final Lio/streamroot/dna/core/media/QosAnalyticsReporter;
.super Ljava/lang/Object;
.source "QosAnalyticsReporter.kt"

# interfaces
.implements Lio/streamroot/dna/core/analytics/AnalyticsReporter;


# annotations
.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lio/streamroot/dna/core/media/QosAnalyticsReporter;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "qosModule",
        "Lio/streamroot/dna/core/QosModule;",
        "isQosTester",
        "",
        "(Lio/streamroot/dna/core/QosModule;Z)V",
        "appendStatsAnalytics",
        "",
        "statsPayload",
        "Lorg/json/JSONObject;",
        "appendTrafficAnalytics",
        "trafficPayload",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final isQosTester:Z

.field private final qosModule:Lio/streamroot/dna/core/QosModule;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/QosModule;Z)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/QosModule;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "qosModule"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/media/QosAnalyticsReporter;->qosModule:Lio/streamroot/dna/core/QosModule;

    iput-boolean p2, p0, Lio/streamroot/dna/core/media/QosAnalyticsReporter;->isQosTester:Z

    return-void
.end method


# virtual methods
.method public appendControlAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "controlPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendControlAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendStatsAnalytics(Lorg/json/JSONObject;)V
    .locals 4
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "statsPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    iget-object v0, p0, Lio/streamroot/dna/core/media/QosAnalyticsReporter;->qosModule:Lio/streamroot/dna/core/QosModule;

    invoke-virtual {v0}, Lio/streamroot/dna/core/QosModule;->getDetails$dna_core_release()Lio/streamroot/dna/core/QosDetails;

    move-result-object v0

    const-string v1, "qosTester"

    .line 18
    iget-boolean v2, p0, Lio/streamroot/dna/core/media/QosAnalyticsReporter;->isQosTester:Z

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v1, "aggPlaybackErrorCount"

    .line 19
    invoke-virtual {v0}, Lio/streamroot/dna/core/QosDetails;->getTotalPlaybackErrorCount()I

    move-result v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "playbackErrorCount"

    .line 20
    invoke-virtual {v0}, Lio/streamroot/dna/core/QosDetails;->getPlaybackErrorCount()I

    move-result v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const/4 v1, 0x1

    .line 22
    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "qos"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, v1}, Lio/streamroot/dna/core/utils/JsonObjectExtensionKt;->getOrInsertJSONObject(Lorg/json/JSONObject;[Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v1, "timeSpentPlaying"

    .line 23
    invoke-virtual {v0}, Lio/streamroot/dna/core/QosDetails;->getTimePlaying()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "timeSpentRebuffering"

    .line 24
    invoke-virtual {v0}, Lio/streamroot/dna/core/QosDetails;->getTimeBuffering()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "timeSpentPaused"

    .line 25
    invoke-virtual {v0}, Lio/streamroot/dna/core/QosDetails;->getTimePausing()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "timeSpentSeeking"

    .line 26
    invoke-virtual {v0}, Lio/streamroot/dna/core/QosDetails;->getTimeSeeking()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "timeSpentEnded"

    .line 27
    invoke-virtual {v0}, Lio/streamroot/dna/core/QosDetails;->getTimeEnding()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "trackSwitchCPM"

    .line 28
    invoke-virtual {v0}, Lio/streamroot/dna/core/QosDetails;->getTrackSwitchCountPerMinute()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "rebufferingCPM"

    .line 29
    invoke-virtual {v0}, Lio/streamroot/dna/core/QosDetails;->getBufferingCountPerMinute()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "droppedFrameCPM"

    .line 30
    invoke-virtual {v0}, Lio/streamroot/dna/core/QosDetails;->getDropFrameCountPerMinute()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "rebufferingWithBufferCPM"

    .line 31
    invoke-virtual {v0}, Lio/streamroot/dna/core/QosDetails;->getDropFrameEventCountPerMinute()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "timeSpentRebufferingWithBuffer"

    .line 32
    invoke-virtual {v0}, Lio/streamroot/dna/core/QosDetails;->getTimeDropFraming()J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    return-void
.end method

.method public appendSupportAnalytics(Lorg/json/JSONObject;)V
    .locals 1
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "supportPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-static {p0, p1}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->appendSupportAnalytics(Lio/streamroot/dna/core/analytics/AnalyticsReporter;Lorg/json/JSONObject;)V

    return-void
.end method

.method public appendTrafficAnalytics(Lorg/json/JSONObject;)V
    .locals 4
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "trafficPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iget-object v0, p0, Lio/streamroot/dna/core/media/QosAnalyticsReporter;->qosModule:Lio/streamroot/dna/core/QosModule;

    invoke-virtual {v0}, Lio/streamroot/dna/core/QosModule;->getSummary$dna_core_release()Lio/streamroot/dna/core/QosSummary;

    move-result-object v0

    const-string v1, "played"

    .line 38
    invoke-virtual {v0}, Lio/streamroot/dna/core/QosSummary;->getTimePlaying()J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "buffered"

    .line 39
    invoke-virtual {v0}, Lio/streamroot/dna/core/QosSummary;->getTimeBuffering()J

    move-result-wide v2

    invoke-virtual {p1, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    return-void
.end method

.method public priority()I
    .locals 1

    .line 10
    invoke-static {p0}, Lio/streamroot/dna/core/analytics/AnalyticsReporter$DefaultImpls;->priority(Lio/streamroot/dna/core/analytics/AnalyticsReporter;)I

    move-result v0

    return v0
.end method
