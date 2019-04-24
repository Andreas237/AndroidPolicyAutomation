.class Lo/enu$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/enu;->d()V
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

    .line 228
    iput-object p1, p0, Lo/enu$5;->d:Lo/enu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 231
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mFirmwareVersionCallback err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",objData:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 233
    iget-object v0, p0, Lo/enu$5;->d:Lo/enu;

    move-object v1, p2

    check-cast v1, Lcom/huawei/datatype/DataDeviceInfo;

    invoke-static {v0, v1}, Lo/enu;->a(Lo/enu;Lcom/huawei/datatype/DataDeviceInfo;)Lcom/huawei/datatype/DataDeviceInfo;

    .line 234
    iget-object v0, p0, Lo/enu$5;->d:Lo/enu;

    invoke-static {v0}, Lo/enu;->c(Lo/enu;)Lcom/huawei/datatype/DataDeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 235
    iget-object v0, p0, Lo/enu$5;->d:Lo/enu;

    iget-object v1, p0, Lo/enu$5;->d:Lo/enu;

    invoke-static {v1}, Lo/enu;->c(Lo/enu;)Lcom/huawei/datatype/DataDeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_type()I

    move-result v1

    iput v1, v0, Lo/enu;->b:I

    .line 236
    iget-object v0, p0, Lo/enu$5;->d:Lo/enu;

    iget-object v1, p0, Lo/enu$5;->d:Lo/enu;

    invoke-static {v1}, Lo/enu;->c(Lo/enu;)Lcom/huawei/datatype/DataDeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_soft_version()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/enu;->a:Ljava/lang/String;

    .line 237
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mFirmwareVersionCallback deviceType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/enu$5;->d:Lo/enu;

    iget v3, v3, Lo/enu;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mFirmwareVersionCallback deviceSoftVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/enu$5;->d:Lo/enu;

    iget-object v3, v3, Lo/enu;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    iget-object v0, p0, Lo/enu$5;->d:Lo/enu;

    invoke-static {v0}, Lo/enu;->a(Lo/enu;)Lo/dde;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 240
    iget-object v0, p0, Lo/enu$5;->d:Lo/enu;

    iget-object v1, p0, Lo/enu$5;->d:Lo/enu;

    invoke-static {v1}, Lo/enu;->d(Lo/enu;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v1

    invoke-static {v0, v1}, Lo/enu;->d(Lo/enu;Lo/dde;)Lo/dde;

    .line 242
    :cond_0
    iget-object v0, p0, Lo/enu$5;->d:Lo/enu;

    iget-object v1, p0, Lo/enu$5;->d:Lo/enu;

    invoke-static {v1}, Lo/enu;->a(Lo/enu;)Lo/dde;

    move-result-object v1

    invoke-virtual {v1}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    iput-object v1, v0, Lo/enu;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 243
    iget-object v0, p0, Lo/enu$5;->d:Lo/enu;

    iget-object v0, v0, Lo/enu;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 244
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceInfo is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    return-void

    .line 247
    :cond_1
    iget-object v0, p0, Lo/enu$5;->d:Lo/enu;

    iget-object v1, p0, Lo/enu$5;->d:Lo/enu;

    iget-object v1, v1, Lo/enu;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/enu;->d:Ljava/lang/String;

    .line 248
    iget-object v0, p0, Lo/enu$5;->d:Lo/enu;

    iget-object v1, p0, Lo/enu$5;->d:Lo/enu;

    iget-object v1, v1, Lo/enu;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/enu;->e(Lo/enu;Ljava/lang/String;)Ljava/lang/String;

    .line 249
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mFirmwareVersionCallback deviceBtMac = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lo/enu$5;->d:Lo/enu;

    iget-object v4, v4, Lo/enu;->d:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    iget-object v0, p0, Lo/enu$5;->d:Lo/enu;

    iget-object v1, p0, Lo/enu$5;->d:Lo/enu;

    iget-object v1, v1, Lo/enu;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enu;->e(Ljava/lang/String;)V

    .line 252
    iget-object v0, p0, Lo/enu$5;->d:Lo/enu;

    invoke-static {v0}, Lo/enu;->b(Lo/enu;)Lo/dpa;

    move-result-object v0

    iget-object v1, p0, Lo/enu$5;->d:Lo/enu;

    iget v1, v1, Lo/enu;->b:I

    iget-object v2, p0, Lo/enu$5;->d:Lo/enu;

    iget-object v2, v2, Lo/enu;->a:Ljava/lang/String;

    iget-object v3, p0, Lo/enu$5;->d:Lo/enu;

    iget-object v3, v3, Lo/enu;->d:Ljava/lang/String;

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dpa;->d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 255
    :cond_2
    return-void
.end method
