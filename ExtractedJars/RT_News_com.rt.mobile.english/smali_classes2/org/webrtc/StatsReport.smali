.class public Lorg/webrtc/StatsReport;
.super Ljava/lang/Object;
.source "StatsReport.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/StatsReport$Value;
    }
.end annotation


# instance fields
.field public final id:Ljava/lang/String;

.field public final timestamp:D

.field public final type:Ljava/lang/String;

.field public final values:[Lorg/webrtc/StatsReport$Value;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;D[Lorg/webrtc/StatsReport$Value;)V
    .locals 0
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lorg/webrtc/StatsReport;->id:Ljava/lang/String;

    .line 43
    iput-object p2, p0, Lorg/webrtc/StatsReport;->type:Ljava/lang/String;

    .line 44
    iput-wide p3, p0, Lorg/webrtc/StatsReport;->timestamp:D

    .line 45
    iput-object p5, p0, Lorg/webrtc/StatsReport;->values:[Lorg/webrtc/StatsReport$Value;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "id: "

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/webrtc/StatsReport;->id:Ljava/lang/String;

    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type: "

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/webrtc/StatsReport;->type:Ljava/lang/String;

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", timestamp: "

    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lorg/webrtc/StatsReport;->timestamp:D

    .line 56
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", values: "

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    .line 58
    :goto_0
    iget-object v2, p0, Lorg/webrtc/StatsReport;->values:[Lorg/webrtc/StatsReport$Value;

    array-length v2, v2

    if-ge v1, v2, :cond_0

    .line 59
    iget-object v2, p0, Lorg/webrtc/StatsReport;->values:[Lorg/webrtc/StatsReport$Value;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Lorg/webrtc/StatsReport$Value;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
