.class Lo/acg$k;
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
    name = "k"
.end annotation


# instance fields
.field private a:I

.field final synthetic c:Lo/acg;

.field private d:Landroid/bluetooth/BluetoothGatt;


# direct methods
.method public constructor <init>(Lo/acg;Landroid/bluetooth/BluetoothGatt;I)V
    .locals 0

    .line 320
    iput-object p1, p0, Lo/acg$k;->c:Lo/acg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 321
    iput-object p2, p0, Lo/acg$k;->d:Landroid/bluetooth/BluetoothGatt;

    .line 322
    iput p3, p0, Lo/acg$k;->a:I

    .line 323
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 327
    iget-object v0, p0, Lo/acg$k;->c:Lo/acg;

    invoke-static {v0}, Lo/acg;->e(Lo/acg;)Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 328
    iget-object v0, p0, Lo/acg$k;->c:Lo/acg;

    invoke-static {v0}, Lo/acg;->e(Lo/acg;)Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v0

    iget-object v1, p0, Lo/acg$k;->d:Landroid/bluetooth/BluetoothGatt;

    iget v2, p0, Lo/acg$k;->a:I

    invoke-virtual {v0, v1, v2}, Landroid/bluetooth/BluetoothGattCallback;->onReliableWriteCompleted(Landroid/bluetooth/BluetoothGatt;I)V

    .line 330
    :cond_0
    return-void
.end method
