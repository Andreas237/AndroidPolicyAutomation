.class public Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private deviceMac:Ljava/lang/String;

.field private lastSyncTime:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDeviceMac()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->deviceMac:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getLastSyncTime()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->lastSyncTime:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public setDeviceMac(Ljava/lang/String;)V
    .locals 1

    .line 17
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->deviceMac:Ljava/lang/String;

    .line 18
    return-void
.end method

.method public setLastSyncTime(Ljava/lang/String;)V
    .locals 1

    .line 25
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->lastSyncTime:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TruSleepLastSynctime:deviceMac = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 31
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->deviceMac:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",lastSyncTime = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcoresleepmgr/datatype/TruSleepLastSyncTime;->lastSyncTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 30
    return-object v0
.end method
