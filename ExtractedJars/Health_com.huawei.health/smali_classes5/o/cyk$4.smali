.class Lo/cyk$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cyk;->c(Landroid/bluetooth/BluetoothDevice;Lo/cxz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cyk;

.field final synthetic c:Landroid/bluetooth/BluetoothDevice;

.field final synthetic e:Lo/cxz;


# direct methods
.method constructor <init>(Lo/cyk;Landroid/bluetooth/BluetoothDevice;Lo/cxz;)V
    .locals 0

    .line 359
    iput-object p1, p0, Lo/cyk$4;->b:Lo/cyk;

    iput-object p2, p0, Lo/cyk$4;->c:Landroid/bluetooth/BluetoothDevice;

    iput-object p3, p0, Lo/cyk$4;->e:Lo/cxz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 361
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    iget-object v1, p0, Lo/cyk$4;->c:Landroid/bluetooth/BluetoothDevice;

    iget-object v2, p0, Lo/cyk$4;->e:Lo/cxz;

    invoke-virtual {v0, v1, v2}, Lo/cxk;->c(Landroid/bluetooth/BluetoothDevice;Lo/cxz;)Z

    move-result v5

    .line 362
    iget-object v0, p0, Lo/cyk$4;->b:Lo/cyk;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cyk;->e(Lo/cyk;Z)Z

    .line 363
    if-nez v5, :cond_0

    .line 365
    iget-object v0, p0, Lo/cyk$4;->b:Lo/cyk;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cyk;->e(Lo/cyk;Z)Z

    .line 366
    iget-object v0, p0, Lo/cyk$4;->b:Lo/cyk;

    invoke-virtual {v0}, Lo/cyk;->c()V

    .line 368
    :cond_0
    const-string v0, "01"

    const-string v1, "BLEAuthenticManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "pairDevice() postDelayed, result = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " pairDeviceFlag = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyk$4;->b:Lo/cyk;

    invoke-static {v4}, Lo/cyk;->k(Lo/cyk;)Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 369
    return-void
.end method
