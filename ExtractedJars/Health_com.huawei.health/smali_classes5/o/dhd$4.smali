.class Lo/dhd$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dhd;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dhd;


# direct methods
.method constructor <init>(Lo/dhd;)V
    .locals 0

    .line 310
    iput-object p1, p0, Lo/dhd$4;->b:Lo/dhd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 9

    .line 313
    const/4 v4, 0x0

    .line 314
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 315
    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    .line 316
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 317
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    .line 318
    const/4 v0, 0x1

    if-ne v0, v6, :cond_0

    .line 319
    const/4 v4, 0x1

    .line 323
    :cond_0
    iget-object v0, p0, Lo/dhd$4;->b:Lo/dhd;

    invoke-static {v0}, Lo/dhd;->c(Lo/dhd;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->a()Ljava/util/List;

    move-result-object v5

    .line 324
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 325
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 326
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 327
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v8

    .line 328
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isBluetooth_off_alert()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 329
    const-string v0, "HWLinkLossAlarmManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "autoSendCommend() flag = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    iget-object v0, p0, Lo/dhd$4;->b:Lo/dhd;

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/dhd$4;->b:Lo/dhd;

    invoke-static {v2}, Lo/dhd;->a(Lo/dhd;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v2

    invoke-virtual {v0, v1, v4, v2}, Lo/dhd;->e(Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 333
    :cond_1
    goto :goto_0

    .line 335
    :cond_2
    return-void
.end method
