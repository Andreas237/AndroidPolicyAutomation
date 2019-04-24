.class Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->prepareToAddBankCard()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)V
    .locals 0

    .line 494
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 497
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$000(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 499
    const-string v4, ""

    .line 500
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 501
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v0}, Lcom/huawei/nfc/PluginPayAdapter;->getUserID()Ljava/lang/String;

    move-result-object v4

    .line 504
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    const-string v0, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 506
    :cond_1
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter swipeActivity  but account not login"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 507
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$000(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 508
    return-void

    .line 512
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 513
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    iget-object v1, v1, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v1, v4}, Lcom/huawei/nfc/PluginPayAdapter;->sendAccount(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mAcountStatus:I

    .line 515
    :cond_3
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "== checkWatchStatus sendAccount  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    iget v3, v3, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mAcountStatus:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 518
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->isExsitGroupTypeCard(I)Z

    move-result v5

    .line 520
    const-string v0, "PluginPay AddBankOrBusCardActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "== checkWatchStatus isExsit  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 521
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    iget v0, v0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->mAcountStatus:I

    const v1, 0x186a4

    if-ne v0, v1, :cond_4

    if-eqz v5, :cond_4

    .line 522
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$000(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 524
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$000(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 527
    :cond_4
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity$6;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$600(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;->access$700(Lcom/huawei/nfc/carrera/ui/cardlist/AddBankOrBusCardActivity;I)V

    .line 530
    :goto_0
    return-void
.end method
