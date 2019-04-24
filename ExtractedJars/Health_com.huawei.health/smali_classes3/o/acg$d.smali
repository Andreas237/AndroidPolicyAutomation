.class Lo/acg$d;
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
    name = "d"
.end annotation


# instance fields
.field private a:I

.field final synthetic b:Lo/acg;

.field private c:Landroid/bluetooth/BluetoothGattCharacteristic;

.field private d:Landroid/bluetooth/BluetoothGatt;

.field private e:I


# direct methods
.method public constructor <init>(Lo/acg;ILandroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 0

    .line 269
    iput-object p1, p0, Lo/acg$d;->b:Lo/acg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 271
    iput p2, p0, Lo/acg$d;->e:I

    .line 272
    iput-object p3, p0, Lo/acg$d;->d:Landroid/bluetooth/BluetoothGatt;

    .line 273
    iput-object p4, p0, Lo/acg$d;->c:Landroid/bluetooth/BluetoothGattCharacteristic;

    .line 274
    iput p5, p0, Lo/acg$d;->a:I

    .line 275
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 279
    iget-object v0, p0, Lo/acg$d;->b:Lo/acg;

    invoke-static {v0}, Lo/acg;->e(Lo/acg;)Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 280
    iget v0, p0, Lo/acg$d;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 281
    iget-object v0, p0, Lo/acg$d;->b:Lo/acg;

    invoke-static {v0}, Lo/acg;->e(Lo/acg;)Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v0

    iget-object v1, p0, Lo/acg$d;->d:Landroid/bluetooth/BluetoothGatt;

    iget-object v2, p0, Lo/acg$d;->c:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {v0, v1, v2}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    goto :goto_0

    .line 282
    :cond_0
    iget v0, p0, Lo/acg$d;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 283
    iget-object v0, p0, Lo/acg$d;->b:Lo/acg;

    invoke-static {v0}, Lo/acg;->e(Lo/acg;)Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v0

    iget-object v1, p0, Lo/acg$d;->d:Landroid/bluetooth/BluetoothGatt;

    iget-object v2, p0, Lo/acg$d;->c:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget v3, p0, Lo/acg$d;->a:I

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    goto :goto_0

    .line 284
    :cond_1
    iget v0, p0, Lo/acg$d;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 285
    iget-object v0, p0, Lo/acg$d;->b:Lo/acg;

    invoke-static {v0}, Lo/acg;->e(Lo/acg;)Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v0

    iget-object v1, p0, Lo/acg$d;->d:Landroid/bluetooth/BluetoothGatt;

    iget-object v2, p0, Lo/acg$d;->c:Landroid/bluetooth/BluetoothGattCharacteristic;

    iget v3, p0, Lo/acg$d;->a:I

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothGattCallback;->onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V

    .line 288
    :cond_2
    :goto_0
    return-void
.end method
