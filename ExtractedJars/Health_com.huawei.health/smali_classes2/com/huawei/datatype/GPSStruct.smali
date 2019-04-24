.class public Lcom/huawei/datatype/GPSStruct;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private gps_altitude:I

.field private gps_direction:D

.field private gps_distance:J

.field private gps_end_time:J

.field private gps_h_latitude:D

.field private gps_h_longitude:D

.field private gps_latitude:D

.field private gps_longitude:D

.field private gps_precision:D

.field private gps_speed:I

.field private gps_start_time:J

.field private gps_total_distance:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_speed:I

    .line 16
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_distance:J

    .line 20
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_altitude:I

    .line 24
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_total_distance:J

    .line 28
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_h_longitude:D

    .line 32
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_h_latitude:D

    .line 36
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_longitude:D

    .line 40
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_latitude:D

    .line 44
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_direction:D

    .line 48
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_precision:D

    .line 52
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_start_time:J

    .line 56
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_end_time:J

    return-void
.end method


# virtual methods
.method public getGps_altitude()I
    .locals 1

    .line 75
    iget v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_altitude:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getGps_direction()D
    .locals 2

    .line 139
    iget-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_direction:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public getGps_distance()J
    .locals 2

    .line 67
    iget-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_distance:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getGps_end_time()J
    .locals 2

    .line 103
    iget-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_end_time:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getGps_h_latitude()D
    .locals 2

    .line 115
    iget-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_h_latitude:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public getGps_h_longitude()D
    .locals 2

    .line 107
    iget-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_h_longitude:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public getGps_latitude()D
    .locals 2

    .line 131
    iget-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_latitude:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public getGps_longitude()D
    .locals 2

    .line 123
    iget-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_longitude:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public getGps_precision()D
    .locals 2

    .line 147
    iget-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_precision:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public getGps_speed()I
    .locals 1

    .line 59
    iget v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_speed:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getGps_start_time()J
    .locals 2

    .line 95
    iget-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_start_time:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getGps_total_distance()J
    .locals 2

    .line 83
    iget-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_total_distance:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public setGps_altitude(I)V
    .locals 1

    .line 79
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_altitude:I

    .line 80
    return-void
.end method

.method public setGps_direction(D)V
    .locals 2

    .line 143
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_direction:D

    .line 144
    return-void
.end method

.method public setGps_distance(J)V
    .locals 2

    .line 71
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_distance:J

    .line 72
    return-void
.end method

.method public setGps_end_time(J)V
    .locals 2

    .line 99
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_end_time:J

    .line 100
    return-void
.end method

.method public setGps_h_latitude(D)V
    .locals 2

    .line 119
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_h_latitude:D

    .line 120
    return-void
.end method

.method public setGps_h_longitude(D)V
    .locals 2

    .line 111
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_h_longitude:D

    .line 112
    return-void
.end method

.method public setGps_latitude(D)V
    .locals 2

    .line 135
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_latitude:D

    .line 136
    return-void
.end method

.method public setGps_longitude(D)V
    .locals 2

    .line 127
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_longitude:D

    .line 128
    return-void
.end method

.method public setGps_precision(D)V
    .locals 2

    .line 151
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_precision:D

    .line 152
    return-void
.end method

.method public setGps_speed(I)V
    .locals 1

    .line 63
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_speed:I

    .line 64
    return-void
.end method

.method public setGps_start_time(J)V
    .locals 2

    .line 91
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_start_time:J

    .line 92
    return-void
.end method

.method public setGps_total_distance(J)V
    .locals 2

    .line 87
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/datatype/GPSStruct;->gps_total_distance:J

    .line 88
    return-void
.end method
