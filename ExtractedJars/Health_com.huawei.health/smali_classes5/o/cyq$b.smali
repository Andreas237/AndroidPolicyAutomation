.class Lo/cyq$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cyq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic b:Lo/cyq;


# direct methods
.method public constructor <init>(Lo/cyq;Landroid/os/Looper;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lo/cyq$b;->b:Lo/cyq;

    .line 176
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 177
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 181
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 182
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "receive msg:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p1, Landroid/os/Message;->what:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 183
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 185
    :pswitch_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/cyq$b;->removeMessages(I)V

    .line 187
    iget-object v0, p0, Lo/cyq$b;->b:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->a(Lo/cyq;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 188
    iget-object v0, p0, Lo/cyq$b;->b:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->a(Lo/cyq;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->disconnect()V

    .line 190
    const/4 v0, 0x6

    const-wide/16 v1, 0x1388

    invoke-virtual {p0, v0, v1, v2}, Lo/cyq$b;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_1

    .line 192
    :cond_0
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lo/cyq$b;->sendEmptyMessage(I)Z

    .line 194
    goto/16 :goto_1

    .line 197
    :pswitch_1
    iget-object v0, p0, Lo/cyq$b;->b:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->a(Lo/cyq;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 199
    const/4 v0, 0x4

    const-wide/16 v1, 0x4e20

    invoke-virtual {p0, v0, v1, v2}, Lo/cyq$b;->sendEmptyMessageDelayed(IJ)Z

    .line 200
    const/4 v5, 0x0

    .line 202
    :try_start_0
    iget-object v0, p0, Lo/cyq$b;->b:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->a(Lo/cyq;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v5

    .line 206
    goto :goto_0

    .line 203
    :catch_0
    move-exception v6

    .line 204
    const/4 v5, 0x0

    .line 205
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 207
    :goto_0
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Attempting to start service discovery:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 208
    goto/16 :goto_1

    .line 212
    :pswitch_2
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/cyq$b;->removeMessages(I)V

    .line 213
    iget-object v0, p0, Lo/cyq$b;->b:Lo/cyq;

    const/4 v1, 0x1

    const/4 v2, -0x1

    invoke-static {v0, v1, v2}, Lo/cyq;->c(Lo/cyq;ZI)V

    .line 214
    goto/16 :goto_1

    .line 217
    :pswitch_3
    iget-object v0, p0, Lo/cyq$b;->b:Lo/cyq;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/cyq;->b(Lo/cyq;I)V

    .line 218
    goto/16 :goto_1

    .line 221
    :pswitch_4
    const/4 v0, 0x4

    const-wide/16 v1, 0x4e20

    invoke-virtual {p0, v0, v1, v2}, Lo/cyq$b;->sendEmptyMessageDelayed(IJ)Z

    .line 223
    iget-object v0, p0, Lo/cyq$b;->b:Lo/cyq;

    iget-object v1, p0, Lo/cyq$b;->b:Lo/cyq;

    invoke-static {v1}, Lo/cyq;->b(Lo/cyq;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    iget-object v2, p0, Lo/cyq$b;->b:Lo/cyq;

    invoke-static {v2}, Lo/cyq;->d(Lo/cyq;)Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lo/cyq$b;->b:Lo/cyq;

    invoke-static {v3}, Lo/cyq;->e(Lo/cyq;)Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4, v3}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cyq;->e(Lo/cyq;Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGatt;

    .line 224
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "connectGatt() mBluetoothGatt = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyq$b;->b:Lo/cyq;

    invoke-static {v4}, Lo/cyq;->a(Lo/cyq;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 225
    goto :goto_1

    .line 227
    :pswitch_5
    iget-object v0, p0, Lo/cyq$b;->b:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->a(Lo/cyq;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 228
    iget-object v0, p0, Lo/cyq$b;->b:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->a(Lo/cyq;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGatt;->close()V

    .line 230
    const/4 v0, 0x5

    const-wide/16 v1, 0x3e8

    invoke-virtual {p0, v0, v1, v2}, Lo/cyq$b;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_1

    .line 234
    :pswitch_6
    iget-object v0, p0, Lo/cyq$b;->b:Lo/cyq;

    invoke-static {v0}, Lo/cyq;->c(Lo/cyq;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 236
    const-string v0, "01"

    const-string v1, "BTDeviceBLEService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BT Switch off and bt connect state is connected so start to release."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 238
    iget-object v0, p0, Lo/cyq$b;->b:Lo/cyq;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cyq;->c(Lo/cyq;Z)Z

    .line 239
    iget-object v0, p0, Lo/cyq$b;->b:Lo/cyq;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/cyq;->b(Lo/cyq;I)V

    .line 245
    :cond_1
    :goto_1
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 246
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method
