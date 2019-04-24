.class Lo/eob$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eob;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eob;


# direct methods
.method constructor <init>(Lo/eob;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lo/eob$1;->c:Lo/eob;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 204
    const-string v0, "UpdateInteractors"

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

    .line 205
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 206
    iget-object v0, p0, Lo/eob$1;->c:Lo/eob;

    move-object v1, p2

    check-cast v1, Lcom/huawei/datatype/DataDeviceInfo;

    iput-object v1, v0, Lo/eob;->b:Lcom/huawei/datatype/DataDeviceInfo;

    .line 207
    iget-object v0, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v0, v0, Lo/eob;->b:Lcom/huawei/datatype/DataDeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 208
    iget-object v0, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v1, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v1, v1, Lo/eob;->b:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_type()I

    move-result v1

    iput v1, v0, Lo/eob;->k:I

    .line 209
    iget-object v0, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v1, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v1, v1, Lo/eob;->b:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_soft_version()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/eob;->i:Ljava/lang/String;

    .line 210
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mFirmwareVersionCallback deviceType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eob$1;->c:Lo/eob;

    iget v3, v3, Lo/eob;->k:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mFirmwareVersionCallback deviceSoftVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v3, v3, Lo/eob;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    iget-object v0, p0, Lo/eob$1;->c:Lo/eob;

    invoke-static {v0}, Lo/eob;->d(Lo/eob;)Lo/dde;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 213
    iget-object v0, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v1, p0, Lo/eob$1;->c:Lo/eob;

    invoke-static {v1}, Lo/eob;->c(Lo/eob;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eob;->e(Lo/eob;Lo/dde;)Lo/dde;

    .line 215
    :cond_0
    iget-object v0, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v1, p0, Lo/eob$1;->c:Lo/eob;

    invoke-static {v1}, Lo/eob;->d(Lo/eob;)Lo/dde;

    move-result-object v1

    invoke-virtual {v1}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v1

    iput-object v1, v0, Lo/eob;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 216
    iget-object v0, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v0, v0, Lo/eob;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 217
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceInfo is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    return-void

    .line 220
    :cond_1
    iget-object v0, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v1, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v1, v1, Lo/eob;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/eob;->h:Ljava/lang/String;

    .line 221
    iget-object v0, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v1, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v1, v1, Lo/eob;->f:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eob;->e(Lo/eob;Ljava/lang/String;)Ljava/lang/String;

    .line 222
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mFirmwareVersionCallback deviceBtMac = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v4, v4, Lo/eob;->h:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    iget-object v0, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v1, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v1, v1, Lo/eob;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eob;->b(Ljava/lang/String;)V

    .line 224
    iget-object v0, p0, Lo/eob$1;->c:Lo/eob;

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lo/eob;->c(Ljava/lang/String;ZZ)V

    .line 225
    iget-object v0, p0, Lo/eob$1;->c:Lo/eob;

    invoke-static {v0}, Lo/eob;->b(Lo/eob;)Lo/dpb;

    move-result-object v0

    iget-object v1, p0, Lo/eob$1;->c:Lo/eob;

    iget v1, v1, Lo/eob;->k:I

    iget-object v2, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v2, v2, Lo/eob;->i:Ljava/lang/String;

    iget-object v3, p0, Lo/eob$1;->c:Lo/eob;

    iget-object v3, v3, Lo/eob;->h:Ljava/lang/String;

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dpb;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 228
    :cond_2
    return-void
.end method
