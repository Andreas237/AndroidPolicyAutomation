.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "DeviceListAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private ani:Landroid/graphics/drawable/AnimationDrawable;

.field private customTextAlertDialog:Lo/egv;

.field private groupList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/afa;>;"
        }
    .end annotation
.end field

.field private isConnecting:Z

.field private mContext:Landroid/content/Context;

.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;Ljava/util/ArrayList;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afa;>;Landroid/content/Context;)V"
        }
    .end annotation

    .line 627
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 602
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->groupList:Ljava/util/ArrayList;

    .line 608
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->isConnecting:Z

    .line 1045
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->customTextAlertDialog:Lo/egv;

    .line 628
    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->groupList:Ljava/util/ArrayList;

    .line 629
    iput-object p3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    .line 630
    return-void
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;)Z
    .locals 1

    .line 600
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->isConnecting:Z

    return v0
.end method

.method static synthetic access$1100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;Lo/ahh;)V
    .locals 0

    .line 600
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->onclickReconnect(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;Lo/ahh;)V

    return-void
.end method

.method static synthetic access$1400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;)Landroid/content/Context;
    .locals 1

    .line 600
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method private creatAlertDialog(Ljava/lang/String;)V
    .locals 4

    .line 1047
    new-instance v0, Lo/egv$b;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_can_not_connect:I

    .line 1048
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 1049
    invoke-virtual {v0, p1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    .line 1050
    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->c(Ljava/lang/Boolean;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_common_notification_know_tips:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;)V

    .line 1051
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 1060
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->customTextAlertDialog:Lo/egv;

    .line 1061
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->customTextAlertDialog:Lo/egv;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 1062
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->customTextAlertDialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 1063
    return-void
.end method

.method private getImageIcon(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1137
    const-string v4, ""

    .line 1138
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getImageIcon() kind = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1139
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const-string v0, "HDK_WEIGHT"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1140
    const-string v4, "ic_list_balance"

    goto :goto_0

    .line 1142
    :cond_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    const-string v0, "HDK_BLOOD_SUGAR"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1143
    const-string v4, "ic_list_blood_glucose_meter"

    goto :goto_0

    .line 1145
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    const-string v0, "HDK_BLOOD_PRESSURE"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1146
    const-string v4, "ic_list_blood_pressure"

    goto :goto_0

    .line 1148
    :cond_2
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    const-string v0, "HDK_HEART_RATE"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1149
    const-string v4, "ic_list_heart_rate"

    .line 1151
    :cond_3
    :goto_0
    return-object v4
.end method

.method private handleWorkMode(Lo/ahh;)V
    .locals 7

    .line 958
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->d()Ljava/util/List;

    move-result-object v4

    .line 959
    if-nez v4, :cond_0

    .line 960
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode, mDeviceInfoList = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 961
    return-void

    .line 963
    :cond_0
    invoke-virtual {p1}, Lo/ahh;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 964
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode goingConnected == DeviceWorkMode.RUN_WORK_MODE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 965
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 966
    invoke-virtual {p1}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 967
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode set device enable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 968
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 969
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 971
    :cond_1
    invoke-virtual {p1}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 972
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 973
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 974
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode target device disable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 975
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 976
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 978
    :cond_2
    goto :goto_0

    :cond_3
    goto/16 :goto_2

    .line 980
    :cond_4
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode goingConnected == DeviceWorkMode.BAND_MODE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 981
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 982
    invoke-virtual {p1}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 983
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode set device enable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 984
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 985
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 987
    :cond_5
    invoke-virtual {p1}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 988
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    .line 989
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    .line 990
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode target device disable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 991
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 992
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 994
    :cond_6
    goto :goto_1

    .line 995
    :cond_7
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->k()V

    .line 998
    :goto_2
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ahg;->a(Ljava/util/List;)V

    .line 999
    return-void
.end method

.method private initReconnect(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;Lo/ahh;)V
    .locals 4

    .line 884
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initReconnect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 885
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearConnectText:Landroid/widget/TextView;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->home_track_starget_value_color_whole_alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 886
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearReconnectLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 887
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearReconnectLayout:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;Lo/ahh;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 943
    return-void
.end method

.method private onclickReconnect(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;Lo/ahh;)V
    .locals 2

    .line 947
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {p2}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ahg;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 949
    :cond_0
    invoke-direct {p0, p2, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->startReconnect(Lo/ahh;Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;)V

    goto :goto_0

    .line 952
    :cond_1
    invoke-direct {p0, p2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->handleWorkMode(Lo/ahh;)V

    .line 953
    invoke-direct {p0, p2, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->startReconnect(Lo/ahh;Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;)V

    .line 955
    :goto_0
    return-void
.end method

.method private showAlertDialogB3()V
    .locals 11

    .line 1101
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1102
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1103
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_press_restart4:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 1104
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1105
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1106
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 1107
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 1108
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1109
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->creatAlertDialog(Ljava/lang/String;)V

    .line 1111
    return-void
.end method

.method private showAlertDialogB5()V
    .locals 11

    .line 1089
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1090
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1091
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_press_restart3:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 1092
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1093
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1094
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 1095
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 1096
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1097
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->creatAlertDialog(Ljava/lang/String;)V

    .line 1099
    return-void
.end method

.method private showAlertDialogCrius()V
    .locals 11

    .line 1113
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1114
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1115
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_press_restart2:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 1116
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1117
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1118
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 1119
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 1120
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1121
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->creatAlertDialog(Ljava/lang/String;)V

    .line 1122
    return-void
.end method

.method private showAlertDialogS1()V
    .locals 11

    .line 1125
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1126
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1127
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_press_restart5:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 1128
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1129
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1130
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 1131
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 1132
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1133
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->creatAlertDialog(Ljava/lang/String;)V

    .line 1134
    return-void
.end method

.method private showAlertDialogTalos()V
    .locals 11

    .line 1077
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1078
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1079
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_press_restart1:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 1080
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_restart_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v6, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1081
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1082
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 1083
    new-instance v10, Ljava/lang/StringBuffer;

    invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V

    .line 1084
    invoke-virtual {v10, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1085
    invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->creatAlertDialog(Ljava/lang/String;)V

    .line 1087
    return-void
.end method

.method private showDefualtAlertDialog()V
    .locals 9

    .line 1066
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter showAlertDialog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1067
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_repair_device:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1068
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u2022 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_open_bluetooth:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 1069
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_mgr_pair_note_avivable_ways:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 1070
    new-instance v8, Ljava/lang/StringBuffer;

    invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V

    .line 1071
    invoke-virtual {v8, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1072
    invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->creatAlertDialog(Ljava/lang/String;)V

    .line 1073
    return-void
.end method

.method private startReconnect(Lo/ahh;Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;)V
    .locals 5

    .line 1003
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)I

    move-result v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    .line 1004
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "reconnectCount < 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1005
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-virtual {p1}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1502(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 1006
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->setConnecting(Z)V

    .line 1007
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$onItemReconnectListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$onItemReconnectListener;->onReconnect(Lo/ahh;)V

    .line 1008
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->setConnecting(Z)V

    .line 1009
    iget-object v0, p2, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearReconnectLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1010
    iget-object v0, p2, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearLoadingLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1011
    iget-object v0, p2, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearLoadingImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->hw_health_loading:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1012
    invoke-virtual {p0, p2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->startLoading(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;)V

    .line 1013
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$908(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)I

    goto/16 :goto_2

    .line 1016
    :cond_0
    invoke-virtual {p1}, Lo/ahh;->b()I

    move-result v4

    .line 1017
    packed-switch v4, :pswitch_data_0

    goto :goto_0

    .line 1020
    :pswitch_0
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->showAlertDialogTalos()V

    .line 1021
    goto :goto_1

    .line 1024
    :pswitch_1
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->showAlertDialogCrius()V

    .line 1025
    goto :goto_1

    .line 1027
    :pswitch_2
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->showAlertDialogS1()V

    .line 1028
    goto :goto_1

    .line 1030
    :pswitch_3
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->showAlertDialogB5()V

    .line 1031
    goto :goto_1

    .line 1034
    :pswitch_4
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->showAlertDialogB3()V

    .line 1035
    goto :goto_1

    .line 1037
    :goto_0
    :pswitch_5
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->showDefualtAlertDialog()V

    .line 1041
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$902(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;I)I

    .line 1043
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_4
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private updataGroup(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;Lo/afa;)V
    .locals 15

    .line 757
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->line:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RelativeLayout$LayoutParams;

    .line 758
    sget v0, Lcom/huawei/plugindevice/R$id;->device_detail_layout:I

    const/16 v1, 0x12

    invoke-virtual {v4, v1, v0}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 759
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->line:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 761
    invoke-virtual/range {p2 .. p2}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 762
    const-string v5, ""

    .line 763
    const-string v6, ""

    .line 764
    invoke-virtual/range {p2 .. p2}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/afk;

    .line 765
    iget-object v5, v7, Lo/afk;->c:Ljava/lang/String;

    .line 766
    invoke-virtual {v7}, Lo/afk;->b()Lo/acl$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->getImageIcon(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 768
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->groupContentTv:Landroid/widget/TextView;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v5}, Lo/afo;->c(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 769
    invoke-static {v6}, Lo/afo;->d(Ljava/lang/String;)I

    move-result v8

    .line 770
    new-instance v9, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v9}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 771
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v0, v9, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 772
    const/4 v0, 0x1

    iput-boolean v0, v9, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    .line 773
    const/4 v0, 0x1

    iput-boolean v0, v9, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    .line 774
    const/4 v10, 0x0

    .line 777
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    move-object v10, v0

    .line 778
    const/4 v0, 0x0

    invoke-static {v10, v0, v9}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v11

    .line 779
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->groupLeftIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, v11}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 780
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->groupLeftIcon:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 785
    const/4 v0, 0x0

    if-eq v0, v10, :cond_0

    .line 786
    :try_start_1
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 790
    :cond_0
    goto/16 :goto_1

    .line 788
    :catch_0
    move-exception v12

    .line 789
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBindingFragment DeviceListAdapter updataGroup IOException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 791
    goto/16 :goto_1

    .line 781
    :catch_1
    move-exception v12

    .line 782
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBindingFragment DeviceListAdapter updataGroup Exception:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 785
    const/4 v0, 0x0

    if-eq v0, v10, :cond_1

    .line 786
    :try_start_3
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 790
    :cond_1
    goto :goto_1

    .line 788
    :catch_2
    move-exception v12

    .line 789
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBindingFragment DeviceListAdapter updataGroup IOException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 791
    goto :goto_1

    .line 784
    :catchall_0
    move-exception v13

    .line 785
    const/4 v0, 0x0

    if-eq v0, v10, :cond_2

    .line 786
    :try_start_4
    invoke-virtual {v10}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 790
    :cond_2
    goto :goto_0

    .line 788
    :catch_3
    move-exception v14

    .line 789
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceBindingFragment DeviceListAdapter updataGroup IOException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 791
    :goto_0
    throw v13

    .line 792
    :goto_1
    goto :goto_2

    .line 794
    :cond_3
    invoke-virtual/range {p2 .. p2}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 795
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " \u7a7f\u6234\u8bbe\u5907\u5904\u7406"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 796
    invoke-virtual/range {p2 .. p2}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/aez;

    .line 797
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->groupContentTv:Landroid/widget/TextView;

    invoke-virtual {v5}, Lo/aez;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 798
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->groupLeftIcon:Landroid/widget/ImageView;

    invoke-virtual {v5}, Lo/aez;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 799
    move-object/from16 v0, p1

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->groupLeftIcon:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 801
    :cond_4
    :goto_2
    return-void
.end method

.method private updataProduct(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;Lo/afa;)V
    .locals 5

    .line 743
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->productReLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 745
    invoke-virtual {p2}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 746
    invoke-virtual {p2}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/afj;

    .line 747
    invoke-virtual {v4}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 748
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->productContentTv:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lo/afj;->n()Lo/afj$a;

    move-result-object v2

    iget-object v2, v2, Lo/afj$a;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Lo/afj;->n()Lo/afj$a;

    move-result-object v2

    iget-object v2, v2, Lo/afj$a;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 749
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->productDeviceIcon:Landroid/widget/ImageView;

    invoke-virtual {v4}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->b:Ljava/lang/String;

    invoke-static {v1}, Lo/afo;->d(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 751
    :cond_0
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->productContentTv:Landroid/widget/TextView;

    invoke-virtual {v4}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Lo/afj;->n()Lo/afj$a;

    move-result-object v2

    iget-object v2, v2, Lo/afj$a;->c:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 752
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->productDeviceIcon:Landroid/widget/ImageView;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v1

    invoke-virtual {v4}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4}, Lo/afj;->n()Lo/afj$a;

    move-result-object v3

    iget-object v3, v3, Lo/afj$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 755
    :cond_1
    :goto_0
    return-void
.end method

.method private updataWear(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;Lo/afa;)V
    .locals 11

    .line 803
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter updataWear"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 804
    invoke-virtual {p2}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ahh;

    .line 805
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearDeviceName:Landroid/widget/TextView;

    invoke-virtual {v5}, Lo/ahh;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 807
    invoke-virtual {v5}, Lo/ahh;->b()I

    move-result v6

    .line 808
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/ahg;->d(I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 809
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is plugin download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 811
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/ahg;->c(I)Ljava/lang/String;

    move-result-object v7

    .line 812
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download uuid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 813
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/eaw;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v8

    .line 814
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download pluginAvaiable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 815
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 816
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v9

    .line 817
    if-eqz v9, :cond_0

    .line 818
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download img:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lo/eav;->d()Lo/ean;

    move-result-object v3

    invoke-virtual {v3}, Lo/ean;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 819
    new-instance v10, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v9}, Lo/eav;->d()Lo/ean;

    move-result-object v1

    invoke-virtual {v1}, Lo/ean;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v9, v1}, Lo/eaw;->d(Lo/eav;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {v10, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 820
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearDeviceImg:Landroid/widget/ImageView;

    invoke-virtual {v0, v10}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 821
    goto :goto_0

    .line 822
    :cond_0
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/ahg;->k(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 824
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearDeviceImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->device_icon_band_default:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 826
    :cond_1
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearDeviceImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->device_icon_watch_default:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 829
    :goto_0
    goto :goto_1

    .line 830
    :cond_2
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/ahg;->k(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 832
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearDeviceImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->device_icon_band_default:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 834
    :cond_3
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearDeviceImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->device_icon_watch_default:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 837
    :goto_1
    goto :goto_2

    .line 838
    :cond_4
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearDeviceImg:Landroid/widget/ImageView;

    invoke-virtual {v5}, Lo/ahh;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 840
    :goto_2
    invoke-virtual {v5}, Lo/ahh;->e()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    .line 842
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearStatetext:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_myfitnesspal_login:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 843
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearStateimg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->ic_bluetooth_connected_new:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 844
    invoke-virtual {v5}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dke;->b(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_5

    .line 845
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearBatteryLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 846
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->produckWearBattery:Landroid/widget/TextView;

    invoke-virtual {v5}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/dke;->b(Ljava/lang/String;)I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 847
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->produckWearBatteryImg:Landroid/widget/ImageView;

    invoke-virtual {v5}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/dke;->b(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lo/ene;->d(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_3

    .line 849
    :cond_5
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearBatteryLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 853
    :goto_3
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearReconnectLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 854
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearLoadingLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 855
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$902(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;I)I

    goto/16 :goto_4

    .line 856
    :cond_6
    invoke-virtual {v5}, Lo/ahh;->e()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    .line 857
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearStatetext:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_myfitnesspal_logout:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 858
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearStateimg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->ic_bluetooth_close_new:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 859
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearBatteryLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 861
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearReconnectLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 862
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearLoadingLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 863
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearLoadingImg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->hw_health_loading:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 864
    invoke-virtual {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->startLoading(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;)V

    goto :goto_4

    .line 866
    :cond_7
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearStatetext:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_myfitnesspal_logout:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 867
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearStateimg:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->ic_bluetooth_close_new:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 868
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearBatteryLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 870
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearReconnectLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 871
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearLoadingLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 872
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->isConnecting:Z

    if-nez v0, :cond_8

    .line 873
    invoke-direct {p0, p1, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->initReconnect(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;Lo/ahh;)V

    goto :goto_4

    .line 876
    :cond_8
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearConnectText:Landroid/widget/TextView;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$color;->common_black_20alpha:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 877
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearReconnectLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 881
    :goto_4
    return-void
.end method


# virtual methods
.method public getConnecting()Z
    .locals 1

    .line 613
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->isConnecting:Z

    return v0
.end method

.method public getCount()I
    .locals 1

    .line 635
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 641
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 647
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 652
    const/4 v4, 0x0

    .line 653
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 654
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$1;)V

    .line 655
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$layout;->my_device_bind_list:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 657
    sget v0, Lcom/huawei/plugindevice/R$id;->device_list_view_title_ll:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->titleLayout:Landroid/widget/LinearLayout;

    .line 658
    sget v0, Lcom/huawei/plugindevice/R$id;->device_list_view_title:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->title:Landroid/widget/TextView;

    .line 660
    sget v0, Lcom/huawei/plugindevice/R$id;->arrow_right_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->groupArrowIcon:Landroid/widget/ImageView;

    .line 661
    sget v0, Lcom/huawei/plugindevice/R$id;->tv_device_content:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->groupContentTv:Landroid/widget/TextView;

    .line 662
    sget v0, Lcom/huawei/plugindevice/R$id;->iv_device_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->groupLeftIcon:Landroid/widget/ImageView;

    .line 663
    sget v0, Lcom/huawei/plugindevice/R$id;->device_list_view_item:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->groupItemLayout:Landroid/widget/RelativeLayout;

    .line 665
    sget v0, Lcom/huawei/plugindevice/R$id;->bind_item_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->productItemLayout:Landroid/widget/RelativeLayout;

    .line 667
    sget v0, Lcom/huawei/plugindevice/R$id;->product_info_text:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->productContentTv:Landroid/widget/TextView;

    .line 669
    sget v0, Lcom/huawei/plugindevice/R$id;->iv_bind_device_icon_rl:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->productReLayout:Landroid/widget/RelativeLayout;

    .line 670
    sget v0, Lcom/huawei/plugindevice/R$id;->iv_device_icon_bind:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->productDeviceIcon:Landroid/widget/ImageView;

    .line 672
    sget v0, Lcom/huawei/plugindevice/R$id;->device_bind_wear_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearReLayout:Landroid/widget/RelativeLayout;

    .line 675
    sget v0, Lcom/huawei/plugindevice/R$id;->device_bind_wear_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearDeviceName:Landroid/widget/TextView;

    .line 676
    sget v0, Lcom/huawei/plugindevice/R$id;->device_bind_wear_left_img:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearDeviceImg:Landroid/widget/ImageView;

    .line 677
    sget v0, Lcom/huawei/plugindevice/R$id;->device_manager_on_device_connect_states_text:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearStatetext:Landroid/widget/TextView;

    .line 678
    sget v0, Lcom/huawei/plugindevice/R$id;->device_manager_on_device_connect_states_iv:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearStateimg:Landroid/widget/ImageView;

    .line 679
    sget v0, Lcom/huawei/plugindevice/R$id;->device_manager_on_device_battery_level_rl:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearBatteryLayout:Landroid/widget/RelativeLayout;

    .line 680
    sget v0, Lcom/huawei/plugindevice/R$id;->device_bind_wear_battery_level_tv:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->produckWearBattery:Landroid/widget/TextView;

    .line 681
    sget v0, Lcom/huawei/plugindevice/R$id;->device_bind_wear_battery_level_img:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->produckWearBatteryImg:Landroid/widget/ImageView;

    .line 684
    sget v0, Lcom/huawei/plugindevice/R$id;->reconnect_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearReconnectLayout:Landroid/widget/RelativeLayout;

    .line 685
    sget v0, Lcom/huawei/plugindevice/R$id;->reconnect_text:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearConnectText:Landroid/widget/TextView;

    .line 686
    sget v0, Lcom/huawei/plugindevice/R$id;->reconnect_loading_layout:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearLoadingLayout:Landroid/widget/LinearLayout;

    .line 687
    sget v0, Lcom/huawei/plugindevice/R$id;->reconnect_loading_img:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearLoadingImg:Landroid/widget/ImageView;

    .line 688
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_show_main_layout_sport_bottom_image_interval:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->line:Landroid/widget/ImageView;

    .line 689
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 690
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->groupArrowIcon:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 693
    :cond_0
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->groupArrowIcon:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->arrow_right_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 696
    :goto_0
    invoke-virtual {p2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 697
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceListAdapter getView convertView == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 699
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;

    .line 702
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_2

    .line 703
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->line:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 705
    :cond_2
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->line:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 707
    :goto_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 708
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->groupItemLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 709
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->productItemLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 710
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->titleLayout:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 711
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearReLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 712
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->title:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/afa;

    invoke-virtual {v1}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 713
    return-object p2

    .line 715
    :cond_3
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->titleLayout:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 717
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/afk;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/aez;

    if-eqz v0, :cond_5

    .line 718
    :cond_4
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->groupItemLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 719
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->productItemLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 720
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearReLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 721
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-direct {p0, v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->updataGroup(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;Lo/afa;)V

    goto/16 :goto_3

    .line 722
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/afj;

    if-eqz v0, :cond_6

    .line 723
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->groupItemLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 724
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->productItemLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 725
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearReLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 726
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-direct {p0, v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->updataProduct(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;Lo/afa;)V

    goto :goto_3

    .line 729
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lo/ahh;

    if-eqz v0, :cond_7

    .line 730
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wear initview()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 731
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearReLayout:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 732
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->groupItemLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 733
    iget-object v0, v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->productItemLayout:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 734
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-direct {p0, v4, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->updataWear(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;Lo/afa;)V

    goto :goto_3

    .line 737
    :cond_7
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Data type is error :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->groupList:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afa;

    invoke-virtual {v2}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 739
    :goto_3
    return-object p2
.end method

.method public setConnecting(Z)V
    .locals 0

    .line 610
    iput-boolean p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->isConnecting:Z

    .line 611
    return-void
.end method

.method public setOnItemReconnectListener(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$onItemReconnectListener;)V
    .locals 1

    .line 606
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$702(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$onItemReconnectListener;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$onItemReconnectListener;

    .line 607
    return-void
.end method

.method public startLoading(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;)V
    .locals 1

    .line 623
    iget-object v0, p1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;->wearLoadingImg:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->ani:Landroid/graphics/drawable/AnimationDrawable;

    .line 624
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->ani:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 625
    return-void
.end method

.method public stopLoading()V
    .locals 2

    .line 617
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->ani:Landroid/graphics/drawable/AnimationDrawable;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 618
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->ani:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 619
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->ani:Landroid/graphics/drawable/AnimationDrawable;

    .line 621
    :cond_0
    return-void
.end method
