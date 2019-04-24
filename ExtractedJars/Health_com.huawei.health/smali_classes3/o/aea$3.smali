.class Lo/aea$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aea;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/aea;


# direct methods
.method constructor <init>(Lo/aea;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lo/aea$3;->b:Lo/aea;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 103
    :goto_0
    iget-object v0, p0, Lo/aea$3;->b:Lo/aea;

    invoke-static {v0}, Lo/aea;->e(Lo/aea;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lo/aea$3;->b:Lo/aea;

    invoke-static {v0}, Lo/aea;->b(Lo/aea;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lo/aea$3;->b:Lo/aea;

    invoke-static {v0}, Lo/aea;->c(Lo/aea;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    iget-object v1, p0, Lo/aea$3;->b:Lo/aea;

    invoke-static {v1}, Lo/aea;->d(Lo/aea;)Lo/aeb;

    move-result-object v1

    invoke-virtual {v1}, Lo/aeb;->d()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    .line 105
    iget-object v0, p0, Lo/aea$3;->b:Lo/aea;

    invoke-static {v0}, Lo/aea;->a(Lo/aea;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    iget-object v1, p0, Lo/aea$3;->b:Lo/aea;

    invoke-static {v1}, Lo/aea;->c(Lo/aea;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    .line 108
    :try_start_0
    invoke-static {}, Lo/aea;->f()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    goto :goto_0

    .line 109
    :catch_0
    move-exception v4

    .line 110
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    goto :goto_0

    .line 114
    :cond_0
    return-void
.end method
