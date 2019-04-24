.class Lo/cxk$1;
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
.field final synthetic d:Lo/cxk;


# direct methods
.method constructor <init>(Lo/cxk;)V
    .locals 0

    .line 1304
    iput-object p1, p0, Lo/cxk$1;->d:Lo/cxk;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    .line 1307
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v6

    .line 1308
    const-string v0, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1309
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Receive Headset connect state change msg."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1311
    const-string v0, "android.bluetooth.profile.extra.STATE"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    .line 1312
    const-string v0, "android.bluetooth.device.extra.DEVICE"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/bluetooth/BluetoothDevice;

    .line 1313
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    .line 1314
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "btDevice is null so return."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1315
    return-void

    .line 1319
    :cond_0
    iget-object v0, p0, Lo/cxk$1;->d:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->l(Lo/cxk;)Lo/cxy;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    const/4 v0, 0x2

    if-ne v0, v7, :cond_1

    .line 1320
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "HFP device connected."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1321
    iget-object v0, p0, Lo/cxk$1;->d:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->l(Lo/cxk;)Lo/cxy;

    move-result-object v0

    invoke-interface {v0, v8}, Lo/cxy;->c(Landroid/bluetooth/BluetoothDevice;)V

    .line 1324
    :cond_1
    return-void
.end method
