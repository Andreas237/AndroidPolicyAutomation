.class Lo/dde$6$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dde$6;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dde$6;

.field final synthetic c:Ljava/util/List;


# direct methods
.method constructor <init>(Lo/dde$6;Ljava/util/List;)V
    .locals 0

    .line 3997
    iput-object p1, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iput-object p2, p0, Lo/dde$6$5;->c:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 4000
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/dde$6$5;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 4001
    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->d:Lo/eaa;

    iget-object v1, p0, Lo/dde$6$5;->c:Ljava/util/List;

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    invoke-virtual {v1}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eaa;->i(Ljava/lang/String;)Z

    .line 4000
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 4003
    :cond_0
    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, -0x2

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 4004
    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 4005
    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 4006
    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, 0x4

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 4007
    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 4008
    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0x9

    if-ne v1, v0, :cond_2

    .line 4009
    :cond_1
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateConnectedMessage, W1,B1,AF500 don\'t need generate message..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4010
    return-void

    .line 4014
    :cond_2
    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->c:Lo/dde;

    const-string v1, "kStorage_DeviceCfgMgr_Identify"

    invoke-virtual {v0, v1}, Lo/dde;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 4015
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "generateConnectedMessage, getDeviceIdentify() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v4, v4, Lo/dde$6;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ", getSharedPreference deviceIdentify = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v3, v5}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4016
    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 4017
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateConnectedMessage, same device, don\'t need generate message..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4018
    return-void

    .line 4020
    :cond_3
    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->c:Lo/dde;

    const-string v1, "double_device_connect"

    invoke-virtual {v0, v1}, Lo/dde;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 4021
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "%"

    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 4022
    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->c:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->c:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 4023
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Connect the same device in last two devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4024
    return-void

    .line 4025
    :cond_4
    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->c:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->c:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 4026
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Connect the same device in last two devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4027
    return-void

    .line 4029
    :cond_5
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Not connect the same device in last two devices"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4032
    :cond_6
    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->c:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->c:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 4034
    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->c:Lo/dde;

    const-string v1, "double_device_connect"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v3, v3, Lo/dde$6;->c:Lo/dde;

    invoke-virtual {v3}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "%"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v3, v3, Lo/dde$6;->c:Lo/dde;

    invoke-virtual {v3}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dde;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 4038
    :cond_7
    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->c:Lo/dde;

    const-string v1, "kStorage_DeviceCfgMgr_Identify"

    iget-object v2, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v2, v2, Lo/dde$6;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dde;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 4040
    iget-object v0, p0, Lo/dde$6$5;->b:Lo/dde$6;

    iget-object v0, v0, Lo/dde$6;->d:Lo/eaa;

    const-string v1, "device"

    const-string v2, "device_type_connected"

    new-instance v3, Lo/dde$6$5$3;

    invoke-direct {v3, p0}, Lo/dde$6$5$3;-><init>(Lo/dde$6$5;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/eaa;->e(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 4088
    return-void
.end method
