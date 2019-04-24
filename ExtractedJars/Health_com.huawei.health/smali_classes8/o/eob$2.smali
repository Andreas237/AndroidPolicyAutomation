.class Lo/eob$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eob;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/eob;


# direct methods
.method constructor <init>(Lo/eob;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lo/eob$2;->d:Lo/eob;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 177
    const-string v0, "UpdateInteractors"

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

    .line 178
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 179
    iget-object v0, p0, Lo/eob$2;->d:Lo/eob;

    move-object v1, p2

    check-cast v1, Lcom/huawei/datatype/DataDeviceInfo;

    iput-object v1, v0, Lo/eob;->b:Lcom/huawei/datatype/DataDeviceInfo;

    .line 180
    iget-object v0, p0, Lo/eob$2;->d:Lo/eob;

    iget-object v0, v0, Lo/eob;->b:Lcom/huawei/datatype/DataDeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 181
    iget-object v0, p0, Lo/eob$2;->d:Lo/eob;

    iget-object v1, p0, Lo/eob$2;->d:Lo/eob;

    iget-object v1, v1, Lo/eob;->b:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_soft_version()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/eob;->i:Ljava/lang/String;

    .line 182
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBandSoftVersion mFirmwareVersionCallback deviceSoftVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eob$2;->d:Lo/eob;

    iget-object v3, v3, Lo/eob;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    iget-object v0, p0, Lo/eob$2;->d:Lo/eob;

    iget-object v1, p0, Lo/eob$2;->d:Lo/eob;

    iget-object v1, v1, Lo/eob;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eob;->b(Ljava/lang/String;)V

    .line 186
    :cond_0
    return-void
.end method
