.class public Lcom/huawei/hwbtsdk/btmanager/btdeviceservice/BTDeviceAWHostService;
.super Lcom/google/android/gms/wearable/WearableListenerService;
.source "SourceFile"


# instance fields
.field private d:Lo/cym;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 70
    invoke-direct {p0}, Lcom/google/android/gms/wearable/WearableListenerService;-><init>()V

    .line 71
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwbtsdk/btmanager/btdeviceservice/BTDeviceAWHostService;->d:Lo/cym;

    return-void
.end method

.method public static e(Landroid/content/Context;)V
    .locals 6

    .line 150
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 151
    const-string v0, "01"

    const-string v1, "BTDeviceAWHostService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BTDeviceAWHostService start"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 152
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/hwbtsdk/btmanager/btdeviceservice/BTDeviceAWHostService;

    invoke-direct {v5, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 153
    invoke-virtual {p0, v5}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 155
    :cond_0
    return-void
.end method


# virtual methods
.method public onCapabilityChanged(Lcom/google/android/gms/wearable/CapabilityInfo;)V
    .locals 5

    .line 131
    const-string v0, "01"

    const-string v1, "BTDeviceAWHostService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onCapabilityChanged:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 132
    iget-object v0, p0, Lcom/huawei/hwbtsdk/btmanager/btdeviceservice/BTDeviceAWHostService;->d:Lo/cym;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 134
    iget-object v0, p0, Lcom/huawei/hwbtsdk/btmanager/btdeviceservice/BTDeviceAWHostService;->d:Lo/cym;

    invoke-virtual {v0, p1}, Lo/cym;->onCapabilityChanged(Lcom/google/android/gms/wearable/CapabilityInfo;)V

    .line 136
    :cond_0
    return-void
.end method

.method public onConnectedNodes(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/google/android/gms/wearable/Node;>;)V"
        }
    .end annotation

    .line 94
    invoke-super {p0, p1}, Lcom/google/android/gms/wearable/WearableListenerService;->onConnectedNodes(Ljava/util/List;)V

    .line 95
    const-string v0, "01"

    const-string v1, "BTDeviceAWHostService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onConnectedNodes:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 96
    return-void
.end method

.method public onCreate()V
    .locals 5

    .line 77
    invoke-super {p0}, Lcom/google/android/gms/wearable/WearableListenerService;->onCreate()V

    .line 78
    const-string v0, "01"

    const-string v1, "BTDeviceAWHostService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BTDeviceAWHostService onCreate"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 79
    invoke-static {}, Lo/cym;->b()Lo/cym;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwbtsdk/btmanager/btdeviceservice/BTDeviceAWHostService;->d:Lo/cym;

    .line 80
    iget-object v0, p0, Lcom/huawei/hwbtsdk/btmanager/btdeviceservice/BTDeviceAWHostService;->d:Lo/cym;

    invoke-virtual {v0, p0}, Lo/cym;->c(Landroid/content/Context;)V

    .line 81
    return-void
.end method

.method public onDataChanged(Lcom/google/android/gms/wearable/DataEventBuffer;)V
    .locals 5

    .line 121
    const-string v0, "01"

    const-string v1, "BTDeviceAWHostService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onDataChanged:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 122
    iget-object v0, p0, Lcom/huawei/hwbtsdk/btmanager/btdeviceservice/BTDeviceAWHostService;->d:Lo/cym;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/huawei/hwbtsdk/btmanager/btdeviceservice/BTDeviceAWHostService;->d:Lo/cym;

    invoke-virtual {v0, p1}, Lo/cym;->onDataChanged(Lcom/google/android/gms/wearable/DataEventBuffer;)V

    .line 126
    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 5

    .line 86
    invoke-super {p0}, Lcom/google/android/gms/wearable/WearableListenerService;->onDestroy()V

    .line 87
    const-string v0, "01"

    const-string v1, "BTDeviceAWHostService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BTDeviceAWHostService onDestroy"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 88
    return-void
.end method

.method public onMessageReceived(Lcom/google/android/gms/wearable/MessageEvent;)V
    .locals 5

    .line 141
    const-string v0, "01"

    const-string v1, "BTDeviceAWHostService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onMessageReceived: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 142
    iget-object v0, p0, Lcom/huawei/hwbtsdk/btmanager/btdeviceservice/BTDeviceAWHostService;->d:Lo/cym;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 144
    iget-object v0, p0, Lcom/huawei/hwbtsdk/btmanager/btdeviceservice/BTDeviceAWHostService;->d:Lo/cym;

    invoke-virtual {v0, p1}, Lo/cym;->onMessageReceived(Lcom/google/android/gms/wearable/MessageEvent;)V

    .line 146
    :cond_0
    return-void
.end method

.method public onPeerConnected(Lcom/google/android/gms/wearable/Node;)V
    .locals 5

    .line 101
    invoke-super {p0, p1}, Lcom/google/android/gms/wearable/WearableListenerService;->onPeerConnected(Lcom/google/android/gms/wearable/Node;)V

    .line 102
    const-string v0, "01"

    const-string v1, "BTDeviceAWHostService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onPeerConnected:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 103
    iget-object v0, p0, Lcom/huawei/hwbtsdk/btmanager/btdeviceservice/BTDeviceAWHostService;->d:Lo/cym;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/huawei/hwbtsdk/btmanager/btdeviceservice/BTDeviceAWHostService;->d:Lo/cym;

    invoke-virtual {v0, p1}, Lo/cym;->onPeerConnected(Lcom/google/android/gms/wearable/Node;)V

    .line 106
    :cond_0
    return-void
.end method

.method public onPeerDisconnected(Lcom/google/android/gms/wearable/Node;)V
    .locals 5

    .line 111
    invoke-super {p0, p1}, Lcom/google/android/gms/wearable/WearableListenerService;->onPeerDisconnected(Lcom/google/android/gms/wearable/Node;)V

    .line 112
    const-string v0, "01"

    const-string v1, "BTDeviceAWHostService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onPeerDisconnected:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 113
    iget-object v0, p0, Lcom/huawei/hwbtsdk/btmanager/btdeviceservice/BTDeviceAWHostService;->d:Lo/cym;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 114
    iget-object v0, p0, Lcom/huawei/hwbtsdk/btmanager/btdeviceservice/BTDeviceAWHostService;->d:Lo/cym;

    invoke-virtual {v0, p1}, Lo/cym;->onPeerDisconnected(Lcom/google/android/gms/wearable/Node;)V

    .line 116
    :cond_0
    return-void
.end method
