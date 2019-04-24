.class Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V
    .locals 0

    .line 340
    iput-object p1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 343
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    move-object v1, p2

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;Ljava/util/List;)Ljava/util/List;

    .line 344
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData() getAvoidDisturb objData"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->g(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->g(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 346
    :cond_0
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData() if (list == null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 347
    new-instance v4, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    invoke-direct {v4}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;-><init>()V

    .line 348
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;Ljava/util/List;)Ljava/util/List;

    .line 349
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->g(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 352
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->h(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V

    .line 355
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->g(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->e(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;)Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    .line 356
    const-string v0, "NoDisturbSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData() mDataDeviceAvoidDisturbInfo="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->o(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->o(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_start_time()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->c(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;I)I

    .line 358
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->o(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/datatype/DataDeviceAvoidDisturbInfo;->getDevice_avoid_disturb_end_time()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;I)I

    .line 359
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->p(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V

    .line 365
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->m(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 366
    const/4 v0, 0x4

    iput v0, v4, Landroid/os/Message;->what:I

    .line 367
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$2;->e:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->m(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 369
    return-void
.end method
