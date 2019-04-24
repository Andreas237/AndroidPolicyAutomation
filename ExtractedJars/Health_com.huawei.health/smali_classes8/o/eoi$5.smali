.class Lo/eoi$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eoi;->c(Ljava/lang/String;Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Lo/eoi;

.field final synthetic e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;


# direct methods
.method constructor <init>(Lo/eoi;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lo/eoi$5;->d:Lo/eoi;

    iput-object p2, p0, Lo/eoi$5;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    iput-object p3, p0, Lo/eoi$5;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 118
    const/4 v0, 0x0

    if-ne v0, p1, :cond_3

    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    .line 119
    move-object v4, p2

    check-cast v4, Lcom/huawei/datatype/DataDeviceInfo;

    .line 121
    invoke-static {}, Lo/eoi;->a()Lo/cxd;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_soft_version()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxd;->e(Ljava/lang/String;)V

    .line 123
    const-string v0, "WearBIUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mDeviceInfo.DeviceMac = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/eoi;->a()Lo/cxd;

    move-result-object v3

    invoke-virtual {v3}, Lo/cxd;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    const-string v0, "WearBIUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mDeviceInfo.DeviceType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/eoi;->a()Lo/cxd;

    move-result-object v3

    invoke-virtual {v3}, Lo/cxd;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    const-string v0, "WearBIUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mDeviceInfo.DeviceVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/eoi;->a()Lo/cxd;

    move-result-object v3

    invoke-virtual {v3}, Lo/cxd;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    const-string v0, "WearBIUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "dataDeviceInfo.getDevice_sn = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_sn()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    invoke-virtual {v4}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_type()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_0

    .line 129
    invoke-static {}, Lo/eoi;->a()Lo/cxd;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_sn()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxd;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 130
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_type()I

    move-result v0

    const/16 v1, 0xa

    if-ne v1, v0, :cond_2

    .line 131
    iget-object v0, p0, Lo/eoi$5;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 132
    invoke-static {}, Lo/eoi;->a()Lo/cxd;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_sn()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxd;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 134
    :cond_1
    invoke-static {}, Lo/eoi;->a()Lo/cxd;

    move-result-object v0

    iget-object v1, p0, Lo/eoi$5;->e:Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxd;->d(Ljava/lang/String;)V

    .line 137
    :cond_2
    :goto_0
    const-string v0, "WearBIUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setBIAnalyticsData.getDeviceMac = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/eoi;->a()Lo/cxd;

    move-result-object v3

    invoke-virtual {v3}, Lo/cxd;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    invoke-static {}, Lo/eoi;->d()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/eoi;->a()Lo/cxd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxf;->e(Lo/cxd;)V

    .line 140
    :cond_3
    iget-object v0, p0, Lo/eoi$5;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 141
    iget-object v0, p0, Lo/eoi$5;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, p1, p2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 143
    :cond_4
    return-void
.end method
