.class Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V
    .locals 1

    .line 1272
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 1273
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d;->c:Ljava/lang/ref/WeakReference;

    .line 1274
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 1278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d;->c:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_5

    .line 1279
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;

    .line 1280
    if-nez v4, :cond_0

    .line 1281
    return-void

    .line 1284
    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_2

    .line 1285
    :cond_1
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBroadcastReceiver intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1286
    return-void

    .line 1288
    :cond_2
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    .line 1289
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onReceive: action = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1290
    const-string v0, "input_sport_history_start_time"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1292
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->y(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1293
    const-string v0, "Track_SportHistoryListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "inserting return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1294
    return-void

    .line 1296
    :cond_3
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->z(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 1297
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->a(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;Z)Z

    .line 1298
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->z(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d$3;

    invoke-direct {v1, p0, v4}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d$3;-><init>(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment$d;Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1306
    :cond_4
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->o(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 1307
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->o(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1308
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->o(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 1309
    iput-object p2, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1310
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;->o(Lcom/huawei/ui/main/stories/history/fragment/SportHistoryListFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1315
    :cond_5
    return-void
.end method
