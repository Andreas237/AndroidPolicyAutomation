.class Lo/eob$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eob;->e()V
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

    .line 288
    iput-object p1, p0, Lo/eob$10;->c:Lo/eob;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 291
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

    .line 292
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 293
    iget-object v0, p0, Lo/eob$10;->c:Lo/eob;

    move-object v1, p2

    check-cast v1, Lcom/huawei/datatype/DataDeviceInfo;

    iput-object v1, v0, Lo/eob;->b:Lcom/huawei/datatype/DataDeviceInfo;

    .line 294
    iget-object v0, p0, Lo/eob$10;->c:Lo/eob;

    iget-object v0, v0, Lo/eob;->b:Lcom/huawei/datatype/DataDeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 295
    iget-object v0, p0, Lo/eob$10;->c:Lo/eob;

    iget-object v1, p0, Lo/eob$10;->c:Lo/eob;

    iget-object v1, v1, Lo/eob;->b:Lcom/huawei/datatype/DataDeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_soft_version()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lo/eob;->i:Ljava/lang/String;

    .line 296
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doManualCheckDeviceNewVersion callback deviceSoftVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/eob$10;->c:Lo/eob;

    iget-object v3, v3, Lo/eob;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    iget-object v0, p0, Lo/eob$10;->c:Lo/eob;

    invoke-static {v0}, Lo/eob;->b(Lo/eob;)Lo/dpb;

    move-result-object v0

    iget-object v1, p0, Lo/eob$10;->c:Lo/eob;

    iget v1, v1, Lo/eob;->k:I

    iget-object v2, p0, Lo/eob$10;->c:Lo/eob;

    iget-object v2, v2, Lo/eob;->i:Ljava/lang/String;

    iget-object v3, p0, Lo/eob$10;->c:Lo/eob;

    iget-object v3, v3, Lo/eob;->h:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/dpb;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    goto :goto_0

    .line 300
    :cond_0
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "failed to get soft version!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    new-instance v5, Landroid/content/Intent;

    const-string v0, "action_app_check_new_version_state"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 302
    const/high16 v0, 0x60000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 303
    const-string v0, "result"

    const/4 v1, 0x3

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 304
    const-string v0, "state"

    const/16 v1, 0xb

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 305
    iget-object v0, p0, Lo/eob$10;->c:Lo/eob;

    invoke-static {v0}, Lo/eob;->c(Lo/eob;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 307
    :cond_1
    :goto_0
    return-void
.end method
