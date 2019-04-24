.class Lcom/huawei/hwcommonservice/HWWearCommonService$1$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwcommonservice/HWWearCommonService$1;->d(Lo/dcc;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dcc;

.field final synthetic c:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

.field final synthetic d:Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;

.field final synthetic e:Lcom/huawei/hwcommonservice/HWWearCommonService$1;


# direct methods
.method constructor <init>(Lcom/huawei/hwcommonservice/HWWearCommonService$1;Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Lo/dcc;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/huawei/hwcommonservice/HWWearCommonService$1$5;->e:Lcom/huawei/hwcommonservice/HWWearCommonService$1;

    iput-object p2, p0, Lcom/huawei/hwcommonservice/HWWearCommonService$1$5;->d:Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;

    iput-object p3, p0, Lcom/huawei/hwcommonservice/HWWearCommonService$1$5;->c:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    iput-object p4, p0, Lcom/huawei/hwcommonservice/HWWearCommonService$1$5;->a:Lo/dcc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 128
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 129
    move-object v4, p2

    check-cast v4, Lo/dkd;

    .line 130
    invoke-virtual {v4}, Lo/dkd;->a()I

    move-result v5

    .line 131
    iget-object v0, p0, Lcom/huawei/hwcommonservice/HWWearCommonService$1$5;->d:Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;

    invoke-virtual {v0, v5}, Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;->setBatteryLevel(I)V

    .line 134
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwcommonservice/HWWearCommonService$1$5;->d:Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;->setConnectionStatus(I)V

    .line 135
    iget-object v0, p0, Lcom/huawei/hwcommonservice/HWWearCommonService$1$5;->d:Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;

    iget-object v1, p0, Lcom/huawei/hwcommonservice/HWWearCommonService$1$5;->c:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;->setDeviceID(Ljava/lang/String;)V

    .line 136
    iget-object v0, p0, Lcom/huawei/hwcommonservice/HWWearCommonService$1$5;->d:Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;

    iget-object v1, p0, Lcom/huawei/hwcommonservice/HWWearCommonService$1$5;->c:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;->setDeviceType(I)V

    .line 137
    iget-object v0, p0, Lcom/huawei/hwcommonservice/HWWearCommonService$1$5;->a:Lo/dcc;

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    iget-object v2, p0, Lcom/huawei/hwcommonservice/HWWearCommonService$1$5;->d:Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;

    invoke-virtual {v1, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lo/dcc;->b(ILjava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    goto :goto_0

    .line 138
    :catch_0
    move-exception v4

    .line 139
    const-string v0, "HWWearCommonService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RemoteException  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    :goto_0
    return-void
.end method
