.class Lo/dde$25;
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
.field final synthetic a:Lo/dde;

.field final synthetic b:Ljava/util/List;


# direct methods
.method constructor <init>(Lo/dde;Ljava/util/List;)V
    .locals 0

    .line 3479
    iput-object p1, p0, Lo/dde$25;->a:Lo/dde;

    iput-object p2, p0, Lo/dde$25;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 8

    .line 3482
    const/4 v4, 0x0

    .line 3483
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 3484
    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    .line 3485
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 3487
    :try_start_0
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    .line 3488
    const/4 v0, 0x1

    if-ne v0, v6, :cond_0

    .line 3489
    const/4 v4, 0x1

    goto :goto_0

    .line 3491
    :cond_0
    const/4 v4, 0x0

    .line 3495
    :goto_0
    goto :goto_1

    .line 3493
    :catch_0
    move-exception v6

    .line 3494
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3499
    :cond_1
    :goto_1
    iget-object v0, p0, Lo/dde$25;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 3500
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 3501
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v7

    .line 3502
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isRotate_switch_screen()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3503
    iget-object v0, p0, Lo/dde$25;->a:Lo/dde;

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/dde$25;->a:Lo/dde;

    invoke-static {v2}, Lo/dde;->b(Lo/dde;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/dde;->a(Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_3

    .line 3505
    :cond_2
    const-string v0, "HWDeviceConfigManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "autoSendCommend() not Support Rotate_switch_screen"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3508
    :cond_3
    :goto_3
    goto :goto_2

    .line 3509
    :cond_4
    return-void
.end method
