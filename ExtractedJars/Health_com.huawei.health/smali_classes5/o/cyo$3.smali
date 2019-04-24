.class Lo/cyo$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cxz;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cyo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cyo;


# direct methods
.method constructor <init>(Lo/cyo;)V
    .locals 0

    .line 451
    iput-object p1, p0, Lo/cyo$3;->c:Lo/cyo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4

    .line 476
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BTDeviceBRService"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " btDevice pair fail, so connect btDevice fail."

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    const v0, 0xf4629

    invoke-static {v0}, Lo/cyc;->e(I)V

    .line 478
    iget-object v0, p0, Lo/cyo$3;->c:Lo/cyo;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/cyo;->d(I)V

    .line 479
    return-void
.end method

.method public a(Landroid/bluetooth/BluetoothDevice;)V
    .locals 5

    .line 459
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "btDevice paired."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 460
    iget-object v0, p0, Lo/cyo$3;->c:Lo/cyo;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cyo;->d(Lo/cyo;Z)Z

    .line 462
    iget-object v0, p0, Lo/cyo$3;->c:Lo/cyo;

    invoke-static {v0}, Lo/cyo;->c(Lo/cyo;)Lo/cxk;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cxk;->e(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 463
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Need to connect hfp profile."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 464
    iget-object v0, p0, Lo/cyo$3;->c:Lo/cyo;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cyo;->d(Lo/cyo;Z)Z

    .line 465
    iget-object v0, p0, Lo/cyo$3;->c:Lo/cyo;

    invoke-static {v0}, Lo/cyo;->c(Lo/cyo;)Lo/cxk;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cxk;->c(Landroid/bluetooth/BluetoothDevice;)Z

    .line 469
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceBRService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to connect btDevice."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 470
    iget-object v0, p0, Lo/cyo$3;->c:Lo/cyo;

    invoke-static {v0, p1}, Lo/cyo;->e(Lo/cyo;Landroid/bluetooth/BluetoothDevice;)V

    .line 471
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 455
    return-void
.end method
