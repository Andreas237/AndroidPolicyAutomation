.class Lo/acg$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/acg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private b:Landroid/bluetooth/BluetoothGatt;

.field private c:I

.field private d:I

.field final synthetic e:Lo/acg;


# direct methods
.method public constructor <init>(Lo/acg;Landroid/bluetooth/BluetoothGatt;II)V
    .locals 0

    .line 222
    iput-object p1, p0, Lo/acg$e;->e:Lo/acg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 223
    iput-object p2, p0, Lo/acg$e;->b:Landroid/bluetooth/BluetoothGatt;

    .line 224
    iput p3, p0, Lo/acg$e;->c:I

    .line 225
    iput p4, p0, Lo/acg$e;->d:I

    .line 226
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 230
    iget-object v0, p0, Lo/acg$e;->e:Lo/acg;

    iget v1, p0, Lo/acg$e;->d:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lo/acg;->c(Lo/acg;Z)Z

    .line 232
    iget v0, p0, Lo/acg$e;->d:I

    const/16 v1, 0x85

    if-eq v0, v1, :cond_1

    iget v0, p0, Lo/acg$e;->c:I

    const/16 v1, 0x85

    if-ne v0, v1, :cond_2

    :cond_1
    iget-object v0, p0, Lo/acg$e;->e:Lo/acg;

    invoke-static {v0}, Lo/acg;->c(Lo/acg;)I

    move-result v0

    iget-object v1, p0, Lo/acg$e;->e:Lo/acg;

    invoke-static {v1}, Lo/acg;->d(Lo/acg;)I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 233
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BleDevice onConnectionStateChange Run autoReconnect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    iget-object v0, p0, Lo/acg$e;->e:Lo/acg;

    invoke-virtual {v0}, Lo/acg;->d()Z

    .line 235
    iget-object v0, p0, Lo/acg$e;->e:Lo/acg;

    invoke-static {v0}, Lo/acg;->b(Lo/acg;)I

    .line 236
    return-void

    .line 238
    :cond_2
    iget-object v0, p0, Lo/acg$e;->e:Lo/acg;

    invoke-static {v0}, Lo/acg;->e(Lo/acg;)Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 239
    iget-object v0, p0, Lo/acg$e;->e:Lo/acg;

    invoke-static {v0}, Lo/acg;->e(Lo/acg;)Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v0

    iget-object v1, p0, Lo/acg$e;->b:Landroid/bluetooth/BluetoothGatt;

    iget v2, p0, Lo/acg$e;->c:I

    iget v3, p0, Lo/acg$e;->d:I

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothGattCallback;->onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V

    .line 241
    :cond_3
    return-void
.end method
