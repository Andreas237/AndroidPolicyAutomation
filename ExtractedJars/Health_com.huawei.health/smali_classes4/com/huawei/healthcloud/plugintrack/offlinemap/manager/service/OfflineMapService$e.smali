.class Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$e;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)V
    .locals 1

    .line 895
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 896
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$e;->c:Ljava/lang/ref/WeakReference;

    .line 897
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 902
    if-nez p2, :cond_0

    .line 904
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyBroadcastReceiver onReceive() intent null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 905
    return-void

    .line 907
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$e;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    .line 908
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 910
    const-string v0, "OfflineMapService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyBroadcastReceiver onReceive() service null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 911
    return-void

    .line 913
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    .line 914
    const-string v0, "OfflineMapService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyBroadcastReceiver onReceive() action: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 915
    const-string v0, "ACITON_ACTIVITY_LOAD_CITY_AS"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 917
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    move-result-object v0

    const/16 v1, 0x66

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 918
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->sendMessage(Landroid/os/Message;)Z

    .line 919
    goto/16 :goto_0

    .line 920
    :cond_2
    const-string v0, "ACITON_ACTIVITY_DELETE_CITY_AS"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 922
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    move-result-object v0

    const/16 v1, 0x67

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 923
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->sendMessage(Landroid/os/Message;)Z

    .line 924
    goto/16 :goto_0

    .line 925
    :cond_3
    const-string v0, "ACTION_ACTIVITY_PAUSE_CITY_AS"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 927
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    move-result-object v0

    const/16 v1, 0x69

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 928
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->sendMessage(Landroid/os/Message;)Z

    .line 929
    goto/16 :goto_0

    .line 930
    :cond_4
    const-string v0, "ACITON_ACTIVITY_WAIT_CITY_AS"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 932
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    move-result-object v0

    const/16 v1, 0x6a

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 933
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->sendMessage(Landroid/os/Message;)Z

    .line 934
    goto :goto_0

    .line 935
    :cond_5
    const-string v0, "ACTION_ACITITY_DESTROY_AS"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 937
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    move-result-object v0

    const/16 v1, 0x6c

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 939
    :cond_6
    const-string v0, "ACTION_SPORT_START_DESTROY_SERVICE_AS"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 941
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    invoke-static {v4, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$a;

    .line 942
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    move-result-object v0

    const/16 v1, 0x6b

    invoke-virtual {v0, v1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 944
    :cond_7
    const-string v0, "ACTION_MAP_ONCHRCKUPDATE_AS"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 946
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    move-result-object v0

    const/16 v1, 0x68

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 947
    invoke-static {v4}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->sendMessage(Landroid/os/Message;)Z

    .line 949
    :cond_8
    :goto_0
    return-void
.end method
