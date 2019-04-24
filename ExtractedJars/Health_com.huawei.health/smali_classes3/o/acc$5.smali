.class Lo/acc$5;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/acc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/acc;


# direct methods
.method constructor <init>(Lo/acc;)V
    .locals 0

    .line 234
    iput-object p1, p0, Lo/acc$5;->d:Lo/acc;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 237
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v4

    .line 238
    const-string v0, "android.bluetooth.device.action.FOUND"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 241
    const-string v0, "android.bluetooth.device.extra.DEVICE"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/bluetooth/BluetoothDevice;

    .line 242
    if-eqz v5, :cond_1

    .line 243
    iget-object v0, p0, Lo/acc$5;->d:Lo/acc;

    invoke-static {v0}, Lo/acc;->e(Lo/acc;)Lo/ace;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/acc$5;->d:Lo/acc;

    invoke-static {v0}, Lo/acc;->e(Lo/acc;)Lo/ace;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/ace;->d(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 244
    :cond_0
    invoke-static {v5}, Lo/acj;->e(Landroid/bluetooth/BluetoothDevice;)Lo/acj;

    move-result-object v6

    .line 245
    iget-object v0, p0, Lo/acc$5;->d:Lo/acc;

    invoke-static {v0, v6}, Lo/acc;->a(Lo/acc;Lo/acl;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 250
    :cond_1
    goto :goto_0

    .line 248
    :catch_0
    move-exception v5

    .line 249
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    :cond_2
    :goto_0
    return-void
.end method
