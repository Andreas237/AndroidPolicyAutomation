.class Lo/cys$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cya;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cys;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cys;


# direct methods
.method constructor <init>(Lo/cys;)V
    .locals 0

    .line 422
    iput-object p1, p0, Lo/cys$2;->b:Lo/cys;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 430
    const-string v0, "01"

    const-string v1, "BTSDKApi"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "onDeviceDiscoveryFinished"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 432
    iget-object v0, p0, Lo/cys$2;->b:Lo/cys;

    invoke-static {v0}, Lo/cys;->e(Lo/cys;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 433
    iget-object v0, p0, Lo/cys$2;->b:Lo/cys;

    invoke-static {v0}, Lo/cys;->e(Lo/cys;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 435
    :cond_0
    return-void
.end method

.method public a(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 1

    .line 425
    iget-object v0, p0, Lo/cys$2;->b:Lo/cys;

    invoke-static {v0, p1}, Lo/cys;->d(Lo/cys;Landroid/bluetooth/BluetoothDevice;)V

    .line 426
    return-void
.end method

.method public e()V
    .locals 0

    .line 439
    return-void
.end method
