.class Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->checkWatchStatusAndNextStep()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)V
    .locals 0

    .line 1423
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$17;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1426
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$17;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1429
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$17;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$17;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    iget-object v1, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v1}, Lcom/huawei/nfc/PluginPayAdapter;->getLockscreenStatus()I

    move-result v1

    iput v1, v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mLockscreenStatus:I

    .line 1430
    const-string v0, "BindCardInputFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "== checkWatchStatus LockscreenStatus : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$17;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    iget v3, v3, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mLockscreenStatus:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1431
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$17;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceConnectState()I

    move-result v4

    .line 1432
    const-string v0, "BindCardInputFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "== checkWatchStatus btconnect : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1434
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$17;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    iget v0, v0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mLockscreenStatus:I

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    if-ne v4, v0, :cond_0

    .line 1435
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$17;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1436
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 1437
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$17;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-class v1, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1438
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 1439
    const-string v0, "LOCKSCREENSTATUS"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$17;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    iget v1, v1, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->mLockscreenStatus:I

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1440
    const-string v0, "FROM_ADD_CARD_PAGE"

    const-string v1, "BindCardActivity"

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1441
    invoke-virtual {v5, v6}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1442
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$17;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    const/16 v1, 0xde

    invoke-virtual {v0, v5, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 1443
    return-void

    .line 1445
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$17;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1446
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment$17;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;->access$100(Lcom/huawei/nfc/carrera/ui/bindcard/BindCardInputFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1447
    return-void
.end method
