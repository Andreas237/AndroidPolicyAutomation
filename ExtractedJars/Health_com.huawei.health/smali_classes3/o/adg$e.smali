.class Lo/adg$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/adg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic c:Lo/adg;


# direct methods
.method public constructor <init>(Lo/adg;Landroid/os/Looper;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lo/adg$e;->c:Lo/adg;

    .line 190
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 191
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 195
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 196
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HeartRateMeasureController receive msg : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 200
    :pswitch_0
    iget-object v0, p0, Lo/adg$e;->c:Lo/adg;

    invoke-static {v0}, Lo/adg;->d(Lo/adg;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 202
    const/4 v0, 0x2

    const-wide/16 v1, 0x2710

    invoke-virtual {p0, v0, v1, v2}, Lo/adg$e;->sendEmptyMessageDelayed(IJ)Z

    .line 203
    iget-object v0, p0, Lo/adg$e;->c:Lo/adg;

    iget-object v1, p0, Lo/adg$e;->c:Lo/adg;

    invoke-static {v1}, Lo/adg;->d(Lo/adg;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    move-result v1

    invoke-static {v0, v1}, Lo/adg;->e(Lo/adg;Z)Z

    .line 204
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Attemping to start service discovery:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adg$e;->c:Lo/adg;

    invoke-static {v3}, Lo/adg;->c(Lo/adg;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 209
    :pswitch_1
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/adg$e;->removeMessages(I)V

    .line 210
    iget-object v0, p0, Lo/adg$e;->c:Lo/adg;

    invoke-static {v0}, Lo/adg;->a(Lo/adg;)I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 211
    iget-object v0, p0, Lo/adg$e;->c:Lo/adg;

    invoke-static {v0}, Lo/adg;->b(Lo/adg;)I

    .line 212
    iget-object v0, p0, Lo/adg$e;->c:Lo/adg;

    iget-object v1, p0, Lo/adg$e;->c:Lo/adg;

    invoke-static {v1}, Lo/adg;->d(Lo/adg;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    iget-object v2, p0, Lo/adg$e;->c:Lo/adg;

    invoke-static {v2}, Lo/adg;->e(Lo/adg;)Lo/adg$e;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/adg;->b(Lo/adg;Landroid/bluetooth/BluetoothGatt;Lo/adg$e;)V

    .line 213
    iget-object v0, p0, Lo/adg$e;->c:Lo/adg;

    invoke-static {v0}, Lo/adg;->e(Lo/adg;)Lo/adg$e;

    move-result-object v0

    const/4 v1, 0x3

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/adg$e;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 215
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Times IS OUT! The mConnectTryNum = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/adg$e;->c:Lo/adg;

    invoke-static {v3}, Lo/adg;->a(Lo/adg;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    goto :goto_0

    .line 220
    :pswitch_2
    iget-object v0, p0, Lo/adg$e;->c:Lo/adg;

    invoke-static {v0}, Lo/adg;->h(Lo/adg;)Lo/acg;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/acg;->a(Lo/abx;)Z

    .line 221
    goto :goto_0

    .line 224
    :pswitch_3
    iget-object v0, p0, Lo/adg$e;->c:Lo/adg;

    invoke-static {v0}, Lo/adg;->i(Lo/adg;)Lo/acg;

    move-result-object v0

    invoke-virtual {v0}, Lo/acg;->d()Z

    .line 225
    .line 229
    :cond_1
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
