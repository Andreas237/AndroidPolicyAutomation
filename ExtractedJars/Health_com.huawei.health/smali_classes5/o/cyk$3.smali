.class Lo/cyk$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cxz;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cyk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cyk;


# direct methods
.method constructor <init>(Lo/cyk;)V
    .locals 0

    .line 512
    iput-object p1, p0, Lo/cyk$3;->d:Lo/cyk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .line 528
    iget-object v0, p0, Lo/cyk$3;->d:Lo/cyk;

    invoke-static {v0}, Lo/cyk;->k(Lo/cyk;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 529
    iget-object v0, p0, Lo/cyk$3;->d:Lo/cyk;

    iget-object v1, p0, Lo/cyk$3;->d:Lo/cyk;

    invoke-static {v1}, Lo/cyk;->d(Lo/cyk;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    iget-object v2, p0, Lo/cyk$3;->d:Lo/cyk;

    invoke-static {v2}, Lo/cyk;->a(Lo/cyk;)Lo/cxz;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/cyk;->c(Landroid/bluetooth/BluetoothDevice;Lo/cxz;)V

    .line 530
    iget-object v0, p0, Lo/cyk$3;->d:Lo/cyk;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cyk;->e(Lo/cyk;Z)Z

    .line 531
    return-void

    .line 534
    :cond_0
    iget-object v0, p0, Lo/cyk$3;->d:Lo/cyk;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cyk;->e(Lo/cyk;Z)Z

    .line 535
    iget-object v0, p0, Lo/cyk$3;->d:Lo/cyk;

    invoke-virtual {v0}, Lo/cyk;->c()V

    .line 536
    return-void
.end method

.method public a(Landroid/bluetooth/BluetoothDevice;)V
    .locals 4

    .line 519
    iget-object v0, p0, Lo/cyk$3;->d:Lo/cyk;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/cyk;->c(Lo/cyk;IZ)V

    .line 520
    iget-object v0, p0, Lo/cyk$3;->d:Lo/cyk;

    invoke-static {v0}, Lo/cyk;->h(Lo/cyk;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 521
    iput-object p1, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 523
    iget-object v0, p0, Lo/cyk$3;->d:Lo/cyk;

    invoke-static {v0}, Lo/cyk;->h(Lo/cyk;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 524
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 515
    return-void
.end method
