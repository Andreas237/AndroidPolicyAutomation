.class public Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private altitude:D

.field private latitude:D

.field private longitude:D

.field private utc_time:J


# direct methods
.method public constructor <init>(JDDD)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-wide p1, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->utc_time:J

    .line 14
    iput-wide p3, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->longitude:D

    .line 15
    iput-wide p5, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->latitude:D

    .line 16
    iput-wide p7, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->altitude:D

    .line 17
    return-void
.end method


# virtual methods
.method public getAltitude()D
    .locals 2

    .line 47
    iget-wide v0, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->altitude:D

    return-wide v0
.end method

.method public getLatitude()D
    .locals 2

    .line 36
    iget-wide v0, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->latitude:D

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    .line 28
    iget-wide v0, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->longitude:D

    return-wide v0
.end method

.method public getUtc_time()J
    .locals 2

    .line 20
    iget-wide v0, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->utc_time:J

    return-wide v0
.end method

.method public setAltitude(D)V
    .locals 0

    .line 44
    iput-wide p1, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->altitude:D

    .line 45
    return-void
.end method

.method public setLatitude(D)V
    .locals 0

    .line 40
    iput-wide p1, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->latitude:D

    .line 41
    return-void
.end method

.method public setLongitude(D)V
    .locals 0

    .line 32
    iput-wide p1, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->longitude:D

    .line 33
    return-void
.end method

.method public setUtc_time(J)V
    .locals 0

    .line 24
    iput-wide p1, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->utc_time:J

    .line 25
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{lat:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->latitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " lon:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->longitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " altitude:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->altitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " time:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwfoundationmodel/trackprocess/TrajectoryPoint;->utc_time:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "};"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
