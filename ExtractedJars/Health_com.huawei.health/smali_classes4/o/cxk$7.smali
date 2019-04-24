.class Lo/cxk$7;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cxk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cxk;


# direct methods
.method constructor <init>(Lo/cxk;)V
    .locals 0

    .line 1338
    iput-object p1, p0, Lo/cxk$7;->c:Lo/cxk;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    .line 1341
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v6

    .line 1342
    const-string v0, "android.bluetooth.device.action.BOND_STATE_CHANGED"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1343
    const-string v0, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/bluetooth/BluetoothDevice;

    .line 1344
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 1345
    invoke-virtual {v7}, Landroid/bluetooth/BluetoothDevice;->getBondState()I

    move-result v0

    const/16 v1, 0xa

    if-ne v1, v0, :cond_2

    .line 1346
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Device is unPaired."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1347
    iget-object v0, p0, Lo/cxk$7;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->o(Lo/cxk;)Lo/cyb;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1348
    iget-object v0, p0, Lo/cxk$7;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->o(Lo/cxk;)Lo/cyb;

    move-result-object v0

    invoke-virtual {v7}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/cyb;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 1350
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "mBTDeviceBondStateCallback is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1354
    :cond_1
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "btDevice is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1357
    :cond_2
    :goto_0
    return-void
.end method
