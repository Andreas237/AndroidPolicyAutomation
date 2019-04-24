.class Lcom/huawei/hwservicesmgr/PhoneService$9;
.super Lo/djz$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwservicesmgr/PhoneService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/hwservicesmgr/PhoneService;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/PhoneService;)V
    .locals 0

    .line 971
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {p0}, Lo/djz$d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1179
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1180
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceCapabilityMap, HWDeviceMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1181
    const/4 v0, 0x0

    return-object v0

    .line 1183
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0}, Lo/dea;->k()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public a(ILjava/lang/String;Ljava/util/List;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Ljava/util/List<Ljava/lang/String;>;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1005
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1006
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addDevice, HWDeviceMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1007
    return-void

    .line 1009
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    new-instance v4, Lcom/huawei/hwservicesmgr/PhoneService$9$3;

    invoke-direct {v4, p0, p4}, Lcom/huawei/hwservicesmgr/PhoneService$9$3;-><init>(Lcom/huawei/hwservicesmgr/PhoneService$9;Lo/djp;)V

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lo/dea;->b(ILjava/lang/String;Ljava/util/List;Lo/cxs;Ljava/lang/String;Ljava/lang/String;)V

    .line 1021
    return-void
.end method

.method public a(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1188
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerBinder called "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1189
    new-instance v4, Lcom/huawei/hwservicesmgr/PhoneService$b;

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {v4, v0, p1, p2, p3}, Lcom/huawei/hwservicesmgr/PhoneService$b;-><init>(Lcom/huawei/hwservicesmgr/PhoneService;Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)V

    .line 1190
    const/4 v0, 0x0

    invoke-interface {p1, v4, v0}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 1191
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->k(Lcom/huawei/hwservicesmgr/PhoneService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1192
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->h(Lcom/huawei/hwservicesmgr/PhoneService;)Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1193
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->h(Lcom/huawei/hwservicesmgr/PhoneService;)Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->reconnect()V

    .line 1195
    :cond_0
    return-void
.end method

.method public a(Lo/djr;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 995
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 996
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unRegisterDeviceStateCallBack, HWDeviceMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 997
    return-void

    .line 999
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/PhoneService;->c(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/ddg;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dea;->b(Lo/ddg;)V

    .line 1000
    return-void
.end method

.method public b()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1143
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1144
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "forceConnectBTDevice, HWDeviceMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1145
    return-void

    .line 1147
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dea;->b(Z)V

    .line 1148
    return-void
.end method

.method public c()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1167
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1168
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceCapabilityList, HWDeviceMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1169
    const/4 v0, 0x0

    return-object v0

    .line 1171
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0}, Lo/dea;->d()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1052
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1053
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendOTACommand, HWDeviceMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1054
    return-void

    .line 1056
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dea;->b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 1057
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1199
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendfilepath called "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1201
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1202
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendfilepath, HWDeviceMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1203
    return-void

    .line 1205
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dea;->d(Ljava/lang/String;)V

    .line 1206
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1025
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1026
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUsedDeviceList, HWDeviceMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1027
    return-void

    .line 1029
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lo/dea;->b(Ljava/util/List;ZZ)V

    .line 1030
    return-void
.end method

.method public c(Lo/djs;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1239
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startSyncWorkOut"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1240
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->registerWorkOutCallback(Lo/djs;)V

    .line 1241
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->syncDeviceWorkoutRecordInfo(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1242
    return-void
.end method

.method public d()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1043
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1044
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUsedDeviceList, HWDeviceMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1045
    const/4 v0, 0x0

    return-object v0

    .line 1047
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0}, Lo/dea;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(IILo/djt;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1232
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->h(Lcom/huawei/hwservicesmgr/PhoneService;)Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1233
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->h(Lcom/huawei/hwservicesmgr/PhoneService;)Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->isLoudspeakerMuteOpenOrCloseHeartRate(IILo/djt;)V

    .line 1235
    :cond_0
    return-void
.end method

.method public d(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lo/djv;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1210
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFile called "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1211
    invoke-static {}, Lo/dkv;->c()Lo/dkv;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/dkv;->a(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Ljava/lang/Object;)V

    .line 1212
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .line 1252
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1253
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dea;->a(Ljava/lang/String;)V

    .line 1255
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILo/djw;)V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1062
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1063
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUsedDeviceList, HWDeviceMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1064
    return-void

    .line 1071
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 1072
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendOTAFileData filePath == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1073
    return-void

    .line 1076
    :cond_1
    const-string v0, "PhoneService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendOTAFileData filePath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " and version = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1077
    const-string v0, "PhoneService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendOTAFileData otaParameter = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p3, v1, v2

    const-string v2, " and updateMode = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1078
    const/4 v8, 0x0

    .line 1079
    sget-char v0, Ljava/io/File;->separatorChar:C

    const/16 v1, 0x5c

    if-ne v0, v1, :cond_2

    const-string v0, "\\\\"

    goto :goto_0

    :cond_2
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    .line 1080
    array-length v0, v9

    add-int/lit8 v0, v0, -0x1

    aget-object v10, v9, v0

    .line 1081
    const-string v0, "PhoneService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendOTAFileData tmpFilePath = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1083
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "AW70"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1084
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0}, Lo/dea;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v11

    .line 1085
    const/4 v0, 0x0

    if-eq v0, v11, :cond_3

    .line 1086
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendOTAFileData current upgrade device IS aw70"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1087
    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v8

    .line 1089
    :cond_3
    goto :goto_1

    .line 1090
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0}, Lo/dea;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v11

    .line 1091
    const/4 v0, 0x0

    if-eq v0, v11, :cond_5

    .line 1092
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendOTAFileData current upgrade device IS NOT aw70"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1093
    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v8

    .line 1097
    :cond_5
    :goto_1
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1098
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendOTAFileData NOT FIND target device, please check the name of version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1099
    return-void

    .line 1102
    :cond_6
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    move-object v1, v8

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v5, p4

    new-instance v6, Lcom/huawei/hwservicesmgr/PhoneService$9$1;

    move-object/from16 v7, p5

    invoke-direct {v6, p0, v7}, Lcom/huawei/hwservicesmgr/PhoneService$9$1;-><init>(Lcom/huawei/hwservicesmgr/PhoneService$9;Lo/djw;)V

    invoke-virtual/range {v0 .. v6}, Lo/dea;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILo/yc;)V

    .line 1136
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1034
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1035
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "migrateUsedDeviceList, HWDeviceMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1036
    return-void

    .line 1038
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dea;->d(Ljava/util/List;)V

    .line 1039
    return-void
.end method

.method public d(Lo/djr;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 984
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 985
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerDeviceStateCallBack, HWDeviceMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 986
    return-void

    .line 988
    :cond_0
    invoke-static {p1}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lo/djr;)Lo/djr;

    .line 989
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/PhoneService;->c(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/ddg;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dea;->a(Lo/ddg;)V

    .line 991
    return-void
.end method

.method public e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1155
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1156
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceCapability, HWDeviceMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1157
    const/4 v0, 0x0

    return-object v0

    .line 1159
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0}, Lo/dea;->c()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    return-object v0
.end method

.method public e(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 975
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 976
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendDeviceData, HWDeviceMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 977
    return-void

    .line 979
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 980
    return-void
.end method

.method public e(Lo/djs;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1246
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerWorkOutCallback do nothing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1248
    return-void
.end method

.method public e(Z)V
    .locals 2

    .line 1216
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1217
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/dea;->c(Z)V

    .line 1219
    :cond_0
    return-void
.end method

.method public g()Z
    .locals 2

    .line 1259
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->g(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dkn;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1260
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->g(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dkn;

    move-result-object v0

    invoke-virtual {v0}, Lo/dkn;->i()Z

    move-result v0

    return v0

    .line 1262
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public k()Z
    .locals 2

    .line 1223
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1224
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9;->e:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->d(Lcom/huawei/hwservicesmgr/PhoneService;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0}, Lo/dea;->g()Z

    move-result v0

    return v0

    .line 1226
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
