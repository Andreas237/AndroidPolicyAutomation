.class Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$1;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 7

    .line 112
    if-eqz p2, :cond_3

    .line 113
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start to authenticate to Huawei Health"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    invoke-static {p2}, Lo/aat$e;->c(Landroid/os/IBinder;)Lo/aat;

    move-result-object v0

    const-string v1, "com.huawei.health"

    invoke-interface {v0, v1}, Lo/aat;->b(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v4

    .line 115
    if-eqz v4, :cond_2

    .line 116
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "authenticate Successfully"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$000()[B

    move-result-object v5

    monitor-enter v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    :try_start_1
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    if-nez v0, :cond_1

    .line 119
    invoke-static {v4}, Lo/aau$e;->b(Landroid/os/IBinder;)Lo/aau;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$102(Lo/aau;)Lo/aau;

    .line 120
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 121
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWExerciseAdviceManager;->setiCallbackInterface(Lo/aau;)V

    .line 122
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    const-string v1, "com.huawei.health"

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$1;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v2}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$200(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Lo/aaz;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/aau;->c(Ljava/lang/String;Lo/aaz;)V

    .line 123
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$400()Lcom/google/gson/Gson;

    move-result-object v1

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$300()Lo/dea;

    move-result-object v2

    invoke-virtual {v2}, Lo/dea;->d()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/aau;->c(Ljava/lang/String;)V

    .line 124
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$500()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/aau;->a(Ljava/util/List;)V

    .line 125
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$1;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$600(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Landroid/os/IBinder;

    move-result-object v1

    const-string v2, "PhoneServiceInHealth"

    const-string v3, ""

    invoke-interface {v0, v1, v2, v3}, Lo/aau;->e(Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 127
    :cond_0
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "iCallbackInterface is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    :cond_1
    :goto_0
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v5

    :try_start_2
    throw v6

    :goto_1
    goto :goto_2

    .line 133
    :cond_2
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remote binder is null, maybe current APP is not authenticated!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    :goto_2
    goto :goto_3

    .line 136
    :cond_3
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remote binder is incorrect, maybe current APP is not authenticated!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 141
    :goto_3
    goto :goto_4

    .line 139
    :catch_0
    move-exception v4

    .line 140
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    :goto_4
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$1;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$700(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)V

    .line 143
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AIDL remote service has been connected!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 5

    .line 149
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Service has unexpectedly disconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 152
    :try_start_0
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$100()Lo/aau;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$1;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$200(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Lo/aaz;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/aau;->b(Lo/aaz;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    goto :goto_0

    .line 153
    :catch_0
    move-exception v4

    .line 154
    const-string v0, "RemoteServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    :cond_0
    :goto_0
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$102(Lo/aau;)Lo/aau;

    .line 159
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$1;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$800(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 160
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$1;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$1000(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$1;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$800(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$1;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    invoke-static {v2}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$900(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;)Lo/cmh;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/clt;->e(Ljava/util/List;Lo/cmh;)V

    .line 161
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr$1;->this$0:Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->access$802(Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;Ljava/util/List;)Ljava/util/List;

    .line 165
    :cond_1
    return-void
.end method
