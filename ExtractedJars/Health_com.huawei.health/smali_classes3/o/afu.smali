.class public abstract Lo/afu;
.super Lo/afs;
.source "SourceFile"


# instance fields
.field protected b:Lo/acg;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Lo/afs;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lo/afu;->b:Lo/acg;

    return-void
.end method


# virtual methods
.method public a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z
    .locals 2

    .line 18
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 19
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 21
    :cond_1
    move-object v0, p1

    check-cast v0, Lo/acg;

    iput-object v0, p0, Lo/afu;->b:Lo/acg;

    .line 22
    iget-object v0, p0, Lo/afu;->b:Lo/acg;

    invoke-virtual {p0}, Lo/afu;->c()Landroid/bluetooth/BluetoothGattCallback;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/acg;->c(Landroid/bluetooth/BluetoothGattCallback;)V

    .line 24
    const/4 v0, 0x1

    return v0
.end method

.method protected abstract c()Landroid/bluetooth/BluetoothGattCallback;
.end method

.method public e()V
    .locals 2

    .line 29
    iget-object v0, p0, Lo/afu;->b:Lo/acg;

    if-eqz v0, :cond_0

    .line 30
    iget-object v0, p0, Lo/afu;->b:Lo/acg;

    invoke-virtual {v0}, Lo/acg;->f()V

    .line 32
    iget-object v0, p0, Lo/afu;->b:Lo/acg;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/acg;->c(Landroid/bluetooth/BluetoothGattCallback;)V

    .line 34
    :cond_0
    return-void
.end method
