.class Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;
.super Lo/agv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ProductListAdapter"
.end annotation


# static fields
.field private static final NORMAL_ITEM:I = 0x0

.field private static final SUB_COLUM_ITEM:I = 0x1


# instance fields
.field private isConnecting:Z

.field mLoadingImg:Lhuawei/widget/HwProgressBar;

.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;


# direct methods
.method public constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afa;>;)V"
        }
    .end annotation

    .line 750
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-direct {p0}, Lo/agv;-><init>()V

    .line 742
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->isConnecting:Z

    .line 751
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ProductListAdapter list.size"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 752
    invoke-static {p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$002(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 753
    invoke-static {p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-super {p0, v0}, Lo/agv;->getProductList(Ljava/util/ArrayList;)V

    .line 754
    return-void
.end method

.method static synthetic access$2300(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;Lo/ahh;Lo/egd;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 722
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->onclickReconnect(Lo/ahh;Lo/egd;Landroid/widget/LinearLayout;)V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;)Z
    .locals 1

    .line 722
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->isConnecting:Z

    return v0
.end method

.method private handleWorkMode(Lo/ahh;)V
    .locals 7

    .line 1026
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->d()Ljava/util/List;

    move-result-object v4

    .line 1027
    if-nez v4, :cond_0

    .line 1028
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode, mDeviceInfoList = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1029
    return-void

    .line 1031
    :cond_0
    invoke-virtual {p1}, Lo/ahh;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 1032
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode goingConnected == DeviceWorkMode.RUN_WORK_MODE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1033
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

    .line 1034
    invoke-virtual {p1}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1035
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode set device enable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1036
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 1037
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1039
    :cond_1
    invoke-virtual {p1}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1040
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 1041
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 1042
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode target device disable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1043
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 1044
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1046
    :cond_2
    goto :goto_0

    :cond_3
    goto/16 :goto_2

    .line 1048
    :cond_4
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode goingConnected == DeviceWorkMode.BAND_MODE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1049
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

    .line 1050
    invoke-virtual {p1}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1051
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode set device enable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1052
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 1053
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1055
    :cond_5
    invoke-virtual {p1}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 1056
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    .line 1057
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    .line 1058
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleWorkMode target device disable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1059
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 1060
    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1062
    :cond_6
    goto :goto_1

    .line 1063
    :cond_7
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->k()V

    .line 1066
    :goto_2
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/ahg;->a(Ljava/util/List;)V

    .line 1067
    return-void
.end method

.method private initReconnect(Lo/egd;Landroid/widget/LinearLayout;Lo/ahh;)V
    .locals 4

    .line 952
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initReconnect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 953
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/egd;->setClickable(Z)V

    .line 954
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;

    invoke-direct {v0, p0, p3, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;Lo/ahh;Lo/egd;Landroid/widget/LinearLayout;)V

    invoke-virtual {p1, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1002
    return-void
.end method

.method private onclickReconnect(Lo/ahh;Lo/egd;Landroid/widget/LinearLayout;)V
    .locals 4

    .line 1006
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual {p1}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->f(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1007
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user choose connect other wear device is OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1008
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2600(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)V

    goto :goto_0

    .line 1009
    :cond_0
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {p1}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpa;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1010
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user choose connect other AW70 device is OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1011
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2600(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)V

    goto :goto_0

    .line 1014
    :cond_1
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {p1}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ahg;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahg;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1016
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0, p1, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2700(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/ahh;Lo/egd;Landroid/widget/LinearLayout;)V

    goto :goto_0

    .line 1019
    :cond_3
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->handleWorkMode(Lo/ahh;)V

    .line 1020
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0, p1, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2700(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/ahh;Lo/egd;Landroid/widget/LinearLayout;)V

    .line 1024
    :goto_0
    return-void
.end method


# virtual methods
.method public getConnecting()Z
    .locals 1

    .line 747
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->isConnecting:Z

    return v0
.end method

.method public getItemViewType(I)I
    .locals 2

    .line 763
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/afa;

    invoke-virtual {v0}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x3

    if-ne v1, v0, :cond_0

    .line 764
    const/4 v0, 0x1

    return v0

    .line 766
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getProductList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/afa;>;)V"
        }
    .end annotation

    .line 757
    invoke-super {p0, p1}, Lo/agv;->getProductList(Ljava/util/ArrayList;)V

    .line 758
    return-void
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 26

    .line 772
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getView first position:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 773
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyDeviceFragment productInfoList size is getItemViewType(position) "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    move/from16 v4, p1

    invoke-virtual {v3, v4}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->getItemViewType(I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 774
    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->getItemViewType(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 775
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$layout;->my_device_list_result_sub_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    goto/16 :goto_8

    .line 777
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Ljava/util/ArrayList;

    move-result-object v0

    move/from16 v1, p1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/afa;

    .line 778
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$layout;->my_device_list_result:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 779
    sget v0, Lcom/huawei/plugindevice/R$id;->iv_device_icon_rl_rl:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/RelativeLayout;

    .line 780
    sget v0, Lcom/huawei/plugindevice/R$id;->device_manager_on_device_device_name_tv:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 781
    sget v0, Lcom/huawei/plugindevice/R$id;->iv_device_icon_bind:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    .line 782
    sget v0, Lcom/huawei/plugindevice/R$id;->iv_device_icon_bind_wear:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/ImageView;

    .line 784
    sget v0, Lcom/huawei/plugindevice/R$id;->device_manager_on_device_device_states_info_rl:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/LinearLayout;

    .line 785
    const/16 v0, 0x8

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 786
    sget v0, Lcom/huawei/plugindevice/R$id;->device_manager_on_device_connect_states_iv:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/ImageView;

    .line 787
    sget v0, Lcom/huawei/plugindevice/R$id;->device_manager_on_device_connect_states_tv:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/TextView;

    .line 788
    sget v0, Lcom/huawei/plugindevice/R$id;->device_manager_on_device_battery_level_rl:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/widget/RelativeLayout;

    .line 789
    sget v0, Lcom/huawei/plugindevice/R$id;->device_manager_on_device_battery_level_tv:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Landroid/widget/TextView;

    .line 790
    sget v0, Lcom/huawei/plugindevice/R$id;->device_manager_on_device_battery_level_iv:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Landroid/widget/ImageView;

    .line 794
    sget v0, Lcom/huawei/plugindevice/R$id;->reconnect_layout:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lo/egd;

    .line 796
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-ne v0, v1, :cond_1

    .line 797
    sget v0, Lcom/huawei/plugindevice/R$drawable;->device_my_button_bg:I

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lo/egd;->setBackgroundResource(I)V

    .line 799
    :cond_1
    sget v0, Lcom/huawei/plugindevice/R$id;->reconnect_loading_layout:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Landroid/widget/LinearLayout;

    .line 800
    sget v0, Lcom/huawei/plugindevice/R$id;->reconnect_loading_img:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwProgressBar;

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->mLoadingImg:Lhuawei/widget/HwProgressBar;

    .line 801
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->mLoadingImg:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 802
    sget v0, Lcom/huawei/plugindevice/R$id;->hw_show_main_layout_sport_bottom_image_interval:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Landroid/widget/ImageView;

    .line 803
    sget v0, Lcom/huawei/plugindevice/R$id;->rightarrow_icon:I

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Landroid/widget/ImageView;

    .line 804
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$1;

    move-object/from16 v1, p0

    move/from16 v2, p1

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;I)V

    invoke-virtual {v6, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 810
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 811
    sget v0, Lcom/huawei/plugindevice/R$drawable;->common_ui_arrow_left:I

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 813
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$mipmap;->btn_list_rightarrow:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 817
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move/from16 v1, p1

    if-ne v1, v0, :cond_3

    .line 818
    move-object/from16 v0, v18

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 820
    :cond_3
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 824
    :goto_1
    invoke-virtual {v5}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_11

    .line 825
    invoke-virtual {v5}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lo/ahh;

    .line 826
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getView wear device state:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v20 .. v20}, Lo/ahh;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 827
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getView wear device name:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v20 .. v20}, Lo/ahh;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 828
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getView wear device is connecting :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-boolean v3, v3, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->isConnecting:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 829
    invoke-virtual/range {v20 .. v20}, Lo/ahh;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 830
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 831
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 833
    invoke-virtual/range {v20 .. v20}, Lo/ahh;->b()I

    move-result v21

    .line 834
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lo/ahg;->d(I)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 835
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is plugin download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 837
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lo/ahg;->c(I)Ljava/lang/String;

    move-result-object v22

    .line 838
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download uuid:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v22

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 839
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lo/eaw;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v23

    .line 840
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download pluginAvaiable:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v23

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 841
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 842
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Lo/eaw;->a(Ljava/lang/String;)Lo/eav;

    move-result-object v24

    .line 843
    if-eqz v24, :cond_4

    .line 844
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is plugin download img:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v24 .. v24}, Lo/eav;->d()Lo/ean;

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

    .line 845
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v1

    invoke-virtual/range {v24 .. v24}, Lo/eav;->d()Lo/ean;

    move-result-object v2

    invoke-virtual {v2}, Lo/ean;->e()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, v24

    invoke-virtual {v1, v3, v2}, Lo/eaw;->d(Lo/eav;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    move-object/from16 v25, v0

    .line 846
    move-object/from16 v0, v25

    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 847
    goto :goto_2

    .line 848
    :cond_4
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lo/ahg;->k(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 850
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->device_icon_band_default:I

    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_2

    .line 852
    :cond_5
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->device_icon_watch_default:I

    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 855
    :goto_2
    goto :goto_3

    .line 856
    :cond_6
    invoke-static {}, Lo/ahg;->a()Lo/ahg;

    move-result-object v0

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lo/ahg;->k(I)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 858
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->device_icon_band_default:I

    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_3

    .line 860
    :cond_7
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->device_icon_watch_default:I

    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 863
    :goto_3
    goto :goto_4

    .line 864
    :cond_8
    invoke-virtual/range {v20 .. v20}, Lo/ahh;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual/range {v20 .. v20}, Lo/ahh;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HUAWEI CM-R1P"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 865
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->id_devicemanager_r1_pro:I

    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_4

    .line 867
    :cond_9
    invoke-virtual/range {v20 .. v20}, Lo/ahh;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 870
    :goto_4
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 871
    invoke-virtual/range {v20 .. v20}, Lo/ahh;->e()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_e

    .line 872
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getView deviceGroupInfo.isLine():"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lo/afa;->c()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 873
    invoke-virtual {v5}, Lo/afa;->c()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 874
    move-object/from16 v0, v18

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_5

    .line 876
    :cond_a
    move-object/from16 v0, v18

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 879
    :goto_5
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dpb;->b(Landroid/content/Context;)Lo/dpb;

    move-result-object v0

    invoke-virtual/range {v20 .. v20}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpb;->g(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_b

    .line 880
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual/range {v20 .. v20}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dpa;->d(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 881
    :cond_b
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current device is OTAing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 882
    move-object/from16 v0, v19

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 883
    const/16 v0, 0x8

    invoke-virtual {v13, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 884
    move-object/from16 v0, v17

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 885
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->mLoadingImg:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 886
    const/16 v0, 0x8

    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 887
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_ota_update_state_upgrading:I

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_7

    .line 889
    :cond_c
    move-object/from16 v0, v19

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 890
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_myfitnesspal_login:I

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(I)V

    .line 891
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->ic_bluetooth_connected_new:I

    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 892
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2102(I)I

    .line 893
    invoke-virtual/range {v20 .. v20}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dke;->b(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_d

    .line 894
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 895
    invoke-virtual/range {v20 .. v20}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dke;->b(Ljava/lang/String;)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/dbt;->b(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 896
    invoke-virtual/range {v20 .. v20}, Lo/ahh;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dke;->b(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lo/ene;->d(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v15, v0}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_6

    .line 898
    :cond_d
    const/16 v0, 0x8

    invoke-virtual {v13, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 902
    :goto_6
    move-object/from16 v0, v16

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 903
    move-object/from16 v0, v17

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_7

    .line 905
    :cond_e
    invoke-virtual/range {v20 .. v20}, Lo/ahh;->e()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_f

    .line 906
    move-object/from16 v0, v19

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 907
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_myfitnesspal_logout:I

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(I)V

    .line 908
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->ic_bluetooth_close_new:I

    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 909
    const/16 v0, 0x8

    invoke-virtual {v13, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 911
    move-object/from16 v0, v16

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 912
    move-object/from16 v0, v17

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 914
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->startLoading()V

    goto :goto_7

    .line 916
    :cond_f
    move-object/from16 v0, v19

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 917
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_myfitnesspal_logout:I

    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(I)V

    .line 918
    sget v0, Lcom/huawei/plugindevice/R$mipmap;->ic_bluetooth_close_new:I

    invoke-virtual {v11, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 919
    const/16 v0, 0x8

    invoke-virtual {v13, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 921
    move-object/from16 v0, v17

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 922
    move-object/from16 v0, v16

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 923
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$color;->common_color_white:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lo/egd;->setTextColor(I)V

    .line 924
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->isConnecting:Z

    if-nez v0, :cond_10

    .line 925
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move-object/from16 v3, v20

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->initReconnect(Lo/egd;Landroid/widget/LinearLayout;Lo/ahh;)V

    goto :goto_7

    .line 928
    :cond_10
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$color;->common_black_20alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lo/egd;->setTextColor(I)V

    .line 929
    move-object/from16 v0, v16

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setClickable(Z)V

    .line 933
    :cond_11
    :goto_7
    invoke-virtual {v5}, Lo/afa;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_13

    .line 934
    move-object/from16 v0, v19

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 935
    invoke-virtual {v5}, Lo/afa;->e()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lo/afj;

    .line 936
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 937
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 938
    invoke-virtual/range {v20 .. v20}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_12

    .line 939
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {v20 .. v20}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v20 .. v20}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 940
    invoke-virtual/range {v20 .. v20}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    iget-object v0, v0, Lo/afj$a;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/afo;->d(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_8

    .line 942
    :cond_12
    invoke-virtual/range {v20 .. v20}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {v20 .. v20}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 943
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    invoke-virtual/range {v20 .. v20}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {v20 .. v20}, Lo/afj;->n()Lo/afj$a;

    move-result-object v2

    iget-object v2, v2, Lo/afj$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 948
    :cond_13
    :goto_8
    return-object p2
.end method

.method public setConnecting(Z)V
    .locals 0

    .line 744
    iput-boolean p1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->isConnecting:Z

    .line 745
    return-void
.end method

.method public setOnItemReconnectListener(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$onItemReconnectListener;)V
    .locals 1

    .line 727
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2002(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$onItemReconnectListener;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$onItemReconnectListener;

    .line 728
    return-void
.end method

.method public startLoading()V
    .locals 2

    .line 737
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->mLoadingImg:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 738
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->mLoadingImg:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 740
    :cond_0
    return-void
.end method

.method public stopLoading()V
    .locals 2

    .line 732
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->mLoadingImg:Lhuawei/widget/HwProgressBar;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 733
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->mLoadingImg:Lhuawei/widget/HwProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lhuawei/widget/HwProgressBar;->setVisibility(I)V

    .line 735
    :cond_0
    return-void
.end method
