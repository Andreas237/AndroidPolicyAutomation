.class Lo/acg$g;
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
    name = "g"
.end annotation


# instance fields
.field private a:I

.field final synthetic b:Lo/acg;

.field private e:Landroid/bluetooth/BluetoothGatt;


# direct methods
.method public constructor <init>(Lo/acg;Landroid/bluetooth/BluetoothGatt;I)V
    .locals 0

    .line 247
    iput-object p1, p0, Lo/acg$g;->b:Lo/acg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 248
    iput-object p2, p0, Lo/acg$g;->e:Landroid/bluetooth/BluetoothGatt;

    .line 249
    iput p3, p0, Lo/acg$g;->a:I

    .line 250
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 254
    iget-object v0, p0, Lo/acg$g;->b:Lo/acg;

    invoke-static {v0}, Lo/acg;->e(Lo/acg;)Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 255
    iget-object v0, p0, Lo/acg$g;->b:Lo/acg;

    invoke-static {v0}, Lo/acg;->e(Lo/acg;)Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v0

    iget-object v1, p0, Lo/acg$g;->e:Landroid/bluetooth/BluetoothGatt;

    iget v2, p0, Lo/acg$g;->a:I

    invoke-virtual {v0, v1, v2}, Landroid/bluetooth/BluetoothGattCallback;->onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V

    .line 257
    :cond_0
    return-void
.end method
