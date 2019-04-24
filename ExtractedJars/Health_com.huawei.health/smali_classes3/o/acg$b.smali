.class Lo/acg$b;
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
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:Landroid/bluetooth/BluetoothGattDescriptor;

.field private d:Landroid/bluetooth/BluetoothGatt;

.field final synthetic e:Lo/acg;


# direct methods
.method public constructor <init>(Lo/acg;ILandroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 0

    .line 298
    iput-object p1, p0, Lo/acg$b;->e:Lo/acg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 299
    iput p2, p0, Lo/acg$b;->a:I

    .line 300
    iput-object p3, p0, Lo/acg$b;->d:Landroid/bluetooth/BluetoothGatt;

    .line 301
    iput-object p4, p0, Lo/acg$b;->c:Landroid/bluetooth/BluetoothGattDescriptor;

    .line 302
    iput p5, p0, Lo/acg$b;->b:I

    .line 303
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 307
    iget-object v0, p0, Lo/acg$b;->e:Lo/acg;

    invoke-static {v0}, Lo/acg;->e(Lo/acg;)Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 308
    iget v0, p0, Lo/acg$b;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 309
    iget-object v0, p0, Lo/acg$b;->e:Lo/acg;

    invoke-static {v0}, Lo/acg;->e(Lo/acg;)Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v0

    iget-object v1, p0, Lo/acg$b;->d:Landroid/bluetooth/BluetoothGatt;

    iget-object v2, p0, Lo/acg$b;->c:Landroid/bluetooth/BluetoothGattDescriptor;

    iget v3, p0, Lo/acg$b;->b:I

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    goto :goto_0

    .line 310
    :cond_0
    iget v0, p0, Lo/acg$b;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 311
    iget-object v0, p0, Lo/acg$b;->e:Lo/acg;

    invoke-static {v0}, Lo/acg;->e(Lo/acg;)Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v0

    iget-object v1, p0, Lo/acg$b;->d:Landroid/bluetooth/BluetoothGatt;

    iget-object v2, p0, Lo/acg$b;->c:Landroid/bluetooth/BluetoothGattDescriptor;

    iget v3, p0, Lo/acg$b;->b:I

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothGattCallback;->onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V

    .line 314
    :cond_1
    :goto_0
    return-void
.end method
