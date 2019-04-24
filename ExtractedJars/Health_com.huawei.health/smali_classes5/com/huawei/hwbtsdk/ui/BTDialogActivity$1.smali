.class Lcom/huawei/hwbtsdk/ui/BTDialogActivity$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwbtsdk/ui/BTDialogActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwbtsdk/ui/BTDialogActivity;


# direct methods
.method constructor <init>(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)V
    .locals 0

    .line 417
    iput-object p1, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$1;->b:Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .line 420
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 421
    const-string v0, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 422
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v5

    .line 423
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 424
    invoke-virtual {v5}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v6

    .line 425
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====BT_GPS onReceive btSwitchState:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_0

    .line 429
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$1;->b:Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-static {v0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    invoke-virtual {v0}, Lo/cys;->b()V

    .line 430
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$1;->b:Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-static {v0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$1;->b:Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-static {v1}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->d(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cys;->c(Landroid/os/Handler;)V

    .line 431
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$1;->b:Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-static {v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->g(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)Landroid/content/BroadcastReceiver;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 433
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "===222==onReceive unregisterReceiver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    iget-object v0, p0, Lcom/huawei/hwbtsdk/ui/BTDialogActivity$1;->b:Lcom/huawei/hwbtsdk/ui/BTDialogActivity;

    invoke-static {v0}, Lcom/huawei/hwbtsdk/ui/BTDialogActivity;->g(Lcom/huawei/hwbtsdk/ui/BTDialogActivity;)Landroid/content/BroadcastReceiver;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 438
    goto :goto_0

    .line 436
    :catch_0
    move-exception v7

    .line 437
    const-string v0, "BTDialogActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "====BT_GPS unregisterReceiver IllegalArgumentException e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    .line 458
    :cond_0
    :goto_0
    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
