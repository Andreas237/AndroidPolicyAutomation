.class Lo/dde$6$5$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dde$6$5;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dde$6$5;


# direct methods
.method constructor <init>(Lo/dde$6$5;)V
    .locals 0

    .line 4040
    iput-object p1, p0, Lo/dde$6$5$3;->d:Lo/dde$6$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 13

    .line 4043
    const/4 v0, 0x0

    if-ne v0, p1, :cond_3

    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 4044
    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    .line 4045
    const-string v0, "HWDeviceConfigManager"

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

    .line 4046
    new-instance v5, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-direct {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;-><init>()V

    .line 4047
    invoke-virtual {v5, v4}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgId(Ljava/lang/String;)V

    .line 4048
    const-string v0, "device"

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setModule(Ljava/lang/String;)V

    .line 4049
    const-string v0, "device_type_connected"

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setType(Ljava/lang/String;)V

    .line 4050
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgType(I)V

    .line 4051
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setPosition(I)V

    .line 4052
    const/16 v0, 0xb

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgPosition(I)V

    .line 4053
    iget-object v0, p0, Lo/dde$6$5$3;->d:Lo/dde$6$5;

    iget-object v0, v0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->c:Lo/dde;

    invoke-static {v0}, Lo/dde;->f(Lo/dde;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/util/SharedPreferenceUtil;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setHuid(Ljava/lang/String;)V

    .line 4054
    iget-object v0, p0, Lo/dde$6$5$3;->d:Lo/dde$6$5;

    iget-object v0, v0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->c:Lo/dde;

    invoke-static {v0}, Lo/dde;->f(Lo/dde;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/hwdevicemgr/R$string;->IDS_messagecenter_device_bind_success_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 4055
    iget-object v0, p0, Lo/dde$6$5$3;->d:Lo/dde$6$5;

    iget-object v0, v0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v7

    .line 4056
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4057
    iget-object v0, p0, Lo/dde$6$5$3;->d:Lo/dde$6$5;

    iget-object v0, v0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->c:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 4058
    iget-object v0, p0, Lo/dde$6$5$3;->d:Lo/dde$6$5;

    iget-object v0, v0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->c:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v7

    .line 4061
    :cond_0
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4062
    const-string v7, ""

    .line 4064
    :cond_1
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object v7, v0, v1

    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 4066
    invoke-virtual {v5, v6}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgTitle(Ljava/lang/String;)V

    .line 4067
    const-string v0, "HWDeviceConfigManager"

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

    .line 4069
    const-string v8, ""

    .line 4070
    invoke-virtual {v5, v8}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setMsgContent(Ljava/lang/String;)V

    .line 4071
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "generateConnectedMessage mstContent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4072
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 4073
    const-wide/32 v11, 0x5265c00

    .line 4074
    invoke-virtual {v5, v9, v10}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setCreateTime(J)V

    .line 4075
    add-long v0, v9, v11

    invoke-virtual {v5, v0, v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setExpireTime(J)V

    .line 4076
    iget-object v0, p0, Lo/dde$6$5$3;->d:Lo/dde$6$5;

    iget-object v0, v0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4077
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "messagecenter://aw70_device_guide?key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dde$6$5$3;->d:Lo/dde$6$5;

    iget-object v1, v1, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v1, v1, Lo/dde$6;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setDetailUri(Ljava/lang/String;)V

    goto :goto_0

    .line 4079
    :cond_2
    const-string v0, "messagecenter://device_guide"

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setDetailUri(Ljava/lang/String;)V

    .line 4081
    :goto_0
    const-string v0, "assets://localMessageIcon/ic_band_connected.webp"

    invoke-virtual {v5, v0}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->setImgUri(Ljava/lang/String;)V

    .line 4082
    iget-object v0, p0, Lo/dde$6$5$3;->d:Lo/dde$6$5;

    iget-object v0, v0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->d:Lo/eaa;

    invoke-virtual {v0, v5}, Lo/eaa;->a(Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)Z

    .line 4083
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateConnectedMessage leave"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4085
    :cond_3
    return-void
.end method
