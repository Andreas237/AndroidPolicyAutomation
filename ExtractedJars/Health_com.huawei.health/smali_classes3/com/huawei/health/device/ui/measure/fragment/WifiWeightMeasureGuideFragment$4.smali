.class Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$4;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)V
    .locals 0

    .line 335
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 338
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mWeightPushInfoReceiver onReceive"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 339
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const-string v0, "com.huawei.health.action.ACTION_PUSH_DATA_DONE_ACTION"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 340
    const-string v0, "WifiWeightMeasureGuideFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "receive push info,now get new weight measure data..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 341
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$4$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$4$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$4;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 348
    :cond_0
    return-void
.end method
