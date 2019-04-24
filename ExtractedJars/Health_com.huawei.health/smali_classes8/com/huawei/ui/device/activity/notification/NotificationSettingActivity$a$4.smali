.class Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;I)V
    .locals 0

    .line 768
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    iput p2, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 13

    .line 772
    iget v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->b:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->c(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 773
    return-void

    .line 775
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->c(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/din;

    .line 776
    const-string v0, "03"

    const-string v1, "NotificationSettingActivity"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getView() "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onCheckedChanged-----position: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->b:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " Checked : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " AppName : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 777
    invoke-virtual {v6}, Lo/din;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " PkgName: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v6}, Lo/din;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " AuthorizeFlag: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v6}, Lo/din;->c()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 776
    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 778
    if-eqz p2, :cond_1

    const/4 v7, 0x1

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    .line 779
    :goto_0
    invoke-virtual {v6}, Lo/din;->c()I

    move-result v0

    if-eq v7, v0, :cond_2

    .line 780
    invoke-virtual {v6, v7}, Lo/din;->c(I)V

    .line 782
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lo/eoa;

    move-result-object v0

    invoke-virtual {v6}, Lo/din;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v7}, Lo/eoa;->e(Ljava/lang/String;I)V

    .line 784
    new-instance v8, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.ACTION_NOTIFICATION_AUTHORIZED_CHANGED"

    invoke-direct {v8, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 785
    const-string v0, "package_name"

    invoke-virtual {v6}, Lo/din;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 786
    const-string v0, "authorized_flag"

    invoke-virtual {v8, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 787
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->o(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 789
    :cond_2
    const-string v0, "com.tencent.mm"

    invoke-virtual {v6}, Lo/din;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "com.android.mms"

    .line 790
    invoke-virtual {v6}, Lo/din;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "com.tencent.mobileqq"

    .line 791
    invoke-virtual {v6}, Lo/din;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "com.tencent.mqq"

    .line 792
    invoke-virtual {v6}, Lo/din;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 794
    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2711

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG"

    const-string v3, "true"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 796
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "set ture :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    iget-object v3, v3, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/content/Context;

    move-result-object v3

    const/16 v4, 0x2711

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG"

    invoke-static {v3, v4, v5}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 798
    :cond_4
    const-string v0, "com.huawei.intelligent"

    invoke-virtual {v6}, Lo/din;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 799
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2711

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG_ADD"

    const-string v3, "true"

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 801
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->t(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    iget-object v0, v0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->t(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMidware()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 802
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    iget-object v1, v1, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->a(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Lo/eoa;

    move-result-object v1

    invoke-virtual {v1}, Lo/eoa;->c()Z

    move-result v1

    invoke-virtual {v0, v1, p2}, Lo/dip;->c(ZZ)V

    .line 804
    :cond_5
    const-string v0, "NotificationSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "set ture :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    iget-object v3, v3, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/content/Context;

    move-result-object v3

    const/16 v4, 0x2711

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG_ADD"

    invoke-static {v3, v4, v5}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 807
    :cond_6
    const-string v8, ""

    .line 808
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v9

    .line 809
    const/4 v0, 0x0

    if-eq v0, v9, :cond_7

    .line 810
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dda;->c(ILjava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    .line 812
    :cond_7
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 813
    invoke-static {}, Lo/dbf;->d()Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v11, 0x1

    goto :goto_1

    :cond_8
    const/4 v11, 0x0

    .line 814
    :goto_1
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 815
    const-string v0, "appName"

    invoke-virtual {v6}, Lo/din;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 816
    const-string v0, "isEMUI"

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 817
    const-string v0, "deviceName"

    invoke-interface {v10, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 818
    const-string v0, "status"

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v10, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 819
    sget-object v0, Lo/dae;->iY:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v12

    .line 820
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a$4;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;

    iget-object v1, v1, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity$a;->d:Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;->d(Lcom/huawei/ui/device/activity/notification/NotificationSettingActivity;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v12, v10, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 821
    return-void
.end method
