.class Lo/acg$a;
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
    name = "a"
.end annotation


# instance fields
.field private a:I

.field final synthetic b:Lo/acg;

.field private c:I

.field private d:Landroid/bluetooth/BluetoothGatt;


# direct methods
.method public constructor <init>(Lo/acg;Landroid/bluetooth/BluetoothGatt;II)V
    .locals 0

    .line 337
    iput-object p1, p0, Lo/acg$a;->b:Lo/acg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 338
    iput-object p2, p0, Lo/acg$a;->d:Landroid/bluetooth/BluetoothGatt;

    .line 339
    iput p3, p0, Lo/acg$a;->c:I

    .line 340
    iput p4, p0, Lo/acg$a;->a:I

    .line 341
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 345
    iget-object v0, p0, Lo/acg$a;->b:Lo/acg;

    invoke-static {v0}, Lo/acg;->e(Lo/acg;)Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 346
    iget-object v0, p0, Lo/acg$a;->b:Lo/acg;

    invoke-static {v0}, Lo/acg;->e(Lo/acg;)Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v0

    iget-object v1, p0, Lo/acg$a;->d:Landroid/bluetooth/BluetoothGatt;

    iget v2, p0, Lo/acg$a;->c:I

    iget v3, p0, Lo/acg$a;->a:I

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothGattCallback;->onReadRemoteRssi(Landroid/bluetooth/BluetoothGatt;II)V

    .line 348
    :cond_0
    return-void
.end method
