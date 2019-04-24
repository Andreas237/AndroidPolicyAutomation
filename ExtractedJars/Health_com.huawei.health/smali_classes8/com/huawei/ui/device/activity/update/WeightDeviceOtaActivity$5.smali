.class Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/abx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V
    .locals 0

    .line 278
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataChanged(Lo/acl;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/acl;Ljava/util/List<Lo/afz;>;)V"
        }
    .end annotation

    .line 288
    return-void
.end method

.method public onDataChanged(Lo/acl;Lo/afz;)V
    .locals 0

    .line 283
    return-void
.end method

.method public onFailed(Lo/acl;I)V
    .locals 0

    .line 334
    return-void
.end method

.method public onProgressChanged(Lo/acl;Lo/afz;)V
    .locals 0

    .line 293
    return-void
.end method

.method public onStatusChanged(Lo/acl;I)V
    .locals 4

    .line 297
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 298
    return-void

    .line 300
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onStatusChanged "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lo/acl;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", status: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    const/4 v0, 0x3

    if-ne v0, p2, :cond_3

    .line 302
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lo/eof;

    move-result-object v0

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lo/eof;

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    .line 303
    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lo/eof;

    move-result-object v0

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lo/eof;

    const/16 v1, 0xe

    if-ne v0, v1, :cond_2

    .line 304
    :cond_1
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no show fail view"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 306
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 307
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->a(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;Z)Z

    .line 308
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    move-result-object v0

    const/16 v1, 0x3ef

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 311
    :cond_3
    const/4 v0, 0x2

    if-ne v0, p2, :cond_6

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->a(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;Z)Z

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lo/eof;

    move-result-object v0

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lo/eof;

    const/16 v1, 0xc

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    .line 314
    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lo/eof;

    move-result-object v0

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lo/eof;

    const/16 v1, 0xe

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    .line 315
    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lo/eof;

    move-result-object v0

    iget v0, v0, Lo/eof;->f:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lo/eof;

    const/16 v1, 0xb

    if-ne v0, v1, :cond_5

    .line 317
    :cond_4
    const-string v0, "DeviceOtaActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no startTransferOtaFile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 319
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->i(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$e;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->e(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)Lo/eof;

    move-result-object v0

    invoke-virtual {v0}, Lo/eof;->c()Z

    move-result v0

    if-nez v0, :cond_8

    .line 320
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->h(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;)V

    goto :goto_0

    .line 323
    :cond_6
    const/16 v0, 0xe

    if-ne v0, p2, :cond_7

    .line 324
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;Z)Z

    goto :goto_0

    .line 325
    :cond_7
    const/16 v0, 0xd

    if-ne v0, p2, :cond_8

    .line 326
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity$5;->b:Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;->c(Lcom/huawei/ui/device/activity/update/WeightDeviceOtaActivity;Z)Z

    .line 329
    :cond_8
    :goto_0
    return-void
.end method
