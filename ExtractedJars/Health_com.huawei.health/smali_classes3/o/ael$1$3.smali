.class Lo/ael$1$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ael$1;->onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/ael$1;


# direct methods
.method constructor <init>(Lo/ael$1;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lo/ael$1$3;->e:Lo/ael$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 185
    iget-object v0, p0, Lo/ael$1$3;->e:Lo/ael$1;

    invoke-static {v0}, Lo/ael$1;->d(Lo/ael$1;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Lo/ael$1$3;->e:Lo/ael$1;

    invoke-static {v0}, Lo/ael$1;->d(Lo/ael$1;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    goto :goto_0

    .line 190
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PicoocMeasureController onConnectionStateChange failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    iget-object v0, p0, Lo/ael$1$3;->e:Lo/ael$1;

    iget-object v0, v0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->b(Lo/ael;)Lo/abx;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 192
    iget-object v0, p0, Lo/ael$1$3;->e:Lo/ael$1;

    iget-object v0, v0, Lo/ael$1;->c:Lo/ael;

    invoke-static {v0}, Lo/ael;->b(Lo/ael;)Lo/abx;

    move-result-object v0

    iget-object v1, p0, Lo/ael$1$3;->e:Lo/ael$1;

    iget-object v1, v1, Lo/ael$1;->c:Lo/ael;

    invoke-static {v1}, Lo/ael;->e(Lo/ael;)Lo/acl;

    move-result-object v1

    const/16 v2, 0x9

    invoke-interface {v0, v1, v2}, Lo/abx;->onStatusChanged(Lo/acl;I)V

    .line 195
    :cond_1
    :goto_0
    return-void
.end method
