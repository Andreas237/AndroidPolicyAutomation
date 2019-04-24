.class Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->a(Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Z

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;ZLjava/lang/String;)V
    .locals 0

    .line 521
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$2;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    iput-boolean p2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$2;->c:Z

    iput-object p3, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$2;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 526
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$2;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->d(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Ljava/util/ArrayList;

    move-result-object v3

    .line 527
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$2;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    iget-boolean v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$2;->c:Z

    iget-object v2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$2;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->f(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v3, v1, v2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->b(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/util/ArrayList;ZLjava/util/List;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineMapCityList;

    move-result-object v4

    .line 528
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$2;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 529
    const/16 v0, 0x65

    iput v0, v5, Landroid/os/Message;->what:I

    .line 530
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 531
    const-string v0, "TAG_MSG_SEND_INTENT"

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$2;->d:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    const-string v0, "TAG_MSG_SEND_LIST"

    invoke-virtual {v6, v0, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 533
    const-string v0, "TAG_IS_CHECK_UPDATE"

    iget-boolean v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$2;->c:Z

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 534
    invoke-virtual {v5, v6}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 535
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$2;->e:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$b;->sendMessage(Landroid/os/Message;)Z

    .line 536
    return-void
.end method
