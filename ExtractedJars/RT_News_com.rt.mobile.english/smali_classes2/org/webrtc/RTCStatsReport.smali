.class public Lorg/webrtc/RTCStatsReport;
.super Ljava/lang/Object;
.source "RTCStatsReport.java"


# instance fields
.field private final stats:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/webrtc/RTCStats;",
            ">;"
        }
    .end annotation
.end field

.field private final timestampUs:J


# direct methods
.method public constructor <init>(JLjava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/webrtc/RTCStats;",
            ">;)V"
        }
    .end annotation

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-wide p1, p0, Lorg/webrtc/RTCStatsReport;->timestampUs:J

    .line 26
    iput-object p3, p0, Lorg/webrtc/RTCStatsReport;->stats:Ljava/util/Map;

    return-void
.end method

.method private static create(JLjava/util/Map;)Lorg/webrtc/RTCStatsReport;
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 60
    new-instance v0, Lorg/webrtc/RTCStatsReport;

    invoke-direct {v0, p0, p1, p2}, Lorg/webrtc/RTCStatsReport;-><init>(JLjava/util/Map;)V

    return-object v0
.end method


# virtual methods
.method public getStatsMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lorg/webrtc/RTCStats;",
            ">;"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lorg/webrtc/RTCStatsReport;->stats:Ljava/util/Map;

    return-object v0
.end method

.method public getTimestampUs()D
    .locals 2

    .line 31
    iget-wide v0, p0, Lorg/webrtc/RTCStatsReport;->timestampUs:J

    long-to-double v0, v0

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{ timestampUs: "

    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lorg/webrtc/RTCStatsReport;->timestampUs:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", stats: [\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    iget-object v1, p0, Lorg/webrtc/RTCStatsReport;->stats:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/webrtc/RTCStats;

    if-nez v2, :cond_0

    const-string v2, ",\n"

    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    const-string v1, " ] }"

    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
