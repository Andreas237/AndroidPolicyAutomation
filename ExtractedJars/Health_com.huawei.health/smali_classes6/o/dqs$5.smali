.class Lo/dqs$5;
.super Lo/dsw$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dqs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dqs;


# direct methods
.method constructor <init>(Lo/dqs;)V
    .locals 0

    .line 460
    iput-object p1, p0, Lo/dqs$5;->a:Lo/dqs;

    invoke-direct {p0}, Lo/dsw$d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/multisimservice/model/SimInfo;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 481
    const-string v0, "AttachedDeviceManager"

    const-string v1, "WearService start to callback AttachedDeviceManager, downloadESimProfile."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 482
    sget-object v0, Lo/dsc;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 483
    const-string v0, "AttachedDeviceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Download result code="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", profileInfoList="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 485
    :cond_0
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 486
    const-string v0, "resultCode"

    invoke-virtual {v3, v0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 487
    iget-object v0, p0, Lo/dqs$5;->a:Lo/dqs;

    iget-object v1, p0, Lo/dqs$5;->a:Lo/dqs;

    invoke-static {v1}, Lo/dqs;->c(Lo/dqs;)Lo/dqs$b;

    move-result-object v1

    const/4 v2, 0x5

    invoke-static {v0, v1, v2, p2, v3}, Lo/dqs;->a(Lo/dqs;Landroid/os/Handler;ILjava/lang/Object;Landroid/os/Bundle;)V

    .line 488
    return-void
.end method

.method public b(Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 464
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Wear Service start to callback manager, getAttachDeviceMultiSimInfo."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 465
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 466
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 467
    const-string v0, "deviceSimInfo"

    invoke-virtual {v4, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 468
    const-string v0, "AttachedDeviceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Get attached device result code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->getResultCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 470
    :cond_0
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Wear service support device sim info with unknown type."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 471
    new-instance v5, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;

    invoke-direct {v5}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;-><init>()V

    .line 472
    const/4 v0, -0x8

    invoke-virtual {v5, v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->setResultCode(I)V

    .line 473
    const-string v0, "deviceSimInfo"

    invoke-virtual {v4, v0, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 475
    :goto_0
    iget-object v0, p0, Lo/dqs$5;->a:Lo/dqs;

    iget-object v1, p0, Lo/dqs$5;->a:Lo/dqs;

    invoke-static {v1}, Lo/dqs;->c(Lo/dqs;)Lo/dqs$b;

    move-result-object v1

    const/4 v2, 0x7

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dqs;->a(Lo/dqs;Landroid/os/Handler;ILjava/lang/Object;Landroid/os/Bundle;)V

    .line 476
    return-void
.end method

.method public c(I)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 492
    const-string v0, "AttachedDeviceManager"

    const-string v1, "WearService start to callback AttachedDeviceManager, deleteESimProfileNotify."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 493
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 494
    const-string v0, "resultCode"

    invoke-virtual {v4, v0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 495
    iget-object v0, p0, Lo/dqs$5;->a:Lo/dqs;

    iget-object v1, p0, Lo/dqs$5;->a:Lo/dqs;

    invoke-static {v1}, Lo/dqs;->c(Lo/dqs;)Lo/dqs$b;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dqs;->a(Lo/dqs;Landroid/os/Handler;ILjava/lang/Object;Landroid/os/Bundle;)V

    .line 496
    return-void
.end method
