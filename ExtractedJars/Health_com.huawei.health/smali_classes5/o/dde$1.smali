.class Lo/dde$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dde;->J()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dde;

.field final synthetic e:Ljava/util/List;


# direct methods
.method constructor <init>(Lo/dde;Ljava/util/List;)V
    .locals 0

    .line 3541
    iput-object p1, p0, Lo/dde$1;->c:Lo/dde;

    iput-object p2, p0, Lo/dde$1;->e:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 3544
    move-object v4, p2

    check-cast v4, Ljava/util/List;

    .line 3545
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 3546
    new-instance v5, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    invoke-direct {v5}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;-><init>()V

    .line 3547
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3549
    :cond_0
    iget-object v0, p0, Lo/dde$1;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 3550
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3551
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v7

    .line 3552
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isAvoid_disturb()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3553
    iget-object v0, p0, Lo/dde$1;->c:Lo/dde;

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/dde$1;->c:Lo/dde;

    invoke-static {v2}, Lo/dde;->b(Lo/dde;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/dde;->e(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_1

    .line 3555
    :cond_1
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() not Support Avoid_disturb"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3558
    :cond_2
    :goto_1
    goto :goto_0

    .line 3559
    :cond_3
    return-void
.end method
