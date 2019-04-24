.class Lo/eob$6$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eob$6;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eob$6;


# direct methods
.method constructor <init>(Lo/eob$6;)V
    .locals 0

    .line 731
    iput-object p1, p0, Lo/eob$6$3;->a:Lo/eob$6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 12

    .line 734
    const-string v0, "UpdateInteractors"

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

    .line 735
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 736
    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    .line 737
    const-string v0, "UpdateInteractors"

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

    .line 738
    new-instance v5, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-direct {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;-><init>()V

    .line 739
    invoke-virtual {v5, v4}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgId(Ljava/lang/String;)V

    .line 740
    const-string v0, "device"

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setModule(Ljava/lang/String;)V

    .line 741
    const-string v0, "device_ota"

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setType(Ljava/lang/String;)V

    .line 742
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgType(I)V

    .line 743
    iget-object v0, p0, Lo/eob$6$3;->a:Lo/eob$6;

    iget v0, v0, Lo/eob$6;->b:I

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setPosition(I)V

    .line 744
    iget-object v0, p0, Lo/eob$6$3;->a:Lo/eob$6;

    iget-object v0, v0, Lo/eob$6;->e:Lo/eob;

    invoke-static {v0}, Lo/eob;->c(Lo/eob;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setHuid(Ljava/lang/String;)V

    .line 745
    iget-object v0, p0, Lo/eob$6$3;->a:Lo/eob$6;

    iget-object v0, v0, Lo/eob$6;->e:Lo/eob;

    invoke-static {v0}, Lo/eob;->c(Lo/eob;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$string;->IDS_messagecenter_device_need_upgrade_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 746
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lo/eob$6$3;->a:Lo/eob$6;

    iget-object v1, v1, Lo/eob$6;->e:Lo/eob;

    iget-object v1, v1, Lo/eob;->g:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 748
    invoke-virtual {v5, v6}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgTitle(Ljava/lang/String;)V

    .line 749
    const-string v0, "UpdateInteractors"

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

    .line 751
    const-string v7, ""

    .line 752
    invoke-virtual {v5, v7}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgContent(Ljava/lang/String;)V

    .line 753
    const-string v0, "UpdateInteractors"

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

    .line 754
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 755
    invoke-virtual {v5, v8, v9}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setCreateTime(J)V

    .line 756
    iget-object v0, p0, Lo/eob$6$3;->a:Lo/eob$6;

    iget-object v0, v0, Lo/eob$6;->e:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->l()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v10

    .line 757
    const-string v11, ""

    .line 758
    const/4 v0, 0x0

    if-eq v0, v10, :cond_0

    .line 759
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateConnectedMessage identify = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 760
    invoke-virtual {v10}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v11

    .line 762
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "messagecenter://device_ota?key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setDetailUri(Ljava/lang/String;)V

    .line 763
    iget-object v0, p0, Lo/eob$6$3;->a:Lo/eob$6;

    iget-object v0, v0, Lo/eob$6;->e:Lo/eob;

    iget v0, v0, Lo/eob;->k:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 766
    :sswitch_0
    const-string v0, "assets://localMessageIcon/ic_watch_update.png"

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setImgUri(Ljava/lang/String;)V

    .line 767
    goto :goto_1

    .line 769
    :goto_0
    const-string v0, "assets://localMessageIcon/ic_band_update.png"

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setImgUri(Ljava/lang/String;)V

    .line 772
    :goto_1
    iget-object v0, p0, Lo/eob$6$3;->a:Lo/eob$6;

    iget-object v0, v0, Lo/eob$6;->c:Lo/eaa;

    invoke-virtual {v0, v5}, Lo/eaa;->a(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    .line 773
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateConnectedMessage leave"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 775
    :cond_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
    .end sparse-switch
.end method
