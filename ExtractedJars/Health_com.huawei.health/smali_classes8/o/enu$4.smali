.class Lo/enu$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/enu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/enu;


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 164
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBandSoftVersion mFirmwareVersionCallback err_code = "

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

    .line 165
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 166
    iget-object v0, p0, Lo/enu$4;->e:Lo/enu;

    move-object v1, p2

    check-cast v1, Lcom/huawei/datatype/DataDeviceInfo;

    invoke-static {v0, v1}, Lo/enu;->a(Lo/enu;Lcom/huawei/datatype/DataDeviceInfo;)Lcom/huawei/datatype/DataDeviceInfo;

    .line 167
    iget-object v0, p0, Lo/enu$4;->e:Lo/enu;

    invoke-static {v0}, Lo/enu;->c(Lo/enu;)Lcom/huawei/datatype/DataDeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 168
    iget-object v0, p0, Lo/enu$4;->e:Lo/enu;

    iget-object v1, p0, Lo/enu$4;->e:Lo/enu;

    invoke-static {v1}, Lo/enu;->c(Lo/enu;)Lcom/huawei/datatype/DataDeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_soft_version()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/enu;->a:Ljava/lang/String;

    .line 169
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBandSoftVersion mFirmwareVersionCallback deviceSoftVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/enu$4;->e:Lo/enu;

    iget-object v3, v3, Lo/enu;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    iget-object v0, p0, Lo/enu$4;->e:Lo/enu;

    iget-object v1, p0, Lo/enu$4;->e:Lo/enu;

    iget-object v1, v1, Lo/enu;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/enu;->e(Ljava/lang/String;)V

    .line 173
    :cond_0
    return-void
.end method
