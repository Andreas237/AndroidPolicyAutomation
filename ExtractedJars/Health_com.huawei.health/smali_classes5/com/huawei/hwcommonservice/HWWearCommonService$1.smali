.class Lcom/huawei/hwcommonservice/HWWearCommonService$1;
.super Lo/dbv$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwcommonservice/HWWearCommonService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwcommonservice/HWWearCommonService;


# direct methods
.method constructor <init>(Lcom/huawei/hwcommonservice/HWWearCommonService;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/huawei/hwcommonservice/HWWearCommonService$1;->b:Lcom/huawei/hwcommonservice/HWWearCommonService;

    invoke-direct {p0}, Lo/dbv$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(JJLo/dcb;)V
    .locals 4

    .line 159
    const-string v0, "HWWearCommonService"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCoreSleepRRData,startTime:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ";endTime:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dca;->d(Landroid/content/Context;)Lo/dca;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    div-long v1, p1, v1

    long-to-int v1, v1

    const-wide/16 v2, 0x3e8

    div-long v2, p3, v2

    long-to-int v2, v2

    invoke-virtual {v0, v1, v2, p5}, Lo/dca;->c(IILo/dcb;)V

    .line 161
    return-void
.end method

.method public d(Lo/dcc;)V
    .locals 7

    .line 112
    const-string v0, "HWWearCommonService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWearableDeviceStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    new-instance v4, Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;

    invoke-direct {v4}, Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;-><init>()V

    .line 115
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 116
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 118
    :cond_0
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;->setConnectionStatus(I)V

    .line 120
    :try_start_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lo/dcc;->b(ILjava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    goto :goto_0

    .line 121
    :catch_0
    move-exception v6

    .line 122
    const-string v0, "HWWearCommonService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RemoteException  "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    goto :goto_0

    .line 125
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwcommonservice/HWWearCommonService$1$5;

    invoke-direct {v1, p0, v4, v5, p1}, Lcom/huawei/hwcommonservice/HWWearCommonService$1$5;-><init>(Lcom/huawei/hwcommonservice/HWWearCommonService$1;Lcom/huawei/hwcommonservice/model/WearableDeviceInfo;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Lo/dcc;)V

    invoke-virtual {v0, v1}, Lo/dde;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 144
    :goto_0
    return-void
.end method
