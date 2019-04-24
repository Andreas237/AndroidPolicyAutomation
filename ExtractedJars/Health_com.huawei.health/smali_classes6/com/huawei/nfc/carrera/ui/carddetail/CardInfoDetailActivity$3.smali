.class Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->checkWatchStatus()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)V
    .locals 0

    .line 769
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 772
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->access$100(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 774
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    iget-object v1, v1, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v1}, Lcom/huawei/nfc/PluginPayAdapter;->getLockscreenStatus()I

    move-result v1

    iput v1, v0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mLockscreenStatus:I

    .line 776
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "checkWatchStatus mLockscreenStatus : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    iget v1, v1, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mLockscreenStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 778
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getDeviceConnectState()I

    move-result v2

    .line 780
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "== checkWatchStatus btconnect : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 782
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->access$100(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 786
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    iget v0, v0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mLockscreenStatus:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    iget v0, v0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mLockscreenStatus:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x2

    if-ne v2, v0, :cond_1

    .line 787
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 788
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    const-class v1, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 789
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 790
    const-string v0, "BANKCARDMODE"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->access$200(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 791
    const-string v0, "BANKCARREFERENCEID"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->access$300(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 792
    const-string v0, "LOCKSCREENSTATUS"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    iget v1, v1, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->mLockscreenStatus:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 793
    const-string v0, "FROM_ADD_CARD_PAGE"

    const-string v1, "CardInfoDetailActivity"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 794
    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 795
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    invoke-virtual {v0, v3}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->startActivity(Landroid/content/Intent;)V

    .line 796
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->finish()V

    .line 797
    return-void

    .line 799
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;->access$100(Lcom/huawei/nfc/carrera/ui/carddetail/CardInfoDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 800
    return-void
.end method
