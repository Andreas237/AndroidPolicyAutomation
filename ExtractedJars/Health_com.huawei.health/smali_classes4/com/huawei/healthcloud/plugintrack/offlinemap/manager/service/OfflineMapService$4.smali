.class Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$4;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->h(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;Ljava/lang/String;)V
    .locals 0

    .line 1481
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$4;->a:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    iput-object p2, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$4;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1484
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$4;->a:Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;->k(Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/manager/service/OfflineMapService$4;->c:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1485
    return-void
.end method
