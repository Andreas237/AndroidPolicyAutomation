.class Lo/enu$6;
.super Lo/djw$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/enu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/enu;


# direct methods
.method constructor <init>(Lo/enu;)V
    .locals 0

    .line 580
    iput-object p1, p0, Lo/enu$6;->d:Lo/enu;

    invoke-direct {p0}, Lo/djw$d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 583
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    invoke-static {v0, p1}, Lo/enu;->b(Lo/enu;I)I

    .line 584
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    invoke-static {v0}, Lo/enu;->e(Lo/enu;)Lo/djw$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 585
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFileTransferState,null != mOTACallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 586
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    invoke-static {v0}, Lo/enu;->e(Lo/enu;)Lo/djw$d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/djw$d;->b(I)V

    goto :goto_0

    .line 588
    :cond_0
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFileTransferState,null == mOTACallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 590
    :goto_0
    return-void
.end method

.method public e(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 608
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/enu;->b(Lo/enu;I)I

    .line 609
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    const/16 v1, 0xc

    iput v1, v0, Lo/enu;->c:I

    .line 610
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    invoke-static {v0}, Lo/enu;->k(Lo/enu;)V

    .line 611
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    invoke-static {v0}, Lo/enu;->g(Lo/enu;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 612
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    invoke-static {v0}, Lo/enu;->g(Lo/enu;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xa

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 614
    :cond_0
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    invoke-static {v0, p1}, Lo/enu;->c(Lo/enu;I)I

    .line 615
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    invoke-static {v0}, Lo/enu;->i(Lo/enu;)V

    .line 616
    if-eqz p1, :cond_1

    .line 617
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/enu;->a(Ljava/lang/Boolean;)V

    goto :goto_0

    .line 619
    :cond_1
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/enu;->a(Ljava/lang/Boolean;)V

    .line 621
    :goto_0
    return-void
.end method

.method public e(ILjava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 594
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/enu;->b(Lo/enu;I)I

    .line 595
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/enu;->d(Ljava/lang/Boolean;)V

    .line 596
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    invoke-static {v0}, Lo/enu;->i(Lo/enu;)V

    .line 597
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/enu;->a(Ljava/lang/Boolean;)V

    .line 598
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    invoke-static {v0}, Lo/enu;->e(Lo/enu;)Lo/djw$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 599
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgradeFailed,null != mOTACallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 600
    iget-object v0, p0, Lo/enu$6;->d:Lo/enu;

    invoke-static {v0}, Lo/enu;->e(Lo/enu;)Lo/djw$d;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/djw$d;->e(ILjava/lang/String;)V

    goto :goto_0

    .line 602
    :cond_0
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpgradeFailed,null == mOTACallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 604
    :goto_0
    return-void
.end method
