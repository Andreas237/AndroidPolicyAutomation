.class Lo/eoe$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eoe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eoe;


# direct methods
.method constructor <init>(Lo/eoe;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lo/eoe$2;->c:Lo/eoe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 100
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mGetFirmwareVersionCallback\u56de\u6765\u4e86: err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",objData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    iget-object v0, p0, Lo/eoe$2;->c:Lo/eoe;

    move-object v1, p2

    check-cast v1, Lcom/huawei/datatype/DataDeviceInfo;

    iput-object v1, v0, Lo/eoe;->c:Lcom/huawei/datatype/DataDeviceInfo;

    .line 102
    iget-object v0, p0, Lo/eoe$2;->c:Lo/eoe;

    iget-object v0, v0, Lo/eoe;->c:Lcom/huawei/datatype/DataDeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 103
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mGetFirmwareVersionCallback:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eoe$2;->c:Lo/eoe;

    iget-object v3, v3, Lo/eoe;->c:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v3}, Lcom/huawei/datatype/DataDeviceInfo;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    iget-object v0, p0, Lo/eoe$2;->c:Lo/eoe;

    iget-object v1, p0, Lo/eoe$2;->c:Lo/eoe;

    iget-object v1, v1, Lo/eoe;->c:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_sn()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eoe;->c(Lo/eoe;Ljava/lang/String;)V

    .line 105
    iget-object v0, p0, Lo/eoe$2;->c:Lo/eoe;

    iget-object v1, p0, Lo/eoe$2;->c:Lo/eoe;

    iget-object v1, v1, Lo/eoe;->c:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_emmc_id()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/eoe;->d(Lo/eoe;Ljava/lang/String;)V

    goto :goto_0

    .line 107
    :cond_0
    const-string v0, "HuaweiGoldMemberInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mDataDeviceInfo is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    return-void

    .line 110
    :goto_0
    return-void
.end method
