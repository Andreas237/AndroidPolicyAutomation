.class public Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ackEnable:Z

.field private appWaitTimeout:I

.field private deviceRestartTimeout:I

.field private otaInterval:J

.field private otaUnitSize:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;->ackEnable:Z

    .line 31
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;->otaInterval:J

    return-void
.end method


# virtual methods
.method public getAckEnable()Z
    .locals 1

    .line 48
    iget-boolean v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;->ackEnable:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getAppWaitTimeout()I
    .locals 1

    .line 60
    iget v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;->appWaitTimeout:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDeviceRestartTimeout()I
    .locals 1

    .line 52
    iget v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;->deviceRestartTimeout:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getOtaInterval()J
    .locals 2

    .line 34
    iget-wide v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;->otaInterval:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public getOtaUnitSize()I
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;->otaUnitSize:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public setAckEnable(J)V
    .locals 2

    .line 42
    const-wide/16 v0, 0x1

    cmp-long v0, v0, p1

    if-nez v0, :cond_0

    .line 43
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;->ackEnable:Z

    .line 45
    :cond_0
    return-void
.end method

.method public setAppWaitTimeout(I)V
    .locals 1

    .line 64
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;->appWaitTimeout:I

    .line 65
    return-void
.end method

.method public setDeviceRestartTimeout(I)V
    .locals 1

    .line 56
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;->deviceRestartTimeout:I

    .line 57
    return-void
.end method

.method public setOtaInterval(J)V
    .locals 2

    .line 38
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;->otaInterval:J

    .line 39
    return-void
.end method

.method public setOtaUnitSize(I)V
    .locals 1

    .line 72
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;->otaUnitSize:I

    .line 73
    return-void
.end method
