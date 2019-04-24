.class Lo/eof$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eof$4;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eof$4;


# direct methods
.method constructor <init>(Lo/eof$4;)V
    .locals 0

    .line 396
    iput-object p1, p0, Lo/eof$4$1;->c:Lo/eof$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 10

    .line 399
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getEventAlarm() err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 400
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 401
    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    .line 402
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "generateConnectedMessage messageID = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 403
    new-instance v5, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-direct {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;-><init>()V

    .line 404
    invoke-virtual {v5, v4}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgId(Ljava/lang/String;)V

    .line 405
    const-string v0, "device"

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setModule(Ljava/lang/String;)V

    .line 406
    const-string v0, "device_scale_ota"

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setType(Ljava/lang/String;)V

    .line 407
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgType(I)V

    .line 408
    iget-object v0, p0, Lo/eof$4$1;->c:Lo/eof$4;

    iget v0, v0, Lo/eof$4;->c:I

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setPosition(I)V

    .line 409
    iget-object v0, p0, Lo/eof$4$1;->c:Lo/eof$4;

    iget-object v0, v0, Lo/eof$4;->b:Lo/eof;

    invoke-static {v0}, Lo/eof;->d(Lo/eof;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setHuid(Ljava/lang/String;)V

    .line 410
    iget-object v0, p0, Lo/eof$4$1;->c:Lo/eof$4;

    iget-object v0, v0, Lo/eof$4;->b:Lo/eof;

    invoke-static {v0}, Lo/eof;->d(Lo/eof;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_messagecenter_device_need_upgrade_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 411
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lo/eof$4$1;->c:Lo/eof$4;

    iget-object v1, v1, Lo/eof$4;->b:Lo/eof;

    invoke-virtual {v1}, Lo/eof;->p()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 413
    invoke-virtual {v5, v6}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgTitle(Ljava/lang/String;)V

    .line 414
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "generateConnectedMessage mstTitle = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 416
    const-string v7, ""

    .line 417
    invoke-virtual {v5, v7}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgContent(Ljava/lang/String;)V

    .line 418
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "generateConnectedMessage mstContent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 419
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 420
    invoke-virtual {v5, v8, v9}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setCreateTime(J)V

    .line 421
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "messagecenter://device_scale_ota?key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/eof$4$1;->c:Lo/eof$4;

    iget-object v1, v1, Lo/eof$4;->b:Lo/eof;

    invoke-static {v1}, Lo/eof;->e(Lo/eof;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setDetailUri(Ljava/lang/String;)V

    .line 422
    iget-object v0, p0, Lo/eof$4$1;->c:Lo/eof$4;

    iget-object v0, v0, Lo/eof$4;->e:Lo/eaa;

    invoke-virtual {v0, v5}, Lo/eaa;->a(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    .line 424
    iget-object v0, p0, Lo/eof$4$1;->c:Lo/eof$4;

    iget v0, v0, Lo/eof$4;->c:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 425
    iget-object v0, p0, Lo/eof$4$1;->c:Lo/eof$4;

    iget-object v0, v0, Lo/eof$4;->b:Lo/eof;

    invoke-static {v0}, Lo/eof;->b(Lo/eof;)V

    .line 427
    :cond_0
    const-string v0, "WeightUpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateConnectedMessage leave"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    :cond_1
    return-void
.end method
