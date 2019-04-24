.class Lo/dde$5;
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
.field final synthetic a:Ljava/util/List;

.field final synthetic e:Lo/dde;


# direct methods
.method constructor <init>(Lo/dde;Ljava/util/List;)V
    .locals 0

    .line 3512
    iput-object p1, p0, Lo/dde$5;->e:Lo/dde;

    iput-object p2, p0, Lo/dde$5;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 3515
    const/4 v4, 0x1

    .line 3516
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 3517
    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    .line 3518
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 3519
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 3520
    const/4 v0, 0x1

    if-ne v0, v6, :cond_0

    .line 3521
    const/4 v4, 0x1

    goto :goto_0

    .line 3523
    :cond_0
    const/4 v4, 0x0

    .line 3527
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/dde$5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 3528
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 3529
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v7

    .line 3530
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isAuto_light_screen()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3531
    iget-object v0, p0, Lo/dde$5;->e:Lo/dde;

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/dde$5;->e:Lo/dde;

    invoke-static {v2}, Lo/dde;->b(Lo/dde;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/dde;->d(Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_2

    .line 3533
    :cond_2
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() not Support Auto_light_screen"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3536
    :cond_3
    :goto_2
    goto :goto_1

    .line 3537
    :cond_4
    return-void
.end method
